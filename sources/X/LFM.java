package X;

import com.instagram.api.schemas.MediaKitVisibility;
import com.instagram.common.gallery.Medium;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class LFM {
    public C61216Jz9 A00;
    public C61221JzE A01;
    public List A02 = 0sn.A00;
    public final ArrayList A03 = AnonymousClass7TE.A1C();
    public final ArrayList A04 = AnonymousClass7TE.A1C();
    public final HashMap A05 = AnonymousClass7TE.A1E();

    public final List A00(C61221JzE jzE) {
        if (jzE != null) {
            List list = jzE.A06;
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                1Xj r6 = (1Xj) next;
                0qQ.A0B(r6, 0);
                A0r.add(new C61264Jzx((Medium) null, r6, AnonymousClass05K.A00, "", i));
                i = i2;
            }
            this.A02 = A0r;
        }
        return this.A02;
    }

    public final void A01(MWJ mwj, String str, String str2, List list) {
        C61216Jz9 jz9;
        C61221JzE jzE;
        C61221JzE jzE2 = this.A01;
        C61221JzE jzE3 = null;
        if (jzE2 != null) {
            List list2 = jzE2.A06;
            String str3 = jzE2.A02;
            String str4 = jzE2.A03;
            boolean z = jzE2.A07;
            User user = jzE2.A01;
            String str5 = jzE2.A04;
            String str6 = jzE2.A05;
            MediaKitVisibility mediaKitVisibility = jzE2.A00;
            if (list != null) {
                list2 = list;
            }
            if (str != null) {
                str6 = str;
            }
            if (str2 != null) {
                str3 = str2;
            }
            if (mwj != null) {
                C61108JxK jxK = (C61108JxK) mwj;
                mediaKitVisibility = jxK.A00;
                0qQ.A0B(mediaKitVisibility, 0);
                str5 = jxK.A01;
            }
            AnonymousClass7TH.A0K();
            jzE3 = new C61221JzE(mediaKitVisibility, user, str3, str4, str5, str6, list2, z);
        }
        this.A01 = jzE3;
        if (mwj != null && (jz9 = this.A00) != null && (jzE = jz9.A00) != null) {
            String str7 = jz9.A01;
            List list3 = jz9.A02;
            C61108JxK jxK2 = (C61108JxK) mwj;
            MediaKitVisibility mediaKitVisibility2 = jxK2.A00;
            String str8 = jxK2.A01;
            List list4 = jzE.A06;
            String str9 = jzE.A02;
            String str10 = jzE.A03;
            boolean z2 = jzE.A07;
            User user2 = jzE.A01;
            String str11 = jzE.A05;
            AnonymousClass7TF.A1D(list4, 0, user2);
            C51972G9s.A1E(str11, mediaKitVisibility2);
            this.A00 = C63314Kux.A00(new C61221JzE(mediaKitVisibility2, user2, str9, str10, str8, str11, list4, z2), str7, list3);
        }
    }
}
