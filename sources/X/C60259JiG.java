package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.sharesheet.audience.ClipsAudienceControlViewModel$viewState$1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.JiG  reason: case insensitive filesystem */
public final class C60259JiG extends 2YL {
    public final 2Fk A00;
    public final C61068Jw6 A01;
    public final UserSession A02;
    public final Map A03;
    public final AnonymousClass0r6 A04;
    public final 0V2 A05;
    public final 05G A06;
    public final 05G A07;
    public final C61770pa A08;
    public final AnonymousClass0Ud A09;
    public final boolean A0A;
    public final 2Fk A0B;
    public final 2Fk A0C;
    public final 05G A0D;
    public final 05G A0E;
    public final 05G A0F;
    public final 05G A0G;

    public C60259JiG(C61068Jw6 jw6, UserSession userSession) {
        LinkedHashMap A072;
        int A022 = DbW.A02(1, userSession, jw6);
        this.A02 = userSession;
        this.A01 = jw6;
        02z A0r = JTQ.A0r(0);
        this.A0D = A0r;
        this.A09 = 10b.A03(A0r);
        02z A012 = 106.A01((Object) null);
        this.A07 = A012;
        02z A013 = 106.A01(Integer.valueOf(AnonymousClass7TG.A0A(DbX.A0m(userSession).B6v())));
        this.A0E = A013;
        02z A10 = DbS.A10(C62483KgY.AUDIENCE_CONTROL_SELECTOR_V1);
        this.A06 = A10;
        19B r3 = 19B.A00;
        this.A0B = C226292g8.A00(r3, A10);
        02z A102 = DbS.A10(false);
        this.A0G = A102;
        this.A0C = C226292g8.A00(r3, A102);
        boolean A1W = AnonymousClass7TF.A1W(JTS.A0e(userSession), AnonymousClass05K.A0C);
        this.A0A = A1W;
        0eP[] r9 = new 0eP[A022];
        if (A1W) {
            JTP.A1P(C62518Kh9.PRIVATE_ACCOUNT_FOLLOWERS, false, r9, 0);
            JTP.A1P(C62518Kh9.CLOSE_FRIENDS, false, r9, 1);
            A072 = 0Yt.A07(r9);
        } else {
            JTP.A1P(C62518Kh9.EVERYONE, false, r9, 0);
            JTP.A1P(C62518Kh9.CLOSE_FRIENDS, false, r9, 1);
            A072 = 0Yt.A07(r9);
        }
        this.A03 = A072;
        this.A04 = AnonymousClass10H.A01(new ClipsAudienceControlViewModel$viewState$1(this, (AnonymousClass4D7) null), A0r, A012, A10, A013);
        05D A014 = 10D.A01(AnonymousClass05K.A00, 1, 0);
        this.A05 = A014;
        this.A08 = new 0V1((C262204Co) null, A014);
        02z A103 = DbS.A10(AnonymousClass3QO.DEFAULT);
        this.A0F = A103;
        this.A00 = C226292g8.A00(r3, A103);
        Integer Afi = DbX.A0m(userSession).Afi();
        if (Afi != null) {
            A0r.Epw(Afi);
        }
        if (this.A01.A01) {
            UserSession userSession2 = this.A02;
            1Av A002 = 1Au.A00(userSession2);
            0s0 r0 = A002.A2b;
            AnonymousClass0YZ[] r32 = 1Av.A8a;
            if (!AnonymousClass7TG.A1a(A002, r0, r32, 195)) {
                this.A07.Epw(C62442Kfs.CLOSE_FRIENDS);
                1Av A003 = 1Au.A00(userSession2);
                AnonymousClass7TF.A1J(A003, A003.A2b, r32, 195, true);
                return;
            }
        }
        this.A07.Epw((Object) null);
    }

    public final void A01(C62518Kh9 kh9, boolean z) {
        AnonymousClass3QO r0;
        0qQ.A0B(kh9, 0);
        if (z) {
            Map map = this.A03;
            JTP.A1R(kh9, map, true);
            05G r2 = this.A0F;
            int ordinal = kh9.ordinal();
            if (ordinal == 1) {
                r0 = AnonymousClass3QO.CLOSE_FRIENDS;
            } else if (ordinal == 2) {
                r0 = AnonymousClass3QO.FOLLOWERS_ONLY;
            } else if (ordinal == 4) {
                r0 = AnonymousClass3QO.FAN_CLUB;
            } else if (ordinal != 5) {
                r0 = AnonymousClass3QO.DEFAULT;
            } else {
                r0 = AnonymousClass3QO.OPAL;
            }
            r2.Epw(r0);
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                if (A1J.getKey() != kh9 && AnonymousClass7TE.A1a(A1J.getValue())) {
                    JTP.A1R(A1J.getKey(), map, false);
                }
            }
        }
        MH9.A04(this, C318116oQ.A00(this), 5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r0.containsKey(r2) == true) goto L_0x001d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.content.Intent r5) {
        /*
            r4 = this;
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r4.A02
            X.4Cl r0 = X.DbS.A0h(r0, r1)
            java.lang.Integer r3 = r0.Afi()
            java.lang.String r2 = "private_story_audience_member_count"
            r1 = 1
            if (r5 == 0) goto L_0x0036
            android.os.Bundle r0 = r5.getExtras()
            if (r0 == 0) goto L_0x0036
            boolean r0 = r0.containsKey(r2)
            if (r0 != r1) goto L_0x0036
        L_0x001d:
            android.os.Bundle r0 = r5.getExtras()
            if (r0 == 0) goto L_0x002e
            java.lang.Integer r3 = X.DbV.A0o(r0, r2)
        L_0x0027:
            if (r3 == 0) goto L_0x002e
            X.05G r0 = r4.A0D
            r0.Epw(r3)
        L_0x002e:
            X.05G r1 = r4.A06
            X.KgY r0 = X.C62483KgY.AUDIENCE_CONTROL_SELECTOR_V1
            r1.Epw(r0)
            return
        L_0x0036:
            java.lang.String r2 = "close_friend_count"
            if (r5 == 0) goto L_0x0027
            android.os.Bundle r0 = r5.getExtras()
            if (r0 == 0) goto L_0x0027
            boolean r0 = r0.containsKey(r2)
            if (r0 != r1) goto L_0x0027
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60259JiG.A00(android.content.Intent):void");
    }
}
