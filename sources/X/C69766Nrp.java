package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nrp  reason: case insensitive filesystem */
public abstract class C69766Nrp {
    public static final void A00(Context context, SpannableStringBuilder spannableStringBuilder, UserSession userSession, C62320sa r9, int i, boolean z) {
        boolean A1Y = DbW.A1Y(userSession);
        String A00 = C319886rO.A00(userSession);
        int A002 = (int) C295305nv.A00(context, 8);
        Drawable A003 = 0mk.A00(context, R.drawable.instagram_chevron_right_pano_filled_12);
        if (A003 != null) {
            Drawable mutate = A003.mutate();
            if (mutate != null) {
                AnonymousClass7TE.A1R(mutate, i);
            }
            A003.setBounds(0, 0, A002, A002);
        }
        C69194Ngs ngs = new C69194Ngs(r9, i, 0);
        int i2 = 2131953211;
        if (z) {
            i2 = 2131953233;
        }
        SpannableStringBuilder A0D = DbY.A0D(context, A00, i2);
        AnonymousClass7AV.A04(A0D, ngs, A00);
        spannableStringBuilder.append(A0D);
        spannableStringBuilder.setSpan(C66580MXl.A0E(i), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append("  ");
        int length = spannableStringBuilder.length() - (A1Y ? 1 : 0);
        if (A003 != null) {
            spannableStringBuilder.setSpan(new C2606346l(A003), length, length + 1, 33);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
