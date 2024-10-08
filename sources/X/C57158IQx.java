package X;

import android.os.Bundle;
import com.instagram.debug.devoptions.signalsplayground.view.CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder;
import com.instagram.modal.ModalActivity;

/* renamed from: X.IQx  reason: case insensitive filesystem */
public final class C57158IQx implements CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.Delegate {
    public final /* synthetic */ C55883Hp4 A00;

    public final void onViewAudioDetailsClick(C16181Uq6 uq6) {
        0qQ.A0B(uq6, 0);
        Bundle A02 = C250563lf.A02((C54689HOu) null, (AnonymousClass8ZN) null, uq6.A00, AnonymousClass7TF.A0b());
        0qQ.A07(A02);
        C55883Hp4 hp4 = this.A00;
        DbU.A0w(hp4.A01, A02, hp4.A04, ModalActivity.class, "audio_page");
    }

    public C57158IQx(C55883Hp4 hp4) {
        this.A00 = hp4;
    }
}
