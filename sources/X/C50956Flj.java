package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.Flj  reason: case insensitive filesystem */
public final class C50956Flj implements G6O {
    public final AnonymousClass4DH A00;
    public final AnonymousClass0iw A01;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.0rm, java.lang.Object] */
    public final void Cqa(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, fragmentActivity);
        AnonymousClass4DH r5 = this.A00;
        FH4 fh4 = new FH4(r5, fragmentActivity, r5.getParentFragmentManager(), AnonymousClass07i.A00(fragmentActivity), this.A01, userSession);
        ? obj = new Object();
        obj.A00 = EVP.SINGLE;
        if (1AW.A06(0Tu.A05, 18308981726391412L)) {
            27y A002 = 27u.A00(userSession);
            CallerContext.A01("NativeScreenNavigatorFactory");
            A002.A00(new C51125Fox(userSession, fh4, obj));
            return;
        }
        fh4.A0C((EVP) obj.A00);
    }

    public C50956Flj(AnonymousClass4DH r1, AnonymousClass0iw r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
