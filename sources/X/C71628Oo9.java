package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxNullable;

/* renamed from: X.Oo9  reason: case insensitive filesystem */
public final class C71628Oo9 implements MailboxCallback {
    public final /* synthetic */ 0sP A00;

    public C71628Oo9(0sP r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        long j;
        Long nullableLong;
        0sP r2 = this.A00;
        C301345z0 r0 = (C301345z0) ((MailboxNullable) obj).value;
        if (r0 == null || (nullableLong = r0.mResultSet.getNullableLong(0, 0)) == null) {
            j = -1;
        } else {
            j = nullableLong.longValue();
        }
        r2.invoke(Long.valueOf(j));
    }
}
