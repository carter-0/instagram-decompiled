package X;

import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.Gx1  reason: case insensitive filesystem */
public final class C53957Gx1 extends C243963aQ {
    public final UserSession A00;
    public final JPJ A01;
    public final AnonymousClass33C A02;
    public final C247413gI A03;
    public final AnonymousClass4DU A04;
    public final WeakReference A05;
    public final C62320sa A06;
    public final 0sP A07;
    public final long A08;
    public final 2WX A09;

    public final C244523bK A0X(C244463bE r9) {
        0qQ.A0B(r9, 0);
        2WP r5 = new 2WP(C244013aV.A0C(r9, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size), C244013aV.A0C(r9, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size));
        AnonymousClass2WG A0f = C51969G9p.A0f(r9, C51971G9r.A0e(IJO.A00, false), C58336IqH.A00, new C66312MMv(10, r9, this));
        AnonymousClass3XV r0 = 2WX.A02;
        long j = this.A08;
        2WX A002 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A00, 0, j);
        Integer num = AnonymousClass05K.A01;
        return C51965G9l.A0W(C51973G9u.A0Z(C51973G9u.A0U(C51972G9s.A0U(AnonymousClass9JR.A00(A002, num, 0, j), num, 0), r9, 2131956634), new C58727Iwa(this, 14)).A00(this.A09), r5, A0f);
    }

    public C53957Gx1(2WX r2, UserSession userSession, JPJ jpj, AnonymousClass33C r5, C247413gI r6, AnonymousClass4DU r7, WeakReference weakReference, C62320sa r9, 0sP r10, long j) {
        C51974G9v.A1M(userSession, r7, r5);
        AnonymousClass7TF.A1G(weakReference, 5, r6);
        this.A09 = r2;
        this.A00 = userSession;
        this.A04 = r7;
        this.A02 = r5;
        this.A05 = weakReference;
        this.A08 = j;
        this.A01 = jpj;
        this.A03 = r6;
        this.A06 = r9;
        this.A07 = r10;
    }
}
