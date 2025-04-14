package LastExam;

/**
 * 3つの座標データを指定することで、三角形を描画するクラス
 * ・三角形描画メソッド
 * ・三角形の周囲の長さを取得するメソッド
 */
public class Triangle extends Polygon {
	Point p1;
	Point p2;
	Point p3;

	/**
	 * 引数で受け取ったデータを用いて、3つのPoint オブジェクトを生成
	 * p1フィールドとp2フィールド 、p3フィールドにそれぞれ代入する
	 * スーパークラス内で定義されているangleフィールドに３を代入する。
	 */
	public void Triangle(int p1x, int p1y, int p2x, int p2y, int p3x, int p3y) {
		Point P1 = new Point(p1x, p1y);
		Point P2 = new Point(p2x, p2y);
		Point P3 = new Point(p3x, p3y);
		p1 = P1;
		p2 = P2;
		p3 = P3;
		angle = 3;

	}

	//メッセージの出力
	public void draw() {
		System.out.println("[三角形を描画]点1(" + p1 + ")から点2(" + p2 + ")、点3(" + p3 + ")の三角形");
	}

	/**3つの座標を使い、以下の計算式で算出した結果を返す
	 * p1からp2までの長さ + p2からp3までの長さ + p3からp1までの長さ
	 */
	public double getPerimeter() {
		double a;
		double b;
		double a1;
		double c;
		double d;
		double a2;
		double e;
		double f;
		double a3;
		double ans;
		a = Math.pow((p2.x - p1.x), 2);
		b = Math.pow((p2.y - p1.y), 2);
		a1 = Math.sqrt(a + b);

		c = Math.pow((p3.x - p2.x), 2);
		d = Math.pow((p3.y - p2.y), 2);
		a2 = Math.sqrt(c + d);

		e = Math.pow((p1.x - p3.x), 2);
		f = Math.pow((p1.y - p3.y), 2);
		a3 = Math.sqrt(e + f);

		ans = a1 + a2 + a3;

		return ans;
	}

}
