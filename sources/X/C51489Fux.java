package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;

/* renamed from: X.Fux  reason: case insensitive filesystem */
public final class C51489Fux implements Runnable {
    public final /* synthetic */ C267504bf A00;
    public final /* synthetic */ 2Aq A01;
    public final /* synthetic */ String A02;

    public final void run() {
        int i;
        Object[] objArr;
        int i2;
        String string;
        FragmentActivity fragmentActivity = null;
        try {
            fragmentActivity = 2MD.A01().A06();
        } catch (ClassCastException | IndexOutOfBoundsException unused) {
        }
        if (fragmentActivity == null) {
            FragmentActivity A002 = C71172bH.A00();
            if (!(A002 instanceof FragmentActivity) || (fragmentActivity = (Activity) A002) == null) {
                return;
            }
        }
        C267504bf r2 = this.A00;
        if (r2.B9k() != null && r2.Ava() != null) {
            int intValue = r2.B9k().intValue();
            String Ava = r2.Ava();
            UserSession userSession = this.A01.A05;
            DbZ.A0t(0, fragmentActivity, Ava, userSession);
            C358248ab A0X = DbS.A0X(fragmentActivity);
            DbU.A16(fragmentActivity, A0X, R.drawable.ig_illustrations_illo_clock_refresh);
            long j = (long) intValue;
            if (j == SandboxRepository.CACHE_TTL) {
                i = 2131963249;
                if (AnonymousClass3FV.A0A(userSession)) {
                    i = 2131963250;
                }
                objArr = new Object[]{Ava};
            } else {
                i = 2131963242;
                objArr = new Object[]{Ava, C49927FFd.A03(AnonymousClass7TF.A0A(fragmentActivity), j)};
            }
            String string2 = fragmentActivity.getString(i, objArr);
            0qQ.A0A(string2);
            A0X.A05 = string2;
            boolean A1Q = AnonymousClass7TF.A1Q((j > SandboxRepository.CACHE_TTL ? 1 : (j == SandboxRepository.CACHE_TTL ? 0 : -1)));
            if (!AnonymousClass3FV.A0A(userSession)) {
                i2 = 2131963240;
                if (A1Q) {
                    string = fragmentActivity.getString(2131963247);
                    0qQ.A0A(string);
                    A0X.A0q(string);
                    A0X.A0s(false);
                    A0X.A0E(C50016FJb.A00);
                    DbT.A1V(A0X);
                    DbX.A1T(DbV.A0c(userSession, 2B0.A01), "TIME_LIMIT_EXTENSION_RESULT_REQUEST_ID_PREFIX", this.A02, true);
                }
            } else if (A1Q) {
                i2 = 2131963248;
            } else {
                boolean A09 = 0oI.A09(fragmentActivity);
                int i3 = R.string.f0nameremoved;
                if (A09) {
                    i3 = R.string.f0nameremoved;
                }
                String string3 = fragmentActivity.getString(i3);
                0qQ.A0A(string3);
                string = DbV.A0u(fragmentActivity, string3, C49927FFd.A03(AnonymousClass7TF.A0A(fragmentActivity), j), 2131963241);
                0qQ.A07(string);
                A0X.A0q(string);
                A0X.A0s(false);
                A0X.A0E(C50016FJb.A00);
                DbT.A1V(A0X);
                DbX.A1T(DbV.A0c(userSession, 2B0.A01), "TIME_LIMIT_EXTENSION_RESULT_REQUEST_ID_PREFIX", this.A02, true);
            }
            string = fragmentActivity.getString(i2);
            0qQ.A07(string);
            A0X.A0q(string);
            A0X.A0s(false);
            A0X.A0E(C50016FJb.A00);
            DbT.A1V(A0X);
            DbX.A1T(DbV.A0c(userSession, 2B0.A01), "TIME_LIMIT_EXTENSION_RESULT_REQUEST_ID_PREFIX", this.A02, true);
        }
    }

    public C51489Fux(C267504bf r1, 2Aq r2, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
    }
}
