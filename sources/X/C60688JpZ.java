package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.JpZ  reason: case insensitive filesystem */
public abstract class C60688JpZ extends C249703kE {
    public final Context A00;
    public final C60059Jea A01;
    public final C66544MVy A02;
    public final View A03;
    public final C386379kV A04;

    public static void A00(Resources resources, C60059Jea jea) {
        jea.A09(resources.getColor(R.color.track_background_color, (Resources.Theme) null), resources.getDimensionPixelSize(R.dimen.account_recs_header_image_margin));
    }

    public C60688JpZ(Context context, View view, C60059Jea jea, C66544MVy mVy, C386379kV r7, boolean z) {
        super(view);
        this.A00 = context;
        this.A02 = mVy;
        this.A01 = jea;
        this.A03 = view;
        this.A04 = r7;
        jea.setupTrimmer(r7);
        jea.setEnableTrim(z);
        jea.setWillNotDraw(false);
        jea.A0E = 100;
        if (mVy != null) {
            jea.A0L = new C64858LjK(this);
        }
    }
}
