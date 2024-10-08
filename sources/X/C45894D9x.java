package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductArEffectMetadata;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.D9x  reason: case insensitive filesystem */
public abstract class C45894D9x {
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (X.0qQ.A0K(r4.getId(), r10.A06) == false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C18001Vjd A01(com.instagram.common.session.UserSession r10, X.C45363Cv5 r11) {
        /*
            r7 = 0
            r9 = 1
            X.0qQ.A0B(r11, r9)
            X.Cvk r4 = r11.A00
            java.lang.Integer r2 = r11.A01
            r0 = 484(0x1e4, float:6.78E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            if (r2 == 0) goto L_0x0158
            int r1 = r2.intValue()
            java.lang.String r8 = "Required value was null."
            if (r1 == r7) goto L_0x0145
            if (r1 == r9) goto L_0x00c3
            r0 = 3
            if (r1 == r0) goto L_0x00a9
            r0 = 4
            if (r1 == r0) goto L_0x0090
            r0 = 5
            if (r1 != r0) goto L_0x0083
            java.lang.String r2 = r11.A02
            X.0qQ.A06(r2)
            X.Ct8 r0 = r4.A04
            if (r0 == 0) goto L_0x007e
            X.3HX r5 = r0.A00
            X.0qQ.A0A(r5)
            X.1Ns r4 = X.AnonymousClass3P9.A01(r10, r5)
            if (r4 == 0) goto L_0x0079
            com.instagram.reels.store.ReelStore r3 = X.1OP.A05(r10)
            java.lang.Integer r1 = r4.CAm()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0051
            java.lang.String r1 = r4.getId()
            java.lang.String r0 = r10.A06
            boolean r1 = X.0qQ.A0K(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            com.instagram.model.reels.Reel r1 = r3.A0I(r5, r0)
            java.util.List r0 = r1.A0O(r10)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00f5
            java.util.List r0 = r1.A0O(r10)
            java.lang.Object r0 = r0.get(r7)
            X.3uh r0 = (X.C255773uh) r0
            X.1Xj r0 = r0.A0b
            if (r0 == 0) goto L_0x0074
            X.Urb r3 = new X.Urb
            r3.<init>(r0, r1, r2)
            return r3
        L_0x0074:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x0079:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x007e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x0083:
            java.lang.String r0 = X.C18269Voj.A01(r2)
            java.lang.String r0 = X.002.A0R(r3, r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0090:
            java.lang.String r1 = r11.A02
            X.0qQ.A06(r1)
            X.Ct7 r0 = r4.A03
            if (r0 == 0) goto L_0x00a4
            X.1Xj r0 = r0.A00
            X.0qQ.A06(r0)
            X.UrY r3 = new X.UrY
            r3.<init>(r0, r1)
            return r3
        L_0x00a4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x00a9:
            java.lang.String r2 = r11.A02
            X.0qQ.A06(r2)
            X.Ct6 r0 = r4.A02
            if (r0 == 0) goto L_0x00be
            com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl r0 = r0.A00
            com.instagram.model.mediasize.ImageInfo r1 = r0.A00
            java.lang.String r0 = r0.A01
            X.Ura r3 = new X.Ura
            r3.<init>(r1, r2, r0)
            return r3
        L_0x00be:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x00c3:
            java.lang.String r6 = r11.A02
            X.0qQ.A06(r6)
            X.CuK r2 = r4.A01
            if (r2 == 0) goto L_0x0140
            X.1Xj r5 = r2.A00
            X.1iA r0 = r5.BR7()
            int r1 = r0.ordinal()
            if (r1 == r7) goto L_0x013a
            if (r1 == r9) goto L_0x013a
            r0 = 4
            if (r1 == r0) goto L_0x00f7
            r0 = 3
            if (r1 == r0) goto L_0x00f5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            X.1iA r0 = r5.BR7()
            java.lang.String r0 = X.AnonymousClass7TF.A0i(r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x00f5:
            r3 = 0
            return r3
        L_0x00f7:
            java.lang.String r4 = r2.A01
            X.0qQ.A06(r4)
            boolean r0 = r5.A5F()
            r3 = -1
            if (r0 == 0) goto L_0x0127
            X.1Xy r0 = r5.A0C
            java.util.List r0 = r0.Alu()
            if (r0 == 0) goto L_0x0127
            r2 = 0
            java.util.Iterator r1 = r0.iterator()
        L_0x0110:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0127
            java.lang.Object r0 = r1.next()
            X.1Xj r0 = (X.1Xj) r0
            java.lang.String r0 = r0.A2n()
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 == 0) goto L_0x0137
            r3 = r2
        L_0x0127:
            int r0 = java.lang.Math.max(r7, r3)
            X.1Xj r0 = r5.A1c(r0)
            if (r0 == 0) goto L_0x013a
            X.UrZ r3 = new X.UrZ
            r3.<init>(r5, r0, r6)
            return r3
        L_0x0137:
            int r2 = r2 + 1
            goto L_0x0110
        L_0x013a:
            X.UrZ r3 = new X.UrZ
            r3.<init>(r5, r5, r6)
            return r3
        L_0x0140:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x0145:
            java.lang.String r1 = r11.A02
            X.0qQ.A06(r1)
            X.Cvi r0 = r4.A00
            if (r0 == 0) goto L_0x0153
            X.Urd r3 = A00(r0, r1)
            return r3
        L_0x0153:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x0158:
            java.lang.String r0 = "null"
            java.lang.String r0 = X.002.A0R(r3, r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45894D9x.A01(com.instagram.common.session.UserSession, X.Cv5):X.Vjd");
    }

    public static final ArrayList A02(UserSession userSession, List list) {
        0qQ.A0B(userSession, 0);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C18001Vjd A01 = A01(userSession, (C45363Cv5) it.next());
            if (A01 != null) {
                arrayList.add(A01);
            }
        }
        return arrayList;
    }

    public static final C16276Urd A00(C45402Cvi cvi, String str) {
        String str2 = cvi.A04;
        String str3 = cvi.A03;
        ProductArEffectMetadata productArEffectMetadata = cvi.A00;
        0qQ.A06(productArEffectMetadata);
        ProductImageContainerImpl productImageContainerImpl = cvi.A01;
        return new C16276Urd(productImageContainerImpl.A00, productArEffectMetadata, (Boolean) null, str, str2, str3, productImageContainerImpl.A01, cvi.A02);
    }
}
