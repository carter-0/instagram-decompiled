package X;

import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import com.instagram.model.shopping.clips.IGTVShoppingInfoIntf;
import java.util.List;

/* renamed from: X.3Xy  reason: invalid class name and case insensitive filesystem */
public abstract class C243233Xy {
    public static final int A00(1Xj r5) {
        0qQ.A0B(r5, 0);
        if (!r5.A5D()) {
            return -1;
        }
        if (r5.A4u()) {
            int A0o = r5.A0o();
            for (int i = 0; i < A0o; i++) {
                1Xj A1c = r5.A1c(i);
                if (A1c != null && A1c.A4u()) {
                    return i;
                }
            }
        }
        if (!C254423sS.A05(r5).isEmpty()) {
            return C254423sS.A00(r5, (String) null);
        }
        return 0;
    }

    public static final List A01(1Xj r2) {
        ClipsShoppingInfoIntf Btl;
        if (r2.A5Y()) {
            IGTVShoppingInfoIntf BFq = r2.A0C.BFq();
            if (BFq != null) {
                return C17024VEy.A00(BFq);
            }
            return null;
        } else if (!r2.A5G()) {
            return r2.A3B();
        } else {
            C67231sQ clipsMetadata = r2.A0C.getClipsMetadata();
            if (clipsMetadata == null || (Btl = clipsMetadata.Btl()) == null) {
                return null;
            }
            return C17023VEx.A00(Btl);
        }
    }

    public static final boolean A02(1Xj r3) {
        List A3A;
        ClipsShoppingInfoIntf Btl;
        if (r3.A5Y()) {
            IGTVShoppingInfoIntf BFq = r3.A0C.BFq();
            if (BFq == null) {
                return false;
            }
            A3A = C17024VEy.A00(BFq);
        } else if (r3.A5G()) {
            C67231sQ clipsMetadata = r3.A0C.getClipsMetadata();
            if (clipsMetadata == null || (Btl = clipsMetadata.Btl()) == null) {
                return false;
            }
            A3A = C17023VEx.A00(Btl);
        } else {
            A3A = r3.A3A();
        }
        if (A3A == null || !(!A3A.isEmpty())) {
            return false;
        }
        return true;
    }
}
