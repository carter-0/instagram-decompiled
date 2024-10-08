package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.TransitionCarouselImageView;
import com.instagram.shopping.widget.clickabletext.ClickableTextContainer;
import com.instagram.ui.widget.thumbnailview.ThumbnailView;
import java.util.List;

/* renamed from: X.Vok  reason: case insensitive filesystem */
public abstract class C18270Vok {
    public static final void A00(UEO ueo, WSC wsc) {
        UKO uko = wsc.A00;
        if (uko.A01 == null && uko.A02 == null) {
            ueo.A09.setVisibility(8);
            return;
        }
        ClickableTextContainer clickableTextContainer = ueo.A09;
        clickableTextContainer.setVisibility(0);
        Resources resources = clickableTextContainer.getResources();
        0nA.A0e(clickableTextContainer, AnonymousClass7TE.A0C(resources));
        0nA.A0d(clickableTextContainer, AnonymousClass7TE.A0D(resources));
    }

    public static final void A01(UEO ueo, WSC wsc, boolean z) {
        View view;
        int i;
        boolean A1X = DbW.A1X(wsc);
        View view2 = ueo.itemView;
        if (z) {
            WB0.A00(view2, 8, wsc);
            WC3.A00(ueo.itemView, 14, ueo);
            A00(ueo, wsc);
            UKO uko = wsc.A00;
            String str = uko.A01;
            TextView textView = ueo.A04;
            if (str != null) {
                textView.setVisibility(A1X);
                textView.setText(str);
            } else {
                textView.setVisibility(8);
            }
            String str2 = uko.A02;
            TextView textView2 = ueo.A05;
            if (str2 != null) {
                textView2.setVisibility(A1X);
                textView2.setText(str2);
                return;
            }
            textView2.setVisibility(8);
            return;
        }
        view2.setVisibility(A1X ? 1 : 0);
        WB0.A00(ueo.itemView, 8, wsc);
        WC3.A00(ueo.itemView, 14, ueo);
        UKO uko2 = wsc.A00;
        ImageUrl imageUrl = uko2.A00;
        if (imageUrl == null) {
            ueo.A07.setVisibility(8);
        } else {
            IgImageView igImageView = ueo.A07;
            igImageView.setVisibility(A1X);
            igImageView.setUrl(imageUrl, wsc.A01.A00);
        }
        List list = uko2.A03;
        if (list.isEmpty()) {
            ueo.A0A.setVisibility(8);
        } else {
            ThumbnailView thumbnailView = ueo.A0A;
            thumbnailView.setVisibility(A1X);
            thumbnailView.setGridImages(list, wsc.A01.A00);
        }
        List list2 = uko2.A04;
        if (list2.isEmpty()) {
            ueo.A08.setVisibility(8);
        } else {
            TransitionCarouselImageView transitionCarouselImageView = ueo.A08;
            transitionCarouselImageView.setVisibility(A1X);
            transitionCarouselImageView.A04(list2, A1X);
            wsc.A01.A02.invoke(transitionCarouselImageView);
        }
        A00(ueo, wsc);
        String str3 = uko2.A01;
        TextView textView3 = ueo.A04;
        if (str3 != null) {
            textView3.setVisibility(A1X);
            textView3.setText(str3);
        } else {
            textView3.setVisibility(8);
        }
        String str4 = uko2.A02;
        TextView textView4 = ueo.A05;
        if (str4 != null) {
            textView4.setVisibility(A1X);
            textView4.setText(str4);
        } else {
            textView4.setVisibility(8);
        }
        ueo.A03.setVisibility(8);
        ueo.A02.setVisibility(8);
        if (imageUrl != null || !list.isEmpty() || !list2.isEmpty()) {
            view = ueo.A00;
            i = 8;
        } else {
            view = ueo.A00;
            i = 0;
        }
        view.setVisibility(i);
    }
}
