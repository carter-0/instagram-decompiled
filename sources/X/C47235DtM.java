package X;

/* renamed from: X.DtM  reason: case insensitive filesystem */
public final class C47235DtM extends AnonymousClass0T0 implements C232262tL {
    public final C61082JwK A00;
    public final boolean A01;

    public C47235DtM(C61082JwK jwK, boolean z) {
        0qQ.A0B(jwK, 1);
        this.A00 = jwK;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47235DtM) {
                C47235DtM dtM = (C47235DtM) obj;
                if (!0qQ.A0K(this.A00, dtM.A00) || this.A01 != dtM.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        String name = ((C51954G8x) this.A00.A00).getName();
        if (name == null) {
            return "";
        }
        return name;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C61082JwK jwK;
        C61082JwK jwK2;
        C51954G8x g8x;
        C47235DtM dtM = (C47235DtM) obj;
        C61082JwK jwK3 = this.A00;
        String name = ((C51954G8x) jwK3.A00).getName();
        if (dtM == null || (jwK2 = dtM.A00) == null || (g8x = (C51954G8x) jwK2.A00) == null) {
            str = null;
        } else {
            str = g8x.getName();
        }
        if (!0qQ.A0K(name, str) || dtM == null || (jwK = dtM.A00) == null || jwK3.A01 != jwK.A01 || this.A01 != dtM.A01) {
            return false;
        }
        return true;
    }
}
