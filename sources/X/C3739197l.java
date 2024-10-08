package X;

/* renamed from: X.97l  reason: invalid class name and case insensitive filesystem */
public enum C3739197l {
    ;

    /* access modifiers changed from: public */
    static {
        A00 = new C3739297m();
        A01 = new C3739397n();
    }

    public final boolean A00() {
        Boolean bool;
        if (this instanceof C3739297m) {
            return !AnonymousClass97K.A00();
        }
        if (!AnonymousClass97K.A00()) {
            return true;
        }
        try {
            bool = (Boolean) Class.forName(Pxd.A00(255)).getMethod("isBoringSslFIPSBuild", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            AnonymousClass97K.A00.info("Conscrypt is not available or does not support checking for FIPS build.");
            bool = false;
        }
        if (bool.booleanValue()) {
            return true;
        }
        return false;
    }
}
