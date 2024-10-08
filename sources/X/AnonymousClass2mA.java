package X;

/* renamed from: X.2mA  reason: invalid class name */
public final class AnonymousClass2mA {
    public final C228312lJ A00;

    public final void A00() {
        C228312lJ r5 = this.A00;
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        r5.A0B.remove(this);
        r5.A05 = null;
        JPT jpt = r5.A04;
        if (jpt != null) {
            jpt.DC4(AnonymousClass05K.A01);
        }
        if (r5.A06) {
            r5.A09.markerAnnotate(r5.A08, "scroll_distance", r5.A00 - r5.A01);
            r5.A01 = r5.A00;
            r5.A03(3, false);
            r5.A06 = false;
            14i.A06(r5);
        }
    }

    public final void A01() {
        C228312lJ r4 = this.A00;
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        01W r0 = r4.A0B;
        r0.add(this);
        if (r0.size() > 1) {
            0KC.A0E("TailLoadPerfLogger", "Multiple requests in flight on request start");
        }
        if (r4.A06) {
            02m r2 = r4.A09;
            int i2 = r4.A08;
            r2.markerAnnotate(i2, "page_request_source", false);
            r2.markerPoint(i2, "page_request_start");
        }
    }

    public final void A02() {
        C228312lJ r4 = this.A00;
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        r4.A0B.remove(this);
        r4.A05 = null;
        if (r4.A06) {
            02m r3 = r4.A09;
            int i2 = r4.A08;
            r3.markerPoint(i2, "page_request_end");
            r3.markerAnnotate(i2, "is_tli_visible_on_request_end", r4.A07);
        }
        C228312lJ.A00(r4, false);
    }

    public AnonymousClass2mA(C228312lJ r1) {
        this.A00 = r1;
    }
}
