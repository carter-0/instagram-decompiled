package X;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.9QW  reason: invalid class name */
public final class AnonymousClass9QW implements View.OnClickListener {
    public final /* synthetic */ C353498Hw A00;

    public AnonymousClass9QW(C353498Hw r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-2059443604);
        C353498Hw r2 = this.A00;
        if (C353498Hw.A1Z(r2)) {
            JYD A002 = C352888Fl.A00(r2.A1J);
            if (A002 != null) {
                if (A002.A0M.getItemCount() == 0) {
                    A002.A0J.A0M(C358088aL.A0z);
                } else {
                    JYD.A02(new AKK(A002, 3), A002);
                }
            }
        } else if (r2.A1g() || C353498Hw.A05(r2) != null) {
            C353498Hw.A0d(r2);
        } else if (r2.CKX()) {
            if (!r2.A1x.A02() || !C353498Hw.A1a(r2)) {
                UserSession userSession = r2.A1D;
                29R r6 = 27p.A01(userSession).A09;
                1Ln A08 = 1Ln.A08(r6.A01);
                if (A08.A00.isSampled() && r6.A0Q("logClipsDeleteAllSegmentsButtonTap()")) {
                    A08.A0t("IG_CAMERA_CLIPS_DELETE_ALL_SEGMENTS_BUTTON_TAP");
                    A08.A0r("CLIPS_DELETE_ALL_SEGMENTS_BUTTON_TAP");
                    29R.A00(A08, r6);
                    AnonymousClass283 r7 = r6.A04;
                    int i = 2;
                    if (r7.A01 != 2) {
                        i = 1;
                    }
                    A08.A0V(i);
                    A08.A0M(r6.A0I(), "capture_type");
                    A08.A0b(r7.A09);
                    A08.A0T();
                    A08.A0c(28t.A06);
                    A08.A0n(27x.A08.getModuleName());
                    A08.A0d(r7.A0C);
                    AnonymousClass7TF.A18(A08);
                    A08.A0N(2AL.A07(r6.A00, r6.A03), "system_info");
                    A08.Cgf();
                }
                if (r2.A0g) {
                    boolean booleanValue = AnonymousClass7TF.A0R(0Tu.A05, userSession, 36323332991233115L).booleanValue();
                    Context context = r2.A11;
                    if (booleanValue) {
                        context = 2Yn.A01(context);
                    }
                    C358248ab r62 = new C358248ab(context);
                    r62.A09(2131955308);
                    AKK akk = new AKK(r2, 6);
                    C358278ae r4 = C358278ae.DEFAULT;
                    r62.A0Q(akk, r4, 2131956164);
                    r62.A0O(C39948AKo.A00, r4, 2131954722);
                    r62.A04();
                    Dialog A02 = r62.A02();
                    C353498Hw.A0c(r2);
                    r2.A04 = A02;
                    if (A02 != null) {
                        AnonymousClass0fN.A00(A02);
                    }
                } else {
                    r2.A1e(AnonymousClass05K.A00, (Runnable) null);
                }
            } else {
                r2.A1s.A0A();
                C353498Hw.A1F(r2, false, false, false);
                r2.A1B.requireActivity().finish();
            }
        }
        AnonymousClass0fD.A0C(557540215, A05);
    }
}
