package com.facebookpay.form.cell;

import X.AnonymousClass7TF;
import X.C10782Ry3;
import X.C11088S9j;
import X.C249803kO;
import X.C298455tS;
import X.C298465tT;
import X.C41847B3o;
import X.C66580MXl;
import X.C8030Qfa;
import X.C8031Qfb;
import X.C8032Qfc;
import X.C8033Qfd;
import X.C8034Qfe;
import X.C8035Qff;
import X.C8036Qfg;
import X.C8037Qfh;
import X.C8038Qfi;
import X.C8039Qfj;
import X.C8040Qfk;
import X.C8041Qfl;
import X.C8042Qfm;
import X.C8043Qfn;
import X.C8044Qfo;
import X.C8048Qfv;
import X.C8946RGo;
import X.DbZ;
import X.Pxe;
import X.REC;
import X.S4U;
import X.SRc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.locale.Country;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.form.cell.address.AddressCellParams;
import com.facebookpay.form.cell.address.BriefAddressCellParams;
import com.facebookpay.form.cell.addresslist.AddressListCellParams;
import com.facebookpay.form.cell.addresslist.AddressListHeaderCellParams;
import com.facebookpay.form.cell.apm.APMLinkCellParams;
import com.facebookpay.form.cell.card.CardCellParams;
import com.facebookpay.form.cell.checkbox.CheckboxCellParams;
import com.facebookpay.form.cell.contactinfo.ContactInfoCellParams;
import com.facebookpay.form.cell.creditcard.CardScannerCellParams;
import com.facebookpay.form.cell.creditcard.CreditCardCellParams;
import com.facebookpay.form.cell.fulfillmentoption.FulfillmentOptionCellParams;
import com.facebookpay.form.cell.label.LabelCellParams;
import com.facebookpay.form.cell.label.paymentmethod.PaymentMethodLabelCellParams;
import com.facebookpay.form.cell.label.paymentmethod.SupportedLogosCellParams;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.facebookpay.form.cell.selector.CountrySelectorCellParams;
import com.facebookpay.form.cell.selector.SelectorCellParams;
import com.facebookpay.form.cell.text.TextCellParams;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.facebookpay.form.cell.text.util.TextFieldHandler;
import com.facebookpay.form.cell.toggle.SwitchCellParams;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.logging.LoggingContext;
import com.fbpay.theme.FBPayIcon;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Map;

public abstract class CellParams implements Parcelable {
    public SRc A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final FormCellLoggingEvents A04;
    public final boolean A05;
    public final boolean A06;

    public CellParams(FormCellLoggingEvents formCellLoggingEvents, float f, int i, int i2, boolean z, boolean z2) {
        this.A03 = 0;
        this.A02 = i;
        this.A06 = true;
        this.A05 = true;
        this.A01 = 1.0f;
        this.A04 = null;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [X.Q9z] */
    /* JADX WARNING: type inference failed for: r3v3, types: [android.widget.LinearLayout] */
    /* JADX WARNING: type inference failed for: r3v4, types: [android.widget.LinearLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r3v5, types: [X.QgI] */
    /* JADX WARNING: type inference failed for: r3v6, types: [X.Qfu] */
    /* JADX WARNING: type inference failed for: r3v9, types: [X.TdT] */
    /* JADX WARNING: type inference failed for: r3v14, types: [android.widget.FrameLayout] */
    /* JADX WARNING: type inference failed for: r3v16, types: [X.QA0] */
    /* JADX WARNING: type inference failed for: r3v17, types: [X.QA0] */
    /* JADX WARNING: type inference failed for: r3v18, types: [android.widget.FrameLayout] */
    /* JADX WARNING: type inference failed for: r3v19, types: [X.QgH] */
    /* JADX WARNING: type inference failed for: r3v20, types: [X.QgG] */
    /* JADX WARNING: type inference failed for: r3v23, types: [X.QAR] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C13601TdT A00(android.content.Context r5) {
        /*
            r4 = this;
            r1 = 0
            r0 = -2
            android.widget.TableRow$LayoutParams r2 = new android.widget.TableRow$LayoutParams
            r2.<init>(r1, r0)
            float r0 = r4.A01
            r2.weight = r0
            r1 = r4
            boolean r0 = r4 instanceof com.facebookpay.form.cell.toggle.SwitchCellParams
            if (r0 == 0) goto L_0x0021
            X.QAR r3 = new X.QAR
            r3.<init>(r5)
        L_0x0015:
            r3.setLayoutParams(r2)
        L_0x0018:
            X.SRc r0 = r4.A00
            r0.getClass()
            r3.setViewModel(r0)
            return r3
        L_0x0021:
            boolean r0 = r4 instanceof com.facebookpay.form.cell.selector.SelectorCellParams
            if (r0 == 0) goto L_0x002e
            X.AnonymousClass7TG.A1N(r5, r2)
            X.QgG r3 = new X.QgG
            r3.<init>(r5)
            goto L_0x0015
        L_0x002e:
            boolean r0 = r4 instanceof com.facebookpay.form.cell.selector.CountrySelectorCellParams
            if (r0 == 0) goto L_0x003b
            X.AnonymousClass7TG.A1N(r5, r2)
            X.QgH r3 = new X.QgH
            r3.<init>(r5)
            goto L_0x0015
        L_0x003b:
            boolean r0 = r4 instanceof com.facebookpay.form.cell.label.paymentmethod.SupportedLogosCellParams
            if (r0 == 0) goto L_0x0048
            X.AnonymousClass7TG.A1N(r5, r2)
            X.Q9f r3 = new X.Q9f
            r3.<init>(r5)
            goto L_0x0015
        L_0x0048:
            boolean r0 = r4 instanceof com.facebookpay.form.cell.label.LabelCellParams
            if (r0 == 0) goto L_0x0068
            com.facebookpay.form.cell.label.LabelCellParams r1 = (com.facebookpay.form.cell.label.LabelCellParams) r1
            boolean r0 = r1 instanceof com.facebookpay.form.cell.label.paymentmethod.PaymentMethodLabelCellParams
            if (r0 == 0) goto L_0x0060
            X.AnonymousClass7TG.A1N(r5, r2)
            int r0 = r1.A04
            X.Qfq r3 = new X.Qfq
            r3.<init>(r5, r0)
        L_0x005c:
            r3.setLayoutParams(r2)
            goto L_0x0018
        L_0x0060:
            int r0 = r1.A04
            X.QA0 r3 = new X.QA0
            r3.<init>(r5, r0)
            goto L_0x005c
        L_0x0068:
            boolean r0 = r4 instanceof com.facebookpay.form.cell.fulfillmentoption.FulfillmentOptionCellParams
            if (r0 == 0) goto L_0x0075
            X.AnonymousClass7TG.A1N(r5, r2)
            X.Q9g r3 = new X.Q9g
            r3.<init>(r5)
            goto L_0x0015
        L_0x0075:
            boolean r0 = r4 instanceof com.facebookpay.form.cell.creditcard.CreditCardCellParams
            if (r0 == 0) goto L_0x0092
            com.facebookpay.form.cell.creditcard.CreditCardCellParams r1 = (com.facebookpay.form.cell.creditcard.CreditCardCellParams) r1
            X.AnonymousClass7TG.A1N(r5, r2)
            X.QgJ r3 = new X.QgJ
            r3.<init>(r5)
            r3.setLayoutParams(r2)
            X.REP r2 = r1.A04
            if (r2 == 0) goto L_0x0018
            X.SQz r1 = X.C9972RkR.A00
            r0 = 22
            r1.A03(r5, r3, r2, r0)
            goto L_0x0018
        L_0x0092:
            boolean r0 = r4 instanceof com.facebookpay.form.cell.creditcard.CardScannerCellParams
            if (r0 == 0) goto L_0x00b3
            X.AnonymousClass7TG.A1N(r5, r2)
            X.Q9x r1 = new X.Q9x
            r1.<init>(r5)
            r0 = 2131625244(0x7f0e051c, float:1.887769E38)
            android.view.View.inflate(r5, r0, r1)
            X.SPB r2 = X.AnonymousClass2E0.A0A()
            r1 = 8
            r0 = 5
            r2.A05(r5, r1, r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00b3:
            boolean r0 = r4 instanceof com.facebookpay.form.cell.contactinfo.ContactInfoCellParams
            if (r0 == 0) goto L_0x00d3
            com.facebookpay.form.cell.contactinfo.ContactInfoCellParams r1 = (com.facebookpay.form.cell.contactinfo.ContactInfoCellParams) r1
            X.AnonymousClass7TG.A1N(r5, r2)
            X.QgJ r3 = new X.QgJ
            r3.<init>(r5)
            r3.setLayoutParams(r2)
            boolean r0 = r1.A04
        L_0x00c6:
            if (r0 == 0) goto L_0x0018
            X.SQz r2 = X.C9972RkR.A00
            r1 = 22
            X.REP r0 = X.REP.ALL_BORDERED_ALL_ROUNDED
            r2.A03(r5, r3, r0, r1)
            goto L_0x0018
        L_0x00d3:
            boolean r0 = r4 instanceof com.facebookpay.form.cell.checkbox.CheckboxCellParams
            if (r0 == 0) goto L_0x00f8
            com.facebookpay.form.cell.checkbox.CheckboxCellParams r1 = (com.facebookpay.form.cell.checkbox.CheckboxCellParams) r1
            X.AnonymousClass7TG.A1N(r5, r2)
            java.lang.String r0 = r1.A02
            if (r0 == 0) goto L_0x00f2
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x00f2
            X.Q9h r3 = new X.Q9h
            r3.<init>(r5)
        L_0x00eb:
            r3.setLayoutParams(r2)
            X.TdT r3 = (X.C13601TdT) r3
            goto L_0x0018
        L_0x00f2:
            X.QAP r3 = new X.QAP
            r3.<init>(r5)
            goto L_0x00eb
        L_0x00f8:
            boolean r0 = r4 instanceof com.facebookpay.form.cell.text.TextCellParams
            if (r0 == 0) goto L_0x010c
            com.facebookpay.form.cell.text.TextCellParams r1 = (com.facebookpay.form.cell.text.TextCellParams) r1
            boolean r0 = r1 instanceof com.facebookpay.form.cell.card.CardCellParams
            if (r0 == 0) goto L_0x015f
            X.AnonymousClass7TG.A1N(r5, r2)
            X.Qfu r3 = new X.Qfu
            r3.<init>(r5)
            goto L_0x005c
        L_0x010c:
            boolean r0 = r4 instanceof com.facebookpay.form.cell.apm.APMLinkCellParams
            if (r0 == 0) goto L_0x0124
            X.AnonymousClass7TG.A1N(r5, r2)
            X.Q9w r3 = new X.Q9w
            r3.<init>(r5)
            android.content.Context r1 = r3.getContext()
            r0 = 2131625457(0x7f0e05f1, float:1.8878122E38)
            android.view.View.inflate(r1, r0, r3)
            goto L_0x0015
        L_0x0124:
            boolean r0 = r4 instanceof com.facebookpay.form.cell.addresslist.AddressListHeaderCellParams
            if (r0 == 0) goto L_0x0132
            X.AnonymousClass7TG.A1N(r5, r2)
            X.Q9y r3 = new X.Q9y
            r3.<init>(r5)
            goto L_0x0015
        L_0x0132:
            boolean r0 = r4 instanceof com.facebookpay.form.cell.addresslist.AddressListCellParams
            if (r0 == 0) goto L_0x0140
            X.AnonymousClass7TG.A1N(r5, r2)
            X.Q9z r3 = new X.Q9z
            r3.<init>(r5)
            goto L_0x0015
        L_0x0140:
            boolean r0 = r4 instanceof com.facebookpay.form.cell.address.BriefAddressCellParams
            if (r0 == 0) goto L_0x014e
            X.AnonymousClass7TG.A1N(r5, r2)
            X.QgJ r3 = new X.QgJ
            r3.<init>(r5)
            goto L_0x0015
        L_0x014e:
            com.facebookpay.form.cell.address.AddressCellParams r1 = (com.facebookpay.form.cell.address.AddressCellParams) r1
            X.AnonymousClass7TG.A1N(r5, r2)
            X.QgJ r3 = new X.QgJ
            r3.<init>(r5)
            r3.setLayoutParams(r2)
            boolean r0 = r1.A0T
            goto L_0x00c6
        L_0x015f:
            X.AnonymousClass7TG.A1N(r5, r2)
            X.QgI r3 = new X.QgI
            r3.<init>(r5)
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.form.cell.CellParams.A00(android.content.Context):X.TdT");
    }

    public final SRc A01() {
        if (this instanceof SwitchCellParams) {
            SwitchCellParams switchCellParams = (SwitchCellParams) this;
            return new C8032Qfc(switchCellParams.A02, switchCellParams.A00, switchCellParams.A06, switchCellParams.A05, switchCellParams.A01);
        } else if (this instanceof SelectorCellParams) {
            SelectorCellParams selectorCellParams = (SelectorCellParams) this;
            int i = selectorCellParams.A02;
            boolean z = selectorCellParams.A06;
            boolean z2 = selectorCellParams.A05;
            int i2 = selectorCellParams.A00;
            return new C8035Qff(selectorCellParams.A02, selectorCellParams.A03, i, i2, selectorCellParams.A01, z, z2);
        } else if (this instanceof CountrySelectorCellParams) {
            CountrySelectorCellParams countrySelectorCellParams = (CountrySelectorCellParams) this;
            int i3 = countrySelectorCellParams.A03;
            int i4 = countrySelectorCellParams.A02;
            boolean z3 = countrySelectorCellParams.A06;
            boolean z4 = countrySelectorCellParams.A05;
            FormCellLoggingEvents formCellLoggingEvents = countrySelectorCellParams.A04;
            String str = countrySelectorCellParams.A03;
            int i5 = countrySelectorCellParams.A00;
            return new C298455tS(countrySelectorCellParams.A01, formCellLoggingEvents, countrySelectorCellParams.A02, str, i3, i4, i5, z3, z4, countrySelectorCellParams.A04);
        } else if (this instanceof SupportedLogosCellParams) {
            SupportedLogosCellParams supportedLogosCellParams = (SupportedLogosCellParams) this;
            return new C8031Qfb(supportedLogosCellParams.A02, supportedLogosCellParams.A05, supportedLogosCellParams.A00);
        } else if (this instanceof LabelCellParams) {
            LabelCellParams labelCellParams = (LabelCellParams) this;
            if (labelCellParams instanceof PaymentMethodLabelCellParams) {
                PaymentMethodLabelCellParams paymentMethodLabelCellParams = (PaymentMethodLabelCellParams) labelCellParams;
                return new C8038Qfi(paymentMethodLabelCellParams.A05, paymentMethodLabelCellParams.A01, paymentMethodLabelCellParams.A03, paymentMethodLabelCellParams.A04, paymentMethodLabelCellParams.A00, paymentMethodLabelCellParams.A02);
            }
            int i6 = labelCellParams.A02;
            boolean z5 = labelCellParams.A06;
            boolean z6 = labelCellParams.A05;
            String str2 = labelCellParams.A08;
            int i7 = labelCellParams.A03;
            return new C8039Qfj(labelCellParams.A07, str2, i6, i7, labelCellParams.A05, labelCellParams.A00, labelCellParams.A02, labelCellParams.A06, labelCellParams.A01, z5, z6);
        } else if (this instanceof FulfillmentOptionCellParams) {
            FulfillmentOptionCellParams fulfillmentOptionCellParams = (FulfillmentOptionCellParams) this;
            return new C8034Qfe(fulfillmentOptionCellParams.A02, fulfillmentOptionCellParams.A00, fulfillmentOptionCellParams.A01, fulfillmentOptionCellParams.A05);
        } else if (this instanceof CreditCardCellParams) {
            CreditCardCellParams creditCardCellParams = (CreditCardCellParams) this;
            int i8 = creditCardCellParams.A02;
            boolean z7 = creditCardCellParams.A06;
            boolean z8 = creditCardCellParams.A05;
            String str3 = creditCardCellParams.A09;
            String str4 = creditCardCellParams.A0E;
            String str5 = creditCardCellParams.A0D;
            String str6 = creditCardCellParams.A0F;
            String str7 = creditCardCellParams.A0A;
            String str8 = creditCardCellParams.A0C;
            String str9 = creditCardCellParams.A0B;
            C8946RGo rGo = creditCardCellParams.A08;
            List list = creditCardCellParams.A0G;
            List list2 = creditCardCellParams.A0H;
            boolean z9 = creditCardCellParams.A0N;
            boolean z10 = creditCardCellParams.A0M;
            boolean z11 = creditCardCellParams.A00;
            Map map = creditCardCellParams.A0I;
            int i9 = creditCardCellParams.A02;
            REC rec = creditCardCellParams.A06;
            boolean z12 = creditCardCellParams.A0K;
            int i10 = creditCardCellParams.A01;
            int i11 = creditCardCellParams.A03;
            AddressCellParams addressCellParams = creditCardCellParams.A05;
            boolean A1V = AnonymousClass7TF.A1V(creditCardCellParams.A04);
            boolean z13 = creditCardCellParams.A0L;
            return new C8043Qfn(addressCellParams, rec, creditCardCellParams.A07, rGo, str3, str4, str5, str6, str7, str8, str9, list, list2, map, i8, i9, i10, i11, z7, z8, z9, z10, z11, z12, A1V, z13, creditCardCellParams.A0J);
        } else if (this instanceof CardScannerCellParams) {
            CardScannerCellParams cardScannerCellParams = (CardScannerCellParams) this;
            return new C8030Qfa(cardScannerCellParams, cardScannerCellParams.A00);
        } else if (this instanceof ContactInfoCellParams) {
            ContactInfoCellParams contactInfoCellParams = (ContactInfoCellParams) this;
            int i12 = contactInfoCellParams.A02;
            boolean z14 = contactInfoCellParams.A05;
            int i13 = contactInfoCellParams.A00;
            return new C298465tT(contactInfoCellParams.A02, contactInfoCellParams.A01, contactInfoCellParams.A03, i12, i13, z14, contactInfoCellParams.A05, contactInfoCellParams.A04);
        } else if (this instanceof CheckboxCellParams) {
            CheckboxCellParams checkboxCellParams = (CheckboxCellParams) this;
            int i14 = checkboxCellParams.A02;
            boolean z15 = checkboxCellParams.A05;
            boolean z16 = checkboxCellParams.A03;
            return new C8037Qfh(checkboxCellParams.A02, i14, checkboxCellParams.A01, checkboxCellParams.A00, z15, z16, checkboxCellParams.A04);
        } else if (this instanceof TextCellParams) {
            TextCellParams textCellParams = (TextCellParams) this;
            if (textCellParams instanceof CardCellParams) {
                CardCellParams cardCellParams = (CardCellParams) textCellParams;
                ImmutableList.Builder A0Y = Pxe.A0Y();
                C249803kO A0J = C66580MXl.A0J(cardCellParams.A07);
                while (A0J.hasNext()) {
                    TextValidatorParams textValidatorParams = (TextValidatorParams) A0J.next();
                    Integer num = textValidatorParams.A02;
                    String str10 = textValidatorParams.A04;
                    String str11 = textValidatorParams.A03;
                    int i15 = textValidatorParams.A01;
                    int i16 = textValidatorParams.A00;
                    S4U A002 = C11088S9j.A00(num, cardCellParams.A01);
                    A002.A02 = str11;
                    A002.A01 = i15;
                    A002.A00 = i16;
                    A002.A00(str10);
                    A0Y.add(A002);
                }
                int i17 = cardCellParams.A03;
                int i18 = cardCellParams.A02;
                boolean z17 = cardCellParams.A06;
                boolean z18 = cardCellParams.A05;
                FormCellLoggingEvents formCellLoggingEvents2 = cardCellParams.A04;
                String str12 = cardCellParams.A0B;
                int i19 = cardCellParams.A03;
                String str13 = cardCellParams.A0A;
                FBPayIcon fBPayIcon = cardCellParams.A06;
                Integer num2 = cardCellParams.A08;
                ImmutableList A0K = DbZ.A0K(A0Y);
                int i20 = cardCellParams.A00;
                boolean z19 = cardCellParams.A0C;
                String str14 = cardCellParams.A09;
                boolean z20 = cardCellParams.A02;
                return new C8048Qfv(formCellLoggingEvents2, cardCellParams.A04, fBPayIcon, A0K, num2, str12, str13, str14, i17, i18, i19, i20, z17, z18, z19, z20);
            }
            ImmutableList.Builder A0Y2 = Pxe.A0Y();
            C249803kO A0J2 = C66580MXl.A0J(textCellParams.A07);
            while (A0J2.hasNext()) {
                TextValidatorParams textValidatorParams2 = (TextValidatorParams) A0J2.next();
                Integer num3 = textValidatorParams2.A02;
                String str15 = textValidatorParams2.A04;
                String str16 = textValidatorParams2.A03;
                int i21 = textValidatorParams2.A01;
                int i22 = textValidatorParams2.A00;
                S4U A003 = C11088S9j.A00(num3, (List) null);
                A003.A02 = str16;
                A003.A01 = i21;
                A003.A00 = i22;
                A003.A00(str15);
                A0Y2.add(A003);
            }
            int i23 = textCellParams.A03;
            int i24 = textCellParams.A02;
            boolean z21 = textCellParams.A06;
            boolean z22 = textCellParams.A05;
            FormCellLoggingEvents formCellLoggingEvents3 = textCellParams.A04;
            String str17 = textCellParams.A0B;
            int i25 = textCellParams.A03;
            String str18 = textCellParams.A0A;
            int i26 = textCellParams.A00;
            int i27 = textCellParams.A01;
            FBPayIcon fBPayIcon2 = textCellParams.A06;
            Integer num4 = textCellParams.A08;
            ImmutableList A0K2 = DbZ.A0K(A0Y2);
            TextFieldHandler textFieldHandler = textCellParams.A05;
            boolean z23 = textCellParams.A0E;
            int i28 = textCellParams.A02;
            boolean z24 = textCellParams.A0F;
            boolean z25 = textCellParams.A0C;
            String str19 = textCellParams.A09;
            boolean z26 = textCellParams.A0D;
            return new C8041Qfl(formCellLoggingEvents3, textCellParams.A04, textFieldHandler, fBPayIcon2, A0K2, num4, str17, str18, str19, i23, i24, i25, i26, i27, i28, z21, z22, z23, z24, z25, z26);
        } else if (this instanceof APMLinkCellParams) {
            APMLinkCellParams aPMLinkCellParams = (APMLinkCellParams) this;
            return new C8033Qfd(aPMLinkCellParams.A02, aPMLinkCellParams.A00, aPMLinkCellParams.A01);
        } else if (this instanceof AddressListHeaderCellParams) {
            AddressListHeaderCellParams addressListHeaderCellParams = (AddressListHeaderCellParams) this;
            int i29 = addressListHeaderCellParams.A02;
            boolean z27 = addressListHeaderCellParams.A05;
            boolean z28 = addressListHeaderCellParams.A03;
            boolean z29 = addressListHeaderCellParams.A04;
            return new C8036Qfg(addressListHeaderCellParams.A02, i29, addressListHeaderCellParams.A01, addressListHeaderCellParams.A00, z27, z28, z29);
        } else if (this instanceof AddressListCellParams) {
            AddressListCellParams addressListCellParams = (AddressListCellParams) this;
            int i30 = addressListCellParams.A02;
            boolean z30 = addressListCellParams.A05;
            List list3 = addressListCellParams.A03;
            BaseCheckoutItem baseCheckoutItem = addressListCellParams.A01;
            int i31 = addressListCellParams.A00;
            return new C8040Qfk(baseCheckoutItem, addressListCellParams.A02, list3, i30, i31, z30, addressListCellParams.A04);
        } else if (this instanceof BriefAddressCellParams) {
            BriefAddressCellParams briefAddressCellParams = (BriefAddressCellParams) this;
            int i32 = briefAddressCellParams.A02;
            boolean z31 = briefAddressCellParams.A06;
            boolean z32 = briefAddressCellParams.A05;
            String str20 = briefAddressCellParams.A02;
            return new C8042Qfm(briefAddressCellParams.A00, briefAddressCellParams.A01, str20, i32, z31, z32);
        } else {
            AddressCellParams addressCellParams2 = (AddressCellParams) this;
            int i33 = addressCellParams2.A02;
            boolean z33 = addressCellParams2.A06;
            boolean z34 = addressCellParams2.A05;
            String str21 = addressCellParams2.A0I;
            String str22 = addressCellParams2.A0P;
            String str23 = addressCellParams2.A0K;
            String str24 = addressCellParams2.A0M;
            String str25 = addressCellParams2.A0Q;
            String str26 = addressCellParams2.A0L;
            String str27 = addressCellParams2.A0N;
            String str28 = addressCellParams2.A0O;
            Country country = addressCellParams2.A0D;
            AddressFormFieldsConfig addressFormFieldsConfig = addressCellParams2.A0E;
            boolean z35 = addressCellParams2.A0Y;
            int i34 = addressCellParams2.A05;
            int i35 = addressCellParams2.A06;
            int i36 = addressCellParams2.A09;
            int i37 = addressCellParams2.A0A;
            int i38 = addressCellParams2.A07;
            int i39 = addressCellParams2.A0B;
            int i40 = addressCellParams2.A03;
            int i41 = addressCellParams2.A08;
            int i42 = addressCellParams2.A0C;
            int i43 = addressCellParams2.A04;
            boolean z36 = addressCellParams2.A0a;
            boolean z37 = addressCellParams2.A0W;
            boolean z38 = addressCellParams2.A0X;
            boolean z39 = addressCellParams2.A0V;
            String str29 = addressCellParams2.A0J;
            ImmutableList immutableList = addressCellParams2.A0H;
            Map map2 = addressCellParams2.A0S;
            boolean z40 = addressCellParams2.A0Z;
            LoggingContext loggingContext = addressCellParams2.A0F;
            boolean z41 = addressCellParams2.A01;
            List list4 = addressCellParams2.A0R;
            boolean z42 = addressCellParams2.A00;
            int i44 = addressCellParams2.A02;
            boolean z43 = addressCellParams2.A0T;
            return new C8044Qfo(country, addressFormFieldsConfig, loggingContext, immutableList, addressCellParams2.A0G, str21, str22, str23, str24, str25, str26, str27, str28, str29, list4, map2, i33, i34, i35, i36, i37, i38, i39, i40, i41, i42, i43, i44, z33, z34, z35, z36, z37, z38, z39, z40, z41, z42, z43, addressCellParams2.A0U);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeByte(this.A06 ? (byte) 1 : 0);
        parcel.writeByte(this.A05 ? (byte) 1 : 0);
        parcel.writeFloat(this.A01);
        parcel.writeParcelable(this.A04, i);
    }

    public CellParams(Parcel parcel) {
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        boolean z = true;
        this.A06 = AnonymousClass7TF.A1P(parcel.readByte());
        this.A05 = parcel.readByte() == 0 ? false : z;
        this.A01 = parcel.readFloat();
        this.A04 = (FormCellLoggingEvents) C41847B3o.A03(parcel, FormCellLoggingEvents.class);
    }

    public CellParams(C10782Ry3 ry3) {
        this.A03 = ry3.A01;
        this.A02 = ry3.A05;
        this.A06 = ry3.A04;
        this.A05 = ry3.A03;
        this.A01 = ry3.A00;
        this.A04 = ry3.A02;
    }

    public CellParams(int i) {
        this.A03 = 0;
        this.A02 = i;
        this.A06 = false;
        this.A05 = true;
        this.A01 = 1.0f;
        this.A04 = null;
    }
}
