package com.instagram.business.promote.viewmodel;

import X.0eS;
import X.0sH;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C15053ULv;
import X.C60340gF;
import X.C61068Jw6;
import X.C61082JwK;
import X.ULF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.business.promote.viewmodel.BoostCreateAudienceViewModel$UiMutableState$flow$3", f = "BoostCreateAudienceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BoostCreateAudienceViewModel$UiMutableState$flow$3 extends AnonymousClass1Ek implements 0sH {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ boolean A03;
    public /* synthetic */ boolean A04;

    public BoostCreateAudienceViewModel$UiMutableState$flow$3(AnonymousClass4D7 r2) {
        super(6, r2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean A1a = AnonymousClass7TE.A1a(obj4);
        boolean A1a2 = AnonymousClass7TE.A1a(obj5);
        BoostCreateAudienceViewModel$UiMutableState$flow$3 boostCreateAudienceViewModel$UiMutableState$flow$3 = new BoostCreateAudienceViewModel$UiMutableState$flow$3((AnonymousClass4D7) obj6);
        boostCreateAudienceViewModel$UiMutableState$flow$3.A00 = obj;
        boostCreateAudienceViewModel$UiMutableState$flow$3.A01 = obj2;
        boostCreateAudienceViewModel$UiMutableState$flow$3.A02 = obj3;
        boostCreateAudienceViewModel$UiMutableState$flow$3.A03 = A1a;
        boostCreateAudienceViewModel$UiMutableState$flow$3.A04 = A1a2;
        return boostCreateAudienceViewModel$UiMutableState$flow$3.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        return new C61068Jw6((C61082JwK) this.A01, (C15053ULv) this.A00, (ULF) this.A02, this.A03, this.A04);
    }
}
