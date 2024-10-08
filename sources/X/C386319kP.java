package X;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.9kP  reason: invalid class name and case insensitive filesystem */
public final class C386319kP extends AnonymousClass3NK {
    public final /* synthetic */ AJ9 A00;

    public C386319kP(AJ9 aj9) {
        this.A00 = aj9;
    }

    public final boolean Dqe(View view) {
        AJ9 aj9 = this.A00;
        C347017w8 r4 = aj9.A06;
        if (r4 == null) {
            return true;
        }
        C357788Zr r3 = aj9.A0K;
        ArrayList arrayList = r3.A01;
        int size = (r3.A00 + 1) % arrayList.size();
        r3.A00 = size;
        Object obj = arrayList.get(size);
        0qQ.A07(obj);
        int A0M = AnonymousClass7TE.A0M(obj);
        if (!AnonymousClass30D.A06(aj9.A0I)) {
            return true;
        }
        Iterator it = r4.A06(B3d.class).iterator();
        while (it.hasNext()) {
            ((B3d) it.next()).ESC(A0M);
        }
        return true;
    }
}
