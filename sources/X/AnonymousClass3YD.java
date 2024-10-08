package X;

import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import com.instagram.user.model.ProductCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3YD  reason: invalid class name */
public final class AnonymousClass3YD {
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        if (r0 != null) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A03(X.1Xj r5) {
        /*
            r4 = this;
            r0 = 0
            X.0qQ.A0B(r5, r0)
            com.instagram.user.model.ProductCollection r0 = A00(r5)
            if (r0 != 0) goto L_0x005d
            X.1Xy r0 = r5.A0C
            X.DUl r0 = r0.Bg2()
            r3 = 0
            if (r0 == 0) goto L_0x0020
            com.instagram.user.model.ProductCollection r0 = r0.Aoo()
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = r0.Aoi()
            if (r0 == 0) goto L_0x0020
            return r0
        L_0x0020:
            java.util.List r0 = A01(r5)
            if (r0 == 0) goto L_0x0064
            java.util.Iterator r2 = r0.iterator()
        L_0x002a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.1Xj r0 = (X.1Xj) r0
            X.1Xy r0 = r0.A0C
            X.DUl r0 = r0.Bg2()
            if (r0 == 0) goto L_0x002a
            com.instagram.user.model.ProductCollection r0 = r0.Aoo()
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = r0.Aoi()
            if (r0 == 0) goto L_0x002a
        L_0x004b:
            X.1Xj r1 = (X.1Xj) r1
            if (r1 == 0) goto L_0x0064
            X.1Xy r0 = r1.A0C
            X.DUl r0 = r0.Bg2()
            if (r0 == 0) goto L_0x0064
            com.instagram.user.model.ProductCollection r0 = r0.Aoo()
            if (r0 == 0) goto L_0x0064
        L_0x005d:
            java.lang.String r3 = r0.Aoi()
            return r3
        L_0x0062:
            r1 = r3
            goto L_0x004b
        L_0x0064:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3YD.A03(X.1Xj):java.lang.String");
    }

    public final String A05(1Xj r5) {
        Object obj;
        C46308DUl Bg2;
        DTJ Axv;
        DTJ Axv2;
        DTJ Axv3;
        String Axs;
        0qQ.A0B(r5, 0);
        C46308DUl Bg22 = r5.A0C.Bg2();
        if (Bg22 != null && (Axv3 = Bg22.Axv()) != null && (Axs = Axv3.Axs()) != null) {
            return Axs;
        }
        List A01 = A01(r5);
        if (A01 != null) {
            Iterator it = A01.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C46308DUl Bg23 = ((1Xj) obj).A0C.Bg2();
                if (Bg23 != null && (Axv2 = Bg23.Axv()) != null && Axv2.Axs() != null) {
                    break;
                }
            }
            1Xj r1 = (1Xj) obj;
            if (!(r1 == null || (Bg2 = r1.A0C.Bg2()) == null || (Axv = Bg2.Axv()) == null)) {
                return Axv.Axs();
            }
        }
        return null;
    }

    public final String A06(1Xj r5) {
        Object obj;
        C46308DUl Bg2;
        String BDU;
        0qQ.A0B(r5, 0);
        C46308DUl Bg22 = r5.A0C.Bg2();
        if (Bg22 != null && (BDU = Bg22.BDU()) != null) {
            return BDU;
        }
        List A01 = A01(r5);
        if (A01 != null) {
            Iterator it = A01.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C46308DUl Bg23 = ((1Xj) obj).A0C.Bg2();
                if (Bg23 != null && Bg23.BDU() != null) {
                    break;
                }
            }
            1Xj r1 = (1Xj) obj;
            if (!(r1 == null || (Bg2 = r1.A0C.Bg2()) == null)) {
                return Bg2.BDU();
            }
        }
        return null;
    }

    public final boolean A08(1Xj r4) {
        0qQ.A0B(r4, 0);
        C46308DUl Bg2 = r4.A0C.Bg2();
        ProductCollection productCollection = null;
        if (Bg2 != null) {
            productCollection = Bg2.Aoo();
        }
        if (productCollection != null) {
            return true;
        }
        List<1Xj> A01 = A01(r4);
        if (A01 != null && (!(A01 instanceof Collection) || !A01.isEmpty())) {
            for (1Xj r0 : A01) {
                C46308DUl Bg22 = r0.A0C.Bg2();
                if (Bg22 != null && Bg22.Aoo() != null) {
                    return true;
                }
            }
        }
        if (A00(r4) == null) {
            return false;
        }
        return true;
    }

    public final boolean A09(1Xj r4) {
        0qQ.A0B(r4, 0);
        if (r4.A0C.Bg2() != null) {
            return true;
        }
        List<1Xj> A01 = A01(r4);
        if (A01 != null && (!(A01 instanceof Collection) || !A01.isEmpty())) {
            for (1Xj r0 : A01) {
                if (r0.A0C.Bg2() != null) {
                    return true;
                }
            }
        }
        if (A00(r4) == null) {
            return false;
        }
        return true;
    }

    public final String A04(1Xj r5) {
        Object obj;
        C46308DUl Bg2;
        DTJ Axv;
        DTJ Axv2;
        DTJ Axv3;
        String title;
        C46308DUl Bg22 = r5.A0C.Bg2();
        if (Bg22 != null && (Axv3 = Bg22.Axv()) != null && (title = Axv3.getTitle()) != null) {
            return title;
        }
        List A01 = A01(r5);
        if (A01 != null) {
            Iterator it = A01.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C46308DUl Bg23 = ((1Xj) obj).A0C.Bg2();
                if (Bg23 != null && (Axv2 = Bg23.Axv()) != null && Axv2.getTitle() != null) {
                    break;
                }
            }
            1Xj r1 = (1Xj) obj;
            if (!(r1 == null || (Bg2 = r1.A0C.Bg2()) == null || (Axv = Bg2.Axv()) == null)) {
                return Axv.getTitle();
            }
        }
        return null;
    }

    public final boolean A0A(1Xj r4) {
        C46308DUl Bg2 = r4.A0C.Bg2();
        DTJ dtj = null;
        if (Bg2 != null) {
            dtj = Bg2.Axv();
        }
        if (dtj != null) {
            return true;
        }
        List<1Xj> A01 = A01(r4);
        if (A01 != null && (!(A01 instanceof Collection) || !A01.isEmpty())) {
            for (1Xj r0 : A01) {
                C46308DUl Bg22 = r0.A0C.Bg2();
                if (Bg22 != null && Bg22.Axv() != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final ProductCollection A00(1Xj r2) {
        C67231sQ clipsMetadata;
        ClipsShoppingInfoIntf Btl;
        if (!r2.A5G() || (clipsMetadata = r2.A0C.getClipsMetadata()) == null || (Btl = clipsMetadata.Btl()) == null) {
            return null;
        }
        return Btl.Aoo();
    }

    public static final List A01(1Xj r1) {
        if (r1.A5D()) {
            return r1.A0C.Alu();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass57K A02(X.1Xj r6) {
        /*
            r5 = this;
            com.instagram.user.model.ProductCollection r0 = A00(r6)
            r4 = 0
            if (r0 == 0) goto L_0x0014
            com.instagram.api.schemas.ProductCollectionV2Type r0 = r0.Aou()
            if (r0 == 0) goto L_0x000f
            java.lang.String r4 = r0.A00
        L_0x000f:
            X.57K r0 = X.C17025VEz.A00(r4)
            return r0
        L_0x0014:
            X.1Xy r0 = r6.A0C
            X.DUl r0 = r0.Bg2()
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r0.Aov()
            if (r0 == 0) goto L_0x0027
        L_0x0022:
            X.57K r0 = X.C17025VEz.A00(r0)
            return r0
        L_0x0027:
            java.util.List r0 = A01(r6)
            if (r0 == 0) goto L_0x005b
            java.util.Iterator r3 = r0.iterator()
        L_0x0031:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0059
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.1Xj r1 = (X.1Xj) r1
            X.3YD r0 = X.AnonymousClass3YC.A00
            boolean r0 = r0.A09(r1)
            if (r0 == 0) goto L_0x0031
        L_0x0046:
            X.1Xj r2 = (X.1Xj) r2
            if (r2 == 0) goto L_0x005b
            X.1Xy r0 = r2.A0C
            X.DUl r0 = r0.Bg2()
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = r0.Aov()
            if (r0 == 0) goto L_0x005b
            goto L_0x0022
        L_0x0059:
            r2 = r4
            goto L_0x0046
        L_0x005b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3YD.A02(X.1Xj):X.57K");
    }

    public final String A07(1Xj r5) {
        Object obj;
        List BRs;
        String str;
        ProductCollection A00 = A00(r5);
        if (A00 != null) {
            return A00.BRr();
        }
        List BRs2 = r5.BRs();
        if (BRs2 != null && (str = (String) 00k.A0J(BRs2)) != null) {
            return str;
        }
        List A01 = A01(r5);
        if (A01 == null) {
            return null;
        }
        Iterator it = A01.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            List BRs3 = ((1Xj) obj).BRs();
            if (BRs3 != null && !BRs3.isEmpty()) {
                break;
            }
        }
        1Xj r2 = (1Xj) obj;
        if (r2 == null || (BRs = r2.BRs()) == null) {
            return null;
        }
        return (String) 00k.A0J(BRs);
    }
}
