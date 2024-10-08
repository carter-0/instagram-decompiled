package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Dg5  reason: case insensitive filesystem */
public final class C46502Dg5 {
    public static final AnonymousClass2hV A0J = C46572DhE.A00;
    public int A00;
    public int A01;
    public int A02;
    public final Comparator A03 = new C51566FwC((Object) this, 3);
    public final Comparator A04 = new C51566FwC((Object) this, 4);
    public final HashSet A05 = AnonymousClass7TE.A1F();
    public final AnonymousClass0eK A06;
    public final Context A07;
    public final UserSession A08;
    public final C363288jT A09;
    public final String A0A;
    public final ArrayList A0B = AnonymousClass7TE.A1C();
    public final HashMap A0C = AnonymousClass7TE.A1E();
    public final HashMap A0D = AnonymousClass7TE.A1E();
    public final HashSet A0E = AnonymousClass7TE.A1F();
    public final HashSet A0F = AnonymousClass7TE.A1F();
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public final ArrayList A03(List list) {
        0qQ.A0B(list, 0);
        if (list.isEmpty()) {
            return AnonymousClass7TE.A1D(this.A0B);
        }
        ArrayList arrayList = this.A0B;
        ArrayList A0v = DbS.A0v(DbT.A01(list, arrayList.size()));
        A0v.addAll(arrayList);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectShareTarget directShareTarget = (DirectShareTarget) it.next();
            Object obj = this.A0D.get(A0J.apply(directShareTarget));
            HashMap hashMap = this.A0C;
            C254783t2 r1 = directShareTarget.A09;
            r1.getClass();
            Object obj2 = hashMap.get(C66647MaG.A03(AnonymousClass6W3.A06(r1)));
            if (obj == null && obj2 == null) {
                A0v.add(directShareTarget);
            }
        }
        return A0v;
    }

    public final void A04(String str) {
        HashSet hashSet = this.A0F;
        hashSet.clear();
        HashSet hashSet2 = this.A05;
        hashSet2.clear();
        HashSet hashSet3 = this.A0E;
        hashSet3.clear();
        HashMap hashMap = this.A0D;
        hashMap.clear();
        HashMap hashMap2 = this.A0C;
        hashMap2.clear();
        this.A0B.clear();
        this.A00 = 0;
        this.A02 = 0;
        this.A01 = 0;
        if (this.A0G || str.length() != 0) {
            boolean z = this.A0H;
            if (z) {
                ((2Dm) this.A06.get()).AVA(str, hashSet2, hashSet3);
                Iterator A1G = AnonymousClass7TE.A1G(hashSet2);
                while (A1G.hasNext()) {
                    Object next = A1G.next();
                    0qQ.A07(next);
                    AnonymousClass2Ep r5 = (AnonymousClass2Ep) next;
                    hashMap2.put(r5.BJy(), C46503Dg6.A00(this.A07, this.A08, r5));
                }
                hashSet3.removeAll(hashSet2);
                Iterator A1G2 = AnonymousClass7TE.A1G(hashSet3);
                while (A1G2.hasNext()) {
                    Object next2 = A1G2.next();
                    0qQ.A07(next2);
                    AnonymousClass2Ep r52 = (AnonymousClass2Ep) next2;
                    if (r52.CY7() || r52.BRZ().size() != 1) {
                        hashMap2.put(r52.BJy(), C46503Dg6.A00(this.A07, this.A08, r52));
                    } else {
                        hashMap.put(((User) r52.BRZ().get(0)).getId(), C46503Dg6.A00(this.A07, this.A08, r52));
                    }
                }
            }
            this.A09.A08((1UV) null, this.A0A, str, hashSet);
            Iterator A1G3 = AnonymousClass7TE.A1G(hashSet);
            while (A1G3.hasNext()) {
                Object next3 = A1G3.next();
                0qQ.A07(next3);
                User user = (User) next3;
                String id = user.getId();
                if (!hashMap.containsKey(id)) {
                    List singletonList = Collections.singletonList(new PendingRecipient(user));
                    0qQ.A07(singletonList);
                    hashMap.put(id, new DirectShareTarget(new C291175gg(singletonList), AnonymousClass50n.A07(user), singletonList, true));
                }
            }
            if (!z) {
                A01(true);
            } else if (this.A0I) {
                A00(true);
                A01(false);
            } else {
                A01(true);
                A00(false);
            }
        }
    }

    private final void A00(boolean z) {
        ArrayList arrayList = this.A0B;
        this.A00 = arrayList.size();
        if (z) {
            for (Object next : this.A0D.values()) {
                0qQ.A07(next);
                DirectShareTarget directShareTarget = (DirectShareTarget) next;
                if (directShareTarget.A08() != null) {
                    arrayList.add(directShareTarget);
                }
            }
        }
        arrayList.addAll(this.A0C.values());
        List subList = arrayList.subList(this.A00, arrayList.size());
        0qQ.A07(subList);
        01V.A1D(subList, this.A03);
    }

    private final void A01(boolean z) {
        ArrayList arrayList = this.A0B;
        this.A02 = arrayList.size();
        Collection values = this.A0D.values();
        if (!z) {
            for (Object next : values) {
                0qQ.A07(next);
                DirectShareTarget directShareTarget = (DirectShareTarget) next;
                if (directShareTarget.A08() == null) {
                    arrayList.add(directShareTarget);
                }
            }
        } else {
            arrayList.addAll(values);
        }
        int size = arrayList.size();
        this.A01 = size;
        this.A09.A07(A0J, this.A0A, this.A04, arrayList.subList(this.A02, size));
    }

    public C46502Dg5(Context context, UserSession userSession, String str, AnonymousClass0eK r6, boolean z, boolean z2, boolean z3) {
        AnonymousClass7TG.A1O(context, userSession);
        this.A07 = context;
        this.A08 = userSession;
        this.A06 = r6;
        this.A0A = str;
        this.A0G = z;
        this.A0H = z2;
        this.A0I = z3;
        C363288jT A002 = C363288jT.A00(userSession);
        0qQ.A07(A002);
        this.A09 = A002;
    }

    public final C67335MmB A02(List list) {
        ArrayList A032 = A03(list);
        return new C67335MmB(A032.subList(this.A02, this.A01), A032);
    }
}
