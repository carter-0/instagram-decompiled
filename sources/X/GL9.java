package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public abstract class GL9 {
    public static final int A00(UserSession userSession, C54575HJk hJk, List list, List list2, int i, boolean z, boolean z2) {
        int size;
        int A0A = hJk.A0A();
        if (A0A == 0) {
            if (z2) {
                return A0A;
            }
            size = list.size();
        } else {
            if (z2) {
                size = list2.size();
            }
            size = list.size();
        }
        int size2 = ((A0A - size) - hJk.A0K(C295365o2.GHOST).size()) - i;
        if (!z || !182.A06(0Tu.A05, userSession, 36317861203416691L)) {
            return size2;
        }
        int i2 = (A0A - (A0A - size2)) - 1;
        List A0I = hJk.A0I();
        int i3 = 0;
        if (0 < i2) {
            i3 = i2;
        }
        List subList = A0I.subList(i3, hJk.A0A() - 1);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : subList) {
            if (((C267324bN) next).A03 == AnonymousClass05K.A01) {
                A1C.add(next);
            }
        }
        return size2 - A1C.size();
    }

    public static final GLA A03(UserSession userSession, C233172vA r24, C54575HJk hJk, Boolean bool, String str, String str2, List list, int i, boolean z, boolean z2, boolean z3) {
        String str3;
        Object obj;
        1Xj r2;
        Object obj2;
        AnonymousClass3OA r1;
        1Xj r0;
        int i2;
        int i3;
        int i4;
        String str4;
        String str5;
        UserSession userSession2 = userSession;
        C54575HJk hJk2 = hJk;
        String str6 = str2;
        int i5 = i;
        boolean z4 = z2;
        if (!A08(userSession2, hJk2, bool, str, str6, i5, z4, z3)) {
            ArrayList A04 = A04(hJk2, i5, z4);
            List list2 = list;
            ArrayList A05 = A05(hJk2, list2, A04, z4);
            List A0d = hJk2.A0d(0sc.A06(new C295365o2[]{C295365o2.AD, C295365o2.AD_PREVIEW, C295365o2.MULTI_ADS}));
            ListIterator listIterator = A05.listIterator(A05.size());
            while (true) {
                str3 = null;
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((C267324bN) obj).A07() == null) {
                    break;
                }
            }
            C267324bN r12 = (C267324bN) obj;
            if (r12 != null) {
                r2 = r12.A02;
            } else {
                r2 = null;
            }
            ListIterator listIterator2 = A05.listIterator(A05.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    obj2 = null;
                    break;
                }
                obj2 = listIterator2.previous();
                if (((C267324bN) obj2).A07() != null) {
                    break;
                }
            }
            C267324bN r6 = (C267324bN) obj2;
            if (r6 != null) {
                r1 = r6.A07();
                r0 = r6.A02;
            } else {
                r1 = null;
                r0 = null;
            }
            int size = hJk2.A0K(C295365o2.SURVEY).size();
            boolean z5 = z4;
            int A00 = A00(userSession2, hJk2, list2, A04, size, true, z5);
            C233172vA r8 = r24;
            if (r24 != null) {
                r8.A0H = Integer.valueOf(A00 - i);
            }
            if (1KU.A09(userSession2)) {
                hJk2.A0e(A00);
            }
            if (r2 != null) {
                i2 = A01(hJk2, hJk2.A0C(r2));
            } else {
                i2 = -1;
            }
            if (AnonymousClass7TE.A1b(A0d)) {
                i3 = A01(hJk2, hJk2.A0B((C267324bN) 00k.A0K(A0d)));
            } else {
                i3 = -1;
            }
            if (r0 != null) {
                i4 = A01(hJk2, hJk2.A0C(r0));
            } else {
                i4 = -1;
            }
            A06(userSession2, hJk, list2, A00, i2, size);
            A07(userSession2, hJk2, list2, A04, A00, i2, i3, i4, z, true, z5);
            if ((!z2 || (!(A00 == 1 && i == 0) && (!z3 || !str6.equals("clips_viewer_clips_tab")))) && r2 != null) {
                String id = r2.getId();
                if (id != null) {
                    C267324bN r3 = (C267324bN) 00k.A0L(A0d);
                    if (r3 == null) {
                        str4 = null;
                    } else if (r3.A0F()) {
                        str4 = ((AnonymousClass3OA) C57031ILx.A02(r3).get(0)).A0S;
                    } else {
                        str4 = r3.getId();
                    }
                    if (r1 != null) {
                        str5 = r1.A0S;
                    } else {
                        str5 = null;
                    }
                    if (r0 != null) {
                        str3 = r0.getId();
                    }
                    return new GLA(id, str4, str5, str3, A00, i2, i3, i4);
                }
                throw AnonymousClass7TE.A0y();
            }
        }
        return new GLA("", (String) null, (String) null, (String) null, 0, -1, -1, -1);
    }

    public static final boolean A08(UserSession userSession, C54575HJk hJk, Boolean bool, String str, String str2, int i, boolean z, boolean z2) {
        String str3;
        1Xj r0;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36318556987922667L) && !z && z2 && str != null && !hJk.A0Y()) {
            C267324bN A0E = hJk.A0E(0);
            if (A0E == null || (r0 = A0E.A02) == null) {
                str3 = null;
            } else {
                str3 = r0.getId();
            }
            if (0qQ.A0K(str3, str)) {
                if (!182.A06(r2, userSession, 36318556988250352L) || (i == 0 && 0qQ.A0K(bool, false) && !A09(hJk, "reels list already contains ads when preparing page token for headload", str2))) {
                    return true;
                }
                return false;
            }
        }
        return 182.A06(r2, userSession, 36318556988315889L) && !z && z2 && 0qQ.A0K(bool, false) && str == null && i == 0 && !hJk.A0Y() && hJk.A0E(0).A03 == AnonymousClass05K.A01 && !A09(hJk, "reels list already contains ads when preparing page token for headload", str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A09(X.C54575HJk r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = 1
            java.util.Iterator r2 = X.C52009GBg.A07(r4)
        L_0x0005:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = r2.next()
            X.4bN r0 = (X.C267324bN) r0
            X.5o2 r1 = r0.A01
            X.5o2 r0 = X.C295365o2.AD
            if (r1 == r0) goto L_0x001b
            X.5o2 r0 = X.C295365o2.NETEGO
            if (r1 != r0) goto L_0x0005
        L_0x001b:
            X.0wj r1 = X.0wj.A01
            r0 = 817903207(0x30c03667, float:1.3985301E-9)
            X.0f9 r1 = r1.AEf(r5, r0)
            java.lang.String r0 = "Container Module"
            r1.ABQ(r0, r6)
            r1.report()
            return r3
        L_0x002d:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GL9.A09(X.HJk, java.lang.String, java.lang.String):boolean");
    }

    public static final int A01(C54575HJk hJk, int i) {
        List A0K = hJk.A0K(C295365o2.SURVEY);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A0K) {
            if (hJk.A0B((C267324bN) next) > i) {
                break;
            }
            A1C.add(next);
        }
        return i - A1C.size();
    }

    public static final GLA A02(UserSession userSession, C233172vA r33, C54575HJk hJk, Boolean bool, String str, String str2, List list, int i, boolean z, boolean z2) {
        1Xj r0;
        int i2;
        int i3;
        UserSession userSession2 = userSession;
        C54575HJk hJk2 = hJk;
        String str3 = str2;
        int i4 = i;
        boolean z3 = z;
        if (!A08(userSession2, hJk2, bool, str, str3, i4, z3, z2)) {
            ArrayList A04 = A04(hJk2, i4, z3);
            List list2 = list;
            ArrayList A05 = A05(hJk2, list2, A04, z3);
            List A0d = hJk2.A0d(0sc.A06(new C295365o2[]{C295365o2.AD, C295365o2.AD_PREVIEW, C295365o2.MULTI_ADS}));
            C267324bN r02 = (C267324bN) 00k.A0L(A05);
            String str4 = null;
            if (r02 != null) {
                r0 = r02.A02;
            } else {
                r0 = null;
            }
            int size = hJk2.A0K(C295365o2.SURVEY).size();
            int A00 = A00(userSession2, hJk2, list2, A04, size, true, z3);
            C233172vA r6 = r33;
            if (r33 != null) {
                r6.A0H = Integer.valueOf(A00 - i);
            }
            if (1KU.A09(userSession2)) {
                hJk2.A0e(A00);
            }
            if (r0 != null) {
                i2 = A01(hJk2, hJk2.A0C(r0));
            } else {
                i2 = -1;
            }
            if (AnonymousClass7TE.A1b(A0d)) {
                i3 = A01(hJk2, hJk2.A0B((C267324bN) 00k.A0K(A0d)));
            } else {
                i3 = -1;
            }
            A06(userSession2, hJk2, list2, A00, i2, size);
            A07(userSession2, hJk2, list2, A04, A00, i2, i3, -1, false, false, z3);
            if ((!z || (!(A00 == 1 && i == 0) && (!z2 || !str3.equals("clips_viewer_clips_tab")))) && r0 != null) {
                String id = r0.getId();
                if (id != null) {
                    if (AnonymousClass7TE.A1b(A0d)) {
                        str4 = ((C267324bN) 00k.A0K(A0d)).getId();
                    }
                    return new GLA(id, str4, (String) null, (String) null, A00, i2, i3, -1);
                }
                throw AnonymousClass7TE.A0y();
            }
        }
        return new GLA("", (String) null, (String) null, (String) null, 0, -1, -1, -1);
    }

    public static final ArrayList A05(C54575HJk hJk, List list, List list2, boolean z) {
        List A0K = hJk.A0K(C295365o2.ORGANIC);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = A0K.iterator();
        if (z) {
            while (it.hasNext()) {
                Object next = it.next();
                if (!list2.contains(((C267324bN) next).getId())) {
                    A1C.add(next);
                }
            }
        } else {
            while (it.hasNext()) {
                Object next2 = it.next();
                if (!list.contains(((C267324bN) next2).getId())) {
                    A1C.add(next2);
                }
            }
        }
        return A1C;
    }

    public static final void A06(UserSession userSession, C54575HJk hJk, List list, int i, int i2, int i3) {
        if (i <= i2) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Number of Surveys: ");
            A1A.append(i3);
            A1A.append(" \nLast Organic Position: ");
            A1A.append(i2);
            A1A.append(" \nTotal Number of Items: ");
            A1A.append(i);
            A1A.append(" \nNewly Delivered Items: ");
            A1A.append(list.size());
            String A0l = AnonymousClass7TF.A0l(" \n", A1A);
            Iterator A07 = C52009GBg.A07(hJk);
            while (A07.hasNext()) {
                C267324bN r2 = (C267324bN) A07.next();
                StringBuilder sb = new StringBuilder();
                sb.append(A0l);
                sb.append(hJk.A0B(r2));
                sb.append(' ');
                sb.append(r2.A01);
                sb.append(": ");
                sb.append(r2.getId());
                sb.append(10);
                A0l = sb.toString();
            }
            boolean A06 = 182.A06(0Tu.A05, userSession, 36312406594421864L);
            int i4 = IgNetworkConsentStorage.MAX_ENTRIES;
            if (A06) {
                i4 = 1;
            }
            0wb.A04("clips_ads_fetch", A0l, i4);
        }
    }

    public static final void A07(UserSession userSession, C54575HJk hJk, List list, List list2, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        Object obj;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        if (i6 >= i5 || i7 >= i5 || i8 >= i5) {
            0f9 A00 = 0wj.A00("Pagination token has incorrect item position(s)", 817903207, true);
            A00.ABO("total_number_of_previous_page_items", i5);
            boolean z4 = z3;
            A00.ABO("total_number_of_previous_page_items_with_flash_cache", A00(userSession, hJk, list, list2, hJk.A0K(C295365o2.SURVEY).size(), false, z4));
            A00.ABO("last_pure_organic_position", i6);
            A00.ABO("last_sponsored_position", i7);
            A00.ABO("last_overlay_ad_position", i8);
            List A0I = hJk.A0I();
            ArrayList A0r = AnonymousClass7TG.A0r(A0I);
            int i9 = 0;
            for (Object next : A0I) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                C267324bN r4 = (C267324bN) next;
                StringBuilder sb = new StringBuilder();
                sb.append(i9);
                sb.append(" : ");
                if (r4.A07() != null) {
                    obj = "OVERLAY_AD";
                } else {
                    obj = r4.A01;
                }
                sb.append(obj);
                sb.append(" : ");
                sb.append(r4.getId());
                A0r.add(sb.toString());
                i9 = i10;
            }
            A00.ABQ("raw_item_types", 00k.A0P("\n", "", "", A0r, (0sP) null));
            A00.ABQ("new_page_organic_items", 00k.A0P("\n", "", "", list, (0sP) null));
            A00.ABR("is_overlay_ads_request", z);
            A00.ABR("is_v2_pagination_token", z2);
            A00.ABR("is_sync_flow_enabled", z4);
            A00.report();
        }
    }

    public static final ArrayList A04(C54575HJk hJk, int i, boolean z) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (z && i != -1) {
            int i2 = 0;
            for (Object next : hJk.A0I()) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                C267324bN r3 = (C267324bN) next;
                if (i2 > i && r3.A03 == AnonymousClass05K.A01) {
                    A1C.add(r3.getId());
                } else if (!(i2 <= i || r3.A03 == AnonymousClass05K.A01 || r3.A01 == C295365o2.GHOST)) {
                    A1C.clear();
                }
                i2 = i3;
            }
        }
        return A1C;
    }
}
