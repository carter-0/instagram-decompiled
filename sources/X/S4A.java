package X;

public final class S4A {
    public final C3733494z A00;
    public final C2604745u A01;

    public final AnonymousClass40G A00(C258743zZ r6) {
        Object obj;
        String str;
        String A012 = A01(r6);
        if (A012.length() == 0) {
            obj = null;
            str = 002.A0R("Model file is not found for ", r6.CCQ());
        } else {
            r6.CCQ();
            obj = null;
            1RH A002 = 1RH.A00();
            1US r1 = 1US.A1D;
            if (!A002.A05(r1)) {
                str = "Pytorch is not downloaded on device";
            } else if (1RH.A00().A06(r1) || 1RH.A00().A07(r1)) {
                try {
                    return Pxf.A0M(C347997xi.A00(A012));
                } catch (Throwable th) {
                    return new AnonymousClass40G((Object) null, th.getMessage(), false);
                }
            } else {
                str = "Pytorch is not loaded on device";
            }
        }
        return new AnonymousClass40G(obj, str, false);
    }

    public final String A01(C258743zZ r3) {
        return this.A01.A01(r3.CCQ());
    }

    public S4A(C3733494z r1, C2604745u r2) {
        AnonymousClass7TG.A1O(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
