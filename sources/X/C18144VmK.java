package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.VmK  reason: case insensitive filesystem */
public abstract class C18144VmK {
    public static final ViewGroup A00(Context context, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) DbW.A09(LayoutInflater.from(context), viewGroup, R.layout.image_text_arrow_view, false);
        viewGroup2.setTag(new C14875UDd(viewGroup2, C13991Tnr.A08(viewGroup2, R.id.row_section_title), C13991Tnr.A08(viewGroup2, R.id.row_section_subtitle), (IgFrameLayout) AnonymousClass7TF.A0G(viewGroup2, R.id.highlight_hub_new_tag_section), (RoundedCornerImageView) AnonymousClass7TF.A0G(viewGroup2, R.id.row_section_thumbnail)));
        return viewGroup2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.widget.ImageView] */
    public static final void A01(Context context, C14875UDd uDd, WOP wop, AnonymousClass0iw r6) {
        int i;
        C51974G9v.A1O(context, uDd, wop, r6);
        uDd.A02.setText(wop.A05);
        uDd.A01.setText(wop.A04);
        ImageUrl imageUrl = wop.A03;
        if (imageUrl != null) {
            uDd.A04.setUrl(imageUrl, r6);
        } else {
            C16680UzG uzG = wop.A02;
            Drawable drawable = context.getDrawable(uzG.A00);
            ? r2 = uDd.A04;
            r2.setImageDrawable(drawable);
            r2.setScaleType(ImageView.ScaleType.CENTER);
            if (uzG == C16680UzG.ACCOUNT_SPENDING_LIMIT) {
                i = R.attr.igds_color_error_or_destructive;
            } else {
                boolean A03 = AnonymousClass1GD.A03();
                i = R.attr.igds_color_icon_on_white;
                if (A03) {
                    i = R.attr.igds_color_icon_on_color;
                }
            }
            DbX.A12(context, r2, 2Yu.A0H(context, i));
        }
        AnonymousClass0fU.A00(wop.A01, uDd.A00);
        uDd.A03.setVisibility(DbW.A01(wop.A06 ? 1 : 0));
    }
}
