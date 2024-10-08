package X;

import android.view.Choreographer;

/* renamed from: X.IFk  reason: case insensitive filesystem */
public final class C56863IFk implements AnonymousClass5PR {
    public static final Choreographer A00 = ((Choreographer) C67351tA.A00(AnonymousClass12y.A00.A0P(), new MEQ(0, (AnonymousClass4D7) null)));
    public static final C56863IFk A01 = new Object();

    public final Object fold(Object obj, 0sL r3) {
        0qQ.A0B(r3, 2);
        return r3.invoke(obj, this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.IFk, java.lang.Object] */
    static {
        AnonymousClass4CZ r0 = AnonymousClass12W.A00;
    }

    public final /* synthetic */ C634312c getKey() {
        return AnonymousClass5PR.A00;
    }

    public final Object FNV(AnonymousClass4D7 r4, 0sP r5) {
        1IW A0q = C51973G9u.A0q(r4);
        C11470SaY saY = new C11470SaY(0, r5, A0q);
        A00.postFrameCallback(saY);
        A0q.CO0(J6M.A00(saY, 19));
        return A0q.A0E();
    }

    public final C262084Cb get(C634312c r2) {
        return AnonymousClass199.A00(this, r2);
    }

    public final C262094Cc minusKey(C634312c r2) {
        return AnonymousClass199.A01(this, r2);
    }

    public final C262094Cc plus(C262094Cc r2) {
        return AnonymousClass199.A02(this, r2);
    }
}
