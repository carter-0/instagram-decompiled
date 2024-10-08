package X;

import android.content.Context;
import android.os.CountDownTimer;
import android.widget.TextView;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.instagram.common.session.UserSession;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.Diz  reason: case insensitive filesystem */
public final class C46670Diz extends CountDownTimer {
    public final C47448E2u A00;
    public final DateFormat A01;

    public C46670Diz(C47448E2u e2u, long j) {
        super(j, 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("m:ss", Locale.US);
        this.A01 = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        this.A00 = e2u;
    }

    public final void onFinish() {
        C47448E2u e2u = this.A00;
        TextView textView = e2u.A03;
        if (textView != null) {
            DbU.A1G(textView, e2u, 2131972405);
            if (e2u.mArguments != null) {
                0JA.A03(e2u.A07, "createRobocallRequest() additionally includes a checkNotNull in IgApi.Builder to assert that the user session is not null");
                Context requireContext = e2u.requireContext();
                UserSession userSession = e2u.A07;
                String A0l = DbU.A0l(e2u.requireArguments(), PaymentDetailChangeTypes$Companion.PHONE_NUMBER);
                1NY A0N = DbU.A0N(userSession);
                A0N.A0A("accounts/robocall_user/");
                DbZ.A0y(requireContext, A0N, Dbq.A04(), DbT.A0u(requireContext, A0N, Dbq.A00(), A0l));
                A0N.A0R = true;
                1OC A0S = DbT.A0S(A0N, DwV.class, F6G.class);
                A0S.A00 = new ECR(e2u.requireContext(), DbW.A0Y(e2u), e2u.A07.A05);
                e2u.schedule(A0S);
            }
        }
    }

    public final void onTick(long j) {
        Date date = new Date(j);
        C47448E2u e2u = this.A00;
        String format = this.A01.format(date);
        TextView textView = e2u.A03;
        if (textView != null) {
            DbX.A1F(textView, e2u, format, 2131972406);
        }
    }
}
