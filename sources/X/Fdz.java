package X;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.proxygen.TraceFieldType;
import java.util.regex.Pattern;

public final class Fdz implements G79 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ 0lg A02;
    public final /* synthetic */ G68 A03;
    public final /* synthetic */ FGJ A04;
    public final /* synthetic */ C46634DiE A05;
    public final /* synthetic */ String A06;

    public Fdz(Activity activity, 0lg r2, G68 g68, FGJ fgj, C46634DiE diE, String str, long j) {
        this.A04 = fgj;
        this.A01 = activity;
        this.A02 = r2;
        this.A05 = diE;
        this.A00 = j;
        this.A03 = g68;
        this.A06 = str;
    }

    public final void Doe(String str) {
        Pattern pattern;
        Activity activity = this.A01;
        if (SMf.A00(activity)) {
            0qQ.A0B(str, 0);
            pattern = FES.A01;
        } else {
            0qQ.A0B(str, 0);
            pattern = FES.A03;
        }
        0qQ.A08(pattern);
        String A002 = FES.A00(str, pattern);
        if (!TextUtils.isEmpty(A002)) {
            0lg r10 = this.A02;
            String str2 = this.A05.A01;
            double A003 = DbV.A00(str2, 1);
            double A004 = DbS.A00();
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r10), "ig_android_sms_retriever_received_sms");
            DbW.A13(A0e, A003);
            A0e.A8D(TraceFieldType.Duration, Double.valueOf((double) (SystemClock.elapsedRealtime() - this.A00)));
            DbY.A1D(A0e, A003, A004);
            FH8.A05(A0e);
            FH8.A06(A0e);
            DbY.A1I(A0e, "release_channel", FH8.A01(), A004);
            DbS.A1H(A0e, str2);
            DbZ.A1E(A0e);
            FH8.A0C(A0e, r10);
            this.A03.DgP(activity, A002, this.A06);
            return;
        }
        FGJ.A02(this.A02, this.A05, "parse_error", SystemClock.elapsedRealtime() - this.A00);
    }

    public final void onFail(C268654dm r8) {
        String str;
        Throwable A012 = r8.A01();
        if (A012 == null || A012.getMessage() == null) {
            str = "unknown";
        } else {
            str = A012.getMessage();
        }
        if ("unsupported".equals(str)) {
            FGJ fgj = this.A04;
            FGJ.A00(this.A01, this.A02, fgj, this.A06);
        }
        FGJ.A02(this.A02, this.A05, str, SystemClock.elapsedRealtime() - this.A00);
    }
}
