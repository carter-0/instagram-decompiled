package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.JJl  reason: case insensitive filesystem */
public final class C59436JJl extends 0Yg implements 0sJ {
    public final /* synthetic */ C270284gU A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ 0sP A03;
    public final /* synthetic */ 0sP A04;
    public final /* synthetic */ 0sP A05;
    public final /* synthetic */ 0sK A06;
    public final /* synthetic */ AnonymousClass62P A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59436JJl(C270284gU r2, UserSession userSession, List list, 0sP r5, 0sP r6, 0sP r7, 0sK r8, AnonymousClass62P r9) {
        super(4);
        this.A02 = list;
        this.A03 = r5;
        this.A05 = r6;
        this.A00 = r2;
        this.A04 = r7;
        this.A01 = userSession;
        this.A07 = r9;
        this.A06 = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008f, code lost:
        if (r2 < X.DbT.A02(r3.A07, 1)) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r21, java.lang.Object r22, java.lang.Object r23, java.lang.Object r24) {
        /*
            r20 = this;
            r6 = r23
            int r2 = X.AnonymousClass7TE.A0M(r22)
            X.5Wy r6 = (X.C286575Wy) r6
            int r3 = X.AnonymousClass7TE.A0M(r24)
            r0 = r3 & 6
            if (r0 != 0) goto L_0x00d4
            r0 = r21
            int r0 = X.G9t.A0O(r6, r0)
            r1 = r3 | r0
        L_0x0018:
            r0 = r3 & 48
            if (r0 != 0) goto L_0x0021
            int r0 = X.G9t.A06(r6, r2)
            r1 = r1 | r0
        L_0x0021:
            r1 = r1 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            if (r1 != r0) goto L_0x0033
            boolean r0 = r6.Bwn()
            if (r0 == 0) goto L_0x0033
            r6.Evl()
        L_0x0030:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0033:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0041
            r1 = -438437952(0xffffffffe5ddf7c0, float:-1.3102665E23)
            java.lang.String r0 = "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)"
            X.0fL.A01(r1, r0)
        L_0x0041:
            r3 = r20
            java.util.List r0 = r3.A02
            java.lang.Object r15 = r0.get(r2)
            r0 = -893107084(0xffffffffcac44474, float:-6431290.0)
            r6.ExS(r0)
            X.0sP r0 = r3.A03
            java.lang.Object r0 = r0.invoke(r15)
            float r18 = X.AnonymousClass7TE.A04(r0)
            X.0sP r0 = r3.A05
            java.lang.Object r8 = r0.invoke(r15)
            java.lang.String r8 = (java.lang.String) r8
            X.4gU r0 = r3.A00
            float r13 = X.C51968G9o.A01(r0)
            java.lang.String r1 = "post"
            X.0sP r0 = r3.A04
            java.lang.Object r0 = r0.invoke(r15)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r9 = X.002.A0R(r1, r0)
            X.5Qk r7 = androidx.compose.ui.Modifier.A00
            com.instagram.common.session.UserSession r5 = r3.A01
            X.0Tu r4 = X.0Tu.A05
            r0 = 36327937196178245(0x81101100003b45, double:3.037271991500337E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            r1 = 1
            if (r0 == 0) goto L_0x0091
            if (r2 <= 0) goto L_0x00c0
            X.62P r0 = r3.A07
            int r0 = X.DbT.A02(r0, r1)
            if (r2 >= r0) goto L_0x00cd
        L_0x0091:
            X.5b7 r4 = X.AnonymousClass6DA.A03
            X.5b7 r5 = X.AnonymousClass6DA.A02
            r10 = 0
            X.0sK r1 = r3.A06
            r0 = 1799358689(0x6b4008e1, float:2.3215569E26)
            X.JGr r14 = new X.JGr
            r16 = r8
            r19 = r2
            r17 = r1
            r14.<init>(r15, r16, r17, r18, r19)
            X.5PJ r12 = X.AnonymousClass5PI.A01(r6, r14, r0)
            r14 = 100663296(0x6000000, float:2.4074124E-35)
            r15 = 144(0x90, float:2.02E-43)
            r11 = r10
            X.AnonymousClass6DA.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = X.C51970G9q.A1Z(r6)
            if (r0 == 0) goto L_0x0030
            r0 = 668229215(0x27d45e5f, float:5.8944138E-15)
            X.0fL.A00(r0)
            goto L_0x0030
        L_0x00c0:
            if (r2 != 0) goto L_0x00cd
            r0 = 1090519040(0x41000000, float:8.0)
            X.5ZQ r0 = X.AnonymousClass5ZN.A02(r0, r13, r13, r0)
        L_0x00c8:
            androidx.compose.ui.Modifier r7 = X.AnonymousClass6FZ.A01(r7, r0)
            goto L_0x0091
        L_0x00cd:
            r0 = 1090519040(0x41000000, float:8.0)
            X.5ZQ r0 = X.AnonymousClass5ZN.A02(r13, r0, r0, r13)
            goto L_0x00c8
        L_0x00d4:
            r1 = r3
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59436JJl.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
