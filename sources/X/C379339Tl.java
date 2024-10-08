package X;

import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.9Tl  reason: invalid class name and case insensitive filesystem */
public final class C379339Tl {
    public final /* synthetic */ C353498Hw A00;
    public final /* synthetic */ B3Z A01;
    public final /* synthetic */ B3a A02;
    public final /* synthetic */ C382009cw A03;

    public C379339Tl(C353498Hw r1, B3Z b3z, B3a b3a, C382009cw r4) {
        this.A00 = r1;
        this.A01 = b3z;
        this.A02 = b3a;
        this.A03 = r4;
    }

    public static final void A00(C379339Tl r4) {
        AnonymousClass8A2 r1;
        String str;
        MusicAttributionConfig BUm;
        B3Z b3z = r4.A01;
        if (b3z == null || (BUm = b3z.BUm()) == null) {
            r1 = r4.A00.A1h;
            str = "Null audio model or attribution config";
        } else {
            C353498Hw r2 = r4.A00;
            C3495880y r0 = r2.A0I;
            if (r0 != null) {
                int i = r0.A01;
                if (Integer.valueOf(i) != null) {
                    AudioOverlayTrack A002 = AnonymousClass9ST.A00(BUm, i);
                    if (A002 == null) {
                        r1 = r2.A1h;
                        str = "Cannot get track from config";
                    } else {
                        C353498Hw.A11(r2, A002, true);
                        C353498Hw.A0T(r2);
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        r1.A0C(str);
    }

    public final void A01() {
        String effectId;
        B3a b3a = this.A02;
        if (b3a != null && (effectId = b3a.getEffectId()) != null) {
            C353498Hw r0 = this.A00;
            AnonymousClass848 r1 = r0.A1A;
            r1.A00.Epw(new AnonymousClass8YD(AnonymousClass84B.EFFECT_SUGGESTION, effectId, C371068xW.A00(r0.A16), (String) null, (String) null, (String) null, (String) null, -1, false));
        }
    }
}
