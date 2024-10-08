package X;

import com.instagram.api.schemas.ProductPivotsButton;
import com.instagram.api.schemas.ProductPivotsButtonActionType;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;

public final class WZD implements X9B {
    public final ProductPivotsButton A00;

    public final String Awd() {
        return this.A00.Awd();
    }

    public final String Awf() {
        return this.A00.Awf();
    }

    public final String Awg() {
        return this.A00.Awg();
    }

    public final Integer Awk() {
        ProductPivotsButton productPivotsButton = this.A00;
        ProductPivotsButtonActionType Awi = productPivotsButton.Awi();
        if (Awi == null) {
            Awi = productPivotsButton.AYE();
        }
        switch (Awi.ordinal()) {
            case 0:
                return AnonymousClass05K.A0B;
            case 1:
                return AnonymousClass05K.A0Y;
            case 2:
                return AnonymousClass05K.A06;
            case 3:
                return AnonymousClass05K.A0N;
            case 4:
                return AnonymousClass05K.A0C;
            case 5:
                return AnonymousClass05K.A01;
            case 6:
                return AnonymousClass05K.A09;
            case 7:
                return AnonymousClass05K.A0A;
            case 8:
                return AnonymousClass05K.A04;
            case 9:
                return AnonymousClass05K.A02;
            case 10:
                return AnonymousClass05K.A03;
            case 11:
                return AnonymousClass05K.A0j;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return AnonymousClass05K.A0u;
            case 13:
                return AnonymousClass05K.A15;
            case 14:
                return AnonymousClass05K.A1F;
            case 15:
                return AnonymousClass05K.A1I;
            case 16:
                return AnonymousClass05K.A08;
            case 17:
                return AnonymousClass05K.A00;
            default:
                throw new RuntimeException();
        }
    }

    public final User BRo() {
        return this.A00.BRo();
    }

    public final String getText() {
        ProductPivotsButton productPivotsButton = this.A00;
        String text = productPivotsButton.getText();
        if (text == null) {
            return productPivotsButton.Air();
        }
        return text;
    }

    public WZD(ProductPivotsButton productPivotsButton) {
        this.A00 = productPivotsButton;
    }
}
