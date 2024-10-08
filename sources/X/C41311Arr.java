package X;

import android.graphics.Point;
import android.graphics.Rect;
import java.util.concurrent.Callable;

/* renamed from: X.Arr  reason: case insensitive filesystem */
public final /* synthetic */ class C41311Arr implements Callable {
    public final /* synthetic */ AnonymousClass9RJ A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ C41311Arr(AnonymousClass9RJ r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final Object call() {
        int A08;
        AnonymousClass9RJ r3 = this.A00;
        boolean z = this.A01;
        if (r3.isConnected()) {
            if (z) {
                AnonymousClass9S6 r4 = r3.A0I;
                r4.A06.A06("Lock focus can only happen on the Optic thread.");
                if (!r4.A09) {
                    r4.A07 = false;
                    AnonymousClass9S6.A00((Point) null, r4.A02, r4, AnonymousClass05K.A0j);
                } else if (r4.A09 && ((A08 = AnonymousClass7TG.A08(C342717p3.A0D, r4.A05.A02(r4.A00))) == 1 || A08 == 2)) {
                    r4.A04 = false;
                    if (!r4.A07 && !r4.A08) {
                        r4.A03((Rect) null, (C365938nv) null);
                    }
                }
            }
            C378979Ry A012 = AnonymousClass9RJ.A01(r3, r3.A00);
            A012.A00.A01(C342717p3.A0P, true);
            A012.A00.A01(C342717p3.A0R, true);
            A012.A02();
            return null;
        }
        throw new C352928Fp("Failed to lock automatics (focus, exposure, white-balance)");
    }
}
