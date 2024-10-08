package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.Map;

public final class E5D extends AnonymousClass4DH implements 1DN {
    public static final String __redex_internal_original_name = "TurnOnNotificationsFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final void DWm(Map map) {
        boolean z;
        0xY A0d;
        String str;
        0qQ.A0B(map, 0);
        Dba.A1O(C49047EoR.A00(this));
        0xm A0e = DbS.A0e();
        Object obj = map.get(AnonymousClass000.A00(247));
        if (obj == C346927vz.GRANTED) {
            z = true;
            A0d = DbS.A0d(A0e);
            str = C273654mx.A00(888);
        } else if (obj == C346927vz.DENIED) {
            z = true;
            A0d = DbS.A0d(A0e);
            str = "preference_has_denied_push_system_dialog";
        } else {
            return;
        }
        A0d.E5T(str, z);
        A0d.apply();
    }

    public final String getModuleName() {
        return "turn_on_notifications_nux";
    }

    public static final void A00(E5D e5d) {
        FEK.A00(DbT.A0X(e5d.A00), (Boolean) null, "push_opt_in");
        Dba.A1N(C49047EoR.A00(e5d));
    }

    public static final void A01(E5D e5d) {
        C49881FBf.A00.A00(DbT.A0X(e5d.A00), (C49922FEx) null, "push_opt_in");
        Context context = e5d.getContext();
        if (context != null) {
            String A002 = AnonymousClass000.A00(247);
            if (!1DL.A07(context, A002)) {
                1DL.A04(e5d.requireActivity(), e5d, new String[]{A002});
                0xm A0e = DbS.A0e();
                A0e.A01(A0e.A00.getInt("preference_push_permission_impression_count", 0) + 1);
                return;
            }
            Dba.A1O(C49047EoR.A00(e5d));
            return;
        }
        Dba.A1N(C49047EoR.A00(e5d));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1251221666);
        E5D.super.onCreate(bundle);
        AnonymousClass0fD.A09(1509230398, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        boolean z;
        int A02 = AnonymousClass0fD.A02(886957189);
        0qQ.A0B(layoutInflater, 0);
        AnonymousClass0eM r2 = this.A00;
        0lg A0L = AnonymousClass7TF.A0L(r2, 0);
        0Tu r6 = 0Tu.A05;
        ViewGroup viewGroup2 = viewGroup;
        if (182.A06(r6, A0L, 36324664431292628L)) {
            inflate = layoutInflater.inflate(R.layout.nux_turn_on_notifications_redesign, viewGroup2, false);
            View A0G = AnonymousClass7TF.A0G(inflate, R.id.turn_on_button);
            View A0G2 = AnonymousClass7TF.A0G(inflate, R.id.prompt_top_button);
            View A0G3 = AnonymousClass7TF.A0G(inflate, R.id.skip_button);
            View A0G4 = AnonymousClass7TF.A0G(inflate, R.id.prompt_bottom_button);
            z = true;
            A0G.setEnabled(true);
            FPD.A00(A0G, 18, this);
            FPD.A00(A0G2, 19, this);
            FPD.A00(A0G3, 20, this);
            FPD.A00(A0G4, 21, this);
        } else {
            boolean A06 = 182.A06(r6, AnonymousClass7TF.A0L(r2, 0), 36324664431161554L);
            boolean A062 = 182.A06(r6, AnonymousClass7TF.A0L(r2, 0), 36324664431358165L);
            boolean A063 = 182.A06(r6, AnonymousClass7TF.A0L(r2, 0), 36329826981790045L);
            inflate = layoutInflater.inflate(R.layout.nux_turn_on_notifications, viewGroup2, false);
            View A0G5 = AnonymousClass7TF.A0G(inflate, R.id.turn_on_button);
            View A0F = AnonymousClass7TF.A0F(inflate, R.id.skip_button);
            ProgressButton progressButton = (ProgressButton) AnonymousClass7TF.A0F(inflate, R.id.turn_on_button_new);
            View A0G6 = AnonymousClass7TF.A0G(inflate, R.id.skip_button_new);
            View A0G7 = AnonymousClass7TF.A0G(inflate, R.id.button_container_new);
            z = true;
            if (A06) {
                Dba.A0y(A0G7, A0G5, A0F, 0, 8);
                if (A062) {
                    A0G6.setVisibility(8);
                    progressButton.setText(2131968361);
                }
                progressButton.setEnabled(true);
                FPD.A00(progressButton, 14, this);
                FPD.A00(A0G6, 15, this);
            } else {
                Dba.A0y(A0G7, A0G5, A0F, 8, 0);
                A0G5.setEnabled(true);
                FPD.A00(A0G5, 16, this);
                FPD.A00(A0F, 17, this);
            }
            View A0G8 = AnonymousClass7TF.A0G(inflate, R.id.turn_on_illo);
            View A0G9 = AnonymousClass7TF.A0G(inflate, R.id.turn_on_new_illo);
            if (A063) {
                A0G8.setVisibility(8);
                A0G9.setVisibility(0);
            } else {
                A0G8.setVisibility(0);
                A0G9.setVisibility(8);
            }
        }
        C62880wX r3 = C61170le.A00;
        0xY A0d = DbS.A0d(AnonymousClass0xl.A00(r3));
        A0d.E5T(C273654mx.A00(361), z);
        A0d.apply();
        AnonymousClass0xl.A00(r3).A03(z);
        C49938FFr.A01(DbT.A0X(r2), "push_opt_in");
        AnonymousClass0fD.A09(2123481375, A02);
        return inflate;
    }
}
