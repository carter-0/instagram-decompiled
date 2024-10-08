package X;

import android.view.View;
import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem;

/* renamed from: X.8Q7  reason: invalid class name */
public final class AnonymousClass8Q7 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass8Q2 A00;

    public AnonymousClass8Q7(AnonymousClass8Q2 r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(326721975);
        AnonymousClass8Q2 r4 = this.A00;
        C353488Hv r2 = r4.A0E;
        if (r2 == null || ((float) r2.A09) / ((float) r2.A08) > 0.5625f) {
            boolean z = !r4.A04;
            r4.A04 = z;
            CameraToolMenuItem cameraToolMenuItem = r4.A0C;
            cameraToolMenuItem.A04(z, true);
            cameraToolMenuItem.setSelected(r4.A04);
        }
        r4.A0D.Dgq();
        AnonymousClass0fD.A0C(-468059876, A05);
    }
}
