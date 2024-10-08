package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Uz9  reason: case insensitive filesystem */
public enum C16673Uz9 {
    UNSTYLED("UNSTYLED"),
    PARAGRAPH("PARAGRAPH"),
    UNORDERED_LIST_ITEM("UNORDERED_LIST_ITEM"),
    ORDERED_LIST_ITEM("ORDERED_LIST_ITEM"),
    BLOCKQUOTE("BLOCKQUOTE"),
    HEADER_ONE("HEADER_ONE"),
    HEADER_TWO("HEADER_TWO"),
    HEADER_THREE("HEADER_THREE"),
    HEADER_FOUR("HEADER_FOUR"),
    HEADER_FIVE("HEADER_FIVE"),
    HEADER_SIX("HEADER_SIX"),
    CODE("CODE"),
    MEDIA("MEDIA"),
    PULLQUOTE("PULLQUOTE"),
    CHECKBOX_LIST_ITEM("CHECKBOX_LIST_ITEM"),
    TABLE("TABLE"),
    THEMATIC_BREAK("THEMATIC_BREAK"),
    LINK("LINK"),
    SUBTITLE("SUBTITLE"),
    A0F(NetInfoModule.CONNECTION_TYPE_NONE);
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16673Uz9[] uz9Arr;
        A02 = 0oU.A00(uz9Arr);
        A01 = new HashMap();
        for (C16673Uz9 uz9 : values()) {
            A01.put(uz9.A00, uz9);
        }
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C16673Uz9(String str) {
        this.A00 = str;
    }
}
