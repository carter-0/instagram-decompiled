package X;

import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Hu7  reason: case insensitive filesystem */
public abstract class C56178Hu7 {
    public static final JLX A01(C307786Rm r8, C276544tV r9, long j) {
        C59537JNj gnw;
        JLX go8;
        int i = r9.A04;
        if (AnonymousClass7TF.A1S(i, 16591)) {
            C276544tV A07 = r9.A07(35);
            if (A07 != null) {
                go8 = new C53417Go9(AnonymousClass6TP.A00(r8, A07, 0));
            } else {
                throw AnonymousClass7TE.A0w("Color shading must specify the themed color");
            }
        } else {
            if (AnonymousClass7TF.A1S(i, 16616)) {
                C276544tV A072 = r9.A07(38);
                if (A072 != null) {
                    C59721JVf A00 = A00(r8, A072);
                    String A0E = r9.A0E();
                    float A01 = C51971G9r.A01(j);
                    float A012 = C56179Hu8.A01(A0E, 0.0f, A01);
                    String A0I = r9.A0I();
                    float A002 = C51972G9s.A00(j);
                    gnw = new C53403Gnv(Shader.TileMode.CLAMP, A00, C56192HuL.A01(A0I, A002, A012), C56192HuL.A01(r9.A0F(), A002, C56179Hu8.A00(r9, A01, 35)));
                } else {
                    throw AnonymousClass7TE.A0w("Radial gradient shading must specify the gradient");
                }
            } else if (i == 16615) {
                C276544tV A073 = r9.A07(38);
                if (A073 != null) {
                    C59721JVf A003 = A00(r8, A073);
                    long A013 = C56192HuL.A01(r9.A0F(), C51972G9s.A00(j), C56179Hu8.A01(r9.A0K(35), 0.0f, C51971G9r.A01(j)));
                    String A0E2 = r9.A0E();
                    float f = 0.0f;
                    if (A0E2 != null) {
                        f = AnonymousClass6Su.A01(A0E2);
                    }
                    gnw = new C53404Gnw(Shader.TileMode.CLAMP, A003, f, A013);
                } else {
                    throw AnonymousClass7TE.A0w("Radial gradient shading must specify the gradient");
                }
            } else {
                throw AnonymousClass7TE.A0w("Unknown canvas shading.");
            }
            go8 = new C53416Go8(gnw);
        }
        return go8;
    }

    public static final C59721JVf A00(C307786Rm r4, C276544tV r5) {
        float[] A0w;
        if (r5.A04 == 16594) {
            List<C276544tV> A0M = r5.A0M(36);
            0qQ.A07(A0M);
            ArrayList A0r = AnonymousClass7TG.A0r(A0M);
            for (C276544tV A00 : A0M) {
                AnonymousClass7TF.A1M(A0r, AnonymousClass6TP.A00(r4, A00, 0));
            }
            int[] A0x = 00k.A0x(A0r);
            List A0N = r5.A0N(35);
            0qQ.A07(A0N);
            if (A0N.isEmpty()) {
                A0w = null;
            } else {
                List A0N2 = r5.A0N(35);
                0qQ.A07(A0N2);
                A0w = 00k.A0w(A0N2);
            }
            return new C59721JVf(5, (Object) A0w, (Object) A0x);
        }
        throw AnonymousClass7TE.A0w("Expected canvas gradient model.");
    }
}
