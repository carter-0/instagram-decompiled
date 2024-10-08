package com.instagram.barcelona.permalink.usecase;

import X.0eS;
import X.0sI;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C53384GnG;
import X.C60340gF;
import X.C61071Jw9;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.barcelona.permalink.usecase.PermalinkCoreUseCase$1$1", f = "PermalinkCoreUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PermalinkCoreUseCase$1$1 extends AnonymousClass1Ek implements 0sI {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ boolean A03;

    public PermalinkCoreUseCase$1$1(AnonymousClass4D7 r2) {
        super(5, r2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean A1a = AnonymousClass7TE.A1a(obj3);
        PermalinkCoreUseCase$1$1 permalinkCoreUseCase$1$1 = new PermalinkCoreUseCase$1$1((AnonymousClass4D7) obj5);
        permalinkCoreUseCase$1$1.A00 = obj;
        permalinkCoreUseCase$1$1.A01 = obj2;
        permalinkCoreUseCase$1$1.A03 = A1a;
        permalinkCoreUseCase$1$1.A02 = obj4;
        return permalinkCoreUseCase$1$1.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        return new C61071Jw9((C53384GnG) this.A00, (Map) this.A01, (Set) this.A02, this.A03);
    }
}
