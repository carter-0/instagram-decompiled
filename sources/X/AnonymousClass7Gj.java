package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Gj  reason: invalid class name */
public final class AnonymousClass7Gj extends 0Yg implements C62320sa {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C332237Ue A01;
    public final /* synthetic */ AnonymousClass7SM A02;
    public final /* synthetic */ AnonymousClass9H6 A03;
    public final /* synthetic */ C332247Uf A04;
    public final /* synthetic */ AnonymousClass0eK A05;
    public final /* synthetic */ AnonymousClass0eK A06;
    public final /* synthetic */ AnonymousClass0eK A07;
    public final /* synthetic */ AnonymousClass0eM A08;
    public final /* synthetic */ AnonymousClass0eM A09;
    public final /* synthetic */ AnonymousClass0eM A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7Gj(C332237Ue r2, AnonymousClass7SM r3, AnonymousClass9H6 r4, C332247Uf r5, AnonymousClass0eK r6, AnonymousClass0eK r7, AnonymousClass0eK r8, AnonymousClass0eM r9, AnonymousClass0eM r10, AnonymousClass0eM r11, int i) {
        super(0);
        this.A03 = r4;
        this.A05 = r6;
        this.A06 = r7;
        this.A09 = r9;
        this.A02 = r3;
        this.A01 = r2;
        this.A08 = r10;
        this.A07 = r8;
        this.A00 = i;
        this.A0A = r11;
        this.A04 = r5;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass9H6 r0 = this.A03;
        UserSession userSession = r0.A01;
        FragmentActivity A002 = AnonymousClass9H6.A00(r0);
        AnonymousClass0eK r10 = this.A05;
        AnonymousClass0eK r11 = this.A06;
        AnonymousClass7SM r8 = this.A02;
        AnonymousClass0eK r12 = this.A07;
        int i = this.A00;
        AnonymousClass0eM r02 = this.A0A;
        return new C72535P9s(A002, userSession, (OT9) this.A09.getValue(), (AnonymousClass7X4) r02.getValue(), (AnonymousClass7VV) this.A01.A0q.getValue(), this.A04, (AnonymousClass7XL) this.A08.getValue(), r8, (AnonymousClass7XP) r02.getValue(), r10, r11, r12, i);
    }
}
