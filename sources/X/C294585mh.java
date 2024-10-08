package X;

import com.instagram.api.schemas.RIXULayoutFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5mh  reason: invalid class name and case insensitive filesystem */
public final class C294585mh {
    public List A00;
    public final AnonymousClass3Y6 A01;

    public C294585mh(AnonymousClass3Y6 r8, C292805jY r9) {
        int i;
        List unmodifiableList;
        String A30;
        this.A01 = r8;
        List A07 = C295325ny.A07(r8.A0M);
        ArrayList arrayList = new ArrayList();
        for (Object next : A07) {
            if (((C267324bN) next).A01 == C295365o2.ORGANIC) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = arrayList;
        List list = r8.A0K;
        if (!(list == null || (unmodifiableList = Collections.unmodifiableList(list)) == null || unmodifiableList.isEmpty())) {
            List unmodifiableList2 = Collections.unmodifiableList(list);
            arrayList = new ArrayList();
            for (Object next2 : arrayList2) {
                C267324bN r0 = (C267324bN) next2;
                if (unmodifiableList2 != null) {
                    1Xj r02 = r0.A02;
                    if (r02 == null || (A30 = r02.A30()) == null) {
                        throw new IllegalStateException("Required value was null.");
                    } else if (unmodifiableList2.contains(A30)) {
                        arrayList.add(next2);
                    }
                }
            }
        }
        this.A00 = arrayList;
        if (r9 != null && r9.A00()) {
            RIXULayoutFormat rIXULayoutFormat = r9.A01;
            if (rIXULayoutFormat != null) {
                int ordinal = rIXULayoutFormat.ordinal();
                if (ordinal != 3) {
                    i = ordinal == 2 ? 4 : i;
                } else {
                    i = 6;
                }
                this.A00 = 00k.A0d(this.A00, i);
            }
            throw new IllegalArgumentException("Invalid RIXULayoutFormat");
        }
        if (this.A00.isEmpty()) {
            0wb.A03("ClipsNetegoItems", "ClipsNetegoItems.clipsItems should not be empty.");
        }
    }
}
