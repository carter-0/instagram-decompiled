package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.EAs  reason: case insensitive filesystem */
public final class C47632EAs extends C231632rz {
    public AnonymousClass0iw A00;
    public boolean A01;
    public boolean A02;
    public final Context A03;
    public final UserSession A04;
    public final AnonymousClass71G A05;
    public final Integer A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final int getIdentifier(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        return DbS.A0q(obj).hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        if (!this.A08) {
            return AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        return ((User) obj).B6o().ordinal();
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        Reel reel;
        Object obj3 = obj2;
        Object obj4 = obj;
        int A032 = AnonymousClass0fD.A03(-2048352143);
        View view2 = view;
        AnonymousClass7TG.A1O(view2, obj4);
        User user = (User) obj4;
        if (this.A02) {
            reel = 1OP.A01(this.A04, user);
        } else {
            reel = null;
        }
        Object tag = view2.getTag();
        if (tag != null) {
            UserSession userSession = this.A04;
            AnonymousClass0iw r8 = this.A00;
            0qQ.A0C(obj3, "null cannot be cast to non-null type kotlin.Int");
            boolean z = this.A0A;
            boolean z2 = this.A08;
            boolean z3 = this.A09;
            Integer num = this.A06;
            boolean z4 = this.A07;
            AnonymousClass71G r2 = this.A05;
            boolean z5 = this.A01;
            F14 f14 = new F14(r8, userSession, r2);
            f14.A00 = reel;
            f14.A08 = z;
            f14.A06 = z2;
            f14.A07 = z3;
            f14.A01 = num;
            f14.A04 = z4;
            f14.A05 = z5;
            FFY.A03(user, (F18) tag, f14, (Integer) obj3);
            AnonymousClass0fD.A0A(462718560, A032);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(370311666, A032);
        throw A0y;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        DbW.A1I(r1);
    }

    public C47632EAs(Context context, AnonymousClass0iw r3, UserSession userSession, AnonymousClass71G r5, Integer num, boolean z, boolean z2) {
        boolean A1Y = DbW.A1Y(userSession);
        this.A03 = context;
        this.A04 = userSession;
        this.A00 = r3;
        this.A05 = r5;
        this.A0A = A1Y;
        this.A08 = A1Y;
        this.A09 = z;
        this.A06 = num;
        this.A07 = z2;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A042 = DbX.A04(viewGroup, -559539791);
        ViewGroup A012 = FFY.A01(this.A03, viewGroup);
        AnonymousClass0fD.A0A(-1935236105, A042);
        return A012;
    }
}
