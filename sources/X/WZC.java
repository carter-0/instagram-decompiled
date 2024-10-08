package X;

import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;

public final class WZC implements X9B {
    public final ProductCollectionLink A00;

    public final User BRo() {
        return null;
    }

    public final String Awd() {
        return this.A00.A03;
    }

    public final String Awf() {
        return this.A00.A04;
    }

    public final String Awg() {
        return this.A00.A05;
    }

    public final Integer Awk() {
        switch (this.A00.A00.ordinal()) {
            case 0:
                return AnonymousClass05K.A0B;
            case 1:
                return AnonymousClass05K.A0Y;
            case 2:
                return AnonymousClass05K.A06;
            case 3:
                return AnonymousClass05K.A0C;
            case 4:
                return AnonymousClass05K.A05;
            case 5:
                return AnonymousClass05K.A04;
            case 6:
                return AnonymousClass05K.A02;
            case 7:
                return AnonymousClass05K.A03;
            case 8:
                return AnonymousClass05K.A0j;
            case 9:
                return AnonymousClass05K.A0u;
            case 10:
                return AnonymousClass05K.A15;
            case 11:
                return AnonymousClass05K.A1F;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return AnonymousClass05K.A1I;
            case 13:
                return AnonymousClass05K.A07;
            default:
                throw new RuntimeException();
        }
    }

    public final String getText() {
        return this.A00.A02;
    }

    public WZC(ProductCollectionLink productCollectionLink) {
        this.A00 = productCollectionLink;
    }
}
