package com.instagram.creator.agent.settings.audience;

import X.0eS;
import X.0qQ;
import X.0sH;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass62P;
import X.AnonymousClass62Q;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C53400GnX;
import X.C54617HLa;
import X.C60340gF;
import X.C61073JwB;
import X.C61082JwK;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creator.agent.settings.audience.SelectAccountsUseCase$uiState$1", f = "SelectAccountsUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SelectAccountsUseCase$uiState$1 extends AnonymousClass1Ek implements 0sH {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ Object A03;
    public /* synthetic */ Object A04;

    public SelectAccountsUseCase$uiState$1(AnonymousClass4D7 r2) {
        super(6, r2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        SelectAccountsUseCase$uiState$1 selectAccountsUseCase$uiState$1 = new SelectAccountsUseCase$uiState$1((AnonymousClass4D7) obj6);
        selectAccountsUseCase$uiState$1.A00 = obj;
        selectAccountsUseCase$uiState$1.A01 = obj2;
        selectAccountsUseCase$uiState$1.A02 = obj3;
        selectAccountsUseCase$uiState$1.A03 = obj4;
        selectAccountsUseCase$uiState$1.A04 = obj5;
        return selectAccountsUseCase$uiState$1.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        Map map = (Map) this.A00;
        List list = (List) this.A01;
        List<C61073JwB> list2 = (List) this.A02;
        C54617HLa hLa = (C54617HLa) this.A03;
        C54617HLa hLa2 = (C54617HLa) this.A04;
        Collection<C61073JwB> values = map.values();
        ArrayList A0p = AnonymousClass7TF.A0p(values);
        for (C61073JwB jwB : values) {
            0qQ.A0B(jwB, 0);
            A0p.add(new C61082JwK(jwB, true));
        }
        AnonymousClass62P A002 = AnonymousClass62Q.A00(A0p);
        ArrayList<C61073JwB> A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (!map.containsKey(((C61073JwB) next).A02)) {
                A1C.add(next);
            }
        }
        ArrayList A0p2 = AnonymousClass7TF.A0p(A1C);
        for (C61073JwB jwB2 : A1C) {
            0qQ.A0B(jwB2, 0);
            A0p2.add(new C61082JwK(jwB2, false));
        }
        AnonymousClass62P A003 = AnonymousClass62Q.A00(A0p2);
        ArrayList A0p3 = AnonymousClass7TF.A0p(list2);
        for (C61073JwB jwB3 : list2) {
            A0p3.add(new C61082JwK(jwB3, map.containsKey(jwB3.A02)));
        }
        return new C53400GnX(hLa, hLa2, A002, A003, AnonymousClass62Q.A00(A0p3));
    }
}
