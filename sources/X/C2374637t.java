package X;

import android.content.Context;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Set;

/* renamed from: X.37t  reason: invalid class name and case insensitive filesystem */
public final class C2374637t implements 1ut {
    public final /* synthetic */ void DCv(AnonymousClass1XT r1, UserSession userSession, AnonymousClass3Q2 r3) {
    }

    public final /* bridge */ /* synthetic */ Object AEc(AnonymousClass3Q2 r2) {
        return new C70580OCd(r2, this);
    }

    public final K1X E1q(2ZL r4, UserSession userSession) {
        return new C64842Lj4(new 0bH(userSession), new C64593Led()).A00(r4);
    }

    public final void E3L(UserSession userSession, AnonymousClass3Q2 r4, LFD lfd) {
        lfd.A00(r4.A1C, r4, false);
        AnonymousClass1Nd.A00(userSession).A00(new C2370936h(r4));
        lfd.A01(r4);
    }

    public final 1Xj Dou(Context context, AnonymousClass1XT r9, UserSession userSession, AnonymousClass3Q2 r11) {
        r9.getClass();
        1Xj r5 = ((K1X) r9).A00;
        r5.getClass();
        0qQ.A0B(userSession, 0);
        0qQ.A0B(context, 1);
        LQZ A00 = LQZ.A00(userSession);
        synchronized (A00) {
            A00.A01 = r5;
            List<AnonymousClass8VT> list = A00.A03;
            for (AnonymousClass8VT A02 : list) {
                LQZ.A02(A00, A02);
            }
            list.clear();
            List<AnonymousClass8VT> list2 = A00.A02;
            for (AnonymousClass8VT A01 : list2) {
                LQZ.A01(context, A00, A01);
            }
            list2.clear();
        }
        List A002 = AnonymousClass8OY.A00(userSession).A00(r11.A3t);
        List<User> A3Y = r5.A3Y();
        1as.A04.A0G(userSession, "STORY", A3Y, A002);
        for (User user : A3Y) {
            if (AnonymousClass8OY.A01(userSession) || (A002 != null && A002.contains(user.getId()))) {
                1as r2 = 1as.A04;
                0qQ.A0K(r5.A0C.BRf(), false);
                r2.A0C(userSession, r5, user);
            }
        }
        C40270AYj aYj = (C40270AYj) userSession.A01(C40270AYj.class, new C20699WxV(userSession, 12));
        String str = r11.A35;
        String A012 = C2373637i.A01(r11);
        0qQ.A0B(str, 0);
        0qQ.A0B(A012, 2);
        aYj.A01 = str;
        aYj.A00 = r5;
        aYj.A02 = A012;
        return r5;
    }

    /* JADX WARNING: type inference failed for: r0v18, types: [X.L1x, java.lang.Object] */
    public final /* bridge */ /* synthetic */ AnonymousClass1QX AEQ(Context context, 28D r19, MediaUploadMetadata mediaUploadMetadata, UserSession userSession, ShareType shareType, Object obj, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C16674UzA uzA;
        C70580OCd oCd = (C70580OCd) obj;
        if (z4) {
            uzA = C16674UzA.A0O;
        } else {
            uzA = C16674UzA.A0N;
        }
        String str8 = str6;
        boolean z6 = z;
        UserSession userSession2 = userSession;
        28D r3 = r19;
        MediaUploadMetadata mediaUploadMetadata2 = mediaUploadMetadata;
        String str9 = str;
        String str10 = str4;
        1NY A01 = C64193LTa.A01(r3, mediaUploadMetadata2, userSession2, uzA, str9, str10, 0qv.A00(context), str8, str7, list, z6, z2, z3, z5);
        AnonymousClass3Q2 r2 = oCd.A00;
        UserSession userSession3 = userSession2;
        boolean z7 = z6;
        C64193LTa.A0J(A01, userSession3, C63368Kvp.A00(r2), j, z7);
        C64177LSe.A02(A01, shareType);
        long j2 = r2.A0e;
        0qQ.A0B(userSession2, 1);
        C64177LSe.A01(A01, userSession3, C64177LSe.A00(r2, true), j2, z7);
        AnonymousClass3QO r32 = r2.A1F;
        if (r32 != AnonymousClass3QO.DEFAULT) {
            A01.A9m("audience", r32.A00);
        }
        FanClubInfoDict B3v = 0eE.A00(userSession2).A00().A03.B3v();
        if (r32 == AnonymousClass3QO.FAN_CLUB && B3v != null) {
            A01.A9m("fan_club_id", String.valueOf(B3v.getFanClubId()));
        }
        LJW.A01(A01, userSession2, LJW.A00(r2, (1us) null), str3, str5);
        AnonymousClass8VT r0 = r2.A1Y;
        if (r0 != null) {
            A01.AA0(C273654mx.A00(1436), C64133LPh.A02(r0));
        }
        if (182.A06(0Tu.A05, userSession2, 36310881881031008L) && 1Au.A00(userSession2).A24("reel")) {
            Set A0I = 1Au.A00(userSession2).A0I("reel");
            ? obj2 = new Object();
            obj2.A00 = A0I;
            C64193LTa.A0K(A01, obj2);
        }
        return A01.A0N();
    }
}
