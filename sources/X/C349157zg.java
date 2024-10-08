package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.List;

/* renamed from: X.7zg  reason: invalid class name and case insensitive filesystem */
public final class C349157zg implements C358978bm {
    public int A00;
    public C358868bb A01;
    public final Context A02;
    public final UserSession A03;
    public final C358368an A04;
    public final C349067zX A05;

    public C349157zg(Context context, RecyclerView recyclerView, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C358368an r11) {
        0qQ.A0B(context, 1);
        0qQ.A0B(recyclerView, 3);
        this.A02 = context;
        this.A03 = userSession;
        this.A04 = r11;
        this.A05 = new C349067zX(context, recyclerView, targetViewSizeProvider, this, true);
    }

    public final C306396Lz A00() {
        List list;
        C358868bb r0 = this.A01;
        if (r0 == null || (list = r0.A0B) == null) {
            return null;
        }
        return (C306396Lz) 00k.A0O(list, this.A00 - 1);
    }

    public final void DML(int i, boolean z) {
        if (i != this.A00) {
            this.A00 = i;
            this.A04.A0d(A00());
        }
    }
}
