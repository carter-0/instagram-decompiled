package X;

import com.facebook.msys.mca.MailboxNullable;

public final class PSR implements 1aV {
    public final /* synthetic */ AnonymousClass61G A00;
    public final /* synthetic */ AnonymousClass61F A01;
    public final /* synthetic */ boolean A02;

    public PSR(AnonymousClass61G r1, AnonymousClass61F r2, boolean z) {
        this.A02 = z;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C301345z0 r0;
        MailboxNullable mailboxNullable = (MailboxNullable) obj;
        if (mailboxNullable != null && ((r0 = (C301345z0) mailboxNullable.value) == null || C66580MXl.A04(r0) != 0)) {
            C3023862z r1 = (C3023862z) mailboxNullable.value;
            if (r1 != null) {
                AnonymousClass61I.A00(this.A01.A01).A03(r1);
            }
            AnonymousClass61G r02 = this.A00;
            if (r02 != null) {
                r02.A01();
            }
        } else if (!this.A02) {
            AnonymousClass61F r5 = this.A01;
            AnonymousClass61G r4 = this.A00;
            PU9.A00(AnonymousClass61I.A00(r5.A01).A00().A0N(new C3023362p(C74081Pok.A00)).A0M(new C3023462q(C74178PqK.A00(r5, 20))), r5.A00, r4, r5, 14);
        } else {
            AnonymousClass61G r03 = this.A00;
            if (r03 != null) {
                r03.A00();
            }
        }
    }
}
