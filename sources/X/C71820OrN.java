package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.OrN  reason: case insensitive filesystem */
public final class C71820OrN implements 2IR {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C71820OrN(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void onFailure(Throwable th) {
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                0qQ.A0B(th, 0);
                AnonymousClass6AU r2 = (AnonymousClass6AU) this.A02;
                AnonymousClass6AQ r1 = r2.A05;
                r1.A01 = 6;
                r1.A0D.accept(6);
                0wb.A07(C273654mx.A00(1363), th);
                AnonymousClass67Z r12 = (AnonymousClass67Z) this.A01;
                r12.A02(OWK.A00);
                r12.A00();
                r2.A03.A01();
                return;
            case 1:
                0qQ.A0B(th, 0);
                str = "MEMContextApiHandleMetaProvider";
                str2 = "Cannot execute callback due to failed logging-in to MEMContext";
                break;
            default:
                0qQ.A0B(th, 0);
                str = "MEMContextApiHandleMetaProvider";
                str2 = "Cannot run callback due to failed logging-in to MEMContext";
                break;
        }
        0KC.A0F(str, str2, th);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.A00) {
            case 0:
                boolean A1a = DbX.A1a(obj);
                AnonymousClass6AU r2 = (AnonymousClass6AU) this.A02;
                AnonymousClass6AQ r1 = r2.A05;
                int i = 6;
                if (A1a) {
                    i = 5;
                }
                r1.A01 = i;
                r1.A0D.accept(Integer.valueOf(i));
                AnonymousClass67Z r12 = (AnonymousClass67Z) this.A01;
                r12.A02(OWK.A00);
                r12.A00();
                r2.A03.A01();
                return;
            case 1:
                ((C71621Oo1) this.A02).A00.execute((Runnable) this.A01);
                return;
            default:
                ((C71621Oo1) this.A02).A00.EJd((MailboxCallback) this.A01);
                return;
        }
    }
}
