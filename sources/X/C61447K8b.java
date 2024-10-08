package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* renamed from: X.K8b  reason: case insensitive filesystem */
public final class C61447K8b extends UZ3 implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "BrandedContentRequestApprovalFragment";
    public List A00 = AnonymousClass7TE.A1C();
    public List A01 = AnonymousClass7TE.A1C();

    public final X8a A0B() {
        return new C65612Lwn(this, 3);
    }

    public final VWN A0C() {
        return new VWN(requireContext(), (FragmentActivity) null, this, A06(), new C65619Lwu(this, 3), new KXN(this, 3), (Integer) null, (String) null, false, false, false);
    }

    public final String A0D() {
        return "branded_content_request_brand_approval_page";
    }

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131954169);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        String A0m = DbU.A0m(this, 2131954165);
        A05().setVisibility(0);
        TextView A05 = A05();
        SpannableStringBuilder A0E = DbY.A0E(this, A0m, 2131954166);
        FragmentActivity activity = getActivity();
        JTO.A1Z(activity);
        AnonymousClass7AV.A05(A0E, new C62146Kaz(this, activity.getColor(2Yu.A06(getContext()))), A0m);
        A05.setText(A0E);
        DbT.A1H(A05());
        DbS.A1T(A0A());
        AnonymousClass7TE.A1Z(new MHC(this, (AnonymousClass4D7) null, 36), DbV.A0J(this));
        JVF.A01(this, A06(), AnonymousClass05K.A1I);
    }
}
