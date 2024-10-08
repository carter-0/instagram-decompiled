package com.instagram.creator.agent.settings.audience;

import X.0eS;
import X.0sH;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C266444Yx;
import X.C53357Gmh;
import X.C54304H6w;
import X.C54617HLa;
import X.C60340gF;
import X.DbS;
import X.HNK;
import com.instagram.android.R;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creator.agent.settings.audience.AudienceUseCase$uiState$1", f = "AudienceUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AudienceUseCase$uiState$1 extends AnonymousClass1Ek implements 0sH {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ Object A03;
    public /* synthetic */ boolean A04;

    public AudienceUseCase$uiState$1(AnonymousClass4D7 r2) {
        super(6, r2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean A1a = AnonymousClass7TE.A1a(obj4);
        AudienceUseCase$uiState$1 audienceUseCase$uiState$1 = new AudienceUseCase$uiState$1((AnonymousClass4D7) obj6);
        audienceUseCase$uiState$1.A00 = obj;
        audienceUseCase$uiState$1.A01 = obj2;
        audienceUseCase$uiState$1.A02 = obj3;
        audienceUseCase$uiState$1.A04 = A1a;
        audienceUseCase$uiState$1.A03 = obj5;
        return audienceUseCase$uiState$1.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C266444Yx A0Q;
        0eS.A00(obj);
        HNK hnk = (HNK) this.A00;
        Map map = (Map) this.A01;
        C54617HLa hLa = (C54617HLa) this.A02;
        boolean z = this.A04;
        Object obj2 = this.A03;
        boolean z2 = true;
        if (!map.isEmpty()) {
            A0Q = new C54304H6w(new Object[]{new Integer(map.size())}, R.plurals.accounts_selected, map.size());
        } else {
            A0Q = DbS.A0Q(new Object[0], 2131973024);
        }
        if (hnk == obj2) {
            z2 = false;
        }
        int i = 2131972502;
        if (obj2 == HNK.NOBODY) {
            i = 2131975590;
        }
        return new C53357Gmh(A0Q, hLa, hnk, i, z, z2);
    }
}
