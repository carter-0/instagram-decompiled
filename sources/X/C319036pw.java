package X;

import android.app.Activity;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.6pw  reason: invalid class name and case insensitive filesystem */
public abstract class C319036pw {
    public static boolean A00;
    public static boolean A01;

    public static final void A00(Activity activity, UserSession userSession) {
        if (!A01 && !A00) {
            0Tu r4 = 0Tu.A06;
            UserSession userSession2 = userSession;
            if (182.A06(r4, userSession2, 36323814027898416L)) {
                Activity activity2 = activity;
                if (!182.A06(r4, userSession2, 36323814027570731L)) {
                    1Wj r0 = 1Wj.A00;
                    if (r0 != null) {
                        r0.A03(userSession2, activity, "333195783095862");
                    }
                } else if (182.A06(r4, userSession2, 36323814027767342L) || 182.A06(r4, userSession2, 36323814027701805L)) {
                    1vn A012 = 1vm.A01(userSession2);
                    2IS r5 = new 2IS();
                    2IS r1 = new 2IS();
                    AnonymousClass2IY r02 = PandoGraphQLRequest.Companion;
                    PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "IGTeenBioEducationQPQuery", r5.getParamsCopy(), r1.getParamsCopy(), BqX.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xig_teen_bio_education_qp", new ArrayList());
                    A012.ATL(DF7.A00, new FSE(activity2, userSession2), pandoGraphQLRequest);
                }
            }
        }
    }
}
