package X;

import android.graphics.PointF;
import com.instagram.api.schemas.VisualSearchSuggestedProductContainer;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductAutoTagMetadata;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public abstract class LTX {
    public static final ArrayList A02(UserSession userSession, List list, List list2, boolean z) {
        User user;
        String A00;
        0qQ.A0B(userSession, 0);
        if (z) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : list) {
                Product A07 = ((MediaSuggestedProductTag) next).A07();
                if (!(A07 == null || (user = A07.A0B) == null || (A00 = AnonymousClass3ZA.A00(user)) == null)) {
                    boolean contains = list2.contains(A00);
                    if (Boolean.valueOf(contains) != null && contains) {
                        A1C.add(next);
                    }
                }
            }
            if (A1C.size() == list.size() || !182.A06(0Tu.A05, userSession, 36317826843154012L)) {
                return AnonymousClass7TE.A1D(A1C);
            }
        }
        return AnonymousClass7TE.A1D(list);
    }

    public static final ArrayList A03(ArrayList arrayList, List list) {
        String str;
        0qQ.A0B(list, 1);
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(JTU.A0Y(it));
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            Product A07 = ((MediaSuggestedProductTag) next).A07();
            if (!(A07 == null || (str = A07.A0H) == null || A0r.contains(str))) {
                A1C.add(next);
            }
        }
        return A1C;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r7 != null) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A05(X.C61062Jw0 r7, java.util.List r8) {
        /*
            r0 = 0
            X.0qQ.A0B(r8, r0)
            if (r7 == 0) goto L_0x0026
            java.lang.Object r0 = r7.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0026
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0014:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r1.next()
            X.BBU r0 = (X.BBU) r0
            java.lang.String r0 = r0.A05
            r6.add(r0)
            goto L_0x0014
        L_0x0026:
            X.0sn r6 = X.0sn.A00
            if (r7 == 0) goto L_0x0042
        L_0x002a:
            java.lang.Object r0 = r7.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0042
            java.util.ArrayList r5 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0038:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0044
            X.JTU.A1K(r5, r1)
            goto L_0x0038
        L_0x0042:
            X.0sn r5 = X.0sn.A00
        L_0x0044:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r8.iterator()
        L_0x004c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.instagram.tagging.api.model.MediaSuggestedProductTag r1 = (com.instagram.tagging.api.model.MediaSuggestedProductTag) r1
            com.instagram.user.model.Product r0 = r1.A07()
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = r0.A0H
            if (r0 == 0) goto L_0x004c
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L_0x004c
            java.lang.String r0 = r1.A04()
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L_0x004c
            r4.add(r2)
            goto L_0x004c
        L_0x0077:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LTX.A05(X.Jw0, java.util.List):java.util.List");
    }

    public static final C61062Jw0 A00(C61062Jw0 jw0, C61062Jw0 jw02) {
        ArrayList arrayList;
        if (!(jw0 == null || jw02 == null)) {
            List A04 = A04(jw0);
            if (!A04.isEmpty()) {
                List<BBU> list = (List) jw02.A01;
                if (list != null) {
                    arrayList = AnonymousClass7TG.A0r(list);
                    for (BBU bbu : list) {
                        if (A04.contains(bbu.A04)) {
                            bbu.A01 = C62565Khv.AUTO_TAG;
                        }
                        arrayList.add(bbu);
                    }
                } else {
                    arrayList = null;
                }
                return new C61062Jw0(jw02.A00, arrayList, jw02.A04, jw02.A03, jw02.A02, 4);
            }
        }
        return jw02;
    }

    public static final List A04(C61062Jw0 jw0) {
        List list = (List) jw0.A01;
        if (list == null) {
            return 0sn.A00;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (((BBU) next).A01 == C62565Khv.AUTO_TAG) {
                A1C.add(next);
            }
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A1C);
        Iterator it = A1C.iterator();
        while (it.hasNext()) {
            JTU.A1K(A0r, it);
        }
        return A0r;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (r7 != null) goto L_0x0026;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A06(X.C61062Jw0 r7, java.util.List r8) {
        /*
            if (r7 == 0) goto L_0x0022
            java.lang.Object r0 = r7.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0022
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0010:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r1.next()
            X.BBU r0 = (X.BBU) r0
            java.lang.String r0 = r0.A05
            r6.add(r0)
            goto L_0x0010
        L_0x0022:
            X.0sn r6 = X.0sn.A00
            if (r7 == 0) goto L_0x003e
        L_0x0026:
            java.lang.Object r0 = r7.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x003e
            java.util.ArrayList r5 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0034:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0040
            X.JTU.A1K(r5, r1)
            goto L_0x0034
        L_0x003e:
            X.0sn r5 = X.0sn.A00
        L_0x0040:
            if (r8 == 0) goto L_0x006b
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r8.iterator()
        L_0x004a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x006d
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.instagram.tagging.model.Tag r1 = (com.instagram.tagging.model.Tag) r1
            boolean r0 = X.JTQ.A1S(r1, r5)
            if (r0 != 0) goto L_0x0067
            java.lang.String r0 = r1.A04()
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L_0x004a
        L_0x0067:
            r4.add(r2)
            goto L_0x004a
        L_0x006b:
            X.0sn r4 = X.0sn.A00
        L_0x006d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LTX.A06(X.Jw0, java.util.List):java.util.List");
    }

    public static final List A07(List list) {
        if (list == null) {
            return 0sn.A00;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (((MediaSuggestedProductTag) next).A01 == C62565Khv.AUTO_PLACE) {
                A1C.add(next);
            }
        }
        return A1C;
    }

    public static final List A09(List list) {
        if (list == null) {
            return 0sn.A00;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            C62565Khv khv = ((MediaSuggestedProductTag) next).A01;
            if (khv == C62565Khv.AUTO_TAG || khv == C62565Khv.AUTO_PLACE) {
                A1C.add(next);
            }
        }
        return A1C;
    }

    public static final List A0A(List list) {
        User user;
        String A00;
        if (list == null) {
            return 0sn.A00;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Product A0Q = JTU.A0Q(it);
            if (!(A0Q == null || (user = A0Q.A0B) == null || (A00 = AnonymousClass3ZA.A00(user)) == null)) {
                String str = A0Q.A0H;
                0qQ.A0B(str, 0);
                A1C.add(new VisualSearchSuggestedProductContainer(JTR.A0M(A00), DbY.A04(00y.A0n(10, str))));
            }
        }
        return A1C;
    }

    public static final void A0B(AnonymousClass0iw r16, UserSession userSession, MediaSuggestedProductTag mediaSuggestedProductTag, String str, String str2, boolean z, boolean z2) {
        String str3;
        MediaSuggestedProductTag mediaSuggestedProductTag2 = mediaSuggestedProductTag;
        String id = mediaSuggestedProductTag2.getId();
        String id2 = mediaSuggestedProductTag2.getId();
        Float A08 = mediaSuggestedProductTag2.A08();
        PointF pointF = mediaSuggestedProductTag2.A00;
        C62565Khv khv = mediaSuggestedProductTag2.A01;
        0qQ.A07(khv);
        if (z2) {
            str3 = "opt";
        } else {
            str3 = "seller";
        }
        LTQ.A04(pointF, (C60762Jqt) null, r16, userSession, khv, A08, 0, str2, str, id, id2, (String) null, "reels", str3, 0, z);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.instagram.model.shopping.ProductTag, java.lang.Object, com.instagram.tagging.model.Tag] */
    public static final boolean A0C(C60762Jqt jqt, AnonymousClass0iw r28, UserSession userSession, AnonymousClass3Q2 r30, C62930Koi koi, String str, int i, boolean z) {
        AnonymousClass3Q2 r5 = r30;
        C62930Koi koi2 = koi;
        AnonymousClass7TG.A1N(r5, koi2);
        ArrayList arrayList = r5.A41;
        ArrayList A0r = AnonymousClass7TG.A0r(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A0r.add(JTU.A0Y(it));
        }
        List list = koi2.A02;
        0qQ.A07(list);
        boolean z2 = false;
        for (MediaSuggestedProductTag mediaSuggestedProductTag : A08(list)) {
            if (!A0r.contains(JTT.A0n(mediaSuggestedProductTag))) {
                ArrayList arrayList2 = r5.A41;
                Product A07 = mediaSuggestedProductTag.A07();
                PointF pointF = mediaSuggestedProductTag.A00;
                ProductAutoTagMetadata productAutoTagMetadata = new ProductAutoTagMetadata(mediaSuggestedProductTag.A00, mediaSuggestedProductTag.A08());
                ? obj = new Object();
                obj.A03 = null;
                obj.A01 = null;
                obj.A00 = pointF;
                0qQ.A0B(A07, 0);
                obj.A02 = A07.A01;
                obj.A01 = productAutoTagMetadata;
                C62565Khv khv = C62565Khv.AUTO_TAG;
                obj.A03 = khv.A00;
                arrayList2.add(obj);
                String A0n = JTT.A0n(mediaSuggestedProductTag);
                String A0n2 = JTT.A0n(mediaSuggestedProductTag);
                LTQ.A04(mediaSuggestedProductTag.A00, jqt, r28, userSession, khv, mediaSuggestedProductTag.A08(), (Integer) null, str, "add", A0n, A0n2, (String) null, "feed", "seller", i, z);
                z2 = true;
            }
        }
        return z2;
    }

    public static final ArrayList A01(UserSession userSession, C3499682q r8, C62565Khv khv) {
        ArrayList arrayList;
        String str;
        AnonymousClass7TG.A1O(userSession, r8);
        ArrayList A1C = AnonymousClass7TE.A1C();
        List Co4 = r8.Co4();
        LinkedHashSet A0y = DbS.A0y();
        Iterator it = Co4.iterator();
        while (it.hasNext()) {
            AnonymousClass3Q2 A0U = JTS.A0U(userSession, it);
            if (!(A0U == null || (arrayList = A0U.A43) == null)) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    MediaSuggestedProductTag mediaSuggestedProductTag = (MediaSuggestedProductTag) it2.next();
                    Product A07 = mediaSuggestedProductTag.A07();
                    if (A07 != null && (str = A07.A0H) != null && mediaSuggestedProductTag.A01 == khv && !A0y.contains(str)) {
                        A1C.add(mediaSuggestedProductTag);
                        A0y.add(str);
                    }
                }
            }
        }
        return A1C;
    }

    public static final List A08(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (((MediaSuggestedProductTag) next).A01 == C62565Khv.AUTO_TAG) {
                A1C.add(next);
            }
        }
        return A1C;
    }
}
