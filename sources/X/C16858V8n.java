package X;

import java.util.List;

/* renamed from: X.V8n  reason: case insensitive filesystem */
public abstract class C16858V8n {
    public static C17729Vcy A00(C307786Rm r17, C276544tV r18, int i, int i2, int i3) {
        C276544tV r3 = r18;
        List A0N = r3.A0N(35);
        int size = A0N.size();
        float[] fArr = new float[size];
        for (int i4 = 0; i4 < size; i4++) {
            fArr[i4] = (float) ((C276544tV) A0N.get(i4)).A03(35, 0);
        }
        C307786Rm r4 = r17;
        return new C17729Vcy((float[]) null, fArr, (VRW[]) null, (String[]) null, (float) i, (float) i2, 0.0f, (float) (i3 - 1), 2.0f, C13988Tno.A03(C13989Tnp.A0L(r4, r3, 41)), C13988Tno.A03(C13989Tnp.A0L(r4, r3, 36)), C13988Tno.A03(C13989Tnp.A0L(r4, r3, 40)), C13988Tno.A03(C13989Tnp.A0L(r4, r3, 38)), JTQ.A1O(C13988Tno.A03(C13989Tnp.A0L(r4, r3, 36)), -1), false, false);
    }
}
