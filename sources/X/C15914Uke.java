package X;

import android.content.Context;
import com.facebookpay.offsite.models.message.OffsiteShippingType$Companion;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Uke  reason: case insensitive filesystem */
public final class C15914Uke extends AnonymousClass8D8 {
    public final C18603Vuw A00;
    public final C16147UpY A01;
    public final List A02;
    public final Map A03;

    public C15914Uke(Context context, AnonymousClass8BA r13, C18603Vuw vuw) {
        super(r13, (AnonymousClass8BH) null, (Integer) null, 111, false, false);
        C317876nz r0;
        String str;
        this.A00 = vuw;
        C16147UpY upY = new C16147UpY(context);
        this.A01 = upY;
        Integer A012 = vuw.A01();
        if (A012 != null) {
            int intValue = A012.intValue();
            if (intValue == 1) {
                r0 = C317876nz.A1P;
            } else if (intValue == 0) {
                r0 = C317876nz.A1R;
            } else if (intValue == 2) {
                r0 = C317876nz.A1Q;
            } else {
                Integer A013 = vuw.A01();
                if (A013 != null) {
                    switch (A013.intValue()) {
                        case 1:
                            str = OffsiteShippingType$Companion.DELIVERY;
                            break;
                        case 2:
                            str = "GET_QUOTE";
                            break;
                        default:
                            str = "GIFT_CARD";
                            break;
                    }
                } else {
                    str = "null";
                }
                throw AnonymousClass7TF.A0W("Unknown SmbSupportStickerModel type of ", str);
            }
            ArrayList A014 = r0.A01();
            this.A02 = A014;
            this.A03 = AnonymousClass7TF.A0w(upY, A014);
            upY.A0B(vuw);
            upY.setBounds(0, 0, upY.A07, upY.getIntrinsicHeight());
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final Integer A05() {
        return AnonymousClass05K.A07;
    }

    public final Map A06() {
        return this.A03;
    }
}
