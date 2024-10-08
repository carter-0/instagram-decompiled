package X;

import android.content.Context;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;

/* renamed from: X.Pf9  reason: case insensitive filesystem */
public final class C73557Pf9 extends AnonymousClass1Ek implements 0sL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73557Pf9(Object obj, Object obj2, Object obj3, String str, String str2, AnonymousClass4D7 r7, int i) {
        super(2, r7);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A05 = str;
        this.A04 = str2;
        this.A01 = obj3;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Pf9, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        Object obj2;
        String str;
        String str2;
        Object obj3;
        Object obj4;
        int i;
        AnonymousClass4D7 r6 = r10;
        switch (this.A00) {
            case 0:
                obj4 = this.A02;
                obj2 = this.A03;
                str2 = this.A05;
                str = this.A04;
                obj3 = this.A01;
                i = 0;
                break;
            case 1:
                obj4 = this.A02;
                obj2 = this.A03;
                str2 = this.A05;
                str = this.A04;
                obj3 = this.A01;
                i = 1;
                break;
            case 2:
                obj2 = this.A03;
                str2 = this.A05;
                obj3 = this.A01;
                str = this.A04;
                obj4 = this.A02;
                i = 2;
                break;
            case 3:
                obj2 = this.A03;
                str = this.A04;
                str2 = this.A05;
                obj3 = this.A01;
                obj4 = this.A02;
                i = 3;
                break;
            default:
                obj2 = this.A03;
                str2 = this.A05;
                obj4 = this.A02;
                obj3 = this.A01;
                str = this.A04;
                i = 4;
                break;
        }
        return new C73557Pf9(obj4, obj2, obj3, str2, str, r6, i);
    }

    public final Object invokeSuspend(Object obj) {
        C276544tV r6;
        C277014uI r5;
        C308276Tl r4;
        int i;
        Object obj2;
        switch (this.A00) {
            case 0:
                0eS.A00(obj);
                r6 = (C276544tV) this.A02;
                r5 = (C277014uI) this.A03;
                r4 = new C308276Tl();
                r4.A01(this.A05);
                i = 1;
                obj2 = AnonymousClass7TF.A0w(AnonymousClass000.A00(1311), this.A04);
                break;
            case 1:
                0eS.A00(obj);
                r6 = (C276544tV) this.A02;
                r5 = (C277014uI) this.A03;
                r4 = new C308276Tl();
                r4.A01(this.A05);
                i = 1;
                obj2 = this.A04;
                break;
            case 2:
                0eS.A00(obj);
                1a8 A0P = C66581MXm.A0P();
                C304566Ea r52 = AnonymousClass6EY.A00((UserSession) this.A03, "XmaShareSenderHelper").A00;
                String str = this.A05;
                N2L n2l = (N2L) this.A01;
                String str2 = n2l.A03;
                String str3 = n2l.A07;
                String str4 = n2l.A06;
                byte[] bArr = n2l.A09;
                String str5 = n2l.A04;
                int i2 = n2l.A00;
                int i3 = n2l.A01;
                String str6 = n2l.A05;
                String str7 = n2l.A02;
                A0P.A02(C66582MXn.A0N(C304566Ea.A01(r52, AnonymousClass6W3.A03((C254783t2) this.A02)).A0M(new C72056OvV(n2l.A08, bArr, r52, str5, str6, str3, str4, str2, str, this.A04, str7, i2, i3, 0)), "instagram_xma_external_link_client_send"), C73034PTr.A00);
                break;
            case 3:
                0eS.A00(obj);
                C46754Dkh dkh = (C46754Dkh) this.A03;
                String str8 = this.A04;
                String str9 = this.A05;
                AnonymousClass7TG.A1N(str8, str9);
                1NY A0b = AnonymousClass7TG.A0b(((C49380Eui) dkh.A02.getValue()).A00);
                A0b.A0A("discover/recommended_accounts_for_category/");
                A0b.A0G("category_id", str8);
                A0b.A0G("target_id", str9);
                1OC A0S = DbU.A0S(A0b, CE0.class, C45613CzP.class);
                A0S.A00 = new C47696EDf(dkh, 3);
                1ES.A00((Context) this.A01, (AnonymousClass07i) this.A02, A0S);
                break;
            default:
                0eS.A00(obj);
                C55672HlV hlV = ((C54430HDc) this.A03).A00;
                String str10 = this.A05;
                User user = (User) this.A02;
                1Xj r53 = (1Xj) this.A01;
                String str11 = this.A04;
                C51974G9v.A1O(str10, user, r53, str11);
                1pG A002 = AnonymousClass1pH.A00();
                UserSession userSession = hlV.A00;
                C66912Mew E52 = A002.E52(userSession);
                DirectShareTarget directShareTarget = new DirectShareTarget(user);
                E52.A00(directShareTarget).ELV((SocialContextType) null, (C317966o8) null, r53, directShareTarget, str10, "spins_reply", "share_sheet", str11, OZA.A00.A01(userSession, directShareTarget));
                break;
        }
        r4.A03(obj2, i);
        C307886Rw.A03((C307786Rm) this.A01, r6, r4.A00(), r5);
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C73557Pf9) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
