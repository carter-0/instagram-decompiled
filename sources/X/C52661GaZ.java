package X;

import com.instagram.android.R;
import com.instagram.api.schemas.ShowreelNativeClientName;
import com.instagram.common.session.UserSession;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import com.instagram.sponsored.serverrendered.ServerRenderedSponsoredContentView;
import java.util.List;

/* renamed from: X.GaZ  reason: case insensitive filesystem */
public final class C52661GaZ extends GZJ {
    public AnonymousClass3OB A00 = AnonymousClass3OB.IDLE;
    public C263754Nf A01;
    public C52078GDy A02;
    public final C52662Gaa A03 = new C52662Gaa(this);
    public final List A04 = AnonymousClass7TE.A1C();

    public final C376689Iy Ato() {
        return null;
    }

    public final boolean CJa() {
        return false;
    }

    public final void EJE() {
    }

    public final boolean EOZ() {
        return false;
    }

    public final void EPC(boolean z) {
    }

    public final void EgQ(String str) {
    }

    public final void EnT(boolean z, String str) {
    }

    public static final void A00(C52661GaZ gaZ) {
        182.A06(0Tu.A05, gaZ.A03, 36314721581927183L);
    }

    public final void A95(C52016GBn gBn) {
        this.A04.add(gBn);
    }

    public final void AHf() {
        this.A04.clear();
    }

    public final C267324bN Atp() {
        return this.A00;
    }

    public final AnonymousClass3OB BdI() {
        return this.A00;
    }

    public final C263754Nf CEB() {
        return this.A01;
    }

    public final C52078GDy CEb() {
        return this.A02;
    }

    public final int E20(String str) {
        JRK jrk = this.A02;
        if (jrk == null) {
            return 0;
        }
        jrk.pause();
        this.A00 = AnonymousClass3OB.PAUSED;
        return jrk.getCurrentPositionMs();
    }

    public final void EDv(C52016GBn gBn) {
        this.A04.remove(gBn);
    }

    public final boolean EJ0(String str, boolean z) {
        JRK jrk;
        JRK jrk2 = this.A02;
        if (jrk2 == null || jrk2.isPlaying() || (jrk = this.A02) == null) {
            return false;
        }
        if (jrk.EIz()) {
            A00(this);
            this.A00 = AnonymousClass3OB.PLAYING;
            return true;
        }
        this.A00 = AnonymousClass3OB.PREPARING;
        return false;
    }

    public final void Eqr(float f, int i) {
        JRK jrk = this.A02;
        if (jrk != null) {
            jrk.Eqr(f, i);
        }
        C263754Nf r1 = this.A01;
        if (r1 != null) {
            r1.A00 = AnonymousClass7TF.A1R((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)));
        }
        A00(this);
    }

    public C52661GaZ(UserSession userSession, String str) {
        super(userSession, str);
    }

    public final boolean Cqv(C267324bN r3, C52078GDy gDy) {
        AnonymousClass7TG.A1N(gDy, r3);
        C52078GDy gDy2 = this.A02;
        if (gDy2 == null || !gDy.equals(gDy2) || !r3.equals(this.A00)) {
            return true;
        }
        return false;
    }

    public final boolean E4I(C229382nI r7, C267324bN r8, C52058GDe gDe, C52078GDy gDy, float f, int i, int i2, boolean z, boolean z2) {
        String str;
        IgShowreelNativeAnimationIntf BwB;
        boolean A1Z = AnonymousClass7TG.A1Z(gDy, r8);
        0qQ.A0B(r7, 6);
        this.A02 = gDy;
        this.A00 = r8;
        this.A01 = gDe;
        C263754Nf r1 = new C263754Nf((Object) r8, i);
        r1.A00 = AnonymousClass7TF.A1R((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)));
        this.A01 = r1;
        String str2 = ShowreelNativeClientName.A0k.A00;
        C257643xj r0 = r8.A06().A06;
        XB5 xb5 = null;
        if (r0 == null || (BwB = r0.BwB()) == null) {
            str = null;
        } else {
            str = BwB.Anf();
        }
        boolean A0j = 00p.A0j(str2, str, A1Z);
        C257853y4 r02 = r8.A06().A0I;
        if (r02 != null) {
            xb5 = r02.BUi();
        }
        ServerRenderedSponsoredContentView serverRenderedSponsoredContentView = (ServerRenderedSponsoredContentView) gDy.A08.findViewById(R.id.clips_server_rendered_component_id);
        this.A02 = serverRenderedSponsoredContentView;
        if (serverRenderedSponsoredContentView != null) {
            if (xb5 != null) {
                serverRenderedSponsoredContentView.CN9(this.A03, this.A04, A0j);
            }
            serverRenderedSponsoredContentView.setTransformation(r8.A06(), this.A03, r7, this.A03);
            if (xb5 != null) {
                Long AzI = xb5.AzI();
                if (AzI != null) {
                    serverRenderedSponsoredContentView.setTrackDuration(AzI.longValue());
                }
                serverRenderedSponsoredContentView.ADT(xb5, C51966G9m.A1B(r8));
            }
        }
        return A1Z;
    }

    public final void ECP(String str) {
        super.ECP(str);
        this.A02 = null;
        this.A00 = AnonymousClass3OB.IDLE;
    }
}
