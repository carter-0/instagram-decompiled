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
import X.C71148Oe6;
import X.C72063Ovc;
import X.C73038PTv;
import X.DbU;
import X.JTO;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.send.msys.sharesender.XmaShareSenderHelper$sendXmaStoryMention$1", f = "XmaShareSenderHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class XmaShareSenderHelper$sendXmaStoryMention$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ 1a8 A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ 1Xj A04;
    public final /* synthetic */ C254783t2 A05;
    public final /* synthetic */ User A06;
    public final /* synthetic */ User A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XmaShareSenderHelper$sendXmaStoryMention$1(1a8 r2, UserSession userSession, 1Xj r4, C254783t2 r5, User user, User user2, String str, String str2, String str3, String str4, String str5, AnonymousClass4D7 r13, int i, int i2, boolean z) {
        super(2, r13);
        this.A04 = r4;
        this.A0C = str;
        this.A02 = r2;
        this.A03 = userSession;
        this.A05 = r5;
        this.A01 = i;
        this.A06 = user;
        this.A08 = str2;
        this.A09 = str3;
        this.A0D = z;
        this.A0A = str4;
        this.A07 = user2;
        this.A00 = i2;
        this.A0B = str5;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.instagram.direct.send.msys.sharesender.XmaShareSenderHelper$sendXmaStoryMention$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r18) {
        1Xj r3 = this.A04;
        String str = this.A0C;
        1a8 r1 = this.A02;
        UserSession userSession = this.A03;
        C254783t2 r4 = this.A05;
        int i = this.A01;
        User user = this.A06;
        String str2 = this.A08;
        String str3 = this.A09;
        boolean z = this.A0D;
        String str4 = this.A0A;
        return new XmaShareSenderHelper$sendXmaStoryMention$1(r1, userSession, r3, r4, user, this.A07, str, str2, str3, str4, this.A0B, r18, i, this.A00, z);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((XmaShareSenderHelper$sendXmaStoryMention$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Long l;
        String str;
        String str2;
        0eS.A00(obj);
        1Xj r7 = this.A04;
        0eP A042 = C71148Oe6.A04(r7, this.A0C, false);
        if (A042 != null) {
            ExtendedImageUrl extendedImageUrl = (ExtendedImageUrl) A042.A00;
            Bitmap bitmap = (Bitmap) A042.A01;
            1a8 r4 = this.A02;
            C304566Ea r1 = AnonymousClass6EY.A00(this.A03, "XmaShareSenderHelper").A00;
            AnonymousClass9HR A032 = AnonymousClass6W3.A03(this.A05);
            int i = this.A01;
            String username = this.A06.getUsername();
            String A2n = r7.A2n();
            if (A2n != null) {
                String str3 = this.A08;
                long A17 = r7.A17();
                if (A17 != Long.MAX_VALUE) {
                    l = Long.valueOf(A17);
                } else {
                    l = null;
                }
                String str4 = this.A09;
                Boolean valueOf = Boolean.valueOf(this.A0D);
                String str5 = this.A0A;
                int A0x = r7.A0x();
                int A0y = r7.A0y();
                User user = this.A07;
                String str6 = null;
                if (user != null) {
                    str6 = user.getUsername();
                    str = DbU.A0p(user);
                    str2 = user.getId();
                } else {
                    str = null;
                    str2 = null;
                }
                int i2 = this.A00;
                String str7 = str3;
                String str8 = str4;
                C304566Ea r18 = r1;
                r4.A02(C66582MXn.A0N(C304566Ea.A01(r1, A032).A0M(new C72063Ovc(C71148Oe6.A07(bitmap), valueOf, JTO.A0w(extendedImageUrl.getHeight()), JTO.A0w(extendedImageUrl.getWidth()), l, r18, username, A2n, str7, str8, str5, str6, str, str2, C71148Oe6.A02(extendedImageUrl.A0A), this.A0B, i, A0x, A0y, i2, 0)), "instagram_xma_client_send"), C73038PTv.A00);
                return C60340gF.A00;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
