package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import com.instagram.user.model.User;

public final class FVY implements AnonymousClass1MK {
    public final /* synthetic */ C49406Ev8 A00;

    public final void CyF(C226952iF r4, AnonymousClass3LX r5) {
        Icon icon;
        0qQ.A0B(r5, 1);
        Bitmap bitmap = r5.A01;
        C49406Ev8 ev8 = this.A00;
        if (bitmap != null) {
            icon = Icon.createWithAdaptiveBitmap(bitmap);
        } else {
            icon = null;
        }
        User user = ev8.A00;
        AnonymousClass90S.A01(icon, user.getId(), user.getUsername());
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public FVY(C49406Ev8 ev8) {
        this.A00 = ev8;
    }

    public final void DJx(C226952iF r4, C254673sr r5) {
        User user = this.A00.A00;
        AnonymousClass90S.A01((Icon) null, user.getId(), user.getUsername());
    }
}
