package X;

import java.nio.charset.Charset;

/* renamed from: X.Syp  reason: case insensitive filesystem */
public final class C12590Syp implements C13651TeI {
    public static final C13743TgF A01 = new C12583Syi();
    public final C13743TgF A00;

    public C12590Syp() {
        C13743TgF tgF;
        C12585Syk A002 = C12585Syk.A00();
        try {
            tgF = (C13743TgF) Pxh.A0h("com.google.protobuf.DescriptorMessageInfoFactory");
        } catch (Exception unused) {
            tgF = A01;
        }
        C12584Syj syj = new C12584Syj(A002, tgF);
        Charset charset = SS6.A02;
        this.A00 = syj;
    }

    public static boolean A00(C13786Th1 th1) {
        if (th1.FPN() - 1 == 1) {
            return false;
        }
        return true;
    }

    public final C13845TiL FOz(Class cls) {
        C9726Rfj A002;
        SRF A003;
        SK0 A0C;
        SI3 si3;
        SA6 A004;
        SK0 A0C2;
        SI3 A005;
        SUi.A0U(cls);
        C13786Th1 FPE = this.A00.FPE(cls);
        Class<C8563Qx1> cls2 = C8563Qx1.class;
        if (FPE.FPL()) {
            if (cls2.isAssignableFrom(cls)) {
                A0C2 = SUi.A0D();
                A005 = C11314SMo.A01();
            } else {
                A0C2 = SUi.A0C();
                A005 = C11314SMo.A00();
            }
            return C12588Syn.A00(A005, FPE.FOy(), A0C2);
        }
        boolean isAssignableFrom = cls2.isAssignableFrom(cls);
        boolean A006 = A00(FPE);
        if (isAssignableFrom) {
            A002 = C11316SMq.A01();
            A003 = SRF.A01();
            A0C = SUi.A0D();
            if (A006) {
                si3 = C11314SMo.A01();
                A004 = C11315SMp.A01();
            } else {
                si3 = null;
                A004 = C11315SMp.A01();
            }
        } else {
            A002 = C11316SMq.A00();
            A003 = SRF.A00();
            A0C = SUi.A0C();
            if (A006) {
                si3 = C11314SMo.A00();
                A004 = C11315SMp.A00();
            } else {
                si3 = null;
                A004 = C11315SMp.A00();
            }
        }
        return C12589Syo.A09(si3, A003, A004, FPE, A002, A0C);
    }
}
