package X;

import android.content.Context;
import com.facebook.ultralight.UL;
import java.util.List;
import java.util.Map;

public final class XLy extends XM1 implements C22556YAg {
    public boolean A00;
    public final XZ4 A01 = new XZ4();
    public final Context A02;
    public final XM0 A03;
    public final ThreadLocal A04;
    public final Map A05;

    public final XLy Bpn() {
        return this;
    }

    public final C21390XZx BHE() {
        return (C21390XZx) this.A04.get();
    }

    @Deprecated
    public final YCK Bpl() {
        YCK yck;
        if (this.A00) {
            List list = BHE().A01;
            if (!list.isEmpty() && (yck = (YCK) C66582MXn.A0r(list)) != null) {
                return yck;
            }
            throw AnonymousClass7TE.A0z("Should never call getScopeAwareInjector without an active ThreadStack");
        }
        throw new RuntimeException("Called injector during binding");
    }

    public XLy(Context context) {
        boolean z = false;
        this.A04 = new Y5Q(this);
        0fh.A01("FbInjectorImpl.init", 2016050172);
        try {
            this.A02 = context.getApplicationContext();
            this.A03 = new XM0(context, this);
            17k.A0E(context == context.getApplicationContext() ? true : z);
            this.A05 = UL.InitModule.getScopes(this);
            this.A00 = true;
        } finally {
            0fh.A00(-150288968);
        }
    }

    public final C22556YAg AcB() {
        return this.A03;
    }
}
