package X;

import com.facebook.quicklog.MarkerEditor;

/* renamed from: X.43L  reason: invalid class name */
public final class AnonymousClass43L extends AnonymousClass43M {
    public static final void A00(AnonymousClass7BV r3, AnonymousClass43L r4, Long l) {
        02m r2 = r4.A00;
        MarkerEditor withMarker = r2.withMarker(r3.A01, r3.A00);
        withMarker.annotate("is_feed_to_inbox_v2_on_when_end", r2.isMarkerOn(1060769838));
        withMarker.annotate("is_feed_to_inbox_v1_on_when_end", r2.isMarkerOn(31784971));
        if (l != null) {
            withMarker.annotate("seq_id_from_response", l.longValue());
        }
        withMarker.markerEditingCompleted();
    }

    public final void A0C(AnonymousClass7BV r4) {
        super.A0C(r4);
        if (r4 != null) {
            this.A00.markerEnd(20132917, 2);
        }
    }

    public final void A0D(AnonymousClass7BV r4, Boolean bool, boolean z) {
        super.A0D(r4, bool, z);
        if (r4 != null) {
            this.A00.markerEnd(20132917, 3);
        }
    }
}
