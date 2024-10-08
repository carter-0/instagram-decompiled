package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.Fragment;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.models.ErrorDialogContent;
import com.facebookpay.common.recyclerview.adapteritems.AnonCheckoutPuxLink;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.EmailOptInItem;
import com.facebookpay.common.recyclerview.adapteritems.IncentiveItem;
import com.facebookpay.common.recyclerview.adapteritems.IncentiveSummaryItem;
import com.facebookpay.common.recyclerview.adapteritems.InlineBackButtonItem;
import com.facebookpay.common.recyclerview.adapteritems.InvisibleHeaderItem;
import com.facebookpay.common.recyclerview.adapteritems.PayButtonItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxAccordionItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxBannerItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxContactItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxFulfillmentOptionItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxTermsConditionItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPickupFulfillmentOptionItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionTextViewItem;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.expresscheckout.models.ItemDetails;
import com.facebookpay.expresscheckout.models.PickupInfo;
import com.facebookpay.expresscheckout.models.PriceInfo;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent;
import com.facebookpay.incentives.model.ECPIncentive;
import com.facebookpay.incentives.model.IncentiveCredentialList;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.otc.models.OtcInput;
import com.facebookpay.otc.models.OtcOptionState;
import com.facebookpay.paymentmethod.model.CreditCard;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import com.facebookpay.paymentmethod.model.TokenizedCard;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class QDN extends 2YL {
    public 2Fk A00;
    public AnonymousClass2Fj A01;
    public RH6 A02;
    public S0Y A03;
    public S2P A04;
    public ECPHandler A05;
    public C11231SGq A06;
    public SUj A07;
    public SUj A08;
    public SUj A09;
    public SUj A0A;
    public SUj A0B;
    public SUj A0C;
    public SUj A0D;
    public SUj A0E;
    public SUj A0F;
    public SUj A0G;
    public SUj A0H;
    public SUj A0I;
    public SUj A0J;
    public SUj A0K;
    public SUj A0L;
    public SUj A0M;
    public SUj A0N;
    public SUj A0O;
    public SUj A0P;
    public SUj A0Q;
    public SUj A0R;
    public SUj A0S;
    public Boolean A0T;
    public Boolean A0U;
    public String A0V;
    public String A0W;
    public List A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public SUj A0f;
    public SUj A0g;
    public SUj A0h;
    public SUj A0i;
    public Boolean A0j;
    public String A0k;
    public Map A0l;
    public boolean A0m;
    public final 2Fk A0n;
    public final 2Fk A0o;
    public final 2Fk A0p;
    public final AnonymousClass2gB A0q;
    public final AnonymousClass2gB A0r;
    public final AnonymousClass2Fj A0s;
    public final AnonymousClass2Fj A0t;
    public final AnonymousClass2Fj A0u;
    public final AnonymousClass2Fj A0v;
    public final AnonymousClass2Fj A0w;
    public final AnonymousClass2Fj A0x;
    public final AnonymousClass2Fj A0y;
    public final AnonymousClass2Fj A0z;
    public final AnonymousClass2Fj A10;
    public final AnonymousClass2Fj A11 = JTO.A0K();
    public final AnonymousClass2gO A12;
    public final AnonymousClass2gO A13;
    public final AnonymousClass2gO A14;
    public final AnonymousClass2gO A15;
    public final AnonymousClass2gO A16;
    public final AnonymousClass2gO A17;
    public final AnonymousClass2gO A18;
    public final AnonymousClass2gO A19;
    public final AnonymousClass2gO A1A;
    public final AnonymousClass2gO A1B;
    public final AnonymousClass2gO A1C;
    public final AnonymousClass2gO A1D;
    public final AnonymousClass2gO A1E;
    public final AnonymousClass2gO A1F;
    public final AnonymousClass2gO A1G;
    public final AnonymousClass2gO A1H;
    public final AnonymousClass2gO A1I;
    public final AnonymousClass2gO A1J;
    public final QDU A1K;
    public final C7434QCz A1L;
    public final SP9 A1M;
    public final QDR A1N;
    public final QDL A1O;
    public final LoggingContext A1P;
    public final QDH A1Q;
    public final QDT A1R;
    public final QDJ A1S;
    public final QDQ A1T;
    public final QDS A1U;
    public final QD3 A1V;
    public final SUj A1W;
    public final LinkedHashMap A1X;
    public final Map A1Y;
    public final AnonymousClass2gO A1Z;
    public final AnonymousClass2gO A1a;
    public final AnonymousClass2gO A1b;
    public final List A1c;

    public static final SUj A06(C10781Ry2 ry2, QDN qdn, List list, boolean z) {
        Integer num;
        ArrayList arrayList;
        RH6 rh6;
        Object selectionActionViewItem;
        List list2;
        String str;
        SUj A0W2;
        C10575RuU ruU;
        PickupInfo pickupInfo;
        QDN qdn2 = qdn;
        SUj sUj = qdn.A0J;
        PuxFulfillmentOptionItem puxFulfillmentOptionItem = (PuxFulfillmentOptionItem) sUj.A01;
        String str2 = null;
        if (puxFulfillmentOptionItem != null) {
            num = puxFulfillmentOptionItem.A02;
        } else {
            num = null;
        }
        if (num == AnonymousClass05K.A01) {
            if (!A0g(qdn2) && !A0f(qdn2) && !A0h(qdn2) && (A0W2 = Pxe.A0W(qdn2.A1T.A06)) != null && (ruU = (C10575RuU) A0W2.A01) != null && (pickupInfo = (PickupInfo) ruU.A01) != null) {
                str2 = pickupInfo.A02;
            }
            QDR qdr = qdn2.A1N;
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            AnonymousClass2Fj r3 = qdr.A05;
            0qQ.A0C(r3, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<kotlin.collections.List<com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>>>>");
            SUj A0W3 = Pxe.A0W(r3);
            if (!(A0W3 == null || (list2 = (List) A0W3.A01) == null)) {
                ArrayList A1C3 = AnonymousClass7TE.A1C();
                for (Object next : list2) {
                    Object obj = ((SUj) next).A01;
                    if (obj instanceof SelectionPickupFulfillmentOptionItem) {
                        SelectionPickupFulfillmentOptionItem selectionPickupFulfillmentOptionItem = (SelectionPickupFulfillmentOptionItem) obj;
                        if (selectionPickupFulfillmentOptionItem != null) {
                            str = selectionPickupFulfillmentOptionItem.A07;
                        } else {
                            str = null;
                        }
                        JTR.A1P(str, QDR.A00(qdr), next, A1C3);
                    }
                }
                if (!A1C3.isEmpty()) {
                    SUj.A0O(Pxj.A0X(2131961252), A1C2);
                    A1C2.addAll(A1C3);
                    SUj.A0O(new SelectionActionViewItem(RH6.A0n, (Integer) null, 2131961205, (String) null, (String) null), A1C2);
                    if (str2 != null) {
                        selectionActionViewItem = new SelectionTextViewItem(RH6.A0u, (Integer) null, str2, true);
                        SUj.A0O(selectionActionViewItem, A1C2);
                    }
                    rh6 = RH6.A0W;
                    sUj = qdn2.A0J;
                    arrayList = A1C2;
                }
            }
            if (C11431STx.A02()) {
                SUj.A0O(new SelectionHeaderItem(RH6.A0p, 2131961252, AnonymousClass05K.A0N, (String) null, (String) null), A1C2);
                selectionActionViewItem = new SelectionActionViewItem(RH6.A0n, (Integer) null, 2131961264, (String) null, (String) null);
                SUj.A0O(selectionActionViewItem, A1C2);
            }
            rh6 = RH6.A0W;
            sUj = qdn2.A0J;
            arrayList = A1C2;
        } else {
            rh6 = RH6.A0W;
            arrayList = list;
        }
        0qQ.A0C(sUj, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        return SUj.A09(new PuxAccordionItem(rh6, ry2, sUj, arrayList, z));
    }

    public static final void A0U(QDN qdn, boolean z) {
        PuxShippingAddressItem puxShippingAddressItem;
        PuxPaymentMethodItem puxPaymentMethodItem;
        PuxContactItem puxContactItem;
        PuxFulfillmentOptionItem puxFulfillmentOptionItem;
        PuxContactItem puxContactItem2;
        AnonCheckoutPuxLink anonCheckoutPuxLink;
        EmailOptInItem emailOptInItem;
        PuxTermsConditionItem puxTermsConditionItem;
        PuxBannerItem puxBannerItem;
        PuxOrderSummaryItem puxOrderSummaryItem;
        SUj sUj;
        QDN qdn2 = qdn;
        AnonymousClass2Fj r1 = qdn.A0v;
        boolean z2 = z;
        JTP.A1B(r1, z2);
        SUj sUj2 = qdn2.A0Q;
        PuxShippingAddressItem puxShippingAddressItem2 = (PuxShippingAddressItem) sUj2.A01;
        SUj sUj3 = null;
        if (puxShippingAddressItem2 != null) {
            puxShippingAddressItem = new PuxShippingAddressItem(puxShippingAddressItem2.A00, puxShippingAddressItem2.A01, puxShippingAddressItem2.A03, puxShippingAddressItem2.A02, puxShippingAddressItem2.A04, z2);
        } else {
            puxShippingAddressItem = null;
        }
        qdn2.A0Q = SUj.A06(sUj2, puxShippingAddressItem);
        SUj sUj4 = qdn2.A0N;
        PuxPaymentMethodItem puxPaymentMethodItem2 = (PuxPaymentMethodItem) sUj4.A01;
        if (puxPaymentMethodItem2 != null) {
            puxPaymentMethodItem = new PuxPaymentMethodItem(puxPaymentMethodItem2.A00, puxPaymentMethodItem2.A01, puxPaymentMethodItem2.A02, z2, puxPaymentMethodItem2.A04);
        } else {
            puxPaymentMethodItem = null;
        }
        qdn2.A0N = SUj.A06(sUj4, puxPaymentMethodItem);
        SUj sUj5 = qdn2.A0I;
        PuxContactItem puxContactItem3 = (PuxContactItem) sUj5.A01;
        if (puxContactItem3 != null) {
            puxContactItem = new PuxContactItem(puxContactItem3.A00, puxContactItem3.A01, puxContactItem3.A03, puxContactItem3.A04, puxContactItem3.A05, puxContactItem3.A06, puxContactItem3.A02, z2);
        } else {
            puxContactItem = null;
        }
        qdn2.A0I = SUj.A06(sUj5, puxContactItem);
        SUj sUj6 = qdn2.A0J;
        PuxFulfillmentOptionItem puxFulfillmentOptionItem2 = (PuxFulfillmentOptionItem) sUj6.A01;
        if (puxFulfillmentOptionItem2 != null) {
            puxFulfillmentOptionItem = new PuxFulfillmentOptionItem(puxFulfillmentOptionItem2.A00, puxFulfillmentOptionItem2.A01, puxFulfillmentOptionItem2.A03, puxFulfillmentOptionItem2.A02, z2, puxFulfillmentOptionItem2.A04);
        } else {
            puxFulfillmentOptionItem = null;
        }
        qdn2.A0J = SUj.A06(sUj6, puxFulfillmentOptionItem);
        SUj sUj7 = qdn2.A0O;
        PuxContactItem puxContactItem4 = (PuxContactItem) sUj7.A01;
        if (puxContactItem4 != null) {
            puxContactItem2 = new PuxContactItem(puxContactItem4.A00, puxContactItem4.A01, puxContactItem4.A03, puxContactItem4.A04, puxContactItem4.A05, puxContactItem4.A06, puxContactItem4.A02, z2);
        } else {
            puxContactItem2 = null;
        }
        qdn2.A0O = SUj.A06(sUj7, puxContactItem2);
        SUj sUj8 = qdn2.A0G;
        AnonCheckoutPuxLink anonCheckoutPuxLink2 = (AnonCheckoutPuxLink) sUj8.A01;
        if (anonCheckoutPuxLink2 != null) {
            anonCheckoutPuxLink = new AnonCheckoutPuxLink(anonCheckoutPuxLink2.A00, anonCheckoutPuxLink2.A01, z2);
        } else {
            anonCheckoutPuxLink = null;
        }
        qdn2.A0G = SUj.A06(sUj8, anonCheckoutPuxLink);
        SUj sUj9 = qdn2.A09;
        EmailOptInItem emailOptInItem2 = (EmailOptInItem) sUj9.A01;
        if (emailOptInItem2 != null) {
            emailOptInItem = new EmailOptInItem(emailOptInItem2.A01, emailOptInItem2.A02, emailOptInItem2.A03, emailOptInItem2.A00, z2);
        } else {
            emailOptInItem = null;
        }
        qdn2.A09 = SUj.A06(sUj9, emailOptInItem);
        SUj sUj10 = qdn2.A0R;
        PuxTermsConditionItem puxTermsConditionItem2 = (PuxTermsConditionItem) sUj10.A01;
        if (puxTermsConditionItem2 != null) {
            RH6 rh6 = puxTermsConditionItem2.A04;
            String str = puxTermsConditionItem2.A05;
            puxTermsConditionItem = new PuxTermsConditionItem(puxTermsConditionItem2.A01, puxTermsConditionItem2.A02, puxTermsConditionItem2.A03, puxTermsConditionItem2.A00, rh6, str, puxTermsConditionItem2.A06, puxTermsConditionItem2.A07, puxTermsConditionItem2.A08, z2);
        } else {
            puxTermsConditionItem = null;
        }
        qdn2.A0R = SUj.A06(sUj10, puxTermsConditionItem);
        SUj sUj11 = qdn2.A0H;
        PuxBannerItem puxBannerItem2 = (PuxBannerItem) sUj11.A01;
        if (puxBannerItem2 != null) {
            puxBannerItem = new PuxBannerItem(puxBannerItem2.A00, puxBannerItem2.A01, puxBannerItem2.A02, puxBannerItem2.A03, puxBannerItem2.A04, z2);
        } else {
            puxBannerItem = null;
        }
        qdn2.A0H = SUj.A06(sUj11, puxBannerItem);
        A0N(qdn2, C298525tb.TERMS, qdn2.A0R);
        qdn2.A02 = null;
        SUj sUj12 = qdn2.A0g;
        PuxOrderSummaryItem puxOrderSummaryItem2 = (PuxOrderSummaryItem) sUj12.A01;
        if (puxOrderSummaryItem2 != null) {
            puxOrderSummaryItem = new PuxOrderSummaryItem(puxOrderSummaryItem2.A02, puxOrderSummaryItem2.A01, puxOrderSummaryItem2.A03, puxOrderSummaryItem2.A04, puxOrderSummaryItem2.A05, puxOrderSummaryItem2.A06, puxOrderSummaryItem2.A07, puxOrderSummaryItem2.A00, puxOrderSummaryItem2.A0A, puxOrderSummaryItem2.A09, z2);
        } else {
            puxOrderSummaryItem = null;
        }
        qdn2.A0g = SUj.A06(sUj12, puxOrderSummaryItem);
        RH6 rh62 = RH6.A0X;
        A0D(rh62, qdn2);
        A0E(rh62, qdn2);
        if (qdn2.A0l().contains(C298525tb.SHIPPING_ADDRESS)) {
            RH6 rh63 = RH6.A0a;
            A0D(rh63, qdn2);
            A0E(rh63, qdn2);
        }
        if (qdn2.A0l().contains(C298525tb.PAYMENT_METHOD)) {
            RH6 rh64 = RH6.A0Y;
            A0D(rh64, qdn2);
            A0E(rh64, qdn2);
        }
        if (qdn2.A0l().contains(C298525tb.CONTACT_INFORMATION)) {
            RH6 rh65 = RH6.A0V;
            A0D(rh65, qdn2);
            A0E(rh65, qdn2);
        }
        if (qdn2.A0l().contains(C298525tb.SHIPPING_OPTIONS) || qdn2.A0l().contains(C298525tb.FULFILLMENT_OPTIONS)) {
            RH6 rh66 = RH6.A0W;
            A0D(rh66, qdn2);
            A0E(rh66, qdn2);
        }
        if (qdn2.A0l().contains(C298525tb.PICKUP_CONTACT_INFO)) {
            RH6 rh67 = RH6.A0Z;
            A0D(rh67, qdn2);
            A0E(rh67, qdn2);
        }
        List A0l2 = qdn2.A0l();
        C298525tb r4 = C298525tb.ONE_TIME_CHECKOUT_OPTION;
        if (A0l2.contains(r4)) {
            if (!AnonymousClass7TF.A1Y(A07(qdn2).A01, false)) {
                sUj = qdn2.A0G;
            } else {
                sUj = null;
            }
            A0N(qdn2, r4, sUj);
        }
        List A0l3 = qdn2.A0l();
        C298525tb r3 = C298525tb.EMAIL_OPTIN;
        if (A0l3.contains(r3)) {
            if (A0Z(qdn2)) {
                sUj3 = qdn2.A09;
            }
            A0N(qdn2, r3, sUj3);
        }
        List A0l4 = qdn2.A0l();
        C298525tb r2 = C298525tb.BANNER;
        if (A0l4.contains(r2)) {
            A0N(qdn2, r2, qdn2.A0H);
        }
        List A0l5 = qdn2.A0l();
        C298525tb r22 = C298525tb.INCENTIVES;
        if (A0l5.contains(r22)) {
            A0N(qdn2, r22, qdn2.A0C);
        }
    }

    /* JADX WARNING: type inference failed for: r2v27, types: [X.QnQ, X.TQk] */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01ba, code lost:
        if (r18 != false) goto L_0x01bc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass2gB A0k(androidx.fragment.app.Fragment r26, X.SSY r27, java.lang.String r28) {
        /*
            r25 = this;
            r10 = 0
            r9 = 1
            r4 = r25
            X.2gB r1 = r4.A0r
            X.SUj r0 = X.Pxe.A0W(r1)
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r0.A01
            X.Rs9 r0 = (X.C10432Rs9) r0
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.A01
            if (r0 != r9) goto L_0x0017
            return r1
        L_0x0017:
            X.2Fj r0 = r4.A01
            X.SUj r2 = X.Pxe.A0W(r0)
            r0 = 0
            if (r2 == 0) goto L_0x0272
            java.lang.Object r2 = r2.A01
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0272
            boolean r2 = X.00l.A0W(r2)
            if (r2 != 0) goto L_0x0272
            java.lang.String r2 = r4.A0V
            if (r2 == 0) goto L_0x0272
            boolean r2 = X.00l.A0W(r2)
            if (r2 != 0) goto L_0x0272
            X.SUj r2 = r4.A0N
            boolean r2 = X.SUj.A0V(r2)
            if (r2 == 0) goto L_0x0272
            java.lang.String r2 = r4.A0k
            if (r2 != 0) goto L_0x0048
            java.lang.String r2 = X.Pxi.A0Y()
            r4.A0k = r2
        L_0x0048:
            X.2Fj r2 = r4.A11
            r24 = r2
            java.lang.Object r8 = r24.A02()
            java.lang.String r14 = "Required value was null."
            if (r8 == 0) goto L_0x026d
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r8 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r8
            java.lang.String r13 = r4.A0V
            if (r13 == 0) goto L_0x0268
            r5 = 4
            X.Sc3 r7 = new X.Sc3
            r2 = r26
            r7.<init>(r5, r2, r4)
            boolean r2 = A0Z(r4)
            if (r2 == 0) goto L_0x0099
            X.Sto r3 = X.C51965G9l.A0g()
            com.facebookpay.logging.LoggingContext r11 = r4.A1P
            X.SUj r2 = r4.A09
            java.lang.Object r2 = r2.A01
            com.facebookpay.common.recyclerview.adapteritems.EmailOptInItem r2 = (com.facebookpay.common.recyclerview.adapteritems.EmailOptInItem) r2
            if (r2 == 0) goto L_0x0249
            boolean r6 = r2.A00
        L_0x0078:
            java.lang.String r18 = "email_optin"
            X.0Ae r3 = r3.A00
            java.lang.String r2 = "client_submit_ecpemailoptin_atomic"
            X.0Aj r3 = X.C51969G9p.A0d(r3, r2)
            r2 = 117(0x75, float:1.64E-43)
            X.1Ln r3 = X.C51965G9l.A0U(r3, r2)
            X.IxI r2 = new X.IxI
            r15 = r2
            r16 = r11
            r17 = r0
            r19 = r5
            r20 = r6
            r15.<init>(r16, r17, r18, r19, r20)
            X.C12411Sto.A03(r3, r11, r2)
        L_0x0099:
            X.Rs9 r2 = new X.Rs9
            r2.<init>(r9, r10)
            X.SUj.A0L(r1, r2)
            X.QDJ r6 = r4.A1S
            com.facebookpay.logging.LoggingContext r2 = r4.A1P
            r23 = r2
            X.2Fj r2 = r4.A01
            X.SUj r2 = X.Pxe.A0W(r2)
            if (r2 == 0) goto L_0x0263
            java.lang.Object r12 = r2.A01
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x0263
            X.SUj r2 = r4.A0N
            java.lang.Object r2 = r2.A01
            com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem r2 = (com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem) r2
            if (r2 == 0) goto L_0x025e
            com.facebookpay.paymentmethod.model.PaymentMethod r11 = r2.A01
            if (r11 == 0) goto L_0x025e
            X.SUj r2 = r4.A0S
            java.lang.Object r3 = r2.A01
            if (r3 == 0) goto L_0x0259
            com.facebookpay.expresscheckout.models.TransactionInfo r3 = (com.facebookpay.expresscheckout.models.TransactionInfo) r3
            java.lang.String r2 = r4.A0k
            if (r2 == 0) goto L_0x0254
            X.QDT r14 = r4.A1R
            boolean r22 = r14.A0N()
            boolean r14 = A0i(r4)
            if (r14 == 0) goto L_0x0246
            X.QDS r14 = r4.A1U
            X.2gB r14 = r14.A06
            X.SUj r14 = X.Pxe.A0W(r14)
            if (r14 == 0) goto L_0x0246
            java.lang.Object r14 = r14.A01
            X.RuU r14 = (X.C10575RuU) r14
            if (r14 == 0) goto L_0x0246
            java.lang.Object r14 = r14.A01
            com.facebookpay.shippingaddress.model.ShippingAddress r14 = (com.facebookpay.shippingaddress.model.ShippingAddress) r14
            if (r14 == 0) goto L_0x0246
            java.lang.String r15 = r14.A04
        L_0x00f1:
            X.QDL r14 = r4.A1O
            X.2Fj r14 = r14.A0A
            X.SUj r14 = X.Pxe.A0W(r14)
            if (r14 == 0) goto L_0x0243
            java.lang.Object r14 = r14.A01
            com.facebookpay.incentives.model.IncentiveList r14 = (com.facebookpay.incentives.model.IncentiveList) r14
            if (r14 == 0) goto L_0x0243
            java.util.List r14 = r14.A00
        L_0x0103:
            X.AnonymousClass7TF.A1B(r8, r10, r12)
            X.DbW.A1N(r11, r5, r3)
            X.Ryk r5 = new X.Ryk
            r16 = r11
            r17 = r2
            r18 = r12
            r19 = r13
            r20 = r15
            r21 = r14
            r12 = r5
            r13 = r8
            r14 = r3
            r15 = r23
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r2 = X.Pxh.A0U(r24)
            if (r2 == 0) goto L_0x0129
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r0 = r2.A04
            com.facebookpay.expresscheckout.models.AuthScreenStyle r0 = r0.A00
        L_0x0129:
            r6.A00 = r0
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r3 = r5.A00
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r11 = r3.A03
            if (r11 == 0) goto L_0x023f
            java.util.Map<X.RFh, android.os.Bundle> r2 = r11.A08
            if (r2 == 0) goto L_0x0148
            X.RFh r0 = X.C8914RFh.BASIC_CARD_V1
            java.lang.Object r2 = r2.get(r0)
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            if (r2 == 0) goto L_0x0148
            java.lang.String r0 = "requireCVV"
            boolean r0 = r2.getBoolean(r0, r10)
            if (r0 != 0) goto L_0x0154
        L_0x0148:
            java.util.ArrayList<X.RFh> r2 = r11.A07
            if (r2 == 0) goto L_0x023f
            X.RFh r0 = X.C8914RFh.FIRMLY_TOKEN_V1
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x023f
        L_0x0154:
            r18 = 1
        L_0x0156:
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r3.A05
            r11 = 0
            if (r0 == 0) goto L_0x023c
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x023c
            java.lang.String r12 = X.DbV.A12(r0)
        L_0x0163:
            if (r18 == 0) goto L_0x0183
            if (r12 == 0) goto L_0x0183
            com.instagram.common.session.UserSession r13 = X.C11431STx.A00()
            X.0Tu r0 = X.0Tu.A05
            r2 = 36877448200388744(0x8303d800350088, double:3.384784963266266E-306)
            java.lang.String r0 = X.182.A04(r0, r13, r2)
            java.util.List r0 = X.DbX.A0x(r0)
            boolean r0 = r0.contains(r12)
            if (r0 == 0) goto L_0x0183
            X.QDJ.A00(r5, r6)
        L_0x0183:
            com.facebookpay.logging.LoggingContext r13 = r5.A02
            java.lang.String r14 = r13.A02
            java.lang.String r19 = "CREATE_CONTAINER"
            java.util.List r12 = java.util.Collections.singletonList(r19)
            long r2 = r13.A00
            java.lang.String r3 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r5.A06
            java.lang.String r0 = "ECP"
            X.RsH r0 = X.C11301SKl.A02(r0, r14, r3, r2, r12)
            X.QDJ.A02(r5, r6)
            X.S5g r12 = r6.A01
            java.lang.String r14 = "authFactorRequirement"
            if (r12 == 0) goto L_0x024c
            java.lang.String r3 = ""
            X.QnQ r2 = new X.QnQ
            r2.<init>(r10, r3, r3)
            r2.A00 = r12
            r0.A00 = r2
            com.facebookpay.paymentmethod.model.PaymentMethod r2 = r5.A03
            X.XRm r3 = r2.Asn()
            X.XRm r2 = X.C21267XRm.A08
            if (r3 == r2) goto L_0x01bc
            r3 = 0
            if (r18 == 0) goto L_0x01bd
        L_0x01bc:
            r3 = 1
        L_0x01bd:
            android.os.Bundle r10 = r0.A01
            java.lang.String r2 = "REUSE_ATS_IN_AUTH_PROMPT_OBJ_SCOPED"
            r10.putBoolean(r2, r3)
            java.lang.String r2 = "logging_context"
            r10.putParcelable(r2, r13)
            X.QDH r2 = r6.A0A
            com.facebookpay.otc.models.OtcInput r2 = r2.A02(r11, r9)
            if (r2 == 0) goto L_0x01df
            java.lang.String r12 = r2.A00
            java.lang.String r3 = r2.A01
            java.lang.String r2 = "PAYMENT_OTC_SESSION_ID"
            r10.putString(r2, r12)
            java.lang.String r2 = "PAYMENT_OTC_TYPE"
            r10.putString(r2, r3)
        L_0x01df:
            com.facebookpay.expresscheckout.models.AuthScreenStyle r3 = r6.A00
            if (r3 == 0) goto L_0x01e8
            java.lang.String r2 = "AUTH_SCREEN_STYLE"
            r10.putParcelable(r2, r3)
        L_0x01e8:
            X.2gB r3 = r6.A04
            X.S5g r2 = r6.A01
            if (r2 == 0) goto L_0x024c
            java.util.List<X.S6A> r2 = r2.A01
            boolean r2 = r2.isEmpty()
            X.JTP.A1B(r3, r2)
            X.2Fj r10 = X.JTO.A0K()
            X.Sc6 r2 = new X.Sc6
            r2.<init>(r9, r7, r10, r6)
            X.ScC r12 = new X.ScC
            r16 = r27
            r17 = r28
            r13 = r5
            r14 = r6
            r15 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            com.facebookpay.payments.model.ContainerPttPayload r18 = X.C9653ReX.A00(r5, r11)
            r14 = r16
            r15 = r12
            r16 = r2
            r17 = r0
            X.2gB r9 = r14.A03(r15, r16, r17, r18, r19)
            X.2gB r7 = r6.A03
            r5 = 40
            X.Iwy r2 = new X.Iwy
            r2.<init>(r5, r0, r6, r9)
            r0 = 25
            X.Pxi.A1A(r9, r7, r2, r0)
            X.2gB r2 = r4.A0q
            X.2gO r0 = r4.A1b
            r2.A0E(r3, r0)
            X.2Fk r3 = r6.A02
            r2 = 7
            X.Sdq r0 = new X.Sdq
            r0.<init>((int) r2, (java.lang.Object) r4, (java.lang.Object) r8)
            X.SQB.A02(r3, r1, r0)
            return r1
        L_0x023c:
            r12 = r11
            goto L_0x0163
        L_0x023f:
            r18 = 0
            goto L_0x0156
        L_0x0243:
            r14 = r0
            goto L_0x0103
        L_0x0246:
            r15 = r0
            goto L_0x00f1
        L_0x0249:
            r6 = 0
            goto L_0x0078
        L_0x024c:
            X.0qQ.A0F(r14)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0254:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        L_0x0259:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        L_0x025e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        L_0x0263:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        L_0x0268:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        L_0x026d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        L_0x0272:
            X.2Fj r3 = r4.A0t
            r2 = 2131961397(0x7f132635, float:1.955949E38)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            r2 = 2131961396(0x7f132634, float:1.9559488E38)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            X.RFe r6 = X.C8911RFe.A04
            com.facebookpay.common.models.ErrorDialogContent r5 = new com.facebookpay.common.models.ErrorDialogContent
            r8 = r0
            r9 = r0
            r12 = r0
            r13 = r0
            r14 = r0
            r15 = r0
            r7 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.SR4.A01(r3, r5)
            X.Sto r3 = X.C51965G9l.A0g()
            com.facebookpay.logging.LoggingContext r2 = r4.A1P
            X.XRm r4 = X.C21267XRm.A04
            r7 = 0
            r5 = r2
            r6 = r0
            r3.A0G(r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDN.A0k(androidx.fragment.app.Fragment, X.SSY, java.lang.String):X.2gB");
    }

    public final void A0o(AnonymousClass07Z r7) {
        this.A0k = null;
        SP9 sp9 = this.A1M;
        sp9.A09.A08(this.A1J);
        if (C11431STx.A06()) {
            sp9.A0A.A08(this.A19);
            this.A0y.A08(this.A1I);
        }
        AnonymousClass2Fj r4 = this.A11;
        Object A022 = r4.A02();
        if (A022 != null) {
            SJ1 sj1 = new SJ1((OtcInput) null, ((ECPPaymentRequest) A022).A08);
            ECPRepositoryImpl A012 = C11353SOm.A01();
            A012.A00.A05(r7);
            A012.A00 = JTO.A0K();
            A0C(sj1);
            SR4.A01(this.A0x, AnonymousClass7TE.A0v());
            QDH qdh = this.A1Q;
            if (qdh.A02 || qdh.A04) {
                OtcOptionState A042 = qdh.A04();
                if (A042 != null) {
                    Object A023 = r4.A02();
                    if (A023 != null) {
                        A0C(new SJ1(new OtcInput(A042.A01, A042.A02), ((ECPPaymentRequest) A023).A08));
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            ((C12393Ssh) AnonymousClass2E0.A00()).A00.A00.clear();
            return;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void A0p(AnonymousClass07Z r10, LoggingContext loggingContext, Integer num) {
        String str;
        AnonymousClass7TF.A1B(num, 1, loggingContext);
        if (num == AnonymousClass05K.A00) {
            C51965G9l.A0g().A0U(loggingContext, "pux_checkout", C66584MXp.A0f(this));
        }
        ECPHandler eCPHandler = this.A05;
        if (eCPHandler != null) {
            AnonymousClass2Fj r1 = this.A11;
            Object A022 = r1.A02();
            if (A022 != null) {
                String str2 = ((ECPPaymentRequest) A022).A0A;
                Object A023 = r1.A02();
                if (A023 != null) {
                    String str3 = ((ECPPaymentRequest) A023).A08;
                    SUj A0W2 = Pxe.A0W(this.A01);
                    if (A0W2 != null) {
                        str = (String) A0W2.A01;
                    } else {
                        str = null;
                    }
                    eCPHandler.CIS(new C10749RxT(this.A1Q.A02((C298525tb) null, true), str2, str3, str, this.A0V), loggingContext, num);
                    A0o(r10);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public static final C11022S5z A01(QDN qdn) {
        AnonymousClass2gB r2 = qdn.A1K.A0A;
        if (!SQ0.A03(C298525tb.CONTACT_INFORMATION, qdn.A0l()) || !SUj.A0Q(r2)) {
            return null;
        }
        return (C11022S5z) ((C10575RuU) SUj.A0C(r2)).A01;
    }

    public static ECPPaymentRequest A02(QDN qdn) {
        return (ECPPaymentRequest) qdn.A11.A02();
    }

    public static final ShippingAddress A04(QDN qdn) {
        CheckoutConfiguration checkoutConfiguration;
        AnonymousClass2gB r3 = qdn.A1U.A06;
        Object A092 = A09(qdn);
        if (A092 != null) {
            ECPPaymentRequest eCPPaymentRequest = (ECPPaymentRequest) A092;
            if (!SQ0.A03(C298525tb.SHIPPING_ADDRESS, qdn.A0l()) || (checkoutConfiguration = eCPPaymentRequest.A01) == null || !checkoutConfiguration.A0H.contains(REn.UX_SHIPPING_ADDRESS) || !SUj.A0Q(r3)) {
                return null;
            }
            return (ShippingAddress) ((C10575RuU) SUj.A0C(r3)).A01;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r14.A1O.A05 == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.SUj A08(X.QDN r14) {
        /*
            X.S2P r1 = r14.A04
            X.RH6 r3 = X.RH6.A04
            boolean r0 = A0b(r14)
            if (r0 == 0) goto L_0x0011
            X.QDL r0 = r14.A1O
            boolean r0 = r0.A05
            r8 = 1
            if (r0 != 0) goto L_0x0012
        L_0x0011:
            r8 = 0
        L_0x0012:
            java.util.Map r0 = r1.A01
            java.lang.Object r4 = r0.get(r3)
            X.SJ2 r4 = (X.SJ2) r4
            if (r4 == 0) goto L_0x0073
            java.util.Map r7 = r4.A01
            java.lang.Object r6 = r7.get(r3)
            X.S6H r6 = (X.S6H) r6
            if (r6 == 0) goto L_0x0073
            boolean r0 = r6.A01
            if (r0 == r8) goto L_0x0073
            r6.A01 = r8
            java.util.Iterator r5 = X.DbV.A16(r7)
        L_0x0030:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0053
            java.lang.Object r0 = r5.next()
            java.lang.Object r2 = r7.get(r0)
            X.S6H r2 = (X.S6H) r2
            if (r2 == 0) goto L_0x0030
            int r1 = r2.A02
            int r0 = r6.A02
            if (r1 <= r0) goto L_0x0030
            int r1 = r2.A00
            int r0 = r1 + -1
            if (r8 == 0) goto L_0x0050
            int r0 = r1 + 1
        L_0x0050:
            r2.A00 = r0
            goto L_0x0030
        L_0x0053:
            boolean r0 = r7.isEmpty()
            r2 = 0
            if (r0 != 0) goto L_0x0071
            java.util.Iterator r1 = X.AnonymousClass7TF.A0u(r7)
        L_0x005e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = X.C51971G9r.A0p(r1)
            X.S6H r0 = (X.S6H) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x005e
            int r2 = r2 + 1
            goto L_0x005e
        L_0x0071:
            r4.A00 = r2
        L_0x0073:
            boolean r0 = A0b(r14)
            if (r0 == 0) goto L_0x00e6
            X.QDL r2 = r14.A1O
            boolean r0 = r2.A05
            if (r0 == 0) goto L_0x00e6
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            r0 = 2131961219(0x7f132583, float:1.9559129E38)
            com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem r0 = X.Pxj.A0X(r0)
            X.SUj r0 = X.SUj.A09(r0)
            X.0qQ.A0A(r0)
            r5.add(r0)
            X.SUj r0 = r14.A0K
            java.lang.String r1 = "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>"
            X.0qQ.A0C(r0, r1)
            r5.add(r0)
            X.TlT r7 = r2.A00
            java.util.List r9 = r2.A07()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>"
            X.0qQ.A0C(r9, r0)
            java.util.List r10 = r2.A09()
            r0 = 10
            X.TY1 r11 = X.TY1.A00(r14, r0)
            r0 = 11
            X.TY1 r12 = X.TY1.A00(r14, r0)
            boolean r13 = r2.A06
            X.RH6 r8 = X.RH6.A0I
            com.facebookpay.common.recyclerview.adapteritems.SelectionIncentiveEmbeddedBloksItem r6 = new com.facebookpay.common.recyclerview.adapteritems.SelectionIncentiveEmbeddedBloksItem
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            X.SUj r0 = X.SUj.A09(r6)
            X.0qQ.A0C(r0, r1)
            r5.add(r0)
            X.SUj r4 = r14.A0L
            X.0qQ.A0C(r4, r1)
            X.RH6 r2 = r14.A02
            boolean r1 = X.AnonymousClass7TF.A1W(r2, r3)
            X.S2P r0 = r14.A04
            X.Ry2 r0 = r0.A00(r3, r2)
            X.SUj r0 = X.SUj.A05(r3, r0, r4, r5, r1)
        L_0x00e3:
            r14.A0C = r0
            return r0
        L_0x00e6:
            r0 = 0
            goto L_0x00e3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDN.A08(X.QDN):X.SUj");
    }

    public static Object A09(QDN qdn) {
        return qdn.A11.A02();
    }

    private final void A0B() {
        List<SJ2> list = this.A04.A00;
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        for (SJ2 sj2 : list) {
            018.A16(sj2.A01.keySet(), A1C2);
        }
        for (RH6 rh6 : 00k.A0a(A1C2)) {
            A0D(rh6, this);
            A0E(rh6, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0206, code lost:
        if ((r1.A02 instanceof X.C13216TQh) == false) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x028b, code lost:
        if (r0 == false) goto L_0x028d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0305, code lost:
        if ((r1.A02 instanceof X.C13216TQh) == false) goto L_0x0307;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        if (r0 == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01e7, code lost:
        if (r0 != null) goto L_0x01eb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0D(X.RH6 r39, X.QDN r40) {
        /*
            r10 = r40
            X.RH6 r1 = r10.A02
            r2 = r39
            boolean r9 = X.AnonymousClass7TF.A1W(r1, r2)
            X.S2P r0 = r10.A04
            X.Ry2 r8 = r0.A00(r2, r1)
            int r0 = r2.ordinal()
            java.lang.String r7 = "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>"
            switch(r0) {
                case 12: goto L_0x01f9;
                case 13: goto L_0x027e;
                case 14: goto L_0x02f8;
                case 15: goto L_0x0397;
                case 16: goto L_0x0390;
                case 17: goto L_0x0026;
                case 50: goto L_0x0389;
                default: goto L_0x001a;
            }
        L_0x001a:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "{ECPViewModel} ItemType is not found for identifier => "
            java.lang.IllegalArgumentException r0 = X.C51973G9u.A0g(r2, r0, r1)
            throw r0
        L_0x0026:
            X.SUj r1 = r10.A0O
            boolean r0 = X.SUj.A0S(r1)
            if (r0 == 0) goto L_0x0035
            java.lang.Throwable r0 = r1.A02
            boolean r0 = r0 instanceof X.C13216TQh
            r1 = 1
            if (r0 != 0) goto L_0x0036
        L_0x0035:
            r1 = 0
        L_0x0036:
            X.QDQ r6 = r10.A1T
            X.2gB r0 = r6.A05
            X.SUj r0 = X.Pxe.A0W(r0)
            if (r1 == 0) goto L_0x01e1
            if (r0 == 0) goto L_0x01e9
            java.lang.Object r1 = r0.A01
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x01e9
            java.util.ArrayList r0 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r17 = r1.iterator()
        L_0x0050:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x01eb
            java.lang.Object r5 = r17.next()
            X.SUj r5 = (X.SUj) r5
            java.lang.Object r13 = r5.A01
            if (r13 == 0) goto L_0x0159
            com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem r13 = (com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem) r13
            r11 = 0
            X.0qQ.A0B(r13, r11)
            boolean r1 = r13 instanceof com.facebookpay.common.recyclerview.adapteritems.InlineFormItem
            if (r1 == 0) goto L_0x01d3
            com.facebookpay.common.recyclerview.adapteritems.InlineFormItem r13 = (com.facebookpay.common.recyclerview.adapteritems.InlineFormItem) r13
            X.2Fj r12 = r6.A06
            X.SUj r1 = X.Pxe.A0W(r12)
            r4 = 0
            if (r1 == 0) goto L_0x0156
            java.lang.Object r1 = r1.A01
            X.RuU r1 = (X.C10575RuU) r1
            if (r1 == 0) goto L_0x0156
            java.lang.Object r1 = r1.A01
            com.facebookpay.expresscheckout.models.PickupInfo r1 = (com.facebookpay.expresscheckout.models.PickupInfo) r1
        L_0x007f:
            X.0eP r3 = X.QDQ.A00(r1)
            com.facebookpay.form.fragment.model.FormParams r2 = r13.A00
            java.util.ArrayList r13 = r2.A0I
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r16 = r13.iterator()
        L_0x008f:
            boolean r13 = r16.hasNext()
            if (r13 == 0) goto L_0x015b
            java.lang.Object r14 = r16.next()
            com.facebookpay.form.cell.CellParams r14 = (com.facebookpay.form.cell.CellParams) r14
            boolean r13 = r14 instanceof com.facebookpay.form.cell.text.TextCellParams
            if (r13 == 0) goto L_0x008f
            if (r14 == 0) goto L_0x008f
            int r13 = r14.A02
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            if (r14 == 0) goto L_0x008f
            r14 = 41
            if (r13 != r14) goto L_0x00d5
            android.util.SparseArray r13 = r6.A00
            java.lang.Object r13 = r13.get(r14)
            boolean r15 = r13 instanceof java.lang.String
            if (r15 == 0) goto L_0x00bb
            java.lang.String r13 = (java.lang.String) r13
            if (r13 != 0) goto L_0x00bf
        L_0x00bb:
            java.lang.Object r13 = r3.A00
            java.lang.String r13 = (java.lang.String) r13
        L_0x00bf:
            java.lang.Integer r19 = java.lang.Integer.valueOf(r14)
            r22 = 1
            r18 = r4
            r20 = r13
            r21 = r4
            r23 = r22
            com.facebookpay.form.cell.text.TextCellParams r13 = X.SGF.A00(r18, r19, r20, r21, r22, r23)
        L_0x00d1:
            r1.add(r13)
            goto L_0x008f
        L_0x00d5:
            r15 = 42
            if (r13 != r15) goto L_0x00fe
            android.util.SparseArray r13 = r6.A00
            java.lang.Object r13 = r13.get(r15)
            boolean r14 = r13 instanceof java.lang.String
            if (r14 == 0) goto L_0x00e7
            java.lang.String r13 = (java.lang.String) r13
            if (r13 != 0) goto L_0x00eb
        L_0x00e7:
            java.lang.Object r13 = r3.A01
            java.lang.String r13 = (java.lang.String) r13
        L_0x00eb:
            java.lang.Integer r19 = java.lang.Integer.valueOf(r15)
            r22 = 1
            r18 = r4
            r20 = r13
            r21 = r4
            r23 = r22
            com.facebookpay.form.cell.text.TextCellParams r13 = X.SGF.A00(r18, r19, r20, r21, r22, r23)
            goto L_0x00d1
        L_0x00fe:
            r14 = 1
            if (r13 != r14) goto L_0x012a
            android.util.SparseArray r13 = r6.A00
            java.lang.Object r15 = r13.get(r14)
            boolean r13 = r15 instanceof java.lang.String
            if (r13 == 0) goto L_0x010f
            java.lang.String r15 = (java.lang.String) r15
            if (r15 != 0) goto L_0x0123
        L_0x010f:
            X.SUj r13 = X.Pxe.A0W(r12)
            if (r13 == 0) goto L_0x0128
            java.lang.Object r13 = r13.A01
            X.RuU r13 = (X.C10575RuU) r13
            if (r13 == 0) goto L_0x0128
            java.lang.Object r13 = r13.A01
            com.facebookpay.expresscheckout.models.PickupInfo r13 = (com.facebookpay.expresscheckout.models.PickupInfo) r13
            if (r13 == 0) goto L_0x0128
            java.lang.String r15 = r13.A00
        L_0x0123:
            com.facebookpay.form.cell.text.TextCellParams r13 = X.SGE.A00(r4, r15, r4, r14, r14)
            goto L_0x00d1
        L_0x0128:
            r15 = r4
            goto L_0x0123
        L_0x012a:
            if (r13 != 0) goto L_0x008f
            android.util.SparseArray r13 = r6.A00
            java.lang.Object r15 = r13.get(r11)
            boolean r13 = r15 instanceof java.lang.String
            if (r13 == 0) goto L_0x013a
            java.lang.String r15 = (java.lang.String) r15
            if (r15 != 0) goto L_0x014e
        L_0x013a:
            X.SUj r13 = X.Pxe.A0W(r12)
            if (r13 == 0) goto L_0x0154
            java.lang.Object r13 = r13.A01
            X.RuU r13 = (X.C10575RuU) r13
            if (r13 == 0) goto L_0x0154
            java.lang.Object r13 = r13.A01
            com.facebookpay.expresscheckout.models.PickupInfo r13 = (com.facebookpay.expresscheckout.models.PickupInfo) r13
            if (r13 == 0) goto L_0x0154
            java.lang.String r15 = r13.A03
        L_0x014e:
            com.facebookpay.form.cell.text.TextCellParams r13 = X.SGG.A00(r4, r15, r4, r14, r14)
            goto L_0x00d1
        L_0x0154:
            r15 = r4
            goto L_0x014e
        L_0x0156:
            r1 = r4
            goto L_0x007f
        L_0x0159:
            r13 = 0
            goto L_0x01d3
        L_0x015b:
            java.util.ArrayList r30 = X.AnonymousClass7TE.A1D(r1)
            int r1 = r2.A04
            r33 = r1
            java.lang.String r1 = r2.A0H
            r29 = r1
            int r1 = r2.A06
            r34 = r1
            java.lang.Integer r1 = r2.A0F
            r25 = r1
            java.lang.Integer r1 = r2.A0E
            r26 = r1
            com.facebookpay.form.fragment.model.FormLoggingEvents r1 = r2.A09
            r21 = r1
            X.RH3 r1 = r2.A0B
            r23 = r1
            int r1 = r2.A03
            r35 = r1
            int r1 = r2.A00
            r36 = r1
            int r1 = r2.A02
            r37 = r1
            int r1 = r2.A01
            r38 = r1
            com.facebookpay.form.fragment.model.ListCellParams r1 = r2.A0A
            r22 = r1
            com.facebookpay.form.fragment.model.FeatureConfiguration r1 = r2.A08
            r16 = r1
            java.lang.Integer r15 = r2.A0G
            java.util.List r14 = r2.A0J
            com.facebookpay.form.cell.CellParams r13 = r2.A07
            java.lang.Integer r12 = r2.A0D
            int r11 = r2.A05
            X.RGo r4 = r2.A0C
            boolean r3 = r2.A0L
            X.0sP r2 = r2.A0K
            com.facebookpay.form.fragment.model.FormParams r1 = new com.facebookpay.form.fragment.model.FormParams
            r18 = r1
            r19 = r13
            r20 = r16
            r24 = r4
            r27 = r15
            r28 = r12
            r31 = r14
            r32 = r2
            r39 = r11
            r40 = r3
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r2 = r6.A01
            if (r2 == 0) goto L_0x01dc
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r2 = r2.A05
            if (r2 == 0) goto L_0x01dc
            java.lang.String r3 = r2.A00
            if (r3 != 0) goto L_0x01cc
            java.lang.String r3 = r2.A02
            if (r3 == 0) goto L_0x01dc
        L_0x01cc:
            X.RH6 r2 = X.RH6.A05
            com.facebookpay.common.recyclerview.adapteritems.InlineFormItem r13 = new com.facebookpay.common.recyclerview.adapteritems.InlineFormItem
            r13.<init>(r2, r1, r3)
        L_0x01d3:
            X.SUj r1 = X.SUj.A06(r5, r13)
            r0.add(r1)
            goto L_0x0050
        L_0x01dc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x01e1:
            if (r0 == 0) goto L_0x01e9
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x01eb
        L_0x01e9:
            X.0sn r0 = X.0sn.A00
        L_0x01eb:
            X.RH6 r2 = X.RH6.A0Z
            X.SUj r1 = r10.A0O
            X.0qQ.A0C(r1, r7)
            X.SUj r0 = X.SUj.A05(r2, r8, r1, r0, r9)
            r10.A0E = r0
            return
        L_0x01f9:
            X.SUj r1 = r10.A0N
            boolean r0 = X.SUj.A0S(r1)
            if (r0 == 0) goto L_0x0208
            java.lang.Throwable r0 = r1.A02
            boolean r1 = r0 instanceof X.C13216TQh
            r0 = 1
            if (r1 != 0) goto L_0x0209
        L_0x0208:
            r0 = 0
        L_0x0209:
            X.QDT r2 = r10.A1R
            if (r0 == 0) goto L_0x0244
            r0 = 1
            com.facebookpay.form.fragment.model.FormParams r3 = X.QDT.A00(r2, r0)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = r2.A02
            java.lang.String r0 = "ecpPaymentRequest"
            if (r1 != 0) goto L_0x0220
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0220:
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r1.A05
            if (r0 == 0) goto L_0x023f
            java.lang.String r2 = r0.A00
            if (r2 != 0) goto L_0x022c
            java.lang.String r2 = r0.A02
            if (r2 == 0) goto L_0x023f
        L_0x022c:
            X.RH6 r1 = X.RH6.A05
            com.facebookpay.common.recyclerview.adapteritems.InlineFormItem r0 = new com.facebookpay.common.recyclerview.adapteritems.InlineFormItem
            r0.<init>(r1, r3, r2)
            X.SUj r0 = X.SUj.A09(r0)
            X.0qQ.A0C(r0, r7)
            java.util.List r2 = X.AnonymousClass7TE.A1I(r0)
            goto L_0x026d
        L_0x023f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0244:
            boolean r1 = A0a(r10)
            X.2gB r0 = r2.A09
            X.SUj r0 = X.Pxe.A0W(r0)
            if (r0 == 0) goto L_0x027b
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x027b
            if (r1 != 0) goto L_0x026d
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            r3.addAll(r2)
            r2 = 2131961330(0x7f1325f2, float:1.9559354E38)
            X.RH6 r1 = X.RH6.A0C
            com.facebookpay.common.recyclerview.adapteritems.AutoAdvanceButtonItem r0 = new com.facebookpay.common.recyclerview.adapteritems.AutoAdvanceButtonItem
            r0.<init>(r1, r2)
            X.SUj.A0O(r0, r3)
        L_0x026c:
            r2 = r3
        L_0x026d:
            X.RH6 r1 = X.RH6.A0Y
            X.SUj r0 = r10.A0N
            X.0qQ.A0C(r0, r7)
            X.SUj r0 = X.SUj.A05(r1, r8, r0, r2, r9)
            r10.A0D = r0
            return
        L_0x027b:
            X.0sn r3 = X.0sn.A00
            goto L_0x026c
        L_0x027e:
            X.SUj r1 = r10.A0Q
            boolean r0 = X.SUj.A0S(r1)
            if (r0 == 0) goto L_0x028d
            java.lang.Throwable r0 = r1.A02
            boolean r0 = r0 instanceof X.C13216TQh
            r1 = 1
            if (r0 != 0) goto L_0x028e
        L_0x028d:
            r1 = 0
        L_0x028e:
            X.QDS r0 = r10.A1U
            if (r1 == 0) goto L_0x02c6
            com.facebookpay.form.fragment.model.FormParams r3 = X.QDS.A01(r0)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r0.A01
            if (r0 == 0) goto L_0x02f3
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r0.A05
            if (r0 == 0) goto L_0x02f3
            java.lang.String r2 = r0.A00
            if (r2 != 0) goto L_0x02a6
            java.lang.String r2 = r0.A02
            if (r2 == 0) goto L_0x02f3
        L_0x02a6:
            X.RH6 r1 = X.RH6.A05
            com.facebookpay.common.recyclerview.adapteritems.InlineFormItem r0 = new com.facebookpay.common.recyclerview.adapteritems.InlineFormItem
            r0.<init>(r1, r3, r2)
            X.SUj r0 = X.SUj.A09(r0)
            X.0qQ.A0C(r0, r7)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
        L_0x02b8:
            X.RH6 r2 = X.RH6.A0a
            X.SUj r1 = r10.A0Q
            X.0qQ.A0C(r1, r7)
            X.SUj r0 = X.SUj.A05(r2, r8, r1, r0, r9)
            r10.A0F = r0
            return
        L_0x02c6:
            boolean r1 = A0a(r10)
            X.2gB r0 = r0.A07
            X.SUj r0 = X.Pxe.A0W(r0)
            if (r0 == 0) goto L_0x02f0
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x02f0
            if (r1 != 0) goto L_0x02b8
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            r3.addAll(r0)
            r2 = 2131961330(0x7f1325f2, float:1.9559354E38)
            X.RH6 r1 = X.RH6.A0C
            com.facebookpay.common.recyclerview.adapteritems.AutoAdvanceButtonItem r0 = new com.facebookpay.common.recyclerview.adapteritems.AutoAdvanceButtonItem
            r0.<init>(r1, r2)
            X.SUj.A0O(r0, r3)
        L_0x02ee:
            r0 = r3
            goto L_0x02b8
        L_0x02f0:
            X.0sn r3 = X.0sn.A00
            goto L_0x02ee
        L_0x02f3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x02f8:
            X.SUj r1 = r10.A0I
            boolean r0 = X.SUj.A0S(r1)
            if (r0 == 0) goto L_0x0307
            java.lang.Throwable r0 = r1.A02
            boolean r1 = r0 instanceof X.C13216TQh
            r0 = 1
            if (r1 != 0) goto L_0x0308
        L_0x0307:
            r0 = 0
        L_0x0308:
            X.QDU r5 = r10.A1K
            if (r0 == 0) goto L_0x034f
            X.2gB r0 = r5.A0B
            X.SUj r0 = X.Pxe.A0W(r0)
            if (r0 == 0) goto L_0x034c
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x034c
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x0322:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0378
            java.lang.Object r3 = r4.next()
            X.SUj r3 = (X.SUj) r3
            java.lang.Object r1 = r3.A01
            if (r1 == 0) goto L_0x034a
            com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem r1 = (com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            boolean r0 = r1 instanceof com.facebookpay.common.recyclerview.adapteritems.InlineFormItem
            if (r0 == 0) goto L_0x0342
            com.facebookpay.common.recyclerview.adapteritems.InlineFormItem r1 = (com.facebookpay.common.recyclerview.adapteritems.InlineFormItem) r1
            com.facebookpay.common.recyclerview.adapteritems.InlineFormItem r1 = X.QDU.A00(r1, r5)
        L_0x0342:
            X.SUj r0 = X.SUj.A06(r3, r1)
            r2.add(r0)
            goto L_0x0322
        L_0x034a:
            r1 = 0
            goto L_0x0342
        L_0x034c:
            X.0sn r2 = X.0sn.A00
            goto L_0x0378
        L_0x034f:
            boolean r1 = A0a(r10)
            X.2gB r0 = r5.A0B
            X.SUj r0 = X.Pxe.A0W(r0)
            if (r0 == 0) goto L_0x0386
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x0386
            if (r1 != 0) goto L_0x0378
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            r3.addAll(r2)
            r2 = 2131961330(0x7f1325f2, float:1.9559354E38)
            X.RH6 r1 = X.RH6.A0C
            com.facebookpay.common.recyclerview.adapteritems.AutoAdvanceButtonItem r0 = new com.facebookpay.common.recyclerview.adapteritems.AutoAdvanceButtonItem
            r0.<init>(r1, r2)
            X.SUj.A0O(r0, r3)
        L_0x0377:
            r2 = r3
        L_0x0378:
            X.RH6 r1 = X.RH6.A0V
            X.SUj r0 = r10.A0I
            X.0qQ.A0C(r0, r7)
            X.SUj r0 = X.SUj.A05(r1, r8, r0, r2, r9)
            r10.A0A = r0
            return
        L_0x0386:
            X.0sn r3 = X.0sn.A00
            goto L_0x0377
        L_0x0389:
            X.SUj r0 = A08(r10)
            r10.A0C = r0
            return
        L_0x0390:
            X.SUj r0 = r10.A05()
            r10.A0f = r0
            return
        L_0x0397:
            X.QDR r4 = r10.A1N
            boolean r3 = A0a(r10)
            X.2Fj r1 = r4.A05
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<kotlin.collections.List<com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>>>>"
            X.0qQ.A0C(r1, r0)
            X.SUj r0 = X.Pxe.A0W(r1)
            if (r0 == 0) goto L_0x03d5
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x03d5
            if (r3 != 0) goto L_0x03ce
            java.lang.Integer r1 = r4.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x03ce
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            r3.addAll(r2)
            r2 = 2131961330(0x7f1325f2, float:1.9559354E38)
            X.RH6 r1 = X.RH6.A0C
            com.facebookpay.common.recyclerview.adapteritems.AutoAdvanceButtonItem r0 = new com.facebookpay.common.recyclerview.adapteritems.AutoAdvanceButtonItem
            r0.<init>(r1, r2)
            X.SUj.A0O(r0, r3)
        L_0x03cd:
            r2 = r3
        L_0x03ce:
            X.SUj r0 = A06(r8, r10, r2, r9)
            r10.A0B = r0
            return
        L_0x03d5:
            X.0sn r3 = X.0sn.A00
            goto L_0x03cd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDN.A0D(X.RH6, X.QDN):void");
    }

    public static final void A0F(RH6 rh6, QDN qdn, boolean z) {
        int size;
        if (z) {
            RH6 rh62 = qdn.A02;
            if (rh6 != rh62) {
                LinkedHashMap linkedHashMap = qdn.A1X;
                Set keySet = linkedHashMap.keySet();
                0qQ.A07(keySet);
                List A0a2 = 00k.A0a(keySet);
                int indexOf = A0a2.indexOf(rh6.A01());
                if (rh62 != null) {
                    size = A0a2.indexOf(rh62.A01());
                } else {
                    size = linkedHashMap.size();
                }
                if (indexOf < size) {
                    qdn.A0G(rh6, false);
                }
            }
        } else if (rh6 == qdn.A02) {
            qdn.A0s(false);
        }
    }

    private final void A0G(RH6 rh6, boolean z) {
        String str;
        String str2;
        String str3;
        RH6 rh62 = RH6.A0Y;
        if (rh6 == rh62 && A0w()) {
            ShippingAddress A042 = A04(this);
            ShippingAddress A032 = A03(this);
            boolean z2 = false;
            if (!(A042 == null || A032 == null || (str2 = A042.A06) == null || (str3 = A032.A06) == null)) {
                z2 = str2.equals(str3);
            }
            Boolean A0I2 = this.A1R.A0I();
            C12411Sto A0g2 = C51965G9l.A0g();
            LoggingContext loggingContext = this.A1P;
            if (z2) {
                str = "checkbox";
            } else {
                str = "inline_billing_form";
            }
            if (A0I2 != null) {
                z2 = A0I2.booleanValue();
            }
            C12411Sto.A03(C51965G9l.A0U(C51969G9p.A0d(A0g2.A00, "client_load_shippingasbilling_display"), 97), loggingContext, new C58771IxI(loggingContext, (Object) null, str, 7, z2));
        }
        RH6 rh63 = this.A02;
        this.A02 = rh6;
        if (rh63 != null) {
            if (z) {
                int ordinal = rh63.ordinal();
                if (ordinal == 13) {
                    SUj A002 = S9h.A00(this.A0Q, 2131961233);
                    0qQ.A0C(A002, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem>");
                    this.A0Q = A002;
                } else if (ordinal == 12) {
                    SUj A003 = S9h.A00(this.A0N, 2131961231);
                    0qQ.A0C(A003, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem>");
                    this.A0N = A003;
                } else if (ordinal == 14) {
                    SUj A004 = S9h.A00(this.A0I, 2131961229);
                    0qQ.A0C(A004, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.PuxContactItem>");
                    this.A0I = A004;
                }
            }
            if (rh63 == RH6.A0X) {
                A0D(rh63, this);
                A0E(rh63, this);
            } else if (rh63 == rh62) {
                A0n();
            }
        }
        A0B();
    }

    public static final void A0I(QDN qdn) {
        SR4.A01(qdn.A0t, new ErrorDialogContent(C8911RFe.A05, (C8911RFe) null, (C10576RuV) null, (C10576RuV) null, 2131961290, 2131961289, (Integer) null, (Integer) null, (String) null, (String) null));
        qdn.A0m = true;
    }

    public static final void A0J(QDN qdn) {
        List<String> list;
        SUj sUj = qdn.A0S;
        TransactionInfo transactionInfo = (TransactionInfo) sUj.A01;
        if (transactionInfo == null || (list = transactionInfo.A09) == null) {
            list = 0sn.A00;
        }
        SUj A062 = SUj.A06(sUj, new IncentiveCredentialList(list));
        QDL qdl = qdn.A1O;
        0qQ.A0A(A062);
        qdl.A0B.A0B(A062);
    }

    public static final void A0K(QDN qdn) {
        SUj sUj;
        if (!DbX.A1a(qdn.A0j) && !SUj.A0T(qdn.A0N) && ((!SUj.A0T(qdn.A0F) || !A0i(qdn)) && (!SUj.A0T(qdn.A0I) || (!A0d(qdn) && !A0e(qdn) && !A0c(qdn))))) {
            Object A092 = A09(qdn);
            if (A092 != null) {
                qdn.A0j = Pxi.A0R(STa.A00((ECPPaymentRequest) A092, qdn, false), "FULL_PUX");
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        C298525tb r1 = C298525tb.APM;
        SUj sUj2 = null;
        if (qdn.A0V()) {
            sUj = qdn.A08;
        } else {
            sUj = null;
        }
        A0N(qdn, r1, sUj);
        C298525tb r12 = C298525tb.ONE_TIME_CHECKOUT_OPTION;
        if (!AnonymousClass7TF.A1Y(A07(qdn).A01, false)) {
            sUj2 = qdn.A0G;
        }
        A0N(qdn, r12, sUj2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bd, code lost:
        if (X.SUj.A0V(r2.A0Q) != false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d6, code lost:
        if (X.0qQ.A0K(r7.A01, r8.A01) == false) goto L_0x00da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0M(X.QDN r17) {
        /*
            r2 = r17
            boolean r0 = A0b(r2)
            if (r0 == 0) goto L_0x0011
            X.QDL r0 = r2.A1O
            java.lang.Integer r1 = r0.A04
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0011
        L_0x0010:
            return
        L_0x0011:
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = X.SUj.A01(r2)
            if (r0 == 0) goto L_0x0010
            com.facebookpay.common.models.CurrencyAmount r7 = X.C11432SUd.A03(r0)
            X.SUj r0 = r2.A0S
            com.facebookpay.common.models.CurrencyAmount r8 = X.C11432SUd.A02(r7, r0)
            X.2Fj r4 = r2.A11
            java.lang.Object r0 = r4.A02()
            r1 = 0
            if (r0 == 0) goto L_0x0076
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = X.SUj.A01(r2)
            if (r0 == 0) goto L_0x0076
            java.util.ArrayList<com.facebookpay.expresscheckout.models.PriceInfo> r0 = r0.A07
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = X.00k.A0J(r0)
            com.facebookpay.expresscheckout.models.PriceInfo r0 = (com.facebookpay.expresscheckout.models.PriceInfo) r0
            if (r0 == 0) goto L_0x0076
            java.lang.String r11 = r0.A04
        L_0x003e:
            X.SUj r3 = r2.A0g
            boolean r0 = X.SUj.A0T(r3)
            if (r0 != 0) goto L_0x0095
            java.lang.Object r0 = r3.A01
            if (r0 == 0) goto L_0x0095
            java.util.Map r0 = r2.A0l
            java.util.Collection r0 = r0.values()
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r0.iterator()
        L_0x0058:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0078
            java.lang.Object r0 = r5.next()
            X.SUj r0 = (X.SUj) r0
            java.lang.Object r3 = r0.A01
            boolean r0 = r3 instanceof com.facebookpay.common.recyclerview.adapteritems.PuxEntityItem
            if (r0 == 0) goto L_0x0058
            com.facebookpay.common.recyclerview.adapteritems.PuxEntityItem r3 = (com.facebookpay.common.recyclerview.adapteritems.PuxEntityItem) r3
            if (r3 == 0) goto L_0x0058
            java.lang.String r0 = r3.A03
            if (r0 == 0) goto L_0x0058
            r6.add(r0)
            goto L_0x0058
        L_0x0076:
            r11 = r1
            goto L_0x003e
        L_0x0078:
            X.SUj r0 = r2.A0g
            java.lang.Object r0 = r0.A01
            com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem r0 = (com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem) r0
            if (r0 == 0) goto L_0x0093
            java.util.List r0 = r0.A07
        L_0x0082:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0095
            X.SUj r0 = r2.A0g
            java.lang.Object r0 = r0.A01
            com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem r0 = (com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem) r0
            if (r0 == 0) goto L_0x010d
            java.util.List r13 = r0.A07
            goto L_0x00a7
        L_0x0093:
            r0 = r1
            goto L_0x0082
        L_0x0095:
            java.util.Map r3 = r2.A0l
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.Pxh.A0U(r4)
            if (r0 == 0) goto L_0x010b
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r0.A05
            if (r0 == 0) goto L_0x010b
            java.lang.String r0 = r0.A01
        L_0x00a3:
            java.util.List r13 = X.C11294SKc.A01(r0, r3)
        L_0x00a7:
            java.lang.String r12 = r2.A0W
            java.util.Map r0 = r2.A0l
            int r14 = r0.size()
            boolean r0 = A0i(r2)
            r3 = 1
            if (r0 == 0) goto L_0x00bf
            X.SUj r0 = r2.A0Q
            boolean r0 = X.SUj.A0V(r0)
            r15 = 1
            if (r0 == 0) goto L_0x00c0
        L_0x00bf:
            r15 = 0
        L_0x00c0:
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = X.SUj.A01(r2)
            if (r0 == 0) goto L_0x00d8
            boolean r0 = X.C11432SUd.A0P(r0)
            if (r0 != r3) goto L_0x00d8
            java.lang.String r5 = r7.A01
            java.lang.String r0 = r8.A01
            boolean r0 = X.0qQ.A0K(r5, r0)
            r16 = 1
            if (r0 == 0) goto L_0x00da
        L_0x00d8:
            r16 = 0
        L_0x00da:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.Pxh.A0U(r4)
            if (r0 == 0) goto L_0x0106
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r0 = r0.A04
            com.facebookpay.expresscheckout.models.ItemDetails r10 = r0.A09
        L_0x00e4:
            X.RH6 r9 = X.RH6.A0g
            r17 = 0
            com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem r6 = new com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.SUj r0 = X.SUj.A09(r6)
            r2.A0g = r0
            X.5tb r4 = X.C298525tb.ORDER_SUMMARY
            X.SUj r0 = r2.A05()
            A0N(r2, r4, r0)
            boolean r0 = X.C11431STx.A06()
            if (r0 == 0) goto L_0x0010
            X.STa.A06(r2, r1, r3)
            return
        L_0x0106:
            com.facebookpay.expresscheckout.models.ItemDetails r10 = X.Pxh.A0V()
            goto L_0x00e4
        L_0x010b:
            r0 = r1
            goto L_0x00a3
        L_0x010d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDN.A0M(X.QDN):void");
    }

    public static final void A0O(QDN qdn, String str, String str2) {
        AnonymousClass2Fj r2;
        ErrorDialogContent errorDialogContent;
        Object sr4;
        QDL qdl = qdn.A1O;
        ECPIncentive eCPIncentive = qdl.A01;
        if (eCPIncentive == null || !eCPIncentive.CPP()) {
            r2 = qdn.A0t;
            String str3 = str;
            if (str != null) {
                errorDialogContent = new ErrorDialogContent(C8911RFe.A04, (C8911RFe) null, (C10576RuV) null, (C10576RuV) null, 2131961352, (Integer) null, (Integer) null, (Integer) null, (String) null, str3);
            } else {
                errorDialogContent = new ErrorDialogContent(C8911RFe.A04, (C8911RFe) null, (C10576RuV) null, (C10576RuV) null, 2131961352, 2131961351, (Integer) null, (Integer) null, (String) null, (String) null);
            }
            sr4 = new SR4(errorDialogContent);
        } else {
            r2 = qdn.A10;
            sr4 = new SE8((String) null, false);
        }
        r2.A0B(sr4);
        qdl.A0C(qdn.A1P, str2);
        if (182.A06(0Tu.A06, C11431STx.A00(), 36317328627078171L)) {
            A0N(qdn, C298525tb.INCENTIVES, A08(qdn));
        }
    }

    public static final void A0P(QDN qdn, Throwable th) {
        if (qdn.A0m) {
            return;
        }
        if (th instanceof C8286QnS) {
            C8286QnS qnS = (C8286QnS) th;
            0qQ.A0B(qnS, 0);
            if (AnonymousClass7TF.A1W(qnS.A01.A00, C8937RGf.DISMISS_AND_CLOSE)) {
                qdn.A0m = true;
            }
            qdn.A0t.A0B(SPz.A00(qnS));
            return;
        }
        A0I(qdn);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0R(X.QDN r4, java.util.List r5) {
        /*
            java.util.LinkedHashMap r2 = r4.A1X
            r2.clear()
            java.util.Iterator r3 = r5.iterator()
        L_0x0009:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0092
            java.lang.Object r0 = r3.next()
            X.5tb r0 = (X.C298525tb) r0
            int r0 = r0.ordinal()
            r1 = 0
            switch(r0) {
                case 1: goto L_0x0034;
                case 2: goto L_0x0029;
                case 3: goto L_0x0064;
                case 6: goto L_0x007d;
                case 8: goto L_0x001e;
                case 9: goto L_0x0073;
                case 12: goto L_0x0082;
                case 17: goto L_0x003f;
                case 18: goto L_0x0087;
                case 19: goto L_0x0069;
                case 21: goto L_0x005f;
                case 22: goto L_0x006e;
                case 28: goto L_0x0078;
                case 29: goto L_0x0073;
                case 33: goto L_0x005a;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0009
        L_0x001e:
            boolean r0 = A0Z(r4)
            if (r0 == 0) goto L_0x0026
            X.SUj r1 = r4.A09
        L_0x0026:
            java.lang.String r0 = "EMAIL_OPTIN"
            goto L_0x008d
        L_0x0029:
            boolean r0 = r4.A0V()
            if (r0 == 0) goto L_0x0031
            X.SUj r1 = r4.A08
        L_0x0031:
            java.lang.String r0 = "APM"
            goto L_0x008d
        L_0x0034:
            boolean r0 = A0Y(r4)
            if (r0 == 0) goto L_0x0009
            X.SUj r1 = r4.A07
            java.lang.String r0 = "ANON_CHECKOUT_BACK_BUTTON"
            goto L_0x008d
        L_0x003f:
            X.SUj r0 = A07(r4)
            boolean r0 = X.SUj.A0T(r0)
            if (r0 != 0) goto L_0x0055
            X.SUj r0 = A07(r4)
            java.lang.Object r0 = r0.A01
            boolean r0 = X.DbX.A1a(r0)
            if (r0 == 0) goto L_0x0009
        L_0x0055:
            X.SUj r1 = r4.A0G
            java.lang.String r0 = "ONE_TIME_CHECKOUT_OPTION"
            goto L_0x008d
        L_0x005a:
            X.SUj r0 = r4.A0R
            r4.A0i = r0
            goto L_0x0009
        L_0x005f:
            X.SUj r0 = r4.A0M
            r4.A0h = r0
            goto L_0x0009
        L_0x0064:
            X.SUj r1 = r4.A0H
            java.lang.String r0 = "BANNER"
            goto L_0x008d
        L_0x0069:
            X.SUj r1 = r4.A0D
            java.lang.String r0 = "PAYMENT_METHOD"
            goto L_0x008d
        L_0x006e:
            X.SUj r1 = r4.A0E
            java.lang.String r0 = "PICKUP_CONTACT_INFO"
            goto L_0x008d
        L_0x0073:
            X.SUj r1 = r4.A0B
            java.lang.String r0 = "FULFILLMENT_OPTIONS"
            goto L_0x008d
        L_0x0078:
            X.SUj r1 = r4.A0F
            java.lang.String r0 = "SHIPPING_ADDRESS"
            goto L_0x008d
        L_0x007d:
            X.SUj r1 = r4.A0A
            java.lang.String r0 = "CONTACT_INFORMATION"
            goto L_0x008d
        L_0x0082:
            X.SUj r1 = r4.A0C
            java.lang.String r0 = "INCENTIVES"
            goto L_0x008d
        L_0x0087:
            X.SUj r1 = r4.A05()
            java.lang.String r0 = "ORDER_SUMMARY"
        L_0x008d:
            r2.put(r0, r1)
            goto L_0x0009
        L_0x0092:
            X.SUj r0 = r4.A1W
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            A0Q(r4, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDN.A0R(X.QDN, java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01d7, code lost:
        if (r5 == null) goto L_0x01d9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0S(X.QDN r28, boolean r29) {
        /*
            r3 = r28
            X.2Fj r13 = r3.A11
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.Pxh.A0U(r13)
            if (r0 == 0) goto L_0x0179
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x0179
            java.lang.Integer r0 = r0.A0D
            if (r0 == 0) goto L_0x0179
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.Pxh.A0U(r13)
            if (r0 == 0) goto L_0x0119
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x0119
            java.lang.Integer r0 = r0.A0D
            if (r0 == 0) goto L_0x0119
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L_0x0119
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = X.SUj.A01(r3)
            if (r0 == 0) goto L_0x005e
            com.facebookpay.expresscheckout.models.FulfillmentOptions r0 = r0.A00
            if (r0 == 0) goto L_0x005e
            java.util.ArrayList<com.facebookpay.expresscheckout.models.FulfillmentOption> r0 = r0.A01
        L_0x0033:
            r28 = 0
            if (r0 == 0) goto L_0x0060
            java.util.Iterator r6 = r0.iterator()
        L_0x003b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0060
            java.lang.Object r1 = r6.next()
            com.facebookpay.expresscheckout.models.FulfillmentOption r1 = (com.facebookpay.expresscheckout.models.FulfillmentOption) r1
            boolean r0 = r1 instanceof com.facebookpay.expresscheckout.models.PickupFulfillmentOption
            if (r0 == 0) goto L_0x003b
            com.facebookpay.expresscheckout.models.PickupFulfillmentOption r1 = (com.facebookpay.expresscheckout.models.PickupFulfillmentOption) r1
            com.facebookpay.common.models.CurrencyAmount r0 = r1.A00
            java.lang.String r0 = r0.A01
            double r4 = java.lang.Double.parseDouble(r0)
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x003b
            r28 = 1
            goto L_0x003b
        L_0x005e:
            r0 = 0
            goto L_0x0033
        L_0x0060:
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = X.SUj.A01(r3)
            if (r0 == 0) goto L_0x0205
            com.facebookpay.expresscheckout.models.FulfillmentOptions r0 = r0.A00
            if (r0 == 0) goto L_0x0205
            java.util.ArrayList<com.facebookpay.expresscheckout.models.FulfillmentOption> r0 = r0.A01
            if (r0 == 0) goto L_0x0205
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r17 = r0.iterator()
        L_0x0076:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x01b0
            java.lang.Object r1 = r17.next()
            com.facebookpay.expresscheckout.models.FulfillmentOption r1 = (com.facebookpay.expresscheckout.models.FulfillmentOption) r1
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.expresscheckout.models.PickupFulfillmentOption"
            X.0qQ.A0C(r1, r0)
            com.facebookpay.expresscheckout.models.PickupFulfillmentOption r1 = (com.facebookpay.expresscheckout.models.PickupFulfillmentOption) r1
            java.lang.String r12 = r1.A03
            java.lang.String r11 = r1.A04
            com.facebookpay.common.models.CurrencyAmount r10 = r1.A00
            r25 = 0
            java.util.Date r6 = r1.A06
            java.util.Date r5 = r1.A05
            boolean r0 = r1.A07
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r0)
            com.facebookpay.shippingaddress.model.ShippingAddress r4 = r1.A02
            com.facebookpay.common.models.Distance r9 = r1.A01
            java.util.Locale r16 = X.Pxh.A0w()
            if (r9 != 0) goto L_0x00c0
            r9 = 0
        L_0x00a7:
            com.facebookpay.fulfillmentoption.model.PickupFulfillmentOptionComponent r0 = new com.facebookpay.fulfillmentoption.model.PickupFulfillmentOptionComponent
            r23 = r12
            r24 = r11
            r26 = r6
            r27 = r5
            r18 = r0
            r19 = r10
            r20 = r9
            r21 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r2.add(r0)
            goto L_0x0076
        L_0x00c0:
            java.lang.Integer r8 = r9.A01
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            r14 = 4609926642196959346(0x3ff9bfdb4cc25072, double:1.60934)
            if (r8 != r7) goto L_0x00eb
            java.util.Set r1 = X.XYD.A00
            java.lang.String r0 = r16.getCountry()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00eb
            double r0 = r9.A00
            double r0 = r0 / r14
            r7 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r0 = r0 * r7
            int r0 = X.AnonymousClass1GB.A00(r0)
            double r0 = (double) r0
            double r0 = r0 / r7
            java.lang.Integer r8 = X.AnonymousClass05K.A00
        L_0x00e5:
            com.facebookpay.common.models.Distance r9 = new com.facebookpay.common.models.Distance
            r9.<init>(r8, r0)
            goto L_0x00a7
        L_0x00eb:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r8 != r0) goto L_0x010d
            java.util.Set r1 = X.XYD.A00
            java.lang.String r0 = r16.getCountry()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x010d
            double r0 = r9.A00
            double r0 = r0 * r14
            r8 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r0 = r0 * r8
            int r0 = X.AnonymousClass1GB.A00(r0)
            double r0 = (double) r0
            double r0 = r0 / r8
            com.facebookpay.common.models.Distance r9 = new com.facebookpay.common.models.Distance
            r9.<init>(r7, r0)
            goto L_0x00a7
        L_0x010d:
            double r0 = r9.A00
            r14 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r0 = r0 * r14
            int r0 = X.AnonymousClass1GB.A00(r0)
            double r0 = (double) r0
            double r0 = r0 / r14
            goto L_0x00e5
        L_0x0119:
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = X.SUj.A01(r3)
            if (r0 == 0) goto L_0x0205
            com.facebookpay.expresscheckout.models.FulfillmentOptions r0 = r0.A00
            if (r0 == 0) goto L_0x0205
            java.util.ArrayList<com.facebookpay.expresscheckout.models.FulfillmentOption> r0 = r0.A01
            if (r0 == 0) goto L_0x0205
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x012f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x01b0
            java.lang.Object r6 = r7.next()
            com.facebookpay.expresscheckout.models.FulfillmentOption r6 = (com.facebookpay.expresscheckout.models.FulfillmentOption) r6
            java.lang.String r16 = r6.A00()
            boolean r5 = r6 instanceof com.facebookpay.expresscheckout.models.PickupFulfillmentOption
            if (r5 == 0) goto L_0x0176
            r0 = r6
            com.facebookpay.expresscheckout.models.PickupFulfillmentOption r0 = (com.facebookpay.expresscheckout.models.PickupFulfillmentOption) r0
            java.lang.String r4 = r0.A04
        L_0x0148:
            if (r5 == 0) goto L_0x0173
            r0 = r6
            com.facebookpay.expresscheckout.models.PickupFulfillmentOption r0 = (com.facebookpay.expresscheckout.models.PickupFulfillmentOption) r0
            com.facebookpay.common.models.CurrencyAmount r15 = r0.A00
        L_0x014f:
            r18 = 0
            if (r5 == 0) goto L_0x0170
            r0 = r6
            com.facebookpay.expresscheckout.models.PickupFulfillmentOption r0 = (com.facebookpay.expresscheckout.models.PickupFulfillmentOption) r0
            java.util.Date r1 = r0.A06
        L_0x0158:
            if (r5 == 0) goto L_0x016d
            com.facebookpay.expresscheckout.models.PickupFulfillmentOption r6 = (com.facebookpay.expresscheckout.models.PickupFulfillmentOption) r6
            java.util.Date r0 = r6.A05
        L_0x015e:
            com.facebookpay.fulfillmentoption.model.ShippingFulfillmentOptionComponent r14 = new com.facebookpay.fulfillmentoption.model.ShippingFulfillmentOptionComponent
            r19 = r1
            r20 = r0
            r17 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r2.add(r14)
            goto L_0x012f
        L_0x016d:
            java.util.Date r0 = r6.A02
            goto L_0x015e
        L_0x0170:
            java.util.Date r1 = r6.A03
            goto L_0x0158
        L_0x0173:
            com.facebookpay.common.models.CurrencyAmount r15 = r6.A00
            goto L_0x014f
        L_0x0176:
            java.lang.String r4 = r6.A01
            goto L_0x0148
        L_0x0179:
            com.facebookpay.expresscheckout.models.TransactionInfo r1 = X.SUj.A01(r3)
            if (r1 == 0) goto L_0x0205
            java.lang.Integer r0 = r1.A04
            if (r0 == 0) goto L_0x0205
            com.facebookpay.expresscheckout.models.ShippingOptions r0 = r1.A03
            if (r0 == 0) goto L_0x0205
            java.util.ArrayList<com.facebookpay.expresscheckout.models.ShippingOption> r0 = r0.A01
            if (r0 == 0) goto L_0x0205
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x0193:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x01b0
            java.lang.Object r0 = r7.next()
            com.facebookpay.expresscheckout.models.ShippingOption r0 = (com.facebookpay.expresscheckout.models.ShippingOption) r0
            java.lang.String r6 = r0.A03
            java.lang.String r5 = r0.A04
            com.facebookpay.common.models.CurrencyAmount r4 = r0.A00
            java.lang.String r1 = r0.A02
            com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent r0 = new com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent
            r0.<init>(r4, r6, r5, r1)
            r2.add(r0)
            goto L_0x0193
        L_0x01b0:
            java.util.Iterator r4 = r2.iterator()
        L_0x01b4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01d9
            java.lang.Object r5 = r4.next()
            r0 = r5
            com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent r0 = (com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent) r0
            java.lang.String r1 = r0.A02()
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = X.SUj.A01(r3)
            if (r0 == 0) goto L_0x0203
            com.facebookpay.expresscheckout.models.FulfillmentOptions r0 = r0.A00
            if (r0 == 0) goto L_0x0203
            java.lang.String r0 = r0.A00
        L_0x01d1:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01b4
            if (r5 != 0) goto L_0x0207
        L_0x01d9:
            java.util.Iterator r4 = r2.iterator()
        L_0x01dd:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0206
            java.lang.Object r5 = r4.next()
            r0 = r5
            com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent r0 = (com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent) r0
            java.lang.String r1 = r0.A02()
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = X.SUj.A01(r3)
            if (r0 == 0) goto L_0x0201
            com.facebookpay.expresscheckout.models.ShippingOptions r0 = r0.A03
            if (r0 == 0) goto L_0x0201
            java.lang.String r0 = r0.A00
        L_0x01fa:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01dd
            goto L_0x0207
        L_0x0201:
            r0 = 0
            goto L_0x01fa
        L_0x0203:
            r0 = 0
            goto L_0x01d1
        L_0x0205:
            r2 = 0
        L_0x0206:
            r5 = 0
        L_0x0207:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.Pxh.A0U(r13)
            if (r0 == 0) goto L_0x022f
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x022f
            java.lang.Boolean r0 = r0.A0C
            if (r0 == 0) goto L_0x022f
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = X.SUj.A01(r3)
            if (r0 == 0) goto L_0x028e
            java.lang.Integer r1 = r0.A04
        L_0x021d:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x022f
            com.instagram.common.session.UserSession r6 = X.C11431STx.A00()
            X.0Tu r4 = X.0Tu.A05
            r0 = 36314498245659278(0x8103d800210a8e, double:3.028773145077832E-306)
            X.182.A06(r4, r6, r0)
        L_0x022f:
            X.QDR r4 = r3.A1N
            X.SUj r0 = r3.A0S
            X.SUj r6 = X.SUj.A06(r0, r2)
            X.SUj r2 = X.SUj.A06(r0, r5)
            com.facebookpay.logging.LoggingContext r0 = r3.A1P
            r4.A00 = r0
            boolean r0 = X.SUj.A0V(r6)
            if (r0 != 0) goto L_0x024b
            boolean r0 = X.SUj.A0S(r6)
            if (r0 == 0) goto L_0x025b
        L_0x024b:
            X.2Fj r0 = r4.A08
            r0.A0B(r6)
            X.2Fj r1 = r4.A07
            X.Scc r0 = X.C11577Scc.A00
            X.SUj r0 = X.SUj.A04(r0, r2)
            r1.A0B(r0)
        L_0x025b:
            java.lang.Object r0 = r6.A01
            java.util.List r0 = (java.util.List) r0
            X.QDR.A01(r4, r0)
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = X.SUj.A01(r3)
            if (r0 == 0) goto L_0x026c
            java.lang.Integer r0 = r0.A04
            if (r0 != 0) goto L_0x026e
        L_0x026c:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x026e:
            r4.A02 = r0
            if (r29 == 0) goto L_0x028b
            r1 = 2131961403(0x7f13263b, float:1.9559502E38)
            X.RH2 r0 = X.RH2.A1F
            X.2Fj r4 = r4.A07
            X.TQh r3 = new X.TQh
            r3.<init>(r0, r1)
            if (r5 == 0) goto L_0x028c
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            r1 = 0
            X.RuU r0 = new X.RuU
            r0.<init>(r2, r5, r1)
        L_0x0288:
            X.SUj.A0M(r4, r0, r3)
        L_0x028b:
            return
        L_0x028c:
            r0 = 0
            goto L_0x0288
        L_0x028e:
            r1 = 0
            goto L_0x021d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDN.A0S(X.QDN, boolean):void");
    }

    public static final boolean A0X(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, QDN qdn, PaymentMethod paymentMethod) {
        SelectionPaymentMethodItem selectionPaymentMethodItem;
        CreditCard creditCard;
        CreditCard creditCard2;
        String str;
        String str2;
        QRJ qrj;
        String optionalStringField;
        QDN qdn2 = qdn;
        QDT qdt = qdn2.A1R;
        PaymentMethod paymentMethod2 = paymentMethod;
        Integer A0J2 = qdt.A0J(paymentMethod2);
        String str3 = null;
        if (paymentMethod != null) {
            selectionPaymentMethodItem = SQ4.A00(paymentMethod2, A0J2, false, qdn2.A1Q.A08());
        } else {
            selectionPaymentMethodItem = null;
        }
        SUj A092 = SUj.A09(selectionPaymentMethodItem);
        ShippingAddress A042 = A04(qdn2);
        ShippingAddress A032 = A03(qdn2);
        boolean z = paymentMethod2 instanceof CreditCard;
        if (z) {
            creditCard = (CreditCard) paymentMethod2;
        } else {
            creditCard = null;
        }
        if (creditCard == null || (qrj = creditCard.A01) == null || (optionalStringField = qrj.getOptionalStringField(0, "error_msg")) == null || !C51966G9m.A1X(optionalStringField)) {
            if (z) {
                creditCard2 = (CreditCard) paymentMethod2;
            } else {
                creditCard2 = null;
            }
            if (!(!qdt.A0O(creditCard2, true) || A042 == null || A032 == null || (str = A042.A06) == null || (str2 = A032.A06) == null || !str.equals(str2) || ((paymentMethod2 instanceof TokenizedCard) && ((TokenizedCard) paymentMethod2).A01.getOptionalEnumField(0, "token_status", C8934RGc.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) == C8934RGc.SUSPENDED))) {
                if (qdn2.A0Y) {
                    qdt.A0M(paymentMethod2);
                    return false;
                }
                STa.A04(qdn2, "user_click_credential_atomic", "edit_selected_credential_from_alert_dialog");
                if (paymentMethod != null) {
                    str3 = paymentMethod2.getTitle();
                }
                StringBuilder A1A2 = AnonymousClass7TE.A1A();
                String str4 = A042.A08;
                if (str4 != null && str4.length() > 0) {
                    A1A2.append(str4);
                    A1A2.append(", ");
                }
                String str5 = A042.A09;
                if (str5 != null && str5.length() > 0) {
                    A1A2.append(str5);
                    A1A2.append(", ");
                }
                String str6 = A042.A01;
                if (str6 != null && str6.length() > 0) {
                    A1A2.append(str6);
                    A1A2.append(", ");
                }
                String str7 = A042.A07;
                if (str7 != null && str7.length() > 0) {
                    A1A2.append(str7);
                    A1A2.append(" ");
                }
                if (str.length() > 0) {
                    A1A2.append(str);
                }
                String obj = A1A2.toString();
                C58696Iw5 iw5 = new C58696Iw5(27, paymentMethod2, A042, qdn2);
                ContextThemeWrapper contextThemeWrapper2 = contextThemeWrapper;
                C58218IoM ioM = new C58218IoM(3, bundle, fragment, qdn2, contextThemeWrapper2, A092);
                C73912Pln pln = new C73912Pln(qdn2, 45);
                SIG A0H2 = AnonymousClass2E0.A0H();
                String A0h2 = DbW.A0h(contextThemeWrapper2, str3, 2131961411);
                SVE A002 = SVE.A00(iw5, 25);
                SVE A003 = SVE.A00(ioM, 26);
                SVE A004 = SVE.A00(pln, 27);
                String str8 = null;
                String str9 = null;
                if (A0h2 != null) {
                    str9 = A0h2;
                }
                if (obj != null) {
                    str8 = obj;
                }
                SIG.A00(contextThemeWrapper2, new C11351SOk(A004, A003, A002, (Drawable) null, str8, (String) null, (String) null, str9, 0, 2131961409, 2131961410, 0, 2, 2131961412, 0, true), A0H2);
                return true;
            }
        }
        return false;
    }

    public static final boolean A0Y(QDN qdn) {
        Integer num;
        ECPPaymentRequest A022;
        CheckoutConfiguration checkoutConfiguration;
        QDH qdh = qdn.A1Q;
        boolean A0W2 = qdn.A0W();
        boolean A092 = qdh.A09();
        if (A0W2) {
            if (!A092) {
                num = AnonymousClass05K.A0C;
            } else {
                if (qdh.A09()) {
                    num = AnonymousClass05K.A01;
                }
                throw AnonymousClass7TE.A1B("OTC State is not known");
            }
        } else if (!A092) {
            num = AnonymousClass05K.A0Y;
        } else {
            if (qdh.A09()) {
                num = AnonymousClass05K.A0j;
            }
            throw AnonymousClass7TE.A1B("OTC State is not known");
        }
        if (num != AnonymousClass05K.A0j || !qdh.A08() || (A022 = A02(qdn)) == null || (checkoutConfiguration = A022.A01) == null || !AnonymousClass7TF.A1Y(checkoutConfiguration.A05, true)) {
            return false;
        }
        return true;
    }

    public static final boolean A0a(QDN qdn) {
        SUj sUj = qdn.A0Q;
        if (SUj.A0S(sUj) && (sUj.A02 instanceof C13216TQh)) {
            return false;
        }
        SUj sUj2 = qdn.A0N;
        if (SUj.A0S(sUj2) && (sUj2.A02 instanceof C13216TQh)) {
            return false;
        }
        SUj sUj3 = qdn.A0I;
        if (SUj.A0S(sUj3) && (sUj3.A02 instanceof C13216TQh)) {
            return false;
        }
        SUj sUj4 = qdn.A0O;
        if (!SUj.A0S(sUj4) || !(sUj4.A02 instanceof C13216TQh)) {
            return true;
        }
        return false;
    }

    public final List A0l() {
        List list = this.A0X;
        if (list != null) {
            return list;
        }
        0qQ.A0F("componentTypeList");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        if (r1 != false) goto L_0x0090;
     */
    /* JADX WARNING: Removed duplicated region for block: B:130:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ca A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0m() {
        /*
            r14 = this;
            java.util.List r6 = r14.A1c
            boolean r0 = r6 instanceof java.util.Collection
            r10 = 0
            r3 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r9 = 1
            if (r0 == 0) goto L_0x0045
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0045
        L_0x0013:
            r1 = 1
        L_0x0014:
            boolean r0 = r14.A0b
            java.lang.String r13 = "Required value was null."
            java.lang.String r8 = "FULL_PUX"
            java.lang.String r7 = "Failed to load components: "
            java.lang.String r5 = "pux_checkout"
            if (r0 != 0) goto L_0x0068
            if (r1 == 0) goto L_0x006b
            r14.A0b = r9
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r6.iterator()
        L_0x002d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x006d
            java.lang.Object r1 = r6.next()
            java.util.Map r0 = r14.A1Y
            X.SOw r0 = X.Pxh.A0T(r1, r0)
            if (r0 == 0) goto L_0x002d
            java.lang.Boolean r0 = r0.A00
            X.JTR.A1P(r0, r2, r1, r4)
            goto L_0x002d
        L_0x0045:
            java.util.Iterator r4 = r6.iterator()
        L_0x0049:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0013
            java.lang.Object r1 = r4.next()
            boolean r0 = A0j(r14, r1)
            if (r0 == 0) goto L_0x0049
            java.util.Map r0 = r14.A1Y
            X.SOw r0 = X.Pxh.A0T(r1, r0)
            if (r0 == 0) goto L_0x0066
            java.lang.Boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0066
            goto L_0x0049
        L_0x0066:
            r1 = 0
            goto L_0x0014
        L_0x0068:
            if (r1 == 0) goto L_0x006b
            goto L_0x0090
        L_0x006b:
            r3 = 0
            goto L_0x009f
        L_0x006d:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0115
            X.Sto r0 = X.C51965G9l.A0g()
            com.facebookpay.logging.LoggingContext r4 = r14.A1P
            java.util.LinkedHashMap r3 = X.C66584MXp.A0f(r14)
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "client_load_ecpcheckouttti_success"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 62
            X.1Ln r1 = X.C51965G9l.A0U(r1, r0)
            r0 = 27
            X.TY3.A00(r1, r4, r3, r5, r0)
        L_0x0090:
            java.util.List r1 = r14.A0A()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00f4
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00f4
        L_0x009e:
            r3 = 1
        L_0x009f:
            boolean r0 = X.C11431STx.A06()
            if (r0 == 0) goto L_0x00f2
            X.SP9 r0 = r14.A1M
            X.2Fj r0 = r0.A0A
            java.lang.Object r0 = r0.A02()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r9)
            if (r0 != 0) goto L_0x00c3
            X.2Fj r0 = r14.A0y
            java.lang.Object r0 = r0.A02()
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 != 0) goto L_0x00f2
            boolean r0 = r14.A0c
            if (r0 != 0) goto L_0x00f2
        L_0x00c3:
            r1 = 1
        L_0x00c4:
            if (r3 == 0) goto L_0x0186
            boolean r0 = r14.A0a
            if (r0 != 0) goto L_0x0186
            if (r1 != 0) goto L_0x0186
            r14.A0a = r9
            java.util.List r0 = r14.A0A()
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x00da:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0136
            java.lang.Object r1 = r3.next()
            java.util.Map r0 = r14.A1Y
            X.SOw r0 = X.Pxh.A0T(r1, r0)
            if (r0 == 0) goto L_0x00da
            java.lang.Boolean r0 = r0.A00
            X.JTR.A1P(r0, r2, r1, r6)
            goto L_0x00da
        L_0x00f2:
            r1 = 0
            goto L_0x00c4
        L_0x00f4:
            java.util.Iterator r3 = r1.iterator()
        L_0x00f8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x009e
            java.lang.Object r1 = r3.next()
            boolean r0 = A0j(r14, r1)
            if (r0 == 0) goto L_0x00f8
            java.util.Map r0 = r14.A1Y
            X.SOw r0 = X.Pxh.A0T(r1, r0)
            if (r0 == 0) goto L_0x006b
            java.lang.Boolean r0 = r0.A00
            if (r0 == 0) goto L_0x006b
            goto L_0x00f8
        L_0x0115:
            java.lang.StringBuilder r0 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r4, r7, r0)
            java.lang.RuntimeException r1 = X.AnonymousClass7TE.A15(r0)
            java.lang.Object r0 = A09(r14)
            if (r0 == 0) goto L_0x01ca
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            java.lang.String r0 = X.STa.A00(r0, r14, r9)
            boolean r0 = X.C51966G9m.A1a(r0, r8)
            X.STa.A07(r14, r1, r3, r0)
            goto L_0x0090
        L_0x0136:
            boolean r5 = r6.isEmpty()
            X.2Fj r4 = r14.A11
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.Pxh.A0U(r4)
            if (r0 == 0) goto L_0x0165
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x0165
            java.lang.Boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0165
            X.QDT r11 = r14.A1R
            X.2Fj r0 = r11.A0D
            X.SUj r0 = X.Pxe.A0W(r0)
            r3 = 0
            if (r0 == 0) goto L_0x0165
            java.lang.Object r1 = r0.A01
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0165
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0187
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0187
        L_0x0165:
            if (r5 != 0) goto L_0x0173
            java.lang.StringBuilder r0 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r6, r7, r0)
            java.lang.RuntimeException r10 = X.AnonymousClass7TE.A15(r0)
        L_0x0173:
            java.lang.Object r0 = r4.A02()
            if (r0 == 0) goto L_0x01c5
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            java.lang.String r0 = X.STa.A00(r0, r14, r9)
            boolean r0 = X.C51966G9m.A1a(r0, r8)
            X.STa.A07(r14, r10, r5, r0)
        L_0x0186:
            return
        L_0x0187:
            java.util.Iterator r12 = r1.iterator()
        L_0x018b:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0165
            java.lang.Object r0 = r12.next()
            X.SUj r0 = (X.SUj) r0
            java.lang.Object r2 = r0.A01
            boolean r0 = r2 instanceof com.facebookpay.paymentmethod.model.CreditCard
            r1 = 0
            if (r0 == 0) goto L_0x01c3
            com.facebookpay.paymentmethod.model.CreditCard r2 = (com.facebookpay.paymentmethod.model.CreditCard) r2
            if (r2 == 0) goto L_0x01a6
            X.RGd r1 = r2.A00()
        L_0x01a6:
            X.RGd r0 = X.C8935RGd.CREDIT_CARD
            if (r1 != r0) goto L_0x018b
            boolean r0 = r11.A0O(r2, r3)
            if (r0 == 0) goto L_0x018b
            com.instagram.common.session.UserSession r3 = X.C11431STx.A00()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321902767253329(0x810a9400022751, double:3.033455794349525E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            X.0qQ.A0A(r0)
            goto L_0x0165
        L_0x01c3:
            r2 = r10
            goto L_0x01a6
        L_0x01c5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x01ca:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDN.A0m():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0n() {
        /*
            r11 = this;
            X.QDT r3 = r11.A1R
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = A04(r11)
            if (r0 == 0) goto L_0x00d5
            X.StS r4 = X.C11091S9q.A00(r0)
        L_0x000c:
            boolean r0 = X.QDT.A0E(r3)
            if (r0 == 0) goto L_0x00c5
            X.2gB r0 = r3.A08
            X.SUj r0 = X.Pxe.A0W(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r0.A01
            X.RuU r0 = (X.C10575RuU) r0
            if (r0 == 0) goto L_0x0025
            java.lang.Object r2 = r0.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r2 = (com.facebookpay.paymentmethod.model.PaymentMethod) r2
        L_0x0025:
            boolean r0 = r2 instanceof com.facebookpay.paymentmethod.model.CreditCard
            if (r0 == 0) goto L_0x00c5
            if (r2 == 0) goto L_0x00c5
            java.lang.Boolean r0 = r3.A0I()
            r6 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x00c8
            java.lang.Boolean r0 = r3.A0H()
            if (r0 == 0) goto L_0x00c8
            java.lang.Boolean r0 = r3.A0H()
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x00d8
            android.util.SparseArray r1 = r3.A00
            r0 = 2
            java.lang.Object r1 = r1.get(r0)
            boolean r0 = r1 instanceof java.lang.String
            r10 = 0
            if (r0 == 0) goto L_0x0083
            java.lang.String r1 = (java.lang.String) r1
            r5 = 0
            if (r1 == 0) goto L_0x0083
            java.lang.String r4 = X.DbV.A12(r1)
            if (r4 == 0) goto L_0x0083
            boolean r0 = X.00l.A0W(r4)
            if (r0 != 0) goto L_0x0083
            char[] r1 = new char[r6]
            r0 = 32
            r1[r5] = r0
            java.util.List r1 = X.00l.A0Q(r4, r1, r5)
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x007a
            r1.get(r5)
        L_0x007a:
            int r0 = r1.size()
            if (r0 <= r6) goto L_0x0083
            r1.get(r6)
        L_0x0083:
            android.util.SparseArray r1 = r3.A00
            r0 = 5
            java.lang.String r5 = X.Pxj.A0p(r1, r0)
            r0 = 6
            java.lang.String r6 = X.Pxj.A0p(r1, r0)
            r0 = 7
            java.lang.String r7 = X.Pxj.A0p(r1, r0)
            r0 = 8
            java.lang.String r8 = X.Pxj.A0p(r1, r0)
            r0 = 10
            java.lang.Object r1 = r1.get(r0)
            boolean r0 = r1 instanceof com.facebook.common.locale.Country
            if (r0 == 0) goto L_0x00c6
            com.facebook.common.locale.LocaleMember r1 = (com.facebook.common.locale.LocaleMember) r1
            if (r1 == 0) goto L_0x00c6
            java.util.Locale r0 = r1.A00
            java.lang.String r9 = r0.getISO3Country()
        L_0x00ae:
            android.util.SparseArray r1 = r3.A00
            r0 = 9
            java.lang.Object r1 = r1.get(r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x00bd
            r10 = r1
            java.lang.String r10 = (java.lang.String) r10
        L_0x00bd:
            X.StS r4 = new X.StS
            r4.<init>(r5, r6, r7, r8, r9, r10)
        L_0x00c2:
            r3.A0L(r4, r2)
        L_0x00c5:
            return
        L_0x00c6:
            r9 = r10
            goto L_0x00ae
        L_0x00c8:
            java.lang.Boolean r0 = r3.A0I()
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x00c5
            if (r4 == 0) goto L_0x00c5
            goto L_0x00c2
        L_0x00d5:
            r4 = 0
            goto L_0x000c
        L_0x00d8:
            X.QDT.A08(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDN.A0n():void");
    }

    public final void A0r(ECPHandler eCPHandler) {
        if (eCPHandler != null) {
            ECPHandler eCPHandler2 = this.A05;
            if (eCPHandler2 == null || eCPHandler2.equals(eCPHandler)) {
                if (!0qQ.A0K(this.A05, eCPHandler)) {
                    SP9 sp9 = this.A1M;
                    AnonymousClass2Fj FHY = eCPHandler.FHY();
                    0qQ.A0B(FHY, 0);
                    sp9.A08.A0E(FHY, sp9.A0B);
                }
                this.A05 = eCPHandler;
                return;
            }
            throw AnonymousClass7TE.A0z("Cannot override previous ECP handler with a new handler for the same checkout ViewModel instance");
        }
        throw AnonymousClass7TE.A0z("Attempting to set null value for EcpHandler. This will result in lossy event-handling behavior");
    }

    public final void A0s(boolean z) {
        RH6 rh6;
        Object obj;
        RH6 rh62;
        BaseCheckoutItem baseCheckoutItem;
        RH6 rh63;
        RH6 rh64;
        RH6 rh65;
        BaseCheckoutItem baseCheckoutItem2;
        BaseCheckoutItem baseCheckoutItem3;
        BaseCheckoutItem baseCheckoutItem4;
        Collection values = this.A1X.values();
        0qQ.A07(values);
        Iterator it = values.iterator();
        while (true) {
            rh6 = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            SUj sUj = (SUj) obj;
            if (sUj == null || (baseCheckoutItem4 = (BaseCheckoutItem) sUj.A01) == null) {
                rh63 = null;
            } else {
                rh63 = baseCheckoutItem4.BJZ();
            }
            if (rh63 == RH6.A0Y && SUj.A0P(this.A1R.A08)) {
                break;
            }
            if (sUj == null || (baseCheckoutItem3 = (BaseCheckoutItem) sUj.A01) == null) {
                rh64 = null;
            } else {
                rh64 = baseCheckoutItem3.BJZ();
            }
            if (rh64 == RH6.A0a && SUj.A0P(this.A1U.A06)) {
                break;
            }
            if (sUj == null || (baseCheckoutItem2 = (BaseCheckoutItem) sUj.A01) == null) {
                rh65 = null;
            } else {
                rh65 = baseCheckoutItem2.BJZ();
            }
            if (rh65 == RH6.A0V && SUj.A0P(this.A1K.A0A)) {
                break;
            }
        }
        SUj sUj2 = (SUj) obj;
        if (!(sUj2 == null || (baseCheckoutItem = (BaseCheckoutItem) sUj2.A01) == null)) {
            rh6 = baseCheckoutItem.BJZ();
        }
        if (rh6 != null) {
            if (z && (rh62 = this.A02) != null) {
                STa.A01(rh62, rh6, this, (Boolean) null);
            }
            A0G(rh6, false);
            return;
        }
        RH6 rh66 = this.A02;
        if (rh66 != null) {
            if (rh66 == RH6.A0Y) {
                A0n();
            }
            this.A02 = null;
            A0B();
        }
    }

    public final void A0t(boolean z, boolean z2) {
        Object obj = this.A0M.A01;
        if (obj != null) {
            PayButtonItem payButtonItem = (PayButtonItem) obj;
            if (payButtonItem.A03 || z2) {
                SUj A092 = SUj.A09(new PayButtonItem(payButtonItem.A00, payButtonItem.A01, payButtonItem.A02, z));
                this.A0M = A092;
                A0N(this, C298525tb.PAY_BUTTON, A092);
                if (!z) {
                    A0U(this, false);
                }
                SUj.A0L(this.A1S.A03, (Object) null);
                return;
            }
            throw AnonymousClass7TE.A0z("Pay button was in an incorrect processing state");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final boolean A0v() {
        Integer num;
        ECPPaymentRequest A022;
        CheckoutConfiguration checkoutConfiguration;
        QDH qdh = this.A1Q;
        boolean A0W2 = A0W();
        boolean A092 = qdh.A09();
        if (A0W2) {
            if (!A092) {
                num = AnonymousClass05K.A0C;
            } else {
                if (qdh.A09()) {
                    num = AnonymousClass05K.A01;
                }
                throw AnonymousClass7TE.A1B("OTC State is not known");
            }
        } else if (!A092) {
            num = AnonymousClass05K.A0Y;
        } else {
            if (qdh.A09()) {
                num = AnonymousClass05K.A0j;
            }
            throw AnonymousClass7TE.A1B("OTC State is not known");
        }
        if (num != AnonymousClass05K.A01 || !qdh.A08() || (A022 = A02(this)) == null || (checkoutConfiguration = A022.A01) == null || !AnonymousClass7TF.A1Y(checkoutConfiguration.A05, true)) {
            return false;
        }
        return true;
    }

    public final boolean A0w() {
        CreditCard creditCard;
        QRJ qrj;
        String optionalStringField;
        C10575RuU ruU;
        if (this.A0Y) {
            QDT qdt = this.A1R;
            SUj A0W2 = Pxe.A0W(qdt.A08);
            PaymentMethod paymentMethod = null;
            if (!(A0W2 == null || (ruU = (C10575RuU) A0W2.A01) == null)) {
                paymentMethod = (PaymentMethod) ruU.A01;
            }
            if (!(paymentMethod instanceof CreditCard) || (creditCard = (CreditCard) paymentMethod) == null || !qdt.A0O(creditCard, false) || (((creditCard instanceof TokenizedCard) && ((TokenizedCard) creditCard).A01.getOptionalEnumField(0, "token_status", C8934RGc.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) == C8934RGc.SUSPENDED) || ((qrj = creditCard.A01) != null && (optionalStringField = qrj.getOptionalStringField(0, "error_msg")) != null && C51966G9m.A1X(optionalStringField)))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final AnonymousClass2gB A00(QDN qdn, ImmutableList immutableList, List list) {
        List A0l2 = qdn.A0l();
        C298525tb r4 = C298525tb.CONTACT_INFORMATION;
        if (!A0l2.contains(r4)) {
            return null;
        }
        C11360SOw A0T2 = Pxh.A0T(r4, qdn.A1Y);
        if (A0T2 != null) {
            C13351TVy.A01(A0T2, qdn, 4);
        }
        AnonymousClass2gB r2 = qdn.A0q;
        QDU qdu = qdn.A1K;
        AnonymousClass2gB r3 = qdu.A0A;
        r2.A0E(r3, qdn.A1a);
        r2.A0E(qdu.A0B, qdn.A1Z);
        if (list != null) {
            0qQ.A0C(r3, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<out kotlin.Any>>");
            list.add(r3);
        }
        if (immutableList != null && immutableList.contains(r4)) {
            qdn.A1M.A02(r3);
        }
        0qQ.A0C(r3, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<out kotlin.Any>>");
        return r3;
    }

    public static final ShippingAddress A03(QDN qdn) {
        if (!SQ0.A03(C298525tb.PAYMENT_METHOD, qdn.A0l())) {
            return null;
        }
        Object A092 = A09(qdn);
        if (A092 != null) {
            CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A092).A01;
            if (checkoutConfiguration == null || !Pxi.A1T(checkoutConfiguration)) {
                return null;
            }
            return qdn.A1R.A0F();
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.SUj A05() {
        /*
            r12 = this;
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.lang.Integer r9 = X.AnonymousClass05K.A0C
            X.QDR r2 = r12.A1N
            java.lang.Integer r1 = r2.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r10 = 0
            if (r1 != r0) goto L_0x0067
            java.lang.Integer r9 = X.AnonymousClass05K.A0j
            X.2gB r0 = r2.A03
            X.SUj r0 = X.Pxe.A0W(r0)
            if (r0 == 0) goto L_0x0067
            java.lang.Object r0 = r0.A01
            X.RuU r0 = (X.C10575RuU) r0
            if (r0 == 0) goto L_0x0067
            java.lang.Object r0 = r0.A01
            com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent r0 = (com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent) r0
            if (r0 == 0) goto L_0x0067
            java.lang.String r11 = r0.A03()
        L_0x0029:
            r0 = 2131961224(0x7f132588, float:1.9559139E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            X.RH6 r7 = X.RH6.A0p
            com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem r6 = new com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem
            r6.<init>(r7, r8, r9, r10, r11)
            X.SUj r0 = X.SUj.A09(r6)
            X.0qQ.A0A(r0)
            r5.add(r0)
            java.util.List r1 = r12.A0l()
            X.5tb r0 = X.C298525tb.ITEM_LIST
            boolean r0 = r1.contains(r0)
            java.lang.String r2 = "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>"
            if (r0 == 0) goto L_0x0069
            java.util.Map r0 = r12.A0l
            java.util.Iterator r1 = X.AnonymousClass7TF.A0u(r0)
        L_0x0056:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0069
            java.lang.Object r0 = X.C51971G9r.A0p(r1)
            X.0qQ.A0C(r0, r2)
            r5.add(r0)
            goto L_0x0056
        L_0x0067:
            r11 = r10
            goto L_0x0029
        L_0x0069:
            X.SUj r1 = r12.A0S
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = A02(r12)
            if (r0 == 0) goto L_0x0077
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x0077
            java.lang.Integer r10 = r0.A0D
        L_0x0077:
            X.SUj r0 = X.C11294SKc.A00(r1, r10)
            X.0qQ.A0C(r0, r2)
            r5.add(r0)
            X.RH6 r4 = X.RH6.A0X
            X.SUj r3 = r12.A0g
            X.0qQ.A0C(r3, r2)
            X.RH6 r2 = r12.A02
            boolean r1 = X.AnonymousClass7TF.A1W(r2, r4)
            X.S2P r0 = r12.A04
            X.Ry2 r0 = r0.A00(r4, r2)
            X.SUj r0 = X.SUj.A05(r4, r0, r3, r5, r1)
            r12.A0f = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDN.A05():X.SUj");
    }

    public static final SUj A07(QDN qdn) {
        boolean z;
        CheckoutConfiguration checkoutConfiguration;
        ECPPaymentRequest A022 = A02(qdn);
        if (!(A022 == null || (checkoutConfiguration = A022.A01) == null || !DbX.A1a(checkoutConfiguration.A05))) {
            QDH qdh = qdn.A1Q;
            if ((qdh.A02 || qdh.A04) && !qdh.A09()) {
                z = qdn.A0j;
                if (z == null) {
                    return SUj.A02();
                }
                return SUj.A09(z);
            }
        }
        z = false;
        return SUj.A09(z);
    }

    private final List A0A() {
        C298525tb r0;
        CheckoutConfiguration checkoutConfiguration;
        ECPPaymentRequest A022 = A02(this);
        if (A022 == null || (checkoutConfiguration = A022.A01) == null || checkoutConfiguration.A0D == null) {
            r0 = C298525tb.SHIPPING_OPTIONS;
        } else {
            r0 = C298525tb.FULFILLMENT_OPTIONS;
        }
        return 0sr.A1P(new C298525tb[]{r0, C298525tb.TERMS, C298525tb.PAYMENT_RECEIVER, C298525tb.PRICE_TABLE, C298525tb.ITEM_LIST, C298525tb.PROMO_CODE, C298525tb.ORDER_SUMMARY});
    }

    public static void A0C(SJ1 sj1) {
        AnonymousClass2E0.A01().A0D.A09(sj1);
        AnonymousClass2E0.A01().A0F.A03(sj1);
        AnonymousClass2E0.A01().A01.A09(sj1);
        AnonymousClass2E0.A01().A0G.A01(sj1);
        AnonymousClass2E0.A01().A0E.A02(sj1);
    }

    public static final void A0E(RH6 rh6, QDN qdn) {
        C298525tb r1;
        SUj sUj;
        switch (rh6.ordinal()) {
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                r1 = C298525tb.PAYMENT_METHOD;
                sUj = qdn.A0D;
                break;
            case 13:
                r1 = C298525tb.SHIPPING_ADDRESS;
                sUj = qdn.A0F;
                break;
            case 14:
                r1 = C298525tb.CONTACT_INFORMATION;
                sUj = qdn.A0A;
                break;
            case 15:
                r1 = C298525tb.FULFILLMENT_OPTIONS;
                sUj = qdn.A0B;
                break;
            case 16:
                r1 = C298525tb.ORDER_SUMMARY;
                sUj = qdn.A0f;
                break;
            case 17:
                r1 = C298525tb.PICKUP_CONTACT_INFO;
                sUj = qdn.A0E;
                break;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                r1 = C298525tb.INCENTIVES;
                sUj = qdn.A0C;
                break;
            default:
                throw C51973G9u.A0g(rh6, "{ECPViewModel} ItemType is not found for identifier => ", AnonymousClass7TE.A1A());
        }
        A0N(qdn, r1, sUj);
    }

    public static final void A0H(ECPPaymentResponseParams eCPPaymentResponseParams, QDN qdn, SUj sUj, 0sP r8) {
        ECPHandler eCPHandler;
        SUj A0B2;
        if (SUj.A0V(sUj)) {
            eCPHandler = qdn.A05;
            if (eCPHandler != null) {
                A0B2 = SUj.A09(eCPPaymentResponseParams);
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else {
            if (SUj.A0S(sUj)) {
                Throwable th = sUj.A02;
                if (th instanceof C13221TQm) {
                    0qQ.A0C(th, "null cannot be cast to non-null type com.fbpay.util.exceptions.ECPErrorDialogException");
                    SR4.A01(qdn.A0t, ((C13221TQm) th).A00);
                } else {
                    A0P(qdn, th);
                }
                eCPHandler = qdn.A05;
                if (eCPHandler != null) {
                    A0B2 = SUj.A0B(th);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            r8.invoke(sUj);
        }
        eCPHandler.CIH(A0B2);
        STa.A02(eCPPaymentResponseParams, qdn, sUj, "payment_authorization");
        r8.invoke(sUj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r5 != null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r5.contains(X.C8891REi.REQUEST_PAYER_EMAIL) == true) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        if (r5 == null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r5.contains(X.C8891REi.REQUEST_PAYER_PHONE) == true) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        r6.A08 = r3;
        r6.A07 = r2;
        r6.A09 = r0;
        r1 = r6.A0B;
        r0 = X.Pxe.A0W(r6.A0D);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r0 == null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        r0 = (X.S60) r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        X.SUj.A0K(r1, X.QDU.A01(r0, r6));
        r3 = r7.A1T;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        if (r5 == null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005b, code lost:
        if (r5.contains(X.C8891REi.REQUEST_PICKUP_NAME) == true) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
        if (r5 == null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
        if (r5.contains(X.C8891REi.REQUEST_PICKUP_EMAIL) == true) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006a, code lost:
        if (r5 == null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        if (r5.contains(X.C8891REi.REQUEST_PICKUP_PHONE) != true) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0074, code lost:
        r3.A03 = r2;
        r3.A02 = r1;
        r3.A04 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007b, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007d, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r5.contains(X.C8891REi.REQUEST_PAYER_NAME) != true) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0L(X.QDN r7) {
        /*
            java.lang.Object r0 = A09(r7)
            if (r0 == 0) goto L_0x0081
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x007f
            java.util.Set<X.REi> r5 = r0.A0I
        L_0x000e:
            X.QDU r6 = r7.A1K
            r4 = 1
            if (r5 == 0) goto L_0x001c
            X.REi r0 = X.C8891REi.REQUEST_PAYER_NAME
            boolean r0 = r5.contains(r0)
            r3 = 1
            if (r0 == r4) goto L_0x001f
        L_0x001c:
            r3 = 0
            if (r5 == 0) goto L_0x0028
        L_0x001f:
            X.REi r0 = X.C8891REi.REQUEST_PAYER_EMAIL
            boolean r0 = r5.contains(r0)
            r2 = 1
            if (r0 == r4) goto L_0x002b
        L_0x0028:
            r2 = 0
            if (r5 == 0) goto L_0x0034
        L_0x002b:
            X.REi r0 = X.C8891REi.REQUEST_PAYER_PHONE
            boolean r1 = r5.contains(r0)
            r0 = 1
            if (r1 == r4) goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r6.A08 = r3
            r6.A07 = r2
            r6.A09 = r0
            X.2gB r1 = r6.A0B
            X.2Fj r0 = r6.A0D
            X.SUj r0 = X.Pxe.A0W(r0)
            if (r0 == 0) goto L_0x007d
            java.lang.Object r0 = r0.A01
            X.S60 r0 = (X.S60) r0
        L_0x0049:
            java.util.List r0 = X.QDU.A01(r0, r6)
            X.SUj.A0K(r1, r0)
            X.QDQ r3 = r7.A1T
            if (r5 == 0) goto L_0x005d
            X.REi r0 = X.C8891REi.REQUEST_PICKUP_NAME
            boolean r0 = r5.contains(r0)
            r2 = 1
            if (r0 == r4) goto L_0x0060
        L_0x005d:
            r2 = 0
            if (r5 == 0) goto L_0x0069
        L_0x0060:
            X.REi r0 = X.C8891REi.REQUEST_PICKUP_EMAIL
            boolean r0 = r5.contains(r0)
            r1 = 1
            if (r0 == r4) goto L_0x006c
        L_0x0069:
            r1 = 0
            if (r5 == 0) goto L_0x007b
        L_0x006c:
            X.REi r0 = X.C8891REi.REQUEST_PICKUP_PHONE
            boolean r0 = r5.contains(r0)
            if (r0 != r4) goto L_0x007b
        L_0x0074:
            r3.A03 = r2
            r3.A02 = r1
            r3.A04 = r4
            return
        L_0x007b:
            r4 = 0
            goto L_0x0074
        L_0x007d:
            r0 = 0
            goto L_0x0049
        L_0x007f:
            r5 = 0
            goto L_0x000e
        L_0x0081:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDN.A0L(X.QDN):void");
    }

    public static final void A0N(QDN qdn, C298525tb r4, SUj sUj) {
        LinkedHashMap linkedHashMap;
        String str;
        int ordinal = r4.ordinal();
        if (ordinal != 12) {
            if (ordinal != 21) {
                if (ordinal != 33) {
                    linkedHashMap = qdn.A1X;
                    str = r4.name();
                    if (S9h.A01(sUj, (SUj) linkedHashMap.get(str))) {
                        return;
                    }
                } else if (!S9h.A01(sUj, qdn.A0i)) {
                    qdn.A0i = sUj;
                } else {
                    return;
                }
            } else if (!S9h.A01(sUj, qdn.A0h)) {
                qdn.A0h = sUj;
            } else {
                return;
            }
            A0Q(qdn, qdn.A1X, AnonymousClass7TE.A1I(qdn.A1W));
        }
        linkedHashMap = qdn.A1X;
        str = "INCENTIVES";
        linkedHashMap.put(str, sUj);
        A0Q(qdn, qdn.A1X, AnonymousClass7TE.A1I(qdn.A1W));
    }

    public static void A0Q(QDN qdn, AbstractMap abstractMap, Collection collection) {
        Collection values = abstractMap.values();
        0qQ.A07(values);
        qdn.A0q.A0B(00k.A0S(00k.A0X(00k.A0a(values)), collection));
        qdn.A0w.A0B(qdn.A0M);
        qdn.A0z.A0B(qdn.A0R);
    }

    public static final void A0T(QDN qdn, boolean z) {
        Map map;
        C11360SOw A0T2;
        TransactionInfo A012;
        ArrayList<PriceInfo> arrayList;
        List A0l2 = qdn.A0l();
        C298525tb r2 = C298525tb.ITEM_LIST;
        if (A0l2.contains(r2)) {
            ECPPaymentRequest A022 = A02(qdn);
            if (A022 == null || (A012 = SUj.A01(qdn)) == null || (arrayList = A012.A07) == null || (map = C11294SKc.A02(A022, arrayList)) == null) {
                map = 0Yt.A0E();
            }
            qdn.A0l = map;
            if (!map.isEmpty()) {
                C11360SOw A0T3 = Pxh.A0T(r2, qdn.A1Y);
                if (A0T3 != null) {
                    A0T3.A03(TY1.A00(qdn, 7));
                }
            } else if (!z && (A0T2 = Pxh.A0T(r2, qdn.A1Y)) != null) {
                A0T2.A01(new C73912Pln(qdn, 44));
            }
            qdn.A0m();
        }
    }

    private final boolean A0V() {
        C21267XRm xRm;
        PaymentMethod paymentMethod;
        Object A092 = A09(this);
        if (A092 != null) {
            String A002 = STa.A00((ECPPaymentRequest) A092, this, false);
            if (!0qQ.A0K(A002, "PARTIAL_PUX_WITHOUT_CREDENTIAL")) {
                if (!0qQ.A0K(A002, "PARTIAL_PUX_WITH_CREDENTIAL")) {
                    return false;
                }
                PuxPaymentMethodItem puxPaymentMethodItem = (PuxPaymentMethodItem) this.A0N.A01;
                if (puxPaymentMethodItem == null || (paymentMethod = puxPaymentMethodItem.A01) == null) {
                    xRm = null;
                } else {
                    xRm = paymentMethod.Asn();
                }
                if (xRm != C21267XRm.A07) {
                    return true;
                }
                return false;
            }
            return true;
        }
        throw AnonymousClass7TE.A0y();
    }

    private final boolean A0W() {
        Set<REn> set;
        Set<C8891REi> set2;
        ECPRepositoryImpl A012 = C11353SOm.A01();
        AnonymousClass2Fj r4 = this.A11;
        Object A022 = r4.A02();
        if (A022 != null) {
            CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A022).A01;
            if (checkoutConfiguration != null) {
                set = checkoutConfiguration.A0H;
            } else {
                set = 0sl.A00;
            }
            Object A023 = r4.A02();
            if (A023 != null) {
                CheckoutConfiguration checkoutConfiguration2 = ((ECPPaymentRequest) A023).A01;
                if (checkoutConfiguration2 != null) {
                    set2 = checkoutConfiguration2.A0I;
                } else {
                    set2 = 0sl.A00;
                }
                Object A024 = r4.A02();
                if (A024 != null) {
                    return A012.A07(((ECPPaymentRequest) A024).A08, set, set2);
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public static final boolean A0Z(QDN qdn) {
        ECPPaymentRequest A022;
        CheckoutConfiguration checkoutConfiguration;
        String str;
        if (!A0c(qdn) || (A022 = A02(qdn)) == null || (checkoutConfiguration = A022.A01) == null || (str = checkoutConfiguration.A0F) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public static final boolean A0b(QDN qdn) {
        CheckoutConfiguration checkoutConfiguration;
        ECPPaymentRequest A022 = A02(qdn);
        if (A022 == null || (checkoutConfiguration = A022.A01) == null || !checkoutConfiguration.A0H.contains(REn.UX_INCENTIVES)) {
            return false;
        }
        return true;
    }

    public static final boolean A0c(QDN qdn) {
        Object A092 = A09(qdn);
        if (A092 != null) {
            CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A092).A01;
            if (checkoutConfiguration != null) {
                return checkoutConfiguration.A0I.contains(C8891REi.REQUEST_PAYER_EMAIL);
            }
            return false;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final boolean A0d(QDN qdn) {
        Object A092 = A09(qdn);
        if (A092 != null) {
            CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A092).A01;
            if (checkoutConfiguration != null) {
                return checkoutConfiguration.A0I.contains(C8891REi.REQUEST_PAYER_NAME);
            }
            return false;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final boolean A0e(QDN qdn) {
        Object A092 = A09(qdn);
        if (A092 != null) {
            CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A092).A01;
            if (checkoutConfiguration != null) {
                return checkoutConfiguration.A0I.contains(C8891REi.REQUEST_PAYER_PHONE);
            }
            return false;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final boolean A0f(QDN qdn) {
        Object A092 = A09(qdn);
        if (A092 != null) {
            CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A092).A01;
            if (checkoutConfiguration != null) {
                return checkoutConfiguration.A0I.contains(C8891REi.REQUEST_PICKUP_EMAIL);
            }
            return false;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final boolean A0g(QDN qdn) {
        Object A092 = A09(qdn);
        if (A092 != null) {
            CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A092).A01;
            if (checkoutConfiguration != null) {
                return checkoutConfiguration.A0I.contains(C8891REi.REQUEST_PICKUP_NAME);
            }
            return false;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final boolean A0h(QDN qdn) {
        Object A092 = A09(qdn);
        if (A092 != null) {
            CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A092).A01;
            if (checkoutConfiguration != null) {
                return checkoutConfiguration.A0I.contains(C8891REi.REQUEST_PICKUP_PHONE);
            }
            return false;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final boolean A0i(QDN qdn) {
        if (!SQ0.A03(C298525tb.SHIPPING_ADDRESS, qdn.A0l())) {
            return false;
        }
        Object A092 = A09(qdn);
        if (A092 != null) {
            CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A092).A01;
            if (checkoutConfiguration == null || !checkoutConfiguration.A0H.contains(REn.UX_SHIPPING_ADDRESS)) {
                return false;
            }
            return true;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static boolean A0j(QDN qdn, Object obj) {
        return qdn.A0l().contains(obj);
    }

    public final void A0q(RH6 rh6, boolean z) {
        STa.A01(rh6, (RH6) null, this, Boolean.valueOf(z));
        if (z) {
            A0G(rh6, true);
            return;
        }
        if (this.A02 == RH6.A0Y) {
            A0n();
        }
        this.A02 = null;
        A0B();
    }

    public final boolean A0u() {
        ECPPaymentRequest A022 = A02(this);
        if (A022 == null || A022.A02 == null) {
            return false;
        }
        return true;
    }

    public QDN(QDU qdu, C7434QCz qCz, QDR qdr, QDL qdl, LoggingContext loggingContext, QDH qdh, QDT qdt, QDJ qdj, QDQ qdq, QDS qds, QD3 qd3) {
        QDR qdr2 = qdr;
        QDJ qdj2 = qdj;
        QDS qds2 = qds;
        C51974G9v.A1M(qdj2, qds2, qdr2);
        QDU qdu2 = qdu;
        0qQ.A0B(qdu2, 5);
        QDQ qdq2 = qdq;
        QD3 qd32 = qd3;
        AnonymousClass7TF.A1E(qdq2, 6, qd32);
        QDL qdl2 = qdl;
        QDH qdh2 = qdh;
        QDT qdt2 = qdt;
        C51973G9u.A0u(8, qdt2, qdl2, qdh2);
        C7434QCz qCz2 = qCz;
        0qQ.A0B(qCz2, 11);
        this.A1P = loggingContext;
        this.A1S = qdj2;
        this.A1U = qds2;
        this.A1N = qdr2;
        this.A1K = qdu2;
        this.A1T = qdq2;
        this.A1V = qd32;
        this.A1R = qdt2;
        this.A1O = qdl2;
        this.A1Q = qdh2;
        this.A1L = qCz2;
        SP9 sp9 = new SP9();
        this.A1M = sp9;
        this.A0o = sp9.A08;
        AnonymousClass2Fj A0K2 = JTO.A0K();
        this.A0u = A0K2;
        this.A0p = A0K2;
        this.A0q = Pxh.A0M();
        this.A0w = JTO.A0K();
        this.A0z = JTO.A0K();
        this.A0t = JTO.A0K();
        this.A10 = JTO.A0K();
        this.A0x = JTO.A0K();
        AnonymousClass2Fj A0K3 = JTO.A0K();
        this.A0s = A0K3;
        this.A0n = A0K3;
        this.A0y = JTO.A0K();
        0eP A002 = C11360SOw.A00(C298525tb.ITEM_LIST, false);
        0eP A003 = C11360SOw.A00(C298525tb.ONE_TIME_CHECKOUT_OPTION, false);
        0eP A004 = C11360SOw.A00(C298525tb.PRICE_TABLE, false);
        0eP A005 = C11360SOw.A00(C298525tb.PAYMENT_RECEIVER, false);
        0eP A006 = C11360SOw.A00(C298525tb.ORDER_SUMMARY, false);
        0eP A007 = C11360SOw.A00(C298525tb.TERMS, false);
        0eP A008 = C11360SOw.A00(C298525tb.SHIPPING_OPTIONS, false);
        0eP A009 = C11360SOw.A00(C298525tb.FULFILLMENT_OPTIONS, false);
        0eP A0010 = C11360SOw.A00(C298525tb.PROMO_CODE, false);
        C298525tb r4 = C298525tb.SHIPPING_ADDRESS;
        0eP A0011 = C11360SOw.A00(r4, true);
        C298525tb r3 = C298525tb.PAYMENT_METHOD;
        0eP A0012 = C11360SOw.A00(r3, true);
        C298525tb r2 = C298525tb.CONTACT_INFORMATION;
        this.A1Y = 0Yt.A06(new 0eP[]{A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, C11360SOw.A00(r2, true), C11360SOw.A00(C298525tb.EMAIL_OPTIN, false)});
        this.A1c = 0sr.A1P(new C298525tb[]{r4, r3, r2});
        this.A01 = SUj.A00((Object) null);
        this.A0v = JTO.A0K();
        this.A0H = SUj.A08((Object) null);
        this.A0P = SUj.A08((Object) null);
        CurrencyAmount currencyAmount = new CurrencyAmount("", "");
        CurrencyAmount currencyAmount2 = new CurrencyAmount("", "");
        RH6 rh6 = RH6.A0g;
        List list = 0sn.A00;
        Integer num = AnonymousClass05K.A00;
        this.A0g = SUj.A08(new PuxOrderSummaryItem(currencyAmount, currencyAmount2, rh6, new ItemDetails(num, (String) null), (String) null, (String) null, list, 0, false, false, false));
        this.A0N = SUj.A08(new PuxPaymentMethodItem(RH6.A0h, (PaymentMethod) null, (Integer) null, false, true));
        RH6 rh62 = RH6.A0c;
        this.A0I = SUj.A08(new PuxContactItem(rh62, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, false));
        this.A0Q = SUj.A08(new PuxShippingAddressItem(RH6.A0l, (ShippingAddress) null, (String) null, (String) null, (String) null, false));
        this.A0J = SUj.A08(new PuxFulfillmentOptionItem(RH6.A0e, (FulfillmentOptionComponent) null, num, (Integer) null, false, false));
        this.A0O = SUj.A08(new PuxContactItem(rh62, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, false));
        this.A0M = SUj.A08(new PayButtonItem(new CurrencyAmount("", ""), RH6.A0T, (String) null, false));
        this.A0R = SUj.A08(new PuxTermsConditionItem((C7X) null, (C7X) null, (C7X) null, (C7X) null, RH6.A0m, (String) null, (String) null, (List) null, (List) null, false));
        this.A0l = 0Yt.A0E();
        this.A0K = SUj.A08(new IncentiveItem(RH6.A0f, list, 0, true));
        this.A0L = SUj.A08(new IncentiveSummaryItem(RH6.A0J, list, 0));
        RH6 rh63 = RH6.A0a;
        SUj sUj = this.A0Q;
        0qQ.A0C(sUj, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        List list2 = list;
        this.A0F = SUj.A08(new PuxAccordionItem(rh63, (C10781Ry2) null, sUj, list2, false));
        RH6 rh64 = RH6.A0Y;
        SUj sUj2 = this.A0N;
        0qQ.A0C(sUj2, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        this.A0D = SUj.A08(new PuxAccordionItem(rh64, (C10781Ry2) null, sUj2, list2, false));
        RH6 rh65 = RH6.A0V;
        SUj sUj3 = this.A0I;
        0qQ.A0C(sUj3, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        this.A0A = SUj.A08(new PuxAccordionItem(rh65, (C10781Ry2) null, sUj3, list2, false));
        RH6 rh66 = RH6.A0W;
        SUj sUj4 = this.A0J;
        0qQ.A0C(sUj4, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        this.A0B = SUj.A08(new PuxAccordionItem(rh66, (C10781Ry2) null, sUj4, list2, false));
        RH6 rh67 = RH6.A0Z;
        SUj sUj5 = this.A0O;
        0qQ.A0C(sUj5, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        this.A0E = SUj.A08(new PuxAccordionItem(rh67, (C10781Ry2) null, sUj5, list2, false));
        RH6 rh68 = RH6.A0X;
        SUj sUj6 = this.A0g;
        0qQ.A0C(sUj6, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        this.A0f = SUj.A08(new PuxAccordionItem(rh68, (C10781Ry2) null, sUj6, list2, false));
        this.A0G = SUj.A08(new AnonCheckoutPuxLink((C7X) null, RH6.A09, false));
        this.A07 = SUj.A08(new InlineBackButtonItem(RH6.A0L, (String) null));
        this.A09 = SUj.A08(new EmailOptInItem((C7X) null, RH6.A0H, (String) null, false, false));
        this.A1W = SUj.A09(new InvisibleHeaderItem(RH6.A0M));
        this.A04 = new S2P(list);
        this.A0S = SUj.A08((Object) null);
        this.A1X = AnonymousClass7TE.A1H();
        this.A1H = C11649Sdr.A00(this, 49);
        this.A1G = C11649Sdr.A00(this, 48);
        this.A16 = C11649Sdr.A00(this, 37);
        this.A15 = C11649Sdr.A00(this, 36);
        this.A1F = C11649Sdr.A00(this, 47);
        this.A1E = C11649Sdr.A00(this, 46);
        this.A1B = C11649Sdr.A00(this, 42);
        this.A1a = C11649Sdr.A00(this, 34);
        this.A1Z = C11649Sdr.A00(this, 33);
        this.A1D = C11649Sdr.A00(this, 44);
        this.A1C = C11649Sdr.A00(this, 43);
        this.A13 = C11649Sdr.A00(this, 32);
        this.A12 = C11649Sdr.A00(this, 31);
        this.A18 = C11649Sdr.A00(this, 39);
        this.A17 = C11649Sdr.A00(this, 38);
        this.A14 = C11649Sdr.A00(this, 35);
        this.A1A = C11649Sdr.A00(this, 41);
        this.A1b = C11649Sdr.A00(this, 51);
        AnonymousClass2gB A0M2 = Pxh.A0M();
        SUj.A0L(A0M2, new C10432Rs9(false, false));
        this.A0r = A0M2;
        this.A19 = C11649Sdr.A00(this, 40);
        this.A1I = C11649Sdr.A00(this, 50);
        this.A1J = C11649Sdr.A00(this, 52);
        C11353SOm.A01().A00.A09(new C64320LZv(TY1.A00(this, 6), 6));
    }
}
