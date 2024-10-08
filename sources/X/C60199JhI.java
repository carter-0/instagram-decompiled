package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.JhI  reason: case insensitive filesystem */
public final class C60199JhI extends 2YL {
    public String A00;
    public final KWY A01;
    public final 1Xj A02;
    public final AnonymousClass0r6 A03;
    public final 0V2 A04;
    public final 05G A05;
    public final AnonymousClass0Ud A06;
    public final C54434HDi A07;

    public C60199JhI(KWY kwy, C54434HDi hDi, String str, String str2) {
        1Xj r0;
        HN3 hn3;
        MQJ mqj;
        Object value;
        HN3 hn32;
        L0M l0m;
        MQJ mqj2;
        String str3;
        this.A01 = kwy;
        this.A07 = hDi;
        Integer num = AnonymousClass05K.A00;
        05D A012 = 10D.A01(num, 0, 0);
        this.A04 = A012;
        this.A03 = A012;
        if (str2 != null) {
            r0 = DbV.A0U(hDi.A01, str2);
        } else {
            r0 = null;
        }
        this.A02 = r0;
        if (DbU.A02((AnonymousClass3QO) kwy.A03.getValue(), 0) == 1) {
            hn3 = HN3.A06;
        } else {
            hn3 = HN3.A07;
        }
        L0M l0m2 = (L0M) kwy.A04.getValue();
        1Xj r3 = this.A02;
        ImageUrl imageUrl = null;
        if (r3 == null || C51966G9m.A11(r3) == null) {
            mqj = C65027Lm6.A00;
        } else {
            User A11 = C51966G9m.A11(r3);
            if (A11 != null) {
                str3 = A11.getUsername();
            } else {
                str3 = "";
            }
            User A112 = C51966G9m.A11(r3);
            mqj = new IQA(A112 != null ? A112.A03.Bh3() : imageUrl, str3);
        }
        02z A10 = DbS.A10(new C61074JwC(l0m2, hn3, mqj));
        this.A05 = A10;
        this.A06 = 10b.A03(A10);
        this.A00 = "";
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        if (decodeFile != null) {
            do {
                value = A10.getValue();
                C61074JwC jwC = (C61074JwC) value;
                hn32 = (HN3) jwC.A00;
                l0m = (L0M) jwC.A03;
                mqj2 = (MQJ) jwC.A01;
                0qQ.A0B(hn32, 0);
                AnonymousClass7TF.A1C(l0m, 2, mqj2);
            } while (!A10.AIY(value, new C61074JwC(decodeFile, l0m, hn32, mqj2)));
        }
        C318136oS A002 = C318116oQ.A00(this);
        C66183MGu mGu = new C66183MGu(this, (AnonymousClass4D7) null, 17);
        19B r32 = 19B.A00;
        1Eo.A03(num, r32, mGu, A002);
        1Eo.A03(num, r32, new C66183MGu(this, (AnonymousClass4D7) null, 18), C318116oQ.A00(this));
    }
}
