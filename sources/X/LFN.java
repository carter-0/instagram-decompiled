package X;

import android.view.View;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

public final class LFN {
    public C62481KgW A00 = C62481KgW.VIDEO_TOO_LONG;
    public final int A01;
    public final C3515589i A02;
    public final ImmutableList A03;
    public final UserSession A04;
    public final C234502xy A05;

    public LFN(C3515589i r4, ImmutableList immutableList, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel, C234502xy r8) {
        int i;
        DbW.A1N(userSession, 1, clipsCreationViewModel);
        this.A04 = userSession;
        this.A02 = r4;
        this.A03 = immutableList;
        this.A05 = r8;
        AnonymousClass831 A0h = JTO.A0h(clipsCreationViewModel.A0F);
        if (A0h != null) {
            i = A0h.A00;
        } else {
            i = 0;
        }
        AnonymousClass8J0 r0 = clipsCreationViewModel.A0L.A00;
        if (r0 != null) {
            int A0E = clipsCreationViewModel.A0E();
            if ((i == 0 && !r0.A07) || i > A0E) {
                i = A0E;
            }
        }
        this.A01 = i;
    }

    public final boolean A01(View view, C66569MWx mWx) {
        int i;
        0qQ.A0B(view, 0);
        Integer A002 = A00(mWx);
        if (A002 == AnonymousClass05K.A00) {
            return true;
        }
        int intValue = A002.intValue();
        if (intValue != 1) {
            i = 2131967894;
            if (intValue != 3) {
                i = 2131967896;
            }
        } else {
            i = 2131955515;
            if (this.A00.ordinal() == 2) {
                i = 2131955516;
            }
        }
        C59689JTv.A07(view.getContext(), i);
        return false;
    }

    public final Integer A00(C66569MWx mWx) {
        C3515589i r1;
        ImmutableList immutableList;
        ImmutableList immutableList2;
        DHT dht;
        C3515589i r12;
        if (this.A00 != C62481KgW.OK) {
            return AnonymousClass05K.A01;
        }
        if (mWx.C95() < this.A01 && (r12 = this.A02) != C3515589i.TIMELINE_AUDIO_GHOST_TRACK && r12 != C3515589i.TIMELINE_AUDIO_REPLACE && r12 != C3515589i.TIMELINE_TOOLBAR_AUDIO_OPTION && !AnonymousClass8IK.A00(this.A04)) {
            return AnonymousClass05K.A0C;
        }
        OriginalAudioSubtype originalAudioSubtype = null;
        if ((mWx instanceof DHT) && (dht = (DHT) mWx) != null) {
            originalAudioSubtype = dht.A02.BYy();
        }
        if (originalAudioSubtype != OriginalAudioSubtype.A06 || ((r1 = this.A02) == C3515589i.TIMELINE_TOOLBAR_AUDIO_OPTION || r1 == C3515589i.TIMELINE_AUDIO_GHOST_TRACK ? (immutableList = this.A03) == null || !AnonymousClass7TE.A1b(immutableList) : (immutableList2 = this.A03) == null || immutableList2.size() < 2)) {
            return AnonymousClass05K.A00;
        }
        return AnonymousClass05K.A0N;
    }
}
