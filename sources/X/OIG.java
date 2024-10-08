package X;

import android.content.Context;
import com.instagram.android.R;

public final class OIG {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;

    public OIG(Context context) {
        this.A0C = DbY.A01(context);
        this.A09 = AnonymousClass7TG.A02(context);
        this.A0D = C66582MXn.A01(context);
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        this.A0B = context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        this.A0A = AnonymousClass7TF.A02(context, R.dimen.abc_button_padding_horizontal_material);
        this.A06 = context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A01 = AnonymousClass7TF.A02(context, R.dimen.abc_action_bar_elevation_material);
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.achievements_list_container_height);
        this.A04 = AnonymousClass7TE.A0H(context.getResources());
        this.A03 = AnonymousClass7TG.A03(context);
        this.A05 = AnonymousClass7TG.A04(context);
        context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A08 = AnonymousClass7TG.A03(context);
        this.A07 = DbY.A01(context);
        context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
    }
}
