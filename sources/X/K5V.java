package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.primer.ColorTint;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import com.instagram.ui.primer.PrimerBottomSheetConfig;
import com.instagram.ui.primer.TitleIcon;
import java.io.Serializable;
import java.util.Iterator;

public final class K5V extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "ClipsACRBrowserFragment";
    public C48143EZl A00;
    public 28D A01;
    public boolean A02;
    public final C64111LNs A03 = new C64111LNs();
    public final AnonymousClass0eM A04 = MMT.A00(this, 35);
    public final AnonymousClass0eM A05 = MMT.A00(this, 36);
    public final AnonymousClass0eM A06 = MMT.A00(this, 37);
    public final AnonymousClass0eM A07 = MMT.A00(this, 38);
    public final AnonymousClass0eM A08 = MMT.A00(this, 39);
    public final AnonymousClass0eM A09 = MMT.A00(this, 40);
    public final AnonymousClass0eM A0A = MMT.A00(this, 41);
    public final AnonymousClass0eM A0B = MMT.A00(this, 42);
    public final AnonymousClass0eM A0C = MMT.A00(this, 43);
    public final AnonymousClass0eM A0D = MMT.A00(this, 44);
    public final AnonymousClass0eM A0E = C227642jf.A02(this);
    public final AnonymousClass0eM A0F = MMT.A00(this, 48);
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H = C66300MMj.A00(this, 0);

    public final String getModuleName() {
        return "clips_acr_browser";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        AnonymousClass0xx A0J = DbV.A0J(this);
        MH1 mh1 = new MH1(view2, this, (AnonymousClass4D7) null, 2);
        19B r9 = 19B.A00;
        1Eo.A05(r9, mh1, A0J);
        AnonymousClass0eM r7 = this.A0G;
        r7.getValue();
        AnonymousClass0eM r0 = this.A0E;
        AnonymousClass0eM r29 = r0;
        if (1KU.A0G(DbW.A0S(r0, 0))) {
            DbT.A18(view2.getContext(), JTQ.A0A(this.A0F), 2131955173);
        }
        AnonymousClass0eM r11 = this.A0A;
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TE.A14(r11);
        C60432JlP jlP = new C60432JlP();
        C60432JlP jlP2 = new C60432JlP();
        AnonymousClass0eM r10 = this.A0B;
        ((PagingDataAdapter) r10.getValue()).A06(new C66312MMv(27, jlP2, jlP));
        recyclerView.setAdapter(new UAE(jlP, (2Rw) r10.getValue(), jlP2));
        recyclerView.setLayoutManager((C252553pI) this.A0C.getValue());
        View requireView = requireView();
        if (!requireView.isLaidOut() || requireView.isLayoutRequested()) {
            LYT.A00(requireView, 3, this);
        } else {
            ((RecyclerView) AnonymousClass7TE.A14(r11)).A11(new C60450Jli((int) (((float) ((RecyclerView) AnonymousClass7TE.A14(r11)).getMeasuredHeight()) * 0.5625f)));
        }
        C60375JkU jkU = new C60375JkU();
        ((RecyclerView) AnonymousClass7TE.A14(r11)).A0E = null;
        jkU.A07((RecyclerView) AnonymousClass7TE.A14(r11));
        1Eo.A05(r9, new MG7(this, (AnonymousClass4D7) null, 47), DbV.A0J(this));
        DbZ.A1C(this, new C66163MGa(this, (AnonymousClass4D7) null, 17), ((PagingDataAdapter) r10.getValue()).A02);
        View requireViewById = view2.requireViewById(R.id.clips_acr_browser_exit_button);
        DbU.A12(requireViewById.getContext(), requireViewById, 2131953555);
        LY0.A00(requireViewById, 28, this);
        LY0.A00(AnonymousClass7TH.A06(this.A0H), 29, this);
        DbZ.A1C(this, new C66163MGa(this, (AnonymousClass4D7) null, 18), ((C60211JhU) r7.getValue()).A07);
        C63706L3q l3q = (C63706L3q) this.A04.getValue();
        UserSession userSession = l3q.A01;
        if (182.A06(0Tu.A05, userSession, 36318874815175206L)) {
            1Av A002 = 1Au.A00(userSession);
            0s0 r02 = A002.A27;
            AnonymousClass0YZ[] r8 = 1Av.A8a;
            if (!AnonymousClass7TG.A1a(A002, r02, r8, 380) && !1Au.A00(userSession).A1m()) {
                TitleIcon titleIcon = new TitleIcon((ColorTint) null, R.drawable.ig_illustrations_illo_camera_roll_reels_refresh);
                Context context = l3q.A00;
                InfoItem[] infoItemArr = {new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_collage_pano_outline_24), Integer.valueOf(2Yu.A08(context)), AnonymousClass7TE.A16(context, 2131955181), (String) null), new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_music_pano_outline_24), Integer.valueOf(2Yu.A08(context)), AnonymousClass7TE.A16(context, 2131955183), (String) null), new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_reels_pano_outline_24), Integer.valueOf(2Yu.A08(context)), AnonymousClass7TE.A16(context, 2131955182), (String) null)};
                0qQ.A0B(infoItemArr, 0);
                TitleIcon titleIcon2 = titleIcon;
                PrimerBottomSheetConfig primerBottomSheetConfig = new PrimerBottomSheetConfig(titleIcon2, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, "clips_acr_camera_roll_access_consent_nux", AnonymousClass7TE.A16(context, 2131955184), AnonymousClass7TE.A16(context, 2131968513), (String) null, 03t.A0I(infoItemArr), 2131955185, false, false, false);
                C62146Kaz kaz = new C62146Kaz(l3q, DbV.A02(context));
                String A16 = AnonymousClass7TE.A16(context, 2131955180);
                SpannableStringBuilder A0D2 = DbY.A0D(context, A16, 2131955179);
                AnonymousClass7AV.A05(A0D2, kaz, A16);
                LOZ loz = new LOZ(userSession, primerBottomSheetConfig, A0D2, false, false, false);
                loz.A00 = new LY8(54, loz, l3q);
                loz.A01 = new LY8(55, loz, l3q);
                AnonymousClass7TF.A0D().post(new M6T(l3q, loz));
                1Av A003 = 1Au.A00(userSession);
                AnonymousClass7TF.A1J(A003, A003.A27, r8, 380, true);
                27r A012 = 27p.A01(userSession);
                0Aj A0e = AnonymousClass7TE.A0e(A012.A01, "ig_camera_notification_impression");
                if (A0e.isSampled()) {
                    AnonymousClass7TH.A0W(A0e, A012);
                    AnonymousClass283 r3 = A012.A04;
                    JTP.A1I(A0e, r3);
                    AnonymousClass7TE.A1W(A0e, "entity_type", 37);
                    DbS.A1K(A0e, "clips_acr_browser");
                    C51965G9l.A1A(C59725JVj.ACR_BROWSER, A0e);
                    A0e.A8M(r3.A0A, "composition_media_type");
                    A0e.AAJ("composition_str_id", r3.A0M);
                    AnonymousClass7TH.A0V(A0e);
                }
            }
        }
        C48143EZl eZl = this.A00;
        if (eZl != null) {
            27r A0g = C51971G9r.A0g(r29);
            0Aj A0e2 = AnonymousClass7TE.A0e(A0g.A01, "ig_camera_acr_browser_impression");
            if (A0e2.isSampled()) {
                JTP.A1E(A0e2);
                AnonymousClass283 r2 = A0g.A04;
                JTP.A1I(A0e2, r2);
                AnonymousClass7TH.A0U(A0e2);
                AnonymousClass7TE.A1W(A0e2, "entity_type", 37);
                A0e2.A8M(eZl, "clips_acr_browser_entry_point");
                C51965G9l.A1A(C59725JVj.ACR_BROWSER, A0e2);
                JTS.A19(A0e2, r2);
                AnonymousClass7TH.A0V(A0e2);
            }
        }
        LF8 A004 = C63143KsB.A00(AnonymousClass7TE.A0l(r29));
        long j = A004.A00;
        if (j != 0) {
            A004.A03.A0C("enter_acr_browser", j);
        }
    }

    public static final 0eP A00(K5V k5v) {
        C249703kE A0W;
        int A1c = ((LinearLayoutManager) k5v.A0C.getValue()).A1c();
        if (A1c == -1 || (A0W = ((RecyclerView) AnonymousClass7TE.A14(k5v.A0A)).A0W(A1c)) == null || !(A0W instanceof C60690Jpb)) {
            return null;
        }
        return AnonymousClass7TF.A0x(A0W, A1c);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0E);
    }

    public final boolean onBackPressed() {
        if (!this.A02) {
            LF8 A002 = C63143KsB.A00(AnonymousClass7TE.A0l(this.A0E));
            long j = A002.A00;
            if (j != 0) {
                A002.A00 = A002.A03.A06(String.valueOf("cancel_back_press"), String.valueOf("back press was tapped before initial item load"), 246622982, j);
            }
            A002.A00 = 0;
        }
        DbX.A1I(this);
        return true;
    }

    public K5V() {
        MMT mmt = new MMT(this, 49);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMT(new MMT(this, 45), 46));
        this.A0G = DbS.A0I(new MMT(A002, 47), mmt, new MJ9(12, (Object) null, A002), DbS.A0z(C60211JhU.class));
    }

    public static final void A01(K5V k5v) {
        0eP A002;
        C60979Jub jub;
        MediaComposition mediaComposition;
        if (k5v.isAdded() && k5v.isVisible() && k5v.isResumed() && (A002 = A00(k5v)) != null) {
            C60690Jpb jpb = (C60690Jpb) A002.A00;
            int A0A2 = C51969G9p.A0A(A002);
            C64111LNs lNs = k5v.A03;
            AnonymousClass0eM r5 = k5v.A0E;
            UserSession A0l = AnonymousClass7TE.A0l(r5);
            Context requireContext = k5v.requireContext();
            DbY.A1S(A0l, jpb);
            if (!(lNs.A00 == A0A2 || (jub = jpb.A01) == null || (mediaComposition = jub.A01) == null)) {
                C64111LNs.A00(lNs);
                lNs.A01(requireContext, mediaComposition, A0l, jpb).A00();
                lNs.A00 = A0A2;
            }
            C60979Jub jub2 = jpb.A01;
            if (jub2 != null) {
                AnonymousClass0eM r4 = k5v.A0G;
                if (!jub2.equals(((C60211JhU) r4.getValue()).A00)) {
                    27r A0g = C51971G9r.A0g(r5);
                    String A092 = 2AL.A09(jub2.A02);
                    String str = jub2.A08;
                    C48143EZl eZl = k5v.A00;
                    String A0t = DbX.A0t(jub2.A03);
                    0Aj A0e = AnonymousClass7TE.A0e(A0g.A01, "ig_camera_acr_impression");
                    if (A0e.isSampled()) {
                        JTP.A1E(A0e);
                        AnonymousClass283 r2 = A0g.A04;
                        JTP.A1I(A0e, r2);
                        AnonymousClass7TH.A0U(A0e);
                        if (A092 == null) {
                            A092 = "UNKNOWN";
                        }
                        A0e.AAJ("acr_type", A092);
                        C51965G9l.A1A(C59725JVj.ACR_BROWSER, A0e);
                        AnonymousClass7TE.A1W(A0e, "entity_type", 37);
                        JTS.A19(A0e, r2);
                        DbY.A1C(A0e);
                        A0e.AAJ("acr_id", str);
                        A0e.A8M(eZl, "clips_acr_browser_entry_point");
                        A0e.AAJ("acr_smart_reel_type", A0t);
                        A0e.Cgf();
                    }
                    if (!k5v.A02) {
                        C63143KsB.A00(AnonymousClass7TE.A0l(r5)).A01(false);
                        k5v.A02 = true;
                    }
                    ((C60211JhU) r4.getValue()).A00 = jub2;
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        C48143EZl eZl;
        int A022 = AnonymousClass0fD.A02(1567216973);
        K5V.super.onCreate(bundle);
        Serializable serializable = requireArguments().getSerializable("CAMERA_ACR_BROWSER_ENTRY_POINT_ARGS");
        28D r2 = null;
        if (serializable instanceof C48143EZl) {
            eZl = (C48143EZl) serializable;
        } else {
            eZl = null;
        }
        this.A00 = eZl;
        28D serializable2 = requireArguments().getSerializable("CAMERA_ENTRY_POINT_ARGS");
        if (serializable2 instanceof 28D) {
            r2 = serializable2;
        }
        this.A01 = r2;
        AnonymousClass0fD.A09(1825631358, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2065583012);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.clips_acr_browser_layout, viewGroup, false);
        AnonymousClass0fD.A09(-782402558, A022);
        return inflate;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(830635188);
        K5V.super.onPause();
        C64111LNs lNs = this.A03;
        Iterator A0t = AnonymousClass7TF.A0t(lNs.A01);
        while (A0t.hasNext()) {
            LVA lva = (LVA) AnonymousClass7TF.A0a(A0t);
            lva.isPlaying = false;
            lva.A01.A05();
        }
        lNs.A00 = -1;
        ((RecyclerView) AnonymousClass7TE.A14(this.A0A)).A16((C249403jg) this.A0D.getValue());
        C64111LNs.A00(lNs);
        lNs.A00 = -1;
        AnonymousClass0eM r2 = this.A08;
        if (DbX.A07(r2) != 0) {
            ((1wS) this.A09.getValue()).A0C(DbX.A07(r2));
        }
        AnonymousClass0fD.A09(1342837159, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1860705547);
        super.onResume();
        ((RecyclerView) AnonymousClass7TE.A14(this.A0A)).A15((C249403jg) this.A0D.getValue());
        ((1wS) this.A09.getValue()).A0C(4);
        A01(this);
        AnonymousClass0fD.A09(-1459199260, A022);
    }
}
