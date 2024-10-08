package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.stickerstore.StickerPack;

public final class NK0 extends AnonymousClass4DH implements C268594df, C74332Pt8, C74472PvS {
    public static final String __redex_internal_original_name = "DirectStickerPackViewerFragment";
    public C70437O6o A00;
    public final AnonymousClass0iw A01 = DbS.A0O("direct_sticker_pack_viewer_fragment");
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final boolean A0B;

    public final void ADi(AnonymousClass7L0 r1) {
    }

    public final int AqL() {
        return -1;
    }

    public final float CMx() {
        return 0.8f;
    }

    public final float Cmb() {
        return 1.0f;
    }

    public final void DMt() {
    }

    public final void DMu(int i) {
    }

    public final boolean Erf() {
        return true;
    }

    public final String getModuleName() {
        return "direct_sticker_pack_viewer_fragment";
    }

    public final void onBottomSheetClosed() {
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        AnonymousClass0eM r4 = this.A06;
        ((RecyclerView) r4.getValue()).setLayoutManager((C252553pI) this.A04.getValue());
        ((RecyclerView) r4.getValue()).A11(C69922NuO.A00(requireContext(), (Integer) null, 0, false, G9t.A1b(this.A08)));
        ((RecyclerView) r4.getValue()).setAdapter(((C70676OFx) this.A02.getValue()).A01);
        String string = requireArguments().getString("sticker_pack_id", "");
        AnonymousClass0eM r5 = this.A0A;
        C67726Mtf mtf = (C67726Mtf) r5.getValue();
        0qQ.A0A(string);
        Resources A0R = JTR.A0R(this);
        0qQ.A0B(string, 0);
        05G r7 = mtf.A02;
        r7.Epw(new N4R((StickerPack) ((N4R) r7.getValue()).A02, AnonymousClass05K.A01));
        OBW obw = mtf.A01;
        C73594PgU A14 = C66580MXl.A14(mtf, 10);
        0sP A142 = C66580MXl.A14(mtf, 11);
        int dimensionPixelSize = A0R.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        UserSession userSession = obw.A00;
        int A002 = C69924NuQ.A00(A0R, userSession);
        int dimensionPixelSize2 = A0R.getDimensionPixelSize(R.dimen.ai_agent_embodiment_video_container_size);
        boolean A1a = C51965G9l.A1a(0Tu.A05, userSession, 36329706723295503L);
        2IS A042 = C41845B3m.A04();
        2IS A043 = C41845B3m.A04();
        Integer valueOf = Integer.valueOf(dimensionPixelSize);
        A042.A03("pack_icon_size", valueOf);
        boolean A1V = AnonymousClass7TF.A1V(valueOf);
        Integer valueOf2 = Integer.valueOf(A002);
        A042.A03("sticker_preview_size", valueOf2);
        boolean A1V2 = AnonymousClass7TF.A1V(valueOf2);
        Integer valueOf3 = Integer.valueOf(dimensionPixelSize2);
        A042.A03("sticker_full_size", valueOf3);
        boolean A1V3 = AnonymousClass7TF.A1V(valueOf3);
        Boolean valueOf4 = Boolean.valueOf(A1a);
        A042.A02("sticker_preview_force_static_image", valueOf4);
        boolean A1V4 = AnonymousClass7TF.A1V(valueOf4);
        A042.A01("sticker_full_force_static_image");
        A042.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID, string);
        17k.A0E(A1V);
        17k.A0E(A1V2);
        17k.A0E(A1V3);
        C71567On2.A00(new C45920DFa(obw, A14, A142, A002, dimensionPixelSize2, A1a), new PandoGraphQLRequest(C41845B3m.A06(A1V4), "IGStickerPack", A042.getParamsCopy(), A043.getParamsCopy(), C42757Bhs.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "fetch__XIGStickerStorePack", AnonymousClass7TE.A1C()), obw.A01, A142, 12);
        Dba.A15(getViewLifecycleOwner(), ((C67726Mtf) r5.getValue()).A00, new C73934PmE(this, 5), 47);
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final View C4U() {
        return this.mView;
    }

    public final int C8P() {
        return 0;
    }

    public final boolean CPc() {
        return this.A0B;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public final boolean isScrolledToTop() {
        return C2808154f.A03((LinearLayoutManager) this.A04.getValue());
    }

    public NK0() {
        C73923Pm3 pm3 = new C73923Pm3(this, 40);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C73923Pm3(new C73923Pm3(this, 36), 37));
        this.A0A = DbS.A0I(new C73923Pm3(A002, 38), pm3, new C73665Phe(4, A002, (Object) null), DbS.A0z(C67726Mtf.class));
        this.A09 = C73923Pm3.A00(this, 39);
        this.A06 = C73923Pm3.A00(this, 34);
        this.A05 = C73923Pm3.A00(this, 33);
        this.A03 = C73923Pm3.A00(this, 31);
        this.A02 = C73923Pm3.A00(this, 30);
        this.A08 = C73923Pm3.A00(this, 35);
        this.A04 = C73923Pm3.A00(this, 32);
        this.A0B = true;
    }

    public final int AhP(Context context) {
        return Dbb.A02(context);
    }

    public final /* synthetic */ float CoU() {
        return 0.8f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1586583630);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_direct_sticker_pack, false);
        AnonymousClass0fD.A09(-926916637, A022);
        return A0D;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1841537618);
        super.onDestroy();
        this.A00 = null;
        AnonymousClass0fD.A09(1530801108, A022);
    }
}
