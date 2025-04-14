package LastExam;

/**
 * 図形描画アプリケーションの共通機能3つを定義する
 * ・図形描画機能
 * ・長さ測定機能
 * ・内角の和測定機能
 */
public abstract class Polygon extends Shape {
	int angle;

	//図形描画機能の定義
	public abstract void draw();

	//長さ測定機能の定義
	public abstract double getPerimeter();

	//算出された内角の和
	public int getInternalAngle() {
		int ans = (angle - 2) * 180;
		return ans;

	}

}
