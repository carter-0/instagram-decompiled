package X;

/* renamed from: X.99V  reason: invalid class name */
public final /* synthetic */ class AnonymousClass99V implements C3739797r {
    public final C3740097u ENB(AnonymousClass97G r7, C375049Ca r8) {
        AnonymousClass99M r72 = (AnonymousClass99M) r7;
        C375269Cx A0C = AnonymousClass99E.DEFAULT_INSTANCE.A0C();
        C375269Cx A0C2 = C384439hK.DEFAULT_INSTANCE.A0C();
        C375269Cx A0C3 = C21212XOz.DEFAULT_INSTANCE.A0C();
        AnonymousClass99S r2 = r72.A00;
        int i = r2.A02;
        A0C3.A03();
        ((C21212XOz) A0C3.A00).ivSize_ = i;
        C21212XOz xOz = (C21212XOz) A0C3.A01();
        A0C2.A03();
        C384439hK r1 = (C384439hK) A0C2.A00;
        xOz.getClass();
        r1.params_ = xOz;
        r1.bitField0_ |= 1;
        C375079Cd r0 = r72.A02;
        C375049Ca.A00(r8);
        byte[] A02 = r0.A02(r8);
        AnonymousClass97V A01 = AnonymousClass97R.A01(A02, 0, A02.length);
        A0C2.A03();
        ((C384439hK) A0C2.A00).keyValue_ = A01;
        C384439hK r02 = (C384439hK) A0C2.A01();
        A0C.A03();
        AnonymousClass99E r12 = (AnonymousClass99E) A0C.A00;
        r02.getClass();
        r12.aesCtrKey_ = r02;
        r12.bitField0_ |= 1;
        C375269Cx A0C4 = C3740898c.DEFAULT_INSTANCE.A0C();
        C384379hE A022 = AnonymousClass99Q.A02(r2);
        A0C4.A03();
        C3740898c r13 = (C3740898c) A0C4.A00;
        A022.getClass();
        r13.params_ = A022;
        r13.bitField0_ |= 1;
        C375079Cd r03 = r72.A03;
        C375049Ca.A00(r8);
        byte[] A023 = r03.A02(r8);
        AnonymousClass97V A012 = AnonymousClass97R.A01(A023, 0, A023.length);
        A0C4.A03();
        ((C3740898c) A0C4.A00).keyValue_ = A012;
        C3740898c r04 = (C3740898c) A0C4.A01();
        A0C.A03();
        AnonymousClass99E r14 = (AnonymousClass99E) A0C.A00;
        r04.getClass();
        r14.hmacKey_ = r04;
        r14.bitField0_ |= 2;
        return C3739997t.A00(AnonymousClass97O.SYMMETRIC, AnonymousClass99Q.A03(r2.A05), A0C.A01().A0A(), r72.A04, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
    }
}
