package X;

import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.72s  reason: invalid class name */
public final class AnonymousClass72s implements C13907Tl7 {
    public final /* synthetic */ NoteBubbleView A00;

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onDestroy(AnonymousClass07Z r1) {
    }

    public final void onPause(AnonymousClass07Z r4) {
        0qQ.A0B(r4, 0);
        NoteBubbleView noteBubbleView = this.A00;
        AnonymousClass6KL r0 = noteBubbleView.A0G;
        if (r0 != null) {
            r0.A05 = false;
            r0.invalidateSelf();
        }
        SpinnerImageView spinnerImageView = noteBubbleView.A0H;
        if (spinnerImageView != null) {
            spinnerImageView.setLoadingStatus(C255943uy.FAILED);
        }
    }

    public final void onResume(AnonymousClass07Z r4) {
        0qQ.A0B(r4, 0);
        NoteBubbleView noteBubbleView = this.A00;
        AnonymousClass6KL r1 = noteBubbleView.A0G;
        if (r1 != null) {
            r1.A05 = true;
            r1.invalidateSelf();
        }
        SpinnerImageView spinnerImageView = noteBubbleView.A0H;
        if (spinnerImageView != null) {
            spinnerImageView.setLoadingStatus(C255943uy.LOADING);
        }
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }

    public AnonymousClass72s(NoteBubbleView noteBubbleView) {
        this.A00 = noteBubbleView;
    }
}
