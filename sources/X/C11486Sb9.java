package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.facebook.common.locale.Country;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebookpay.form.cell.address.AddressCellParams;
import com.facebookpay.form.cell.address.BriefAddressCellParams;
import com.facebookpay.form.cell.creditcard.CreditCardCellParams;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.logging.FBPayLoggerData;
import com.fbpay.hub.contactinfo.address.api.FBPayAddress;
import com.fbpay.hub.form.params.FormLogEvents;
import com.fbpay.hub.paymentmethods.api.FbPayBankAccount;
import com.fbpay.hub.paymentmethods.api.FbPayCreditCard;
import com.fbpay.hub.paymentmethods.api.FbPayPayPal;
import com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Sb9  reason: case insensitive filesystem */
public final class C11486Sb9 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C11486Sb9(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = str;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r12v3, types: [X.QfD, X.Ry3] */
    /* JADX WARNING: type inference failed for: r7v14, types: [X.Rwb, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v3, types: [X.QfC, X.Ry3] */
    public final void onClick(View view) {
        int i;
        int i2;
        long j;
        Object addressCellParams;
        SFA sfa;
        switch (this.A00) {
            case 0:
                i2 = AnonymousClass0fD.A05(-1076221321);
                ((X5N) this.A01).onCancel();
                C7571QKc qKc = (C7571QKc) this.A02;
                QKY qky = qKc.A01;
                Integer num = AnonymousClass05K.A0C;
                String str = qKc.A02;
                String str2 = this.A03;
                String str3 = qKc.A02.A09;
                if (str3 != null) {
                    j = Long.parseLong(str3);
                } else {
                    j = 0;
                }
                qky.A0G(num, str, str2, j);
                i = 357024130;
                break;
            case 1:
                i2 = AnonymousClass0fD.A05(-706302561);
                QDO qdo = (QDO) this.A02;
                String str4 = this.A03;
                String valueOf = String.valueOf(((QXT) this.A01).A0E());
                0qQ.A0B(str4, 0);
                QDO.A00(qdo, "user_click_payouthub_atomic", "notification_hub_dismiss_click", str4, valueOf, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null);
                AnonymousClass2gB r5 = qdo.A07;
                List list = (List) r5.A02();
                if (list != null) {
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    for (Object next : list) {
                        DbV.A1U(next, A1C, 0qQ.A0K(((C11345SOd) next).A00.A03, str4) ? 1 : 0);
                    }
                    r5.A0B(A1C);
                }
                i = -1740168759;
                break;
            case 2:
                i2 = AnonymousClass0fD.A05(990391244);
                C8269QnB qnB = (C8269QnB) this.A01;
                FbPayPaymentMethod fbPayPaymentMethod = (FbPayPaymentMethod) this.A02;
                String str5 = this.A03;
                Bundle A0a = AnonymousClass7TE.A0a();
                int i3 = fbPayPaymentMethod.A00;
                int i4 = 3;
                if (i3 != 0) {
                    if (i3 == 1) {
                        LinkedHashMap A06 = C2818159r.A06(qnB.A04);
                        FbPayPayPal fbPayPayPal = fbPayPaymentMethod.A04;
                        fbPayPayPal.getClass();
                        String str6 = fbPayPayPal.A02;
                        str6.getClass();
                        Pxj.A1N(str6, A06);
                        2FO r3 = qnB.A0E;
                        r3.Cgl("fbpay_edit_paypal_click", Pxe.A19(A06));
                        A06.put("target_name", "paypal");
                        A06.put("credential_type", "paypal_ba");
                        r3.Cgl("user_edit_credential_enter", A06);
                        A0a.putParcelable("paypal_credential", fbPayPayPal);
                        A0a.putParcelable("logger_data", qnB.A04);
                        sfa = new SFA("edit_paypal", A0a);
                        sfa.A00 = 2;
                    } else if (i3 != 2) {
                        if (i3 == 3) {
                            LinkedHashMap A062 = C2818159r.A06(qnB.A04);
                            A062.put("target_name", "edit_shoppay");
                            Pxh.A1R(A062);
                            qnB.A0E.Cgl("user_edit_credential_enter", A062);
                            A0a.putParcelable("shop_pay_credential", fbPayPaymentMethod.A05);
                            A0a.putParcelable("logger_data", qnB.A04);
                            sfa = new SFA("edit_shop_pay", A0a);
                            i4 = 6;
                        }
                        i = 575482251;
                        break;
                    } else {
                        FbPayBankAccount fbPayBankAccount = fbPayPaymentMethod.A02;
                        fbPayBankAccount.getClass();
                        A0a.putString("credentialID", fbPayBankAccount.A00);
                        A0a.putString(DialogModule.KEY_TITLE, fbPayPaymentMethod.A07);
                        sfa = new SFA("bank_account", A0a);
                    }
                    SR4.A01(qnB.A06, sfa);
                    i = 575482251;
                } else {
                    SRV.A01().markerStart(110175975);
                    LinkedHashMap A063 = C2818159r.A06(qnB.A04);
                    FbPayCreditCard fbPayCreditCard = fbPayPaymentMethod.A03;
                    fbPayCreditCard.getClass();
                    String str7 = fbPayCreditCard.A09;
                    str7.getClass();
                    Pxj.A1N(str7, A063);
                    2FO r9 = qnB.A0E;
                    r9.Cgl("fbpay_edit_card_click", Pxe.A19(A063));
                    A063.put("target_name", "edit_card");
                    A063.put("credential_type", "credit_card");
                    A063.put(Py7.A00(), qnB.A04.A00());
                    A063.put("logger_data", qnB.A04);
                    r9.Cgl("user_edit_credential_enter", A063);
                    FBPayAddress fBPayAddress = fbPayCreditCard.A00;
                    fBPayAddress.getClass();
                    FBPayLoggerData fBPayLoggerData = qnB.A04;
                    boolean z = qnB.A0H;
                    boolean z2 = qnB.A0I;
                    boolean z3 = qnB.A0J;
                    String str8 = fbPayPaymentMethod.A07;
                    str8.getClass();
                    String str9 = fbPayCreditCard.A0A;
                    String A0Z = Pxi.A0Z(2, 4, fbPayCreditCard.A08, fbPayCreditCard.A07);
                    String str10 = fbPayCreditCard.A04;
                    str10.getClass();
                    String str11 = fBPayAddress.A04;
                    str11.getClass();
                    String str12 = fBPayAddress.A05;
                    String str13 = fBPayAddress.A00;
                    str13.getClass();
                    String str14 = fBPayAddress.A03;
                    str14.getClass();
                    String str15 = fBPayAddress.A02;
                    str15.getClass();
                    String str16 = fBPayAddress.A01;
                    str16.getClass();
                    String str17 = fbPayCreditCard.A06;
                    str17.getClass();
                    String str18 = fbPayCreditCard.A05;
                    str18.getClass();
                    AddressFormFieldsConfig addressFormFieldsConfig = qnB.A03;
                    C8946RGo rGo = fbPayCreditCard.A01;
                    SOR sor = new SOR(str8, str7);
                    sor.A05 = str5;
                    sor.A04 = str17;
                    FormLogEvents formLogEvents = new FormLogEvents("fbpay_edit_card_cancel", "fbpay_remove_card_cancel", "fbpay_remove_card_save", "fbpay_edit_card_display", "fbpay_remove_card_click", "fbpay_remove_card_fail", "fbpay_remove_card_succeed", "fbpay_edit_card_save", "fbpay_edit_card_fail", "fbpay_edit_card_succeed");
                    sor.A00 = fBPayLoggerData;
                    sor.A02 = formLogEvents;
                    ? ry3 = new C10782Ry3(13);
                    ry3.A0N = true;
                    ry3.A05 = REC.NONE;
                    ry3.A0D = str17;
                    ry3.A0C = str18;
                    ry3.A0F = str9;
                    ry3.A0E = A0Z;
                    ry3.A07 = rGo;
                    ry3.A0B = str10;
                    ry3.A0N = !z;
                    CreditCardCellParams creditCardCellParams = new CreditCardCellParams((C8023QfD) ry3);
                    ImmutableList.Builder builder = sor.A09;
                    builder.add(creditCardCellParams);
                    if (!z2) {
                        builder.add(C9673Rer.A00());
                    }
                    if (z3) {
                        C8028QfI qfI = new C8028QfI(-1);
                        qfI.A03 = 2131953774;
                        qfI.A07 = true;
                        builder.add(qfI.A00());
                    }
                    if (z) {
                        addressFormFieldsConfig.getClass();
                        ? ry32 = new C10782Ry3(11);
                        ry32.A01 = addressFormFieldsConfig;
                        ry32.A02 = str15;
                        ry32.A00 = Country.A00((Country) null, str16);
                        addressCellParams = new BriefAddressCellParams((C8022QfC) ry32);
                    } else {
                        addressFormFieldsConfig.getClass();
                        C8027QfH qfH = new C8027QfH(addressFormFieldsConfig, 11);
                        qfH.A0N = str11;
                        qfH.A0I = str12;
                        qfH.A0J = str13;
                        qfH.A0M = str14;
                        qfH.A0L = str15;
                        qfH.A0B = Country.A00((Country) null, str16);
                        qfH.A0X = false;
                        qfH.A0Z = false;
                        qfH.A0U = true;
                        addressCellParams = new AddressCellParams(qfH);
                    }
                    builder.add(addressCellParams);
                    if (z2) {
                        builder.add(C9673Rer.A00());
                    }
                    ? obj = new Object();
                    obj.A03 = 2131962651;
                    int i5 = 2131962649;
                    if (C11431STx.A03()) {
                        i5 = 2131966448;
                    }
                    obj.A00 = i5;
                    A0a.putParcelable("form_params", SOR.A00(obj, sor, 2131962650));
                    sfa = new SFA("form", A0a);
                }
                sfa.A00 = i4;
                SR4.A01(qnB.A06, sfa);
                i = 575482251;
            case 3:
                i2 = AnonymousClass0fD.A05(-193287179);
                C18500Vsv vsv = (C18500Vsv) this.A02;
                String str19 = this.A03;
                JTP.A11(vsv.A01, new T7H(this.A01, vsv, str19, 1), str19);
                i = -598541730;
                break;
            case 4:
                i2 = AnonymousClass0fD.A05(-322724464);
                T7B t7b = (T7B) this.A02;
                T7B.A01(t7b, "ctc_confirmation_dialog_call");
                Activity activity = (Activity) this.A01;
                boolean A07 = 1DL.A07(activity, "android.permission.CALL_PHONE");
                String str20 = this.A03;
                if (A07) {
                    T7B.A01(t7b, "ctc_call_initiated_directly");
                    Pxj.A12(activity, "android.intent.action.CALL", str20);
                } else {
                    T7B.A01(t7b, "ctc_permission_request");
                    JTP.A11(activity, new T7H(activity, t7b, str20, 2), "android.permission.CALL_PHONE");
                }
                i = 1150752241;
                break;
            default:
                return;
        }
        AnonymousClass0fD.A0C(i, i2);
    }
}
