package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.9St  reason: invalid class name and case insensitive filesystem */
public abstract class C379169St {
    public static final boolean A00(Drawable drawable) {
        if (!(drawable instanceof C347017w8)) {
            return false;
        }
        Drawable A04 = ((C347017w8) drawable).A04();
        0qQ.A07(A04);
        if ((A04 instanceof C369528uu) || (A04 instanceof C369538uv) || (A04 instanceof C369548uw) || (A04 instanceof C369558ux) || (A04 instanceof C369588v0) || (A04 instanceof C387249lu) || (A04 instanceof C387139lj)) {
            return true;
        }
        return false;
    }

    public static final boolean A01(C255783ui r2) {
        String str;
        String A0K = r2.A0K();
        if (A0K == null) {
            return true;
        }
        int hashCode = A0K.hashCode();
        if (hashCode == 1080478002) {
            str = "product_item_tile_sticker_black_white";
        } else if (hashCode != 1221159847) {
            if (hashCode != 1408761647) {
                return true;
            }
            str = "product_item_list_cell_sticker_black_white";
        } else if (A0K.equals("product_item_list_cell_sticker_subtle")) {
            return false;
        } else {
            return true;
        }
        if (!A0K.equals(str)) {
            return true;
        }
        return false;
    }
}
