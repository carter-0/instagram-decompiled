package X;

import android.content.Context;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gh3  reason: case insensitive filesystem */
public final class C53012Gh3 extends 2YL {
    public final 2Fk A00;
    public final 05G A01;
    public final C55710Hm7 A02;

    public C53012Gh3(Context context, AnonymousClass07i r5, UserSession userSession) {
        0qQ.A0B(r5, 1);
        this.A02 = new C55710Hm7(context, r5, userSession);
        02z A012 = 106.A01(new C53262GlA(AudioFilterType.UNRECOGNIZED, 0sn.A00));
        this.A01 = A012;
        this.A00 = C226292g8.A00(19B.A00, A012);
    }

    public final void A00(AudioFilterType audioFilterType, String str) {
        AudioFilterType audioFilterType2 = AudioFilterType.UNRECOGNIZED;
        if (audioFilterType == audioFilterType2) {
            this.A01.Epw(new C53262GlA(audioFilterType2, 0sn.A00));
            return;
        }
        C55710Hm7 hm7 = this.A02;
        H51 h51 = new H51(21, (Object) audioFilterType, (Object) this);
        1NY A0M = DbU.A0M(hm7.A02);
        A0M.A0A("music/clips_with_audio_filters/");
        A0M.A05();
        A0M.A9m("filter_type", audioFilterType.A00);
        A0M.A0C("num_clips", 3);
        A0M.A9m("music_canonical_id", str);
        1OC A0S = DbU.A0S(A0M, C54056Gyf.class, C56250HvH.class);
        Context context = hm7.A00;
        AnonymousClass07i r0 = hm7.A01;
        A0S.A00 = h51;
        1ES.A00(context, r0, A0S);
    }
}
