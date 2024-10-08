package X;

import android.database.Cursor;
import java.io.Closeable;

/* renamed from: X.UHr  reason: case insensitive filesystem */
public final class C14973UHr extends C14974UHs implements Closeable {
    public final int A00;
    public final int A01;
    public final Cursor A02;

    public final void close() {
        this.A02.close();
    }

    public C14973UHr(Cursor cursor) {
        this.A02 = cursor;
        this.A01 = cursor.getColumnIndex("local_contact_id");
        this.A00 = cursor.getColumnIndex("contact_hash");
    }
}
