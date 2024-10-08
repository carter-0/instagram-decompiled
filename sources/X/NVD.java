package X;

import android.content.res.Resources;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class NVD extends C67759MuF {
    public final N3R A04(GMQ gmq, C69285Nil nil, User user, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, String str3, String str4, ArrayList arrayList, List list, int i, boolean z) {
        String str5;
        String str6 = str2;
        String str7 = str;
        User user2 = user;
        N3R A04 = super.A04(gmq, nil, user2, bool, bool2, bool3, bool4, str7, str6, str3, str4, arrayList, list, i, z);
        Resources resources = this.A01;
        if (user != null) {
            str5 = user2.getUsername();
        } else {
            str5 = "";
        }
        String A0e = AnonymousClass7TF.A0e(resources, str5, 2131970908);
        if (str == null) {
            return A04;
        }
        if (str2 == null) {
            str6 = 002.A0B(A0e);
            0qQ.A07(str6);
        }
        C68193N5i n5i = new C68193N5i(str7, (Integer) null, str6);
        List list2 = A04.A0E;
        List list3 = A04.A0C;
        List list4 = A04.A0F;
        List list5 = A04.A0D;
        String str8 = A04.A0A;
        String str9 = A04.A09;
        User user3 = A04.A04;
        Boolean bool5 = A04.A06;
        Boolean bool6 = A04.A07;
        GMQ gmq2 = A04.A01;
        C69285Nil nil2 = A04.A03;
        int i2 = A04.A00;
        boolean z2 = A04.A0G;
        boolean z3 = A04.A0H;
        Boolean bool7 = A04.A08;
        ArrayList arrayList2 = A04.A0B;
        Boolean bool8 = A04.A05;
        0qQ.A0B(list2, 0);
        AnonymousClass7TF.A1B(list3, 1, list4);
        Boolean bool9 = bool6;
        return new N3R(gmq2, n5i, nil2, user3, bool5, bool9, bool7, bool8, str8, str9, arrayList2, list2, list3, list4, list5, i2, z2, z3);
    }
}
