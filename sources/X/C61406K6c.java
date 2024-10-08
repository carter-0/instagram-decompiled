package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.StickerTraySectionCTAType;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.io.Serializable;

/* renamed from: X.K6c  reason: case insensitive filesystem */
public final class C61406K6c extends AnonymousClass4DH implements AnonymousClass8MH {
    public static final String __redex_internal_original_name = "ClipsAssetHubFragment";
    public C59811JZf A00;
    public C62496Kgm A01 = C62496Kgm.GALLERY_SAVED;
    public ClipsAssetHubViewModel A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new MMT(this, 31));
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass4DH A05 = this;
    public final AnonymousClass0iw A06 = new C64578LeK(this);

    public final /* synthetic */ void CgT(Medium medium, long j, long j2, boolean z) {
    }

    public final /* synthetic */ void CnL(View view, StickerTraySectionCTAType stickerTraySectionCTAType) {
    }

    public final /* synthetic */ void Csq(View view, C317966o8 r2, String str) {
    }

    public final /* synthetic */ void Ctb(C384659hg r1) {
    }

    public final /* synthetic */ void Cur() {
    }

    public final /* synthetic */ void Cut(C317966o8 r1, String str) {
    }

    public final /* synthetic */ void Cw1(View view, C317466nJ r2) {
    }

    public final void Cw2(Drawable drawable, View view, C317466nJ r8) {
        C317876nz r0;
        0qQ.A0B(r8, 0);
        ClipsAssetHubViewModel clipsAssetHubViewModel = this.A02;
        if (clipsAssetHubViewModel != null) {
            clipsAssetHubViewModel.A00 = drawable;
            C317876nz BzU = r8.BzU();
            if (BzU != null) {
                String str = BzU.A0Z;
                C376649Iu r02 = (C376649Iu) C321086tY.A00((C321086tY) this.A03.getValue()).get(str);
                if (r02 != null) {
                    r0 = (C317876nz) r02.A00;
                } else {
                    r0 = null;
                }
                clipsAssetHubViewModel.A01 = r0;
                ClipsAssetHubViewModel clipsAssetHubViewModel2 = this.A02;
                if (clipsAssetHubViewModel2 != null) {
                    MGE.A01(clipsAssetHubViewModel2, str, JTP.A0J(clipsAssetHubViewModel2, str, 0), 36);
                    29Y r3 = C51971G9r.A0g(this.A04).A0E;
                    1Ln A0A = 1Ln.A0A(r3.A01);
                    if (DbT.A1Y(A0A)) {
                        A0A.A0M(AnonymousClass80P.MEME_HUB, "tool_type");
                        29Y.A00(A0A, r3);
                        A0A.A0a(r3.A0J());
                        JTQ.A18(A0A, r3);
                        A0A.A0R("sticker_id", str);
                        AnonymousClass283 r03 = r3.A04;
                        JTQ.A1B(A0A, r03);
                        A0A.A0c(r03.A0A);
                        JTQ.A1A(A0A);
                        JTS.A1E(A0A);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("clipsAssetHubViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ void CxD() {
    }

    public final /* synthetic */ void CxF() {
    }

    public final /* synthetic */ void CxQ(Drawable drawable, C317466nJ r2) {
    }

    public final /* synthetic */ void CxR() {
    }

    public final /* synthetic */ void D4A() {
    }

    public final /* synthetic */ void D6Q(C19476WaO waO) {
    }

    public final /* synthetic */ void D6e() {
    }

    public final /* synthetic */ void D7Z() {
    }

    public final /* synthetic */ void D7a(Medium medium, Integer num) {
    }

    public final /* synthetic */ void D7b(Bitmap bitmap, String str) {
    }

    public final /* synthetic */ void D7c() {
    }

    public final /* synthetic */ void D7e() {
    }

    public final /* synthetic */ void D7f(C381579bz r1) {
    }

    public final /* synthetic */ void DBs(Drawable drawable, View view, C317486nL r3) {
    }

    public final /* synthetic */ void DDX() {
    }

    public final /* synthetic */ void DG0(AnonymousClass9V0 r1, C317876nz r2) {
    }

    public final /* synthetic */ void DHJ(User user, String str) {
    }

    public final /* synthetic */ void DHX(Medium medium, boolean z) {
    }

    public final /* synthetic */ void DR4(Medium medium) {
    }

    public final /* synthetic */ void DRG(Drawable drawable, C317466nJ r2) {
    }

    public final /* synthetic */ void DVK() {
    }

    public final /* synthetic */ void DWc(Bitmap bitmap, String str) {
    }

    public final /* synthetic */ void DXx(Medium medium) {
    }

    public final /* synthetic */ void Dn0(View view, C317876nz r2) {
    }

    public final /* synthetic */ void Dn1(Drawable drawable, C317876nz r2, Long l) {
    }

    public final /* synthetic */ void Dn2(Drawable drawable, C317876nz r2, Long l, boolean z) {
    }

    public final /* synthetic */ void DnB() {
    }

    public final /* synthetic */ void DnF(StickerTraySectionCTAType stickerTraySectionCTAType) {
    }

    public final /* synthetic */ void DvI(UpcomingEvent upcomingEvent) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(this.A04);
        C59811JZf jZf = new C59811JZf(requireContext, view, this.A06, A0l, AnonymousClass80N.A00, this, this.A01);
        this.A00 = jZf;
        jZf.E0h();
        if (this.A01 == C62496Kgm.GALLERY_SAVED) {
            A00();
        }
    }

    public final void A00() {
        C59811JZf jZf = this.A00;
        if (jZf != null) {
            jZf.A06 = true;
            C59811JZf.A00(jZf, (String) null);
            MediaPlayer mediaPlayer = jZf.A00;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            jZf.A00 = null;
        }
    }

    public final /* synthetic */ long AyD() {
        return 0;
    }

    public final AnonymousClass4DH BZy() {
        return this.A05;
    }

    public final /* synthetic */ boolean Buo() {
        return false;
    }

    public final /* synthetic */ boolean CWK() {
        return false;
    }

    public final /* synthetic */ boolean CXD() {
        return false;
    }

    public final /* synthetic */ boolean CXt() {
        return false;
    }

    public final /* synthetic */ boolean Cc2() {
        return false;
    }

    public final /* synthetic */ boolean CcX() {
        return false;
    }

    public final String getModuleName() {
        if (this.A01 == C62496Kgm.GALLERY_SAVED) {
            return "clips_asset_hub_saved";
        }
        return "clips_asset_hub_trending";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final void onCreate(Bundle bundle) {
        C62496Kgm kgm;
        int A022 = AnonymousClass0fD.A02(-1121648836);
        C61406K6c.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        Serializable serializable = null;
        if (bundle2 != null) {
            serializable = bundle2.getSerializable("arg_asset_entry_point");
        }
        if ((serializable instanceof C62496Kgm) && (kgm = (C62496Kgm) serializable) != null) {
            this.A01 = kgm;
        }
        FragmentActivity requireActivity = requireActivity();
        0qQ.A0C(requireActivity, AnonymousClass000.A00(177));
        this.A02 = JTO.A0L(new AnonymousClass85R(DbY.A05(this), AnonymousClass7TE.A0l(this.A04)), requireActivity).A00(ClipsAssetHubViewModel.class);
        AnonymousClass0fD.A09(1737278693, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-323059422);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.clips_asset_hub_subfragment_layout, viewGroup, false);
        AnonymousClass0fD.A09(-1870194854, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(99603011);
        super.onDestroyView();
        C59811JZf jZf = this.A00;
        if (jZf != null) {
            jZf.close();
        }
        this.A00 = null;
        AnonymousClass0fD.A09(-1727519944, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1835430169);
        C61406K6c.super.onPause();
        C59811JZf jZf = this.A00;
        if (jZf != null) {
            C59811JZf.A00(jZf, (String) null);
            MediaPlayer mediaPlayer = jZf.A00;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            jZf.A00 = null;
        }
        AnonymousClass0fD.A09(1038191351, A022);
    }

    public final /* synthetic */ boolean CZu(boolean z) {
        return false;
    }
}
