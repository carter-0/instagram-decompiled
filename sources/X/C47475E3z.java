package X;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.E3z  reason: case insensitive filesystem */
public final class C47475E3z extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "SuggestedRepliesNuxFragment";
    public C49461Ew2 A00;
    public String A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03;
    public final String A04 = "suggested_replies_nux";

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        r2.EVS(true);
        Dbc.A0k(r2);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        String string = requireArguments().getString("entrypoint");
        if (string == null) {
            string = "unknown";
        }
        this.A01 = string;
        AnonymousClass0eM r3 = this.A02;
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        String str = this.A01;
        if (str == null) {
            DbS.A16();
            throw AnonymousClass00P.createAndThrow();
        }
        C49461Ew2 ew2 = new C49461Ew2(A0l, str);
        this.A00 = ew2;
        0Aj A0e = AnonymousClass7TE.A0e(ew2.A00, "ig_creator_agents_suggested_replies_view_sr_onboard_nux");
        if (A0e.isSampled()) {
            DbV.A1J(A0e, ew2.A01);
        }
        boolean z = requireArguments().getBoolean("should_open_settings");
        1Av A0h = DbX.A0h(r3);
        0s0 r6 = A0h.A6b;
        AnonymousClass0YZ[] r5 = 1Av.A8a;
        r6.Epx(A0h, Long.valueOf(AnonymousClass7TE.A0R(r6.CDM(A0h, r5[389])) + 1), r5[389]);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) view.findViewById(R.id.suggested_replies_nux_bottom_button_layout);
        07U r7 = 07U.A04;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new JTY(viewLifecycleOwner, r7, this, igdsBottomButtonLayout, (AnonymousClass4D7) null, 0, z), AnonymousClass07a.A00(viewLifecycleOwner));
        igdsBottomButtonLayout.setPrimaryActionOnClickListener(new LYG(64, this, igdsBottomButtonLayout));
        igdsBottomButtonLayout.setSecondaryActionOnClickListener(FPI.A00(this, 0));
        String A0m = DbU.A0m(this, 2131974706);
        String string2 = getString(2131974705);
        Uri parse = Uri.parse(C66579MXk.A00(15));
        0qQ.A07(parse);
        igdsBottomButtonLayout.setFooterText(AnonymousClass7AV.A00(parse, A0m, string2));
    }

    public final String getModuleName() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final boolean onBackPressed() {
        C49461Ew2 ew2 = this.A00;
        if (ew2 == null) {
            DbS.A12();
            throw AnonymousClass00P.createAndThrow();
        }
        0Aj A0e = AnonymousClass7TE.A0e(ew2.A00, "ig_creator_agents_suggested_replies_cancel_sr_onboard_nux");
        if (!A0e.isSampled()) {
            return false;
        }
        DbV.A1J(A0e, ew2.A01);
        return false;
    }

    public C47475E3z() {
        GW6 gw6 = new GW6(this, 2);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new GW6(new C58706IwF(this, 49), 0));
        this.A03 = DbS.A0I(new GW6(A002, 1), gw6, new C73664Phd(3, A002, (Object) null), DbS.A0z(C60225Jhi.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1179069151);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.suggested_replies_nux_layout, false);
        AnonymousClass0fD.A09(723247404, A022);
        return A0D;
    }
}
