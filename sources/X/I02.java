package X;

import com.instagram.common.session.UserSession;

public final class I02 {
    public int A00;
    public Integer A01;
    public String A02;
    public boolean A03;
    public final C258043yN A04;
    public final UserSession A05;

    private final void A00() {
        0wj r1;
        String str;
        C258043yN r3 = this.A04;
        if (r3 == null) {
            r1 = 0wj.A01;
            str = "config is null";
        } else {
            if (r3.BGw() == null) {
                0wj.A01.AEf("indicatorStyle is null", 817901739);
            }
            Boolean Bu4 = r3.Bu4();
            if (Bu4 == null) {
                r1 = 0wj.A01;
                str = "shouldEnableAutoadvance is null";
            } else if (Bu4.booleanValue() && r3.AzJ() == null) {
                r1 = 0wj.A01;
                str = "duration is null";
            } else {
                return;
            }
        }
        r1.AEf(str, 817901739);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r1 == null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        r0 = (r0 = r0.C77()).intValue();
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public I02(X.C258043yN r5, com.instagram.common.session.UserSession r6) {
        /*
            r4 = this;
            r4.<init>()
            r4.A04 = r5
            r4.A05 = r6
            if (r5 == 0) goto L_0x0070
            java.lang.String r3 = r5.BGw()
        L_0x000d:
            java.lang.String r2 = "dots"
            boolean r0 = X.0qQ.A0K(r3, r2)
            java.lang.String r1 = "progress_dots"
            if (r0 != 0) goto L_0x001e
            boolean r0 = X.0qQ.A0K(r3, r1)
            if (r0 == 0) goto L_0x006a
            r2 = r1
        L_0x001e:
            r4.A02 = r2
            X.3yN r0 = r4.A04
            if (r0 == 0) goto L_0x0065
            java.lang.Boolean r0 = r0.Bu4()
            if (r0 == 0) goto L_0x0065
            boolean r0 = r0.booleanValue()
        L_0x002e:
            r4.A03 = r0
            X.3yN r0 = r4.A04
            if (r0 == 0) goto L_0x003e
            java.lang.Integer r1 = r0.AzJ()
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x0047
            if (r1 != 0) goto L_0x0047
        L_0x003e:
            r4.A00()
            r0 = 3000(0xbb8, float:4.204E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x0047:
            r4.A01 = r1
            X.3yN r0 = r4.A04
            if (r0 == 0) goto L_0x0059
            java.lang.Integer r0 = r0.C77()
            if (r0 == 0) goto L_0x0059
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x005b
        L_0x0059:
            r0 = 56
        L_0x005b:
            r4.A00 = r0
            X.3yN r0 = r4.A04
            if (r0 == 0) goto L_0x0064
            r0.C71()
        L_0x0064:
            return
        L_0x0065:
            r4.A00()
            r0 = 0
            goto L_0x002e
        L_0x006a:
            r4.A00()
            java.lang.String r2 = "unknown"
            goto L_0x001e
        L_0x0070:
            r3 = 0
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I02.<init>(X.3yN, com.instagram.common.session.UserSession):void");
    }
}
