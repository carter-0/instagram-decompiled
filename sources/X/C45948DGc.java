package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.DGc  reason: case insensitive filesystem */
public final class C45948DGc implements 2IR {
    public boolean A00;

    /* renamed from: A00 */
    public final void onSuccess(AnonymousClass3JD r7) {
        Object Bny;
        C250663lr reinterpretIfFulfillsType;
        C250663lr optionalTreeField;
        if (r7 != null && (Bny = r7.Bny()) != null) {
            C250663lr r3 = (C250663lr) Bny;
            if (r3 != null) {
                ImmutableList A06 = r3.A06(Bp8.class, "fx_accounts", -720229042);
                0qQ.A07(A06);
                C249803kO it = A06.iterator();
                while (it.hasNext()) {
                    C250663lr A0V = C41845B3m.A0V(it);
                    if (A0V != null && (reinterpretIfFulfillsType = A0V.reinterpretIfFulfillsType(0, "XFBFXFBAccountInfo", Bp7.class, 1627498225)) != null && (optionalTreeField = reinterpretIfFulfillsType.getOptionalTreeField(0, AnonymousClass000.A00(749), Bp6.class, 568506791)) != null && optionalTreeField.hasFieldValue("is_silhouette")) {
                        this.A00 = optionalTreeField.getCoercedBooleanField(0, "is_silhouette");
                        return;
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final void onFailure(Throwable th) {
        0KC.A0C(AnonymousClass000.A00(2101), "Unable to fetch avatar info");
    }
}
