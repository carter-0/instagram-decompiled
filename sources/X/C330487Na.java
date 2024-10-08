package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.7Na  reason: invalid class name and case insensitive filesystem */
public final class C330487Na {
    public final WeakReference A00;
    public final UserSession A01;

    public C330487Na(RecyclerView recyclerView, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = new WeakReference(recyclerView);
    }
}
