package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.EwB  reason: case insensitive filesystem */
public final class C49470EwB {
    public final G76 A00;
    public final IgdsBanner A01;

    public C49470EwB(Context context, FragmentActivity fragmentActivity, UserSession userSession, G76 g76) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        UserSession userSession2 = userSession;
        int A03 = DbW.A03(1, fragmentActivity2, userSession2);
        G76 g762 = g76;
        this.A00 = g762;
        IgdsBanner igdsBanner = new IgdsBanner(context, (AttributeSet) null, 0);
        igdsBanner.setIcon((int) R.drawable.ig_illustrations_qp_crown_badge_refresh);
        igdsBanner.setIconBackground((Drawable) null);
        String A16 = AnonymousClass7TE.A16(context, 2131963821);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(context.getString(2131963822));
        0qQ.A07(spannableStringBuilder.append(10));
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        SpannableStringBuilder append = spannableStringBuilder.append(context.getString(2131963820)).append(" ").append(A16);
        0qQ.A07(append);
        AnonymousClass7AV.A03(append, new C48050ESt(fragmentActivity2, userSession2, this, DbV.A02(context), A03), A16);
        DbT.A1U(igdsBanner, append, true);
        igdsBanner.setDismissible(true);
        igdsBanner.A00 = g762;
        this.A01 = igdsBanner;
    }
}
