package X;

import android.text.TextUtils;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.SNp  reason: case insensitive filesystem */
public abstract class C11335SNp {
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (android.text.TextUtils.isEmpty((java.lang.String) r9) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(int r8, java.lang.Object r9) {
        /*
            r0 = 10
            if (r8 <= r0) goto L_0x0007
            java.lang.String r0 = "ERROR: Recursive toString calls"
            return r0
        L_0x0007:
            java.lang.String r5 = ""
            if (r9 == 0) goto L_0x0018
            boolean r0 = r9 instanceof java.lang.String
            if (r0 == 0) goto L_0x0019
            r0 = r9
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00e2
        L_0x0018:
            return r5
        L_0x0019:
            boolean r0 = r9 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0024
            int r4 = X.AnonymousClass7TE.A0M(r9)
        L_0x0021:
            if (r4 != 0) goto L_0x00e2
            return r5
        L_0x0024:
            boolean r0 = r9 instanceof java.lang.Long
            if (r0 == 0) goto L_0x0031
            long r2 = X.AnonymousClass7TE.A0R(r9)
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            goto L_0x0021
        L_0x0031:
            boolean r0 = r9 instanceof java.lang.Double
            if (r0 == 0) goto L_0x003e
            double r2 = X.JTO.A00(r9)
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            goto L_0x0021
        L_0x003e:
            boolean r0 = r9 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x0047
            boolean r4 = X.AnonymousClass7TE.A1a(r9)
            goto L_0x0021
        L_0x0047:
            boolean r0 = r9 instanceof java.util.List
            java.lang.String r7 = ", "
            if (r0 == 0) goto L_0x007d
            java.lang.StringBuilder r6 = X.AnonymousClass7TE.A1A()
            if (r8 <= 0) goto L_0x0056
            X.Pxh.A1P(r6)
        L_0x0056:
            java.util.List r9 = (java.util.List) r9
            int r3 = r6.length()
            java.util.Iterator r2 = r9.iterator()
        L_0x0060:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00d6
            java.lang.Object r1 = r2.next()
            int r0 = r6.length()
            if (r0 <= r3) goto L_0x0073
            r6.append(r7)
        L_0x0073:
            int r0 = r8 + 1
            java.lang.String r0 = A00(r0, r1)
            r6.append(r0)
            goto L_0x0060
        L_0x007d:
            boolean r0 = r9 instanceof java.util.Map
            if (r0 == 0) goto L_0x00e2
            java.lang.StringBuilder r6 = X.AnonymousClass7TE.A1A()
            java.util.Map r9 = (java.util.Map) r9
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>(r9)
            java.util.Iterator r5 = X.AnonymousClass7TF.A0s(r0)
            r4 = 0
            r1 = 0
        L_0x0092:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00d0
            java.util.Map$Entry r3 = X.AnonymousClass7TE.A1J(r5)
            java.lang.Object r2 = r3.getValue()
            int r0 = r8 + 1
            java.lang.String r2 = A00(r0, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0092
            if (r8 <= 0) goto L_0x00bb
            if (r4 != 0) goto L_0x00bb
            java.lang.String r0 = "{"
            r6.append(r0)
            int r1 = r6.length()
            r4 = 1
        L_0x00bb:
            int r0 = r6.length()
            if (r0 <= r1) goto L_0x00c4
            r6.append(r7)
        L_0x00c4:
            X.Pxg.A1S(r6, r3)
            r0 = 61
            r6.append(r0)
            r6.append(r2)
            goto L_0x0092
        L_0x00d0:
            if (r4 == 0) goto L_0x00dd
            java.lang.String r0 = "}"
            goto L_0x00da
        L_0x00d6:
            if (r8 <= 0) goto L_0x00dd
            java.lang.String r0 = "]"
        L_0x00da:
            r6.append(r0)
        L_0x00dd:
            java.lang.String r0 = r6.toString()
            return r0
        L_0x00e2:
            java.lang.String r0 = r9.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11335SNp.A00(int, java.lang.Object):java.lang.String");
    }

    public final void A02(C11335SNp sNp) {
        Map map;
        Map map2;
        if (this instanceof C8336Qom) {
            C8336Qom qom = (C8336Qom) this;
            C8336Qom qom2 = (C8336Qom) sNp;
            if (!TextUtils.isEmpty(qom.A01)) {
                qom2.A01 = qom.A01;
            }
            if (!TextUtils.isEmpty(qom.A02)) {
                qom2.A02 = qom.A02;
            }
            if (!TextUtils.isEmpty(qom.A03)) {
                qom2.A03 = qom.A03;
            }
            if (!TextUtils.isEmpty(qom.A04)) {
                qom2.A04 = qom.A04;
            }
            boolean z = true;
            if (qom.A06) {
                qom2.A06 = true;
            }
            if (!TextUtils.isEmpty(qom.A05)) {
                qom2.A05 = qom.A05;
            }
            boolean z2 = qom.A07;
            if (z2) {
                qom2.A07 = z2;
            }
            double d = qom.A00;
            if (d != 0.0d) {
                if (d < 0.0d || d > 100.0d) {
                    z = false;
                }
                AnonymousClass3Qk.A08(z, "Sample rate must be between 0% and 100%");
                qom2.A00 = d;
            }
        } else if (this instanceof Qof) {
            Qof qof = (Qof) this;
            Qof qof2 = (Qof) sNp;
            if (!TextUtils.isEmpty(qof.A00)) {
                qof2.A00 = qof.A00;
            }
            boolean z3 = qof.A01;
            if (z3) {
                qof2.A01 = z3;
            }
        } else if (this instanceof Qoj) {
            Qoj qoj = (Qoj) this;
            Qoj qoj2 = (Qoj) sNp;
            if (!TextUtils.isEmpty(qoj.A01)) {
                qoj2.A01 = qoj.A01;
            }
            if (!TextUtils.isEmpty(qoj.A03)) {
                qoj2.A03 = qoj.A03;
            }
            if (!TextUtils.isEmpty(qoj.A02)) {
                qoj2.A02 = qoj.A02;
            }
            long j = qoj.A00;
            if (j != 0) {
                qoj2.A00 = j;
            }
        } else if (this instanceof Qoh) {
            Qoh qoh = (Qoh) this;
            Qoh qoh2 = (Qoh) sNp;
            qoh2.A01.addAll(qoh.A01);
            qoh2.A00.addAll(qoh.A00);
            Iterator A0u = AnonymousClass7TF.A0u(qoh.A02);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                A1J.getKey();
                Iterator A1H = C51966G9m.A1H(A1J.getValue());
                while (A1H.hasNext()) {
                    A1H.next();
                }
            }
        } else if (this instanceof C8334Qok) {
            C8334Qok qok = (C8334Qok) this;
            C8334Qok qok2 = (C8334Qok) sNp;
            int i = qok.A00;
            if (i != 0) {
                qok2.A00 = i;
            }
            int i2 = qok.A01;
            if (i2 != 0) {
                qok2.A01 = i2;
            }
            int i3 = qok.A02;
            if (i3 != 0) {
                qok2.A02 = i3;
            }
            int i4 = qok.A03;
            if (i4 != 0) {
                qok2.A03 = i4;
            }
            int i5 = qok.A04;
            if (i5 != 0) {
                qok2.A04 = i5;
            }
            if (!TextUtils.isEmpty(qok.A05)) {
                qok2.A05 = qok.A05;
            }
        } else {
            if (this instanceof Qoe) {
                Qoe qoe = (Qoe) sNp;
                AnonymousClass3Qk.A02(qoe);
                map = qoe.A00;
                map2 = ((Qoe) this).A00;
            } else if (this instanceof Qod) {
                map = ((Qod) sNp).A00;
                map2 = ((Qod) this).A00;
            } else if (this instanceof Qoc) {
                map = ((Qoc) sNp).A00;
                map2 = ((Qoc) this).A00;
            } else if (this instanceof C8337Qon) {
                C8337Qon qon = (C8337Qon) this;
                C8337Qon qon2 = (C8337Qon) sNp;
                if (!TextUtils.isEmpty(qon.A00)) {
                    qon2.A00 = qon.A00;
                }
                if (!TextUtils.isEmpty(qon.A02)) {
                    qon2.A02 = qon.A02;
                }
                if (!TextUtils.isEmpty(qon.A03)) {
                    qon2.A03 = qon.A03;
                }
                if (!TextUtils.isEmpty(qon.A04)) {
                    qon2.A04 = qon.A04;
                }
                if (!TextUtils.isEmpty(qon.A05)) {
                    qon2.A05 = qon.A05;
                }
                if (!TextUtils.isEmpty(qon.A01)) {
                    qon2.A01 = qon.A01;
                }
                if (!TextUtils.isEmpty(qon.A06)) {
                    qon2.A06 = qon.A06;
                }
                if (!TextUtils.isEmpty(qon.A07)) {
                    qon2.A07 = qon.A07;
                }
                if (!TextUtils.isEmpty(qon.A08)) {
                    qon2.A08 = qon.A08;
                }
                if (!TextUtils.isEmpty(qon.A09)) {
                    qon2.A09 = qon.A09;
                    return;
                }
                return;
            } else if (this instanceof C8338Qoo) {
                ((C8338Qoo) this).A03((C8338Qoo) sNp);
                return;
            } else if (this instanceof Qoi) {
                Qoi qoi = (Qoi) this;
                Qoi qoi2 = (Qoi) sNp;
                if (!TextUtils.isEmpty(qoi.A02)) {
                    qoi2.A02 = qoi.A02;
                }
                long j2 = qoi.A00;
                if (j2 != 0) {
                    qoi2.A00 = j2;
                }
                if (!TextUtils.isEmpty(qoi.A01)) {
                    qoi2.A01 = qoi.A01;
                }
                if (!TextUtils.isEmpty(qoi.A03)) {
                    qoi2.A03 = qoi.A03;
                    return;
                }
                return;
            } else if (this instanceof Qog) {
                Qog qog = (Qog) this;
                Qog qog2 = (Qog) sNp;
                if (!TextUtils.isEmpty(qog.A00)) {
                    qog2.A00 = qog.A00;
                }
                if (!TextUtils.isEmpty(qog.A01)) {
                    qog2.A01 = qog.A01;
                }
                if (!TextUtils.isEmpty(qog.A02)) {
                    qog2.A02 = qog.A02;
                    return;
                }
                return;
            } else {
                C8335Qol qol = (C8335Qol) this;
                C8335Qol qol2 = (C8335Qol) sNp;
                if (!TextUtils.isEmpty(qol.A02)) {
                    qol2.A02 = qol.A02;
                }
                int i6 = qol.A00;
                if (i6 != 0) {
                    qol2.A00 = i6;
                }
                int i7 = qol.A01;
                if (i7 != 0) {
                    qol2.A01 = i7;
                }
                if (!TextUtils.isEmpty(qol.A03)) {
                    qol2.A03 = qol.A03;
                }
                if (!TextUtils.isEmpty(qol.A04)) {
                    String str = qol.A04;
                    if (TextUtils.isEmpty(str)) {
                        str = null;
                    }
                    qol2.A04 = str;
                }
                boolean z4 = qol.A05;
                if (z4) {
                    qol2.A05 = z4;
                }
                boolean z5 = qol.A06;
                if (z5) {
                    qol2.A06 = z5;
                    return;
                }
                return;
            }
            map.putAll(map2);
        }
    }

    public static String A01(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return A00(0, abstractMap);
    }
}
