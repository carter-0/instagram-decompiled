package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.DjF  reason: case insensitive filesystem */
public final class C46686DjF extends ClickableSpan {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass4DU A02;

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        Context context = this.A00;
        AnonymousClass7TE.A1N(context, textPaint, 2Yu.A06(context));
    }

    public C46686DjF(Context context, UserSession userSession, AnonymousClass4DU r3) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        DbW.A1J(this.A02, Dba.A0J(this.A00, this.A01, 2EG.A1A, "https://help.instagram.com/517073653436611?helpref=faq_content"));
    }
}
