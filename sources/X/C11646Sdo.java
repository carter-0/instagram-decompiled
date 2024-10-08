package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentConfiguration;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.logging.LoggingPolicy;
import java.util.List;

/* renamed from: X.Sdo  reason: case insensitive filesystem */
public final class C11646Sdo implements AnonymousClass2gO {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ SNA A01;
    public final /* synthetic */ EcpUIConfiguration A02;
    public final /* synthetic */ PaymentReceiverInfo A03;
    public final /* synthetic */ TransactionInfo A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ C62320sa A08;

    public C11646Sdo(FragmentActivity fragmentActivity, SNA sna, EcpUIConfiguration ecpUIConfiguration, PaymentReceiverInfo paymentReceiverInfo, TransactionInfo transactionInfo, String str, String str2, String str3, C62320sa r9) {
        this.A01 = sna;
        this.A07 = str;
        this.A06 = str2;
        this.A02 = ecpUIConfiguration;
        this.A05 = str3;
        this.A03 = paymentReceiverInfo;
        this.A04 = transactionInfo;
        this.A00 = fragmentActivity;
        this.A08 = r9;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        SR4 sr4 = (SR4) obj;
        0qQ.A0B(sr4, 0);
        if (DbX.A1a(sr4.A03())) {
            SNA sna = this.A01;
            S3F s3f = sna.A00;
            if (s3f == null) {
                0qQ.A0F("ecpCheckoutHelper");
                throw AnonymousClass00P.createAndThrow();
            }
            String str = this.A07;
            String str2 = this.A06;
            EcpUIConfiguration ecpUIConfiguration = this.A02;
            String str3 = this.A05;
            PaymentReceiverInfo paymentReceiverInfo = this.A03;
            TransactionInfo transactionInfo = this.A04;
            String str4 = str;
            String str5 = str2;
            PaymentReceiverInfo paymentReceiverInfo2 = paymentReceiverInfo;
            TransactionInfo transactionInfo2 = transactionInfo;
            EcpUIConfiguration ecpUIConfiguration2 = ecpUIConfiguration;
            AnonymousClass2Fj A002 = s3f.A00((Bundle) null, (CheckoutConfiguration) null, (ECPConfirmationConfiguration) null, (ECPPaymentConfiguration) null, ecpUIConfiguration2, paymentReceiverInfo2, transactionInfo2, (LoggingPolicy) null, str4, str5, AnonymousClass7TF.A0c(), str3, "DEFAULT_VALUE", (List) null, false, 182.A06(0Tu.A05, C11431STx.A00(), 36313428797687767L));
            FragmentActivity fragmentActivity = this.A00;
            C51969G9p.A15(fragmentActivity, A002, new C58751Iwy(37, this.A08, sna, fragmentActivity), 4);
        }
    }
}
