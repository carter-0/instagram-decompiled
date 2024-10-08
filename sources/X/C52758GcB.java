package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.GcB  reason: case insensitive filesystem */
public final class C52758GcB {
    public int A00;
    public boolean A01;
    public final C252553pI A02;
    public final RecyclerView A03;
    public final C59609JQd A04;
    public final UserSession A05;
    public final HashMap A06;

    public static final int A00(C52758GcB gcB, int i, int i2, boolean z) {
        int i3;
        View A0X;
        C252553pI r7 = gcB.A02;
        0qQ.A0B(r7, 0);
        int BaC = r7.BaC();
        int Ba8 = r7.A00 - r7.Ba8();
        int i4 = 0;
        while (i < i2) {
            int A012 = C240113Jq.A01(r7);
            if (i < A012 || (i3 = i - A012) > r7.A0T() || (A0X = r7.A0X(i3)) == null) {
                return -1;
            }
            int A002 = C2808154f.A00(A0X, r7);
            ViewGroup.LayoutParams layoutParams = A0X.getLayoutParams();
            0qQ.A0C(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int A0V = r7.A0V(A0X) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            if (z) {
                A002 = Math.max(A002, BaC);
                A0V = Math.min(A0V, Ba8);
            }
            i4 += A0V - A002;
            i++;
        }
        return i4;
    }

    public final int A01(int i) {
        int i2;
        View A0X;
        C252553pI r2 = this.A02;
        int A012 = C240113Jq.A01(r2);
        if (i >= A012 && (i2 = i - A012) <= r2.A0T() && (A0X = r2.A0X(i2)) != null) {
            this.A06.put(Integer.valueOf(i), Integer.valueOf(A0X.getHeight()));
        }
        return AnonymousClass7TG.A0A((Number) C51968G9o.A0z(this.A06, i));
    }

    public final int A02(int i) {
        List AZO = this.A04.AZO();
        if (i < 0 || i >= AZO.size()) {
            return -1;
        }
        return C51971G9r.A0I(AZO, i);
    }

    public final int A03(int i) {
        C252553pI r0 = this.A02;
        int A012 = C240113Jq.A01(r0);
        int A022 = C240113Jq.A02(r0) + 1;
        int A023 = A02(i);
        if (A023 == -1) {
            return 0;
        }
        int max = Math.max(A012, A023);
        int A024 = A02(i + 1);
        if (A024 != -1) {
            A022 = Math.min(A022, A024);
        }
        return A00(this, max, A022, true);
    }

    public C52758GcB(RecyclerView recyclerView, C227762js r5, UserSession userSession, C52761GcE gcE, C59609JQd jQd) {
        this.A04 = jQd;
        this.A03 = recyclerView;
        this.A05 = userSession;
        C252553pI r0 = recyclerView.A0D;
        if (r0 != null) {
            this.A02 = r0;
            this.A06 = AnonymousClass7TE.A1E();
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new C56827IDy(2, this, r5, gcE));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
