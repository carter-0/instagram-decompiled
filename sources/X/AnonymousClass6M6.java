package X;

import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.6M6  reason: invalid class name */
public final class AnonymousClass6M6 {
    public static AnonymousClass6M6 A0N;
    public static final AnonymousClass6M7 A0O = new Object();
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
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final String A0K;
    public final String A0L;
    public final boolean A0M;

    public AnonymousClass6M6(Context context) {
        this.A0M = C316216lI.A0B(context);
        int A002 = A00(context);
        this.A0F = A002;
        int A022 = C316216lI.A02(context);
        this.A0E = A022;
        this.A0J = context.getResources().getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height);
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.action_button_min_width);
        this.A00 = C316216lI.A00(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A0G = dimensionPixelSize;
        this.A0D = context.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        this.A05 = A022 - (context.getResources().getDimensionPixelSize(R.dimen.avatar_sticker_max_height) * 2);
        this.A09 = A002 - (context.getResources().getDimensionPixelSize(R.dimen.ai_agent_share_profile_sticker_padding) * 2);
        this.A08 = (context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) * 3) + (context.getResources().getDimensionPixelSize(R.dimen.auth_credential_title_text_size) * 3);
        this.A07 = context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) / 2;
        this.A06 = (context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap) * 3) + (context.getResources().getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material) * 2);
        String string = context.getString(2131954762);
        0qQ.A07(string);
        this.A0K = string;
        String string2 = context.getString(2131961564);
        0qQ.A07(string2);
        this.A0L = string2;
        this.A0C = A002 - context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        this.A0A = context.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_material);
        this.A0B = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap) + dimensionPixelSize;
        this.A0H = context.getResources().getDimensionPixelSize(R.dimen.achievements_only_you_top_margin) * 2;
        this.A0I = context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material) * 2;
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        this.A04 = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
    }

    public static final int A00(Context context) {
        if (C316216lI.A0C(context)) {
            return (int) (0.5625f * ((float) C316216lI.A02(context)));
        }
        return AnonymousClass0nB.A01(context);
    }
}
