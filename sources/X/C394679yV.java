package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.9yV  reason: invalid class name and case insensitive filesystem */
public abstract class C394679yV {
    /* JADX WARNING: type inference failed for: r3v0, types: [X.9kV, X.A9E] */
    public static final C386379kV A00(Context context, boolean z, boolean z2) {
        ? a9e = new A9E(context.getResources().getColor(R.color.clips_gradient_redesign_color_0, (Resources.Theme) null), AnonymousClass7TG.A04(context));
        a9e.A00 = AnonymousClass7TE.A0C(context.getResources());
        a9e.A01 = AnonymousClass7TE.A0D(context.getResources());
        if (z) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.audition_flow_footer_button_horizontal_padding);
            Drawable drawable = context.getDrawable(R.drawable.stacked_timeline_trimmer_handle);
            a9e.A03 = dimensionPixelSize;
            a9e.A06 = drawable;
            int A02 = AnonymousClass7TF.A02(context, R.dimen.audition_flow_footer_button_horizontal_padding);
            Drawable drawable2 = context.getDrawable(R.drawable.stacked_timeline_trimmer_handle);
            a9e.A04 = A02;
            a9e.A08 = drawable2;
            context.getResources().getDimensionPixelSize(R.dimen.audition_flow_footer_button_horizontal_padding);
            a9e.A07 = context.getDrawable(R.drawable.stacked_timeline_trimmer_handle_right);
            context.getResources().getDimensionPixelSize(R.dimen.audition_flow_footer_button_horizontal_padding);
            a9e.A09 = context.getDrawable(R.drawable.stacked_timeline_trimmer_handle_left);
            if (z2) {
                a9e.A00 = AnonymousClass7TE.A0F(context.getResources());
            }
        }
        return a9e;
    }
}
