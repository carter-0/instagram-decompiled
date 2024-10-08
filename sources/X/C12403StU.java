package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.CheckoutResponse;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.otc.models.OtcInput;
import java.util.List;

/* renamed from: X.StU  reason: case insensitive filesystem */
public final class C12403StU implements ECPHandler {
    public AnonymousClass2Fj A00 = JTO.A0K();
    public CheckoutResponse A01;
    public ECPPaymentResponseParams A02;
    public final AnonymousClass2Fj A03 = SUj.A00((Object) null);
    public final AnonymousClass2Fj A04 = SUj.A00((Object) null);
    public final AnonymousClass2Fj A05 = JTO.A0K();
    public final AnonymousClass2Fj A06 = JTO.A0K();
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(TUS.A00);
    public final AnonymousClass0eM A08 = AnonymousClass0eN.A01(TUT.A00);
    public final AnonymousClass07Z A09;
    public final AnonymousClass2gO A0A = C11649Sdr.A00(this, 23);

    public C12403StU(AnonymousClass07Z r3) {
        0qQ.A0B(r3, 1);
        this.A09 = r3;
    }

    public final /* synthetic */ void CIH(SUj sUj) {
    }

    public final void CIS(C10749RxT rxT, LoggingContext loggingContext, Integer num) {
        2IV r1;
        Long l;
        LoggingContext loggingContext2 = loggingContext;
        if (loggingContext != null) {
            C12411Sto A0g = C51965G9l.A0g();
            String str = rxT.A01;
            SEB seb = null;
            if (str != null) {
                l = DbV.A0q(str);
            } else {
                l = null;
            }
            OtcInput otcInput = rxT.A00;
            if (otcInput != null) {
                seb = C11300SKk.A01(otcInput);
            }
            C12411Sto.A03(C51965G9l.A0U(C51969G9p.A0d(A0g.A00, "client_submit_ecpeventhandling_init"), 119), loggingContext, new C73963Pmh((Object) null, l, loggingContext2, Pxj.A0x(seb), "cancel_checkout", 5));
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 3) {
            SUj.A0K(this.A03, "CHECKOUT_CANCEL");
            this.A00.A0B(new CheckoutResponse(this.A02, (Integer) null, "CHECKOUT_CANCEL", (String) null));
        } else {
            SUj.A0K(this.A03, "CHECKOUT_FAILED");
            CheckoutResponse checkoutResponse = this.A01;
            if (checkoutResponse != null) {
                this.A00.A0B(checkoutResponse);
            } else {
                this.A00.A0B(new CheckoutResponse(this.A02, AnonymousClass05K.A04, "CHECKOUT_FAILED", "Something else went wrong"));
            }
        }
        C10883Rzj rzj = (C10883Rzj) this.A07.getValue();
        GraphQlCallInput graphQlCallInput = new GraphQlCallInput();
        graphQlCallInput.A07(rxT.A04, Py7.A00());
        graphQlCallInput.A07(rxT.A02, "product_id");
        2IV A0R = Pxe.A0R();
        A0R.A09("CANCEL_CHECKOUT", "request_type");
        A0R.A09(rxT.A01, "order_id");
        A0R.A09(rxT.A03, "receiver_id");
        graphQlCallInput.A05("handle_checkout_event_list", AnonymousClass7TE.A1I(A0R));
        graphQlCallInput.A07(Pxi.A0Y(), "client_mutation_id");
        OtcInput otcInput2 = rxT.A00;
        if (otcInput2 != null) {
            r1 = C11300SKk.A00(otcInput2);
        } else {
            r1 = null;
        }
        graphQlCallInput.A06(r1, "one_time_checkout_input");
        SQB.A01((AnonymousClass07Z) null, rzj.A00(graphQlCallInput), new C11650Sds(5, (Object) this, (Object) rxT, (Object) loggingContext));
        SUj.A0L(this.A06, (Object) null);
        SUj.A0L(this.A05, (Object) null);
        this.A00 = JTO.A0K();
        this.A01 = null;
    }

    public final void ELf(C10857RzI rzI) {
        0qQ.A0B(rzI, 0);
        if (!SUj.A0R(this.A06)) {
            SQB.A01((AnonymousClass07Z) null, ((C10883Rzj) this.A07.getValue()).A00(C11432SUd.A01(rzI)), C11649Sdr.A00(this, 22));
        }
    }

    public static final void A00(C12403StU stU, Throwable th) {
        String str;
        C10577RuX ruX;
        Integer num = AnonymousClass05K.A04;
        if (th instanceof C13222TQn) {
            0qQ.A0C(th, "null cannot be cast to non-null type com.facebookpay.expresscheckout.exceptions.EcpPaymentDetailsException");
            List list = ((C13222TQn) th).A00;
            if (!(list == null || (ruX = (C10577RuX) 00k.A0J(list)) == null)) {
                num = ruX.A00;
                str = ruX.A02;
            }
            str = "Something else went wrong";
        } else {
            if (th instanceof C8286QnS) {
                0qQ.A0C(th, "null cannot be cast to non-null type com.fbpay.util.exceptions.PaymentsUserFacingException");
                C13219TQk tQk = (C13219TQk) th;
                if (tQk.A00 == 2603076) {
                    num = AnonymousClass05K.A02;
                    str = tQk.A01;
                }
            }
            str = "Something else went wrong";
        }
        stU.A01 = new CheckoutResponse(stU.A02, num, "CHECKOUT_FAILED", str);
    }

    public final AnonymousClass2Fj AH8() {
        return this.A00;
    }

    public final void CIW() {
        SUj.A0K(this.A03, "CHECKOUT_COMPLETE");
        this.A00.A0B(new CheckoutResponse(this.A02, (Integer) null, "CHECKOUT_COMPLETE", (String) null));
    }

    public final void CIX(boolean z) {
        ECPPaymentResponseParams eCPPaymentResponseParams = this.A02;
        if (eCPPaymentResponseParams != null) {
            AnonymousClass2E0.A01().A05.A00(eCPPaymentResponseParams.A0R, "TRANSACTION_COMPLETE");
        }
        AnonymousClass2Fj r1 = this.A03;
        SUj.A0K(r1, "PAYMENT_COMPLETE");
        if (!z) {
            SUj.A0K(r1, "CHECKOUT_COMPLETE");
            this.A00.A0B(new CheckoutResponse(this.A02, (Integer) null, "CHECKOUT_COMPLETE", (String) null));
        }
        SUj.A0L(this.A06, (Object) null);
        SUj.A0L(this.A05, (Object) null);
    }

    public final AnonymousClass2Fj CJ4(ECPPaymentResponseParams eCPPaymentResponseParams) {
        this.A02 = eCPPaymentResponseParams;
        Object value = this.A08.getValue();
        QNI A002 = C11432SUd.A00(eCPPaymentResponseParams, (String) null);
        SQB.A01(this.A09, SSC.A02(AnonymousClass2E0.A06(), C11593Scs.A00, new C11542Sc3(7, A002, value)), this.A0A);
        return this.A05;
    }

    public final AnonymousClass2Fj E2B() {
        return this.A04;
    }

    public final void ERR(C13219TQk tQk) {
        SUj.A0M(this.A03, "CHECKOUT_NOT_AVAILABLE", tQk);
        this.A01 = new CheckoutResponse(this.A02, (Integer) null, "CHECKOUT_NOT_AVAILABLE", (String) null);
    }

    public final void Ep6(SUj sUj) {
        this.A06.A0B(sUj);
    }

    public final AnonymousClass2Fj FHY() {
        return this.A06;
    }
}
