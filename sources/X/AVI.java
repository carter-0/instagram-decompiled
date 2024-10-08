package X;

import android.widget.ImageView;
import com.instagram.android.R;

public final class AVI implements C252203oj {
    public Integer A00 = AnonymousClass05K.A00;
    public final int A01;
    public final ImageView A02;
    public final 2cs A03;
    public final C71392co A04;

    public AVI(ImageView imageView, int i) {
        0qQ.A0B(imageView, 1);
        this.A02 = imageView;
        this.A01 = i;
        C71392co A042 = C71392co.A04(20.0d, 30.0d);
        this.A04 = A042;
        2cs A0J = AnonymousClass7TF.A0J();
        A0J.A06 = false;
        A0J.A0A(this);
        A0J.A09(A042);
        this.A03 = A0J;
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r7) {
        Integer num;
        float scaleX;
        int i;
        if (r7 != null) {
            float f = ((float) r7.A09.A00) * 180.0f;
            ImageView imageView = this.A02;
            imageView.setRotationY(f);
            float abs = Math.abs(f) % 360.0f;
            if (abs < 90.0f || abs > 270.0f) {
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A01;
            }
            int intValue = num.intValue();
            float scaleX2 = imageView.getScaleX();
            if (intValue == 0 ? scaleX2 >= 0.0f : scaleX2 <= 0.0f) {
                scaleX = imageView.getScaleX();
            } else {
                scaleX = -imageView.getScaleX();
            }
            imageView.setScaleX(scaleX);
            if (this.A00 != num) {
                this.A00 = num;
                if (intValue != 0) {
                    i = R.drawable.instagram_sparkles_outline_44;
                } else {
                    i = this.A01;
                }
                imageView.setImageResource(i);
            }
        }
    }
}
