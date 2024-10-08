package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import androidx.constraintlayout.widget.Guideline;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.List;

/* renamed from: X.80Q  reason: invalid class name */
public final class AnonymousClass80Q {
    public final AnonymousClass80R A00;

    public final void A04(C53401GnY gnY, List list, int i, boolean z, boolean z2) {
        AnonymousClass80R r2 = this.A00;
        AnonymousClass8WX r1 = r2.A1N;
        if (r1.A01) {
            AnonymousClass8QN r0 = r2.A0b;
            r0.A02 = gnY;
            r0.A07 = z;
            r2.A1a.A00().CLK();
            r1.A00().A08();
            AnonymousClass8XA A002 = r1.A00();
            C362048hG r3 = r1.A00().A02;
            r3.getClass();
            A002.A0K(r3, list, i, false, z, z2);
        }
    }

    public final void A00() {
        AnonymousClass80R r2 = this.A00;
        r2.A0v.A0M = null;
        r2.A1Z.A07.A00();
    }

    public final void A01() {
        this.A00.A0x.onResume();
    }

    public final void A02(Context context) {
        AnonymousClass8WJ r6 = (AnonymousClass8WJ) this.A00.A16;
        if (context != null) {
            int A08 = 0nA.A08(context);
            AnonymousClass8WJ.A00(new RectF(0.0f, (float) A08, (float) 0nA.A09(context), (float) (A08 * 2)), r6.A0B, r6, "button", true, true);
        }
    }

    public final void A03(C265674Vs r10) {
        float f;
        AnonymousClass283 r1;
        C342197oC r0;
        boolean z;
        View view;
        C331157Pu r02;
        AnonymousClass80R r4 = this.A00;
        if (r4.A0v.A18 == null) {
            AnonymousClass81C r5 = r4.A0H.A00;
            if (((C357358Xo) r5.A00()).A06()) {
                UserSession userSession = r4.A0R;
                0qQ.A0B(userSession, 0);
                0Tu r2 = 0Tu.A05;
                if ((1AW.A06(r2, 18301173475839374L) || 182.A06(r2, userSession, 36315735194078712L)) && (r02 = ((C357358Xo) r5.A00()).A00) != null) {
                    r02.A07();
                }
            }
            r4.A19.A00().DGF(r10);
            C352888Fl r12 = r4.A0l;
            r12.A0R(r10);
            C353508Hx r03 = r4.A1j;
            if (r03 != null) {
                r03.DGF(r10);
            }
            AnonymousClass88T A01 = AnonymousClass4W7.A01(r10);
            r4.A1M.A04.Epw(A01);
            AnonymousClass8G7 r04 = r12.A16;
            r04.A01 = A01;
            Guideline guideline = r04.A00;
            if (guideline != null) {
                float f2 = 1.0f;
                if (A01 == AnonymousClass88T.TABLE_TOP) {
                    f2 = 0.5f;
                }
                guideline.setGuidelinePercent(f2);
            }
            Integer A012 = AnonymousClass4WA.A01(r4.A09);
            AnonymousClass4W8 A002 = AnonymousClass4W7.A00(r10);
            AnonymousClass88T r3 = AnonymousClass88T.TABLE_TOP;
            if (A01 != r3 || (view = r4.A0J.mView) == null) {
                f = 0.55f;
            } else {
                f = AnonymousClass4WA.A00(view, r10);
            }
            r4.A00 = f;
            UserSession userSession2 = r4.A0R;
            27r A013 = 27p.A01(userSession2);
            AnonymousClass88T r22 = AnonymousClass88T.FLAT;
            if (A01 == r22) {
                r1 = A013.A04;
                r0 = C342197oC.FLAT;
            } else if (A01 == r3) {
                r1 = A013.A04;
                r0 = C342197oC.TABLETOP;
            } else {
                AnonymousClass88T r05 = AnonymousClass88T.BOOK;
                r1 = A013.A04;
                if (A01 == r05) {
                    r0 = C342197oC.BOOK;
                } else {
                    r0 = null;
                }
            }
            r1.A06 = r0;
            if (A01 == r22 || A01 == r3 ? !(A012 == AnonymousClass05K.A0C && A002 != null && A002.BYt() == C18545Vtx.A01) : !(A01 == null && A012 == AnonymousClass05K.A0C)) {
                z = false;
            } else {
                z = true;
            }
            AnonymousClass8E8 A003 = r4.A0q.A00();
            0qQ.A0B(A012, 1);
            AnonymousClass8EA r06 = A003.A00;
            if (r06 != null) {
                r06.A07(r10, A01, A012);
            }
            if (z) {
                TargetViewSizeProvider targetViewSizeProvider = r4.A03;
                if (targetViewSizeProvider == null) {
                    Context requireContext = r4.A0J.requireContext();
                    0qQ.A0B(userSession2, 2);
                    targetViewSizeProvider = new NineSixteenLayoutConfigImpl(requireContext, 182.A06(0Tu.A05, userSession2, 36325025208349236L));
                    r4.A03 = targetViewSizeProvider;
                }
                AnonymousClass81Y.A01(r4.A0U, r4.A1Y.A00, targetViewSizeProvider, r4.A1X);
                TargetViewSizeProvider targetViewSizeProvider2 = r4.A03;
                0qQ.A0B(targetViewSizeProvider2, 0);
                ((C342227oF) r4.A2E.getValue()).A00 = targetViewSizeProvider2;
            }
        }
    }

    public final void A05(String str, boolean z) {
        this.A00.A16.DDT((View) null, str, z);
    }

    public final boolean A06() {
        AnonymousClass80R r2 = this.A00;
        AnonymousClass85X r1 = r2.A0n;
        if (!r1.A09) {
            return r2.A0m.onBackPressed();
        }
        r1.A0C();
        return true;
    }

    /* JADX INFO: finally extract failed */
    public AnonymousClass80Q(AnonymousClass80D r5) {
        UserSession userSession = r5.A0S;
        0qQ.A0B(userSession, 0);
        if (182.A06(0Tu.A05, userSession, 36324999438873129L)) {
            2cc A002 = C71342cb.A00(r5.A0S);
            r5.A0M.getClass();
            A002.DGk(r5.A0M, true);
        }
        0lq.A02("igcam_qcc_constr");
        try {
            AnonymousClass9PE r0 = r5.A0n;
            if (r0 != null) {
                AnonymousClass9PL r1 = r0.A04;
                if (r1 == null) {
                    0qQ.A0F("navigationPerfLogger");
                    throw AnonymousClass00P.createAndThrow();
                }
                r1.A0E("partially_visible_begin");
            }
            AnonymousClass80R r02 = new AnonymousClass80R(r5);
            0lq.A01();
            this.A00 = r02;
        } catch (Throwable th) {
            0lq.A01();
            throw th;
        }
    }
}
