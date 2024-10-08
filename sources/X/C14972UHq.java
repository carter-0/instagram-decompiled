package X;

import android.database.Cursor;
import java.io.Closeable;

/* renamed from: X.UHq  reason: case insensitive filesystem */
public final class C14972UHq extends C14974UHs implements Closeable {
    public final Cursor A00;

    public final void close() {
        this.A00.close();
    }

    public C14972UHq(Cursor cursor) {
        this.A00 = cursor;
    }
}
