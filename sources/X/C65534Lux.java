package X;

import android.content.Context;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.common.session.UserSession;
import com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Lux  reason: case insensitive filesystem */
public class C65534Lux implements 1us {
    public int A00;
    public MediaCroppingCoordinates A01;
    public MediaCroppingCoordinates A02;
    public IGTVShoppingMetadata A03;
    public C63661L1x A04;
    public NewFundraiserInfo A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    @Deprecated
    public boolean A0F;

    public final boolean CT0() {
        return false;
    }

    public final boolean CT1() {
        return false;
    }

    public final boolean CUN() {
        return false;
    }

    public final /* synthetic */ void DCv(AnonymousClass1XT r1, UserSession userSession, AnonymousClass3Q2 r3) {
    }

    public final /* bridge */ /* synthetic */ Object AEc(AnonymousClass3Q2 r2) {
        return new C63723L4h(this, r2);
    }

    public final ShareType BtR() {
        if (this instanceof C61957KTg) {
            return ((C61957KTg) this).A00;
        }
        return ShareType.IGTV;
    }

    public final int C2A() {
        return this.A00;
    }

    public final boolean CQR() {
        return this.A0B;
    }

    public final K1X E1q(2ZL r4, UserSession userSession) {
        return new C64842Lj4(new 0bH(userSession), new C64593Led()).A00(r4);
    }

    public final void E3L(UserSession userSession, AnonymousClass3Q2 r7, LFD lfd) {
        1Xj r4 = r7.A1C;
        r4.A0C.Ecy(new 1qs(this.A01, this.A02, (MediaCroppingCoordinates) null));
        lfd.A00(r4, r7, false);
    }

    public final String getTypeName() {
        if (this instanceof C61957KTg) {
            return "PostLiveIGTVShareTarget";
        }
        return "IGTVVideoShareTarget";
    }

    public final 1Xj Dou(Context context, AnonymousClass1XT r8, UserSession userSession, AnonymousClass3Q2 r10) {
        r8.getClass();
        1Xj r5 = ((K1X) r8).A00;
        List A002 = AnonymousClass8OY.A00(userSession).A00(r10.A3t);
        List A3Y = r5.A3Y();
        1as.A04.A0G(userSession, "FEED", A3Y, A002);
        Iterator it = A3Y.iterator();
        while (it.hasNext()) {
            User A0k = DbT.A0k(it);
            if (AnonymousClass8OY.A01(userSession) || (A002 != null && JTQ.A1T(A0k, A002))) {
                1as.A04.A0B(userSession, r5, new DirectShareTarget(A0k));
            }
        }
        return r5;
    }

    public final void ESc(boolean z) {
        this.A0B = z;
    }

    public final void EnN(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x008c, code lost:
        if (r8.A2q == null) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ X.AnonymousClass1QX AEQ(android.content.Context r25, X.28D r26, com.instagram.common.gallery.metadata.MediaUploadMetadata r27, com.instagram.common.session.UserSession r28, com.instagram.pendingmedia.model.constants.ShareType r29, java.lang.Object r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.util.List r38, long r39, boolean r41, boolean r42, boolean r43, boolean r44, boolean r45) {
        /*
            r24 = this;
            r2 = r30
            X.L4h r2 = (X.C63723L4h) r2
            X.UzA r6 = X.C16674UzA.CLIPS
            java.lang.String r9 = X.0qv.A00(r25)
            r12 = r38
            r10 = r36
            r8 = r34
            r15 = r43
            r16 = r45
            r14 = r42
            r13 = r41
            r23 = r28
            r11 = r37
            r3 = r26
            r4 = r27
            r7 = r31
            r5 = r23
            X.1NY r9 = X.C64193LTa.A01(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.3Q2 r8 = r2.A01
            X.MW1 r1 = X.C63365Kvm.A00(r8)
            X.LBT r16 = X.C63368Kvp.A00(r8)
            r17 = r39
            r14 = r9
            r15 = r5
            r19 = r13
            X.C64193LTa.A0J(r14, r15, r16, r17, r19)
            r10 = 0
            X.C64193LTa.A0I(r9, r5, r1, r10)
            java.lang.String r16 = "ig_tv"
            r15 = r35
            r14 = r33
            r11 = r9
            r12 = r5
            r13 = r1
            X.C64193LTa.A0H(r11, r12, r13, r14, r15, r16)
            r0 = r24
            java.lang.String r1 = r0.A08
            if (r1 == 0) goto L_0x005a
            r0 = 1395(0x573, float:1.955E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A9m(r0, r1)
        L_0x005a:
            java.lang.String r1 = r8.A3o
            java.lang.String r0 = r8.A2Z
            r22 = r0
            X.Lux r2 = r2.A00
            boolean r15 = r2.A0F
            com.instagram.api.schemas.MediaCroppingCoordinates r14 = r2.A01
            com.instagram.api.schemas.MediaCroppingCoordinates r13 = r2.A02
            java.lang.String r0 = r2.A09
            r21 = r0
            java.lang.String r0 = r2.A06
            r20 = r0
            boolean r0 = r2.A0A
            r19 = r0
            boolean r0 = r2.A0C
            r18 = r0
            boolean r0 = r2.A0D
            r17 = r0
            com.instagram.model.fundraiser.NewFundraiserInfo r12 = r2.A05
            java.lang.String r11 = r2.A07
            boolean r7 = r8.A5Z
            X.3QO r0 = r8.A1F
            X.3QO r6 = X.AnonymousClass3QO.FAN_CLUB
            if (r0 != r6) goto L_0x008e
            java.lang.String r0 = r8.A2q
            r16 = 1
            if (r0 != 0) goto L_0x0090
        L_0x008e:
            r16 = 0
        L_0x0090:
            java.lang.String r5 = r8.A2q
            boolean r4 = r2.A0E
            X.L1x r3 = r2.A04
            boolean r2 = r8.A4w
            if (r1 == 0) goto L_0x009f
            java.lang.String r0 = "title"
            r9.A9m(r0, r1)
        L_0x009f:
            java.lang.String r1 = "caption"
            r0 = r22
            r9.A9m(r1, r0)
            java.lang.String r1 = "1"
            if (r15 == 0) goto L_0x00af
            java.lang.String r0 = "igtv_share_preview_to_feed"
            r9.A9m(r0, r1)
        L_0x00af:
            if (r14 == 0) goto L_0x00ba
            java.lang.String r14 = X.1qm.A00(r14)
            java.lang.String r0 = "feed_preview_crop"
            r9.A9m(r0, r14)
        L_0x00ba:
            if (r13 == 0) goto L_0x00c5
            java.lang.String r13 = X.1qm.A00(r13)
            java.lang.String r0 = "square_crop"
            r9.A9m(r0, r13)
        L_0x00c5:
            java.lang.String r14 = "0"
            r13 = r14
            r15 = r14
            if (r19 == 0) goto L_0x00cc
            r15 = r1
        L_0x00cc:
            java.lang.String r0 = "igtv_ads_toggled_on"
            r9.A9m(r0, r15)
            java.lang.String r15 = "igtv_series_id"
            r0 = r21
            r9.A9m(r15, r0)
            java.lang.String r15 = "igtv_composer_session_id"
            r0 = r20
            r9.A9m(r15, r0)
            if (r18 == 0) goto L_0x00e6
            java.lang.String r0 = "is_funded_deal"
            r9.A9m(r0, r1)
        L_0x00e6:
            if (r17 == 0) goto L_0x00f1
            r0 = 82
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A9m(r0, r1)
        L_0x00f1:
            if (r12 == 0) goto L_0x00fc
            java.lang.String r12 = X.C64130LPe.A00(r12)
            java.lang.String r0 = "new_fundraiser_info"
            r9.A9m(r0, r12)
        L_0x00fc:
            if (r11 == 0) goto L_0x0103
            java.lang.String r0 = "fundraiser_id"
            r9.A9m(r0, r11)
        L_0x0103:
            if (r4 == 0) goto L_0x0106
            r14 = r1
        L_0x0106:
            java.lang.String r0 = "keep_shoppable_products"
            r9.A9m(r0, r14)
            if (r3 == 0) goto L_0x0110
            X.C64193LTa.A0K(r9, r3)
        L_0x0110:
            if (r7 == 0) goto L_0x0119
            java.lang.String r3 = "internal_features"
            java.lang.String r0 = "internal_igtv"
            r9.A9m(r3, r0)
        L_0x0119:
            if (r16 == 0) goto L_0x012d
            if (r5 == 0) goto L_0x012d
            java.lang.String r3 = r6.A00
            java.lang.String r0 = "audience"
            r9.A9m(r0, r3)
            r0 = 1341(0x53d, float:1.879E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A9m(r0, r5)
        L_0x012d:
            if (r2 == 0) goto L_0x013d
            r0 = 3046(0xbe6, float:4.268E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r9.A9m(r0, r1)
            java.lang.String r0 = "allow_multiple_configures"
            r9.A9m(r0, r1)
        L_0x013d:
            java.lang.String r0 = "is_clips_video"
            r9.A9m(r0, r1)
            r0 = 4598(0x11f6, float:6.443E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A9m(r0, r1)
            X.2D6 r0 = X.2D5.A00(r23)
            X.0xa r2 = r0.A04
            java.lang.String r0 = "PREFERENCE_IG_TO_FB_WASLIVE_IS_CROSSPOSTING_ENABLED"
            boolean r0 = r2.getBoolean(r0, r10)
            if (r0 == 0) goto L_0x01a1
            java.lang.Boolean r0 = r8.A23
            java.lang.String r5 = r8.A3R
            com.instagram.share.facebook.model.FBReelsAudienceType r4 = r8.A1n
            java.lang.Integer r3 = r8.A2C
            java.util.List r2 = r8.A4N
            if (r0 == 0) goto L_0x0171
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x016c
            r13 = r1
        L_0x016c:
            java.lang.String r0 = "share_to_facebook"
            r9.A9m(r0, r13)
        L_0x0171:
            if (r5 == 0) goto L_0x0178
            java.lang.String r0 = "share_to_fb_destination_id"
            r9.A9m(r0, r5)
        L_0x0178:
            if (r3 == 0) goto L_0x0183
            java.lang.String r1 = X.C63425Kwl.A00(r3)
            java.lang.String r0 = "cross_app_share_type"
            r9.A9m(r0, r1)
        L_0x0183:
            if (r2 == 0) goto L_0x0192
            java.lang.String r1 = X.0mh.A00(r2)
            r0 = 2220(0x8ac, float:3.111E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r9.AA0(r0, r1)
        L_0x0192:
            if (r4 == 0) goto L_0x01a1
            java.lang.String r1 = r4.toString()
            r0 = 3323(0xcfb, float:4.657E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r9.A9m(r0, r1)
        L_0x01a1:
            X.1QX r0 = r9.A0N()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65534Lux.AEQ(android.content.Context, X.28D, com.instagram.common.gallery.metadata.MediaUploadMetadata, com.instagram.common.session.UserSession, com.instagram.pendingmedia.model.constants.ShareType, java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, long, boolean, boolean, boolean, boolean, boolean):X.1QX");
    }
}
