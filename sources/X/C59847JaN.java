package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.JaN  reason: case insensitive filesystem */
public final class C59847JaN {
    public long A00 = 288430453;
    public long A01 = 288435480;
    public long A02 = 288425357;
    public long A03 = 288439403;
    public long A04 = 288429634;
    public long A05 = 288435925;
    public long A06 = 288436299;
    public long A07;
    public long A08 = 288428278;
    public long A09 = 288429169;
    public final 1QP A0A;
    public final 29E A0B;
    public final AnonymousClass0iw A0C;
    public final 0wc A0D;
    public final UserSession A0E;
    public final AnonymousClass8ZP A0F;

    public C59847JaN(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A0E = userSession;
        0xG A0O = DbS.A0O("feed_creation");
        this.A0C = A0O;
        this.A0D = AnonymousClass0kN.A01(A0O, userSession);
        this.A0B = new 29E(userSession);
        this.A0A = AnonymousClass1QO.A00(userSession);
        this.A0F = AnonymousClass8ZO.A00(userSession);
    }

    public final void A01() {
        this.A09 = this.A0B.A02(288429169, this.A09);
    }

    public final void A02(28D r6) {
        29E r4 = this.A0B;
        long A032 = r4.A03(288435480, this.A01);
        this.A01 = A032;
        r4.A0A(A032, "camera_destination", "feed");
        if (r6 != null) {
            JTQ.A1E(r4, r6, this.A01);
        }
    }

    public final void A03(28D r6) {
        29E r4 = this.A0B;
        long A032 = r4.A03(288430453, this.A00);
        this.A00 = A032;
        r4.A0A(A032, "camera_destination", "feed");
        if (r6 != null) {
            JTQ.A1E(r4, r6, this.A00);
        }
    }

    public final void A04(28D r6) {
        29E r4 = this.A0B;
        long A032 = r4.A03(288425357, 15000);
        this.A02 = A032;
        r4.A0A(A032, "camera_destination", "feed");
        if (r6 != null) {
            JTQ.A1E(r4, r6, this.A02);
        }
    }

    public final void A05(28D r6) {
        29E r4 = this.A0B;
        long A032 = r4.A03(288429169, 15000);
        this.A09 = A032;
        r4.A0A(A032, "camera_destination", "feed");
        if (r6 != null) {
            JTQ.A1E(r4, r6, this.A09);
        }
    }

    public final void A06(28D r6, int i, boolean z) {
        29E r4 = this.A0B;
        long A032 = r4.A03(288436299, 10000);
        this.A06 = A032;
        r4.A0A(A032, "camera_destination", "feed");
        if (r6 != null) {
            JTQ.A1E(r4, r6, this.A06);
        }
        r4.A0A(this.A06, "from_draft", String.valueOf(z));
        r4.A0A(this.A06, "number_of_media", String.valueOf(i));
    }

    public final void A07(String str) {
        this.A02 = this.A0B.A07(String.valueOf(str), "", 288425357, this.A02);
    }

    public final void A08(String str) {
        this.A09 = this.A0B.A07(String.valueOf(str), "", 288429169, this.A09);
    }

    public final void A09(String str) {
        this.A04 = this.A0B.A07(String.valueOf(str), "", 288429634, this.A04);
    }

    public final void A0A(boolean z, String str) {
        long A072;
        UserSession userSession = this.A0E;
        if (z) {
            AnonymousClass9PJ.A00(userSession).A02();
            A072 = this.A0B.A02(288439403, this.A03);
        } else {
            C59728JVm A002 = AnonymousClass9PJ.A00(userSession);
            String str2 = str;
            0JA.A01();
            29E r3 = A002.A04;
            long j = A002.A00;
            if (str == null) {
                str2 = "gallery_items_load_failed";
            }
            A002.A00 = r3.A07(str2, "", 585177486, j);
            A072 = this.A0B.A07(String.valueOf(str), "", 288439403, this.A03);
        }
        this.A03 = A072;
    }

    public final void A0B(boolean z, String str) {
        long j = this.A06;
        if (j != 288436299) {
            29E r0 = this.A0B;
            if (z) {
                this.A06 = r0.A02(288436299, j);
                AnonymousClass8ZP r1 = this.A0F;
                long j2 = r1.A00;
                if (j2 != 0) {
                    r1.A02.flowMarkPoint(j2, "FEED_POST_CAPTURE_ENTERED");
                    return;
                }
                return;
            }
            this.A06 = r0.A07(String.valueOf(str), "", 288436299, j);
            this.A0F.A01(String.valueOf(str));
        }
    }

    public final void A0C(boolean z, String str) {
        long A072;
        if (z) {
            A072 = this.A0B.A02(288428278, this.A08);
        } else {
            A072 = this.A0B.A07(String.valueOf(str), "", 288428278, this.A08);
        }
        this.A08 = A072;
    }

    public static AE4 A00(UserSession userSession) {
        C59847JaN A002 = JW1.A00(userSession);
        1QP r3 = A002.A0A;
        long j = A002.A07;
        AE4 ae4 = new AE4(r3);
        ae4.A01 = j;
        return ae4;
    }
}
