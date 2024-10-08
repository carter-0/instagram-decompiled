package X;

import com.facebook.messaging.lockbox.LockBoxStorageManager;
import java.util.List;

/* renamed from: X.OmB  reason: case insensitive filesystem */
public final class C71514OmB implements C74290PsI {
    public final /* synthetic */ C71087ObS A00;
    public final /* synthetic */ String A01;

    public C71514OmB(C71087ObS obS, String str) {
        this.A00 = obS;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ void run(Object obj) {
        C69563No7 no7 = (C69563No7) obj;
        if (no7 instanceof NEC) {
            byte[] bArr = ((NEC) no7).A00;
            0qQ.A0B(bArr, 0);
            List A0Q = 00l.A0Q(new String(bArr, AnonymousClass15Q.A05), new char[]{':'}, 0);
            if (A0Q.size() == 2) {
                String A19 = AnonymousClass7TE.A19(A0Q, 1);
                0qQ.A0B(A19, 1);
                this.A00.A05(A19);
                LockBoxStorageManager.INSTANCE.moveRecoveryCodeFromLegacyToLockBox(this.A01, A19);
                return;
            }
        }
        this.A00.A03();
    }
}
