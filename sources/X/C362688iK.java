package X;

import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.Folder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8iK  reason: invalid class name and case insensitive filesystem */
public final class C362688iK implements C361528gN {
    public List A00;
    public final C357638Yz A01;
    public final C361588gT A02;
    public final AnonymousClass8XW A03;
    public final UserSession A04;
    public final 05G A05;

    public C362688iK(UserSession userSession, C357638Yz r3, AnonymousClass8XW r4) {
        0qQ.A0B(r4, 2);
        this.A04 = userSession;
        this.A03 = r4;
        this.A01 = r3;
        this.A02 = C361578gS.A00(userSession);
        List emptyList = Collections.emptyList();
        0qQ.A07(emptyList);
        this.A00 = emptyList;
        this.A05 = r4.A0C;
    }

    public final Folder getCurrentFolder() {
        return this.A03.A02;
    }

    public final List getFolders() {
        0sn unmodifiableList;
        boolean isEmpty;
        boolean isEmpty2;
        boolean A06 = 182.A06(0Tu.A06, this.A04, 36311010730049947L);
        AnonymousClass8XW r1 = this.A03;
        Comparator comparator = C64078LLw.A00;
        0qQ.A0B(comparator, 2);
        ArrayList A042 = r1.A04();
        ArrayList A052 = r1.A05();
        ArrayList arrayList = new ArrayList();
        Iterator it = A042.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Folder folder = (Folder) next;
            if (folder != null) {
                int i = folder.A02;
                if (i == -5) {
                    if (A06) {
                        isEmpty2 = this.A01.A08.A00 instanceof AnonymousClass80O;
                    }
                } else if (i == -1) {
                    if (folder.A05.isEmpty()) {
                        C361588gT r2 = this.A02;
                        0qQ.A0B(r2, 0);
                        if (!(!((C361628gX) r2.A07.getValue()).A02.isEmpty()) && !(!((List) r2.A06.getValue()).isEmpty())) {
                        }
                    }
                    arrayList.add(next);
                } else if (i != -10) {
                    isEmpty2 = folder.A05.isEmpty();
                }
                if (isEmpty2) {
                }
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = A052.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            Folder folder2 = (Folder) next2;
            if (folder2 != null) {
                int i2 = folder2.A02;
                if (i2 == -5) {
                    if (A06) {
                        isEmpty = this.A01.A08.A00 instanceof AnonymousClass80O;
                    }
                } else if (i2 == -1) {
                    if (folder2.A05.isEmpty()) {
                        C361588gT r7 = this.A02;
                        0qQ.A0B(r7, 0);
                        if (!(!((C361628gX) r7.A07.getValue()).A02.isEmpty()) && !(!((List) r7.A06.getValue()).isEmpty())) {
                        }
                    }
                    arrayList2.add(next2);
                } else if (i2 != -10) {
                    isEmpty = folder2.A05.isEmpty();
                }
                if (isEmpty) {
                }
                arrayList2.add(next2);
            }
        }
        List A0g = 00k.A0g(00k.A0S(arrayList2, arrayList), comparator);
        if (A0g.size() == 1 && ((Folder) A0g.get(0)).A02 == -5) {
            unmodifiableList = 0sn.A00;
        } else {
            unmodifiableList = Collections.unmodifiableList(A0g);
            0qQ.A0A(unmodifiableList);
        }
        this.A00 = unmodifiableList;
        return unmodifiableList;
    }
}
