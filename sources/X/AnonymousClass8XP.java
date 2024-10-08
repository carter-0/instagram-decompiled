package X;

/* renamed from: X.8XP  reason: invalid class name */
public final class AnonymousClass8XP implements AnonymousClass8XQ {
    public boolean A00;
    public boolean A01;
    public final /* synthetic */ AnonymousClass8XA A02;

    public final void DCx(Exception exc) {
        C362048hG r0;
        0qQ.A0B(exc, 0);
        AnonymousClass8XA r1 = this.A02;
        if (!r1.A0o && (r0 = r1.A02) != null) {
            r0.A0r.DCx(exc);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DQY(X.AnonymousClass8XW r10, java.util.List r11, java.util.List r12, int r13) {
        /*
            r9 = this;
            r5 = 0
            X.0qQ.A0B(r10, r5)
            r4 = 1
            X.0qQ.A0B(r11, r4)
            r3 = 2
            X.0qQ.A0B(r12, r3)
            X.8XA r2 = r9.A02
            X.8Yz r0 = r2.A0G
            X.80m r8 = r0.A08
            java.lang.Object r0 = r8.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x0081
            com.instagram.common.session.UserSession r7 = r2.A0F
            X.0Tu r6 = X.0Tu.A05
            r0 = 36330398212440680(0x81124e00004268, double:3.038828348094418E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x0081
            boolean r0 = r9.A00
            if (r0 != 0) goto L_0x0081
            X.8hG r0 = r2.A02
            if (r0 == 0) goto L_0x007f
            X.8hT r0 = r0.A0r
            X.9I1 r0 = r0.A03
            if (r0 == 0) goto L_0x007f
            int r0 = r0.A00
            if (r0 == 0) goto L_0x007f
        L_0x0039:
            r10.A0D(r0)
            r9.A00 = r4
            r9.A01 = r5
        L_0x0040:
            boolean r0 = r12.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x006f
            X.8XG r0 = r2.A09()
            r0.A01(r12)
        L_0x004f:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r12.iterator()
        L_0x0058:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r1 = r7.next()
            r0 = r1
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0058
            r6.add(r1)
            goto L_0x0058
        L_0x006f:
            boolean r0 = r11.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00fa
            X.8XG r0 = r2.A09()
            r0.A01(r11)
            goto L_0x004f
        L_0x007f:
            r0 = -3
            goto L_0x0039
        L_0x0081:
            java.lang.Object r0 = r8.A00
            boolean r0 = r0 instanceof X.AnonymousClass9QA
            r6 = -1
            if (r0 == 0) goto L_0x00b2
            com.instagram.common.session.UserSession r8 = r2.A0F
            X.0Tu r7 = X.0Tu.A06
            r0 = 36330398212440680(0x81124e00004268, double:3.038828348094418E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r9.A01
            if (r0 != 0) goto L_0x00b2
            X.8hG r0 = r2.A02
            if (r0 == 0) goto L_0x00aa
            X.8hT r0 = r0.A0r
            X.9I1 r0 = r0.A03
            if (r0 == 0) goto L_0x00aa
            int r0 = r0.A01
            if (r0 == 0) goto L_0x00aa
            r6 = r0
        L_0x00aa:
            r10.A0D(r6)
            r9.A00 = r5
            r9.A01 = r4
            goto L_0x0040
        L_0x00b2:
            com.instagram.ui.widget.mediapicker.Folder r0 = r10.A02
            java.util.Set r0 = r0.A05
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0040
            r10.A0D(r6)
            goto L_0x0040
        L_0x00c0:
            int r0 = r6.size()
            if (r0 <= r4) goto L_0x00fa
            X.8hG r0 = r2.A02
            if (r0 == 0) goto L_0x00fa
            java.util.List r1 = X.00k.A0d(r6, r3)
            X.0qQ.A0B(r1, r5)
            X.8hW r0 = r0.A0n
            X.8hb r0 = r0.A09
            X.2t9 r7 = r0.A01
            X.8hd r6 = new X.8hd
            r6.<init>(r1)
            java.util.List r0 = r0.A06
            java.util.Iterator r5 = r0.iterator()
            r1 = 0
        L_0x00e3:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00f4
            java.lang.Object r0 = r5.next()
            boolean r0 = r0 instanceof X.C362278hd
            if (r0 != 0) goto L_0x00f5
            int r1 = r1 + 1
            goto L_0x00e3
        L_0x00f4:
            r1 = -1
        L_0x00f5:
            X.2tA r0 = X.AnonymousClass2t9.A0D
            r7.A07(r0, r6, r1)
        L_0x00fa:
            boolean r0 = r2.A0o
            if (r0 != 0) goto L_0x0115
            X.8hG r0 = r2.A02
            if (r0 == 0) goto L_0x0115
            java.util.List r2 = X.0u4.A01(r11)
            java.util.List r1 = X.0u4.A01(r12)
            X.0qQ.A0B(r2, r4)
            X.0qQ.A0B(r1, r3)
            X.8hT r0 = r0.A0r
            r0.DQY(r10, r2, r1, r13)
        L_0x0115:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8XP.DQY(X.8XW, java.util.List, java.util.List, int):void");
    }

    public AnonymousClass8XP(AnonymousClass8XA r1) {
        this.A02 = r1;
    }
}
