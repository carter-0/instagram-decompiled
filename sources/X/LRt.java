package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.CommentPromptImpl;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo;
import com.instagram.feed.media.CameraToolInfo;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.model.venue.LocationDict;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.InstagramAudioApplySource;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class LRt {
    public static final Integer A00(AnonymousClass9P8 r1, C2801950r r2, String str, String str2, List list) {
        AnonymousClass8JI r22;
        DbZ.A0t(0, list, str, r2);
        if (list.isEmpty()) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Error: draft video segment is empty, session id ");
            A1A.append(str);
            0kD.A06(str2, AnonymousClass7TG.A0m(r2, ", clips creation type ", A1A), (Throwable) null);
            return null;
        }
        int i = 0;
        if (r1 != null && (r22 = r1.A06) != null && r22 == AnonymousClass8JI.SEQUENTIAL_REMIX && list.size() > 1) {
            i = 1;
        }
        return Integer.valueOf(i);
    }

    public static final void A02(MediaCroppingCoordinates mediaCroppingCoordinates, C293505kq r6, AnonymousClass3Q2 r7, boolean z, boolean z2) {
        String str;
        r7.A0N();
        List<PendingRecipient> list = r6.A0t;
        if (list == null || list.isEmpty()) {
            r7.A4w = false;
            r7.A5Q = false;
            AnonymousClass55Z r0 = new AnonymousClass55Z();
            r0.A05 = z;
            r0.A01 = mediaCroppingCoordinates;
            r0.A04 = z2;
            r7.A0a(r0);
            return;
        }
        r7.A4w = true;
        for (PendingRecipient pendingRecipient : list) {
            AnonymousClass55Z r1 = new AnonymousClass55Z();
            r1.A05 = z;
            r1.A01 = mediaCroppingCoordinates;
            if (pendingRecipient.A0Q) {
                str = pendingRecipient.getId();
            } else {
                str = null;
            }
            r1.A02 = str;
            r1.A04 = z2;
            r7.A0a(r1);
        }
        r7.A5Q = true;
    }

    public static final void A03(UserSession userSession, C293505kq r14, AnonymousClass3Q2 r15, String str) {
        Integer num;
        C279294yP r1;
        String str2;
        String str3;
        InstagramAudioApplySource instagramAudioApplySource;
        AudioOverlayTrack audioOverlayTrack;
        AudioOverlayTrack audioOverlayTrack2;
        String str4;
        BEC bec;
        Long l;
        String str5 = str;
        0qQ.A0B(userSession, 0);
        ShareMediaLoggingInfo shareMediaLoggingInfo = r14.A0B;
        if (shareMediaLoggingInfo != null) {
            num = Integer.valueOf(shareMediaLoggingInfo.A00);
        } else {
            num = null;
        }
        r15.A26 = num;
        r15.A2w = r14.A0X;
        r15.A4y = r14.A11;
        r15.A5a = r14.A14;
        r15.A5s = r14.A16;
        r15.A5Y = r14.A13;
        r15.A54 = r14.A0w;
        r15.A62 = AnonymousClass3WP.A06(userSession);
        0xa A0q = AnonymousClass7TE.A0q(userSession);
        0Tu r5 = 0Tu.A05;
        r15.A6A = A0q.getBoolean("translate_captions_for_video", 182.A06(r5, userSession, 36322920674503337L));
        r15.A6B = AnonymousClass7TE.A0q(userSession).getBoolean("translate_stickers", false);
        AnonymousClass55Q r12 = r15.A1O;
        if (!(r12 == null || (l = r12.A01) == null || C2807253k.A00(String.valueOf(l.longValue())) != CameraTool.HORIZON)) {
            r15.A3a = r14.A0T;
        }
        r15.A2c = r14.A0T;
        r15.A5A = r14.A0y;
        if (r14.A0H == C2801950r.FEED_POST) {
            r1 = C279294yP.FEED;
        } else {
            r1 = C279294yP.CLIPS;
        }
        r15.A0h = r1;
        C279584ys r4 = r14.A08;
        if (r4 == null || (bec = r4.A01) == null) {
            str2 = null;
        } else {
            str2 = bec.A00;
        }
        r15.A3f = str2;
        0sn r13 = r14.A0q;
        if (r13 == null) {
            r13 = 0sn.A00;
        }
        ArrayList A1D = AnonymousClass7TE.A1D(r13);
        0qQ.A0B(A1D, 0);
        r15.A40 = A1D;
        C272024jy r2 = r14.A0O;
        if (r2 != null && JUO.A00(userSession)) {
            r15.A0u = C63013Kq3.A00(LQD.A00().A00, r2);
        }
        if (r14.A0x) {
            r15.A0u = C63013Kq3.A00(new CommentPromptImpl((String) null, (Integer) null), LQD.A00().A01);
            CameraToolInfo cameraToolInfo = new CameraToolInfo(CameraTool.COMMENT_PROMPTS, (Float) null, (Float) null, (Float) null);
            ArrayList A0U = 00k.A0U(r15.A4D);
            A0U.add(C63184Ksr.A00(cameraToolInfo, 0));
            r15.A4D = A0U;
        }
        List list = r14.A0n;
        if (list == null || list.isEmpty() || (list instanceof ArrayList) || !182.A06(r5, userSession, 36325532014490648L)) {
            if (!(list instanceof ArrayList) || list == null) {
                list = AnonymousClass7TE.A1C();
            }
            r15.A4L = list;
        } else {
            r15.A4L = list;
        }
        r15.A2d = r14.A0U;
        AnonymousClass3QO r3 = r14.A0K;
        if (!(r3 == null || r15.A1F == AnonymousClass3QO.FAN_CLUB)) {
            r15.A1F = r3;
        }
        LocationDict locationDict = r14.A0L;
        if (locationDict != null) {
            r15.A1H = locationDict;
        }
        if (r15.A3n == null) {
            if (r4 != null) {
                str4 = Long.valueOf(r4.A00).toString();
            } else {
                str4 = null;
            }
            r15.A3n = str4;
        }
        String str6 = r14.A0b;
        if (str6 != null) {
            int A04 = 00l.A04(str6, '_', 0);
            if (A04 != -1) {
                str6 = C51967G9n.A0q(str6, 0, A04);
            }
        } else {
            str6 = null;
        }
        r15.A3P = str6;
        r15.A6D = r14.A19;
        ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel = r14.A0R;
        if (existingStandaloneFundraiserForFeedModel != null) {
            r15.A2x = existingStandaloneFundraiserForFeedModel.A03;
            r15.A2y = r14.A0Y;
        } else {
            NewFundraiserInfo newFundraiserInfo = r14.A0J;
            if (newFundraiserInfo != null) {
                String str7 = newFundraiserInfo.A02;
                int i = newFundraiserInfo.A00;
                String str8 = newFundraiserInfo.A05;
                String str9 = newFundraiserInfo.A07;
                boolean z = newFundraiserInfo.A09;
                if (str == null && (str5 = r14.A0S) == null) {
                    str5 = "";
                }
                r15.A1E = new NewFundraiserInfo(str7, str8, str9, str5, "REELS", newFundraiserInfo.A01, (String) null, (String) null, newFundraiserInfo.A08, i, z);
                r15.A2y = r14.A0Y;
            }
        }
        r15.A3G = r14.A0f;
        UpcomingEventImpl upcomingEventImpl = r14.A0Q;
        UpcomingEventImpl upcomingEventImpl2 = null;
        if (upcomingEventImpl != null) {
            upcomingEventImpl2 = upcomingEventImpl.FGz((1E6) null);
        }
        r15.A1p = upcomingEventImpl2;
        r15.A3A = r14.A0d;
        r15.A6E = r14.A1A;
        r15.A0k = new AnonymousClass9J6(r14.A0Z, r14.A0a, 11);
        AudioOverlayTrack audioOverlayTrack3 = r14.A0N;
        if (audioOverlayTrack3 == null || (str3 = audioOverlayTrack3.A0C) == null) {
            List list2 = r14.A0p;
            if (list2 == null || (audioOverlayTrack2 = (AudioOverlayTrack) 00k.A0J(list2)) == null) {
                str3 = null;
            } else {
                str3 = audioOverlayTrack2.A0C;
            }
        }
        r15.A2P = str3;
        if (audioOverlayTrack3 == null || (instagramAudioApplySource = audioOverlayTrack3.A07) == null) {
            List list3 = r14.A0p;
            if (list3 == null || (audioOverlayTrack = (AudioOverlayTrack) 00k.A0J(list3)) == null) {
                instagramAudioApplySource = null;
            } else {
                instagramAudioApplySource = audioOverlayTrack.A07;
            }
        }
        r15.A1I = instagramAudioApplySource;
        C61066Jw4 jw4 = r14.A03;
        if (jw4 != null) {
            r15.A0m = jw4;
        }
        if (r15.A1F == AnonymousClass3QO.OPAL) {
            ArrayList A1D2 = AnonymousClass7TE.A1D(0sn.A00);
            0qQ.A0B(A1D2, 0);
            r15.A40 = A1D2;
            r15.A2d = null;
            r15.A4L = AnonymousClass7TE.A1C();
            r15.A2x = null;
            r15.A1q = null;
            r15.A1E = null;
        }
        C61000Juw juw = r14.A0I;
        if (juw != null) {
            r15.A1B = juw;
        }
        C61080JwI jwI = r14.A02;
        if (jwI != null) {
            r15.A0l = jwI;
        }
    }

    public static final void A01(Context context, MediaCroppingCoordinates mediaCroppingCoordinates, UserSession userSession, C293505kq r5, C66476MTe mTe, C66477MTf mTf, AnonymousClass3Q2 r8, String str, boolean z, boolean z2) {
        boolean z3;
        AnonymousClass9P8 r0;
        C2802350v A00;
        AnonymousClass7TG.A1P(userSession, r8);
        A02(mediaCroppingCoordinates, r5, r8, z, z2);
        A03(userSession, r5, r8, str);
        C63876LAf lAf = new C63876LAf(context, userSession, r5, r8);
        AnonymousClass3Q2 r2 = lAf.A07;
        List list = r2.A4a;
        if (list != null && AnonymousClass7TE.A1b(list) && (r0 = lAf.A06.A0E) != null) {
            lAf.A01 = r0;
            List list2 = r2.A4a;
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AnonymousClass513 r02 = ((C282745Eo) it.next()).A04;
                    if (!(r02 == null || (A00 = r02.A00()) == null || !(A00 instanceof C40607Aev))) {
                        C40607Aev aev = (C40607Aev) A00;
                        Medium medium = aev.A06;
                        if ((medium == null || TextUtils.isEmpty(medium.A0X) || !JTQ.A1Z(aev.A06.A0X)) && aev.A06.CeS()) {
                            lAf.A00 = aev;
                            z3 = true;
                            break;
                        }
                    }
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        z3 = false;
        lAf.A03 = z3;
        if (z3) {
            mTf.EvY();
            lAf.A02 = new L43(mTe, mTf);
            if (lAf.A03) {
                AnonymousClass9P8 r22 = lAf.A01;
                if (r22 != null) {
                    C40607Aev aev2 = lAf.A00;
                    if (aev2 != null) {
                        C290815g0 A03 = C59730JVo.A03(lAf.A04, lAf.A05, new C11211SFl(r22.A0A, "ClipsPendingMediaAssetDownloader", true, false, false));
                        A03.A00 = new C61673KGx(2, lAf, aev2);
                        1ES.A03(A03);
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            return;
        }
        mTe.DWb();
    }
}
