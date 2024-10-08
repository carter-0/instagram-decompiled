package X;

import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.6Qv  reason: invalid class name and case insensitive filesystem */
public final class C307626Qv implements C307636Qw {
    public final C307576Qq A00;
    public final C307566Qp A01;

    public C307626Qv(C307576Qq r1, C307566Qp r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void AUw(Q3K q3k, Q3F q3f, String str, Map map, Executor executor) {
        boolean isEmpty = map.isEmpty();
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected found non empty params map when attempting to fetch prepackaged cdn payload, ignoring.. [");
        sb.append(map);
        sb.append(']');
        String obj = sb.toString();
        if (!isEmpty) {
            1Kn.A02("BloksPrepackagedBundleFetcher", obj);
        }
        C307586Qr A002 = this.A00.A00(str);
        if (A002 == null) {
            q3f.A01(new C7313Q3p(), new Exception(002.A0g("Attempting to fetch a bundle for appId: ", str, " but found no prepackaged config")));
            return;
        }
        String str2 = A002.A02;
        C10522Rtb rtb = new C10522Rtb(this, q3f, A002);
        0qQ.A0B(str2, 0);
        C7313Q3p q3p = new C7313Q3p();
        1Pq r1 = new 1Pq((1HW) null);
        r1.A02 = str2;
        r1.A01(AnonymousClass05K.A0N);
        1QS A003 = r1.A00();
        T6J t6j = new T6J(rtb, q3p, str2, executor);
        AnonymousClass1QT r12 = new AnonymousClass1QT();
        r12.A04 = 1CE.A02;
        r12.A0A = "bloks_prepackaged";
        r12.A03 = 1Fe.A03;
        AnonymousClass1CO.A00().A02(t6j, A003, r12.A00());
    }
}
