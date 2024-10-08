package com.instagram.debug.devoptions.section.quickpromotion;

import X.0nY;
import X.0qQ;
import X.19E;
import X.2c2;
import X.AnonymousClass0fD;
import X.AnonymousClass12W;
import X.AnonymousClass19S;
import X.AnonymousClass2bO;
import X.AnonymousClass4CZ;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C249803kO;
import X.C283935Jx;
import X.C283955Jz;
import X.C47806EHs;
import X.C59689JTv;
import X.MHD;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.quickpromotion.sdk.QPSdkModule;
import com.facebook.quickpromotion.sdk.controllers.QPSdkOnDemandSurfaceController;
import com.facebook.quickpromotion.sdk.controllers.QPSdkSurfaceControllerManager;
import com.google.common.collect.ImmutableCollection;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.sdk.InstagramQpSdkModule;
import java.util.Iterator;
import java.util.List;

public final class QuickPromotionOptions$getItems$2 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public QuickPromotionOptions$getItems$2(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(687832156);
        AnonymousClass2bO.A00();
        UserSession userSession = this.$userSession;
        0qQ.A0B(userSession, 0);
        C283935Jx A00 = C283935Jx.A03.A00();
        C283955Jz r1 = A00.A01;
        synchronized (r1) {
            r1.A01.clear();
            List list = r1.A00;
            0qQ.A0A(list);
            list.clear();
        }
        0nY.A00().ATE(new C47806EHs(A00));
        InstagramQpSdkModule A002 = 2c2.A00(userSession);
        synchronized (A002) {
            QPSdkModule qPSdkModule = (QPSdkModule) A002.A03.getValue();
            synchronized (qPSdkModule) {
                Iterator A0v = AnonymousClass7TF.A0v(qPSdkModule.A03);
                loop0:
                while (A0v.hasNext()) {
                    C249803kO it = ((ImmutableCollection) ((QPSdkSurfaceControllerManager) A0v.next()).A00.values()).iterator();
                    0qQ.A07(it);
                    while (true) {
                        if (it.hasNext()) {
                            QPSdkOnDemandSurfaceController qPSdkOnDemandSurfaceController = (QPSdkOnDemandSurfaceController) it.next();
                            AnonymousClass4CZ r12 = AnonymousClass12W.A00;
                            synchronized (qPSdkOnDemandSurfaceController) {
                                qPSdkOnDemandSurfaceController.A04.clear();
                                AnonymousClass19S A02 = 19E.A02(r12);
                                AnonymousClass7TE.A1Z(new MHD((Object) A02, (Object) qPSdkOnDemandSurfaceController, (AnonymousClass4D7) null, 5), A02);
                            }
                        }
                    }
                }
            }
        }
        C59689JTv.A06(this.$activity, 2131958187);
        AnonymousClass0fD.A0C(695157943, A05);
    }
}
