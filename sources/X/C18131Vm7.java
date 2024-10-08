package X;

import java.util.List;

/* renamed from: X.Vm7  reason: case insensitive filesystem */
public abstract class C18131Vm7 {
    public static C17729Vcy A01(C307786Rm r20, C276544tV r21, int i, int i2, int i3, int i4) {
        C276544tV r1 = r21;
        List A0N = r1.A0N(35);
        float[] fArr = new float[A0N.size()];
        float[] fArr2 = new float[A0N.size()];
        String[] strArr = new String[A0N.size()];
        VRW[] vrwArr = new VRW[A0N.size()];
        for (int i5 = 0; i5 < A0N.size(); i5++) {
            C276544tV r8 = (C276544tV) A0N.get(i5);
            fArr[i5] = r8.A02(36, 0.0f);
            fArr2[i5] = r8.A02(38, 0.0f);
            strArr[i5] = r8.A0K(35);
            String A0K = r8.A0K(45);
            String A0K2 = r8.A0K(46);
            if (!(A0K == null || A0K2 == null)) {
                vrwArr[i5] = new VRW(A0K, A0K2);
            }
        }
        C307786Rm r3 = r20;
        return new C17729Vcy(fArr, fArr2, vrwArr, strArr, (float) i, (float) i2, (float) i3, (float) i4, r1.A02(50, 2.0f), C13988Tno.A03(A00(r3, r1, 41)), C13988Tno.A03(A00(r3, r1, 36)), C13988Tno.A03(A00(r3, r1, 40)), C13988Tno.A03(A00(r3, r1, 38)), JTQ.A1O(C13988Tno.A03(A00(r3, r1, 36)), -1), r1.A0R(48, false), r1.A0R(49, false));
    }

    public static int A00(C307786Rm r2, C276544tV r3, int i) {
        C276544tV A07 = r3.A07(i);
        if (A07 == null) {
            return -1;
        }
        return AnonymousClass6TP.A00(r2, A07, 0);
    }
}
