package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.CameraTool;
import com.instagram.feed.media.CameraToolInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.AAr  reason: case insensitive filesystem */
public abstract class C39820AAr {
    public static final ArrayList A01(C349307zv r6, int i, int i2, int i3) {
        int i4;
        ArrayList A1C = AnonymousClass7TE.A1C();
        C59796JYp A01 = C59796JYp.A01(r6.A0k, 0);
        0qQ.A07(A01);
        int i5 = (int) A01.A03;
        int i6 = 0;
        while (i5 > 0 && A1C.size() < i) {
            if (i5 >= i2 + i3) {
                i4 = i2;
            } else {
                i4 = i5;
                if (i5 > i2) {
                    i4 = i5 - i3;
                }
            }
            C349307zv A03 = r6.A03();
            A03.A0H = i6;
            i6 += i4;
            A03.A06 = i6;
            A1C.add(A03);
            i5 -= i4;
        }
        String A0j = AnonymousClass7TG.A0j();
        int size = A1C.size();
        for (int i7 = 0; i7 < size; i7++) {
            C349307zv r1 = (C349307zv) A1C.get(i7);
            r1.A0p = A0j;
            r1.A0D = i7;
            r1.A0C = A1C.size();
        }
        return A1C;
    }

    public static final AnonymousClass51M A00(C349307zv r27, int i, int i2) {
        ArrayList arrayList;
        ImmutableList copyOf;
        C349307zv r0 = r27;
        int i3 = r0.A07;
        AnonymousClass51R A01 = C39821AAs.A01(r0, r0.A06(), i2, i3, 0, i3, i3);
        List list = r0.A0u;
        List list2 = r0.A0y;
        if (list2 == null || (copyOf = ImmutableList.copyOf((Collection) list2)) == null) {
            arrayList = null;
        } else {
            arrayList = AnonymousClass7TG.A0r(copyOf);
            Iterator it = copyOf.iterator();
            while (it.hasNext()) {
                CameraTool cameraTool = ((AnonymousClass55X) it.next()).A01;
                Float valueOf = Float.valueOf(0.0f);
                arrayList.add(new CameraToolInfo(cameraTool, valueOf, valueOf, valueOf));
            }
        }
        AnonymousClass51M r6 = new AnonymousClass51M((C53401GnY) null, (0v6) null, new AnonymousClass51S(list, arrayList, (Set) null, 1.0f, -1, false), A01, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, 0, 0, 0, 0, 0, 1073741820, false, false, false, false);
        int i4 = i;
        if (i3 > i4) {
            i3 = i4;
        }
        r6.A08 = i3;
        return r6;
    }
}
