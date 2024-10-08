package X;

import android.util.SparseArray;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.3Ui  reason: invalid class name and case insensitive filesystem */
public final class C242493Ui implements C240963Ni {
    public final /* synthetic */ IgProgressImageView A00;

    public final void DO4(C240983Nk r5) {
        0qQ.A0B(r5, 0);
        IgProgressImageView igProgressImageView = this.A00;
        igProgressImageView.A0E.A02(igProgressImageView, C238293Bh.ShowingData);
        IgProgressImageView.A02(igProgressImageView, AnonymousClass05K.A0N);
        SparseArray clone = igProgressImageView.A0C.clone();
        0qQ.A07(clone);
        int size = clone.size();
        int i = 0;
        while (i < size) {
            Object valueAt = clone.valueAt(i);
            if (valueAt != null) {
                ((C247813gx) valueAt).DO4(r5);
                i++;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public C242493Ui(IgProgressImageView igProgressImageView) {
        this.A00 = igProgressImageView;
    }

    public final void DEN() {
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to load image: isFallbackImageLoaded = ");
        IgProgressImageView igProgressImageView = this.A00;
        sb.append(igProgressImageView.A07);
        sb.append(", isAnyImageLoadedAFallback = ");
        sb.append(false);
        sb.append(", isAnyImageLoaded = ");
        sb.append(igProgressImageView.getIgImageView().A0G());
        0wb.A03("IgProgressImageView", sb.toString());
        igProgressImageView.A0E.A02(igProgressImageView, C238293Bh.ContentIsNotAvailable);
        if (!igProgressImageView.A07) {
            IgProgressImageView.A02(igProgressImageView, AnonymousClass05K.A0Y);
        }
        SparseArray clone = igProgressImageView.A0C.clone();
        0qQ.A07(clone);
        int i = 0;
        int size = clone.size();
        while (i < size) {
            Object valueAt = clone.valueAt(i);
            if (valueAt != null) {
                ((C247813gx) valueAt).DEN();
                i++;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
    }
}
