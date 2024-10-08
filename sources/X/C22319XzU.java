package X;

/* renamed from: X.XzU  reason: case insensitive filesystem */
public final class C22319XzU implements C3739797r {
    public final int A00;

    public C22319XzU(int i) {
        this.A00 = i;
    }

    public final C3740097u ENB(AnonymousClass97G r6, C375049Ca r7) {
        AnonymousClass97V A0A;
        AnonymousClass97O r3;
        AnonymousClass98D r2;
        Integer num;
        String str;
        byte[] A01;
        switch (this.A00) {
            case 0:
                C21200XOg xOg = (C21200XOg) r6;
                A0A = C22021Xsx.A02(xOg).A0A();
                r3 = AnonymousClass97O.ASYMMETRIC_PUBLIC;
                r2 = (AnonymousClass98D) C22021Xsx.A00.A00(xOg.A00.A03);
                num = xOg.A03;
                str = "type.googleapis.com/google.crypto.tink.HpkePublicKey";
                break;
            case 1:
                C21197XOd xOd = (C21197XOd) r6;
                C375269Cx A0C = XP8.DEFAULT_INSTANCE.A0C();
                A0C.A03();
                ((XP8) A0C.A00).version_ = 0;
                C21200XOg xOg2 = xOd.A00;
                XP9 A02 = C22021Xsx.A02(xOg2);
                A0C.A03();
                XP8 xp8 = (XP8) A0C.A00;
                A02.getClass();
                xp8.publicKey_ = A02;
                xp8.bitField0_ |= 1;
                C375079Cd r0 = xOd.A01;
                C375049Ca.A00(r7);
                byte[] A022 = r0.A02(r7);
                AnonymousClass97V A012 = AnonymousClass97R.A01(A022, 0, A022.length);
                A0C.A03();
                ((XP8) A0C.A00).privateKey_ = A012;
                A0A = A0C.A01().A0A();
                r3 = AnonymousClass97O.ASYMMETRIC_PRIVATE;
                r2 = (AnonymousClass98D) C22021Xsx.A00.A00(xOg2.A00.A03);
                num = xOd.A04();
                str = "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
                break;
            case 2:
                XOh xOh = (XOh) r6;
                A0A = C22022Xsy.A03(xOh).A0A();
                r3 = AnonymousClass97O.ASYMMETRIC_PUBLIC;
                r2 = (AnonymousClass98D) C22022Xsy.A00.A00(xOh.A00.A04);
                num = xOh.A03;
                str = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
                break;
            default:
                C21198XOe xOe = (C21198XOe) r6;
                C375269Cx A0C2 = XP7.DEFAULT_INSTANCE.A0C();
                A0C2.A03();
                ((XP7) A0C2.A00).version_ = 0;
                XOh xOh2 = xOe.A00;
                XPA A03 = C22022Xsy.A03(xOh2);
                A0C2.A03();
                XP7 xp7 = (XP7) A0C2.A00;
                A03.getClass();
                xp7.publicKey_ = A03;
                xp7.bitField0_ |= 1;
                C21196XOc xOc = xOh2.A00;
                Xnm xnm = xOc.A01;
                if (xnm.equals(Xnm.A04)) {
                    C375079Cd r02 = xOe.A02;
                    C375049Ca.A00(r7);
                    A01 = r02.A02(r7);
                } else {
                    int A002 = C22022Xsy.A00(xnm);
                    XZF xzf = xOe.A01;
                    C375049Ca.A00(r7);
                    if (r7 != null) {
                        A01 = C21514Xdg.A01(xzf.A00, A002);
                    } else {
                        throw AnonymousClass7TE.A11(AnonymousClass000.A00(478));
                    }
                }
                AnonymousClass97V A013 = AnonymousClass97R.A01(A01, 0, A01.length);
                A0C2.A03();
                ((XP7) A0C2.A00).keyValue_ = A013;
                A0A = A0C2.A01().A0A();
                r3 = AnonymousClass97O.ASYMMETRIC_PRIVATE;
                r2 = (AnonymousClass98D) C22022Xsy.A00.A00(xOc.A04);
                num = xOe.A04();
                str = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
                break;
        }
        return C3739997t.A00(r3, r2, A0A, num, str);
    }
}
