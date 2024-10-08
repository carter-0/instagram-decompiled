package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

public abstract class A15 {
    public static final void A00(Context context) {
        Drawable drawable;
        0qQ.A0B(context, 0);
        if (!new 1Cn(context).A07(false)) {
            Drawable drawable2 = context.getDrawable(R.drawable.instagram_warning_pano_outline_24);
            if (drawable2 != null) {
                drawable = drawable2.mutate();
                if (drawable != null) {
                    drawable.setTint(context.getColor(2Yu.A05(context)));
                }
            } else {
                drawable = null;
            }
            C310336ap r2 = new C310336ap();
            r2.A0D = context.getString(2131965641);
            r2.A0N = true;
            r2.A0I = context.getString(2131965640);
            r2.A04 = drawable;
            r2.A02();
            r2.A06();
            r2.A0J = true;
            r2.A02 = context.getResources().getDimensionPixelOffset(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
            r2.A0R = true;
            1xC.A01.A00(new AnonymousClass3GP(r2.A00()));
        }
    }
}
