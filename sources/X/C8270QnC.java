package X;

import android.os.Bundle;
import com.facebookpay.logging.FBPayLoggerData;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.LinkedHashMap;

/* renamed from: X.QnC  reason: case insensitive filesystem */
public final class C8270QnC extends QD7 {
    public FBPayLoggerData A00;
    public C13739TgB A01;
    public String A02;
    public boolean A03 = false;
    public final AnonymousClass2gB A04 = Pxh.A0M();
    public final AnonymousClass2gB A05 = Pxh.A0M();
    public final 2FO A06;
    public final S2S A07;

    public static void A00(C8270QnC qnC) {
        qnC.A03 = true;
        LinkedHashMap A062 = C2818159r.A06(qnC.A00);
        Pxh.A1R(A062);
        A062.put("target_name", "add_shoppay_cancel");
        A062.put("product", qnC.A02);
        qnC.A06.Cgl("user_add_credential_exit", A062);
        C13739TgB tgB = qnC.A01;
        if (tgB != null) {
            tgB.D0U();
        }
    }

    public C8270QnC(2FO r2, S2S s2s) {
        this.A07 = s2s;
        this.A06 = r2;
    }

    public final void A04(Bundle bundle) {
        super.A04(bundle);
        this.A00 = Pxj.A0Y(bundle);
        this.A02 = DbU.A0l(bundle, IgReactPurchaseExperienceBridgeModule.RN_PAYMENT_TYPE_KEY);
        S2S s2s = this.A07;
        String A002 = this.A00.A00();
        A002.getClass();
        String str = this.A02;
        C7422QCn A012 = C8282QnO.A01(new C11547Sc8(s2s, str, A002, 4), s2s.A02);
        C11651Sdt.A02(A012, this.A05, this, 17);
        C11651Sdt.A02(A012, this.A04, this, 18);
        C11651Sdt.A02(A012, this.A03, this, 19);
    }
}
