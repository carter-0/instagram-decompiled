package com.facebookpay.expresscheckout.sample;

import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass2E0;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C11353SOm;
import X.C13083TKp;
import X.C60340gF;
import X.S3G;
import android.os.Handler;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentConfiguration;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.logging.LoggingPolicy;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebookpay.expresscheckout.sample.SampleECPLaunch$launchECP$1", f = "SampleECPLaunch.kt", i = {}, l = {191}, m = "invokeSuspend", n = {}, s = {})
public final class SampleECPLaunch$launchECP$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ CheckoutConfiguration A01;
    public final /* synthetic */ ECPPaymentConfiguration A02;
    public final /* synthetic */ EcpUIConfiguration A03;
    public final /* synthetic */ PaymentReceiverInfo A04;
    public final /* synthetic */ TransactionInfo A05;
    public final /* synthetic */ S3G A06;
    public final /* synthetic */ LoggingPolicy A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ List A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SampleECPLaunch$launchECP$1(CheckoutConfiguration checkoutConfiguration, ECPPaymentConfiguration eCPPaymentConfiguration, EcpUIConfiguration ecpUIConfiguration, PaymentReceiverInfo paymentReceiverInfo, TransactionInfo transactionInfo, S3G s3g, LoggingPolicy loggingPolicy, String str, String str2, String str3, List list, AnonymousClass4D7 r13) {
        super(2, r13);
        this.A0A = str;
        this.A09 = str2;
        this.A04 = paymentReceiverInfo;
        this.A0B = list;
        this.A06 = s3g;
        this.A03 = ecpUIConfiguration;
        this.A01 = checkoutConfiguration;
        this.A02 = eCPPaymentConfiguration;
        this.A05 = transactionInfo;
        this.A07 = loggingPolicy;
        this.A08 = str3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebookpay.expresscheckout.sample.SampleECPLaunch$launchECP$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r15) {
        String str = this.A0A;
        String str2 = this.A09;
        PaymentReceiverInfo paymentReceiverInfo = this.A04;
        List list = this.A0B;
        S3G s3g = this.A06;
        return new SampleECPLaunch$launchECP$1(this.A01, this.A02, this.A03, paymentReceiverInfo, this.A05, s3g, this.A07, str, str2, this.A08, list, r15);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [com.facebookpay.expresscheckout.sample.SampleECPLaunch$launchECP$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r2 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            AnonymousClass2E0.A05();
            String str = this.A0A;
            String str2 = this.A09;
            String str3 = this.A04.A02;
            List list = this.A0B;
            this.A00 = 1;
            if (C11353SOm.A01().A04((CheckoutConfiguration) null, (LoggingPolicy) null, str, str2, (String) null, str3, list, this) == r2) {
                return r2;
            }
        }
        Handler A0D = AnonymousClass7TF.A0D();
        S3G s3g = this.A06;
        String str4 = this.A0A;
        String str5 = this.A09;
        EcpUIConfiguration ecpUIConfiguration = this.A03;
        PaymentReceiverInfo paymentReceiverInfo = this.A04;
        A0D.postDelayed(new C13083TKp(this.A01, this.A02, ecpUIConfiguration, paymentReceiverInfo, this.A05, s3g, this.A07, str4, str5, this.A08, this.A0B), 3000);
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SampleECPLaunch$launchECP$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
