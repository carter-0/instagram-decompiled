package X;

import java.util.List;

/* renamed from: X.Oym  reason: case insensitive filesystem */
public final class C72218Oym implements 1NU {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C72201OyQ A01;
    public final /* synthetic */ String A02;

    public C72218Oym(C72201OyQ oyQ, String str, long j) {
        this.A01 = oyQ;
        this.A00 = j;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        1GK r6 = (1GK) obj;
        0qQ.A0B(r6, 0);
        if (!r6.A0B() && !r6.A0D()) {
            Object A07 = r6.A07();
            if (A07 != null) {
                C72201OyQ oyQ = this.A01;
                long j = this.A00;
                C72201OyQ.A02(oyQ, this.A02, (List) A07, j);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        return C60340gF.A00;
    }
}
