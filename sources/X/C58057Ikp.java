package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", i = {0, 0, 0, 0}, l = {605, 613}, m = "animateScrollToPage", n = {"this", "animationSpec", "page", "pageOffsetFraction"}, s = {"L$0", "L$1", "I$0", "F$0"})
/* renamed from: X.Ikp  reason: case insensitive filesystem */
public final class C58057Ikp extends C64101El {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public /* synthetic */ Object A04;
    public final /* synthetic */ GZF A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58057Ikp(GZF gzf, AnonymousClass4D7 r2) {
        super(r2);
        this.A05 = gzf;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Ikp, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        this.A04 = obj;
        this.A01 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return this.A05.A06((AnonymousClass5b9) null, this, 0);
    }
}
