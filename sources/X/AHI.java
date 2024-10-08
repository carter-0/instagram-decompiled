package X;

import android.opengl.GLES20;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

public abstract class AHI {
    public static final ArrayList A01(List list, int[] iArr, AnonymousClass8HL[] r13, float f, float f2, float f3) {
        List list2 = list;
        boolean A1Z = AnonymousClass7TG.A1Z(r13, list);
        float f4 = f / (1000.0f / 33.0f);
        ArrayList A1C = AnonymousClass7TE.A1C();
        int i = 0;
        for (AnonymousClass8HL r6 : r13) {
            r6.A00(list2, A1C, f4, f2, f3);
            float f5 = r6.A00;
            if (f5 == 1.0f || f5 == 0.0f) {
                iArr[i] = A1C.size() - (A1Z ? 1 : 0);
                i++;
            }
        }
        return A1C;
    }

    public static final void A02(AHA aha, C368538so r19, List list, float[] fArr, int i, int i2, long j) {
        float f;
        AHA aha2 = aha;
        0qQ.A0B(aha2, 0);
        C368538so r10 = r19;
        float[] fArr2 = fArr;
        AnonymousClass7TG.A1Q(r10, fArr2);
        List list2 = list;
        int i3 = i;
        int i4 = i2;
        long j2 = j;
        if (i3 < i4) {
            r10.A01(((C369008tg) list2.get(i3)).A03, fArr2, j2);
            aha2.A04(r10);
            return;
        }
        long A05 = (long) AnonymousClass7TE.A05((float) (list2.size() - i4), 0.3f);
        long A052 = (long) AnonymousClass7TE.A05((float) (list2.size() - i4), 0.7f);
        int size = list2.size() - 1;
        long j3 = (long) i3;
        long j4 = (long) i4;
        long j5 = j4 + A05;
        float f2 = 0.05f;
        float f3 = 825.0467f;
        float f4 = 0.02f;
        float f5 = 1620.0f;
        if (j3 < j5) {
            f = ((float) (i3 - i4)) / ((float) A05);
            f2 = 0.0f;
            f3 = 750.0f;
            f5 = 825.0467f;
        } else {
            long j6 = j4 + A052;
            if (j3 < j6) {
                f = ((float) (j3 - j5)) / ((float) (A052 - A05));
                f2 = 0.02f;
                f4 = 0.05f;
            } else {
                f = ((float) (j3 - j6)) / ((float) (((long) size) - j6));
                f3 = 1620.0f;
                f4 = 0.0f;
            }
        }
        r10.A01(((C369008tg) list2.get(i3)).A03, fArr2, j2);
        float f6 = (float) ((C369008tg) list2.get(i3)).A02;
        float f7 = (float) ((C369008tg) list2.get(i3)).A01;
        AHA.A01(aha2, r10);
        C361258fv A00 = AHA.A00(aha2, AnonymousClass05K.A0C);
        A00.A02("uAmplitude", f2 + ((f4 - f2) * f));
        A00.A02("uFrequency", f3 + (f * (f5 - f3)));
        GLES20.glUniform2f(C361258fv.A00(A00, "uRenderSize"), f6, f7);
        aha2.A03(A00, r10);
    }

    public static final void A03(AHA aha, C368538so r12, List list, float[] fArr, int i, long j) {
        C361258fv A00;
        C346337v0 r1;
        String str;
        0qQ.A0B(aha, 0);
        AnonymousClass7TG.A1Q(r12, fArr);
        long A05 = (long) AnonymousClass7TE.A05((float) list.size(), 0.16666667f);
        long size = ((long) list.size()) - A05;
        int size2 = (list.size() - 1) - i;
        int A052 = AnonymousClass7TE.A05((float) list.size(), 0.05f);
        int A053 = AnonymousClass7TE.A05((float) list.size(), 0.11666667f);
        int A054 = AnonymousClass7TE.A05((float) list.size(), 0.18333334f);
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (i >= A052) {
            A1C.add(new Pair(((C369008tg) list.get(i - A052)).A03, Float.valueOf(A00(i, (int) A05, (int) size, A052, size2) * 0.25f)));
        }
        if (i >= A053) {
            A1C.add(new Pair(((C369008tg) list.get(i - A053)).A03, Float.valueOf(A00(i, (int) A05, (int) size, A053, size2) * 0.2f)));
        }
        if (i >= A054) {
            A1C.add(new Pair(((C369008tg) list.get(i - A054)).A03, Float.valueOf(A00(i, (int) A05, (int) size, A054, size2) * 0.15f)));
        }
        r12.A01(((C369008tg) list.get(i)).A03, fArr, j);
        AHA.A01(aha, r12);
        if (A1C.isEmpty()) {
            A00 = AHA.A00(aha, AnonymousClass05K.A00);
        } else {
            A00 = AHA.A00(aha, AnonymousClass05K.A01);
            for (int i2 = 0; i2 < A1C.size(); i2++) {
                if (i2 == 0) {
                    A00.A02("uFirstFrameOpacity", AnonymousClass7TE.A04(((Pair) A1C.get(i2)).second));
                    r1 = (C346337v0) ((Pair) A1C.get(i2)).first;
                    str = "sFirstFrameTexture";
                } else if (i2 == 1) {
                    A00.A02("uSecondFrameOpacity", AnonymousClass7TE.A04(((Pair) A1C.get(i2)).second));
                    r1 = (C346337v0) ((Pair) A1C.get(i2)).first;
                    str = "sSecondFrameTexture";
                } else if (i2 == 2) {
                    A00.A02("uThirdFrameOpacity", AnonymousClass7TE.A04(((Pair) A1C.get(i2)).second));
                    r1 = (C346337v0) ((Pair) A1C.get(i2)).first;
                    str = "sThirdFrameTexture";
                }
                A00.A03(str, r1);
            }
        }
        aha.A03(A00, r12);
    }

    public static final float A00(int i, int i2, int i3, int i4, int i5) {
        double pow;
        if (i <= i2) {
            pow = Math.sqrt((double) (((float) (i - i4)) / ((float) (i2 - i4))));
        } else if (i < i3) {
            return 1.0f;
        } else {
            pow = Math.pow((double) (((float) i5) / ((float) i2)), 2.0d);
        }
        return (float) pow;
    }
}
