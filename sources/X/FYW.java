package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.modal.TransparentModalActivity;

public abstract class FYW implements AnonymousClass0lh {
    public C51911G7f A00;

    public String A00() {
        int i;
        if (this instanceof ENZ) {
            i = 3697;
        } else {
            i = 3011;
        }
        return AnonymousClass000.A00(i);
    }

    public void A01() {
        1Av A002;
        boolean z;
        0s0 r2;
        AnonymousClass0YZ[] r1;
        int i;
        if (this instanceof ENZ) {
            ENZ enz = (ENZ) this;
            if (!enz.A00) {
                boolean z2 = enz.A01;
                A002 = 1Au.A00(enz.A03);
                z = true;
                if (z2) {
                    r2 = A002.A4N;
                    r1 = 1Av.A8a;
                    i = 87;
                } else {
                    r2 = A002.A4O;
                    r1 = 1Av.A8a;
                    i = 88;
                }
            } else {
                A002 = 1Au.A00(enz.A03);
                z = true;
                r2 = A002.A4M;
                r1 = 1Av.A8a;
                i = 89;
            }
            AnonymousClass7TF.A1J(A002, r2, r1, i, z);
        }
    }

    public boolean A03() {
        0s0 r2;
        AnonymousClass0YZ[] r1;
        int i;
        1Av A002;
        0s0 r22;
        AnonymousClass0YZ[] r12;
        int i2;
        if (this instanceof ENZ) {
            ENZ enz = (ENZ) this;
            if (!enz.A02) {
                if (!enz.A00) {
                    boolean z = enz.A01;
                    A002 = 1Au.A00(enz.A03);
                    if (z) {
                        r22 = A002.A4N;
                        r12 = 1Av.A8a;
                        i2 = 87;
                    } else {
                        r22 = A002.A4O;
                        r12 = 1Av.A8a;
                        i2 = 88;
                    }
                } else {
                    A002 = 1Au.A00(enz.A03);
                    r22 = A002.A4M;
                    r12 = 1Av.A8a;
                    i2 = 89;
                }
                if (!AnonymousClass7TG.A1a(A002, r22, r12, i2)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        ENY eny = (ENY) this;
        boolean z2 = eny.A00;
        1Av A003 = 1Au.A00(eny.A01);
        if (z2) {
            r2 = A003.A2t;
            r1 = 1Av.A8a;
            i = 424;
        } else {
            r2 = A003.A2r;
            r1 = 1Av.A8a;
            i = 423;
        }
        if (!AnonymousClass7TG.A1a(A003, r2, r1, i)) {
            return true;
        }
        return false;
    }

    public final void onSessionWillEnd() {
        if (this instanceof ENZ) {
            ((ENZ) this).A03.A03(ENZ.class);
        }
    }

    public final void A02(Context context, Bundle bundle) {
        if (!A03()) {
            C51911G7f g7f = this.A00;
            if (g7f != null) {
                g7f.Dvq();
                return;
            }
            return;
        }
        if (bundle == null) {
            bundle = AnonymousClass7TE.A0a();
        }
        bundle.putString("bottom_sheet_content_fragment", A00());
        AnonymousClass6W8.A06(context, bundle, TransparentModalActivity.class, "bottom_sheet");
        A01();
    }
}
