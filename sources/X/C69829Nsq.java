package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* renamed from: X.Nsq  reason: case insensitive filesystem */
public abstract class C69829Nsq {
    public static final void A00(Context context, AnonymousClass0iw r4, ImageUrl imageUrl, IgImageView igImageView, NoteBubbleView noteBubbleView, RoundedCornerConstraintLayout roundedCornerConstraintLayout, int i, int i2, boolean z, boolean z2, boolean z3) {
        ViewGroup.LayoutParams layoutParams;
        0qQ.A0B(r4, 8);
        if (igImageView != null) {
            if (imageUrl != null) {
                igImageView.setUrl(imageUrl, r4);
            } else {
                return;
            }
        }
        if (!(!z || roundedCornerConstraintLayout == null || (layoutParams = roundedCornerConstraintLayout.getLayoutParams()) == null)) {
            layoutParams.width = DbS.A02(context, i);
            layoutParams.height = DbS.A02(context, i2);
            roundedCornerConstraintLayout.setLayoutParams(layoutParams);
        }
        if (noteBubbleView != null) {
            noteBubbleView.A0I(z2, false, z3, false);
            noteBubbleView.setCreationLayoutForContentNotesShare(2Yu.A08(context));
        }
    }
}
