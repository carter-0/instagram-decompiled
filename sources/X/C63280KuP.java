package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.android.R;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

/* renamed from: X.KuP  reason: case insensitive filesystem */
public abstract class C63280KuP {
    public static final void A00(Context context, C19511Wax wax, boolean z) {
        int i = R.drawable.instagram_volume_off_pano_filled_24;
        if (z) {
            i = R.drawable.instagram_volume_pano_filled_24;
        }
        AnonymousClass3TS r4 = wax.A05;
        SlideInAndOutIconView A01 = r4.A01();
        Resources A05 = DbU.A05(A01);
        A01.setTextSize(AnonymousClass7TE.A01(A05, R.dimen.add_payment_bottom_sheet_row_subtitle_size));
        TitleTextView titleTextView = A01.A0C;
        int lineHeight = titleTextView.getLineHeight() + (A05.getDimensionPixelSize(R.dimen.media_tag_indicator_padding) * 2);
        int lineHeight2 = (titleTextView.getLineHeight() - A05.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size)) / 2;
        A01.A03(context.getDrawable(i), lineHeight, lineHeight);
        A01.A0B.setPadding(lineHeight2, lineHeight2, lineHeight2, lineHeight2);
        A01.setIconColor(AnonymousClass7TE.A0A(context));
        A01.setIconScale(0.5f);
        r4.A01().setVisibility(0);
    }
}
