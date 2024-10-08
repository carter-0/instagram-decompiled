package X;

import android.content.Context;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.camera.effect.mq.effectmetadata.EffectTrayService;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* renamed from: X.84v  reason: invalid class name and case insensitive filesystem */
public final class C3504884v extends 2YL {
    public AnonymousClass84D A00;
    public List A01;
    public final 2Fk A02;
    public final C3500082u A03;
    public final AnonymousClass85E A04;
    public final AnonymousClass848 A05;
    public final AnonymousClass85J A06;
    public final AnonymousClass85H A07 = new AnonymousClass85H();
    public final C3497681r A08;
    public final C311756dC A09;
    public final AvatarStore A0A;
    public final EffectTrayService A0B;
    public final C3504584s A0C;
    public final 02m A0D;
    public final AnonymousClass12V A0E;
    public final UserSession A0F;
    public final C357638Yz A0G;
    public final AnonymousClass856 A0H;
    public final AnonymousClass85K A0I;
    public final AnonymousClass85G A0J = new AnonymousClass85G();
    public final AnonymousClass85G A0K = new AnonymousClass85G();
    public final AnonymousClass85G A0L = new AnonymousClass85G();
    public final AnonymousClass85G A0M = new AnonymousClass85G();
    public final AnonymousClass85G A0N = new AnonymousClass85G();
    public final AnonymousClass80U A0O;
    public final C3495780x A0P;
    public final C3504784u A0Q;
    public final String A0R;
    public final String A0S;
    public final List A0T;
    public final C262204Co A0U;
    public final C249513ju A0V;
    public final 05G A0W;
    public final 05G A0X;
    public final 05G A0Y;
    public final 05G A0Z;
    public final 05G A0a;
    public final 05G A0b;
    public final 05G A0c;
    public final 05G A0d;
    public final 05G A0e = new 02z(false);
    public final boolean A0f;
    public final boolean A0g;

    private final void A00(C279284yO r6) {
        if (this.A0f) {
            C357638Yz r3 = this.A0G;
            if (!((Set) r3.A07.A00).contains(r6)) {
                return;
            }
            if ((r6 instanceof AnonymousClass80O) || r6.equals(AnonymousClass80M.A00) || r6.equals(AnonymousClass9QA.A00)) {
                AnonymousClass11O.A03(19E.A02(this.A0E.AOJ(102516301, 3).plus(this.A0U)), 10q.A02(new AnonymousClass9KD((Object) this, (AnonymousClass4D7) null, 3), AnonymousClass11E.A01(new AnonymousClass85F(r6, AnonymousClass0Zq.A00(new C66188MGz((Object) r3, (AnonymousClass4D7) null, 44, 42))))));
            }
        }
    }

    public final AnonymousClass2gB A01() {
        return AnonymousClass72Y.A00(C226292g8.A00(19B.A00, AnonymousClass10H.A02(new C376869Jq(1, (AnonymousClass4D7) null), this.A0d, this.A0b, this.A0c, this.A0a, this.A0Y)));
    }

    public final void A02() {
        this.A0e.Epw(false);
        this.A07.A00();
        this.A06.D0P("on_camera_fully_hidden");
        this.A08.FMl("camera_fully_hidden");
    }

    public final void A03() {
        05G r3 = this.A0Y;
        if (((Boolean) r3.getValue()).booleanValue()) {
            r3.Epw(false);
        }
        this.A0Z.Epw(false);
    }

    public final void onCleared() {
        this.A0U.AG7((CancellationException) null);
    }

    public /* synthetic */ C3504884v(Context context, C3500082u r16, AnonymousClass848 r17, C3497681r r18, C311756dC r19, EffectTrayService effectTrayService, C3504584s r21, UserSession userSession, C357638Yz r23, AnonymousClass856 r24, AnonymousClass80U r25, C3495780x r26, C3504784u r27, String str, String str2, List list, boolean z, boolean z2) {
        AnonymousClass12T r10 = AnonymousClass12T.A00;
        UserSession userSession2 = userSession;
        AnonymousClass85E r9 = new AnonymousClass85E(userSession2, context);
        AnonymousClass19G r8 = new AnonymousClass19G((C262204Co) null);
        AnonymousClass19S A022 = 19E.A02(r10.AOJ(1911564059, 3).plus(r8));
        AvatarStore A002 = 25x.A00(userSession2);
        02m r1 = 02m.A0p;
        C3504584s r3 = r21;
        0qQ.A0B(r3, 6);
        C311756dC r13 = r19;
        0qQ.A0B(r13, 7);
        AnonymousClass848 r12 = r17;
        0qQ.A0B(r12, 10);
        C3497681r r5 = r18;
        0qQ.A0B(r5, 11);
        C3495780x r11 = r26;
        0qQ.A0B(r11, 15);
        0qQ.A0B(A022, 20);
        0qQ.A0B(A002, 24);
        0qQ.A0B(r1, 25);
        this.A0g = z;
        this.A0F = userSession2;
        this.A0O = r25;
        this.A0B = effectTrayService;
        this.A0C = r3;
        this.A09 = r13;
        this.A0G = r23;
        C3504784u r32 = r27;
        this.A0Q = r32;
        this.A05 = r12;
        this.A08 = r5;
        this.A0R = str;
        AnonymousClass856 r52 = r24;
        this.A0H = r52;
        this.A0P = r11;
        this.A0f = z2;
        this.A0E = r10;
        this.A04 = r9;
        this.A0U = r8;
        this.A0T = list;
        this.A0S = str2;
        this.A03 = r16;
        this.A0A = A002;
        this.A0D = r1;
        AnonymousClass11O.A03(A022, new C61860pz(new C376889Js(this, (AnonymousClass4D7) null, 22), AnonymousClass0Zq.A00(new AnonymousClass9K3((Object) userSession2, (AnonymousClass4D7) null, 19, 42))));
        A00(AnonymousClass9QA.A00);
        A00(AnonymousClass80N.A00);
        A00(AnonymousClass80M.A00);
        this.A06 = new AnonymousClass85I(userSession2);
        this.A0I = new AnonymousClass85K(userSession2, r52, r32);
        this.A0V = new 1HR(0);
        this.A0d = new 02z(true);
        this.A0a = new 02z(true);
        this.A0b = new 02z(false);
        this.A0c = new 02z(false);
        this.A0Y = new 02z(false);
        this.A0X = new 02z(false);
        02z r14 = new 02z(false);
        this.A0W = r14;
        this.A02 = C226292g8.A00(19B.A00, r14);
        this.A0Z = new 02z(false);
        this.A01 = 0sn.A00;
        this.A00 = new AnonymousClass84D(AnonymousClass84B.DEFAULT);
    }
}
