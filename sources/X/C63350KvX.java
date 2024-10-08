package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.KvX  reason: case insensitive filesystem */
public abstract class C63350KvX {
    public static final GIH A00(Context context, ImageUrl imageUrl) {
        Resources resources = context.getResources();
        GIH gih = new GIH(context, (GJO) null, resources.getDimensionPixelSize(R.dimen.asset_picker_section_title_horizontal_padding), resources.getDimensionPixelSize(R.dimen.clips_control_music_button_radius), resources.getDimensionPixelSize(R.dimen.clips_control_music_button_stroke_width), AnonymousClass7TE.A09(context), JTP.A03(resources), 0, false);
        gih.A04(imageUrl);
        return gih;
    }
}
