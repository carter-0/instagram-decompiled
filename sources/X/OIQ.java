package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.model.direct.DirectThreadKey;

public final class OIQ {
    public AnonymousClass7DW A00;
    public final Activity A01;
    public final C72519P9c A02;
    public final PA2 A03;
    public final UserSession A04;
    public final Capabilities A05;
    public final C68493NKm A06;
    public final C72496P8f A07;
    public final C72523P9g A08;
    public final AnonymousClass7DS A09 = new P88(this, 1);
    public final AnonymousClass7DU A0A = new P8Q(this);
    public final C332837Wo A0B;
    public final AnonymousClass7X4 A0C;
    public final AnonymousClass7XA A0D;
    public final AnonymousClass7ST A0E;
    public final PA3 A0F;
    public final AnonymousClass7SD A0G;
    public final DirectThreadKey A0H;
    public final AnonymousClass0eM A0I;
    public final C68493NKm A0J;

    public OIQ(Activity activity, UserSession userSession, Capabilities capabilities, C68493NKm nKm, C68493NKm nKm2, C332837Wo r15, AnonymousClass7X4 r16, AnonymousClass7XA r17, AnonymousClass7ST r18, PA3 pa3, AnonymousClass7SD r20, DirectThreadKey directThreadKey) {
        AnonymousClass7X4 r1 = r16;
        C51973G9u.A0s(3, userSession, r1, r15);
        this.A0J = nKm;
        this.A01 = activity;
        this.A04 = userSession;
        DirectThreadKey directThreadKey2 = directThreadKey;
        this.A0H = directThreadKey2;
        this.A0D = r17;
        AnonymousClass7ST r7 = r18;
        this.A0E = r7;
        this.A0C = r1;
        this.A0B = r15;
        this.A06 = nKm2;
        this.A0F = pa3;
        this.A0G = r20;
        this.A05 = capabilities;
        this.A00 = new P8V(activity, userSession, this, r7, directThreadKey2);
        this.A0I = AnonymousClass0eN.A01(new C67570Mq4(this, 41));
        this.A02 = new C72519P9c(1);
        this.A03 = new PA2(this, 1);
        this.A07 = new C72496P8f(this);
        this.A08 = new C72523P9g();
    }
}
