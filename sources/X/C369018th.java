package X;

import android.view.View;

/* renamed from: X.8th  reason: invalid class name and case insensitive filesystem */
public final class C369018th implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C349317zw A03;
    public final /* synthetic */ C366978pz A04;
    public final /* synthetic */ 26t A05;
    public final /* synthetic */ 1Av A06;
    public final /* synthetic */ String A07;

    public C369018th(View view, View view2, C349317zw r3, C366978pz r4, 26t r5, 1Av r6, String str, int i) {
        this.A07 = str;
        this.A04 = r4;
        this.A02 = view;
        this.A03 = r3;
        this.A01 = view2;
        this.A00 = i;
        this.A06 = r6;
        this.A05 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006a, code lost:
        r1 = r2.A00();
        r9.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0072, code lost:
        if (r10 != X.C366978pz.A0Z) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0074, code lost:
        r13.A02.postDelayed(new X.C40858AkS(r9), 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0080, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d0, code lost:
        r2.A04(r8, 0, r0, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00db, code lost:
        r2.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00de, code lost:
        r1.A07((com.instagram.common.session.UserSession) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e2, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r8 = r13.A07
            r4 = 0
            r3 = 1
            if (r8 == 0) goto L_0x000c
            int r0 = r8.length()
            if (r0 != 0) goto L_0x0034
        L_0x000c:
            X.8pz r0 = r13.A04
            int[] r9 = r0.A02
            int r7 = r9.length
            java.lang.String r6 = ""
            r8 = r6
            r5 = 0
        L_0x0015:
            if (r5 >= r7) goto L_0x0034
            r2 = r9[r5]
            int r0 = r8.length()
            if (r0 != 0) goto L_0x0031
            r1 = r6
        L_0x0020:
            android.view.View r0 = r13.A02
            android.content.Context r0 = r0.getContext()
            java.lang.String r0 = r0.getString(r2)
            java.lang.String r8 = X.002.A0g(r8, r1, r0)
            int r5 = r5 + 1
            goto L_0x0015
        L_0x0031:
            java.lang.String r1 = "\n"
            goto L_0x0020
        L_0x0034:
            X.7zw r9 = r13.A03
            android.app.Activity r5 = r9.A02
            X.8ti r0 = new X.8ti
            r0.<init>(r8)
            X.5Gt r2 = new X.5Gt
            r2.<init>(r5, r0)
            android.view.View r8 = r13.A01
            r2.A03(r8)
            X.8pz r10 = r13.A04
            X.2fy r0 = r10.A00
            r2.A06(r0)
            X.5Gu r0 = r10.A01
            r2.A07(r0)
            X.1Av r12 = r13.A06
            X.26t r11 = r13.A05
            X.8tj r7 = new X.8tj
            r7.<init>(r8, r9, r10, r11, r12)
            r2.A04 = r7
            X.8tk r0 = X.C369048tk.$redex_init_class
            int r0 = r10.ordinal()
            r1 = 1051931443(0x3eb33333, float:0.35)
            switch(r0) {
                case 0: goto L_0x00d9;
                case 1: goto L_0x00d9;
                case 2: goto L_0x0081;
                case 6: goto L_0x00a7;
                case 12: goto L_0x00af;
                case 23: goto L_0x00d6;
                case 35: goto L_0x00d6;
                case 37: goto L_0x00b8;
                case 38: goto L_0x00b8;
                case 39: goto L_0x00b8;
                case 60: goto L_0x00a7;
                case 61: goto L_0x00a7;
                default: goto L_0x006a;
            }
        L_0x006a:
            X.5Gv r1 = r2.A00()
            r9.A00 = r1
            X.8pz r0 = X.C366978pz.A0Z
            if (r10 != r0) goto L_0x00de
            android.view.View r3 = r13.A02
            X.AkS r2 = new X.AkS
            r2.<init>(r9)
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x0081:
            android.content.res.Resources r1 = r5.getResources()
            if (r1 == 0) goto L_0x008e
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            int r4 = r1.getDimensionPixelSize(r0)
        L_0x008e:
            int r0 = r8.getWidth()
            int r5 = r0 / 2
            int r0 = r13.A00
            int r5 = r5 + r0
            int r5 = r5 + r4
            int r0 = r8.getHeight()
            float r1 = (float) r0
            r0 = -1095552205(0xffffffffbeb33333, float:-0.35)
            float r1 = r1 * r0
            int r0 = (int) r1
            int r0 = r0 - r4
            r2.A04(r8, r5, r0, r3)
            goto L_0x006a
        L_0x00a7:
            int r0 = r8.getHeight()
            float r0 = (float) r0
            float r0 = r0 * r1
            int r0 = (int) r0
            goto L_0x00d0
        L_0x00af:
            r0 = 8000(0x1f40, float:1.121E-41)
            r2.A00 = r0
            r0 = 30
            r2.A01 = r0
            goto L_0x006a
        L_0x00b8:
            r0 = 3000(0xbb8, float:4.204E-42)
            r2.A00 = r0
            android.content.res.Resources r1 = r5.getResources()
            if (r1 == 0) goto L_0x00d4
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r1 = r1.getDimensionPixelSize(r0)
        L_0x00c9:
            int r0 = r8.getHeight()
            int r0 = r0 / 2
            int r0 = r0 + r1
        L_0x00d0:
            r2.A04(r8, r4, r0, r3)
            goto L_0x006a
        L_0x00d4:
            r1 = 0
            goto L_0x00c9
        L_0x00d6:
            r0 = 3000(0xbb8, float:4.204E-42)
            goto L_0x00db
        L_0x00d9:
            r0 = 4000(0xfa0, float:5.605E-42)
        L_0x00db:
            r2.A00 = r0
            goto L_0x006a
        L_0x00de:
            r0 = 0
            r1.A07(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C369018th.run():void");
    }
}
