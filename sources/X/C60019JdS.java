package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.JdS  reason: case insensitive filesystem */
public final class C60019JdS extends ClickableSpan {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ GSY A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    public C60019JdS(FragmentActivity fragmentActivity, GSY gsy, UserSession userSession, String str) {
        this.A01 = gsy;
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = str;
    }

    public final void onClick(View view) {
        GSY gsy = this.A01;
        C62320sa r0 = (C62320sa) gsy.A00;
        if (r0 != null) {
            r0.invoke();
        }
        SUL A0J = Dba.A0J(this.A00, this.A02, (2EG) gsy.A01, gsy.A03);
        A0J.A0S = this.A03;
        A0J.A0A();
    }

    public final void updateDrawState(TextPaint textPaint) {
        DbW.A0u(textPaint);
        FragmentActivity fragmentActivity = this.A00;
        AnonymousClass7TE.A1N(fragmentActivity, textPaint, 2Yu.A06(fragmentActivity));
    }
}
