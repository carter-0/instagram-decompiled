package com.instagram.direct.send.msys.sharesender;

import X.0eP;
import X.0eS;
import X.0sL;
import X.1Xj;
import X.1a8;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass6EY;
import X.AnonymousClass6W3;
import X.AnonymousClass7TE;
import X.AnonymousClass9HR;
import X.C254783t2;
import X.C304566Ea;
import X.C60340gF;
import X.C66582MXn;
import X.C66583MXo;
import X.C71148Oe6;
import X.C72064Ovd;
import X.C73036PTt;
import X.JTP;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.send.msys.sharesender.XmaShareSenderHelper$sendXmaPostShare$1", f = "XmaShareSenderHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class XmaShareSenderHelper$sendXmaPostShare$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ 1a8 A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ ImageUrl A04;
    public final /* synthetic */ 1Xj A05;
    public final /* synthetic */ 1Xj A06;
    public final /* synthetic */ C254783t2 A07;
    public final /* synthetic */ User A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XmaShareSenderHelper$sendXmaPostShare$1(1a8 r2, UserSession userSession, ImageUrl imageUrl, 1Xj r5, 1Xj r6, C254783t2 r7, User user, String str, String str2, String str3, String str4, String str5, AnonymousClass4D7 r14, int i, int i2) {
        super(2, r14);
        this.A05 = r5;
        this.A0C = str;
        this.A06 = r6;
        this.A02 = r2;
        this.A03 = userSession;
        this.A07 = r7;
        this.A0A = str2;
        this.A01 = i;
        this.A08 = user;
        this.A09 = str3;
        this.A0D = str4;
        this.A00 = i2;
        this.A0B = str5;
        this.A04 = imageUrl;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.4D7, com.instagram.direct.send.msys.sharesender.XmaShareSenderHelper$sendXmaPostShare$1] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r18) {
        1Xj r4 = this.A05;
        String str = this.A0C;
        1Xj r5 = this.A06;
        1a8 r1 = this.A02;
        UserSession userSession = this.A03;
        C254783t2 r6 = this.A07;
        String str2 = this.A0A;
        int i = this.A01;
        User user = this.A08;
        String str3 = this.A09;
        String str4 = this.A0D;
        int i2 = this.A00;
        return new XmaShareSenderHelper$sendXmaPostShare$1(r1, userSession, this.A04, r4, r5, r6, user, str, str2, str3, str4, this.A0B, r18, i, i2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((XmaShareSenderHelper$sendXmaPostShare$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        String A2Z;
        byte[] bArr;
        String str;
        int i;
        int i2;
        0eS.A00(obj);
        1Xj r3 = this.A05;
        String str2 = this.A0C;
        0eP A042 = C71148Oe6.A04(r3, str2, true);
        if (A042 == null) {
            A042 = new 0eP((Object) null, (Object) null);
        }
        ExtendedImageUrl extendedImageUrl = (ExtendedImageUrl) A042.A00;
        Bitmap bitmap = (Bitmap) A042.A01;
        1Xj r11 = this.A06;
        String id = r11.getId();
        if (!(id == null || (A2Z = r11.A2Z()) == null)) {
            1a8 r5 = this.A02;
            UserSession userSession = this.A03;
            C304566Ea r1 = AnonymousClass6EY.A00(userSession, "XmaShareSenderHelper").A00;
            AnonymousClass9HR A032 = AnonymousClass6W3.A03(this.A07);
            String str3 = this.A0A;
            int i3 = this.A01;
            User user = this.A08;
            String username = user.getUsername();
            String id2 = user.getId();
            String str4 = this.A09;
            C71148Oe6 oe6 = C71148Oe6.A00;
            String A012 = C71148Oe6.A01(userSession, r11, r11.A0C.B6n(), user);
            String str5 = this.A0D;
            int i4 = this.A00;
            if (bitmap != null) {
                bArr = C71148Oe6.A07(bitmap);
            } else {
                bArr = null;
            }
            if (extendedImageUrl != null) {
                str = C71148Oe6.A02(extendedImageUrl.A0A);
                i = extendedImageUrl.getHeight();
                i2 = extendedImageUrl.getWidth();
            } else {
                str = "image/jpeg";
                i = 0;
                i2 = 0;
            }
            String str6 = this.A0B;
            ImageUrl imageUrl = this.A04;
            byte[] A092 = oe6.A09(imageUrl, str2);
            String A022 = C71148Oe6.A02(JTP.A0o(imageUrl));
            r5.A02(C66582MXn.A0N(C304566Ea.A01(r1, A032).A0M(new C72064Ovd(A092, C66583MXo.A0c(imageUrl.getHeight(), -1), C66583MXo.A0c(imageUrl.getWidth(), -1), r1, bArr, str3, username, id, id2, A2Z, str4, A012, str5, str, A022, str6, i3, i4, i, i2, 0)), "instagram_xma_client_send"), C73036PTt.A00);
        }
        return C60340gF.A00;
    }
}
