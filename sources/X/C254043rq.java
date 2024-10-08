package X;

import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;

/* renamed from: X.3rq  reason: invalid class name and case insensitive filesystem */
public final class C254043rq implements AnonymousClass3V3 {
    public final View A00;
    public final IgImageView A01;
    public final SegmentedProgressBar A02;
    public final AnonymousClass3W1 A03;
    public final C241103Nw A04;
    public final GN7 A05;

    public final AnonymousClass3TS Adf() {
        return null;
    }

    public final C256043v8 B5X() {
        return null;
    }

    public final C247233fz BQv() {
        return null;
    }

    public final C258253yi BRL() {
        return null;
    }

    public final void EEI(int i) {
    }

    public final void Epi(AnonymousClass0iw r2, ImageUrl imageUrl, boolean z) {
        0qQ.A0B(imageUrl, 0);
        0qQ.A0B(r2, 1);
        this.A01.setUrl(imageUrl, r2);
    }

    public final AnonymousClass3TN B5Y() {
        return this.A05;
    }

    public final View BG1() {
        return this.A01;
    }

    public final View BQB() {
        View view = this.A04.itemView;
        0qQ.A06(view);
        return view;
    }

    public final AnonymousClass3W1 BQq() {
        return this.A03;
    }

    public final C242423Ua C5r() {
        View view = this.A04.itemView;
        0qQ.A0C(view, C273654mx.A00(851));
        return (C242423Ua) view;
    }

    public final /* synthetic */ int C5s() {
        return -1;
    }

    public final int CEc() {
        return this.A01.getWidth();
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.GN7, java.lang.Object] */
    public C254043rq(AnonymousClass3W1 r2, C241103Nw r3) {
        SegmentedProgressBar segmentedProgressBar;
        this.A04 = r3;
        this.A03 = r2;
        View view = r3.itemView;
        0qQ.A06(view);
        this.A00 = view;
        IgImageView igImageView = r3.A0C;
        0qQ.A06(igImageView);
        this.A01 = igImageView;
        C69058Ndv ndv = r3.A0H;
        if (ndv != null) {
            segmentedProgressBar = (SegmentedProgressBar) ndv.A02.getValue();
        } else {
            segmentedProgressBar = null;
        }
        this.A02 = segmentedProgressBar;
        this.A05 = new Object();
    }
}
