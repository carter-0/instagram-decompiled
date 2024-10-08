package X;

public abstract class AED {
    public static final int A00(C317876nz r2) {
        if (r2.A0F == AnonymousClass05K.A01) {
            return 9;
        }
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static final C391619tN A01(String str, String str2) {
        if (0qQ.A0K(str2, C318046oG.AI_STICKER.toString())) {
            return C391619tN.A02;
        }
        if (str == null) {
            return null;
        }
        if (00p.A0k(str, C273654mx.A00(580), false)) {
            return C391619tN.A04;
        }
        if (00p.A0k(str, C273654mx.A00(579), false)) {
            return C391619tN.A03;
        }
        if (00p.A0k(str, AnonymousClass000.A00(4741), false) || str.equals(C273654mx.A00(375))) {
            return C391619tN.A09;
        }
        if (str.equals("rollcall_v2_photo_sticker") || str.equals("rollcall_v2_video_sticker")) {
            return C391619tN.A0A;
        }
        if (str.equals("rollcall_v2_timestamp_sticker")) {
            return C391619tN.A0B;
        }
        if (str.equals("group_mention_sticker_bundle_id")) {
            return C391619tN.A06;
        }
        return null;
    }

    public static final String A02(C317876nz r1, boolean z) {
        if (r1.A0Y) {
            return "SUGGESTED_PINNABLES_PEEK";
        }
        if (r1.A0F == AnonymousClass05K.A00) {
            return "STICKER_DROP_PROMO";
        }
        if (z) {
            return "WITH_BANNER_NEW";
        }
        return null;
    }
}
