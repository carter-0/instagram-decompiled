package X;

import android.content.Context;

/* renamed from: X.TOq  reason: case insensitive filesystem */
public final class C13184TOq implements AnonymousClass0eK {
    public final AnonymousClass0eK A00;

    public final /* bridge */ /* synthetic */ Object get() {
        String packageName = ((Context) this.A00.get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw AnonymousClass7TE.A11("Cannot return null from a non-@Nullable @Provides method");
    }

    public C13184TOq(AnonymousClass0eK r1) {
        this.A00 = r1;
    }
}
