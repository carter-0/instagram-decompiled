package X;

/* renamed from: X.4As  reason: invalid class name and case insensitive filesystem */
public final class C261734As extends 1Vf {
    public final /* synthetic */ AnonymousClass40L A00;

    public final String createQuery() {
        return "INSERT OR REPLACE INTO `signals` (`id`,`signal_id`,`timestamp`,`signal_component_id`,`context`,`type`,`long_value`,`float_value`,`text_value`,`expiration_timestamp`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C261734As(C251983oI r1, AnonymousClass40L r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void bind(AnonymousClass1WV r4, Object obj) {
        AnonymousClass40O r5 = (AnonymousClass40O) obj;
        r4.ADa(1, (long) r5.A00);
        r4.ADh(2, r5.A08);
        r4.ADa(3, r5.A03);
        Integer num = r5.A05;
        if (num == null) {
            r4.ADb(4);
        } else {
            r4.ADa(4, (long) num.intValue());
        }
        String str = r5.A07;
        if (str == null) {
            r4.ADb(5);
        } else {
            r4.ADh(5, str);
        }
        r4.ADa(6, (long) r5.A01);
        Long l = r5.A06;
        if (l == null) {
            r4.ADb(7);
        } else {
            r4.ADa(7, l.longValue());
        }
        Float f = r5.A04;
        if (f == null) {
            r4.ADb(8);
        } else {
            r4.ADY(8, (double) f.floatValue());
        }
        String str2 = r5.A09;
        if (str2 == null) {
            r4.ADb(9);
        } else {
            r4.ADh(9, str2);
        }
        r4.ADa(10, r5.A02);
    }
}
