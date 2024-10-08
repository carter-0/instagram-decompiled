package X;

import android.os.ParcelFileDescriptor;
import java.io.File;

/* renamed from: X.Six  reason: case insensitive filesystem */
public final class C11924Six implements C13767Tgf {
    public final /* bridge */ /* synthetic */ void AI2(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }

    public final Class AvH() {
        return ParcelFileDescriptor.class;
    }

    public final /* bridge */ /* synthetic */ Object E0g(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }
}
