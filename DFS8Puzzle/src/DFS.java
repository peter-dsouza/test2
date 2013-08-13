/* Problem: Solve 8-Puzzle Problem using Depth First Search
 * Author: Peter D'Souza
 * Roll Number: 1102
 * 
 */

import java.util.*;

public class DFS {

	public static void main(String[] args) {
		int[] initState=new int[]{1,2,3,0,4,5,6,7,8};		//INPUT
		
		int[] goalState=new int[]{1,2,3,4,0,5,6,7,8};

		Stack<PuzzleState> stack=new Stack<PuzzleState>();	//Using a stack
		
		PuzzleState root=new PuzzleState(initState);
		stack.push(root);									//Push initial state first

		PuzzleState tempState;
		RelatedPuzzleSet set;
		
		boolean goalReached=false;
		
		int[] temp=new int[]{0,0,0,0,0,0,0,0,0};
		PuzzleState prevTop=new PuzzleState(temp);
		
		while(!stack.isEmpty()||goalReached){
			tempState=stack.pop();							//Pop stack top

			System.out.println();
			System.out.print("Current top:");
			tempState.displayContents();

			if(tempState.isSameAs(goalState)){
				goalReached=true;
				break;
			}
			PuzzleState currentNode=new PuzzleState(tempState.state);
			set=currentNode.genNextStates();				//Expand the popped node (generate next possible states)
			switch(set.getNumOfSets()){						//Push possible states back onto the stack
				case 2: if(!set.getP1().isSameAs(prevTop.state))stack.push(set.getP1()); 
						if(!set.getP2().isSameAs(prevTop.state))stack.push(set.getP2());
						System.gc();
						break;
				case 3: if(!set.getP1().isSameAs(prevTop.state))stack.push(set.getP1()); 
						if(!set.getP2().isSameAs(prevTop.state))stack.push(set.getP2()); 
						if(!set.getP3().isSameAs(prevTop.state))stack.push(set.getP3());
						System.gc();
						break;
				case 4: if(!set.getP1().isSameAs(prevTop.state))stack.push(set.getP1()); 
						if(!set.getP2().isSameAs(prevTop.state))stack.push(set.getP2());
						if(!set.getP3().isSameAs(prevTop.state))stack.push(set.getP3());
						if(!set.getP4().isSameAs(prevTop.state))stack.push(set.getP4()); 
						System.gc();
						break;
			}
			
			prevTop=currentNode;
		}if(goalReached)
			System.out.println();
			System.out.println("Goal State Reached.");
	}


}
