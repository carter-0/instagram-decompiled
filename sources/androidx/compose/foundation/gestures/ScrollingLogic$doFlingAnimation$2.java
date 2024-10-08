package androidx.compose.foundation.gestures;

import X.0eS;
import X.0rl;
import X.0sL;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass6Gj;
import X.AnonymousClass6HS;
import X.AnonymousClass6IX;
import X.AnonymousClass7TE;
import X.C51971G9r;
import X.C51972G9s;
import X.C60340gF;
import X.GQ9;
import X.GQG;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", i = {}, l = {782}, m = "invokeSuspend", n = {}, s = {})
public final class ScrollingLogic$doFlingAnimation$2 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public /* synthetic */ Object A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ ScrollingLogic A06;
    public final /* synthetic */ 0rl A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, AnonymousClass4D7 r3, 0rl r4, long j) {
        super(2, r3);
        this.A06 = scrollingLogic;
        this.A07 = r4;
        this.A05 = j;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        ? scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.A06, r8, this.A07, this.A05);
        scrollingLogic$doFlingAnimation$2.A04 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        0rl r8;
        long j;
        float A002;
        ScrollingLogic scrollingLogic2;
        long A012;
        1Hj r10 = 1Hj.A02;
        if (this.A00 != 0) {
            j = this.A01;
            r8 = (0rl) this.A03;
            scrollingLogic = (ScrollingLogic) this.A02;
            scrollingLogic2 = (ScrollingLogic) this.A04;
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            scrollingLogic = this.A06;
            GQG gqg = new GQG((AnonymousClass6IX) this.A04, scrollingLogic);
            r8 = this.A07;
            long j2 = this.A05;
            AnonymousClass6HS r4 = scrollingLogic.A02;
            j = r8.A00;
            if (scrollingLogic.A03 == AnonymousClass6Gj.Horizontal) {
                A002 = C51971G9r.A01(j2);
            } else {
                A002 = C51972G9s.A00(j2);
            }
            if (scrollingLogic.A07) {
                A002 *= -1.0f;
            }
            this.A04 = scrollingLogic;
            this.A02 = scrollingLogic;
            this.A03 = r8;
            this.A01 = j;
            this.A00 = 1;
            obj = r4.E2W(gqg, this, A002);
            if (obj == r10) {
                return r10;
            }
            scrollingLogic2 = scrollingLogic;
        }
        float A042 = AnonymousClass7TE.A04(obj);
        if (scrollingLogic2.A07) {
            A042 *= -1.0f;
        }
        if (scrollingLogic.A03 == AnonymousClass6Gj.Horizontal) {
            A012 = GQ9.A01(A042, 0.0f, 2, j);
        } else {
            A012 = GQ9.A01(0.0f, A042, 1, j);
        }
        r8.A00 = A012;
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ScrollingLogic$doFlingAnimation$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
