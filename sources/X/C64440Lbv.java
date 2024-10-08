package X;

import android.app.Activity;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;
import com.instagram.location.impl.LocationPluginImpl;

/* renamed from: X.Lbv  reason: case insensitive filesystem */
public final class C64440Lbv implements C20882X2k {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ LocationPluginImpl A02;
    public final /* synthetic */ C267874cM A03;
    public final /* synthetic */ C66494MTx A04;
    public final /* synthetic */ C16530Uwa A05;
    public final /* synthetic */ Boolean A06;
    public final /* synthetic */ String A07;

    public C64440Lbv(Activity activity, UserSession userSession, LocationPluginImpl locationPluginImpl, C267874cM r4, C66494MTx mTx, C16530Uwa uwa, Boolean bool, String str) {
        this.A02 = locationPluginImpl;
        this.A01 = userSession;
        this.A03 = r4;
        this.A07 = str;
        this.A04 = mTx;
        this.A06 = bool;
        this.A00 = activity;
        this.A05 = uwa;
    }

    public final void DWn(AnonymousClass4OB r16, Integer num) {
        C346927vz r2;
        AnonymousClass4OB r1 = r16;
        if (r1 == AnonymousClass4OB.GRANTED || r1 == AnonymousClass4OB.LOCATION_PARTIAL) {
            LocationPluginImpl.A02(this.A01, this.A02, this.A03, this.A07, false);
            return;
        }
        if (r1 == AnonymousClass4OB.NEVER_ASK_AGAIN) {
            r2 = C346927vz.DENIED_DONT_ASK_AGAIN;
        } else {
            r2 = C346927vz.DENIED;
        }
        this.A04.DWl(r2);
        LocationPluginImpl locationPluginImpl = this.A02;
        UserSession userSession = this.A01;
        Boolean bool = this.A06;
        if (locationPluginImpl.shouldUseNewNativeReconsiderDialog(userSession) && r2 == C346927vz.DENIED_DONT_ASK_AGAIN && !bool.booleanValue()) {
            Activity activity = this.A00;
            C16530Uwa uwa = this.A05;
            0qQ.A0B(userSession, 1);
            Resources resources = activity.getResources();
            String A0d = AnonymousClass7TF.A0d(resources, 2131971432);
            String A0d2 = AnonymousClass7TF.A0d(resources, 2131971431);
            String A0n = C51972G9s.A0n();
            AnonymousClass4O6 r6 = new AnonymousClass4O6(new C64570LeC(), userSession);
            VK6.A00.A03(userSession, r6, uwa.name(), A0n);
            C358248ab A0X = DbS.A0X(activity);
            A0X.A05 = A0d;
            A0X.A0q(A0d2);
            A0X.A0I(new C49999FIk(activity, uwa, r6, userSession, A0n, 4), 2131974918);
            DbX.A16(new LUX(uwa, userSession, r6, A0n, 3), A0X);
        }
    }
}
