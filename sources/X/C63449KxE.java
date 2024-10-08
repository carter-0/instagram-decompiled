package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.KxE  reason: case insensitive filesystem */
public abstract class C63449KxE {
    public static final Long A00(ImageUrl imageUrl) {
        String str;
        C291265gs A06 = new 11S("oe=[0-9A-Za-z]+").A06(JTP.A0o(imageUrl), 0);
        if (A06 != null) {
            String group = A06.A01.group();
            0qQ.A07(group);
            str = 00p.A0g(group, "oe=", "", false);
        } else {
            str = "";
        }
        return 00y.A0n(16, str);
    }
}
