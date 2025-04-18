package LastExam;

/**
 * 一つの位置座標と幅を指定することで、正方形を描画するクラス
 * ・正方形描画メソッド
 */
public class Square extends Rectangle {

	//コンストラクタ
	public Square(int x, int y, int width) {
		super(x, y, width, width);
		
	}

	//メッセージの出力
	public void draw() {
		
		System.out.println("[正方形を描画]点(" + getPoint() + ")を基準として幅・高さ200の正方形");
	}

}
