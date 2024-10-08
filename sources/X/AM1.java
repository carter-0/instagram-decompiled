package X;

import android.view.View;
import com.instagram.camera.effect.models.CameraAREffect;

public final class AM1 implements View.OnClickListener {
    public final /* synthetic */ C357358Xo A00;

    public AM1(C357358Xo r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        Object obj;
        int A05 = AnonymousClass0fD.A05(849919097);
        C357358Xo r3 = this.A00;
        C357348Xn r2 = r3.A03;
        Object obj2 = null;
        if (r2 != null) {
            obj = AnonymousClass8d4.A03.getValue();
            obj2 = AnonymousClass8d4.A05.getValue();
        } else {
            obj = null;
        }
        if (!0qQ.A0K(obj, obj2) && r2 != null) {
            AnonymousClass9YG r1 = r2.A00.A00;
            CameraAREffect cameraAREffect = (CameraAREffect) AnonymousClass8d4.A05.getValue();
            if (cameraAREffect == null) {
                r1.A00();
            } else {
                r1.A01(cameraAREffect);
            }
        }
        C331157Pu r0 = r3.A00;
        if (r0 != null) {
            r0.A07();
        }
        AnonymousClass0fD.A0C(709260302, A05);
    }
}
