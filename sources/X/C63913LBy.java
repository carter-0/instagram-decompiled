package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;

/* renamed from: X.LBy  reason: case insensitive filesystem */
public final class C63913LBy {
    public final HashMap A00 = AnonymousClass7TE.A1E();

    public final C59948JcE A00(RecyclerView recyclerView, C66442MRw mRw, C54725HQe hQe) {
        0qQ.A0B(recyclerView, 0);
        HashMap hashMap = this.A00;
        if (hashMap.get(hQe) == null) {
            int A002 = hQe.A00();
            if (A002 == 1 || A002 == 2) {
                hashMap.put(hQe, new C59948JcE(recyclerView, mRw));
            } else {
                throw new IllegalAccessException("This data type is not defined");
            }
        }
        C59948JcE jcE = (C59948JcE) hashMap.get(hQe);
        if (jcE != null && !recyclerView.equals(jcE.A00)) {
            RecyclerView recyclerView2 = jcE.A00;
            C60473Jm5 jm5 = jcE.A03;
            recyclerView2.A16(jm5);
            jcE.A00 = recyclerView;
            recyclerView.A15(jm5);
        }
        Object obj = hashMap.get(hQe);
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.capture.gallery.albumpicker.AlbumImpressionTracker<T of com.instagram.creation.capture.gallery.albumpicker.AlbumPickerImpressionTrackersManager.getImpressionTracker>");
        return (C59948JcE) obj;
    }
}
