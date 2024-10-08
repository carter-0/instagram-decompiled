package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.List;
import java.util.Map;

/* renamed from: X.K8c  reason: case insensitive filesystem */
public final class C61448K8c extends UZ3 implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "BrandedContentApproveCreatorsFragment";
    public String A00;
    public List A01 = AnonymousClass7TE.A1C();
    public List A02 = AnonymousClass7TE.A1C();
    public boolean A03;
    public String A04;

    public static final void A00(C61448K8c k8c, String str, String str2) {
        C61448K8c k8c2 = k8c;
        UserSession A06 = k8c.A06();
        Integer num = AnonymousClass05K.A15;
        Map A0w = AnonymousClass7TF.A0w("action_type", str);
        String str3 = k8c.A04;
        if (str3 == null) {
            0qQ.A0F("entryPoint");
            throw AnonymousClass00P.createAndThrow();
        } else {
            JVF.A03(k8c2, A06, num, (Integer) null, (Integer) null, str2, str3, (String) null, (Throwable) null, A0w);
        }
    }

    public final X8a A0B() {
        return new C65612Lwn(this, 2);
    }

    public final VWN A0C() {
        Context requireContext = requireContext();
        UserSession A06 = A06();
        KXN kxn = new KXN(this, 2);
        C65619Lwu lwu = new C65619Lwu(this, 2);
        return new VWN(requireContext, requireActivity(), this, A06, lwu, kxn, (Integer) null, (String) null, false, false, false);
    }

    public final String A0D() {
        return AnonymousClass000.A00(2725);
    }

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131953087);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A05().setVisibility(0);
        DbU.A1G(A05(), this, 2131972816);
        RecyclerView recyclerView = this.A01;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new FastScrollingLinearLayoutManager(requireContext()));
            RecyclerView recyclerView2 = this.A01;
            if (recyclerView2 != null) {
                JTQ.A0y(recyclerView2.A0D, recyclerView2, new C65319LrI(this, 3), C3251771i.A0A);
                JTU.A19(this);
                DbS.A1T(A0A());
                AnonymousClass7TE.A1Z(new MHC(this, (AnonymousClass4D7) null, 32), DbV.A0J(this));
                UserSession A06 = A06();
                Integer num = AnonymousClass05K.A0u;
                String str2 = this.A04;
                if (str2 == null) {
                    str = "entryPoint";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                JVF.A03(this, A06, num, (Integer) null, (Integer) null, (String) null, str2, (String) null, (Throwable) null, (Map) null);
                return;
            }
        }
        str = "recyclerView";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean onBackPressed() {
        IBinder iBinder;
        View view = this.mView;
        if (view != null) {
            iBinder = view.getWindowToken();
        } else {
            iBinder = null;
        }
        if (iBinder != null) {
            Object systemService = requireContext().getSystemService("input_method");
            0qQ.A0C(systemService, AnonymousClass000.A00(11));
            ((InputMethodManager) systemService).hideSoftInputFromWindow(iBinder, 0);
        }
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-898149184);
        super.onCreate(bundle);
        this.A04 = C320236s2.A01(requireArguments(), ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        AnonymousClass0fD.A09(-1891562335, A022);
    }
}
