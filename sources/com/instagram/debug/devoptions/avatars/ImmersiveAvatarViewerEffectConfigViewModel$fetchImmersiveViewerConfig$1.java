package com.instagram.debug.devoptions.avatars;

import X.05G;
import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass00P;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C239793Ih;
import X.C239803Ii;
import X.C262224Cq;
import X.C297815sO;
import X.C41845B3m;
import X.C60340gF;
import X.C60900JtK;
import X.C61272K0h;
import X.Dba;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerEffectConfigViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerEffectConfigViewModel$fetchImmersiveViewerConfig$1", f = "ImmersiveAvatarViewerEffectConfigViewModel.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
public final class ImmersiveAvatarViewerEffectConfigViewModel$fetchImmersiveViewerConfig$1 extends AnonymousClass1Ek implements 0sL {
    public int label;
    public final /* synthetic */ ImmersiveAvatarViewerEffectConfigViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImmersiveAvatarViewerEffectConfigViewModel$fetchImmersiveViewerConfig$1(ImmersiveAvatarViewerEffectConfigViewModel immersiveAvatarViewerEffectConfigViewModel, AnonymousClass4D7 r3) {
        super(2, r3);
        this.this$0 = immersiveAvatarViewerEffectConfigViewModel;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerEffectConfigViewModel$fetchImmersiveViewerConfig$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
        return new ImmersiveAvatarViewerEffectConfigViewModel$fetchImmersiveViewerConfig$1(this.this$0, r4);
    }

    public final Object invoke(C262224Cq r3, AnonymousClass4D7 r4) {
        return new ImmersiveAvatarViewerEffectConfigViewModel$fetchImmersiveViewerConfig$1(this.this$0, r4).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerEffectConfigViewModel$fetchImmersiveViewerConfig$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r2 = 1Hj.A02;
        int i = this.label;
        if (i == 0) {
            0eS.A00(obj);
            ImmersiveAvatarViewerEffectConfigViewModel immersiveAvatarViewerEffectConfigViewModel = this.this$0;
            ImmersiveAvatarConfigRepository immersiveAvatarConfigRepository = immersiveAvatarViewerEffectConfigViewModel.repository;
            UserSession userSession = immersiveAvatarViewerEffectConfigViewModel.userSession;
            this.label = 1;
            obj = immersiveAvatarConfigRepository.createImmersiveAvatarHomeConfigRequest(userSession, this);
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            0eS.A00(obj);
        } else {
            throw AnonymousClass7TE.A0x();
        }
        Object obj2 = (C239803Ii) obj;
        ImmersiveAvatarViewerEffectConfigViewModel immersiveAvatarViewerEffectConfigViewModel2 = this.this$0;
        if (obj2 instanceof C239793Ih) {
            05G r22 = immersiveAvatarViewerEffectConfigViewModel2._effectConfig;
            C60900JtK jtK = ((C61272K0h) ((C239793Ih) obj2).A00).A00;
            if (jtK == null) {
                C41845B3m.A0v();
                throw AnonymousClass00P.createAndThrow();
            }
            obj2 = Dba.A0S(new ImmersiveAvatarViewerEffectConfigViewModel.EffectConfigViewState(true, jtK.A00), r22);
        } else if (!(obj2 instanceof C297815sO)) {
            throw AnonymousClass7TE.A1K();
        }
        ImmersiveAvatarViewerEffectConfigViewModel immersiveAvatarViewerEffectConfigViewModel3 = this.this$0;
        if (!(obj2 instanceof C239793Ih)) {
            if (obj2 instanceof C297815sO) {
                immersiveAvatarViewerEffectConfigViewModel3._effectConfig.Epw(new ImmersiveAvatarViewerEffectConfigViewModel.EffectConfigViewState(true, (String) null));
            } else {
                throw AnonymousClass7TE.A1K();
            }
        }
        return C60340gF.A00;
    }
}
