package X;

import android.content.Context;
import com.google.common.io.Files;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9yQ  reason: invalid class name and case insensitive filesystem */
public abstract class C394629yQ {
    public static final ArrayList A00(Context context, UserSession userSession, String str, List list) {
        List<AnonymousClass51M> list2 = list;
        0qQ.A0B(list2, 2);
        String str2 = str;
        ArrayList A0q = AnonymousClass7TF.A0q(str2, 3);
        for (AnonymousClass51M r0 : list2) {
            File A03 = C39907AIy.A03(2Nm.A00(context, userSession), str2, ".mp4", "duplicate_copy");
            Files.A01(AnonymousClass7TE.A0t(r0.A0F.A0F), A03);
            AnonymousClass51R r1 = r0.A0F;
            C349307zv r4 = new C349307zv(C282665Eg.A03(A03, 3, 0), r1.A09, r1.A05, r1.A07);
            int i = r0.A0F.A08;
            int i2 = r0.A08 - r0.A09;
            AnonymousClass51R A00 = C39821AAs.A00(r4, i, i2, i2);
            AnonymousClass51S r39 = r0.A0E;
            float f = r0.A00;
            int i3 = r0.A09;
            int i4 = r0.A08;
            boolean z = r0.A0Q;
            0v6 r19 = r0.A0D;
            boolean z2 = r0.A0N;
            boolean z3 = r0.A0R;
            boolean z4 = r0.A0T;
            String str3 = r0.A0H;
            C53401GnY gnY = r0.A0C;
            String str4 = r0.A0L;
            String str5 = r0.A0M;
            int i5 = r0.A07;
            C53401GnY gnY2 = gnY;
            AnonymousClass51S r20 = r39;
            String str6 = str3;
            AnonymousClass51M r17 = new AnonymousClass51M(gnY2, r19, r20, A00, str6, str4, str5, r0.A0K, (String) null, f, i3, i4, r0.A05, i5, r0.A06, r0.A04, 1069550656, z, z2, z3, z4);
            r17.A0Q = true;
            A0q.add(r17);
        }
        return A0q;
    }
}
