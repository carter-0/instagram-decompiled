package X;

import com.instagram.android.R;

/* renamed from: X.5Gu  reason: invalid class name and case insensitive filesystem */
public final class C283255Gu {
    public static final C283255Gu A06;
    public static final C283255Gu A07;
    public static final C283255Gu A08;
    public static final C283255Gu A09;
    public static final C283255Gu A0A;
    public static final int[] A0B;
    public static final int[] A0C;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Integer A04;
    public final int[] A05;

    static {
        int i;
        C283255Gu r6;
        int[] iArr = {R.dimen.abc_edit_text_inset_top_material, R.dimen.abc_edit_text_inset_top_material, R.dimen.abc_edit_text_inset_top_material, R.dimen.abc_edit_text_inset_top_material};
        A0B = iArr;
        int[] iArr2 = {R.dimen.abc_dialog_padding_material, R.dimen.abc_dialog_padding_material, R.dimen.abc_dialog_padding_material, R.dimen.abc_dropdownitem_icon_width};
        A0C = iArr2;
        boolean A0G = C61670oa.A0G();
        int i2 = R.color.gradient_dark;
        int i3 = R.color.design_dark_default_color_on_background;
        if (A0G) {
            i2 = R.color.igds_prism_gray_10;
            i3 = R.color.igds_prism_gray_00;
        }
        A06 = new C283255Gu((Integer) null, iArr, i2, i3, R.dimen.abc_text_size_menu_header_material, R.drawable.tooltip_shadow);
        if (C61670oa.A0G()) {
            i = R.drawable.tooltip_light_shadow;
            r6 = new C283255Gu((Integer) null, iArr2, R.color.abc_decor_view_status_guard_light, R.color.igds_prism_black, R.dimen.abc_text_size_menu_header_material, R.drawable.tooltip_light_shadow);
        } else {
            i = R.drawable.tooltip_light_shadow;
            r6 = new C283255Gu((Integer) null, iArr2, R.color.design_dark_default_color_on_background, R.color.grey_9, R.dimen.abc_text_size_menu_header_material, R.drawable.tooltip_light_shadow);
        }
        A07 = r6;
        A08 = new C283255Gu((Integer) null, iArr2, R.color.red_5, R.color.design_dark_default_color_on_background, R.dimen.abc_text_size_menu_header_material, i);
        A0A = new C283255Gu((Integer) null, iArr, R.color.gradient_dark, R.color.design_dark_default_color_on_background, R.dimen.account_group_management_row_text_size, R.drawable.tooltip_shadow);
        A09 = new C283255Gu((Integer) null, iArr2, R.color.design_dark_default_color_on_background, R.color.grey_9, R.dimen.account_group_management_row_text_size, R.drawable.tooltip_light_shadow);
    }

    public C283255Gu(Integer num, int[] iArr, int i, int i2, int i3, int i4) {
        this.A00 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A01 = i4;
        this.A05 = iArr;
        this.A04 = num;
    }
}
