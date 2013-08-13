
public class RelatedPuzzleSet {
	private PuzzleState p1;
	private PuzzleState p2;
	private PuzzleState p3;
	private PuzzleState p4;
	private int numOfSets;
	
	
	
	public void setP1(PuzzleState p1) {
		this.p1 = p1;
	}

	public void setP2(PuzzleState p2) {
		this.p2 = p2;
	}

	public void setP3(PuzzleState p3) {
		this.p3 = p3;
	}

	public void setP4(PuzzleState p4) {
		this.p4 = p4;
	}

	public void setNumOfSets(int numOfSets) {
		this.numOfSets = numOfSets;
	}

	public PuzzleState getP1() {
		return p1;
	}

	public PuzzleState getP2() {
		return p2;
	}

	public PuzzleState getP3() {
		return p3;
	}

	public PuzzleState getP4() {
		return p4;
	}

	public int getNumOfSets() {
		return numOfSets;
	}

	public void storeNextStates(PuzzleState currentNode) {
		currentNode.genNextStates();
		
	}




}
