package LastExam;

/**
 * 2つの座標データを指定することで、線を描画するクラス
 * ・線描画メソッド
 * ・線の長さを取得するメソッド
 */
public class Line implements Figure {
	private Point p1;
	private Point p2;

	//引数無しコンストラクタ
	public Line() {
		this.p1 = new Point(0, 0);
		this.p2 = new Point(0, 0);
	}

	/**
	 * 引数で受け取ったデータを用いて2つのPointオブジェクトを生成。
	 * p1フィールドとp2フィールドに代入するPoint型変数のx,y座標値
	 */

	public Line(int x1, int y1, int x2, int y2) {
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);

		/**p1.x = x1;
		*p1.y = y1;
		*p2.x = x2;
		*p2.y = y2;
		*/
	}

	//メッセージの出力
	public void draw() {
		System.out.println("始点(" + p1.x + "," + p1.y + ")から終点(" + p2.x + "," + p2.y + ")まで");
	}

	/**
	 * 始点データと終点データを使い、以下の計算式で算出した結果を返す。
	 * (( 終点のx座標 - 始点のx座標 ) ^2+ ( 終点のy座標 - 始点のy座標 ) ^2 ) の平方根
	 *累乗...Math.powメソッド
	 *平方根...Math.sqrtメソッド
	 */
	public double getPerimeter() {
		double i;
		double f;
		double ans;
		i = Math.pow((p2.x - p1.x), 2);
		f = Math.pow((p2.y - p1.y), 2);
		ans = Math.sqrt(i + f);
		return ans;
	}
}
