package com.instagram.barcelona.permalink.ui.component;

import X.00k;
import X.0eS;
import X.0qQ;
import X.0sK;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass6JK;
import X.AnonymousClass6JM;
import X.AnonymousClass7TE;
import X.C305076Gk;
import X.C60340gF;
import X.JTO;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.barcelona.permalink.ui.component.OverEndScrollKt$rememberOverEndScrollState$1$1$3", f = "OverEndScroll.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OverEndScrollKt$rememberOverEndScrollState$1$1$3 extends AnonymousClass1Ek implements 0sK {
    public /* synthetic */ Object A00;
    public /* synthetic */ boolean A01;
    public final /* synthetic */ LazyListState A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OverEndScrollKt$rememberOverEndScrollState$1$1$3(LazyListState lazyListState, String str, AnonymousClass4D7 r4) {
        super(3, r4);
        this.A02 = lazyListState;
        this.A03 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean A1a = AnonymousClass7TE.A1a(obj);
        OverEndScrollKt$rememberOverEndScrollState$1$1$3 overEndScrollKt$rememberOverEndScrollState$1$1$3 = new OverEndScrollKt$rememberOverEndScrollState$1$1$3(this.A02, this.A03, (AnonymousClass4D7) obj3);
        overEndScrollKt$rememberOverEndScrollState$1$1$3.A01 = A1a;
        overEndScrollKt$rememberOverEndScrollState$1$1$3.A00 = obj2;
        return overEndScrollKt$rememberOverEndScrollState$1$1$3.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        0eS.A00(obj);
        boolean z = this.A01;
        Object obj2 = this.A00;
        LazyListState lazyListState = this.A02;
        AnonymousClass6JM r2 = (AnonymousClass6JM) 00k.A0L(((C305076Gk) lazyListState.A02()).A0D);
        boolean A0K = 0qQ.A0K(obj2, this.A03);
        if (z || r2 == null) {
            return null;
        }
        if (!A0K) {
            i = 0;
        } else {
            i = ((C305076Gk) lazyListState.A02()).A07 - ((AnonymousClass6JK) r2).A02;
        }
        return JTO.A0w(i);
    }
}
