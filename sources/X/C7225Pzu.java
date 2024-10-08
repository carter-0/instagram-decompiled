package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* renamed from: X.Pzu  reason: case insensitive filesystem */
public final class C7225Pzu implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass37K A01;

    public C7225Pzu(View view, AnonymousClass37K r2) {
        this.A00 = view;
        this.A01 = r2;
    }

    public final boolean onPreDraw() {
        int valueOf;
        this.A00.getViewTreeObserver().removeOnPreDrawListener(this);
        ArrayList arrayList = this.A01.A00;
        int A0A = Pxe.A0A(arrayList);
        if (A0A < 0) {
            return false;
        }
        while (true) {
            int i = A0A - 1;
            AnonymousClass37F r3 = ((AnonymousClass37L) arrayList.get(A0A)).A00;
            2cs r2 = r3.A0t;
            r2.A08(r3.A0V ? 1.0d : 0.0d, true);
            r2.A06(1.0d);
            C7218Pzn pzn = r3.A0D;
            if (pzn != null) {
                if (C7218Pzn.A0C(pzn)) {
                    pzn.A0F = AnonymousClass05K.A1I;
                    2cs r22 = pzn.A0V;
                    r22.A0A(pzn);
                    if (pzn.A0K || pzn.A0N) {
                        valueOf = Float.valueOf(C7218Pzn.A00(pzn));
                    } else {
                        valueOf = 0;
                    }
                    r22.A08(valueOf.doubleValue(), true);
                    r22.A06((double) C7218Pzn.A00(pzn));
                    int i2 = 3;
                    if (pzn.A0G) {
                        i2 = 4;
                    }
                    C7218Pzn.A09(pzn, i2);
                }
                AnonymousClass3E6 r23 = pzn.A0W;
                Context context = pzn.A0U.getContext();
                0qQ.A0C(context, "null cannot be cast to non-null type android.app.Activity");
                r23.DmJ((Activity) context);
                r23.A9Y(pzn);
                pzn.A0L = true;
            }
            if (i < 0) {
                return false;
            }
            A0A = i;
        }
    }
}
