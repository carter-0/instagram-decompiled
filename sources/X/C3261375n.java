package X;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.75n  reason: invalid class name and case insensitive filesystem */
public final class C3261375n implements C252243on {
    public final Activity A00;
    public final UserSession A01;
    public final C3261475o A02;
    public final C3261875s A03;
    public final AnonymousClass75v A04;
    public final AnonymousClass7IJ A05;
    public final List A06;

    public final /* synthetic */ void ADC(View view) {
    }

    public final void D6z(View view) {
        0qQ.A0B(view, 0);
        C3261475o r3 = this.A02;
        r3.A00 = new C377089Km(this, 14);
        r3.A01.A01(r3.A03, 2Kb.class);
        AnonymousClass7IJ r1 = this.A05;
        if (!r1.A00()) {
            if (182.A06(0Tu.A05, r1.A00, 36318535512824032L)) {
                AnonymousClass75v r5 = this.A04;
                List list = this.A06;
                C74193PqZ pqZ = new C74193PqZ(this, 12);
                Object obj = r5.A01.get(Integer.valueOf(list.hashCode()));
                if (obj != null) {
                    pqZ.invoke(new 0eR(obj));
                    return;
                }
                C3262075u r2 = r5.A00;
                J6W j6w = new J6W(42, pqZ, list, r5);
                2IS r52 = new 2IS();
                2IS r4 = new 2IS();
                ImmutableList copyOf = ImmutableList.copyOf((Collection) list);
                r52.A05("user_ids", copyOf);
                boolean z = false;
                if (copyOf != null) {
                    z = true;
                }
                17k.A0E(z);
                AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
                PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "IGSocialAvatarStickersEligibilityQuery", r52.getParamsCopy(), r4.getParamsCopy(), BqV.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_social_avatar_stickers_eligibility", new ArrayList());
                r2.A00.ATL(new C45913DEt(j6w), new DFF(j6w), pandoGraphQLRequest);
            }
        }
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public /* synthetic */ C3261375n(Activity activity, UserSession userSession, List list) {
        C3261475o r5 = (C3261475o) userSession.A01(C3261475o.class, new MMO(userSession, 17));
        C3261875s r3 = new C3261875s(userSession);
        AnonymousClass75v r2 = (AnonymousClass75v) userSession.A01(AnonymousClass75v.class, new MMO(new C3262075u(userSession, 1vm.A01(userSession)), 19));
        AnonymousClass7IJ r1 = new AnonymousClass7IJ(userSession);
        0qQ.A0B(r5, 4);
        0qQ.A0B(r2, 6);
        this.A01 = userSession;
        this.A06 = list;
        this.A00 = activity;
        this.A02 = r5;
        this.A03 = r3;
        this.A04 = r2;
        this.A05 = r1;
    }

    public final void onDestroyView() {
        C3261475o r3 = this.A02;
        r3.A00 = null;
        r3.A01.A02(r3.A03, 2Kb.class);
    }
}
