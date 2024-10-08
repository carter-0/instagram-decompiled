package X;

import com.instagram.user.model.User;

/* renamed from: X.EDk  reason: case insensitive filesystem */
public final class C47701EDk extends EDI {
    public final /* synthetic */ EQE A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47701EDk(1P0 r1, EQE eqe) {
        super(r1);
        this.A00 = eqe;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1451674753);
        AnonymousClass370 r7 = (AnonymousClass370) obj;
        int A0D = AnonymousClass7TG.A0D(r7, 1090343157);
        super.onSuccess(r7);
        User A002 = C324696zk.A00(r7);
        if (A002 != null) {
            this.A00.A00.ENY(A002.A0J(), A002.getId());
        } else {
            onFail(new C268674do(r7));
        }
        AnonymousClass0fD.A0A(1582773220, A0D);
        AnonymousClass0fD.A0A(687261678, A03);
    }
}
