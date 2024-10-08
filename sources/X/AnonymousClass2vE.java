package X;

import com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2vE  reason: invalid class name */
public final class AnonymousClass2vE extends C233202vF {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final AnonymousClass2rI A02;
    public final C230282pK A03;
    public final C228812mN A04;
    public final C233182vC A05;
    public final C233172vA A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2vE(com.instagram.common.session.UserSession r12, X.C233172vA r13, X.AnonymousClass4DU r14, X.AnonymousClass2rI r15, X.C230282pK r16, X.C228812mN r17, X.C233182vC r18, java.lang.String r19) {
        /*
            r11 = this;
            r0 = 3
            r9 = r19
            X.0qQ.A0B(r9, r0)
            r7 = 0
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r8 = r18
            r10 = r7
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r11.A00 = r12
            r11.A01 = r14
            r11.A06 = r13
            r11.A05 = r8
            r11.A02 = r15
            r0 = r16
            r11.A03 = r0
            r0 = r17
            r11.A04 = r0
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342158624148819378(0x208104dc00020db2, double:4.061867717198358E-152)
            boolean r0 = X.182.A06(r2, r12, r0)
            r11.A09 = r0
            r0 = 36315614935256500(0x8104dc00040db4, double:3.029479344075663E-306)
            boolean r0 = X.182.A06(r2, r12, r0)
            r11.A08 = r0
            r0 = 36315614935190963(0x8104dc00030db3, double:3.029479344034217E-306)
            boolean r0 = X.182.A06(r2, r12, r0)
            r11.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2vE.<init>(com.instagram.common.session.UserSession, X.2vA, X.4DU, X.2rI, X.2pK, X.2mN, X.2vC, java.lang.String):void");
    }

    public static final void A08(AnonymousClass2vE r11, C251373n0 r12, 1PW r13) {
        int i;
        String str;
        1Xj A022;
        C251373n0 r8 = r12;
        AnonymousClass4EB r2 = (AnonymousClass4EB) r12.BTb();
        C233462vl r10 = r2.A03;
        1PW r9 = r13;
        Integer num = r13.A0B;
        AnonymousClass2vE r6 = r11;
        if (num != AnonymousClass05K.A01 || !r10.A0B || !r10.A09) {
            int i2 = -1;
            switch (num.intValue()) {
                case 0:
                    i = 6;
                    break;
                case 1:
                    i = 9;
                    break;
                case 2:
                    throw new IllegalStateException("Feed logging does not currently support TARGET_POSITION_NO_LONGER_VALID reason");
                case 3:
                case 4:
                case 5:
                    i = -1;
                    break;
                case 6:
                    throw new IllegalStateException("Feed logging does not currently support AD_POSITION_IS_PASSED reason");
                case 7:
                    throw new IllegalStateException("Feed logging does not currently support PUSH_DOWN_OUT_OF_SPACE reason");
                case 8:
                    throw new IllegalStateException("Cannot log invalidation with NONE reason");
                default:
                    throw new RuntimeException();
            }
            UserSession userSession = r11.A00;
            0Tu r5 = 0Tu.A05;
            if (182.A06(r5, userSession, 36315331467218060L)) {
                str = AnonymousClass000.A00(1474);
            } else {
                str = "instagram_ad_async_ad_controller_action_fail";
            }
            if (!r6.A04.CXm(r2) || !182.A06(r5, userSession, 36327950081145676L)) {
                r6.A06(1Xi.A02(r2.A01.A05), r8, r9, r10, str, i);
                return;
            }
            1Xg r52 = r2.A01;
            1UQ r1 = r52.A06;
            if (r1 == 1UQ.A0T) {
                for (C55923Hpk A002 : r52.A01().A0B) {
                    r6.A06(A002.A00(), r8, r9, r10, str, i);
                }
            } else if (r1 == 1UQ.A0l && (A022 = 1Xi.A02(r52.A05)) != null) {
                C45441CwO A003 = C44851Cm1.A00(userSession);
                Integer num2 = r52.A07;
                if (num2 != null) {
                    i2 = num2.intValue();
                }
                for (C55923Hpk A004 : A003.A00(A022, i2).A0B) {
                    r6.A06(A004.A00(), r8, r9, r10, str, i);
                }
            }
        } else {
            r11.A0A(r12);
        }
    }

    public final void A0A(C251373n0 r6) {
        1Xj A022;
        int i;
        0qQ.A0B(r6, 0);
        AnonymousClass4EB r3 = (AnonymousClass4EB) r6.BTb();
        if (this.A04.CXm(r3)) {
            UserSession userSession = this.A00;
            if (182.A06(0Tu.A05, userSession, 36327950081145676L)) {
                1Xg r32 = r3.A01;
                1UQ r1 = r32.A06;
                if (r1 == 1UQ.A0T) {
                    Iterator it = r32.A01().A0B.iterator();
                    while (it.hasNext()) {
                        it.next();
                        A09(r6);
                    }
                    return;
                } else if (r1 == 1UQ.A0l && (A022 = 1Xi.A02(r32.A05)) != null) {
                    C45441CwO A002 = C44851Cm1.A00(userSession);
                    Integer num = r32.A07;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = -1;
                    }
                    Iterator it2 = A002.A00(A022, i).A0B.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                        A09(r6);
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        A09(r6);
    }

    public final /* bridge */ /* synthetic */ void Cgw(1PW r11, Long l, Object obj, String str, String str2, String str3, String str4, Collection collection, Collection collection2, Map map, Map map2, boolean z) {
        AnonymousClass4EB r1 = (AnonymousClass4EB) obj;
        0qQ.A0B(r1, 0);
        0qQ.A0B(str, 2);
        Collection collection3 = collection;
        0qQ.A0B(collection3, 3);
        Collection collection4 = collection2;
        0qQ.A0B(collection4, 4);
        A07(this, r1, l, str, str2, str3, str4, collection3, collection4, z);
    }

    private final void A00(UserSession userSession, 1Xg r8, C270594gz r9, 1Xj r10, AnonymousClass4DU r11, C233462vl r12, Integer num, Long l, String str, String str2, String str3, String str4, List list, List list2, boolean z) {
        int i;
        C254523sc A012 = C233822wX.A01(r9, r10, r11, "invalidation");
        A012.A1W = Boolean.valueOf(z);
        A012.A6N = str2;
        A012.A3y = l;
        A012.A5z = str3;
        A012.A6B = str4;
        A012.A6o = str;
        List list3 = list2;
        A012.A7x = list3;
        A012.A8B = C231122qu.A0R(userSession, r10);
        A012.A1G = Boolean.valueOf(1Au.A00(userSession).A1j());
        A012.A77 = r12.A08;
        A012.A4M = this.A00;
        A012.A4S = C233832wY.A00(userSession);
        String A002 = C243413Yr.A00(r10.A0e);
        if (A002 != null) {
            A012.A50 = A002;
        }
        AnonymousClass3VK A003 = AnonymousClass3VI.A00(userSession);
        A012.A81 = A003.A04(r11, list);
        A012.A0V(A003.A03(r11));
        A012.A2v = A003.A01(r11);
        A012.A2w = A003.A02(r11);
        A003.A06(r11, num);
        if (C228342lQ.A02(userSession)) {
            A012.A4X = C228342lQ.A01(1Au.A00(userSession)).toString();
            A012.A4Y = C228342lQ.A00(userSession).toString();
        }
        if (list3.contains(AnonymousClass000.A00(1761))) {
            AnonymousClass2rI r1 = this.A02;
            String str5 = r1.A0S.BQr(r10).A1U;
            ArrayList A062 = r1.A06();
            0qQ.A0B(A062, 0);
            A012.A3D = Integer.valueOf(A062.indexOf(str5));
            A012.A6j = str5;
        }
        1UQ r4 = r8.A06;
        if (r4 == 1UQ.A0l) {
            C45441CwO A004 = C44851Cm1.A00(userSession);
            Integer num2 = r8.A07;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                i = -1;
            }
            this.A03.A09((1Xj) null, A004.A00(r10, i), (Integer) null, str);
        }
        int A0m = r10.A0m();
        if (A0m != -1) {
            A012.A2k = Integer.valueOf(A0m);
        }
        String A2p = r10.A2p();
        if (A2p.length() > 0) {
            A012.A6C = A2p;
        }
        A01(r8, A012);
        A02(r4, A012, r10, num);
        A04(A012, r10, num);
        0jB r2 = new 0jB();
        r2.A04(C271774jZ.A6q, this.A06.A0a);
        A012.A0E(r2);
        C233822wX.A0I(userSession, A012, r11, AnonymousClass05K.A01);
    }

    private final void A01(1Xg r8, C254523sc r9) {
        1UQ r2;
        0jB r22;
        long j;
        Long l;
        String str;
        1Xj A022 = 1Xi.A02(r8.A05);
        String str2 = null;
        if (A022 != null) {
            r2 = A022.B5J();
        } else {
            r2 = null;
        }
        if (r2 == 1UQ.A0l) {
            r22 = new 0jB();
            r22.A04(C271774jZ.A4V, true);
            0j9 r6 = C271774jZ.A5w;
            C46298DUb BUS = A022.A0C.BUS();
            if (BUS != null) {
                l = Long.valueOf((long) BUS.BUX());
            } else {
                l = null;
            }
            r22.A04(r6, l);
            0j9 r3 = C271774jZ.A5u;
            C46298DUb BUS2 = A022.A0C.BUS();
            if (BUS2 != null) {
                str = BUS2.BUa();
            } else {
                str = null;
            }
            r22.A04(r3, str);
            0j9 r32 = C271774jZ.A5t;
            C46298DUb BUS3 = A022.A0C.BUS();
            if (BUS3 != null) {
                str2 = BUS3.BUR();
            }
            r22.A04(r32, str2);
        } else if (r8.A06 == 1UQ.A0T) {
            ArrayList arrayList = new ArrayList();
            for (C55923Hpk A002 : r8.A01().A0B) {
                String A072 = C231122qu.A07(this.A00, A002.A00());
                if (A072 != null) {
                    arrayList.add(A072);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            r22 = new 0jB();
            r22.A04(C271774jZ.A4V, true);
            0j9 r4 = C271774jZ.A5v;
            Integer A023 = r8.A01().A02();
            if (A023 != null) {
                str2 = C55034Hb5.A00(A023);
            }
            r22.A04(r4, str2);
            0j9 r42 = C271774jZ.A5w;
            C42049BFc bFc = r8.A01().A03;
            if (bFc != null) {
                j = (long) bFc.A00;
            } else {
                j = -1;
            }
            r22.A04(r42, Long.valueOf(j));
            r22.A04(C271774jZ.A5y, r8.A01().getId());
            r22.A04(C271774jZ.A7q, r8.A01().A00().A02);
            r22.A05(C271774jZ.A5r, arrayList);
        } else {
            return;
        }
        r9.A0E(r22);
    }

    private final void A02(1UQ r9, C254523sc r10, 1Xj r11, Integer num) {
        String str;
        Integer num2;
        String str2;
        Integer num3;
        List list;
        if (this.A09 && r11 != null && num != null && r9 != 1UQ.A0T) {
            Integer A2J = r11.A2J();
            int intValue = num.intValue();
            int i = intValue - 1;
            List A082 = this.A02.A08();
            List list2 = null;
            if (i >= 0 && i < A082.size()) {
                AnonymousClass1Xn r2 = ((1Xg) A082.get(i)).A05;
                1Xj A022 = 1Xi.A02(r2);
                if (A022 != null) {
                    str2 = A022.getId();
                } else {
                    str2 = null;
                }
                1Xj A023 = 1Xi.A02(r2);
                if (A023 != null) {
                    num3 = A023.A2I();
                } else {
                    num3 = null;
                }
                1Xj A024 = 1Xi.A02(r2);
                if (A024 != null) {
                    list = A024.A0e;
                } else {
                    list = null;
                }
                String A002 = C243413Yr.A00(list);
                if (str2 != null) {
                    r10.A6E = str2;
                }
                if (num3 != null) {
                    r10.A0D = num3.intValue();
                }
                if (A002 != null) {
                    r10.A52 = A002;
                }
            }
            if (intValue >= 0 && intValue < A082.size()) {
                AnonymousClass1Xn r4 = ((1Xg) A082.get(intValue)).A05;
                1Xj A025 = 1Xi.A02(r4);
                if (A025 != null) {
                    str = A025.getId();
                } else {
                    str = null;
                }
                1Xj A026 = 1Xi.A02(r4);
                if (A026 != null) {
                    num2 = A026.A2I();
                } else {
                    num2 = null;
                }
                1Xj A027 = 1Xi.A02(r4);
                if (A027 != null) {
                    list2 = A027.A0e;
                }
                String A003 = C243413Yr.A00(list2);
                if (str != null) {
                    r10.A6D = str;
                }
                if (num2 != null) {
                    r10.A0C = num2.intValue();
                }
                if (A003 != null) {
                    r10.A51 = A003;
                }
            }
            if (A2J != null) {
                r10.A0E = A2J.intValue();
            }
        }
    }

    private final void A03(C254523sc r6, 1Xj r7, AnonymousClass4EB r8) {
        if (r7 != null) {
            if (r7.CcK()) {
                r6.A0G(this.A00, r7);
            }
            int A0m = r7.A0m();
            if (A0m != -1) {
                r6.A2k = Integer.valueOf(A0m);
            }
            String A2p = r7.A2p();
            if (A2p.length() > 0) {
                r6.A6C = A2p;
            }
        } else {
            AnonymousClass1Xn r1 = r8.A01.A05;
            if (r1 instanceof AnonymousClass3OA) {
                0qQ.A0C(r1, AnonymousClass000.A00(178));
                r6.A4N = ((AnonymousClass3OA) r1).A0S;
            }
        }
        1Xg r4 = r8.A01;
        A01(r4, r6);
        UserSession userSession = this.A00;
        if (C228342lQ.A02(userSession)) {
            r6.A4X = C228342lQ.A01(1Au.A00(userSession)).toString();
            r6.A4Y = C228342lQ.A00(userSession).toString();
        }
        AnonymousClass3VK A002 = AnonymousClass3VI.A00(userSession);
        AnonymousClass4DU r12 = this.A01;
        A002.A05(r12, r4.A07);
        if (!C271764jY.A00(userSession, r6, r12, AnonymousClass05K.A01)) {
            C60510iO.A00(userSession).EHF(r6.A00());
        }
        AnonymousClass9J8 r2 = r8.A00;
        int A092 = r8.A03.A09();
        0qQ.A0B(r2, 0);
        C241323Ot.A05(r2, userSession, r4, A092);
    }

    private final void A04(C254523sc r6, 1Xj r7, Integer num) {
        1Xj A022;
        BrandSafetyContentBlocklistBitmapQLObj AiG;
        List Afw;
        1Xj A023;
        BrandSafetyContentBlocklistBitmapQLObj AiG2;
        List Afw2;
        if (this.A07) {
            boolean z = this.A08;
            if (z) {
                if (r7 != null) {
                    List A3S = r7.A3S();
                    if (A3S != null) {
                        r6.A7h = A3S;
                    }
                } else {
                    return;
                }
            } else if (r7 == null) {
                return;
            }
            if (num != null) {
                int intValue = num.intValue();
                int i = intValue - 1;
                List A082 = this.A02.A08();
                if (!(i < 0 || i >= A082.size() || (A023 = 1Xi.A02(((1Xg) A082.get(i)).A05)) == null || (AiG2 = A023.A0C.AiG()) == null || (Afw2 = AiG2.Afw()) == null)) {
                    ArrayList A012 = C271914jn.A00.A01(Afw2);
                    if (z) {
                        r6.A7m = A012;
                    }
                    r6.A2o = Integer.valueOf(A012.size());
                }
                if (intValue >= 0 && intValue < A082.size() && (A022 = 1Xi.A02(((1Xg) A082.get(intValue)).A05)) != null && (AiG = A022.A0C.AiG()) != null && (Afw = AiG.Afw()) != null) {
                    ArrayList A013 = C271914jn.A00.A01(Afw);
                    if (z) {
                        r6.A7l = A013;
                    }
                    r6.A2n = Integer.valueOf(A013.size());
                }
            }
        }
    }

    public static final void A05(1Xj r5, AnonymousClass2vE r6, AnonymousClass4EB r7, Integer num) {
        AnonymousClass4DU r3 = r6.A01;
        if (AnonymousClass3WX.A00(r5, r3)) {
            UserSession userSession = r6.A00;
            C271794jb r4 = new C271794jb(userSession, r5);
            int i = -1;
            if (r5.A5D()) {
                i = 0;
            }
            r4.A00 = i;
            C254523sc A012 = C233822wX.A01(r4, r5, r3, "delivery");
            A012.A4M = r6.A00;
            A012.A77 = r7.A03.A08;
            A012.A2r = num;
            A012.A4S = C233832wY.A00(userSession);
            r6.A01(r7.A01, A012);
            if (C228342lQ.A02(userSession)) {
                A012.A4X = C228342lQ.A01(1Au.A00(userSession)).toString();
                A012.A4Y = C228342lQ.A00(userSession).toString();
            }
            C233822wX.A0C(userSession, A012, r5, r3, (Integer) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A06(X.1Xj r10, X.C251373n0 r11, X.1PW r12, X.C233462vl r13, java.lang.String r14, int r15) {
        /*
            r9 = this;
            X.4DU r5 = r9.A01
            X.3sc r4 = new X.3sc
            r4.<init>(r5, r14)
            java.lang.Object r3 = r11.BTb()
            X.4EB r3 = (X.AnonymousClass4EB) r3
            X.1Xg r2 = r3.A01
            X.1Xn r6 = r2.A05
            java.lang.String r0 = r6.C9L()
            r4.A7J = r0
            java.lang.String r0 = "timeline_request"
            r4.A4T = r0
            r4.A0A = r15
            X.2vl r1 = r3.A03
            int r0 = r1.A09()
            r4.A0B = r0
            java.lang.String r0 = r1.A08
            r4.A77 = r0
            java.lang.String r0 = r9.A00
            r4.A4M = r0
            int r0 = r13.A05()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A3g = r0
            int r0 = r13.A04
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A3h = r0
            r0 = 1
            r4.A8A = r0
            com.instagram.common.session.UserSession r7 = r9.A00
            java.lang.String r0 = X.C233832wY.A00(r7)
            r4.A4S = r0
            java.lang.String r0 = r12.A0F
            r4.A5l = r0
            X.3VK r8 = X.AnonymousClass3VI.A00(r7)
            r0 = 0
            java.util.List r0 = r8.A04(r5, r0)
            r4.A81 = r0
            java.util.List r0 = r8.A03(r5)
            r4.A0V(r0)
            java.lang.Integer r0 = r8.A01(r5)
            r4.A2v = r0
            java.lang.Integer r0 = r8.A02(r5)
            r4.A2w = r0
            java.lang.Integer r1 = r2.A07
            r8.A06(r5, r1)
            java.lang.Integer r8 = r12.A0B
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r8 != r0) goto L_0x0113
            r0 = 1140(0x474, float:1.597E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x007f:
            r4.A5F = r0
        L_0x0081:
            if (r10 == 0) goto L_0x00ee
            boolean r0 = r10.CcK()
            if (r0 == 0) goto L_0x00e3
            r4.A0G(r7, r10)
            boolean r0 = X.C231122qu.A0R(r7, r10)
            r4.A8B = r0
        L_0x0092:
            X.1UQ r0 = r2.A06
            r9.A02(r0, r4, r10, r1)
            r9.A04(r4, r10, r1)
            r0 = 1474(0x5c2, float:2.066E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x00c4
            boolean r0 = X.C228342lQ.A02(r7)
            if (r0 == 0) goto L_0x00c4
            X.1Av r0 = X.1Au.A00(r7)
            X.1Az r0 = X.C228342lQ.A01(r0)
            java.lang.String r0 = r0.toString()
            r4.A4X = r0
            X.1Az r0 = X.C228342lQ.A00(r7)
            java.lang.String r0 = r0.toString()
            r4.A4Y = r0
        L_0x00c4:
            r9.A01(r2, r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            boolean r0 = X.C271764jY.A00(r7, r4, r5, r0)
            if (r0 != 0) goto L_0x00dd
            r4.A0F(r7)
            X.0xI r1 = r4.A00()
            X.0xN r0 = X.C60510iO.A00(r7)
            r0.EHF(r1)
        L_0x00dd:
            X.9J8 r0 = r3.A00
            X.C241323Ot.A03(r0, r7, r2)
            return
        L_0x00e3:
            java.util.List r0 = r10.A0e
            java.lang.String r0 = X.C243413Yr.A00(r0)
            if (r0 == 0) goto L_0x0092
            r4.A50 = r0
            goto L_0x0092
        L_0x00ee:
            X.3PG r0 = r3.A02
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            java.lang.String r0 = X.C243413Yr.A00(r0)
            if (r0 == 0) goto L_0x00ff
            r4.A50 = r0
        L_0x00ff:
            boolean r0 = r6 instanceof X.AnonymousClass3OA
            if (r0 == 0) goto L_0x0092
            r0 = 178(0xb2, float:2.5E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r6, r0)
            X.3OA r6 = (X.AnonymousClass3OA) r6
            java.lang.String r0 = r6.A0S
            r4.A4N = r0
            goto L_0x0092
        L_0x0113:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r8 != r0) goto L_0x0081
            java.lang.String r0 = "replaced_slot_target_position_no_longer_valid"
            goto L_0x007f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2vE.A06(X.1Xj, X.3n0, X.1PW, X.2vl, java.lang.String, int):void");
    }

    public static final void A07(AnonymousClass2vE r28, AnonymousClass4EB r29, Long l, String str, String str2, String str3, String str4, Collection collection, Collection collection2, boolean z) {
        1Xj A022;
        List list;
        AnonymousClass4EB r1 = r29;
        1Xg r8 = r1.A01;
        List list2 = null;
        if (r8.A06 == 1UQ.A0T) {
            C55923Hpk hpk = (C55923Hpk) 00k.A0O(r8.A01().A0B, 0);
            if (hpk != null) {
                A022 = hpk.A00();
            } else {
                return;
            }
        } else {
            A022 = 1Xi.A02(r8.A05);
        }
        if (A022 != null) {
            boolean equals = str.equals("duplicate_ad_received");
            AnonymousClass2vE r6 = r28;
            UserSession userSession = r6.A00;
            boolean z2 = z;
            if (equals) {
                AnonymousClass4DU r11 = r6.A01;
                if (collection != null) {
                    list2 = 00k.A0a(collection);
                }
                List singletonList = Collections.singletonList("duplicate_ad_received");
                0qQ.A07(singletonList);
                C271794jb r9 = new C271794jb(userSession, A022);
                C233462vl r12 = r1.A03;
                r6.A00(userSession, r8, r9, A022, r11, r12, r8.A07, l, "duplicate_ad_received", str2, str3, str4, list2, singletonList, z2);
                C241323Ot.A04(r1.A00, userSession, r8, r12.A09());
                return;
            }
            AnonymousClass4DU r5 = r6.A01;
            if (collection != null) {
                list = 00k.A0a(collection);
            } else {
                list = null;
            }
            List A0a = 00k.A0a(collection2);
            C271794jb r3 = new C271794jb(userSession, A022);
            int i = -1;
            if (A022.A5D()) {
                i = 0;
            }
            r3.A00 = i;
            r6.A00(userSession, r8, r3, A022, r5, r1.A03, r8.A07, (Long) null, str, (String) null, (String) null, (String) null, list, A0a, z);
            C241323Ot.A03(r1.A00, userSession, r8);
        }
    }

    private final void A09(C251373n0 r5) {
        C254523sc r3 = new C254523sc(this.A01, "ad_exit_pool");
        AnonymousClass4EB r1 = (AnonymousClass4EB) r5.BTb();
        AnonymousClass1Xn r2 = r1.A01.A05;
        r3.A7J = r2.C9L();
        C233462vl r12 = r1.A03;
        r3.A77 = r12.A08;
        r3.A0G = r12.A09();
        r3.A4M = this.A00;
        1Xj A022 = 1Xi.A02(r2);
        if (A022 != null) {
            r3.A0G(this.A00, A022);
        }
        C60510iO.A00(this.A00).EHF(r3.A00());
    }

    public final /* bridge */ /* synthetic */ void Cgv(C251373n0 r13, Object obj) {
        String str;
        1Xj A022;
        1PW r14 = (1PW) obj;
        0qQ.A0B(r13, 0);
        0qQ.A0B(r14, 1);
        UserSession userSession = this.A00;
        0Tu r9 = 0Tu.A05;
        if (182.A06(r9, userSession, 36315331467152523L)) {
            str = "instagram_ad_insertion_success";
        } else {
            str = "instagram_ad_async_ad_controller_action_success";
        }
        AnonymousClass4EB r1 = (AnonymousClass4EB) r13.BTb();
        C254523sc r0 = new C254523sc(this.A01, str);
        1Xg r7 = r1.A01;
        AnonymousClass1Xn r4 = r7.A05;
        r0.A7J = r4.C9L();
        r0.A4T = "timeline_request";
        C233462vl r5 = r1.A03;
        r0.A0B = r5.A09();
        r0.A77 = r5.A08;
        r0.A4M = this.A00;
        r0.A4S = C233832wY.A00(userSession);
        int i = -1;
        if (!this.A04.CXm(r1) || !182.A06(r9, userSession, 36327950081145676L)) {
            1Xj A023 = 1Xi.A02(r4);
            1UQ r3 = r7.A06;
            if (r3 == 1UQ.A0T) {
                r0.A5i = A1I.A00(r14.A0C);
            }
            if (r3 == 1UQ.A0l && A023 != null) {
                C45441CwO A002 = C44851Cm1.A00(userSession);
                Integer num = r7.A07;
                if (num != null) {
                    i = num.intValue();
                }
                this.A03.A0H(A002.A00(A023, i), (Integer) null, Long.valueOf((long) r5.A09()), "server_delivered_iaa", -1);
            }
            A03(r0, A023, r1);
            return;
        }
        1UQ r32 = r7.A06;
        if (r32 == 1UQ.A0T) {
            r0.A5i = A1I.A00(r14.A0C);
            for (C55923Hpk A003 : r7.A01().A0B) {
                A03(r0, A003.A00(), r1);
            }
        } else if (r32 == 1UQ.A0l && (A022 = 1Xi.A02(r4)) != null) {
            C45441CwO A004 = C44851Cm1.A00(userSession);
            Integer num2 = r7.A07;
            if (num2 != null) {
                i = num2.intValue();
            }
            C54077Gz1 A005 = A004.A00(A022, i);
            this.A03.A0H(A005, (Integer) null, Long.valueOf((long) r5.A09()), "server_delivered_iaa", -1);
            for (C55923Hpk A006 : A005.A0B) {
                A03(r0, A006.A00(), r1);
            }
        }
    }
}
