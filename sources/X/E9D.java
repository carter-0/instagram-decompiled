package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

public final class E9D extends 2Ru {
    public boolean A00 = false;
    public boolean A01 = true;
    public final Handler A02 = new Handler();
    public final C47488E4s A03;
    public final Runnable A04 = new C51277FrW(this);
    public final List A05 = AnonymousClass7TE.A1C();
    public final List A06 = AnonymousClass7TE.A1C();
    public final Map A07 = AnonymousClass7TE.A1E();
    public final Map A08 = AnonymousClass7TE.A1E();
    public final C355638Qt A09 = new C355638Qt(1);
    public final EA9 A0A;
    public final C46437Dez A0B;
    public final String A0C;

    public E9D(Context context, AnonymousClass0iw r6, C47488E4s e4s) {
        super(false);
        this.A03 = e4s;
        this.A0C = context.getResources().getString(2131968486);
        EA9 ea9 = new EA9(r6, this);
        this.A0A = ea9;
        C46437Dez dez = new C46437Dez(context);
        this.A0B = dez;
        init(new C231642s0[]{ea9, dez});
    }

    public static void A00(E9D e9d) {
        boolean contains;
        List list;
        boolean contains2;
        e9d.clear();
        if (e9d.A00 || !e9d.A06.isEmpty() || !e9d.A05.isEmpty()) {
            int i = 0;
            if (!e9d.A01) {
                while (true) {
                    List list2 = e9d.A06;
                    if (i >= list2.size()) {
                        break;
                    }
                    User A0g = DbS.A0g(list2, i);
                    if (A0g != null) {
                        Map map = e9d.A08;
                        C49511Ewq ewq = (C49511Ewq) map.get(A0g);
                        if (ewq == null) {
                            ewq = new C49511Ewq(A0g);
                            map.put(A0g, ewq);
                        }
                        Map map2 = e9d.A07;
                        if (map2.containsKey(A0g)) {
                            contains = AnonymousClass7TE.A1a(map2.get(A0g));
                        } else {
                            contains = e9d.A05.contains(A0g);
                        }
                        ewq.A00 = contains;
                        e9d.addModel(ewq, e9d.A0A);
                    }
                    i++;
                }
            } else {
                int i2 = 0;
                while (true) {
                    list = e9d.A05;
                    if (i2 >= list.size()) {
                        break;
                    }
                    User A0g2 = DbS.A0g(list, i2);
                    if (A0g2 != null) {
                        Map map3 = e9d.A08;
                        C49511Ewq ewq2 = (C49511Ewq) map3.get(A0g2);
                        if (ewq2 == null) {
                            ewq2 = new C49511Ewq(A0g2);
                            map3.put(A0g2, ewq2);
                        }
                        ewq2.A00 = true;
                        e9d.addModel(ewq2, e9d.A0A);
                    }
                    i2++;
                }
                while (true) {
                    List list3 = e9d.A06;
                    if (i >= list3.size()) {
                        break;
                    }
                    User A0g3 = DbS.A0g(list3, i);
                    if (A0g3 != null && !list.contains(A0g3)) {
                        Map map4 = e9d.A08;
                        C49511Ewq ewq3 = (C49511Ewq) map4.get(A0g3);
                        if (ewq3 == null) {
                            ewq3 = new C49511Ewq(A0g3);
                            map4.put(A0g3, ewq3);
                        }
                        Map map5 = e9d.A07;
                        if (map5.containsKey(A0g3)) {
                            contains2 = AnonymousClass7TE.A1a(map5.get(A0g3));
                        } else {
                            contains2 = list.contains(A0g3);
                        }
                        ewq3.A00 = contains2;
                        e9d.addModel(ewq3, e9d.A0A);
                    }
                    i++;
                }
            }
        } else {
            e9d.addModel(e9d.A0C, e9d.A0B);
        }
        e9d.notifyDataSetChanged();
    }

    public final long getItemId(int i) {
        long A002;
        int i2;
        int A032 = AnonymousClass0fD.A03(-1323814876);
        Object item = getItem(i);
        if (this.A0C.equals(item)) {
            A002 = 0;
            i2 = 1284517121;
        } else if (item instanceof C49511Ewq) {
            A002 = this.A09.A00(((C49511Ewq) item).A01.getId());
            i2 = 1423887594;
        } else {
            IllegalStateException A0z = AnonymousClass7TE.A0z(AnonymousClass000.A00(4139));
            AnonymousClass0fD.A0A(458595055, A032);
            throw A0z;
        }
        AnonymousClass0fD.A0A(i2, A032);
        return A002;
    }
}
