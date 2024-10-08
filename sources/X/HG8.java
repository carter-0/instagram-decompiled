package X;

import android.content.Context;
import android.util.AttributeSet;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

public final class HG8 extends RoundedCornerFrameLayout {
    public final IgImageView A00;
    public final SimpleVideoLayout A01;

    public final IgImageView getImagePlaceHolder() {
        return this.A00;
    }

    public final SimpleVideoLayout getVideoPlaceHolder() {
        return this.A01;
    }

    public HG8(Context context) {
        super(context);
        IgImageView igImageView = new IgImageView(context);
        this.A00 = igImageView;
        SimpleVideoLayout simpleVideoLayout = new SimpleVideoLayout(context, (AttributeSet) null, 0);
        this.A01 = simpleVideoLayout;
        G9w.A14(simpleVideoLayout, igImageView, this);
    }
}
