package com.instagram.shopping.service.destination.reconsideration;

import X.0eS;
import X.0sI;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C60340gF;
import X.C61069Jw7;
import X.C61074JwC;
import X.C64142LQe;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.shopping.service.destination.reconsideration.ShoppingReconsiderationDestinationFeedService$observeFeed$1", f = "ShoppingReconsiderationDestinationFeedService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ShoppingReconsiderationDestinationFeedService$observeFeed$1 extends AnonymousClass1Ek implements 0sI {
    public /* synthetic */ int A00;
    public /* synthetic */ int A01;
    public /* synthetic */ int A02;
    public /* synthetic */ Object A03;
    public final /* synthetic */ C64142LQe A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShoppingReconsiderationDestinationFeedService$observeFeed$1(C64142LQe lQe, AnonymousClass4D7 r3) {
        super(5, r3);
        this.A04 = lQe;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int A0M = AnonymousClass7TE.A0M(obj2);
        int A0M2 = AnonymousClass7TE.A0M(obj3);
        int A0M3 = AnonymousClass7TE.A0M(obj4);
        ShoppingReconsiderationDestinationFeedService$observeFeed$1 shoppingReconsiderationDestinationFeedService$observeFeed$1 = new ShoppingReconsiderationDestinationFeedService$observeFeed$1(this.A04, (AnonymousClass4D7) obj5);
        shoppingReconsiderationDestinationFeedService$observeFeed$1.A03 = obj;
        shoppingReconsiderationDestinationFeedService$observeFeed$1.A00 = A0M;
        shoppingReconsiderationDestinationFeedService$observeFeed$1.A01 = A0M2;
        shoppingReconsiderationDestinationFeedService$observeFeed$1.A02 = A0M3;
        return shoppingReconsiderationDestinationFeedService$observeFeed$1.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C61069Jw7 jw7;
        0eS.A00(obj);
        C61074JwC jwC = (C61074JwC) this.A03;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        C61069Jw7 jw72 = (C61069Jw7) jwC.A00;
        if (jw72 != null) {
            jw7 = C64142LQe.A00(jw72, i);
        } else {
            jw7 = null;
        }
        C61069Jw7 A002 = C64142LQe.A00((C61069Jw7) jwC.A03, i2);
        C61069Jw7 A003 = C64142LQe.A00((C61069Jw7) jwC.A01, i3);
        C61069Jw7 jw73 = (C61069Jw7) jwC.A02;
        AnonymousClass7TG.A1U(A002, jw73, A003);
        return new C61074JwC(jw7, A002, jw73, A003);
    }
}
