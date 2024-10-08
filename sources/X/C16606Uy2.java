package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Uy2  reason: case insensitive filesystem */
public enum C16606Uy2 {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE(0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    RICH_TEXT(1, "RICH_TEXT"),
    PHOTO(2, "PHOTO"),
    VIDEO(3, "VIDEO"),
    HEADER(4, "HEADER"),
    FOOTER(5, "FOOTER"),
    BUTTON(6, "BUTTON"),
    SLIDESHOW(7, "SLIDESHOW"),
    SWIPE_TO_OPEN(8, "SWIPE_TO_OPEN"),
    INSTAGRAM_PRODUCT(9, "INSTAGRAM_PRODUCT");
    
    public static final Map A02 = null;
    public static final Map A03 = null;
    public final int A00;
    public final String A01;

    /* access modifiers changed from: public */
    static {
        int i;
        C16606Uy2[] uy2Arr;
        A04 = 0oU.A00(uy2Arr);
        A02 = new HashMap();
        A03 = new HashMap();
        for (C16606Uy2 uy2 : values()) {
            C51967G9n.A1O(uy2, A02, uy2.A00);
            A03.put(uy2.A01, uy2);
        }
    }

    /* access modifiers changed from: public */
    C16606Uy2(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
