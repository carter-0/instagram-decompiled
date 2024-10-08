package X;

import android.text.Editable;

public final class OYD {
    public static final OYD A00 = new Object();

    public static final void A00(Editable editable, String str, int i, int i2) {
        while (i < i2 && Character.isWhitespace(editable.charAt(i))) {
            i++;
        }
        while (i2 > i && Character.isWhitespace(editable.charAt(i2 - 1))) {
            i2--;
        }
        if (i != i2) {
            int length = editable.length();
            int i3 = i2 - 1;
            int i4 = i;
            while (i4 >= 0 && i3 < length && (!Character.isWhitespace(editable.charAt(i4)) || !Character.isWhitespace(editable.charAt(i3)))) {
                if (!str.equals(Character.toString(editable.charAt(i4))) || !str.equals(Character.toString(editable.charAt(i3)))) {
                    i4--;
                    i3++;
                } else {
                    editable.delete(i4, i4 + 1);
                    editable.delete(i3 - 1, i3);
                    return;
                }
            }
            editable.insert(i, str);
            editable.insert(i2 + 1, str);
        }
    }
}
