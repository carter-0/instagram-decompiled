package X;

import com.facebook.msys.mca.StandaloneDatabaseHandle;

/* renamed from: X.Onz  reason: case insensitive filesystem */
public final class C71619Onz implements AnonymousClass68J {
    public final AnonymousClass68L A00;

    public final AnonymousClass68L ASa(int i) {
        if (i == 3) {
            return this.A00;
        }
        throw AnonymousClass7TE.A0w(002.A0c(C273654mx.A00(1300), " is not supported by StandaloneDatabaseMailboxApiHandleMetaProvider.", i));
    }

    public C71619Onz(StandaloneDatabaseHandle standaloneDatabaseHandle) {
        this.A00 = new C67357MmZ(standaloneDatabaseHandle, this);
    }
}
