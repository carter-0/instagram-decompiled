package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.model.reels.Reel;
import com.instagram.user.follow.FollowButtonBase;
import com.instagram.user.model.User;

/* renamed from: X.DfH  reason: case insensitive filesystem */
public final class C46453DfH extends C231632rz {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final Activity A03;
    public final Context A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final C46443Df5 A07;
    public final C51960G9g A08;
    public final C46432Det A09;
    public final String A0A;
    public final boolean A0B;

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        Reel reel;
        int intValue;
        Object obj3 = obj2;
        View view2 = view;
        Object obj4 = obj;
        int A032 = AnonymousClass0fD.A03(-1603948404);
        AnonymousClass7TG.A1O(view2, obj4);
        0qQ.A0B(obj3, 3);
        User user = (User) obj4;
        boolean z = this.A00;
        if (z && user.A2R()) {
            if (182.A06(0Tu.A05, this.A06, 36325673748673665L)) {
                Integer Bjj = user.Bjj();
                z = false;
                if (Bjj == null || (intValue = Bjj.intValue()) == 0 || intValue == 6) {
                    z = true;
                }
            }
        }
        if (this.A01) {
            reel = 1OP.A01(this.A06, user);
        } else {
            reel = null;
        }
        UserSession userSession = this.A06;
        if (182.A06(0Tu.A05, userSession, 36326683065726883L)) {
            Context context = this.A04;
            IgdsPeopleCell igdsPeopleCell = (IgdsPeopleCell) view2;
            AnonymousClass0iw r7 = this.A05;
            C51960G9g g9g = this.A08;
            AnonymousClass7TG.A1T(context, igdsPeopleCell, userSession);
            0qQ.A0B(user, 3);
            AnonymousClass7TG.A1R(r7, g9g);
            View inflate = LayoutInflater.from(context).inflate(R.layout.follow_button_large, igdsPeopleCell, false);
            0qQ.A0C(inflate, C273654mx.A00(50));
            FollowButtonBase followButtonBase = (FollowButtonBase) inflate;
            followButtonBase.setBaseStyle(C243923aK.MEDIUM);
            C267064at r0 = followButtonBase.A0J;
            r0.A0Q = false;
            r0.A03(r7, userSession, user);
            C47790EHb eHb = new C47790EHb(context, new C50070FNl(8, g9g, user, z), AnonymousClass05K.A01, AnonymousClass05K.A0C, 2Yu.A0B(context));
            igdsPeopleCell.A02((View.OnClickListener) null, user);
            igdsPeopleCell.A05(followButtonBase, eHb);
            FP7.A00(igdsPeopleCell, 18, g9g, user);
        } else {
            Object tag = view2.getTag();
            if (tag != null) {
                C51960G9g g9g2 = this.A08;
                Activity activity = this.A03;
                Context context2 = this.A04;
                AnonymousClass0iw r8 = this.A05;
                boolean z2 = this.A02;
                C46443Df5 df5 = this.A07;
                C46432Det det = this.A09;
                FFX.A02(activity, context2, r8, userSession, reel, user, df5, (FAU) obj3, g9g2, (F1C) tag, det, z, false, z2, this.A0B);
            } else {
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A0A(1997112206, A032);
                throw A0y;
            }
        }
        AnonymousClass0fD.A0A(-1905463056, A032);
    }

    public C46453DfH(Activity activity, Context context, AnonymousClass0iw r3, UserSession userSession, C46443Df5 df5, C51960G9g g9g, C46432Det det, String str, boolean z) {
        this.A03 = activity;
        this.A04 = context;
        this.A06 = userSession;
        this.A05 = r3;
        this.A08 = g9g;
        this.A07 = df5;
        this.A0A = str;
        this.A09 = det;
        this.A0B = z;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View A002;
        int A042 = DbX.A04(viewGroup, 1082575206);
        if (182.A06(0Tu.A05, this.A06, 36326683065726883L)) {
            A002 = new IgdsPeopleCell(AnonymousClass7TE.A0S(viewGroup), false);
        } else {
            A002 = FFX.A00(this.A04, viewGroup);
        }
        AnonymousClass0fD.A0A(-2085453976, A042);
        return A002;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
