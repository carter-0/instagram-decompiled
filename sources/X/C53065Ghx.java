package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;

/* renamed from: X.Ghx  reason: case insensitive filesystem */
public final class C53065Ghx extends C320806sz {
    public final int A00;
    public final Object A01;

    public C53065Ghx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final int A00(int i) {
        C232232tF r0;
        switch (this.A00) {
            case 0:
                if (((2Ru) this.A01).getItem(i) instanceof 1Xj) {
                    return 1;
                }
                break;
            case 1:
                if (((C55620Hkf) this.A01).A01.get(i) instanceof IOL) {
                    return 1;
                }
                return 2;
            case 2:
                DirectShareSheetFragment directShareSheetFragment = (DirectShareSheetFragment) this.A01;
                int itemViewType = directShareSheetFragment.A0J.getItemViewType(i);
                if (itemViewType == 42) {
                    1Xj r2 = directShareSheetFragment.A0b;
                    if (r2 != null) {
                        UserSession userSession = directShareSheetFragment.A0G;
                        0qQ.A0B(userSession, 1);
                        int i2 = 1;
                        if (r2.A4U()) {
                            i2 = 2;
                        }
                        if (C48782Ek5.A00(userSession, r2)) {
                            return i2 + 1;
                        }
                        return i2;
                    }
                } else if (itemViewType == 37 || itemViewType == 35 || itemViewType == 22 || itemViewType == 14 || itemViewType == 2 || itemViewType == 6 || itemViewType == 10 || itemViewType == 11 || itemViewType == 12 || itemViewType == 3 || itemViewType == 27 || itemViewType == 40 || itemViewType == 41 || itemViewType == 44) {
                    return 1;
                }
                return directShareSheetFragment.A03;
            case 3:
                H1L h1l = (H1L) this.A01;
                AnonymousClass2t9 r02 = h1l.A01;
                if (r02 != null) {
                    r0 = r02.A03.A01(r02.getItemViewType(i));
                } else {
                    r0 = null;
                }
                if (!(r0 instanceof H7Q)) {
                    return h1l.A00;
                }
                return 1;
            case 4:
                return C320846t3.A00(C320516sV.A00((C320516sV) this.A01), i);
            default:
                H1H h1h = (H1H) this.A01;
                C53071Gi4 gi4 = h1h.A0B;
                String str = "clipsItemsAdapter";
                if (gi4 != null) {
                    if (i != gi4.getItemCount()) {
                        return 1;
                    }
                    C320516sV r03 = h1h.A0A;
                    if (r03 == null) {
                        str = "loadStateAdapter";
                    } else if (C320516sV.A00(r03).isEmpty()) {
                        return 1;
                    } else {
                        C53071Gi4 gi42 = h1h.A0B;
                        if (gi42 != null) {
                            if (gi42.getItemCount() > 0) {
                                return 3;
                            }
                            return 1;
                        }
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
        }
        return 3;
    }
}
