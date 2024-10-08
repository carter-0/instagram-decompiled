package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;

public final class IQE implements C3515289f {
    public boolean A00;
    public final AnonymousClass0eM A01;
    public final C55556Hjc A02;
    public final String A03;

    public IQE(Context context, AnonymousClass4DH r8, UserSession userSession, C55556Hjc hjc, String str) {
        0qQ.A0B(userSession, 2);
        this.A02 = hjc;
        Context context2 = context;
        this.A01 = AnonymousClass0eN.A01(new C58208IoC(34, context2, this, r8, userSession));
        this.A03 = str;
    }

    public final /* synthetic */ void Dsx(AudioOverlayTrack audioOverlayTrack) {
    }

    public final /* synthetic */ void Dsz(AudioOverlayTrack audioOverlayTrack, boolean z) {
    }

    public final /* synthetic */ void Dt0(AudioOverlayTrack audioOverlayTrack, AudioOverlayTrack audioOverlayTrack2) {
    }

    public final void Dt2(AudioOverlayTrack audioOverlayTrack) {
        0qQ.A0B(audioOverlayTrack, 0);
        2YL A0H = DbS.A0H(this.A02.A00.A05);
        C58105ImR.A01(A0H, audioOverlayTrack, C318116oQ.A00(A0H), 0);
    }

    public final /* synthetic */ void Dt6(AudioOverlayTrack audioOverlayTrack, Integer num) {
        C63171Kse.A00(this, audioOverlayTrack);
    }

    public final String BUn() {
        return this.A03;
    }

    public final void DT3(boolean z) {
        boolean z2;
        C52974GgR ggR = (C52974GgR) this.A02.A00.A06.getValue();
        if (z) {
            z2 = true;
        } else {
            z2 = false;
        }
        AnonymousClass7TF.A1O(ggR.A0O, z2);
        this.A00 = z;
    }
}
