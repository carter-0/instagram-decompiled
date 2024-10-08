package X;

import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.UIManagerModule;

public final class US4 extends C13084TKq {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ UIManagerModule A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public US4(Q6H q6h, UIManagerModule uIManagerModule, int i, int i2, int i3) {
        super(q6h);
        this.A03 = uIManagerModule;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
    }

    public final void A00() {
        UIManagerModule uIManagerModule = this.A03;
        W2L w2l = uIManagerModule.mUIImplementation;
        int i = this.A01;
        int i2 = this.A02;
        int i3 = this.A00;
        ReactShadowNode A002 = w2l.A04.A00(i);
        if (A002 == null) {
            C13990Tnq.A1R("Tried to update non-existent root tag: ", i);
        } else {
            ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) A002;
            reactShadowNodeImpl.A0D = Integer.valueOf(i2);
            reactShadowNodeImpl.A0C = Integer.valueOf(i3);
        }
        uIManagerModule.mUIImplementation.A04(-1);
    }
}
