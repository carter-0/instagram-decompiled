package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.direct.DirectShareTarget;
import java.io.IOException;
import java.io.StringWriter;

public final class RAM extends 0ng {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C327527Bd A01;
    public final /* synthetic */ DirectShareTarget A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RAM(C327527Bd r2, DirectShareTarget directShareTarget, long j) {
        super(667);
        this.A01 = r2;
        this.A02 = directShareTarget;
        this.A00 = j;
    }

    public final void run() {
        ContentValues contentValues;
        String A09;
        try {
            AnonymousClass7OV A002 = AnonymousClass7OV.A00(this.A01.A01);
            DirectShareTarget directShareTarget = this.A02;
            long j = this.A00;
            SQLiteDatabase A012 = AnonymousClass7OZ.A00().A01();
            if (A012 != null) {
                AnonymousClass0fa.A01(A012, 1671432794);
                try {
                    String str = A002.A00.A06;
                    synchronized (directShareTarget) {
                        contentValues = new ContentValues();
                        contentValues.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
                        if (directShareTarget.A08() != null) {
                            A09 = directShareTarget.A08();
                        } else {
                            A09 = directShareTarget.A09();
                        }
                        contentValues.put("target_key", A09);
                        StringWriter stringWriter = new StringWriter();
                        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
                        C330897Or.A00(A0A, directShareTarget);
                        A0A.close();
                        contentValues.put("target_info", stringWriter.toString());
                        contentValues.put("last_picked_time_ms", Long.valueOf(j));
                    }
                    AnonymousClass0fa.A00(927496240);
                    A012.insertWithOnConflict("recent_searches", (String) null, contentValues, 5);
                    AnonymousClass0fa.A00(-1135647327);
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append("delete from recent_searches where last_picked_time_ms in (select last_picked_time_ms from recent_searches where user_id = ");
                    A1A.append(str);
                    A1A.append(" order by ");
                    A1A.append("last_picked_time_ms");
                    A1A.append(" asc limit MAX(0, (select count(*) from ");
                    A1A.append("recent_searches");
                    A1A.append(" where ");
                    A1A.append(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
                    A1A.append(" = ");
                    A1A.append(str);
                    A1A.append(") - ");
                    A1A.append(50);
                    String A0l = AnonymousClass7TF.A0l("));", A1A);
                    AnonymousClass0fa.A00(-2044905883);
                    A012.execSQL(A0l);
                    AnonymousClass0fa.A00(823308306);
                    A012.setTransactionSuccessful();
                    AnonymousClass0fa.A03(A012, 493701575);
                } catch (Throwable th) {
                    AnonymousClass0fa.A03(A012, -379550960);
                    throw th;
                }
            }
        } catch (IOException e) {
            0KC.A0F(C273654mx.A00(1347), "Error inserting recent search item in database", e);
        }
    }
}
