package X;

import com.instagram.model.hashtag.Hashtag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.35l  reason: invalid class name and case insensitive filesystem */
public final class C2368735l implements 27S {
    public final /* synthetic */ AnonymousClass35W A00;

    public C2368735l(AnonymousClass35W r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        C2370436c r2 = (C2370436c) obj;
        0qQ.A0B(r2, 0);
        return r2.A01;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        String str;
        Hashtag B6n;
        int A03 = AnonymousClass0fD.A03(-1270675955);
        C2370436c r14 = (C2370436c) obj;
        int A032 = AnonymousClass0fD.A03(-1301795844);
        0qQ.A0B(r14, 0);
        C227812jx r0 = (C227812jx) this.A00.A0b.get();
        if (r0 == null) {
            i = -342129213;
        } else {
            AnonymousClass2rI r2 = (AnonymousClass2rI) r0.getAdapter();
            if (r2 != null) {
                Hashtag hashtag = r14.A00;
                AnonymousClass2rW r6 = (AnonymousClass2rW) r2.A00;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = r6.A02.iterator();
                0qQ.A07(it);
                while (it.hasNext()) {
                    Object next = it.next();
                    1Xg r11 = (1Xg) next;
                    0qQ.A0B(r11, 0);
                    if (r11.A06 == 1UQ.A0Y) {
                        1Xj A02 = 1Xi.A02(r11.A05);
                        if (A02 == null || (B6n = A02.A0C.B6n()) == null) {
                            str = null;
                        } else {
                            str = B6n.getId();
                        }
                        if (0qQ.A0K(str, hashtag.getId())) {
                            arrayList.add(next);
                        }
                    }
                    arrayList2.add(next);
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    r6.A0C(it2.next());
                }
                r6.A01 = Collections.unmodifiableList(arrayList2);
                AnonymousClass2rW.A00(r6);
                r2.A0A(-1);
            }
            i = 516946586;
        }
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(-1035361079, A03);
    }
}
