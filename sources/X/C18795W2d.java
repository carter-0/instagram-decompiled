package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.W2d  reason: case insensitive filesystem */
public final class C18795W2d {
    public static final C18795W2d A00 = new Object();

    public static final void A01(Context context, ImageView imageView, AnonymousClass0iw r4, Hashtag hashtag, boolean z) {
        if (z) {
            boolean A02 = C253833rU.A02(hashtag.Bh3());
            String A002 = C273654mx.A00(10);
            if (!A02) {
                ImageUrl Bh3 = hashtag.Bh3();
                if (Bh3 != null) {
                    0qQ.A0C(imageView, A002);
                    ((IgImageView) imageView).setUrl(Bh3, r4);
                }
                imageView.setPadding(0, 0, 0, 0);
            } else {
                0qQ.A0C(imageView, A002);
                IgImageView igImageView = (IgImageView) imageView;
                igImageView.setPlaceHolderColor(context.getColor(R.color.baseline_neutral_80));
                igImageView.A0B();
            }
            imageView.setColorFilter((ColorFilter) null);
            return;
        }
        0qQ.A0C(imageView, C66579MXk.A00(67));
        C14497TxJ.A00(context, (CircularImageView) imageView, AnonymousClass05K.A01);
    }

    public static final void A03(Hashtag hashtag, C66967Mg0 mg0, C17935ViQ viQ, boolean z, boolean z2) {
        String BqG;
        IgTextView igTextView;
        if (!z) {
            if (mg0.A0J) {
                BqG = mg0.A09;
            } else {
                BqG = hashtag.BqG();
            }
            if (!(BqG == null || BqG.length() == 0)) {
                if (z2) {
                    viQ.A06.setVisibility(8);
                    igTextView = viQ.A07;
                } else {
                    viQ.A07.setVisibility(8);
                    igTextView = viQ.A06;
                }
                igTextView.setText(BqG);
                igTextView.setVisibility(0);
                return;
            }
        }
        viQ.A06.setVisibility(8);
        viQ.A07.setVisibility(8);
    }

    public static final View A00(Context context, ViewGroup viewGroup) {
        View A0C = DbT.A0C(LayoutInflater.from(context), viewGroup, R.layout.row_hashtag);
        0qQ.A0A(A0C);
        A0C.setTag(new C17935ViQ(A0C));
        return A0C;
    }

    public static final void A02(View view) {
        C13990Tnq.A0n(DbU.A05(view), DbX.A0G(view));
    }
}
