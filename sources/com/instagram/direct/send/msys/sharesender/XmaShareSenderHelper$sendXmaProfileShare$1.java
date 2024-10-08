package com.instagram.direct.send.msys.sharesender;

import X.0eS;
import X.0sL;
import X.1NK;
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
import X.C72055OvU;
import X.C73037PTu;
import X.JTP;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.send.msys.sharesender.XmaShareSenderHelper$sendXmaProfileShare$1", f = "XmaShareSenderHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class XmaShareSenderHelper$sendXmaProfileShare$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ 1a8 A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ C254783t2 A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XmaShareSenderHelper$sendXmaProfileShare$1(1a8 r2, UserSession userSession, ImageUrl imageUrl, C254783t2 r5, User user, String str, String str2, AnonymousClass4D7 r9) {
        super(2, r9);
        this.A04 = user;
        this.A06 = str;
        this.A00 = r2;
        this.A01 = userSession;
        this.A03 = r5;
        this.A02 = imageUrl;
        this.A05 = str2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.direct.send.msys.sharesender.XmaShareSenderHelper$sendXmaProfileShare$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        User user = this.A04;
        String str = this.A06;
        return new XmaShareSenderHelper$sendXmaProfileShare$1(this.A00, this.A01, this.A02, this.A03, user, str, this.A05, r11);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((XmaShareSenderHelper$sendXmaProfileShare$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        C71148Oe6 oe6 = C71148Oe6.A00;
        User user = this.A04;
        String str = this.A06;
        ImageUrl Bh3 = user.Bh3();
        Bitmap A0I = 1NK.A00().A0I(Bh3, str);
        if (A0I != null) {
            1a8 r2 = this.A00;
            C304566Ea r9 = AnonymousClass6EY.A00(this.A01, "XmaShareSenderHelper").A00;
            AnonymousClass9HR A032 = AnonymousClass6W3.A03(this.A03);
            String username = user.getUsername();
            String id = user.getId();
            String username2 = user.getUsername();
            byte[] A07 = C71148Oe6.A07(A0I);
            String A022 = C71148Oe6.A02(JTP.A0o(Bh3));
            int height = Bh3.getHeight();
            int width = Bh3.getWidth();
            ImageUrl imageUrl = this.A02;
            byte[] A09 = oe6.A09(imageUrl, str);
            String A023 = C71148Oe6.A02(JTP.A0o(imageUrl));
            r2.A02(C66582MXn.A0N(C304566Ea.A01(r9, A032).A0M(new C72055OvU(r9, C66583MXo.A0c(imageUrl.getHeight(), -1), C66583MXo.A0c(imageUrl.getWidth(), -1), username, id, username2, A022, A023, this.A05, A07, A09, height, width)), "instagram_xma_profile_share_client_send"), C73037PTu.A00);
            return C60340gF.A00;
        }
        throw AnonymousClass7TE.A0y();
    }
}
