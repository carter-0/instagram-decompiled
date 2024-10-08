package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9sm  reason: invalid class name and case insensitive filesystem */
public enum C391369sm {
    MUSIC_SOUNDWAVE("album_art_soundwave"),
    GIPHY("giphy");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C391369sm[] r0;
        A02 = 0oU.A00(r0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C391369sm r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C391369sm(String str) {
        this.A00 = str;
    }
}
