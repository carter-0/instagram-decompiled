package X;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;

/* renamed from: X.Gzb  reason: case insensitive filesystem */
public final class C54106Gzb extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "DefaultNudgeFragment";
    public C55854Hob A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return "nudging";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0B = DbW.A0B(view, R.id.learn_more_tv);
        C58175Inf inf = new C58175Inf(this, 27);
        getResources();
        SpannableStringBuilder A0E = C51965G9l.A0E();
        ArrayDeque arrayDeque = new ArrayDeque();
        A0E.append(getString(2131972291));
        GNT.A00(A0E, getString(2131972292), "[[learn_more]]", arrayDeque, new Object[]{new C54490HFw(inf, Dbb.A04(this), 2)}, 33);
        DbT.A1H(A0B);
        A0B.setHighlightColor(requireContext().getColor(R.color.fds_transparent));
        A0B.setText(new SpannableString(A0E));
        ID1.A01(AnonymousClass7TE.A0b(view, R.id.nudge_cta), 50, this);
        C55854Hob hob = this.A00;
        if (hob != null) {
            1Xj r5 = hob.A01;
            String str2 = hob.A03;
            String str3 = hob.A04;
            boolean z = hob.A05;
            0wc r2 = hob.A00;
            if (str2 == null) {
                num = AnonymousClass05K.A0Y;
            } else {
                num = AnonymousClass05K.A0N;
            }
            LinkedHashMap A07 = 0Yt.A07(DbW.A1b("is_launched_from_bottomsheet", String.valueOf(z)));
            0Aj A0e = AnonymousClass7TE.A0e(r2, "instagram_wellbeing_nudging");
            if (3 - num.intValue() != 0) {
                str = "heated_thread_ig_led";
            } else {
                str = "comment_reply";
            }
            C51969G9p.A1F(A0e, "source_of_action", str, A07);
            A0e.A9F("parent_comment_id", C51972G9s.A0j(str3));
            A0e.A9F("replied_to_comment_id", C51972G9s.A0i(str2));
            C51965G9l.A1J(A0e, r5.getId());
            DbS.A1H(A0e, "impression");
            A0e.Cgf();
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-347911257);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.nudge_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(1880015821, A02);
        return inflate;
    }
}
