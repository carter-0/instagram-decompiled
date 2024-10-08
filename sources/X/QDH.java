package X;

import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.otc.models.OtcInput;
import com.facebookpay.otc.models.OtcOptionState;

public final class QDH extends 2YL {
    public AnonymousClass2Fj A00;
    public ECPPaymentRequest A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final 2Fk A05;
    public final 2Fk A06;
    public final C319836rJ A07;
    public final 0sP A08 = TY2.A00(this, 3);

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f3, code lost:
        if (r0.A01 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1 != true) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.QDH r8) {
        /*
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r8.A01
            r2 = 1
            if (r0 == 0) goto L_0x0014
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x0014
            java.util.Set<X.REn> r1 = r0.A0H
            X.REn r0 = X.REn.ONE_TIME_CHECKOUT_OPTION
            boolean r1 = r1.contains(r0)
            r0 = 1
            if (r1 == r2) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r8.A02 = r0
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r8.A01
            if (r0 == 0) goto L_0x002d
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r0 = r0.A03
            if (r0 == 0) goto L_0x002d
            java.util.Set<X.RDy> r1 = r0.A09
            if (r1 == 0) goto L_0x002d
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00d3
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00d3
        L_0x002d:
            r2 = 0
        L_0x002e:
            r8.A04 = r2
            boolean r0 = r8.A02
            if (r0 != 0) goto L_0x0036
            if (r2 == 0) goto L_0x00cd
        L_0x0036:
            X.6rJ r6 = r8.A07
            java.lang.String r5 = "OTC_SESSION_STATE_KEY"
            java.lang.Object r0 = r6.A00(r5)
            if (r0 != 0) goto L_0x0066
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r0 = X.C11353SOm.A01()
            X.2Fk r0 = r0.A03
            X.SUj r0 = X.Pxe.A0W(r0)
            if (r0 == 0) goto L_0x0052
            java.lang.Object r4 = r0.A01
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x0056
        L_0x0052:
            java.lang.String r4 = X.C51972G9s.A0n()
        L_0x0056:
            X.0sm r3 = X.0Yt.A0E()
            X.RED r2 = X.RED.NON_OTC
            java.lang.String r1 = "CARD"
            com.facebookpay.otc.models.OtcOptionState r0 = new com.facebookpay.otc.models.OtcOptionState
            r0.<init>(r2, r4, r1, r3)
            r6.A01(r5, r0)
        L_0x0066:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r3 = r8.A01
            if (r3 == 0) goto L_0x00cd
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x00d0
            java.lang.String r0 = "CARD"
        L_0x0070:
            r6 = 0
            com.facebookpay.otc.models.OtcInput r4 = new com.facebookpay.otc.models.OtcInput
            r4.<init>(r6, r0)
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r3.A05
            if (r0 == 0) goto L_0x00ce
            java.lang.String r5 = r0.A02
        L_0x007c:
            X.2IV r2 = X.Pxe.A0R()
            X.5tb r0 = X.C298525tb.CONTACT_INFORMATION
            boolean r0 = X.C11432SUd.A0O(r3, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "request_contact"
            r2.A08(r0, r1)
            X.5tb r0 = X.C298525tb.SHIPPING_ADDRESS
            boolean r0 = X.C11432SUd.A0O(r3, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "request_shipping"
            r2.A08(r0, r1)
            java.lang.String r7 = "REGULAR"
            X.SJK r4 = X.C11432SUd.A04(r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = "ONE_TIME_CHECKOUT_OPTION"
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r0)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r4.A01 = r1
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r3 = X.C11353SOm.A01()
            X.5A3 r2 = X.AnonymousClass2E0.A06()
            r1 = 3
            X.Sc3 r0 = new X.Sc3
            r0.<init>(r1, r4, r3)
            X.QCn r1 = X.C8282QnO.A00(r0, r2)
            r0 = 21
            X.Sdp r0 = X.C11647Sdp.A00(r8, r0)
            X.SQB.A01(r6, r1, r0)
        L_0x00cd:
            return
        L_0x00ce:
            r5 = r6
            goto L_0x007c
        L_0x00d0:
            java.lang.String r0 = "NEW_PAYPAL_CHECKOUT"
            goto L_0x0070
        L_0x00d3:
            java.util.Iterator r1 = r1.iterator()
        L_0x00d7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = r1.next()
            X.RDy r0 = (X.C8881RDy) r0
            int r0 = r0.ordinal()
            if (r0 != r2) goto L_0x00d7
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r8.A01
            if (r0 == 0) goto L_0x002d
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x002d
            com.facebookpay.expresscheckout.models.APMConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x002d
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDH.A00(X.QDH):void");
    }

    public final OtcOptionState A04() {
        return (OtcOptionState) this.A07.A00("OTC_SESSION_STATE_KEY");
    }

    public final void A05() {
        if (this.A04) {
            OtcOptionState A042 = A04();
            if (A042 != null) {
                String str = A042.A01;
                C298525tb r0 = C298525tb.SHIPPING_ADDRESS;
                RED red = RED.OTC_AND_NON_OTC;
                this.A07.A01("OTC_SESSION_STATE_KEY", new OtcOptionState(RED.OTC, str, "NEW_PAYPAL_CHECKOUT", DbY.A0p(C298525tb.CONTACT_INFORMATION, red, AnonymousClass7TE.A1L(r0, red))));
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void A07(boolean z) {
        RED red;
        if (this.A02) {
            this.A03 = z;
            boolean A09 = A09();
            boolean z2 = !this.A03;
            if (A09) {
                A06(z2);
            } else if (this.A02) {
                OtcOptionState A042 = A04();
                if (A042 != null) {
                    0sm A0E = 0Yt.A0E();
                    if (z2) {
                        red = RED.OTC;
                    } else {
                        red = RED.NON_OTC;
                    }
                    String str = A042.A01;
                    String str2 = A042.A02;
                    0qQ.A0B(A0E, 1);
                    this.A07.A01("OTC_SESSION_STATE_KEY", new OtcOptionState(red, str, str2, A0E));
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
    }

    public QDH(C319836rJ r3, ECPPaymentRequest eCPPaymentRequest) {
        this.A07 = r3;
        this.A01 = eCPPaymentRequest;
        AnonymousClass2Fj A002 = SUj.A00((Object) null);
        this.A00 = A002;
        this.A06 = AnonymousClass72Y.A01(A002, TXJ.A00);
        this.A05 = AnonymousClass72Y.A01(this.A00, TXI.A00);
        if (this.A01 != null) {
            A00(this);
        }
    }

    public final RED A01(C298525tb r3) {
        OtcOptionState A042 = A04();
        if (A042 == null) {
            return RED.NON_OTC;
        }
        RED red = (RED) A042.A03.get(r3);
        if (red == null) {
            return A042.A00;
        }
        return red;
    }

    public final OtcInput A02(C298525tb r5, boolean z) {
        OtcOptionState A042 = A04();
        if (A042 == null) {
            return null;
        }
        if (r5 != null) {
            Object obj = A042.A03.get(r5);
            if (obj == null) {
                obj = A042.A00;
            }
            if (obj != RED.OTC && (obj != RED.OTC_AND_NON_OTC || !z)) {
                return null;
            }
        } else if (!A09()) {
            return null;
        }
        return new OtcInput(A042.A01, A042.A02);
    }

    public final SEB A03() {
        String str;
        boolean A09 = A09();
        OtcOptionState A042 = A04();
        if (A042 != null) {
            str = A042.A02;
        } else {
            str = null;
        }
        return new SEB(A09, str);
    }

    public final void A06(boolean z) {
        RED red;
        String A0n = C51972G9s.A0n();
        0sm A0E = 0Yt.A0E();
        if (z) {
            red = RED.OTC;
        } else {
            red = RED.NON_OTC;
        }
        this.A07.A01("OTC_SESSION_STATE_KEY", new OtcOptionState(red, A0n, "CARD", A0E));
    }

    public final boolean A08() {
        String str;
        OtcOptionState A042 = A04();
        if (A042 == null || !A042.A04) {
            return false;
        }
        OtcOptionState A043 = A04();
        if (A043 != null) {
            str = A043.A02;
        } else {
            str = null;
        }
        if (0qQ.A0K(str, "CARD")) {
            return true;
        }
        return false;
    }

    public final boolean A09() {
        OtcOptionState A042 = A04();
        if (A042 == null || !A042.A04) {
            return false;
        }
        return true;
    }
}
