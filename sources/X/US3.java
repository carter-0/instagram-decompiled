package X;

import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.UIManagerModule;

public final class US3 extends C13084TKq {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UIManagerModule A01;
    public final /* synthetic */ Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public US3(Q6H q6h, UIManagerModule uIManagerModule, Object obj, int i) {
        super(q6h);
        this.A01 = uIManagerModule;
        this.A00 = i;
        this.A02 = obj;
    }

    public final void A00() {
        W2L w2l = this.A01.mUIImplementation;
        int i = this.A00;
        Object obj = this.A02;
        ReactShadowNode A002 = w2l.A04.A00(i);
        if (A002 == null) {
            C13990Tnq.A1R("Attempt to set local data for view with unknown tag: ", i);
            return;
        }
        A002.EcY(obj);
        W2L.A03(w2l);
    }
}
