package X;

/* renamed from: X.QFa  reason: case insensitive filesystem */
public final class C7471QFa extends C7474QFd {
    public C7471QFa() {
        super("MULTI_PROFILE", "MULTI_PROFILE");
    }

    public final boolean A01() {
        if (!super.A01() || !SDO.A00("MULTI_PROCESS")) {
            return false;
        }
        if (SDO.A0R.A01()) {
            return C9891Rj6.A00.BzH().isMultiProcessEnabled();
        }
        throw AnonymousClass7TE.A1B("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
