package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import java.util.ArrayDeque;

/* renamed from: X.EkE  reason: case insensitive filesystem */
public abstract class C48791EkE {
    public static final SpannableString A00(Context context, UserSession userSession, String str, ExS... exSArr) {
        0qQ.A0B(userSession, 1);
        context.getResources();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        spannableStringBuilder.append(str);
        for (ExS exS : exSArr) {
            String replace = AnonymousClass7TF.A0j(exS.A00).replace(' ', '_');
            0qQ.A07(replace);
            GNT.A00(spannableStringBuilder, exS.A00, 002.A0g("[[", replace, "]]"), arrayDeque, new Object[]{new C48050ESt(context, userSession, exS, DbV.A02(context))}, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }
}
