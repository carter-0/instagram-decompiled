package X;

import android.util.SparseArray;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.3Uj  reason: invalid class name and case insensitive filesystem */
public final class C242503Uj implements C242513Uk {
    public final /* synthetic */ IgProgressImageView A00;

    public C242503Uj(IgProgressImageView igProgressImageView) {
        this.A00 = igProgressImageView;
    }

    public final void DaN(int i) {
        Integer num;
        IgProgressImageView igProgressImageView = this.A00;
        1Pp r1 = igProgressImageView.A0E;
        synchronized (r1) {
            C238303Bi r0 = (C238303Bi) r1.A01.get(igProgressImageView);
            if (r0 != null) {
                r0.A00 = i;
            }
        }
        if (i < 4) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A0C;
        }
        IgProgressImageView.A02(igProgressImageView, num);
        SparseArray sparseArray = igProgressImageView.A0D;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C247823gy) sparseArray.valueAt(i2)).DaN(i);
        }
    }
}
