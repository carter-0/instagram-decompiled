package X;

import android.database.Cursor;
import libraries.access.src.main.base.common.FXDeviceItem;

/* renamed from: X.9Gn  reason: invalid class name and case insensitive filesystem */
public final class C376099Gn implements C376069Gk {
    public final C368108s5 A00;

    public final F3S FHl(Cursor cursor, C368238sI r10) {
        C368238sI r7 = r10;
        0qQ.A0B(r10, 1);
        int columnIndex = cursor.getColumnIndex("uid");
        int columnIndex2 = cursor.getColumnIndex("access_token");
        if (columnIndex == -1 || columnIndex2 == -1) {
            throw new RuntimeException("Column not found.");
        }
        String string = cursor.getString(columnIndex);
        String string2 = cursor.getString(columnIndex2);
        if (string == null || string2 == null) {
            return null;
        }
        return new F3S(string, string2, "FRL", new C20577Wuu(), this.A00, r7);
    }

    public final FXDeviceItem FHm(Cursor cursor, C62447Kfx kfx, C368098s4 r4) {
        return null;
    }

    public final C376119Gp FHh(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("uid");
        int columnIndex2 = cursor.getColumnIndex("access_token");
        if (columnIndex == -1 || columnIndex2 == -1) {
            throw new RuntimeException("Column not found.");
        }
        String string = cursor.getString(columnIndex);
        String string2 = cursor.getString(columnIndex2);
        if (string == null || string2 == null) {
            return null;
        }
        return new C376119Gp(string2, new C376109Go(string, (String) null, (String) null));
    }

    public final F3S FHj(Cursor cursor, C368108s5 r4, C368238sI r5) {
        throw new RuntimeException("LiteProvider not used in Frl.");
    }

    public final C376119Gp FHk(Cursor cursor) {
        throw new RuntimeException("LiteProvider not used in Frl");
    }

    public C376099Gn(C368108s5 r1) {
        this.A00 = r1;
    }
}
