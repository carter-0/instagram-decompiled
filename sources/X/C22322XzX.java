package X;

/* renamed from: X.XzX  reason: case insensitive filesystem */
public final class C22322XzX implements AnonymousClass980 {
    public final int A00;

    public C22322XzX(int i) {
        this.A00 = i;
    }

    public final C3740097u ENC(AnonymousClass983 r5) {
        C384319h8 r3;
        C3742398r r1;
        Object obj;
        if (this.A00 != 0) {
            C21196XOc xOc = (C21196XOc) r5;
            r3 = (C384319h8) C384459hM.DEFAULT_INSTANCE.A0C();
            r3.A06("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
            C375269Cx A0C = XP3.DEFAULT_INSTANCE.A0C();
            XP6 A02 = C22022Xsy.A02(xOc);
            A0C.A03();
            XP3 xp3 = (XP3) A0C.A00;
            A02.getClass();
            xp3.params_ = A02;
            xp3.bitField0_ |= 1;
            r3.A05(A0C.A01().A0A());
            r1 = C22022Xsy.A00;
            obj = xOc.A04;
        } else {
            C21195XOb xOb = (C21195XOb) r5;
            r3 = (C384319h8) C384459hM.DEFAULT_INSTANCE.A0C();
            r3.A06("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
            C375269Cx A0C2 = XP4.DEFAULT_INSTANCE.A0C();
            XP5 A01 = C22021Xsx.A01(xOb);
            A0C2.A03();
            XP4 xp4 = (XP4) A0C2.A00;
            A01.getClass();
            xp4.params_ = A01;
            xp4.bitField0_ |= 1;
            r3.A05(A0C2.A01().A0A());
            r1 = C22021Xsx.A00;
            obj = xOb.A03;
        }
        r3.A04((AnonymousClass98D) r1.A00(obj));
        return AnonymousClass98E.A01((C384459hM) r3.A01());
    }
}
