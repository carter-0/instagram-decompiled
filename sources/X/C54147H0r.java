package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.H0r  reason: case insensitive filesystem */
public final class C54147H0r extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "SchoolSettingsFragment";
    public final C54672HOd A00 = C54672HOd.SWITCH_SCHOOL_SETTING;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new C58681Ivq(this, 42));
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131972725);
    }

    public final String getModuleName() {
        return "school_settings";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C51966G9m.A0z(this.A02).A04(C54672HOd.PROFILE_BIO, C54684HOp.SCHOOL_SETTINGS);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final boolean onBackPressed() {
        C51966G9m.A0z(this.A02).A05(this.A00, C54684HOp.SCHOOL_SETTINGS);
        return false;
    }

    public C54147H0r() {
        C58681Ivq ivq = new C58681Ivq(this, 46);
        C58681Ivq ivq2 = new C58681Ivq(this, 43);
        0eO r6 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r6, new C58681Ivq(ivq2, 44));
        this.A04 = DbS.A0I(new C58681Ivq(A002, 45), ivq, new C58691Iw0(29, (Object) null, A002), DbS.A0z(C60141JgM.class));
        this.A01 = AnonymousClass0eN.A00(r6, new C58681Ivq(this, 41));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1030760437);
        ComposeView A0H = DbV.A0H(this, new C59343JFv(this, 46), -200929325);
        AnonymousClass0fD.A09(-1183381117, A022);
        return A0H;
    }
}
