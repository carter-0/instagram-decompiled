package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Vfs  reason: case insensitive filesystem */
public final class C17781Vfs {
    public final AnonymousClass2t9 A00;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v8, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v9, types: [X.2tF, java.lang.Object] */
    public C17781Vfs(Context context, Fragment fragment, C229382nI r5, AnonymousClass0iw r6, UserSession userSession, VPD vpd, VPE vpe, C17390VTr vTr) {
        C51974G9v.A0d(3, userSession, vpd, vpe, r5);
        0qQ.A0B(vTr, 8);
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
        A002.A01(new Object());
        A002.A01(new Object());
        A002.A01(new C15791Uia(fragment, r6, vpd, vTr));
        A002.A01(new C15761Ui6(vpe));
        A002.A01(new C15778UiN(r5, userSession));
        A002.A01(new C15762Ui7(userSession));
        A002.A01(new Object());
        this.A00 = DbU.A0U(A002, new Object());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01f0, code lost:
        r2.add(r7);
     */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x00a3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.ULE r22, com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r23) {
        /*
            r21 = this;
            r4 = 0
            r6 = r22
            r5 = r23
            boolean r3 = X.AnonymousClass7TF.A1U(r4, r6, r5)
            java.util.List r0 = r6.A04
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r19 = r0.iterator()
            r18 = 0
        L_0x0016:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x01f5
            java.lang.Object r7 = r19.next()
            int r17 = r18 + 1
            if (r18 >= 0) goto L_0x002c
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x002c:
            X.N3k r7 = (X.C68169N3k) r7
            com.instagram.api.schemas.ProductTaggingFeedComponentType r0 = r7.A02
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x01d7;
                case 1: goto L_0x01a7;
                case 2: goto L_0x005c;
                case 3: goto L_0x004b;
                case 4: goto L_0x0197;
                case 5: goto L_0x01c7;
                case 6: goto L_0x01b7;
                case 7: goto L_0x003a;
                default: goto L_0x0037;
            }
        L_0x0037:
            r18 = r17
            goto L_0x0016
        L_0x003a:
            X.ULy r0 = r7.A01
            java.lang.Object r1 = r0.A08
            X.BBV r1 = (X.BBV) r1
            if (r1 == 0) goto L_0x0037
            java.lang.String r0 = r7.A03
            X.WS8 r7 = new X.WS8
            r7.<init>(r1, r0)
            goto L_0x01f0
        L_0x004b:
            X.ULy r0 = r7.A01
            java.lang.Object r1 = r0.A02
            X.VHc r1 = (X.C17080VHc) r1
            if (r1 == 0) goto L_0x0037
            java.lang.String r0 = r7.A03
            X.WS3 r7 = new X.WS3
            r7.<init>(r1, r0)
            goto L_0x01f0
        L_0x005c:
            X.ULy r0 = r7.A01
            java.lang.Object r8 = r0.A01
            X.UKo r8 = (X.C15035UKo) r8
            if (r8 == 0) goto L_0x0037
            java.lang.String r0 = r7.A03
            r20 = r0
            java.util.List r12 = r6.A03
            X.JwC r11 = r8.A02
            if (r11 == 0) goto L_0x0119
            java.lang.Object r9 = r11.A00
            X.Jw2 r9 = (X.C61064Jw2) r9
        L_0x0072:
            r1 = 0
            X.UxE r0 = r8.A07
            if (r0 == 0) goto L_0x0094
            int r0 = r0.ordinal()
            r10 = 0
            if (r0 == r4) goto L_0x00f9
            if (r0 != r3) goto L_0x0094
            X.JwL r0 = r8.A00
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r0.A00
            com.instagram.user.model.ProductCollectionImpl r0 = (com.instagram.user.model.ProductCollectionImpl) r0
            if (r0 == 0) goto L_0x0094
            java.util.Map r1 = r5.A02
            java.lang.String r0 = r0.Aoi()
            boolean r1 = r1.containsKey(r0)
        L_0x0094:
            r11 = 1
            r10 = 0
            X.ULy r0 = r7.A01
            java.lang.Object r14 = r0.A01
            X.UKo r14 = (X.C15035UKo) r14
            r13 = 2
            if (r12 == 0) goto L_0x011c
            java.util.Iterator r16 = r12.iterator()
        L_0x00a3:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x011c
            java.lang.Object r12 = r16.next()
            X.JwH r12 = (X.C61079JwH) r12
            java.lang.Object r0 = r12.A00
            X.Khy r0 = (X.C62568Khy) r0
            if (r0 == 0) goto L_0x00a3
            int r15 = r0.ordinal()
            if (r15 == r4) goto L_0x00d9
            if (r15 == r3) goto L_0x00e6
            if (r15 == r13) goto L_0x00d0
            r0 = 3
            if (r15 != r0) goto L_0x00a3
            java.lang.Object r0 = r12.A01
            if (r0 == 0) goto L_0x00a3
            boolean r0 = X.C64182LSo.A02(r14, r5)
        L_0x00ca:
            if (r0 == 0) goto L_0x00a3
        L_0x00cc:
            r11 = r1
            java.lang.String r10 = r12.A02
            goto L_0x00a3
        L_0x00d0:
            java.lang.Object r0 = r12.A01
            if (r0 == 0) goto L_0x00a3
            boolean r0 = X.C64182LSo.A03(r14, r5)
            goto L_0x00ca
        L_0x00d9:
            java.lang.Object r0 = r12.A01
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00a3
            int r15 = r0.intValue()
            java.util.Map r0 = r5.A04
            goto L_0x00f2
        L_0x00e6:
            java.lang.Object r0 = r12.A01
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00a3
            int r15 = r0.intValue()
            java.util.Map r0 = r5.A02
        L_0x00f2:
            int r0 = r0.size()
            if (r0 < r15) goto L_0x00a3
            goto L_0x00cc
        L_0x00f9:
            if (r11 == 0) goto L_0x0117
            java.lang.Object r0 = r11.A00
            X.Jw2 r0 = (X.C61064Jw2) r0
            if (r0 == 0) goto L_0x0117
            java.lang.String r1 = r0.A02
        L_0x0103:
            X.JwL r0 = r8.A00
            if (r0 == 0) goto L_0x0111
            java.lang.Object r0 = r0.A01
            com.instagram.user.model.ProductDetailsProductItemDict r0 = (com.instagram.user.model.ProductDetailsProductItemDict) r0
            if (r0 == 0) goto L_0x0111
            com.instagram.user.model.Product r10 = X.C14502TxO.A00(r0)
        L_0x0111:
            boolean r1 = X.C64032LJw.A01(r5, r10, r1)
            goto L_0x0094
        L_0x0117:
            r1 = r10
            goto L_0x0103
        L_0x0119:
            r9 = 0
            goto L_0x0072
        L_0x011c:
            java.util.Map r12 = r5.A04
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x0179
            java.util.Map r0 = r5.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0179
        L_0x012c:
            X.ULy r0 = r7.A01
            java.lang.Object r0 = r0.A01
            X.UKo r0 = (X.C15035UKo) r0
            boolean r0 = X.C64182LSo.A03(r0, r5)
            if (r0 != 0) goto L_0x0144
            X.ULy r0 = r7.A01
            java.lang.Object r0 = r0.A01
            X.UKo r0 = (X.C15035UKo) r0
            boolean r0 = X.C64182LSo.A02(r0, r5)
            if (r0 == 0) goto L_0x0145
        L_0x0144:
            r11 = 0
        L_0x0145:
            if (r9 == 0) goto L_0x014c
            java.lang.Object r0 = r9.A01
            if (r0 == 0) goto L_0x014c
            r11 = 0
        L_0x014c:
            X.ULy r0 = r7.A01
            java.lang.Object r0 = r0.A01
            X.UKo r0 = (X.C15035UKo) r0
            if (r0 == 0) goto L_0x0167
            X.JwL r0 = r0.A00
            if (r0 == 0) goto L_0x0167
            java.lang.Object r0 = r0.A01
            com.instagram.user.model.ProductDetailsProductItemDict r0 = (com.instagram.user.model.ProductDetailsProductItemDict) r0
            if (r0 == 0) goto L_0x0167
            com.instagram.user.model.Product r0 = X.C14502TxO.A00(r0)
            boolean r0 = r0.A0Q
            if (r0 != 0) goto L_0x0167
            r11 = 0
        L_0x0167:
            r0 = 4
            X.JZA r9 = new X.JZA
            r9.<init>((java.lang.String) r10, (boolean) r1, (boolean) r11, (int) r0)
            java.lang.String r1 = java.lang.String.valueOf(r18)
            X.WST r7 = new X.WST
            r0 = r20
            r7.<init>(r9, r8, r0, r1)
            goto L_0x01f0
        L_0x0179:
            X.ULy r0 = r7.A01
            java.lang.Object r0 = r0.A01
            X.UKo r0 = (X.C15035UKo) r0
            if (r0 == 0) goto L_0x012c
            X.UxE r0 = r0.A07
            if (r0 == 0) goto L_0x012c
            int r0 = r0.ordinal()
            if (r0 == r4) goto L_0x018f
            if (r0 != r3) goto L_0x012c
            java.util.Map r12 = r5.A02
        L_0x018f:
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x012c
            r11 = 0
            goto L_0x012c
        L_0x0197:
            X.ULy r0 = r7.A01
            java.lang.Object r1 = r0.A03
            X.JwE r1 = (X.C61076JwE) r1
            if (r1 == 0) goto L_0x0037
            java.lang.String r0 = r7.A03
            X.WS4 r7 = new X.WS4
            r7.<init>(r1, r0)
            goto L_0x01f0
        L_0x01a7:
            X.ULy r0 = r7.A01
            java.lang.Object r1 = r0.A00
            X.JwH r1 = (X.C61079JwH) r1
            if (r1 == 0) goto L_0x0037
            java.lang.String r0 = r7.A03
            X.WS2 r7 = new X.WS2
            r7.<init>(r1, r0)
            goto L_0x01f0
        L_0x01b7:
            X.ULy r0 = r7.A01
            java.lang.Object r1 = r0.A07
            X.Jvs r1 = (X.C61054Jvs) r1
            if (r1 == 0) goto L_0x0037
            java.lang.String r0 = r7.A03
            X.WS7 r7 = new X.WS7
            r7.<init>(r1, r0)
            goto L_0x01f0
        L_0x01c7:
            X.ULy r0 = r7.A01
            java.lang.Object r1 = r0.A05
            X.UOE r1 = (X.UOE) r1
            if (r1 == 0) goto L_0x0037
            java.lang.String r0 = r7.A03
            X.WS5 r7 = new X.WS5
            r7.<init>(r1, r0)
            goto L_0x01f0
        L_0x01d7:
            java.lang.String r1 = r7.A03
            java.lang.String r0 = "spinner/default"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0037
            X.ULy r0 = r7.A01
            java.lang.Object r1 = r0.A06
            X.Jvk r1 = (X.C61046Jvk) r1
            if (r1 == 0) goto L_0x0037
            java.lang.String r0 = r7.A03
            X.WS6 r7 = new X.WS6
            r7.<init>(r1, r0)
        L_0x01f0:
            r2.add(r7)
            goto L_0x0037
        L_0x01f5:
            com.instagram.common.recyclerview.ViewModelListUpdate r1 = new com.instagram.common.recyclerview.ViewModelListUpdate
            r1.<init>()
            r1.A01(r2)
            r0 = r21
            X.2t9 r0 = r0.A00
            r0.A05(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17781Vfs.A00(X.ULE, com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState):void");
    }
}
