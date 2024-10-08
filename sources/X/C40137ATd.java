package X;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.ATd  reason: case insensitive filesystem */
public final class C40137ATd implements C344747sM {
    public C361248fu A00 = null;
    public C345897uG A01;
    public final C345997uQ A02;
    public final C344407ro A03;

    public final void CMa(C344567s4 r1) {
    }

    public final void release() {
    }

    public final void ACn(C345897uG r3) {
        C345897uG r0 = this.A01;
        if (!(r0 == null || r0 == r3)) {
            this.A03.A00(C368978td.GL_SUPER_RES_RENDERER_CONTEXT_NOT_DETACHED);
        }
        this.A01 = r3;
    }

    public final void detach() {
        C361248fu r1 = this.A00;
        if (r1 != null) {
            r1.A02();
            this.A00 = null;
        }
        this.A01 = null;
    }

    public C40137ATd(C344407ro r6) {
        this.A03 = r6;
        HashMap A1E = AnonymousClass7TE.A1E();
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1E.put("aPosition", new C345987uP(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}));
        A1C.add("aPosition");
        A1E.put("aTexCoord", new C345987uP(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}));
        A1C.add("aTexCoord");
        this.A02 = new C345997uQ(A1C, A1E);
    }
}
