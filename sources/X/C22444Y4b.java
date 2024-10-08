package X;

import java.io.File;
import java.util.Iterator;

/* renamed from: X.Y4b  reason: case insensitive filesystem */
public final class C22444Y4b implements AnonymousClass2U7 {
    public final File A00;
    public final Integer A01;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Iterator, X.Y5z] */
    public final Iterator iterator() {
        return new C22480Y5z(this);
    }

    public C22444Y4b(File file, Integer num) {
        this.A00 = file;
        this.A01 = num;
    }
}
