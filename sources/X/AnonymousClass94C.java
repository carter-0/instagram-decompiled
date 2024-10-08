package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.ArrayList;

/* renamed from: X.94C  reason: invalid class name */
public abstract class AnonymousClass94C {
    public static final 1Ef A00(UserSession userSession, Integer num, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        String str5 = str;
        0qQ.A0B(str5, 4);
        AnonymousClass0K0 r2 = GraphQlCallInput.A02;
        0Df r7 = null;
        String str6 = str2;
        if (str2 != null) {
            r7 = r2.A02();
            0Df.A00(r7, str6, "max_id");
        }
        if (r7 == null) {
            r7 = r2.A02();
        }
        0Df.A00(r7, 12, "count");
        if (z4) {
            0Df.A00(r7, "true", "opal_only");
        }
        if (z7) {
            0Df.A00(r7, true, "fetch_profile_grid_items");
        }
        0Df.A00(r7, str3, "profile_grid_items_cursor");
        0Df.A00(r7, str4, "pinned_profile_grid_items_ids");
        0Df.A00(r7, String.valueOf(z5), "exclude_comment");
        0Tu r22 = 0Tu.A05;
        UserSession userSession2 = userSession;
        if (182.A06(r22, userSession2, 36323328696396889L)) {
            0Df.A00(r7, true, "can_support_carousel_mentions");
        }
        if (z9) {
            0Df.A00(r7, 1, "is_pull_to_refresh");
        }
        2IS r10 = new 2IS();
        2IS r9 = new 2IS();
        r9.A01("use_defer");
        r9.A01("use_batch_defer");
        String A00 = AnonymousClass000.A00(1501);
        r9.A01(A00);
        r9.A01("fetch_profile_grid_items");
        String A002 = AnonymousClass000.A00(1453);
        r9.A01(A002);
        r10.A04(Dbm.A01(), str5);
        r10.A00.A02().A0E(r7, C273654mx.A00(384));
        r9.A02("use_defer", Boolean.valueOf(z));
        r9.A02("use_batch_defer", Boolean.valueOf(z2));
        r9.A02(A00, Boolean.valueOf(z3));
        r9.A02("fetch_profile_grid_items", Boolean.valueOf(z7));
        r9.A02(A002, Boolean.valueOf(z8));
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        1Ef pandoGraphQLRequest = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "IGProfileTimelineByUsernameQuery", r10.getParamsCopy(), r9.getParamsCopy(), C1S.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_api__v1__profile_timeline_by_username", new ArrayList());
        AB7.A01(pandoGraphQLRequest, userSession2, num);
        pandoGraphQLRequest.addTrackedHttpResponseHeader(AnonymousClass000.A00(63));
        if (z6) {
            pandoGraphQLRequest.addAdditionalHttpHeader("x_RESPONSE_SHAPE_LOGGING", String.valueOf(pandoGraphQLRequest.hashCode()));
        }
        if (182.A06(r22, userSession2, 36317341512832047L)) {
            pandoGraphQLRequest = pandoGraphQLRequest.setEnableCacheReadWriteOnCallerThread_DO_NOT_USE(true);
        }
        0qQ.A0A(pandoGraphQLRequest);
        return pandoGraphQLRequest;
    }

    public static final 1Ef A01(UserSession userSession, Integer num, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        String str5 = str;
        0qQ.A0B(str5, 4);
        AnonymousClass0K0 r2 = GraphQlCallInput.A02;
        0Df r7 = null;
        String str6 = str2;
        if (str2 != null) {
            r7 = r2.A02();
            0Df.A00(r7, str6, "max_id");
        }
        if (r7 == null) {
            r7 = r2.A02();
        }
        0Df.A00(r7, 12, "count");
        if (z4) {
            0Df.A00(r7, "true", "opal_only");
        }
        if (z7) {
            0Df.A00(r7, true, "fetch_profile_grid_items");
        }
        0Df.A00(r7, str3, "profile_grid_items_cursor");
        0Df.A00(r7, str4, "pinned_profile_grid_items_ids");
        0Df.A00(r7, String.valueOf(z5), "exclude_comment");
        0Tu r22 = 0Tu.A05;
        UserSession userSession2 = userSession;
        if (182.A06(r22, userSession2, 36323328696396889L)) {
            0Df.A00(r7, true, "can_support_carousel_mentions");
        }
        if (z9) {
            0Df.A00(r7, 1, "is_pull_to_refresh");
        }
        2IS r10 = new 2IS();
        2IS r9 = new 2IS();
        r9.A02("use_defer", false);
        r9.A02("use_batch_defer", false);
        String A00 = AnonymousClass000.A00(1501);
        r9.A02(A00, false);
        r9.A02("fetch_profile_grid_items", false);
        String A002 = AnonymousClass000.A00(1453);
        r9.A02(A002, false);
        r10.A04(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str5);
        r10.A00.A02().A0E(r7, "_request_data");
        r9.A02("use_defer", Boolean.valueOf(z));
        r9.A02("use_batch_defer", Boolean.valueOf(z2));
        r9.A02(A00, Boolean.valueOf(z3));
        r9.A02("fetch_profile_grid_items", Boolean.valueOf(z7));
        r9.A02(A002, Boolean.valueOf(z8));
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        1Ef pandoGraphQLRequest = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "IGProfileTimelineQuery", r10.getParamsCopy(), r9.getParamsCopy(), C1U.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_api__v1__profile_timeline", new ArrayList());
        AB7.A01(pandoGraphQLRequest, userSession2, num);
        pandoGraphQLRequest.addTrackedHttpResponseHeader(AnonymousClass000.A00(63));
        if (z6) {
            pandoGraphQLRequest.addAdditionalHttpHeader("x_RESPONSE_SHAPE_LOGGING", String.valueOf(pandoGraphQLRequest.hashCode()));
        }
        if (182.A06(r22, userSession2, 36317341512832047L)) {
            pandoGraphQLRequest = pandoGraphQLRequest.setEnableCacheReadWriteOnCallerThread_DO_NOT_USE(true);
        }
        0qQ.A0A(pandoGraphQLRequest);
        return pandoGraphQLRequest;
    }

    public static final 1NY A02(UserSession userSession, Dda dda, G5K g5k, String str) {
        Object[] objArr;
        String str2;
        if (g5k instanceof C46323Dbr) {
            objArr = new Object[]{((C46323Dbr) g5k).A00};
            str2 = "feed/user/%s/";
        } else if (g5k instanceof C46456DfK) {
            objArr = new Object[]{((C46456DfK) g5k).A00};
            str2 = "feed/user/%s/username/";
        } else {
            throw new RuntimeException();
        }
        String A06 = 0mp.A06(str2, objArr);
        1NY r3 = new 1NY(userSession, -2);
        r3.A08(AnonymousClass05K.A0N);
        r3.A0A(A06);
        r3.A0A = 002.A0R(A06, str);
        r3.A02 = new 1NS(new 0bH(userSession), AnonymousClass94D.class);
        if (dda != null) {
            19V.A01.add(new C318436ow(dda));
        }
        return r3;
    }
}
