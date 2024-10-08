package X;

import java.util.HashMap;

public final class MYd {
    public static final MYd A02 = new MYd(AnonymousClass7TE.A1E());
    public final HashMap A00 = AnonymousClass7TE.A1E();
    public final HashMap A01;

    public final String A00(String str) {
        if (str == null) {
            return null;
        }
        String A002 = C273654mx.A00(75);
        if (!C66580MXl.A1a(A002, 1, str)) {
            return null;
        }
        String A012 = OXF.A01(str);
        HashMap hashMap = this.A00;
        if (hashMap.containsKey(A012)) {
            return DbS.A0r(A012, hashMap);
        }
        C61046Jvk jvk = (C61046Jvk) this.A01.get(str);
        if (jvk == null) {
            return null;
        }
        String str2 = jvk.A00;
        0qQ.A0B(str2, 0);
        if (C66580MXl.A1a(A002, 1, str2)) {
            return null;
        }
        if (!jvk.A01) {
            String str3 = str2;
            if (C66580MXl.A1a("file://", 1, str2)) {
                str3 = C66580MXl.A0z(str2, 7);
            }
            if (!AnonymousClass7TE.A0t(str3).exists()) {
                return null;
            }
        }
        C66580MXl.A1S(hashMap, A012);
        return str2;
    }

    public final void A01(String str) {
        0qQ.A0B(str, 0);
        HashMap hashMap = this.A01;
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, new C61046Jvk(str, 12, false));
        }
    }

    public final boolean A02(String str) {
        0qQ.A0B(str, 0);
        C61046Jvk jvk = (C61046Jvk) this.A01.get(str);
        if (jvk != null) {
            String str2 = jvk.A00;
            0qQ.A0B(str2, 0);
            if (!C66580MXl.A1a(C273654mx.A00(75), 1, str2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public MYd(HashMap hashMap) {
        this.A01 = hashMap;
    }
}
