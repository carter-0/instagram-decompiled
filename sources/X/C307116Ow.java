package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.6Ow  reason: invalid class name and case insensitive filesystem */
public final class C307116Ow implements C2365734g {
    public final /* synthetic */ C307086Ot A00;

    public C307116Ow(C307086Ot r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void DKS(View view) {
        int i;
        int i2;
        0qQ.A0B(view, 0);
        C307086Ot r3 = this.A00;
        int ordinal = r3.A05.ordinal();
        Context context = view.getContext();
        Resources resources = context.getResources();
        if (ordinal != 2) {
            i = R.dimen.abc_button_padding_horizontal_material;
        } else {
            i = R.dimen.account_discovery_bottom_gap;
        }
        r3.A00 = resources.getDimension(i);
        int ordinal2 = r3.A05.ordinal();
        Resources resources2 = context.getResources();
        if (ordinal2 != 2) {
            i2 = R.dimen.abc_action_bar_elevation_material;
            if (ordinal2 != 3) {
                i2 = R.dimen.abc_dialog_padding_material;
            }
        } else {
            i2 = R.dimen.abc_select_dialog_padding_start_material;
        }
        r3.A01 = -resources2.getDimension(i2);
        ImageView imageView = (ImageView) view.requireViewById(R.id.swipe_up_guidance_chevron);
        0qQ.A0B(imageView, 0);
        r3.A03 = imageView;
        int ordinal3 = r3.A05.ordinal();
        ImageView A002 = r3.A00();
        int i3 = R.drawable.swipe_up_guidance_chevron_with_shadow;
        if (ordinal3 == 3) {
            i3 = R.drawable.swipe_up_guidance_chevron_for_sug_above_cta;
        }
        A002.setImageResource(i3);
        int ordinal4 = r3.A05.ordinal();
        if (ordinal4 == 1 || ordinal4 == 4) {
            r3.A02 = context.getResources().getDimension(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
            TextView textView = (TextView) view.requireViewById(R.id.swipe_up_guidance_text);
            0qQ.A0B(textView, 0);
            r3.A04 = textView;
        }
    }
}
