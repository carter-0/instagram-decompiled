package androidx.compose.ui.scrollcapture;

import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", f = "ComposeScrollCaptureCallback.android.kt", i = {}, l = {190}, m = "invokeSuspend", n = {}, s = {})
public final class ComposeScrollCaptureCallback$onScrollCaptureEnd$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ ComposeScrollCaptureCallback A01;
    public final /* synthetic */ Runnable A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$onScrollCaptureEnd$1(ComposeScrollCaptureCallback composeScrollCaptureCallback, Runnable runnable, AnonymousClass4D7 r4) {
        super(2, r4);
        this.A01 = composeScrollCaptureCallback;
        this.A02 = runnable;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r5) {
        return new ComposeScrollCaptureCallback$onScrollCaptureEnd$1(this.A01, this.A02, r5);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r3 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            RelativeScroller A012 = this.A01.A00;
            this.A00 = 1;
            if (RelativeScroller.A00(A012, this, 0.0f - A012.A00) == r3) {
                return r3;
            }
        }
        this.A01.A02.DjO();
        this.A02.run();
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ComposeScrollCaptureCallback$onScrollCaptureEnd$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
