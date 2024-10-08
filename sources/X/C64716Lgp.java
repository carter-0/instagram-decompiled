package X;

import android.app.Activity;
import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;

/* renamed from: X.Lgp  reason: case insensitive filesystem */
public final class C64716Lgp implements C348257y9 {
    public final int A00;
    public final Object A01;

    public C64716Lgp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean CWP(Medium medium) {
        if (this.A00 != 0) {
            return true;
        }
        0qQ.A0B(medium, 0);
        return 0qQ.A0K(((C65121Lnj) this.A01).A01, medium);
    }

    public final void DLY(Medium medium, String str) {
        if (this.A00 == 0) {
            C65121Lnj lnj = (C65121Lnj) this.A01;
            lnj.A0G.setImageDrawable(lnj.A0D);
        }
    }

    public final void DrQ(Bitmap bitmap, Medium medium, boolean z) {
        C249513ju r2;
        int i;
        Bitmap bitmap2 = bitmap;
        switch (this.A00) {
            case 0:
                AnonymousClass7TF.A1B(medium, 0, bitmap);
                C65121Lnj lnj = (C65121Lnj) this.A01;
                Activity activity = lnj.A0C;
                int i2 = lnj.A0B;
                int i3 = medium.A07;
                0qQ.A0A(activity);
                lnj.A0G.setImageDrawable(new C348417yP(activity, bitmap2, 0nA.A00(activity, 1.5f), 0nA.A04(activity, 4), i2, i3, false));
                return;
            case 1:
                0qQ.A0B(bitmap, 2);
                r2 = ((C60323JjS) this.A01).A0C;
                i = 35;
                break;
            default:
                0qQ.A0B(bitmap, 2);
                r2 = ((C59963JcW) this.A01).A0D;
                i = 39;
                break;
        }
        r2.FIG(new C61080JwI(bitmap, i));
    }
}
