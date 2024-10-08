package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;

/* renamed from: X.Vss  reason: case insensitive filesystem */
public final class C18497Vss {
    public static final C17757Veg A06 = new Object();
    public final Context A00;
    public final SpannableStringBuilder A01;
    public final UserSession A02;
    public final C16235Uqy A03;
    public final C17508VYm A04;
    public final String A05;

    public C18497Vss(Context context, UserSession userSession, C16235Uqy uqy, C17508VYm vYm, String str) {
        0qQ.A0B(uqy, 5);
        this.A00 = context;
        this.A02 = userSession;
        this.A05 = str;
        this.A04 = vYm;
        this.A03 = uqy;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableStringBuilder A002 = W2t.A00(context);
        spannableStringBuilder.append(context.getResources().getString(2131954412));
        spannableStringBuilder.append(A002);
        spannableStringBuilder.setSpan(new C69199Ngx(this, C51968G9o.A04(context)), 0, spannableStringBuilder.length(), 34);
        this.A01 = spannableStringBuilder;
    }
}
