package X;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicReference;

public final class QQS extends SJG {
    public final C10548Ru2 A00;
    public final Handler A01 = AnonymousClass7TF.A0D();
    public final C10215RoW A02;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.1Tr, java.lang.Object] */
    public QQS(Context context, C10806RyS ryS) {
        super(context, ryS, "neon_android_store");
        Context context2 = ryS.A02.A00;
        AtomicReference atomicReference = C9939Rjs.A00.A00;
        Object obj = atomicReference.get();
        if (obj == null) {
            context2 = !(context2 instanceof Application) ? context2.getApplicationContext() : context2;
            0qQ.A0B(context2, 0);
            C12174SoP soP = C12174SoP.A00;
            ? obj2 = new Object();
            obj2.A00 = soP;
            obj = new C10548Ru2(new C10738RxH(context2.getContentResolver(), context2, obj2, new AnonymousClass1SF(context2, context2.getPackageManager())));
            if (!1FH.A00((Object) null, obj, atomicReference)) {
                obj = atomicReference.get();
                obj.getClass();
            }
        }
        this.A00 = (C10548Ru2) obj;
        this.A02 = new C10215RoW(this);
    }
}
