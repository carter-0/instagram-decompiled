package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.jobscheduler.bgfetch.IgBgFetchJob;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IxY  reason: case insensitive filesystem */
public final class C58787IxY extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58787IxY(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        super(1);
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A04 = obj2;
        this.A05 = obj3;
        this.A03 = obj4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        switch (this.A00) {
            case 1:
                JPA jpa = (JPA) obj;
                0qQ.A0B(jpa, 0);
                0sP r10 = (0sP) this.A05;
                C53299Gll gll = (C53299Gll) this.A03;
                LRW lrw = (LRW) this.A02;
                int i = this.A01;
                int i2 = 0;
                for (Object next : (List) this.A04) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    C53325GmB gmB = (C53325GmB) next;
                    jpa.Cf6(C56474Hz6.A01, gmB.A00.A03(), (Object) null, AnonymousClass5PI.A03(new C59373JGz(gmB, gll, lrw, r10, i2, i), 1870628030));
                    i2 = i3;
                }
                break;
            case 2:
                View view = (View) obj;
                0qQ.A0B(view, 0);
                Object tag = view.getTag();
                0qQ.A0C(tag, AnonymousClass000.A00(720));
                0qQ.A07(view.getContext());
                UserSession userSession = (UserSession) C51966G9m.A18(this.A05);
                AnonymousClass3BT r2 = (AnonymousClass3BT) DbT.A0r(this.A04);
                int i4 = this.A01;
                C64173LSa.A03(userSession, r2, (C60704Jpp) tag, (C230242pG) this.A03, C51966G9m.A1F(C51966G9m.A18(this.A02)), 0sn.A00, i4, false, false);
                break;
            case 3:
                View view2 = (View) obj;
                0qQ.A0B(view2, 0);
                Object tag2 = view2.getTag();
                0qQ.A0C(tag2, "null cannot be cast to non-null type com.instagram.reels.ui.views.ReelItemViewBinder.Holder");
                Context A0S = AnonymousClass7TE.A0S(view2);
                UserSession userSession2 = (UserSession) C51966G9m.A18(this.A05);
                AnonymousClass3BT r4 = (AnonymousClass3BT) DbT.A0r(this.A04);
                int i5 = this.A01;
                0sn r8 = 0sn.A00;
                AnonymousClass3Mc.A01(A0S, (AnonymousClass0iw) C51966G9m.A18(this.A02), userSession2, r4, (AnonymousClass3BT) null, (AnonymousClass3N1) tag2, (C230242pG) this.A03, r8, i5, false, true, false, true);
                break;
            case 4:
                return new C55864Hol(C51968G9o.A0J(obj), (JQG) this.A02, (AnonymousClass3V2) this.A03, (1Xj) this.A04, (AnonymousClass3W1) this.A05, this.A01);
            case 5:
                boolean A1a = AnonymousClass7TE.A1a(obj);
                Dialog dialog = (Dialog) this.A03;
                if (dialog != null) {
                    dialog.dismiss();
                }
                C246323eP r3 = (C246323eP) this.A05;
                if (r3.A00.mView != null) {
                    C246323eP.A00(r3, (1Xj) this.A02, (AnonymousClass3W1) this.A04, this.A01, A1a);
                    break;
                }
                break;
            case 6:
                View view3 = (View) obj;
                0qQ.A0B(view3, 0);
                C55728HmP hmP = (C55728HmP) this.A05;
                C238833Dp.A00(hmP.A00).A0B(view3, new String[0]);
                User user = (User) this.A04;
                if (user != null) {
                    int i6 = this.A01;
                    hmP.A01.D2C((1Xj) this.A02, (AnonymousClass3W1) this.A03, user, i6);
                    break;
                }
                break;
            case 7:
                List list = (List) obj;
                0qQ.A0B(list, 0);
                IgBgFetchJob igBgFetchJob = (IgBgFetchJob) this.A03;
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (AnonymousClass7TE.A0R(obj2) >= igBgFetchJob.A01) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Number number = (Number) obj2;
                if (number != null) {
                    List<IgBgFetchJob> list2 = (List) this.A04;
                    int i7 = this.A01;
                    ArrayList A0r = AnonymousClass7TG.A0r(list2);
                    for (IgBgFetchJob igBgFetchJob2 : list2) {
                        int i8 = igBgFetchJob2.A00;
                        if (i8 == i7) {
                            igBgFetchJob2 = new IgBgFetchJob(i8, number.longValue());
                        }
                        A0r.add(igBgFetchJob2);
                    }
                    C51965G9l.A1W(this.A02, A0r);
                    break;
                } else {
                    ((0sP) this.A02).invoke(this.A04);
                    break;
                }
            default:
                int action = C51968G9o.A0a(obj).A00.getAction();
                if (action == 0) {
                    ((Drawable) this.A02).setTint(this.A01);
                } else if (action == 1) {
                    ((Drawable) this.A02).setTint(C244013aV.A02((AnonymousClass3Y5) this.A04, R.color.fds_transparent));
                    C53760Gtp gtp = (C53760Gtp) this.A05;
                    gtp.A00.A00((AnonymousClass4UC) this.A03, gtp.A01);
                }
                return true;
        }
        return C60340gF.A00;
    }
}
