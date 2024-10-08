package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Uxe  reason: case insensitive filesystem */
public enum C16584Uxe {
    NO_BUTTON("no_button"),
    ONE_BUTTON_PRIMARY("one_button_primary"),
    ONE_BUTTON_PRIMARY_CONDENSED("one_button_primary"),
    ONE_BUTTON_PRIMARY_INVERSE("one_button_primary_inverse"),
    ONE_BUTTON_SECONDARY("one_button_secondary"),
    TWO_BUTTON_VERTICAL_WITH_PRIMARY_INVERSE("two_button_vertical_with_primary_inverse"),
    TWO_BUTTON_VERTICAL_WITH_SECONDARY("two_button_vertical_with_secondary"),
    TWO_BUTTON_VERTICAL_SECONDARY_WITH_PRIMARY_INVERSE("two_button_vertical_secondary_with_primary_inverse"),
    TWO_BUTTON_HORIZONTAL("two_button_horizontal"),
    TWO_BUTTON_VERTICAL("two_button_vertical");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16584Uxe[] uxeArr;
        A02 = 0oU.A00(uxeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r4));
        for (C16584Uxe uxe : values()) {
            linkedHashMap.put(uxe.A00, uxe);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16584Uxe(String str) {
        this.A00 = str;
    }
}
