package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.DjL  reason: case insensitive filesystem */
public final class C46692DjL extends ClickableSpan {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ FRD A01;
    public final /* synthetic */ C229382nI A02;
    public final /* synthetic */ UserSession A03;

    public final void onClick(View view) {
        0qQ.A0B(view, 0);
        this.A01.E0s(this.A02.A03, new FRI((UKI) null, (Boolean) null, (Integer) null, (Integer) null, 1.0f, false, false, false, true), C48721Ej6.A00(this.A03, false));
        AnonymousClass6SR.A01().A0G = true;
    }

    public C46692DjL(FragmentActivity fragmentActivity, FRD frd, C229382nI r3, UserSession userSession) {
        this.A01 = frd;
        this.A02 = r3;
        this.A03 = userSession;
        this.A00 = fragmentActivity;
    }

    public final void updateDrawState(TextPaint textPaint) {
        DbW.A0u(textPaint);
        FragmentActivity fragmentActivity = this.A00;
        AnonymousClass7TE.A1N(fragmentActivity, textPaint, 2Yu.A06(fragmentActivity));
    }
}
