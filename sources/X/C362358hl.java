package X;

import android.content.Context;
import android.util.Pair;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.8hl  reason: invalid class name and case insensitive filesystem */
public final class C362358hl implements C320536sX {
    public C63847L9c A00;
    public List A01;
    public boolean A02;
    public final Context A03;
    public final UserSession A04;
    public final AnonymousClass8XH A05;
    public final C362018hC A06;
    public final C362008hB A07;
    public final C362428hs A08;
    public final String A09;
    public final Set A0A;

    /* JADX WARNING: type inference failed for: r0v7, types: [X.2tF, java.lang.Object] */
    public C362358hl(Context context, UserSession userSession, AnonymousClass8XH r8, C362018hC r9, C362008hB r10, String str, List list) {
        0qQ.A0B(userSession, 2);
        0qQ.A0B(str, 5);
        0qQ.A0B(list, 8);
        this.A03 = context;
        this.A04 = userSession;
        this.A05 = r8;
        this.A09 = str;
        this.A06 = r9;
        this.A07 = r10;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((C369988ve) next).A09) {
                arrayList.add(next);
            }
        }
        this.A01 = arrayList;
        this.A0A = new LinkedHashSet();
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(this.A03);
        A002.A01(new C362368hm(this.A04, this.A05, this.A06, this));
        A002.A01(new Object());
        A002.A08 = true;
        A002.A06 = "StoryDraftsGalleryItemAdapter";
        this.A08 = new C362428hs(A002.A00());
    }

    public final void A00(List list) {
        0qQ.A0B(list, 0);
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((C369988ve) next).A09) {
                arrayList.add(next);
            }
        }
        this.A01 = arrayList;
        AnonymousClass2t9 r7 = this.A08.A01;
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        UserSession userSession = this.A04;
        if (!182.A06(0Tu.A05, userSession, 36320253499678855L) && 1Au.A00(userSession).A1r()) {
            String string = this.A03.getString(2131974410);
            0qQ.A07(string);
            viewModelListUpdate.A00(new C362418hr(string));
        }
        List list2 = this.A01;
        ArrayList arrayList2 = new ArrayList(0Yv.A1E(list2, 10));
        int i = 0;
        for (Object next2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            } else {
                arrayList2.add(new C362408hq((C369988ve) next2, i));
                i = i2;
            }
        }
        viewModelListUpdate.A01(arrayList2);
        r7.A05(viewModelListUpdate);
    }

    public final void A01(Set set) {
        Number number;
        C365758nd r0;
        0qQ.A0B(set, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object next : this.A01) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            if (set.contains(next)) {
                linkedHashMap.put(next, Integer.valueOf(i));
            }
            i = i2;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C369988ve r2 = (C369988ve) it.next();
            if (linkedHashMap.containsKey(r2)) {
                number = (Number) linkedHashMap.get(r2);
            } else {
                number = 0;
            }
            27r A012 = 27p.A01(this.A04);
            C363928ka A002 = r2.A00();
            if (A002 != null) {
                r0 = A002.A02;
            } else {
                r0 = null;
            }
            28t A062 = C59895JbK.A06(r0);
            String str = r2.A05;
            String str2 = this.A09;
            if (number != null) {
                int intValue = number.intValue();
                A012.A0r(new Pair(Integer.valueOf((intValue / 3) + 1), Integer.valueOf((intValue % 3) + 1)), A062, str, str2);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public final void A02(boolean z) {
        this.A02 = z;
        Set set = this.A0A;
        set.clear();
        this.A07.DSc(set.size());
        this.A08.A01.notifyDataSetChanged();
    }

    public final C296915qr B9q(int i) {
        C296915qr B9q = this.A08.B9q(i);
        0qQ.A07(B9q);
        return B9q;
    }
}
