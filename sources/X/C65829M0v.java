package X;

import android.content.Context;
import android.graphics.Point;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filter.VideoFilter;
import java.io.IOException;

/* renamed from: X.M0v  reason: case insensitive filesystem */
public final class C65829M0v implements C13830Ti1 {
    public int A00;
    public final float A01;
    public final Context A02;
    public final UserSession A03;
    public final 1Xj A04;
    public final String A05;

    public C65829M0v(Context context, UserSession userSession, 1Xj r4, String str, float f) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = r4;
        this.A02 = context;
        this.A01 = f;
        this.A05 = str;
    }

    public final void CN7(AnonymousClass9R7 r6, int i) {
        0qQ.A0B(r6, 0);
        this.A00 = C229632nm.A03(-1, 0, (int) this.A04.A1B());
        VideoFilter A002 = AnonymousClass9SY.A00(this.A02, this.A03);
        A002.A0F = true;
        A002.A02(new C14269Tss());
        throw AnonymousClass7TE.A1B(AnonymousClass000.A00(1058));
    }

    public final void E3K(AnonymousClass9R7 r1) {
    }

    public final boolean ETu(Q0Z q0z) {
        0qQ.A0B(q0z, 0);
        try {
            q0z.ETt(this.A05);
            return true;
        } catch (IOException e) {
            0KC.A0M(Pxd.A00(166), "Exception when preparing codec: %s", e, new Object[]{e.getMessage()});
            return false;
        }
    }

    public final void Enx(AnonymousClass9RG r5) {
        0qQ.A0B(r5, 0);
        Point C4P = C4P();
        r5.A08.offer(new M9F(r5, C4P.x, C4P.y));
    }

    public final int Byl() {
        return this.A00;
    }

    public final Point C4P() {
        int A0y;
        Context context = this.A02;
        float f = this.A01;
        1Xj r1 = this.A04;
        C255573uM r0 = r1.CEL().A0A;
        if (r0 != null) {
            A0y = r0.A03;
        } else {
            A0y = r1.A0y();
        }
        return AEW.A01(context, this.A03, f, A0y);
    }
}
