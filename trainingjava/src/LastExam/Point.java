package LastExam;

/**
 * 座標位置情報を表すクラス
 */
public class Point {
	private int x;
	private int y;

	//引数なしコンストラクタ
	public Point() {
		this.x = 0;
		this.y = 0;
	}

	/**
	 * x座標、y座標を受け取りその値で初期化するコンストラクタの定義
	 * 第一引数で渡された値をxフィールドに代入する
	 * 台に引数で渡された値をyフィールドに代入する
	 
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//xフィールドの値を返すメソッド
	public int getX() {
		return this.x;
	}

	//引数で渡されたxフィールドにセットするメソッド
	public void setX(int x) {
		this.x = x;
	}

	//yフィールドの値を返すメソッド
	public int getY() {
		return this.y;
	}

	//引数で渡されたyフィールドにセットするメソッド
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return x + "," + y;
	}

}
