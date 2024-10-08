package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductTag;
import com.instagram.search.common.analytics.SearchContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2wX  reason: invalid class name and case insensitive filesystem */
public abstract class C233822wX {
    public static void A0E(UserSession userSession, C254523sc r8, 1Xl r9, AnonymousClass4DU r10, int i) {
        A0F(userSession, r8, r9, r10, AnonymousClass05K.A00, i, false);
    }

    public static void A0K(UserSession userSession, C270594gz r16, HLF hlf, 1Nv r18, AnonymousClass4DU r19, C249763kK r20, Integer num, String str, boolean z) {
        A0J(userSession, r16, hlf, r18, r19, r20, (Float) null, (Float) null, num, (Integer) null, str, (String) null, (String) null, (String) null, 0, z, false);
    }

    public static void A0O(UserSession userSession, C270594gz r19, 1Nv r20, AnonymousClass4DU r21, Integer num, String str, String str2, List list, List list2) {
        A0M(userSession, r19, r20, r21, num, (Long) null, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str2, (HashMap) null, list, list2, false);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0093, code lost:
        if (r12.equals(r0) == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0122, code lost:
        r2.A2A = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0P(com.instagram.common.session.UserSession r12, X.1Xj r13, X.AnonymousClass4DU r14, com.instagram.search.common.analytics.SearchContext r15, X.C249763kK r16, java.lang.Boolean r17, java.lang.Double r18, java.lang.Integer r19, java.lang.Integer r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.util.ArrayList r24, java.util.HashMap r25, int r26) {
        /*
            r0 = -1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r16
            r10 = r19
            r12 = r21
            X.3sc r2 = X.C254513sb.A02(r6, r7, r8, r9, r10, r11, r12)
            if (r2 == 0) goto L_0x0085
            r4 = r18
            if (r18 == 0) goto L_0x0027
            X.0Tu r3 = X.0Tu.A06
            r0 = 36324149035085652(0x810c9f00012f54, double:3.0348763431716806E-306)
            boolean r0 = X.182.A06(r3, r6, r0)
            if (r0 == 0) goto L_0x0027
            r2.A2d = r4
        L_0x0027:
            if (r19 == 0) goto L_0x0030
            int r0 = r10.intValue()
            r2.A09(r0)
        L_0x0030:
            if (r20 == 0) goto L_0x003d
            int r0 = r20.intValue()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A3T = r0
        L_0x003d:
            if (r15 == 0) goto L_0x0051
            java.lang.String r3 = r15.A05
            java.lang.String r1 = r15.A03
            java.lang.String r0 = r15.A02
            if (r3 == 0) goto L_0x0049
            r2.A6r = r3
        L_0x0049:
            if (r1 == 0) goto L_0x004d
            r2.A6Y = r1
        L_0x004d:
            if (r0 == 0) goto L_0x0051
            r2.A6W = r0
        L_0x0051:
            r0 = r23
            r2.A6a = r0
            r0 = r22
            r2.A4g = r0
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x0063
            r2.A65 = r0
        L_0x0063:
            boolean r0 = X.C231122qu.A0R(r6, r13)
            r2.A8B = r0
            A0A(r6, r2, r13)
            A0D(r6, r2, r13, r12)
            boolean r0 = r13.CcK()
            if (r0 == 0) goto L_0x0080
            r3 = r17
            if (r17 == 0) goto L_0x0080
            int r0 = r12.hashCode()
            switch(r0) {
                case -1345421289: goto L_0x0096;
                case -839537359: goto L_0x008d;
                case 1028727643: goto L_0x0086;
                default: goto L_0x0080;
            }
        L_0x0080:
            r0 = r26
            A0E(r6, r2, r13, r14, r0)
        L_0x0085:
            return
        L_0x0086:
            r0 = 1159(0x487, float:1.624E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x008f
        L_0x008d:
            java.lang.String r0 = "caption_dismiss"
        L_0x008f:
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0122
            goto L_0x0080
        L_0x0096:
            java.lang.String r0 = "caption_more_click"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0080
            r2.A2A = r3
            r0 = r24
            if (r24 == 0) goto L_0x00a6
            r2.A7T = r0
        L_0x00a6:
            r4 = r25
            if (r25 == 0) goto L_0x0122
            java.lang.String r1 = "tap_x_position"
            java.lang.Object r0 = r4.get(r1)
            if (r0 == 0) goto L_0x00c3
            java.lang.Object r0 = r4.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A2V = r0
        L_0x00c3:
            java.lang.String r1 = "tap_y_position"
            java.lang.Object r0 = r4.get(r1)
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r4.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A2W = r0
        L_0x00dc:
            java.lang.String r1 = "screen_width"
            java.lang.Object r0 = r4.get(r1)
            if (r0 == 0) goto L_0x010e
            java.lang.String r5 = "screen_height"
            java.lang.Object r0 = r4.get(r5)
            if (r0 == 0) goto L_0x010e
            java.lang.Object r0 = r4.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            java.lang.Object r0 = r4.get(r5)
            java.lang.Number r0 = (java.lang.Number) r0
            float r5 = r0.floatValue()
            double r0 = (double) r1
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A2U = r0
            double r0 = (double) r5
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A2T = r0
        L_0x010e:
            java.lang.String r1 = "tap_area"
            java.lang.Object r0 = r4.get(r1)
            if (r0 == 0) goto L_0x0122
            java.lang.Object r1 = r4.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r2.A4d = r1
        L_0x0122:
            r2.A2A = r3
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233822wX.A0P(com.instagram.common.session.UserSession, X.1Xj, X.4DU, com.instagram.search.common.analytics.SearchContext, X.3kK, java.lang.Boolean, java.lang.Double, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.util.HashMap, int):void");
    }

    public static void A0Q(UserSession userSession, 1Xj r8, AnonymousClass4DU r9, C249763kK r10, Integer num, Integer num2, String str, int i) {
        A0P(userSession, r8, r9, (SearchContext) null, r10, (Boolean) null, (Double) null, num, num2, str, (String) null, (String) null, (ArrayList) null, (HashMap) null, i);
    }

    public static void A0S(UserSession userSession, 1Xj r8, AnonymousClass4DU r9, Integer num, String str, String str2, String str3, int i) {
        A0P(userSession, r8, r9, (SearchContext) null, (C249763kK) null, (Boolean) null, (Double) null, num, (Integer) null, str, str2, str3, (ArrayList) null, (HashMap) null, i);
    }

    public static Double A02(Long l) {
        if (l == null) {
            return null;
        }
        return Double.valueOf(((double) System.currentTimeMillis()) - ((double) l.longValue()));
    }

    public static void A0A(UserSession userSession, C254523sc r4, 1Nv r5) {
        if (r5 instanceof 1Xj) {
            1Xj r52 = (1Xj) r5;
            0qQ.A0B(userSession, 0);
            0qQ.A0B(r52, 1);
            if (!r52.A5E() && !r52.A5D()) {
                AnonymousClass3OA A00 = 1wN.A00(userSession).A00(r52);
                if (A00 == null) {
                    C250513lZ injected = r52.A0C.getInjected();
                    if (injected == null || !0qQ.A0K(injected.CZl(), true)) {
                        return;
                    }
                } else if (!A00.A0z || C231122qu.A0T(userSession, r52)) {
                    return;
                }
                r4.A1n = true;
            }
        }
    }

    public static void A0B(UserSession userSession, C254523sc r2, 1Nv r3, AnonymousClass4DU r4, Integer num) {
        Integer num2;
        if (r4 instanceof C232682uF) {
            r2.A0E(((C232682uF) r4).E4k());
        }
        if (AnonymousClass3WX.A02(r3, r4) || num == AnonymousClass05K.A01) {
            num2 = AnonymousClass05K.A01;
        } else if (AnonymousClass3WX.A01(r3, r4) || r3.CUz()) {
            num2 = AnonymousClass05K.A00;
        } else {
            return;
        }
        A0I(userSession, r2, r4, num2);
    }

    public static void A0C(UserSession userSession, C254523sc r2, 1Nv r3, AnonymousClass4DU r4, Integer num) {
        if (num == null) {
            if (AnonymousClass3WX.A02(r3, r4)) {
                num = AnonymousClass05K.A01;
            } else {
                num = AnonymousClass05K.A00;
            }
        }
        A0I(userSession, r2, r4, num);
    }

    public static void A0D(UserSession userSession, C254523sc r2, 1Nv r3, String str) {
        String str2;
        if (((r3 instanceof 1Xj) && r3.CcK()) || (r3 instanceof AnonymousClass3OA)) {
            switch (str.hashCode()) {
                case -1298939544:
                    if (!str.equals("sub_impression")) {
                        return;
                    }
                    break;
                case 120623625:
                    str2 = "impression";
                    break;
                case 823466996:
                    str2 = "delivery";
                    break;
                default:
                    return;
            }
            if (str.equals(str2)) {
                r2.A4S = C233832wY.A00(userSession);
                if (C228342lQ.A02(userSession)) {
                    r2.A4X = C228342lQ.A01(1Au.A00(userSession)).toString();
                    r2.A4Y = C228342lQ.A00(userSession).toString();
                }
            }
        }
    }

    public static void A0G(UserSession userSession, C254523sc r3, 1Xl r4, Boolean bool) {
        C257913yA r1;
        0jB A01;
        if ((r4 instanceof AnonymousClass3OA) && (r1 = ((AnonymousClass3OA) r4).A0N) != null && (A01 = C52452GTe.A01(userSession, r1, r3.A6z)) != null) {
            A01.A05(C271774jZ.A78, bool);
            r3.A0q = A01;
        }
    }

    public static void A0H(UserSession userSession, C254523sc r2, AnonymousClass4DU r3) {
        A0I(userSession, r2, r3, AnonymousClass05K.A01);
    }

    public static void A0L(UserSession userSession, C270594gz r28, 1Nv r29, AnonymousClass4DU r30, Float f, Float f2, String str, String str2, String str3, String str4, String str5) {
        A04((C257603xf) null, (IntentAwareAdsInfoIntf) null, (0jB) null, (0jB) null, userSession, r28, r29, r30, (Boolean) null, (Boolean) null, f, f2, (Float) null, (Float) null, (Float) null, (Float) null, (Integer) null, (Integer) null, (Integer) null, str, str2, str3, (String) null, str4, (String) null, str5, 0);
    }

    public static void A0M(UserSession userSession, C270594gz r4, 1Nv r5, AnonymousClass4DU r6, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, HashMap hashMap, List list, List list2, boolean z) {
        C254523sc A01 = A01(r4, r5, r6, "invalidation");
        A01.A1W = Boolean.valueOf(z);
        A01.A6N = str2;
        A01.A3y = l;
        A01.A5z = str3;
        A01.A6B = str4;
        A01.A6o = str;
        A01.A7x = list2;
        A01.A1G = Boolean.valueOf(1Au.A00(userSession).A1j());
        A01.A4S = C233832wY.A00(userSession);
        if (str5 != null) {
            A01.A4M = str5;
        }
        if (r5 instanceof 1Xj) {
            1Xj r52 = (1Xj) r5;
            A01.A8B = C231122qu.A0R(userSession, r52);
            String A00 = C243413Yr.A00(r52.A0e);
            if (A00 != null) {
                A01.A50 = A00;
            }
        }
        AnonymousClass3VK A002 = AnonymousClass3VI.A00(userSession);
        A01.A81 = A002.A04(r6, list);
        A01.A0V(A002.A03(r6));
        A01.A2v = A002.A01(r6);
        A01.A2w = A002.A02(r6);
        if (C228342lQ.A02(userSession)) {
            A01.A4X = C228342lQ.A01(1Au.A00(userSession)).toString();
            A01.A4Y = C228342lQ.A00(userSession).toString();
        }
        HashMap hashMap2 = hashMap;
        if (hashMap != null) {
            A01.A7p = (List) hashMap2.get("in_pool_ad_ids");
            A01.A7q = (List) hashMap2.get("inserted_ad_ids");
            A01.A7z = (List) hashMap2.get("seen_ad_ids");
        }
        A01.A5k = str6;
        if (str7 != null) {
            A01.A62 = str7;
            A01.A64 = str7;
        }
        if (num != null) {
            A01.A2k = Integer.valueOf(num.intValue());
        }
        String str9 = str8;
        if (str8 != null) {
            A01.A6C = str9;
        }
        A0I(userSession, A01, r6, AnonymousClass05K.A01);
    }

    public static void A0R(UserSession userSession, 1Xj r7, AnonymousClass4DU r8, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, String str6, HashMap hashMap, List list, List list2, List list3, List list4, List list5, List list6, float f, int i) {
        C254523sc r2 = new C254523sc((C270594gz) null, r8, 002.A0R("instagram_ad_", "position_change"));
        r2.A7i = list;
        List list7 = list2;
        r2.A7v = list7;
        r2.A7w = list3;
        r2.A6b = str;
        r2.A03 = (double) f;
        r2.A6O = str2;
        r2.A0O = i;
        r2.A77 = str3;
        r2.A4M = str4;
        r2.A0B = Integer.parseInt((String) list7.get(list7.size() - 1));
        r2.A7g = hashMap;
        r2.A4S = C233832wY.A00(userSession);
        AnonymousClass3VK A00 = AnonymousClass3VI.A00(userSession);
        Integer A01 = A00.A01(r8);
        Integer A02 = A00.A02(r8);
        r2.A81 = A00.A04(r8, (List) null);
        r2.A0V(A00.A03(r8));
        r2.A2v = A01;
        r2.A2w = A02;
        r2.A74 = str5;
        r2.A35 = num;
        r2.A36 = num2;
        r2.A33 = num3;
        r2.A34 = num4;
        r2.A6R = str6;
        if (r7 != null) {
            r2.A0Q(r7.A0K);
            r2.A0S(r7.A0L);
        }
        if (C228342lQ.A02(userSession)) {
            r2.A4X = C228342lQ.A01(1Au.A00(userSession)).toString();
            r2.A4Y = C228342lQ.A00(userSession).toString();
        }
        List list8 = list4;
        if (list4 != null) {
            r2.A7h = list8;
        }
        List list9 = list5;
        if (list5 != null) {
            r2.A7m = list9;
        }
        List list10 = list6;
        if (list6 != null) {
            r2.A7l = list10;
        }
        A0I(userSession, r2, r8, AnonymousClass05K.A01);
    }

    public static void A0V(C254523sc r3, 1Nv r4) {
        C53246Gku gku;
        if ((r4 instanceof 1Xj) && (gku = ((1Xj) r4).A0B) != null) {
            r3.A1g = true;
            r3.A3m = Long.valueOf((long) gku.A00);
            String str = gku.A01;
            r3.A62 = str;
            r3.A64 = str;
            if (gku.A04) {
                r3.A5b = gku.A03;
                r3.A5a = gku.A02;
                return;
            }
            r3.A5Z = gku.A03;
        }
    }

    public static void A0W(C254523sc r2, 1Nv r3, Integer num) {
        String str;
        if ((r3 instanceof 1Xj) && num != null) {
            1Xj r32 = (1Xj) r3;
            int intValue = num.intValue();
            r2.A5A = r32.A33(intValue);
            1Xj A1c = r32.A1c(intValue);
            if (A1c != null) {
                str = A1c.A0C.Aza();
            } else {
                str = null;
            }
            r2.A59 = str;
        }
    }

    public static void A0X(C254523sc r3, 1Xj r4, int i) {
        if (r4 != null && r4.A5D() && i != -1 && r4.A1c(i) != null) {
            1Xj A1c = r4.A1c(i);
            r3.A08(i);
            r3.A4f = A1c.getId();
            1Xj A1c2 = r4.A1c(0);
            A1c2.getClass();
            r3.A4e = A1c2.getId();
            r3.A3O = Long.valueOf((long) r4.A0o());
            r3.A3M = Long.valueOf((long) A1c.BR7().A00);
            r3.A5t = r4.A0C.BOq();
            r3.A3P = C254543se.A00(r4.A0C.BOq());
            r3.A3L = C254543se.A00(r4.A2n());
            if (A1c.A5S()) {
                List<1Xj> A3Z = A1c.A3Z();
                ArrayList arrayList = new ArrayList();
                if (A3Z != null) {
                    for (1Xj A2n : A3Z) {
                        String A2n2 = A2n.A2n();
                        if (A2n2 != null) {
                            arrayList.add(A2n2);
                        }
                    }
                }
                r3.A7u = arrayList;
            }
        }
    }

    public static int A00(Map map) {
        int i = 0;
        if (!map.isEmpty()) {
            for (Map.Entry value : map.entrySet()) {
                i += ((Number) value.getValue()).intValue();
            }
        }
        return i;
    }

    public static C254523sc A01(C270594gz r2, 1Nv r3, AnonymousClass4DU r4, String str) {
        String str2;
        if (AnonymousClass3WX.A02(r3, r4)) {
            str2 = "instagram_ad_";
        } else {
            str2 = "instagram_organic_";
        }
        return new C254523sc(r2, r4, 002.A0R(str2, str));
    }

    public static String A03(1Xj r1) {
        if (!r1.A5G() || r1.A0C.getClipsMetadata() == null || r1.A0C.getClipsMetadata().Btl() == null || r1.A0C.getClipsMetadata().Btl().Aoo() == null) {
            return null;
        }
        return r1.A0C.getClipsMetadata().Btl().Aoo().Aoi();
    }

    public static void A05(IntentAwareAdsInfoIntf intentAwareAdsInfoIntf, C254523sc r6, Integer num, int i) {
        Integer BUY = intentAwareAdsInfoIntf.BUY();
        String BUa = intentAwareAdsInfoIntf.BUa();
        String Br2 = intentAwareAdsInfoIntf.Br2();
        r6.A1g = true;
        r6.A3Q = Long.valueOf((long) i);
        if (BUY != null) {
            r6.A3m = Long.valueOf((long) BUY.intValue());
        }
        if (BUa != null) {
            r6.A62 = BUa;
            r6.A64 = BUa;
        }
        if (Br2 != null) {
            r6.A5Z = Br2;
        }
        if (num != null) {
            r6.A3x = Long.valueOf((long) num.intValue());
        }
    }

    public static void A06(C267324bN r2, C254523sc r3, int i) {
        A05((IntentAwareAdsInfoIntf) r2.A03().A01.A01, r3, r2.A0A(), i);
    }

    public static void A07(AnonymousClass0iw r3, UserSession userSession, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str, String str2, String str3, Map map) {
        0wc A01 = AnonymousClass0kN.A01(r3, userSession);
        0Aj A00 = A01.A00(A01.A00, "instagram_netego_invalidation");
        if (A00.isSampled()) {
            A00.AAJ("tracking_token", str);
            A00.AAJ("viewer_session_id", str2);
            A00.AAJ("tray_session_id", str3);
            A00.A9H("reasons", map);
            A00.A9H("invalidation_reason", map);
            A00.AAJ("source_of_action", r3.getModuleName());
            A00.A9F("min_consumed_media_gap_to_previous_ad", l);
            A00.A9F("min_consumed_media_gap_to_previous_netego", l2);
            A00.A9F("min_consumed_reel_gap_to_previous_ad", l3);
            A00.A9F("min_consumed_reel_gap_to_previous_netego", l4);
            A00.A9F("netego_id", l5);
            A00.A9F("ad_id", l6);
            A00.Cgf();
        }
    }

    public static void A08(UserSession userSession, C233172vA r10, AnonymousClass3VZ r11, AnonymousClass4DU r12, String str, String str2, String str3, String str4) {
        0wc A01 = AnonymousClass0kN.A01(r12, userSession);
        0Aj A00 = A01.A00(A01.A00, "instagram_client_delivery_funnel_end");
        if (A00.isSampled()) {
            A00.A9F("netego_slots", Long.valueOf(r11.A0C));
            A00.A9F("ad_slots", Long.valueOf(r11.A01));
            long j = r11.A06;
            Long valueOf = Long.valueOf(j);
            A00.A9F("inserted_ads", valueOf);
            long j2 = r11.A07;
            A00.A9F("inserted_netegos", Long.valueOf(j2));
            A00.AAJ("container_module", r12.getModuleName());
            A00.AAJ("viewer_session_id", str);
            A00.AAJ("tray_session_id", str2);
            A00.A9F("brand_safe_slot_count", -1L);
            A00.A9F("brand_unsafe_slot_count", -1L);
            A00.AAJ("ad_client_delivery_session_id", str3);
            A00.A7p("did_cancel_pending_request", Boolean.valueOf(r11.A0K));
            A00.A9F("num_content_carried_over", Long.valueOf(r11.A02));
            A00.A9F("reel_viewer_position", Long.valueOf(r11.A0H));
            A00.A9F("reel_viewer_entry_position", Long.valueOf(r11.A0G));
            A00.A9F("session_items_count", Long.valueOf(r11.A0D));
            A00.A9F("num_ads_injected", valueOf);
            long j3 = r11.A04;
            A00.A9F("num_ads_delivered", Long.valueOf(j3));
            A00.A9F("num_ads_in_pool", Long.valueOf(r11.A00));
            A00.A9F("num_ads_invalidated", Long.valueOf(r11.A08));
            A00.A9F("num_content_consumed", Long.valueOf(r11.A03));
            A00.AAJ("ranking_session_id", r11.A0J);
            A00.A9F("num_sponsored_items_injected", Long.valueOf(j + j2));
            Long valueOf2 = Long.valueOf(r11.A05 + j3);
            A00.A9F("num_sponsored_items_delivered", valueOf2);
            A00.A9F("num_sponsored_items_in_pool", Long.valueOf(r11.A0E));
            A00.A9F("num_sponsored_items_invalidated", valueOf2);
            A00.A9F("last_injected_sponsored_content_position", Long.valueOf(r11.A09));
            A00.A9F("last_seen_sponsored_content_position", Long.valueOf(r11.A0B));
            A00.A9F("last_seen_organic_item_position", Long.valueOf(r11.A0A));
            A00.AAJ("afs_enablement_status", C233832wY.A00(userSession));
            A00.AAJ("previous_viewer_session_id", r11.A0I);
            A00.A9F("time_gap_to_previous_session_in_sec", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(r11.A0F)));
            String str5 = str4;
            if (str4 != null) {
                A00.AAJ("chaining_session_id", str5);
            }
            if (C228342lQ.A02(userSession)) {
                A00.AAJ("basic_ads_graphql_tier", C228342lQ.A01(1Au.A00(userSession)).toString());
                A00.AAJ("basic_ads_launcher_tier", C228342lQ.A00(userSession).toString());
            }
            String str6 = r10.A0R;
            if (str6 != null) {
                A00.AAJ("ad_pool_snapshot", str6);
            }
            Boolean bool = r10.A05;
            if (bool != null) {
                A00.A7p("is_self_pog_chaining", bool);
            }
            A00.Cgf();
        }
    }

    public static void A09(UserSession userSession, C233172vA r4, AnonymousClass4DU r5, String str, String str2, String str3, String str4) {
        0wc A01 = AnonymousClass0kN.A01(r5, userSession);
        0Aj A00 = A01.A00(A01.A00, "instagram_client_delivery_funnel_start");
        if (A00.isSampled()) {
            A00.AAJ("container_module", r5.getModuleName());
            A00.AAJ("viewer_session_id", str);
            A00.AAJ("tray_session_id", str2);
            A00.AAJ("ad_client_delivery_session_id", str3);
            A00.AAJ("afs_enablement_status", C233832wY.A00(userSession));
            if (str4 != null) {
                A00.AAJ("chaining_session_id", str4);
            }
            if (C228342lQ.A02(userSession)) {
                A00.AAJ("basic_ads_graphql_tier", C228342lQ.A01(1Au.A00(userSession)).toString());
                A00.AAJ("basic_ads_launcher_tier", C228342lQ.A00(userSession).toString());
            }
            String str5 = r4.A0R;
            if (str5 != null) {
                A00.AAJ("ad_pool_snapshot", str5);
            }
            Boolean bool = r4.A05;
            if (bool != null) {
                A00.A7p("is_self_pog_chaining", bool);
            }
            A00.Cgf();
        }
    }

    public static void A0F(UserSession userSession, C254523sc r2, 1Xl r3, AnonymousClass4DU r4, Integer num, int i, boolean z) {
        A0X(r2, r3.BPf(), i);
        if (z) {
            A0Y(r2, r3.BPf(), i);
        }
        if ((r3 instanceof 1Xj) || (r3 instanceof AnonymousClass3OA)) {
            A0B(userSession, r2, r3, r4, num);
            return;
        }
        throw new IllegalArgumentException("Unsupported type of ModelWithMedia");
    }

    public static void A0I(UserSession userSession, C254523sc r2, AnonymousClass4DU r3, Integer num) {
        if (!C271764jY.A00(userSession, r2, r3, num)) {
            r2.A0F(userSession);
            0xI A00 = r2.A00();
            AnonymousClass0xN A002 = C60510iO.A00(userSession);
            if (num == AnonymousClass05K.A01) {
                A002.EHF(A00);
            } else {
                A002.EFq(A00);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fc, code lost:
        if (r0.A01.A04 == null) goto L_0x00fe;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0J(com.instagram.common.session.UserSession r7, X.C270594gz r8, X.HLF r9, X.1Nv r10, X.AnonymousClass4DU r11, X.C249763kK r12, java.lang.Float r13, java.lang.Float r14, java.lang.Integer r15, java.lang.Integer r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, boolean r22, boolean r23) {
        /*
            boolean r0 = X.AnonymousClass3WX.A00(r10, r11)
            if (r0 == 0) goto L_0x00d9
            r3 = 0
            if (r22 == 0) goto L_0x0016
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318849045830145(0x8107cd00071a01, double:3.031524608625154E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 != 0) goto L_0x0100
        L_0x0016:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320549853012580(0x81095900092264, double:3.032600205935927E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 != 0) goto L_0x0100
            if (r22 == 0) goto L_0x0030
            r0 = 36318849045764608(0x8107cd00061a00, double:3.0315246085837083E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 != 0) goto L_0x00ee
        L_0x0030:
            r0 = 36320549852947043(0x81095900082263, double:3.032600205894481E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 != 0) goto L_0x00ee
            r4 = r3
        L_0x003c:
            int r1 = r9.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x00e6
            r0 = 0
            if (r1 == r0) goto L_0x00e2
            r0 = 2
            if (r1 == r0) goto L_0x00de
            java.lang.String r0 = ""
        L_0x004b:
            X.3sc r2 = A01(r8, r10, r11, r0)
            boolean r0 = X.AnonymousClass3WX.A02(r10, r11)
            if (r0 == 0) goto L_0x0075
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r22)
            r2.A23 = r0
            X.HLF r0 = X.HLF.BRAND
            if (r9 != r0) goto L_0x0075
            X.3GX r6 = X.AnonymousClass3GX.A00(r7)
            X.57d r5 = r6.A00
            if (r5 == 0) goto L_0x0075
            long r0 = r5.A00
            boolean r0 = X.AnonymousClass3GX.A03(r6, r0)
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = r5.A03
            if (r0 == 0) goto L_0x0075
            r2.A5D = r0
        L_0x0075:
            r0 = r17
            r2.A6z = r0
            r0 = r18
            r2.A6W = r0
            r0 = r19
            r2.A6Y = r0
            r0 = r20
            r2.A6r = r0
            if (r12 == 0) goto L_0x008d
            java.lang.String r0 = r12.getSessionId()
            r2.A6t = r0
        L_0x008d:
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x0097
            r2.A65 = r0
        L_0x0097:
            r2.A2B = r4
            if (r13 == 0) goto L_0x00a1
            float r0 = r13.floatValue()
            r2.A05 = r0
        L_0x00a1:
            if (r14 == 0) goto L_0x00a9
            float r0 = r14.floatValue()
            r2.A06 = r0
        L_0x00a9:
            r0 = r16
            r2.A2y = r0
            A0A(r7, r2, r10)
            boolean r0 = r10 instanceof X.1Xj
            if (r0 == 0) goto L_0x00c1
            r0 = r10
            X.1Xj r0 = (X.1Xj) r0
            boolean r0 = X.C231122qu.A0O(r7, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A1h = r0
        L_0x00c1:
            boolean r0 = r10 instanceof X.C267324bN
            if (r0 == 0) goto L_0x00da
            r1 = r10
            X.4bN r1 = (X.C267324bN) r1
            boolean r0 = r1.A0F()
            if (r0 == 0) goto L_0x00da
            r0 = r21
            A06(r1, r2, r0)
        L_0x00d3:
            A0W(r2, r10, r15)
            A0C(r7, r2, r10, r11, r3)
        L_0x00d9:
            return
        L_0x00da:
            A0V(r2, r10)
            goto L_0x00d3
        L_0x00de:
            java.lang.String r0 = "influencer_profile"
            goto L_0x004b
        L_0x00e2:
            java.lang.String r0 = "brand_profile"
            goto L_0x004b
        L_0x00e6:
            r0 = 422(0x1a6, float:5.91E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x004b
        L_0x00ee:
            X.3GX r0 = X.AnonymousClass3GX.A00(r7)
            X.57d r0 = r0.A00
            if (r0 == 0) goto L_0x00fe
            X.4Lh r0 = r0.A01
            java.lang.String r0 = r0.A04
            r23 = 1
            if (r0 != 0) goto L_0x0100
        L_0x00fe:
            r23 = 0
        L_0x0100:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r23)
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233822wX.A0J(com.instagram.common.session.UserSession, X.4gz, X.HLF, X.1Nv, X.4DU, X.3kK, java.lang.Float, java.lang.Float, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean):void");
    }

    public static void A0N(UserSession userSession, C270594gz r3, 1Nv r4, AnonymousClass4DU r5, Integer num, String str) {
        if (AnonymousClass3WX.A00(r4, r5)) {
            C254523sc A01 = A01(r3, r4, r5, str);
            if (r4 instanceof 1Xj) {
                A01.A8B = C231122qu.A0R(userSession, (1Xj) r4);
            }
            A0D(userSession, A01, r4, str);
            A0C(userSession, A01, r4, r5, num);
        }
    }

    public static void A0T(UserSession userSession, AnonymousClass4DU r3, Boolean bool, String str, String str2, String str3, String str4, int i) {
        C60510iO.A00(userSession);
        C254523sc r1 = new C254523sc(r3, 002.A0R("instagram_ad_", C273654mx.A00(725)));
        r1.A7J = str2;
        r1.A6o = str3;
        r1.A6z = str4;
        r1.A0m = new 0jB();
        if (bool != null) {
            r1.A1c = bool;
        }
        A0X(r1, 1E7.A00(userSession).A02(str), i);
        A0A(userSession, r1, 1E7.A00(userSession).A02(str));
        A0H(userSession, r1, r3);
    }

    public static void A0U(UserSession userSession, AnonymousClass4DU r4, String str, String str2, List list, int i, long j, long j2, boolean z) {
        C60510iO.A00(userSession);
        C254523sc r1 = new C254523sc((C270594gz) null, r4, 002.A0R("instagram_ad_", "reel_request_finish"));
        r1.A6g = str;
        r1.A7Q = str2;
        r1.A1T = Boolean.valueOf(z);
        r1.A7i = list;
        r1.A0b = j;
        r1.A0c = j2;
        r1.A0a = i;
        A0I(userSession, r1, r4, AnonymousClass05K.A01);
    }

    public static void A0Y(C254523sc r3, 1Xj r4, int i) {
        if (r4.A5D() && i != -1 && r4.A1c(i) != null) {
            1Xj A1c = r4.A1c(i);
            ArrayList arrayList = new ArrayList();
            ArrayList A3G = A1c.A3G();
            if (!AnonymousClass4KJ.A00(A3G)) {
                Iterator it = A3G.iterator();
                while (it.hasNext()) {
                    arrayList.add(C14502TxO.A00(((ProductTag) it.next()).A02));
                }
            }
            if (AnonymousClass4KJ.A00(arrayList)) {
                arrayList = null;
            }
            r3.A7c = arrayList;
            r3.A84 = arrayList;
            r3.A87 = C254543se.A01(arrayList);
        }
    }

    public static void A0Z(C254523sc r3, AnonymousClass3OA r4, int i) {
        if (r4.A05() && i != -1 && r4.A01() != null) {
            ImmutableList A01 = r4.A01();
            if (i >= 0 && i < A01.size()) {
                1Xj r2 = (1Xj) A01.get(i);
                r3.A08(i);
                r3.A4f = r2.getId();
                r3.A4e = ((1Xj) A01.get(0)).getId();
                r3.A3O = Long.valueOf((long) A01.size());
                r3.A3M = Long.valueOf((long) r2.BR7().A00);
            }
        }
    }

    public static void A04(C257603xf r5, IntentAwareAdsInfoIntf intentAwareAdsInfoIntf, 0jB r7, 0jB r8, UserSession userSession, C270594gz r10, 1Nv r11, AnonymousClass4DU r12, Boolean bool, Boolean bool2, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        String str8;
        String str9;
        C60510iO.A00(userSession);
        C254523sc A01 = A01(r10, r11, r12, "action");
        A01.A4J = str2;
        A01.A5K = str;
        A01.A6S = str6;
        A01.A7N = str3;
        A01.A6U = str4;
        A01.A6t = str5;
        if (f != null) {
            A01.A05 = f.floatValue();
        }
        if (f2 != null) {
            A01.A06 = f2.floatValue();
        }
        A01.A0P(f3, f4);
        A01.A0o = r7;
        A01.A0k = r8;
        Float f7 = f5;
        if (f5 != null) {
            Float f8 = f6;
            if (f6 != null) {
                A01.A2f = f7;
                A01.A2e = f8;
            }
        }
        if (bool2 != null) {
            A01.A1R = bool2;
        }
        String str10 = str7;
        if (str7 != null) {
            A01.A54 = str10;
        }
        A01.A2y = num3;
        if (bool != null) {
            if (bool.booleanValue()) {
                str9 = "midscene_cta_tap";
            } else {
                str9 = "cta_tap";
            }
            A01.A6z = str9;
        }
        String str11 = AnonymousClass1QI.A00.A02.A00;
        if (str11 != null) {
            A01.A65 = str11;
        }
        AnonymousClass3GX A00 = AnonymousClass3GX.A00(userSession);
        C2813657d r3 = A00.A00;
        if (!(r3 == null || !AnonymousClass3GX.A03(A00, r3.A00) || (str8 = r3.A03) == null)) {
            A01.A5D = str8;
        }
        if (!(r5 == null || r5.BGl() == null)) {
            A01.A0h = r5;
        }
        A0A(userSession, A01, r11);
        if (r11 instanceof 1Xj) {
            A01.A1h = Boolean.valueOf(C231122qu.A0O(userSession, (1Xj) r11));
        }
        if (intentAwareAdsInfoIntf != null) {
            A05(intentAwareAdsInfoIntf, A01, num2, i);
        } else {
            A0V(A01, r11);
        }
        A0W(A01, r11, num);
        A0I(userSession, A01, r12, AnonymousClass05K.A01);
    }
}
