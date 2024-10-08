package X;

import android.content.Intent;
import com.facebook.iabadscontext.IABAdsBwIntegrationExtension;
import com.facebook.iabadscontext.IABAdsContext;

public final class SHI {
    public static int A03;
    public static SHI A04;
    public static String A05;
    public C13800ThJ A00 = new Object();
    public QP7 A01;
    public final C10532Rtl A02 = new C10532Rtl();

    public static final SHI A00(Intent intent) {
        0qQ.A0B(intent, 0);
        SHI shi = A04;
        if (shi == null) {
            intent.hashCode();
            A03 = intent.hashCode();
            shi = new SHI(intent);
        }
        if (!(A03 == intent.hashCode() || A04 == null)) {
            intent.hashCode();
            A03 = intent.hashCode();
            shi = new SHI(intent);
        }
        if (!0qQ.A0K(A04, shi)) {
            A04 = shi;
        }
        return shi;
    }

    public final boolean A01() {
        return AnonymousClass7TF.A1W(this.A01.A01, AnonymousClass05K.A0N);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.ThJ] */
    public SHI(Intent intent) {
        long j;
        Integer num = AnonymousClass05K.A00;
        this.A01 = new QP7(num, num, (Long) null, (String) null, (String) null, (String) null, (String) null);
        IABAdsContext iABAdsContext = (IABAdsContext) intent.getParcelableExtra("EXTRA_ADS_CONTEXT");
        if (iABAdsContext != null) {
            IABAdsBwIntegrationExtension iABAdsBwIntegrationExtension = iABAdsContext.A00;
            if (iABAdsBwIntegrationExtension == null) {
                SQO.A02("BwIContext", "Null BwI Extension!", new Object[0]);
            } else if (iABAdsBwIntegrationExtension.A01 != AnonymousClass05K.A0C) {
                QP7 qp7 = new QP7(iABAdsBwIntegrationExtension);
                this.A01 = qp7;
                C10532Rtl rtl = this.A02;
                Integer num2 = iABAdsBwIntegrationExtension.A00;
                if (num2 != null) {
                    j = (long) num2.intValue();
                } else {
                    j = 0;
                }
                rtl.A02 = iABAdsBwIntegrationExtension.A04;
                rtl.A00 = j;
                Integer num3 = AnonymousClass05K.A0N;
                rtl.A01 = num3;
                if (qp7.A03 == num3) {
                    this.A00 = new C12045Sl7(intent);
                }
            }
        }
    }
}
