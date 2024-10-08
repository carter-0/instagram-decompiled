package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.Emj  reason: case insensitive filesystem */
public abstract /* synthetic */ class C48945Emj {
    public static void A00(IgdsHeadline igdsHeadline, int i, int i2) {
        ImageView A0G = DbS.A0G(igdsHeadline, i);
        if (A0G != null) {
            ViewGroup.LayoutParams layoutParams = A0G.getLayoutParams();
            if (layoutParams != null) {
                C71492dQ r1 = (C71492dQ) layoutParams;
                r1.width = 0;
                r1.A0Y = 0;
                r1.A0q = 0;
                A0G.setMaxWidth(i2);
                A0G.setLayoutParams(r1);
                A0G.setScaleType(ImageView.ScaleType.CENTER_CROP);
                A0G.setClipToOutline(true);
                A0G.setAdjustViewBounds(true);
                A0G.setBackgroundResource(R.drawable.igds_prism_dialog_full_width_bg);
                return;
            }
            throw AnonymousClass7TE.A11(C273654mx.A00(3));
        }
    }
}
