package X;

/* renamed from: X.81T  reason: invalid class name */
public final class AnonymousClass81T implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "QccAnalyticsModule";
    public AnonymousClass8S5 A00;
    public final C3495780x A01;

    public final String getModuleName() {
        String str;
        AnonymousClass80X Ats;
        AnonymousClass8S5 r0 = this.A00;
        if (r0 == null) {
            return "reel_composer_camera";
        }
        Object obj = r0.A0B.A08.A00;
        if (0qQ.A0K(obj, AnonymousClass9QA.A00)) {
            str = "stories_postcapture_camera";
        } else if (0qQ.A0K(obj, AnonymousClass80M.A00)) {
            str = "direct_postcapture_camera";
        } else if (0qQ.A0K(obj, C3494180h.A00)) {
            str = "note_postcapture_camera";
        } else {
            str = "clips_postcapture_camera";
        }
        AnonymousClass8S5 r02 = this.A00;
        if (!(r02 == null || (Ats = r02.A0Z.Ats()) == null)) {
            int ordinal = Ats.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 3) {
                return "reel_composer_camera";
            }
            if (ordinal == 2) {
                return str;
            }
        }
        throw new IllegalStateException("unexpected CaptureState");
    }

    public AnonymousClass81T(C3495780x r1) {
        this.A01 = r1;
    }
}
