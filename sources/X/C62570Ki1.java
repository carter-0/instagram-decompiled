package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ki1  reason: case insensitive filesystem */
public enum C62570Ki1 {
    GRID_PACK("grid_pack"),
    CARD("card"),
    TRAY("tray"),
    BRAND_ROWS("brand_rows"),
    POGS("pogs"),
    CHANNEL_HSCROLL("channel_hscroll"),
    CARD_WITH_PREVIEW("card_with_preview");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C62570Ki1[] ki1Arr;
        A02 = 0oU.A00(ki1Arr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C62570Ki1 ki1 : values()) {
            A0x.put(ki1.A00, ki1);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C62570Ki1(String str) {
        this.A00 = str;
    }
}
