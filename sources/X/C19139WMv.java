package X;

/* renamed from: X.WMv  reason: case insensitive filesystem */
public final class C19139WMv implements 2IR {
    public final C62320sa A00;
    public final 0sP A01;

    public final void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
        0sP r2 = this.A01;
        String message = th.getMessage();
        if (message == null) {
            message = AnonymousClass000.A00(953);
        }
        r2.invoke(new Exception(message));
    }

    /* renamed from: A00 */
    public final void onSuccess(AnonymousClass3JD r7) {
        Enum enumR;
        Object obj;
        C250663lr A0U;
        C250663lr A0U2;
        if (r7 == null || (A0U2 = C41845B3m.A0U(r7)) == null) {
            enumR = null;
        } else {
            enumR = A0U2.getOptionalEnumField(0, AnonymousClass000.A00(1967), C16653Uyp.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        }
        if (enumR == C16653Uyp.SUCCESS) {
            this.A00.invoke();
            return;
        }
        0sP r5 = this.A01;
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass000.A00(2492));
        if (r7 == null || (A0U = C41845B3m.A0U(r7)) == null || (obj = A0U.getOptionalEnumField(0, AnonymousClass000.A00(1967), C16653Uyp.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) == null) {
            obj = AnonymousClass000.A00(953);
        }
        String A0i = AnonymousClass7TF.A0i(obj, sb);
        0qQ.A0B(A0i, 1);
        r5.invoke(new Exception(A0i));
    }

    public C19139WMv(C62320sa r1, 0sP r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
