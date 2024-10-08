package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;

public final class E9M extends 2Ru implements C231272rL, AnonymousClass7Q7 {
    public final ArrayList A00 = AnonymousClass7TE.A1C();
    public final HashSet A01 = AnonymousClass7TE.A1F();
    public final C47636EAw A02;
    public final C49624Ezh A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public E9M(Context context, AnonymousClass0iw r9, UserSession userSession, C49624Ezh ezh, G88 g88, String str) {
        super(false);
        0qQ.A0B(userSession, 1);
        this.A04 = str;
        this.A03 = ezh;
        Context context2 = context;
        AnonymousClass0iw r2 = r9;
        C47636EAw eAw = new C47636EAw(context2, r2, userSession, ezh, g88, 182.A06(0Tu.A05, userSession, 36328710290357806L));
        this.A02 = eAw;
        DbU.A1Q(this, eAw);
    }

    public final boolean AJe(String str) {
        0qQ.A0B(str, 0);
        return this.A01.contains(str);
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public static final void A00(E9M e9m) {
        AnonymousClass3UL r1;
        e9m.clear();
        HashSet hashSet = e9m.A01;
        hashSet.clear();
        e9m.A03.A01.A00.clear();
        ArrayList arrayList = e9m.A00;
        int size = arrayList.size();
        2HZ A0B = C229632nm.A0B(C229632nm.A0C(0, size), 2);
        int i = A0B.A00;
        int i2 = A0B.A01;
        int i3 = A0B.A02;
        if (i3 <= 0 ? !(i3 >= 0 || i2 > i) : i <= i2) {
            while (true) {
                AnonymousClass3UL A002 = ((AnonymousClass3UI) arrayList.get(i)).A00();
                if (A002 != null) {
                    int i4 = i + 1;
                    if (i4 < size) {
                        r1 = ((AnonymousClass3UI) arrayList.get(i4)).A00();
                    } else {
                        r1 = null;
                    }
                    hashSet.add(A002.getId());
                    if (r1 != null) {
                        hashSet.add(r1.getId());
                    }
                    e9m.addModel(AnonymousClass7TE.A1L(A002, r1), new C47173Dro(i, e9m.A04, false), e9m.A02);
                    if (i == i2) {
                        break;
                    }
                    i += i3;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
        e9m.notifyDataSetChanged();
    }

    public final void FK4() {
        A00(this);
    }
}
