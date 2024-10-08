package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.LinkedList;

/* renamed from: X.7Be  reason: invalid class name and case insensitive filesystem */
public final class C327537Be extends 0ng {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C327527Bd A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C327537Be(UserSession userSession, C327527Bd r3) {
        super(666);
        this.A01 = r3;
        this.A00 = userSession;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.String[], android.database.Cursor] */
    public final void run() {
        ? r9;
        try {
            AnonymousClass7OV A002 = AnonymousClass7OV.A00(this.A00);
            C327527Bd r2 = this.A01;
            LinkedList linkedList = new LinkedList();
            SQLiteDatabase A012 = AnonymousClass7OZ.A00().A01();
            if (A012 != null) {
                r9 = 0;
                Cursor query = A012.query(Pxd.A00(102), C330817Oj.A00, 002.A0g("user_id=='", A002.A00.A06, "'"), r9, r9, r9, "last_picked_time_ms DESC");
                if (query != null) {
                    if (query.moveToFirst()) {
                        do {
                            String string = query.getString(1);
                            if (string != null) {
                                linkedList.add(C330897Or.parseFromJson(16P.A00(string)));
                            }
                        } while (query.moveToNext());
                    }
                    query.close();
                }
            }
            r2.A00 = linkedList;
        } catch (IOException e) {
            0KC.A0F("RecentSearchesCache", "Error loading direct inbox recent searches from database", e);
        } catch (Throwable th) {
            if (r9 != 0) {
                r9.close();
            }
            throw th;
        }
    }
}
