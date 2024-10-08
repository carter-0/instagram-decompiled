package X;

import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.3sS  reason: invalid class name and case insensitive filesystem */
public abstract class C254423sS {
    public static final Set A00 = 0sc.A07(new FeaturedProductPermissionStatus[]{FeaturedProductPermissionStatus.PENDING, FeaturedProductPermissionStatus.APPROVED, FeaturedProductPermissionStatus.DECLINED});

    public static final int A00(1Xj r11, String str) {
        FeaturedProductPermissionStatus featuredProductPermissionStatus;
        if (!r11.A5D()) {
            return 0;
        }
        int A0o = r11.A0o();
        int i = -1;
        for (int i2 = 0; i2 < A0o; i2++) {
            1Xj A1c = r11.A1c(i2);
            0qQ.A0A(A1c);
            List<C46292DTv> B4w = A1c.A0C.B4w();
            if (B4w != null && (!(B4w instanceof Collection) || !B4w.isEmpty())) {
                for (C46292DTv dTv : B4w) {
                    Set set = A00;
                    C74546Pwf Bbg = dTv.Bbg();
                    String str2 = null;
                    if (Bbg != null) {
                        featuredProductPermissionStatus = Bbg.BzM();
                    } else {
                        featuredProductPermissionStatus = null;
                    }
                    if (00k.A0u(set, featuredProductPermissionStatus)) {
                        ProductDetailsProductItemDictIntf Bfu = dTv.Bfu();
                        if (Bfu != null) {
                            str2 = Bfu.getProductId();
                        }
                        if (0qQ.A0K(str2, str)) {
                            return i2;
                        }
                    }
                }
            }
            List B4w2 = A1c.A0C.B4w();
            if (B4w2 != null && !B4w2.isEmpty() && i == -1) {
                i = i2;
            }
        }
        int i3 = i;
        if (i < 0) {
            return 0;
        }
        return i3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.1Xj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.1Xj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: X.1Xj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.1Xj} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.1Xj A02(X.1Xj r5, java.lang.String r6) {
        /*
            r0 = 1
            X.0qQ.A0B(r6, r0)
            boolean r0 = r5.A5D()
            r4 = 0
            if (r0 == 0) goto L_0x0063
            X.1Xy r0 = r5.A0C
            java.util.List r0 = r0.Alu()
            X.0qQ.A0A(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0018:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x005d
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.1Xj r0 = (X.1Xj) r0
            X.1Xy r0 = r0.A0C
            java.util.List r1 = r0.B4w()
            if (r1 == 0) goto L_0x0018
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0038
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0038
            goto L_0x0018
        L_0x0038:
            java.util.Iterator r1 = r1.iterator()
        L_0x003c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r1.next()
            X.DTv r0 = (X.C46292DTv) r0
            X.Pwf r0 = r0.Bbg()
            if (r0 == 0) goto L_0x0061
            java.lang.Long r0 = r0.BEY()
        L_0x0052:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 == 0) goto L_0x003c
            r4 = r2
        L_0x005d:
            r5 = r4
            X.1Xj r5 = (X.1Xj) r5
            return r5
        L_0x0061:
            r0 = r4
            goto L_0x0052
        L_0x0063:
            X.1Xy r0 = r5.A0C
            java.util.List r1 = r0.B4w()
            if (r1 == 0) goto L_0x0075
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0076
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0076
        L_0x0075:
            return r4
        L_0x0076:
            java.util.Iterator r1 = r1.iterator()
        L_0x007a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0075
            java.lang.Object r0 = r1.next()
            X.DTv r0 = (X.C46292DTv) r0
            X.Pwf r0 = r0.Bbg()
            if (r0 == 0) goto L_0x009b
            java.lang.Long r0 = r0.BEY()
        L_0x0090:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 == 0) goto L_0x007a
            return r5
        L_0x009b:
            r0 = r4
            goto L_0x0090
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C254423sS.A02(X.1Xj, java.lang.String):X.1Xj");
    }

    public static final C46292DTv A03(1Xj r2) {
        List B4w;
        0qQ.A0B(r2, 0);
        if (r2.A5D()) {
            1Xj A1c = r2.A1c(A00(r2, (String) null));
            0qQ.A0A(A1c);
            B4w = A1c.A0C.B4w();
            if (B4w == null) {
                return null;
            }
        } else {
            B4w = r2.A0C.B4w();
            if (B4w == null) {
                return null;
            }
        }
        return (C46292DTv) 00k.A0J(B4w);
    }

    public static final LinkedHashMap A07(1Xj r4) {
        0qQ.A0B(r4, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (r4.A5D()) {
            List<1Xj> Alu = r4.A0C.Alu();
            if (Alu != null) {
                for (1Xj r1 : Alu) {
                    List B4w = r1.A0C.B4w();
                    if (B4w != null) {
                        linkedHashMap.put(r1, B4w);
                    }
                }
            }
        } else {
            List B4w2 = r4.A0C.B4w();
            if (B4w2 != null) {
                linkedHashMap.put(r4, B4w2);
            }
        }
        return linkedHashMap;
    }

    public static final boolean A08(1Xj r8) {
        FeaturedProductPermissionStatus featuredProductPermissionStatus;
        FeaturedProductPermissionStatus featuredProductPermissionStatus2;
        if (r8.A5D()) {
            int A0o = r8.A0o();
            for (int i = 0; i < A0o; i++) {
                1Xj A1c = r8.A1c(i);
                0qQ.A0A(A1c);
                List<C46292DTv> B4w = A1c.A0C.B4w();
                if (B4w != null && (!(B4w instanceof Collection) || !B4w.isEmpty())) {
                    for (C46292DTv Bbg : B4w) {
                        C74546Pwf Bbg2 = Bbg.Bbg();
                        if (Bbg2 != null) {
                            featuredProductPermissionStatus2 = Bbg2.BzM();
                        } else {
                            featuredProductPermissionStatus2 = null;
                        }
                        if (featuredProductPermissionStatus2 == FeaturedProductPermissionStatus.APPROVED) {
                            return true;
                        }
                    }
                    continue;
                }
            }
            return false;
        }
        List<C46292DTv> B4w2 = r8.A0C.B4w();
        if (B4w2 == null) {
            return false;
        }
        if ((B4w2 instanceof Collection) && B4w2.isEmpty()) {
            return false;
        }
        for (C46292DTv Bbg3 : B4w2) {
            C74546Pwf Bbg4 = Bbg3.Bbg();
            if (Bbg4 != null) {
                featuredProductPermissionStatus = Bbg4.BzM();
            } else {
                featuredProductPermissionStatus = null;
            }
            if (featuredProductPermissionStatus == FeaturedProductPermissionStatus.APPROVED) {
                return true;
            }
        }
        return false;
    }

    public static final ArrayList A05(1Xj r3) {
        ArrayList arrayList = new ArrayList();
        if (r3.A5D()) {
            List<1Xj> Alu = r3.A0C.Alu();
            0qQ.A0A(Alu);
            for (1Xj r0 : Alu) {
                List B4w = r0.A0C.B4w();
                if (B4w != null) {
                    arrayList.addAll(B4w);
                }
            }
        } else {
            List B4w2 = r3.A0C.B4w();
            if (B4w2 != null) {
                arrayList.addAll(B4w2);
            }
        }
        return arrayList;
    }

    public static final ArrayList A06(1Xj r3) {
        ArrayList arrayList = new ArrayList();
        if (r3.A5D()) {
            List<1Xj> Alu = r3.A0C.Alu();
            0qQ.A0A(Alu);
            for (1Xj A3E : Alu) {
                ArrayList A3E2 = A3E.A3E();
                if (A3E2 != null) {
                    arrayList.addAll(A3E2);
                }
            }
        } else {
            ArrayList A3E3 = r3.A3E();
            if (A3E3 != null) {
                arrayList.addAll(A3E3);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.1Xj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.1Xj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: X.1Xj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.1Xj} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.1Xj A01(X.1Xj r5, com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r6) {
        /*
            boolean r0 = r5.A5D()
            r4 = 0
            if (r0 == 0) goto L_0x0055
            X.1Xy r0 = r5.A0C
            java.util.List r0 = r0.Alu()
            X.0qQ.A0A(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0014:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0051
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.1Xj r0 = (X.1Xj) r0
            X.1Xy r0 = r0.A0C
            java.util.List r1 = r0.B4w()
            if (r1 == 0) goto L_0x0014
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0034
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0034
            goto L_0x0014
        L_0x0034:
            java.util.Iterator r1 = r1.iterator()
        L_0x0038:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.DTv r0 = (X.C46292DTv) r0
            X.Pwf r0 = r0.Bbg()
            if (r0 == 0) goto L_0x0038
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r0 = r0.BzM()
            if (r0 != r6) goto L_0x0038
            r4 = r2
        L_0x0051:
            r5 = r4
            X.1Xj r5 = (X.1Xj) r5
            return r5
        L_0x0055:
            X.1Xy r0 = r5.A0C
            java.util.List r1 = r0.B4w()
            if (r1 == 0) goto L_0x0067
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0068
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0068
        L_0x0067:
            return r4
        L_0x0068:
            java.util.Iterator r1 = r1.iterator()
        L_0x006c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0067
            java.lang.Object r0 = r1.next()
            X.DTv r0 = (X.C46292DTv) r0
            X.Pwf r0 = r0.Bbg()
            if (r0 == 0) goto L_0x006c
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r0 = r0.BzM()
            if (r0 != r6) goto L_0x006c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C254423sS.A01(X.1Xj, com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus):X.1Xj");
    }

    public static final C46292DTv A04(1Xj r5, String str) {
        Object next;
        Long l;
        List B4w;
        Long l2;
        C46292DTv dTv = null;
        if (r5.A5D()) {
            int A0o = r5.A0o();
            int i = 0;
            while (i < A0o) {
                1Xj A1c = r5.A1c(i);
                if (A1c == null || (B4w = A1c.A0C.B4w()) == null || B4w.isEmpty()) {
                    i++;
                } else {
                    List B4w2 = A1c.A0C.B4w();
                    if (B4w2 != null) {
                        Iterator it = B4w2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            next = it.next();
                            C74546Pwf Bbg = ((C46292DTv) next).Bbg();
                            if (Bbg != null) {
                                l2 = Bbg.BEY();
                            } else {
                                l2 = null;
                            }
                            if (0qQ.A0K(String.valueOf(l2), str)) {
                                break;
                            }
                        }
                    } else {
                        return null;
                    }
                }
            }
            return null;
        }
        List B4w3 = r5.A0C.B4w();
        if (B4w3 == null) {
            return null;
        }
        Iterator it2 = B4w3.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
            C74546Pwf Bbg2 = ((C46292DTv) next).Bbg();
            if (Bbg2 != null) {
                l = Bbg2.BEY();
            } else {
                l = null;
            }
            if (0qQ.A0K(String.valueOf(l), str)) {
                break;
            }
        }
        return dTv;
        dTv = next;
        return dTv;
    }

    public static final boolean A09(1Xj r3) {
        List<1Xj> Alu;
        if (r3.A5D() && (Alu = r3.A0C.Alu()) != null && (!(Alu instanceof Collection) || !Alu.isEmpty())) {
            for (1Xj r0 : Alu) {
                List B4w = r0.A0C.B4w();
                if (B4w != null && 00k.A0J(B4w) != null) {
                    return true;
                }
            }
        }
        List B4w2 = r3.A0C.B4w();
        if (B4w2 == null || 00k.A0J(B4w2) == null) {
            return false;
        }
        return true;
    }
}
