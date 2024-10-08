package X;

import android.content.Context;
import android.os.Parcelable;
import com.facebook.android.maps.model.LatLng;
import com.instagram.api.schemas.AdGeoLocationType;
import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.AdvantageAudienceDataImpl;
import com.instagram.api.schemas.ImmutablePandoAdvantageAudienceData;
import com.instagram.api.schemas.TargetingRelaxationConstants;
import com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.AudienceGender;
import com.instagram.business.promote.model.AudienceGeoLocation;
import com.instagram.business.promote.model.AudienceInterest;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import com.instagram.common.session.UserSession;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class U92 extends 2YL {
    public final XIGIGBoostDestination A00;
    public final C17326VRf A01;
    public final LAF A02;
    public final UserSession A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final C249513ju A07;
    public final AnonymousClass0r6 A08;
    public final AnonymousClass0Ud A09;
    public final boolean A0A;

    public U92(XIGIGBoostDestination xIGIGBoostDestination, C17326VRf vRf, UserSession userSession, String str, String str2, String str3, boolean z) {
        String str4 = str3;
        AnonymousClass7TF.A1F(userSession, 1, str4);
        this.A03 = userSession;
        this.A05 = str;
        this.A04 = str2;
        this.A00 = xIGIGBoostDestination;
        this.A0A = z;
        this.A01 = vRf;
        this.A06 = str4;
        LAF laf = new LAF(this);
        this.A02 = laf;
        AnonymousClass0r6 r3 = laf.A00;
        this.A09 = 10b.A02(new C61068Jw6((C61082JwK) laf.A05.getValue(), (C15053ULv) laf.A01.getValue(), (ULF) laf.A04.getValue(), DbX.A1b(laf.A02), DbX.A1b(laf.A03)), C318116oQ.A00(this), r3, AnonymousClass10A.A00);
        1HR A0f = C13990Tnq.A0f();
        this.A07 = A0f;
        this.A08 = 0u9.A04(A0f);
    }

    public static final UL0 A01(XIGIGBoostDestination xIGIGBoostDestination, C15053ULv uLv, UserSession userSession, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        double d;
        double d2;
        int i;
        String str2;
        C15053ULv uLv2 = uLv;
        0qQ.A0B(uLv2, 0);
        List list = uLv2.A07;
        String str3 = uLv2.A04;
        String str4 = uLv2.A05;
        int i2 = uLv2.A01;
        int i3 = uLv2.A00;
        List<AudienceGender> list2 = uLv2.A06;
        if (list2 != null) {
            arrayList = AnonymousClass7TF.A0p(list2);
            for (AudienceGender audienceGender : list2) {
                arrayList.add(audienceGender.A00);
            }
        } else {
            arrayList = null;
        }
        List<AudienceInterest> list3 = uLv2.A08;
        if (list3 != null) {
            arrayList2 = AnonymousClass7TF.A0p(list3);
            for (AudienceInterest A002 : list3) {
                arrayList2.add(A002.A00());
            }
        } else {
            arrayList2 = null;
        }
        TargetingRelaxationConstants targetingRelaxationConstants = uLv2.A03;
        AdvantageAudienceData advantageAudienceData = uLv2.A02;
        UserSession userSession2 = userSession;
        String str5 = WGU.A00(userSession2).A03;
        0qQ.A07(str5);
        if (list != null) {
            ArrayList arrayList7 = new ArrayList();
            for (Object next : list) {
                A03((AudienceGeoLocation) next, AdGeoLocationType.COUNTRY, next, arrayList7);
            }
            arrayList3 = new ArrayList();
            Iterator it = arrayList7.iterator();
            while (it.hasNext()) {
                A07(arrayList3, it);
            }
            ArrayList arrayList8 = new ArrayList();
            for (Object next2 : list) {
                A03((AudienceGeoLocation) next2, AdGeoLocationType.REGION, next2, arrayList8);
            }
            arrayList4 = new ArrayList();
            Iterator it2 = arrayList8.iterator();
            while (it2.hasNext()) {
                A07(arrayList4, it2);
            }
            ArrayList arrayList9 = new ArrayList();
            for (Object next3 : list) {
                A03((AudienceGeoLocation) next3, AdGeoLocationType.CITY, next3, arrayList9);
            }
            arrayList5 = new ArrayList();
            Iterator it3 = arrayList9.iterator();
            while (it3.hasNext()) {
                A07(arrayList5, it3);
            }
            ArrayList arrayList10 = new ArrayList();
            for (Object next4 : list) {
                A03((AudienceGeoLocation) next4, AdGeoLocationType.ZIP, next4, arrayList10);
            }
            arrayList6 = new ArrayList();
            Iterator it4 = arrayList10.iterator();
            while (it4.hasNext()) {
                A07(arrayList6, it4);
            }
        } else {
            arrayList3 = null;
            arrayList4 = null;
            arrayList5 = null;
            arrayList6 = null;
        }
        AudienceGeoLocation A012 = uLv2.A01();
        if (A012 != null) {
            d = A012.A00;
        } else {
            d = 0.0d;
        }
        AudienceGeoLocation A013 = uLv2.A01();
        if (A013 != null) {
            d2 = A013.A01;
        } else {
            d2 = 0.0d;
        }
        AudienceGeoLocation A014 = uLv2.A01();
        if (A014 != null) {
            i = A014.A02;
        } else {
            i = 0;
        }
        AudienceGeoLocation A015 = uLv2.A01();
        if (A015 != null) {
            str2 = A015.A05;
        } else {
            str2 = null;
        }
        return new UL0(advantageAudienceData, targetingRelaxationConstants, xIGIGBoostDestination, userSession2, str3, str4, str5, str2, str, list, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, 0sn.A00, d, d2, i2, i3, i);
    }

    public final void A0C(XFBTargetingAutomationAdvantageAudienceStatus xFBTargetingAutomationAdvantageAudienceStatus) {
        Object advantageAudienceDataImpl;
        Object value;
        Integer BT2;
        05G r2 = this.A02.A01;
        AdvantageAudienceData advantageAudienceData = ((C15053ULv) r2.getValue()).A02;
        if (advantageAudienceData != null) {
            advantageAudienceData.Aa9();
            Integer BT22 = advantageAudienceData.BT2();
            if (advantageAudienceData instanceof ImmutablePandoAdvantageAudienceData) {
                advantageAudienceDataImpl = C41847B3o.A0o(advantageAudienceData, JTQ.A1b("min_age_constraint", BT22, new 0eP("advantage_audience_status", xFBTargetingAutomationAdvantageAudienceStatus.A00)));
            } else {
                advantageAudienceDataImpl = new AdvantageAudienceDataImpl(xFBTargetingAutomationAdvantageAudienceStatus, BT22);
            }
            AdvantageAudienceData advantageAudienceData2 = (AdvantageAudienceData) advantageAudienceDataImpl;
            Parcelable.Creator creator = PromoteAudienceInfo.CREATOR;
            int i = 13;
            if (xFBTargetingAutomationAdvantageAudienceStatus == XFBTargetingAutomationAdvantageAudienceStatus.ON) {
                int i2 = ((C15053ULv) r2.getValue()).A01;
                AdvantageAudienceData advantageAudienceData3 = ((C15053ULv) r2.getValue()).A02;
                if (advantageAudienceData3 == null || (BT2 = advantageAudienceData3.BT2()) == null) {
                    i = 0;
                } else {
                    i = BT2.intValue();
                }
                if (i2 >= i) {
                    i = i2;
                }
            }
            do {
                value = r2.getValue();
            } while (!r2.AIY(value, C15053ULv.A00(advantageAudienceData2, (TargetingRelaxationConstants) null, (C15053ULv) value, (String) null, (List) null, (List) null, (List) null, i, 0, 763, false)));
        }
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [java.lang.Object, com.instagram.business.promote.model.AudienceGeoLocation] */
    public static final void A02(Context context, U92 u92) {
        Object value;
        ULF ulf;
        ? obj;
        int i;
        W2W w2w = C17149VKb.A00;
        U92 u922 = u92;
        LatLng A002 = W2W.A00(u922.A03);
        05G r4 = u922.A02.A04;
        do {
            value = r4.getValue();
            ulf = (ULF) value;
            double d = A002.A00;
            Double valueOf = Double.valueOf(d);
            double d2 = A002.A01;
            String A0u = DbV.A0u(context, valueOf, Double.valueOf(d2), 2131970326);
            0qQ.A07(A0u);
            AdGeoLocationType adGeoLocationType = AdGeoLocationType.CUSTOM_LOCATION;
            int i2 = u922.A0A().A01;
            obj = new Object();
            obj.A06 = null;
            obj.A05 = A0u;
            obj.A03 = adGeoLocationType;
            obj.A00 = d;
            obj.A01 = d2;
            obj.A02 = i2;
            obj.A04 = null;
            obj.A08 = null;
            obj.A07 = null;
            i = ulf.A00;
        } while (!r4.AIY(value, ULF.A00(ulf.A03, obj, ulf.A05, ulf.A04, i, ulf.A01, ulf.A06)));
    }

    public static void A03(AudienceGeoLocation audienceGeoLocation, Object obj, Object obj2, AbstractCollection abstractCollection) {
        AdGeoLocationType adGeoLocationType = audienceGeoLocation.A03;
        if (adGeoLocationType != null && obj == VAK.A00(adGeoLocationType)) {
            abstractCollection.add(obj2);
        }
    }

    public static final void A05(U92 u92, List list) {
        Object value;
        ULF ulf;
        ArrayList arrayList;
        List list2;
        05G r4 = u92.A02.A04;
        do {
            value = r4.getValue();
            ulf = (ULF) value;
            W2W w2w = C17149VKb.A00;
            arrayList = new ArrayList();
            list2 = list;
            int size = list.size();
            while (true) {
                size--;
                if (size > 0) {
                    AudienceGeoLocation audienceGeoLocation = (AudienceGeoLocation) list.get(size);
                    if (W2W.A03(audienceGeoLocation, list.subList(0, size))) {
                        arrayList.add(audienceGeoLocation);
                    }
                }
            }
        } while (!r4.AIY(value, ULF.A00(ulf.A03, ulf.A02, list2, arrayList, ulf.A00, ulf.A01, ulf.A06)));
    }

    public static final void A06(U92 u92, boolean z) {
        05G r2 = u92.A02.A02;
        do {
        } while (!r2.AIY(r2.getValue(), Boolean.valueOf(z)));
    }

    public final C16678UzE A08() {
        if (this.A04 != null) {
            return C16678UzE.EDIT_AUDIENCE;
        }
        return C16678UzE.CREATE_AUDIENCE;
    }

    public final C15053ULv A09() {
        return (C15053ULv) this.A02.A01.getValue();
    }

    public final ULF A0A() {
        return (ULF) this.A02.A04.getValue();
    }

    /* JADX WARNING: type inference failed for: r15v2, types: [java.lang.Object, com.instagram.business.promote.model.AudienceGeoLocation] */
    public final void A0D(AudienceGeoLocation audienceGeoLocation) {
        Object value;
        ULF ulf;
        AudienceGeoLocation audienceGeoLocation2;
        int i;
        AudienceGeoLocation audienceGeoLocation3;
        05G r6 = this.A02.A04;
        do {
            value = r6.getValue();
            ulf = (ULF) value;
            AudienceGeoLocation audienceGeoLocation4 = audienceGeoLocation;
            if (audienceGeoLocation != null) {
                String str = audienceGeoLocation4.A06;
                String str2 = audienceGeoLocation4.A05;
                AdGeoLocationType adGeoLocationType = audienceGeoLocation4.A03;
                double d = audienceGeoLocation4.A00;
                double d2 = audienceGeoLocation4.A01;
                String str3 = audienceGeoLocation4.A04;
                String str4 = audienceGeoLocation4.A08;
                String str5 = audienceGeoLocation4.A07;
                int i2 = A0A().A01;
                ? obj = new Object();
                obj.A06 = str;
                obj.A05 = str2;
                obj.A03 = adGeoLocationType;
                obj.A00 = d;
                obj.A01 = d2;
                obj.A02 = i2;
                obj.A04 = str3;
                obj.A08 = str4;
                obj.A07 = str5;
                audienceGeoLocation2 = obj;
            } else {
                audienceGeoLocation2 = null;
            }
            i = ulf.A00;
            audienceGeoLocation3 = ulf.A02;
        } while (!r6.AIY(value, ULF.A00(audienceGeoLocation2, audienceGeoLocation3, ulf.A05, ulf.A04, i, ulf.A01, ulf.A06)));
    }

    public final void A0E(C15053ULv uLv) {
        AnonymousClass0r6 A042;
        UL0 A012 = A01(this.A00, uLv, this.A03, this.A05);
        C17326VRf vRf = this.A01;
        vRf.A00 = A012;
        Object obj = vRf.A01.get(A012);
        if (obj != null) {
            A042 = new AnonymousClass05E(new C66188MGz(obj, (AnonymousClass4D7) null, 6, 42));
        } else {
            UserSession userSession = A012.A08;
            String str = A012.A0D;
            if (str == null) {
                str = "";
            }
            XIGIGBoostDestination xIGIGBoostDestination = A012.A07;
            if (xIGIGBoostDestination == null) {
                xIGIGBoostDestination = XIGIGBoostDestination.UNRECOGNIZED;
            }
            0sn r8 = A012.A0E;
            if (r8 == null) {
                r8 = 0sn.A00;
            }
            int i = A012.A03;
            int i2 = A012.A02;
            List list = A012.A0H;
            List list2 = A012.A0I;
            List list3 = A012.A0G;
            List list4 = A012.A0J;
            List list5 = A012.A0F;
            List list6 = A012.A0K;
            TargetingRelaxationConstants targetingRelaxationConstants = A012.A06;
            double d = A012.A00;
            double d2 = A012.A01;
            int i3 = A012.A04;
            String str2 = A012.A09;
            List list7 = list4;
            AdvantageAudienceData advantageAudienceData = A012.A05;
            TargetingRelaxationConstants targetingRelaxationConstants2 = targetingRelaxationConstants;
            XIGIGBoostDestination xIGIGBoostDestination2 = xIGIGBoostDestination;
            A042 = JUM.A04(new C59819JZr((AnonymousClass4D7) null, (Object) vRf, (Object) A012, 16), W2V.A00(advantageAudienceData, targetingRelaxationConstants2, xIGIGBoostDestination2, new AnonymousClass1O9(), userSession, str, str2, A012.A0C, r8, list, list2, list3, list7, list5, list6, d, d2, i, i2, i3).A03(1958324470));
        }
        DbY.A19(this, new C59819JZr((AnonymousClass4D7) null, (Object) this, (Object) A012, 17), A042);
    }

    public final boolean A0F() {
        UserSession userSession = this.A03;
        return W3x.A0M(this.A00, A09(), userSession, this.A0A, false, AnonymousClass7TF.A1V(this.A04));
    }

    public static C15053ULv A00(AnonymousClass0eM r0) {
        return ((U92) r0.getValue()).A09();
    }

    public static final void A04(U92 u92, String str) {
        AnonymousClass7TE.A1Z(new MGE(u92, str, (AnonymousClass4D7) null, 24), C318116oQ.A00(u92));
    }

    public static void A07(AbstractCollection abstractCollection, Iterator it) {
        String str = ((AudienceGeoLocation) it.next()).A06;
        if (str != null) {
            abstractCollection.add(str);
        }
    }

    public final List A0B() {
        AudienceGeoLocation audienceGeoLocation;
        int i = A0A().A00;
        if (i == 0) {
            return A0A().A05;
        }
        if (i == 1) {
            boolean z = A0A().A06;
            ULF A0A2 = A0A();
            if (z) {
                audienceGeoLocation = A0A2.A02;
            } else {
                audienceGeoLocation = A0A2.A03;
            }
            if (audienceGeoLocation != null) {
                return 0sr.A1M(new AudienceGeoLocation[]{audienceGeoLocation});
            }
        }
        return new ArrayList();
    }
}
