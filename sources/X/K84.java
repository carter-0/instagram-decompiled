package X;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Collection;

public final class K84 extends MYR implements AnonymousClass0iw, AnonymousClass4DR {
    public static final String __redex_internal_original_name = "BrandedContentSelectProjectFragment";
    public View A00;
    public FrameLayout A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03;

    public final String getModuleName() {
        return "SelectProjectFragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0C = JTS.A0C(view, R.id.action_bar);
        LY1.A00(A0C.requireViewById(R.id.action_bar_button_back), 2, this);
        View requireViewById = A0C.requireViewById(R.id.action_bar_button_done);
        this.A00 = requireViewById;
        if (requireViewById != null) {
            LY1.A00(requireViewById, 3, this);
        }
        this.A01 = (FrameLayout) view.requireViewById(R.id.empty_state_container);
        updateUi(JXP.LOADING, 0sn.A00);
        AnonymousClass0xx A0J = DbV.A0J(this);
        MH8 mh8 = new MH8((Object) this, (AnonymousClass4D7) null, 31);
        19B r4 = 19B.A00;
        1Eo.A05(r4, mh8, A0J);
        1Eo.A05(r4, new MH8((Object) this, (AnonymousClass4D7) null, 32), DbV.A0J(this));
        2YL A0H = DbS.A0H(this.A03);
        1Eo.A05(r4, new JVD(A0H, (AnonymousClass4D7) null, 33), C51967G9n.A0M(A0H, r4, new MH8((Object) A0H, (AnonymousClass4D7) null, 33), DbV.A0J(this)));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.2tE, java.lang.Object] */
    public final Collection getDefinitions() {
        return 0sr.A1P(new C232222tE[]{new KFB(this), new Object(), new KG7((UserSession) null)});
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(C66326MNj.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public K84() {
        MMG A002 = MMG.A00(this, 46);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, MMG.A00(MMG.A00(this, 43), 44));
        this.A03 = DbS.A0I(MMG.A00(A003, 45), A002, new C58716IwP(47, (Object) null, (Object) A003), DbS.A0z(C60175Jgu.class));
    }

    public final boolean onBackPressed() {
        DbT.A1I(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-604730092);
        K84.super.onCreate(bundle);
        C60175Jgu jgu = (C60175Jgu) this.A03.getValue();
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("prev_selected_project_id");
        } else {
            str = null;
        }
        jgu.A00 = str;
        AnonymousClass0fD.A09(649312749, A022);
    }
}
