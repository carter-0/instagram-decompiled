package X;

import com.facebook.messaging.lockbox.LockBoxStorageManager;

/* renamed from: X.OmE  reason: case insensitive filesystem */
public final class C71517OmE implements C74290PsI {
    public final /* synthetic */ C71087ObS A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ 0rm A02;

    public C71517OmE(C71087ObS obS, String str, 0rm r3) {
        this.A00 = obS;
        this.A02 = r3;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ void run(Object obj) {
        LockBoxStorageManager lockBoxStorageManager = LockBoxStorageManager.INSTANCE;
        lockBoxStorageManager.nullableComplete(this.A00, lockBoxStorageManager.parseToLockBoxResult((String) obj, (String) this.A02.A00, this.A01));
    }
}
