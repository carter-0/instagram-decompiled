package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.LimitedInteractionsVersions;
import com.instagram.common.session.UserSession;
import java.util.UUID;

/* renamed from: X.921  reason: invalid class name */
public final class AnonymousClass921 {
    public LimitedInteractionsVersions A00 = LimitedInteractionsVersions.V1;
    public final Context A01;
    public final FragmentActivity A02;
    public final AnonymousClass0iw A03;
    public final 1P0 A04 = new AnonymousClass923(this);
    public final UserSession A05;
    public final AnonymousClass924 A06 = new AnonymousClass924(this);
    public final AnonymousClass925 A07 = new AnonymousClass925(this);
    public final AnonymousClass926 A08 = new AnonymousClass926(this);
    public final String A09;

    public AnonymousClass921(Context context, FragmentActivity fragmentActivity, AnonymousClass0iw r4, UserSession userSession) {
        this.A05 = userSession;
        this.A01 = context;
        this.A03 = r4;
        this.A02 = fragmentActivity;
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        this.A09 = obj;
    }
}
