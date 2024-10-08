package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.9MY  reason: invalid class name */
public final class AnonymousClass9MY extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9MY(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A05 = z;
        this.A02 = obj4;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Context context;
        UserSession userSession;
        AnonymousClass4DU r5;
        boolean z;
        C258373yu r4;
        Object Ac7;
        int i;
        switch (this.A00) {
            case 0:
                A8J a8j = C388939od.A00;
                AnonymousClass7P7 r0 = (AnonymousClass7P7) this.A04;
                UserSession userSession2 = r0.A07;
                C332807Wl r52 = r0.A08;
                AnonymousClass9HC r7 = r0.A09;
                AnonymousClass7BA r42 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r42, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.gif.GifContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.genericxma.GenericXmaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                boolean z2 = this.A05;
                return a8j.A00(r0.A06, userSession2, r42, r52, (AnonymousClass7ZX) this.A03, r7, (C331037Pg) this.A02, z2);
            case 1:
                context = (Context) this.A01;
                userSession = (UserSession) this.A03;
                r5 = ((AnonymousClass334) this.A04).A04;
                z = this.A05;
                C258353ys AZ8 = ((AnonymousClass311) this.A02).AZ8();
                0qQ.A0B(AZ8, 0);
                r4 = new AnonymousClass471(AZ8);
                break;
            case 2:
                context = (Context) this.A01;
                userSession = (UserSession) this.A03;
                r5 = ((AnonymousClass334) this.A04).A04;
                z = this.A05;
                Ac7 = ((C2359031q) this.A02).Ac7();
                i = 0;
                0qQ.A0B(Ac7, 0);
                break;
            case 3:
                context = (Context) this.A01;
                userSession = (UserSession) this.A03;
                r5 = ((AnonymousClass334) this.A04).A04;
                z = this.A05;
                Ac7 = ((C2359131r) this.A02).Ah2();
                0qQ.A0B(Ac7, 0);
                i = 1;
                break;
            case 4:
                return new AnonymousClass9PF((Context) this.A01, (UserSession) this.A03, ((AnonymousClass311) this.A02).Aol(), ((AnonymousClass334) this.A04).A04, (C63664L2a) null, this.A05);
            case 5:
                return new AnonymousClass33Q((Activity) this.A02, (Context) this.A01, ((AnonymousClass334) this.A04).A04, (UserSession) this.A03, this.A05);
            case 6:
                context = (Context) this.A01;
                userSession = (UserSession) this.A03;
                r5 = ((AnonymousClass334) this.A04).A04;
                z = this.A05;
                Ac7 = ((C2359231s) this.A02).B8X();
                0qQ.A0B(Ac7, 0);
                i = 3;
                break;
            case 7:
                context = (Context) this.A01;
                userSession = (UserSession) this.A03;
                r5 = ((AnonymousClass334) this.A04).A04;
                z = this.A05;
                Ac7 = ((C2359331t) this.A02).BET();
                0qQ.A0B(Ac7, 0);
                i = 5;
                break;
            case 8:
                context = (Context) this.A01;
                userSession = (UserSession) this.A03;
                r5 = ((AnonymousClass334) this.A04).A04;
                z = this.A05;
                Ac7 = ((AnonymousClass311) this.A02).BDt();
                0qQ.A0B(Ac7, 0);
                i = 4;
                break;
            case 9:
                return new AnonymousClass41P((Activity) this.A02, (Context) this.A01, (UserSession) this.A04, (0Pl) this.A03, this.A05);
            case 10:
                context = (Context) this.A01;
                userSession = (UserSession) this.A03;
                r5 = ((AnonymousClass334) this.A04).A04;
                z = this.A05;
                Ac7 = ((C2359431u) this.A02).BYG();
                0qQ.A0B(Ac7, 0);
                i = 6;
                break;
            case 11:
                context = (Context) this.A01;
                userSession = (UserSession) this.A03;
                r5 = ((AnonymousClass334) this.A04).A04;
                z = this.A05;
                B1W BYL = ((C2359531v) this.A02).BYL();
                0qQ.A0B(userSession, 0);
                0qQ.A0B(BYL, 1);
                r4 = new AnonymousClass9PG(userSession, BYL);
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                context = (Context) this.A01;
                userSession = (UserSession) this.A03;
                r5 = ((AnonymousClass334) this.A04).A04;
                z = this.A05;
                Ac7 = ((AnonymousClass311) this.A02).Bgd();
                0qQ.A0B(Ac7, 0);
                i = 7;
                break;
            case 13:
                context = (Context) this.A01;
                userSession = (UserSession) this.A03;
                r5 = ((AnonymousClass334) this.A04).A04;
                z = this.A05;
                Ac7 = ((C2359631w) this.A02).Btn();
                0qQ.A0B(Ac7, 0);
                i = 8;
                break;
            case 14:
                AnonymousClass334 r1 = (AnonymousClass334) this.A04;
                AnonymousClass4DU r8 = r1.A04;
                AnonymousClass07Z r3 = r1.A00;
                boolean z3 = this.A05;
                AnonymousClass311 r02 = (AnonymousClass311) this.A02;
                return new C54480HFi((Context) this.A01, r3, (UserSession) this.A03, r1.A02, r02.BRO(), r02.B58(), r8, z3);
            case 15:
                context = (Context) this.A01;
                userSession = (UserSession) this.A03;
                r5 = ((AnonymousClass334) this.A04).A04;
                z = this.A05;
                Ac7 = ((AnonymousClass31P) this.A02).CC3();
                0qQ.A0B(Ac7, 0);
                i = 9;
                break;
            default:
                context = (Context) this.A01;
                userSession = (UserSession) this.A03;
                r5 = ((AnonymousClass334) this.A04).A04;
                z = this.A05;
                Ac7 = ((AnonymousClass31G) this.A02).CC5();
                0qQ.A0B(Ac7, 0);
                i = 10;
                break;
        }
        r4 = new DHF(Ac7, i);
        return new C258383yv(context, userSession, r4, r5, z);
    }
}
