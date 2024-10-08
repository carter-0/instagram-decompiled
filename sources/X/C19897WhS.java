package X;

import android.database.Cursor;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.WhS  reason: case insensitive filesystem */
public final class C19897WhS implements Runnable {
    public final /* synthetic */ SearchView A00;

    public C19897WhS(SearchView searchView) {
        this.A00 = searchView;
    }

    public final void run() {
        Q9E q9e = this.A00.A05;
        if (q9e instanceof C7401QBj) {
            q9e.AGi((Cursor) null);
        }
    }
}
