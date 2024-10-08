package X;

import com.instagram.api.schemas.CarouselRenderingType;
import com.instagram.api.schemas.FanClubStoriesTeaserType;
import com.instagram.api.schemas.HallpassDetailsDictImpl;
import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.api.schemas.RingSpecImpl;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelType;
import com.instagram.sponsored.signals.model.AdsIAWRatingInfo;
import com.instagram.sponsored.signals.model.AdsRatingInfo;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* renamed from: X.3P9  reason: invalid class name */
public abstract class AnonymousClass3P9 {
    public static final AnonymousClass3HX A00 = new AnonymousClass3HX((C239653Hl) null, (CarouselRenderingType) null, (FanClubStoriesTeaserType) null, (HallpassDetailsDictImpl) null, (HighlightReelTypeStr) null, (C239733Hx) null, (IntentAwareAdsInfo) null, (AnonymousClass3I3) null, (AnonymousClass3I5) null, (AnonymousClass3IT) null, (AnonymousClass3I7) null, (AnonymousClass3I9) null, (RingSpecImpl) null, (AnonymousClass3IH) null, (AnonymousClass3IL) null, (AnonymousClass3IP) null, (AnonymousClass3IR) null, (1Xj) null, (AnonymousClass3HZ) null, (AnonymousClass3IB) null, (C239713Hs) null, (C239693Hq) null, (AnonymousClass3HV) null, (ReelType) null, (AnonymousClass3IN) null, (C239593Hb) null, (C239633Hj) null, (C239673Ho) null, (C239673Ho) null, (C239613Hd) null, (AnonymousClass3I1) null, (AnonymousClass3IJ) null, (AnonymousClass3ID) null, (C233492vo) null, (AdsIAWRatingInfo) null, (AdsRatingInfo) null, (User) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Float) null, (Float) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null);

    static {
        new 1E9(new 1hu((UserSession) null), 6, false);
    }

    public static final AnonymousClass3HX A00(UserSession userSession, AnonymousClass3HX r10) {
        CarouselRenderingType carouselRenderingType;
        int i;
        Integer num;
        0qQ.A0B(r10, 0);
        0qQ.A0B(userSession, 1);
        List list = r10.A1j;
        if (list == null || !(!list.isEmpty())) {
            LinkedList linkedList = new LinkedList();
            List<AnonymousClass3HX> list2 = r10.A1i;
            LinkedList linkedList2 = null;
            if (list2 != null) {
                for (AnonymousClass3HX r1 : list2) {
                    List list3 = r1.A1j;
                    if (list3 != null) {
                        linkedList.add(00k.A0I(list3));
                        if (list3.size() > 1 && (carouselRenderingType = r1.A01) != CarouselRenderingType.OPT_IN && carouselRenderingType != CarouselRenderingType.DPA && !182.A06(0Tu.A06, userSession, 36317818254071363L)) {
                            0f9 AEf = 0wj.A01.AEf("multiple items received in Multi Advertiser Carousel reel", 817901200);
                            AEf.ABO("numItems", list3.size());
                            IntentAwareAdsInfo intentAwareAdsInfo = r10.A06;
                            if (intentAwareAdsInfo == null || (num = intentAwareAdsInfo.A02) == null) {
                                i = -1;
                            } else {
                                i = num.intValue();
                            }
                            AEf.ABO("multiAdsType", i);
                            AEf.report();
                            return null;
                        }
                    }
                }
            }
            if (!linkedList.isEmpty()) {
                linkedList2 = linkedList;
            }
            if (list2 != null) {
                AnonymousClass4Ip r0 = new AnonymousClass4Ip(r10);
                r0.A1i = linkedList2;
                return r0.A00();
            }
        }
        return r10;
    }

    /* JADX WARNING: type inference failed for: r0v18, types: [java.lang.Object, X.6YJ, X.1Ns] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r1 != null) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.1Ns A01(com.instagram.common.session.UserSession r3, X.AnonymousClass3HX r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r0 = 1
            X.0qQ.A0B(r3, r0)
            X.3I7 r1 = r4.A0A
            if (r1 == 0) goto L_0x0014
            X.6YJ r0 = new X.6YJ
            r0.<init>()
            r0.A00 = r1
            return r0
        L_0x0014:
            com.instagram.user.model.User r1 = r4.A0a
            if (r1 != 0) goto L_0x002b
            java.lang.Integer r1 = A02(r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2 = 0
            if (r1 != r0) goto L_0x0031
            X.1Xj r0 = r4.A0H
            if (r0 == 0) goto L_0x009c
            com.instagram.user.model.User r1 = r0.A2A(r3)
            if (r1 == 0) goto L_0x009c
        L_0x002b:
            X.1Nr r0 = new X.1Nr
            r0.<init>(r1)
            return r0
        L_0x0031:
            java.lang.Integer r1 = A02(r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x009c
            java.lang.Integer r1 = A02(r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x009c
            java.lang.Integer r1 = A02(r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x009c
            java.lang.Integer r1 = A02(r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 == r0) goto L_0x009c
            java.lang.Integer r1 = A02(r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r1 == r0) goto L_0x009c
            java.lang.Integer r1 = A02(r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            if (r1 == r0) goto L_0x009c
            java.lang.Integer r1 = A02(r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            if (r1 == r0) goto L_0x009c
            java.lang.Integer r1 = A02(r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            if (r1 == r0) goto L_0x009c
            java.lang.Integer r1 = A02(r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            if (r1 == r0) goto L_0x009c
            java.lang.Integer r1 = A02(r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A02
            if (r1 == r0) goto L_0x009c
            java.lang.Integer r1 = A02(r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            if (r1 == r0) goto L_0x009c
            java.lang.Integer r1 = A02(r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            if (r1 == r0) goto L_0x009c
            java.lang.Integer r1 = A02(r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A05
            if (r1 == r0) goto L_0x009c
            A02(r4)
        L_0x009c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3P9.A01(com.instagram.common.session.UserSession, X.3HX):X.1Ns");
    }

    public static final String A03(UserSession userSession, AnonymousClass3HX r4) {
        Object obj;
        0qQ.A0B(userSession, 1);
        StringBuilder sb = new StringBuilder();
        String str = r4.A1U;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(' ');
        sb.append(A01(userSession, r4));
        sb.append(' ');
        List list = r4.A1j;
        if (list != null) {
            obj = Integer.valueOf(list.size());
        } else {
            obj = "EMPTY";
        }
        sb.append(obj);
        return sb.toString();
    }

    public static final List A05(AnonymousClass3HX r7) {
        1Xj r0;
        0qQ.A0B(r7, 0);
        ReelType reelType = r7.A0N;
        if (reelType == ReelType.A06 || reelType == ReelType.A0U) {
            ArrayList arrayList = new ArrayList();
            List list = r7.A1j;
            if (list == null) {
                return arrayList;
            }
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                if (!A06(r7).contains(Integer.valueOf(i))) {
                    arrayList.add(next);
                }
                i = i2;
            }
            return arrayList;
        }
        List list2 = r7.A1j;
        if (list2 != null) {
            return list2;
        }
        if (A02(r7) != AnonymousClass05K.A01 || (r0 = r7.A0H) == null) {
            return 0sn.A00;
        }
        List singletonList = Collections.singletonList(r0);
        0qQ.A07(singletonList);
        return singletonList;
    }

    public static final boolean A07(UserSession userSession, AnonymousClass3HX r2) {
        Integer num;
        0qQ.A0B(r2, 0);
        0qQ.A0B(userSession, 1);
        1Ns A01 = A01(userSession, r2);
        if (A01 != null) {
            num = A01.CAm();
        } else {
            num = null;
        }
        if (num == AnonymousClass05K.A04) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r0.getId() != null) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A08(com.instagram.common.session.UserSession r4, X.AnonymousClass3HX r5) {
        /*
            r0 = 1
            X.0qQ.A0B(r4, r0)
            java.lang.String r0 = r5.A1U
            r3 = 1
            if (r0 == 0) goto L_0x0026
            X.1Ns r0 = A01(r4, r5)
            if (r0 == 0) goto L_0x0024
            java.lang.Integer r1 = r0.CAm()
        L_0x0013:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0026
            X.1Ns r0 = A01(r4, r5)
            if (r0 == 0) goto L_0x0026
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x0026
        L_0x0023:
            return r3
        L_0x0024:
            r1 = 0
            goto L_0x0013
        L_0x0026:
            X.3IB r0 = r5.A0J
            if (r0 == 0) goto L_0x0038
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318106016225149(0x8107200003177d, double:3.0310547137110147E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0038
            return r3
        L_0x0038:
            boolean r0 = A07(r4, r5)
            if (r0 != 0) goto L_0x0023
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3P9.A08(com.instagram.common.session.UserSession, X.3HX):boolean");
    }

    public static final Integer A02(AnonymousClass3HX r3) {
        String str = r3.A1W;
        if (str == null) {
            return null;
        }
        Integer num = AnonymousClass05K.A00;
        if (str.equals("ads_bakeoff_survey_in_story")) {
            return num;
        }
        Integer num2 = AnonymousClass05K.A01;
        if (str.equals("ad4ad_in_story")) {
            return num2;
        }
        Integer num3 = AnonymousClass05K.A0C;
        if (str.equals("suggested_users_in_story")) {
            return num3;
        }
        Integer num4 = AnonymousClass05K.A0N;
        if (str.equals("story_survey")) {
            return num4;
        }
        Integer num5 = AnonymousClass05K.A0Y;
        if (str.equals("story_creation_upsell")) {
            return num5;
        }
        Integer num6 = AnonymousClass05K.A0j;
        if (str.equals("suggested_clips_story_netego")) {
            return num6;
        }
        Integer num7 = AnonymousClass05K.A0u;
        if (str.equals("reconsideration_products_for_you_in_story")) {
            return num7;
        }
        Integer num8 = AnonymousClass05K.A15;
        if (str.equals("continue_shopping_in_story")) {
            return num8;
        }
        Integer num9 = AnonymousClass05K.A1F;
        if (str.equals("visit_these_shops_again_in_story")) {
            return num9;
        }
        Integer num10 = AnonymousClass05K.A1I;
        if (str.equals("ig_ads_consent_growth_story_netego")) {
            return num10;
        }
        Integer num11 = AnonymousClass05K.A03;
        if (str.equals("trending_prompts_in_story")) {
            return num11;
        }
        Integer num12 = AnonymousClass05K.A04;
        if (str.equals("ig_insights_story_netego")) {
            return num12;
        }
        Integer num13 = AnonymousClass05K.A05;
        if (str.equals("share_comment_to_story_netego")) {
            return num13;
        }
        Integer num14 = AnonymousClass05K.A06;
        if (str.equals("meta_gallery_stories_netego")) {
            return num14;
        }
        Integer num15 = AnonymousClass05K.A07;
        if (str.equals("threads_in_stories_unit_acquisition")) {
            return num15;
        }
        if (00l.A0d(str, "bloks", false)) {
            return AnonymousClass05K.A02;
        }
        throw new UnsupportedOperationException(002.A0R("Unsupported story netego type: ", str));
    }

    public static final List A04(AnonymousClass3HX r2) {
        if (r2.A0N != ReelType.A04) {
            return null;
        }
        List<1Xj> A05 = A05(r2);
        ArrayList arrayList = new ArrayList(0Yv.A1E(A05, 10));
        for (1Xj A002 : A05) {
            arrayList.add(C250913mG.A00(A002));
        }
        return arrayList;
    }

    public static final Set A06(AnonymousClass3HX r5) {
        if (r5.A0N != ReelType.A06) {
            return 0sl.A00;
        }
        HashSet hashSet = new HashSet();
        List list = r5.A1j;
        if (list == null) {
            return hashSet;
        }
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            Boolean CBE = ((1Xj) next).A0C.CBE();
            if (CBE != null && CBE.booleanValue()) {
                hashSet.add(Integer.valueOf(i));
            }
            i = i2;
        }
        return hashSet;
    }
}
