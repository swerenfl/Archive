public class MineSweeper {

	public static void main(String[] args) {
		//Game Description (Part 1)
		System.out.println("Find the empty squares and avoid the mines.");
		
		//declare variables
		int i;
		int j;
        int t2=0;
		
        String[][] gameBoard = new String[9][9];
		 
        /* bool error
		 */
		
        //load board
		//loadboard(board)
	
        int col, row;
		for (row=0; row<9; row++)
		{
			for (col=0; col<9; col++)
			{
				board[row][col] = "*";
			}
		}
	}
}
		
//		System.out.println ([row][col]);
//		//int col, row;
//		
//		for (col=0; col<9; col++)
//		{
//			//print " " + col + "|"
//			for (row+0; row<9; row++)
//			{
//				//print row #
//				for (col=0; col<9; col++)
//				{
//					//print " " + board[row][col] + "|"
//				}
//				//print "\n"
//			}
//		}
//		//end print board
//		
//		//turn
//		while(t2<81)
//		{
//			do
//			{
//				//print "enter column"
//				//get column number
//				//print "enter row"
//				if board[row][col] !="*"
//					error = true
//			}
//				while(error)
//				board[row][col]="8";
//				//endturn
//				//int col, row;
//				for(col=0; col<9: col++)
//				{
//					//print " " + col +"|"
//					for( row=0; row<9; row++)
//					{
//						//print row#
//						for (col=0; col<9; col++)
//							{
//						//print " " + board [row][col] + "|";
//					}
//					//print "\n"
//				}
//			//print board
//			
//			//end print
//			t2=turn(board);
//			t2++;
//		}
//	}
//	
//	void loadboard(string board[][9])
//	{
//		int col, row:
//			for (row=0;row<9;row++)
//			{for (col+0; col<9;col++)
//			{
//				board[row][col]="*";
//			}
//			}
//	} void print board (string board[][9])
//	{ 
//		int col, row;
//		for (col=0;col<9; col++)
//			//print " " + col + "|"
//			for (row=0; row<9; row++)
//			{
//				//print row#
//		for (col=0; col<9: col++)
//		{
//			//print " " + board [row][col]+ "|";
//		}
//		//print "\n"
//			}
//	}
//	
//	int turn ( string board){
//		bool error
//		do{
//			//print "enter column"
//			//get column number
//			//print "enter row"
//			if board[row][col] != "*"
//					error = true
//		}
//		while (error)
//			board [row][col]="8";
//	}
//					
//			}
////----------------------------------------------------------------------//
////Next section will be part three of my homework.//
//
//void creatbomboard(bomboard, bombcount)
//{
//	int count = 0 
//			while (bombcount>count)
//			{ do{
//				i = create random # 0-9 //7//
//				j = create random # 0-9 //2//
//			}
//			while board [i][j] 1= "B" ;
//			board [i][j] = "B";
//			count++;
//			}
//}
//
//void loadnumber(bombboard)
//{int count =0;
//for (row=0; row<9; row++)
//{
//	for (col=0; col<9; col++)
//	{ count =0;
//	//check bomb
//	if ( bombboard[row][col] != "B")
//	{
//		if (row+1<8)
//			if(bombboard[row+1][col]="B")
//				count++;
//		if(row>=1)
//		if(bombboard[row-1][col]="B")
//			count++;
//		if (col<=7)
//		if(bombboard[row][col+1]="B")
//			count++;
//		if (col>=1)
//		if(bombboard[row][col-1]="B")
//			count++;
//		if(col <=7 || row <=7)
//		if(bombboard[row=+1][col+1]="B")
//			count++;
//		if(bombboard[row+1][col-1]="B")
//			count++;
//		if(bombboard[row-1][col-1]="B")
//			count++;
//		if(bombboard[row-1][col+1]="B")
//			count++;
//	}
//	}
//		}
//}
//
