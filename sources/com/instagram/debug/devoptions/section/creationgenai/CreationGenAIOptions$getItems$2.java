package com.instagram.debug.devoptions.section.creationgenai;

import X.0eS;
import X.0sL;
import X.0sr;
import X.1Hj;
import X.AnonymousClass07a;
import X.AnonymousClass0fD;
import X.AnonymousClass0xx;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C239793Ih;
import X.C239803Ii;
import X.C262224Cq;
import X.C297815sO;
import X.C362088hK;
import X.C59689JTv;
import X.C60340gF;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.genai.magicmod.consentflow.api.MagicModConsentGraphQLApi;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

public final class CreationGenAIOptions$getItems$2 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    @DebugMetadata(c = "com.instagram.debug.devoptions.section.creationgenai.CreationGenAIOptions$getItems$2$1", f = "CreationGenAIOptions.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.debug.devoptions.section.creationgenai.CreationGenAIOptions$getItems$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass1Ek implements 0sL {
        public int label;

        /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.debug.devoptions.section.creationgenai.CreationGenAIOptions$getItems$2$1, X.4D7] */
        public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r5) {
            return new AnonymousClass1(userSession, fragmentActivity, r5);
        }

        public final Object invoke(C262224Cq r3, AnonymousClass4D7 r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(C60340gF.A00);
        }

        /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.debug.devoptions.section.creationgenai.CreationGenAIOptions$getItems$2$1, X.4D7] */
        public final Object invokeSuspend(Object obj) {
            boolean z;
            1Hj r6 = 1Hj.A02;
            int i = this.label;
            if (i == 0) {
                0eS.A00(obj);
                MagicModConsentGraphQLApi magicModConsentGraphQLApi = MagicModConsentGraphQLApi.A00;
                UserSession userSession = userSession;
                List A1P = 0sr.A1P(new C362088hK[]{C362088hK.A09, C362088hK.A0B});
                this.label = 1;
                obj = magicModConsentGraphQLApi.A01(userSession, A1P, this, false);
                if (obj == r6) {
                    return r6;
                }
            } else if (i == 1) {
                0eS.A00(obj);
            } else {
                throw AnonymousClass7TE.A0x();
            }
            C239803Ii r8 = (C239803Ii) obj;
            if (r8 instanceof C239793Ih) {
                z = ((C239793Ih) r8).A00;
            } else if (r8 instanceof C297815sO) {
                z = false;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            int i2 = 2131958095;
            if (AnonymousClass7TE.A1a(z)) {
                i2 = 2131958096;
            }
            C59689JTv.A07(fragmentActivity, i2);
            return C60340gF.A00;
        }
    }

    public CreationGenAIOptions$getItems$2(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-650677962);
        AnonymousClass0xx A00 = AnonymousClass07a.A00(this.$activity);
        final UserSession userSession = this.$userSession;
        final FragmentActivity fragmentActivity = this.$activity;
        AnonymousClass7TE.A1Z(new AnonymousClass1((AnonymousClass4D7) null), A00);
        AnonymousClass0fD.A0C(1716092220, A05);
    }
}
