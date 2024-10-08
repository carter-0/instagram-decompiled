package X;

import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import com.instagram.common.session.UserSession;
import com.instagram.reels.persistence.room.UserReelMediaDatabase;
import com.instagram.reels.persistence.room.UserReelMediaDatabase_Impl;
import com.instagram.roomdb.IgRoomDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3oZ  reason: invalid class name and case insensitive filesystem */
public final class C252103oZ {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final C252113oa A04;
    public final C252143od A05;
    public final UserReelMediaDatabase A06;
    public final Map A07 = new ConcurrentHashMap();

    public C252103oZ(UserSession userSession, int i, long j, long j2) {
        C252143od r0;
        0qQ.A0B(userSession, 1);
        this.A02 = j;
        this.A03 = j2;
        this.A00 = i;
        this.A04 = new C252113oa(userSession);
        this.A01 = i;
        C252123ob r4 = UserReelMediaDatabase.A00;
        Class<UserReelMediaDatabase> cls = UserReelMediaDatabase.class;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
        if (igRoomDatabase == null) {
            synchronized (r4) {
                igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
                if (igRoomDatabase == null) {
                    Context context = C60960kU.A00;
                    0qQ.A07(context);
                    1VA A002 = 1V9.A00(context, cls, 1V8.A00(userSession, r4));
                    1VC.A00(A002, 765, 764, true);
                    A002.A01();
                    igRoomDatabase = (IgRoomDatabase) A002.A00();
                    userSession.A04(cls, igRoomDatabase);
                }
            }
        }
        UserReelMediaDatabase userReelMediaDatabase = (UserReelMediaDatabase) igRoomDatabase;
        this.A06 = userReelMediaDatabase;
        UserReelMediaDatabase_Impl userReelMediaDatabase_Impl = (UserReelMediaDatabase_Impl) userReelMediaDatabase;
        if (userReelMediaDatabase_Impl.A00 != null) {
            r0 = userReelMediaDatabase_Impl.A00;
        } else {
            synchronized (userReelMediaDatabase_Impl) {
                if (userReelMediaDatabase_Impl.A00 == null) {
                    userReelMediaDatabase_Impl.A00 = new C252143od(userReelMediaDatabase_Impl);
                }
                r0 = userReelMediaDatabase_Impl.A00;
            }
        }
        this.A05 = r0;
        this.A07.putAll(A00());
    }

    public final HashMap A00() {
        1WY A002;
        Cursor query;
        HashMap hashMap = new HashMap();
        try {
            C252143od r8 = this.A05;
            long max = Math.max(this.A03, System.currentTimeMillis() - this.A02);
            int i = this.A01;
            TreeMap treeMap = 1WY.A08;
            A002 = 1Wa.A00("\n    SELECT id, media_ids\n    FROM user_reel_medias\n    WHERE stored_time > ?\n    ORDER BY stored_time DESC\n    LIMIT ?\n  ", 2);
            A002.ADa(1, max);
            A002.ADa(2, (long) i);
            C251983oI r1 = r8.A01;
            r1.assertNotSuspendingTransaction();
            query = r1.query((AnonymousClass1WA) A002, (CancellationSignal) null);
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new AnonymousClass9J6(query.getString(0), query.getString(1), 12));
            }
            query.close();
            A002.A00();
            arrayList.size();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AnonymousClass9J6 r0 = (AnonymousClass9J6) it.next();
                String str = r0.A00;
                String str2 = r0.A01;
                0qQ.A0B(str2, 0);
                hashMap.put(str, 00l.A0R(str2, new String[]{","}, 0));
            }
            return hashMap;
        } catch (Exception e) {
            0KC.A0F("UserReelMediasRoom", "Failed to load user reel media ids from room", e);
            0wb.A03("UserReelMediasRoom", 002.A0R("Failed to load user reel media ids from room ", e.getMessage()));
            return hashMap;
        } catch (Throwable th) {
            query.close();
            A002.A00();
            throw th;
        }
    }
}
