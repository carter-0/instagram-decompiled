package X;

/* renamed from: X.NtA  reason: case insensitive filesystem */
public abstract class C69846NtA {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "AUDIO_NOTE";
                break;
            case 2:
                str = "AUDIO_VOICE_MESSAGE";
                break;
            case 3:
                str = "EPHEMERAL_VIDEO";
                break;
            case 4:
                str = "FEED_VIDEO_RESHARE";
                break;
            case 5:
                str = "OTHER";
                break;
            case 6:
                str = "PERMANENT_VIDEO";
                break;
            case 7:
                str = AnonymousClass000.A00(2417);
                break;
            case 8:
                str = "STORY_OTHER";
                break;
            case 9:
                str = C273654mx.A00(503);
                break;
            case 10:
                str = "UNKNOWN";
                break;
            default:
                str = "AUDIO_MUSIC";
                break;
        }
        return C51966G9m.A04(str, intValue);
    }
}
