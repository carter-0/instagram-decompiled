package X;

import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.PfO  reason: case insensitive filesystem */
public final class C73559PfO extends AnonymousClass1Ek implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73559PfO(1a8 r2, UserSession userSession, ImageUrl imageUrl, 1Xj r5, C254783t2 r6, User user, String str, String str2, String str3, AnonymousClass4D7 r11, int i, int i2, int i3) {
        super(2, r11);
        this.A00 = i3;
        this.A05 = r5;
        this.A0B = str;
        this.A06 = r2;
        this.A08 = userSession;
        this.A07 = r6;
        this.A09 = str2;
        this.A01 = i;
        this.A03 = user;
        this.A02 = i2;
        this.A0A = str3;
        this.A04 = imageUrl;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.4D7, X.PfO] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r16) {
        int i;
        int i2 = this.A00;
        1Xj r4 = (1Xj) this.A05;
        String str = this.A0B;
        1a8 r1 = (1a8) this.A06;
        UserSession userSession = (UserSession) this.A08;
        C254783t2 r5 = (C254783t2) this.A07;
        String str2 = this.A09;
        int i3 = this.A01;
        User user = (User) this.A03;
        int i4 = this.A02;
        String str3 = this.A0A;
        ImageUrl imageUrl = (ImageUrl) this.A04;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        return new C73559PfO(r1, userSession, imageUrl, r4, r5, user, str, str2, str3, r16, i3, i4, i);
    }

    public final Object invokeSuspend(Object obj) {
        1a8 r2;
        byte[] bArr;
        String str;
        int i;
        int i2;
        1aU A0N;
        1aV r0;
        int i3 = this.A00;
        0eS.A00(obj);
        1Xj r5 = (1Xj) this.A05;
        String str2 = this.A0B;
        0eP A032 = C71148Oe6.A03(r5, str2);
        if (i3 == 0) {
            if (A032 == null) {
                A032 = new 0eP((Object) null, (Object) null);
            }
            ImageUrl imageUrl = (ImageUrl) A032.A00;
            Bitmap bitmap = (Bitmap) A032.A01;
            String valueOf = String.valueOf(r5.A2Z());
            if (valueOf == null || valueOf.length() == 0) {
                0wb.A04(str2, "Media code is null or empty", 1);
            }
            r2 = (1a8) this.A06;
            UserSession userSession = (UserSession) this.A08;
            C304566Ea r14 = AnonymousClass6EY.A00(userSession, "XmaShareSenderHelper").A00;
            AnonymousClass9HR A033 = AnonymousClass6W3.A03((C254783t2) this.A07);
            String str3 = this.A09;
            int i4 = this.A01;
            User user = (User) this.A03;
            String username = user.getUsername();
            String id = r5.getId();
            if (id != null) {
                C71148Oe6 oe6 = C71148Oe6.A00;
                String A012 = C71148Oe6.A01(userSession, r5, r5.A0C.B6n(), user);
                int i5 = this.A02;
                if (bitmap != null) {
                    bArr = C71148Oe6.A07(bitmap);
                } else {
                    bArr = null;
                }
                if (imageUrl != null) {
                    str = C71148Oe6.A02(JTP.A0o(imageUrl));
                    i = imageUrl.getHeight();
                    i2 = imageUrl.getWidth();
                } else {
                    str = "image/jpeg";
                    i = 0;
                    i2 = 0;
                }
                String str4 = this.A0A;
                ImageUrl imageUrl2 = (ImageUrl) this.A04;
                byte[] A092 = oe6.A09(imageUrl2, str2);
                String A022 = C71148Oe6.A02(JTP.A0o(imageUrl2));
                A0N = C66582MXn.A0N(C304566Ea.A01(r14, A033).A0M(new C72119Owe(r14, C66583MXo.A0c(imageUrl2.getHeight(), -1), C66583MXo.A0c(imageUrl2.getWidth(), -1), str3, username, id, valueOf, A012, str, A022, str4, bArr, A092, i4, i5, i, i2, 2)), "instagram_xma_clips_share_client_send");
                r0 = C73033PTq.A00;
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else if (A032 != null) {
            ImageUrl imageUrl3 = (ImageUrl) A032.A00;
            Bitmap bitmap2 = (Bitmap) A032.A01;
            r2 = (1a8) this.A06;
            UserSession userSession2 = (UserSession) this.A08;
            C304566Ea r142 = AnonymousClass6EY.A00(userSession2, "XmaShareSenderHelper").A00;
            AnonymousClass9HR A034 = AnonymousClass6W3.A03((C254783t2) this.A07);
            String str5 = this.A09;
            int i6 = this.A01;
            User user2 = (User) this.A03;
            String username2 = user2.getUsername();
            String id2 = r5.getId();
            if (id2 != null) {
                String valueOf2 = String.valueOf(r5.A2Z());
                C71148Oe6 oe62 = C71148Oe6.A00;
                String A013 = C71148Oe6.A01(userSession2, r5, r5.A0C.B6n(), user2);
                int i7 = this.A02;
                byte[] A072 = C71148Oe6.A07(bitmap2);
                String A023 = C71148Oe6.A02(JTP.A0o(imageUrl3));
                int height = imageUrl3.getHeight();
                int width = imageUrl3.getWidth();
                String str6 = this.A0A;
                ImageUrl imageUrl4 = (ImageUrl) this.A04;
                byte[] A093 = oe62.A09(imageUrl4, str2);
                String A024 = C71148Oe6.A02(JTP.A0o(imageUrl4));
                A0N = C66582MXn.A0N(C304566Ea.A01(r142, A034).A0M(new C72119Owe(r142, C66583MXo.A0c(imageUrl4.getHeight(), -1), C66583MXo.A0c(imageUrl4.getWidth(), -1), str5, username2, id2, valueOf2, A013, A023, A024, str6, A072, A093, i6, i7, height, width, 0)), "instagram_xma_igtv_share_client_send");
                r0 = C73035PTs.A00;
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else {
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        r2.A02(A0N, r0);
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C73559PfO) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
