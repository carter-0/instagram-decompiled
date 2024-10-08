package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.LYq  reason: case insensitive filesystem */
public final class C64290LYq implements ViewStub.OnInflateListener {
    public final int A00;
    public final Object A01;

    public C64290LYq(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onInflate(ViewStub viewStub, View view) {
        C71492dQ r2;
        if (this.A00 != 0) {
            C65048LmS lmS = (C65048LmS) this.A01;
            IgSimpleImageView A0T = JTP.A0T(view, R.id.sticker_view);
            LY0.A00(A0T, 42, lmS);
            lmS.A02 = A0T;
            IgTextView A0a = DbT.A0a(view, R.id.like_count);
            Context context = A0a.getContext();
            Drawable drawable = context.getDrawable(R.drawable.instapal_instapal_heart);
            int A02 = AnonymousClass7TG.A02(context);
            if (drawable != null) {
                drawable.setBounds(0, 0, A02, A02);
            }
            A0a.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            lmS.A03 = A0a;
            lmS.A01 = (IgFrameLayout) view.requireViewById(R.id.play_animation_container);
            LY0.A00(view.requireViewById(R.id.sticker_option_1), 43, lmS);
            LY0.A00(view.requireViewById(R.id.sticker_option_2), 44, lmS);
            LY0.A00(view.requireViewById(R.id.sticker_option_3), 45, lmS);
            LY0.A00(view.requireViewById(R.id.sticker_option_4), 46, lmS);
            View requireViewById = view.requireViewById(R.id.drawable_container_bottom_guideline);
            ViewGroup.LayoutParams layoutParams = requireViewById.getLayoutParams();
            if ((layoutParams instanceof C71492dQ) && (r2 = (C71492dQ) layoutParams) != null) {
                r2.A0W = lmS.A0A.getHeight() - lmS.A0E.getHeight();
                requireViewById.setLayoutParams(r2);
            }
            C65048LmS.A02(lmS, C62593KiQ.LUNA);
            return;
        }
        View A0G = AnonymousClass7TF.A0G(view, R.id.no_avatar_nux_button);
        C61364K4g k4g = (C61364K4g) this.A01;
        if (182.A06(0Tu.A05, DbY.A0R(k4g.A0S), 36325351626650524L)) {
            ImageView A0F = DbU.A0F(view, R.id.no_avatar_nux_image);
            ViewStub viewStub2 = k4g.A01;
            if (viewStub2 != null) {
                DbU.A13(viewStub2.getContext(), A0F, R.drawable.ig_avatars_style_2_g6_casual_alpha_style2);
            } else {
                0qQ.A0F("noAvatarNux");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        LYC.A00(A0G, 62, k4g);
    }
}
