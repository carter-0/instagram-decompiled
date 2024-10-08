package X;

/* renamed from: X.WHr  reason: case insensitive filesystem */
public final class C19039WHr implements AnonymousClass2Kv {
    public final /* synthetic */ 0sP A00;

    public C19039WHr(0sP r1) {
        this.A00 = r1;
    }

    public final void invoke(AnonymousClass3JD r13) {
        C250663lr A0U;
        C250663lr optionalTreeField;
        boolean z;
        boolean z2;
        if (r13 != null && (A0U = C41845B3m.A0U(r13)) != null && (optionalTreeField = A0U.getOptionalTreeField(0, C273654mx.A00(1017), C15130UQt.class, -1511216845)) != null) {
            boolean coercedBooleanField = optionalTreeField.getCoercedBooleanField(1, "has_seen_disclaimer");
            Class<C15129UQs> cls = C15129UQs.class;
            C250663lr optionalTreeField2 = optionalTreeField.getOptionalTreeField(0, "should_show_disclaimer", cls, -226152414);
            boolean z3 = false;
            if (optionalTreeField2 != null) {
                z = optionalTreeField2.getCoercedBooleanField(2, "on_tray_open");
            } else {
                z = false;
            }
            C250663lr optionalTreeField3 = optionalTreeField.getOptionalTreeField(0, "should_show_disclaimer", cls, -226152414);
            if (optionalTreeField3 != null) {
                z2 = optionalTreeField3.getCoercedBooleanField(0, "on_sticker_receive");
            } else {
                z2 = false;
            }
            C250663lr optionalTreeField4 = optionalTreeField.getOptionalTreeField(0, "should_show_disclaimer", cls, -226152414);
            if (optionalTreeField4 != null) {
                z3 = optionalTreeField4.getCoercedBooleanField(1, "on_sticker_send");
            }
            this.A00.invoke(new AnonymousClass9IB(coercedBooleanField, 0, z, z3, z2));
        }
    }
}
