package X;

import com.instagram.music.common.model.LyricsPhrase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Waj  reason: case insensitive filesystem */
public final class C19497Waj implements X8Z {
    public final C18439Vri A00;
    public final List A01;
    public final List A02;

    public final int AYh(int i) {
        return C17038VFm.A00(this.A01, i);
    }

    public final String BcG(int i) {
        if (i >= 0) {
            List list = this.A01;
            if (i < list.size()) {
                return ((LyricsPhrase) list.get(i)).A01;
            }
        }
        throw DbT.A0m();
    }

    public final int BcH() {
        return this.A01.size();
    }

    public final int Byp(int i) {
        if (i >= 0) {
            List list = this.A01;
            if (i < list.size()) {
                return ((LyricsPhrase) list.get(i)).A00;
            }
        }
        throw DbT.A0m();
    }

    public C19497Waj(C18439Vri vri, List list) {
        int size;
        this.A02 = list;
        this.A00 = vri;
        ArrayList arrayList = new ArrayList();
        List A002 = new C17854Vh7(vri, list).A00();
        StringBuilder sb = new StringBuilder();
        int size2 = A002.size();
        int i = 0;
        while (i < size2) {
            sb.setLength(0);
            int A0I = C51971G9r.A0I(A002, i);
            i++;
            Number number = (Number) 00k.A0O(A002, i);
            if (number != null) {
                size = number.intValue();
            } else {
                size = list.size();
            }
            Iterator it = list.subList(A0I, size).iterator();
            while (it.hasNext()) {
                C15092UOk.A00(sb, it);
            }
            arrayList.add(new LyricsPhrase((List) null, ((C15092UOk) list.get(A0I)).A01() + 750, DbT.A10(sb)));
        }
        this.A01 = arrayList;
    }
}
