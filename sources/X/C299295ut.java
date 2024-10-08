package X;

import java.util.List;

/* renamed from: X.5ut  reason: invalid class name and case insensitive filesystem */
public final class C299295ut implements C2813857k {
    public final /* synthetic */ AnonymousClass49O A00;
    public final /* synthetic */ AnonymousClass49M A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public C299295ut(AnonymousClass49O r1, AnonymousClass49M r2, String str, List list) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = list;
        this.A02 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0057, code lost:
        if (X.182.A06(X.0Tu.A05, r3.A02, 36325330151158649L) == false) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFinish() {
        /*
            r15 = this;
            X.49O r4 = r15.A00
            r0 = 0
            r4.A00 = r0
            java.util.Set r0 = r4.A03
            r0.remove(r15)
            java.util.Set r0 = r4.A04
            r0.clear()
            X.49M r3 = r15.A01
            if (r3 == 0) goto L_0x006d
            java.util.List r0 = r15.A03
            X.34h r5 = r3.A03
            r5.notifyDataSetChanged()
            java.util.ArrayList r10 = r5.A03(r0)
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.Iterator r2 = r10.iterator()
        L_0x0027:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003f
            java.lang.Object r1 = r2.next()
            com.instagram.model.reels.Reel r1 = (com.instagram.model.reels.Reel) r1
            int r0 = r5.CMG(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.put(r1, r0)
            goto L_0x0027
        L_0x003f:
            java.lang.Integer r8 = r5.A07
            if (r8 == 0) goto L_0x006d
            java.lang.Integer r5 = r3.A04
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            if (r5 != r2) goto L_0x0059
            com.instagram.common.session.UserSession r7 = r3.A02
            X.0Tu r6 = X.0Tu.A05
            r0 = 36325330151158649(0x810db200023379, double:3.0356232857322166E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            r13 = 1
            if (r0 != 0) goto L_0x005a
        L_0x0059:
            r13 = 0
        L_0x005a:
            int r12 = r8.intValue()
            com.instagram.common.session.UserSession r8 = r3.A02
            java.lang.Integer r9 = X.AnonymousClass05K.A0N
            X.0iw r7 = r3.A01
            android.content.Context r6 = r3.A00
            r14 = 0
            if (r5 != r2) goto L_0x006a
            r14 = 1
        L_0x006a:
            X.GWQ.A01(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x006d:
            java.lang.String r0 = r15.A02
            X.AnonymousClass49O.A01(r4, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C299295ut.onFinish():void");
    }
}
