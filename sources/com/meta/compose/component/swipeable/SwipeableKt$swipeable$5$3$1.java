package com.meta.compose.component.swipeable;

import X.0eS;
import X.0qQ;
import X.0sL;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C268024cd;
import X.C284945Oz;
import X.C51967G9n;
import X.C56059Hs8;
import X.C60340gF;
import X.JG3;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.meta.compose.component.swipeable.SwipeableKt$swipeable$5$3$1", f = "Swipeable.kt", i = {}, l = {563}, m = "invokeSuspend", n = {}, s = {})
public final class SwipeableKt$swipeable$5$3$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ C268024cd A02;
    public final /* synthetic */ C56059Hs8 A03;
    public final /* synthetic */ SwipeableState A04;
    public final /* synthetic */ Map A05;
    public final /* synthetic */ 0sL A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableKt$swipeable$5$3$1(C268024cd r2, C56059Hs8 hs8, SwipeableState swipeableState, Map map, AnonymousClass4D7 r6, 0sL r7, float f) {
        super(2, r6);
        this.A04 = swipeableState;
        this.A05 = map;
        this.A03 = hs8;
        this.A02 = r2;
        this.A06 = r7;
        this.A01 = f;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.meta.compose.component.swipeable.SwipeableKt$swipeable$5$3$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        SwipeableState swipeableState = this.A04;
        Map map = this.A05;
        return new SwipeableKt$swipeable$5$3$1(this.A02, this.A03, swipeableState, map, r10, this.A06, this.A01);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.meta.compose.component.swipeable.SwipeableKt$swipeable$5$3$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r6 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            SwipeableState swipeableState = this.A04;
            C284945Oz r1 = swipeableState.A05;
            Map map = this.A05;
            0qQ.A0B(map, 0);
            r1.Epw(map);
            swipeableState.A0B.Epw(this.A03);
            0sL r12 = this.A06;
            C268024cd r2 = this.A02;
            swipeableState.A0C.Epw(JG3.A00(map, r12, r2, 34));
            C51967G9n.A14(swipeableState.A0D, r2.F06(this.A01));
            this.A00 = 1;
            if (swipeableState.A02((Map) r1.getValue(), map, this) == r6) {
                return r6;
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SwipeableKt$swipeable$5$3$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
