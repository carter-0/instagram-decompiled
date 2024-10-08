package X;

import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.Tu2  reason: case insensitive filesystem */
public final class C14324Tu2 implements C240093Jo {
    public final /* synthetic */ int A00;
    public final /* synthetic */ X46 A01;
    public final /* synthetic */ C14076TpQ A02;
    public final /* synthetic */ boolean A03;

    public final float AwJ(C238133Ar r1, float f) {
        return f;
    }

    public final boolean EsH() {
        return false;
    }

    public final boolean EsJ(C238133Ar r2) {
        0qQ.A0B(r2, 0);
        return AnonymousClass7TF.A1Q(r2.B6L());
    }

    public C14324Tu2(X46 x46, C14076TpQ tpQ, int i, boolean z) {
        this.A03 = z;
        this.A02 = tpQ;
        this.A01 = x46;
        this.A00 = i;
    }

    public final void Dtt(float f) {
        if (!this.A03) {
            C14076TpQ tpQ = this.A02;
            float f2 = tpQ.A01 - f;
            tpQ.A00 = f2;
            this.A01.DIt(f2);
            SearchEditText searchEditText = tpQ.A0F;
            if (searchEditText != null) {
                searchEditText.setEnabled(!AnonymousClass7TF.A1Q((f > ((float) this.A00) ? 1 : (f == ((float) this.A00) ? 0 : -1))));
            }
            AnonymousClass5Gv r1 = tpQ.A0E;
            if (r1 != null && r1.A09()) {
                r1.A08(true);
            }
        }
    }

    public final /* synthetic */ boolean E3Y() {
        return false;
    }

    public final /* synthetic */ boolean Es8() {
        return true;
    }

    public final boolean EsI(C238133Ar r7) {
        UserSession userSession = this.A02.A0R;
        boolean A022 = C321536uL.A02(userSession);
        if ((!this.A03 || A022) && (182.A06(0Tu.A05, userSession, 36315649294732744L) || A022)) {
            return true;
        }
        return false;
    }
}
