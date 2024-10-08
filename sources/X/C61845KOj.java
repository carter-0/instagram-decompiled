package X;

import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.MediaSession;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import com.instagram.user.model.UpcomingEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.KOj  reason: case insensitive filesystem */
public final class C61845KOj extends LSR {
    public boolean A00;
    public final UserSession A01;
    public final C3499682q A02;
    public final KO3 A03;
    public final String A04;
    public final C262224Cq A05;
    public final 0V2 A06;
    public final 05G A07;
    public final C61770pa A08;
    public final AnonymousClass0Ud A09;

    private final Jv3 A00(ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta, MediaTaggingInfo mediaTaggingInfo) {
        List list;
        ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta2;
        ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta3 = productCollectionFeedTaggingMeta;
        ArrayList arrayList = mediaTaggingInfo.A0D;
        Jv3 jv3 = A06().A0B;
        if (jv3 != null) {
            list = jv3.A04;
        } else {
            list = null;
        }
        Jv3 jv32 = A06().A0B;
        if (jv32 != null) {
            productCollectionFeedTaggingMeta2 = jv32.A00;
        } else {
            productCollectionFeedTaggingMeta2 = null;
        }
        if (A06().A0B == null) {
            return null;
        }
        ArrayList arrayList2 = mediaTaggingInfo.A0C;
        if (arrayList != null) {
            list = C63460KxP.A00(arrayList);
        }
        List list2 = mediaTaggingInfo.A0F;
        if (DbT.A1b(arrayList2)) {
            AnonymousClass6SR.A01().A08 = arrayList2.size();
        } else {
            productCollectionFeedTaggingMeta3 = productCollectionFeedTaggingMeta2;
        }
        0qQ.A0B(list2, 3);
        return new Jv3(productCollectionFeedTaggingMeta3, arrayList2, arrayList, list, list2);
    }

    public final void A0A(AnonymousClass0iw r22, AnonymousClass3Q2 r23, L9K l9k, List list, List list2) {
        LRC lrc;
        ArrayList arrayList;
        List list3 = list;
        ArrayList A0q = AnonymousClass7TF.A0q(list3, 1);
        ArrayList A1C = AnonymousClass7TE.A1C();
        C3499682q r6 = this.A02;
        if (r6.COf()) {
            Iterator A0w = JTP.A0w(r6);
            while (A0w.hasNext()) {
                MediaSession A0Z = JTO.A0Z(A0w);
                if (A0Z.Bsu() == AnonymousClass05K.A00) {
                    String BbR = A0Z.BbR();
                    0qQ.A0A(BbR);
                    A0q.add(BbR);
                    A1C.add(A0Z.B5g());
                }
            }
        } else {
            AnonymousClass3Q2 r2 = r23;
            A0q.add(r2.A3t);
            if (r2.A0q()) {
                String str = r2.A33;
                0qQ.A0A(str);
                A1C.add(str);
            }
        }
        UserSession userSession = this.A01;
        boolean A032 = C367088qA.A03(userSession);
        String A002 = AnonymousClass000.A00(52);
        AnonymousClass0iw r14 = r22;
        if (A032) {
            String str2 = this.A04;
            if (C64191LSy.A00(r6, true) <= 3) {
                arrayList = LTZ.A05(A1C);
                0qQ.A0C(arrayList, A002);
            } else {
                arrayList = null;
            }
            lrc = new LRC(userSession, A0q, str2, arrayList, "feed", r14);
        } else {
            if (r6.COf()) {
                List A0L = this.A03.A04().A0L();
                ArrayList A0q2 = AnonymousClass7TF.A0q(A0L, 0);
                for (Object next : A0L) {
                    if (((AnonymousClass3Q2) next).A1G == 1iA.A0Q) {
                        A0q2.add(next);
                    }
                }
                Iterator it = A0q2.iterator();
                while (it.hasNext()) {
                    JTO.A0m(it).A43 = AnonymousClass7TE.A1C();
                }
            }
            Jv3 jv3 = A06().A0B;
            if (jv3 == null) {
                jv3 = new Jv3((ProductCollectionFeedTaggingMeta) null, AnonymousClass7TE.A1C(), (ArrayList) null, (List) null, AnonymousClass7TE.A1C());
            }
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            ArrayList arrayList2 = jv3.A01;
            List list4 = jv3.A04;
            List list5 = jv3.A03;
            ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta = jv3.A00;
            AnonymousClass7TF.A1C(arrayList2, 0, list5);
            A09(C61075JwD.A00((AnonymousClass9J6) null, (C61080JwI) null, (C61066Jw4) null, (C59721JVf) null, (C61046Jvk) null, (C61077JwF) null, (C61079JwH) null, (C61062Jw0) null, (C61100JxB) null, (MediaGenAIDetectionMethod) null, (C61000Juw) null, new Jv3(productCollectionFeedTaggingMeta, arrayList2, A1C2, list4, list5), A06(), (AnonymousClass3QO) null, (Venue) null, (AudioOverlayTrack) null, (ClipInfo) null, (C272024jy) null, (UpcomingEvent) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (0eP) null, -2049, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false));
            ArrayList<Object> A0r = AnonymousClass7TG.A0r(list3);
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                DbY.A1W(A0r, it2);
            }
            0qQ.A0B(A0r, 0);
            ArrayList A1D = AnonymousClass7TE.A1D(list2);
            for (Object A1S : A0r) {
                JTR.A1S(A1S, A1D);
            }
            ArrayList A1D2 = AnonymousClass7TE.A1D(A1D);
            if (!A1D2.isEmpty()) {
                String str3 = this.A04;
                ArrayList A052 = LTZ.A05(A1C);
                0qQ.A0C(A052, A002);
                lrc = new LRC(r14, userSession, str3, "feed", A052, A1D2);
            } else {
                return;
            }
        }
        L9K l9k2 = l9k;
        02m r4 = l9k2.A01;
        0qQ.A06(r4);
        Set set = l9k2.A03;
        0qQ.A0B(set, 2);
        if (set.contains(37370567)) {
            r4.markerEnd(37370567, 111);
        }
        set.add(37370567);
        r4.markerStart(37370567);
        r4.markerAnnotate(37370567, "input_type", l9k2.A02);
        r4.markerAnnotate(37370567, "media_count", l9k2.A00);
        lrc.A01();
    }

    public final void A0B(ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta, List list, boolean z) {
        C61075JwD A0J;
        C61075JwD jwD;
        Object obj;
        this.A00 = z;
        List<MediaTaggingInfo> list2 = list;
        if (!list2.isEmpty()) {
            ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta2 = productCollectionFeedTaggingMeta;
            if (list2.size() == 1) {
                A0J = C61075JwD.A00((AnonymousClass9J6) null, (C61080JwI) null, (C61066Jw4) null, (C59721JVf) null, (C61046Jvk) null, (C61077JwF) null, (C61079JwH) null, (C61062Jw0) null, (C61100JxB) null, (MediaGenAIDetectionMethod) null, (C61000Juw) null, A00(productCollectionFeedTaggingMeta2, (MediaTaggingInfo) list2.get(0)), A06(), (AnonymousClass3QO) null, (Venue) null, (AudioOverlayTrack) null, (ClipInfo) null, (C272024jy) null, (UpcomingEvent) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (0eP) null, -2049, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false);
            } else {
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (MediaTaggingInfo mediaTaggingInfo : list2) {
                    List list3 = A06().A0S;
                    if (list3 != null) {
                        Iterator it = list3.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (0qQ.A0K(mediaTaggingInfo.A06, ((C61075JwD) obj).A0N)) {
                                break;
                            }
                        }
                        jwD = (C61075JwD) obj;
                        if (jwD != null) {
                            A1C.add(C61075JwD.A00((AnonymousClass9J6) null, (C61080JwI) null, (C61066Jw4) null, (C59721JVf) null, (C61046Jvk) null, (C61077JwF) null, (C61079JwH) null, (C61062Jw0) null, (C61100JxB) null, (MediaGenAIDetectionMethod) null, (C61000Juw) null, A00(productCollectionFeedTaggingMeta2, mediaTaggingInfo), jwD, (AnonymousClass3QO) null, (Venue) null, (AudioOverlayTrack) null, (ClipInfo) null, (C272024jy) null, (UpcomingEvent) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (0eP) null, -2049, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false));
                        }
                    }
                    jwD = new C61075JwD((AnonymousClass9J6) null, (C61080JwI) null, (C61066Jw4) null, (C59721JVf) null, (C61046Jvk) null, (C61077JwF) null, (C61079JwH) null, (C61062Jw0) null, (C61100JxB) null, (MediaGenAIDetectionMethod) null, (C61000Juw) null, (Jv3) null, (AnonymousClass3QO) null, (1iA) null, (Venue) null, (AudioOverlayTrack) null, (ClipInfo) null, (C272024jy) null, (UpcomingEvent) null, mediaTaggingInfo.A06, "", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (0eP) null, 0, true, false, false, false, false, false, false, false, false, true, false, false, true, true);
                    A1C.add(C61075JwD.A00((AnonymousClass9J6) null, (C61080JwI) null, (C61066Jw4) null, (C59721JVf) null, (C61046Jvk) null, (C61077JwF) null, (C61079JwH) null, (C61062Jw0) null, (C61100JxB) null, (MediaGenAIDetectionMethod) null, (C61000Juw) null, A00(productCollectionFeedTaggingMeta2, mediaTaggingInfo), jwD, (AnonymousClass3QO) null, (Venue) null, (AudioOverlayTrack) null, (ClipInfo) null, (C272024jy) null, (UpcomingEvent) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (0eP) null, -2049, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false));
                }
                A0J = C61075JwD.A00((AnonymousClass9J6) null, (C61080JwI) null, (C61066Jw4) null, (C59721JVf) null, (C61046Jvk) null, (C61077JwF) null, (C61079JwH) null, (C61062Jw0) null, (C61100JxB) null, (MediaGenAIDetectionMethod) null, (C61000Juw) null, (Jv3) null, A06(), (AnonymousClass3QO) null, (Venue) null, (AudioOverlayTrack) null, (ClipInfo) null, (C272024jy) null, (UpcomingEvent) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, A1C, (List) null, (0eP) null, -67108865, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false);
            }
            A09(A0J);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C61845KOj(UserSession userSession, C3499682q r5, KO3 ko3, String str) {
        super(ko3);
        AnonymousClass19S A022 = 19E.A02(new AnonymousClass12U().A04);
        C51974G9v.A1P(userSession, ko3, r5, str);
        0qQ.A0B(A022, 5);
        this.A01 = userSession;
        this.A03 = ko3;
        this.A02 = r5;
        this.A04 = str;
        this.A05 = A022;
        02z A10 = DbS.A10(new C61003Juz((ArrayList) null, (List) null, false));
        this.A07 = A10;
        this.A09 = 10b.A03(A10);
        05D A012 = 10D.A01(AnonymousClass05K.A00, 0, 0);
        this.A06 = A012;
        this.A08 = new 0V1((C262204Co) null, A012);
    }
}
