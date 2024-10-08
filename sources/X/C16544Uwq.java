package X;

import com.shopify.checkout.models.errors.VaultedPaymentErrorCode$Companion;
import kotlinx.serialization.Serializable;

@Serializable(with = C20436WrU.class)
/* renamed from: X.Uwq  reason: case insensitive filesystem */
public enum C16544Uwq {
    InvalidSession("invalid_session");
    
    public static final AnonymousClass0eM A01 = null;
    public static final VaultedPaymentErrorCode$Companion Companion = null;
    public final String A00;

    /* JADX WARNING: type inference failed for: r0v4, types: [com.shopify.checkout.models.errors.VaultedPaymentErrorCode$Companion, java.lang.Object] */
    /* access modifiers changed from: public */
    static {
        C16544Uwq[] uwqArr;
        A02 = 0oU.A00(uwqArr);
        Companion = new Object();
        A01 = AnonymousClass0eN.A00(0eO.A03, C20685WxH.A00);
    }

    /* access modifiers changed from: public */
    C16544Uwq(String str) {
        this.A00 = str;
    }
}
