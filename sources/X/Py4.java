package X;

public final /* synthetic */ class Py4 implements AnonymousClass2Kv {
    public final /* synthetic */ 2IR A00;
    public final /* synthetic */ AnonymousClass2IO A01;

    public /* synthetic */ Py4(2IR r1, AnonymousClass2IO r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void invoke(AnonymousClass3JD r15) {
        C254633sn r0;
        Object Bny;
        C254623sm r3;
        AnonymousClass2IO r7 = this.A01;
        2IR r6 = this.A00;
        if (!(r15 == null || (Bny = r15.Bny()) == null)) {
            C250663lr r5 = (C250663lr) Bny;
            Class<C254593sj> cls = C254593sj.class;
            if (r5.getOptionalTreeField(0, "click_id_config", cls, -261484742) != null) {
                C250663lr optionalTreeField = r5.getOptionalTreeField(0, "click_id_config", cls, -261484742);
                String[] A1a = Pxf.A1a(optionalTreeField.getRequiredCompactedStringListField(0, "click_ids"), 0);
                String[] A1a2 = Pxf.A1a(optionalTreeField.getRequiredCompactedStringListField(1, "blocked_domains"), 0);
                String[] A1a3 = Pxf.A1a(optionalTreeField.getRequiredCompactedStringListField(2, "blocked_urls"), 0);
                long j = 2IL.A05;
                C250663lr optionalTreeField2 = optionalTreeField.getOptionalTreeField(3, "bloom_filter_1pc_disabled", C254613sl.class, -996819204);
                if (optionalTreeField2 == null || optionalTreeField2.getOptionalStringField(2, "bits") == null) {
                    r3 = new C254623sm(0, 0, "");
                } else {
                    r3 = new C254623sm(optionalTreeField2.getCoercedIntField(0, "num_hashes"), optionalTreeField2.getCoercedIntField(1, "num_bits"), optionalTreeField2.getOptionalStringField(2, "bits"));
                }
                r0 = new C254633sn(r3, A1a, A1a2, A1a3);
                r6.onSuccess(r0);
                2IL.A00(r7.A03);
            }
        }
        r0 = null;
        r6.onSuccess(r0);
        2IL.A00(r7.A03);
    }
}
