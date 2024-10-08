package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;

/* renamed from: X.DjK  reason: case insensitive filesystem */
public final class C46691DjK extends ClickableSpan {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C46691DjK(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = str;
        this.A01 = obj;
    }

    public final void onClick(View view) {
        String str;
        switch (this.A00) {
            case 0:
                SUL A0J = Dba.A0J((Context) this.A02, (UserSession) this.A01, 2EG.A0b, "https://help.instagram.com/316932422966736");
                A0J.A0S = this.A03;
                A0J.A0A();
                AnonymousClass6SR.A01().A0G = true;
                return;
            case 1:
                FAF faf = (FAF) this.A02;
                if (faf != null && (str = this.A03) != null) {
                    AnonymousClass37D A0i = DbT.A0i(faf.A00.requireActivity());
                    if (!faf.A01 || A0i == null) {
                        FAF.A00(faf, str);
                        return;
                    }
                    ((AnonymousClass37F) A0i).A0H = new FmK(str, faf, 1);
                    A0i.A0B();
                    return;
                }
                return;
            default:
                C49906FEe.A01(AnonymousClass7TE.A0S((View) this.A01), DbT.A0X(((C47411E1d) this.A02).A00), SimpleWebViewActivity.A02, new C11225SFz("https://help.instagram.com/477434105621119"), this.A03);
                return;
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        Context context;
        int i;
        switch (this.A00) {
            case 0:
                DbW.A0u(textPaint);
                context = (Context) this.A02;
                i = 2Yu.A06(context);
                break;
            case 1:
                textPaint.setUnderlineText(false);
                context = (Context) this.A01;
                i = R.color.badge_color;
                break;
            default:
                0qQ.A0B(textPaint, 0);
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
        }
        AnonymousClass7TE.A1N(context, textPaint, i);
    }
}
