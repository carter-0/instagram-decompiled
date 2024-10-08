package X;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.53s  reason: invalid class name and case insensitive filesystem */
public final class C2807353s extends 2Cl {
    public final /* synthetic */ AnonymousClass53r A00;
    public final /* synthetic */ HashMap A01;
    public final /* synthetic */ Set A02;

    public final int getRunnableId() {
        return 233;
    }

    public C2807353s(AnonymousClass53r r1, HashMap hashMap, Set set) {
        this.A00 = r1;
        this.A01 = hashMap;
        this.A02 = set;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        1CV r1 = this.A00.A02;
        Map map = 1CV.A09;
        return Boolean.valueOf(r1.A00.A00(r1.A03, this.A01));
    }

    public final void onFail(Exception exc) {
        0wb.A07("EncryptedSharedPrefs_apply_failed_write_to_disk", exc);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            Set set = this.A02;
            set.getClass();
            if (!set.isEmpty()) {
                AnonymousClass53r.A00(this.A00, set);
            }
        }
    }
}
