package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.9yG  reason: invalid class name and case insensitive filesystem */
public abstract class C394529yG {
    public static final C380139Wu A00(Context context, JVX jvx, boolean z) {
        ImageUrl As3 = jvx.As3();
        String title = jvx.getTitle();
        String str = jvx.A07;
        int A09 = AnonymousClass7TE.A09(context);
        int color = context.getColor(R.color.gallery_item_selection_circle_default_color);
        AnonymousClass7TF.A1D(As3, 2, str);
        C380139Wu r1 = new C380139Wu(context, As3, str, title, R.dimen.audio_translations_language_list_cell_row_height, color, 1, R.dimen.avatar_sticker_max_height, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding, A09, false, false, false);
        int i = 127;
        if (z) {
            i = 255;
        }
        r1.setAlpha(i);
        return r1;
    }
}
