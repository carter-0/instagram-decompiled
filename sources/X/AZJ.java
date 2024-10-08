package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import java.util.HashMap;

public final class AZJ implements C240963Ni {
    public final /* synthetic */ C60697Jpi A00;
    public final /* synthetic */ C361728gh A01;
    public final /* synthetic */ 0sP A02;

    public AZJ(C60697Jpi jpi, C361728gh r2, 0sP r3) {
        this.A00 = jpi;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void DEN() {
        0sP r1 = this.A02;
        String url = this.A01.A04.getUrl();
        0qQ.A07(url);
        r1.invoke(url);
    }

    public final void DO4(C240983Nk r8) {
        BitmapDrawable bitmapDrawable;
        C60697Jpi jpi = this.A00;
        IgImageView igImageView = jpi.A0A;
        String str = this.A01.A05;
        GradientDrawable gradientDrawable = jpi.A02;
        AnonymousClass7TF.A1B(igImageView, 0, gradientDrawable);
        Drawable drawable = igImageView.getDrawable();
        int[] iArr = null;
        if (drawable instanceof BitmapDrawable) {
            bitmapDrawable = (BitmapDrawable) drawable;
        } else {
            bitmapDrawable = null;
        }
        HashMap hashMap = C49307Esq.A01;
        BackgroundGradientColors backgroundGradientColors = (BackgroundGradientColors) hashMap.get(str);
        if (backgroundGradientColors == null) {
            if (bitmapDrawable != null) {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                0qQ.A07(bitmap);
                backgroundGradientColors = 0oT.A01(bitmap, AnonymousClass05K.A00);
                hashMap.put(str, backgroundGradientColors);
            }
            gradientDrawable.setColors(iArr);
            igImageView.setBackground(gradientDrawable);
        }
        iArr = new int[]{backgroundGradientColors.A01, backgroundGradientColors.A00};
        gradientDrawable.setColors(iArr);
        igImageView.setBackground(gradientDrawable);
    }
}
