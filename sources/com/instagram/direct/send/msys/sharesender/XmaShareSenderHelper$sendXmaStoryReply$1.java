package com.instagram.direct.send.msys.sharesender;

import X.0eP;
import X.0eS;
import X.0sL;
import X.1NK;
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
import X.C72057OvW;
import X.C72062Ovb;
import X.C74343PtJ;
import X.PU7;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.send.msys.sharesender.XmaShareSenderHelper$sendXmaStoryReply$1", f = "XmaShareSenderHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class XmaShareSenderHelper$sendXmaStoryReply$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ 1a8 A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C74343PtJ A05;
    public final /* synthetic */ 1Xj A06;
    public final /* synthetic */ C254783t2 A07;
    public final /* synthetic */ ExtendedImageUrl A08;
    public final /* synthetic */ User A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XmaShareSenderHelper$sendXmaStoryReply$1(1a8 r3, UserSession userSession, C74343PtJ ptJ, 1Xj r6, C254783t2 r7, ExtendedImageUrl extendedImageUrl, User user, String str, String str2, String str3, String str4, String str5, AnonymousClass4D7 r15, int i, int i2, long j) {
        super(2, r15);
        this.A06 = r6;
        this.A0E = str;
        this.A0A = str2;
        this.A08 = extendedImageUrl;
        this.A03 = r3;
        this.A04 = userSession;
        this.A07 = r7;
        this.A02 = j;
        this.A01 = i;
        this.A09 = user;
        this.A0B = str3;
        this.A00 = i2;
        this.A0D = str4;
        this.A0C = str5;
        this.A05 = ptJ;
    }

    /* JADX WARNING: type inference failed for: r16v0, types: [com.instagram.direct.send.msys.sharesender.XmaShareSenderHelper$sendXmaStoryReply$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r36) {
        1Xj r15 = this.A06;
        String str = this.A0E;
        String str2 = this.A0A;
        ExtendedImageUrl extendedImageUrl = this.A08;
        1a8 r11 = this.A03;
        UserSession userSession = this.A04;
        C254783t2 r9 = this.A07;
        long j = this.A02;
        int i = this.A01;
        User user = this.A09;
        String str3 = this.A0B;
        int i2 = this.A00;
        String str4 = this.A0D;
        int i3 = i;
        int i4 = i2;
        String str5 = this.A0C;
        String str6 = str4;
        String str7 = str3;
        String str8 = str2;
        String str9 = str;
        User user2 = user;
        ExtendedImageUrl extendedImageUrl2 = extendedImageUrl;
        C254783t2 r21 = r9;
        1Xj r20 = r15;
        return new XmaShareSenderHelper$sendXmaStoryReply$1(r11, userSession, this.A05, r20, r21, extendedImageUrl2, user2, str9, str8, str7, str6, str5, r36, i3, i4, j);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((XmaShareSenderHelper$sendXmaStoryReply$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Long l;
        ExtendedImageUrl extendedImageUrl;
        Long l2;
        0eS.A00(obj);
        1Xj r7 = this.A06;
        String str = this.A0E;
        0eP A042 = C71148Oe6.A04(r7, str, true);
        if (A042 != null) {
            ExtendedImageUrl extendedImageUrl2 = (ExtendedImageUrl) A042.A00;
            Bitmap bitmap = (Bitmap) A042.A01;
            String str2 = this.A0A;
            if (str2 == null || (extendedImageUrl = this.A08) == null) {
                1a8 r5 = this.A03;
                C304566Ea r14 = AnonymousClass6EY.A00(this.A04, "XmaShareSenderHelper").A00;
                AnonymousClass9HR A032 = AnonymousClass6W3.A03(this.A07);
                Long l3 = new Long(this.A02);
                String str3 = this.A0C;
                int i = this.A01;
                String username = this.A09.getUsername();
                String id = r7.getId();
                if (id != null) {
                    long A17 = r7.A17();
                    if (A17 != Long.MAX_VALUE) {
                        l = Long.valueOf(A17);
                    } else {
                        l = null;
                    }
                    String str4 = this.A0B;
                    int i2 = this.A00;
                    byte[] A072 = C71148Oe6.A07(bitmap);
                    String A022 = C71148Oe6.A02(extendedImageUrl2.A0A);
                    int height = extendedImageUrl2.getHeight();
                    int width = extendedImageUrl2.getWidth();
                    String str5 = str3;
                    PU7.A00(C66582MXn.A0N(C304566Ea.A01(r14, A032).A0M(new C72057OvW(r14, l3, l, str5, username, id, str4, A022, this.A0D, A072, i, i2, height, width)), "instagram_xma_story_reply_client_send"), r5, this.A05, 9);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                Bitmap A0H = 1NK.A00().A0H(extendedImageUrl, str);
                if (A0H != null) {
                    1a8 r10 = this.A03;
                    C304566Ea r9 = AnonymousClass6EY.A00(this.A04, "XmaShareSenderHelper").A00;
                    AnonymousClass9HR A033 = AnonymousClass6W3.A03(this.A07);
                    Long l4 = new Long(this.A02);
                    int i3 = this.A01;
                    String username2 = this.A09.getUsername();
                    String id2 = r7.getId();
                    if (id2 != null) {
                        long A172 = r7.A17();
                        if (A172 != Long.MAX_VALUE) {
                            l2 = Long.valueOf(A172);
                        } else {
                            l2 = null;
                        }
                        String str6 = this.A0B;
                        int i4 = this.A00;
                        byte[] A073 = C71148Oe6.A07(bitmap);
                        String A023 = C71148Oe6.A02(extendedImageUrl2.A0A);
                        int height2 = extendedImageUrl2.getHeight();
                        int width2 = extendedImageUrl2.getWidth();
                        String str7 = extendedImageUrl.A0A;
                        byte[] A074 = C71148Oe6.A07(A0H);
                        String A024 = C71148Oe6.A02(str7);
                        int height3 = A0H.getHeight();
                        int width3 = A0H.getWidth();
                        Long l5 = l4;
                        PU7.A00(C66582MXn.A0N(C304566Ea.A01(r9, A033).A0M(new C72062Ovb(A074, l5, l2, r9, A073, username2, id2, str6, A023, str2, str7, A024, this.A0D, i3, i4, height2, width2, height3, width3, 1)), "instagram_xma_story_reply_with_sticker_client_send"), r10, this.A05, 8);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            return C60340gF.A00;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
