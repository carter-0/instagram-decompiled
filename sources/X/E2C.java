package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import java.util.UUID;

public final class E2C extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "NewReleaseNotificationFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01;

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        r4.Eom(2131971357);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A01 = R.drawable.instagram_arrow_left_pano_outline_24;
        DbX.A1A(new FP6((Object) this, 10), A0K, r4);
    }

    public final String getModuleName() {
        return "new_release_notification_screen";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r6 = this.A01;
        C46760Dkn dkn = (C46760Dkn) r6.getValue();
        dkn.A00 = UUID.randomUUID();
        AnonymousClass7TE.A1Z(new MFS(dkn, (AnonymousClass4D7) null, 10), C318116oQ.A00(dkn));
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TF.A0F(view, R.id.new_release_notification_recycler_view);
        AnonymousClass2t9 A0U = DbU.A0U(DbV.A0S(this), new EG0(new C49447Evo(recyclerView, this)));
        DbY.A15(this, recyclerView);
        recyclerView.setAdapter(A0U);
        DbZ.A1C(this, new MGZ((Object) A0U, (AnonymousClass4D7) null, 15, 42), ((C46760Dkn) r6.getValue()).A09);
        View A0G = AnonymousClass7TF.A0G(view, R.id.new_release_notification_refresh_spinner);
        FP6.A00(A0G, 11, this);
        DbZ.A1C(this, new MGZ((Object) A0G, (AnonymousClass4D7) null, 16, 42), ((C46760Dkn) r6.getValue()).A08);
        DbZ.A1C(this, new MGZ(this, (AnonymousClass4D7) null, 17), ((C46760Dkn) r6.getValue()).A05);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public E2C() {
        C51801G2k A002 = C51801G2k.A00(this, 13);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, C51801G2k.A00(C51801G2k.A00(this, 10), 11));
        this.A01 = DbS.A0I(C51801G2k.A00(A003, 12), A002, new MMX(4, (Object) null, (Object) A003), DbS.A0z(C46760Dkn.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(569593240);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.new_release_notification_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-590499186, A02);
        return inflate;
    }
}
