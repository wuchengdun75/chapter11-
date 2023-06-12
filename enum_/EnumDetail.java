package enum_;

public class EnumDetail {
	public static void main(String[] args) {
		Music.CLASSICMUSIC.playing();
	}
}

class A {

}

//使用enum关键字后，就不能再继承其它类了，因为enum会隐式继承Enum
//Java是单继承机制

interface IPlaying {
	public void playing();
}

enum Music implements IPlaying {
	CLASSICMUSIC;

	@Override
	public void playing() {
		System.out.println("播放好听的音乐...");
	}
}
