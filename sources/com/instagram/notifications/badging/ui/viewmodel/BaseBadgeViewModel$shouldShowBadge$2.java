package com.instagram.notifications.badging.ui.viewmodel;

import X.0eS;
import X.0sK;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$shouldShowBadge$2", f = "BaseBadgeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BaseBadgeViewModel$shouldShowBadge$2 extends AnonymousClass1Ek implements 0sK {
    public /* synthetic */ boolean A00;
    public /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseBadgeViewModel$shouldShowBadge$2(AnonymousClass4D7 r2, boolean z) {
        super(3, r2);
        this.A02 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        BaseBadgeViewModel$shouldShowBadge$2 baseBadgeViewModel$shouldShowBadge$2 = new BaseBadgeViewModel$shouldShowBadge$2((AnonymousClass4D7) obj3, this.A02);
        baseBadgeViewModel$shouldShowBadge$2.A00 = booleanValue;
        baseBadgeViewModel$shouldShowBadge$2.A01 = booleanValue2;
        return baseBadgeViewModel$shouldShowBadge$2.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        0eS.A00(obj);
        boolean z2 = this.A00;
        boolean z3 = this.A01;
        if (!z2 || (z3 && !this.A02)) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
