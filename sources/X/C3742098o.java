package X;

/* renamed from: X.98o  reason: invalid class name and case insensitive filesystem */
public abstract class C3742098o {
    public static final C3742398r A00;
    public static final C3742398r A01;
    public static final AnonymousClass98B A02;
    public static final C3739897s A03 = new C3739897s(new C3743098y(), AnonymousClass98Z.class);
    public static final AnonymousClass987 A04;
    public static final AnonymousClass984 A05 = new AnonymousClass984(new C3742698u(), C3742798v.class);
    public static final C3740497y A06;

    static {
        C3740497y A012 = C3740397x.A01("type.googleapis.com/google.crypto.tink.HmacKey");
        A06 = A012;
        C3742198p r2 = new C3742198p();
        r2.A01(AnonymousClass98D.RAW, C3742298q.A03);
        r2.A01(AnonymousClass98D.TINK, C3742298q.A04);
        r2.A01(AnonymousClass98D.LEGACY, C3742298q.A02);
        r2.A01(AnonymousClass98D.CRUNCHY, C3742298q.A01);
        A01 = r2.A00();
        C3742198p r22 = new C3742198p();
        r22.A01(C3742498s.SHA1, C3742598t.A01);
        r22.A01(C3742498s.SHA224, C3742598t.A02);
        r22.A01(C3742498s.SHA256, C3742598t.A03);
        r22.A01(C3742498s.SHA384, C3742598t.A04);
        r22.A01(C3742498s.SHA512, C3742598t.A05);
        A00 = r22.A00();
        A04 = new AnonymousClass987(new C3742998x(), A012);
        A02 = new AnonymousClass98B(new C3743198z(), A012);
    }

    public static C384379hE A00(C3742798v r4) {
        C375269Cx A0C = C384379hE.DEFAULT_INSTANCE.A0C();
        int i = r4.A01;
        A0C.A03();
        ((C384379hE) A0C.A00).tagSize_ = i;
        C3742498s r2 = (C3742498s) A00.A00(r4.A02);
        A0C.A03();
        C384379hE r1 = (C384379hE) A0C.A00;
        if (r2 != C3742498s.UNRECOGNIZED) {
            r1.hash_ = r2.A00;
            return (C384379hE) A0C.A01();
        }
        throw new IllegalArgumentException(Pxd.A00(1));
    }
}
