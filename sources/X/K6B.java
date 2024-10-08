package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.Date;

public final class K6B extends AnonymousClass4DH implements AnonymousClass4DR, C339337jR {
    public static final String __redex_internal_original_name = "IgLiveSchedulingCreationFragment";
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A01(C66298MMh.A01(this, 3));
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02;

    public final String getModuleName() {
        return AnonymousClass000.A00(3304);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        2dY.A01(LY5.A00(this, 59), DbX.A0I(requireView(), R.id.action_bar_container)).A0X(C64468LcV.A00);
        TextView textView = (TextView) AnonymousClass7TF.A0G(requireView(), R.id.title_edit_text);
        View A0E = JTT.A0E(requireView(), R.id.start_time_row);
        TextView textView2 = (TextView) AnonymousClass7TF.A0G(A0E, R.id.label);
        View A0G = AnonymousClass7TF.A0G(A0E, R.id.metadata);
        View A0G2 = AnonymousClass7TF.A0G(A0E, R.id.icon);
        View A0E2 = JTT.A0E(requireView(), R.id.audience_row);
        TextView A0R = AnonymousClass7TG.A0R(A0E2, R.id.label);
        View A0G3 = AnonymousClass7TF.A0G(A0E2, R.id.metadata);
        View A0G4 = AnonymousClass7TF.A0G(A0E2, R.id.icon);
        View A0G5 = AnonymousClass7TF.A0G(requireView(), R.id.primary_cta_button);
        View A0G6 = AnonymousClass7TF.A0G(requireView(), R.id.profile_unit_disclaimer_textview);
        View A0E3 = JTT.A0E(requireView(), R.id.cancel_row);
        textView2.setText(2131965361);
        A0R.setText(2131965332);
        AnonymousClass0eM r3 = this.A02;
        C64321LZw.A00(getViewLifecycleOwner(), ((C60281Jic) r3.getValue()).A00, new C52387GQm(textView, A0E, textView2, this, A0G2, A0E2, A0G4, A0G3, A0G6, A0E3, A0G5, A0G, 1), 0);
        DbZ.A1C(this, new C52070GDq(A0E, this, (AnonymousClass4D7) null, 14), ((C60281Jic) r3.getValue()).A0A);
        LWP.A00(textView, this, 22);
        LY5.A01(A0E, 60, this);
        LY5.A01(A0G2, 61, this);
        LY5.A01(A0E2, 62, this);
        LY5.A01(A0G4, 63, this);
        LY5.A01(A0G5, 57, this);
        LY5.A01(A0E3, 58, this);
    }

    public final void CwQ(AnonymousClass3NV r2) {
        ((C60281Jic) this.A02.getValue()).A0F.Epw(r2);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final boolean onBackPressed() {
        C60281Jic jic = (C60281Jic) this.A02.getValue();
        if (jic.A05 != null || 0mp.A0B((CharSequence) jic.A0E.getValue()) || !C60281Jic.A00((Date) jic.A0D.getValue())) {
            return false;
        }
        MGU.A02(jic, C318116oQ.A00(jic), 44);
        return true;
    }

    public K6B() {
        C66298MMh A012 = C66298MMh.A01(this, 7);
        AnonymousClass0eM A002 = C66298MMh.A00(C66298MMh.A01(this, 4), 0eO.A02, 5);
        this.A02 = DbS.A0I(C66298MMh.A01(A002, 6), A012, C66304MMn.A01(A002, (Object) null, 49), DbS.A0z(C60281Jic.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(3870246);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.live_scheduling_composer_layout, false);
        AnonymousClass0fD.A09(-1223848429, A022);
        return A0D;
    }
}
