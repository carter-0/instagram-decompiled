package androidx.compose.ui.scrollcapture;

import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C56558I1m;
import X.C60340gF;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
public final class ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ Rect A01;
    public final /* synthetic */ ScrollCaptureSession A02;
    public final /* synthetic */ ComposeScrollCaptureCallback A03;
    public final /* synthetic */ Consumer A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(Rect rect, ScrollCaptureSession scrollCaptureSession, ComposeScrollCaptureCallback composeScrollCaptureCallback, Consumer consumer, AnonymousClass4D7 r6) {
        super(2, r6);
        this.A03 = composeScrollCaptureCallback;
        this.A02 = scrollCaptureSession;
        this.A01 = rect;
        this.A04 = consumer;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        ComposeScrollCaptureCallback composeScrollCaptureCallback = this.A03;
        return new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(this.A01, this.A02, composeScrollCaptureCallback, this.A04, r8);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r8 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            ComposeScrollCaptureCallback composeScrollCaptureCallback = this.A03;
            ScrollCaptureSession scrollCaptureSession = this.A02;
            Rect rect = this.A01;
            C56558I1m i1m = new C56558I1m(rect.left, rect.top, rect.right, rect.bottom);
            this.A00 = 1;
            obj = ComposeScrollCaptureCallback.A03(scrollCaptureSession, composeScrollCaptureCallback, i1m, this);
            if (obj == r8) {
                return r8;
            }
        }
        C56558I1m i1m2 = (C56558I1m) obj;
        this.A04.accept(new Rect(i1m2.A01, i1m2.A03, i1m2.A02, i1m2.A00));
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
