package X;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class HEJ extends C54153H0x implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "SchoolOnboardingAddSchoolFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return "add_school_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        UserSession A03 = A03();
        if (182.A06(DbS.A0J(A03, 0), A03, 36324750331097438L)) {
            C56031Hrd hrd = A05().A00;
            HDX hdx = new HDX(hrd.A00);
            C74180PqM pqM = new C74180PqM(hrd, 31);
            String obj = ((C53393GnQ) hrd.A01.getValue()).A01.get(0).toString();
            0qQ.A0B(obj, 1);
            2IS A04 = C41845B3m.A04();
            2IS A042 = C41845B3m.A04();
            DbW.A18(C41845B3m.A03(GraphQlCallInput.A02, obj, "surface"), A04, "input");
            PandoGraphQLRequest A002 = II4.A00(A04, A042);
            1vn A01 = 1vm.A01(hdx.A00);
            0qQ.A0A(A002);
            C56925IHu.A00(new C45926DFg(pqM, 26), A002, A01, hdx, 6);
        }
    }

    public final boolean onBackPressed() {
        List list = C55352HgK.A00;
        if (list.contains(HMD.SCHOOL_SELECTION) || list.contains(HMD.GRADUATION_DATE)) {
            C358248ab A0U = DbW.A0U(this);
            A0U.A09(2131953167);
            A0U.A08(2131971917);
            C56719I8z.A01(A0U, this, 39, 2131961848);
            A0U.A0M((DialogInterface.OnClickListener) null, 2131963104, true);
            DbT.A1V(A0U);
            return true;
        }
        A08();
        return false;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return A03();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(636900681);
        ComposeView A0H = DbV.A0H(this, new C59343JFv(this, 38), 819451187);
        AnonymousClass0fD.A09(-526138527, A02);
        return A0H;
    }
}
