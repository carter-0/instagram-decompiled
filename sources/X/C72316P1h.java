package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.P1h  reason: case insensitive filesystem */
public final class C72316P1h implements C74543Pwc {
    public final Context A00;
    public final UserSession A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final 0eP Bqn(N40 n40) {
        ArrayList A0q = AnonymousClass7TF.A0q(n40, 0);
        if (this.A06) {
            if (this.A02 && this.A07) {
                A0q.add(NPR.A01);
            }
            if (AnonymousClass7TF.A1W(n40.A00, AnonymousClass05K.A00)) {
                if (this.A04) {
                    if (182.A06(0Tu.A05, this.A01, 36322048796141484L)) {
                        A0q.add(NPS.A01);
                    }
                }
                if (n40.A07) {
                    A0q.add(NPQ.A01);
                }
                if (n40.A0A) {
                    A0q.add(NPU.A01);
                }
                if (n40.A09) {
                    A0q.add(NPT.A01);
                }
            }
        }
        if (this.A03 && AnonymousClass7TF.A1W(n40.A00, AnonymousClass05K.A00)) {
            A0q.add(NPN.A00);
        }
        if (this.A05 && AnonymousClass7TF.A1W(n40.A00, AnonymousClass05K.A00)) {
            A0q.add(NPO.A00);
        }
        return AnonymousClass7TE.A1L((Object) null, A0q);
    }

    public final boolean Erk(N40 n40) {
        return true;
    }

    public final C61072JwA BDn(int i) {
        return C66584MXp.A0G(AnonymousClass05K.A01, AnonymousClass05K.A0N, this.A00.getString(2131960276), R.drawable.instagram_add_pano_outline_24, i);
    }

    public C72316P1h(Context context, UserSession userSession, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A00 = context;
        this.A01 = userSession;
        this.A06 = z;
        this.A02 = z2;
        this.A07 = z3;
        this.A04 = z4;
        this.A03 = z5;
        this.A05 = z6;
    }
}
