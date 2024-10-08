package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.schools.management.data.SchoolSettingsRepository;

/* renamed from: X.H0s  reason: case insensitive filesystem */
public final class C54148H0s extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "SchoolSettingsGraduationFragment";
    public C54672HOd A00 = C54672HOd.SWITCH_SCHOOL_SETTING;
    public SchoolSettingsRepository A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05;
    public final C54684HOp A06 = C54684HOp.UPDATE_GRADUATION;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131963125);
    }

    public final String getModuleName() {
        return "school_settings_graduation";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C51966G9m.A0z(this.A03).A04(C54672HOd.PROFILE_BIO, this.A06);
        07U r2 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MH5(r2, this, viewLifecycleOwner, (AnonymousClass4D7) null, 40), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final boolean onBackPressed() {
        C51966G9m.A0z(this.A03).A05(this.A00, this.A06);
        return false;
    }

    public C54148H0s() {
        C58685Ivu ivu = new C58685Ivu(this, 45);
        C58685Ivu ivu2 = new C58685Ivu(this, 42);
        0eO r6 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r6, new C58685Ivu(ivu2, 43));
        this.A05 = DbS.A0I(new C58685Ivu(A002, 44), ivu, new C58691Iw0(19, (Object) null, A002), DbS.A0z(C53018Gh9.class));
        this.A03 = C58685Ivu.A00(this, 40);
        this.A02 = AnonymousClass0eN.A00(r6, new C58685Ivu(this, 39));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-709213247);
        ComposeView A0H = DbV.A0H(this, new C59343JFv(this, 34), -210669795);
        AnonymousClass0fD.A09(1800130619, A022);
        return A0H;
    }
}
