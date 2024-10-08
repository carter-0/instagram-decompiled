package X;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.ViewGroup;
import com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController;
import com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption;

/* renamed from: X.Lrr  reason: case insensitive filesystem */
public final class C65351Lrr implements C367608rH {
    public final /* synthetic */ C358368an A00;
    public final /* synthetic */ Object A01;

    public C65351Lrr(C358368an r1, Object obj) {
        this.A00 = r1;
        this.A01 = obj;
    }

    public final void onClick() {
        String str;
        C376699Iz CAA;
        VoiceOption voiceOption;
        C358368an r4 = this.A00;
        r4.A04 = ((C356178Sw) this.A01).A00;
        C64145LQi lQi = (C64145LQi) r4.A1h.get();
        AnonymousClass5MI r6 = (AnonymousClass5MI) r4.A04;
        lQi.A02 = r6;
        BottomSheetViewController bottomSheetViewController = lQi.A01;
        if (bottomSheetViewController == null) {
            Context requireContext = lQi.A06.requireContext();
            ViewGroup viewGroup = lQi.A05;
            if (viewGroup != null) {
                bottomSheetViewController = new BottomSheetViewController(requireContext, viewGroup, new C65065Lmj(lQi));
                lQi.A01 = bottomSheetViewController;
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        L44 l44 = new L44(lQi, AnonymousClass7TE.A16(lQi.A06.requireContext(), 2131955959));
        bottomSheetViewController.A03 = new C61775KLo(lQi.A02, lQi.A08, l44);
        BottomSheetViewController bottomSheetViewController2 = lQi.A01;
        if (bottomSheetViewController2 == null) {
            0qQ.A0F("bottomSheetViewController");
            throw AnonymousClass00P.createAndThrow();
        }
        bottomSheetViewController2.A02();
        MediaPlayer mediaPlayer = new MediaPlayer();
        lQi.A00 = mediaPlayer;
        mediaPlayer.setOnCompletionListener(LVE.A00);
        lQi.A0A.A00.A1X.FIJ(true);
        if (r6 == null || (CAA = r6.CAA()) == null || (voiceOption = (VoiceOption) CAA.A01) == null) {
            str = null;
        } else {
            str = voiceOption.A00;
        }
        C64145LQi.A01(lQi, str);
        27r.A08(C59725JVj.POST_CAPTURE, 27p.A01(r4.A1J), "TEXT_TO_SPEECH", false);
    }
}
