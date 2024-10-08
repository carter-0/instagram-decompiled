package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.57H  reason: invalid class name */
public final class AnonymousClass57H extends C249383je implements C61110lV {
    public final int A00 = 399507460;
    public final DisplayMetrics A01;
    public final 02m A02;

    public AnonymousClass57H(Context context) {
        DisplayMetrics displayMetrics;
        02m r0 = 02m.A0p;
        0qQ.A07(r0);
        this.A02 = r0;
        Resources resources = context.getResources();
        if (resources != null) {
            displayMetrics = resources.getDisplayMetrics();
        } else {
            displayMetrics = null;
        }
        this.A01 = displayMetrics;
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(548996925);
        this.A02.markerEnd(this.A00, 630);
        14i.A06(this);
        AnonymousClass0fD.A0A(-123672528, A03);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(-160456696, AnonymousClass0fD.A03(162525419));
    }

    public final void onScroll(C238133Ar r5, int i, int i2, int i3, int i4, int i5) {
        int A03 = AnonymousClass0fD.A03(-1940822656);
        0qQ.A0B(r5, 0);
        if (r5.CEd() instanceof RecyclerView) {
            ViewGroup CEd = r5.CEd();
            0qQ.A0C(CEd, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            RecyclerView recyclerView = (RecyclerView) CEd;
            recyclerView.computeVerticalScrollRange();
            recyclerView.computeVerticalScrollOffset();
            recyclerView.computeVerticalScrollExtent();
            if (this.A01 != null) {
                RectF rectF = 0nA.A01;
            }
            C252553pI r1 = recyclerView.A0D;
            2Rw r0 = recyclerView.A0A;
            if (r0 == null || r1 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not get ");
                sb.append(this);
                sb.append(".analyticsModuleName RecyclerView item count because of NPE");
                0wb.A03("TailFetchPerfLogger", sb.toString());
            } else {
                r0.getItemCount();
                C240113Jq.A02(r1);
            }
        }
        AnonymousClass0fD.A0A(820607194, A03);
    }

    public final void onScrollStateChanged(C238133Ar r3, int i) {
        AnonymousClass0fD.A0A(-390228073, AnonymousClass0fD.A03(390555118));
    }
}
