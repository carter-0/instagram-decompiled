package X;

import android.content.Context;
import androidx.media3.common.util.Util;
import com.google.common.collect.ComparatorOrdering;

/* renamed from: X.XGs  reason: case insensitive filesystem */
public final class C21151XGs extends C21294XTo implements Y81 {
    public static final C264654Qt A07 = new ComparatorOrdering(new C22426Y3i(0));
    public SIH A00;
    public C7439QDe A01;
    public Xnp A02;
    public final Context A03;
    public final Y8C A04;
    public final Object A05;
    public final boolean A06;

    public C21151XGs(Context context) {
        C22096XvM xvM = new C22096XvM();
        C7439QDe qDe = C7439QDe.A09;
        C7439QDe qDe2 = new C7439QDe(new C7438QDd(context));
        this.A05 = Pxe.A0p();
        this.A03 = context.getApplicationContext();
        this.A04 = xvM;
        this.A01 = qDe2;
        this.A00 = SIH.A01;
        boolean A1P = AnonymousClass7TF.A1P(Util.A0C(context) ? 1 : 0);
        this.A06 = A1P;
        if (!A1P && Util.A01 >= 32) {
            this.A02 = Xnp.A00(context);
        }
    }

    public C21151XGs() {
    }
}
