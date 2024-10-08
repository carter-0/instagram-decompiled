package X;

import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.5lg  reason: invalid class name and case insensitive filesystem */
public final class C293995lg implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C293735lG A01;
    public final /* synthetic */ C292975jp A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ AnonymousClass3UL A04;
    public final /* synthetic */ boolean A05;

    public C293995lg(C293735lG r1, C292975jp r2, User user, AnonymousClass3UL r4, int i, boolean z) {
        this.A01 = r1;
        this.A05 = z;
        this.A04 = r4;
        this.A02 = r2;
        this.A03 = user;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r6 = r4.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r42) {
        /*
            r41 = this;
            r0 = 142691282(0x8814bd2, float:7.78173E-34)
            int r1 = X.AnonymousClass0fD.A05(r0)
            r4 = r41
            X.5lG r0 = r4.A01
            int r5 = r0.getBindingAdapterPosition()
            r0 = -1
            if (r5 == r0) goto L_0x0055
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x005c
            X.3UL r6 = r4.A04
            java.lang.String r9 = r6.A06
            if (r9 == 0) goto L_0x005c
            X.5jp r0 = r4.A02
            com.instagram.user.model.User r2 = r4.A03
            int r13 = r4.A00
            X.5js r7 = r0.A0G
            java.lang.String r8 = r2.getId()
            java.lang.String r10 = "feed_timeline"
            java.lang.String r11 = r2.A0P()
            java.lang.String r12 = r6.A05
            r3 = 0
            r7.A03(r8, r9, r10, r11, r12, r13)
            X.2ok r5 = r0.A0D
            boolean r2 = r5 instanceof X.C229982oj
            if (r2 == 0) goto L_0x004c
            X.2oj r5 = (X.C229982oj) r5
            X.3UH r2 = r0.A03
            r4 = 0
            if (r2 == 0) goto L_0x0047
            java.lang.String r3 = r2.A0C
            java.lang.String r4 = r2.getId()
        L_0x0047:
            java.lang.String r2 = "profile"
            r5.A01(r6, r3, r2, r4)
        L_0x004c:
            X.3UH r2 = r0.A03
            if (r2 == 0) goto L_0x0055
            X.2ok r0 = r0.A0D
            r0.Ckl(r2)
        L_0x0055:
            r0 = -1908100389(0xffffffff8e44b2db, float:-2.4244981E-30)
            X.AnonymousClass0fD.A0C(r0, r1)
            return
        L_0x005c:
            r17 = 0
            X.5jp r0 = r4.A02
            androidx.recyclerview.widget.RecyclerView r2 = r0.A00
            if (r2 == 0) goto L_0x0072
            X.3pI r3 = r2.A0D
            if (r3 == 0) goto L_0x0072
            boolean r2 = r3 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r2 == 0) goto L_0x0072
            androidx.recyclerview.widget.LinearLayoutManager r3 = (androidx.recyclerview.widget.LinearLayoutManager) r3
            int r17 = r3.A1a()
        L_0x0072:
            X.3UH r8 = r0.A03
            if (r8 == 0) goto L_0x004c
            X.3UL r6 = r4.A04
            X.2ok r2 = r0.A0D
            r19 = r2
            com.instagram.common.session.UserSession r2 = r0.A0C
            r18 = r2
            int r15 = r8.A01
            int r28 = r8.A01(r6)
            java.lang.String r14 = r8.A0C
            java.lang.String r23 = r8.getId()
            java.lang.String r13 = r8.A0I
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r2 = r8.A0P
            if (r2 == 0) goto L_0x0108
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r2.iterator()
        L_0x00a0:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x00b7
            java.lang.Object r7 = r10.next()
            r2 = r7
            X.3UI r2 = (X.AnonymousClass3UI) r2
            X.3UO r3 = r2.A07
            X.3UO r2 = X.AnonymousClass3UO.SUGGESTED_USER
            if (r3 != r2) goto L_0x00a0
            r9.add(r7)
            goto L_0x00a0
        L_0x00b7:
            java.util.Iterator r16 = r9.iterator()
        L_0x00bb:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x0108
            java.lang.Object r2 = r16.next()
            X.3UI r2 = (X.AnonymousClass3UI) r2
            X.3UL r2 = r2.A00()
            if (r2 == 0) goto L_0x00bb
            com.instagram.user.model.User r3 = r2.A03
            java.lang.String r31 = r3.getUsername()
            com.instagram.user.model.User r3 = r2.A03
            java.lang.String r32 = r3.getFullName()
            java.lang.String r30 = r2.getId()
            java.lang.String r12 = r2.A04
            java.lang.String r11 = r2.A08
            java.lang.String r10 = r2.A05
            java.lang.String r9 = r8.A0C
            java.lang.String r7 = r8.A0F
            if (r7 != 0) goto L_0x00eb
            java.lang.String r7 = ""
        L_0x00eb:
            java.lang.String r3 = r8.A0I
            r39 = 0
            r40 = 1
            com.instagram.feed.su.model.MiddleStateCardUser r2 = new com.instagram.feed.su.model.MiddleStateCardUser
            r29 = r2
            r33 = r12
            r34 = r11
            r35 = r10
            r36 = r9
            r37 = r7
            r38 = r3
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r4.add(r2)
            goto L_0x00bb
        L_0x0108:
            java.lang.String r7 = r8.A0H
            android.view.View r3 = r0.A0A
            android.app.Activity r2 = r0.A08
            java.lang.Integer r20 = java.lang.Integer.valueOf(r17)
            java.lang.String r22 = "profile"
            r24 = r13
            r25 = r7
            r26 = r4
            r27 = r15
            r29 = r5
            r15 = r19
            r16 = r2
            r17 = r3
            r19 = r6
            r21 = r14
            r15.DpF(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C293995lg.onClick(android.view.View):void");
    }
}
