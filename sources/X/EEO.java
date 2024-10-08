package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class EEO extends C252233om implements AnonymousClass4D6, C337237fw, G8F, G99, AbsListView.OnScrollListener {
    public C49916FEq A00;
    public C337257fy A01;
    public List A02;
    public Dialog A03;
    public ListView A04;
    public DirectShareTarget A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final E9J A08;
    public final C67089Mi7 A09;
    public final ArrayList A0A = AnonymousClass7TE.A1C();
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final Context A0E;
    public final AnonymousClass07i A0F;
    public final E5I A0G;
    public final C71026OZd A0H;
    public final C67350MmR A0I;
    public final List A0J;
    public final boolean A0K;

    public EEO(Context context, AnonymousClass07i r9, AnonymousClass0iw r10, UserSession userSession, E5I e5i, C67089Mi7 mi7, C67350MmR mmR, List list, int i, int i2, int i3, boolean z) {
        0qQ.A0B(userSession, 3);
        DbW.A1P(mmR, 10, mi7);
        this.A0E = context;
        this.A0F = r9;
        this.A07 = userSession;
        this.A0G = e5i;
        this.A0J = list;
        this.A0B = i;
        this.A0C = i2;
        this.A06 = r10;
        this.A09 = mi7;
        C71026OZd A002 = C71026OZd.A00(userSession);
        0qQ.A07(A002);
        this.A0H = A002;
        boolean z2 = z;
        this.A0K = z2;
        this.A08 = new E9J(context, r10, userSession, this, this, z2);
        this.A0D = i3;
        this.A0I = mmR;
    }

    public final /* synthetic */ void CxW(View view) {
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [android.widget.ListAdapter, X.E9J] */
    public final void D6z(View view) {
        0qQ.A0B(view, 0);
        View requireViewById = view.requireViewById(R.id.non_interop_recipients_list);
        ListView listView = (ListView) requireViewById;
        this.A04 = listView;
        0qQ.A07(requireViewById);
        listView.setScrollBarStyle(33554432);
        listView.setClipToPadding(false);
        Context context = this.A0E;
        0nA.A0X(listView, AnonymousClass7TG.A02(context));
        listView.setOnScrollListener(this);
        UserSession userSession = this.A07;
        this.A00 = new C49916FEq((ViewGroup) view, userSession, this);
        listView.setAdapter(this.A08);
        C228602lw r4 = new C228602lw(context, this.A0F, (Integer) null);
        0qQ.A0B(userSession, 1);
        this.A01 = C67562Mpw.A00(context, userSession, r4, "default_no_interop", (String) null, false, false, false);
        A01(false);
        C337257fy r0 = this.A01;
        if (r0 != null) {
            r0.EcJ(this);
        }
    }

    public final void D8y(DirectShareTarget directShareTarget) {
    }

    public final void Dam(C337257fy r7) {
        List list;
        0qQ.A0B(r7, 0);
        List list2 = ((C67335MmB) r7.Bo1()).A00;
        String BiY = r7.BiY();
        E9J e9j = this.A08;
        boolean z = !r7.isLoading();
        e9j.A01 = z;
        e9j.A03.A00 = !z;
        if (BiY == null || BiY.length() == 0) {
            list = A00(this);
        } else {
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                DirectShareTarget A0f = DbT.A0f(it);
                if (A0f.A0S()) {
                    A1C.add(A0f);
                }
            }
            0qQ.A0C(A1C, "null cannot be cast to non-null type kotlin.collections.MutableList<com.instagram.model.direct.DirectShareTarget>");
            list = 0u4.A01(A1C);
        }
        e9j.A01(list);
    }

    public final void Dbj(DirectShareTarget directShareTarget) {
        Dbl(directShareTarget, 6, -1, -1);
    }

    public final void Dbk(View view, DirectShareTarget directShareTarget, int i, int i2, int i3) {
    }

    public final boolean Dbl(DirectShareTarget directShareTarget, int i, int i2, int i3) {
        int size;
        String str;
        String str2;
        String str3;
        C358248ab A0Y;
        String str4;
        String str5;
        DirectShareTarget directShareTarget2 = directShareTarget;
        0qQ.A0B(directShareTarget2, 0);
        UserSession userSession = this.A07;
        boolean A1a = AnonymousClass7TE.A1a(2HM.A00(userSession).A0H.A00());
        boolean z = this.A0K;
        if (!z || directShareTarget2.A0a(A1a)) {
            ArrayList arrayList = this.A0A;
            int i4 = i;
            int i5 = i2;
            int i6 = i3;
            if (arrayList.contains(directShareTarget2)) {
                arrayList.remove(directShareTarget2);
                Integer A042 = directShareTarget2.A04(userSession.A06, false);
                0qQ.A07(A042);
                long j = (long) i5;
                long j2 = (long) i6;
                C337257fy r9 = this.A01;
                if (r9 != null) {
                    str4 = r9.BiY();
                    str5 = r9.BnF();
                } else {
                    str4 = null;
                    str5 = null;
                }
                ArrayList A1C = AnonymousClass7TE.A1C();
                Iterator A1G = AnonymousClass7TE.A1G(arrayList);
                while (A1G.hasNext()) {
                    String A092 = ((DirectShareTarget) AnonymousClass7TF.A0a(A1G)).A09();
                    0qQ.A07(A092);
                    A1C.add(DbV.A0q(A092));
                }
                DirectShareTarget directShareTarget3 = directShareTarget2;
                this.A09.A09(new C68273N8k(directShareTarget3, A042, str4, str5, A1C, i4, j, j2), arrayList);
                A01(false);
                C3265677h.A0H(this.A06, userSession, directShareTarget3, C69838Nt2.A00(i4), directShareTarget2.A08(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "DIRECT", j, -1);
                return true;
            } else if (A02(directShareTarget2)) {
                String str6 = directShareTarget2.A0J;
                if (str6 == null) {
                    str6 = "";
                }
                Context context = this.A0E;
                A0Y = DbS.A0Y(context);
                A0Y.A09(2131959422);
                DbY.A0w(context, A0Y, str6, 2131959423);
                A0Y.A0I((DialogInterface.OnClickListener) null, 2131956164);
            } else {
                C71026OZd oZd = this.A0H;
                List list = this.A0J;
                int i7 = this.A0C;
                int i8 = this.A0B;
                C67350MmR mmR = this.A0I;
                int ordinal = mmR.ordinal();
                if (ordinal == 0) {
                    size = arrayList.size();
                    if (list != null) {
                        size = DbT.A01(list, size);
                    }
                } else if (ordinal == 1) {
                    size = arrayList.size() + i7;
                } else if (ordinal != 2) {
                    size = 0;
                } else {
                    size = arrayList.size() + i8;
                }
                Context context2 = this.A0E;
                if (!C48889Elp.A00(context2, userSession, DbT.A0y(directShareTarget2), directShareTarget2.A0P())) {
                    int i9 = this.A0D;
                    if (size < oZd.A02(mmR, i9, z)) {
                        Integer A043 = directShareTarget2.A04(userSession.A06, false);
                        0qQ.A07(A043);
                        long j3 = (long) i5;
                        long j4 = (long) i6;
                        C337257fy r11 = this.A01;
                        if (r11 != null) {
                            str = r11.BiY();
                            str2 = r11.BnF();
                        } else {
                            str = null;
                            str2 = null;
                        }
                        ArrayList A1C2 = AnonymousClass7TE.A1C();
                        Iterator A1G2 = AnonymousClass7TE.A1G(arrayList);
                        while (A1G2.hasNext()) {
                            String A093 = ((DirectShareTarget) AnonymousClass7TF.A0a(A1G2)).A09();
                            0qQ.A07(A093);
                            A1C2.add(DbV.A0q(A093));
                        }
                        C68273N8k n8k = new C68273N8k(directShareTarget2, A043, str, str2, A1C2, i4, j3, j4);
                        C67089Mi7 mi7 = this.A09;
                        AnonymousClass0iw r2 = this.A06;
                        mi7.A06(r2, userSession, n8k, "DIRECT", arrayList, false);
                        arrayList.add(directShareTarget2);
                        A01(true);
                        String A002 = C69838Nt2.A00(i4);
                        String A082 = directShareTarget2.A08();
                        C337257fy r3 = this.A01;
                        if (r3 != null) {
                            str3 = r3.BiY();
                        } else {
                            str3 = null;
                        }
                        C3265677h.A0C((C48136EZe) null, r2, userSession, directShareTarget2, A002, A082, (String) null, str3, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "DIRECT", j3, -1);
                        return true;
                    }
                    Dialog A032 = oZd.A03(context2, mmR, i9, z);
                    this.A03 = A032;
                    if (A032 != null) {
                        AnonymousClass0fN.A00(A032);
                    }
                    C3265677h.A0M(this.A06, userSession);
                    E5I e5i = this.A0G;
                    if (e5i != null && e5i.A01 == 29) {
                        int ordinal2 = e5i.A06.ordinal();
                        if (ordinal2 == 1) {
                            C72180Oxp A003 = C69867NtV.A00(e5i.A02);
                            C69871NtZ.A00(A003.A00, C300965yF.A07(e5i.A05), e5i.A07, "moderator_invite_limit_reached", "tap", C66579MXk.A00(641), C66579MXk.A00(76), (HashMap) null, e5i.A00);
                            return false;
                        } else if (ordinal2 == 2) {
                            C313756gx A004 = C313746gw.A00(e5i.A02);
                            int i10 = e5i.A00;
                            String A072 = C300965yF.A07(e5i.A05);
                            String str7 = e5i.A07;
                            1Ln A0J2 = DbT.A0J(A004);
                            if (DbT.A1Y(A0J2)) {
                                DbW.A17(A0J2, A004);
                                DbV.A1M(A0J2, "collaborator_invite_limit_reached");
                                A0J2.A0p("collaborator_invite_limit_dialog");
                                A0J2.A0i(DbZ.A0b(A0J2, "add_collaborators_sheet", A072, str7, i10));
                                A0J2.Cgf();
                                return false;
                            }
                        }
                    }
                }
                return false;
            }
        } else {
            boolean z2 = !directShareTarget2.A0J();
            A0Y = DbS.A0Y(this.A0E);
            int i11 = 2131958706;
            if (z2) {
                i11 = 2131958572;
            }
            A0Y.A09(i11);
            int i12 = 2131958709;
            if (z2) {
                i12 = 2131958573;
            }
            A0Y.A08(i12);
            A0Y.A06();
        }
        DbT.A1V(A0Y);
        return false;
    }

    public final boolean Dbo(DirectShareTarget directShareTarget) {
        return false;
    }

    public final void Dbp(DirectShareTarget directShareTarget) {
        0qQ.A0B(directShareTarget, 0);
        Dbl(directShareTarget, 6, -1, -1);
    }

    public final /* synthetic */ void Dbs(View view) {
    }

    public final /* synthetic */ void Dbt() {
    }

    public final /* synthetic */ void Dhe() {
    }

    public final void Dhx(String str, boolean z) {
        String str2;
        0qQ.A0B(str, 0);
        C337257fy r0 = this.A01;
        if (r0 != null) {
            str2 = r0.BiY();
        } else {
            str2 = null;
        }
        Locale locale = Locale.ROOT;
        if (!0mp.A0G(str2, 0mp.A01(DbT.A12(locale, str)))) {
            C337257fy r1 = this.A01;
            if (r1 != null) {
                r1.EhX(0mp.A01(DbT.A12(locale, str)));
            }
            this.A09.A08(this.A06, this.A07, str);
        }
    }

    public final void onFocusChange(View view, boolean z) {
    }

    private final void A01(boolean z) {
        this.A08.A00();
        C49916FEq fEq = this.A00;
        if (fEq != null) {
            fEq.A01(this.A0A, z);
        }
        E5I e5i = this.A0G;
        if (e5i != null) {
            e5i.A08 = this.A0A;
            Dbb.A0u(e5i);
        }
    }

    private final boolean A02(DirectShareTarget directShareTarget) {
        UserSession userSession = this.A07;
        Object obj = DbT.A14(directShareTarget).get(0);
        0qQ.A07(obj);
        if (AnonymousClass48M.A00(userSession, (PendingRecipient) obj).A2C() || !182.A06(0Tu.A05, userSession, 36325403165602750L)) {
            return false;
        }
        return true;
    }

    public final boolean CbW(DirectShareTarget directShareTarget) {
        return this.A0A.contains(directShareTarget);
    }

    public final boolean Cdh(DirectShareTarget directShareTarget) {
        DirectShareTarget directShareTarget2 = this.A05;
        if (directShareTarget2 == null || !directShareTarget2.equals(directShareTarget)) {
            return false;
        }
        return true;
    }

    public final void onCreate() {
        List list = this.A0J;
        if (list != null) {
            this.A08.A00 = new HashSet(list);
        }
        UserSession userSession = this.A07;
        1OC A022 = FGQ.A02(userSession, 0mp.A06("friendships/%s/following/", new Object[]{userSession.A06}), "direct_recipient_list_page");
        A022.A00 = new C47371Dwh(userSession, this, 2);
        schedule(A022);
    }

    public final void onDestroyView() {
        G8J g8j;
        C337257fy r0 = this.A01;
        if (r0 != null) {
            r0.EcJ((C337237fw) null);
        }
        C337257fy r02 = this.A01;
        if (r02 != null) {
            r02.DDU();
        }
        this.A01 = null;
        C49916FEq fEq = this.A00;
        if (!(fEq == null || (g8j = fEq.A02) == null)) {
            g8j.AHG();
        }
        this.A04 = null;
    }

    public final void onPause() {
        Dialog dialog = this.A03;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.A03 = null;
    }

    public final void onViewStateRestored(Bundle bundle) {
        G8J g8j;
        C49916FEq fEq = this.A00;
        if (fEq != null && (g8j = fEq.A02) != null) {
            g8j.DzK();
        }
    }

    public final void schedule(AnonymousClass11X r3) {
        if (r3 != null) {
            1ES.A00(this.A0E, this.A0F, r3);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final ArrayList A00(EEO eeo) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        HashSet A1F = AnonymousClass7TE.A1F();
        UserSession userSession = eeo.A07;
        for (AnonymousClass2Ep r3 : 1bJ.A00(userSession).A0C.A0G(AnonymousClass43A.A00, 2Eo.A04, C2611948q.NO_INTEROP)) {
            if (!r3.COb() || 182.A06(0Tu.A05, userSession, 36325145468875405L)) {
                List BRZ = r3.BRZ();
                if (BRZ.size() == 1) {
                    DirectShareTarget directShareTarget = new DirectShareTarget((User) AnonymousClass7TE.A13(BRZ));
                    if (A1F.add(directShareTarget)) {
                        A1C.add(directShareTarget);
                    }
                }
            }
        }
        List list = eeo.A02;
        if (list != null) {
            A1C.addAll(FFJ.A03(list));
        }
        return A1C;
    }

    public final boolean Es2(DirectShareTarget directShareTarget) {
        return A02(directShareTarget);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A0D2 = AnonymousClass7TG.A0D(absListView, 1773787396);
        E5I e5i = this.A0G;
        if (e5i != null) {
            e5i.onScroll(absListView, i, i2, i3);
        }
        AnonymousClass0fD.A0A(-2119501524, A0D2);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        C49916FEq fEq;
        int A0D2 = AnonymousClass7TG.A0D(absListView, -1413116604);
        C49916FEq fEq2 = this.A00;
        if (!(fEq2 == null || !fEq2.A02.CJp() || (fEq = this.A00) == null)) {
            fEq.A02.AHd();
        }
        E5I e5i = this.A0G;
        if (e5i != null) {
            e5i.onScrollStateChanged(absListView, i);
        }
        AnonymousClass0fD.A0A(1728357606, A0D2);
    }

    public final void Dbr(DirectShareTarget directShareTarget) {
        this.A05 = directShareTarget;
    }

    public final void schedule(AnonymousClass11X r1, int i, int i2, boolean z, boolean z2) {
        schedule(r1);
    }
}
