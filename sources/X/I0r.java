package X;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;

public final class I0r {
    public static final I0r A00 = new Object();

    public final Spanned A01(Context context, int i) {
        String str;
        if (i > 2) {
            str = DbW.A0h(context, C253673rC.A04(AnonymousClass7TF.A0A(context), Integer.valueOf(i - 1), IgNetworkConsentStorage.MAX_ENTRIES, true, true), 2131974244);
        } else {
            str = "";
        }
        0qQ.A0A(str);
        if (str == null) {
            str = "";
        }
        Spanned fromHtml = Html.fromHtml(str);
        0qQ.A07(fromHtml);
        return fromHtml;
    }

    public final SpannableStringBuilder A00(Context context, String str, int i) {
        SpannableStringBuilder A0E = C51965G9l.A0E();
        String A0g = 002.A0g("<b>", str, "</b>");
        if (A0g == null) {
            A0g = "";
        }
        Spanned fromHtml = Html.fromHtml(A0g);
        0qQ.A07(fromHtml);
        A0E.append(fromHtml);
        A0E.append(" ");
        A0E.append(A01(context, i));
        return A0E;
    }
}
