package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.NIf  reason: case insensitive filesystem */
public final class C68442NIf extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "DirectDailyPromptsReplyViewerFragment";
    public int A00;
    public ViewGroup A01;
    public AnonymousClass3E6 A02;
    public C74508Pw3 A03;
    public AnonymousClass2Ep A04;
    public DirectThreadKey A05;
    public String A06;
    public boolean A07;
    public final P1F A08 = new P1F(this);
    public final AnonymousClass0eM A09 = AnonymousClass1YB.A00(C73921Pm1.A00(this, 14));
    public final AnonymousClass0eM A0A = C227642jf.A02(this);
    public final AnonymousClass0eM A0B;
    public final C252213ok A0C = new C72237Oz5(this, 10);
    public final String A0D = "direct_daily_prompts_reply_viewer_fragment";

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        this.A01 = DbU.A0C(view2, R.id.root_container);
        AnonymousClass3E5 A012 = AnonymousClass3E4.A01(this, false, true);
        this.A02 = A012;
        A012.A9Y(this.A0C);
        AnonymousClass03j.A00(DbV.A0G(this).getDecorView(), new C71490Olf(6, this, view2));
        2dY.A01(new C71397Ojw(this, 65), DbX.A0I(view2, R.id.action_bar_container)).A0X(C71834Orb.A00);
        View A0G = AnonymousClass7TF.A0G(view2, R.id.response_card);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        AnonymousClass0eM r3 = this.A0A;
        C68047MzE mzE = new C68047MzE(A0G, AnonymousClass7TE.A0l(r3), (OE1) null);
        07U r12 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHF(mzE, viewLifecycleOwner, r12, this, (AnonymousClass4D7) null, 35), AnonymousClass07a.A00(viewLifecycleOwner));
        ViewGroup A0I = DbX.A0I(view2, R.id.intermediate_viewer_reply_bar);
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        P1F p1f = this.A08;
        AnonymousClass3E6 r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        P1C p1c = new P1C(A0I, A0l, r0, p1f);
        this.A03 = p1c;
        p1c.Ed3(new AnonymousClass9IC(31, 1, false, false, false, false, false));
        p1c.ADf(C250563lf.A07(requireContext(), C66584MXp.A0M(AnonymousClass9HC.A1b, r3), false).A07);
        TextView A0R = AnonymousClass7TG.A0R(A0I, R.id.row_thread_composer_edittext);
        A0R.setHint(getString(2131960525));
        A0R.requestFocus();
        0nA.A0S(A0R);
    }

    public final String getModuleName() {
        return this.A0D;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public C68442NIf() {
        C73921Pm1 A002 = C73921Pm1.A00(this, 18);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, C73921Pm1.A00(C73921Pm1.A00(this, 15), 16));
        this.A0B = DbS.A0I(C73921Pm1.A00(A003, 17), A002, new C73667Phg(12, (Object) null, A003), DbS.A0z(C67731Mtk.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1442384594);
        C68442NIf.super.onCreate(bundle);
        C254743sy A002 = C67002Mga.A00(requireArguments(), "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
        if (A002 != null) {
            this.A05 = C66647MaG.A03(A002);
            2Dr A003 = 2L2.A00(AnonymousClass7TE.A0l(this.A0A));
            DirectThreadKey directThreadKey = this.A05;
            if (directThreadKey == null) {
                0qQ.A0F("threadKey");
                throw AnonymousClass00P.createAndThrow();
            }
            this.A04 = 2Dr.A03(A003, directThreadKey);
            String string = requireArguments().getString("card_gallery_currently_viewing_item_id");
            if (string == null) {
                string = "";
            }
            this.A06 = string;
            AnonymousClass0fD.A09(751209229, A022);
            return;
        }
        IllegalArgumentException A0p = C66580MXl.A0p();
        AnonymousClass0fD.A09(-2117370232, A022);
        throw A0p;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1540132336);
        0qQ.A0B(layoutInflater, 0);
        C68442NIf.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.daily_prompts_reply_viewer, viewGroup, false);
        AnonymousClass0fD.A09(1963720114, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(798756673);
        super.onDestroy();
        AnonymousClass3E6 r1 = this.A02;
        if (r1 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.EEH(this.A0C);
        AnonymousClass0fD.A09(-277434533, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1258148414);
        super.onDestroyView();
        this.A01 = null;
        AnonymousClass0fD.A09(1071156103, A022);
    }

    public final void onPause() {
        String str;
        int A022 = AnonymousClass0fD.A02(1585879854);
        C68442NIf.super.onPause();
        AnonymousClass3E6 r0 = this.A02;
        if (r0 == null) {
            str = "keyboardHeightChangeDetector";
        } else {
            r0.onStop();
            C74508Pw3 pw3 = this.A03;
            if (pw3 == null) {
                str = "composerController";
            } else {
                pw3.EEj();
                AnonymousClass0fD.A09(585528500, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onResume() {
        String str;
        int A022 = AnonymousClass0fD.A02(620453129);
        super.onResume();
        AnonymousClass3E6 r0 = this.A02;
        if (r0 == null) {
            str = "keyboardHeightChangeDetector";
        } else {
            JTP.A18(this, r0);
            C74508Pw3 pw3 = this.A03;
            if (pw3 == null) {
                str = "composerController";
            } else {
                pw3.AAP();
                AnonymousClass0fD.A09(655849037, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
