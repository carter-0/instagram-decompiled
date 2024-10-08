package X;

public final class TQS extends RuntimeException {
    public TQS(String str, String str2, String str3) {
        super(002.A13("Unable to parse @ReactMethod annotation from native module method: ", str, ".", str2, "(). Details: ", str3));
    }
}
