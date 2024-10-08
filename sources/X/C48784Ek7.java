package X;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.widget.TextView;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ek7  reason: case insensitive filesystem */
public abstract class C48784Ek7 {
    /* JADX WARNING: type inference failed for: r8v0, types: [X.0rm, java.lang.Object] */
    public static final void A00(TextView textView, UserSession userSession, String str) {
        AnonymousClass7TF.A1H(textView, userSession);
        Spanned fromHtml = Html.fromHtml(str);
        0qQ.A07(fromHtml);
        SpannableStringBuilder A0C = DbS.A0C(fromHtml);
        Context context = textView.getContext();
        int color = context.getColor(2Yu.A0D(context));
        ? obj = new Object();
        Object[] spans = A0C.getSpans(0, A0C.length(), URLSpan.class);
        0qQ.A07(spans);
        for (Object obj2 : spans) {
            URLSpan uRLSpan = (URLSpan) obj2;
            obj.A00 = uRLSpan.getURL();
            A0C.setSpan(new ForegroundColorSpan(color), A0C.getSpanStart(uRLSpan), A0C.getSpanEnd(uRLSpan), 17);
            A0C.removeSpan(uRLSpan);
        }
        DbX.A1G(textView, A0C);
        AnonymousClass0fU.A00(new FPH(16, (Object) userSession, (Object) obj, (Object) textView), textView);
    }
}
