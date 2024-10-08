package com.instagram.debug.devoptions.section.aiagents;

import X.0sr;
import X.1vm;
import X.2IS;
import X.AnonymousClass000;
import X.AnonymousClass07i;
import X.AnonymousClass4DH;
import X.AnonymousClass7TG;
import X.C42690Bgn;
import X.C50989Fmc;
import X.DbU;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.ArrayList;
import java.util.List;

public final class AiAgentsOptions implements DeveloperOptionsSection {
    public static final AiAgentsOptions INSTANCE = new Object();

    /* access modifiers changed from: private */
    public final void resetAiAgentsCharacterNuxOnServer(UserSession userSession, Context context) {
        2IS r3 = new 2IS();
        2IS r2 = new 2IS();
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(DbU.A0J(r3, AnonymousClass000.A00(725), AnonymousClass000.A00(2305)), "ConsentStatusResetMutation", r3.getParamsCopy(), r2.getParamsCopy(), C42690Bgn.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_messenger_gen_ai_nux_consent_status_reset", new ArrayList());
        Context context2 = context;
        1vm.A01(userSession).ATL(new AiAgentsOptions$resetAiAgentsCharacterNuxOnServer$2(context2), new AiAgentsOptions$resetAiAgentsCharacterNuxOnServer$1(context2), pandoGraphQLRequest);
    }

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r19, AnonymousClass07i r20) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1N(userSession2, fragmentActivity2);
        return 0sr.A1P(new C50989Fmc[]{new C50989Fmc((Context) fragmentActivity2, (View.OnClickListener) new AiAgentsOptions$getItems$1(userSession2, fragmentActivity2), (CharSequence) fragmentActivity2.getString(2131957694)), new C50989Fmc((Context) fragmentActivity2, (View.OnClickListener) new AiAgentsOptions$getItems$2(userSession2, fragmentActivity2), (CharSequence) fragmentActivity2.getString(2131957693)), new C50989Fmc((Context) fragmentActivity2, (View.OnClickListener) new AiAgentsOptions$getItems$3(userSession2, fragmentActivity2), (CharSequence) fragmentActivity2.getString(2131957697)), new C50989Fmc((Context) fragmentActivity2, (View.OnClickListener) new AiAgentsOptions$getItems$4(userSession2, fragmentActivity2), (CharSequence) fragmentActivity2.getString(2131957704)), new C50989Fmc((Context) fragmentActivity2, (View.OnClickListener) new AiAgentsOptions$getItems$5(userSession2, fragmentActivity2), (CharSequence) fragmentActivity2.getString(2131957703)), new C50989Fmc((Context) fragmentActivity2, (View.OnClickListener) new AiAgentsOptions$getItems$6(userSession2, fragmentActivity2), (CharSequence) fragmentActivity2.getString(2131957695)), new C50989Fmc((Context) fragmentActivity2, (View.OnClickListener) new AiAgentsOptions$getItems$7(userSession2, fragmentActivity2), (CharSequence) fragmentActivity2.getString(2131957696)), new C50989Fmc((Context) fragmentActivity2, (View.OnClickListener) new AiAgentsOptions$getItems$8(userSession2, fragmentActivity2), (CharSequence) fragmentActivity2.getString(2131957701)), new C50989Fmc((Context) fragmentActivity2, (View.OnClickListener) new AiAgentsOptions$getItems$9(userSession2, fragmentActivity2), (CharSequence) fragmentActivity2.getString(2131957702)), new C50989Fmc((Context) fragmentActivity2, (View.OnClickListener) new AiAgentsOptions$getItems$10(userSession2, fragmentActivity2), (CharSequence) fragmentActivity2.getString(2131957705)), new C50989Fmc((Context) fragmentActivity2, (View.OnClickListener) new AiAgentsOptions$getItems$11(fragmentActivity2, userSession2), (CharSequence) fragmentActivity2.getString(2131957692)), new C50989Fmc((Context) fragmentActivity2, (View.OnClickListener) new AiAgentsOptions$getItems$12(userSession2, fragmentActivity2), (CharSequence) fragmentActivity2.getString(2131957706))});
    }

    public int getTitleRes() {
        return 2131957707;
    }
}
