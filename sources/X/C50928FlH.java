package X;

import java.util.List;

/* renamed from: X.FlH  reason: case insensitive filesystem */
public final class C50928FlH implements 0Jv {
    public final /* synthetic */ String A00;
    public final /* synthetic */ List A01;

    public C50928FlH(List list, String str) {
        this.A01 = list;
        this.A00 = str;
    }

    public final /* bridge */ /* synthetic */ void AId(Object obj) {
        Eu1 eu1 = (Eu1) obj;
        if (eu1 != null && !0mp.A0B(eu1.A00)) {
            List list = this.A01;
            String str = this.A00;
            String str2 = eu1.A00;
            if (str2 != null) {
                list.add(FHC.A06(str, str2, "Instagram", "Instagram", "inactive_logged_in_accounts"));
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
