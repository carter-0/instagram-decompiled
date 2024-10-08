package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration;
import com.instagram.model.reels.ReelViewerConfig;

/* renamed from: X.6e3  reason: invalid class name and case insensitive filesystem */
public final class C312236e3 {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final ReelViewerConfig A02;
    public final C312266e6 A03;
    public final C273384mU A04;
    public final C273414mX A05;

    public C312236e3(AnonymousClass4DH r2, UserSession userSession, ReelViewerConfig reelViewerConfig, C273384mU r5, C273414mX r6) {
        0qQ.A0B(userSession, 2);
        0qQ.A0B(reelViewerConfig, 4);
        this.A00 = r2;
        this.A01 = userSession;
        this.A04 = r5;
        this.A02 = reelViewerConfig;
        this.A05 = r6;
        this.A03 = new C312256e5(userSession, r5);
    }

    public final void A00(EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration) {
        AnonymousClass4DH r0 = this.A00;
        Context context = r0.getContext();
        if (context != null && r0.mFragmentManager != null) {
            EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration2 = effectInfoBottomSheetConfiguration;
            LPQ.A02(context, C59725JVj.PRE_CAPTURE, this.A01, (C279284yO) null, effectInfoBottomSheetConfiguration2, this.A03, this.A05);
            this.A04.EHY("context_switch");
        }
    }
}
