package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.APMConfiguration;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentConfiguration;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;
import com.facebookpay.expresscheckout.models.FulfillmentOption;
import com.facebookpay.expresscheckout.models.FulfillmentOptions;
import com.facebookpay.expresscheckout.models.KnownData;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.models.PickupInfo;
import com.facebookpay.expresscheckout.models.PriceInfo;
import com.facebookpay.expresscheckout.models.PromoCodeList;
import com.facebookpay.expresscheckout.models.ShippingOptions;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.expresscheckout.sample.SampleECPLaunch$launchECP$1;
import com.facebookpay.logging.LoggingPolicy;
import com.facebookpay.offsite.models.message.AvailabilityInitiator$Companion;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class S3G {
    public final S3F A00;
    public final String A01 = C51972G9s.A0n();
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A00(0eO.A02, C13302TUb.A00);
    public final FragmentActivity A03;
    public final FulfillmentOptions A04;
    public final ArrayList A05;
    public final ArrayList A06;
    public final List A07;

    public final void A00(EcpUIConfiguration ecpUIConfiguration, String str) {
        PaymentReceiverInfo paymentReceiverInfo = new PaymentReceiverInfo("3945555168888728", (String) null, (String) null, (String) null);
        CurrencyAmount currencyAmount = new CurrencyAmount("USD", "0.70");
        RFW rfw = RFW.TAX;
        RFB rfb = RFB.FINAL;
        RFB rfb2 = rfb;
        ArrayList A1L = 0sr.A1L(new PriceInfo[]{new PriceInfo(currencyAmount, rfb, rfw, (Integer) null, "Tax", (String) null, (String) null, (String) null), new PriceInfo(new CurrencyAmount("USD", "10.00"), rfb2, RFW.SUBTOTAL, (Integer) null, "Subtotal", (String) null, (String) null, (String) null), new PriceInfo(new CurrencyAmount("USD", "10.70"), rfb2, RFW.TOTAL, (Integer) null, "Total", (String) null, (String) null, (String) null)});
        ArrayList A1L2 = 0sr.A1L(new PriceInfo[]{new PriceInfo(new CurrencyAmount("USD", "7.77"), rfb, rfw, 1, "Item Name", (String) null, "Size: L", "https://cdn.shopify.com/s/files/1/0059/8835/2052/products/Kieffer-Pear-Tree-450w_901dda52-964c-41f7-a282-44e3a667ac6e_1024x1024.jpg?v=1603108180")});
        TransactionInfo transactionInfo = new TransactionInfo(this.A04, (PickupInfo) null, new PromoCodeList(this.A05), (ShippingOptions) null, (Integer) null, "USD", "US", (String) null, A1L, A1L2, this.A07);
        CheckoutConfiguration checkoutConfiguration = new CheckoutConfiguration((APMConfiguration) null, C8942RGk.META_PAY_BANNER, (C8942RGk) null, true, 1, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, false, (Integer) null, (String) null, (String) null, (String) null, C51967G9n.A0t(new REn[]{REn.UX_FULFILLMENT_OPTIONS, REn.UX_SHIPPING_ADDRESS, REn.UX_PROMO_CODE}, 0), C51967G9n.A0t(new C8891REi[]{C8891REi.REQUEST_PAYER_EMAIL, C8891REi.REQUEST_PAYER_PHONE, C8891REi.REQUEST_PAYER_NAME, C8891REi.REQUEST_BILLING_ADDRESS}, 0), 1, false, false, false);
        RFA rfa = RFA.LIVE;
        ArrayList A1L3 = 0sr.A1L(new REB[]{REB.CHARGE});
        CurrencyAmount currencyAmount2 = new CurrencyAmount("USD", "100");
        CurrencyAmount currencyAmount3 = currencyAmount2;
        ECPPaymentConfiguration eCPPaymentConfiguration = new ECPPaymentConfiguration(currencyAmount3, new KnownData(new ShippingAddress((String) null, (String) null, "Jamie Wilson", "1 Hacker Way", (String) null, "Menlo Park", "CA", "US", "94025", (String) null, false, false, false, false, true), "Jamie Wilson", "jamie@email.com", "6505051234", AvailabilityInitiator$Companion.INITIATOR_IAW), rfa, "1234", "https://www.fbpaytesting.com", A1L3, 0sr.A1L(new C8914RFh[]{C8914RFh.BASIC_CARD_V1}), (ArrayList) null, (Map) null, (Set) null);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Pxi.A1L("CLIENT_RECEIVER_ID", "PSP_LIVE_TEST_1::LIVE_TEST_MERCHANT_1", A1C);
        Pxi.A1L("SECURITY_ORIGIN", "https://www.fbpaytesting.com", A1C);
        Pxi.A1L("PROCESSING_MODE", "LIVE", A1C);
        String A012 = C2818159r.A01();
        AnonymousClass7TE.A1Z(new SampleECPLaunch$launchECP$1(checkoutConfiguration, eCPPaymentConfiguration, ecpUIConfiguration, paymentReceiverInfo, transactionInfo, this, new LoggingPolicy("payments_offsite_partners", AnonymousClass7TE.A1C()), A012, "742725890006429", str, A1C, (AnonymousClass4D7) null), (C262224Cq) this.A02.getValue());
    }

    public S3G(FragmentActivity fragmentActivity) {
        this.A03 = fragmentActivity;
        this.A00 = new S3F((Fragment) null, fragmentActivity, (ECPHandler) null);
        ArrayList A1L = 0sr.A1L(new FulfillmentOption[]{new FulfillmentOption(new CurrencyAmount("USD", "19.99"), "prty-usps", "Priority USPS", new Date(2023, 12, 30), new Date(2023, 12, 31)), new FulfillmentOption(new CurrencyAmount("USD", "29.99"), "ovrn-fedex", "Overnight FedEx", (Date) null, (Date) null)});
        this.A06 = A1L;
        this.A04 = new FulfillmentOptions(((FulfillmentOption) A1L.get(0)).A00(), A1L);
        this.A05 = AnonymousClass7TE.A1C();
        this.A07 = AnonymousClass7TE.A1C();
    }
}
