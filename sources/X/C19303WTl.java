package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.api.schemas.AdGeoLocationType;
import com.instagram.api.schemas.TargetingRelaxationConstants;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.archive.fragment.ArchiveReelMapFragment;
import com.instagram.business.promote.model.AudienceGender;
import com.instagram.business.promote.model.AudienceGeoLocation;
import com.instagram.business.promote.model.AudienceInterest;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.LocationSearchFragment;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.WTl  reason: case insensitive filesystem */
public final class C19303WTl implements 0mK {
    public final int A00;
    public final Object A01;

    public C19303WTl(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onDebouncedValue(Object obj) {
        C15421UcX ucX;
        C18784W1k w1k;
        1OC r0;
        AnonymousClass1O9 r3;
        1NY r2;
        Class cls;
        Class cls2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str;
        double d;
        double d2;
        int i;
        SearchEditText searchEditText;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                ArchiveReelMapFragment archiveReelMapFragment = (ArchiveReelMapFragment) this.A01;
                WFU wfu = archiveReelMapFragment.mFacebookMap;
                if (wfu != null) {
                    ArchiveReelMapFragment.A00(wfu.A02(), archiveReelMapFragment);
                    return;
                }
                return;
            case 1:
                w1k = (C18784W1k) this.A01;
                C18601Vuu vuu = (C18601Vuu) obj2;
                C18601Vuu vuu2 = w1k.A01;
                if (vuu2 == C18601Vuu.A02 || !vuu2.equals(vuu)) {
                    w1k.A01 = vuu;
                    w1k.A0A.A00();
                    C18601Vuu vuu3 = w1k.A01;
                    ucX = vuu3.A00;
                    String str2 = vuu3.A01;
                    r3 = w1k.A06.A00;
                    UserSession userSession = w1k.A08;
                    String str3 = w1k.A03.A1A;
                    r2 = DbU.A0N(userSession);
                    C13990Tnq.A1C(r2, "ads/promote/unified_location_typeahead/", str3);
                    r2.A9m("query", str2);
                    cls = UX9.class;
                    cls2 = C18160Vma.class;
                    break;
                } else {
                    return;
                }
                break;
            case 2:
                w1k = (C18784W1k) this.A01;
                C18601Vuu vuu4 = (C18601Vuu) obj2;
                C18601Vuu vuu5 = w1k.A00;
                if (vuu5 == C18601Vuu.A02 || !vuu5.equals(vuu4)) {
                    w1k.A00 = vuu4;
                    w1k.A09.A00();
                    C18601Vuu vuu6 = w1k.A00;
                    ucX = vuu6.A00;
                    String str4 = vuu6.A01;
                    r3 = w1k.A05.A00;
                    r2 = DbU.A0N(w1k.A08);
                    r2.A0A("ads/promote/interest_typeahead/");
                    r2.A9m("fb_auth_token", "");
                    r2.A9m("query", str4);
                    cls = UX8.class;
                    cls2 = C18158VmY.class;
                    break;
                } else {
                    return;
                }
                break;
            case 3:
                C18598Vup vup = (C18598Vup) obj2;
                0qQ.A0B(vup, 0);
                C18761Vzw vzw = (C18761Vzw) this.A01;
                if (0qQ.A0K(vzw.A00, C18598Vup.A01) || !0qQ.A0K(vzw.A00, vup)) {
                    vzw.A00 = vup;
                    PromoteAudienceInfo promoteAudienceInfo = vup.A00;
                    if (promoteAudienceInfo != null) {
                        vzw.A0A.A00();
                        w1k = vzw.A06;
                        int i2 = promoteAudienceInfo.A01;
                        int i3 = promoteAudienceInfo.A00;
                        PromoteData promoteData = vzw.A08;
                        String str5 = promoteData.A1S;
                        XIGIGBoostDestination xIGIGBoostDestination = promoteData.A0i;
                        UserSession userSession2 = promoteData.A0y;
                        0qQ.A06(userSession2);
                        ArrayList A0J = W3x.A0J(promoteData.A0i, userSession2, promoteData.A2e);
                        List<AudienceGender> list = promoteAudienceInfo.A06;
                        List list2 = promoteAudienceInfo.A07;
                        List<AudienceInterest> list3 = promoteAudienceInfo.A08;
                        TargetingRelaxationConstants targetingRelaxationConstants = promoteAudienceInfo.A03;
                        AnonymousClass1O8 r6 = vzw.A09;
                        ucX = new C15421UcX(WGU.A00(promoteData.A0y), vzw, promoteAudienceInfo);
                        ArrayList arrayList5 = new ArrayList();
                        if (!AnonymousClass4KJ.A00(list)) {
                            for (AudienceGender audienceGender : list) {
                                arrayList5.add(audienceGender.A00);
                            }
                        } else {
                            arrayList5 = null;
                        }
                        if (AnonymousClass4KJ.A00(list2)) {
                            arrayList4 = null;
                            arrayList3 = null;
                            arrayList2 = null;
                            arrayList = null;
                            str = null;
                            d = 0.0d;
                            d2 = 0.0d;
                            i = 0;
                        } else if (list2.size() == 1 && ((AudienceGeoLocation) list2.get(0)).A03 != null && VAK.A00(((AudienceGeoLocation) list2.get(0)).A03) == AdGeoLocationType.CUSTOM_LOCATION) {
                            AudienceGeoLocation audienceGeoLocation = (AudienceGeoLocation) list2.get(0);
                            d = audienceGeoLocation.A00;
                            d2 = audienceGeoLocation.A01;
                            i = audienceGeoLocation.A02;
                            str = audienceGeoLocation.A05;
                            arrayList4 = null;
                            arrayList3 = null;
                            arrayList2 = null;
                            arrayList = null;
                        } else {
                            arrayList4 = W3x.A0I(AdGeoLocationType.COUNTRY, list2);
                            arrayList3 = W3x.A0I(AdGeoLocationType.REGION, list2);
                            arrayList2 = W3x.A0I(AdGeoLocationType.CITY, list2);
                            arrayList = W3x.A0I(AdGeoLocationType.ZIP, list2);
                            str = null;
                            d = 0.0d;
                            d2 = 0.0d;
                            i = 0;
                        }
                        ArrayList arrayList6 = new ArrayList();
                        if (!AnonymousClass4KJ.A00(list3)) {
                            for (AudienceInterest A002 : list3) {
                                arrayList6.add(A002.A00());
                            }
                        } else {
                            arrayList6 = null;
                        }
                        AnonymousClass1O9 r12 = r6.A00;
                        UserSession userSession3 = w1k.A08;
                        String str6 = w1k.A02.A03;
                        r0 = W2V.A00(w1k.A03.A0q.A02, targetingRelaxationConstants, xIGIGBoostDestination, r12, userSession3, str5, str, str6, A0J, arrayList5, arrayList6, arrayList4, arrayList3, arrayList2, arrayList, d, d2, i2, i3, i);
                        ucX.A02 = W2x.A01("/api/v1/ads/promote/audience_potential_reach_v2/");
                        break;
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    return;
                }
                break;
            default:
                Boolean bool = (Boolean) obj2;
                LocationSearchFragment locationSearchFragment = (LocationSearchFragment) this.A01;
                if (locationSearchFragment.isResumed() && locationSearchFragment.mSearchEditText != null) {
                    boolean booleanValue = bool.booleanValue();
                    Context context = locationSearchFragment.getContext();
                    if (booleanValue && (searchEditText = locationSearchFragment.mSearchEditText) != null) {
                        0nA.A0Q(searchEditText);
                    } else if (context instanceof Activity) {
                        0nA.A0N(((Activity) context).getCurrentFocus());
                    }
                    SearchEditText searchEditText2 = locationSearchFragment.mSearchEditText;
                    if (booleanValue) {
                        0nA.A0Q(searchEditText2);
                        return;
                    } else {
                        0nA.A0N(searchEditText2);
                        return;
                    }
                } else {
                    return;
                }
        }
        r2.A0R(cls, cls2);
        r2.A00 = r3;
        r0 = r2.A0M();
        C18784W1k.A02(w1k, ucX, r0);
    }
}
