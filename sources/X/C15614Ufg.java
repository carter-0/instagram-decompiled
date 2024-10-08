package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Ufg  reason: case insensitive filesystem */
public final class C15614Ufg extends 1P0 {
    public final UserSession A00;
    public final AnonymousClass49H A01;
    public final AnonymousClass3PS A02;
    public final Set A03;
    public final boolean A04;

    public C15614Ufg(UserSession userSession, AnonymousClass49H r2, AnonymousClass3PS r3, Set set, boolean z) {
        this.A00 = userSession;
        this.A01 = r2;
        this.A03 = set;
        this.A02 = r3;
        this.A04 = z;
    }

    public final void onFail(C268654dm r6) {
        int A0D = AnonymousClass7TG.A0D(r6, -54371696);
        Set set = this.A03;
        1XQ r0 = (1XQ) r6.A00();
        if (r0 != null && r0.mStatusCode == 429) {
            1OH.A00(this.A00).A07.put("reels_media", C51968G9o.A0u());
        }
        AnonymousClass3G6.A00(this.A00).A03(r6, this.A01);
        this.A02.A02(set);
        AnonymousClass0fD.A0A(-1349728730, A0D);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(1871360190);
        AnonymousClass3G6.A00(this.A00).A05(this.A01);
        AnonymousClass0fD.A0A(1451590076, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(-2105800126);
        AnonymousClass3G6.A00(this.A00).A04(this.A01);
        AnonymousClass0fD.A0A(217136528, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(387716781);
        C250903mF r14 = (C250903mF) obj;
        int A033 = AnonymousClass0fD.A03(1099468416);
        0qQ.A0B(r14, 0);
        UserSession userSession = this.A00;
        AnonymousClass3G6.A00(userSession).A06(this.A01, r14);
        HashMap A034 = r14.A03(userSession);
        0qQ.A07(A034);
        HashMap hashMap = new HashMap();
        Iterator A0u = Pxf.A0u(A034);
        while (true) {
            boolean z = true;
            if (!A0u.hasNext()) {
                break;
            }
            Object next = A0u.next();
            AnonymousClass3HX r2 = (AnonymousClass3HX) A034.get(next);
            if (r2 != null) {
                1Ns A012 = AnonymousClass3P9.A01(userSession, r2);
                if (A012 == null || A012.CAm() != AnonymousClass05K.A01 || !0qQ.A0K(DbT.A0j(userSession), A012.CCd())) {
                    z = false;
                }
                Reel A0I = ReelStore.A03(userSession).A0I(r2, z);
                A0I.A0Y(false);
                hashMap.put(next, A0I);
            }
        }
        hashMap.keySet();
        AnonymousClass3PS r8 = this.A02;
        r8.A01(hashMap);
        HashSet hashSet = new HashSet(this.A03);
        hashSet.removeAll(hashMap.keySet());
        if (DbT.A1b(hashSet)) {
            if (this.A04) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Reel A0M = ReelStore.A03(userSession).A0M(AnonymousClass7TE.A18(it));
                    if (A0M != null) {
                        0sn r1 = 0sn.A00;
                        A0M.A0t = new ArrayList(r1);
                        A0M.A0u = new ArrayList(r1);
                        A0M.A0X(r1);
                    }
                }
            }
            r8.A03(hashSet);
        }
        AnonymousClass0fD.A0A(-2058007612, A033);
        AnonymousClass0fD.A0A(-821274313, A032);
    }
}
