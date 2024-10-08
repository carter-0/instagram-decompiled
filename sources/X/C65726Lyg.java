package X;

import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.Lyg  reason: case insensitive filesystem */
public final class C65726Lyg implements C315616kD {
    public final int A00;
    public final Object A01;

    public C65726Lyg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DaF(C294975nL r6, float f) {
        ImageView imageView;
        int i;
        switch (this.A00) {
            case 2:
                if (f > 0.8f && (imageView = (ImageView) ((C64856LjI) this.A01).A09.getValue()) != null) {
                    i = R.drawable.instagram_heart_pano_outline_24;
                    break;
                } else {
                    return;
                }
                break;
            case 3:
                if (f == 0.0f && (imageView = (ImageView) ((C64856LjI) this.A01).A09.getValue()) != null) {
                    i = R.drawable.instagram_circle_x_pano_filled_24;
                    break;
                } else {
                    return;
                }
                break;
            default:
                if (((double) f) > 0.8d) {
                    DbS.A1U(this.A01);
                    return;
                }
                return;
        }
        imageView.setImageResource(i);
    }
}
