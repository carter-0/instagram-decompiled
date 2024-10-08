package X;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebookpay.logging.FBPayLoggerData;
import com.fbpay.hub.paymentmethods.api.FbPayShopPay;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.QnF  reason: case insensitive filesystem */
public final class C8273QnF extends QD7 {
    public 2Fk A00;
    public FBPayLoggerData A01;
    public FbPayShopPay A02;
    public final AnonymousClass2gB A03 = Pxh.A0M();
    public final AnonymousClass2Fj A04 = JTO.A0K();
    public final AnonymousClass2gO A05 = C11652Sdu.A00(this, 66);
    public final 2FO A06;
    public final S2Q A07;
    public final S2S A08;

    public static void A01(C8273QnF qnF, Map map) {
        map.put("credential_type", "shop_pay");
        map.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Long.valueOf(Long.parseLong(qnF.A02.A00)));
    }

    public C8273QnF(2FO r2, S2Q s2q, S2S s2s) {
        this.A07 = s2q;
        this.A08 = s2s;
        this.A06 = r2;
    }

    public static ImmutableList A00(C8273QnF qnF) {
        String str;
        ImmutableList.Builder A0Y = Pxe.A0Y();
        int i = 0;
        Qml qml = new Qml(0);
        qml.A07 = 2131969221;
        FbPayShopPay fbPayShopPay = qnF.A02;
        boolean z = fbPayShopPay.A02;
        if (z) {
            str = null;
        } else {
            str = fbPayShopPay.A01;
        }
        qml.A0F = str;
        int i2 = 0;
        if (z) {
            i2 = 2131973744;
        }
        qml.A06 = i2;
        if (z) {
            i = R.attr.fbpay_error_text_color;
        }
        qml.A05 = i;
        qml.A00 = R.attr.fbpay_shop_pay_hub_icon;
        A0Y.add(new Qmq(qml));
        Qmg qmg = new Qmg();
        int i3 = 2131961452;
        if (qnF.A02.A02) {
            i3 = 2131965560;
        }
        qmg.A00 = i3;
        qmg.A01 = C11496SbJ.A00(qnF, 61);
        C10442RsJ rsJ = new C10442RsJ();
        Integer num = AnonymousClass05K.A01;
        rsJ.A00 = num;
        qmg.A02 = new SEE(rsJ);
        Qmr.A00(qmg, A0Y);
        Qmk qmk = new Qmk();
        qmk.A02 = 2131972015;
        qmk.A01 = R.attr.fbpay_error_text_color;
        qmk.A03 = C11496SbJ.A00(qnF, 62);
        A0Y.add(Qmt.A00(qmk, num));
        return A0Y.build();
    }

    public final void A04(Bundle bundle) {
        super.A04(bundle);
        this.A01 = Pxj.A0Y(bundle);
        Parcelable parcelable = bundle.getParcelable("shop_pay_credential");
        parcelable.getClass();
        this.A02 = (FbPayShopPay) parcelable;
        AnonymousClass2gB r2 = this.A07.A03;
        C11652Sdu.A03(r2, this.A03, this, 67);
        AnonymousClass2gB r1 = this.A03;
        C11652Sdu.A03(r2, r1, this, 68);
        r1.A0B(A00(this));
        S2S s2s = this.A08;
        String A002 = this.A01.A00();
        A002.getClass();
        s2s.A00(A002);
        LinkedHashMap A062 = C2818159r.A06(this.A01);
        A062.put("view_name", "edit_shoppay");
        Pxh.A1R(A062);
        this.A06.Cgl("client_load_credential_success", A062);
    }
}
