package X;

import java.util.ArrayList;

/* renamed from: X.SoC  reason: case insensitive filesystem */
public final class C12161SoC implements C13772Tgl {
    public final /* synthetic */ C11443SVf A00;

    public final void DC2() {
    }

    public C12161SoC(C11443SVf sVf) {
        this.A00 = sVf;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, X.A7b] */
    public final void DC0() {
        C11443SVf sVf = this.A00;
        sVf.A0O.set(0);
        0sI r6 = sVf.A0P;
        Boolean A0v = AnonymousClass7TE.A0v();
        AnonymousClass8HJ r8 = sVf.A0B;
        String str = sVf.A0F;
        ArrayList A1D = AnonymousClass7TE.A1D(sVf.A0M);
        int size = sVf.A0N.size();
        ? obj = new Object();
        obj.A00 = 0.0f;
        obj.A01 = 1.0f;
        obj.A03 = 0;
        obj.A04 = str;
        obj.A06 = A1D;
        obj.A02 = size;
        r6.invoke(A0v, r8, obj, Float.valueOf(sVf.A01), Float.valueOf(sVf.A00));
    }

    public final void DC1(Exception exc, String str) {
        0KC.A0F("DecoderOutputSurfaceHandler", "Boomerang video encoding error", exc);
    }
}
