package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5jv  reason: invalid class name and case insensitive filesystem */
public final class C293035jv implements 1wn {
    public final /* synthetic */ C293025ju A00;

    public C293035jv(C293025ju r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        List list;
        C293025ju r4;
        String str;
        String str2;
        OFQ ofq;
        DirectMessageIdentifier directMessageIdentifier;
        OFQ ofq2;
        DirectMessageIdentifier directMessageIdentifier2;
        int A03 = AnonymousClass0fD.A03(805258008);
        2Kb r8 = (2Kb) obj;
        int A032 = AnonymousClass0fD.A03(1711168676);
        0qQ.A0B(r8, 0);
        Integer num = r8.A01;
        if (num == AnonymousClass05K.A0F) {
            r4 = this.A00;
        } else {
            if (num == AnonymousClass05K.A0Y && (list = r8.A03) != null) {
                r4 = this.A00;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str3 = ((AnonymousClass9VM) it.next()).A03;
                        C331037Pg r0 = r4.A00;
                        if (r0 == null || (ofq2 = r0.A02) == null || (directMessageIdentifier2 = ofq2.A01) == null) {
                            str = null;
                        } else {
                            str = directMessageIdentifier2.A00;
                        }
                        if (!0qQ.A0K(str3, str)) {
                            C331037Pg r02 = r4.A00;
                            if (r02 == null || (ofq = r02.A02) == null || (directMessageIdentifier = ofq.A01) == null) {
                                str2 = null;
                            } else {
                                str2 = directMessageIdentifier.A02;
                            }
                            if (0qQ.A0K(str3, str2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            AnonymousClass0fD.A0A(393122371, A032);
            AnonymousClass0fD.A0A(344588025, A03);
        }
        r4.A02(true);
        AnonymousClass0fD.A0A(393122371, A032);
        AnonymousClass0fD.A0A(344588025, A03);
    }
}
