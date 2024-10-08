package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.api.schemas.StickerTraySectionCTAType;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.NJh  reason: case insensitive filesystem */
public final class C68469NJh extends AnonymousClass4DH implements AnonymousClass8MH {
    public static final String __redex_internal_original_name = "DirectCutoutStickerGridFragment";
    public C59811JZf A00;
    public O6W A01;
    public final AnonymousClass0iw A02 = new C71862Os3(this);
    public final String A03 = "";
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass4DH A05 = this;
    public final boolean A06 = true;

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

    public final void Cw1(View view, C317466nJ r13) {
        Context context;
        boolean A1U = AnonymousClass7TF.A1U(0, r13, view);
        C317876nz BzU = r13.BzU();
        if (BzU != null && (context = getContext()) != null) {
            if (BzU.A00() == C318046oG.CUTOUT_VIDEO || BzU.A00() == C318046oG.CUTOUT_PHOTO) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                String str = BzU.A0Z;
                A1C.add(new WVK(new C72318P1j(context, r13, BzU, this), str));
                if (AnonymousClass7TE.A1b(BzU.A0O) && this.A06) {
                    AnonymousClass0eM r4 = this.A04;
                    if (182.A06(0Tu.A05, DbT.A0X(r4), 36325166942532266L)) {
                        boolean A032 = C71044OaM.A03(AnonymousClass7TE.A0l(r4), str);
                        C317966o8 r3 = (C317966o8) BzU.A0O.get(0);
                        0qQ.A0B(r3, 0);
                        A1C.add(new WVL(new N41(new C61077JwF(r3, "", 8), A1U ? 1 : 0), new C72320P1l(0, context, this), A032));
                    }
                }
                C54944HZa.A00(view, AnonymousClass7TE.A0l(this.A04), A1C);
            }
        }
    }

    public final void Cw2(Drawable drawable, View view, C317466nJ r6) {
        O6W o6w;
        0qQ.A0B(r6, 0);
        C317876nz BzU = r6.BzU();
        if (BzU != null) {
            List list = BzU.A0O;
            if (AnonymousClass7TE.A1b(list) && (o6w = this.A01) != null) {
                C317966o8 r1 = (C317966o8) list.get(0);
                0qQ.A0B(r1, 0);
                C74511Pw6 pw6 = o6w.A00.A02;
                if (pw6 != null) {
                    pw6.D7d(r1);
                }
            }
        }
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

    public final String getModuleName() {
        return "direct_cutout_sticker_grid_fragment_module";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(this.A04);
        2Yu.A0H(getContext(), R.attr.igds_color_elevated_background);
        C59811JZf jZf = new C59811JZf(requireContext, view, this.A02, A0l, (C279284yO) null, this, C62496Kgm.DIRECT_STICKER_TRAY);
        this.A00 = jZf;
        jZf.E0h();
        View findViewById = view.findViewById(R.id.sticker_grid_back_button);
        if (findViewById != null) {
            C71401Ok0.A01(findViewById, 33, this);
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

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2117469064);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_cutout_sticker_grid_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1630064557, A022);
        return inflate;
    }

    public final /* synthetic */ boolean CZu(boolean z) {
        return false;
    }
}
