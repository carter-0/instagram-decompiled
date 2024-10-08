package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.F6x  reason: case insensitive filesystem */
public abstract class C49789F6x {
    public static void A00(Context context, F12 f12, boolean z) {
        TextView textView = f12.A05;
        17k.A0F(AnonymousClass7TF.A1V(textView));
        if (z) {
            textView.setText(2131962577);
            ImageView imageView = f12.A03;
            imageView.setImageDrawable(C346697vb.A02(context, R.drawable.instagram_circle_star_pano_filled_24));
            imageView.setColorFilter(0);
            return;
        }
        textView.setText(2131962575);
        ImageView imageView2 = f12.A03;
        imageView2.setImageResource(R.drawable.instagram_circle_star_pano_outline_24);
        DbU.A14(context, imageView2, 2Yu.A0B(context));
    }

    public static void A01(Context context, F12 f12, boolean z) {
        ImageView imageView;
        int color;
        TextView textView = f12.A06;
        if (z) {
            textView.setText(2131972032);
            imageView = f12.A04;
            0qQ.A0B(context, 0);
            int[] iArr = new int[5];
            C267014am.A03(context, (AttributeSet) null, iArr, R.style.GradientPatternStyle);
            imageView.setImageDrawable(AnonymousClass3JT.A04(context, iArr, R.drawable.instagram_star_pano_filled_24));
            color = 0;
        } else {
            textView.setText(2131952378);
            imageView = f12.A04;
            imageView.setImageResource(R.drawable.instagram_star_pano_outline_24);
            color = context.getColor(2Yu.A0B(context));
        }
        imageView.setColorFilter(color);
    }
}
