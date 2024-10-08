package X;

/* renamed from: X.WTt  reason: case insensitive filesystem */
public final class C19311WTt implements C229222n2 {
    public final int A00;

    public C19311WTt(int i) {
        this.A00 = i;
    }

    public final String BK2(AnonymousClass30Y r6) {
        String str;
        String str2;
        int i = this.A00;
        0qQ.A0B(r6, 0);
        C16740V3x v3x = (C16740V3x) r6.A03;
        String str3 = v3x.A04;
        if (i != 0) {
            str2 = "";
            if (str3 == null) {
                str3 = str2;
            }
            str = v3x.A03;
            if (str == null) {
                str = str2;
            }
            C16675UzB uzB = v3x.A01.A04;
            if (uzB != null) {
                str2 = uzB.toString();
            }
        } else {
            String str4 = str3;
            String str5 = "";
            if (str3 == null) {
                str3 = str5;
            }
            if (v3x.A02 != null) {
                str5 = str4;
            }
            str2 = v3x.A03;
        }
        return 002.A0u(str3, str, str2, "_LAST_VIEWED_IMPRESSION_TIME");
    }
}
