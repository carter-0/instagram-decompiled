package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.urlhandlers.brandedcontent.BrandedContentUrlHandlerActivity;

public final class E47 extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "BrandedContentSettingsFragment";
    public C231002qi A00;
    public C62320sa A01 = new MMG(this, 32);
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(new MMG(this, 27));
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131954125);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Dba.A17((RecyclerView) AnonymousClass7TF.A0F(view, R.id.branded_content_settings_recycler_view), this.A02);
        C60305Jj4 jj4 = (C60305Jj4) this.A04.getValue();
        Dba.A16(getViewLifecycleOwner(), jj4.A04, new C58728Iwb(this, 19), 45);
        jj4.A03();
        AnonymousClass7TE.A1Z(new MHC((Object) jj4, (Object) this, (AnonymousClass4D7) null, 40), DbV.A0J(this));
        1YN A002 = AnonymousClass2bO.A00();
        UserSession A0l = AnonymousClass7TE.A0l(this.A03);
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0D;
        AnonymousClass2bO.A00();
        C231002qi A012 = A002.A01(this, this, A0l, 2bV.A04(new C50735Fha(this, 0), new C50736Fhb(this, 1)), quickPromotionSlot);
        this.A00 = A012;
        A012.Dh3();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public E47() {
        MMG mmg = new MMG(this, 31);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMG(new MMG(this, 28), 29));
        this.A04 = DbS.A0I(new MMG(A002, 30), mmg, new C58716IwP(45, (Object) null, (Object) A002), DbS.A0z(C60305Jj4.class));
        this.A03 = C227642jf.A02(this);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null && intent.getBooleanExtra("EXTRA_IS_ONBOARDING_COMPLETE", false)) {
            ((C60305Jj4) this.A04.getValue()).A03();
        }
    }

    public final boolean onBackPressed() {
        if (requireActivity() instanceof BrandedContentUrlHandlerActivity) {
            DbT.A1K(this);
            return true;
        }
        getParentFragmentManager().A0y((String) null, 0);
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1443888562);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.branded_content_settings, viewGroup, false);
        AnonymousClass0fD.A09(-2027261446, A022);
        return inflate;
    }
}
