package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.android.R;
import com.instagram.api.schemas.ClipsTemplateBrowserV2Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class H1I extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DR {
    public static final String __redex_internal_original_name = "ClipsTemplateBrowserFragment";
    public View A00;
    public RecyclerView A01;
    public C3511387s A02;
    public 1Xj A03;
    public C53076Gi9 A04;
    public ArrayList A05;
    public int A06;
    public ViewGroup A07;
    public 1wS A08;
    public final Map A09;
    public final Map A0A = AnonymousClass7TE.A1H();
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F = C58712IwL.A00(this, 41);
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H;
    public final AnonymousClass0eM A0I;
    public final AnonymousClass0eM A0J;
    public final AnonymousClass0eM A0K;
    public final AnonymousClass0eM A0L;
    public final AnonymousClass0eM A0M = C58709IwI.A00(this, 6);
    public final AnonymousClass0eM A0N;

    public final String A00(1Xj r7) {
        String str;
        1Xj r0;
        0qQ.A0B(r7, 0);
        Iterator A0u = AnonymousClass7TF.A0u(this.A0A);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            int i = 0;
            int size = ((PagingDataAdapter) A1J.getValue()).A01().size();
            while (true) {
                if (i < size) {
                    String id = r7.getId();
                    C267324bN r02 = (C267324bN) ((PagingDataAdapter) A1J.getValue()).A01().get(i);
                    if (r02 == null || (r0 = r02.A02) == null) {
                        str = null;
                    } else {
                        str = r0.getId();
                    }
                    if (0qQ.A0K(id, str)) {
                        return DbT.A13(A1J);
                    }
                    i++;
                }
            }
        }
        return "";
    }

    public final String getModuleName() {
        return "clips_template_browser_v2";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r4 = this.A0I;
        0lg A0L2 = AnonymousClass7TF.A0L(r4, 0);
        C55604HkP hkP = (C55604HkP) A0L2.A01(C55604HkP.class, new C58710IwJ(A0L2, 28));
        hkP.A00 = C51965G9l.A0a(hkP.A01).flowStartForMarker(357645003, PublicKeyCredentialControllerUtility.JSON_KEY_USER, false);
        View findViewById = view.findViewById(R.id.clips_template_browser_layout);
        if (findViewById != null) {
            this.A01 = DbT.A0I(view, R.id.clips_template_browser_vertical_recycler_view);
            AnonymousClass0eM r0 = this.A0C;
            findViewById.setPadding(DbX.A07(r0), DbX.A07(r0), DbX.A07(r0), DbX.A07(r0));
            RecyclerView recyclerView = this.A01;
            if (recyclerView != null) {
                layoutParams = recyclerView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            0qQ.A0C(layoutParams, AnonymousClass000.A00(18));
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, DbX.A07(this.A0N), 0, 0);
            C53013Gh4 gh4 = (C53013Gh4) this.A0J.getValue();
            if (gh4 != null) {
                DbZ.A1C(this, C58103ImP.A01(this, (AnonymousClass4D7) null, 45), gh4.A03);
            }
            this.A00 = view.requireViewById(R.id.empty_saved_and_audio_view);
            ViewGroup A0C2 = DbU.A0C(view, R.id.empty_saved_and_audio_view_button);
            this.A07 = A0C2;
            if (A0C2 != null) {
                C56801ICy.A01(A0C2, 29, this);
            }
            findViewById.setVisibility(0);
            RecyclerView recyclerView2 = this.A01;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager((C252553pI) this.A0B.getValue());
                recyclerView2.A15((C249403jg) this.A0G.getValue());
            }
            DbZ.A1C(this, new C52070GDq(view, this, (AnonymousClass4D7) null, 38), C51969G9p.A0o(this).A06);
            1wS A012 = 1wS.A01(AnonymousClass7TE.A0l(r4));
            this.A08 = A012;
            if (A012 != null) {
                this.A06 = A012.A09();
                1wS r1 = this.A08;
                if (r1 != null) {
                    r1.A0C(5);
                    return;
                }
            }
            0qQ.A0F("playerServiceController");
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0I);
    }

    public final boolean onBackPressed() {
        C55800Hng A002 = HWS.A00(AnonymousClass7TE.A0l(this.A0I));
        Long l = A002.A01;
        if (l != null) {
            C51965G9l.A0a(A002.A04).flowEndCancel(l.longValue(), CancelReason.USER_CANCELLED);
        }
        A002.A01 = null;
        Set<Object> set = A002.A03;
        for (Object A0R : set) {
            C51965G9l.A0a(A002.A04).flowEndCancel(AnonymousClass7TE.A0R(A0R), CancelReason.USER_CANCELLED);
        }
        set.clear();
        return false;
    }

    public H1I() {
        C58709IwI iwI = new C58709IwI(this, 5);
        C58712IwL A012 = C58712IwL.A01(this, 44);
        0eO r3 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r3, C58712IwL.A01(A012, 45));
        this.A0L = DbS.A0I(C58712IwL.A01(A002, 46), iwI, C58690Ivz.A00((Object) null, A002, 45), DbS.A0z(C53023GhE.class));
        this.A0J = C58709IwI.A00(this, 3);
        C58709IwI iwI2 = new C58709IwI(this, 4);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(r3, C58712IwL.A01(C58712IwL.A01(this, 47), 48));
        this.A0K = DbS.A0I(C58712IwL.A01(A003, 49), iwI2, C58690Ivz.A00((Object) null, A003, 46), DbS.A0z(C52967GgK.class));
        this.A0B = C58712IwL.A00(this, 37);
        this.A0G = C58712IwL.A00(this, 42);
        this.A0C = C58712IwL.A00(this, 38);
        this.A0N = C58709IwI.A00(this, 7);
        this.A09 = AnonymousClass7TE.A1H();
        this.A0E = C58712IwL.A00(this, 40);
        this.A0H = C58712IwL.A00(this, 43);
        this.A0D = C58712IwL.A00(this, 39);
        this.A0I = C227642jf.A02(this);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C53013Gh4 gh4;
        1Xj r3;
        C53013Gh4 gh42;
        1Xj r0;
        super.onActivityResult(i, i2, intent);
        if (i == 9587 && i2 == -1 && intent != null && intent.getBooleanExtra(AnonymousClass000.A00(2145), false) && this.A03 != null) {
            Iterator A0u = AnonymousClass7TF.A0u(this.A0A);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                int size = ((PagingDataAdapter) A1J.getValue()).A01().size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        C267324bN r4 = (C267324bN) ((PagingDataAdapter) A1J.getValue()).A01().get(i3);
                        String str = null;
                        String A0u2 = C51969G9p.A0u(this.A03);
                        if (!(r4 == null || (r0 = r4.A02) == null)) {
                            str = r0.getId();
                        }
                        if (0qQ.A0K(A0u2, str)) {
                            Iterator A1G = AnonymousClass7TE.A1G(((C52967GgK) this.A0K.getValue()).A01);
                            while (A1G.hasNext()) {
                                C53152GjO gjO = (C53152GjO) AnonymousClass7TF.A0a(A1G);
                                if (0qQ.A0K(C51969G9p.A0u(gjO.A00), C51969G9p.A0u(this.A03))) {
                                    1Xj r02 = this.A03;
                                    if (r02 == null || !r02.CbC()) {
                                        gjO.A01();
                                    } else {
                                        gjO.A00();
                                    }
                                }
                            }
                            if (!(this.A0F.getValue() != ClipsTemplateBrowserV2Type.SAVED || (r3 = this.A03) == null || (gh42 = (C53013Gh4) this.A0J.getValue()) == null)) {
                                C58105ImR.A01(gh42, r3, C318116oQ.A00(gh42), 26);
                            }
                            if (!(r4 == null || (gh4 = (C53013Gh4) this.A0J.getValue()) == null)) {
                                1Xj r03 = this.A03;
                                if (r03 != null) {
                                    gh4.A00(r4, r03.BpO());
                                } else {
                                    throw AnonymousClass7TE.A0y();
                                }
                            }
                        }
                        i3++;
                    }
                }
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(858168918);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.clips_template_browser_layout, viewGroup, false);
        AnonymousClass0fD.A09(428478322, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(359949865);
        super.onDestroyView();
        int i = this.A06;
        if (i != 0) {
            1wS r0 = this.A08;
            if (r0 == null) {
                0qQ.A0F("playerServiceController");
                throw AnonymousClass00P.createAndThrow();
            }
            r0.A0C(i);
        }
        ((C52967GgK) this.A0K.getValue()).A0E();
        this.A01 = null;
        this.A00 = null;
        this.A07 = null;
        this.A03 = null;
        AnonymousClass0fD.A09(138447577, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(352746574);
        H1I.super.onPause();
        ((C52967GgK) this.A0K.getValue()).A0F();
        AnonymousClass0fD.A09(698559078, A022);
    }

    public final void onResume() {
        Object obj;
        int A022 = AnonymousClass0fD.A02(995820942);
        super.onResume();
        C53013Gh4 gh4 = (C53013Gh4) this.A0J.getValue();
        if (gh4 != null) {
            obj = gh4.A03.getValue();
        } else {
            obj = null;
        }
        if (obj == this.A0F.getValue()) {
            C52967GgK.A01(this.A0K);
        }
        AnonymousClass0fD.A09(595328334, A022);
    }
}
