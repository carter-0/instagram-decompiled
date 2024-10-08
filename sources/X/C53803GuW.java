package X;

import android.content.Context;
import android.graphics.Color;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GuW  reason: case insensitive filesystem */
public final class C53803GuW extends C251343mx {
    public final C267324bN A00;
    public final C52058GDe A01;
    public final C59569JOp A02;
    public final JPE A03;
    public final UserSession A04;
    public final boolean A05 = true;

    public C53803GuW(JPE jpe, C267324bN r3, C52058GDe gDe, UserSession userSession, C59569JOp jOp) {
        C51972G9s.A1C(gDe, jOp);
        this.A00 = r3;
        this.A01 = gDe;
        this.A03 = jpe;
        this.A02 = jOp;
        this.A04 = userSession;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r15) {
        int A0C;
        AnonymousClass3Y5 r2 = r15;
        0qQ.A0B(r15, 0);
        C267324bN r4 = this.A00;
        1Xj r0 = r4.A02;
        if (r0 == null) {
            return new 2Tp((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, (C244343b2) null, (List) null, false);
        }
        Context A09 = C51967G9n.A09(r15);
        String dominantColor = r0.A0C.getDominantColor();
        if (dominantColor != null) {
            A0C = Color.parseColor(dominantColor);
        } else {
            A0C = 2Yu.A0C(A09);
        }
        C52058GDe gDe = this.A01;
        C58705IwE A012 = C58705IwE.A01(this, 29);
        return I3N.A00((C251263mp) null, r2, this.A03, r4, gDe, this.A04, C244013aV.A0E(r15, 2131969496), A012, 4.0f, A0C, false, false, this.A05);
    }
}
