package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.OVp  reason: case insensitive filesystem */
public final class C70994OVp {
    public static final C70994OVp A00 = new Object();

    public final void A00(Context context, AnonymousClass0iw r9, C68167N3h n3h, OL9 ol9) {
        String str;
        String str2;
        String str3;
        String str4;
        ImageUrl imageUrl;
        boolean A1X = DbW.A1X(ol9);
        C70701OGw oGw = n3h.A05;
        if (oGw != null) {
            str = oGw.A01;
        } else {
            str = null;
        }
        if (oGw != null) {
            str2 = oGw.A02;
            str3 = oGw.A05;
            str4 = oGw.A04;
        } else {
            str2 = null;
            str3 = null;
            str4 = null;
        }
        String A10 = DbT.A10(C250563lf.A03(context, str, str2, str3, str4));
        ol9.A00();
        ViewGroup viewGroup = ol9.A00;
        if (viewGroup != null) {
            IgImageView igImageView = ol9.A02;
            if (igImageView != null) {
                TextView textView = ol9.A01;
                if (textView != null) {
                    viewGroup.setVisibility(A1X ? 1 : 0);
                    igImageView.setVisibility(A1X);
                    textView.setText(A10);
                    if (oGw == null || (imageUrl = oGw.A00) == null || C253833rU.A02(imageUrl)) {
                        igImageView.setVisibility(8);
                    } else {
                        igImageView.setUrl(imageUrl, r9);
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else {
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public final void A01(Context context, OL9 ol9) {
        boolean A1X = DbW.A1X(ol9);
        SpannableStringBuilder A0E = C51965G9l.A0E();
        A0E.append(context.getString(2131953215));
        A0E.append("   ");
        C51971G9r.A0y(A0E, C70356O3i.A00(context), A0E.length() - 1);
        String A10 = DbT.A10(A0E);
        ol9.A00();
        ViewGroup viewGroup = ol9.A00;
        if (viewGroup != null) {
            IgImageView igImageView = ol9.A02;
            if (igImageView != null) {
                TextView textView = ol9.A01;
                if (textView != null) {
                    viewGroup.setVisibility(A1X ? 1 : 0);
                    igImageView.setVisibility(A1X);
                    textView.setText(A10);
                    Drawable drawable = context.getDrawable(R.drawable.instagram_reels_pano_outline_24);
                    if (drawable != null) {
                        Drawable mutate = drawable.mutate();
                        AnonymousClass7TE.A1R(mutate, -1);
                        igImageView.setImageDrawable(mutate);
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
