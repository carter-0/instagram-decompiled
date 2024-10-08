package X;

import android.os.Bundle;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchGesturesListener$HitTestCallback;

public final class AS4 implements TouchGesturesListener$HitTestCallback {
    public final /* synthetic */ C381019b2 A00;

    public AS4(C381019b2 r1) {
        this.A00 = r1;
    }

    public final void hitTestResult(long j, boolean z) {
        Bundle A002 = Q21.A00(AnonymousClass7TF.A0x("serviceType", 91), AnonymousClass7TH.A0J(AnonymousClass05K.A0N), AnonymousClass7TE.A1L("consumed", Boolean.valueOf(z)));
        A002.putLong("gestureId", j);
        this.A00.A00.add(A002);
    }
}
