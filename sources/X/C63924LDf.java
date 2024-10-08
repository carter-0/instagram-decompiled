package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.LDf  reason: case insensitive filesystem */
public final class C63924LDf {
    public final C65494LuI A00 = new C65494LuI(this, 0);
    public final C65497LuL A01 = new C65497LuL(this, 0);
    public final MTQ A02;
    public final AudioOverlayTrack A03;
    public final C353638Im A04;

    public final void A00() {
        C353638Im r0 = this.A04;
        AudioOverlayTrack audioOverlayTrack = this.A03;
        C65494LuI luI = this.A00;
        C65497LuL luL = this.A01;
        AnonymousClass7TG.A1O(luI, luL);
        r0.A03(audioOverlayTrack, luI, luL, audioOverlayTrack.A02, false, false);
    }

    public C63924LDf(Context context, MTQ mtq, UserSession userSession, AudioOverlayTrack audioOverlayTrack) {
        this.A03 = audioOverlayTrack;
        this.A02 = mtq;
        this.A04 = new C353638Im(context, userSession, new AnonymousClass8Zq(), 0);
    }
}
