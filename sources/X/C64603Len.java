package X;

import java.io.InputStream;

/* renamed from: X.Len  reason: case insensitive filesystem */
public final class C64603Len implements 1Fk {
    public int A00;
    public final int A01;
    public final 02m A02;
    public final 1Fk A03;
    public final String A04;

    public final 1XR AWn(2ZL r8, InputStream inputStream) {
        0qQ.A0B(inputStream, 1);
        try {
            02m r6 = this.A02;
            int i = this.A01;
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("chunk");
            A1A.append('_');
            A1A.append(this.A00);
            r6.markerPoint(1001455617, i, AnonymousClass7TF.A0l("_start", A1A));
            1XR AWn = this.A03.AWn(r8, inputStream);
            StringBuilder A0n = AnonymousClass7TF.A0n("chunk");
            A0n.append('_');
            A0n.append(this.A00);
            r6.markerPoint(1001455617, i, AnonymousClass7TF.A0l("_end", A0n));
            this.A00++;
            return AWn;
        } catch (Exception e) {
            this.A02.markerEnd(1001455617, this.A01, 3);
            throw e;
        }
    }

    public final void onFinish() {
        this.A03.onFinish();
        this.A02.markerEnd(1001455617, this.A01, 2);
    }

    public final void onStart() {
        this.A02.markerStart(1001455617, this.A01, "event", this.A04);
        this.A03.onStart();
    }

    public C64603Len(02m r2, 1Fk r3, String str) {
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = str;
        this.A01 = str.hashCode();
    }
}
