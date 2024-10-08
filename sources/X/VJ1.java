package X;

public abstract class VJ1 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "WebviewFailedToLoad";
            case 1:
                return "DecodingError";
            case 2:
                return "EncodingError";
            default:
                return "MetaOnlyErrorWebviewFailedToRunInjectedJS";
        }
    }
}
