package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.Oz9  reason: case insensitive filesystem */
public final class C72241Oz9 implements C2365734g {
    public final /* synthetic */ C314436iG A00;

    public C72241Oz9(C314436iG r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        int i;
        0qQ.A0C(view, C273654mx.A00(10));
        ImageView imageView = (ImageView) view;
        C314436iG r1 = this.A00;
        if (r1.A0M) {
            i = R.drawable.instagram_remix_reactions_pano_outline_24;
        } else {
            boolean z = r1.A0O;
            i = R.drawable.ig_stories_ic_camera;
            if (z) {
                i = R.drawable.instagram_camera_reaction_pano_outline_24;
            }
        }
        imageView.setImageResource(i);
        Context context = imageView.getContext();
        DbX.A12(context, imageView, R.color.canvas_bottom_sheet_description_text_color);
        imageView.setBackgroundResource(R.drawable.reel_camera_button_background);
        imageView.getLayoutParams().width = context.getResources().getDimensionPixelSize(R.dimen.abc_star_medium);
        imageView.getLayoutParams().height = AnonymousClass7TF.A02(context, R.dimen.abc_star_medium);
    }
}
