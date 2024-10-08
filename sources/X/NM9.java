package X;

import android.content.Context;
import com.instagram.bugreporter.model.BugReport;
import java.io.File;
import java.util.concurrent.CountDownLatch;

public final class NM9 extends 1P0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ C70757OKd A04;
    public final /* synthetic */ BugReport A05;
    public final /* synthetic */ 0lg A06;
    public final /* synthetic */ File A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ CountDownLatch A0A;
    public final /* synthetic */ C62320sa A0B;

    public NM9(Context context, C70757OKd oKd, BugReport bugReport, 0lg r4, File file, String str, String str2, CountDownLatch countDownLatch, C62320sa r9, int i, int i2, long j) {
        this.A0B = r9;
        this.A04 = oKd;
        this.A09 = str;
        this.A01 = i;
        this.A08 = str2;
        this.A02 = j;
        this.A03 = context;
        this.A06 = r4;
        this.A05 = bugReport;
        this.A07 = file;
        this.A0A = countDownLatch;
        this.A00 = i2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(1802395578);
        NHT nht = (NHT) obj;
        int A033 = AnonymousClass0fD.A03(1945553698);
        0qQ.A0B(nht, 0);
        if (0qQ.A0K(nht.A01, true)) {
            this.A0B.invoke();
            C70757OKd oKd = this.A04;
            String str = this.A09;
            0qQ.A0A(str);
            oKd.A01.markerEnd(396371619, 002.A0A(oKd.A00, str).hashCode() + (this.A01 * 31), 2);
        } else {
            boolean A0K = 0qQ.A0K(nht.A00, true);
            long j = this.A02;
            Object[] objArr = {this.A08, Long.valueOf(j)};
            if (A0K) {
                0KC.A0P("BugReporterUploader", "Received a 200 non-success, retriable response", objArr);
                C70757OKd oKd2 = this.A04;
                String str2 = this.A09;
                0qQ.A0A(str2);
                Integer num = AnonymousClass05K.A00;
                int i = this.A01;
                oKd2.A00(str2, nht.A02, i, nht.mStatusCode, num);
                C71132OdV.A04(this.A03, oKd2, this.A05, this.A06, this.A07, this.A0A, i + 1, j);
            } else {
                0KC.A0P("BugReporterUploader", "Received a 200 non-success, non-retriable response", objArr);
                C70757OKd oKd3 = this.A04;
                String str3 = this.A09;
                0qQ.A0A(str3);
                Integer num2 = AnonymousClass05K.A0C;
                oKd3.A00(str3, nht.A02, this.A01, nht.mStatusCode, num2);
                this.A0B.invoke();
            }
        }
        AnonymousClass0fD.A0A(465786257, A033);
        AnonymousClass0fD.A0A(939870968, A032);
    }

    public final void onFail(C268654dm r17) {
        boolean z;
        String str;
        int i;
        int statusCode;
        C268654dm r5 = r17;
        int A0D = AnonymousClass7TG.A0D(r5, -947078467);
        C262224Cq r0 = C71132OdV.A01;
        0lg r6 = this.A06;
        if (182.A06(0Tu.A05, r6, 36324359489531940L)) {
            1XR r2 = (1XR) r5.A00();
            boolean z2 = false;
            if (r2 != null && 400 <= (statusCode = r2.getStatusCode()) && statusCode < 500) {
                z2 = true;
            }
            z = !z2;
        } else {
            z = true;
        }
        Object A002 = r5.A00();
        AnonymousClass1XT r22 = (AnonymousClass1XT) A002;
        if (r22 == null || (str = r22.getErrorMessage()) == null) {
            str = DbX.A0t(r5.A01());
        }
        1XR r3 = (1XR) A002;
        if (r3 != null) {
            i = r3.getStatusCode();
        } else {
            i = 0;
        }
        if (!z) {
            0KC.A0P("BugReporterUploader", "Upload of attachment %s for bug id %d isn't eligible for retries.", new Object[]{this.A08, Long.valueOf(this.A02)});
            C70757OKd oKd = this.A04;
            String str2 = this.A09;
            0qQ.A0A(str2);
            oKd.A00(str2, str, this.A01, i, AnonymousClass05K.A0C);
        } else {
            int i2 = this.A01;
            if (i2 >= this.A00) {
                0KC.A0P("BugReporterUploader", "Ran out of retry attempt to upload attachment %s for bug id %d", new Object[]{this.A08, Long.valueOf(this.A02)});
                C70757OKd oKd2 = this.A04;
                String str3 = this.A09;
                0qQ.A0A(str3);
                oKd2.A00(str3, str, i2, i, AnonymousClass05K.A01);
            } else {
                C70757OKd oKd3 = this.A04;
                String str4 = this.A09;
                0qQ.A0A(str4);
                oKd3.A00(str4, str, i2, i, AnonymousClass05K.A00);
                C71132OdV.A04(this.A03, oKd3, this.A05, r6, this.A07, this.A0A, i2 + 1, this.A02);
                AnonymousClass0fD.A0A(-1007487929, A0D);
            }
        }
        this.A0B.invoke();
        AnonymousClass0fD.A0A(-1007487929, A0D);
    }
}
