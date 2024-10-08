package X;

import com.facebook.maps.ttrc.common.MapboxTTRC;

/* renamed from: X.UzP  reason: case insensitive filesystem */
public enum C16682UzP {
    UNKNOWN("unknown_request"),
    STYLE("style_request"),
    SOURCE("source_request"),
    TILE("tile_url_request"),
    FONT("font_request"),
    SPRITE_JSON("sprite_image_request"),
    SPRITE_IMAGE("sprite_json_request");
    
    public static C16682UzP[] A01;
    public String A00;

    /* access modifiers changed from: public */
    static {
        A01 = values();
    }

    public static C16682UzP A00(int i) {
        if (i >= 0 && i < values().length) {
            return A01[i];
        }
        MapboxTTRC.sFbErrorReporter.Ew9("MapboxTTRC", 002.A0c("Invalid URLCategory ordinal ", ". Do the Mapbox Resource Kind enums match URLCategory?", i));
        return UNKNOWN;
    }

    /* access modifiers changed from: public */
    C16682UzP(String str) {
        this.A00 = str;
    }
}
