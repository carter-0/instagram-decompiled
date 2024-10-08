package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public final /* synthetic */ class DH9 implements B1V {
    public final /* synthetic */ AnonymousClass7Z6 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ boolean A07;

    public /* synthetic */ DH9(AnonymousClass7Z6 r1, String str, String str2, String str3, String str4, String str5, List list, boolean z) {
        this.A00 = r1;
        this.A07 = z;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A06 = list;
        this.A05 = str5;
    }

    public final 1bp AXP(C70621ODs oDs, DirectThreadKey directThreadKey, Boolean bool, Long l) {
        AnonymousClass7Z6 r0 = this.A00;
        boolean z = this.A07;
        String str = this.A01;
        String str2 = this.A02;
        String str3 = this.A03;
        String str4 = this.A04;
        List list = this.A06;
        String str5 = this.A05;
        1bp r8 = new 1bp(C66669Mac.A05(r0.A00, oDs, C65641fB.class, str, z), directThreadKey, l, AnonymousClass7TG.A0H());
        r8.A01 = str2;
        String format = String.format(Locale.US, "https://www.instagram.com/_n/profile_shop?link_id=%s", Arrays.copyOf(new Object[]{str2}, 1));
        0qQ.A07(format);
        C254873tC A0I = C71152OeO.A0I(str3, str4, format);
        if (list != null) {
            List A0X = 00k.A0X(list);
            ArrayList<String> A1C = AnonymousClass7TE.A1C();
            for (Object next : A0X) {
                if (((String) next).length() > 0) {
                    A1C.add(next);
                }
            }
            ArrayList A0r = AnonymousClass7TG.A0r(A1C);
            for (String extendedImageUrl : A1C) {
                A0r.add(new ExtendedImageUrl(extendedImageUrl, -1, -1));
            }
            if (A0r.size() == 6) {
                A0I.A1d = A0r;
            }
        }
        r8.A03 = Collections.singletonList(A0I);
        r8.A02 = str5;
        return r8;
    }
}
