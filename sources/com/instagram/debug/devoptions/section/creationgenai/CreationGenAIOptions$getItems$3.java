package com.instagram.debug.devoptions.section.creationgenai;

import X.0eS;
import X.0sL;
import X.1Av;
import X.1Hj;
import X.AnonymousClass07a;
import X.AnonymousClass0fD;
import X.AnonymousClass0xx;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C239793Ih;
import X.C239803Ii;
import X.C262224Cq;
import X.C297815sO;
import X.C59689JTv;
import X.C60340gF;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.genai.memu.consentflow.api.MemuCreatorTemplatesConsentGraphQLApi;
import kotlin.coroutines.jvm.internal.DebugMetadata;

public final class CreationGenAIOptions$getItems$3 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ 1Av $userPreferences;
    public final /* synthetic */ UserSession $userSession;

    @DebugMetadata(c = "com.instagram.debug.devoptions.section.creationgenai.CreationGenAIOptions$getItems$3$1", f = "CreationGenAIOptions.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.debug.devoptions.section.creationgenai.CreationGenAIOptions$getItems$3$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass1Ek implements 0sL {
        public int label;

        /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.debug.devoptions.section.creationgenai.CreationGenAIOptions$getItems$3$1, X.4D7] */
        public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r6) {
            return new AnonymousClass1(r4, userSession, fragmentActivity, r6);
        }

        public final Object invoke(C262224Cq r3, AnonymousClass4D7 r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(C60340gF.A00);
        }

        /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.debug.devoptions.section.creationgenai.CreationGenAIOptions$getItems$3$1, X.4D7] */
        public final Object invokeSuspend(Object obj) {
            boolean z;
            1Hj r6 = 1Hj.A02;
            int i = this.label;
            if (i == 0) {
                0eS.A00(obj);
                1Av r3 = r4;
                AnonymousClass7TF.A1J(r3, r3.A1j, 1Av.A8a, 465, false);
                MemuCreatorTemplatesConsentGraphQLApi memuCreatorTemplatesConsentGraphQLApi = MemuCreatorTemplatesConsentGraphQLApi.A00;
                UserSession userSession = userSession;
                this.label = 1;
                obj = memuCreatorTemplatesConsentGraphQLApi.A00(userSession, this);
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

    public CreationGenAIOptions$getItems$3(FragmentActivity fragmentActivity, 1Av r2, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userPreferences = r2;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1814060044);
        AnonymousClass0xx A00 = AnonymousClass07a.A00(this.$activity);
        final 1Av r4 = this.$userPreferences;
        final UserSession userSession = this.$userSession;
        final FragmentActivity fragmentActivity = this.$activity;
        AnonymousClass7TE.A1Z(new AnonymousClass1((AnonymousClass4D7) null), A00);
        AnonymousClass0fD.A0C(394046362, A05);
    }
}
