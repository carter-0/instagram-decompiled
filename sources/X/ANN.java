package X;

import android.view.View;
import com.instagram.camera.effect.models.CameraAREffect;

public final class ANN implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass8AH A00;
    public final /* synthetic */ AnonymousClass9YT A01;

    public ANN(AnonymousClass8AH r1, AnonymousClass9YT r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-37460229);
        AnonymousClass8AH r7 = this.A00;
        AnonymousClass80R r5 = r7.A01;
        if (r5.A1q.A03) {
            r5.A0G.A00(r5.A09, r5.A00);
        } else {
            CameraAREffect cameraAREffect = r5.A0M.A00().A05.A09;
            if (!(cameraAREffect == null || cameraAREffect.A0Z.get("galleryPicker") == null)) {
                C264044Oj.A00(r5.A0R).Chm(r5.A01, cameraAREffect.A0K, cameraAREffect.A0M);
            }
            AnonymousClass7TE.A0n(r5.A0R).A02(r7.A00.A0H(), "gallery_picker_effect_button_adapter");
            r5.A1N.A00().A08().A0j(true);
        }
        AnonymousClass0fD.A0C(-1568827176, A05);
    }
}
