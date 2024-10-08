package X;

import com.facebook.rendercore.text.RCTextView;

/* renamed from: X.6Oq  reason: invalid class name and case insensitive filesystem */
public final class C307056Oq implements Runnable {
    public final /* synthetic */ C58840Ae A00;
    public final /* synthetic */ RCTextView A01;
    public final /* synthetic */ AnonymousClass6OX A02;

    public C307056Oq(C58840Ae r1, RCTextView rCTextView, AnonymousClass6OX r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = rCTextView;
    }

    public final void run() {
        AnonymousClass6OW r0;
        0wc r2 = this.A00;
        if (r2 != null) {
            AnonymousClass6OX r02 = this.A02;
            RCTextView rCTextView = this.A01;
            AnonymousClass6OZ r03 = r02.A04;
            if (r03 != null && (r0 = r03.A03) != null) {
                int i = r0.A02;
                Long l = null;
                int left = rCTextView.getLeft();
                int top = rCTextView.getTop();
                int width = rCTextView.getWidth();
                Integer valueOf = Integer.valueOf(width);
                int height = rCTextView.getHeight();
                Integer valueOf2 = Integer.valueOf(height);
                0wc r22 = r2;
                0Aj A002 = r22.A00(r22.A00, "ads_text_overlay_client_logging_client_rendering");
                if (A002.isSampled()) {
                    Long l2 = null;
                    A002.AAJ("original_overlay_text", (String) null);
                    A002.AAJ("actual_overlay_text", (String) null);
                    A002.A9F("number_of_lines", Long.valueOf((long) i));
                    A002.A9F("text_overlay_position_x", Long.valueOf((long) left));
                    A002.A9F("text_overlay_position_y", Long.valueOf((long) top));
                    if (valueOf != null) {
                        l = Long.valueOf((long) width);
                    }
                    A002.A9F("text_overlay_view_width", l);
                    if (valueOf2 != null) {
                        l2 = Long.valueOf((long) height);
                    }
                    A002.A9F("text_overlay_view_height", l2);
                    A002.Cgf();
                }
            }
        }
    }
}
