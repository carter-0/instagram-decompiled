package X;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* renamed from: X.5Fo  reason: invalid class name and case insensitive filesystem */
public final class C282995Fo implements C283005Fp {
    public final AnonymousClass39L A00;
    public final C2377438z A01;
    public final AnonymousClass38N A02;

    static {
        AnonymousClass389.A01("WMFgUpdater");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.39x, java.lang.Object] */
    public final C2379539x EX9(Context context, C7325Q4b q4b, UUID uuid) {
        ? obj = new Object();
        this.A02.ATP(new C7328Q4e(context, q4b, this, obj, uuid));
        return obj;
    }

    public C282995Fo(WorkDatabase workDatabase, AnonymousClass39L r3, AnonymousClass38N r4) {
        this.A00 = r3;
        this.A02 = r4;
        this.A01 = workDatabase.A05();
    }
}
