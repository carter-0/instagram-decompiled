package com.instagram.save.api;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C53043Ghb;
import X.C60340gF;
import X.C62320sa;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.save.api.SaveHomeViewModel$makeRequest$1", f = "SaveHomeViewModel.kt", i = {0}, l = {125}, m = "invokeSuspend", n = {"callbacks"}, s = {"L$0"})
public final class SaveHomeViewModel$makeRequest$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final /* synthetic */ C53043Ghb A02;
    public final /* synthetic */ C62320sa A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SaveHomeViewModel$makeRequest$1(C53043Ghb ghb, AnonymousClass4D7 r3, C62320sa r4, boolean z, boolean z2) {
        super(2, r3);
        this.A02 = ghb;
        this.A04 = z;
        this.A05 = z2;
        this.A03 = r4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.save.api.SaveHomeViewModel$makeRequest$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        return new SaveHomeViewModel$makeRequest$1(this.A02, r8, this.A03, this.A04, this.A05);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.instagram.save.api.SaveHomeViewModel$makeRequest$1, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0101, code lost:
        if (X.182.A06(r2, r10, 36329796917084493L) != false) goto L_0x0103;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0136 A[Catch:{ IOException -> 0x018e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.1Hj r4 = X.1Hj.A02
            int r0 = r11.A00
            r5 = 1
            if (r0 == 0) goto L_0x000d
            java.lang.Object r3 = r11.A01
            X.HnM r3 = (X.C55787HnM) r3
            goto L_0x00a7
        L_0x000d:
            X.0eS.A00(r12)
            X.Ghb r7 = r11.A02     // Catch:{ IOException -> 0x018e }
            boolean r6 = r11.A04     // Catch:{ IOException -> 0x018e }
            java.lang.String r1 = r7.A03     // Catch:{ IOException -> 0x018e }
            r3 = 0
            if (r1 == 0) goto L_0x001c
            if (r6 != 0) goto L_0x0068
            goto L_0x0064
        L_0x001c:
            boolean r0 = r7.A06     // Catch:{ IOException -> 0x018e }
            if (r0 == 0) goto L_0x0040
            if (r6 != 0) goto L_0x0026
            X.HmW r0 = r7.A02     // Catch:{ IOException -> 0x018e }
            java.lang.String r3 = r0.A01     // Catch:{ IOException -> 0x018e }
        L_0x0026:
            com.instagram.common.session.UserSession r0 = r7.A01     // Catch:{ IOException -> 0x018e }
            X.1NY r2 = X.DbU.A0O(r0)     // Catch:{ IOException -> 0x018e }
            java.lang.String r0 = "collections/liked_collections/"
            r2.A0A(r0)     // Catch:{ IOException -> 0x018e }
            java.lang.Class<X.Gyy> r1 = X.C54074Gyy.class
            java.lang.Class<X.Hws> r0 = X.C56341Hws.class
            r2.A0R(r1, r0)     // Catch:{ IOException -> 0x018e }
            X.C3724090s.A06(r2, r3)     // Catch:{ IOException -> 0x018e }
            X.1OC r2 = r2.A0M()     // Catch:{ IOException -> 0x018e }
            goto L_0x0085
        L_0x0040:
            if (r6 != 0) goto L_0x0046
            X.HmW r0 = r7.A02     // Catch:{ IOException -> 0x018e }
            java.lang.String r3 = r0.A01     // Catch:{ IOException -> 0x018e }
        L_0x0046:
            com.instagram.common.session.UserSession r8 = r7.A01     // Catch:{ IOException -> 0x018e }
            X.HMw[] r2 = X.C54665HMw.values()     // Catch:{ IOException -> 0x018e }
            r1 = 0
            X.0qQ.A0B(r2, r1)     // Catch:{ IOException -> 0x018e }
            X.0sv r0 = new X.0sv     // Catch:{ IOException -> 0x018e }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x018e }
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r0)     // Catch:{ IOException -> 0x018e }
            X.HMw r0 = X.C54665HMw.SAVED_ENTRYPOINT_COLLECTION     // Catch:{ IOException -> 0x018e }
            r1.remove(r0)     // Catch:{ IOException -> 0x018e }
            r0 = 0
            X.1OC r2 = X.C56641I5w.A01(r8, r3, r1, r0)     // Catch:{ IOException -> 0x018e }
            goto L_0x0085
        L_0x0064:
            X.HmW r0 = r7.A02     // Catch:{ IOException -> 0x018e }
            java.lang.String r3 = r0.A01     // Catch:{ IOException -> 0x018e }
        L_0x0068:
            com.instagram.common.session.UserSession r0 = r7.A01     // Catch:{ IOException -> 0x018e }
            X.1NY r2 = X.DbU.A0O(r0)     // Catch:{ IOException -> 0x018e }
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch:{ IOException -> 0x018e }
            java.lang.String r0 = "collections/list_public/user/%s/"
            r2.A0K(r0, r1)     // Catch:{ IOException -> 0x018e }
            java.lang.Class<X.Gyy> r1 = X.C54074Gyy.class
            java.lang.Class<X.Hws> r0 = X.C56341Hws.class
            r2.A0R(r1, r0)     // Catch:{ IOException -> 0x018e }
            X.C3724090s.A06(r2, r3)     // Catch:{ IOException -> 0x018e }
            X.1OC r2 = r2.A0M()     // Catch:{ IOException -> 0x018e }
        L_0x0085:
            X.0qQ.A0A(r2)     // Catch:{ IOException -> 0x018e }
            boolean r1 = r11.A05     // Catch:{ IOException -> 0x018e }
            X.0sa r0 = r11.A03     // Catch:{ IOException -> 0x018e }
            X.HnM r3 = new X.HnM     // Catch:{ IOException -> 0x018e }
            r3.<init>(r7, r0, r1, r6)     // Catch:{ IOException -> 0x018e }
            X.Ghb r0 = r3.A00     // Catch:{ IOException -> 0x018e }
            X.HmW r1 = r0.A02     // Catch:{ IOException -> 0x018e }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ IOException -> 0x018e }
            r1.A00 = r0     // Catch:{ IOException -> 0x018e }
            r11.A01 = r3     // Catch:{ IOException -> 0x018e }
            r11.A00 = r5     // Catch:{ IOException -> 0x018e }
            r0 = 594972701(0x2376901d, float:1.3366204E-17)
            java.lang.Object r12 = r2.A00(r0, r11)     // Catch:{ IOException -> 0x018e }
            if (r12 != r4) goto L_0x00aa
            return r4
        L_0x00a7:
            X.0eS.A00(r12)     // Catch:{ IOException -> 0x018e }
        L_0x00aa:
            X.3Ii r12 = (X.C239803Ii) r12     // Catch:{ IOException -> 0x018e }
            boolean r0 = r12 instanceof X.C239793Ih     // Catch:{ IOException -> 0x018e }
            if (r0 == 0) goto L_0x0105
            X.3Ih r12 = (X.C239793Ih) r12     // Catch:{ IOException -> 0x018e }
            java.lang.Object r9 = r12.A00     // Catch:{ IOException -> 0x018e }
            X.Gyy r9 = (X.C54074Gyy) r9     // Catch:{ IOException -> 0x018e }
            r0 = 0
            X.0qQ.A0B(r9, r0)     // Catch:{ IOException -> 0x018e }
            X.Ghb r8 = r3.A00     // Catch:{ IOException -> 0x018e }
            X.HmW r1 = r8.A02     // Catch:{ IOException -> 0x018e }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ IOException -> 0x018e }
            r1.A00 = r0     // Catch:{ IOException -> 0x018e }
            java.lang.String r0 = r9.A00     // Catch:{ IOException -> 0x018e }
            r1.A01 = r0     // Catch:{ IOException -> 0x018e }
            boolean r0 = r9.A02     // Catch:{ IOException -> 0x018e }
            r1.A02 = r0     // Catch:{ IOException -> 0x018e }
            com.instagram.common.session.UserSession r10 = r8.A01     // Catch:{ IOException -> 0x018e }
            X.IOk r4 = X.C55124HcX.A00(r10)     // Catch:{ IOException -> 0x018e }
            boolean r5 = r3.A03     // Catch:{ IOException -> 0x018e }
            if (r5 == 0) goto L_0x0111
            java.util.List r7 = r9.A01     // Catch:{ IOException -> 0x018e }
            boolean r6 = r3.A02     // Catch:{ IOException -> 0x018e }
            java.lang.String r0 = r8.A03     // Catch:{ IOException -> 0x018e }
            if (r0 != 0) goto L_0x0103
            boolean r0 = r8.A07     // Catch:{ IOException -> 0x018e }
            if (r0 == 0) goto L_0x0103
            com.instagram.user.model.User r0 = X.DbT.A0j(r10)     // Catch:{ IOException -> 0x018e }
            boolean r0 = r0.A1o()     // Catch:{ IOException -> 0x018e }
            if (r0 != 0) goto L_0x0103
            X.0Tu r2 = X.0Tu.A05     // Catch:{ IOException -> 0x018e }
            r0 = 36321185507845272(0x8109ed00042498, double:3.033002196611698E-306)
            boolean r0 = X.182.A06(r2, r10, r0)     // Catch:{ IOException -> 0x018e }
            if (r0 == 0) goto L_0x0103
            r0 = 36329796917084493(0x8111c20001414d, double:3.038448086489943E-306)
            boolean r1 = X.182.A06(r2, r10, r0)     // Catch:{ IOException -> 0x018e }
            r0 = 1
            if (r1 == 0) goto L_0x010e
        L_0x0103:
            r0 = 0
            goto L_0x010e
        L_0x0105:
            boolean r0 = r12 instanceof X.C297815sO     // Catch:{ IOException -> 0x018e }
            if (r0 != 0) goto L_0x0132
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ IOException -> 0x018e }
        L_0x010d:
            throw r0     // Catch:{ IOException -> 0x018e }
        L_0x010e:
            r4.A06(r7, r6, r0)     // Catch:{ IOException -> 0x018e }
        L_0x0111:
            X.05G r7 = r8.A00     // Catch:{ IOException -> 0x018e }
            boolean r6 = r3.A02     // Catch:{ IOException -> 0x018e }
            if (r5 == 0) goto L_0x0156
            java.util.List r1 = r8.A04     // Catch:{ IOException -> 0x018e }
            java.util.List r0 = r8.A05     // Catch:{ IOException -> 0x018e }
            java.util.List r5 = r4.A02(r1, r0)     // Catch:{ IOException -> 0x018e }
        L_0x011f:
            X.HE6 r0 = new X.HE6     // Catch:{ IOException -> 0x018e }
            r0.<init>(r5, r6)     // Catch:{ IOException -> 0x018e }
            r7.Epw(r0)     // Catch:{ IOException -> 0x018e }
            X.0sa r0 = r3.A01     // Catch:{ IOException -> 0x018e }
            if (r0 == 0) goto L_0x012e
            r0.invoke()     // Catch:{ IOException -> 0x018e }
        L_0x012e:
            X.3Ih r12 = X.C51967G9n.A0d()     // Catch:{ IOException -> 0x018e }
        L_0x0132:
            boolean r0 = r12 instanceof X.C239793Ih     // Catch:{ IOException -> 0x018e }
            if (r0 != 0) goto L_0x01a2
            boolean r0 = r12 instanceof X.C297815sO     // Catch:{ IOException -> 0x018e }
            if (r0 == 0) goto L_0x0189
            X.Ghb r2 = r3.A00     // Catch:{ IOException -> 0x018e }
            X.HmW r1 = r2.A02     // Catch:{ IOException -> 0x018e }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ IOException -> 0x018e }
            r1.A00 = r0     // Catch:{ IOException -> 0x018e }
            X.05G r2 = r2.A00     // Catch:{ IOException -> 0x018e }
            boolean r1 = r3.A02     // Catch:{ IOException -> 0x018e }
            X.HE7 r0 = new X.HE7     // Catch:{ IOException -> 0x018e }
            r0.<init>(r1)     // Catch:{ IOException -> 0x018e }
            r2.Epw(r0)     // Catch:{ IOException -> 0x018e }
            X.0sa r0 = r3.A01     // Catch:{ IOException -> 0x018e }
            if (r0 == 0) goto L_0x01a2
            r0.invoke()     // Catch:{ IOException -> 0x018e }
            goto L_0x01a2
        L_0x0156:
            java.util.List r0 = r9.A01     // Catch:{ IOException -> 0x018e }
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x018e }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ IOException -> 0x018e }
        L_0x0160:
            boolean r0 = r9.hasNext()     // Catch:{ IOException -> 0x018e }
            if (r0 == 0) goto L_0x011f
            java.lang.Object r4 = r9.next()     // Catch:{ IOException -> 0x018e }
            r2 = r4
            com.instagram.save.model.SavedCollection r2 = (com.instagram.save.model.SavedCollection) r2     // Catch:{ IOException -> 0x018e }
            java.util.List r1 = r8.A04     // Catch:{ IOException -> 0x018e }
            X.HMw r0 = r2.A07     // Catch:{ IOException -> 0x018e }
            boolean r0 = r1.contains(r0)     // Catch:{ IOException -> 0x018e }
            if (r0 == 0) goto L_0x0160
            java.util.List r1 = r8.A05     // Catch:{ IOException -> 0x018e }
            X.HMU r0 = r2.A06     // Catch:{ IOException -> 0x018e }
            boolean r0 = X.00k.A0u(r1, r0)     // Catch:{ IOException -> 0x018e }
            if (r0 != 0) goto L_0x0185
            X.HMU r0 = r2.A06     // Catch:{ IOException -> 0x018e }
            if (r0 != 0) goto L_0x0160
        L_0x0185:
            r5.add(r4)     // Catch:{ IOException -> 0x018e }
            goto L_0x0160
        L_0x0189:
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ IOException -> 0x018e }
            goto L_0x010d
        L_0x018e:
            X.Ghb r2 = r11.A02
            X.HmW r1 = r2.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A00 = r0
            X.05G r2 = r2.A00
            boolean r1 = r11.A04
            X.HE7 r0 = new X.HE7
            r0.<init>(r1)
            r2.Epw(r0)
        L_0x01a2:
            X.0gF r4 = X.C60340gF.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.save.api.SaveHomeViewModel$makeRequest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SaveHomeViewModel$makeRequest$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
