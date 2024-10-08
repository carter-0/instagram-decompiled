package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.GBv  reason: case insensitive filesystem */
public final class C52024GBv implements C313476gV {
    public int A00 = -1;
    public int A01 = -1;
    public 1Xj A02;
    public C57467IbB A03;
    public List A04 = AnonymousClass7TE.A1C();
    public final Context A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;

    private final void A00() {
        C54507HGt hGt;
        IgImageView BGD;
        C14044Tol tol;
        C57467IbB ibB = this.A03;
        if (!(ibB == null || (tol = ibB.A01) == null)) {
            tol.A0A("paused_for_replay");
        }
        C57467IbB ibB2 = this.A03;
        if (!(ibB2 == null || (hGt = ibB2.A00) == null || (BGD = hGt.A02.BGD()) == null)) {
            BGD.startAnimation(ibB2.A02);
        }
        this.A00 = (this.A00 + 1) % this.A04.size();
        A01(this);
    }

    public static final void A01(C52024GBv gBv) {
        C57467IbB ibB;
        int i = gBv.A00;
        String str = null;
        String A0u = C51969G9p.A0u(gBv.A02);
        C54507HGt hGt = (C54507HGt) 00k.A0O(gBv.A04, i);
        if (hGt != null) {
            str = hGt.A00.getId();
        }
        if (0qQ.A0K(A0u, str)) {
            C57467IbB ibB2 = gBv.A03;
            if (ibB2 != null) {
                ibB2.A03(true, false);
                return;
            }
            return;
        }
        C54507HGt hGt2 = (C54507HGt) 00k.A0O(gBv.A04, gBv.A00);
        if (hGt2 != null) {
            if (!C51969G9p.A1Z(hGt2.A00, C51969G9p.A0u(gBv.A02)) && (ibB = gBv.A03) != null) {
                ibB.A02(hGt2, false);
            }
            gBv.A01 = gBv.A00;
        }
    }

    public final void Dxv(1Xj r6) {
        if (r6 != null) {
            this.A02 = r6;
            if (this.A00 != -1) {
                int i = this.A01;
                String str = null;
                String id = r6.getId();
                C54507HGt hGt = (C54507HGt) 00k.A0O(this.A04, i);
                if (hGt != null) {
                    str = hGt.A00.getId();
                }
                if (0qQ.A0K(id, str)) {
                    this.A00 = this.A01;
                    A01(this);
                    this.A01 = -1;
                }
            }
        }
    }

    public final void onProgressUpdate(int i, int i2, boolean z) {
        if (i > Math.min(3000, i2)) {
            A00();
        }
    }

    public C52024GBv(Context context, AnonymousClass0iw r3, UserSession userSession) {
        this.A05 = context;
        this.A07 = userSession;
        this.A06 = r3;
    }

    public final void onCompletion() {
        A00();
    }
}
