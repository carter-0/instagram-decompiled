package X;

import android.app.Activity;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.LlI  reason: case insensitive filesystem */
public final class C64979LlI implements C66445MRz {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ Medium A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ C62320sa A07;

    public C64979LlI(Activity activity, Medium medium, UserSession userSession, String str, String str2, String str3, C62320sa r7, int i) {
        this.A02 = medium;
        this.A01 = activity;
        this.A03 = userSession;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A00 = i;
        this.A07 = r7;
    }

    public final void Dqr(TargetViewSizeProvider targetViewSizeProvider) {
        String str = this.A02.A0X;
        Activity activity = this.A01;
        UserSession userSession = this.A03;
        TargetViewSizeProvider targetViewSizeProvider2 = targetViewSizeProvider;
        M0C m0c = new M0C(activity, userSession, targetViewSizeProvider2, this.A05, this.A04, this.A06, this.A07, this.A00);
        0qQ.A0B(str, 0);
        C39908AIz.A05(activity, userSession, new RBZ(str, 0, 0), m0c);
    }
}
