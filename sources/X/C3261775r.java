package X;

import com.google.common.collect.ImmutableList;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.75r  reason: invalid class name and case insensitive filesystem */
public final class C3261775r implements 27S {
    public final /* synthetic */ C3261475o A00;

    public C3261775r(C3261475o r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        2Kb r3 = (2Kb) obj;
        0qQ.A0B(r3, 0);
        List list = r3.A02;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        List list2 = r3.A04;
        if (list2 == null || list2.isEmpty()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        String str;
        Object obj2;
        C254873tC r0;
        ExtendedImageUrl extendedImageUrl;
        C254873tC r02;
        Integer num;
        int A03 = AnonymousClass0fD.A03(-1512334265);
        2Kb r11 = (2Kb) obj;
        int A032 = AnonymousClass0fD.A03(-903739544);
        0qQ.A0B(r11, 0);
        C3261475o r3 = this.A00;
        0sn r1 = r11.A02;
        if (r1 == null) {
            r1 = 0sn.A00;
        }
        0sn r03 = r11.A04;
        if (r03 == null) {
            r03 = 0sn.A00;
        }
        ArrayList A0S = 00k.A0S(r03, r1);
        AnonymousClass9IB r04 = r3.A04.A00;
        if (r04 == null || !r04.A01) {
            AnonymousClass7IJ r12 = r3.A05;
            if (!r12.A00()) {
                if (182.A06(0Tu.A05, r12.A00, 36318535512955105L)) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = A0S.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        C254703su r2 = (C254703su) next;
                        2FW r13 = r2.A10;
                        if ((r13 == 2FW.A0O || r13 == 2FW.A0J) && !0qQ.A0K(r2.A1u, r3.A02.A06)) {
                            arrayList.add(next);
                        }
                    }
                    Iterator it2 = 00k.A0g(arrayList, new C41279ArK()).iterator();
                    while (true) {
                        str = null;
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        ImmutableList A0H = ((C254703su) obj2).A0H();
                        if (A0H != null && (r02 = (C254873tC) 00k.A0J(A0H)) != null && (num = r02.A0f) != null && num.intValue() == 1) {
                            break;
                        }
                    }
                    C254703su r22 = (C254703su) obj2;
                    if (r22 != null) {
                        ImmutableList A0H2 = r22.A0H();
                        if (!(A0H2 == null || (r0 = (C254873tC) 00k.A0J(A0H2)) == null || (extendedImageUrl = r0.A0X) == null)) {
                            str = extendedImageUrl.A0A;
                        }
                        r3.A00(new NTH(str));
                    }
                }
            }
        }
        AnonymousClass0fD.A0A(-978936553, A032);
        AnonymousClass0fD.A0A(555008712, A03);
    }
}
