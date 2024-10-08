package com.instagram.uxlogging.navigation;

import X.0eS;
import X.0qQ;
import X.0sL;
import X.1Hj;
import X.AnonymousClass00P;
import X.AnonymousClass0r6;
import X.AnonymousClass1Ek;
import X.AnonymousClass2US;
import X.AnonymousClass4D7;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.uxlogging.navigation.NavigationObserver$start$1", f = "NavigationObserver.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
public final class NavigationObserver$start$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ long A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationObserver$start$1(AnonymousClass4D7 r2, long j) {
        super(2, r2);
        this.A01 = j;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.uxlogging.navigation.NavigationObserver$start$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r5) {
        return new NavigationObserver$start$1(r5, this.A01);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new NavigationObserver$start$1((AnonymousClass4D7) obj2, this.A01).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.uxlogging.navigation.NavigationObserver$start$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r5 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            AnonymousClass0r6 r4 = AnonymousClass2US.A07;
            if (r4 == null) {
                0qQ.A0F("eventFlow");
                throw AnonymousClass00P.createAndThrow();
            }
            long j = this.A01;
            AnonymousClass2 r1 = AnonymousClass2.A00;
            this.A00 = 1;
            if (r4.collect(new NavigationObserver$start$1$invokeSuspend$$inlined$filter$1$2(r1, j), this) == r5) {
                return r5;
            }
        }
        return C60340gF.A00;
    }
}
