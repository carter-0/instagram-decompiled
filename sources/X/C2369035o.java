package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.35o  reason: invalid class name and case insensitive filesystem */
public final class C2369035o implements 27S {
    public final /* synthetic */ AnonymousClass35W A00;

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        0qQ.A0B(obj, 0);
        return true;
    }

    public C2369035o(AnonymousClass35W r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        AnonymousClass2rI r0;
        int A03 = AnonymousClass0fD.A03(892610178);
        C2370736f r10 = (C2370736f) obj;
        int A032 = AnonymousClass0fD.A03(1504553163);
        0qQ.A0B(r10, 0);
        AnonymousClass35W r3 = this.A00;
        C227802jw r7 = (C227802jw) r3.A0b.get();
        if (r7 == null) {
            i = -1950891054;
        } else {
            if (r10.A03) {
                User user = r10.A00;
                if (user.A1s() && r10.A02 && (r0 = (AnonymousClass2rI) r7.getAdapter()) != null) {
                    r0.A0E(user);
                }
            }
            if (r10.A04) {
                if (182.A06(0Tu.A05, r3.A0T, 36317517610423558L)) {
                    r7.A0A().A0O().A0C((AnonymousClass2l3) null, AnonymousClass05K.A0j);
                }
                boolean z = false;
                if (r10.A00.A1u()) {
                    z = true;
                }
                r7.A0A().A0O().A0D(!z);
            }
            if (r10.A01) {
                UserSession userSession = r3.A0T;
                AnonymousClass4JK A002 = AnonymousClass4JJ.A00(userSession);
                AnonymousClass2rI r1 = (AnonymousClass2rI) r7.getAdapter();
                if (r1 != null) {
                    C58750Iwx iwx = new C58750Iwx(22, r10, r3, A002);
                    List BQW = r1.BQW();
                    ArrayList<1Xj> arrayList = new ArrayList<>();
                    for (Object next : BQW) {
                        if (((Boolean) iwx.invoke(next)).booleanValue()) {
                            arrayList.add(next);
                        }
                    }
                    for (1Xj A003 : arrayList) {
                        AnonymousClass4JK.A00(userSession, A003, r10.A00);
                    }
                }
            }
            i = 683324592;
        }
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(-2047260894, A03);
    }
}
