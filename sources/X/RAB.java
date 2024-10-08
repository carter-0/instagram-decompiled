package X;

import android.database.sqlite.SQLiteDatabase;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

public final class RAB extends 0ng {
    public final /* synthetic */ C327527Bd A00;
    public final /* synthetic */ DirectShareTarget A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RAB(C327527Bd r2, DirectShareTarget directShareTarget) {
        super(675);
        this.A00 = r2;
        this.A01 = directShareTarget;
    }

    public final void run() {
        String A09;
        AnonymousClass7OV A002 = AnonymousClass7OV.A00(this.A00.A01);
        DirectShareTarget directShareTarget = this.A01;
        SQLiteDatabase A012 = AnonymousClass7OZ.A00().A01();
        if (A012 != null) {
            AnonymousClass0fa.A01(A012, 970974333);
            try {
                UserSession userSession = A002.A00;
                String str = userSession.A06;
                if (!182.A06(0Tu.A05, userSession, 36320416708764047L) || directShareTarget.A08() == null) {
                    A09 = directShareTarget.A09();
                } else {
                    A09 = directShareTarget.A08();
                }
                A012.delete("recent_searches", 002.A15("user_id=='", str, "' AND ", "target_key", "=='", A09, "'"), (String[]) null);
                A012.setTransactionSuccessful();
            } finally {
                AnonymousClass0fa.A03(A012, -1151299138);
            }
        }
    }
}
