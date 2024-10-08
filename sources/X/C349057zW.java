package X;

import android.content.Context;
import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.List;

/* renamed from: X.7zW  reason: invalid class name and case insensitive filesystem */
public final class C349057zW implements C358978bm {
    public int A00;
    public C358868bb A01;
    public boolean A02;
    public final Context A03;
    public final Handler A04;
    public final UserSession A05;
    public final C358368an A06;
    public final C349067zX A07;

    public C349057zW(Context context, Handler handler, RecyclerView recyclerView, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C358368an r12) {
        0qQ.A0B(context, 1);
        0qQ.A0B(recyclerView, 3);
        0qQ.A0B(handler, 5);
        this.A03 = context;
        this.A05 = userSession;
        this.A04 = handler;
        this.A06 = r12;
        this.A07 = new C349067zX(context, recyclerView, targetViewSizeProvider, this, true);
    }

    public final C360728f3 A00() {
        List list;
        C358868bb r0 = this.A01;
        Object obj = null;
        if (r0 == null || (list = r0.A0A) == null) {
            return null;
        }
        int i = this.A00 - 1;
        if (i >= 0 && i < list.size()) {
            obj = list.get(i);
        }
        return (C360728f3) obj;
    }

    public final void DML(int i, boolean z) {
        if (i != this.A00) {
            this.A00 = i;
            this.A06.A0c(A00());
        }
    }
}
