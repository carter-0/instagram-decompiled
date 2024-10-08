package X;

import android.content.Context;
import android.util.SparseArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.recyclerview.adapteritems.PuxAccordionItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.KnownData;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.facebookpay.otc.models.OtcInput;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class QDM extends 2YL {
    public ECPHandler A00;
    public QD8 A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public SUj A06;
    public final 2Fk A07;
    public final 2Fk A08;
    public final AnonymousClass2gB A09;
    public final AnonymousClass2gB A0A;
    public final AnonymousClass2gB A0B;
    public final AnonymousClass2gB A0C;
    public final AnonymousClass2Fj A0D;
    public final AnonymousClass2Fj A0E = JTO.A0K();
    public final AnonymousClass2Fj A0F = JTO.A0K();
    public final AnonymousClass2Fj A0G;
    public final AnonymousClass2Fj A0H;
    public final AnonymousClass2Fj A0I;
    public final AnonymousClass2Fj A0J;
    public final AnonymousClass2gO A0K;
    public final AnonymousClass2gO A0L;
    public final AnonymousClass2gO A0M;
    public final AnonymousClass2gO A0N;
    public final AnonymousClass2gO A0O;
    public final SP9 A0P;
    public final QDL A0Q;
    public final LoggingContext A0R;
    public final QDH A0S;
    public final Map A0T;

    public QDM(QDL qdl, LoggingContext loggingContext, QDH qdh) {
        this.A0R = loggingContext;
        this.A0S = qdh;
        this.A0Q = qdl;
        SP9 sp9 = new SP9();
        this.A0P = sp9;
        this.A07 = sp9.A08;
        this.A0D = JTO.A0K();
        this.A0T = 0Yt.A06(new 0eP[]{C11360SOw.A00(C298525tb.ONE_TIME_CHECKOUT_OPTION, false), C11360SOw.A00(C298525tb.TERMS, false), C11360SOw.A00(C298525tb.ORDER_SUMMARY, false), C11360SOw.A00(C298525tb.SHIPPING_OPTIONS, false), C11360SOw.A00(C298525tb.SHIPPING_ADDRESS, false), C11360SOw.A00(C298525tb.PAYMENT_METHOD, false), C11360SOw.A00(C298525tb.CONTACT_INFORMATION, false)});
        this.A0H = JTO.A0K();
        AnonymousClass2gB A0M2 = Pxh.A0M();
        this.A09 = A0M2;
        AnonymousClass2gB A0M3 = Pxh.A0M();
        this.A0A = A0M3;
        this.A0C = Pxh.A0M();
        this.A0I = JTO.A0K();
        this.A0J = JTO.A0K();
        this.A0G = JTO.A0K();
        CurrencyAmount currencyAmount = new CurrencyAmount("", "");
        CurrencyAmount currencyAmount2 = new CurrencyAmount("", "");
        RH6 rh6 = RH6.A0g;
        0sn r12 = 0sn.A00;
        SUj A082 = SUj.A08(new PuxOrderSummaryItem(currencyAmount, currencyAmount2, rh6, Pxh.A0V(), (String) null, (String) null, r12, 0, false, false, false));
        this.A06 = A082;
        RH6 rh62 = RH6.A0Q;
        0qQ.A0C(A082, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        2Fk r6 = new 2Fk(SUj.A08(new PuxAccordionItem(rh62, (C10781Ry2) null, A082, r12, false)));
        r6.A00 = new Pxo();
        this.A0B = r6;
        this.A08 = sp9.A0A;
        SUj.A0L(A0M3, (Object) null);
        SUj.A0K(A0M2, Integer.valueOf(A00(this)));
        C11353SOm.A01().A00.A09(new C64320LZv(TY1.A00(this, 1), 5));
        this.A0N = C11649Sdr.A00(this, 29);
        this.A0K = C11649Sdr.A00(this, 25);
        this.A0M = C11649Sdr.A00(this, 27);
        this.A0L = C11649Sdr.A00(this, 26);
        this.A0O = C11649Sdr.A00(this, 30);
    }

    public final void A09(AnonymousClass07Z r10, LoggingContext loggingContext, Integer num) {
        String str;
        0qQ.A0B(num, 1);
        if (num == AnonymousClass05K.A00) {
            C51965G9l.A0g().A0U(loggingContext, "nux_checkout", SUU.A08(this.A0S));
        }
        ECPHandler eCPHandler = this.A00;
        if (eCPHandler != null) {
            AnonymousClass2Fj r1 = this.A0H;
            Object A022 = r1.A02();
            if (A022 != null) {
                String str2 = ((ECPPaymentRequest) A022).A0A;
                Object A023 = r1.A02();
                if (A023 != null) {
                    String str3 = ((ECPPaymentRequest) A023).A08;
                    Object A024 = r1.A02();
                    if (A024 != null) {
                        String str4 = ((ECPPaymentRequest) A024).A07;
                        Object A025 = r1.A02();
                        if (A025 != null) {
                            PaymentReceiverInfo paymentReceiverInfo = ((ECPPaymentRequest) A025).A05;
                            if (paymentReceiverInfo != null) {
                                str = paymentReceiverInfo.A02;
                            } else {
                                str = null;
                            }
                            eCPHandler.CIS(new C10749RxT(this.A0S.A02((C298525tb) null, true), str2, str3, str4, str), loggingContext, num);
                            ECPRepositoryImpl A012 = C11353SOm.A01();
                            A012.A00.A05(r10);
                            A012.A00 = JTO.A0K();
                            this.A0P.A09.A08(this.A0O);
                            return;
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public static final int A00(QDM qdm) {
        C21267XRm xRm;
        C7798QXj qXj = (C7798QXj) qdm.A0F.A02();
        if (qXj != null) {
            xRm = C11432SUd.A0D(qXj);
        } else {
            xRm = null;
        }
        if (xRm == C21267XRm.A06) {
            return 2131961370;
        }
        return 2131961330;
    }

    public static final SEA A01(QDM qdm, C8041Qfl qfl, int i) {
        ECPPaymentConfiguration eCPPaymentConfiguration;
        KnownData knownData;
        String str;
        int indexOf;
        String str2;
        QDM qdm2 = qdm;
        ECPPaymentRequest A0U = Pxh.A0U(qdm2.A0H);
        if (A0U == null || (eCPPaymentConfiguration = A0U.A03) == null || (knownData = eCPPaymentConfiguration.A01) == null) {
            return null;
        }
        List A002 = C11298SKh.A00();
        boolean z = qdm2.A05;
        boolean z2 = qdm2.A03;
        boolean z3 = qdm2.A02;
        int i2 = i;
        GL8 gl8 = new GL8(i2, 2, qdm2, qfl);
        if (i == 0) {
            if (z) {
                str = knownData.A03;
            } else {
                str = null;
            }
            indexOf = A002.indexOf(C298525tb.CONTACT_INFORMATION);
            str2 = null;
        } else if (i2 == 1) {
            str = knownData.A01;
            if (z) {
                str2 = knownData.A03;
            } else {
                str2 = null;
            }
            indexOf = A002.indexOf(C298525tb.CONTACT_INFORMATION);
        } else if (i2 == 2) {
            str = knownData.A02;
            str2 = C9625Re5.A00(knownData, (String) null, true, false);
            indexOf = A002.indexOf(C298525tb.SHIPPING_ADDRESS);
        } else if (i2 == 5) {
            str = C9625Re5.A00(knownData, (String) null, true, true);
            str2 = C9625Re5.A00(knownData, (String) null, false, false);
            indexOf = A002.indexOf(C298525tb.SHIPPING_ADDRESS);
        } else {
            throw AnonymousClass7TE.A0z("Incorrectly attempting to autofill a cell that is not supported");
        }
        if (str == null) {
            return null;
        }
        int size = A002.size();
        for (int i3 = indexOf + 1; i3 < size; i3++) {
            int ordinal = ((C298525tb) A002.get(i3)).ordinal();
            if (ordinal != 6) {
                if (ordinal == 28 && z3) {
                    str2 = C9625Re5.A00(knownData, str2, true, false);
                }
            } else if (z || z2) {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                if (str2 != null) {
                    A1A.append(str2);
                }
                String str3 = knownData.A01;
                String str4 = ",\n";
                str2 = null;
                if (str3 != null && z2) {
                    if (A1A.length() > 0) {
                        A1A.append(str4);
                    }
                    A1A.append(str3);
                }
                String str5 = knownData.A03;
                if (str5 != null && z) {
                    if (str3 != null) {
                        str4 = " · ";
                    } else if (A1A.length() <= 0) {
                        str4 = "";
                    }
                    A1A.append(str4);
                    A1A.append(str5);
                }
                if (A1A.length() > 0) {
                    str2 = A1A.toString();
                }
            }
        }
        C8063QgF qgF = new C8063QgF(str, str2, (List) null, (List) null);
        qgF.A00 = gl8;
        return new SEA(new Ste(qdm2, i2), 0sr.A1P(new ONB[]{new C8061QgD(), qgF}));
    }

    public static final void A03(QDM qdm) {
        String str;
        ECPPaymentRequest eCPPaymentRequest = (ECPPaymentRequest) qdm.A0H.A02();
        if (eCPPaymentRequest != null) {
            QDL qdl = qdm.A0Q;
            PaymentReceiverInfo paymentReceiverInfo = eCPPaymentRequest.A05;
            if (paymentReceiverInfo != null) {
                str = paymentReceiverInfo.A02;
            } else {
                str = null;
            }
            qdl.A0A(C11432SUd.A04((2IV) null, eCPPaymentRequest, (OtcInput) null, str, eCPPaymentRequest.A09, "REGULAR"), qdm.A0R);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r1 == null) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.QDM r25, X.SUj r26) {
        /*
            r3 = r25
            boolean r0 = A05(r3)
            if (r0 == 0) goto L_0x0011
            X.QDL r0 = r3.A0Q
            java.lang.Integer r1 = r0.A04
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0011
        L_0x0010:
            return
        L_0x0011:
            r2 = r26
            java.lang.Object r7 = r2.A01
            com.facebookpay.expresscheckout.models.TransactionInfo r7 = (com.facebookpay.expresscheckout.models.TransactionInfo) r7
            if (r7 == 0) goto L_0x0010
            com.facebookpay.common.models.CurrencyAmount r10 = X.C11432SUd.A03(r7)
            com.facebookpay.common.models.CurrencyAmount r11 = X.C11432SUd.A02(r10, r2)
            java.util.ArrayList<com.facebookpay.expresscheckout.models.PriceInfo> r4 = r7.A07
            if (r4 == 0) goto L_0x0035
            X.2Fj r0 = r3.A0H
            java.lang.Object r0 = r0.A02()
            if (r0 == 0) goto L_0x0157
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            java.util.Map r1 = X.C11294SKc.A02(r0, r4)
            if (r1 != 0) goto L_0x0039
        L_0x0035:
            X.0sm r1 = X.0Yt.A0E()
        L_0x0039:
            X.2Fj r6 = r3.A0H
            java.lang.Object r0 = r6.A02()
            r23 = 0
            if (r0 == 0) goto L_0x011e
            if (r4 == 0) goto L_0x011e
            java.lang.Object r0 = X.00k.A0J(r4)
            com.facebookpay.expresscheckout.models.PriceInfo r0 = (com.facebookpay.expresscheckout.models.PriceInfo) r0
            if (r0 == 0) goto L_0x011e
            java.lang.String r14 = r0.A04
        L_0x004f:
            X.QDL r9 = r3.A0Q
            X.2Fj r0 = r9.A0A
            X.SUj r8 = X.Pxe.A0W(r0)
            if (r8 != 0) goto L_0x00fa
            X.0sn r4 = X.0sn.A00
            X.2Fj r0 = r9.A09
            com.facebookpay.common.recyclerview.adapteritems.IncentiveItem r0 = X.QDL.A00(r0, r9, r4)
            X.SUj r0 = X.SUj.A09(r0)
        L_0x0065:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r4 = X.Pxh.A0U(r6)
            if (r4 == 0) goto L_0x00f6
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r4 = r4.A05
            if (r4 == 0) goto L_0x00f6
            java.lang.String r15 = r4.A03
        L_0x0071:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r4 = X.Pxh.A0U(r6)
            if (r4 == 0) goto L_0x00f3
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r4 = r4.A05
            if (r4 == 0) goto L_0x00f3
            java.lang.String r4 = r4.A01
        L_0x007d:
            java.util.List r16 = X.C11294SKc.A01(r4, r1)
            int r17 = r1.size()
            boolean r5 = r3.A02
            r4 = 1
            boolean r7 = X.C11432SUd.A0P(r7)
            if (r7 != r4) goto L_0x00f1
            java.lang.String r8 = r10.A01
            java.lang.String r7 = r11.A01
            boolean r7 = X.0qQ.A0K(r8, r7)
            if (r7 != 0) goto L_0x00f1
        L_0x0098:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r7 = X.Pxh.A0U(r6)
            if (r7 == 0) goto L_0x00ec
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r7 = r7.A04
            com.facebookpay.expresscheckout.models.ItemDetails r13 = r7.A09
        L_0x00a2:
            X.RH6 r12 = X.RH6.A0g
            r20 = 0
            com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem r9 = new com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem
            r18 = r5
            r19 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.SUj r7 = X.SUj.A09(r9)
            r3.A06 = r7
            X.2gB r5 = r3.A0B
            X.RH6 r22 = X.RH6.A0Q
            java.lang.String r8 = "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>"
            X.0qQ.A0C(r7, r8)
            X.0qQ.A0A(r0)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            r9 = 2131961224(0x7f132588, float:1.9559139E38)
            com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem r9 = X.Pxj.A0X(r9)
            X.SUj r9 = X.SUj.A09(r9)
            X.0qQ.A0A(r9)
            r4.add(r9)
            java.util.Iterator r9 = X.AnonymousClass7TF.A0u(r1)
        L_0x00db:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0122
            java.lang.Object r1 = X.C51971G9r.A0p(r9)
            X.0qQ.A0C(r1, r8)
            r4.add(r1)
            goto L_0x00db
        L_0x00ec:
            com.facebookpay.expresscheckout.models.ItemDetails r13 = X.Pxh.A0V()
            goto L_0x00a2
        L_0x00f1:
            r4 = 0
            goto L_0x0098
        L_0x00f3:
            r4 = r23
            goto L_0x007d
        L_0x00f6:
            r15 = r23
            goto L_0x0071
        L_0x00fa:
            java.lang.Object r0 = r8.A01
            com.facebookpay.incentives.model.IncentiveList r0 = (com.facebookpay.incentives.model.IncentiveList) r0
            java.util.List r0 = r0.A00
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x0108:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0112
            X.Pxj.A1S(r5, r4)
            goto L_0x0108
        L_0x0112:
            X.2Fj r0 = r9.A09
            com.facebookpay.common.recyclerview.adapteritems.IncentiveItem r0 = X.QDL.A00(r0, r9, r5)
            X.SUj r0 = X.SUj.A06(r8, r0)
            goto L_0x0065
        L_0x011e:
            r14 = r23
            goto L_0x004f
        L_0x0122:
            boolean r1 = A05(r3)
            if (r1 == 0) goto L_0x012e
            X.0qQ.A0C(r0, r8)
            r4.add(r0)
        L_0x012e:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.Pxh.A0U(r6)
            if (r0 == 0) goto L_0x0155
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x0155
            java.lang.Integer r0 = r0.A0D
        L_0x013a:
            X.SUj r0 = X.C11294SKc.A00(r2, r0)
            X.0qQ.A0C(r0, r8)
            r4.add(r0)
            com.facebookpay.common.recyclerview.adapteritems.PuxAccordionItem r0 = new com.facebookpay.common.recyclerview.adapteritems.PuxAccordionItem
            r21 = r0
            r24 = r7
            r25 = r4
            r26 = r20
            r21.<init>(r22, r23, r24, r25, r26)
            X.SUj.A0K(r5, r0)
            return
        L_0x0155:
            r0 = 0
            goto L_0x013a
        L_0x0157:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDM.A04(X.QDM, X.SUj):void");
    }

    public static final boolean A05(QDM qdm) {
        CheckoutConfiguration checkoutConfiguration;
        ECPPaymentRequest A0U = Pxh.A0U(qdm.A0H);
        if (A0U == null || (checkoutConfiguration = A0U.A01) == null || !checkoutConfiguration.A0H.contains(REn.UX_INCENTIVES)) {
            return false;
        }
        return true;
    }

    public final AnonymousClass2Fj A06(Fragment fragment) {
        String str;
        PaymentReceiverInfo paymentReceiverInfo;
        String str2 = null;
        SUj.A0L(this.A09, (Object) null);
        GraphQlCallInput graphQlCallInput = new GraphQlCallInput();
        0Df.A00(graphQlCallInput.A02(), AnonymousClass7TE.A0u(), "is_p2p_receiver");
        graphQlCallInput.A07(this.A0R.A02, "logging_id");
        graphQlCallInput.A07(Pxi.A0Y(), "login_ref_id");
        graphQlCallInput.A07("ECP", "payment_type");
        AnonymousClass2Fj r2 = this.A0H;
        ECPPaymentRequest A0U = Pxh.A0U(r2);
        if (A0U == null || (paymentReceiverInfo = A0U.A05) == null) {
            str = null;
        } else {
            str = paymentReceiverInfo.A02;
        }
        graphQlCallInput.A07(str, "receiver_id");
        ECPPaymentRequest A0U2 = Pxh.A0U(r2);
        if (A0U2 != null) {
            str2 = A0U2.A08;
        }
        graphQlCallInput.A07(str2, "product_id");
        SUj.A0G(fragment, ((C10888Rzo) C66580MXl.A0s(AnonymousClass2E0.A01().A0I)).A00(graphQlCallInput), new C11648Sdq(5, (Object) this, (Object) fragment));
        return this.A0I;
    }

    public final void A08(SparseArray sparseArray, AnonymousClass07Z r36) {
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        String str;
        SEB seb;
        SSC ssc;
        String str2;
        ECPPaymentRequest A0U;
        PaymentReceiverInfo paymentReceiverInfo;
        PaymentReceiverInfo paymentReceiverInfo2;
        C298475tU r4;
        boolean z;
        SRc A0L2;
        SparseArray A0B2;
        SRc A0L3;
        SparseArray A0B3;
        SparseArray sparseArray4 = sparseArray;
        if (!SUj.A0R(this.A0I)) {
            if (sparseArray == null) {
                QD8 qd8 = this.A01;
                if (qd8 != null) {
                    SRc A012 = qd8.A01(13);
                    if (A012 instanceof C8043Qfn) {
                        r4 = (C298475tU) A012;
                        if (r4 != null) {
                            sparseArray4 = r4.A0B();
                        }
                        sparseArray4 = null;
                    } else {
                        r4 = null;
                        sparseArray4 = null;
                    }
                    if (r4 == null || (A0L3 = r4.A0L(28)) == null || (A0B3 = A0L3.A0B()) == null || (z = A0B3.get(29)) == null) {
                        z = false;
                    }
                    boolean A1a = AnonymousClass7TE.A1a(z);
                    if (sparseArray4 != null) {
                        if (A1a) {
                            QD8 qd82 = this.A01;
                            if (qd82 != null) {
                                SRc A013 = qd82.A01(11);
                                if (A013 != null) {
                                    A0B2 = A013.A0B();
                                }
                            }
                        } else if (!(r4 == null || (A0L2 = r4.A0L(28)) == null)) {
                            A0B2 = A0L2.A0B();
                        }
                        if (A0B2 != null) {
                            int size = A0B2.size();
                            for (int i = 0; i < size; i++) {
                                Pxi.A17(A0B2, sparseArray4, i);
                            }
                        }
                    }
                    C11298SKh.A01(this, C21267XRm.A05, "add_card_nux");
                }
                0qQ.A0F("formViewModel");
                throw AnonymousClass00P.createAndThrow();
            }
            C11298SKh.A01(this, C21267XRm.A06, "add_paypal_nux");
            QD8 qd83 = this.A01;
            if (qd83 != null) {
                SRc A014 = qd83.A01(11);
                if (A014 != null) {
                    sparseArray2 = A014.A0B();
                } else {
                    sparseArray2 = null;
                }
                QD8 qd84 = this.A01;
                if (qd84 != null) {
                    SRc A015 = qd84.A01(36);
                    if (A015 != null) {
                        sparseArray3 = A015.A0B();
                    } else {
                        sparseArray3 = null;
                    }
                    SNY sny = AnonymousClass2E0.A01().A07;
                    AnonymousClass2Fj r3 = this.A0H;
                    Object A022 = r3.A02();
                    if (A022 != null) {
                        String str3 = ((ECPPaymentRequest) A022).A0A;
                        Object A023 = r3.A02();
                        if (A023 != null) {
                            String str4 = ((ECPPaymentRequest) A023).A08;
                            ECPPaymentRequest A0U2 = Pxh.A0U(r3);
                            if ((A0U2 == null || (paymentReceiverInfo2 = A0U2.A05) == null || (str = paymentReceiverInfo2.A00) == null) && ((A0U = Pxh.A0U(r3)) == null || (paymentReceiverInfo = A0U.A05) == null || (str = paymentReceiverInfo.A02) == null)) {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                            LoggingContext loggingContext = this.A0R;
                            OtcInput A024 = this.A0S.A02((C298525tb) null, true);
                            GraphQlCallInput graphQlCallInput = new GraphQlCallInput();
                            Pxj.A1E(graphQlCallInput, str3, str4, str);
                            graphQlCallInput.A06(C11300SKk.A00(A024), "one_time_checkout_input");
                            String A0Y = Pxi.A0Y();
                            SUU suu = C9962RkH.A00;
                            ArrayList A1C = AnonymousClass7TE.A1C();
                            if (sparseArray2 != null) {
                                A1C.add(SNY.A00("shipping_address"));
                            }
                            if (sparseArray4 != null) {
                                A1C.add(SNY.A00("credentials"));
                            }
                            if (sparseArray3 != null) {
                                Object obj = sparseArray3.get(2);
                                Object obj2 = null;
                                if (!(obj instanceof String)) {
                                    obj = null;
                                }
                                Object A0V = Pxi.A0V(sparseArray3, 1);
                                Object obj3 = sparseArray3.get(0);
                                if (obj3 instanceof String) {
                                    obj2 = obj3;
                                }
                                if (obj != null) {
                                    A1C.add(SNY.A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME));
                                }
                                if (A0V != null) {
                                    A1C.add(SNY.A00("email"));
                                }
                                if (obj2 != null) {
                                    A1C.add(SNY.A00("phone"));
                                }
                            }
                            if (A024 != null) {
                                seb = C11300SKk.A01(A024);
                            } else {
                                seb = null;
                            }
                            suu.A0G(loggingContext, seb, "CREATE", "nux_checkout", A1C, false);
                            if (sparseArray2 != null) {
                                Object A0j = Pxj.A0j(sparseArray2, 4);
                                Object obj4 = "";
                                if (A0j == null) {
                                    A0j = obj4;
                                }
                                Object obj5 = sparseArray2.get(2);
                                if (!(obj5 instanceof String) || obj5 == null) {
                                    obj5 = obj4;
                                }
                                Object obj6 = sparseArray2.get(5);
                                if (!(obj6 instanceof String) || obj6 == null) {
                                    obj6 = obj4;
                                }
                                Object obj7 = sparseArray2.get(6);
                                if (!(obj7 instanceof String) || obj7 == null) {
                                    obj7 = obj4;
                                }
                                Object obj8 = sparseArray2.get(7);
                                if (!(obj8 instanceof String) || obj8 == null) {
                                    obj8 = obj4;
                                }
                                Object obj9 = sparseArray2.get(8);
                                if (!(obj9 instanceof String) || obj9 == null) {
                                    obj9 = obj4;
                                }
                                Object obj10 = sparseArray2.get(9);
                                if ((obj10 instanceof String) && obj10 != null) {
                                    obj4 = obj10;
                                }
                                String A016 = C11385SQy.A01(sparseArray2);
                                AnonymousClass0K0 r16 = GraphQlCallInput.A02;
                                0Df A032 = C41845B3m.A03(r16, A0j, "label");
                                0Df.A00(A032, obj5, "care_of");
                                0Df.A00(A032, obj6, "street_1");
                                0Df.A00(A032, obj7, "street_2");
                                0Df.A00(A032, obj8, ServerW3CShippingAddressConstants.CITY);
                                0Df.A00(A032, obj9, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                                0Df.A00(A032, obj4, "postal_code");
                                0Df.A00(A032, A016, "country_code");
                                0Df.A00(A032, true, "is_default");
                                0Df.A00(A032, true, "provide_suggestion");
                                0Df A033 = C41845B3m.A03(r16, "CREATE", "mutation_type");
                                0Df.A00(A033, true, "skip_validation");
                                A033.A0E(A032, "save_shipping_address_input");
                                Pxf.A1E(A033, graphQlCallInput, "shipping_address_input");
                            }
                            if (sparseArray3 != null) {
                                Object obj11 = sparseArray3.get(2);
                                if ((obj11 instanceof String) && obj11 != null) {
                                    0Df A034 = C41845B3m.A03(GraphQlCallInput.A02, true, "skip_validation");
                                    0Df.A00(A034, obj11, "payer_name");
                                    0Df.A00(A034, "CREATE", "mutation_type");
                                    Pxf.A1E(A034, graphQlCallInput, "payer_name_input");
                                }
                                Object obj12 = sparseArray3.get(1);
                                if ((obj12 instanceof String) && obj12 != null) {
                                    AnonymousClass0K0 r14 = GraphQlCallInput.A02;
                                    0Df A035 = C41845B3m.A03(r14, true, "skip_validation");
                                    0Df A036 = C41845B3m.A03(r14, true, "is_default");
                                    0Df.A00(A036, obj12, "user_input_email_address");
                                    A035.A0E(A036, "save_email_input");
                                    0Df.A00(A035, "CREATE", "mutation_type");
                                    Pxf.A1E(A035, graphQlCallInput, "email_input");
                                }
                                Object obj13 = sparseArray3.get(0);
                                if ((obj13 instanceof String) && obj13 != null) {
                                    AnonymousClass0K0 r142 = GraphQlCallInput.A02;
                                    0Df A037 = C41845B3m.A03(r142, true, "skip_validation");
                                    0Df A038 = C41845B3m.A03(r142, true, "is_default");
                                    0Df.A00(A038, obj13, "raw_phone_number");
                                    0Df.A00(A038, "US", "country_code");
                                    A037.A0E(A038, "save_phone_input");
                                    0Df.A00(A037, "CREATE", "mutation_type");
                                    Pxf.A1E(A037, graphQlCallInput, "phone_input");
                                }
                            }
                            if (sparseArray4 != null) {
                                Object obj14 = sparseArray4.get(32);
                                if (!(obj14 instanceof String) || (str2 = (String) obj14) == null || str2.length() == 0) {
                                    C11385SQy sQy = Stc.A05;
                                    Context context = sny.A00;
                                    S67 A039 = sQy.A03(context, sparseArray4, A024, str);
                                    AnonymousClass0K0 r12 = GraphQlCallInput.A02;
                                    2IV r1 = A039.A00;
                                    0Df A025 = r12.A02();
                                    C66580MXl.A1M(A025, r1, "save_credential_input");
                                    0Df.A00(A025, "CREATE", "mutation_type");
                                    0Df.A00(A025, "CREDIT_CARD", "credential_type");
                                    Pxf.A1E(A025, graphQlCallInput, "credential_input");
                                    ssc = C9618Rdw.A00(context, new S5Z(A039.A01, A039.A02), new C73949PmT(sny, graphQlCallInput, str4, 2), TX6.A00, TY1.A00(sny, 0));
                                    SUj.A0G(r36, AnonymousClass72Y.A01(SSC.A03(ssc), new TWS(sparseArray4, sparseArray2, sparseArray3, sny, loggingContext, A024, str4, A0Y)), C11649Sdr.A00(this, 28));
                                    return;
                                }
                                AnonymousClass0K0 r6 = GraphQlCallInput.A02;
                                0Df A0310 = C41845B3m.A03(r6, str2, "ba_token");
                                0Df A026 = r6.A02();
                                A026.A0E(A0310, "complete_paypal_ba_linking_input");
                                0Df.A00(A026, "CREATE", "mutation_type");
                                0Df.A00(A026, "PAYPAL_BA", "credential_type");
                                Pxf.A1E(A026, graphQlCallInput, "credential_input");
                            }
                            ssc = new C8275QnH(AnonymousClass2E0.A06(), new Sd0((Object) sny, 4), new C11546Sc7(graphQlCallInput, sny, str4, 2), 1);
                            SUj.A0G(r36, AnonymousClass72Y.A01(SSC.A03(ssc), new TWS(sparseArray4, sparseArray2, sparseArray3, sny, loggingContext, A024, str4, A0Y)), C11649Sdr.A00(this, 28));
                            return;
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            0qQ.A0F("formViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void A0A(ECPHandler eCPHandler) {
        if (eCPHandler != null) {
            ECPHandler eCPHandler2 = this.A00;
            if (eCPHandler2 == null || eCPHandler2.equals(eCPHandler)) {
                if (!0qQ.A0K(this.A00, eCPHandler)) {
                    SP9 sp9 = this.A0P;
                    AnonymousClass2Fj FHY = eCPHandler.FHY();
                    0qQ.A0B(FHY, 0);
                    sp9.A08.A0E(FHY, sp9.A0B);
                }
                this.A00 = eCPHandler;
                return;
            }
            throw AnonymousClass7TE.A0z("Cannot override previous ECP handler with a new handler for the same checkout ViewModel instance");
        }
        throw AnonymousClass7TE.A0z("Attempting to set null value for EcpHandler. This will result in lossy event-handling behavior");
    }

    public final boolean A0C() {
        CheckoutConfiguration checkoutConfiguration;
        Integer num;
        ECPPaymentRequest A0U = Pxh.A0U(this.A0H);
        if (A0U == null || (checkoutConfiguration = A0U.A01) == null || !AnonymousClass7TF.A1Y(checkoutConfiguration.A05, true)) {
            return this.A0S.A02;
        }
        if (!this.A0S.A02) {
            return false;
        }
        if (A0E()) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A0N;
        }
        if (num == AnonymousClass05K.A00) {
            return true;
        }
        return false;
    }

    public static QDH A02(C8131QhP qhP) {
        return qhP.A09().A0S;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x000c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A07() {
        /*
            r5 = this;
            java.util.List r0 = X.C11298SKh.A00()
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r0.iterator()
        L_0x000c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x006d
            java.lang.Object r2 = r4.next()
            r0 = r2
            X.5tb r0 = (X.C298525tb) r0
            int r0 = r0.ordinal()
            r1 = 1
            switch(r0) {
                case 1: goto L_0x003f;
                case 6: goto L_0x005b;
                case 17: goto L_0x0025;
                case 28: goto L_0x0058;
                case 29: goto L_0x002a;
                case 33: goto L_0x0066;
                default: goto L_0x0021;
            }
        L_0x0021:
            r3.add(r2)
            goto L_0x000c
        L_0x0025:
            boolean r0 = r5.A0C()
            goto L_0x006a
        L_0x002a:
            X.2Fj r0 = r5.A0H
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.Pxh.A0U(r0)
            if (r0 == 0) goto L_0x000c
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x000c
            java.util.Set<X.REn> r1 = r0.A0H
            X.REn r0 = X.REn.UX_FULFILLMENT_OPTIONS
            boolean r0 = r1.contains(r0)
            goto L_0x006a
        L_0x003f:
            boolean r0 = r5.A0B()
            if (r0 == 0) goto L_0x000c
            X.2Fj r0 = r5.A0H
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.Pxh.A0U(r0)
            if (r0 == 0) goto L_0x000c
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x000c
            java.lang.Boolean r0 = r0.A05
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r1)
            goto L_0x006a
        L_0x0058:
            boolean r0 = r5.A02
            goto L_0x006a
        L_0x005b:
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x0021
            boolean r0 = r5.A05
            if (r0 != 0) goto L_0x0021
            boolean r0 = r5.A04
            goto L_0x006a
        L_0x0066:
            boolean r0 = r5.A0D()
        L_0x006a:
            if (r0 == 0) goto L_0x000c
            goto L_0x0021
        L_0x006d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDM.A07():java.util.List");
    }

    public final boolean A0B() {
        Integer num;
        if (A0E()) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A0N;
        }
        if (num != AnonymousClass05K.A0N) {
            return false;
        }
        return true;
    }

    public final boolean A0D() {
        Integer num;
        Integer num2;
        if (A0E()) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A0N;
        }
        if (num != AnonymousClass05K.A00) {
            return false;
        }
        ECPPaymentRequest A0U = Pxh.A0U(this.A0H);
        if (A0U != null) {
            num2 = A0U.A04.A09.A01;
        } else {
            num2 = null;
        }
        if (num2 != AnonymousClass05K.A01) {
            return !A0C();
        }
        AnonymousClass2E0.A0D();
        return true;
    }

    public final boolean A0E() {
        Set<REn> set;
        Set<C8891REi> set2;
        CheckoutConfiguration checkoutConfiguration;
        CheckoutConfiguration checkoutConfiguration2;
        ECPRepositoryImpl A012 = C11353SOm.A01();
        AnonymousClass2Fj r3 = this.A0H;
        ECPPaymentRequest A0U = Pxh.A0U(r3);
        if (A0U == null || (checkoutConfiguration2 = A0U.A01) == null) {
            set = 0sl.A00;
        } else {
            set = checkoutConfiguration2.A0H;
        }
        ECPPaymentRequest A0U2 = Pxh.A0U(r3);
        if (A0U2 == null || (checkoutConfiguration = A0U2.A01) == null) {
            set2 = 0sl.A00;
        } else {
            set2 = checkoutConfiguration.A0I;
        }
        Object A022 = r3.A02();
        if (A022 != null) {
            return A012.A07(((ECPPaymentRequest) A022).A08, set, set2);
        }
        throw AnonymousClass7TE.A0y();
    }
}
