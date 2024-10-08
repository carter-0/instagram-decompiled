package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;

/* renamed from: X.DjS  reason: case insensitive filesystem */
public final class C46699DjS extends ClickableSpan {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ EX9 A03;
    public final /* synthetic */ String A04;

    public C46699DjS(Context context, AnonymousClass0iw r2, UserSession userSession, EX9 ex9, String str) {
        this.A01 = r2;
        this.A02 = userSession;
        this.A03 = ex9;
        this.A00 = context;
        this.A04 = str;
    }

    public final void onClick(View view) {
        AnonymousClass0iw r0 = this.A01;
        UserSession userSession = this.A02;
        C311496cm r3 = new C311496cm(r0, userSession);
        String obj = this.A03.toString();
        0Aj A0e = AnonymousClass7TE.A0e(r3.A02, "ci_modal_learn_more_tapped");
        if (obj == null) {
            obj = r3.A04;
        }
        DbV.A1J(A0e, obj);
        C49906FEe fEe = SimpleWebViewActivity.A02;
        Context context = this.A00;
        C49906FEe.A01(context, userSession, fEe, new C11225SFz(SQU.A01(context, "https://help.instagram.com/227486307449481")), this.A04);
    }

    public final void updateDrawState(TextPaint textPaint) {
        DbW.A0u(textPaint);
    }
}
