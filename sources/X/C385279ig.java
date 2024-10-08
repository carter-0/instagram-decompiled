package X;

import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9ig  reason: invalid class name and case insensitive filesystem */
public final class C385279ig extends 1P0 {
    public final /* synthetic */ C346677vZ A00;
    public final /* synthetic */ C62320sa A01;

    public C385279ig(C346677vZ r1, C62320sa r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int A03 = AnonymousClass0fD.A03(1406409583);
        CFC cfc = (CFC) obj;
        int A0D = AnonymousClass7TG.A0D(cfc, -616901977);
        C346677vZ r8 = this.A00;
        if (!r8.A03) {
            r8.A03 = true;
            0xY A0N = AnonymousClass7TF.A0N(r8.A04);
            A0N.E5T("has_fetched_audience_lists_share_info", true);
            A0N.apply();
        }
        r8.A01(cfc.A00.size());
        C346687va r4 = r8.A02;
        for (C61113JxP jxP : cfc.A00) {
            String valueOf = String.valueOf(jxP.A01);
            if (r4 != null) {
                str = r4.A01;
            } else {
                str = null;
            }
            if (0qQ.A0K(valueOf, str)) {
                String str2 = r4.A01;
                String str3 = r4.A02;
                int i = jxP.A00;
                List<User> list = jxP.A05;
                ArrayList A0r = AnonymousClass7TG.A0r(list);
                for (User Bh3 : list) {
                    A0r.add(Bh3.Bh3().getUrl());
                }
                r8.A03(str2, str3, A0r, i, r4.A04, r4.A05);
            }
            r8.A00();
        }
        this.A01.invoke();
        AnonymousClass0fD.A0A(-1267605092, A0D);
        AnonymousClass0fD.A0A(-1026700252, A03);
    }
}
