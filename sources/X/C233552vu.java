package X;

import com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2vu  reason: invalid class name and case insensitive filesystem */
public final class C233552vu {
    public final AnonymousClass2rI A00;

    public static final int A00(C228812mN r1, C233402vf r2, int i) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(r1, 2);
        while (i >= 0) {
            Object BTe = r2.BTe(i);
            if (BTe != null && r1.CYA(BTe)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public final int A03(UserSession userSession, C228812mN r8, C233402vf r9, int i) {
        1Xj A02;
        0qQ.A0B(r9, 1);
        0qQ.A0B(r8, 2);
        while (i >= 0) {
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36315005050293181L)) {
                1Xg A04 = this.A00.A04(i);
                if (A04 != null && r8.CVy(A04)) {
                    if (r9.BTe(i) == null && 182.A06(r2, userSession, 36315005050227644L) && (A02 = 1Xi.A02(A04.A05)) != null) {
                        0wj r3 = 0wj.A01;
                        StringBuilder sb = new StringBuilder();
                        sb.append("ItemModelFromContentInjector is null while itemFromFeedAdapter not null. Item type: ");
                        sb.append(A04.A06);
                        sb.append(", item ad id: ");
                        sb.append(C231122qu.A07(userSession, A02));
                        sb.append(", ad position: ");
                        sb.append(i);
                        r3.AEf(sb.toString(), 817896304).report();
                    }
                    return i;
                }
            } else {
                Object BTe = r9.BTe(i);
                if (BTe != null && r8.CcL(BTe)) {
                    return i;
                }
            }
            i--;
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4EB A05(X.C233402vf r6, int r7) {
        /*
            r5 = this;
            r0 = 1
            X.0qQ.A0B(r6, r0)
            X.2rI r0 = r5.A00
            java.util.List r2 = r0.A07()
            int r1 = r2.size()
            r0 = 0
            if (r1 <= r7) goto L_0x0039
            int r1 = r7 + 1
            java.util.ListIterator r4 = r2.listIterator(r1)
        L_0x0017:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0039
            int r3 = r4.nextIndex()
            java.lang.Object r2 = r4.next()
            X.1Xg r2 = (X.1Xg) r2
            boolean r1 = X.AnonymousClass3VP.A00(r2)
            if (r1 != 0) goto L_0x0033
            boolean r1 = X.AnonymousClass3VP.A03(r2)
            if (r1 == 0) goto L_0x0017
        L_0x0033:
            java.lang.Object r0 = r6.BTe(r3)
            X.4EB r0 = (X.AnonymousClass4EB) r0
        L_0x0039:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233552vu.A05(X.2vf, int):X.4EB");
    }

    public final void A06(UserSession userSession, C233402vf r8, 1PW r9, int i, int i2, int i3) {
        List list;
        List list2;
        List list3;
        BrandSafetyContentBlocklistBitmapQLObj AiG;
        BrandSafetyContentBlocklistBitmapQLObj AiG2;
        0qQ.A0B(r8, 3);
        r9.A0C = AnonymousClass05K.A0Y;
        AnonymousClass4EB A05 = A05(r8, i3);
        if (A05 != null) {
            int A02 = A02(userSession, A05);
            if (A02 != -1) {
                r9.A07 = A02;
            }
            1Xj A022 = 1Xi.A02(A05.A01.A05);
            if (A022 != null) {
                AnonymousClass2rI r4 = this.A00;
                AnonymousClass3W1 BQr = r4.A0S.BQr(A022);
                BQr.A0F = i2 - i;
                if (182.A06(0Tu.A05, userSession, 2342158624148819378L)) {
                    List A07 = r4.A07();
                    int i4 = i2 - 1;
                    String str = ((1Xg) A07.get(i4)).A09;
                    String str2 = ((1Xg) A07.get(i2)).A09;
                    BQr.A1S = str;
                    BQr.A1O = str2;
                    Integer A023 = ((1Xg) A07.get(i4)).A02();
                    Integer A024 = ((1Xg) A07.get(i2)).A02();
                    BQr.A18 = A023;
                    BQr.A17 = A024;
                    1Xj A025 = 1Xi.A02(((1Xg) A07.get(i4)).A05);
                    List list4 = null;
                    if (A025 != null) {
                        list = A025.A0e;
                    } else {
                        list = null;
                    }
                    String A002 = C243413Yr.A00(list);
                    1Xj A026 = 1Xi.A02(((1Xg) A07.get(i2)).A05);
                    if (A026 != null) {
                        list2 = A026.A0e;
                    } else {
                        list2 = null;
                    }
                    String A003 = C243413Yr.A00(list2);
                    BQr.A1R = A002;
                    BQr.A1N = A003;
                    BQr.A0a(((1Xg) A07.get(i4)).A08, ((1Xg) A07.get(i2)).A08);
                    1Xj A027 = 1Xi.A02(((1Xg) A07.get(i4)).A05);
                    if (A027 == null || (AiG2 = A027.A0C.AiG()) == null) {
                        list3 = null;
                    } else {
                        list3 = AiG2.Afw();
                    }
                    1Xj A028 = 1Xi.A02(((1Xg) A07.get(i2)).A05);
                    if (!(A028 == null || (AiG = A028.A0C.AiG()) == null)) {
                        list4 = AiG.Afw();
                    }
                    if (list3 != null) {
                        BQr.A1i = list3;
                    }
                    if (list4 != null) {
                        BQr.A1h = list4;
                    }
                }
            }
        }
    }

    public static final int A01(Integer num, int i, int i2, int i3, int i4) {
        if (num == null) {
            return i3;
        }
        int i5 = new int[]{i, i2}[0];
        if (i2 > i5) {
            i5 = i2;
        }
        int i6 = new int[]{i5 + num.intValue() + 1, i3}[0];
        if (i3 < i6) {
            i6 = i3;
        }
        return i6 + i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (X.182.A06(X.0Tu.A06, r7, 36312879040824667L) != false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02(com.instagram.common.session.UserSession r7, X.AnonymousClass4EB r8) {
        /*
            r6 = this;
            X.2rI r4 = r6.A00
            X.1Xg r5 = r8.A01
            boolean r0 = X.AnonymousClass3VP.A03(r5)
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = r5.A09
        L_0x000e:
            if (r0 == 0) goto L_0x0011
            r3 = r0
        L_0x0011:
            int r0 = r4.BJU(r3)
            return r0
        L_0x0016:
            boolean r0 = X.AnonymousClass3VP.A00(r5)
            if (r0 == 0) goto L_0x0011
            X.1Av r0 = X.1Au.A00(r7)
            boolean r0 = X.C228342lQ.A08(r7, r0)
            if (r0 != 0) goto L_0x0034
            X.0Tu r2 = X.0Tu.A06
            r0 = 36312879040824667(0x81025f0000055b, double:3.027749153420409E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            X.1Xn r0 = r5.A05
            X.1Xj r0 = X.1Xi.A02(r0)
            if (r1 == 0) goto L_0x0044
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = r0.A2R()
            goto L_0x000e
        L_0x0044:
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = r0.getId()
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233552vu.A02(com.instagram.common.session.UserSession, X.4EB):int");
    }

    public final GTT A04(AnonymousClass4EB r6, Integer num, int i, int i2, int i3, int i4) {
        this.A00.A07();
        int i5 = 0;
        for (int A01 = A01(num, i, i2, i3, 0); A01 < i3; A01++) {
            if (A01(num, i, i2, i3, i5) > i4) {
                r6.A01.A03 = true;
                return new GTT(i5, A01, 2, true);
            }
            i5++;
        }
        return new GTT(i5, i3, 2, false);
    }

    public final boolean A07(int i) {
        Iterator it = this.A00.A08().iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((1Xg) it.next()).A06 != 1UQ.A0F) {
                i2++;
            } else if (i2 < 0 || i2 >= i) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public C233552vu(AnonymousClass2rI r1) {
        this.A00 = r1;
    }
}
