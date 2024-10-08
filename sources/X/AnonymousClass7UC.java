package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* renamed from: X.7UC  reason: invalid class name */
public final class AnonymousClass7UC {
    public boolean A00;
    public final AnonymousClass4DH A01;
    public final AnonymousClass7UA A02;
    public final C62320sa A03;
    public final C62320sa A04;
    public final UserSession A05;
    public final AnonymousClass7U9 A06;
    public final C62320sa A07;

    public AnonymousClass7UC(AnonymousClass4DH r2, UserSession userSession, AnonymousClass7UA r4, AnonymousClass7U9 r5, C62320sa r6, C62320sa r7, C62320sa r8) {
        0qQ.A0B(r2, 2);
        0qQ.A0B(r6, 5);
        0qQ.A0B(r7, 6);
        0qQ.A0B(r8, 7);
        this.A05 = userSession;
        this.A01 = r2;
        this.A02 = r4;
        this.A06 = r5;
        this.A03 = r6;
        this.A04 = r7;
        this.A07 = r8;
    }

    public final void A00(boolean z) {
        RecyclerView recyclerView = (RecyclerView) this.A04.invoke();
        if (recyclerView != null) {
            if (z) {
                recyclerView.A0p(0);
            } else {
                recyclerView.A0o(0);
            }
            this.A06.A00();
        }
    }

    public final boolean A01() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.A07.invoke();
        if (linearLayoutManager == null) {
            return false;
        }
        int A1c = linearLayoutManager.A1c();
        if (A1c == -1) {
            A1c = linearLayoutManager.A1a();
        }
        if (A1c == 0) {
            return true;
        }
        return false;
    }

    public final boolean A02(int i) {
        C333517Zg r5 = (C333517Zg) this.A03.invoke();
        if (this.A00) {
            Object invoke = this.A04.invoke();
            if (invoke != null) {
                int height = (int) (((float) ((View) invoke).getHeight()) - 0nA.A04(this.A01.requireContext(), 125));
                Object invoke2 = this.A07.invoke();
                if (invoke2 != null) {
                    ((LinearLayoutManager) invoke2).A1p(i, height);
                    this.A00 = false;
                    r5.AvL().EI1();
                    return true;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        } else if (!A01() || this.A02.A00) {
            return false;
        } else {
            A00(false);
            return true;
        }
    }
}
