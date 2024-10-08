package X;

import android.content.Context;
import com.instagram.camera.effect.mq.effectmetadata.EffectTrayService;
import com.instagram.common.session.UserSession;

/* renamed from: X.8o5  reason: invalid class name and case insensitive filesystem */
public final class C366038o5 extends C228042kh {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 28D A01;
    public final /* synthetic */ C3497681r A02;
    public final /* synthetic */ C353778Ja A03;
    public final /* synthetic */ AnonymousClass82W A04;
    public final /* synthetic */ C3503284f A05;
    public final /* synthetic */ UserSession A06;
    public final /* synthetic */ C279284yO A07;
    public final /* synthetic */ C365988o0 A08;
    public final /* synthetic */ AnonymousClass8JZ A09;

    public C366038o5(Context context, 28D r2, C3497681r r3, C353778Ja r4, AnonymousClass82W r5, C3503284f r6, UserSession userSession, C279284yO r8, C365988o0 r9, AnonymousClass8JZ r10) {
        this.A06 = userSession;
        this.A07 = r8;
        this.A08 = r9;
        this.A09 = r10;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = context;
        this.A05 = r6;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A06;
        C279284yO r8 = this.A07;
        C365988o0 r10 = this.A08;
        AnonymousClass8JZ r12 = this.A09;
        C353778Ja r5 = this.A03;
        AnonymousClass82X A002 = this.A04.A00();
        Context context = this.A00;
        EffectTrayService effectTrayService = new EffectTrayService((C3502984c) null, C311766dD.A00(context, userSession), A002, AnonymousClass12T.A00, userSession, C61410nE.A00, (C3504784u) null);
        C311756dC A003 = C311746dB.A00(context, userSession);
        AnonymousClass85K r9 = new AnonymousClass85K(userSession, r10, (C3504784u) null);
        C3503284f r6 = this.A05;
        C366098oB r11 = new C366098oB(userSession, r8);
        return new C366068o8(this.A01, this.A02, A003, effectTrayService, r5, r6, userSession, r8, r9, r10, r11, r12);
    }
}
