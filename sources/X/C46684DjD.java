package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.user.model.User;

/* renamed from: X.DjD  reason: case insensitive filesystem */
public final class C46684DjD extends ClickableSpan {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C46684DjD(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void onClick(View view) {
        SUL sul;
        switch (this.A00) {
            case 0:
                Bundle A0a = AnonymousClass7TE.A0a();
                Activity activity = (Activity) this.A01;
                A0a.putString(DialogModule.KEY_TITLE, activity.getResources().getString(2131955204));
                DbU.A0w(activity, A0a, (0lg) this.A02, TransparentModalActivity.class, C273654mx.A00(251));
                return;
            case 1:
                sul = Dba.A0J((Context) this.A01, AnonymousClass7TE.A0l(((E49) this.A02).A0B), 2EG.A1U, C273654mx.A00(14));
                break;
            case 2:
                ((C47624EAk) this.A01).A00.A0A.A05(((User) this.A02).getId());
                return;
            case 3:
                Context A0S = AnonymousClass7TE.A0S((View) this.A01);
                E60 e60 = (E60) this.A02;
                sul = Dba.A0J(A0S, AnonymousClass7TE.A0l(e60.A03), 2EG.A29, "https://help.instagram.com/517073653436611?helpref=faq_content");
                sul.A0S = e60.A02;
                break;
            default:
                0qQ.A0B(view, 0);
                ((F1t) this.A02).A00((C49723F3m) this.A01);
                return;
        }
        sul.A0A();
    }

    public final void updateDrawState(TextPaint textPaint) {
        int i;
        Context context;
        switch (this.A00) {
            case 1:
                0qQ.A0B(textPaint, 0);
                context = (Context) this.A01;
                i = 2Yu.A06(context);
                break;
            case 2:
                textPaint.setUnderlineText(false);
                textPaint.setFakeBoldText(true);
                return;
            case 3:
                0qQ.A0B(textPaint, 0);
                context = DbT.A08(this.A02);
                i = 2Yu.A06(((View) this.A01).getContext());
                break;
            case 4:
                return;
            default:
                super.updateDrawState(textPaint);
                return;
        }
        AnonymousClass7TE.A1N(context, textPaint, i);
    }
}
