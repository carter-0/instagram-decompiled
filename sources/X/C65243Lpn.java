package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lpn  reason: case insensitive filesystem */
public final class C65243Lpn implements C363658k8 {
    public final /* synthetic */ AnonymousClass818 A00;
    public final /* synthetic */ C56911IHg A01;
    public final /* synthetic */ C61149Jy0 A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;

    public final /* synthetic */ void Dcq() {
    }

    public C65243Lpn(AnonymousClass818 r1, C56911IHg iHg, C61149Jy0 jy0, Integer num, String str) {
        this.A01 = iHg;
        this.A02 = jy0;
        this.A00 = r1;
        this.A03 = num;
        this.A04 = str;
    }

    public final void Dcr() {
        C56911IHg iHg = this.A01;
        C61149Jy0 jy0 = this.A02;
        AnonymousClass818 r1 = this.A00;
        C56911IHg.A01(r1, iHg, jy0, this.A03);
        if (r1 == AnonymousClass818.IG_FEED_OVERFLOW_MENU_POST_ACCOUNT_LINK) {
            AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
            UserSession userSession = iHg.A0A;
            if (AnonymousClass5w9.A01(userSession)) {
                AnonymousClass5w9.A00(userSession).A08((C3034168s) null);
            }
        }
    }
}
