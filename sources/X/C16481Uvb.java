package X;

/* renamed from: X.Uvb  reason: case insensitive filesystem */
public enum C16481Uvb {
    FACEBOOK_MAP("facebook_map"),
    MAPBOX_MAP("mapbox_map");
    
    public final String A00;

    /* access modifiers changed from: public */
    static {
        FACEBOOK_MAP = new C16481Uvb("FACEBOOK_MAP", 0, "facebook_map");
        MAPBOX_MAP = new C16481Uvb("MAPBOX_MAP", 1, "mapbox_map");
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C16481Uvb(String str) {
        this.A00 = str;
    }
}
