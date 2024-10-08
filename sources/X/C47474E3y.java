package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.E3y  reason: case insensitive filesystem */
public final class C47474E3y extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "UnderAgeFragment";
    public UserSession A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    public final String getModuleName() {
        return "under_age_challenge";
    }

    public final boolean onBackPressed() {
        return true;
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void configureActionBar(2da r2) {
        r2.setTitle(getString(2131975847));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(288114806);
        C47474E3y.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = DbX.A0U(this);
        this.A04 = DbU.A0l(requireArguments, "headline");
        this.A03 = DbU.A0l(requireArguments, "content");
        this.A02 = 002.A0R("https://i.instagram.com", requireArguments.getString("download_data_link"));
        this.A01 = DbU.A0l(requireArguments, "appeal_link");
        AnonymousClass0fD.A09(-1352444677, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(139295354);
        View inflate = layoutInflater.inflate(R.layout.challenge_under_age_layout, viewGroup, false);
        DbU.A0G(inflate, R.id.content_title).setText(this.A04);
        TextView A0G = DbU.A0G(inflate, R.id.content_body);
        String str = this.A03;
        ESx eSx = new ESx(DbV.A0n(requireContext(), R.color.badge_color), (Object) this, 7);
        SpannableStringBuilder A0C = DbS.A0C(str);
        Matcher matcher = Pattern.compile("\\^\\*.*\\^\\*").matcher(A0C.toString());
        if (matcher.find()) {
            A0C.setSpan(eSx, matcher.start(), matcher.end(), 33);
            A0C.replace(matcher.end() - 2, matcher.end(), "");
            A0C.replace(matcher.start(), matcher.start() + 2, "");
        }
        DbX.A1G(A0G, A0C);
        FP5.A01(inflate.requireViewById(R.id.appeal_button), 32, this);
        FP5.A01(inflate.requireViewById(R.id.logout_button), 33, this);
        C49943FFw.A00().A03("unknown", AnonymousClass05K.A01);
        C49943FFw A002 = C49943FFw.A00();
        UserSession userSession = this.A00;
        Integer num = AnonymousClass05K.A06;
        AnonymousClass7TF.A1H(userSession, num);
        C49943FFw.A01(this, userSession, A002, num, (Integer) null);
        AnonymousClass0fD.A09(1737213427, A022);
        return inflate;
    }
}
