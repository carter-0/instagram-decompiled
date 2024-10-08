package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;

/* renamed from: X.Jhu  reason: case insensitive filesystem */
public final class C60237Jhu extends 2YL {
    public final AnonymousClass8CO A00;
    public final S0L A01;
    public final UserSession A02;
    public final ClipsAudioStore A03;
    public final AnonymousClass861 A04;
    public final 1Av A05;
    public final AnonymousClass0r6 A06;

    public final void A00(float f) {
        ClipsAudioStore clipsAudioStore = this.A03;
        if (clipsAudioStore.A0b.getValue() == null) {
            clipsAudioStore.A07(0.0f);
        }
        this.A04.A0I.A0B(Float.valueOf(C229632nm.A01(f)));
    }

    public C60237Jhu(UserSession userSession, ClipsAudioStore clipsAudioStore, AnonymousClass861 r9) {
        AnonymousClass7TG.A1U(userSession, clipsAudioStore, r9);
        this.A02 = userSession;
        this.A03 = clipsAudioStore;
        this.A04 = r9;
        this.A06 = MC9.A00(clipsAudioStore.A0k, 27);
        this.A00 = new AnonymousClass8CO(userSession, AnonymousClass7TE.A1I(new AnonymousClass8CI("ctal_ferraris_ns", "model_opt", 0sn.A00, 12)));
        this.A05 = 1Au.A00(userSession);
        this.A01 = new S0L(new C10387RrO(userSession, 1US.A0H));
    }
}
