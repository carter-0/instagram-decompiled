package X;

import android.graphics.Rect;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.List;

/* renamed from: X.8vb  reason: invalid class name and case insensitive filesystem */
public abstract class C369958vb {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007b, code lost:
        if (r15 == null) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C369968vc A00(X.C378109On r30) {
        /*
            r4 = r30
            java.lang.String r8 = r4.A06
            X.50r r14 = r4.A03
            long r2 = r4.A01
            java.lang.String r11 = r4.A09
            java.lang.String r10 = r4.A04
            java.lang.String r9 = r4.A05
            java.lang.String r7 = r4.A07
            java.util.List r5 = r4.A0A
            X.9P8 r13 = r4.A02
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0061
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Error: draft video segment is empty, session id "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", clips creation type "
            r1.append(r0)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ClipsDraftLocalDataSource"
            X.0wb.A03(r0, r1)
            r15 = 0
        L_0x0039:
            r0 = 10
            int r0 = X.0Yv.A1E(r5, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L_0x0048:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r5.next()
            X.51M r0 = (X.AnonymousClass51M) r0
            int r1 = r0.A08
            int r0 = r0.A09
            int r1 = r1 - r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r6.add(r0)
            goto L_0x0048
        L_0x0061:
            r6 = 0
            if (r13 == 0) goto L_0x007d
            X.8JI r12 = r13.A06
            if (r12 == 0) goto L_0x007d
            X.8JI r0 = X.AnonymousClass8JI.SEQUENTIAL_REMIX
            r1 = 1
            if (r12 != r0) goto L_0x0086
            int r0 = r5.size()
            if (r0 <= r1) goto L_0x0086
        L_0x0073:
            java.lang.Object r0 = r5.get(r1)
            X.51M r0 = (X.AnonymousClass51M) r0
            X.51R r15 = r0.A0F
            if (r15 != 0) goto L_0x0039
        L_0x007d:
            java.lang.Object r0 = r5.get(r6)
            X.51M r0 = (X.AnonymousClass51M) r0
            X.51R r15 = r0.A0F
            goto L_0x0039
        L_0x0086:
            r1 = 0
            goto L_0x0073
        L_0x0088:
            int r23 = X.00k.A02(r6)
            boolean r6 = r4.A0B
            long r0 = r4.A00
            java.lang.String r5 = r4.A08
            r16 = 0
            boolean r4 = r4.A0C
            r30 = 0
            X.8vc r12 = new X.8vc
            r24 = r2
            r26 = r0
            r28 = r6
            r29 = r4
            r21 = r7
            r22 = r5
            r20 = r9
            r19 = r10
            r18 = r11
            r17 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r29, r30)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C369958vb.A00(X.9On):X.8vc");
    }

    /* JADX WARNING: type inference failed for: r0v26, types: [X.55O, java.lang.Object, X.9oB] */
    /* JADX WARNING: type inference failed for: r6v0, types: [X.L6N, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v2, types: [X.8vh, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v44, types: [X.8vl, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v20, types: [java.lang.Object, X.8vj] */
    /* JADX WARNING: type inference failed for: r0v45, types: [X.8vp, java.lang.Object] */
    public static final C293505kq A01(UserSession userSession, AnonymousClass9OY r88) {
        JXu jXu;
        MediaCroppingCoordinates mediaCroppingCoordinates;
        LocationDict locationDict;
        UpcomingEventImpl upcomingEventImpl;
        CropInfo cropInfo;
        AnonymousClass9OY r11 = r88;
        List list = r11.A0m;
        C370018vh r8 = r11.A0C;
        List list2 = r11.A0j;
        C377999Ob r3 = r11.A0J;
        List list3 = r3.A02;
        List list4 = r3.A03;
        Jv8 jv8 = (Jv8) 00k.A0J(list4);
        C370018vh r82 = r8;
        if (jv8 != null) {
            r82 = r8;
            if (182.A06(0Tu.A05, userSession, 36330909313549135L)) {
                list = jv8.A06;
                ? obj = new Object();
                ? obj2 = new Object();
                ? obj3 = new Object();
                obj3.A04 = obj2;
                obj3.A03 = new Object();
                obj.A02 = obj3;
                obj.A01 = jv8.A00;
                list2 = jv8.A04;
                list3 = jv8.A05;
                r82 = obj;
            }
        }
        String str = r11.A0W;
        JYL jyl = r3.A01;
        if (r11.A0z) {
            jXu = JXu.A03;
        } else {
            jXu = JXu.A02;
        }
        C2801950r r27 = r11.A0G;
        AudioOverlayTrack audioOverlayTrack = r11.A0N;
        String str2 = r11.A0e;
        ShareMediaLoggingInfo shareMediaLoggingInfo = r11.A0B;
        AnonymousClass9P8 r24 = r11.A0E;
        String str3 = r11.A0Q;
        String str4 = r11.A0S;
        C381689cA r0 = r11.A05;
        if (r0 != null) {
            mediaCroppingCoordinates = new MediaCroppingCoordinates(r0.A00, r0.A01, r0.A02, r0.A03);
        } else {
            mediaCroppingCoordinates = null;
        }
        boolean z = r11.A0w;
        String str5 = r11.A0U;
        List list5 = r11.A0k;
        C272024jy r34 = r11.A0O;
        AnonymousClass3QO r30 = r11.A0L;
        String str6 = r11.A0R;
        List list6 = r11.A0g;
        String str7 = r11.A0T;
        Venue venue = r11.A0M;
        if (venue != null) {
            locationDict = venue.A00.FG5();
        } else {
            locationDict = null;
        }
        String str8 = r11.A0d;
        List list7 = r11.A0f;
        C279584ys r87 = r11.A0A;
        boolean z2 = r11.A0x;
        List list8 = r11.A0i;
        01N A1H = 0jo.A1H();
        C357588Yu r2 = r11.A0F;
        Integer num = AnonymousClass05K.A00;
        ? obj4 = new Object();
        obj4.A00 = num;
        obj4.A00 = r2;
        A1H.add(obj4);
        C388649oA r02 = r11.A0H;
        if (r02 != null) {
            A1H.add(r02);
        }
        01N A1I = 0jo.A1I(A1H);
        UpcomingEvent upcomingEvent = r11.A0P;
        if (upcomingEvent != null) {
            upcomingEventImpl = upcomingEvent.FGz((1E6) null);
        } else {
            upcomingEventImpl = null;
        }
        String str9 = r11.A0X;
        String str10 = r11.A0V;
        String str11 = r11.A0Y;
        long j = r11.A03;
        long j2 = r11.A04;
        long j3 = r11.A02;
        ? obj5 = new Object();
        obj5.A01 = j;
        obj5.A02 = j2;
        obj5.A00 = j3;
        C63815L7w l7w = r11.A0D;
        C61062Jw0 jw0 = r11.A07;
        C381639c5 r03 = r11.A0K;
        if (r03 != null) {
            int i = r03.A01;
            int i2 = r03.A00;
            Rect rect = new Rect();
            r03.A02.roundOut(rect);
            cropInfo = new CropInfo(rect, i, i2);
        } else {
            cropInfo = null;
        }
        boolean z3 = r11.A0o;
        boolean z4 = r11.A0r;
        boolean z5 = r11.A0q;
        boolean z6 = r11.A0t;
        boolean z7 = r11.A0v;
        boolean z8 = r11.A0s;
        List list9 = r11.A0h;
        List list10 = r11.A0l;
        String str12 = r11.A0c;
        int i3 = r11.A00;
        long j4 = r11.A01;
        boolean z9 = r11.A0p;
        String str13 = r11.A0a;
        String str14 = r11.A0Z;
        String str15 = r11.A0b;
        C61000Juw juw = r11.A0I;
        C61100JxB jxB = r11.A08;
        C61080JwI jwI = r11.A06;
        boolean z10 = r11.A0n;
        return new C293505kq(jwI, (C61066Jw4) null, jw0, jxB, mediaCroppingCoordinates, r11.A09, r87, (LFS) null, cropInfo, shareMediaLoggingInfo, r82, l7w, r24, obj5, jXu, r27, juw, (NewFundraiserInfo) null, r30, locationDict, audioOverlayTrack, (AudioOverlayTrack) null, r34, jyl, upcomingEventImpl, (ExistingStandaloneFundraiserForFeedModel) null, str, str3, str2, (String) null, str4, str5, str6, str7, str8, str11, str9, str10, (String) null, str12, str13, str14, str15, list, list3, list4, list5, list9, list6, list2, list7, list8, A1I, (List) null, list10, (List) null, i3, j4, z, z2, z3, false, z4, z5, z6, z7, z8, z9, false, z10, r11.A0u, true, r11.A0y);
    }
}
