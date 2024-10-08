package X;

public final class SEG {
    public S21 A00;
    public S21 A01;

    public static final S21 A00(SEG seg) {
        S21 s21;
        S21 s212;
        Throwable th;
        S21 s213 = seg.A00;
        Throwable th2 = null;
        if (s213 == null || seg.A01 == null) {
            return null;
        }
        Throwable th3 = s213.A02;
        if (th3 == null) {
            th3 = null;
        }
        if (!(!DbY.A1Z(0Tu.A06, C11431STx.A00(), 36310430913790052L) || (s212 = seg.A01) == null || (th = s212.A02) == null)) {
            th2 = th;
        }
        S21 s214 = seg.A00;
        if (s214 == null || s214.A02 != null || (s21 = seg.A01) == null || s21.A02 != null) {
            if (th2 != null) {
                th3 = th2;
            }
            return C11097S9y.A01(th3);
        }
        0qQ.A0A(s214);
        Object obj = s214.A01;
        0qQ.A0A(obj);
        S21 s215 = seg.A01;
        0qQ.A0A(s215);
        Object obj2 = s215.A01;
        0qQ.A0A(obj2);
        return C11097S9y.A00(0sr.A1P(new String[]{(String) obj, (String) obj2}));
    }
}
