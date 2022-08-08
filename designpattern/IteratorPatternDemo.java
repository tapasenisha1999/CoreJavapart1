package com.designpattern;

class NameRepository implements Container {
	public String names[] = {"Nisha","Rina","Trupti","Aarti"};

	@Override
	public Iterator getIterator() {
		return new NameIterator();
		
		
	      }
	private class NameIterator implements Iterator{
		int index;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(index < names.length){
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if(this.hasNext()){
	            return names[index++];
			}
			return null;
		}
		

	}
}

public class IteratorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 NameRepository namesRepository = new NameRepository();

	      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      } 	

	}

}
