package com.instagram.compose.ui.pulltorefresh;

import X.0eS;
import X.0qQ;
import X.0r1;
import X.0sL;
import X.1Jk;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C304966Fx;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.compose.ui.pulltorefresh.PullRefreshStateKt$rememberPullRefreshState$3$1$2", f = "PullRefreshState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PullRefreshStateKt$rememberPullRefreshState$3$1$2 extends AnonymousClass1Ek implements 0sL {
    public /* synthetic */ float A00;
    public final /* synthetic */ C304966Fx A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ 0r1 A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PullRefreshStateKt$rememberPullRefreshState$3$1$2(C304966Fx r2, String str, AnonymousClass4D7 r4, 0r1 r5) {
        super(2, r4);
        this.A03 = r5;
        this.A01 = r2;
        this.A02 = str;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.compose.ui.pulltorefresh.PullRefreshStateKt$rememberPullRefreshState$3$1$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r6) {
        ? pullRefreshStateKt$rememberPullRefreshState$3$1$2 = new PullRefreshStateKt$rememberPullRefreshState$3$1$2(this.A01, this.A02, r6, this.A03);
        pullRefreshStateKt$rememberPullRefreshState$3$1$2.A00 = AnonymousClass7TE.A04(obj);
        return pullRefreshStateKt$rememberPullRefreshState$3$1$2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PullRefreshStateKt$rememberPullRefreshState$3$1$2) create(Float.valueOf(AnonymousClass7TE.A04(obj)), (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        float f = this.A00;
        0r1 r4 = this.A03;
        boolean z = true;
        if (!r4.A00) {
            if (f >= 1.0f) {
                String str = this.A02;
                0qQ.A0B(str, 0);
                1Jk.A08.A0K(str, 1Jk.A00().A01);
            }
            return C60340gF.A00;
        }
        z = false;
        if (f == 0.0f) {
            String str2 = this.A02;
            0qQ.A0B(str2, 0);
            1Jk.A08(str2);
        }
        return C60340gF.A00;
        r4.A00 = z;
        return C60340gF.A00;
    }
}
