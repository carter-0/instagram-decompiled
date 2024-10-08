package androidx.compose.foundation.pager;

import X.002;
import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C286015Tp;
import X.C60340gF;
import X.GZF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", i = {}, l = {498}, m = "invokeSuspend", n = {}, s = {})
public final class PagerState$scrollToPage$2 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ GZF A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerState$scrollToPage$2(GZF gzf, AnonymousClass4D7 r3, float f, int i) {
        super(2, r3);
        this.A03 = gzf;
        this.A01 = f;
        this.A02 = i;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.compose.foundation.pager.PagerState$scrollToPage$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r6) {
        return new PagerState$scrollToPage$2(this.A03, r6, this.A01, this.A02);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [androidx.compose.foundation.pager.PagerState$scrollToPage$2, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r2 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            GZF gzf = this.A03;
            this.A00 = 1;
            C286015Tp r0 = GZF.A0b;
            if (gzf.A0I.A00(this) == r2) {
                return r2;
            }
        }
        float f = this.A01;
        double d = (double) f;
        if (-0.5d > d || d > 0.5d) {
            throw AnonymousClass7TE.A0w(002.A0Z("pageOffsetFraction ", " is not within the range -0.5 to 0.5", f));
        }
        GZF gzf2 = this.A03;
        gzf2.A07(GZF.A00(gzf2, this.A02), f);
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PagerState$scrollToPage$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
