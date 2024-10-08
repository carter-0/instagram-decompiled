package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.F3u  reason: case insensitive filesystem */
public final class C49729F3u {
    public Context A00;
    public UserSession A01;
    public G84 A02;
    public FBR A03;
    public C49916FEq A04;
    public List A05;
    public Map A06 = AnonymousClass7TE.A1H();
    public boolean A07;
    public final C50418FbR A08 = new C50418FbR(this);
    public final AnonymousClass0eM A09 = Dbl.A00(this, 3);
    public final AnonymousClass0eM A0A = Dbl.A00(this, 4);

    public final List A01(List list) {
        String str;
        boolean z;
        int i;
        ArrayList<C74527PwM> A0q = AnonymousClass7TF.A0q(list, 0);
        for (Object next : list) {
            C74527PwM pwM = (C74527PwM) next;
            0sn r1 = this.A05;
            if (r1 == null) {
                r1 = 0sn.A00;
            }
            if (!r1.contains(((C61103JxE) pwM).A00.getId())) {
                A0q.add(next);
            }
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A0q);
        for (C74527PwM pwM2 : A0q) {
            Map map = this.A06;
            C61103JxE jxE = (C61103JxE) pwM2;
            User user = jxE.A00;
            boolean containsKey = map.containsKey(user.getUsername());
            if (!this.A07) {
                Context context = this.A00;
                if (context == null) {
                    0qQ.A0F("context");
                    throw AnonymousClass00P.createAndThrow();
                }
                str = DbW.A0h(context, jxE.A02, 2131976314);
            } else {
                str = "";
            }
            0qQ.A0A(str);
            boolean z2 = !this.A07;
            if (!containsKey) {
                List list2 = this.A05;
                if (list2 == null || (i = DbT.A02(list2, 1)) < 0) {
                    i = 0;
                }
                if (i + this.A06.size() >= DbX.A07(this.A09)) {
                    z = false;
                    A0r.add(new FYI(user, str, z2, containsKey, z));
                }
            }
            z = true;
            A0r.add(new FYI(user, str, z2, containsKey, z));
        }
        return A0r;
    }

    public final void A06(Map map, boolean z) {
        String str;
        0qQ.A0B(map, 0);
        this.A06 = map;
        C49916FEq fEq = this.A04;
        if (fEq == null) {
            str = "recipientsBarController";
        } else {
            Collection values = map.values();
            ArrayList A0r = AnonymousClass7TG.A0r(values);
            Iterator it = values.iterator();
            while (it.hasNext()) {
                A0r.add(new DirectShareTarget(DbT.A0k(it)));
            }
            fEq.A01(A0r, z);
            G84 g84 = this.A02;
            if (g84 == null) {
                str = "delegate";
            } else {
                g84.Dbu();
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final C47253Dte A00(String str, int i) {
        if (str == null) {
            Context context = this.A00;
            if (context == null) {
                0qQ.A0F("context");
                throw AnonymousClass00P.createAndThrow();
            }
            str = AnonymousClass7TF.A0d(context.getResources(), 2131975969);
        }
        if (i <= 0) {
            return new C47253Dte((View.OnClickListener) null, new C52255GKw(str), (C266444Yx) null);
        }
        return new C47253Dte(FPI.A00(this, 3), new C52255GKw(str), DbS.A0Q(AnonymousClass7TF.A1b(i), 2131957114));
    }

    public final void A02() {
        C49916FEq fEq = this.A04;
        if (fEq == null) {
            0qQ.A0F("recipientsBarController");
        } else {
            ViewGroup viewGroup = fEq.A00;
            if (viewGroup == null) {
                Object obj = null;
                obj.getClass();
            } else {
                viewGroup.setVisibility(0);
                G8J g8j = fEq.A02;
                if (g8j != null) {
                    g8j.DzK();
                    return;
                }
                return;
            }
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A03(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        Context context = this.A00;
        if (context == null) {
            0qQ.A0F("context");
            throw AnonymousClass00P.createAndThrow();
        }
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A09(2131960798);
        A0Y.A08(2131957109);
        A0Y.A0K(onClickListener, 2131960790);
        DbX.A16(onClickListener2, A0Y);
    }

    public final void A04(Fragment fragment, Boolean bool, Integer num, String str, String str2) {
        int seconds;
        boolean z;
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        Integer num2 = num;
        if (num != null) {
            seconds = num2.intValue();
        } else {
            seconds = (int) TimeUnit.DAYS.toSeconds(1);
        }
        Boolean bool2 = bool;
        if (bool != null) {
            z = bool2.booleanValue();
        } else {
            z = false;
        }
        Collection values = this.A06.values();
        ArrayList A0r = AnonymousClass7TG.A0r(values);
        Iterator it = values.iterator();
        while (it.hasNext()) {
            DbY.A1W(A0r, it);
        }
        C50373FaY faY = new C50373FaY(fragment, this, bool2, num2, str, A0r, seconds);
        UserSession userSession = this.A01;
        if (userSession != null) {
            if (!182.A06(0Tu.A06, userSession, 36320309334515934L)) {
                UserSession userSession2 = this.A01;
                if (userSession2 != null) {
                    if (182.A06(0Tu.A05, userSession2, 36320309334384860L)) {
                        A0r = 0sn.A00;
                    }
                }
            }
            UserSession userSession3 = this.A01;
            if (userSession3 != null) {
                String A0s = DbV.A0s();
                0qQ.A0B(A0r, 3);
                1OC A022 = DirectThreadApi.A02(userSession3, (Boolean) null, A0s, str3, A0r, seconds, z);
                A022.A00 = new C47371Dwh(userSession3, faY, 0);
                1ES.A03(A022);
                return;
            }
        }
        0qQ.A0F("userSession");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A05(Fragment fragment, String str) {
        boolean A1Z = AnonymousClass7TG.A1Z(fragment, str);
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            UserSession userSession = this.A01;
            if (userSession == null) {
                DbS.A17();
                throw AnonymousClass00P.createAndThrow();
            }
            1pE A012 = 1pE.A01(activity, (AnonymousClass0iw) fragment, userSession, "creator_subscriber_chat_new_thread");
            DbZ.A1Z(A012, str);
            A012.A0q = A1Z;
            A012.A01 = fragment;
            A012.A0v = A1Z;
            C50399Fb7.A00(A012, activity, A1Z ? 1 : 0);
            C50337FYu fYu = (C50337FYu) this.A0A.getValue();
            C50337FYu.A01(C48147EZp.CHAT_VIEW, C48146EZo.CREATE_SUBSCRIBER_CHAT, fYu, "thread_create_successful", "view", AnonymousClass7TF.A0w(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str));
            fYu.A00 = null;
        }
    }
}
