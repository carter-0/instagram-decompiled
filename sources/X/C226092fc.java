package X;

import com.instagram.user.model.User;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.2fc  reason: invalid class name and case insensitive filesystem */
public final class C226092fc implements 1wn {
    public final /* synthetic */ C226062fZ A00;

    public C226092fc(C226062fZ r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(375525301);
        AnonymousClass3EL r9 = (AnonymousClass3EL) obj;
        int A032 = AnonymousClass0fD.A03(-802260985);
        C226062fZ r5 = this.A00;
        C226062fZ.A00(r5);
        if (r5.A00 != null && !1AW.A06(0Tu.A05, 18301761886359557L)) {
            User user = r9.A00;
            List list = r9.A01;
            list.addAll(r9.A02);
            list.add(user.getId());
            Set stringSet = AnonymousClass0xl.A00(C61170le.A00).A00.getStringSet(AnonymousClass000.A00(1741), (Set) null);
            if (stringSet == null) {
                stringSet = new HashSet();
            }
            stringSet.addAll(list);
            r5.A02(user, stringSet);
        }
        AnonymousClass0fD.A0A(2098295126, A032);
        AnonymousClass0fD.A0A(1177302700, A03);
    }
}
