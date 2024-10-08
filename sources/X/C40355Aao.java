package X;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.rulesystem.CaptureRuleSystemState;
import com.instagram.model.shopping.reels.ProfileShopLink;
import com.instagram.model.shopping.reels.ReelProductLink;
import java.util.List;
import java.util.Set;

/* renamed from: X.Aao  reason: case insensitive filesystem */
public final class C40355Aao implements AnonymousClass88Z {
    public AnonymousClass8BA A00;
    public CaptureRuleSystemState A01 = new CaptureRuleSystemState((C318046oG) null, AnonymousClass89U.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, (Boolean) null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
    public final AnonymousClass89T A02;
    public final UserSession A03;

    public C40355Aao(UserSession userSession) {
        AnonymousClass89T r0;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        this.A03 = userSession2;
        if (AnonymousClass89S.A00(userSession2).booleanValue()) {
            r0 = C347157wM.A00(userSession2);
        } else {
            r0 = null;
        }
        this.A02 = r0;
    }

    public final void A9A(AnonymousClass8BA r1, C3512388c r2) {
    }

    public final void AHb(Void voidR) {
    }

    public final boolean Cb8(C3512388c r2) {
        0qQ.A0B(r2, 0);
        return r2.Cb9(this.A01);
    }

    public final void Cvm() {
    }

    public final void Cz2(List list) {
    }

    public final void D6o(boolean z) {
    }

    public final void DCL() {
    }

    public final void DDQ() {
        this.A01 = new CaptureRuleSystemState((C318046oG) null, AnonymousClass89U.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, (Boolean) null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        A00();
    }

    public final void DLj(boolean z) {
    }

    public final void DQD(BrandedContentGatingInfo brandedContentGatingInfo) {
    }

    public final void DRF() {
    }

    public final void DSt() {
    }

    public final void DWz(boolean z) {
    }

    public final void DX0() {
    }

    public final void DZs(ReelProductLink reelProductLink) {
    }

    public final void DaB(ProfileShopLink profileShopLink) {
    }

    public final void Dc7(List list) {
    }

    public final void Dn6(Drawable drawable) {
    }

    public final void DnD(Drawable drawable) {
    }

    public final void Dnt(List list, boolean z) {
    }

    public final void DrH() {
    }

    public final void EIp(C366588pL r1, Void voidR) {
    }

    private final void A00() {
        int A012;
        C347817xQ r6;
        if (AnonymousClass89S.A00(this.A03).booleanValue()) {
            A012 = C347207wR.A01("story_v2");
            Set A002 = C394569yK.A00(this.A01);
            AnonymousClass89T r0 = this.A02;
            if (r0 != null) {
                r6 = (C347817xQ) r0.A07.getValue();
            } else {
                r6 = null;
            }
            if (r6 != null) {
                C347297wa r3 = C347297wa.IG;
                C347697xE r2 = C347697xE.STORY;
                List A013 = AIL.A01(new C39794A9p(r3, AnonymousClass7TE.A1I(r2), AnonymousClass7TE.A1I(this.A01.A04)), new C39794A9p(C347297wa.FB, AnonymousClass7TE.A1I(r2), AnonymousClass7TE.A1I(this.A01.A04)), r6, A002);
                AnonymousClass8BA r02 = this.A00;
                if (r02 != null) {
                    r02.A0m(A013);
                }
            } else {
                0KC.A0C("PreCaptureCaptureRuleSystem", "(checkXpostingCompatibility) config==null");
                AnonymousClass8BA r03 = this.A00;
                if (r03 != null) {
                    r03.A0m((List) null);
                }
            }
        } else {
            A012 = C347207wR.A01("story_v0");
        }
        02m.A0p.markerEnd(383657104, A012, 2);
    }

    public final /* bridge */ /* synthetic */ void A7M(Parcelable parcelable) {
        CaptureRuleSystemState captureRuleSystemState = (CaptureRuleSystemState) parcelable;
        if (captureRuleSystemState != null) {
            this.A01 = captureRuleSystemState;
            A00();
        }
    }

    public final /* bridge */ /* synthetic */ Parcelable ANX() {
        return this.A01;
    }

    public final C366588pL EK0() {
        return new C366588pL(this.A01);
    }

    public final void Er3(AnonymousClass8BA r1) {
        this.A00 = r1;
    }
}
