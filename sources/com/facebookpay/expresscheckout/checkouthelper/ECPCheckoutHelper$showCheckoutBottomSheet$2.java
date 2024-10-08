package com.facebookpay.expresscheckout.checkouthelper;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import X.S3F;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebookpay.expresscheckout.checkouthelper.ECPCheckoutHelper$showCheckoutBottomSheet$2", f = "ECPCheckoutHelper.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
public final class ECPCheckoutHelper$showCheckoutBottomSheet$2 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ S3F A01;
    public final /* synthetic */ ECPPaymentRequest A02;
    public final /* synthetic */ PaymentReceiverInfo A03;
    public final /* synthetic */ TransactionInfo A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;
    public final /* synthetic */ boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ECPCheckoutHelper$showCheckoutBottomSheet$2(S3F s3f, ECPPaymentRequest eCPPaymentRequest, PaymentReceiverInfo paymentReceiverInfo, TransactionInfo transactionInfo, String str, String str2, String str3, String str4, List list, AnonymousClass4D7 r11, boolean z) {
        super(2, r11);
        this.A02 = eCPPaymentRequest;
        this.A01 = s3f;
        this.A04 = transactionInfo;
        this.A09 = list;
        this.A07 = str;
        this.A0A = z;
        this.A08 = str2;
        this.A06 = str3;
        this.A05 = str4;
        this.A03 = paymentReceiverInfo;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebookpay.expresscheckout.checkouthelper.ECPCheckoutHelper$showCheckoutBottomSheet$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r14) {
        ECPPaymentRequest eCPPaymentRequest = this.A02;
        S3F s3f = this.A01;
        TransactionInfo transactionInfo = this.A04;
        List list = this.A09;
        String str = this.A07;
        boolean z = this.A0A;
        return new ECPCheckoutHelper$showCheckoutBottomSheet$2(s3f, eCPPaymentRequest, this.A03, transactionInfo, str, this.A08, this.A06, this.A05, list, r14, z);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            r2 = r15
            X.1Hj r1 = X.1Hj.A02
            r8 = r14
            int r0 = r14.A00
            r13 = 1
            if (r0 == 0) goto L_0x003b
            X.0eS.A00(r15)
        L_0x000c:
            X.SUj r2 = (X.SUj) r2
            boolean r0 = X.SUj.A0S(r2)
            if (r0 == 0) goto L_0x0038
            X.S3F r9 = r14.A01
            androidx.fragment.app.Fragment r0 = r9.A01
            if (r0 == 0) goto L_0x0020
            android.content.Context r3 = r0.getContext()
            if (r3 != 0) goto L_0x0022
        L_0x0020:
            androidx.fragment.app.FragmentActivity r3 = r9.A02
        L_0x0022:
            java.lang.String r11 = r14.A08
            java.lang.String r12 = r14.A06
            java.lang.String r10 = r14.A05
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r8 = r14.A03
            java.lang.Throwable r2 = r2.A02
            X.TTY r7 = new X.TTY
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.RFe r1 = X.C8911RFe.A05
            X.TXR r0 = X.TXR.A00
            X.C11394SRm.A00(r3, r1, r2, r7, r0)
        L_0x0038:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x003b:
            X.0eS.A00(r15)
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r2 = X.C11353SOm.A01()
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r4 = r14.A02
            X.S3F r0 = r14.A01
            com.facebookpay.expresscheckout.handler.ECPHandler r3 = r0.A00
            com.facebookpay.expresscheckout.models.TransactionInfo r5 = r14.A04
            java.util.List r7 = r14.A09
            java.lang.String r6 = r14.A07
            boolean r9 = r14.A0A
            r14.A00 = r13
            java.lang.Object r2 = r2.A03(r3, r4, r5, r6, r7, r8, r9)
            if (r2 != r1) goto L_0x000c
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.expresscheckout.checkouthelper.ECPCheckoutHelper$showCheckoutBottomSheet$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ECPCheckoutHelper$showCheckoutBottomSheet$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
