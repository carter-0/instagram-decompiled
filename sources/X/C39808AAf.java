package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.text.CustomTypefaceSpan;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.AAf  reason: case insensitive filesystem */
public abstract class C39808AAf {
    public static final C369868vS A00(Context context, UserSession userSession, User user, String str) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        Context context2 = context;
        AnonymousClass7TF.A1B(context, 1, user);
        SpannableString spannableString = new SpannableString(str);
        AnonymousClass0qq A00 = AnonymousClass0qo.A00(context);
        Typeface A02 = A00.A02(0qm.A12);
        if (A02 == null) {
            A02 = Typeface.DEFAULT;
        }
        spannableString.setSpan(new CustomTypefaceSpan(A02), 0, spannableString.length(), 0);
        SpannableString spannableString2 = new SpannableString(002.A0D(user.getUsername(), '@'));
        spannableString2.setSpan(new UnderlineSpan(), 1, spannableString2.length(), 0);
        Typeface A022 = A00.A02(0qm.A13);
        if (A022 == null) {
            A022 = Typeface.DEFAULT;
        }
        spannableString2.setSpan(new CustomTypefaceSpan(A022), 0, spannableString2.length(), 0);
        spannableString2.setSpan(new AnonymousClass91O(AnonymousClass7TF.A0A(context), user), 0, spannableString2.length(), 0);
        return new C369868vS(context2, userSession2, spannableString, spannableString2, AnonymousClass8XF.A01(context), context2.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material), AnonymousClass7TE.A0C(context2.getResources()), AnonymousClass7TH.A01(context2));
    }

    public static final C310416b1 A01() {
        return new C310416b1((AnonymousClass8BH) new AnonymousClass8BG(0.5f, 0.45f), (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, true, false, true, false, false, false, false, true, true, true, true, true, false, false);
    }
}
