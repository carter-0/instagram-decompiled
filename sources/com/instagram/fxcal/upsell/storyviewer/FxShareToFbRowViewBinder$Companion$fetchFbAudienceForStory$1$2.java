package com.instagram.fxcal.upsell.storyviewer;

import X.0eS;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.C14625TzX;
import X.C363388je;
import X.C59719JVd;
import X.C60340gF;
import X.C63768L6a;
import X.JTQ;
import X.LEH;
import X.LSZ;
import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.fxcal.upsell.storyviewer.FxShareToFbRowViewBinder$Companion$fetchFbAudienceForStory$1$2", f = "FxShareToFbRowViewBinder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FxShareToFbRowViewBinder$Companion$fetchFbAudienceForStory$1$2 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C63768L6a A03;
    public final /* synthetic */ LEH A04;
    public final /* synthetic */ ReelDashboardFragment A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FxShareToFbRowViewBinder$Companion$fetchFbAudienceForStory$1$2(Context context, AnonymousClass4DH r3, UserSession userSession, C63768L6a l6a, LEH leh, ReelDashboardFragment reelDashboardFragment, AnonymousClass4D7 r8, boolean z) {
        super(2, r8);
        this.A00 = context;
        this.A04 = leh;
        this.A03 = l6a;
        this.A01 = r3;
        this.A02 = userSession;
        this.A05 = reelDashboardFragment;
        this.A06 = z;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.fxcal.upsell.storyviewer.FxShareToFbRowViewBinder$Companion$fetchFbAudienceForStory$1$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        Context context = this.A00;
        LEH leh = this.A04;
        return new FxShareToFbRowViewBinder$Companion$fetchFbAudienceForStory$1$2(context, this.A01, this.A02, this.A03, leh, this.A05, r11, this.A06);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FxShareToFbRowViewBinder$Companion$fetchFbAudienceForStory$1$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        CallerContext callerContext = C59719JVd.A01;
        Context context = this.A00;
        LEH leh = this.A04;
        C63768L6a l6a = this.A03;
        AnonymousClass4DH r3 = this.A01;
        UserSession userSession = this.A02;
        ReelDashboardFragment reelDashboardFragment = this.A05;
        boolean z = this.A06;
        l6a.A01 = true;
        LSZ.A00(context, r3, userSession, C363388je.A00(userSession).A00(C59719JVd.A01), l6a, leh, reelDashboardFragment);
        C14625TzX tzX = reelDashboardFragment.mListAdapter;
        if (tzX != null) {
            tzX.A07();
        }
        JTQ.A1I(leh.A00());
        LSZ.A01(context, r3, userSession, l6a, leh, reelDashboardFragment, z, true);
        return C60340gF.A00;
    }
}
