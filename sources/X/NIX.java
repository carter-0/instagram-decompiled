package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;

public final class NIX extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "RtcCallSurveyFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final C68300N9n A01;
    public final 0sP A02;

    public NIX(C68300N9n n9n, 0sP r3) {
        0qQ.A0B(n9n, 1);
        this.A01 = n9n;
        this.A02 = r3;
    }

    public final String getModuleName() {
        return "rtc_call_survey_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        0sP r2 = this.A02;
        boolean A1Y = DbW.A1Y(r2);
        TextView A0d = AnonymousClass7TE.A0d(view, R.id.survey_question);
        Context context = view.getContext();
        AnonymousClass2t9 A0U = DbU.A0U(AnonymousClass2t9.A00(context), new NOI(r2));
        AnonymousClass1YB.A00(new C73922Pm2(view, 43));
        RecyclerView A0F = DbZ.A0F(view, R.id.survey_options_recycler_view);
        DbU.A15(A0F.getContext(), A0F, A1Y ? 1 : 0, false);
        A0F.setAdapter(A0U);
        A0F.A0S = A1Y;
        C68300N9n n9n = this.A01;
        List<C69359Njz> list = n9n.A01;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (C69359Njz njz : list) {
            A0r.add(new C68191N5g(njz, AnonymousClass7TE.A16(context, njz.A00)));
        }
        String str = n9n.A00;
        0qQ.A0B(str, 0);
        A0d.setText(str);
        03v.A0I(A0d, A1Y);
        JTR.A1L(A0U, A0r);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1083896348);
        NIX.super.onCreate(bundle);
        requireArguments();
        AnonymousClass0fD.A09(-2044728300, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1009348244);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_call_survey_fragment, false);
        AnonymousClass0fD.A09(-173852878, A022);
        return A0D;
    }
}
