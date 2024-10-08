package X;

import com.facebook.common.dextricks.Constants;

/* renamed from: X.5aH  reason: invalid class name and case insensitive filesystem */
public final class C287525aH extends 0Yg implements 0sL {
    public static final C287525aH A00 = new C287525aH();

    public C287525aH() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass5RO r11 = (AnonymousClass5RO) obj2;
        AnonymousClass5R6 r10 = (AnonymousClass5R6) ((AnonymousClass5R8) obj);
        r10.A02 = r11;
        AnonymousClass5RL r112 = (AnonymousClass5RL) r11;
        r10.EUC((C268024cd) C286615Xc.A01(AnonymousClass5YA.A01, r112));
        r10.Ebv((AnonymousClass5Q8) C286615Xc.A01(AnonymousClass5YA.A07, r112));
        r10.EqV((AnonymousClass5RG) C286615Xc.A01(AnonymousClass5YA.A0D, r112));
        C267794cD r6 = r10.A0W.A02;
        if ((r6.A00 & Constants.LOAD_RESULT_PGO) != 0) {
            do {
                if ((r6.A01 & Constants.LOAD_RESULT_PGO) != 0) {
                    C267794cD r4 = r6;
                    C285045Pl r0 = null;
                    do {
                        if (r4 instanceof C268824e3) {
                            C267794cD r2 = r4.A03;
                            if (r2.A08) {
                                AnonymousClass5WB.A04(r2);
                            } else {
                                r2.A09 = true;
                            }
                        } else if ((r4.A01 & Constants.LOAD_RESULT_PGO) != 0 && (r4 instanceof C267944cV)) {
                            int i = 0;
                            for (C267794cD r3 = ((C267944cV) r4).A00; r3 != null; r3 = r3.A02) {
                                if ((r3.A01 & Constants.LOAD_RESULT_PGO) != 0) {
                                    i++;
                                    if (i == 1) {
                                        r4 = r3;
                                    } else {
                                        if (r0 == null) {
                                            r0 = new C285045Pl(new C267794cD[16]);
                                        }
                                        if (r4 != null) {
                                            r0.A09(r4);
                                            r4 = null;
                                        }
                                        r0.A09(r3);
                                    }
                                }
                            }
                            if (i == 1) {
                                continue;
                            }
                        }
                        r4 = AnonymousClass5WH.A00(r0);
                        continue;
                    } while (r4 != null);
                }
                if ((r6.A00 & Constants.LOAD_RESULT_PGO) == 0) {
                    break;
                }
                r6 = r6.A02;
            } while (r6 == null);
        }
        return C60340gF.A00;
    }
}
