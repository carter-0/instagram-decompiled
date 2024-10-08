package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.AdW  reason: case insensitive filesystem */
public final class C40523AdW implements C247813gx {
    public final /* synthetic */ C329817Ki A00;
    public final /* synthetic */ IgProgressImageView A01;
    public final /* synthetic */ Integer A02;

    public C40523AdW(C329817Ki r1, IgProgressImageView igProgressImageView, Integer num) {
        this.A01 = igProgressImageView;
        this.A00 = r1;
        this.A02 = num;
    }

    public final /* synthetic */ void DEN() {
    }

    public final void DO4(C240983Nk r7) {
        int i;
        IgProgressImageView igProgressImageView = this.A01;
        C329817Ki r2 = this.A00;
        igProgressImageView.addView(r2.A02, igProgressImageView.indexOfChild(igProgressImageView.getIgImageView()) + 1);
        C329807Kh r3 = r2.A05;
        Integer num = this.A02;
        View view = r3.A00;
        if (view == null) {
            view = r3.A02.inflate();
            r3.A00 = view;
        }
        if (r3.A01 == null) {
            0qQ.A0A(view);
            r3.A01 = (IgSimpleImageView) view.requireViewById(R.id.gated_icon);
        }
        View view2 = r3.A00;
        0qQ.A0A(view2);
        Context context = view2.getContext();
        View view3 = r3.A00;
        0qQ.A0A(view3);
        view3.setVisibility(0);
        IgSimpleImageView igSimpleImageView = r3.A01;
        0qQ.A0A(igSimpleImageView);
        igSimpleImageView.setVisibility(0);
        Integer num2 = AnonymousClass05K.A00;
        IgSimpleImageView igSimpleImageView2 = r3.A01;
        if (num == num2) {
            0qQ.A0A(igSimpleImageView2);
            i = R.drawable.instagram_news_off_outline_18;
        } else {
            0qQ.A0A(igSimpleImageView2);
            i = R.drawable.instagram_eye_off_outline_18;
        }
        igSimpleImageView2.setImageDrawable(context.getDrawable(i));
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        IgSimpleImageView igSimpleImageView3 = r3.A01;
        0qQ.A0A(igSimpleImageView3);
        Drawable drawable = igSimpleImageView3.getDrawable();
        if (drawable != null) {
            drawable.setColorFilter(porterDuffColorFilter);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
