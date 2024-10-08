package X;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.WPq  reason: case insensitive filesystem */
public final class C19210WPq implements C13668Tec {
    public Parcelable A00;
    public RecyclerView A01;
    public C15172UTx A02 = new Tq8((Ty6) null);
    public String A03 = "";

    public final boolean isScrolledToTop() {
        if (C245983dn.A03()) {
            RecyclerView recyclerView = this.A01;
            if (recyclerView != null) {
                return !JTP.A1Y(recyclerView);
            }
            return true;
        }
        throw new RuntimeException("Cannot call isScrolledToTop off the main thread!");
    }
}
