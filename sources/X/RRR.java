package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class RRR {
    public final long A01() {
        C10769Rxn rxn;
        if (this instanceof QYI) {
            C10724Rx2 A00 = QYI.A00((QYI) this);
            if (A00 == null || (rxn = (C10769Rxn) 00k.A0J(A00.A00.A00)) == null) {
                return 0;
            }
            return rxn.A02;
        } else if (this instanceof QYH) {
            return ((QYH) this).A00.A00.optLong("price_amount_micros");
        } else {
            C10768Rxm A002 = ((QYG) this).A00.A00();
            if (A002 != null) {
                return A002.A00;
            }
            return 0;
        }
    }

    public final String A02() {
        if (this instanceof QYI) {
            return ((QYI) this).A02;
        }
        if (this instanceof QYH) {
            return ((QYH) this).A01;
        }
        return ((QYG) this).A01;
    }

    public final String A03() {
        String str;
        C10769Rxn rxn;
        if (this instanceof QYI) {
            C10724Rx2 A00 = QYI.A00((QYI) this);
            if (!(A00 == null || (rxn = (C10769Rxn) 00k.A0J(A00.A00.A00)) == null)) {
                str = rxn.A03;
            }
            return "";
        } else if (this instanceof QYH) {
            String optString = ((QYH) this).A00.A00.optString("price");
            0qQ.A07(optString);
            return optString;
        } else {
            C10768Rxm A002 = ((QYG) this).A00.A00();
            if (A002 != null) {
                str = A002.A01;
            }
            return "";
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String A04() {
        String str;
        C10769Rxn rxn;
        if (this instanceof QYI) {
            C10724Rx2 A00 = QYI.A00((QYI) this);
            if (!(A00 == null || (rxn = (C10769Rxn) 00k.A0J(A00.A00.A00)) == null)) {
                str = rxn.A04;
            }
            return "";
        } else if (this instanceof QYH) {
            String optString = ((QYH) this).A00.A00.optString("price_currency_code");
            0qQ.A07(optString);
            return optString;
        } else {
            C10768Rxm A002 = ((QYG) this).A00.A00();
            if (A002 != null) {
                str = A002.A02;
            }
            return "";
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String A05() {
        S74 s74;
        String optString;
        if (this instanceof QYI) {
            s74 = ((QYI) this).A01;
        } else if (this instanceof QYH) {
            optString = ((QYH) this).A00.A00.optString("productId");
            0qQ.A07(optString);
            return optString;
        } else {
            s74 = ((QYG) this).A00;
        }
        optString = s74.A00;
        0qQ.A07(optString);
        return optString;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r6.length() == 0) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A06(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.QYI
            if (r0 == 0) goto L_0x0056
            r4 = r5
            X.QYI r4 = (X.QYI) r4
            if (r6 == 0) goto L_0x0010
            int r1 = r6.length()
            r0 = 0
            if (r1 != 0) goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            r3 = 0
            if (r0 == 0) goto L_0x001d
            X.Rx2 r0 = X.QYI.A00(r4)
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            java.lang.String r3 = r0.A02
        L_0x001c:
            return r3
        L_0x001d:
            X.S74 r0 = r4.A01
            java.util.List r0 = r0.A04
            if (r0 == 0) goto L_0x004f
            java.util.Iterator r2 = r0.iterator()
        L_0x0027:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004d
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.Rx2 r0 = (X.C10724Rx2) r0
            java.lang.String r0 = r0.A01
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 == 0) goto L_0x0027
        L_0x003c:
            X.Rx2 r1 = (X.C10724Rx2) r1
            if (r1 == 0) goto L_0x004f
            java.lang.String r1 = r1.A02
            if (r1 == 0) goto L_0x004f
            int r0 = r1.length()
            if (r0 == 0) goto L_0x004f
            r4.A00 = r6
            return r1
        L_0x004d:
            r1 = r3
            goto L_0x003c
        L_0x004f:
            X.Rx2 r0 = X.QYI.A00(r4)
            if (r0 == 0) goto L_0x001c
            goto L_0x001a
        L_0x0056:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RRR.A06(java.lang.String):java.lang.String");
    }

    public final List A07() {
        List list;
        N4G n4g;
        String str;
        if (!(this instanceof QYI) || (list = ((QYI) this).A01.A04) == null) {
            return null;
        }
        ArrayList<C10724Rx2> A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (((C10724Rx2) next).A01 != null) {
                A1C.add(next);
            }
        }
        ArrayList<C10769Rxn> A1C2 = AnonymousClass7TE.A1C();
        for (C10724Rx2 rx2 : A1C) {
            List list2 = rx2.A00.A00;
            0qQ.A07(list2);
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                if (((C10769Rxn) next2).A01 != 1) {
                    if (next2 != null) {
                        A1C2.add(next2);
                    }
                }
            }
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A1C2);
        for (C10769Rxn rxn : A1C2) {
            String str2 = rxn.A05;
            int A06 = C66580MXl.A06(str2);
            if (A06 >= 3 && str2.charAt(0) == 'P') {
                String A02 = 00R.A02(str2, 1);
                int length = A02.length() - 1;
                if (length < 0) {
                    length = 0;
                }
                Integer A0l = 00y.A0l(00R.A03(A02, length));
                String A0z = C66580MXl.A0z(str2, A06 - 1);
                int hashCode = A0z.hashCode();
                if (hashCode == 68) {
                    if (A0z.equals("D")) {
                        str = "Day";
                    }
                    str = "";
                } else if (hashCode == 77) {
                    if (A0z.equals("M")) {
                        str = "Month";
                    }
                    str = "";
                } else if (hashCode != 87) {
                    if (hashCode == 89 && A0z.equals("Y")) {
                        str = "Year";
                    }
                    str = "";
                } else {
                    if (A0z.equals("W")) {
                        str = "Week";
                    }
                    str = "";
                }
                if (!(A0l == null || str.length() == 0)) {
                    n4g = new N4G(str, A0l.intValue(), 0);
                    String str3 = n4g.A01;
                    int i = n4g.A00;
                    int i2 = rxn.A00;
                    long j = rxn.A02;
                    String str4 = rxn.A03;
                    0qQ.A07(str4);
                    A0r.add(new QOw(str3, str4, i, i2, j));
                }
            }
            n4g = new N4G("", 0, 0);
            String str32 = n4g.A01;
            int i3 = n4g.A00;
            int i22 = rxn.A00;
            long j2 = rxn.A02;
            String str42 = rxn.A03;
            0qQ.A07(str42);
            A0r.add(new QOw(str32, str42, i3, i22, j2));
        }
        return A0r;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (this instanceof QYH) {
            str = "DcpSkuDetails";
        } else if (this instanceof QYG) {
            str = "DcpInAppProductDetails";
        } else if (this instanceof QYI) {
            str = "DcpSubsProductDetails";
        } else {
            str = "Unknown";
        }
        A1A.append(str);
        A1A.append("(originalCatalogId='");
        A1A.append(A02());
        A1A.append("', skuId='");
        A1A.append(A05());
        A1A.append("', price='");
        A1A.append(A03());
        A1A.append("', priceAmountMicros=");
        A1A.append(A01());
        A1A.append(", priceCurrencyCode='");
        A1A.append(A04());
        A1A.append("', subscriptionOffers=");
        A1A.append(A07());
        A1A.append(", claimedOfferId=");
        if (this instanceof QYI) {
            str2 = ((QYI) this).A00;
        } else {
            str2 = null;
        }
        return C51975G9x.A0i(str2, A1A);
    }
}
