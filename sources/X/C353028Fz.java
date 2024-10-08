package X;

import android.app.Activity;
import android.view.View;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import java.io.File;

/* renamed from: X.8Fz  reason: invalid class name and case insensitive filesystem */
public final class C353028Fz {
    public final /* synthetic */ C352888Fl A00;

    public final void A01(C21986Xoh xoh, int i, boolean z, boolean z2) {
        String str;
        BackgroundGradientColors A02;
        C352888Fl r3 = this.A00;
        AnonymousClass6ST r0 = r3.A0F;
        if (r0 != null) {
            r0.dismiss();
            r3.A0F = null;
        }
        if (!z) {
            C352888Fl.A08(r3);
            AnonymousClass8A1.A01(r3.A0f).A0M("Boomerang failed", 002.A0R("camera_destination ", ((C279284yO) r3.A0g.A08.A00).A02));
            return;
        }
        C353118Gi r2 = r3.A0m;
        C21986Xoh xoh2 = xoh;
        xoh2.getClass();
        r2.A00 = xoh2;
        AnonymousClass85X r02 = r3.A0v;
        r02.A0K = false;
        AnonymousClass85X.A06(r02);
        AnonymousClass8DD r03 = r3.A14;
        if (r03 != null) {
            AnonymousClass87G A0D = r03.A0D();
            if (A0D == null) {
                C352888Fl.A0F(C352888Fl.__redex_internal_original_name, "BurstFramesCaptureListener.onFinish() dialElement is null");
            } else {
                AnonymousClass87I r6 = A0D.A04;
                if (r6 == null) {
                    r6 = AnonymousClass87I.EMPTY;
                }
                if (r6 == AnonymousClass87I.AR_EFFECT) {
                    r3.A13.A0C(true);
                }
            }
        }
        Integer A0N = r3.A0N();
        if (A0N == null || 1 != A0N.intValue()) {
            str = "back";
        } else {
            str = "front";
        }
        r3.A0w.A02.A08(AnonymousClass05K.A00);
        long currentTimeMillis = System.currentTimeMillis();
        int intValue = xoh2.A00(C21986Xoh.A0L).intValue();
        int intValue2 = xoh2.A00(C21986Xoh.A0K).intValue();
        int intValue3 = xoh2.A00(C21986Xoh.A0M).intValue();
        Object A01 = xoh2.A01(C21986Xoh.A0S);
        A01.getClass();
        C349307zv r10 = new C349307zv(new File((String) A01), (Integer) null, str, intValue, intValue2, intValue3, currentTimeMillis, currentTimeMillis, false, false, false);
        UserSession userSession = r3.A0f;
        C357638Yz r8 = r3.A0g;
        if (AnonymousClass9TC.A00(userSession, (C279284yO) r8.A08.A00)) {
            C266824aP r9 = new C266824aP();
            C266764aJ r7 = new C266764aJ(C266714aE.VIDEO);
            r7.A02(new C266744aH(new File(r10.A0k)).A00());
            r9.A04(new C266794aM(r7));
            r10.A0O = new MediaComposition(r9);
        }
        if (r8.A0V(C358088aL.A0B)) {
            r10.A1I = true;
            r10.A0l = r3.A08.A0T.A00;
            r10.A13 = true;
            r10.A1A = z2;
            r10.A0c = Integer.valueOf(i);
            r10.A07 = 6000;
        }
        r10.A01 = xoh2.A00(C21986Xoh.A0J).intValue();
        if (r3.A1W) {
            r2.A07(r10);
        }
        if (AnonymousClass888.A00(r3.A0i, "boomerang_capture")) {
            A02 = new BackgroundGradientColors(-16711936, -65281);
        } else {
            A02 = C39908AIz.A02(new File(r10.A0k));
        }
        r10.A0U = 0oY.A01(A02, r10.A09);
        AnonymousClass8A2 A012 = AnonymousClass8A1.A01(userSession);
        A012.A05 = A012.A0K.A02(17636574, A012.A05);
        r3.A0B.A06(r10);
    }

    public C353028Fz(C352888Fl r1) {
        this.A00 = r1;
    }

    public final void A00(float f) {
        C352888Fl r2 = this.A00;
        if (r2.A0Y() && r2.A0g.A0V(C358088aL.A0B)) {
            r2.A1I.setVideoRecordingProgress(f);
        }
    }

    public final void A02(boolean z) {
        C352888Fl r3 = this.A00;
        AnonymousClass8GA r2 = r3.A0n;
        r2.A09(0);
        r3.A1I.DnW("burst_capture_completed");
        View view = r2.A0A;
        view.animate().cancel();
        view.setVisibility(8);
        if (!z) {
            C352888Fl.A08(r3);
            AnonymousClass8A1.A01(r3.A0f).A0M("Boomerang capture failed", 002.A0R("camera_destination ", ((C279284yO) r3.A0g.A08.A00).A02));
            return;
        }
        AnonymousClass6ST r0 = r3.A0F;
        if (r0 != null) {
            r0.dismiss();
            r3.A0F = null;
        }
        Activity activity = r3.A0P;
        AnonymousClass6ST r1 = new AnonymousClass6ST(activity);
        r3.A0F = r1;
        r1.A00(activity.getString(2131969783));
        AnonymousClass0fN.A00(r3.A0F);
    }
}
