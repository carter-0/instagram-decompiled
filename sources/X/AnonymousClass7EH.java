package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.7EH  reason: invalid class name */
public final class AnonymousClass7EH implements C2365734g {
    public final /* synthetic */ AnonymousClass7EG A00;

    public AnonymousClass7EH(AnonymousClass7EG r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        Drawable findDrawableByLayerId;
        AnonymousClass7EG r3 = this.A00;
        r3.A02 = (LinearLayout) view.requireViewById(R.id.message_comments_pill_container);
        r3.A03 = (TextView) view.requireViewById(R.id.comments_number);
        r3.A04 = (IgSimpleImageView) view.requireViewById(R.id.comment_icon);
        LinearLayout linearLayout = r3.A02;
        if (linearLayout == null) {
            0qQ.A0F("commentsMessagePill");
            throw AnonymousClass00P.createAndThrow();
        }
        Drawable background = linearLayout.getBackground();
        if (background != null) {
            LayerDrawable layerDrawable = (LayerDrawable) background;
            r3.A01 = layerDrawable;
            if (layerDrawable == null || (findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.message_comments_pill_shadow_layer)) == null) {
                throw new IllegalStateException("Required value was null.");
            }
            r3.A00 = findDrawableByLayerId;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
