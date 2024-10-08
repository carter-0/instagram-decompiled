package X;

import android.content.Context;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.BitSet;
import java.util.Map;

public final class LDg {
    public final Map A00 = AnonymousClass7TE.A1E();
    public final Map A01 = AnonymousClass7TE.A1E();
    public final Map A02 = AnonymousClass7TE.A1E();
    public final Context A03;
    public final BitSet A04 = new BitSet(0);

    public final void A00(IgBloksScreenConfig igBloksScreenConfig) {
        C46649DiU A06 = C46649DiU.A06(AnonymousClass000.A00(550), C359608dC.A01(this.A02), this.A01);
        A06.A00 = 719983200;
        A06.A05 = null;
        A06.A01 = 0;
        A06.A06 = null;
        A06.A03 = null;
        A06.A02 = null;
        A06.A04 = null;
        A06.A0H(this.A00);
        A06.A0D(this.A03, igBloksScreenConfig);
    }

    public LDg(Context context) {
        this.A03 = context;
    }
}
