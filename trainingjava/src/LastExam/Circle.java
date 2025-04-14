package LastExam;

/**
 * 中心座標と半径を指定することで、円を描画するクラス
 * ・円描画メソッド
 * ・円周の長さを取得するメソッド
 */
public class Circle extends Shape {
	Point center;
	int radius;

	//引数なしコンストラクタ
	public void Circle() {
		center.x = 0;
		center.y = 0;
		radius = 0;
	}

	/**
	 * 引数x、yで受け取ったデータを用いて、１つのPointオブジェクトを生成し、centerフィールドに代入する
	 *　引数rもradiusフィールドに代入する。
	 */
	public void Circle(int x, int y, int r) {
		Point i = new Point(x, y);
		center = i;
		radius = r;
	}

	//メッセージの出力
	public void draw() {
		System.out.println("[円を描画]中心点" + center + "から半径" + radius);
	}

	/**
	 * 半径を使い、以下の計算式で算出した結果を返す
	 * 半径*2*円周率
	 * 円周率＝Math.PIフィールド
	 */
	public double getPerimeter() {
		double i;
		double pi;
		pi = Math.PI;
		i = radius * 2 * pi;
		return i;
	}
}
