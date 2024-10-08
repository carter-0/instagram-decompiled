package X;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class EEP extends C252233om implements C252213ok, C74370Ptk, G9d {
    public int A00 = 0;
    public Dialog A01;
    public Dialog A02;
    public Dialog A03;
    public ViewGroup A04;
    public RecyclerView A05;
    public C48140EZi A06;
    public AnonymousClass2t9 A07;
    public FRO A08;
    public FZN A09;
    public FZN A0A;
    public C49916FEq A0B;
    public DirectShareTarget A0C;
    public C337257fy A0D;
    public C337257fy A0E;
    public C49607EzQ A0F;
    public Integer A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public List A0M;
    public Map A0N;
    public Set A0O;
    public boolean A0P;
    public boolean A0Q = false;
    public boolean A0R;
    public boolean A0S = false;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W = true;
    public boolean A0X = false;
    public boolean A0Y;
    public boolean A0Z = false;
    public int A0a = 0;
    public int A0b = -1;
    public C337257fy A0c;
    public boolean A0d;
    public boolean A0e;
    public final int A0f;
    public final UserSession A0g;
    public final 2el A0h;
    public final C313756gx A0i;
    public final C50338FYv A0j;
    public final C74498Pvs A0k = new C50388Far(this);
    public final G9b A0l = new C50389Fas(this);
    public final G9Y A0m;
    public final C71026OZd A0n;
    public final C67089Mi7 A0o;
    public final AnonymousClass7g1 A0p;
    public final HashSet A0q = AnonymousClass7TE.A1F();
    public final Map A0r = AnonymousClass7TE.A1H();
    public final boolean A0s;
    public final boolean A0t;
    public final boolean A0u;
    public final boolean A0v;
    public final boolean A0w;
    public final boolean A0x;
    public final boolean A0y;
    public final C249403jg A0z = new C46864Dmg(this, 3);
    public final 1UV A10 = new AWR(this, 9);
    public final AnonymousClass3E6 A11;
    public final FBP A12;
    public final G99 A13 = new C50419FbS(this);
    public final C229132mt A14 = new C50436Fbj(this, 1);
    public final boolean A15;
    public final boolean A16;

    public final void A0R(List list) {
        if (this.A0d) {
            FBP fbp = this.A12;
            0qQ.A0B(list, 0);
            List list2 = fbp.A02;
            list2.clear();
            list2.addAll(list);
            ArrayList A052 = A05(this, fbp.A01());
            this.A08.A05(A052);
            A0E(this, A052);
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                DirectShareTarget directShareTarget = (DirectShareTarget) it.next();
                A09(this, directShareTarget, directShareTarget.A04(this.A0g.A06, false), 6, i, i, false);
                i++;
            }
            C49916FEq fEq = this.A0B;
            if (fEq != null) {
                List list3 = fEq.A06;
                list3.clear();
                list3.addAll(list);
                fEq.A02.FLl((String) null, list3, true, false);
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            A0A(this, DbT.A0f(it2), true);
        }
        A0F(this, false);
    }

    public final /* synthetic */ 1OC AMw(C15050ULg uLg, String str) {
        return A1E.A00(uLg, this, str);
    }

    public final /* synthetic */ void DeG(C15050ULg uLg) {
        AnonymousClass9V2.A02(uLg, this);
    }

    public final void DeH(String str) {
    }

    public final /* synthetic */ void DeJ(C15050ULg uLg, C268654dm r2) {
        AnonymousClass9V2.A01(uLg, r2, this);
    }

    public final /* synthetic */ void DeT(C15050ULg uLg) {
        AnonymousClass9V2.A03(uLg, this);
    }

    public final void DeW(String str) {
    }

    public final /* synthetic */ void Dej(C15050ULg uLg) {
        AnonymousClass9V2.A04(uLg, this);
    }

    public final void Dem(String str) {
    }

    public final /* synthetic */ void Der(C15050ULg uLg, AnonymousClass1XT r2) {
        AnonymousClass9V2.A00(uLg, r2, this);
    }

    public final /* synthetic */ void Dnw(boolean z) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36319398804200685L) == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.instagram.model.direct.DirectShareTarget A01(X.EEP r5, X.C337257fy r6) {
        /*
            com.instagram.common.session.UserSession r3 = r5.A0g
            r4 = 0
            X.0qQ.A0B(r3, r4)
            boolean r0 = X.AnonymousClass9B8.A07(r3)
            if (r0 == 0) goto L_0x001a
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319398804200685(0x81084d002e1ced, double:3.031872278032383E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            r3 = 0
            if (r0 == 0) goto L_0x005a
            boolean r0 = r5.A0y
            if (r0 == 0) goto L_0x005a
            boolean r0 = r5.A0T
            if (r0 != 0) goto L_0x005a
            java.lang.Object r1 = r6.B3J()
            boolean r0 = r1 instanceof java.util.HashMap
            if (r0 == 0) goto L_0x005a
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            if (r1 == 0) goto L_0x005a
            java.lang.String r0 = "agents"
            java.lang.Object r1 = r1.get(r0)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x005a
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x005a
            java.util.Iterator r2 = r1.iterator()
        L_0x0046:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005a
            com.instagram.model.direct.DirectShareTarget r1 = X.DbT.A0f(r2)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = X.DbY.A0W(r1, r4)
            boolean r0 = r0.A0X
            if (r0 == 0) goto L_0x0046
            r3 = r1
            goto L_0x0046
        L_0x005a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EEP.A01(X.EEP, X.7fy):com.instagram.model.direct.DirectShareTarget");
    }

    private void A06(int i, int i2) {
        ViewGroup viewGroup = this.A04;
        if (viewGroup != null) {
            G9Y g9y = this.A0m;
            if (g9y.getContext() != null) {
                DbU.A12(g9y.requireContext(), viewGroup.requireViewById(i), i2);
            }
        }
    }

    public static void A07(EEP eep, int i, int i2) {
        int i3 = 2;
        if (i2 != 11) {
            i3 = 1;
        }
        RecyclerView recyclerView = eep.A05;
        if (eep.A0W && !eep.A0X && recyclerView != null) {
            recyclerView.postDelayed(new C51501Fv9(recyclerView, eep, i, i3), 75);
        }
        eep.A0X = false;
    }

    public static void A08(EEP eep, int i, boolean z) {
        ViewGroup viewGroup = eep.A04;
        if (viewGroup != null && viewGroup.findViewById(i) != null) {
            View requireViewById = viewGroup.requireViewById(i);
            int A012 = DbW.A01(z ? 1 : 0);
            if (requireViewById.getVisibility() != A012) {
                LayoutTransition layoutTransition = new LayoutTransition();
                requireViewById.setVisibility(A012);
                if (!182.A06(0Tu.A06, eep.A0g, 36318917765110519L)) {
                    viewGroup.setLayoutTransition(layoutTransition);
                    Fq7 fq7 = new Fq7(viewGroup);
                    int i2 = 3;
                    if (z) {
                        i2 = 2;
                    }
                    viewGroup.postDelayed(fq7, layoutTransition.getDuration(i2));
                }
            }
        }
    }

    public static void A09(EEP eep, DirectSearchResult directSearchResult, Integer num, int i, int i2, int i3, boolean z) {
        String str;
        DirectSearchResult directSearchResult2 = directSearchResult;
        Integer num2 = num;
        C68273N8k n8k = new C68273N8k(directSearchResult2, num2, eep.A0L, eep.A0I, A04(eep), i, (long) i2, (long) i3);
        C67089Mi7 mi7 = eep.A0o;
        UserSession userSession = eep.A0g;
        G9Y g9y = eep.A0m;
        List A0N2 = eep.A0N();
        if (eep.A0V) {
            str = "UNKNOWN";
        } else {
            str = "DIRECT";
        }
        mi7.A06(g9y, userSession, n8k, str, A0N2, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0A(X.EEP r4, com.instagram.model.direct.DirectShareTarget r5, boolean r6) {
        /*
            java.util.Map r3 = r4.A0r
            java.lang.String r0 = r5.A09()
            if (r6 == 0) goto L_0x0069
            r3.put(r0, r5)
            boolean r0 = r5.A0J()
            if (r0 == 0) goto L_0x0064
            com.instagram.common.session.UserSession r0 = r4.A0g
            java.lang.String r0 = r0.A06
            boolean r0 = r5.A0Z(r0)
            if (r0 != 0) goto L_0x0064
            boolean r0 = r4.A0x
            boolean r0 = r5.A0b(r0)
            if (r0 == 0) goto L_0x0031
            boolean r0 = r4.A0t
            boolean r0 = r5.A0a(r0)
            if (r0 != 0) goto L_0x0031
            int r0 = r4.A0a
            int r0 = r0 + 1
        L_0x002f:
            r4.A0a = r0
        L_0x0031:
            boolean r0 = r4.A0V
            if (r0 == 0) goto L_0x010e
            boolean r1 = r5.A0I()
            if (r6 == 0) goto L_0x0098
            if (r1 == 0) goto L_0x0103
            java.util.List r0 = r5.A0P
            if (r0 == 0) goto L_0x0103
            java.util.Map r1 = r4.A0N
            java.lang.String r0 = r5.A09()
            r1.put(r0, r5)
            java.util.List r0 = r5.A0P
            java.util.Iterator r2 = r0.iterator()
        L_0x0050:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x010e
            java.lang.Object r0 = r2.next()
            java.util.Set r1 = r4.A0O
            java.lang.String r0 = r0.toString()
            r1.add(r0)
            goto L_0x0050
        L_0x0064:
            int r0 = r4.A00
            int r0 = r0 + 1
            goto L_0x0095
        L_0x0069:
            r3.remove(r0)
            boolean r0 = r5.A0J()
            if (r0 == 0) goto L_0x0091
            com.instagram.common.session.UserSession r0 = r4.A0g
            java.lang.String r0 = r0.A06
            boolean r0 = r5.A0Z(r0)
            if (r0 != 0) goto L_0x0091
            boolean r0 = r4.A0x
            boolean r0 = r5.A0b(r0)
            if (r0 == 0) goto L_0x0031
            boolean r0 = r4.A0t
            boolean r0 = r5.A0a(r0)
            if (r0 != 0) goto L_0x0031
            int r0 = r4.A0a
            int r0 = r0 + -1
            goto L_0x002f
        L_0x0091:
            int r0 = r4.A00
            int r0 = r0 + -1
        L_0x0095:
            r4.A00 = r0
            goto L_0x0031
        L_0x0098:
            if (r1 == 0) goto L_0x00c8
            java.util.Map r1 = r4.A0N
            java.lang.String r0 = r5.A09()
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x00c8
            java.util.List r0 = r5.A0P
            if (r0 == 0) goto L_0x010e
            java.util.Iterator r2 = r0.iterator()
        L_0x00ae:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x010e
            java.lang.Object r0 = r2.next()
            java.lang.String r1 = r0.toString()
            boolean r0 = r3.containsKey(r1)
            if (r0 != 0) goto L_0x00ae
            java.util.Set r0 = r4.A0O
            r0.remove(r1)
            goto L_0x00ae
        L_0x00c8:
            java.util.Map r0 = r4.A0N
            java.util.Iterator r3 = X.AnonymousClass7TF.A0v(r0)
        L_0x00ce:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00f9
            com.instagram.model.direct.DirectShareTarget r0 = X.DbT.A0f(r3)
            java.util.List r0 = r0.A0P
            if (r0 == 0) goto L_0x00ce
            java.util.Iterator r2 = r0.iterator()
        L_0x00e0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r0 = r2.next()
            java.lang.String r1 = r5.A09()
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00e0
            return
        L_0x00f9:
            java.util.Set r1 = r4.A0O
            java.lang.String r0 = r5.A09()
            r1.remove(r0)
            return
        L_0x0103:
            if (r1 != 0) goto L_0x010e
            java.util.Set r1 = r4.A0O
            java.lang.String r0 = r5.A09()
            r1.add(r0)
        L_0x010e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EEP.A0A(X.EEP, com.instagram.model.direct.DirectShareTarget, boolean):void");
    }

    public static void A0B(EEP eep, Integer num) {
        FRO fro = eep.A08;
        0qQ.A0B(num, 0);
        fro.A00 = num;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r3.A16 != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r6 = X.AnonymousClass7TE.A1C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        A0B(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r7 == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r3.A0d == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        if (r1 != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r3.A0M().isEmpty() == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        if (r3.A0M == null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        if (r3.A0V == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        r1 = r3.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        if (r1 == null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        r1.A0o(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004f, code lost:
        if (r3.A0V == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0055, code lost:
        if (r6.isEmpty() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0059, code lost:
        if (r3.A0M != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005b, code lost:
        r3.A0M = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005e, code lost:
        r2 = r3.A08;
        r1 = r3.A0M();
        X.0qQ.A0B(r1, 0);
        r2.A01();
        r2.A04(r1, r6);
        A0E(r3, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0072, code lost:
        r3.A08.A04(r3.A0M(), r6);
        r1 = r3.A0q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007d, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r1.addAll(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0081, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r5 != null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r5.isEmpty() != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0C(X.EEP r3, java.lang.Integer r4, java.lang.String r5, java.util.List r6, boolean r7) {
        /*
            X.FEq r0 = r3.A0B
            if (r0 == 0) goto L_0x0012
            if (r5 == 0) goto L_0x0012
            X.G8J r0 = r0.A02
            java.lang.String r0 = r0.BqO()
            boolean r0 = r5.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0018
        L_0x0012:
            boolean r0 = r3.A0V
            if (r0 == 0) goto L_0x005d
            if (r5 == 0) goto L_0x001f
        L_0x0018:
            boolean r0 = r5.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0028
        L_0x001f:
            r1 = 1
            boolean r0 = r3.A16
            if (r0 != 0) goto L_0x0028
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
        L_0x0028:
            A0B(r3, r4)
            if (r7 == 0) goto L_0x0072
            boolean r0 = r3.A0d
            if (r0 == 0) goto L_0x0033
            if (r1 != 0) goto L_0x0072
        L_0x0033:
            java.lang.String r0 = r3.A0M()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x005e
            java.util.List r0 = r3.A0M
            if (r0 == 0) goto L_0x005e
            boolean r0 = r3.A0V
            if (r0 == 0) goto L_0x005e
        L_0x0045:
            androidx.recyclerview.widget.RecyclerView r1 = r3.A05
            if (r1 == 0) goto L_0x004d
            r0 = 0
            r1.A0o(r0)
        L_0x004d:
            boolean r0 = r3.A0V
            if (r0 == 0) goto L_0x005d
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x005d
            java.util.List r0 = r3.A0M
            if (r0 != 0) goto L_0x005d
            r3.A0M = r6
        L_0x005d:
            return
        L_0x005e:
            X.FRO r2 = r3.A08
            java.lang.String r1 = r3.A0M()
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r2.A01()
            r2.A04(r1, r6)
            A0E(r3, r6)
            goto L_0x0045
        L_0x0072:
            X.FRO r1 = r3.A08
            java.lang.String r0 = r3.A0M()
            r1.A04(r0, r6)
            java.util.HashSet r1 = r3.A0q
            monitor-enter(r1)
            r1.addAll(r6)     // Catch:{ all -> 0x0083 }
            monitor-exit(r1)     // Catch:{ all -> 0x0083 }
            goto L_0x004d
        L_0x0083:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0083 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EEP.A0C(X.EEP, java.lang.Integer, java.lang.String, java.util.List, boolean):void");
    }

    public static void A0D(EEP eep, Object obj, boolean z) {
        C49607EzQ ezQ = eep.A0F;
        if (eep.A0V && obj != null && ezQ != null) {
            eep.A0S = z;
            eep.A0K = eep.A0J;
            eep.A0J = obj.toString();
            ezQ.A01 = eep.A0S;
            ezQ.A00 = null;
            eep.A0R = false;
        }
    }

    public static void A0E(EEP eep, List list) {
        HashSet hashSet = eep.A0q;
        synchronized (hashSet) {
            hashSet.clear();
            hashSet.addAll(list);
            FRO fro = eep.A08;
            String A0M2 = eep.A0M();
            0qQ.A0B(A0M2, 0);
            fro.A01();
            fro.A04(A0M2, list);
            C337257fy A022 = A02(eep);
            if (A022 != null) {
                C67089Mi7 mi7 = eep.A0o;
                String BiY = A022.BiY();
                EK7 ek7 = mi7.A02;
                if (ek7 != null) {
                    ek7.A05(BiY);
                }
            }
        }
    }

    public static void A0F(EEP eep, boolean z) {
        C49916FEq fEq = eep.A0B;
        if (fEq != null) {
            ArrayList A0e2 = Dba.A0e(eep.A0r);
            List list = fEq.A06;
            list.clear();
            list.addAll(A0e2);
            fEq.A02.FLl((String) null, list, z, false);
        }
        eep.A08.A02();
        eep.A0m.Dbv();
    }

    private boolean A0G() {
        Integer num;
        if (C375479Ds.A01(this.A0g)) {
            if (!(this.A0m instanceof E5H)) {
                num = AnonymousClass05K.A0C;
            } else if (!this.A0U) {
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A01;
            }
            if (num == AnonymousClass05K.A0C) {
                return false;
            }
            return true;
        }
        return false;
    }

    private boolean A0H() {
        if (!(this.A0m instanceof E5H) || !AnonymousClass5IJ.A01(this.A0g) || this.A0T || this.A0V || this.A0U) {
            return false;
        }
        return true;
    }

    private boolean A0I() {
        if (!(this.A0m instanceof E5H) || !C375489Dt.A01(this.A0g) || this.A0T || this.A0V || this.A0U) {
            return false;
        }
        return true;
    }

    public static boolean A0J(EEP eep) {
        UserSession userSession;
        if (!(eep.A0m instanceof E5H) || A00(eep) != 0 || !eep.A0M().isEmpty() || (userSession = eep.A0g) == null || eep.A0T || eep.A0V || !182.A06(0Tu.A05, userSession, 36318917764913908L)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0084, code lost:
        if (X.DbX.A1Z(X.2HM.A00(r3).A0K) == false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0L(X.EEP r6, com.instagram.model.direct.DirectShareTarget r7) {
        /*
            boolean r1 = r6.A0U
            r0 = 1
            if (r1 != 0) goto L_0x0006
            r0 = 0
        L_0x0006:
            r2 = 0
            if (r0 == 0) goto L_0x006c
            int r0 = r6.A0a
            if (r0 <= 0) goto L_0x001a
            java.util.Map r1 = r6.A0r
            java.lang.String r0 = r7.A09()
            boolean r0 = r1.containsKey(r0)
            r0 = r0 ^ 1
            return r0
        L_0x001a:
            boolean r5 = r6.A0x
            boolean r3 = r6.A0t
            java.util.Map r0 = r6.A0r
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L_0x0028
            r1 = 0
        L_0x0028:
            boolean r0 = r7.A0O()
            r4 = 0
            if (r0 == 0) goto L_0x0035
            if (r1 == 0) goto L_0x0087
            boolean r4 = r7.A0a(r3)
        L_0x0035:
            com.instagram.common.session.UserSession r3 = r6.A0g
            java.lang.String r0 = r3.A06
            boolean r0 = r7.A0Z(r0)
            if (r0 == 0) goto L_0x0066
            boolean r0 = r7.A0O()
            if (r0 == 0) goto L_0x0051
            java.util.List r0 = r7.A0Q
            java.lang.Object r0 = r0.get(r2)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r0
            boolean r0 = r0.A0O
            if (r0 != 0) goto L_0x0066
        L_0x0051:
            java.util.List r0 = r7.A0Q
            int r1 = r0.size()
            r0 = 1
            if (r1 != r0) goto L_0x006d
            java.util.List r0 = r7.A0Q
            java.lang.Object r0 = r0.get(r2)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r0
            boolean r0 = r0.A0e
            if (r0 == 0) goto L_0x006d
        L_0x0066:
            r1 = 1
        L_0x0067:
            if (r4 == 0) goto L_0x006b
            if (r1 != 0) goto L_0x006c
        L_0x006b:
            r2 = 1
        L_0x006c:
            return r2
        L_0x006d:
            X.2HN r0 = X.2HM.A00(r3)
            X.2HR r0 = r0.A0J
            boolean r0 = X.DbX.A1Z(r0)
            if (r0 == 0) goto L_0x0066
            X.2HN r0 = X.2HM.A00(r3)
            X.2HR r0 = r0.A0K
            boolean r0 = X.DbX.A1Z(r0)
            r1 = 0
            if (r0 != 0) goto L_0x0067
            goto L_0x0066
        L_0x0087:
            boolean r0 = r7.A0b(r5)
            if (r0 != 0) goto L_0x0093
            boolean r0 = r7.A0a(r3)
            if (r0 == 0) goto L_0x0035
        L_0x0093:
            r4 = 1
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EEP.A0L(X.EEP, com.instagram.model.direct.DirectShareTarget):boolean");
    }

    public final String A0M() {
        C49916FEq fEq = this.A0B;
        if (fEq != null) {
            return fEq.A02.BqO();
        }
        return "";
    }

    public final List A0N() {
        C49916FEq fEq = this.A0B;
        if (fEq != null) {
            return Collections.unmodifiableList(fEq.A06);
        }
        return Collections.EMPTY_LIST;
    }

    public final void A0O() {
        List list;
        boolean z = this.A0V;
        Integer num = AnonymousClass05K.A01;
        if (!z) {
            A0B(this, num);
            list = this.A12.A01();
        } else {
            A0B(this, num);
            list = this.A0M;
            if (list == null) {
                return;
            }
        }
        ArrayList A052 = A05(this, list);
        this.A08.A05(A052);
        A0E(this, A052);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r2.A0V != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0P() {
        /*
            r2 = this;
            boolean r0 = r2.A0y
            if (r0 == 0) goto L_0x0028
            int r0 = A00(r2)
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = r2.A0M()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.A0U
            if (r0 != 0) goto L_0x0021
            boolean r0 = r2.A0T
            if (r0 != 0) goto L_0x0021
            boolean r0 = r2.A0V
            r1 = 1
            if (r0 == 0) goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            r0 = 2131431535(0x7f0b106f, float:1.8484802E38)
            A08(r2, r0, r1)
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EEP.A0P():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0S() {
        /*
            r6 = this;
            boolean r0 = r6.A0U
            if (r0 != 0) goto L_0x0050
            boolean r0 = r6.A0Y
            r5 = 0
            if (r0 == 0) goto L_0x004e
            java.util.List r1 = r6.A0N()
            int r0 = r1.size()
            r4 = 1
            if (r0 == r4) goto L_0x004e
            boolean r0 = r6.A0P
            if (r0 == 0) goto L_0x004e
            java.util.Iterator r3 = r1.iterator()
        L_0x001c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0050
            com.instagram.model.direct.DirectShareTarget r2 = X.DbT.A0f(r3)
            boolean r0 = r2.A0O()
            if (r0 == 0) goto L_0x004e
            java.util.List r0 = r2.A0Q
            int r0 = r0.size()
            if (r0 != r4) goto L_0x004e
            java.util.List r0 = r2.A0Q
            java.lang.Object r0 = r0.get(r5)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r0
            int r1 = r0.A00
            r0 = 4
            if (r1 != r0) goto L_0x004e
            java.util.List r0 = r2.A0Q
            java.lang.Object r0 = r0.get(r5)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r0
            boolean r0 = r0.A0D
            if (r0 == 0) goto L_0x004e
            goto L_0x001c
        L_0x004e:
            r0 = 0
            return r0
        L_0x0050:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EEP.A0S():boolean");
    }

    public final boolean A0T() {
        ViewGroup viewGroup;
        C49916FEq fEq = this.A0B;
        if (fEq != null) {
            this.A0o.A07(this.A0m, this.A0g, fEq.A02.BqO());
        }
        C49916FEq fEq2 = this.A0B;
        if (fEq2 == null || (viewGroup = fEq2.A00) == null || viewGroup.getVisibility() != 0) {
            return false;
        }
        this.A0B.A02.CLU();
        return false;
    }

    public final 1OC AMx(String str, String str2) {
        return FFZ.A02(this.A0g, new C47165Drg(str, "direct_recipient_list_page", (String) null, (String) null, (String) null, (String) null, 50, false, false, false));
    }

    public final /* synthetic */ boolean Cch() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x013b, code lost:
        if (r0 == false) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01bc, code lost:
        if (X.182.A06(r5, r6, 36311569077437042L) == false) goto L_0x01be;
     */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D6z(android.view.View r28) {
        /*
            r27 = this;
            r5 = r28
            r8 = r5
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r3 = r27
            r3.A04 = r8
            r0 = 2131439297(0x7f0b2ec1, float:1.8500545E38)
            androidx.recyclerview.widget.RecyclerView r0 = X.DbZ.A0F(r5, r0)
            r3.A05 = r0
            boolean r7 = r3.A0V
            if (r7 == 0) goto L_0x001d
            X.EzQ r0 = new X.EzQ
            r0.<init>()
            r3.A0F = r0
        L_0x001d:
            android.content.Context r13 = r5.getContext()
            com.instagram.common.session.UserSession r14 = r3.A0g
            X.G9Y r15 = r3.A0m
            r0 = 780(0x30c, float:1.093E-42)
            java.lang.String r16 = X.C66579MXk.A00(r0)
            java.lang.String r9 = "direct_user_search_nullstate"
            r23 = 0
            boolean r11 = r3.A0s
            boolean r10 = r3.A15
            boolean r6 = r3.A0e
            if (r6 == 0) goto L_0x02e6
            X.0Tu r2 = X.0Tu.A06
            r0 = 36595419169425551(0x8203570000088f, double:3.206428668445388E-306)
            java.lang.Long r0 = X.AnonymousClass7TF.A0Y(r2, r14, r0)
        L_0x0042:
            int r20 = r0.intValue()
            X.Mi7 r4 = r3.A0o
            X.Mk6 r0 = r4.A03
            if (r0 == 0) goto L_0x02e3
            java.lang.String r1 = r0.A02
        L_0x004e:
            r2 = 0
            r0 = r23
            r17 = r9
            r18 = r1
            r19 = r2
            r21 = r11
            r22 = r10
            X.7eL r1 = X.C67562Mpw.A07(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r3.A0c = r1
            if (r7 == 0) goto L_0x027f
            X.Mk6 r1 = r4.A03
            if (r1 == 0) goto L_0x0069
            java.lang.String r0 = r1.A02
        L_0x0069:
            r20 = r14
            r21 = r15
            r22 = r0
            r24 = r23
            r25 = r2
            X.PPe r1 = X.C67562Mpw.A01(r20, r21, r22, r23, r24, r25)
        L_0x0077:
            r3.A0E = r1
            r7 = 1
            X.Fky r0 = new X.Fky
            r0.<init>(r3, r7)
            r1.EcJ(r0)
            X.7fy r4 = r3.A0c
            r1 = 2
            X.Fky r0 = new X.Fky
            r0.<init>(r3, r1)
            r4.EcJ(r0)
            X.7fy r1 = r3.A0E
            java.lang.String r0 = ""
            r1.EhX(r0)
            android.view.ViewGroup r1 = r3.A04
            if (r1 == 0) goto L_0x00bb
            boolean r0 = A0J(r3)
            if (r0 == 0) goto L_0x00bb
            r0 = 2131431591(0x7f0b10a7, float:1.8484916E38)
            android.view.View r4 = r1.requireViewById(r0)
            r4.setVisibility(r2)
            r1 = 62
            X.FPI r0 = new X.FPI
            r0.<init>((X.EEP) r3, (int) r1)
            X.AnonymousClass0fU.A00(r0, r4)
            r1 = 2131432821(0x7f0b1575, float:1.848741E38)
            r0 = 2131962406(0x7f132a26, float:1.9561536E38)
            r3.A06(r1, r0)
        L_0x00bb:
            android.view.ViewGroup r1 = r3.A04
            if (r1 == 0) goto L_0x00ee
            boolean r0 = r3.A0H()
            if (r0 == 0) goto L_0x0223
            boolean r0 = r3.A0I()
            if (r0 != 0) goto L_0x00d1
            boolean r0 = r3.A0G()
            if (r0 == 0) goto L_0x0223
        L_0x00d1:
            r0 = 2131431552(0x7f0b1080, float:1.8484836E38)
            android.view.View r4 = r1.requireViewById(r0)
            r4.setVisibility(r2)
            r1 = 63
            X.FPI r0 = new X.FPI
            r0.<init>((X.EEP) r3, (int) r1)
            X.AnonymousClass0fU.A00(r0, r4)
            r6 = 2131429912(0x7f0b0a18, float:1.848151E38)
            r0 = 2131959900(0x7f13205c, float:1.9556453E38)
        L_0x00eb:
            r3.A06(r6, r0)
        L_0x00ee:
            boolean r0 = r3.A0y
            if (r0 == 0) goto L_0x0187
            X.Fwb r11 = new X.Fwb
            r11.<init>(r3, r2)
            X.0qQ.A0B(r14, r2)
            r0 = 2131431534(0x7f0b106e, float:1.84848E38)
            android.view.View r0 = X.AnonymousClass7TF.A0F(r5, r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r10 = r0.inflate()
            X.0qQ.A0A(r10)
            r0 = 2131427889(0x7f0b0231, float:1.8477407E38)
            android.widget.TextView r4 = X.AnonymousClass7TG.A0R(r10, r0)
            X.AnonymousClass9B9.A00()
            X.0Tu r6 = X.0Tu.A05
            r0 = 36888095422874398(0x830d87001f031e, double:3.391518309639117E-306)
            java.lang.String r1 = X.182.A04(r6, r14, r0)
            int r12 = r1.hashCode()
            r0 = -1233090236(0xffffffffb6808944, float:-3.830677E-6)
            if (r12 == r0) goto L_0x013d
            r0 = -496760023(0xffffffffe2640b29, float:-1.05166546E21)
            if (r12 == r0) goto L_0x0218
            r0 = 1973976943(0x75a87f6f, float:4.2719264E32)
            if (r12 != r0) goto L_0x013d
            java.lang.String r0 = "chat_with_ai_characters"
            boolean r0 = r1.equals(r0)
            r1 = 2131955085(0x7f130d8d, float:1.9546688E38)
        L_0x013b:
            if (r0 != 0) goto L_0x0140
        L_0x013d:
            r1 = 2131952560(0x7f1303b0, float:1.9541566E38)
        L_0x0140:
            java.lang.String r0 = X.AnonymousClass7TE.A16(r13, r1)
            r4.setText(r0)
            r0 = 52
            X.FPE.A01(r10, r0, r11, r5)
            r0 = 2131427885(0x7f0b022d, float:1.8477399E38)
            android.view.View r10 = X.AnonymousClass7TF.A0G(r10, r0)
            r0 = 36325308676584289(0x810dad00063361, double:3.03560970512492E-306)
            boolean r0 = X.182.A06(r6, r14, r0)
            if (r0 == 0) goto L_0x0211
            X.0xa r0 = X.AnonymousClass7TE.A0q(r14)
            java.lang.String r11 = "ai_chats_new_badge_impression_count"
            int r0 = r0.getInt(r11, r2)
            long r4 = (long) r0
            r0 = 36606783653352943(0x820dad000715ef, double:3.2136156138421744E-306)
            long r12 = X.182.A01(r6, r14, r0)
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0211
            r10.setVisibility(r2)
            X.0xa r0 = X.AnonymousClass7TE.A0q(r14)
            X.0xY r0 = X.AnonymousClass7TG.A0g(r0, r11)
            r0.apply()
        L_0x0184:
            r3.A0P()
        L_0x0187:
            X.FBP r5 = r3.A12
            r4 = r15
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            androidx.fragment.app.FragmentActivity r11 = r15.requireActivity()
            X.Etm r1 = new X.Etm
            r1.<init>(r3)
            X.0qQ.A0B(r4, r2)
            X.FBo r10 = r5.A01
            X.5fe r0 = r10.A00
            if (r0 != 0) goto L_0x0207
            X.WEC r2 = new X.WEC
            r2.<init>(r7, r5, r1)
            com.instagram.common.session.UserSession r6 = r10.A06
            X.0Tu r5 = X.0Tu.A06
            r0 = 36311569076126302(0x81012e0005025e, double:3.026920726470359E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x01be
            r0 = 36311569077437042(0x81012e00190272, double:3.026920727299276E-306)
            boolean r1 = X.182.A06(r5, r6, r0)
            r0 = r4
            if (r1 != 0) goto L_0x01bf
        L_0x01be:
            r0 = r11
        L_0x01bf:
            X.2YN r1 = new X.2YN
            r1.<init>(r0)
            java.lang.Class<X.DkQ> r0 = X.C46737DkQ.class
            X.2YL r0 = r1.A00(r0)
            X.DkQ r0 = (X.C46737DkQ) r0
            r10.A02 = r0
            X.2Fk r7 = r0.A00
            r0 = 36311569076126302(0x81012e0005025e, double:3.026920726470359E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x0205
            r0 = 36311569077437042(0x81012e00190272, double:3.026920727299276E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x0205
        L_0x01e6:
            r7.A06(r4, r2)
        L_0x01e9:
            java.lang.Integer r1 = r3.A0G
            X.G99 r0 = r3.A13
            X.FEq r2 = new X.FEq
            if (r1 == 0) goto L_0x0201
            r2.<init>(r8, r14, r0, r1)
        L_0x01f4:
            r3.A0B = r2
            int r1 = r3.A0b
            r0 = -1
            if (r1 == r0) goto L_0x0200
            X.G8J r0 = r2.A02
            r0.Eop(r1)
        L_0x0200:
            return
        L_0x0201:
            r2.<init>(r8, r14, r0)
            goto L_0x01f4
        L_0x0205:
            r4 = r11
            goto L_0x01e6
        L_0x0207:
            X.5g5 r0 = r0.A01(r9)
            java.util.List r0 = r0.A02
            X.FBP.A00(r1, r5, r0)
            goto L_0x01e9
        L_0x0211:
            r0 = 8
            r10.setVisibility(r0)
            goto L_0x0184
        L_0x0218:
            java.lang.String r0 = "ai_studio_chats"
            boolean r0 = r1.equals(r0)
            r1 = 2131952761(0x7f130479, float:1.9541974E38)
            goto L_0x013b
        L_0x0223:
            boolean r0 = r3.A0H()
            if (r0 == 0) goto L_0x025d
            r0 = 2131431537(0x7f0b1071, float:1.8484806E38)
            android.view.View r4 = r1.requireViewById(r0)
            r4.setVisibility(r2)
            r1 = 64
            X.FPI r0 = new X.FPI
            r0.<init>((X.EEP) r3, (int) r1)
            X.AnonymousClass0fU.A00(r0, r4)
            r6 = 2131429103(0x7f0b06ef, float:1.847987E38)
            android.widget.TextView r1 = X.AnonymousClass7TE.A0d(r4, r6)
            r0 = 2131959898(0x7f13205a, float:1.955645E38)
            r3.A06(r6, r0)
            if (r1 == 0) goto L_0x00ee
            boolean r0 = X.C375469Dr.A00(r14)
            if (r0 == 0) goto L_0x00ee
            r0 = 2131959903(0x7f13205f, float:1.955646E38)
            r1.setText(r0)
            r0 = 2131959904(0x7f132060, float:1.9556462E38)
            goto L_0x00eb
        L_0x025d:
            boolean r0 = r3.A0I()
            if (r0 == 0) goto L_0x00ee
            r0 = 2131431773(0x7f0b115d, float:1.8485285E38)
            android.view.View r4 = r1.requireViewById(r0)
            r4.setVisibility(r2)
            r1 = 65
            X.FPI r0 = new X.FPI
            r0.<init>((X.EEP) r3, (int) r1)
            X.AnonymousClass0fU.A00(r0, r4)
            r6 = 2131441528(0x7f0b3778, float:1.850507E38)
            r0 = 2131959902(0x7f13205e, float:1.9556458E38)
            goto L_0x00eb
        L_0x027f:
            java.lang.String r17 = "raven"
            if (r6 == 0) goto L_0x02d3
            X.0Tu r6 = X.0Tu.A06
            r0 = 36595419169425551(0x8203570000088f, double:3.206428668445388E-306)
            java.lang.Long r0 = X.AnonymousClass7TF.A0Y(r6, r14, r0)
        L_0x028e:
            int r23 = r0.intValue()
            X.DkJ r16 = r15.BIm()
            boolean r0 = X.AnonymousClass9B8.A07(r14)
            if (r0 == 0) goto L_0x02d0
            boolean r0 = r3.A0y
            if (r0 == 0) goto L_0x02d0
            X.0qQ.A0B(r14, r2)
            boolean r0 = X.AnonymousClass9B8.A07(r14)
            if (r0 == 0) goto L_0x02d0
            X.0Tu r6 = X.0Tu.A05
            r0 = 36601316159983755(0x8208b40007108b, double:3.210157949019671E-306)
            int r20 = X.DbS.A04(r6, r14, r0)
        L_0x02b4:
            X.Mk6 r0 = r4.A03
            if (r0 == 0) goto L_0x02ce
            java.lang.String r0 = r0.A02
        L_0x02ba:
            r25 = 1
            r19 = r0
            r21 = r2
            r22 = r2
            r24 = r11
            r26 = r10
            r18 = r9
            X.7eL r1 = X.C67562Mpw.A05(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x0077
        L_0x02ce:
            r0 = 0
            goto L_0x02ba
        L_0x02d0:
            r20 = 0
            goto L_0x02b4
        L_0x02d3:
            r0 = 36595419169425551(0x8203570000088f, double:3.206428668445388E-306)
            X.0tM r0 = X.AnonymousClass0yP.A00(r0)
            java.lang.Object r0 = r0.getDefaultValue()
            java.lang.Number r0 = (java.lang.Number) r0
            goto L_0x028e
        L_0x02e3:
            r1 = 0
            goto L_0x004e
        L_0x02e6:
            r0 = 36595419169425551(0x8203570000088f, double:3.206428668445388E-306)
            X.0tM r0 = X.AnonymousClass0yP.A00(r0)
            java.lang.Object r0 = r0.getDefaultValue()
            java.lang.Number r0 = (java.lang.Number) r0
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EEP.D6z(android.view.View):void");
    }

    public final void DeM(C268654dm r2, String str) {
        A0B(this, AnonymousClass05K.A0Y);
    }

    public final /* bridge */ /* synthetic */ void Dev(AnonymousClass1XT r4, String str) {
        A0C(this, AnonymousClass05K.A01, str, FFJ.A03(((C334247ax) r4).getItems()), false);
    }

    public final void onDestroyView() {
        C49916FEq fEq = this.A0B;
        if (fEq != null) {
            G8J g8j = fEq.A02;
            if (g8j != null) {
                g8j.AHG();
            }
            this.A0B = null;
        }
        C337257fy r0 = this.A0E;
        if (r0 != null) {
            r0.DDU();
        }
        C337257fy r02 = this.A0c;
        if (r02 != null) {
            r02.DDU();
        }
        C337257fy r03 = this.A0D;
        if (r03 != null) {
            r03.DDU();
            this.A0D = null;
        }
    }

    public final void onPause() {
        Dialog dialog = this.A01;
        if (dialog != null) {
            dialog.dismiss();
            this.A01 = null;
        }
        Dialog dialog2 = this.A03;
        if (dialog2 != null) {
            dialog2.dismiss();
            this.A03 = null;
        }
        Dialog dialog3 = this.A02;
        if (dialog3 != null) {
            dialog3.dismiss();
            this.A02 = null;
        }
        AnonymousClass3E6 r0 = this.A11;
        r0.EEH(this);
        r0.onStop();
    }

    public final void onResume() {
        AnonymousClass3E6 r1 = this.A11;
        r1.DmJ((Activity) this.A0m.requireContext());
        r1.A9Y(this);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C49916FEq fEq = this.A0B;
        if (fEq != null) {
            bundle.putSerializable("RecipientPickerController.SELECTED_RECIPIENTS", AnonymousClass7TE.A1D(Collections.unmodifiableList(fEq.A06)));
        }
        bundle.putSerializable("RecipientPickerController.SELECTED_RECIPIENTS_LIST", Dba.A0e(this.A0r));
        if (this.A0V) {
            bundle.putSerializable("RecipientPickerController.UNIQUE_SELECTED_CHANNEL_INVITE_LIST", AnonymousClass7TE.A1D(this.A0O));
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C249403jg r0;
        C49916FEq fEq;
        this.A05.getClass();
        this.A05.setAdapter(this.A07);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), 1, false);
        this.A05.setLayoutManager(linearLayoutManager);
        boolean z = this.A0V;
        RecyclerView recyclerView = this.A05;
        if (z) {
            r0 = new C3251871j(linearLayoutManager, this.A14, C3251771i.A0A);
        } else {
            r0 = this.A0z;
        }
        recyclerView.A15(r0);
        ArrayList A052 = A05(this, this.A12.A01());
        this.A08.A05(A052);
        A0E(this, A052);
        if (bundle != null) {
            Serializable serializable = bundle.getSerializable("RecipientPickerController.SELECTED_RECIPIENTS");
            if (serializable != null) {
                ArrayList arrayList = (ArrayList) serializable;
                C49916FEq fEq2 = this.A0B;
                if (!(fEq2 == null || arrayList == null)) {
                    List list = fEq2.A06;
                    list.clear();
                    list.addAll(arrayList);
                    fEq2.A02.FLl((String) null, list, true, false);
                }
            }
            AbstractCollection abstractCollection = (AbstractCollection) bundle.getSerializable("RecipientPickerController.SELECTED_RECIPIENTS_LIST");
            ArrayList arrayList2 = (ArrayList) bundle.getSerializable("RecipientPickerController.UNIQUE_SELECTED_CHANNEL_INVITE_LIST");
            if (abstractCollection != null) {
                Iterator it = abstractCollection.iterator();
                while (it.hasNext()) {
                    DirectShareTarget A0f2 = DbT.A0f(it);
                    this.A0r.put(A0f2.A09(), A0f2);
                }
            }
            if (z && arrayList2 != null) {
                this.A0O.addAll(arrayList2);
            }
        }
        if (A0M().isEmpty()) {
            if (182.A06(0Tu.A05, this.A0g, 36318917765176056L) && (fEq = this.A0B) != null) {
                fEq.A02.EHP();
                fEq.A02.Eug();
            }
        }
        this.A0h.A06(this.A05, AnonymousClass3DZ.A00(this.A0m));
    }

    public final void onViewStateRestored(Bundle bundle) {
        G8J g8j;
        C49916FEq fEq = this.A0B;
        if (fEq != null && (g8j = fEq.A02) != null) {
            g8j.DzK();
        }
    }

    public static int A00(EEP eep) {
        return eep.A0N().size();
    }

    public static C337257fy A02(EEP eep) {
        if (eep.A0M().isEmpty() || !eep.A0V) {
            return eep.A0E;
        }
        return eep.A0c;
    }

    public static Integer A03(EEP eep, C337257fy r3) {
        Integer num;
        List list = (List) r3.Bo1();
        if (r3.isLoading()) {
            return AnonymousClass05K.A00;
        }
        if (r3.CT5()) {
            if (!eep.A0u || !list.isEmpty()) {
                return AnonymousClass05K.A0Y;
            }
            ViewGroup viewGroup = eep.A04;
            viewGroup.getClass();
            if (!C61970qY.A0F(viewGroup.getContext())) {
                num = AnonymousClass05K.A0N;
            } else {
                num = AnonymousClass05K.A0j;
            }
            C67089Mi7 mi7 = eep.A0o;
            int i = 3;
            if (num == AnonymousClass05K.A0N) {
                i = 2;
            }
            mi7.A05(i);
            return num;
        } else if (list != null && !list.isEmpty()) {
            return AnonymousClass05K.A01;
        } else {
            Integer num2 = AnonymousClass05K.A0C;
            eep.A0o.A05(1);
            return num2;
        }
    }

    public static ArrayList A04(EEP eep) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (!eep.A0V) {
            Iterator it = eep.A0N().iterator();
            while (it.hasNext()) {
                A1C.add(DbV.A0q(DbT.A0f(it).A09()));
            }
        } else {
            Iterator it2 = AnonymousClass7TE.A1D(eep.A0O).iterator();
            while (it2.hasNext()) {
                A1C.add(DbV.A0q(AnonymousClass7TE.A18(it2)));
            }
        }
        return A1C;
    }

    public static ArrayList A05(EEP eep, List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectShareTarget A0f2 = DbT.A0f(it);
            if (!A0f2.A0H()) {
                A1C.add(A0f2);
            }
        }
        ArrayList arrayList = A1C;
        if (!eep.A0s) {
            A1C = AnonymousClass7TE.A1C();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                DirectShareTarget A0f3 = DbT.A0f(it2);
                if (A0f3.A0R) {
                    A1C.add(A0f3);
                }
            }
            arrayList = A1C;
        }
        if (eep.A0V) {
            arrayList = AnonymousClass7TE.A1C();
            Iterator it3 = A1C.iterator();
            while (it3.hasNext()) {
                DirectShareTarget A0f4 = DbT.A0f(it3);
                if (A0f4.A04(eep.A0g.A06, false) == AnonymousClass05K.A00 || A0f4.A0B != null || DbY.A0W(A0f4, 0).A0X) {
                    arrayList.add(A0f4);
                }
            }
        }
        return arrayList;
    }

    public static boolean A0K(EEP eep, DirectShareTarget directShareTarget) {
        if (DbT.A14(directShareTarget).isEmpty()) {
            return false;
        }
        UserSession userSession = eep.A0g;
        User A002 = AnonymousClass48M.A00(userSession, DbY.A0W(directShareTarget, 0));
        if (eep.A0r.isEmpty() || A002.A2C() || !182.A06(0Tu.A05, userSession, 36325403165537213L)) {
            return false;
        }
        return true;
    }

    public final void A0Q() {
        boolean z;
        boolean z2;
        if (A00(this) != 0 || this.A0U || !A0M().isEmpty()) {
            z = false;
            A08(this, R.id.direct_broadcast_chats_entry_point, false);
            A08(this, R.id.direct_chooser_channel_entry_point, false);
        } else {
            if (!A0H() || (!A0I() && !A0G())) {
                z2 = false;
            } else {
                z2 = true;
            }
            z = true;
            if (z2) {
                A08(this, R.id.direct_chooser_channel_entry_point, true);
                C50338FYv fYv = this.A0j;
                ChannelCreationSource channelCreationSource = ChannelCreationSource.OMNIPICKER;
                fYv.A06(channelCreationSource);
                this.A0i.A0E(channelCreationSource, this.A0f);
                return;
            } else if (A0H()) {
                A08(this, R.id.direct_broadcast_chats_entry_point, true);
                C313756gx r3 = this.A0i;
                int i = this.A0f;
                r3.A01 = AnonymousClass7TF.A0b();
                1Ln A0J2 = DbT.A0J(r3);
                if (DbT.A1Y(A0J2)) {
                    DbW.A17(A0J2, r3);
                    Dba.A1D(A0J2, "broadcast_chat_option_viewed");
                    A0J2.A0p("omnipicker_view");
                    DbZ.A1L(A0J2, "dm_creation_omnipicker", i);
                    Dba.A1C(A0J2, r3);
                    return;
                }
                return;
            } else if (A0I()) {
                C50338FYv fYv2 = this.A0j;
                1Ln A002 = C50338FYv.A00(fYv2);
                if (DbT.A1Y(A002)) {
                    Dbb.A1G(A002, fYv2.A03);
                    Dba.A1D(A002, "create_social_channel_button_rendered");
                    A002.A0p("omnipicker_view");
                    Dba.A1E(A002, "dm_creation_omnipicker");
                    A002.Cgf();
                }
            } else {
                return;
            }
        }
        A08(this, R.id.direct_social_channel_entry_point, z);
    }

    public final void DMr(int i, boolean z) {
        AnonymousClass7TF.A0D().post(new C51355Fsn(this, i));
    }

    public final void DuH() {
        C337257fy A022 = A02(this);
        A022.getClass();
        A022.EJE();
    }

    public final /* synthetic */ 1GP AMy(C15050ULg uLg, String str) {
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v106, resolved type: X.NOJ} */
    /* JADX WARNING: type inference failed for: r0v54, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v55, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v56, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v60, types: [X.2tF] */
    /* JADX WARNING: type inference failed for: r0v105 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00e6, code lost:
        if (X.DbX.A1Z(X.2HM.A00(r3).A0c) == false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x010d, code lost:
        if (X.DbX.A1Z(X.2HM.A00(r3).A0b) == false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x011e, code lost:
        if (X.182.A06(r5, r3, 36313055139792555L) == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x00a4, code lost:
        if (X.182.A06(r5, r3, 36313055140120239L) != false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0246, code lost:
        if (r4.A0Q == false) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x02ac, code lost:
        if ((r6 instanceof X.E5H) == false) goto L_0x02ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x00b9, code lost:
        if (X.182.A06(X.0Tu.A06, r3, 36318917765110519L) == false) goto L_0x00bb;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EEP(X.C48140EZi r26, com.instagram.common.session.UserSession r27, X.G9Y r28, X.C67089Mi7 r29, java.lang.String r30, boolean r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36, boolean r37, boolean r38, boolean r39) {
        /*
            r25 = this;
            r4 = r25
            r4.<init>()
            java.util.LinkedHashMap r0 = X.AnonymousClass7TE.A1H()
            r4.A0r = r0
            r3 = 1
            r4.A0W = r3
            r2 = 0
            r4.A0X = r2
            r4.A00 = r2
            r4.A0a = r2
            r4.A0S = r2
            r4.A0Q = r2
            r0 = -1
            r4.A0b = r0
            r4.A0Z = r2
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            r4.A0q = r0
            r1 = 3
            X.Dmg r0 = new X.Dmg
            r0.<init>(r4, r1)
            r4.A0z = r0
            r1 = 9
            X.AWR r0 = new X.AWR
            r0.<init>(r4, r1)
            r4.A10 = r0
            X.FbS r0 = new X.FbS
            r0.<init>(r4)
            r4.A13 = r0
            X.Fas r0 = new X.Fas
            r0.<init>(r4)
            r4.A0l = r0
            X.Far r0 = new X.Far
            r0.<init>(r4)
            r4.A0k = r0
            X.Fbj r0 = new X.Fbj
            r0.<init>(r4, r3)
            r4.A14 = r0
            r3 = r27
            r4.A0g = r3
            X.0qQ.A0B(r3, r2)
            r0 = 0
            int r0 = X.C48809EkX.A00(r3, r0)
            r4.A0f = r0
            r6 = r28
            r4.A0m = r6
            r6.registerLifecycleListener(r4)
            X.7g1 r0 = new X.7g1
            r0.<init>()
            r4.A0p = r0
            r7 = r31
            r4.A16 = r7
            r0 = r32
            r4.A0U = r0
            r0 = r33
            r4.A0V = r0
            r0 = r34
            r4.A0T = r0
            r0 = r38
            r4.A0y = r0
            r0 = r30
            r4.A0H = r0
            r0 = r39
            r4.A0d = r0
            r0 = r26
            r4.A06 = r0
            X.0Tu r5 = X.0Tu.A05
            r0 = 2342156064350996112(0x20810288002b0690, double:4.059697225785784E-152)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 != 0) goto L_0x00a6
            r0 = 36313055140120239(0x810288005606af, double:3.027860519324024E-306)
            boolean r1 = X.182.A06(r5, r3, r0)
            r0 = 0
            if (r1 == 0) goto L_0x00a7
        L_0x00a6:
            r0 = 1
        L_0x00a7:
            r4.A0Y = r0
            boolean r0 = r4.A0T
            if (r0 != 0) goto L_0x00bb
            X.0Tu r8 = X.0Tu.A06
            r0 = 36318917765110519(0x8107dd00041af7, double:3.031568066974773E-306)
            boolean r0 = X.182.A06(r8, r3, r0)
            r1 = 1
            if (r0 != 0) goto L_0x00bc
        L_0x00bb:
            r1 = 0
        L_0x00bc:
            boolean r0 = r4.A0Y
            if (r0 != 0) goto L_0x00e8
            if (r1 != 0) goto L_0x00e8
            boolean r0 = X.AnonymousClass6FC.A01(r3)
            if (r0 != 0) goto L_0x00e8
            X.2HN r0 = X.2HM.A00(r3)
            X.0eK r0 = r0.A1S
            java.lang.Object r0 = r0.get()
            X.0qQ.A07(r0)
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x00e8
            X.2HN r0 = X.2HM.A00(r3)
            X.2HR r0 = r0.A0c
            boolean r1 = X.DbX.A1Z(r0)
            r0 = 1
            if (r1 != 0) goto L_0x00e9
        L_0x00e8:
            r0 = 0
        L_0x00e9:
            r4.A0w = r0
            boolean r0 = r4.A0Y
            if (r0 != 0) goto L_0x010f
            X.2HN r0 = X.2HM.A00(r3)
            X.0eK r0 = r0.A1S
            java.lang.Object r0 = r0.get()
            X.0qQ.A07(r0)
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x010f
            X.2HN r0 = X.2HM.A00(r3)
            X.2HR r0 = r0.A0b
            boolean r0 = X.DbX.A1Z(r0)
            r8 = 1
            if (r0 != 0) goto L_0x0110
        L_0x010f:
            r8 = 0
        L_0x0110:
            boolean r0 = r4.A0Y
            if (r0 == 0) goto L_0x0120
            r0 = 36313055139792555(0x810288005106ab, double:3.027860519116795E-306)
            boolean r1 = X.182.A06(r5, r3, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0121
        L_0x0120:
            r0 = 0
        L_0x0121:
            r4.A0P = r0
            boolean r0 = r4.A0Y
            if (r0 == 0) goto L_0x0295
            X.2HN r0 = X.2HM.A00(r3)
            X.2HR r0 = r0.A0h
            boolean r1 = X.DbX.A1Z(r0)
        L_0x0131:
            r4.A15 = r1
            r0 = 36320416709419416(0x81093a000f2198, double:3.032516005391484E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            r4.A0u = r0
            X.2HN r0 = X.2HM.A00(r3)
            X.2HR r0 = r0.A03
            boolean r0 = X.DbX.A1Z(r0)
            r4.A0x = r0
            X.2HN r0 = X.2HM.A00(r3)
            X.2HR r0 = r0.A0H
            java.lang.Object r0 = r0.A00()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            r4.A0t = r0
            r0 = r35
            r4.A0s = r0
            r0 = 36313944192977219(0x81035700040943, double:3.0284227599307066E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            r4.A0e = r0
            r0 = r36
            r4.A0v = r0
            r0 = r37
            r4.A0Z = r0
            android.content.Context r1 = r6.requireContext()
            X.FBP r0 = new X.FBP
            r0.<init>(r3, r1, r7)
            r4.A12 = r0
            X.17i r1 = X.17h.A00(r3)
            java.lang.String r0 = r3.A06
            com.instagram.user.model.User r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x01a9
            X.4Cl r0 = r0.A03
            com.instagram.api.schemas.FanClubInfoDict r1 = r0.B3v()
            if (r1 == 0) goto L_0x01a9
            java.lang.Integer r0 = r1.C2R()
            if (r0 == 0) goto L_0x01a9
            java.lang.Boolean r0 = r1.BB1()
            if (r0 == 0) goto L_0x01a9
            r1.C2R()
            java.lang.Boolean r0 = r1.BB1()
            boolean r0 = r0.booleanValue()
            r4.A0Q = r0
        L_0x01a9:
            android.content.Context r9 = r6.requireContext()
            X.2tC r8 = X.AnonymousClass2t9.A00(r9)
            com.instagram.common.session.UserSession r13 = r4.A0g
            X.G9b r15 = r4.A0l
            X.G9Y r7 = r4.A0m
            X.EGM r0 = new X.EGM
            r0.<init>(r9, r7, r13, r15)
            r8.A01(r0)
            X.We9 r1 = new X.We9
            r1.<init>(r4, r2)
            X.EG8 r0 = new X.EG8
            r0.<init>(r9, r1)
            r8.A01(r0)
            X.Etn r1 = new X.Etn
            r1.<init>(r4)
            X.EH6 r0 = new X.EH6
            r0.<init>(r7, r1)
            r8.A01(r0)
            X.Uhf r0 = new X.Uhf
            r0.<init>()
            r8.A01(r0)
            X.EFn r0 = new X.EFn
            r0.<init>()
            r8.A01(r0)
            X.EFf r0 = new X.EFf
            r0.<init>()
            r8.A01(r0)
            X.EFp r0 = new X.EFp
            r0.<init>(r4)
            r8.A01(r0)
            boolean r0 = r4.A0u
            if (r0 == 0) goto L_0x028e
            X.NOJ r0 = new X.NOJ
            r0.<init>(r4)
        L_0x0202:
            r8.A01(r0)
            boolean r6 = r4.A0T
            if (r6 != 0) goto L_0x021c
            X.Fx3 r5 = new X.Fx3
            r5.<init>(r9, r4)
            r0 = 4
            X.Fwc r1 = new X.Fwc
            r1.<init>(r0, r9, r4)
            X.EH5 r0 = new X.EH5
            r0.<init>(r1, r5)
            r8.A01(r0)
        L_0x021c:
            X.2t9 r0 = r8.A00()
            r4.A07 = r0
            android.content.Context r11 = r7.requireContext()
            java.lang.String r18 = r4.A0M()
            boolean r9 = r4.A0s
            boolean r8 = r4.A0v
            X.3mS r16 = X.C251033mS.A00(r13)
            X.7g1 r5 = r4.A0p
            X.2t9 r12 = r4.A07
            X.Pvs r14 = r4.A0k
            boolean r1 = r4.A0Z
            boolean r0 = r4.A0V
            boolean r7 = r4.A0G()
            if (r7 == 0) goto L_0x0248
            boolean r7 = r4.A0Q
            r24 = 1
            if (r7 != 0) goto L_0x024a
        L_0x0248:
            r24 = 0
        L_0x024a:
            X.FRO r10 = new X.FRO
            r22 = r1
            r23 = r0
            r20 = r9
            r21 = r8
            r19 = r6
            r17 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r4.A08 = r10
            r4.A08 = r10
            X.3E5 r0 = X.AnonymousClass3E4.A01(r4, r2, r2)
            r4.A11 = r0
            r0 = r29
            r4.A0o = r0
            X.6gx r0 = X.C313746gw.A00(r3)
            r4.A0i = r0
            X.FYv r0 = X.C69866NtU.A00(r3)
            r4.A0j = r0
            X.OZd r0 = X.C71026OZd.A00(r3)
            r4.A0n = r0
            X.2el r0 = X.2el.A00()
            r4.A0h = r0
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            r4.A0O = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r4.A0N = r0
            return
        L_0x028e:
            X.EFm r0 = new X.EFm
            r0.<init>()
            goto L_0x0202
        L_0x0295:
            boolean r0 = X.AnonymousClass6FC.A01(r3)
            if (r0 != 0) goto L_0x02ae
            if (r8 != 0) goto L_0x02ae
            X.2HN r0 = X.2HM.A00(r3)
            X.2HR r0 = r0.A0h
            boolean r0 = X.DbX.A1Z(r0)
            if (r0 == 0) goto L_0x02ae
            boolean r0 = r6 instanceof X.E5H
            r1 = 1
            if (r0 != 0) goto L_0x0131
        L_0x02ae:
            r1 = 0
            goto L_0x0131
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EEP.<init>(X.EZi, com.instagram.common.session.UserSession, X.G9Y, X.Mi7, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
