package X;

/* renamed from: X.WKh  reason: case insensitive filesystem */
public final class C19077WKh implements AnonymousClass7QI {
    public W1V A00;

    public final void ABi(C17415VUu vUu, Integer num, String str) {
        WH6 wh6;
        char c;
        0qQ.A0B(num, 1);
        W1V w1v = this.A00;
        if (w1v != null) {
            wh6 = new WH6(w1v);
        } else {
            wh6 = null;
        }
        AnonymousClass4OI A002 = V6Q.A00(wh6, vUu, str);
        switch (num.intValue()) {
            case 0:
                c = 0;
                break;
            case 1:
                c = 1;
                break;
            default:
                c = 2;
                break;
        }
        Integer num2 = AnonymousClass05K.A00(3)[c];
        0qQ.A07(num2);
        C59721JVf jVf = new C59721JVf(A002, num2);
        W1V w1v2 = this.A00;
        if (w1v2 != null) {
            w1v2.A04(jVf);
        }
    }

    public final void E3h(C17415VUu vUu) {
    }

    public final C60914JtY BGx() {
        return new C60914JtY(0, 0, 0);
    }
}
