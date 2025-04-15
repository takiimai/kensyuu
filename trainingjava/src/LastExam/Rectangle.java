package LastExam;

/**
 * 一つの位置座標と幅、長さを指定することで、長方形（短形）を描画するクラス
 * ・長方形描画メソッド
 * ・長方形の周囲の長さを取得するメソッド
 */
public class Rectangle extends Polygon {
	private Point p;
	private int width;
	private int height;

	//コンストラクタ
	public Rectangle(int x, int y, int width, int height) {
		Point p1 = new Point(x, y);
		p = p1;
		this.width = width;
		this.height = height;
		angle = 4;

	}

	//メッセージを出力
	public void draw() {
		System.out.println("[長方形(短形)を描画(" + p + ")を基準として幅100、高さ50の長方形");
	}

	/**横幅と縦幅を使い以下の計算式で算出した結果を返す。
	 * ( width + height ) * 2
	 */
	public double getPerimeter() {
		double ans;
		ans = (width + height) * 2;
		return ans;
	}

}
