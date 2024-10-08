package X;

/* renamed from: X.Kry  reason: case insensitive filesystem */
public abstract class C63130Kry {
    public static final Integer A00(String str) {
        Integer num = AnonymousClass05K.A00;
        if (0qQ.A0K(str, "attribution_upsell")) {
            return num;
        }
        Integer num2 = AnonymousClass05K.A0C;
        if (0qQ.A0K(str, "photo_post")) {
            return num2;
        }
        Integer num3 = AnonymousClass05K.A0N;
        if (0qQ.A0K(str, "video_post")) {
            return num3;
        }
        Integer num4 = AnonymousClass05K.A0Y;
        if (0qQ.A0K(str, "reels_viewer")) {
            return num4;
        }
        Integer num5 = AnonymousClass05K.A0j;
        if (0qQ.A0K(str, "reels_sticker_tray")) {
            return num5;
        }
        Integer num6 = AnonymousClass05K.A0u;
        if (0qQ.A0K(str, C66579MXk.A00(168))) {
            return num6;
        }
        Integer num7 = AnonymousClass05K.A15;
        if (0qQ.A0K(str, "direct_sticker_tray")) {
            return num7;
        }
        Integer num8 = AnonymousClass05K.A1F;
        if (0qQ.A0K(str, "asset_hub_create_btn")) {
            return num8;
        }
        Integer num9 = AnonymousClass05K.A1I;
        if (!0qQ.A0K(str, "thread_item_long_press")) {
            return AnonymousClass05K.A02;
        }
        return num9;
    }
}
