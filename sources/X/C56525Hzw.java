package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Hzw  reason: case insensitive filesystem */
public final class C56525Hzw {
    public C55761Hmw A00;
    public CharSequence[] A01;
    public final Context A02;
    public final Fragment A03;
    public final UserSession A04;

    public static CharSequence[] A00(C56525Hzw hzw) {
        if (hzw.A01 == null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            Context context = hzw.A02;
            SpannableStringBuilder A0C = DbS.A0C(context.getString(2131963394));
            A0C.setSpan(new ForegroundColorSpan(context.getColor(R.color.red_4)), 0, A0C.length(), 18);
            A1C.add(A0C);
            A1C.add(context.getString(2131951986));
            CharSequence[] charSequenceArr = new CharSequence[A1C.size()];
            hzw.A01 = charSequenceArr;
            A1C.toArray(charSequenceArr);
        }
        return hzw.A01;
    }

    public C56525Hzw(Fragment fragment, UserSession userSession) {
        this.A03 = fragment;
        this.A02 = fragment.getContext();
        this.A04 = userSession;
    }
}
