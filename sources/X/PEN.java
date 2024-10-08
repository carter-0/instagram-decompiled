package X;

import android.content.Context;
import com.instagram.api.schemas.MessagingOffPlatformShareType;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.DirectAREffectShare;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.infocenter.intf.InfoCenterFactShareInfoIntf;
import com.instagram.infocenter.intf.InfoCenterShareInfoIntf;
import com.instagram.model.direct.DirectPendingLayeredXma;
import com.instagram.model.direct.DirectRoomsXma;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.Deprecated;

public final class PEN implements AnonymousClass7Z7, 0lm {
    public final 1a8 A00 = C66581MXm.A0P();
    public final AnonymousClass6EZ A01;
    public final UserSession A02;
    public final OLR A03;

    public final void ELT(1Xj r1, DirectShareTarget directShareTarget, String str, boolean z) {
    }

    public final void ELU(SocialContextType socialContextType, 1Xj r2, DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
    }

    public final void ELV(SocialContextType socialContextType, C317966o8 r10, 1Xj r11, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, boolean z) {
        DbW.A1N(directShareTarget, 0, str2);
        this.A03.A00(new OH1(directShareTarget, 2FW.A0W, r11, str, str2, z));
    }

    public final void ELX(C247733gp r1, DirectShareTarget directShareTarget, String str, boolean z) {
    }

    public final void ELY(C317966o8 r1, 1Xj r2, DirectPendingLayeredXma directPendingLayeredXma, DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z, boolean z2) {
    }

    public final void ELZ(ImageUrl imageUrl, DirectShareTarget directShareTarget, ExtendedImageUrl extendedImageUrl, User user, String str, String str2, String str3, String str4, String str5, long j, boolean z) {
    }

    public final void ELb(DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, boolean z) {
        String str9 = str8;
        0qQ.A0B(str9, 9);
        String str10 = str3;
        if (str3 == null || str3.length() == 0) {
            0wb.A04("MsysSendShareManager", "Fail to send destination share due to null title", 1);
            return;
        }
        this.A03.A00(new OH1(directShareTarget, 2FW.A0g, str10, str7, str9, z));
    }

    public final void ELh(DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        String str7 = str6;
        boolean A1Y = DbW.A1Y(str2);
        if (str3 != null) {
            N49 n49 = new N49(str2, str3, 35);
            OLR olr = this.A03;
            2FW r3 = 2FW.A0r;
            if (str6 == null) {
                str7 = "";
            }
            olr.A00(new OH1(directShareTarget, r3, n49, str, str7, z));
            return;
        }
        0wb.A04("MsysSendShareManager", "Fail to send fbpay referral share due to null fbid", A1Y ? 1 : 0);
    }

    public final void ELi(1Xj r1, DirectShareTarget directShareTarget, String str, boolean z, boolean z2) {
    }

    public final void ELl(DirectShareTarget directShareTarget, C51151FpN fpN, String str, String str2, String str3, boolean z) {
        0qQ.A0B(str, 2);
        this.A03.A00(new OH1(directShareTarget, 2FW.A0w, fpN.A08, str2, str3, z));
    }

    public final void ELm(1Xj r9, DirectShareTarget directShareTarget, String str, String str2, boolean z) {
        0qQ.A0B(str2, 3);
        DirectShareTarget directShareTarget2 = directShareTarget;
        this.A03.A00(new OH1(directShareTarget2, 2FW.A0t, r9, str, str2, z));
    }

    public final void ELo(InfoCenterFactShareInfoIntf infoCenterFactShareInfoIntf, DirectShareTarget directShareTarget, String str, String str2, boolean z) {
        0qQ.A0B(str2, 2);
        DirectShareTarget directShareTarget2 = directShareTarget;
        this.A03.A00(new OH1(directShareTarget2, 2FW.A11, infoCenterFactShareInfoIntf, str, str2, z));
    }

    public final void ELp(InfoCenterShareInfoIntf infoCenterShareInfoIntf, DirectShareTarget directShareTarget, String str, String str2, boolean z) {
        0qQ.A0B(str2, 2);
        DirectShareTarget directShareTarget2 = directShareTarget;
        this.A03.A00(new OH1(directShareTarget2, 2FW.A12, infoCenterShareInfoIntf, str, str2, z));
    }

    public final void ELv(Context context, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, boolean z) {
        String str6 = str4;
        C51973G9u.A0r(1, str, str6, str5);
        if (182.A06(0Tu.A05, this.A02, 2342156773019093224L)) {
            C304566Ea r3 = this.A01.A00;
            AnonymousClass9HR A0X = C66583MXo.A0X(directShareTarget);
            String A0u = DbV.A0u(context, str2, 002.A0u("https://www.instagram.com/", str2, "/live/", str), 2131959828);
            0qQ.A07(A0u);
            1a8 r2 = this.A00;
            r2.A02(r3.A08(A0X, AnonymousClass05K.A00, AnonymousClass05K.A0j, A0u, str6, false), C73024PTh.A00);
            if (str3.length() > 0) {
                r2.A02(r3.A09(A0X, str3, str6), C73025PTi.A00);
            }
        }
    }

    public final void ELw(C317966o8 r9, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, boolean z) {
        0qQ.A0B(str4, 5);
        DirectShareTarget directShareTarget2 = directShareTarget;
        this.A03.A00(new OH1(directShareTarget2, 2FW.A1u, str, str3, str4, z));
    }

    public final void EM1(SocialContextType socialContextType, C317966o8 r14, C381819cP r15, 1Xj r16, DirectShareTarget directShareTarget, Long l, String str, String str2) {
        DirectShareTarget directShareTarget2 = directShareTarget;
        0qQ.A0B(directShareTarget2, 0);
        String str3 = str;
        this.A03.A00(new OH1(directShareTarget2, 2FW.A1D, new AnonymousClass9JI(r16, (Integer) null, str3, str2, (String) null), str3, r15.A01, r15.A02));
    }

    public final void EME(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
    }

    public final void EMI(Context context, C254933tI r12, DirectShareTarget directShareTarget, AnonymousClass3Q2 r14, C352218Cl r15, String str, String str2, String str3, boolean z) {
        AnonymousClass7TF.A1B(context, 0, r15);
        AnonymousClass9HR A0X = C66583MXo.A0X(directShareTarget);
        C304566Ea r3 = this.A01.A00;
        1a8 r2 = this.A00;
        String str4 = str2;
        r2.A02(r3.A07(A0X, r15, (Integer) null, (Long) null, str4, false), C73026PTj.A00);
        String str5 = str;
        if (str != null && str5.length() != 0) {
            r2.A02(r3.A09(A0X, str5, str4), C73027PTk.A00);
        }
    }

    public final void EML(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
    }

    public final void EMM(DirectShareTarget directShareTarget, Product product, String str, String str2, boolean z) {
        0qQ.A0B(str2, 3);
        DirectShareTarget directShareTarget2 = directShareTarget;
        this.A03.A00(new OH1(directShareTarget2, 2FW.A1Y, product.A01, str, str2, z));
    }

    public final void EMP(MessagingOffPlatformShareType messagingOffPlatformShareType, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, boolean z) {
    }

    public final void EMU(C317966o8 r9, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, boolean z) {
        0qQ.A0B(str5, 6);
        DirectShareTarget directShareTarget2 = directShareTarget;
        String str6 = str4;
        this.A03.A00(new OH1(directShareTarget2, 2FW.A1S, str6, str, str5, z));
    }

    public final void EMV(1Xj r1, DirectShareTarget directShareTarget, String str, boolean z) {
    }

    public final void EMe(DirectShareTarget directShareTarget, String str, String str2, boolean z) {
    }

    public final void EMh(DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z) {
        String str7 = str6;
        C61037Jvb jvb = new C61037Jvb(str3, str2, str4, 12);
        OLR olr = this.A03;
        2FW r3 = 2FW.A1a;
        if (str6 == null) {
            str7 = "";
        }
        olr.A00(new OH1(directShareTarget, r3, jvb, str, str7, z));
    }

    @Deprecated(message = "Please use forwardMessage instead.")
    public final void EMp(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z, boolean z2) {
        0qQ.A0B(str, 1);
        C304566Ea r3 = this.A01.A00;
        AnonymousClass9HR A0X = C66583MXo.A0X(directShareTarget);
        1a8 r2 = this.A00;
        r2.A02(r3.A08(A0X, (Integer) null, (Integer) null, str, str3, z2), C73028PTl.A00);
        if (str2.length() != 0) {
            r2.A02(r3.A09(A0X, str2, str3), C73029PTm.A00);
        }
    }

    public final void EN0(Context context, QP5 qp5, C254933tI r15, DirectShareTarget directShareTarget, ClipInfo clipInfo, AnonymousClass3Q2 r18, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3) {
        ClipInfo clipInfo2 = clipInfo;
        String str7 = str;
        DbZ.A0t(0, context, clipInfo2, str7);
        String str8 = str3;
        0qQ.A0B(str8, 6);
        AnonymousClass9HR A0X = C66583MXo.A0X(directShareTarget);
        C304566Ea r5 = this.A01.A00;
        1a8 r2 = this.A00;
        r2.A02(C66581MXm.A0M(new C72048OvN(r5, clipInfo2, (Integer) null, (Long) null, str7, str8, false), C304566Ea.A01(r5, A0X)), C73030PTn.A00);
        String str9 = str2;
        if (str2 != null && str9.length() != 0) {
            r2.A02(r5.A09(A0X, str9, str8), C73031PTo.A00);
        }
    }

    public final void ELK(DirectAREffectShare directAREffectShare, DirectShareTarget directShareTarget, String str, String str2, boolean z) {
        this.A03.A00(new OH1(directShareTarget, 2FW.A0M, directAREffectShare, str, str2, z));
    }

    public final void ELW(DirectShareTarget directShareTarget, SavedCollection savedCollection, String str, String str2, boolean z) {
        this.A03.A00(new OH1(directShareTarget, 2FW.A0a, savedCollection, str, str2, z));
    }

    public final void ELu(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
        C304566Ea r4 = this.A01.A00;
        AnonymousClass9HR A0X = C66583MXo.A0X(directShareTarget);
        1a8 r2 = this.A00;
        r2.A02(r4.A09(A0X, str, str3), C73022PTf.A00);
        if (str2.length() != 0) {
            r2.A02(r4.A09(A0X, str2, str3), C73023PTg.A00);
        }
    }

    public final void ELz(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
        throw AnonymousClass7TE.A1B("stub");
    }

    public final void EMN(C317966o8 r9, DirectShareTarget directShareTarget, User user, String str, String str2, String str3, boolean z) {
        this.A03.A00(new OH1(directShareTarget, 2FW.A1O, user, str, str2, z));
    }

    public final void EMQ(DirectShareTarget directShareTarget, SavedCollection savedCollection, String str, String str2, boolean z, boolean z2) {
        this.A03.A00(new OH1(directShareTarget, 2FW.A0a, savedCollection, str, str2, z));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: com.instagram.model.direct.gifs.DirectAnimatedMedia} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: com.instagram.model.direct.gifs.DirectAnimatedMedia} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: com.instagram.model.direct.gifs.DirectAnimatedMedia} */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r10.A03 != null) goto L_0x0017;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EMT(X.C381429bk r16, java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            r15 = this;
            r10 = r16
            com.instagram.model.direct.gifs.DirectAnimatedMedia r13 = r10.A02
            X.1Xj r2 = r10.A00
            java.lang.String r3 = r10.A0J
            java.lang.String r4 = r10.A0I
            java.lang.String r5 = r10.A0D
            java.lang.String r6 = r10.A0B
            java.lang.String r0 = r10.A0G
            if (r0 != 0) goto L_0x0017
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r10.A03
            r9 = 0
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r9 = 1
        L_0x0018:
            r7 = 0
            java.lang.String r8 = r10.A07
            X.7FN r1 = new X.7FN
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            X.OLR r2 = r15.A03
            X.2FW r11 = X.2FW.A1T
            if (r13 != 0) goto L_0x0027
            r13 = r3
        L_0x0027:
            X.OGF r9 = new X.OGF
            r14 = r17
            r12 = r1
            r9.<init>(r10, r11, r12, r13, r14)
            X.9bk r0 = r9.A00
            boolean r0 = r0.A0K
            if (r0 == 0) goto L_0x0045
            java.util.Map r1 = r2.A02
            X.2FW r0 = r9.A01
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x0054
            X.PuV r0 = (X.C74415PuV) r0
        L_0x0041:
            r0.EMZ(r9)
            return
        L_0x0045:
            java.util.Map r1 = r2.A03
            X.2FW r0 = r9.A01
            java.lang.Object r0 = r1.get(r0)
            X.PuV r0 = (X.C74415PuV) r0
            if (r0 != 0) goto L_0x0041
            X.PuV r0 = r2.A01
            goto L_0x0041
        L_0x0054:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PEN.EMT(X.9bk, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void EMi(DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z) {
        String str11 = str10;
        String str12 = str6;
        QP5 qp5 = new QP5(str12, str5, str3, str4, 9);
        OLR olr = this.A03;
        2FW r3 = 2FW.A1Z;
        if (str10 == null) {
            str11 = "";
        }
        olr.A00(new OH1(directShareTarget, r3, qp5, str, str11, z));
    }

    public final void EMo(DirectShareTarget directShareTarget, User user, String str, String str2, String str3, String str4, boolean z) {
        throw AnonymousClass7TE.A1B("stub");
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A00.A01();
    }

    public PEN(UserSession userSession, AnonymousClass6EZ r3, OLR olr) {
        AnonymousClass7TG.A1P(userSession, r3);
        this.A02 = userSession;
        this.A03 = olr;
        this.A01 = r3;
    }

    public final void AWR(DirectForwardingParams directForwardingParams, DirectShareTarget directShareTarget, 2FW r12, String str, String str2, boolean z) {
        if (C48865ElR.A00(directForwardingParams, DbS.A0c(directShareTarget)) == AnonymousClass05K.A0N) {
            1a8 r2 = this.A00;
            C304566Ea r4 = this.A01.A00;
            long parseLong = Long.parseLong(directForwardingParams.A06);
            C254783t2 A0c = DbS.A0c(directShareTarget);
            0qQ.A0C(A0c, "null cannot be cast to non-null type com.instagram.model.direct.threadkey.impl.MsysThreadTarget");
            r2.A02(C66582MXn.A0N(C304566Ea.A01(r4, (AnonymousClass9HR) A0c).A0M(new C72035OvA(r4, str, str2, parseLong)), "tam_forward_message"), C73020PTd.A00);
            return;
        }
        throw DbT.A0m();
    }

    public final void ELM(Context context, UserSession userSession, DirectShareTarget directShareTarget, DirectAnimatedMedia directAnimatedMedia, String str, String str2, boolean z) {
        AnonymousClass9HR A0X = C66583MXo.A0X(directShareTarget);
        C304566Ea r4 = this.A01.A00;
        C331897Sw r0 = C331897Sw.A0A;
        C331917Sy.A00(context).A05(new PHH(userSession, r4, this, directAnimatedMedia, A0X, str, str2), directAnimatedMedia.A02.A09);
    }

    public final void ELn(C48097EVp eVp, DirectShareTarget directShareTarget, Long l, String str, String str2, String str3, long j, boolean z) {
        throw C66583MXo.A0a();
    }

    public final void EM0(1Xj r2, DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z, boolean z2) {
        throw C66583MXo.A0a();
    }

    public final void EMc(DirectRoomsXma directRoomsXma, DirectShareTarget directShareTarget, String str, String str2, boolean z) {
        throw C66583MXo.A0a();
    }

    public final void EMm(C381429bk r2, String str) {
        throw C66583MXo.A0a();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.7FJ, java.lang.Object] */
    public final void EMn(C317966o8 r9, C381819cP r10, 1Xj r11, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        AnonymousClass7TG.A1P(str, r11);
        ? obj = new Object();
        obj.A01 = r11;
        obj.A08 = str3;
        obj.A07 = str;
        DirectShareTarget directShareTarget2 = directShareTarget;
        this.A03.A00(new OH1(directShareTarget2, 2FW.A1e, obj, str3, r10.A01, r10.A02));
    }

    public final void EMx(C69343Nji nji, DirectShareTarget directShareTarget, Boolean bool, String str, String str2, String str3, boolean z) {
        throw C66583MXo.A0a();
    }

    public final void EN7(DirectShareTarget directShareTarget, String str, String str2, boolean z) {
        throw C66583MXo.A0a();
    }

    public final void ELS(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
        ELu(directShareTarget, str, str2, str3, z);
    }
}
