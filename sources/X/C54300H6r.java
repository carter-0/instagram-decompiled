package X;

import android.content.Context;
import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.common.session.UserSession;

/* renamed from: X.H6r  reason: case insensitive filesystem */
public final class C54300H6r extends C228042kh {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass07i A01;
    public final /* synthetic */ MusicPageTabType A02;
    public final /* synthetic */ C321676uZ A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public C54300H6r(Context context, AnonymousClass07i r2, MusicPageTabType musicPageTabType, C321676uZ r4, UserSession userSession, String str, String str2, String str3) {
        this.A06 = str;
        this.A02 = musicPageTabType;
        this.A00 = context;
        this.A04 = userSession;
        this.A05 = str2;
        this.A01 = r2;
        this.A03 = r4;
        this.A07 = str3;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        String str = this.A06;
        MusicPageTabType musicPageTabType = this.A02;
        Context context = this.A00;
        UserSession userSession = this.A04;
        C55878Hoz hoz = new C55878Hoz(context, musicPageTabType, userSession, str);
        return new C53044Ghc(this.A01, musicPageTabType, this.A03, userSession, C55122HcV.A00(userSession), hoz, this.A05, this.A07);
    }
}
