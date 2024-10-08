package X;

import com.instagram.avatars.store.AvatarStore;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.camera.effect.mq.effectmetadata.EffectTrayService;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.8o8  reason: invalid class name and case insensitive filesystem */
public final class C366068o8 extends 2YL implements AnonymousClass89Y {
    public int A00 = -1;
    public 28D A01;
    public AnonymousClass8KC A02;
    public C314446iH A03;
    public AnonymousClass0Ud A04;
    public final C3497681r A05;
    public final C311756dC A06;
    public final AvatarStore A07;
    public final EffectTrayService A08;
    public final C353778Ja A09;
    public final C3503284f A0A;
    public final UserSession A0B;
    public final C279284yO A0C;
    public final AnonymousClass85K A0D;
    public final C365988o0 A0E;
    public final C366098oB A0F;
    public final AnonymousClass8JZ A0G;
    public final C249513ju A0H = new 1HR(0);
    public final 05G A0I = 106.A01((Object) null);

    public final boolean onBackPressed() {
        return false;
    }

    public static final C366248oY A00(C366068o8 r10) {
        boolean z;
        C359248cL AND = r10.A0E.AND(new AnonymousClass9J8(C359198cG.A01(r10.A0C), "FOR_YOU"), (AnonymousClass84D) r10.A0G.A00.getValue());
        C314446iH r0 = r10.A03;
        if (r0 != null) {
            z = r0.COT();
        } else {
            z = false;
        }
        return new C366248oY(r10.A08.A04(AND, (String) null, (String) null, (String) null, (List) null, z));
    }

    public static final void A01(AnonymousClass84B r5, C366068o8 r6) {
        r6.A0I.Epw((Object) null);
        ((C3503584i) r6.A09.A00.A00.A00()).EUm((CameraAREffect) null);
        C318136oS A002 = C318116oQ.A00(r6);
        C376889Js r2 = new C376889Js(r6, (AnonymousClass4D7) null, 23);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A002);
        r6.A0G.A00.Epw(new AnonymousClass84D(r5));
        AnonymousClass8KC r0 = r6.A02;
        if (r0 != null) {
            r0.DYN((CameraAREffect) null);
        }
    }

    public final void A02() {
        AnonymousClass8KC r0 = this.A02;
        if (r0 != null) {
            r0.Dqt();
        }
        this.A02 = null;
        this.A00 = -1;
        A01(AnonymousClass84B.DEFAULT, this);
    }

    public /* synthetic */ C366068o8(28D r4, C3497681r r5, C311756dC r6, EffectTrayService effectTrayService, C353778Ja r8, C3503284f r9, UserSession userSession, C279284yO r11, AnonymousClass85K r12, C365988o0 r13, C366098oB r14, AnonymousClass8JZ r15) {
        AvatarStore A002 = 25x.A00(userSession);
        0qQ.A0B(r8, 5);
        0qQ.A0B(r6, 7);
        0qQ.A0B(r9, 9);
        0qQ.A0B(r5, 11);
        0qQ.A0B(A002, 13);
        this.A0B = userSession;
        this.A0C = r11;
        this.A0E = r13;
        this.A0G = r15;
        this.A09 = r8;
        this.A08 = effectTrayService;
        this.A06 = r6;
        this.A0D = r12;
        this.A0A = r9;
        this.A0F = r14;
        this.A05 = r5;
        this.A01 = r4;
        this.A07 = A002;
    }
}
