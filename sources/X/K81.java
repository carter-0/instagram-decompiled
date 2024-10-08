package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;
import com.instagram.appreciation.analytics.creator.CreatorLoggingData;
import java.util.Collection;

public final class K81 extends MYR {
    public static final String __redex_internal_original_name = "AppreciationCreatorInsightsInfoBottomSheetFragment";
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A01(MMK.A00(this, 30));
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        CreatorLoggingData A002 = C63036KqR.A00(requireArguments());
        ((LTO) this.A00.getValue()).A0B(Boolean.valueOf(A002.A01), Boolean.valueOf(A002.A02), AnonymousClass05K.A1I, A002.A00);
        String A0m = DbU.A0m(this, 2131953006);
        String A0m2 = DbU.A0m(this, 2131953007);
        String A0z = DbV.A0z(this, A0m, 2131953005);
        0qQ.A07(A0z);
        A0B(0sr.A1P(new C232262tL[]{new C61158JyA(A0m2, A0z, AnonymousClass7TE.A1I(new GSY(2EG.A1J, A0m, (C62320sa) new MMZ(23, (Object) A002, (Object) this)))), new UO2((Integer) null, (Integer) null, AnonymousClass7TF.A0b(), R.dimen.add_account_icon_circle_radius)}));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.2tE, java.lang.Object] */
    public final Collection getDefinitions() {
        return JTT.A0s(new C61631KFh(requireActivity(), AnonymousClass7TE.A0l(this.A01)), new Object());
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(MNX.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }
}
