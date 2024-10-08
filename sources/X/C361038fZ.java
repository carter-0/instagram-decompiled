package X;

/* renamed from: X.8fZ  reason: invalid class name and case insensitive filesystem */
public abstract class C361038fZ {
    /* JADX WARNING: type inference failed for: r4v0, types: [X.8fY, java.lang.Object] */
    public static C361028fY A00(C276484tP r5, C276424tJ r6) {
        String Eyf;
        ? obj = new Object();
        if (r6.E2K() != AnonymousClass05K.A0C) {
            r6.Evn();
            return null;
        }
        while (r6.Crg() != AnonymousClass05K.A0N) {
            String E2H = r6.E2H();
            boolean z = false;
            if (C276474tO.A00(E2H) >= 32) {
                z = true;
            }
            r6.Crg();
            if (!z) {
                if ("payload".equals(E2H)) {
                    if (r6.E2L().isNull()) {
                        Eyf = null;
                    } else {
                        Eyf = r6.E2L().Eyf();
                    }
                    obj.A01 = Eyf;
                } else if ("layout".equals(E2H)) {
                    obj.A00 = C276454tM.A00(r5, r6);
                }
            }
            r6.Evn();
        }
        return obj;
    }
}
