package X;

import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.KFh  reason: case insensitive filesystem */
public final class C61631KFh extends C232222tE {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final String A02 = K81.__redex_internal_original_name;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60579Jno(DbT.A0D(layoutInflater, viewGroup, R.layout.appreciation_creator_insights_info_row, false));
    }

    public C61631KFh(FragmentActivity fragmentActivity, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r14, C249703kE r15) {
        C61158JyA jyA = (C61158JyA) r14;
        C60579Jno jno = (C60579Jno) r15;
        boolean A1Z = AnonymousClass7TG.A1Z(jyA, jno);
        jno.A01.setText(jyA.A01);
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        String str = this.A02;
        TextView textView = jno.A00;
        String str2 = jyA.A00;
        List<GSY> list = jyA.A02;
        boolean A1S = DbW.A1S(A1Z ? 1 : 0, fragmentActivity, userSession);
        C51974G9v.A1M(str, textView, str2);
        SpannableStringBuilder A0C = DbS.A0C(str2);
        if (list != null) {
            for (GSY gsy : list) {
                String str3 = gsy.A02;
                int A07 = 00l.A07(str2, str3, str2.length() - 1);
                if (A07 >= 0) {
                    C60019JdS jdS = new C60019JdS(fragmentActivity, gsy, userSession, str);
                    Pattern pattern = 0mp.A00;
                    A0C.setSpan(jdS, A07, DbX.A05(str3) + A07, 33);
                }
            }
        }
        DbX.A1G(textView, A0C);
        textView.setHighlightColor(A1S ? 1 : 0);
    }

    public final Class modelClass() {
        return C61158JyA.class;
    }
}
