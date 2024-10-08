package X;

/* renamed from: X.EqK  reason: case insensitive filesystem */
public abstract class C49153EqK {
    public static final void A00(0wc r4, String str, int i, boolean z, boolean z2) {
        0qQ.A0B(r4, 0);
        0Aj A0e = AnonymousClass7TE.A0e(r4, "ig_blank_screen");
        if (A0e.isSampled()) {
            A0e.AAJ("ad_id", "n/a");
            A0e.A9F("ad_media_type", DbV.A0p(A0e, "ad_page_type", str, i));
            A0e.A7p("is_blank_screen_detection_attempted", Boolean.valueOf(z));
            A0e.A7p("is_blank_screen_detected", Boolean.valueOf(z2));
            A0e.AAJ("blank_screen_failure_reason", "n/a");
            A0e.Cgf();
        }
    }
}
