package X;

import com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf;
import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import com.instagram.model.shopping.clips.IGTVShoppingInfoIntf;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.TpC  reason: case insensitive filesystem */
public abstract class C14064TpC {
    public static final ClipsShoppingCTABarIntf A00(1Xj r2) {
        IGTVShoppingInfoIntf BFq;
        ClipsShoppingInfoIntf Btl;
        ClipsShoppingInfoIntf Btl2;
        C67231sQ clipsMetadata = r2.A0C.getClipsMetadata();
        if (clipsMetadata == null || (Btl = clipsMetadata.Btl()) == null || Btl.AoB() == null) {
            IGTVShoppingInfoIntf BFq2 = r2.A0C.BFq();
            if (BFq2 == null || BFq2.AoB() == null || (BFq = r2.A0C.BFq()) == null) {
                return null;
            }
            return BFq.AoB();
        }
        C67231sQ clipsMetadata2 = r2.A0C.getClipsMetadata();
        if (clipsMetadata2 == null || (Btl2 = clipsMetadata2.Btl()) == null) {
            return null;
        }
        return Btl2.AoB();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        if (r2 == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        return X.AnonymousClass05K.A0Y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (r2 != false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        return X.AnonymousClass05K.A0j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Integer A01(java.lang.String r1, boolean r2) {
        /*
            if (r1 == 0) goto L_0x0009
            int r0 = r1.hashCode()
            switch(r0) {
                case -1741312354: goto L_0x0047;
                case -1021656062: goto L_0x003a;
                case -892664913: goto L_0x002d;
                case -590846444: goto L_0x0022;
                case 110844: goto L_0x0017;
                case 928336360: goto L_0x000c;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            return r0
        L_0x000c:
            java.lang.String r0 = "storefront"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            return r0
        L_0x0017:
            java.lang.String r0 = "pdp"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            return r0
        L_0x0022:
            java.lang.String r0 = "bottomsheet"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            return r0
        L_0x002d:
            java.lang.String r0 = "set_reminder"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            if (r2 != 0) goto L_0x0044
        L_0x0037:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            return r0
        L_0x003a:
            java.lang.String r0 = "view_upcoming_events"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            if (r2 == 0) goto L_0x0037
        L_0x0044:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            return r0
        L_0x0047:
            java.lang.String r0 = "collection"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14064TpC.A01(java.lang.String, boolean):java.lang.Integer");
    }

    public static final ArrayList A02(1Xj r1) {
        ArrayList arrayList;
        List list;
        ClipsShoppingInfoIntf Btl;
        IGTVShoppingInfoIntf BFq = r1.A0C.BFq();
        if (BFq != null) {
            arrayList = C17024VEy.A00(BFq);
        } else {
            arrayList = 0sn.A00;
        }
        C67231sQ clipsMetadata = r1.A0C.getClipsMetadata();
        if (clipsMetadata == null || (Btl = clipsMetadata.Btl()) == null) {
            list = 0sn.A00;
        } else {
            list = C17023VEx.A00(Btl);
        }
        return 00k.A0S(list, arrayList);
    }
}
