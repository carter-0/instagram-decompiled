package X;

import android.app.Activity;
import android.content.Context;
import android.media.audiofx.AcousticEchoCanceler;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.UUID;

/* renamed from: X.Mzl  reason: case insensitive filesystem */
public final class C68080Mzl extends C249703kE implements C74578PxR {
    public int A00;
    public OK5 A01;
    public C68295N9i A02;
    public Float A03;
    public boolean A04;
    public final ViewGroup A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final C72981PRo A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final Handler A0F = AnonymousClass7TF.A0D();
    public final C70942OSp A0G;
    public final OZx A0H;

    public final void E2w(C74438Put put, Boolean bool, Integer num) {
        C68295N9i n9i;
        0qQ.A0B(put, 0);
        if (put.CeS() && (n9i = this.A02) != null && n9i.A0O) {
            if (((C68079Mzk) this.A0D.getValue()).A0D == null) {
                this.A0F.postDelayed(new C73376PbZ(put, this, bool, num), 100);
                return;
            }
            A01(put, bool, num, 0);
            C14044Tol tol = this.A08.A01;
            if (tol != null) {
                tol.A0C("resume", false);
            }
        }
    }

    public final void ECV() {
    }

    public final void EKK(float f) {
    }

    public final void Ee6() {
    }

    public final void EyO(String str) {
        C72981PRo pRo = this.A08;
        C14044Tol tol = pRo.A01;
        if (tol != null) {
            tol.A0D(str, true);
        }
        C66582MXn.A1K(pRo.A04);
        C72981PRo.A00(pRo);
        this.A00 = 0;
        this.A0F.removeCallbacksAndMessages((Object) null);
    }

    public final /* bridge */ /* synthetic */ void ADN(C74270Pry pry) {
        int intValue;
        C68295N9i n9i = (C68295N9i) pry;
        0qQ.A0B(n9i, 0);
        this.A02 = n9i;
        if (n9i.A0O) {
            ViewGroup viewGroup = this.A05;
            viewGroup.setVisibility(0);
            ((PMJ) this.A0E.getValue()).ADN(n9i);
            ((PMI) this.A09.getValue()).ADN(n9i);
            float f = 0.0f;
            float f2 = 0.78f;
            if (n9i.A0S) {
                f = 0.1f;
                f2 = 0.68f;
            }
            AnonymousClass0eM r5 = this.A0D;
            ((C68079Mzk) r5.getValue()).ADN(n9i);
            ((PMR) this.A0A.getValue()).ADN(n9i);
            Float f3 = this.A03;
            float f4 = n9i.A00;
            boolean A0I = 0qQ.A0I(f3, f4);
            this.A03 = Float.valueOf(f4);
            viewGroup.post(new C73375PbY(this, f, f2, A0I));
            Integer num = n9i.A09;
            if (!(num == null || this.A00 == (intValue = num.intValue()))) {
                A00(n9i.A05, this, (Boolean) null, num, n9i.A0V);
                this.A00 = intValue;
            }
            if (!n9i.A0b) {
                C263164Jj.A00((C256003v4) ((C68079Mzk) r5.getValue()).A0H.getValue());
                return;
            }
            return;
        }
        this.A05.setVisibility(8);
    }

    public final C72981PRo Am2() {
        C67924MxA A002;
        PMR pmr = (PMR) this.A0A.getValue();
        Integer num = pmr.A02;
        if (num == null || (A002 = PMR.A00(pmr, num.intValue())) == null) {
            return null;
        }
        return A002.A00.A05;
    }

    public final C72981PRo CEF() {
        return this.A08;
    }

    public final void CMK() {
        this.A0D.getValue();
    }

    public final void CML() {
        C68079Mzk mzk = (C68079Mzk) this.A0D.getValue();
        View view = mzk.A05;
        if (view.getVisibility() == 8) {
            view.setVisibility(0);
            view.setAlpha(0.0f);
            C66580MXl.A1D(DbY.A0G(view).setStartDelay(0).setInterpolator(new AccelerateDecelerateInterpolator()), new C73125PXJ(mzk));
            return;
        }
        view.setVisibility(8);
    }

    public final void E29() {
        C14044Tol tol = this.A08.A01;
        if (tol != null) {
            tol.A0A("server_paused_video");
        }
    }

    public final void ECY() {
        ((PMR) this.A0A.getValue()).A02();
    }

    public final void EJA() {
        C14044Tol tol = this.A08.A01;
        if (tol != null) {
            tol.A0C("resume", false);
        }
    }

    public final void ETb(int i) {
        int i2;
        C74467PvN pvN;
        C72981PRo pRo = this.A08;
        C14044Tol tol = pRo.A01;
        if (tol != null) {
            int AzN = tol.A06.AzN();
            if (AzN <= 0 || i < AzN) {
                i2 = i;
            } else {
                i2 = i % AzN;
            }
            tol.A05(i2, false);
            if (tol.A01 && (pvN = pRo.A00) != null) {
                pvN.DaQ(i, AzN);
            }
        }
    }

    public final void EqX(OK5 ok5) {
        this.A01 = ok5;
        ((PMJ) this.A0E.getValue()).A01 = ok5;
        ((PMI) this.A09.getValue()).A00 = ok5;
        C68079Mzk mzk = (C68079Mzk) this.A0D.getValue();
        mzk.A01 = ok5;
        mzk.A0C.A0A(new PGN(1, mzk, ok5), R.id.listener_id_for_cowatch_content_load);
        PMR pmr = (PMR) this.A0A.getValue();
        pmr.A00 = ok5;
        ((C67791Muv) pmr.A06.getValue()).A01 = pmr.A00;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void Eux() {
        PMJ pmj = (PMJ) this.A0E.getValue();
        if (pmj.A00 == null) {
            pmj.A0C.post(new C73126PXK(pmj));
        }
    }

    public final void FHE() {
        C72981PRo Am2;
        C68295N9i n9i = this.A02;
        if (n9i != null) {
            if (n9i.A0J == null) {
                Am2 = this.A08;
            } else {
                Am2 = Am2();
                if (Am2 == null) {
                    return;
                }
            }
            C14044Tol tol = Am2.A01;
            if (tol != null) {
                tol.A04(-1);
            }
        }
    }

    public final void FM2() {
        C14044Tol tol = this.A08.A01;
        if (tol == null || !tol.A01) {
            this.A0H.A03();
        }
    }

    public final void onDestroy() {
        C72981PRo pRo = this.A08;
        C14044Tol tol = pRo.A01;
        if (tol != null) {
            tol.A0B("hide");
        }
        pRo.A01 = null;
        C72981PRo.A00(pRo);
        this.A0F.removeCallbacksAndMessages((Object) null);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.OOq, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68080Mzl(ViewGroup viewGroup, AnonymousClass0iw r6, UserSession userSession, OZx oZx) {
        super(viewGroup);
        C51974G9v.A1P(viewGroup, r6, userSession, oZx);
        this.A05 = viewGroup;
        this.A06 = r6;
        this.A07 = userSession;
        this.A0H = oZx;
        Context A0S = AnonymousClass7TE.A0S(viewGroup);
        this.A0G = new C70942OSp(A0S);
        if (AnonymousClass1pW.A00 == null) {
            0qQ.A0F("plugin");
            throw AnonymousClass00P.createAndThrow();
        }
        Activity activity = (Activity) A0S;
        0qQ.A0B(activity, 0);
        C72981PRo pRo = new C72981PRo(activity, A0S, userSession, new Object());
        pRo.A00 = new C72276Ozl(this);
        this.A08 = pRo;
        this.A0E = C73906Plh.A00(this, 18);
        this.A09 = C73906Plh.A00(this, 13);
        this.A0D = C73906Plh.A00(this, 17);
        this.A0A = C73906Plh.A00(this, 14);
        this.A0C = C73906Plh.A00(this, 16);
        this.A0B = C73906Plh.A00(this, 15);
    }

    public static final void A00(C74438Put put, C68080Mzl mzl, Boolean bool, Integer num, boolean z) {
        C68295N9i n9i;
        int i;
        C14044Tol tol;
        if (put.CeS() && (n9i = mzl.A02) != null && n9i.A0O) {
            if (((C68079Mzk) mzl.A0D.getValue()).A0D == null) {
                mzl.A0F.postDelayed(new C73394Pbr(put, mzl, bool, num, z), 100);
                return;
            }
            C72981PRo pRo = mzl.A08;
            C14044Tol tol2 = pRo.A01;
            if (tol2 != null) {
                i = tol2.A06.getCurrentPositionMs();
            } else {
                i = 0;
            }
            mzl.A01(put, bool, num, i);
            if (!z && (tol = pRo.A01) != null) {
                tol.A0C("resume", false);
            }
        }
    }

    private final void A01(C74438Put put, Boolean bool, Integer num, int i) {
        boolean z;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.A07.A06);
        A1A.append('_');
        String A0i = AnonymousClass7TF.A0i(UUID.randomUUID(), A1A);
        C72981PRo pRo = this.A08;
        MediaFrameLayout mediaFrameLayout = ((C68079Mzk) this.A0D.getValue()).A0D;
        String moduleName = this.A06.getModuleName();
        C69221Nhb A002 = O2F.A00(A0i);
        C70942OSp oSp = this.A0G;
        try {
            z = AcousticEchoCanceler.isAvailable();
        } catch (NullPointerException unused) {
            z = false;
        }
        pRo.A01(put, mediaFrameLayout, A002, bool, num, moduleName, i, z, oSp.A00.isSpeakerphoneOn(), false);
    }
}
