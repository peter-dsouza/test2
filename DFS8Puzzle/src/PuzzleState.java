import java.util.Stack;


public class PuzzleState {
	int state[];
	
	PuzzleState(int[] state){
		this.state=state.clone();
	}
	
	public int getBlankIndex(){
		int location;
		for(location=0; location<9; location++)
			if(this.state[location]==0)
				break;
		return location;
	}
	
	public void swapTiles(int loc1, int loc2){
		int tempValue;
		tempValue=this.state[loc1];
		this.state[loc1]=state[loc2];
		this.state[loc2]=tempValue;
	}

	public RelatedPuzzleSet genNextStates(){
		PuzzleState tempPuzzleState1=new PuzzleState(this.state);
		PuzzleState tempPuzzleState2=new PuzzleState(this.state);
		PuzzleState tempPuzzleState3=new PuzzleState(this.state);
		PuzzleState tempPuzzleState4=new PuzzleState(this.state);
		RelatedPuzzleSet relatedPuzzleStates = new RelatedPuzzleSet();
		switch(this.getBlankIndex()){
			case 0: tempPuzzleState1.swapTiles(0, 1);
					tempPuzzleState2.swapTiles(0, 3);
					relatedPuzzleStates.setP1(tempPuzzleState1);
					relatedPuzzleStates.setP2(tempPuzzleState2);
					relatedPuzzleStates.setNumOfSets(2);
					break;
			case 1: tempPuzzleState1.swapTiles(1, 2);
					tempPuzzleState2.swapTiles(1, 4);
					tempPuzzleState3.swapTiles(1, 0);
					relatedPuzzleStates.setP1(tempPuzzleState1);
					relatedPuzzleStates.setP2(tempPuzzleState2);
					relatedPuzzleStates.setP3(tempPuzzleState3);
					relatedPuzzleStates.setNumOfSets(3);
					break;
			case 4: tempPuzzleState1.swapTiles(4, 5);
					tempPuzzleState2.swapTiles(4, 7);
					tempPuzzleState3.swapTiles(4, 3);
					tempPuzzleState4.swapTiles(4, 1);
					relatedPuzzleStates.setP1(tempPuzzleState1);
					relatedPuzzleStates.setP2(tempPuzzleState2);
					relatedPuzzleStates.setP3(tempPuzzleState3);
					relatedPuzzleStates.setP4(tempPuzzleState4);
					relatedPuzzleStates.setNumOfSets(4);
					break;
			case 6: tempPuzzleState1.swapTiles(6, 7);
					tempPuzzleState2.swapTiles(6, 3);
					relatedPuzzleStates.setP1(tempPuzzleState1);
					relatedPuzzleStates.setP2(tempPuzzleState2);
					relatedPuzzleStates.setNumOfSets(2);
					break;
			case 7: tempPuzzleState1.swapTiles(7, 8);
					tempPuzzleState2.swapTiles(7, 6);
					tempPuzzleState3.swapTiles(7, 4);
					relatedPuzzleStates.setP1(tempPuzzleState1);
					relatedPuzzleStates.setP2(tempPuzzleState2);
					relatedPuzzleStates.setP3(tempPuzzleState3);
					relatedPuzzleStates.setNumOfSets(3);			
					break;
			case 8: tempPuzzleState1.swapTiles(8, 7);
					tempPuzzleState2.swapTiles(8, 5);
					relatedPuzzleStates.setP1(tempPuzzleState1);
					relatedPuzzleStates.setP2(tempPuzzleState2);
					relatedPuzzleStates.setNumOfSets(2);						
					break;
			case 2: tempPuzzleState1.swapTiles(2, 5);
					tempPuzzleState2.swapTiles(2, 1);
					relatedPuzzleStates.setP1(tempPuzzleState1);
					relatedPuzzleStates.setP2(tempPuzzleState2);
					relatedPuzzleStates.setNumOfSets(2);
					break;
			case 3: tempPuzzleState1.swapTiles(3, 4);
					tempPuzzleState2.swapTiles(3, 6);
					tempPuzzleState3.swapTiles(3, 0);
					relatedPuzzleStates.setP1(tempPuzzleState1);
					relatedPuzzleStates.setP2(tempPuzzleState2);
					relatedPuzzleStates.setP3(tempPuzzleState3);
					relatedPuzzleStates.setNumOfSets(3);
					break;
			case 5: tempPuzzleState1.swapTiles(5, 8);
					tempPuzzleState2.swapTiles(5, 4);
					tempPuzzleState3.swapTiles(5, 2);
					relatedPuzzleStates.setP1(tempPuzzleState1);
					relatedPuzzleStates.setP2(tempPuzzleState2);
					relatedPuzzleStates.setP3(tempPuzzleState3);
					relatedPuzzleStates.setNumOfSets(3);
					break;
					}
		return relatedPuzzleStates;
	}

	public void displayContents() {
		for(int count=0; count<9; count++)
			System.out.print(" "+this.state[count]);
	}

	public boolean isSameAs(int[] goalState) {
		if((this.state[0]==goalState[0])&&(this.state[1]==goalState[1])&&(this.state[2]==goalState[2])&&(this.state[3]==goalState[3])&&(this.state[4]==goalState[4])&&(this.state[5]==goalState[5])&&(this.state[6]==goalState[6])&&(this.state[7]==goalState[7])&&(this.state[8]==goalState[8]))
			return true;
		else return false;
	}

	
}


