package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.Map;

/* renamed from: X.FEp  reason: case insensitive filesystem */
public final class C49915FEp {
    public boolean A00;
    public final FragmentActivity A01;
    public final AnonymousClass4DH A02;
    public final BusinessFlowAnalyticsLogger A03;
    public final C51926G7u A04 = new C50214FTu(this);
    public final 1wn A05;
    public final 1wn A06;
    public final UserSession A07;

    public static void A01(C49915FEp fEp) {
        fEp.A03.Ckp(new C22030Xtl("switch_back", "setting", "cancel", (String) null, (String) null, (Map) null, (Map) null, (Map) null));
    }

    public C49915FEp(AnonymousClass4DH r6, UserSession userSession) {
        FXZ A002 = FXZ.A00(this, 60);
        this.A06 = A002;
        FXZ A003 = FXZ.A00(this, 61);
        this.A05 = A003;
        this.A07 = userSession;
        this.A02 = r6;
        this.A01 = r6.requireActivity();
        BusinessFlowAnalyticsLogger A012 = C319596qs.A01(C319586qr.CONVERSION_FLOW, userSession, "business_conversion_controller", (String) null);
        A012.getClass();
        this.A03 = A012;
        if (r6.mView != null) {
            AnonymousClass1Nd.A00(userSession).A01(A002, C50265FVw.class);
            AnonymousClass1Nd.A00(userSession).A01(A003, FW6.class);
            r6.registerLifecycleListener(new C50296FXb(this, 7));
        }
    }

    public static void A00(C358278ae r4, C49915FEp fEp, int i) {
        C358248ab A0X = DbS.A0X(fEp.A01);
        A0X.A09(2131974882);
        A0X.A08(i);
        A0X.A0Q(C50021FJg.A00(fEp, 33), r4, 2131974881);
        DbX.A16(C50021FJg.A00(fEp, 34), A0X);
    }

    public final void A02(C319586qr r8) {
        int i;
        int ordinal = r8.ordinal();
        if (ordinal == 2) {
            i = 11;
        } else if (ordinal == 5) {
            i = 12;
        } else {
            throw AnonymousClass7TE.A0w("unsupported flow type");
        }
        C48729EjE.A00();
        FragmentActivity fragmentActivity = this.A01;
        0qQ.A0B(fragmentActivity, 0);
        Intent A042 = DbU.A04(fragmentActivity);
        AnonymousClass4DH r3 = this.A02;
        Bundle requireArguments = r3.requireArguments();
        requireArguments.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "setting");
        requireArguments.putInt("intro_entry_position", 0);
        DbV.A1C(A042, r8.A00, requireArguments);
        0kR.A05(r3, A042, i);
    }
}
