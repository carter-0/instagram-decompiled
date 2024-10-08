package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.facebook.browser.lite.chrome.container.defaultchrome.DefaultBrowserLiteChrome;
import com.facebookpay.form.cell.address.AddressCellParams;
import com.facebookpay.form.cell.address.BriefAddressCellParams;
import com.facebookpay.form.cell.creditcard.CreditCardCellParams;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.logging.FBPayLoggerData;
import com.fbpay.hub.form.params.FormLogEvents;
import com.fbpay.hub.paymentmethods.api.FbPayNewCreditCardOption;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

/* renamed from: X.Sb7  reason: case insensitive filesystem */
public final class C11484Sb7 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C11484Sb7(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARNING: type inference failed for: r12v2, types: [X.QfD, X.Ry3] */
    /* JADX WARNING: type inference failed for: r3v6, types: [X.QfC, X.Ry3] */
    public final void onClick(View view) {
        int A05;
        int i;
        ImmutableList immutableList;
        Object addressCellParams;
        switch (this.A00) {
            case 0:
                A05 = AnonymousClass0fD.A05(254952334);
                DefaultBrowserLiteChrome defaultBrowserLiteChrome = (DefaultBrowserLiteChrome) this.A01;
                if (defaultBrowserLiteChrome.A0G != null) {
                    HashMap A1E = AnonymousClass7TE.A1E();
                    A1E.put("action", this.A02);
                    A1E.put("url", defaultBrowserLiteChrome.A0G.A05());
                    defaultBrowserLiteChrome.A0B.A07(defaultBrowserLiteChrome.A02, A1E);
                    i = -1395848720;
                    break;
                } else {
                    i = 1607316613;
                    break;
                }
            case 1:
                A05 = AnonymousClass0fD.A05(569073568);
                C8117Qh9 qh9 = (C8117Qh9) this.A01;
                String str = this.A02;
                C8117Qh9.A04(qh9, "payouthub_transactions_filter_choose_option_click", str);
                qh9.A04.A0B(str);
                i = 1996335237;
                break;
            case 2:
                A05 = AnonymousClass0fD.A05(-86797085);
                RRM A07 = AnonymousClass2E0.A07();
                ContextThemeWrapper contextThemeWrapper = ((QCK) this.A01).A00;
                if (contextThemeWrapper != null) {
                    A07.A01(contextThemeWrapper, this.A02);
                    i = -373021924;
                    break;
                } else {
                    0qQ.A0F("viewContext");
                    throw AnonymousClass00P.createAndThrow();
                }
            case 3:
                A05 = AnonymousClass0fD.A05(948322659);
                ((C8272QnE) this.A01).A05(this.A02);
                i = -1910413431;
                break;
            default:
                A05 = AnonymousClass0fD.A05(1740602194);
                SparseArray sparseArray = QCW.A06;
                C8269QnB qnB = ((Qn3) this.A01).A01;
                String str2 = this.A02;
                SRV.A01().markerStart(110173292);
                Bundle A0E = Pxi.A0E(qnB.A0E, "fbpay_add_card_click", C2818159r.A06(qnB.A04));
                FBPayLoggerData fBPayLoggerData = qnB.A04;
                boolean z = qnB.A0H;
                boolean z2 = qnB.A0I;
                AddressFormFieldsConfig addressFormFieldsConfig = qnB.A03;
                FbPayNewCreditCardOption fbPayNewCreditCardOption = qnB.A05;
                if (fbPayNewCreditCardOption != null) {
                    immutableList = fbPayNewCreditCardOption.A00;
                } else {
                    immutableList = null;
                }
                AnonymousClass2E0.A0E().A06();
                REC rec = REC.NONE;
                SOR sor = new SOR(3, 2131969219, (String) null, 0);
                sor.A05 = str2;
                FormLogEvents formLogEvents = new FormLogEvents("fbpay_add_card_cancel", (String) null, (String) null, "fbpay_add_card_display", (String) null, (String) null, (String) null, "fbpay_add_card_save", "fbpay_add_card_fail", "fbpay_add_card_succeed");
                sor.A00 = fBPayLoggerData;
                sor.A02 = formLogEvents;
                ? ry3 = new C10782Ry3(13);
                ry3.A0N = true;
                ry3.A05 = rec;
                ry3.A05 = rec;
                ry3.A08 = immutableList;
                ry3.A0N = !z;
                CreditCardCellParams creditCardCellParams = new CreditCardCellParams((C8023QfD) ry3);
                ImmutableList.Builder builder = sor.A09;
                builder.add(creditCardCellParams);
                if (!z2) {
                    builder.add(C9673Rer.A00());
                }
                addressFormFieldsConfig.getClass();
                if (z) {
                    ? ry32 = new C10782Ry3(11);
                    ry32.A01 = addressFormFieldsConfig;
                    addressCellParams = new BriefAddressCellParams((C8022QfC) ry32);
                } else {
                    C8027QfH qfH = new C8027QfH(addressFormFieldsConfig, 11);
                    qfH.A0X = false;
                    qfH.A0Z = false;
                    qfH.A0U = true;
                    addressCellParams = new AddressCellParams(qfH);
                }
                builder.add(addressCellParams);
                if (z2) {
                    builder.add(C9673Rer.A00());
                }
                A0E.putParcelable("form_params", sor.A01());
                SFA sfa = new SFA("form", A0E);
                sfa.A00 = 3;
                SR4.A01(qnB.A06, sfa);
                i = -1863322946;
                break;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
