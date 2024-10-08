package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PQq  reason: case insensitive filesystem */
public final class C72958PQq implements C273414mX {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass7SM A02;
    public final /* synthetic */ C69332NjX A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public final void Cyf() {
    }

    public C72958PQq(AnonymousClass0iw r1, UserSession userSession, AnonymousClass7SM r3, C69332NjX njX, String str, String str2, boolean z) {
        this.A01 = userSession;
        this.A00 = r1;
        this.A03 = njX;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = z;
        this.A02 = r3;
    }

    public final void Cyc() {
        String str;
        boolean z = OYR.A00;
        UserSession userSession = this.A01;
        AnonymousClass0iw r2 = this.A00;
        if (z) {
            Integer num = AnonymousClass05K.A0Y;
            Integer num2 = AnonymousClass05K.A0C;
            C69332NjX njX = this.A03;
            String str2 = this.A05;
            if (str2 == null) {
                str2 = "INVALID_STICKER_ID";
            }
            C71048OaQ.A00((C69447Nlr) null, r2, userSession, njX, Boolean.valueOf(this.A06), num, num2, (Integer) null, str2, this.A04);
            AnonymousClass7SM r22 = this.A02;
            int A022 = DbU.A02(njX, 0);
            if (A022 == 0) {
                str = "ai_sticker_nux";
            } else if (A022 != 1) {
                str = "null";
            } else {
                str = "ai_sticker_preview";
            }
            C329067Hl A062 = AnonymousClass9H7.A06(r22.A00);
            if (AnonymousClass7TF.A1Z(A062.A0Z.A0G)) {
                UserSession userSession2 = A062.A1Z;
                0qQ.A0B(userSession2, 0);
                ((C71867Os9) userSession2.A01(C71867Os9.class, new C73661Pha(userSession2, 27))).A00(str);
                A062.A1L(C69319NjK.AI_STICKER_NUX, "stickers", "");
                return;
            }
            return;
        }
        Integer num3 = AnonymousClass05K.A0N;
        Integer num4 = AnonymousClass05K.A0C;
        C69332NjX njX2 = this.A03;
        String str3 = this.A05;
        if (str3 == null) {
            str3 = "INVALID_STICKER_ID";
        }
        C71048OaQ.A00((C69447Nlr) null, r2, userSession, njX2, Boolean.valueOf(this.A06), num3, num4, (Integer) null, str3, this.A04);
    }
}
