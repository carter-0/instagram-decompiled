package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.visual.model.DirectVisualMessageItemModel;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.N3h  reason: case insensitive filesystem */
public final class C68167N3h extends AnonymousClass0T0 {
    public PrivacyMediaOverlayViewModel A00;
    public final float A01;
    public final int A02;
    public final long A03;
    public final ImageUrl A04;
    public final C70701OGw A05;
    public final C282485Dg A06;
    public final C271434iq A07;
    public final DirectVisualMessageItemModel.MediaFields.RemixMedia A08;
    public final DirectVisualMessageItemModel.MediaFields.TamMedia A09;
    public final 1Xj A0A;
    public final 1iA A0B;
    public final User A0C;
    public final Long A0D;
    public final Long A0E;
    public final Long A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final List A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;

    public C68167N3h(ImageUrl imageUrl, C70701OGw oGw, C282485Dg r7, C271434iq r8, DirectVisualMessageItemModel.MediaFields.RemixMedia remixMedia, DirectVisualMessageItemModel.MediaFields.TamMedia tamMedia, PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel, 1Xj r12, 1iA r13, User user, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, float f, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        String str10 = str5;
        String str11 = str4;
        C51973G9u.A0t(5, str11, str10, r13);
        List list2 = list;
        0qQ.A0B(list2, 11);
        this.A0K = str;
        this.A0G = str2;
        this.A0J = str3;
        this.A0C = user;
        this.A0M = str11;
        this.A0X = z;
        this.A0A = r12;
        this.A0I = str10;
        this.A0B = r13;
        this.A03 = j;
        this.A0P = list2;
        this.A0Z = z2;
        this.A0S = z3;
        this.A0Q = z4;
        this.A0Y = z5;
        this.A0W = z6;
        this.A0R = z7;
        this.A0H = str6;
        this.A0O = str7;
        this.A04 = imageUrl;
        this.A0F = l;
        this.A0D = l2;
        this.A01 = f;
        this.A0L = str8;
        this.A05 = oGw;
        this.A06 = r7;
        this.A02 = i;
        this.A0N = str9;
        this.A07 = r8;
        this.A09 = tamMedia;
        this.A00 = privacyMediaOverlayViewModel;
        this.A08 = remixMedia;
        this.A0E = l3;
        this.A0T = z8;
        this.A0U = z9;
        this.A0V = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68167N3h) {
                C68167N3h n3h = (C68167N3h) obj;
                if (!0qQ.A0K(this.A0K, n3h.A0K) || !0qQ.A0K(this.A0G, n3h.A0G) || !0qQ.A0K(this.A0J, n3h.A0J) || !0qQ.A0K(this.A0C, n3h.A0C) || !0qQ.A0K(this.A0M, n3h.A0M) || this.A0X != n3h.A0X || !0qQ.A0K(this.A0A, n3h.A0A) || !0qQ.A0K(this.A0I, n3h.A0I) || this.A0B != n3h.A0B || this.A03 != n3h.A03 || !0qQ.A0K(this.A0P, n3h.A0P) || this.A0Z != n3h.A0Z || this.A0S != n3h.A0S || this.A0Q != n3h.A0Q || this.A0Y != n3h.A0Y || this.A0W != n3h.A0W || this.A0R != n3h.A0R || !0qQ.A0K(this.A0H, n3h.A0H) || !0qQ.A0K(this.A0O, n3h.A0O) || !0qQ.A0K(this.A04, n3h.A04) || !0qQ.A0K(this.A0F, n3h.A0F) || !0qQ.A0K(this.A0D, n3h.A0D) || Float.compare(this.A01, n3h.A01) != 0 || !0qQ.A0K(this.A0L, n3h.A0L) || !0qQ.A0K(this.A05, n3h.A05) || !0qQ.A0K(this.A06, n3h.A06) || this.A02 != n3h.A02 || !0qQ.A0K(this.A0N, n3h.A0N) || !0qQ.A0K(this.A07, n3h.A07) || !0qQ.A0K(this.A09, n3h.A09) || !0qQ.A0K(this.A00, n3h.A00) || !0qQ.A0K(this.A08, n3h.A08) || !0qQ.A0K(this.A0E, n3h.A0E) || this.A0T != n3h.A0T || this.A0U != n3h.A0U || this.A0V != n3h.A0V) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r3.A0Q == false) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r6.A0H == null) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass3WR A00() {
        /*
            r6 = this;
            X.4iq r3 = r6.A07
            r5 = 1
            if (r3 == 0) goto L_0x000a
            boolean r0 = r3.A0Q
            r2 = 1
            if (r0 != 0) goto L_0x000b
        L_0x000a:
            r2 = 0
        L_0x000b:
            boolean r0 = r6.A0R
            if (r0 == 0) goto L_0x0014
            java.lang.String r1 = r6.A0H
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r2 != 0) goto L_0x0073
            if (r0 != 0) goto L_0x0073
            java.lang.String r2 = "DirectVisualMessageViewerItem"
            java.lang.StringBuilder r4 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "mediaFields != null: "
            r4.append(r0)
            boolean r0 = X.AnonymousClass7TF.A1V(r3)
            r4.append(r0)
            java.lang.String r1 = ",\n"
            r4.append(r1)
            if (r3 == 0) goto L_0x003f
            java.lang.String r0 = "mediaFields.hasVideoSource: "
            r4.append(r0)
            boolean r0 = r3.A0Q
            r4.append(r0)
            r4.append(r1)
        L_0x003f:
            java.lang.String r0 = "localVideoPath != null: "
            r4.append(r0)
            java.lang.String r0 = r6.A0H
            if (r0 != 0) goto L_0x0049
            r5 = 0
        L_0x0049:
            r4.append(r5)
            r4.append(r1)
            java.lang.String r0 = "isViewableOnce: "
            r4.append(r0)
            boolean r0 = r6.A0Y
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = "isPermanentVisualMessage: "
            r4.append(r0)
            boolean r0 = r6.A0W
            r4.append(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "invalid media or local video when calling getVideoSource(): "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r4, r0, r1)
            X.0wb.A03(r2, r0)
        L_0x0073:
            if (r3 == 0) goto L_0x0079
            X.3WR r0 = r3.A09
            if (r0 != 0) goto L_0x007f
        L_0x0079:
            java.lang.String r0 = r6.A0H
            X.3WR r0 = X.C271384il.A03(r0)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68167N3h.A00():X.3WR");
    }

    public final String A01() {
        String str = this.A0K;
        if (str != null) {
            return str;
        }
        String str2 = this.A0G;
        if (str2 == null) {
            return this.A0J;
        }
        return str2;
    }

    public final int hashCode() {
        String str = this.A0J;
        int A082 = AnonymousClass7TF.A08(this.A0M, (AnonymousClass7TF.A08(str, ((AnonymousClass7TG.A0E(this.A0K) * 31) + AnonymousClass7TG.A0E(this.A0G)) * 31) + AnonymousClass7TG.A0C(this.A0C)) * 31);
        int A092 = AnonymousClass7TF.A09(this.A0W, AnonymousClass7TF.A09(this.A0Y, AnonymousClass7TF.A09(this.A0Q, AnonymousClass7TF.A09(this.A0S, AnonymousClass7TF.A09(this.A0Z, AnonymousClass7TF.A07(this.A0P, C51972G9s.A07(this.A03, AnonymousClass7TF.A07(this.A0B, AnonymousClass7TF.A08(this.A0I, (AnonymousClass7TF.A09(this.A0X, A082) + AnonymousClass7TG.A0C(this.A0A)) * 31)))))))));
        return DbS.A06(this.A0V, AnonymousClass7TF.A09(this.A0U, AnonymousClass7TF.A09(this.A0T, (((((((((((((((((((AnonymousClass7TF.A00((((((((((AnonymousClass7TF.A09(this.A0R, A092) + AnonymousClass7TG.A0E(this.A0H)) * 31) + AnonymousClass7TG.A0E(this.A0O)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A0F)) * 31) + AnonymousClass7TG.A0C(this.A0D)) * 31, this.A01) + AnonymousClass7TG.A0E(this.A0L)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + this.A02) * 31) + AnonymousClass7TG.A0E(this.A0N)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TE.A0L(this.A0E)) * 31)));
    }

    public final boolean A02(UserSession userSession) {
        User A0j = DbT.A0j(userSession);
        User user = this.A0C;
        if (user != null) {
            return 2PP.A00(A0j.getId(), user.getId());
        }
        return false;
    }
}
