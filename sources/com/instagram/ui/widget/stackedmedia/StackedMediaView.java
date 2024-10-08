package com.instagram.ui.widget.stackedmedia;

import X.0qQ;
import X.AnonymousClass0iw;
import X.C253833rU;
import X.DbV;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class StackedMediaView extends FrameLayout {
    public IgImageView A00;
    public IgImageView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StackedMediaView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        A00();
    }

    private final void A00() {
        View inflate = DbV.A0D(this).inflate(R.layout.stacked_media, this, true);
        this.A01 = inflate.findViewById(R.id.media_front);
        this.A00 = inflate.findViewById(R.id.media_back);
    }

    public final void setUrls(ImageUrl imageUrl, ImageUrl imageUrl2, AnonymousClass0iw r5) {
        if (!C253833rU.A02(imageUrl)) {
            IgImageView igImageView = this.A01;
            0qQ.A0A(igImageView);
            0qQ.A0A(imageUrl);
            0qQ.A0A(r5);
            igImageView.setUrl(imageUrl, r5);
        } else {
            IgImageView igImageView2 = this.A01;
            0qQ.A0A(igImageView2);
            igImageView2.A09();
        }
        boolean A02 = C253833rU.A02(imageUrl2);
        IgImageView igImageView3 = this.A00;
        if (!A02) {
            0qQ.A0A(igImageView3);
            0qQ.A0A(imageUrl2);
            0qQ.A0A(r5);
            igImageView3.setUrl(imageUrl2, r5);
            return;
        }
        0qQ.A0A(igImageView3);
        igImageView3.A09();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StackedMediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StackedMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        A00();
    }
}
