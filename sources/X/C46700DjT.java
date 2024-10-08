package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.DjT  reason: case insensitive filesystem */
public final class C46700DjT extends ClickableSpan {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 2EG A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ C62320sa A05;

    public C46700DjT(FragmentActivity fragmentActivity, UserSession userSession, 2EG r3, String str, String str2, C62320sa r6) {
        this.A05 = r6;
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A03 = str;
        this.A02 = r3;
        this.A04 = str2;
    }

    public final void onClick(View view) {
        C62320sa r0 = this.A05;
        if (r0 != null) {
            r0.invoke();
        }
        SUL A0J = Dba.A0J(this.A00, this.A01, this.A02, this.A03);
        A0J.A0S = this.A04;
        A0J.A0A();
    }

    public final void updateDrawState(TextPaint textPaint) {
        DbW.A0u(textPaint);
        FragmentActivity fragmentActivity = this.A00;
        AnonymousClass7TE.A1N(fragmentActivity, textPaint, 2Yu.A06(fragmentActivity));
    }
}
