package X;

import android.view.View;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.FbU  reason: case insensitive filesystem */
public final class C50421FbU implements G8F {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C47816EIn A01;

    public final boolean Cdh(DirectShareTarget directShareTarget) {
        return false;
    }

    public final void Dbk(View view, DirectShareTarget directShareTarget, int i, int i2, int i3) {
    }

    public final boolean Dbl(DirectShareTarget directShareTarget, int i, int i2, int i3) {
        0qQ.A0B(directShareTarget, 0);
        return this.A01.A0J(directShareTarget, i, i2, i3, this.A00);
    }

    public final boolean Dbo(DirectShareTarget directShareTarget) {
        return false;
    }

    public final /* synthetic */ void Dbs(View view) {
    }

    public final /* synthetic */ void Dbt() {
    }

    public C50421FbU(C47816EIn eIn, int i) {
        this.A01 = eIn;
        this.A00 = i;
    }

    public final boolean CbW(DirectShareTarget directShareTarget) {
        return this.A01.A0E.contains(directShareTarget);
    }

    public final void D8y(DirectShareTarget directShareTarget) {
        this.A01.A0B.D8y(directShareTarget);
    }

    public final boolean Es2(DirectShareTarget directShareTarget) {
        C47816EIn eIn = this.A01;
        G9Z g9z = eIn.A0B;
        if ((g9z.CKT() || g9z.Es3(eIn.A01, directShareTarget)) && !eIn.A0E.contains(directShareTarget)) {
            return true;
        }
        return false;
    }
}
