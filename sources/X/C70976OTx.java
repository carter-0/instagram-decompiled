package X;

import android.content.Context;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.OTx  reason: case insensitive filesystem */
public final class C70976OTx {
    public N4R A00;
    public final int A01;
    public final Context A02;
    public final UserSession A03;
    public final List A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public C70976OTx(Context context, UserSession userSession, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.A03 = userSession;
        this.A02 = context;
        this.A06 = z;
        this.A07 = z2;
        this.A09 = z3;
        this.A08 = z4;
        this.A0A = z5;
        this.A0B = z6;
        this.A0D = z7;
        this.A0C = z8;
        this.A01 = z9 ? 4 : 3;
        this.A00 = new N4R(10);
        this.A04 = AnonymousClass7TE.A1C();
        this.A05 = AnonymousClass7TE.A1C();
    }

    public static final void A00(ViewModelListUpdate viewModelListUpdate, C70976OTx oTx, C74543Pwc pwc, N40 n40) {
        C61072JwA BDn;
        if (pwc.Erk(n40)) {
            if (182.A06(0Tu.A05, oTx.A03, 36329706722836745L) && (BDn = pwc.BDn(viewModelListUpdate.A00.size())) != null) {
                oTx.A04.add(BDn);
            }
            0eP Bqn = pwc.Bqn(n40);
            C232262tL r0 = (C232262tL) Bqn.A00;
            if (r0 != null) {
                viewModelListUpdate.A00(r0);
            }
            viewModelListUpdate.A01((List) Bqn.A01);
        }
    }
}
