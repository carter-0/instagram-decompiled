package X;

/* renamed from: X.Gl5  reason: case insensitive filesystem */
public final class C53257Gl5 extends AnonymousClass0T0 {
    public final C53284GlW A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53257Gl5) {
                C53257Gl5 gl5 = (C53257Gl5) obj;
                if (!0qQ.A0K(this.A00, gl5.A00) || this.A01 != gl5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0K = AnonymousClass7TE.A0K(this.A00);
        int intValue = this.A01.intValue();
        if (1 != intValue) {
            str = "ContainingThread";
        } else {
            str = "ReplyThreads";
        }
        return A0K + C51966G9m.A04(str, intValue);
    }

    public C53257Gl5(C53284GlW glW, Integer num) {
        this.A00 = glW;
        this.A01 = num;
    }
}
