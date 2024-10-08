package X;

import android.content.Context;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.camera.effect.mq.effectmetadata.EffectTrayService;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.84t  reason: invalid class name and case insensitive filesystem */
public final class C3504684t extends C228042kh {
    public final Context A00;
    public final C3500082u A01;
    public final C3502984c A02;
    public final AnonymousClass848 A03;
    public final C3497681r A04;
    public final C3504584s A05;
    public final AnonymousClass82X A06;
    public final UserSession A07;
    public final C357638Yz A08;
    public final AnonymousClass80U A09;
    public final C3495780x A0A;
    public final C3504784u A0B;
    public final C3504784u A0C;
    public final String A0D;
    public final String A0E;
    public final List A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public C3504684t(Context context, C3500082u r3, C3502984c r4, AnonymousClass848 r5, C3497681r r6, C3504584s r7, AnonymousClass82X r8, UserSession userSession, C357638Yz r10, AnonymousClass80U r11, C3495780x r12, C3504784u r13, C3504784u r14, String str, String str2, List list, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r10, 4);
        0qQ.A0B(r5, 6);
        0qQ.A0B(r8, 9);
        0qQ.A0B(r12, 11);
        0qQ.A0B(context, 13);
        this.A0I = z;
        this.A07 = userSession;
        this.A05 = r7;
        this.A08 = r10;
        this.A0B = r13;
        this.A03 = r5;
        this.A04 = r6;
        this.A0D = str;
        this.A06 = r8;
        this.A0C = r14;
        this.A0A = r12;
        this.A0G = z2;
        this.A00 = context;
        this.A09 = r11;
        this.A02 = r4;
        this.A0F = list;
        this.A0E = str2;
        this.A01 = r3;
        this.A0H = z3;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        AnonymousClass856 r3;
        boolean z = this.A0I;
        UserSession userSession = this.A07;
        Context context = this.A00;
        Context applicationContext = context.getApplicationContext();
        0qQ.A07(applicationContext);
        AnonymousClass80U r18 = this.A09;
        AnonymousClass82X r2 = this.A06;
        EffectCollectionService A002 = C311766dD.A00(context, userSession);
        C3504784u r1 = this.A0C;
        EffectTrayService effectTrayService = new EffectTrayService(this.A02, A002, r2, AnonymousClass12T.A00, userSession, C61410nE.A00, r1);
        C3504584s r23 = this.A05;
        C311756dC A003 = C311746dB.A00(context, userSession);
        C357638Yz r11 = this.A08;
        C3504784u r15 = this.A0B;
        AnonymousClass848 r14 = this.A03;
        C3497681r r13 = this.A04;
        String str = this.A0D;
        boolean z2 = this.A0H;
        0qQ.A0B(str, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r11, 3);
        AnonymousClass850 r12 = new AnonymousClass850(userSession, r11);
        AnonymousClass852 r32 = new AnonymousClass852(userSession, r11);
        AnonymousClass853 r22 = new AnonymousClass853(userSession, r11);
        if (z) {
            r3 = new C40325AaK(userSession);
        } else if (str.equals("live_broadcast")) {
            r3 = new C40324AaJ(userSession, new AnonymousClass854(userSession));
        } else {
            r3 = new AnonymousClass855(userSession, r11, 0Yt.A06(new 0eP[]{new 0eP(AnonymousClass9QA.A00, r32), new 0eP(AnonymousClass80M.A00, r22), new 0eP(AnonymousClass80N.A00, r12), new 0eP(C3493880e.A00, r12), new 0eP(AnonymousClass80L.A00, new AnonymousClass854(userSession))}), z2);
        }
        C3495780x r4 = this.A0A;
        boolean z3 = this.A0G;
        List list = this.A0F;
        String str2 = this.A0E;
        return new C3504884v(applicationContext, this.A01, r14, r13, A003, effectTrayService, r23, userSession, r11, r3, r18, r4, r15, str, str2, list, z, z3);
    }
}
