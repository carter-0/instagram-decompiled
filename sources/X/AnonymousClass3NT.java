package X;

import android.graphics.ColorFilter;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.emitter.PulseEmitter;

/* renamed from: X.3NT  reason: invalid class name */
public abstract class AnonymousClass3NT {
    /* JADX WARNING: type inference failed for: r0v6, types: [com.instagram.ui.widget.imageview.PulsingMultiImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v28, types: [com.instagram.ui.widget.imageview.PulsingMultiImageView, android.view.View] */
    public static final void A00(AnonymousClass3N0 r6) {
        0qQ.A0B(r6, 0);
        AnonymousClass3N9 r5 = (AnonymousClass3N9) r6.A03.getValue();
        0qQ.A0B(r5, 0);
        IgImageView igImageView = r5.A0L;
        igImageView.A09();
        igImageView.setVisibility(8);
        igImageView.setColorFilter((ColorFilter) null);
        igImageView.setPadding(0, 0, 0, 0);
        igImageView.setBackgroundColor(igImageView.getContext().getColor(R.color.fds_transparent));
        PulseEmitter pulseEmitter = r5.A0A;
        if (pulseEmitter != null) {
            pulseEmitter.A02();
            pulseEmitter.setVisibility(8);
            ? r0 = r5.A0B;
            if (r0 != 0) {
                r0.A0I();
                r0.setVisibility(8);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        View view = r5.A03;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = r5.A02;
        if (view2 != null) {
            view2.setVisibility(4);
        }
        r5.A0O.setVisibility(8);
        ? r02 = r5.A0B;
        if (r02 != 0) {
            r02.setVisibility(8);
        }
        r5.A0C.setVisibility(8);
        r5.A0J.setVisibility(8);
        AnonymousClass0eM r1 = r6.A09;
        if (((C252063oV) r1.getValue()).CVM()) {
            ((C252063oV) r1.getValue()).setVisibility(4);
            ((C252063oV) r1.getValue()).getView().setOnTouchListener((View.OnTouchListener) null);
        }
        AnonymousClass0eM r12 = r6.A01;
        if (((C252063oV) r12.getValue()).CVM()) {
            ((C252063oV) r12.getValue()).setVisibility(4);
        }
        AnonymousClass0eM r13 = r6.A0A;
        if (((C252063oV) r13.getValue()).CVM()) {
            ((C252063oV) r13.getValue()).setVisibility(4);
        }
    }

    public static final void A01(AnonymousClass3N0 r1, boolean z) {
        if (!z || ((C240913Nc) ((C240893Na) r1.A02.getValue()).A01.getValue()).A00 != null) {
            ((View) ((C240893Na) r1.A02.getValue()).A00.getValue()).setVisibility(8);
        }
    }

    public static final void A02(AnonymousClass3N0 r1, boolean z) {
        if (!z || ((C240913Nc) ((C240933Nf) r1.A04.getValue()).A05.getValue()).A00 != null) {
            ((View) ((C240933Nf) r1.A04.getValue()).A04.getValue()).setVisibility(8);
        }
    }
}
