package X;

import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import com.instagram.react.modules.product.IgReactShoppingPickerModule;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;

public final class T8M implements C13680Tep {
    public final int A00;
    public final Object A01;

    public T8M(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Dx0(int i) {
        switch (this.A00) {
            case 0:
                QZK reactApplicationContextIfActiveOrWarn = ((TK2) this.A01).A01.getReactApplicationContextIfActiveOrWarn();
                if (reactApplicationContextIfActiveOrWarn != null) {
                    ((RCTNativeAppEventEmitter) reactApplicationContextIfActiveOrWarn.A02(RCTNativeAppEventEmitter.class)).emit(IgReactShoppingPickerModule.PICKER_VALUE_SELECTED, Integer.valueOf(i));
                    return;
                }
                return;
            case 1:
                C13680Tep tep = ((MerchantShoppingCartFragment) this.A01).A0K;
                if (tep != null) {
                    tep.Dx0(i);
                    return;
                }
                return;
            default:
                R8Y r8y = (R8Y) this.A01;
                if (r8y.A02) {
                    AnonymousClass1Nd.A00(r8y.A00).A00(new T70(i));
                } else {
                    C13680Tep tep2 = r8y.A01;
                    if (tep2 != null) {
                        tep2.Dx0(i);
                    }
                }
                DbT.A1J(r8y);
                return;
        }
    }
}
