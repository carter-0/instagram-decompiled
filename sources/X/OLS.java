package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.instagram.android.R;
import java.util.Arrays;

public final class OLS {
    public float[] A00 = new float[8];
    public final float A01;
    public final float A02;
    public final Context A03;
    public final View A04;

    public OLS(Context context, View view) {
        0qQ.A0B(view, 2);
        this.A03 = context;
        this.A04 = view;
        this.A01 = AnonymousClass7TE.A01(context.getResources(), R.dimen.asset_picker_redesign_sticker_height);
        this.A02 = (float) AnonymousClass7TG.A02(context);
    }

    public final void A00(int i) {
        float A002 = C66583MXo.A00(((float) i) / this.A01);
        float[] fArr = this.A00;
        Arrays.fill(fArr, 0, 4, this.A02 * A002);
        Drawable background = this.A04.getBackground();
        0qQ.A0C(background, C273654mx.A00(0));
        ((GradientDrawable) background).setCornerRadii(fArr);
    }
}
