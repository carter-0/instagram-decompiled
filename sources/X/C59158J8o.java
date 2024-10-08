package X;

import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.common.session.UserSession;

/* renamed from: X.J8o  reason: case insensitive filesystem */
public final class C59158J8o extends 0Yg implements 0sL {
    public final /* synthetic */ long A00;
    public final /* synthetic */ ComposeView A01;
    public final /* synthetic */ C55610HkV A02;
    public final /* synthetic */ AnonymousClass4DU A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59158J8o(ComposeView composeView, C55610HkV hkV, AnonymousClass4DU r4, String str, long j, boolean z, boolean z2) {
        super(2);
        this.A03 = r4;
        this.A02 = hkV;
        this.A01 = composeView;
        this.A05 = z;
        this.A06 = z2;
        this.A00 = j;
        this.A04 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy r9 = (C286575Wy) obj;
        if (C51968G9o.A0B(obj2) != 2 || !r9.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1516587617, "com.instagram.compose.igds.components.navigation.actionbar.MainFeedActionBarTitleComposeView.getComposeView.<anonymous>.<anonymous> (InstagramLogoTitle.kt:50)");
            }
            AnonymousClass4DU r0 = this.A03;
            String moduleName = r0.getModuleName();
            C55610HkV hkV = this.A02;
            UserSession userSession = hkV.A01;
            boolean isOrganicEligible = r0.isOrganicEligible();
            boolean isSponsoredEligible = r0.isSponsoredEligible();
            boolean z = this.A05;
            boolean z2 = this.A06;
            C55610HkV hkV2 = hkV;
            String str = this.A04;
            C286885Ye.A03(r9, userSession, moduleName, AnonymousClass5PI.A01(r9, new C59119J7b(hkV2, str, this.A00, z, z2), -2110587696), 196608, 4, false, isOrganicEligible, isSponsoredEligible);
            ComposeView composeView = this.A01;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388691;
            composeView.setLayoutParams(layoutParams);
            if (0fL.A02()) {
                0fL.A00(1683171841);
            }
        } else {
            r9.Evl();
        }
        return C60340gF.A00;
    }
}
