package X;

import android.content.Context;
import android.content.res.Resources;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class KHK extends IgFrameLayout {
    public AnonymousClass0iw A00;
    public LC3 A01;
    public final IgImageView A02;

    public KHK(Context context, AnonymousClass0iw r8, LC3 lc3) {
        super(context);
        String str;
        int i;
        Context A0S = AnonymousClass7TE.A0S(this);
        IgImageView igImageView = new IgImageView(A0S);
        this.A02 = igImageView;
        this.A01 = lc3;
        this.A00 = r8;
        Resources resources = getResources();
        int A0D = AnonymousClass7TE.A0D(resources);
        igImageView.setPadding(A0D, A0D, A0D, A0D);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_star_medium);
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        igImageView.setLayoutParams(layoutParams);
        LC3 lc32 = this.A01;
        if (lc32 == null) {
            str = null;
        } else if (lc32 instanceof C61902KQv) {
            str = ((C61902KQv) lc32).A01;
        } else if (lc32 instanceof C61901KQu) {
            str = ((C61901KQu) lc32).A02;
        } else {
            str = ((C61900KQt) lc32).A01;
        }
        igImageView.setContentDescription(str);
        if (lc32 instanceof C61902KQv) {
            AnonymousClass0iw r1 = this.A00;
            if (r1 != null) {
                DbV.A1P(r1, igImageView, ((C61902KQv) lc32).A02);
            }
        } else {
            if (lc32 instanceof C61900KQt) {
                i = R.drawable.igd_expression_tray_giphy;
            } else {
                i = lc32 instanceof C61901KQu ? ((C61901KQu) lc32).A00 : i;
            }
            DbU.A13(A0S, igImageView, i);
        }
        addView(igImageView);
    }
}
