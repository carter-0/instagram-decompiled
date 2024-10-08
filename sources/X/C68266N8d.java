package X;

import android.view.View;

/* renamed from: X.N8d  reason: case insensitive filesystem */
public final class C68266N8d extends AnonymousClass0T0 implements C74250Pre {
    public final View A00;
    public final C71039Oa5 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68266N8d) {
                C68266N8d n8d = (C68266N8d) obj;
                if (!0qQ.A0K(this.A00, n8d.A00) || !0qQ.A0K(this.A01, n8d.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public C68266N8d(View view, C71039Oa5 oa5) {
        this.A00 = view;
        this.A01 = oa5;
    }
}
