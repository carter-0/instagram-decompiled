package com.instagram.notifications.badging.ui.viewmodel;

import X.0eS;
import X.0sK;
import X.AnonymousClass1Ek;
import X.AnonymousClass2g3;
import X.AnonymousClass4D7;
import X.C226252fx;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$displayStyle$3", f = "BaseBadgeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BaseBadgeViewModel$displayStyle$3 extends AnonymousClass1Ek implements 0sK {
    public /* synthetic */ Object A00;
    public /* synthetic */ boolean A01;
    public final /* synthetic */ AnonymousClass2g3 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseBadgeViewModel$displayStyle$3(AnonymousClass2g3 r2, AnonymousClass4D7 r3) {
        super(3, r3);
        this.A02 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        BaseBadgeViewModel$displayStyle$3 baseBadgeViewModel$displayStyle$3 = new BaseBadgeViewModel$displayStyle$3(this.A02, (AnonymousClass4D7) obj3);
        baseBadgeViewModel$displayStyle$3.A00 = obj;
        baseBadgeViewModel$displayStyle$3.A01 = booleanValue;
        return baseBadgeViewModel$displayStyle$3.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        Object obj2 = this.A00;
        boolean z = this.A01;
        C226252fx r0 = this.A02.A0A;
        if (r0 == null || !z) {
            return obj2;
        }
        return r0;
    }
}
