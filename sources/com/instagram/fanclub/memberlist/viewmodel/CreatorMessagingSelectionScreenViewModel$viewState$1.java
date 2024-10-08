package com.instagram.fanclub.memberlist.viewmodel;

import X.0eS;
import X.0sH;
import X.0sn;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C48178EaK;
import X.C60340gF;
import X.N4O;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.fanclub.memberlist.viewmodel.CreatorMessagingSelectionScreenViewModel$viewState$1", f = "CreatorMessagingSelectionScreenViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CreatorMessagingSelectionScreenViewModel$viewState$1 extends AnonymousClass1Ek implements 0sH {
    public /* synthetic */ int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ Object A03;
    public /* synthetic */ Object A04;

    public CreatorMessagingSelectionScreenViewModel$viewState$1(AnonymousClass4D7 r2) {
        super(6, r2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int A0M = AnonymousClass7TE.A0M(obj2);
        CreatorMessagingSelectionScreenViewModel$viewState$1 creatorMessagingSelectionScreenViewModel$viewState$1 = new CreatorMessagingSelectionScreenViewModel$viewState$1((AnonymousClass4D7) obj6);
        creatorMessagingSelectionScreenViewModel$viewState$1.A01 = obj;
        creatorMessagingSelectionScreenViewModel$viewState$1.A00 = A0M;
        creatorMessagingSelectionScreenViewModel$viewState$1.A02 = obj3;
        creatorMessagingSelectionScreenViewModel$viewState$1.A03 = obj4;
        creatorMessagingSelectionScreenViewModel$viewState$1.A04 = obj5;
        return creatorMessagingSelectionScreenViewModel$viewState$1.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        0sn r2 = (List) this.A01;
        int i = this.A00;
        List list = (List) this.A02;
        C48178EaK eaK = (C48178EaK) this.A03;
        Map map = (Map) this.A04;
        if (r2 == null) {
            r2 = 0sn.A00;
        }
        return new N4O(eaK, (List) r2, list, map, i);
    }
}
