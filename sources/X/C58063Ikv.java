package X;

import android.view.ScrollCaptureSession;
import androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", f = "ComposeScrollCaptureCallback.android.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {129, 132}, m = "onScrollCaptureImageRequest", n = {"this", "session", "captureArea", "targetMin", "targetMax", "this", "session", "captureArea", "targetMin", "targetMax"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
/* renamed from: X.Ikv  reason: case insensitive filesystem */
public final class C58063Ikv extends C64101El {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public /* synthetic */ Object A06;
    public final /* synthetic */ ComposeScrollCaptureCallback A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58063Ikv(ComposeScrollCaptureCallback composeScrollCaptureCallback, AnonymousClass4D7 r2) {
        super(r2);
        this.A07 = composeScrollCaptureCallback;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Ikv, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        this.A06 = obj;
        this.A02 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return ComposeScrollCaptureCallback.A03((ScrollCaptureSession) null, this.A07, (C56558I1m) null, this);
    }
}
