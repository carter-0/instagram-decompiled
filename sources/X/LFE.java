package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

public final class LFE {
    public final C251983oI A00;
    public final 1Vg A01;
    public final 1Vg A02;
    public final 1Vf A03;

    public final C60921Jtf A00(String str) {
        1WY A0M = JTO.A0M("SELECT * FROM suggested_users WHERE user_id = ?", 1);
        A0M.ADh(1, str);
        C251983oI r0 = this.A00;
        r0.assertNotSuspendingTransaction();
        C60921Jtf jtf = null;
        Cursor query = r0.query((AnonymousClass1WA) A0M, (CancellationSignal) null);
        try {
            int A012 = 1Wd.A01(query, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
            int A013 = 1Wd.A01(query, AnonymousClass000.A00(3340));
            int A014 = 1Wd.A01(query, AnonymousClass000.A00(3495));
            if (query.moveToFirst()) {
                String string = query.getString(A012);
                String string2 = query.getString(A013);
                0qQ.A0B(string2, 0);
                jtf = new C60921Jtf(string, query.getString(A014), 00k.A0U(00l.A0R(string2, new String[]{"␞"}, 0)));
            }
            return jtf;
        } finally {
            query.close();
            A0M.A00();
        }
    }

    public final void A01(C60921Jtf jtf) {
        C251983oI r1 = this.A00;
        r1.assertNotSuspendingTransaction();
        r1.beginTransaction();
        try {
            this.A03.insert(jtf);
            r1.setTransactionSuccessful();
        } finally {
            r1.endTransaction();
        }
    }

    public LFE(C251983oI r3) {
        this.A00 = r3;
        this.A03 = new C60720Jq9(r3, this, 5);
        this.A01 = new C60724JqD(r3, this, 12);
        this.A02 = new C60724JqD(r3, this, 13);
    }
}
