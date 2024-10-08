package X;

import android.net.Uri;
import android.os.Bundle;

/* renamed from: X.La2  reason: case insensitive filesystem */
public final class C64327La2 implements 07h {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ K6Y A01;

    public C64327La2(Uri uri, K6Y k6y) {
        this.A01 = k6y;
        this.A00 = uri;
    }

    public final 07p D6j(Bundle bundle, int i) {
        K6Y k6y = this.A01;
        return new C59854JaV(k6y.requireContext(), this.A00, (Uri) null, AnonymousClass7TE.A0l(k6y.A0N));
    }

    public final /* bridge */ /* synthetic */ void DOK(07p r5, Object obj) {
        C364808m2 r0;
        C364808m2 r02;
        String AvM;
        C59861Jad jad = (C59861Jad) obj;
        0qQ.A0B(jad, 1);
        K6Y k6y = this.A01;
        AnonymousClass0vF r03 = K6Y.A0O;
        C364808m2 r1 = k6y.A0A;
        if (!(r1 == null || (r0 = jad.A02) == null || 2PP.A00(r1.AvM(), r0.AvM()) || (r02 = k6y.A0A) == null || (AvM = r02.AvM()) == null)) {
            K6Y.A0O.ATE(new C386539kl(AvM));
        }
        k6y.A0A = jad.A02;
        k6y.A07 = jad.A01;
        k6y.A01 = jad.A00;
        k6y.A0L.post(new M3U(k6y));
    }
}
