package X;

/* renamed from: X.99R  reason: invalid class name */
public final /* synthetic */ class AnonymousClass99R implements AnonymousClass980 {
    public final C3740097u ENC(AnonymousClass983 r7) {
        AnonymousClass99S r72 = (AnonymousClass99S) r7;
        C384319h8 r2 = (C384319h8) C384459hM.DEFAULT_INSTANCE.A0C();
        r2.A06("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        C375269Cx A0C = C384399hG.DEFAULT_INSTANCE.A0C();
        C375269Cx A0C2 = C384409hH.DEFAULT_INSTANCE.A0C();
        C375269Cx A0C3 = C21212XOz.DEFAULT_INSTANCE.A0C();
        int i = r72.A02;
        A0C3.A03();
        ((C21212XOz) A0C3.A00).ivSize_ = i;
        C21212XOz xOz = (C21212XOz) A0C3.A01();
        A0C2.A03();
        C384409hH r1 = (C384409hH) A0C2.A00;
        xOz.getClass();
        r1.params_ = xOz;
        r1.bitField0_ |= 1;
        int i2 = r72.A00;
        A0C2.A03();
        ((C384409hH) A0C2.A00).keySize_ = i2;
        C384409hH r0 = (C384409hH) A0C2.A01();
        A0C.A03();
        C384399hG r12 = (C384399hG) A0C.A00;
        r0.getClass();
        r12.aesCtrKeyFormat_ = r0;
        r12.bitField0_ |= 1;
        C375269Cx A0C4 = C384449hL.DEFAULT_INSTANCE.A0C();
        C384379hE A02 = AnonymousClass99Q.A02(r72);
        A0C4.A03();
        C384449hL r13 = (C384449hL) A0C4.A00;
        A02.getClass();
        r13.params_ = A02;
        r13.bitField0_ |= 1;
        int i3 = r72.A01;
        A0C4.A03();
        ((C384449hL) A0C4.A00).keySize_ = i3;
        C384449hL r02 = (C384449hL) A0C4.A01();
        A0C.A03();
        C384399hG r14 = (C384399hG) A0C.A00;
        r02.getClass();
        r14.hmacKeyFormat_ = r02;
        r14.bitField0_ |= 2;
        r2.A05(A0C.A01().A0A());
        r2.A04(AnonymousClass99Q.A03(r72.A05));
        return AnonymousClass98E.A01((C384459hM) r2.A01());
    }
}
