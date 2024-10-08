package X;

import android.content.Context;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.model.mentions.SendMentionData$MentionData;
import com.instagram.direct.msys.mailbox.core.mutation.MsysVoiceMessageSender$sendSecureVoiceMessage$1;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Mot  reason: case insensitive filesystem */
public final class C67499Mot implements C333547Zj, AnonymousClass0lh {
    public final 1a8 A00 = C66581MXm.A0P();
    public final UserSession A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(C73913Plo.A00(this, 36));

    public C67499Mot(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final synchronized boolean BJG() {
        throw C66583MXo.A0a();
    }

    public final synchronized Integer CHQ() {
        throw C66583MXo.A0a();
    }

    public final void ELJ(Context context, UserSession userSession, C317966o8 r3, C254933tI r4, C254743sy r5, String str, boolean z) {
    }

    public final void ELL(Context context, UserSession userSession, C254933tI r6, DirectAnimatedMedia directAnimatedMedia, C254783t2 r8, String str, String str2, List list, boolean z) {
        DbW.A1O(directAnimatedMedia, 2, userSession);
        if ((r8 instanceof AnonymousClass9HR) && context != null) {
            C331897Sw r0 = C331897Sw.A0A;
            C331917Sy.A00(context).A05(new PHF(userSession, this, directAnimatedMedia, r8), directAnimatedMedia.A02.A09);
        }
    }

    public final void ELQ(Context context, UserSession userSession, C317966o8 r11, C254933tI r12, C254743sy r13, String str, List list, boolean z) {
        AnonymousClass7TG.A1N(context, userSession);
        0qQ.A0B(r11, 4);
        C331897Sw r0 = C331897Sw.A0A;
        C331917Sy.A00(context).A05(new PHG(userSession, r11, r12, this, r13), r11.A0H.getUrl());
    }

    public final void ELa(Context context, UserSession userSession, C317966o8 r3, C254933tI r4, C254743sy r5, String str, boolean z) {
    }

    public final void ELc(C254783t2 r9, String str, String str2, String str3) {
        0qQ.A0B(r9, 0);
        AnonymousClass7TE.A1Z(new MGN(this, r9, str2, str, (AnonymousClass4D7) null, 12), AnonymousClass1HX.A01(626572521, 3));
    }

    public final void ELg(C70766OKm oKm, C254933tI r8, OCA oca, C254743sy r10, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, List list, boolean z) {
        A01(r8, this, r10, str, str3, list);
    }

    public final void ELk(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
    }

    public final void ELq(Capabilities capabilities, C254743sy r12, String str, String str2, String str3, String str4, String str5) {
        if (str != null) {
            1a8 r2 = this.A00;
            C304566Ea A002 = A00(this);
            long parseLong = Long.parseLong(str);
            ImmutableList immutableList = C254853tA.A03;
            String A0k = DbS.A0k();
            r2.A02(C66581MXm.A0O(C66581MXm.A0M(new C72039OvE(false, "❤", A0k, (String) null, parseLong), A002.A00), "rxmailbox_add_reaction_message"), PTZ.A00);
        }
    }

    public final void ELt(C60957JuF juF, C70621ODs oDs, 2FW r13, C254743sy r14, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass7TF.A1H(r14, str);
        String str8 = null;
        if (z) {
            str8 = str3;
        }
        String str9 = str7;
        if (str7 != null) {
            ((AnonymousClass7UH) this.A02.getValue()).A03(str9, false);
        }
        1a8 r2 = this.A00;
        C304566Ea A002 = A00(this);
        long parseLong = Long.parseLong(str);
        Boolean valueOf = Boolean.valueOf(0qQ.A0K(str4, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT));
        String A0k = DbS.A0k();
        r2.A02(C66581MXm.A0O(C66581MXm.A0M(new C72039OvE(valueOf, str8, A0k, str9, parseLong), A002.A00), "rxmailbox_add_reaction_message"), C73017PTa.A00);
    }

    public final void EM6(Context context, UserSession userSession, C254743sy r3, C66569MWx mWx, String str, boolean z) {
    }

    public final void EMC(ImageUrl imageUrl, DirectShareTarget directShareTarget, ExtendedImageUrl extendedImageUrl, User user, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z) {
    }

    public final void EMD(ImageUrl imageUrl, DirectShareTarget directShareTarget, ExtendedImageUrl extendedImageUrl, User user, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, boolean z) {
        1a8 r2 = this.A00;
        C304566Ea A002 = A00(this);
        C254783t2 A0c = DbS.A0c(directShareTarget);
        0qQ.A0C(A0c, "null cannot be cast to non-null type com.instagram.model.direct.threadkey.impl.MsysThreadTarget");
        r2.A02(A002.A08((AnonymousClass9HR) A0c, AnonymousClass05K.A01, AnonymousClass05K.A0Y, str4, (String) null, false), C73018PTb.A00);
    }

    public final ListenableFuture EMH(AnonymousClass9JH r7, C53401GnY gnY, C254933tI r9, OCA oca, C254743sy r11, AnonymousClass3Q2 r12, C352218Cl r13, String str, String str2, String str3, String str4, List list, boolean z) {
        0qQ.A0B(r11, 0);
        String str5 = null;
        if (r9 != null) {
            str5 = r9.A0T;
        }
        UserSession userSession = this.A01;
        Long A0i = C51972G9s.A0i(str5);
        String str6 = str3;
        C71823OrQ A002 = ((C70744OJp) userSession.A01(C70744OJp.class, C73911Plm.A00(userSession, 7))).A00(C66647MaG.A06(r11), r13, A0i, str, str6);
        OQP.A00(A002, (AnonymousClass7UH) this.A02.getValue(), str6);
        return A002;
    }

    public final void EMJ(AnonymousClass9JH r7, C53401GnY gnY, C254933tI r9, OCA oca, C254743sy r11, AnonymousClass3Q2 r12, C352218Cl r13, String str, String str2, String str3, String str4, List list, boolean z) {
        String str5 = null;
        if (r9 != null) {
            str5 = r9.A0T;
        }
        UserSession userSession = this.A01;
        Long A0i = C51972G9s.A0i(str5);
        ((C70744OJp) userSession.A01(C70744OJp.class, C73911Plm.A00(userSession, 7))).A00(C66647MaG.A06(r11), r13, A0i, str, str3);
    }

    public final void EMK(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
    }

    public final void EMR(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
    }

    public final void EMd(C254783t2 r1, String str, String str2, long j) {
    }

    public final void EMj(C70766OKm oKm, C254933tI r8, OCA oca, C254743sy r10, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, List list, boolean z) {
        A01(r8, this, r10, str, str3, list);
    }

    public final String EMq(Context context, C70766OKm oKm, C254933tI r17, OCA oca, C254743sy r19, Integer num, String str, String str2, String str3, String str4, String str5, boolean z) {
        C254743sy r0 = r19;
        String str6 = str;
        AnonymousClass7TG.A1O(r0, str6);
        MsysThreadId A06 = C66647MaG.A06(r0);
        1a8 r3 = this.A00;
        2FW r6 = 2FW.A1g;
        0qQ.A0B(A06, 0);
        C304566Ea A002 = A00(this);
        AnonymousClass9HR A03 = AnonymousClass6W3.A03(A06);
        String str7 = null;
        C254933tI r1 = r17;
        if (r17 != null) {
            str7 = r1.A0T;
        }
        1aU A0M = C66581MXm.A0M(new C72051OvQ(A002, r6, (Integer) null, (Integer) null, (Long) null, str6, str7, str3, false), C304566Ea.A01(A002, A03));
        DbW.A1X((AnonymousClass7UH) this.A02.getValue());
        r3.A02(A0M.A0P(C318146oT.A01), new PUA(context, str5, 4));
        return null;
    }

    public final 1aU EMs(N49 n49, C70766OKm oKm, C254933tI r17, OCA oca, DirectShareTarget directShareTarget, 2FW r20, C254783t2 r21, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        Long l2;
        C254783t2 r0 = r21;
        0qQ.A0B(r0, 0);
        C304566Ea A002 = A00(this);
        AnonymousClass9HR A03 = AnonymousClass6W3.A03(r0);
        String str8 = null;
        String str9 = str6;
        if (str6 != null) {
            l2 = AnonymousClass7TE.A10(str9);
        } else {
            l2 = null;
        }
        C254933tI r1 = r17;
        if (r17 != null) {
            str8 = r1.A0T;
        }
        1aU A0M = C66581MXm.A0M(new C72051OvQ(A002, r20, (Integer) null, (Integer) null, l2, str, str8, str3, false), C304566Ea.A01(A002, A03));
        AnonymousClass7UH r4 = (AnonymousClass7UH) this.A02.getValue();
        boolean A1X = DbW.A1X(r4);
        if (str6 == null) {
            return A0M;
        }
        r4.A03(str9, A1X);
        return C72120Owf.A03(1aU.A09(Integer.valueOf(A1X ? 1 : 0)).A0S(new PUA(str9, (Object) r4, 5)), new C73933PmD(A0M, 11), 67).A0S(new PUA(str9, (Object) r4, 6));
    }

    public final 1aU EMt(C70766OKm oKm, C254933tI r13, OCA oca, DirectShareTarget directShareTarget, 2FW r16, C254783t2 r17, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z, boolean z2) {
        C254783t2 r1 = r17;
        0qQ.A0B(r1, 0);
        C304566Ea A002 = A00(this);
        AnonymousClass9HR A03 = AnonymousClass6W3.A03(r1);
        String str7 = null;
        if (r13 != null) {
            str7 = r13.A0T;
        }
        1aU A0M = C66581MXm.A0M(new C72051OvQ(A002, r16, (Integer) null, (Integer) null, (Long) null, str, str7, str3, z2), C304566Ea.A01(A002, A03));
        DbW.A1X((AnonymousClass7UH) this.A02.getValue());
        return A0M;
    }

    public final void EMv(C70766OKm oKm, C254933tI r8, SendMentionData$MentionData sendMentionData$MentionData, OCA oca, C254743sy r11, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, List list, List list2, boolean z) {
        A01(r8, this, r11, str, str3, list2);
    }

    public final ListenableFuture EMz(AnonymousClass9JH r10, C53401GnY gnY, C254933tI r12, OCA oca, C254743sy r14, ClipInfo clipInfo, String str, String str2, String str3, String str4, String str5, List list, boolean z) {
        ClipInfo clipInfo2 = clipInfo;
        DbY.A1S(r14, clipInfo);
        String str6 = null;
        if (r12 != null) {
            str6 = r12.A0T;
        }
        UserSession userSession = this.A01;
        Long A0i = C51972G9s.A0i(str6);
        String str7 = str4;
        C8707R1y A002 = ((OKR) userSession.A01(OKR.class, C73913Plo.A00(userSession, 37))).A00(C66647MaG.A06(r14), clipInfo2, A0i, str, str2, str7);
        OQP.A00(A002, (AnonymousClass7UH) this.A02.getValue(), str7);
        return A002;
    }

    public final void EN1(AnonymousClass9JH r10, C53401GnY gnY, C254933tI r12, OCA oca, C254743sy r14, ClipInfo clipInfo, String str, String str2, String str3, String str4, String str5, List list, boolean z) {
        ClipInfo clipInfo2 = clipInfo;
        0qQ.A0B(clipInfo, 2);
        String str6 = null;
        if (r12 != null) {
            str6 = r12.A0T;
        }
        UserSession userSession = this.A01;
        Long A0i = C51972G9s.A0i(str6);
        ((OKR) userSession.A01(OKR.class, C73913Plo.A00(userSession, 37))).A00(C66647MaG.A06(r14), clipInfo2, A0i, str, str2, str4);
    }

    public final 1aU EN3(C254783t2 r9, C352218Cl r10, Long l, String str, String str2, boolean z) {
        C254783t2 r2 = r9;
        boolean A1Z = C66581MXm.A1Z(str);
        if (r9 instanceof MsysThreadId) {
            Integer A002 = C70119NxZ.A00(str);
            if (A002 != null) {
                return A00(this).A07((AnonymousClass9HR) r2, r10, A002, l, (String) null, A1Z);
            }
            throw DbW.A0c("Null ephemeralityType. ViewMode: ", str);
        }
        throw AnonymousClass7TE.A1B(AnonymousClass7TG.A0m(r9, "Unsupported thread target for sendVisualMessageRx: ", AnonymousClass7TE.A1A()));
    }

    public final ListenableFuture EN4(C254933tI r15, C254743sy r16, C63822L8d l8d, String str, String str2, String str3, List list, boolean z) {
        C254743sy r1 = r16;
        0qQ.A0B(r1, 0);
        MsysThreadId A06 = C66647MaG.A06(r1);
        UserSession userSession = this.A01;
        long j = A06.A00;
        Long A012 = AnonymousClass4KK.A01(A06);
        AnonymousClass19S A013 = AnonymousClass1HX.A01(1615100382, 3);
        C254933tI r4 = r15;
        String str4 = str3;
        MsysVoiceMessageSender$sendSecureVoiceMessage$1 msysVoiceMessageSender$sendSecureVoiceMessage$1 = new MsysVoiceMessageSender$sendSecureVoiceMessage$1(r4, (C70472O7x) userSession.A01(C70472O7x.class, C73911Plm.A00(userSession, 9)), l8d, A012, (String) null, str, str4, (AnonymousClass4D7) null, j);
        19B r0 = 19B.A00;
        Integer num = AnonymousClass05K.A00;
        Pr4 pr4 = new Pr4(1Ep.A02(r0, A013));
        pr4.A0T(num, pr4, msysVoiceMessageSender$sendSecureVoiceMessage$1);
        C71823OrQ orQ = pr4.A00;
        OQP.A00(orQ, (AnonymousClass7UH) this.A02.getValue(), str4);
        return orQ;
    }

    public final void EN8(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
    }

    public final synchronized void EaQ(boolean z) {
        throw C66583MXo.A0a();
    }

    public final synchronized void Er5(Integer num) {
        throw C66583MXo.A0a();
    }

    public static C304566Ea A00(C67499Mot mot) {
        return AnonymousClass6EY.A00(mot.A01, "MsysSendMessageManager").A00;
    }

    public static final void A01(C254933tI r22, C67499Mot mot, C254743sy r24, String str, String str2, List list) {
        ArrayList arrayList;
        int i;
        Integer valueOf;
        int i2;
        if (list != null) {
            arrayList = AnonymousClass7TE.A1C();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass9IY r2 = (AnonymousClass9IY) it.next();
                HashMap A1E = AnonymousClass7TE.A1E();
                A1E.put("mention_id", Long.valueOf(DbY.A04((Number) r2.A04)));
                A1E.put("mention_offset", Integer.valueOf(r2.A02));
                A1E.put("mention_length", Integer.valueOf(r2.A01));
                int i3 = r2.A03;
                int i4 = 1;
                String A002 = C273654mx.A00(166);
                if (i3 == 1) {
                    i4 = 2;
                } else if (i3 != 3) {
                    i4 = -1;
                    if (i3 == 0) {
                        i4 = 0;
                    }
                }
                C66581MXm.A1S(A002, A1E, i4);
                arrayList.add(A1E);
            }
        } else {
            arrayList = null;
        }
        2FW r1 = 2FW.A1g;
        C70110NxQ nxQ = C70110NxQ.$redex_init_class;
        int ordinal = r1.ordinal();
        switch (ordinal) {
            case 15:
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 19:
                i = 1011;
                break;
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                i = 1007;
                break;
            case 46:
            case 49:
                i = 1005;
                break;
            default:
                valueOf = null;
                break;
        }
        valueOf = Integer.valueOf(i);
        switch (ordinal) {
            case 15:
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 19:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
            case 46:
            case 49:
                i2 = 7;
                break;
            default:
                i2 = null;
                break;
        }
        String str3 = null;
        C69422Nl4 nl4 = C69422Nl4.A0W;
        ImmutableList of = ImmutableList.of(C69423Nl5.A0d);
        0qQ.A07(of);
        C68113N1b A003 = C70108NxO.A00(nl4, of);
        String A0k = DbS.A0k();
        UserSession userSession = mot.A01;
        long A004 = C66647MaG.A00(r24);
        C254933tI r0 = r22;
        if (r22 != null) {
            str3 = r0.A0T;
        }
        Long A012 = AnonymousClass4KK.A01(C66647MaG.A06(r24));
        OUC.A00(userSession).A02((MailboxCallback) null, DbZ.A0d(str3), (Number) null, C70109NxP.A00(userSession, i2, (Integer) null, valueOf, (Integer) null, A012, (String) null, false), str, str2, A0k, A003.A00.toString(), arrayList, A004, false);
    }

    public final String EMr(C254933tI r14, C254743sy r15, String str, String str2, String str3, boolean z) {
        String str4 = str;
        0qQ.A0B(str4, 1);
        return EMq((Context) null, (C70766OKm) null, (C254933tI) null, (OCA) null, r15, (Integer) null, str4, NetInfoModule.CONNECTION_TYPE_NONE, "push_notification_action", (String) null, (String) null, false);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public final ListenableFuture FJE(C69668Npq npq, C254743sy r15, String str) {
        if (npq instanceof C68964Nbr) {
            ? obj = new Object();
            UserSession userSession = this.A01;
            long j = ((C68964Nbr) npq).A00;
            C68314NAb A012 = C71031OZi.A01(userSession);
            AnonymousClass68L A0F = C66580MXl.A0F(A012, 0);
            MailboxFutureImpl A0G = C66580MXl.A0G(A0F);
            int A002 = C3030067a.A00(A0G);
            TraceInfo A013 = C3030067a.A01(A0G, "MailboxTam", "runTamClientMessageUnsend");
            if (!A0F.EJd(new C71724Opi(A0G, A012, A002, 7, j))) {
                A0G.cancel(false);
                C3030067a.A02(A002);
                C3030067a.A03(A013, "MailboxTam", "runTamClientMessageUnsend");
            }
            PlatformLogger.platformEventLog(5);
            A0G.addResultCallback(new C71721Opf((Object) obj, 38));
            return obj;
        }
        throw DbT.A0m();
    }

    public final void onSessionWillEnd() {
        this.A00.A01();
    }

    public final void AGJ(AnonymousClass0iw r2, C254703su r3, DirectThreadKey directThreadKey) {
        throw C66583MXo.A0a();
    }

    public final 1aU AGK(C254743sy r5, String str) {
        C304566Ea A002 = A00(this);
        Long A0q = DbV.A0q(str);
        return C66581MXm.A0O(C72118Owd.A00(C66581MXm.A0M(new C72120Owf(A0q, 53), A002.A02), 19), "rxmailbox_delete_message");
    }

    public final void EJF(Context context, AnonymousClass0iw r3, C254703su r4, DirectThreadKey directThreadKey) {
        throw C66583MXo.A0a();
    }

    public final 1aU EJG(C254743sy r5, String str) {
        C304566Ea A002 = A00(this);
        Long A0q = DbV.A0q(str);
        return C66581MXm.A0O(C66581MXm.A0M(new C72120Owf(A0q, 55), A002.A02), "rxmailbox_retry_message");
    }

    public final void EKD(C254743sy r2, String str) {
        throw C66583MXo.A0a();
    }

    public final void ELs(OCA oca, C254743sy r3, String str, boolean z) {
        throw C66583MXo.A0a();
    }

    public final 1aU ELy(OCA oca, MessageIdentifier messageIdentifier, C254743sy r4, String str, List list, boolean z) {
        throw C66583MXo.A0a();
    }

    public final 1aU EM5(C53401GnY gnY, OCA oca, C254743sy r4, String str, String str2, String str3, List list, boolean z) {
        throw C66583MXo.A0a();
    }

    public final void EMA(DirectThreadKey directThreadKey, DirectAnimatedMedia directAnimatedMedia, C254783t2 r4, ExtendedImageUrl extendedImageUrl, String str, String str2, String str3, long j) {
        throw C66583MXo.A0a();
    }

    public final void EMB(C317966o8 r2, DirectThreadKey directThreadKey, ExtendedImageUrl extendedImageUrl, String str, String str2, String str3, long j) {
        throw C66583MXo.A0a();
    }

    public final void EMO(C254933tI r2, C254743sy r3, String str, String str2, String str3, String str4, String str5) {
        throw C66583MXo.A0a();
    }

    public final void EMl(C254933tI r2, DirectStoreSticker directStoreSticker, C254783t2 r4, String str) {
        throw C66583MXo.A0a();
    }

    public final void EMu(C70766OKm oKm, C254933tI r3, OCA oca, C254743sy r5, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List list, boolean z) {
        throw C66583MXo.A0a();
    }

    public final 1aU EN2(C254783t2 r10, ClipInfo clipInfo, Long l, String str, String str2) {
        boolean A1Y = C51970G9q.A1Y(str);
        if (r10 instanceof MsysThreadId) {
            Integer A002 = C70119NxZ.A00(str);
            if (A002 != null) {
                C304566Ea A003 = A00(this);
                return C66581MXm.A0M(new C72048OvN(A003, clipInfo, A002, l, (String) null, (String) null, A1Y), C304566Ea.A01(A003, (AnonymousClass9HR) r10));
            }
            throw DbW.A0c("Null ephemeralityType. ViewMode: ", str);
        }
        throw AnonymousClass7TE.A1B(AnonymousClass7TG.A0m(r10, "Unsupported thread target for sendVisualMessageRx: ", AnonymousClass7TE.A1A()));
    }

    public final void EN5(C254933tI r15, C254743sy r16, C63822L8d l8d, String str, String str2, String str3, List list, boolean z) {
        MsysThreadId A06 = C66647MaG.A06(r16);
        UserSession userSession = this.A01;
        long j = A06.A00;
        Long A012 = AnonymousClass4KK.A01(A06);
        AnonymousClass19S A013 = AnonymousClass1HX.A01(1615100382, 3);
        C254933tI r4 = r15;
        MsysVoiceMessageSender$sendSecureVoiceMessage$1 msysVoiceMessageSender$sendSecureVoiceMessage$1 = new MsysVoiceMessageSender$sendSecureVoiceMessage$1(r4, (C70472O7x) userSession.A01(C70472O7x.class, C73911Plm.A00(userSession, 9)), l8d, A012, (String) null, str, str3, (AnonymousClass4D7) null, j);
        19B r0 = 19B.A00;
        Integer num = AnonymousClass05K.A00;
        Pr4 pr4 = new Pr4(1Ep.A02(r0, A013));
        pr4.A0T(num, pr4, msysVoiceMessageSender$sendSecureVoiceMessage$1);
    }

    public final void FJB(C254743sy r2, String str) {
        throw C66583MXo.A0a();
    }
}
