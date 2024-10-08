package X;

import com.facebook.stash.core.FileStash;
import java.io.File;

/* renamed from: X.9DM  reason: invalid class name */
public final class AnonymousClass9DM implements AnonymousClass9DN {
    public static volatile AnonymousClass9DM A01;
    public final FileStash A00 = 1L7.A01().A05(538797458);

    public final File Bnd(String str) {
        return this.A00.getFile(str);
    }

    public final File CNS(String str) {
        return this.A00.insertFile(str);
    }

    public final boolean remove(String str) {
        return this.A00.remove(str);
    }
}
