package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ota  reason: case insensitive filesystem */
public final class C71949Ota implements C232312tT {
    public final Context A00;
    public final LayoutInflater A01;
    public final C232252tJ A02;
    public final UserSession A03;
    public final AnonymousClass9HS A04;
    public final HashMap A05 = AnonymousClass7TE.A1E();
    public final C61480nO A06;
    public volatile String A07;

    public C71949Ota(Context context, LayoutInflater layoutInflater, C232252tJ r4, UserSession userSession, AnonymousClass9HS r6, String str) {
        0qQ.A0B(str, 6);
        this.A03 = userSession;
        this.A00 = context;
        this.A02 = r4;
        this.A01 = layoutInflater;
        this.A04 = r6;
        this.A07 = str;
        C61480nO A002 = 0nY.A00();
        0qQ.A07(A002);
        this.A06 = A002;
    }

    public final void CJN(String str) {
        0qQ.A0B(str, 0);
        if (182.A06(0Tu.A05, this.A03, 36317835433350754L)) {
            this.A07 = str;
            HashMap hashMap = this.A05;
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator A0s = AnonymousClass7TF.A0s(hashMap);
            while (A0s.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                int A0M = AnonymousClass7TE.A0M(A1J.getKey());
                int size = ((C330767Oc) A1J.getValue()).A01.size();
                ArrayList A0v = DbS.A0v(size);
                for (int i = 0; i < size; i++) {
                    AnonymousClass7TF.A1M(A0v, A0M);
                }
                018.A16(A0v, A1C);
            }
            hashMap.clear();
            A01(A1C);
        }
    }

    public final void A01(List list) {
        long j;
        UserSession userSession = this.A03;
        0Tu r6 = 0Tu.A05;
        if (182.A06(r6, userSession, 36317835433350754L)) {
            ArrayList A0m = C51970G9q.A0m(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int A0F = AnonymousClass7TG.A0F(it);
                HashMap hashMap = this.A05;
                Integer valueOf = Integer.valueOf(A0F);
                Object obj = hashMap.get(valueOf);
                if (obj == null) {
                    obj = new C330767Oc();
                    hashMap.put(valueOf, obj);
                }
                C330767Oc r3 = (C330767Oc) obj;
                C232232tF A012 = this.A02.A01(A0F);
                int i = r3.A00;
                if (A012 instanceof AnonymousClass76L) {
                    j = 36599310410386916L;
                } else {
                    j = 36599310410321379L;
                }
                if (i < DbS.A04(r6, userSession, j)) {
                    r3.A00++;
                    A0m.add(valueOf);
                }
            }
            if (DbT.A1b(A0m)) {
                A00(this, A0m);
            }
        }
    }

    public final C249703kE AX2(int i) {
        C249703kE r1;
        ViewParent viewParent;
        View view;
        HashMap hashMap = this.A05;
        Integer valueOf = Integer.valueOf(i);
        C330767Oc r0 = (C330767Oc) hashMap.get(valueOf);
        if (r0 != null) {
            r1 = (C249703kE) r0.A01.poll();
            if (!(r1 == null || (view = r1.itemView) == null)) {
                viewParent = view.getParent();
            }
            viewParent = null;
        } else {
            r1 = null;
            viewParent = null;
        }
        if (viewParent == null) {
            return r1;
        }
        0KC.A0Q("IgRecyclerViewMessageThreadViewHolderPreloader", C273654mx.A00(1272), new Object[]{valueOf});
        return null;
    }

    public static final void A00(C71949Ota ota, List list) {
        if (AnonymousClass7TE.A1b(list)) {
            ota.A06.ATE(new C68670NSc(ota, ota.A07, list));
        }
    }
}
