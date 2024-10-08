package X;

import android.os.Parcelable;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebookpay.common.recyclerview.adapteritems.PuxContactItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxEntityItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxFulfillmentOptionItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxPriceTableItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxReceiverHeaderItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxTermsConditionItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionIncentiveEmbeddedBloksItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionNameViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionOfferViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPickupFulfillmentOptionItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPromoCodeViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionShippingFulfillmentOptionItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionTextViewItem;
import com.facebookpay.confirmation.model.ECPConfirmationParams;
import com.facebookpay.confirmation.model.ECPConfirmationUpsellAction;
import com.facebookpay.confirmation.model.ECPConfirmationUpsellSection;
import com.facebookpay.expresscheckout.logging.ComponentLoggingData;
import com.facebookpay.expresscheckout.models.AuthScreenStyle;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.CheckoutPayloadKeyValue;
import com.facebookpay.expresscheckout.models.CheckoutResponse;
import com.facebookpay.expresscheckout.models.CheckoutSetupKeyValue;
import com.facebookpay.expresscheckout.models.DefaultCreditCardFields;
import com.facebookpay.expresscheckout.models.DefaultPaymentMethodFields;
import com.facebookpay.expresscheckout.models.ECPAvailabilityRequestParams;
import com.facebookpay.expresscheckout.models.ECPAvailabilityResponseParams;
import com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration;
import com.facebookpay.expresscheckout.models.ECPOffer;
import com.facebookpay.expresscheckout.models.ECPPaymentConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.expresscheckout.models.ECPPreselectedFBPayData;
import com.facebookpay.expresscheckout.models.EcpNuxLearnMoreScreenStyle;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;
import com.facebookpay.expresscheckout.models.FulfillmentOption;
import com.facebookpay.expresscheckout.models.FulfillmentOptions;
import com.facebookpay.expresscheckout.models.ItemDetails;
import com.facebookpay.expresscheckout.models.KnownData;
import com.facebookpay.expresscheckout.models.OffersList;
import com.facebookpay.expresscheckout.models.PaymentHandledResponseData;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.models.PickupFulfillmentOption;
import com.facebookpay.expresscheckout.models.PickupInfo;
import com.facebookpay.expresscheckout.models.PriceInfo;
import com.facebookpay.expresscheckout.models.PromoCodeList;
import com.facebookpay.expresscheckout.models.ShippingOption;
import com.facebookpay.expresscheckout.models.ShippingOptions;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.form.cell.address.AddressCellParams;
import com.facebookpay.form.cell.address.BriefAddressCellParams;
import com.facebookpay.form.cell.addresslist.AddressListCellParams;
import com.facebookpay.form.cell.addresslist.AddressListHeaderCellParams;
import com.facebookpay.form.cell.apm.APMLinkCellParams;
import com.facebookpay.form.cell.checkbox.CheckboxCellParams;
import com.facebookpay.form.cell.contactinfo.ContactInfoCellParams;
import com.facebookpay.form.cell.creditcard.CardScannerCellParams;
import com.facebookpay.form.cell.creditcard.CreditCardCellParams;
import com.facebookpay.form.cell.fulfillmentoption.FulfillmentOptionCellParams;
import com.facebookpay.form.cell.label.LabelCellParams;
import com.facebookpay.form.cell.label.paymentmethod.PaymentMethodLabelCellParams;
import com.facebookpay.form.cell.label.paymentmethod.SupportedLogosCellParams;
import com.facebookpay.form.cell.logging.FormCellFocusEvents;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.facebookpay.form.cell.selector.SelectorCellParams;
import com.facebookpay.form.cell.text.TextCellParams;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.facebookpay.form.cell.text.formatter.CreditCardFormatter;
import com.facebookpay.form.cell.text.formatter.DateFormatter;
import com.facebookpay.form.cell.text.formatter.NameFormatter;
import com.facebookpay.form.cell.text.formatter.PhoneFormatter;
import com.facebookpay.form.cell.text.formatter.UpperCaseFormatter;
import com.facebookpay.form.cell.text.util.CvvTextFieldHandler;
import com.facebookpay.form.cell.toggle.SwitchCellParams;
import com.facebookpay.form.fragment.model.FeatureConfiguration;
import com.facebookpay.form.fragment.model.FormClickEvent;
import com.facebookpay.form.fragment.model.FormDisplayEvent;
import com.facebookpay.form.fragment.model.FormLoggingEvents;
import com.facebookpay.form.fragment.model.FormMutationEvent;
import com.facebookpay.form.fragment.model.FormParams;
import com.facebookpay.form.fragment.model.ListCellParams;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.form.model.CardFormFieldConfig;
import com.facebookpay.form.model.FormCountry;
import com.facebookpay.form.model.FormField;
import com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent;
import com.facebookpay.fulfillmentoption.model.PickupFulfillmentOptionComponent;
import com.facebookpay.fulfillmentoption.model.ShippingFulfillmentOptionComponent;
import com.facebookpay.incentives.model.ECPOffsiteOffer;
import com.facebookpay.incentives.model.ECPOnsiteOffer;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

public final class SWV implements Parcelable.Creator {
    public final int A00;

    public SWV(int i) {
        this.A00 = i;
    }

    public static SWV A00(int i) {
        return new SWV(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.os.Parcel} */
    /* JADX WARNING: type inference failed for: r10v64, types: [com.facebookpay.form.cell.CellParams, java.lang.Object, com.facebookpay.form.cell.addresslist.AddressListCellParams] */
    /* JADX WARNING: type inference failed for: r10v65, types: [com.facebookpay.form.cell.CellParams, com.facebookpay.form.cell.addresslist.AddressListHeaderCellParams, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v67, types: [com.facebookpay.form.cell.CellParams, java.lang.Object, com.facebookpay.form.cell.checkbox.CheckboxCellParams] */
    /* JADX WARNING: type inference failed for: r10v71, types: [com.facebookpay.form.cell.CellParams, com.facebookpay.form.cell.fulfillmentoption.FulfillmentOptionCellParams, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v74, types: [com.facebookpay.form.cell.CellParams, com.facebookpay.form.cell.label.paymentmethod.SupportedLogosCellParams, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r44) {
        /*
            r43 = this;
            r0 = r43
            int r1 = r0.A00
            r0 = r44
            switch(r1) {
                case 0: goto L_0x1237;
                case 1: goto L_0x120b;
                case 2: goto L_0x11ce;
                case 3: goto L_0x1194;
                case 4: goto L_0x1176;
                case 5: goto L_0x113a;
                case 6: goto L_0x1128;
                case 7: goto L_0x1106;
                case 8: goto L_0x10b4;
                case 9: goto L_0x108b;
                case 10: goto L_0x105d;
                case 11: goto L_0x1037;
                case 12: goto L_0x0fd7;
                case 13: goto L_0x0f85;
                case 14: goto L_0x0f67;
                case 15: goto L_0x0f45;
                case 16: goto L_0x0eb3;
                case 17: goto L_0x0e85;
                case 18: goto L_0x0e2f;
                case 19: goto L_0x0e21;
                case 20: goto L_0x0da5;
                case 21: goto L_0x0d6f;
                case 22: goto L_0x0d59;
                case 23: goto L_0x0d2b;
                case 24: goto L_0x0d11;
                case 25: goto L_0x0cf5;
                case 26: goto L_0x0ce1;
                case 27: goto L_0x0cd7;
                case 28: goto L_0x0ba4;
                case 29: goto L_0x0b92;
                case 30: goto L_0x0b65;
                case 31: goto L_0x0b57;
                case 32: goto L_0x0b3d;
                case 33: goto L_0x0b27;
                case 34: goto L_0x0ab1;
                case 35: goto L_0x0a87;
                case 36: goto L_0x0a71;
                case 37: goto L_0x0a57;
                case 38: goto L_0x09a3;
                case 39: goto L_0x0934;
                case 40: goto L_0x084c;
                case 41: goto L_0x0836;
                case 42: goto L_0x0824;
                case 43: goto L_0x07bb;
                case 44: goto L_0x0799;
                case 45: goto L_0x077c;
                case 46: goto L_0x0754;
                case 47: goto L_0x0736;
                case 48: goto L_0x071e;
                case 49: goto L_0x0701;
                case 50: goto L_0x06eb;
                case 51: goto L_0x06b5;
                case 52: goto L_0x069b;
                case 53: goto L_0x064e;
                case 54: goto L_0x0640;
                case 55: goto L_0x061e;
                case 56: goto L_0x0602;
                case 57: goto L_0x0567;
                case 58: goto L_0x055d;
                case 59: goto L_0x0553;
                case 60: goto L_0x050e;
                case 61: goto L_0x04de;
                case 62: goto L_0x04d4;
                case 63: goto L_0x04a8;
                case 64: goto L_0x049e;
                case 65: goto L_0x0490;
                case 66: goto L_0x0486;
                case 67: goto L_0x0470;
                case 68: goto L_0x046a;
                case 69: goto L_0x043b;
                case 70: goto L_0x0426;
                case 71: goto L_0x0410;
                case 72: goto L_0x03fe;
                case 73: goto L_0x0009;
                case 74: goto L_0x0009;
                case 75: goto L_0x03f4;
                case 76: goto L_0x03ea;
                case 77: goto L_0x03e0;
                case 78: goto L_0x1269;
                case 79: goto L_0x1263;
                case 80: goto L_0x03da;
                case 81: goto L_0x125d;
                case 82: goto L_0x03c8;
                case 83: goto L_0x03c2;
                case 84: goto L_0x03a8;
                case 85: goto L_0x039a;
                case 86: goto L_0x0388;
                case 87: goto L_0x02c6;
                case 88: goto L_0x02b8;
                case 89: goto L_0x01a8;
                case 90: goto L_0x0196;
                case 91: goto L_0x0172;
                case 92: goto L_0x015a;
                case 93: goto L_0x0136;
                case 94: goto L_0x00fb;
                case 95: goto L_0x00e1;
                case 96: goto L_0x0097;
                case 97: goto L_0x006f;
                case 98: goto L_0x0041;
                case 99: goto L_0x0013;
                default: goto L_0x0009;
            }
        L_0x0009:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.facebookpay.form.cell.selector.SelectorCellParams r10 = new com.facebookpay.form.cell.selector.SelectorCellParams
            r10.<init>(r0)
            return r10
        L_0x0013:
            java.lang.String r13 = X.C41848B3p.A1D(r0)
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            java.lang.String r1 = r0.readString()
            X.RGS r12 = X.RGS.valueOf(r1)
            boolean r18 = X.C41848B3p.A1X(r0)
            java.lang.String r16 = r0.readString()
            java.lang.String r17 = r0.readString()
            java.lang.Class<com.facebookpay.incentives.model.ECPOnsiteOffer> r1 = com.facebookpay.incentives.model.ECPOnsiteOffer.class
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r1)
            com.facebookpay.common.models.CurrencyAmount r11 = (com.facebookpay.common.models.CurrencyAmount) r11
            com.facebookpay.incentives.model.ECPOnsiteOffer r10 = new com.facebookpay.incentives.model.ECPOnsiteOffer
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return r10
        L_0x0041:
            java.lang.String r13 = X.C41848B3p.A1D(r0)
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            java.lang.String r1 = r0.readString()
            X.RGS r12 = X.RGS.valueOf(r1)
            boolean r18 = X.C41848B3p.A1X(r0)
            java.lang.String r17 = r0.readString()
            java.lang.Class<com.facebookpay.incentives.model.ECPOffsiteOffer> r1 = com.facebookpay.incentives.model.ECPOffsiteOffer.class
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r1)
            com.facebookpay.common.models.CurrencyAmount r11 = (com.facebookpay.common.models.CurrencyAmount) r11
            com.facebookpay.incentives.model.ECPOffsiteOffer r10 = new com.facebookpay.incentives.model.ECPOffsiteOffer
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return r10
        L_0x006f:
            java.lang.String r12 = X.C41848B3p.A1D(r0)
            java.lang.String r13 = r0.readString()
            java.lang.Class<com.facebookpay.fulfillmentoption.model.ShippingFulfillmentOptionComponent> r1 = com.facebookpay.fulfillmentoption.model.ShippingFulfillmentOptionComponent.class
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r1)
            com.facebookpay.common.models.CurrencyAmount r11 = (com.facebookpay.common.models.CurrencyAmount) r11
            java.lang.String r14 = r0.readString()
            java.io.Serializable r15 = r0.readSerializable()
            java.util.Date r15 = (java.util.Date) r15
            java.io.Serializable r0 = r0.readSerializable()
            java.util.Date r0 = (java.util.Date) r0
            com.facebookpay.fulfillmentoption.model.ShippingFulfillmentOptionComponent r10 = new com.facebookpay.fulfillmentoption.model.ShippingFulfillmentOptionComponent
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            return r10
        L_0x0097:
            java.lang.String r15 = X.C41848B3p.A1D(r0)
            java.lang.String r16 = r0.readString()
            java.lang.Class<com.facebookpay.fulfillmentoption.model.PickupFulfillmentOptionComponent> r4 = com.facebookpay.fulfillmentoption.model.PickupFulfillmentOptionComponent.class
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r4)
            com.facebookpay.common.models.CurrencyAmount r11 = (com.facebookpay.common.models.CurrencyAmount) r11
            java.lang.String r17 = r0.readString()
            java.io.Serializable r3 = r0.readSerializable()
            java.util.Date r3 = (java.util.Date) r3
            java.io.Serializable r2 = r0.readSerializable()
            java.util.Date r2 = (java.util.Date) r2
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x00d8
            r14 = 0
        L_0x00be:
            android.os.Parcelable r13 = X.C41847B3o.A03(r0, r4)
            com.facebookpay.shippingaddress.model.ShippingAddress r13 = (com.facebookpay.shippingaddress.model.ShippingAddress) r13
            android.os.Parcelable r12 = X.C41847B3o.A03(r0, r4)
            com.facebookpay.common.models.Distance r12 = (com.facebookpay.common.models.Distance) r12
            boolean r20 = X.C41848B3p.A1X(r0)
            com.facebookpay.fulfillmentoption.model.PickupFulfillmentOptionComponent r10 = new com.facebookpay.fulfillmentoption.model.PickupFulfillmentOptionComponent
            r19 = r2
            r18 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r10
        L_0x00d8:
            boolean r1 = X.C41848B3p.A1X(r0)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r1)
            goto L_0x00be
        L_0x00e1:
            java.lang.String r3 = X.C41848B3p.A1D(r0)
            java.lang.String r2 = r0.readString()
            java.lang.Class<com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent> r1 = com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.facebookpay.common.models.CurrencyAmount r1 = (com.facebookpay.common.models.CurrencyAmount) r1
            java.lang.String r0 = r0.readString()
            com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent r10 = new com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent
            r10.<init>(r1, r3, r2, r0)
            return r10
        L_0x00fb:
            java.lang.String r12 = X.C41848B3p.A1D(r0)
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            int r1 = r0.readInt()
            r4 = 0
            boolean r17 = X.AnonymousClass7TF.A1P(r1)
            int r3 = r0.readInt()
            java.util.ArrayList r2 = X.DbS.A0v(r3)
        L_0x011c:
            if (r4 == r3) goto L_0x0126
            java.lang.Class<com.facebookpay.form.model.FormField> r1 = com.facebookpay.form.model.FormField.class
            X.C41848B3p.A1J(r0, r1, r2)
            int r4 = r4 + 1
            goto L_0x011c
        L_0x0126:
            java.lang.String r0 = r0.readString()
            java.lang.Integer r11 = X.C11087S9i.A00(r0)
            com.facebookpay.form.model.FormField r10 = new com.facebookpay.form.model.FormField
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            return r10
        L_0x0136:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.facebookpay.form.model.FormCountry> r1 = com.facebookpay.form.model.FormCountry.class
            android.os.Parcelable r5 = X.C41847B3o.A03(r0, r1)
            com.facebook.common.locale.Country r5 = (com.facebook.common.locale.Country) r5
            int r4 = r0.readInt()
            java.util.ArrayList r3 = X.DbS.A0v(r4)
            r2 = 0
        L_0x014b:
            if (r2 == r4) goto L_0x0154
            android.os.Parcelable$Creator r1 = com.facebookpay.form.model.FormField.CREATOR
            int r2 = X.JTT.A04(r0, r1, r3, r2)
            goto L_0x014b
        L_0x0154:
            com.facebookpay.form.model.FormCountry r10 = new com.facebookpay.form.model.FormCountry
            r10.<init>(r5, r3)
            return r10
        L_0x015a:
            int r4 = X.C41848B3p.A00(r0)
            java.util.ArrayList r3 = X.DbS.A0v(r4)
            r2 = 0
        L_0x0163:
            if (r2 == r4) goto L_0x016c
            android.os.Parcelable$Creator r1 = com.facebookpay.form.model.FormField.CREATOR
            int r2 = X.JTT.A04(r0, r1, r3, r2)
            goto L_0x0163
        L_0x016c:
            com.facebookpay.form.model.CardFormFieldConfig r10 = new com.facebookpay.form.model.CardFormFieldConfig
            r10.<init>(r3)
            return r10
        L_0x0172:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.facebookpay.form.model.AddressFormFieldsConfig> r1 = com.facebookpay.form.model.AddressFormFieldsConfig.class
            android.os.Parcelable r5 = X.C41847B3o.A03(r0, r1)
            com.facebook.common.locale.Country r5 = (com.facebook.common.locale.Country) r5
            int r4 = r0.readInt()
            java.util.ArrayList r3 = X.DbS.A0v(r4)
            r2 = 0
        L_0x0187:
            if (r2 == r4) goto L_0x0190
            android.os.Parcelable$Creator r1 = com.facebookpay.form.model.FormCountry.CREATOR
            int r2 = X.JTT.A04(r0, r1, r3, r2)
            goto L_0x0187
        L_0x0190:
            com.facebookpay.form.model.AddressFormFieldsConfig r10 = new com.facebookpay.form.model.AddressFormFieldsConfig
            r10.<init>(r5, r3)
            return r10
        L_0x0196:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = r0.readString()
            com.facebookpay.form.fragment.model.ListCellParams r10 = new com.facebookpay.form.fragment.model.ListCellParams
            r10.<init>(r2, r1, r0)
            return r10
        L_0x01a8:
            int r25 = X.C41848B3p.A00(r0)
            java.lang.String r21 = r0.readString()
            int r26 = r0.readInt()
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x01dc
            r17 = 0
        L_0x01bc:
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x01d7
            r18 = 0
        L_0x01c4:
            int r3 = r0.readInt()
            java.util.ArrayList r5 = X.DbS.A0v(r3)
            r2 = 0
        L_0x01cd:
            if (r2 == r3) goto L_0x01e1
            java.lang.Class<com.facebookpay.form.fragment.model.FormParams> r1 = com.facebookpay.form.fragment.model.FormParams.class
            X.C41848B3p.A1J(r0, r1, r5)
            int r2 = r2 + 1
            goto L_0x01cd
        L_0x01d7:
            java.lang.Integer r18 = X.C41847B3o.A12(r0)
            goto L_0x01c4
        L_0x01dc:
            java.lang.Integer r17 = X.C41847B3o.A12(r0)
            goto L_0x01bc
        L_0x01e1:
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x02ab
            r13 = 0
        L_0x01e8:
            com.facebookpay.form.fragment.model.FormLoggingEvents r13 = (com.facebookpay.form.fragment.model.FormLoggingEvents) r13
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x02a1
            r15 = 0
        L_0x01f1:
            int r27 = r0.readInt()
            int r28 = r0.readInt()
            int r29 = r0.readInt()
            int r30 = r0.readInt()
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0299
            r14 = 0
        L_0x0208:
            com.facebookpay.form.fragment.model.ListCellParams r14 = (com.facebookpay.form.fragment.model.ListCellParams) r14
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0291
            r12 = 0
        L_0x0211:
            com.facebookpay.form.fragment.model.FeatureConfiguration r12 = (com.facebookpay.form.fragment.model.FeatureConfiguration) r12
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x028c
            r19 = 0
        L_0x021b:
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0277
            r4 = 0
        L_0x0222:
            java.lang.Class<com.facebookpay.form.fragment.model.FormParams> r1 = com.facebookpay.form.fragment.model.FormParams.class
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r1)
            com.facebookpay.form.cell.CellParams r11 = (com.facebookpay.form.cell.CellParams) r11
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x025d
            r20 = 0
        L_0x0232:
            int r31 = r0.readInt()
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0254
            r16 = 0
        L_0x023e:
            boolean r32 = X.C41848B3p.A1X(r0)
            java.io.Serializable r0 = r0.readSerializable()
            X.0sP r0 = (X.0sP) r0
            com.facebookpay.form.fragment.model.FormParams r10 = new com.facebookpay.form.fragment.model.FormParams
            r22 = r5
            r23 = r4
            r24 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r10
        L_0x0254:
            java.lang.String r1 = r0.readString()
            X.RGo r16 = X.C8946RGo.valueOf(r1)
            goto L_0x023e
        L_0x025d:
            java.lang.String r1 = r0.readString()
            java.lang.String r2 = "ECP_ADD_ADDRESS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026c
            java.lang.Integer r20 = X.AnonymousClass05K.A00
            goto L_0x0232
        L_0x026c:
            java.lang.String r2 = "ECP_EDIT_ADDRESS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x02b3
            java.lang.Integer r20 = X.AnonymousClass05K.A01
            goto L_0x0232
        L_0x0277:
            int r3 = r0.readInt()
            java.util.ArrayList r4 = X.DbS.A0v(r3)
            r1 = 0
        L_0x0280:
            if (r1 == r3) goto L_0x0222
            int r2 = r0.readInt()
            X.AnonymousClass7TF.A1M(r4, r2)
            int r1 = r1 + 1
            goto L_0x0280
        L_0x028c:
            java.lang.Integer r19 = X.C41847B3o.A12(r0)
            goto L_0x021b
        L_0x0291:
            android.os.Parcelable$Creator r1 = com.facebookpay.form.fragment.model.FeatureConfiguration.CREATOR
            java.lang.Object r12 = r1.createFromParcel(r0)
            goto L_0x0211
        L_0x0299:
            android.os.Parcelable$Creator r1 = com.facebookpay.form.fragment.model.ListCellParams.CREATOR
            java.lang.Object r14 = r1.createFromParcel(r0)
            goto L_0x0208
        L_0x02a1:
            java.lang.String r1 = r0.readString()
            X.RH3 r15 = X.RH3.valueOf(r1)
            goto L_0x01f1
        L_0x02ab:
            android.os.Parcelable$Creator r1 = com.facebookpay.form.fragment.model.FormLoggingEvents.CREATOR
            java.lang.Object r13 = r1.createFromParcel(r0)
            goto L_0x01e8
        L_0x02b3:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r1)
            throw r0
        L_0x02b8:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            java.lang.String r0 = r0.readString()
            com.facebookpay.form.fragment.model.FormMutationEvent r10 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r10.<init>(r1, r0)
            return r10
        L_0x02c6:
            int r1 = X.C41848B3p.A00(r0)
            r5 = 0
            r15 = 0
            if (r1 != 0) goto L_0x0376
            r4 = r15
        L_0x02cf:
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0364
            r6 = r15
        L_0x02d6:
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x035c
            r11 = r15
        L_0x02dd:
            com.facebookpay.form.fragment.model.FormClickEvent r11 = (com.facebookpay.form.fragment.model.FormClickEvent) r11
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0355
            r12 = r15
        L_0x02e6:
            com.facebookpay.form.fragment.model.FormClickEvent r12 = (com.facebookpay.form.fragment.model.FormClickEvent) r12
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x034e
            r13 = r15
        L_0x02ef:
            com.facebookpay.form.fragment.model.FormClickEvent r13 = (com.facebookpay.form.fragment.model.FormClickEvent) r13
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x033c
            r7 = r15
        L_0x02f8:
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x032b
            r3 = r15
        L_0x02ff:
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0324
            r14 = r15
        L_0x0306:
            com.facebookpay.form.fragment.model.FormMutationEvent r14 = (com.facebookpay.form.fragment.model.FormMutationEvent) r14
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x0314
            android.os.Parcelable$Creator r1 = com.facebookpay.form.fragment.model.FormMutationEvent.CREATOR
            java.lang.Object r15 = r1.createFromParcel(r0)
        L_0x0314:
            com.facebookpay.form.fragment.model.FormMutationEvent r15 = (com.facebookpay.form.fragment.model.FormMutationEvent) r15
            com.facebookpay.form.fragment.model.FormLoggingEvents r10 = new com.facebookpay.form.fragment.model.FormLoggingEvents
            r19 = r3
            r17 = r6
            r18 = r7
            r16 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r10
        L_0x0324:
            android.os.Parcelable$Creator r1 = com.facebookpay.form.fragment.model.FormMutationEvent.CREATOR
            java.lang.Object r14 = r1.createFromParcel(r0)
            goto L_0x0306
        L_0x032b:
            int r2 = r0.readInt()
            java.util.ArrayList r3 = X.DbS.A0v(r2)
        L_0x0333:
            if (r5 == r2) goto L_0x02ff
            android.os.Parcelable$Creator r1 = com.facebookpay.form.fragment.model.FormMutationEvent.CREATOR
            int r5 = X.JTT.A04(r0, r1, r3, r5)
            goto L_0x0333
        L_0x033c:
            int r3 = r0.readInt()
            java.util.ArrayList r7 = X.DbS.A0v(r3)
            r2 = 0
        L_0x0345:
            if (r2 == r3) goto L_0x02f8
            android.os.Parcelable$Creator r1 = com.facebookpay.form.fragment.model.FormMutationEvent.CREATOR
            int r2 = X.JTT.A04(r0, r1, r7, r2)
            goto L_0x0345
        L_0x034e:
            android.os.Parcelable$Creator r1 = com.facebookpay.form.fragment.model.FormClickEvent.CREATOR
            java.lang.Object r13 = r1.createFromParcel(r0)
            goto L_0x02ef
        L_0x0355:
            android.os.Parcelable$Creator r1 = com.facebookpay.form.fragment.model.FormClickEvent.CREATOR
            java.lang.Object r12 = r1.createFromParcel(r0)
            goto L_0x02e6
        L_0x035c:
            android.os.Parcelable$Creator r1 = com.facebookpay.form.fragment.model.FormClickEvent.CREATOR
            java.lang.Object r11 = r1.createFromParcel(r0)
            goto L_0x02dd
        L_0x0364:
            int r3 = r0.readInt()
            java.util.ArrayList r6 = X.DbS.A0v(r3)
            r2 = 0
        L_0x036d:
            if (r2 == r3) goto L_0x02d6
            android.os.Parcelable$Creator r1 = com.facebookpay.form.fragment.model.FormClickEvent.CREATOR
            int r2 = X.JTT.A04(r0, r1, r6, r2)
            goto L_0x036d
        L_0x0376:
            int r3 = r0.readInt()
            java.util.ArrayList r4 = X.DbS.A0v(r3)
            r2 = 0
        L_0x037f:
            if (r2 == r3) goto L_0x02cf
            android.os.Parcelable$Creator r1 = com.facebookpay.form.fragment.model.FormDisplayEvent.CREATOR
            int r2 = X.JTT.A04(r0, r1, r4, r2)
            goto L_0x037f
        L_0x0388:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = r0.readString()
            com.facebookpay.form.fragment.model.FormDisplayEvent r10 = new com.facebookpay.form.fragment.model.FormDisplayEvent
            r10.<init>(r2, r1, r0)
            return r10
        L_0x039a:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            java.lang.String r0 = r0.readString()
            com.facebookpay.form.fragment.model.FormClickEvent r10 = new com.facebookpay.form.fragment.model.FormClickEvent
            r10.<init>(r1, r0)
            return r10
        L_0x03a8:
            int r1 = X.C41848B3p.A00(r0)
            r3 = 1
            boolean r2 = X.AnonymousClass7TF.A1P(r1)
            boolean r1 = X.C41848B3p.A1X(r0)
            int r0 = r0.readInt()
            if (r0 != 0) goto L_0x03bc
            r3 = 0
        L_0x03bc:
            com.facebookpay.form.fragment.model.FeatureConfiguration r10 = new com.facebookpay.form.fragment.model.FeatureConfiguration
            r10.<init>(r2, r1, r3)
            return r10
        L_0x03c2:
            com.facebookpay.form.cell.toggle.SwitchCellParams r10 = new com.facebookpay.form.cell.toggle.SwitchCellParams
            r10.<init>((android.os.Parcel) r0)
            return r10
        L_0x03c8:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            if (r0 == 0) goto L_0x03d8
            X.RGo r0 = X.C8946RGo.valueOf(r0)
        L_0x03d2:
            com.facebookpay.form.cell.text.util.CvvTextFieldHandler r10 = new com.facebookpay.form.cell.text.util.CvvTextFieldHandler
            r10.<init>(r0)
            return r10
        L_0x03d8:
            r0 = 0
            goto L_0x03d2
        L_0x03da:
            com.facebookpay.form.cell.text.formatter.PhoneFormatter r10 = new com.facebookpay.form.cell.text.formatter.PhoneFormatter
            r10.<init>()
            return r10
        L_0x03e0:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.facebookpay.form.cell.text.formatter.CreditCardFormatter r10 = new com.facebookpay.form.cell.text.formatter.CreditCardFormatter
            r10.<init>()
            return r10
        L_0x03ea:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.facebookpay.form.cell.text.TextValidatorParams r10 = new com.facebookpay.form.cell.text.TextValidatorParams
            r10.<init>(r0)
            return r10
        L_0x03f4:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.facebookpay.form.cell.text.TextCellParams r10 = new com.facebookpay.form.cell.text.TextCellParams
            r10.<init>((android.os.Parcel) r0)
            return r10
        L_0x03fe:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            android.os.Parcelable$Creator r1 = com.facebookpay.form.cell.logging.FormCellFocusEvents.CREATOR
            java.lang.Object r0 = r1.createFromParcel(r0)
            com.facebookpay.form.cell.logging.FormCellFocusEvents r0 = (com.facebookpay.form.cell.logging.FormCellFocusEvents) r0
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r10 = new com.facebookpay.form.cell.logging.FormCellLoggingEvents
            r10.<init>(r0)
            return r10
        L_0x0410:
            java.lang.String r3 = X.C41848B3p.A1D(r0)
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = r0.readString()
            com.facebookpay.form.cell.logging.FormCellFocusEvents r10 = new com.facebookpay.form.cell.logging.FormCellFocusEvents
            r10.<init>(r3, r2, r1, r0)
            return r10
        L_0x0426:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.facebookpay.form.cell.label.paymentmethod.SupportedLogosCellParams r10 = new com.facebookpay.form.cell.label.paymentmethod.SupportedLogosCellParams
            r10.<init>((android.os.Parcel) r0)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            r10.A00 = r2
            java.lang.Class r1 = java.lang.Integer.TYPE
            X.Pxe.A1O(r0, r1, r2)
            return r10
        L_0x043b:
            int r12 = X.C41848B3p.A00(r0)
            int r13 = r0.readInt()
            int r14 = r0.readInt()
            int r15 = r0.readInt()
            int r16 = r0.readInt()
            int r3 = r0.readInt()
            java.util.ArrayList r11 = X.DbS.A0v(r3)
            r2 = 0
        L_0x0458:
            if (r2 == r3) goto L_0x0464
            int r1 = r0.readInt()
            X.AnonymousClass7TF.A1M(r11, r1)
            int r2 = r2 + 1
            goto L_0x0458
        L_0x0464:
            com.facebookpay.form.cell.label.paymentmethod.PaymentMethodLabelCellParams r10 = new com.facebookpay.form.cell.label.paymentmethod.PaymentMethodLabelCellParams
            r10.<init>(r11, r12, r13, r14, r15, r16)
            return r10
        L_0x046a:
            com.facebookpay.form.cell.label.LabelCellParams r10 = new com.facebookpay.form.cell.label.LabelCellParams
            r10.<init>((android.os.Parcel) r0)
            return r10
        L_0x0470:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.facebookpay.form.cell.fulfillmentoption.FulfillmentOptionCellParams r10 = new com.facebookpay.form.cell.fulfillmentoption.FulfillmentOptionCellParams
            r10.<init>((android.os.Parcel) r0)
            int r1 = r0.readInt()
            r10.A00 = r1
            int r0 = r0.readInt()
            r10.A01 = r0
            return r10
        L_0x0486:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.facebookpay.form.cell.creditcard.CreditCardCellParams r10 = new com.facebookpay.form.cell.creditcard.CreditCardCellParams
            r10.<init>((android.os.Parcel) r0)
            return r10
        L_0x0490:
            int r1 = X.C41848B3p.A00(r0)
            boolean r0 = X.C41848B3p.A1X(r0)
            com.facebookpay.form.cell.creditcard.CardScannerCellParams r10 = new com.facebookpay.form.cell.creditcard.CardScannerCellParams
            r10.<init>(r1, r0)
            return r10
        L_0x049e:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.facebookpay.form.cell.contactinfo.ContactInfoCellParams r10 = new com.facebookpay.form.cell.contactinfo.ContactInfoCellParams
            r10.<init>((android.os.Parcel) r0)
            return r10
        L_0x04a8:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.facebookpay.form.cell.checkbox.CheckboxCellParams r10 = new com.facebookpay.form.cell.checkbox.CheckboxCellParams
            r10.<init>((android.os.Parcel) r0)
            byte r1 = r0.readByte()
            boolean r1 = X.AnonymousClass7TF.A1P(r1)
            r10.A03 = r1
            int r1 = r0.readInt()
            r10.A01 = r1
            int r1 = r0.readInt()
            r10.A00 = r1
            boolean r1 = X.Pxg.A1U(r0)
            r10.A04 = r1
            java.lang.String r0 = r0.readString()
            r10.A02 = r0
            return r10
        L_0x04d4:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.facebookpay.form.cell.apm.APMLinkCellParams r10 = new com.facebookpay.form.cell.apm.APMLinkCellParams
            r10.<init>((android.os.Parcel) r0)
            return r10
        L_0x04de:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.facebookpay.form.cell.addresslist.AddressListHeaderCellParams r10 = new com.facebookpay.form.cell.addresslist.AddressListHeaderCellParams
            r10.<init>((android.os.Parcel) r0)
            byte r1 = r0.readByte()
            r2 = 1
            boolean r1 = X.AnonymousClass7TF.A1P(r1)
            r10.A03 = r1
            byte r1 = r0.readByte()
            if (r1 != 0) goto L_0x04f9
            r2 = 0
        L_0x04f9:
            r10.A04 = r2
            int r1 = r0.readInt()
            r10.A01 = r1
            int r1 = r0.readInt()
            r10.A00 = r1
            java.lang.Integer r0 = X.C41847B3o.A12(r0)
            r10.A02 = r0
            return r10
        L_0x050e:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.facebookpay.form.cell.addresslist.AddressListCellParams r10 = new com.facebookpay.form.cell.addresslist.AddressListCellParams
            r10.<init>((android.os.Parcel) r0)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            r10.A03 = r2
            java.lang.Class<com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem> r1 = com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem.class
            X.Pxe.A1O(r0, r1, r2)
            java.lang.Class<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem> r1 = com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x054e
            com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem r1 = (com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem) r1
            r10.A01 = r1
            int r1 = r0.readInt()
            r10.A00 = r1
            java.lang.Class<com.facebookpay.logging.LoggingContext> r1 = com.facebookpay.logging.LoggingContext.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            if (r1 == 0) goto L_0x0549
            com.facebookpay.logging.LoggingContext r1 = (com.facebookpay.logging.LoggingContext) r1
            r10.A02 = r1
            boolean r0 = X.Pxg.A1U(r0)
            r10.A04 = r0
            return r10
        L_0x0549:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x054e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0553:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.facebookpay.form.cell.address.BriefAddressCellParams r10 = new com.facebookpay.form.cell.address.BriefAddressCellParams
            r10.<init>((android.os.Parcel) r0)
            return r10
        L_0x055d:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.facebookpay.form.cell.address.AddressCellParams r10 = new com.facebookpay.form.cell.address.AddressCellParams
            r10.<init>((android.os.Parcel) r0)
            return r10
        L_0x0567:
            java.lang.String r16 = X.C41848B3p.A1D(r0)
            java.lang.String r17 = r0.readString()
            int r1 = r0.readInt()
            r5 = 0
            r12 = 0
            if (r1 != 0) goto L_0x05f0
            r4 = r12
        L_0x0578:
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x05df
            r3 = r12
        L_0x057f:
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x05d8
            r14 = r12
        L_0x0586:
            com.facebookpay.expresscheckout.models.ShippingOptions r14 = (com.facebookpay.expresscheckout.models.ShippingOptions) r14
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x05d1
            r11 = r12
        L_0x058f:
            com.facebookpay.expresscheckout.models.FulfillmentOptions r11 = (com.facebookpay.expresscheckout.models.FulfillmentOptions) r11
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x05ca
            r13 = r12
        L_0x0598:
            com.facebookpay.expresscheckout.models.PromoCodeList r13 = (com.facebookpay.expresscheckout.models.PromoCodeList) r13
            java.util.ArrayList r21 = r0.createStringArrayList()
            java.lang.String r18 = r0.readString()
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x05c1
            r15 = r12
        L_0x05a9:
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x05b5
            android.os.Parcelable$Creator r1 = com.facebookpay.expresscheckout.models.PickupInfo.CREATOR
            java.lang.Object r12 = r1.createFromParcel(r0)
        L_0x05b5:
            com.facebookpay.expresscheckout.models.PickupInfo r12 = (com.facebookpay.expresscheckout.models.PickupInfo) r12
            com.facebookpay.expresscheckout.models.TransactionInfo r10 = new com.facebookpay.expresscheckout.models.TransactionInfo
            r19 = r4
            r20 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r10
        L_0x05c1:
            java.lang.String r1 = r0.readString()
            java.lang.Integer r15 = X.C11085S9f.A00(r1)
            goto L_0x05a9
        L_0x05ca:
            android.os.Parcelable$Creator r1 = com.facebookpay.expresscheckout.models.PromoCodeList.CREATOR
            java.lang.Object r13 = r1.createFromParcel(r0)
            goto L_0x0598
        L_0x05d1:
            android.os.Parcelable$Creator r1 = com.facebookpay.expresscheckout.models.FulfillmentOptions.CREATOR
            java.lang.Object r11 = r1.createFromParcel(r0)
            goto L_0x058f
        L_0x05d8:
            android.os.Parcelable$Creator r1 = com.facebookpay.expresscheckout.models.ShippingOptions.CREATOR
            java.lang.Object r14 = r1.createFromParcel(r0)
            goto L_0x0586
        L_0x05df:
            int r2 = r0.readInt()
            java.util.ArrayList r3 = X.DbS.A0v(r2)
        L_0x05e7:
            if (r5 == r2) goto L_0x057f
            android.os.Parcelable$Creator r1 = com.facebookpay.expresscheckout.models.PriceInfo.CREATOR
            int r5 = X.JTT.A04(r0, r1, r3, r5)
            goto L_0x05e7
        L_0x05f0:
            int r3 = r0.readInt()
            java.util.ArrayList r4 = X.DbS.A0v(r3)
            r2 = 0
        L_0x05f9:
            if (r2 == r3) goto L_0x0578
            android.os.Parcelable$Creator r1 = com.facebookpay.expresscheckout.models.PriceInfo.CREATOR
            int r2 = X.JTT.A04(r0, r1, r4, r2)
            goto L_0x05f9
        L_0x0602:
            java.lang.String r5 = X.C41848B3p.A1D(r0)
            int r4 = r0.readInt()
            java.util.ArrayList r3 = X.DbS.A0v(r4)
            r2 = 0
        L_0x060f:
            if (r2 == r4) goto L_0x0618
            android.os.Parcelable$Creator r1 = com.facebookpay.expresscheckout.models.ShippingOption.CREATOR
            int r2 = X.JTT.A04(r0, r1, r3, r2)
            goto L_0x060f
        L_0x0618:
            com.facebookpay.expresscheckout.models.ShippingOptions r10 = new com.facebookpay.expresscheckout.models.ShippingOptions
            r10.<init>(r5, r3)
            return r10
        L_0x061e:
            java.lang.String r13 = X.C41848B3p.A1D(r0)
            java.lang.String r1 = r0.readString()
            java.lang.Integer r12 = X.C11085S9f.A00(r1)
            java.lang.String r14 = r0.readString()
            java.lang.Class<com.facebookpay.expresscheckout.models.ShippingOption> r1 = com.facebookpay.expresscheckout.models.ShippingOption.class
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r1)
            com.facebookpay.common.models.CurrencyAmount r11 = (com.facebookpay.common.models.CurrencyAmount) r11
            java.lang.String r15 = r0.readString()
            com.facebookpay.expresscheckout.models.ShippingOption r10 = new com.facebookpay.expresscheckout.models.ShippingOption
            r10.<init>(r11, r12, r13, r14, r15)
            return r10
        L_0x0640:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.util.ArrayList r0 = r0.createStringArrayList()
            com.facebookpay.expresscheckout.models.PromoCodeList r10 = new com.facebookpay.expresscheckout.models.PromoCodeList
            r10.<init>(r0)
            return r10
        L_0x064e:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.facebookpay.expresscheckout.models.PriceInfo> r1 = com.facebookpay.expresscheckout.models.PriceInfo.class
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r1)
            com.facebookpay.common.models.CurrencyAmount r11 = (com.facebookpay.common.models.CurrencyAmount) r11
            java.lang.String r15 = r0.readString()
            int r1 = r0.readInt()
            r14 = 0
            if (r1 != 0) goto L_0x0692
            r13 = r14
        L_0x0666:
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0689
            r12 = r14
        L_0x066d:
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x0677
            java.lang.Integer r14 = X.C41847B3o.A12(r0)
        L_0x0677:
            java.lang.String r16 = r0.readString()
            java.lang.String r17 = r0.readString()
            java.lang.String r18 = r0.readString()
            com.facebookpay.expresscheckout.models.PriceInfo r10 = new com.facebookpay.expresscheckout.models.PriceInfo
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return r10
        L_0x0689:
            java.lang.String r1 = r0.readString()
            X.RFB r12 = X.RFB.valueOf(r1)
            goto L_0x066d
        L_0x0692:
            java.lang.String r1 = r0.readString()
            X.RFW r13 = X.RFW.valueOf(r1)
            goto L_0x0666
        L_0x069b:
            java.lang.String r11 = X.C41848B3p.A1D(r0)
            java.lang.String r12 = r0.readString()
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            com.facebookpay.expresscheckout.models.PickupInfo r10 = new com.facebookpay.expresscheckout.models.PickupInfo
            r10.<init>(r11, r12, r13, r14, r15)
            return r10
        L_0x06b5:
            java.lang.String r14 = X.C41848B3p.A1D(r0)
            java.lang.String r15 = r0.readString()
            java.lang.Class<com.facebookpay.expresscheckout.models.PickupFulfillmentOption> r3 = com.facebookpay.expresscheckout.models.PickupFulfillmentOption.class
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r3)
            com.facebookpay.common.models.CurrencyAmount r11 = (com.facebookpay.common.models.CurrencyAmount) r11
            java.io.Serializable r2 = r0.readSerializable()
            java.util.Date r2 = (java.util.Date) r2
            java.io.Serializable r1 = r0.readSerializable()
            java.util.Date r1 = (java.util.Date) r1
            android.os.Parcelable r13 = X.C41847B3o.A03(r0, r3)
            com.facebookpay.shippingaddress.model.ShippingAddress r13 = (com.facebookpay.shippingaddress.model.ShippingAddress) r13
            boolean r18 = X.C41848B3p.A1X(r0)
            android.os.Parcelable r12 = X.C41847B3o.A03(r0, r3)
            com.facebookpay.common.models.Distance r12 = (com.facebookpay.common.models.Distance) r12
            com.facebookpay.expresscheckout.models.PickupFulfillmentOption r10 = new com.facebookpay.expresscheckout.models.PickupFulfillmentOption
            r17 = r1
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return r10
        L_0x06eb:
            java.lang.String r3 = X.C41848B3p.A1D(r0)
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = r0.readString()
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r10 = new com.facebookpay.expresscheckout.models.PaymentReceiverInfo
            r10.<init>(r3, r2, r1, r0)
            return r10
        L_0x0701:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            java.lang.String r1 = "SUBMIT_CONTAINER"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0719
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            java.lang.String r0 = r0.readString()
            com.facebookpay.expresscheckout.models.PaymentHandledResponseData r10 = new com.facebookpay.expresscheckout.models.PaymentHandledResponseData
            r10.<init>(r1, r0)
            return r10
        L_0x0719:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r2)
            throw r0
        L_0x071e:
            int r4 = X.C41848B3p.A00(r0)
            java.util.ArrayList r3 = X.DbS.A0v(r4)
            r2 = 0
        L_0x0727:
            if (r2 == r4) goto L_0x0730
            android.os.Parcelable$Creator r1 = com.facebookpay.expresscheckout.models.ECPOffer.CREATOR
            int r2 = X.JTT.A04(r0, r1, r3, r2)
            goto L_0x0727
        L_0x0730:
            com.facebookpay.expresscheckout.models.OffersList r10 = new com.facebookpay.expresscheckout.models.OffersList
            r10.<init>(r3)
            return r10
        L_0x0736:
            java.lang.String r12 = X.C41848B3p.A1D(r0)
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.Class<com.facebookpay.expresscheckout.models.KnownData> r1 = com.facebookpay.expresscheckout.models.KnownData.class
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r1)
            com.facebookpay.shippingaddress.model.ShippingAddress r11 = (com.facebookpay.shippingaddress.model.ShippingAddress) r11
            java.lang.String r15 = r0.readString()
            com.facebookpay.expresscheckout.models.KnownData r10 = new com.facebookpay.expresscheckout.models.KnownData
            r10.<init>(r11, r12, r13, r14, r15)
            return r10
        L_0x0754:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            java.lang.String r1 = "DEFAULT"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x076c
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x0762:
            java.lang.String r0 = r0.readString()
            com.facebookpay.expresscheckout.models.ItemDetails r10 = new com.facebookpay.expresscheckout.models.ItemDetails
            r10.<init>(r1, r0)
            return r10
        L_0x076c:
            java.lang.String r1 = "RESELLER"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0777
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x0762
        L_0x0777:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r2)
            throw r0
        L_0x077c:
            java.lang.String r5 = X.C41848B3p.A1D(r0)
            int r4 = r0.readInt()
            java.util.ArrayList r3 = X.DbS.A0v(r4)
            r2 = 0
        L_0x0789:
            if (r2 == r4) goto L_0x0793
            java.lang.Class<com.facebookpay.expresscheckout.models.FulfillmentOptions> r1 = com.facebookpay.expresscheckout.models.FulfillmentOptions.class
            X.C41848B3p.A1J(r0, r1, r3)
            int r2 = r2 + 1
            goto L_0x0789
        L_0x0793:
            com.facebookpay.expresscheckout.models.FulfillmentOptions r10 = new com.facebookpay.expresscheckout.models.FulfillmentOptions
            r10.<init>(r5, r3)
            return r10
        L_0x0799:
            java.lang.String r12 = X.C41848B3p.A1D(r0)
            java.lang.String r13 = r0.readString()
            java.lang.Class<com.facebookpay.expresscheckout.models.FulfillmentOption> r1 = com.facebookpay.expresscheckout.models.FulfillmentOption.class
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r1)
            com.facebookpay.common.models.CurrencyAmount r11 = (com.facebookpay.common.models.CurrencyAmount) r11
            java.io.Serializable r14 = r0.readSerializable()
            java.util.Date r14 = (java.util.Date) r14
            java.io.Serializable r15 = r0.readSerializable()
            java.util.Date r15 = (java.util.Date) r15
            com.facebookpay.expresscheckout.models.FulfillmentOption r10 = new com.facebookpay.expresscheckout.models.FulfillmentOption
            r10.<init>(r11, r12, r13, r14, r15)
            return r10
        L_0x07bb:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            X.RFs r12 = X.C8924RFs.valueOf(r1)
            java.lang.String r1 = r0.readString()
            X.RFs r13 = X.C8924RFs.valueOf(r1)
            java.lang.String r1 = r0.readString()
            X.RFs r14 = X.C8924RFs.valueOf(r1)
            java.lang.String r1 = r0.readString()
            X.RFs r15 = X.C8924RFs.valueOf(r1)
            java.lang.String r1 = r0.readString()
            X.RFs r16 = X.C8924RFs.valueOf(r1)
            java.lang.String r1 = r0.readString()
            X.RFs r17 = X.C8924RFs.valueOf(r1)
            android.os.Parcelable$Creator r1 = com.facebookpay.expresscheckout.models.ItemDetails.CREATOR
            java.lang.Object r3 = r1.createFromParcel(r0)
            com.facebookpay.expresscheckout.models.ItemDetails r3 = (com.facebookpay.expresscheckout.models.ItemDetails) r3
            int r1 = r0.readInt()
            r2 = 0
            if (r1 != 0) goto L_0x081d
            r11 = r2
        L_0x07fb:
            com.facebookpay.expresscheckout.models.AuthScreenStyle r11 = (com.facebookpay.expresscheckout.models.AuthScreenStyle) r11
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x0809
            android.os.Parcelable$Creator r1 = com.facebookpay.expresscheckout.models.EcpNuxLearnMoreScreenStyle.CREATOR
            java.lang.Object r2 = r1.createFromParcel(r0)
        L_0x0809:
            com.facebookpay.expresscheckout.models.EcpNuxLearnMoreScreenStyle r2 = (com.facebookpay.expresscheckout.models.EcpNuxLearnMoreScreenStyle) r2
            java.lang.String r0 = r0.readString()
            X.RFs r18 = X.C8924RFs.valueOf(r0)
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r10 = new com.facebookpay.expresscheckout.models.EcpUIConfiguration
            r19 = r2
            r20 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r10
        L_0x081d:
            android.os.Parcelable$Creator r1 = com.facebookpay.expresscheckout.models.AuthScreenStyle.CREATOR
            java.lang.Object r11 = r1.createFromParcel(r0)
            goto L_0x07fb
        L_0x0824:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            android.os.Parcelable$Creator r1 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r0 = r1.createFromParcel(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            com.facebookpay.expresscheckout.models.EcpNuxLearnMoreScreenStyle r10 = new com.facebookpay.expresscheckout.models.EcpNuxLearnMoreScreenStyle
            r10.<init>(r0)
            return r10
        L_0x0836:
            java.lang.String r3 = X.C41848B3p.A1D(r0)
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = r0.readString()
            com.facebookpay.expresscheckout.models.ECPPreselectedFBPayData r10 = new com.facebookpay.expresscheckout.models.ECPPreselectedFBPayData
            r10.<init>(r3, r2, r1, r0)
            return r10
        L_0x084c:
            java.lang.String r19 = X.C41848B3p.A1D(r0)
            int r41 = r0.readInt()
            java.lang.String r20 = r0.readString()
            java.lang.String r21 = r0.readString()
            java.lang.String r22 = r0.readString()
            java.lang.String r23 = r0.readString()
            java.lang.String r24 = r0.readString()
            java.lang.String r25 = r0.readString()
            java.lang.String r26 = r0.readString()
            java.lang.String r27 = r0.readString()
            java.lang.String r28 = r0.readString()
            java.lang.String r29 = r0.readString()
            java.lang.String r30 = r0.readString()
            java.lang.String r31 = r0.readString()
            java.lang.String r32 = r0.readString()
            java.lang.Class<com.facebookpay.expresscheckout.models.ECPPaymentResponseParams> r1 = com.facebookpay.expresscheckout.models.ECPPaymentResponseParams.class
            android.os.Parcelable r7 = X.C41847B3o.A03(r0, r1)
            com.facebookpay.shippingaddress.model.ShippingAddress r7 = (com.facebookpay.shippingaddress.model.ShippingAddress) r7
            android.os.Parcelable r6 = X.C41847B3o.A03(r0, r1)
            com.facebookpay.shippingaddress.model.ShippingAddress r6 = (com.facebookpay.shippingaddress.model.ShippingAddress) r6
            int r2 = r0.readInt()
            if (r2 != 0) goto L_0x08ee
            r12 = 0
        L_0x089d:
            com.facebookpay.expresscheckout.models.ShippingOption r12 = (com.facebookpay.expresscheckout.models.ShippingOption) r12
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r1)
            com.facebookpay.expresscheckout.models.FulfillmentOption r11 = (com.facebookpay.expresscheckout.models.FulfillmentOption) r11
            int r2 = r0.readInt()
            if (r2 != 0) goto L_0x08d4
            r4 = 0
        L_0x08ac:
            java.lang.String r33 = r0.readString()
            java.lang.String r34 = r0.readString()
            java.lang.String r35 = r0.readString()
            java.lang.String r36 = r0.readString()
            android.os.Parcelable r15 = X.C41847B3o.A03(r0, r1)
            com.facebookpay.otc.models.OtcInput r15 = (com.facebookpay.otc.models.OtcInput) r15
            int r3 = r0.readInt()
            java.util.ArrayList r5 = X.DbS.A0v(r3)
            r1 = 0
        L_0x08cb:
            if (r1 == r3) goto L_0x08f5
            android.os.Parcelable$Creator r2 = com.facebookpay.expresscheckout.models.ECPOffer.CREATOR
            int r1 = X.JTT.A04(r0, r2, r5, r1)
            goto L_0x08cb
        L_0x08d4:
            int r3 = r0.readInt()
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>(r3)
            r2 = 0
        L_0x08de:
            if (r2 == r3) goto L_0x08ac
            java.lang.String r5 = r0.readString()
            X.REi r5 = X.C8891REi.valueOf(r5)
            r4.add(r5)
            int r2 = r2 + 1
            goto L_0x08de
        L_0x08ee:
            android.os.Parcelable$Creator r2 = com.facebookpay.expresscheckout.models.ShippingOption.CREATOR
            java.lang.Object r12 = r2.createFromParcel(r0)
            goto L_0x089d
        L_0x08f5:
            android.os.Parcelable$Creator r1 = com.facebookpay.expresscheckout.models.TransactionInfo.CREATOR
            java.lang.Object r13 = r1.createFromParcel(r0)
            com.facebookpay.expresscheckout.models.TransactionInfo r13 = (com.facebookpay.expresscheckout.models.TransactionInfo) r13
            java.lang.String r37 = r0.readString()
            boolean r42 = X.C41848B3p.A1X(r0)
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x092b
            r14 = 0
        L_0x090c:
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0926
            r18 = 0
        L_0x0914:
            java.lang.String r38 = r0.readString()
            com.facebookpay.expresscheckout.models.ECPPaymentResponseParams r10 = new com.facebookpay.expresscheckout.models.ECPPaymentResponseParams
            r39 = r5
            r40 = r4
            r17 = r6
            r16 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            return r10
        L_0x0926:
            java.lang.Long r18 = X.Pxi.A0T(r0)
            goto L_0x0914
        L_0x092b:
            java.lang.String r1 = r0.readString()
            X.XRm r14 = X.C21267XRm.valueOf(r1)
            goto L_0x090c
        L_0x0934:
            java.lang.String r17 = X.C41848B3p.A1D(r0)
            java.lang.String r18 = r0.readString()
            android.os.Parcelable$Creator r1 = com.facebookpay.expresscheckout.models.EcpUIConfiguration.CREATOR
            java.lang.Object r14 = r1.createFromParcel(r0)
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r14 = (com.facebookpay.expresscheckout.models.EcpUIConfiguration) r14
            java.lang.String r19 = r0.readString()
            java.lang.String r20 = r0.readString()
            int r21 = r0.readInt()
            int r1 = r0.readInt()
            r12 = 0
            if (r1 != 0) goto L_0x099c
            r15 = r12
        L_0x0958:
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r15 = (com.facebookpay.expresscheckout.models.PaymentReceiverInfo) r15
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0995
            r11 = r12
        L_0x0961:
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r11 = (com.facebookpay.expresscheckout.models.CheckoutConfiguration) r11
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x098e
            r13 = r12
        L_0x096a:
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r13 = (com.facebookpay.expresscheckout.models.ECPPaymentConfiguration) r13
            java.lang.Class<com.facebookpay.expresscheckout.models.ECPPaymentRequest> r1 = com.facebookpay.expresscheckout.models.ECPPaymentRequest.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r1)
            com.facebookpay.logging.LoggingPolicy r2 = (com.facebookpay.logging.LoggingPolicy) r2
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x0980
            android.os.Parcelable$Creator r1 = com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration.CREATOR
            java.lang.Object r12 = r1.createFromParcel(r0)
        L_0x0980:
            com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration r12 = (com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration) r12
            boolean r22 = X.C41848B3p.A1X(r0)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r10 = new com.facebookpay.expresscheckout.models.ECPPaymentRequest
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r10
        L_0x098e:
            android.os.Parcelable$Creator r1 = com.facebookpay.expresscheckout.models.ECPPaymentConfiguration.CREATOR
            java.lang.Object r13 = r1.createFromParcel(r0)
            goto L_0x096a
        L_0x0995:
            android.os.Parcelable$Creator r1 = com.facebookpay.expresscheckout.models.CheckoutConfiguration.CREATOR
            java.lang.Object r11 = r1.createFromParcel(r0)
            goto L_0x0961
        L_0x099c:
            android.os.Parcelable$Creator r1 = com.facebookpay.expresscheckout.models.PaymentReceiverInfo.CREATOR
            java.lang.Object r15 = r1.createFromParcel(r0)
            goto L_0x0958
        L_0x09a3:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            X.RFA r16 = X.RFA.valueOf(r1)
            java.lang.String r17 = r0.readString()
            java.lang.String r18 = r0.readString()
            int r3 = r0.readInt()
            java.util.ArrayList r12 = X.DbS.A0v(r3)
            r11 = 0
            r2 = 0
        L_0x09bd:
            if (r2 == r3) goto L_0x09cd
            java.lang.String r1 = r0.readString()
            X.REB r1 = X.REB.valueOf(r1)
            r12.add(r1)
            int r2 = r2 + 1
            goto L_0x09bd
        L_0x09cd:
            java.lang.Class<com.facebookpay.expresscheckout.models.ECPPaymentConfiguration> r10 = com.facebookpay.expresscheckout.models.ECPPaymentConfiguration.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r10)
            com.facebookpay.common.models.CurrencyAmount r9 = (com.facebookpay.common.models.CurrencyAmount) r9
            int r3 = r0.readInt()
            java.util.ArrayList r8 = X.DbS.A0v(r3)
            r2 = 0
        L_0x09de:
            if (r2 == r3) goto L_0x09ee
            java.lang.String r1 = r0.readString()
            X.RFh r1 = X.C8914RFh.valueOf(r1)
            r8.add(r1)
            int r2 = r2 + 1
            goto L_0x09de
        L_0x09ee:
            int r1 = r0.readInt()
            r5 = 0
            if (r1 != 0) goto L_0x0a3f
            r7 = r5
        L_0x09f6:
            com.facebookpay.expresscheckout.models.KnownData r7 = (com.facebookpay.expresscheckout.models.KnownData) r7
            java.util.ArrayList r21 = r0.createStringArrayList()
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0a22
            r6 = r5
        L_0x0a03:
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x0a46
            int r2 = r0.readInt()
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>(r2)
        L_0x0a12:
            if (r11 == r2) goto L_0x0a46
            java.lang.String r1 = r0.readString()
            X.RDy r1 = X.C8881RDy.valueOf(r1)
            r5.add(r1)
            int r11 = r11 + 1
            goto L_0x0a12
        L_0x0a22:
            int r4 = r0.readInt()
            java.util.LinkedHashMap r6 = X.DbS.A0x(r4)
            r3 = 0
        L_0x0a2b:
            if (r3 == r4) goto L_0x0a03
            java.lang.String r1 = r0.readString()
            X.RFh r2 = X.C8914RFh.valueOf(r1)
            android.os.Bundle r1 = X.Pxi.A0D(r0, r10)
            r6.put(r2, r1)
            int r3 = r3 + 1
            goto L_0x0a2b
        L_0x0a3f:
            android.os.Parcelable$Creator r1 = com.facebookpay.expresscheckout.models.KnownData.CREATOR
            java.lang.Object r7 = r1.createFromParcel(r0)
            goto L_0x09f6
        L_0x0a46:
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r10 = new com.facebookpay.expresscheckout.models.ECPPaymentConfiguration
            r22 = r6
            r23 = r5
            r20 = r8
            r13 = r10
            r14 = r9
            r15 = r7
            r19 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r10
        L_0x0a57:
            java.lang.String r11 = X.C41848B3p.A1D(r0)
            java.lang.String r12 = r0.readString()
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            com.facebookpay.expresscheckout.models.ECPOffer r10 = new com.facebookpay.expresscheckout.models.ECPOffer
            r10.<init>(r11, r12, r13, r14, r15)
            return r10
        L_0x0a71:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration> r1 = com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.facebookpay.confirmation.model.ECPConfirmationUpsellSection r1 = (com.facebookpay.confirmation.model.ECPConfirmationUpsellSection) r1
            java.lang.String r0 = r0.readString()
            com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration r10 = new com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration
            r10.<init>(r1, r0)
            return r10
        L_0x0a87:
            int r4 = X.C41848B3p.A00(r0)
            int r1 = r0.readInt()
            r3 = 1
            boolean r2 = X.AnonymousClass7TF.A1P(r1)
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0a9b
            r3 = 0
        L_0x0a9b:
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0aaa
            r0 = 0
        L_0x0aa2:
            com.facebookpay.expresscheckout.models.DefaultPaymentMethodFields r0 = (com.facebookpay.expresscheckout.models.DefaultPaymentMethodFields) r0
            com.facebookpay.expresscheckout.models.ECPAvailabilityResponseParams r10 = new com.facebookpay.expresscheckout.models.ECPAvailabilityResponseParams
            r10.<init>(r0, r4, r2, r3)
            return r10
        L_0x0aaa:
            android.os.Parcelable$Creator r1 = com.facebookpay.expresscheckout.models.DefaultPaymentMethodFields.CREATOR
            java.lang.Object r0 = r1.createFromParcel(r0)
            goto L_0x0aa2
        L_0x0ab1:
            java.lang.String r14 = X.C41848B3p.A1D(r0)
            java.lang.String r15 = r0.readString()
            int r20 = r0.readInt()
            android.os.Parcelable$Creator r1 = com.facebookpay.expresscheckout.models.PaymentReceiverInfo.CREATOR
            java.lang.Object r12 = r1.createFromParcel(r0)
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r12 = (com.facebookpay.expresscheckout.models.PaymentReceiverInfo) r12
            java.lang.String r16 = r0.readString()
            java.lang.String r17 = r0.readString()
            int r4 = r0.readInt()
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>(r4)
            r2 = 0
        L_0x0ad7:
            if (r2 == r4) goto L_0x0ae7
            java.lang.String r1 = r0.readString()
            X.REn r1 = X.REn.valueOf(r1)
            r3.add(r1)
            int r2 = r2 + 1
            goto L_0x0ad7
        L_0x0ae7:
            int r5 = r0.readInt()
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>(r5)
            r4 = 0
        L_0x0af1:
            if (r4 == r5) goto L_0x0b01
            java.lang.String r1 = r0.readString()
            X.REi r1 = X.C8891REi.valueOf(r1)
            r2.add(r1)
            int r4 = r4 + 1
            goto L_0x0af1
        L_0x0b01:
            android.os.Parcelable$Creator r1 = com.facebookpay.expresscheckout.models.ECPPaymentConfiguration.CREATOR
            java.lang.Object r11 = r1.createFromParcel(r0)
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r11 = (com.facebookpay.expresscheckout.models.ECPPaymentConfiguration) r11
            java.lang.Class<com.facebookpay.expresscheckout.models.ECPAvailabilityRequestParams> r1 = com.facebookpay.expresscheckout.models.ECPAvailabilityRequestParams.class
            android.os.Parcelable r13 = X.C41847B3o.A03(r0, r1)
            com.facebookpay.logging.LoggingPolicy r13 = (com.facebookpay.logging.LoggingPolicy) r13
            boolean r21 = X.C41848B3p.A1X(r0)
            boolean r22 = X.C41848B3p.A1X(r0)
            boolean r23 = X.C41848B3p.A1X(r0)
            com.facebookpay.expresscheckout.models.ECPAvailabilityRequestParams r10 = new com.facebookpay.expresscheckout.models.ECPAvailabilityRequestParams
            r19 = r2
            r18 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r10
        L_0x0b27:
            int r1 = X.C41848B3p.A00(r0)
            if (r1 != 0) goto L_0x0b36
            r0 = 0
        L_0x0b2e:
            com.facebookpay.expresscheckout.models.DefaultCreditCardFields r0 = (com.facebookpay.expresscheckout.models.DefaultCreditCardFields) r0
            com.facebookpay.expresscheckout.models.DefaultPaymentMethodFields r10 = new com.facebookpay.expresscheckout.models.DefaultPaymentMethodFields
            r10.<init>(r0)
            return r10
        L_0x0b36:
            android.os.Parcelable$Creator r1 = com.facebookpay.expresscheckout.models.DefaultCreditCardFields.CREATOR
            java.lang.Object r0 = r1.createFromParcel(r0)
            goto L_0x0b2e
        L_0x0b3d:
            int r1 = X.C41848B3p.A00(r0)
            if (r1 != 0) goto L_0x0b4e
            r1 = 0
        L_0x0b44:
            java.lang.String r0 = r0.readString()
            com.facebookpay.expresscheckout.models.DefaultCreditCardFields r10 = new com.facebookpay.expresscheckout.models.DefaultCreditCardFields
            r10.<init>(r1, r0)
            return r10
        L_0x0b4e:
            java.lang.String r1 = r0.readString()
            X.RGo r1 = X.C8946RGo.valueOf(r1)
            goto L_0x0b44
        L_0x0b57:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            java.lang.String r0 = r0.readString()
            com.facebookpay.expresscheckout.models.CheckoutSetupKeyValue r10 = new com.facebookpay.expresscheckout.models.CheckoutSetupKeyValue
            r10.<init>(r1, r0)
            return r10
        L_0x0b65:
            java.lang.String r5 = X.C41848B3p.A1D(r0)
            int r1 = r0.readInt()
            r4 = 0
            if (r1 != 0) goto L_0x0b89
            r3 = r4
        L_0x0b71:
            java.lang.String r2 = r0.readString()
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x0b81
            android.os.Parcelable$Creator r1 = com.facebookpay.expresscheckout.models.ECPPaymentResponseParams.CREATOR
            java.lang.Object r4 = r1.createFromParcel(r0)
        L_0x0b81:
            com.facebookpay.expresscheckout.models.ECPPaymentResponseParams r4 = (com.facebookpay.expresscheckout.models.ECPPaymentResponseParams) r4
            com.facebookpay.expresscheckout.models.CheckoutResponse r10 = new com.facebookpay.expresscheckout.models.CheckoutResponse
            r10.<init>(r4, r3, r5, r2)
            return r10
        L_0x0b89:
            java.lang.String r1 = r0.readString()
            java.lang.Integer r3 = X.C11297SKg.A00(r1)
            goto L_0x0b71
        L_0x0b92:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            X.RGa r1 = X.C8932RGa.valueOf(r1)
            java.lang.String r0 = r0.readString()
            com.facebookpay.expresscheckout.models.CheckoutPayloadKeyValue r10 = new com.facebookpay.expresscheckout.models.CheckoutPayloadKeyValue
            r10.<init>(r1, r0)
            return r10
        L_0x0ba4:
            java.lang.String r24 = X.C41848B3p.A1D(r0)
            int r4 = r0.readInt()
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>(r4)
            r3 = 0
        L_0x0bb2:
            if (r3 == r4) goto L_0x0bc2
            java.lang.String r1 = r0.readString()
            X.REn r1 = X.REn.valueOf(r1)
            r2.add(r1)
            int r3 = r3 + 1
            goto L_0x0bb2
        L_0x0bc2:
            int r5 = r0.readInt()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>(r5)
            r4 = 0
        L_0x0bcc:
            if (r4 == r5) goto L_0x0bdc
            java.lang.String r3 = r0.readString()
            X.REi r3 = X.C8891REi.valueOf(r3)
            r1.add(r3)
            int r4 = r4 + 1
            goto L_0x0bcc
        L_0x0bdc:
            java.lang.String r25 = r0.readString()
            boolean r30 = X.C41848B3p.A1X(r0)
            int r3 = r0.readInt()
            r22 = 0
            if (r3 != 0) goto L_0x0ccd
            r12 = r22
        L_0x0bee:
            int r3 = r0.readInt()
            if (r3 != 0) goto L_0x0cc3
            r13 = r22
        L_0x0bf6:
            int r3 = r0.readInt()
            if (r3 != 0) goto L_0x0cb9
            r14 = r22
        L_0x0bfe:
            int r3 = r0.readInt()
            if (r3 != 0) goto L_0x0caf
            r15 = r22
        L_0x0c06:
            int r3 = r0.readInt()
            if (r3 != 0) goto L_0x0ca5
            r16 = r22
        L_0x0c0e:
            int r3 = r0.readInt()
            if (r3 != 0) goto L_0x0c9b
            r17 = r22
        L_0x0c16:
            java.lang.Class<com.facebookpay.expresscheckout.models.CheckoutConfiguration> r3 = com.facebookpay.expresscheckout.models.CheckoutConfiguration.class
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r3)
            com.facebookpay.expresscheckout.models.APMConfiguration r11 = (com.facebookpay.expresscheckout.models.APMConfiguration) r11
            java.lang.String r26 = r0.readString()
            int r3 = r0.readInt()
            if (r3 != 0) goto L_0x0c92
            r18 = r22
        L_0x0c2a:
            int r3 = r0.readInt()
            if (r3 != 0) goto L_0x0c89
            r19 = r22
        L_0x0c32:
            int r3 = r0.readInt()
            if (r3 != 0) goto L_0x0c80
            r23 = r22
        L_0x0c3a:
            int r3 = r0.readInt()
            if (r3 != 0) goto L_0x0c77
            r20 = r22
        L_0x0c42:
            int r29 = r0.readInt()
            boolean r31 = X.C41848B3p.A1X(r0)
            int r3 = r0.readInt()
            if (r3 != 0) goto L_0x0c6e
            r21 = r22
        L_0x0c52:
            boolean r32 = X.C41848B3p.A1X(r0)
            int r3 = r0.readInt()
            if (r3 == 0) goto L_0x0c64
            boolean r0 = X.Pxi.A1P(r0)
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r0)
        L_0x0c64:
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r10 = new com.facebookpay.expresscheckout.models.CheckoutConfiguration
            r27 = r2
            r28 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r10
        L_0x0c6e:
            boolean r3 = X.C41848B3p.A1X(r0)
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r3)
            goto L_0x0c52
        L_0x0c77:
            boolean r3 = X.C41848B3p.A1X(r0)
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r3)
            goto L_0x0c42
        L_0x0c80:
            java.lang.String r3 = r0.readString()
            java.lang.Integer r23 = X.C11084S9e.A00(r3)
            goto L_0x0c3a
        L_0x0c89:
            boolean r3 = X.C41848B3p.A1X(r0)
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r3)
            goto L_0x0c32
        L_0x0c92:
            boolean r3 = X.C41848B3p.A1X(r0)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r3)
            goto L_0x0c2a
        L_0x0c9b:
            boolean r3 = X.C41848B3p.A1X(r0)
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r3)
            goto L_0x0c16
        L_0x0ca5:
            boolean r3 = X.C41848B3p.A1X(r0)
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r3)
            goto L_0x0c0e
        L_0x0caf:
            boolean r3 = X.C41848B3p.A1X(r0)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r3)
            goto L_0x0c06
        L_0x0cb9:
            boolean r3 = X.C41848B3p.A1X(r0)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)
            goto L_0x0bfe
        L_0x0cc3:
            java.lang.String r3 = r0.readString()
            X.RGk r13 = X.C8942RGk.valueOf(r3)
            goto L_0x0bf6
        L_0x0ccd:
            java.lang.String r3 = r0.readString()
            X.RGk r12 = X.C8942RGk.valueOf(r3)
            goto L_0x0bee
        L_0x0cd7:
            int r0 = X.C41848B3p.A00(r0)
            com.facebookpay.expresscheckout.models.AuthScreenStyle r10 = new com.facebookpay.expresscheckout.models.AuthScreenStyle
            r10.<init>(r0)
            return r10
        L_0x0ce1:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            java.lang.String r1 = r0.readString()
            java.io.Serializable r0 = r0.readSerializable()
            com.google.common.collect.ImmutableMap r0 = (com.google.common.collect.ImmutableMap) r0
            com.facebookpay.expresscheckout.logging.ComponentLoggingData r10 = new com.facebookpay.expresscheckout.logging.ComponentLoggingData
            r10.<init>(r0, r2, r1)
            return r10
        L_0x0cf5:
            java.lang.String r5 = X.C41848B3p.A1D(r0)
            int r4 = r0.readInt()
            java.util.ArrayList r3 = X.DbS.A0v(r4)
            r2 = 0
        L_0x0d02:
            if (r2 == r4) goto L_0x0d0b
            android.os.Parcelable$Creator r1 = com.facebookpay.confirmation.model.ECPConfirmationUpsellAction.CREATOR
            int r2 = X.JTT.A04(r0, r1, r3, r2)
            goto L_0x0d02
        L_0x0d0b:
            com.facebookpay.confirmation.model.ECPConfirmationUpsellSection r10 = new com.facebookpay.confirmation.model.ECPConfirmationUpsellSection
            r10.<init>(r5, r3)
            return r10
        L_0x0d11:
            java.lang.String r11 = X.C41848B3p.A1D(r0)
            java.lang.String r12 = r0.readString()
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            com.facebookpay.confirmation.model.ECPConfirmationUpsellAction r10 = new com.facebookpay.confirmation.model.ECPConfirmationUpsellAction
            r10.<init>(r11, r12, r13, r14, r15)
            return r10
        L_0x0d2b:
            java.lang.String r12 = X.C41848B3p.A1D(r0)
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0d52
            r11 = 0
        L_0x0d46:
            com.facebookpay.confirmation.model.ECPConfirmationUpsellSection r11 = (com.facebookpay.confirmation.model.ECPConfirmationUpsellSection) r11
            java.lang.String r17 = r0.readString()
            com.facebookpay.confirmation.model.ECPConfirmationParams r10 = new com.facebookpay.confirmation.model.ECPConfirmationParams
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            return r10
        L_0x0d52:
            android.os.Parcelable$Creator r1 = com.facebookpay.confirmation.model.ECPConfirmationUpsellSection.CREATOR
            java.lang.Object r11 = r1.createFromParcel(r0)
            goto L_0x0d46
        L_0x0d59:
            X.RH6 r3 = X.Pxj.A0W(r0)
            java.lang.String r2 = r0.readString()
            java.lang.Integer r1 = X.JTU.A0U(r0)
            boolean r0 = X.C41848B3p.A1X(r0)
            com.facebookpay.common.recyclerview.adapteritems.SelectionTextViewItem r10 = new com.facebookpay.common.recyclerview.adapteritems.SelectionTextViewItem
            r10.<init>(r3, r1, r2, r0)
            return r10
        L_0x0d6f:
            X.RH6 r12 = X.Pxj.A0W(r0)
            java.lang.String r1 = r0.readString()
            java.lang.Integer r13 = X.S9Z.A00(r1)
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            java.lang.Class<com.facebookpay.common.recyclerview.adapteritems.SelectionShippingFulfillmentOptionItem> r1 = com.facebookpay.common.recyclerview.adapteritems.SelectionShippingFulfillmentOptionItem.class
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r1)
            com.facebookpay.common.models.CurrencyAmount r11 = (com.facebookpay.common.models.CurrencyAmount) r11
            java.lang.String r16 = r0.readString()
            java.io.Serializable r1 = r0.readSerializable()
            java.util.Date r1 = (java.util.Date) r1
            java.io.Serializable r0 = r0.readSerializable()
            java.util.Date r0 = (java.util.Date) r0
            com.facebookpay.common.recyclerview.adapteritems.SelectionShippingFulfillmentOptionItem r10 = new com.facebookpay.common.recyclerview.adapteritems.SelectionShippingFulfillmentOptionItem
            r17 = r1
            r18 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return r10
        L_0x0da5:
            X.RH6 r11 = X.Pxj.A0W(r0)
            java.lang.String r1 = r0.readString()
            java.lang.Integer r12 = X.S9Z.A00(r1)
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            java.lang.String r17 = r0.readString()
            java.lang.String r18 = r0.readString()
            java.lang.String r19 = r0.readString()
            java.lang.String r20 = r0.readString()
            java.lang.String r21 = r0.readString()
            java.lang.String r22 = r0.readString()
            java.lang.String r23 = r0.readString()
            java.lang.String r24 = r0.readString()
            java.lang.String r25 = r0.readString()
            int r1 = r0.readInt()
            r2 = 0
            if (r1 != 0) goto L_0x0e14
            r13 = r2
        L_0x0de9:
            java.lang.String r26 = r0.readString()
            boolean r29 = X.C41848B3p.A1X(r0)
            java.lang.String r27 = r0.readString()
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x0e19
            int r4 = r0.readInt()
            java.util.ArrayList r2 = X.DbS.A0v(r4)
            r1 = 0
        L_0x0e04:
            if (r1 == r4) goto L_0x0e19
            java.lang.String r3 = r0.readString()
            X.RFK r3 = X.RFK.valueOf(r3)
            r2.add(r3)
            int r1 = r1 + 1
            goto L_0x0e04
        L_0x0e14:
            java.lang.Integer r13 = X.C41847B3o.A12(r0)
            goto L_0x0de9
        L_0x0e19:
            com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem r10 = new com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem
            r28 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r10
        L_0x0e21:
            X.RH6 r1 = X.Pxj.A0W(r0)
            java.lang.String r0 = r0.readString()
            com.facebookpay.common.recyclerview.adapteritems.SelectionPromoCodeViewItem r10 = new com.facebookpay.common.recyclerview.adapteritems.SelectionPromoCodeViewItem
            r10.<init>(r1, r0)
            return r10
        L_0x0e2f:
            X.RH6 r13 = X.Pxj.A0W(r0)
            java.lang.String r1 = r0.readString()
            java.lang.Integer r16 = X.S9Z.A00(r1)
            java.lang.String r17 = r0.readString()
            java.lang.String r18 = r0.readString()
            java.lang.Class<com.facebookpay.common.recyclerview.adapteritems.SelectionPickupFulfillmentOptionItem> r4 = com.facebookpay.common.recyclerview.adapteritems.SelectionPickupFulfillmentOptionItem.class
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r4)
            com.facebookpay.common.models.CurrencyAmount r11 = (com.facebookpay.common.models.CurrencyAmount) r11
            java.lang.String r19 = r0.readString()
            java.io.Serializable r3 = r0.readSerializable()
            java.util.Date r3 = (java.util.Date) r3
            java.io.Serializable r2 = r0.readSerializable()
            java.util.Date r2 = (java.util.Date) r2
            android.os.Parcelable r14 = X.C41847B3o.A03(r0, r4)
            com.facebookpay.shippingaddress.model.ShippingAddress r14 = (com.facebookpay.shippingaddress.model.ShippingAddress) r14
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0e7c
            r15 = 0
        L_0x0e68:
            android.os.Parcelable r12 = X.C41847B3o.A03(r0, r4)
            com.facebookpay.common.models.Distance r12 = (com.facebookpay.common.models.Distance) r12
            boolean r22 = X.C41848B3p.A1X(r0)
            com.facebookpay.common.recyclerview.adapteritems.SelectionPickupFulfillmentOptionItem r10 = new com.facebookpay.common.recyclerview.adapteritems.SelectionPickupFulfillmentOptionItem
            r20 = r3
            r21 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r10
        L_0x0e7c:
            boolean r1 = X.C41848B3p.A1X(r0)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r1)
            goto L_0x0e68
        L_0x0e85:
            X.RH6 r11 = X.Pxj.A0W(r0)
            java.lang.String r1 = r0.readString()
            java.lang.Integer r12 = X.S9Z.A00(r1)
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            int r1 = r0.readInt()
            boolean r17 = X.AnonymousClass7TF.A1P(r1)
            boolean r18 = X.Pxi.A1P(r0)
            java.lang.String r16 = r0.readString()
            com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem r10 = new com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return r10
        L_0x0eb3:
            X.RH6 r12 = X.Pxj.A0W(r0)
            java.lang.String r1 = r0.readString()
            java.lang.Integer r17 = X.S9Z.A00(r1)
            java.lang.String r20 = r0.readString()
            java.lang.String r21 = r0.readString()
            java.lang.String r22 = r0.readString()
            int r1 = r0.readInt()
            r19 = 0
            if (r1 != 0) goto L_0x0f3c
            r15 = r19
        L_0x0ed5:
            java.lang.String r23 = r0.readString()
            java.lang.String r24 = r0.readString()
            java.lang.Class<com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem> r2 = com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem.class
            java.lang.Object r13 = X.Pxi.A0U(r0, r2)
            X.TlY r13 = (X.C13930TlY) r13
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0f33
            r16 = r19
        L_0x0eed:
            java.lang.String r25 = r0.readString()
            java.lang.Integer r18 = X.Dbc.A0C(r0)
            java.lang.Object r11 = X.Pxi.A0U(r0, r2)
            X.QRJ r11 = (X.QRJ) r11
            java.lang.String r1 = r0.readString()
            X.XRm r14 = X.C21267XRm.valueOf(r1)
            java.lang.String r26 = r0.readString()
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x0f11
            java.lang.Integer r19 = X.C41847B3o.A12(r0)
        L_0x0f11:
            boolean r29 = X.C41848B3p.A1X(r0)
            boolean r30 = X.C41848B3p.A1X(r0)
            boolean r31 = X.C41848B3p.A1X(r0)
            java.lang.String r27 = r0.readString()
            java.lang.String r28 = r0.readString()
            boolean r32 = X.C41848B3p.A1X(r0)
            boolean r33 = X.C41848B3p.A1X(r0)
            com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem r10 = new com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            return r10
        L_0x0f33:
            java.lang.String r1 = r0.readString()
            X.RGo r16 = X.C8946RGo.valueOf(r1)
            goto L_0x0eed
        L_0x0f3c:
            java.lang.String r1 = r0.readString()
            X.RGd r15 = X.C8935RGd.valueOf(r1)
            goto L_0x0ed5
        L_0x0f45:
            X.RH6 r11 = X.Pxj.A0W(r0)
            java.lang.String r12 = r0.readString()
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            boolean r17 = X.C41848B3p.A1X(r0)
            com.facebookpay.common.recyclerview.adapteritems.SelectionOfferViewItem r10 = new com.facebookpay.common.recyclerview.adapteritems.SelectionOfferViewItem
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            return r10
        L_0x0f67:
            X.RH6 r11 = X.Pxj.A0W(r0)
            java.lang.String r1 = r0.readString()
            java.lang.Integer r12 = X.S9Z.A00(r1)
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            com.facebookpay.common.recyclerview.adapteritems.SelectionNameViewItem r10 = new com.facebookpay.common.recyclerview.adapteritems.SelectionNameViewItem
            r10.<init>(r11, r12, r13, r14, r15)
            return r10
        L_0x0f85:
            X.RH6 r12 = X.Pxj.A0W(r0)
            java.lang.Class<com.facebookpay.common.recyclerview.adapteritems.SelectionIncentiveEmbeddedBloksItem> r8 = com.facebookpay.common.recyclerview.adapteritems.SelectionIncentiveEmbeddedBloksItem.class
            java.lang.Object r11 = X.Pxi.A0U(r0, r8)
            X.TlT r11 = (X.C13925TlT) r11
            int r7 = r0.readInt()
            java.util.ArrayList r13 = X.DbS.A0v(r7)
            r6 = 0
        L_0x0f9a:
            if (r6 == r7) goto L_0x0fbb
            int r5 = r0.readInt()
            java.util.LinkedHashMap r4 = X.DbS.A0x(r5)
            r3 = 0
        L_0x0fa5:
            if (r3 == r5) goto L_0x0fb5
            java.lang.String r2 = r0.readString()
            java.lang.Object r1 = X.Pxi.A0U(r0, r8)
            r4.put(r2, r1)
            int r3 = r3 + 1
            goto L_0x0fa5
        L_0x0fb5:
            r13.add(r4)
            int r6 = r6 + 1
            goto L_0x0f9a
        L_0x0fbb:
            java.util.ArrayList r14 = r0.createStringArrayList()
            java.io.Serializable r15 = r0.readSerializable()
            X.0sP r15 = (X.0sP) r15
            java.io.Serializable r1 = r0.readSerializable()
            X.0sP r1 = (X.0sP) r1
            boolean r17 = X.C41848B3p.A1X(r0)
            com.facebookpay.common.recyclerview.adapteritems.SelectionIncentiveEmbeddedBloksItem r10 = new com.facebookpay.common.recyclerview.adapteritems.SelectionIncentiveEmbeddedBloksItem
            r16 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            return r10
        L_0x0fd7:
            X.RH6 r11 = X.Pxj.A0W(r0)
            java.lang.String r14 = r0.readString()
            java.lang.Integer r12 = X.JTU.A0U(r0)
            java.lang.String r15 = r0.readString()
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = "CREDENTIAL_TYPE_HEADER"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0ffb
            java.lang.Integer r13 = X.AnonymousClass05K.A00
        L_0x0ff5:
            com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem r10 = new com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem
            r10.<init>(r11, r12, r13, r14, r15)
            return r10
        L_0x0ffb:
            java.lang.String r0 = "SECTION_HEADER"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x1006
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            goto L_0x0ff5
        L_0x1006:
            java.lang.String r0 = "ACCORDION_HEADER"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x1011
            java.lang.Integer r13 = X.AnonymousClass05K.A0C
            goto L_0x0ff5
        L_0x1011:
            java.lang.String r0 = "ACCORDION_HEADER_NO_RIGHT_ADDON"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x101c
            java.lang.Integer r13 = X.AnonymousClass05K.A0N
            goto L_0x0ff5
        L_0x101c:
            java.lang.String r0 = "PICKUP_CONTACT_HEADER"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x1027
            java.lang.Integer r13 = X.AnonymousClass05K.A0Y
            goto L_0x0ff5
        L_0x1027:
            java.lang.String r0 = "ORDER_SUMMARY_HEADER_WITH_PICKUP"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x1032
            java.lang.Integer r13 = X.AnonymousClass05K.A0j
            goto L_0x0ff5
        L_0x1032:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r1)
            throw r0
        L_0x1037:
            X.RH6 r12 = X.Pxj.A0W(r0)
            java.lang.String r1 = r0.readString()
            java.lang.Integer r13 = X.S9Z.A00(r1)
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            java.lang.Class<com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem> r1 = com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem.class
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r1)
            com.facebookpay.common.models.CurrencyAmount r11 = (com.facebookpay.common.models.CurrencyAmount) r11
            java.lang.String r16 = r0.readString()
            com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem r10 = new com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem
            r10.<init>(r11, r12, r13, r14, r15, r16)
            return r10
        L_0x105d:
            X.RH6 r11 = X.Pxj.A0W(r0)
            java.lang.String r1 = r0.readString()
            java.lang.Integer r12 = X.S9Z.A00(r1)
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            int r1 = r0.readInt()
            boolean r17 = X.AnonymousClass7TF.A1P(r1)
            boolean r18 = X.Pxi.A1P(r0)
            java.lang.String r16 = r0.readString()
            com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem r10 = new com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return r10
        L_0x108b:
            X.RH6 r11 = X.Pxj.A0W(r0)
            int r1 = r0.readInt()
            r13 = 0
            if (r1 != 0) goto L_0x10af
            r12 = r13
        L_0x1097:
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x10a9
            java.lang.Integer r13 = X.C41847B3o.A12(r0)
        L_0x10a9:
            com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem r10 = new com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem
            r10.<init>(r11, r12, r13, r14, r15)
            return r10
        L_0x10af:
            java.lang.Integer r12 = X.C41847B3o.A12(r0)
            goto L_0x1097
        L_0x10b4:
            X.RH6 r15 = X.Pxj.A0W(r0)
            java.lang.String r16 = r0.readString()
            java.lang.Class<com.facebookpay.common.recyclerview.adapteritems.PuxTermsConditionItem> r5 = com.facebookpay.common.recyclerview.adapteritems.PuxTermsConditionItem.class
            java.lang.Object r11 = X.Pxi.A0U(r0, r5)
            X.C7X r11 = (X.C7X) r11
            java.lang.String r17 = r0.readString()
            java.util.ArrayList r18 = r0.createStringArrayList()
            java.lang.Object r12 = X.Pxi.A0U(r0, r5)
            X.C7X r12 = (X.C7X) r12
            java.lang.Object r13 = X.Pxi.A0U(r0, r5)
            X.C7X r13 = (X.C7X) r13
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x10f1
            r4 = 0
        L_0x10df:
            java.lang.Object r14 = X.Pxi.A0U(r0, r5)
            X.C7X r14 = (X.C7X) r14
            boolean r20 = X.C41848B3p.A1X(r0)
            com.facebookpay.common.recyclerview.adapteritems.PuxTermsConditionItem r10 = new com.facebookpay.common.recyclerview.adapteritems.PuxTermsConditionItem
            r19 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r10
        L_0x10f1:
            int r3 = r0.readInt()
            java.util.ArrayList r4 = X.DbS.A0v(r3)
            r2 = 0
        L_0x10fa:
            if (r2 == r3) goto L_0x10df
            java.lang.Object r1 = X.Pxi.A0U(r0, r5)
            r4.add(r1)
            int r2 = r2 + 1
            goto L_0x10fa
        L_0x1106:
            X.RH6 r11 = X.Pxj.A0W(r0)
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            java.lang.Class<com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem> r1 = com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem.class
            android.os.Parcelable r12 = X.C41847B3o.A03(r0, r1)
            com.facebookpay.shippingaddress.model.ShippingAddress r12 = (com.facebookpay.shippingaddress.model.ShippingAddress) r12
            boolean r16 = X.C41848B3p.A1X(r0)
            com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem r10 = new com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem
            r10.<init>(r11, r12, r13, r14, r15, r16)
            return r10
        L_0x1128:
            X.RH6 r2 = X.Pxj.A0W(r0)
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = r0.readString()
            com.facebookpay.common.recyclerview.adapteritems.PuxReceiverHeaderItem r10 = new com.facebookpay.common.recyclerview.adapteritems.PuxReceiverHeaderItem
            r10.<init>(r2, r1, r0)
            return r10
        L_0x113a:
            X.RH6 r7 = X.Pxj.A0W(r0)
            int r1 = r0.readInt()
            r6 = 0
            if (r1 != 0) goto L_0x1167
            r5 = r6
        L_0x1146:
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x1154
            java.lang.String r1 = r0.readString()
            java.lang.Integer r6 = X.C11084S9e.A00(r1)
        L_0x1154:
            int r4 = r0.readInt()
            java.util.ArrayList r3 = X.DbS.A0v(r4)
            r2 = 0
        L_0x115d:
            if (r2 == r4) goto L_0x1170
            java.lang.Class<com.facebookpay.common.recyclerview.adapteritems.PuxPriceTableItem> r1 = com.facebookpay.common.recyclerview.adapteritems.PuxPriceTableItem.class
            X.C41848B3p.A1J(r0, r1, r3)
            int r2 = r2 + 1
            goto L_0x115d
        L_0x1167:
            java.lang.String r1 = r0.readString()
            java.lang.Integer r5 = X.C11085S9f.A00(r1)
            goto L_0x1146
        L_0x1170:
            com.facebookpay.common.recyclerview.adapteritems.PuxPriceTableItem r10 = new com.facebookpay.common.recyclerview.adapteritems.PuxPriceTableItem
            r10.<init>(r7, r5, r6, r3)
            return r10
        L_0x1176:
            X.RH6 r11 = X.Pxj.A0W(r0)
            java.lang.Class<com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem> r1 = com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem.class
            android.os.Parcelable r12 = X.C41847B3o.A03(r0, r1)
            com.facebookpay.paymentmethod.model.PaymentMethod r12 = (com.facebookpay.paymentmethod.model.PaymentMethod) r12
            boolean r14 = X.C41848B3p.A1X(r0)
            java.lang.Integer r13 = X.JTU.A0U(r0)
            boolean r15 = X.C41848B3p.A1X(r0)
            com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem r10 = new com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem
            r10.<init>(r11, r12, r13, r14, r15)
            return r10
        L_0x1194:
            X.RH6 r13 = X.Pxj.A0W(r0)
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            java.util.ArrayList r17 = r0.createStringArrayList()
            int r18 = r0.readInt()
            java.lang.Class<com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem> r1 = com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem.class
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r1)
            com.facebookpay.common.models.CurrencyAmount r11 = (com.facebookpay.common.models.CurrencyAmount) r11
            android.os.Parcelable r12 = X.C41847B3o.A03(r0, r1)
            com.facebookpay.common.models.CurrencyAmount r12 = (com.facebookpay.common.models.CurrencyAmount) r12
            boolean r19 = X.C41848B3p.A1X(r0)
            boolean r20 = X.C41848B3p.A1X(r0)
            boolean r21 = X.C41848B3p.A1X(r0)
            android.os.Parcelable r14 = X.C41847B3o.A03(r0, r1)
            com.facebookpay.expresscheckout.models.ItemDetails r14 = (com.facebookpay.expresscheckout.models.ItemDetails) r14
            com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem r10 = new com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r10
        L_0x11ce:
            X.RH6 r11 = X.Pxj.A0W(r0)
            java.lang.Class<com.facebookpay.common.recyclerview.adapteritems.PuxFulfillmentOptionItem> r1 = com.facebookpay.common.recyclerview.adapteritems.PuxFulfillmentOptionItem.class
            android.os.Parcelable r12 = X.C41847B3o.A03(r0, r1)
            com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent r12 = (com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent) r12
            int r1 = r0.readInt()
            boolean r15 = X.AnonymousClass7TF.A1P(r1)
            boolean r16 = X.Pxi.A1P(r0)
            int r1 = r0.readInt()
            r14 = 0
            if (r1 != 0) goto L_0x1202
            r13 = r14
        L_0x11ee:
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x11fc
            java.lang.String r0 = r0.readString()
            java.lang.Integer r14 = X.C11084S9e.A00(r0)
        L_0x11fc:
            com.facebookpay.common.recyclerview.adapteritems.PuxFulfillmentOptionItem r10 = new com.facebookpay.common.recyclerview.adapteritems.PuxFulfillmentOptionItem
            r10.<init>(r11, r12, r13, r14, r15, r16)
            return r10
        L_0x1202:
            java.lang.String r1 = r0.readString()
            java.lang.Integer r13 = X.C11085S9f.A00(r1)
            goto L_0x11ee
        L_0x120b:
            X.RH6 r12 = X.Pxj.A0W(r0)
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            java.lang.Class<com.facebookpay.common.recyclerview.adapteritems.PuxEntityItem> r1 = com.facebookpay.common.recyclerview.adapteritems.PuxEntityItem.class
            android.os.Parcelable r13 = X.C41847B3o.A03(r0, r1)
            com.facebookpay.expresscheckout.models.ItemDetails r13 = (com.facebookpay.expresscheckout.models.ItemDetails) r13
            java.lang.String r17 = r0.readString()
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r1)
            com.facebookpay.common.models.CurrencyAmount r11 = (com.facebookpay.common.models.CurrencyAmount) r11
            java.lang.String r18 = r0.readString()
            com.facebookpay.common.recyclerview.adapteritems.PuxEntityItem r10 = new com.facebookpay.common.recyclerview.adapteritems.PuxEntityItem
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return r10
        L_0x1237:
            X.RH6 r11 = X.Pxj.A0W(r0)
            java.lang.Integer r12 = X.JTU.A0U(r0)
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            boolean r18 = X.C41848B3p.A1X(r0)
            java.lang.String r17 = r0.readString()
            com.facebookpay.common.recyclerview.adapteritems.PuxContactItem r10 = new com.facebookpay.common.recyclerview.adapteritems.PuxContactItem
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return r10
        L_0x125d:
            com.facebookpay.form.cell.text.formatter.UpperCaseFormatter r10 = new com.facebookpay.form.cell.text.formatter.UpperCaseFormatter
            r10.<init>()
            return r10
        L_0x1263:
            com.facebookpay.form.cell.text.formatter.NameFormatter r10 = new com.facebookpay.form.cell.text.formatter.NameFormatter
            r10.<init>()
            return r10
        L_0x1269:
            com.facebookpay.form.cell.text.formatter.DateFormatter r10 = new com.facebookpay.form.cell.text.formatter.DateFormatter
            r10.<init>()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SWV.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new PuxContactItem[i];
            case 1:
                return new PuxEntityItem[i];
            case 2:
                return new PuxFulfillmentOptionItem[i];
            case 3:
                return new PuxOrderSummaryItem[i];
            case 4:
                return new PuxPaymentMethodItem[i];
            case 5:
                return new PuxPriceTableItem[i];
            case 6:
                return new PuxReceiverHeaderItem[i];
            case 7:
                return new PuxShippingAddressItem[i];
            case 8:
                return new PuxTermsConditionItem[i];
            case 9:
                return new SelectionActionViewItem[i];
            case 10:
                return new SelectionEmailViewItem[i];
            case 11:
                return new SelectionFulfillmentOptionItem[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new SelectionHeaderItem[i];
            case 13:
                return new SelectionIncentiveEmbeddedBloksItem[i];
            case 14:
                return new SelectionNameViewItem[i];
            case 15:
                return new SelectionOfferViewItem[i];
            case 16:
                return new SelectionPaymentMethodItem[i];
            case 17:
                return new SelectionPhoneNumberViewItem[i];
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                return new SelectionPickupFulfillmentOptionItem[i];
            case 19:
                return new SelectionPromoCodeViewItem[i];
            case 20:
                return new SelectionShippingAddressItem[i];
            case 21:
                return new SelectionShippingFulfillmentOptionItem[i];
            case 22:
                return new SelectionTextViewItem[i];
            case 23:
                return new ECPConfirmationParams[i];
            case 24:
                return new ECPConfirmationUpsellAction[i];
            case 25:
                return new ECPConfirmationUpsellSection[i];
            case 26:
                return new ComponentLoggingData[i];
            case 27:
                return new AuthScreenStyle[i];
            case 28:
                return new CheckoutConfiguration[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return new CheckoutPayloadKeyValue[i];
            case 30:
                return new CheckoutResponse[i];
            case 31:
                return new CheckoutSetupKeyValue[i];
            case 32:
                return new DefaultCreditCardFields[i];
            case 33:
                return new DefaultPaymentMethodFields[i];
            case 34:
                return new ECPAvailabilityRequestParams[i];
            case 35:
                return new ECPAvailabilityResponseParams[i];
            case 36:
                return new ECPConfirmationConfiguration[i];
            case 37:
                return new ECPOffer[i];
            case 38:
                return new ECPPaymentConfiguration[i];
            case 39:
                return new ECPPaymentRequest[i];
            case 40:
                return new ECPPaymentResponseParams[i];
            case Seq.NULL_REFNUM /*41*/:
                return new ECPPreselectedFBPayData[i];
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return new EcpNuxLearnMoreScreenStyle[i];
            case 43:
                return new EcpUIConfiguration[i];
            case 44:
                return new FulfillmentOption[i];
            case 45:
                return new FulfillmentOptions[i];
            case 46:
                return new ItemDetails[i];
            case 47:
                return new KnownData[i];
            case 48:
                return new OffersList[i];
            case 49:
                return new PaymentHandledResponseData[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return new PaymentReceiverInfo[i];
            case 51:
                return new PickupFulfillmentOption[i];
            case 52:
                return new PickupInfo[i];
            case 53:
                return new PriceInfo[i];
            case 54:
                return new PromoCodeList[i];
            case 55:
                return new ShippingOption[i];
            case 56:
                return new ShippingOptions[i];
            case 57:
                return new TransactionInfo[i];
            case 58:
                return new AddressCellParams[i];
            case 59:
                return new BriefAddressCellParams[i];
            case 60:
                return new AddressListCellParams[i];
            case 61:
                return new AddressListHeaderCellParams[i];
            case 62:
                return new APMLinkCellParams[i];
            case 63:
                return new CheckboxCellParams[i];
            case 64:
                return new ContactInfoCellParams[i];
            case 65:
                return new CardScannerCellParams[i];
            case 66:
                return new CreditCardCellParams[i];
            case 67:
                return new FulfillmentOptionCellParams[i];
            case 68:
                return new LabelCellParams[i];
            case 69:
                return new PaymentMethodLabelCellParams[i];
            case 70:
                return new SupportedLogosCellParams[i];
            case 71:
                return new FormCellFocusEvents[i];
            case 72:
                return new FormCellLoggingEvents[i];
            case 75:
                return new TextCellParams[i];
            case 76:
                return new TextValidatorParams[i];
            case 77:
                return new CreditCardFormatter[i];
            case 78:
                return new DateFormatter[i];
            case 79:
                return new NameFormatter[i];
            case 80:
                return new PhoneFormatter[i];
            case 81:
                return new UpperCaseFormatter[i];
            case 82:
                return new CvvTextFieldHandler[i];
            case 83:
                return new SwitchCellParams[i];
            case 84:
                return new FeatureConfiguration[i];
            case 85:
                return new FormClickEvent[i];
            case 86:
                return new FormDisplayEvent[i];
            case 87:
                return new FormLoggingEvents[i];
            case 88:
                return new FormMutationEvent[i];
            case 89:
                return new FormParams[i];
            case 90:
                return new ListCellParams[i];
            case 91:
                return new AddressFormFieldsConfig[i];
            case 92:
                return new CardFormFieldConfig[i];
            case 93:
                return new FormCountry[i];
            case 94:
                return new FormField[i];
            case 95:
                return new FulfillmentOptionComponent[i];
            case 96:
                return new PickupFulfillmentOptionComponent[i];
            case 97:
                return new ShippingFulfillmentOptionComponent[i];
            case 98:
                return new ECPOffsiteOffer[i];
            case 99:
                return new ECPOnsiteOffer[i];
            default:
                return new SelectorCellParams[i];
        }
    }
}
