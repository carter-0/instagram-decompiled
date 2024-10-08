package X;

import android.view.View;
import java.util.List;

/* renamed from: X.ULh  reason: case insensitive filesystem */
public final class C15051ULh extends AnonymousClass0T0 {
    public int A00;
    public int A01;
    public Object A02;
    public boolean A03;
    public final int A04 = 1;

    public C15051ULh(View.OnClickListener onClickListener, int i, int i2, boolean z) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = z;
        this.A02 = onClickListener;
    }

    public final boolean equals(Object obj) {
        if (1 - this.A04 != 0) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15051ULh)) {
            return false;
        }
        C15051ULh uLh = (C15051ULh) obj;
        if (uLh.A04 == 1 && 0qQ.A0K(this.A02, uLh.A02) && this.A03 == uLh.A03 && this.A01 == uLh.A01 && this.A00 == uLh.A00) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (1 - this.A04 != 0) {
            return super.hashCode();
        }
        return ((AnonymousClass7TF.A09(this.A03, AnonymousClass7TE.A0K(this.A02)) + this.A01) * 31) + this.A00;
    }

    public C15051ULh(List list, int i, int i2, boolean z) {
        this.A02 = list;
        this.A03 = z;
        this.A01 = i;
        this.A00 = i2;
    }

    public C15051ULh() {
        this((List) 0sn.A00, -1, -1, false);
    }
}
