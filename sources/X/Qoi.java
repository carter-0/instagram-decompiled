package X;

import java.util.HashMap;

public final class Qoi extends C11335SNp {
    public long A00;
    public String A01;
    public String A02;
    public String A03;

    public final String toString() {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("variableName", this.A02);
        A1E.put("timeInMillis", Long.valueOf(this.A00));
        A1E.put("category", this.A01);
        return C11335SNp.A01("label", this.A03, A1E);
    }
}
