package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3Kn  reason: invalid class name and case insensitive filesystem */
public final class C240343Kn extends AnonymousClass0T0 implements AnonymousClass1qK {
    public int A00 = -1;
    public 1Xj A01;
    public String A02;
    public String A03;
    public final AnonymousClass3W1 A04;
    public final String A05;
    public final boolean A06;
    public final UserSession A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C240343Kn) {
                C240343Kn r5 = (C240343Kn) obj;
                if (!0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A08, r5.A08) || this.A06 != r5.A06) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.A05.hashCode() * 31) + this.A01.hashCode()) * 31;
        AnonymousClass3W1 r0 = this.A04;
        int i = 0;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int hashCode3 = (((((hashCode2 + hashCode) * 31) + this.A03.hashCode()) * 31) + this.A07.hashCode()) * 31;
        String str = this.A08;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        int i3 = 1237;
        if (this.A06) {
            i3 = 1231;
        }
        return i2 + i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005f, code lost:
        if (r0 == null) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C240343Kn(com.instagram.common.session.UserSession r9, X.1Xj r10, X.AnonymousClass3W1 r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
            r8 = this;
            r8.<init>()
            r8.A05 = r12
            r8.A01 = r10
            r8.A04 = r11
            r8.A03 = r13
            r8.A07 = r9
            r8.A08 = r14
            r8.A06 = r15
            r0 = -1
            r8.A00 = r0
            int r0 = java.lang.Integer.parseInt(r13)     // Catch:{ NumberFormatException -> 0x001b }
            r8.A00 = r0     // Catch:{ NumberFormatException -> 0x001b }
            goto L_0x0023
        L_0x001b:
            r2 = move-exception
            java.lang.String r1 = "MediaEvent"
            java.lang.String r0 = "Failed to convert carousel child mention index to int"
            X.0wb.A06(r1, r0, r2)
        L_0x0023:
            X.1Xj r1 = r8.A01
            com.instagram.common.session.UserSession r0 = r8.A07
            X.1Xj r0 = r1.A1e(r0)
            r8.A01 = r0
            int r7 = r8.A00
            X.1Xy r0 = r0.A0C
            java.util.List r0 = r0.Alu()
            if (r0 == 0) goto L_0x0061
            java.util.Iterator r6 = r0.iterator()
            r5 = 0
        L_0x003c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0061
            java.lang.Object r4 = r6.next()
            X.1Xj r4 = (X.1Xj) r4
            java.lang.String r3 = r4.getId()
            r2 = 1
            if (r3 == 0) goto L_0x0059
            java.lang.String r1 = "open_carousel_prompt"
            r0 = 0
            boolean r0 = X.00p.A0i(r3, r1, r0)
            if (r0 != r2) goto L_0x0059
            goto L_0x003c
        L_0x0059:
            if (r5 != r7) goto L_0x0078
            java.lang.String r0 = r4.getId()
            if (r0 != 0) goto L_0x0075
        L_0x0061:
            java.lang.String r2 = r8.A08
            if (r2 == 0) goto L_0x007b
            X.1Xj r0 = r8.A01
            java.lang.String r1 = r0.Bi3()
            r0 = 1
            X.0qQ.A0B(r1, r0)
            r0 = 95
            java.lang.String r0 = X.002.A0T(r2, r1, r0)
        L_0x0075:
            r8.A02 = r0
            return
        L_0x0078:
            int r5 = r5 + 1
            goto L_0x003c
        L_0x007b:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C240343Kn.<init>(com.instagram.common.session.UserSession, X.1Xj, X.3W1, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }
}
