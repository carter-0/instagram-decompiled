package X;

import com.instagram.common.session.UserSession;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

@Deprecated(message = "This class doesn't separate ViewModel and View layer concerns. It also has unclear scoping/time of initialization which could lead to bugs.", replaceWith = @ReplaceWith(expression = "MainFeedViewLayerDependencyProvider", imports = {}))
/* renamed from: X.3GG  reason: invalid class name */
public final class AnonymousClass3GG {
    public AnonymousClass3GH A00;
    public HnZ A01;
    public final C249883kW A02;
    public final AnonymousClass2k6 A03;
    public final C227762js A04;
    public final UserSession A05;
    public final AnonymousClass3GD A06;
    public final AnonymousClass35N A07;
    public final 1FI A08;
    public final C2365134a A09;
    public final C228322lL A0A;
    public final AnonymousClass2l3 A0B;
    public final AnonymousClass3G8 A0C;
    public final AnonymousClass2lI A0D;
    public final C238213Az A0E;
    public final C228182kv A0F;
    public final AnonymousClass3GA A0G;
    public final C228472lj A0H;
    public final C227872kC A0I;
    public final C227802jw A0J;
    public final AnonymousClass35W A0K;
    public final C2357130x A0L;
    public final C228462li A0M;

    public AnonymousClass3GG(C249883kW r7, AnonymousClass2k6 r8, C227762js r9, UserSession userSession, AnonymousClass3GD r11, AnonymousClass35N r12, 1FI r13, C2365134a r14, C228322lL r15, AnonymousClass2l3 r16, AnonymousClass3G8 r17, AnonymousClass2lI r18, C238213Az r19, C228182kv r20, AnonymousClass3GA r21, C228472lj r22, C227872kC r23, C227802jw r24, AnonymousClass35W r25, C2357130x r26, C228462li r27) {
        C227872kC r1 = r23;
        0qQ.A0B(r1, 1);
        C228182kv r3 = r20;
        0qQ.A0B(r3, 2);
        0qQ.A0B(userSession, 3);
        AnonymousClass3G8 r4 = r17;
        0qQ.A0B(r4, 4);
        C228472lj r2 = r22;
        0qQ.A0B(r2, 11);
        0qQ.A0B(r8, 13);
        0qQ.A0B(r13, 17);
        AnonymousClass2lI r5 = r18;
        0qQ.A0B(r5, 19);
        this.A0I = r1;
        this.A0F = r3;
        this.A05 = userSession;
        this.A0C = r4;
        this.A07 = r12;
        this.A04 = r9;
        this.A09 = r14;
        this.A0J = r24;
        this.A0E = r19;
        this.A0L = r26;
        this.A0H = r2;
        this.A0B = r16;
        this.A03 = r8;
        this.A0G = r21;
        this.A06 = r11;
        this.A02 = r7;
        this.A08 = r13;
        this.A0K = r25;
        this.A0D = r5;
        this.A0A = r15;
        this.A0M = r27;
    }

    public final AnonymousClass3GH A00() {
        AnonymousClass3GH r15 = this.A00;
        if (r15 != null) {
            return r15;
        }
        UserSession userSession = this.A05;
        C227872kC r20 = this.A0I;
        AnonymousClass3G8 r19 = this.A0C;
        C238213Az r18 = this.A0E;
        C228182kv r17 = this.A0F;
        C2365134a r16 = this.A09;
        C227802jw r14 = this.A0J;
        C228472lj r13 = this.A0H;
        AnonymousClass2l3 r12 = this.A0B;
        AnonymousClass2k6 r11 = this.A03;
        AnonymousClass3GA r10 = this.A0G;
        AnonymousClass3GD r8 = this.A06;
        AnonymousClass35N r7 = this.A07;
        C249883kW r6 = this.A02;
        1FI r5 = this.A08;
        AnonymousClass35W r4 = this.A0K;
        AnonymousClass2lI r3 = this.A0D;
        C227762js r2 = this.A04;
        UserSession userSession2 = userSession;
        AnonymousClass3GD r202 = r8;
        AnonymousClass35N r21 = r7;
        1FI r22 = r5;
        C2365134a r23 = r16;
        C228322lL r24 = this.A0A;
        C249883kW r162 = r6;
        AnonymousClass2k6 r172 = r11;
        C227762js r182 = r2;
        AnonymousClass3GH r152 = new AnonymousClass3GH(r162, r172, r182, userSession2, r202, r21, r22, r23, r24, r12, r19, r3, r18, r17, r10, r13, r20, r14, r4, this.A0M);
        this.A00 = r152;
        return r152;
    }

    public final HnZ A01() {
        HnZ hnZ = this.A01;
        if (hnZ != null) {
            return hnZ;
        }
        HnZ hnZ2 = new HnZ(this.A05, this.A0F, this.A0J, this.A0L);
        this.A01 = hnZ2;
        return hnZ2;
    }
}
