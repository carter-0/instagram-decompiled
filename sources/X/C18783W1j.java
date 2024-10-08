package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.W1j  reason: case insensitive filesystem */
public class C18783W1j {
    public String A00;
    public final AnonymousClass07i A01;
    public final C18068Vku A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final WeakReference A05;
    public final Set A06 = new CopyOnWriteArraySet();
    public final X8O A07;

    /* JADX WARNING: type inference failed for: r0v14, types: [X.1qK, java.lang.Object] */
    public final void A04(C249703kE r16, C17966Vj0 vj0, int i) {
        List list;
        List list2;
        View view;
        int i2;
        C249703kE r1 = r16;
        X8O x8o = this.A07;
        x8o.Dqf();
        WeakReference weakReference = this.A05;
        Context context = (Context) weakReference.get();
        if (x8o.AFd()) {
            C17966Vj0 vj02 = vj0;
            User user = vj02.A01;
            ArrayList arrayList = new ArrayList();
            arrayList.add(user.getId());
            C18068Vku vku = this.A02;
            List list3 = vku.A01;
            boolean z = !list3.contains(new C17966Vj0(user, true));
            vj02.A00 = z;
            int i3 = i;
            A02(this, i3);
            if (context != null) {
                C68031Myx myx = (C68031Myx) r1;
                if (z) {
                    view = myx.A02;
                    i2 = 2131952455;
                } else {
                    view = myx.A00;
                    i2 = 2131972140;
                }
                2eQ.A07(view, DbY.A0b(context, user, i2));
            }
            if (x8o.CYR()) {
                if (z) {
                    if (AnonymousClass7TF.A0Y(0Tu.A06, this.A04, 36595363335637121L).intValue() > list3.size()) {
                        vku.A02(user);
                    } else {
                        vj02.A00 = false;
                        if (context != null) {
                            String string = context.getString(2131962321);
                            String string2 = context.getString(2131962320);
                            if (string2 == null || 00l.A0W(string2)) {
                                C59689JTv.A07(context, 2131961740);
                            } else {
                                C310336ap A0X = DbV.A0X();
                                A0X.A0H = "feed_favorites_max_limit";
                                A0X.A0D = string;
                                A0X.A0I = string2;
                                DbY.A1N(A0X);
                            }
                        }
                    }
                } else {
                    vku.A03(user);
                }
                A01(this);
                return;
            }
            UserSession userSession = this.A04;
            AnonymousClass0iw r2 = this.A03;
            if (z) {
                list = arrayList;
                list2 = Collections.EMPTY_LIST;
            } else {
                list = Collections.EMPTY_LIST;
                list2 = arrayList;
            }
            1OC A002 = C48773Ejw.A00(r2, userSession, list, list2);
            A002.A00 = new C15601UfT(vj02, this, user, i3, 0, z);
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                1ES.A00(context2, this.A01, A002);
            }
            String A003 = C16916VAt.A00(A03(user, vku.A00(), DbU.A0K(C256393vh.A02(new C19130WMl(1), vku.A00))));
            C297555rw A004 = C297545rv.A00(userSession);
            String moduleName = r2.getModuleName();
            User user2 = user;
            String str = this.A00;
            if (z) {
                A004.A00(user2, moduleName, str, A003, (String) null);
            } else {
                A004.A01(user2, moduleName, str, A003, (String) null);
            }
            if (!182.A06(0Tu.A05, userSession, 36318312174458958L)) {
                AnonymousClass1Nd.A00(userSession).A00(new Object());
            }
        } else if (context != null) {
            C59689JTv.A08(context, 2131965089, 0);
        }
    }

    public static void A00(C18783W1j w1j) {
        Set<Reference> set = w1j.A06;
        for (Reference reference : set) {
            X7k x7k = (X7k) reference.get();
            if (x7k == null) {
                set.remove(reference);
            } else {
                x7k.Cxp();
            }
        }
    }

    public static void A01(C18783W1j w1j) {
        Set<Reference> set = w1j.A06;
        for (Reference reference : set) {
            X7k x7k = (X7k) reference.get();
            if (x7k == null) {
                set.remove(reference);
            } else {
                x7k.DNk();
            }
        }
    }

    public static void A02(C18783W1j w1j, int i) {
        Set<Reference> set = w1j.A06;
        for (Reference reference : set) {
            X7k x7k = (X7k) reference.get();
            if (x7k == null) {
                set.remove(reference);
            } else {
                x7k.DNl(i);
            }
        }
    }

    public final void A05(X7k x7k) {
        Set<Reference> set = this.A06;
        for (Reference reference : set) {
            Object obj = reference.get();
            if (obj == null || obj == x7k) {
                set.remove(reference);
            }
        }
    }

    public void A06(User user) {
        this.A07.Dqm();
        FragmentActivity fragmentActivity = (Context) this.A05.get();
        if (fragmentActivity != null) {
            UserSession userSession = this.A04;
            Fragment A002 = C46447Df9.A00(userSession, C46548Dgp.A01(userSession, user.getId(), "feed_favorites_home_user_row", this.A03.getModuleName()));
            C309516Yo A0Q = DbU.A0Q(fragmentActivity, userSession);
            A0Q.A0E(A002);
            A0Q.A04();
        }
    }

    public final void A07(List list) {
        C49905FEd fEd = FA1.A01;
        UserSession userSession = this.A04;
        fEd.A02(userSession);
        1OC A002 = C48773Ejw.A00(this.A03, userSession, C256393vh.A02(new C19130WMl(2), list), Collections.EMPTY_LIST);
        C15621Ufn.A00(A002, this, 27);
        Context context = (Context) this.A05.get();
        if (context != null) {
            1ES.A00(context, this.A01, A002);
        }
    }

    public C18783W1j(Context context, AnonymousClass07i r3, C18068Vku vku, X8O x8o, AnonymousClass0iw r6, UserSession userSession, String str) {
        this.A05 = new WeakReference(context);
        this.A04 = userSession;
        this.A01 = r3;
        this.A02 = vku;
        this.A07 = x8o;
        this.A03 = r6;
        this.A00 = str;
    }

    public final Integer A03(User user, List list, List list2) {
        if (list2.contains(user)) {
            return AnonymousClass05K.A0C;
        }
        if (!list.contains(user)) {
            return AnonymousClass05K.A00;
        }
        if (this.A07.CYR()) {
            return AnonymousClass05K.A01;
        }
        return AnonymousClass05K.A0N;
    }
}
