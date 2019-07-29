
public class test {
	public Board boa = new Board();
	public Board chessboa = new Board();
	public void setup() {
		boa.createBoard(18);
		chessboa.createBoard(18);
	}
	public void testPrint() {
		System.out.print("****************************¥Ú”°≤‚ ‘***********************");
		for(int i = 1;i<5;i++) {
			boa.boa[i][1] = 'A';
			boa.boa[18-i][18-i] = 'B';
					
		}
		boa.print();
		System.out.print("****************************¥Ú”°≤‚ ‘***********************");
	}
	public void goPlayTest() {
		System.out.print("*************startPlay**************");
		boa.goPlay(8,8,'B');
		boa.goPlay(4, 4, 'A');
	}
}
