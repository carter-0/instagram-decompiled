package X;

import android.content.Context;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.BitSet;
import java.util.Map;

public final class A9R {
    public final Map A00 = AnonymousClass7TE.A1E();
    public final Map A01 = AnonymousClass7TE.A1E();
    public final Map A02 = AnonymousClass7TE.A1E();
    public final Context A03;
    public final BitSet A04 = new BitSet(0);

    public final void A01(0sK r4) {
        this.A01.put("share_image_data_callback", new Q3B(new C73469PdB(0, this, r4)));
    }

    public final void A00(IgBloksScreenConfig igBloksScreenConfig) {
        C46649DiU A06 = C46649DiU.A06(C66579MXk.A00(58), C359608dC.A01(this.A02), this.A01);
        A06.A00 = -1;
        A06.A05 = null;
        A06.A01 = 0;
        A06.A06 = null;
        A06.A03 = null;
        A06.A02 = null;
        A06.A04 = null;
        A06.A0H(this.A00);
        A06.A0E(this.A03, igBloksScreenConfig);
    }

    public A9R(Context context) {
        this.A03 = context;
    }
}
