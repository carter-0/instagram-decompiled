package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Ttn  reason: case insensitive filesystem */
public final class C14313Ttn {
    public RecyclerView A00;
    public final XAZ A01;

    public C14313Ttn(XAZ xaz) {
        0qQ.A0B(xaz, 1);
        this.A01 = xaz;
    }

    public final C20976X7p A01(C296935qt r6) {
        C252553pI r2;
        int A002;
        int A03;
        Object obj;
        X1S x1s;
        0qQ.A0B(r6, 0);
        RecyclerView recyclerView = this.A00;
        if (!(recyclerView == null || (r2 = recyclerView.A0D) == null || (A002 = A00(r6)) == -1 || (A03 = C240113Jq.A03(r2, recyclerView, A002)) == -1)) {
            View childAt = recyclerView.getChildAt(A03);
            if (childAt != null) {
                obj = childAt.getTag();
            } else {
                obj = null;
            }
            if ((obj instanceof X1S) && (x1s = (X1S) obj) != null) {
                return (C20976X7p) x1s;
            }
        }
        return null;
    }

    public final C14315Ttp A02(C296935qt r4) {
        int A002;
        0qQ.A0B(r4, 0);
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null || recyclerView.A0D == null || (A002 = A00(r4)) == -1) {
            return null;
        }
        return this.A01.CE9(A002);
    }

    private final int A00(C296935qt r7) {
        C252553pI r0;
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null && (r0 = recyclerView.A0D) != null) {
            int A012 = C240113Jq.A01(r0);
            int A02 = C240113Jq.A02(r0);
            if (A012 != -1 && A02 != -1) {
                XAZ xaz = this.A01;
                if (A012 < xaz.getCount() && A02 < xaz.getCount() && A012 <= A02) {
                    while (true) {
                        Object item = ((C20897X3o) xaz).getItem(A012);
                        if (!(item instanceof C296935qt) || !0qQ.A0K(((C296935qt) item).getKey(), r7.getKey())) {
                            if (A012 == A02) {
                                break;
                            }
                            A012++;
                        } else {
                            return A012;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
