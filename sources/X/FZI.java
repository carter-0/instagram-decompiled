package X;

import com.instagram.simplewebview.SimpleWebViewConfig;
import java.util.Set;

public final class FZI implements C252213ok {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ERH A01;

    public FZI(ERH erh, int i) {
        this.A01 = erh;
        this.A00 = i;
    }

    public final void DMr(int i, boolean z) {
        ERH erh = this.A01;
        Set set = R8R.A07;
        SimpleWebViewConfig simpleWebViewConfig = erh.A00;
        if (simpleWebViewConfig == null) {
            0qQ.A0F("config");
            throw AnonymousClass00P.createAndThrow();
        }
        if (!simpleWebViewConfig.A07) {
            i -= this.A00;
        }
        0nA.A0X(erh.requireView(), Math.max(i, 0));
    }
}
