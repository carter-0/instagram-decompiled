package X;

/* renamed from: X.RSc  reason: case insensitive filesystem */
public abstract class C9176RSc {
    public static C276544tV A00(C307786Rm r3, String str) {
        C276544tV A00;
        C307446Qd A02 = C307476Qg.A02(r3);
        C276544tV A05 = A02.A05();
        if (A05 != null && (A00 = C7299Q2y.A00(A05, new C7296Q2v(str))) != null) {
            return A00;
        }
        C276544tV A002 = C7299Q2y.A00(A02.A06(), new C7296Q2v(str));
        1Kn.A02("BloksModelFinder", String.format("Found node %s in unbound tree but not in bound tree %s", new Object[]{str, A02.A05()}));
        return A002;
    }
}
