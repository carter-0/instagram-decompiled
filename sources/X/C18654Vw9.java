package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.Vw9  reason: case insensitive filesystem */
public final class C18654Vw9 {
    public View A00;
    public C16678UzE A01;
    public IgdsBottomButtonLayout A02;

    public C18654Vw9(View view, C16678UzE uzE) {
        0qQ.A0B(view, 1);
        this.A01 = uzE;
        this.A00 = uzE.ordinal() == 40 ? AnonymousClass7TE.A0b(view, R.id.connect_button_container) : view;
    }

    public final void A01() {
        this.A02 = (IgdsBottomButtonLayout) this.A00.requireViewById(R.id.action_bottom_button);
    }

    public final void A02(int i) {
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A02;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryActionText(igdsBottomButtonLayout.getResources().getString(i));
        }
    }

    public final void A03(X3L x3l) {
        WBH wbh = new WBH(37, (Object) x3l, (Object) this);
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A02;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryActionOnClickListener(wbh);
        }
    }

    public final void A04(boolean z) {
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A02;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryButtonEnabled(z);
        }
    }

    public final void A05(boolean z) {
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A02;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryActionIsLoading(z);
        }
    }

    public static final void A00(Context context, SpannableStringBuilder spannableStringBuilder, FragmentActivity fragmentActivity, C18654Vw9 vw9, UserSession userSession, String str, String str2, String str3, int i) {
        String str4 = str3;
        AnonymousClass7AV.A05(spannableStringBuilder, new C48039ESe(fragmentActivity, vw9, userSession, str4, str2, context.getColor(i), 0), str);
    }
}
