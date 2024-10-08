package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class GUA {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public GUA(Context context, AnonymousClass0iw r2, UserSession userSession) {
        AnonymousClass7TG.A1O(context, userSession);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r2;
    }

    public final void A00(C61078JwG jwG, C53115Gin gin) {
        AnonymousClass7TG.A1N(gin, jwG);
        Context context = this.A00;
        AnonymousClass0iw r1 = this.A01;
        TextView textView = gin.A00;
        SpannableStringBuilder A08 = DbW.A08(context, 2131965828);
        A08.setSpan(new C54491HFx(jwG, r1, context.getColor(2Yu.A06(context))), 0, A08.length(), 18);
        DbT.A1H(textView);
        textView.setHighlightColor(context.getColor(R.color.fds_transparent));
        textView.setText(DbW.A08(context, 2131956423).append(" ").append(A08));
        2eS.A01(textView);
    }
}
