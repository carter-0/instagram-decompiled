package X;

import androidx.fragment.app.FragmentActivity;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.offsite.base.CheckoutHandler;
import com.facebookpay.offsite.models.message.MessageHandler;
import com.facebookpay.offsite.models.message.PaymentRequestContent;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.SuM  reason: case insensitive filesystem */
public abstract class C12435SuM implements MessageHandler {
    public static final AtomicLong A09 = Pxe.A1D(System.currentTimeMillis());
    public C13864Til A00;
    public String A01;
    public final FragmentActivity A02;
    public final AnonymousClass2gO A03 = C11647Sdp.A00(this, 18);
    public final AnonymousClass2gO A04 = C11647Sdp.A00(this, 19);
    public final C10981S3p A05;
    public final S29 A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08 = C13351TVy.A00(this, 25);

    public final C11023S6a A00() {
        String A052;
        C8124QhG qhG = (C8124QhG) this;
        QLA C8U = qhG.A02.C8U();
        if (C8U == null || (A052 = C8U.A05()) == null) {
            0KC.A0C("IAWOffsiteMessageHandler", "Webview url is empty");
            return null;
        }
        ((C8122QhE) qhG.A07.getValue()).A00 = A052;
        String A0t = DbS.A0t(qhG.A08);
        boolean CZt = qhG.A00.CZt();
        return new C11023S6a(A052, A0t, qhG.A00.BqE(), qhG.A02(), qhG.A04, (Map) qhG.A06.getValue(), CZt);
    }

    public final void A01(PaymentRequestContent paymentRequestContent) {
        C13864Til til;
        0qQ.A0B(paymentRequestContent, 0);
        if (!0qQ.A0K(this.A00.getProductId(), C9650ReU.A00(paymentRequestContent))) {
            til = this.A06.A00(C9650ReU.A00(paymentRequestContent));
            AnonymousClass0eM r1 = this.A07;
            ((CheckoutHandler) r1.getValue()).A0F();
            0qQ.A0B(til, 0);
            ((CheckoutHandler) r1.getValue()).A03 = til;
        } else {
            til = this.A00;
        }
        this.A00 = til;
        AnonymousClass0eM r12 = this.A07;
        if (((CheckoutHandler) r12.getValue()).A03 == null) {
            C13864Til til2 = this.A00;
            0qQ.A0B(til2, 0);
            ((CheckoutHandler) r12.getValue()).A03 = til2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007c, code lost:
        r1.runOnUiThread(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0081, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009c, code lost:
        r2.runOnUiThread(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ad, code lost:
        X.0KC.A0C("OffsiteMessageHandler", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
        throw X.Pxg.A0e("Unexpected message type ", r5.getMessageType(r3), " received from Merchant");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 0
            X.0qQ.A0B(r7, r0)
            byte[] r1 = android.util.Base64.decode(r7, r0)
            X.0qQ.A07(r1)
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            X.0qQ.A08(r0)
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1, r0)
            com.facebookpay.offsite.models.message.GsonUtils r5 = com.facebookpay.offsite.models.message.GsonUtils.INSTANCE
            java.lang.String r1 = r5.getMessageType(r3)
            int r0 = r1.hashCode()
            java.lang.String r4 = "OffsiteMessageHandler"
            switch(r0) {
                case -1142390254: goto L_0x0082;
                case -302871978: goto L_0x006a;
                case 100017577: goto L_0x0044;
                case 1680331711: goto L_0x0031;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.String r2 = "Unexpected message type "
            java.lang.String r1 = r5.getMessageType(r3)
            java.lang.String r0 = " received from Merchant"
            java.lang.IllegalStateException r0 = X.Pxg.A0e(r2, r1, r0)
            throw r0
        L_0x0031:
            java.lang.String r0 = "paymentDetailsUpdated"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0024
            androidx.fragment.app.FragmentActivity r1 = r6.A02
            if (r1 == 0) goto L_0x00a2
            X.TGo r0 = new X.TGo
            r0.<init>(r6, r3)
            goto L_0x007c
        L_0x0044:
            java.lang.String r0 = "paymentRequest"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0024
            com.facebookpay.offsite.models.message.PaymentRequest r3 = r5.getToOffsitePaymentRequest(r3)
            com.facebookpay.offsite.models.message.PaymentRequestContent r1 = r3.content
            com.facebookpay.offsite.models.message.PaymentOptions r0 = r1.paymentOptions
            java.lang.String r0 = r0.fulfillmentType
            if (r0 != 0) goto L_0x005b
            java.lang.String r0 = r6.A01
        L_0x005b:
            r6.A01 = r0
            r6.A01(r1)
            androidx.fragment.app.FragmentActivity r2 = r6.A02
            if (r2 == 0) goto L_0x00a5
            X.TGm r0 = new X.TGm
            r0.<init>(r6, r3)
            goto L_0x009c
        L_0x006a:
            java.lang.String r0 = "paymentHandled"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0024
            androidx.fragment.app.FragmentActivity r1 = r6.A02
            if (r1 == 0) goto L_0x00a8
            X.TGn r0 = new X.TGn
            r0.<init>(r6, r3)
        L_0x007c:
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1.runOnUiThread(r0)
            return
        L_0x0082:
            java.lang.String r0 = "fbpayAvailableRequest"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0024
            com.facebookpay.offsite.models.message.PaymentRequest r1 = r5.getToOffsitePaymentRequest(r3)
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r1.content
            r6.A01(r0)
            androidx.fragment.app.FragmentActivity r2 = r6.A02
            if (r2 == 0) goto L_0x00ab
            X.TGl r0 = new X.TGl
            r0.<init>(r6, r1)
        L_0x009c:
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r2.runOnUiThread(r0)
            return
        L_0x00a2:
            java.lang.String r0 = "Host activity is null for Payment Details Updated event"
            goto L_0x00ad
        L_0x00a5:
            java.lang.String r0 = "Host activity is null for Payment Request event"
            goto L_0x00ad
        L_0x00a8:
            java.lang.String r0 = "Host activity is null for Payment Handled event"
            goto L_0x00ad
        L_0x00ab:
            java.lang.String r0 = "Host activity is null for Availability Request event"
        L_0x00ad:
            X.0KC.A0C(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12435SuM.handleMessage(java.lang.String, java.lang.String):void");
    }

    public final ECPHandler getEcpHandler() {
        return (ECPHandler) this.A08.getValue();
    }

    public C12435SuM(FragmentActivity fragmentActivity, C10981S3p s3p, S29 s29, AnonymousClass0eM r5) {
        this.A02 = fragmentActivity;
        this.A05 = s3p;
        this.A07 = r5;
        this.A06 = s29;
        this.A00 = s29.A00("742725890006429");
    }
}
