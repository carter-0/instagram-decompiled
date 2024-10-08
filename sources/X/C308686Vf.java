package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.6Vf  reason: invalid class name and case insensitive filesystem */
public final class C308686Vf implements C233012uo {
    public C233042ur A00 = new C233032uq();
    public C233072uu A01;
    public List A02;
    public C308696Vg A03;
    public final UserSession A04;
    public final AnonymousClass6VU A05;
    public final C270424gi A06;
    public final C249863kU A07;

    public final boolean A7L(C233632w4 r5, C233042ur r6, C233072uu r7) {
        0qQ.A0B(r7, 0);
        0qQ.A0B(r6, 1);
        0qQ.A0B(r5, 2);
        this.A01 = r7;
        this.A00 = r6;
        this.A02 = r5.A03;
        AnonymousClass6VU r2 = this.A05;
        int i = r5.A01;
        int i2 = r2.A00;
        if (i < i2) {
            i = i2;
        }
        r2.A00 = i;
        return false;
    }

    public final int BWK() {
        return 0;
    }

    public final int BfG() {
        return 0;
    }

    public final /* synthetic */ void CJE(C376459Ib r1, List list) {
    }

    public final boolean CTb() {
        return false;
    }

    public final void Cmr() {
    }

    public final void Cn7(C233632w4 r1, C238523Ce r2, boolean z) {
    }

    public final /* synthetic */ void Cn8(AnonymousClass9J0 r2, C233632w4 r3, C238523Ce r4, String str, String str2, double d, boolean z) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(r4, 3);
    }

    public final void Cn9(int i) {
    }

    public final void DsJ(int i) {
    }

    public final /* synthetic */ boolean AFi() {
        return false;
    }

    public final /* synthetic */ AnonymousClass4lJ AN3() {
        return new C57364IYv();
    }

    public final /* synthetic */ String B4s() {
        return "";
    }

    public final /* synthetic */ Set Bsw() {
        return new HashSet();
    }

    public final boolean D69(int i, int i2) {
        AnonymousClass6VU r1 = this.A05;
        int i3 = r1.A00;
        if (i < i3) {
            i = i3;
        }
        r1.A00 = i;
        return false;
    }

    public final void deactivate() {
        AnonymousClass3DV.A00(this.A04).A01(this.A03);
    }

    public C308686Vf(UserSession userSession, AnonymousClass6VU r4, C270424gi r5, C249863kU r6) {
        this.A04 = userSession;
        this.A05 = r4;
        this.A07 = r6;
        this.A06 = r5;
        this.A03 = new C308696Vg(userSession, this);
        AnonymousClass3DV.A00(userSession).A00(this.A03);
    }

    public final /* synthetic */ void Cmj(boolean z) {
    }
}
