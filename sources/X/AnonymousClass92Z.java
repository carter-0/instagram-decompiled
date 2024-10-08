package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.92Z  reason: invalid class name */
public final class AnonymousClass92Z {
    public final UserSession A00;

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fd, code lost:
        if (X.0qQ.A0K(r5, java.lang.Character.UnicodeBlock.CYRILLIC_EXTENDED_B) != false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0119, code lost:
        if (X.0qQ.A0K(r5, java.lang.Character.UnicodeBlock.GREEK_EXTENDED) != false) goto L_0x011b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(java.lang.String r12) {
        /*
            r11 = this;
            r3 = 0
            X.0qQ.A0B(r12, r3)
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r4 = r11.A00
            com.instagram.user.model.User r0 = r0.A01(r4)
            boolean r0 = r0.A2I()
            if (r0 == 0) goto L_0x0129
            boolean r0 = X.F5l.A01(r4)
            if (r0 == 0) goto L_0x0129
            java.util.Locale r0 = X.AnonymousClass1Q2.A02()
            java.lang.String r1 = r0.getLanguage()
            java.lang.String r0 = "en"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0035
            X.0Tu r2 = X.0Tu.A05
            r0 = 36311925560312640(0x81018100220340, double:3.0271461685052456E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x0129
        L_0x0035:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36311925559919420(0x810181001c033c, double:3.0271461682565716E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            r10 = 1
            if (r0 == 0) goto L_0x008a
            r0 = 36593400536892667(0x820181002004fb, double:3.2051520771032114E-306)
            long r0 = X.182.A01(r2, r4, r0)
            int r5 = (int) r0
            r6 = 0
            r1 = 0
        L_0x004f:
            int r0 = r12.length()
            if (r6 >= r0) goto L_0x0081
            int r8 = r12.codePointAt(r6)
            java.lang.Character$UnicodeBlock r7 = java.lang.Character.UnicodeBlock.of(r8)
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.IPA_EXTENSIONS
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 != 0) goto L_0x007d
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.ENCLOSED_ALPHANUMERICS
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 != 0) goto L_0x007d
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.MATHEMATICAL_ALPHANUMERIC_SYMBOLS
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 != 0) goto L_0x007d
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.ENCLOSED_ALPHANUMERIC_SUPPLEMENT
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 == 0) goto L_0x0084
        L_0x007d:
            int r1 = r1 + 1
            if (r1 < r5) goto L_0x0084
        L_0x0081:
            if (r1 < r5) goto L_0x008a
            return r10
        L_0x0084:
            int r0 = java.lang.Character.charCount(r8)
            int r6 = r6 + r0
            goto L_0x004f
        L_0x008a:
            r0 = 36311925560050494(0x810181001e033e, double:3.0271461683394634E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0129
            java.util.List r0 = X.I3s.A01(r12)
            java.util.Iterator r9 = r0.iterator()
        L_0x009d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0129
            java.lang.Object r2 = r9.next()
            java.lang.String r2 = (java.lang.String) r2
            r1 = 0
            r8 = 0
            r7 = 0
            r6 = 0
        L_0x00ad:
            int r0 = r2.length()
            if (r1 >= r0) goto L_0x009d
            int r4 = r12.codePointAt(r1)
            java.lang.Character$UnicodeBlock r5 = java.lang.Character.UnicodeBlock.of(r4)
            if (r8 != 0) goto L_0x00d8
            X.0qQ.A0A(r5)
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.BASIC_LATIN
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 == 0) goto L_0x0127
            r0 = 65
            if (r4 < r0) goto L_0x0127
            r0 = 90
            if (r4 <= r0) goto L_0x00d8
            r0 = 97
            if (r4 < r0) goto L_0x0127
            r0 = 122(0x7a, float:1.71E-43)
            if (r4 > r0) goto L_0x0127
        L_0x00d8:
            r8 = 1
        L_0x00d9:
            if (r7 != 0) goto L_0x00ff
            X.0qQ.A0A(r5)
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.CYRILLIC
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 != 0) goto L_0x00ff
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.CYRILLIC_SUPPLEMENTARY
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 != 0) goto L_0x00ff
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.CYRILLIC_EXTENDED_A
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 != 0) goto L_0x00ff
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.CYRILLIC_EXTENDED_B
            boolean r0 = X.0qQ.A0K(r5, r0)
            r7 = 0
            if (r0 == 0) goto L_0x0100
        L_0x00ff:
            r7 = 1
        L_0x0100:
            if (r8 == 0) goto L_0x0105
            if (r7 == 0) goto L_0x0105
            return r10
        L_0x0105:
            if (r6 != 0) goto L_0x011b
            X.0qQ.A0A(r5)
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.GREEK
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 != 0) goto L_0x011b
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.GREEK_EXTENDED
            boolean r0 = X.0qQ.A0K(r5, r0)
            r6 = 0
            if (r0 == 0) goto L_0x011c
        L_0x011b:
            r6 = 1
        L_0x011c:
            if (r8 == 0) goto L_0x0121
            if (r6 == 0) goto L_0x0121
            return r10
        L_0x0121:
            int r0 = java.lang.Character.charCount(r4)
            int r1 = r1 + r0
            goto L_0x00ad
        L_0x0127:
            r8 = 0
            goto L_0x00d9
        L_0x0129:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass92Z.A00(java.lang.String):boolean");
    }

    public AnonymousClass92Z(UserSession userSession) {
        this.A00 = userSession;
    }
}
