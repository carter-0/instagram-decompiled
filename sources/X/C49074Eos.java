package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.regex.Pattern;

/* renamed from: X.Eos  reason: case insensitive filesystem */
public abstract class C49074Eos {
    public static final SpannableStringBuilder A00(Context context, AnonymousClass0iw r13, UserSession userSession, Integer num) {
        Context context2 = context;
        UserSession userSession2 = userSession;
        AnonymousClass7TF.A1H(context, userSession);
        String A16 = AnonymousClass7TE.A16(context, 2131966464);
        Integer num2 = num;
        int i = 2131966461;
        if (num.intValue() != 0) {
            i = 2131966463;
        }
        String string = context.getString(i);
        0qQ.A0A(string);
        if (string.length() == 0) {
            return null;
        }
        String A0g = 002.A0g(A16, " · ", string);
        SpannableStringBuilder A0C = DbS.A0C(A0g);
        Pattern pattern = 0mp.A01;
        A0C.setSpan(new TextAppearanceSpan(context, R.style.igds_emphasized_body_1), 0, A16.length(), 33);
        A0C.setSpan(new ForegroundColorSpan(AnonymousClass7TF.A03(context, R.attr.igdsSecondaryText)), 0, DbX.A05(A0g), 33);
        String A04 = 182.A04(0Tu.A05, userSession, 36885771846353567L);
        if (A04.length() <= 0) {
            return A0C;
        }
        String A162 = AnonymousClass7TE.A16(context, 2131966462);
        A0C.append(" ");
        A0C.append(A162);
        AnonymousClass7AV.A05(A0C, new C48048ESr(context2, r13, userSession2, num2, A04, DbV.A02(context)), A162);
        return A0C;
    }
}
