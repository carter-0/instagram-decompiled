package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.351  reason: invalid class name */
public final class AnonymousClass351 {
    public Runnable A00;
    public final Activity A01;
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final UserSession A03;
    public final C2365134a A04;
    public final C2365334c A05;
    public final C2365934i A06;
    public final String A07;

    private AnonymousClass3N2 A00() {
        C249703kE A0X;
        C2365934i r5 = this.A06;
        C2365834h r1 = (C2365834h) r5;
        int A042 = r1.A04();
        int i = A042;
        if ((r5 instanceof C2365834h) && r1.A04()) {
            A042--;
        }
        RecyclerView recyclerView = this.A05.A03;
        if (recyclerView == null) {
            A0X = null;
        } else {
            A0X = recyclerView.A0X(i, false);
        }
        AnonymousClass3N2 r3 = (AnonymousClass3N2) A0X;
        List list = r5.A04;
        if (!list.isEmpty()) {
            User A012 = AnonymousClass0t1.A01.A01(this.A03);
            1Ns r0 = ((AnonymousClass3BT) list.get(A042)).A03.A0W;
            r0.getClass();
            if (!A012.equals(r0.CCd()) || r3 == null) {
                return null;
            }
            return r3;
        }
        return null;
    }

    public static AnonymousClass3N2 A01(AnonymousClass351 r4, List list) {
        C2365934i r3 = r4.A06;
        if (r4.A05.A0C.A03(list).contains(r3.Bkf(((C2365834h) r3).A04() ? 1 : 0))) {
            return r4.A00();
        }
        return null;
    }

    public static void A02(AnonymousClass351 r10, List list) {
        C2365334c r8 = r10.A05;
        C2365834h r6 = r8.A0C;
        Iterator it = r6.A03(list).iterator();
        while (it.hasNext()) {
            it.next();
            AnonymousClass3N2 A002 = r10.A00();
            if (A002 != null) {
                boolean A042 = ((C2365834h) r10.A06).A04();
                C48781Ek4.A00(A002.AeH()).A00(4.0f);
                Reel A012 = r8.A01(A002.Bkc());
                A012.getClass();
                C49101EpQ.A00(r10.A03, A012, A002, 0);
                C249703kE r5 = (C249703kE) A002;
                0qQ.A0B(r5, 0);
                r6.bindViewHolder(r5, A042 ? 1 : 0);
            }
        }
    }

    public AnonymousClass351(Activity activity, UserSession userSession, C2365134a r5, C2365334c r6, String str) {
        this.A01 = activity;
        this.A03 = userSession;
        this.A06 = r6.A0C;
        this.A05 = r6;
        this.A04 = r5;
        this.A07 = str;
    }
}
