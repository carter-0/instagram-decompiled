package X;

import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import java.util.Arrays;

/* renamed from: X.3aV  reason: invalid class name and case insensitive filesystem */
public abstract class C244013aV {
    public static final int A01(AnonymousClass2WJ r1, int i) {
        0qQ.A0B(r1, 0);
        return r1.Bnf().A01(i);
    }

    public static final int A02(AnonymousClass2WJ r1, int i) {
        0qQ.A0B(r1, 0);
        return r1.Bnf().A02(i);
    }

    public static final long A0C(AnonymousClass2WJ r2, int i) {
        0qQ.A0B(r2, 0);
        return ((long) r2.Bnf().A03(i)) | 9221401712017801216L;
    }

    public static final Drawable A0D(AnonymousClass2WJ r1, int i) {
        Drawable drawable;
        0qQ.A0B(r1, 0);
        AnonymousClass2V4 Bnf = r1.Bnf();
        if (i != 0 && (drawable = Bnf.A00.getDrawable(i)) != null) {
            return drawable;
        }
        throw new IllegalArgumentException(002.A0R(AnonymousClass000.A00(927), Integer.toHexString(i)));
    }

    public static final String A0E(AnonymousClass2WJ r1, int i) {
        0qQ.A0B(r1, 0);
        String A04 = r1.Bnf().A04(i);
        if (A04 != null) {
            return A04;
        }
        throw new IllegalArgumentException(002.A0R(AnonymousClass000.A00(481), Integer.toHexString(i)));
    }

    public static final String A0F(AnonymousClass2WJ r2, Object obj, int i) {
        String string;
        0qQ.A0B(r2, 0);
        0qQ.A0B(obj, 2);
        AnonymousClass2V4 Bnf = r2.Bnf();
        Object[] objArr = {obj};
        if (i != 0 && (string = Bnf.A01.getString(i, Arrays.copyOf(objArr, 1))) != null) {
            return string;
        }
        throw new IllegalArgumentException(002.A0R(AnonymousClass000.A00(481), Integer.toHexString(i)));
    }

    public static final long A03(AnonymousClass2WJ r1) {
        return A0C(r1, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
    }

    public static final float A00(AnonymousClass2WJ r3, int i) {
        AnonymousClass2V4 Bnf = r3.Bnf();
        2V3 r2 = Bnf.A02;
        Number number = (Number) r2.A00.A02(Integer.valueOf(i));
        if (number != null) {
            return number.floatValue();
        }
        float dimension = Bnf.A01.getDimension(i);
        r2.A00(i, Float.valueOf(dimension));
        return dimension;
    }

    public static final long A04(AnonymousClass2WJ r1) {
        return A0C(r1, R.dimen.abc_text_size_menu_header_material);
    }

    public static final long A05(AnonymousClass2WJ r1) {
        return A0C(r1, R.dimen.abc_action_bar_elevation_material);
    }

    public static final long A06(AnonymousClass2WJ r1) {
        return A0C(r1, R.dimen.account_discovery_bottom_gap);
    }

    public static final long A07(AnonymousClass2WJ r1) {
        return A0C(r1, R.dimen.abc_control_corner_material);
    }

    public static final long A08(AnonymousClass2WJ r1) {
        return A0C(r1, R.dimen.add_payment_bottom_sheet_row_subtitle_size);
    }

    public static final long A09(AnonymousClass2WJ r1) {
        return A0C(r1, R.dimen.abc_button_inset_vertical_material);
    }

    public static final long A0A(AnonymousClass2WJ r1) {
        return A0C(r1, R.dimen.abc_button_padding_horizontal_material);
    }

    public static final long A0B(AnonymousClass2WJ r1) {
        return A0C(r1, R.dimen.action_bar_item_spacing_right);
    }

    public static final String A0G(AnonymousClass2WJ r1, Object[] objArr, int i) {
        AnonymousClass2V4 Bnf = r1.Bnf();
        Object[] copyOf = Arrays.copyOf(objArr, 2);
        0qQ.A0B(copyOf, 1);
        String string = Bnf.A01.getString(i, Arrays.copyOf(copyOf, copyOf.length));
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException(002.A0R(AnonymousClass000.A00(481), Integer.toHexString(i)));
    }
}
