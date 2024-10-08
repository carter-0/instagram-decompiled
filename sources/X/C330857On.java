package X;

/* renamed from: X.7On  reason: invalid class name and case insensitive filesystem */
public final class C330857On extends C249403jg {
    public final /* synthetic */ AnonymousClass7TI A00;

    public C330857On(AnonymousClass7TI r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (r1.A04() != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x012d, code lost:
        if (r0 != null) goto L_0x011c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrolled(androidx.recyclerview.widget.RecyclerView r10, int r11, int r12) {
        /*
            r9 = this;
            r0 = -517387531(0xffffffffe1294af5, float:-1.9518131E20)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = 0
            X.0qQ.A0B(r10, r0)
            if (r12 != 0) goto L_0x0025
            X.7TI r0 = r9.A00
            com.instagram.common.session.UserSession r4 = r0.A0d
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324677315997915(0x810d1a000030db, double:3.035210430147812E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0025
            r0 = 323763529(0x134c3d49, float:2.5778636E-27)
        L_0x0021:
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x0025:
            X.7TI r2 = r9.A00
            X.7Ue r4 = r2.A0i
            X.7Mn r1 = r4.A0C
            if (r1 == 0) goto L_0x0137
            X.3su r0 = r1.A01
            if (r0 == 0) goto L_0x003a
            boolean r0 = X.C330377Mn.A01(r1)
            if (r0 != 0) goto L_0x003a
            X.C330377Mn.A00(r1)
        L_0x003a:
            X.7Tw r0 = r2.A0j
            X.7UO r0 = r0.A0H
            X.7Mw r6 = r0.A06
            if (r6 == 0) goto L_0x009a
            X.7Mt r1 = r6.A03
            r5 = 1
            if (r1 == 0) goto L_0x0054
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x0054
            boolean r0 = r1.A04()
            r2 = 1
            if (r0 == 0) goto L_0x0055
        L_0x0054:
            r2 = 0
        L_0x0055:
            int r1 = r6.A01
            r0 = 29
            if (r1 == r0) goto L_0x0063
            boolean r0 = X.AnonymousClass48O.A01(r1)
            if (r0 != 0) goto L_0x0063
            if (r2 == 0) goto L_0x009a
        L_0x0063:
            X.3pI r1 = r10.A0D
            java.lang.String r0 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
            X.0qQ.A0C(r1, r0)
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            int r1 = r1.A1a()
            r0 = 10
            if (r1 >= r0) goto L_0x0075
            r5 = 0
        L_0x0075:
            boolean r0 = r6.A00
            if (r0 == r5) goto L_0x009a
            r6.A00 = r5
            android.view.ViewGroup r0 = r6.A02
            android.view.ViewPropertyAnimator r2 = r0.animate()
            r1 = 0
            if (r5 == 0) goto L_0x0130
            r0 = 0
        L_0x0085:
            android.view.ViewPropertyAnimator r0 = r2.translationY(r0)
            if (r5 == 0) goto L_0x008d
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x008d:
            android.view.ViewPropertyAnimator r2 = r0.alpha(r1)
            r0 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
            r0.start()
        L_0x009a:
            X.0eM r0 = r4.A0S
            java.lang.Object r5 = r0.getValue()
            X.7VH r5 = (X.AnonymousClass7VH) r5
            boolean r0 = r5.A04
            if (r0 != 0) goto L_0x011f
            X.0sa r2 = r5.A09
            java.lang.Object r0 = r2.invoke()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            X.7SD r0 = r0.C6Q()
            int r1 = r0.A08
            r0 = 29
            if (r1 != r0) goto L_0x011f
            java.lang.Object r0 = r2.invoke()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            X.7SD r0 = r0.C6Q()
            boolean r0 = r0.A0n
            if (r0 != 0) goto L_0x011f
            int r4 = r10.getMeasuredHeight()
            if (r4 <= 0) goto L_0x011f
            int r6 = r4 / 10
            float r2 = r5.A00
            float r0 = (float) r12
            float r2 = r2 - r0
            r5.A00 = r2
            r8 = 0
            r1 = 0
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e3
            r1 = r2
        L_0x00e3:
            r5.A00 = r1
            float r7 = (float) r4
            com.instagram.common.session.UserSession r4 = r5.A08
            X.0Tu r2 = X.0Tu.A05
            r0 = 37163832326881582(0x84084f0056012e, double:3.5658954380366534E-306)
            double r1 = X.182.A00(r2, r4, r0)
            float r0 = (float) r1
            float r7 = r7 * r0
            float r0 = r5.A00
            r4 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0124
            X.3oV r0 = r5.A03
            if (r0 == 0) goto L_0x0104
            r0.getView()
        L_0x0104:
            float r2 = r5.A00
            float r2 = r2 - r7
            float r0 = (float) r6
            float r2 = r2 / r0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0110
            r1 = r2
        L_0x0110:
            android.view.View r0 = r5.A02
            if (r0 == 0) goto L_0x0117
            r0.setAlpha(r1)
        L_0x0117:
            android.view.View r0 = r5.A01
            if (r0 == 0) goto L_0x011f
            float r4 = r4 - r1
        L_0x011c:
            r0.setAlpha(r4)
        L_0x011f:
            r0 = -714859337(0xffffffffd5641cb7, float:-1.56757488E13)
            goto L_0x0021
        L_0x0124:
            android.view.View r0 = r5.A02
            if (r0 == 0) goto L_0x012b
            r0.setAlpha(r8)
        L_0x012b:
            android.view.View r0 = r5.A01
            if (r0 == 0) goto L_0x011f
            goto L_0x011c
        L_0x0130:
            int r0 = r0.getMeasuredHeight()
            float r0 = (float) r0
            goto L_0x0085
        L_0x0137:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r0 = -2139337489(0xffffffff807c4cef, float:-1.14152E-38)
            X.AnonymousClass0fD.A0A(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C330857On.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
