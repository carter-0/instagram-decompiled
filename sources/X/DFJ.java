package X;

public final class DFJ implements AnonymousClass2Kv {
    public final /* synthetic */ 0sP A00;

    public DFJ(0sP r1) {
        this.A00 = r1;
    }

    public final void invoke(AnonymousClass3JD r7) {
        Boolean bool;
        C250663lr A0U;
        C250663lr optionalTreeField;
        0sP r5 = this.A00;
        if (r7 == null || (A0U = C41845B3m.A0U(r7)) == null || (optionalTreeField = A0U.getOptionalTreeField(0, "fetch__IGUser(igid:$igid)", C43660C4i.class, 150158218)) == null) {
            bool = null;
        } else {
            bool = C41846B3n.A0d(optionalTreeField, "is_xposting_destination_fb_page_eligible_for_branded_content", 0);
        }
        r5.invoke(bool);
    }
}
