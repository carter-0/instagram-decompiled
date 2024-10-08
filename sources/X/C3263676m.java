package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.76m  reason: invalid class name and case insensitive filesystem */
public final class C3263676m {
    public final UserSession A00;
    public final C254703su A01;
    public final String A02;

    public C3263676m(UserSession userSession, C254703su r3, String str) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = r3;
        this.A02 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel A04(android.content.res.Resources r14, boolean r15) {
        /*
            r13 = this;
            r12 = 0
            boolean r0 = A02(r13)
            r4 = 0
            if (r0 == 0) goto L_0x0063
            X.3su r2 = r13.A01
            java.lang.String r1 = r2.A0j()
            java.lang.String r0 = "replayable"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0025
            java.lang.String r1 = r2.A0j()
            java.lang.String r0 = "once"
            boolean r0 = X.0qQ.A0K(r1, r0)
            r3 = 2131238268(0x7f081d7c, float:1.809281E38)
            if (r0 == 0) goto L_0x0028
        L_0x0025:
            r3 = 2131238269(0x7f081d7d, float:1.8092812E38)
        L_0x0028:
            if (r15 != 0) goto L_0x0037
            boolean r0 = A00(r13)
            if (r0 == 0) goto L_0x0037
            r0 = 2131964457(0x7f133229, float:1.9565696E38)
            java.lang.String r4 = r14.getString(r0)
        L_0x0037:
            r9 = r4
            X.3tI r2 = r2.A0P()
            r1 = 1
            if (r2 == 0) goto L_0x0060
            java.lang.String r0 = r13.A02
            if (r0 == 0) goto L_0x0060
            java.lang.Integer r0 = r2.A02(r0)
            if (r0 == 0) goto L_0x0060
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x0060
        L_0x004f:
            r12 = 1
        L_0x0050:
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            r7 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r11 = 2
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r4 = new com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel
            r8 = r7
            r10 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x005f:
            return r4
        L_0x0060:
            if (r15 == 0) goto L_0x0050
            goto L_0x004f
        L_0x0063:
            boolean r0 = A01(r13)
            if (r0 == 0) goto L_0x005f
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            r5 = 0
            r11 = 1
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r4 = new com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3263676m.A04(android.content.res.Resources, boolean):com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel");
    }

    public static final boolean A00(C3263676m r4) {
        Integer A0d;
        String str = r4.A02;
        if (str == null || (A0d = r4.A01.A0d(str)) == null || A0d.intValue() != 1) {
            C254703su r2 = r4.A01;
            if (!0qQ.A0K(r2.A0j(), "permanent") || !r2.A1b()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A01(C3263676m r3) {
        String str;
        Integer A0d;
        C254703su r2 = r3.A01;
        if (r2.A1j(AnonymousClass0t1.A01.A01(r3.A00)) || (str = r3.A02) == null || (A0d = r2.A0d(str)) == null || A0d.intValue() != 100) {
            return false;
        }
        return true;
    }

    public static final boolean A02(C3263676m r3) {
        String str;
        Integer A022;
        if (A00(r3)) {
            return true;
        }
        C254933tI A0P = r3.A01.A0P();
        if (A0P == null || (str = r3.A02) == null || (A022 = A0P.A02(str)) == null || A022.intValue() != 1) {
            return false;
        }
        return true;
    }

    public final int A03() {
        if (A02(this) || A01(this)) {
            return 1;
        }
        return 2;
    }

    public final boolean A05() {
        if ((A02(this) || A01(this)) && C66797Mcj.A02(this.A00, this.A01.A1S())) {
            return true;
        }
        return false;
    }
}
