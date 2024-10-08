package X;

import java.util.HashMap;

/* renamed from: X.Qok  reason: case insensitive filesystem */
public final class C8334Qok extends C11335SNp {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public String A05;

    public final String toString() {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("language", this.A05);
        A1E.put("screenColors", Integer.valueOf(this.A00));
        A1E.put("screenWidth", Integer.valueOf(this.A01));
        A1E.put("screenHeight", Integer.valueOf(this.A02));
        A1E.put("viewportWidth", Integer.valueOf(this.A03));
        return C11335SNp.A01("viewportHeight", Integer.valueOf(this.A04), A1E);
    }
}
