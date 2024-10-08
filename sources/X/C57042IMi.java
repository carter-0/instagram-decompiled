package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.IMi  reason: case insensitive filesystem */
public final class C57042IMi implements C59547JNt {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ AnonymousClass4DU A03;
    public final /* synthetic */ AnonymousClass3W1 A04;
    public final /* synthetic */ AnonymousClass93U A05;
    public final /* synthetic */ C55684Hlh A06;

    public C57042IMi(FragmentActivity fragmentActivity, UserSession userSession, 1Xj r3, AnonymousClass4DU r4, AnonymousClass3W1 r5, AnonymousClass93U r6, C55684Hlh hlh) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A03 = r4;
        this.A05 = r6;
        this.A06 = hlh;
        this.A02 = r3;
        this.A04 = r5;
    }

    public final void Djf(boolean z) {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        AnonymousClass4DU r4 = this.A03;
        String CFD = this.A05.CFD();
        String str = this.A06.A00;
        LTW.A00.A0A(fragmentActivity, userSession, this.A02, r4, this.A04, CFD, str, z);
    }
}
