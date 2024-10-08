package X;

import com.instagram.api.schemas.ShoppingOnboardingState;

public final class DPF extends 0Yg implements 0sP {
    public static final DPF A00 = new DPF();

    public DPF() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ShoppingOnboardingState.A01.get(obj);
        if (obj2 == null) {
            return ShoppingOnboardingState.UNRECOGNIZED;
        }
        return obj2;
    }
}
