package X;

import android.content.Context;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import java.util.regex.Pattern;

/* renamed from: X.Oki  reason: case insensitive filesystem */
public final /* synthetic */ class C71443Oki implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C68035Mz2 A02;

    public /* synthetic */ C71443Oki(Context context, UserSession userSession, C68035Mz2 mz2) {
        this.A02 = mz2;
        this.A00 = context;
        this.A01 = userSession;
    }

    public final void onDraw() {
        int ellipsisCount;
        C68035Mz2 mz2 = this.A02;
        Context context = this.A00;
        UserSession userSession = this.A01;
        TextView textView = mz2.A06;
        if (textView.getLayout() != null && (ellipsisCount = textView.getLayout().getEllipsisCount(textView.getMaxLines() - 1)) > 0) {
            String charSequence = textView.getText().toString();
            String A0R = 002.A0R(" • ", C14240TsN.A04(AnonymousClass000.A00(61), mz2.A03.longValue()));
            Pattern pattern = 0mp.A06;
            int A05 = (DbX.A05(charSequence) - ellipsisCount) - ("…".length() * 2);
            if (182.A06(0Tu.A05, userSession, 36324720265736476L)) {
                A05 -= DbX.A05(A0R);
            }
            if (A05 > 0) {
                charSequence = charSequence.substring(0, A05);
            }
            textView.setText(OPF.A00(context, mz2, charSequence, A0R, true));
        }
    }
}
