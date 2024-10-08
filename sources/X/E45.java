package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.gson.Gson;
import com.instagram.android.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.HashMap;

public final class E45 extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CollabStatusFragment";
    public String A00 = "edit_profile";
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.Eom(2131956254);
        FPB.A02(DbV.A0K(), r3, this, 33);
    }

    public final String getModuleName() {
        return "collab_status_fragment";
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("entrypoint", this.A00);
        String A0B = new Gson().A0B(A1E);
        0qQ.A07(A0B);
        AnonymousClass0eM r4 = this.A01;
        0Aj A0e = AnonymousClass7TE.A0e(DbW.A0J(DbT.A0X(r4), "collab_status_fragment"), "ig_creator_connections_events");
        DbS.A1I(A0e, "impression");
        A0e.A8M(EZb.EDIT_OPEN_TO_COLLAB_SETTINGS, "screen");
        A0e.AAJ("target", "edit_settings");
        A0e.A8M(C271174i4.A00(AnonymousClass7TE.A0l(r4)), "project");
        A0e.AAJ("extra", A0B);
        A0e.Cgf();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1882118530);
        E45.super.onCreate(bundle);
        String string = requireArguments().getString("args_entrypoint");
        if (string == null) {
            string = "edit_profile";
        }
        this.A00 = string;
        AnonymousClass0fD.A09(-1618582132, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-899010357);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.collab_status_fragment, viewGroup, false);
        IgdsListCell igdsListCell = (IgdsListCell) AnonymousClass7TF.A0F(inflate, R.id.collab_status_switch_cell);
        igdsListCell.A0G(C69349Njo.TYPE_SWITCH, false);
        igdsListCell.setEnabled(true);
        AnonymousClass0eM r2 = this.A01;
        1OC A002 = C48319Ecc.A00(DbU.A0M(AnonymousClass7TF.A0L(r2, 0)));
        EDV.A00(A002, igdsListCell, this, 3);
        schedule(A002);
        FdS.A00(igdsListCell, this, 3);
        TextView A0R = AnonymousClass7TG.A0R(inflate, R.id.collab_status_subtext);
        int i = 2131956251;
        if (182.A06(0Tu.A05, AnonymousClass7TF.A0L(r2, 0), 36318926354848510L)) {
            i = 2131956252;
        }
        A0R.setText(i);
        AnonymousClass0fD.A09(-277923977, A02);
        return inflate;
    }
}
