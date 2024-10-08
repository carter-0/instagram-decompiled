package X;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.Arrays;

/* renamed from: X.XzT  reason: case insensitive filesystem */
public final class C22318XzT implements AnonymousClass98A {
    public final int A00;

    public C22318XzT(int i) {
        this.A00 = i;
    }

    public final AnonymousClass97G E1r(C375049Ca r8, C3740097u r9) {
        GeneralSecurityException generalSecurityException;
        Throwable th;
        int i = this.A00;
        C3739997t r92 = (C3739997t) r9;
        String str = r92.A05;
        switch (i) {
            case 0:
                if (str.equals("type.googleapis.com/google.crypto.tink.HpkePublicKey")) {
                    try {
                        XP9 xp9 = (XP9) AnonymousClass972.A00(r92.A02, C3738397d.A00(), XP9.DEFAULT_INSTANCE);
                        if (xp9.version_ == 0) {
                            AnonymousClass98D r1 = r92.A01;
                            XP5 xp5 = xp9.params_;
                            if (xp5 == null) {
                                xp5 = XP5.DEFAULT_INSTANCE;
                            }
                            C21195XOb A002 = C22021Xsx.A00(xp5, r1);
                            return C21200XOg.A00(A002, C22021Xsx.A03(A002.A02, xp9.publicKey_.A04()), r92.A04);
                        }
                        throw AnonymousClass7TG.A0q("Only version 0 keys are accepted");
                    } catch (AnonymousClass9GO unused) {
                        throw AnonymousClass7TG.A0q("Parsing HpkePublicKey failed");
                    }
                } else {
                    throw AnonymousClass7TF.A0W("Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: ", str);
                }
            case 1:
                if (str.equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
                    try {
                        XP8 xp8 = (XP8) AnonymousClass972.A00(r92.A02, C3738397d.A00(), XP8.DEFAULT_INSTANCE);
                        if (xp8.version_ == 0) {
                            XP9 xp92 = xp8.publicKey_;
                            if (xp92 == null) {
                                xp92 = XP9.DEFAULT_INSTANCE;
                            }
                            AnonymousClass98D r12 = r92.A01;
                            XP5 xp52 = xp92.params_;
                            if (xp52 == null) {
                                xp52 = XP5.DEFAULT_INSTANCE;
                            }
                            C21195XOb A003 = C22021Xsx.A00(xp52, r12);
                            XOa xOa = A003.A02;
                            C21200XOg A004 = C21200XOg.A00(A003, C22021Xsx.A03(xOa, xp92.publicKey_.A04()), r92.A04);
                            byte[] A01 = C21514Xdg.A01(new BigInteger(1, xp8.privateKey_.A04()), C21996Xq3.A00(xOa));
                            C375049Ca.A00(r8);
                            return C21197XOd.A00(A004, C375079Cd.A01(r8, A01));
                        }
                        throw AnonymousClass7TG.A0q("Only version 0 keys are accepted");
                    } catch (AnonymousClass9GO unused2) {
                        throw AnonymousClass7TG.A0q("Parsing HpkePrivateKey failed");
                    }
                } else {
                    throw AnonymousClass7TF.A0W("Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: ", str);
                }
            case 2:
                if (str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                    try {
                        XPA xpa = (XPA) AnonymousClass972.A00(r92.A02, C3738397d.A00(), XPA.DEFAULT_INSTANCE);
                        if (xpa.version_ == 0) {
                            AnonymousClass98D r13 = r92.A01;
                            XP6 xp6 = xpa.params_;
                            if (xp6 == null) {
                                xp6 = XP6.DEFAULT_INSTANCE;
                            }
                            C21196XOc A012 = C22022Xsy.A01(xp6, r13);
                            if (!A012.A01.equals(Xnm.A04)) {
                                return XOh.A01(A012, r92.A04, new ECPoint(new BigInteger(1, xpa.x_.A04()), new BigInteger(1, xpa.y_.A04())));
                            } else if (xpa.y_.A02() == 0) {
                                return XOh.A00(A012, C3740497y.A00(xpa.x_.A04()), r92.A04);
                            } else {
                                generalSecurityException = AnonymousClass7TG.A0q("Y must be empty for X25519 points");
                            }
                        } else {
                            generalSecurityException = AnonymousClass7TG.A0q("Only version 0 keys are accepted");
                        }
                        throw generalSecurityException;
                    } catch (AnonymousClass9GO | IllegalArgumentException unused3) {
                        throw AnonymousClass7TG.A0q("Parsing EcdsaPublicKey failed");
                    }
                } else {
                    throw AnonymousClass7TF.A0W("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: ", str);
                }
            default:
                if (str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                    try {
                        XP7 xp7 = (XP7) AnonymousClass972.A00(r92.A02, C3738397d.A00(), XP7.DEFAULT_INSTANCE);
                        if (xp7.version_ == 0) {
                            XPA xpa2 = xp7.publicKey_;
                            if (xpa2 == null) {
                                xpa2 = XPA.DEFAULT_INSTANCE;
                            }
                            AnonymousClass98D r14 = r92.A01;
                            XP6 xp62 = xpa2.params_;
                            if (xp62 == null) {
                                xp62 = XP6.DEFAULT_INSTANCE;
                            }
                            C21196XOc A013 = C22022Xsy.A01(xp62, r14);
                            if (A013.A01.equals(Xnm.A04)) {
                                XOh A005 = XOh.A00(A013, C3740497y.A00(xpa2.x_.A04()), r92.A04);
                                byte[] A04 = xp7.keyValue_.A04();
                                C375049Ca.A00(r8);
                                C375079Cd A014 = C375079Cd.A01(r8, A04);
                                C3740497y r15 = A005.A02;
                                if (r15 != null) {
                                    byte[] A02 = A014.A02(C375049Ca.A00);
                                    byte[] A015 = r15.A01();
                                    if (A02.length != 32) {
                                        th = AnonymousClass7TG.A0q("Private key bytes length for X25519 curve must be 32");
                                    } else if (Arrays.equals(C18109Vld.A00(A02), A015)) {
                                        return new C21198XOe(A005, (XZF) null, A014);
                                    } else {
                                        th = AnonymousClass7TG.A0q("Invalid private key for public key.");
                                    }
                                } else {
                                    th = AnonymousClass7TG.A0q("ECIES private key for X25519 curve cannot be constructed with NIST-curve public key");
                                }
                            } else {
                                XOh A016 = XOh.A01(A013, r92.A04, new ECPoint(new BigInteger(1, xpa2.x_.A04()), new BigInteger(1, xpa2.y_.A04())));
                                BigInteger bigInteger = new BigInteger(1, xp7.keyValue_.A04());
                                C375049Ca.A00(r8);
                                if (r8 != null) {
                                    return C21198XOe.A00(A016, new XZF(bigInteger));
                                }
                                th = AnonymousClass7TE.A11(AnonymousClass000.A00(478));
                            }
                        } else {
                            th = AnonymousClass7TG.A0q("Only version 0 keys are accepted");
                        }
                        throw th;
                    } catch (AnonymousClass9GO | IllegalArgumentException unused4) {
                        throw AnonymousClass7TG.A0q("Parsing EcdsaPrivateKey failed");
                    }
                } else {
                    throw AnonymousClass7TF.A0W("Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: ", str);
                }
        }
    }
}
