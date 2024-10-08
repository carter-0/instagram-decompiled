package X;

import android.view.View;
import com.instagram.model.direct.DirectMessageSearchMessage;
import com.instagram.model.direct.DirectMessageSearchThread;

/* renamed from: X.OjL  reason: case insensitive filesystem */
public final class C71366OjL implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Object A05;
    public final Object A06;

    public C71366OjL(Object obj, Object obj2, int i, int i2, int i3, int i4, int i5) {
        this.A00 = i5;
        this.A05 = obj;
        this.A06 = obj2;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A04 = i4;
    }

    public final void onClick(View view) {
        int i = this.A00;
        C74448Pv3 pv3 = (C74448Pv3) this.A05;
        Object obj = this.A06;
        if (i != 0) {
            pv3.DRr((DirectMessageSearchThread) obj, this.A01, this.A02, this.A03, this.A04);
        } else {
            pv3.DRl((DirectMessageSearchMessage) obj, this.A01, this.A02, this.A03, this.A04);
        }
    }
}
