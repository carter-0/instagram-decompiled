package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;

public final class IA5 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass2uE A00;

    public IA5(AnonymousClass2uE r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(130420710);
        AnonymousClass2uE r5 = this.A00;
        String moduleName = r5.A0X.getModuleName();
        AnonymousClass2uE.A03(r5, AnonymousClass3WA.ORGANIC_SHOW_LESS_NOT_INTERESTED, false);
        C249763kK r0 = r5.A0a;
        if (r0 != null) {
            I7O.A04(r5, r5.E4l(r5.A07()).A00(), r5.A0T, r5.A07(), (AnonymousClass3W1) null, "sfplt_in_grid", r0.getSessionId(), (String) null, (String) null, (String) null, r5.A01, false);
        }
        if (moduleName.equals("explore_popular")) {
            if (182.A06(0Tu.A05, r5.A0T, 36315649294863818L)) {
                C310336ap A0a = DbS.A0a();
                Context context = r5.A0P;
                DbS.A19(context, A0a, 2131967717);
                A0a.A0I = context.getString(2131967716);
                DbW.A0q(context, A0a, 2131967715);
                C57276IVl.A00(A0a, r5, 7);
                A0a.A07(R.drawable.instagram_eye_off_pano_outline_32);
                A0a.A02();
                A0a.A0L = true;
                A0a.A06();
                Dbb.A1Q(A0a);
                AnonymousClass0fD.A0C(-1036266155, A05);
            }
        }
        C59689JTv.A06(r5.A0P, 2131972986);
        AnonymousClass0fD.A0C(-1036266155, A05);
    }
}
