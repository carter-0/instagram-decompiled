package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.8vh  reason: invalid class name and case insensitive filesystem */
public final class C370018vh {
    public C364758lx A00;
    public C366688pV A01;
    public C370038vj A02;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.8vj] */
    /* JADX WARNING: type inference failed for: r1v0, types: [X.8vp, java.lang.Object] */
    public C370018vh(C366678pU r5) {
        C354998Oe r0;
        0qQ.A0B(r5, 1);
        ? obj = new Object();
        obj.A04 = new C370058vl(r5);
        C366648pR r2 = r5.A01;
        C354988Od r02 = r2.A01;
        ? obj2 = new Object();
        if (!(r02 == null || (r0 = r02.A00) == null)) {
            obj2.A00 = r0.A00;
        }
        obj.A03 = obj2;
        obj.A05 = r2.A05;
        obj.A00 = r2.A00;
        obj.A02 = r2.A03;
        obj.A06 = r2.A06;
        obj.A01 = r2.A02;
        this.A02 = obj;
        this.A01 = r5.A03;
        this.A00 = r5.A02;
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            C370008vg.A00(A0A, this);
            A0A.close();
            return stringWriter.toString();
        } catch (IOException unused) {
            return "";
        }
    }

    public C370018vh() {
    }
}
