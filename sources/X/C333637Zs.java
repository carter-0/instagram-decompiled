package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Zs  reason: invalid class name and case insensitive filesystem */
public final class C333637Zs extends C331667Rw {
    public final AnonymousClass7QK A00;
    public final C333617Zq A01;
    public final AnonymousClass7I3 A02;
    public final AnonymousClass7QQ A03;
    public final C62320sa A04;
    public final 05G A05;
    public final AnonymousClass0Ud A06;
    public final 1wn A07 = new AnonymousClass7QT(this);
    public final 1wn A08 = new AnonymousClass7QU(this);
    public final UserSession A09;
    public final AnonymousClass7QV A0A = new AnonymousClass7QV(this);
    public final AnonymousClass0eM A0B = AnonymousClass0eN.A01(AnonymousClass7QS.A00);

    public C333637Zs(Context context, UserSession userSession, C333617Zq r7, C62320sa r8) {
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r7, 3);
        0qQ.A0B(r8, 4);
        this.A09 = userSession;
        this.A01 = r7;
        this.A04 = r8;
        02z r0 = new 02z(new AnonymousClass9IP(AnonymousClass05K.A00, 1, false));
        this.A05 = r0;
        this.A06 = r0;
        this.A00 = new AnonymousClass7QK(new AnonymousClass7QH(context, userSession, 182.A01(0Tu.A05, userSession, 36600873779400719L)));
        this.A03 = new AnonymousClass7QQ(userSession, r7);
        this.A02 = new AnonymousClass7I3(userSession);
    }

    public final String A00() {
        Object value = this.A0B.getValue();
        0qQ.A07(value);
        return (String) value;
    }

    public final void onCleared() {
        AnonymousClass7QK r2 = this.A00;
        ViewGroup viewGroup = r2.A00;
        if (viewGroup != null) {
            r2.A00(viewGroup);
        }
        if (r2.A04) {
            r2.A06.A01();
        }
        AnonymousClass7QL r0 = r2.A05;
        r0.A01 = null;
        r0.A00 = new C376539Ij((Integer) null, (Integer) null, (Integer) null, (Integer) null, 63);
        r2.A04 = false;
        r2.A00 = null;
        r2.A03 = false;
        05G r4 = this.A05;
        Integer num = AnonymousClass05K.A00;
        boolean z = ((AnonymousClass9IP) r4.getValue()).A02;
        0qQ.A0B(num, 0);
        r4.Epw(new AnonymousClass9IP(num, 1, z));
    }

    public final void onPause(AnonymousClass07Z r6) {
        AnonymousClass7QK r2 = this.A00;
        if (r2.A04) {
            r2.A06.A00();
        }
        AnonymousClass7QV r1 = this.A0A;
        0qQ.A0B(r1, 0);
        r2.A05.A06.remove(r1);
        05G r3 = this.A05;
        Integer num = (Integer) ((AnonymousClass9IP) r3.getValue()).A01;
        0qQ.A0B(num, 0);
        r3.Epw(new AnonymousClass9IP(num, 1, true));
        1Ng A002 = AnonymousClass1Nd.A00(this.A09);
        A002.A02(this.A07, AnonymousClass7QW.class);
        A002.A02(this.A08, 2Kb.class);
    }

    public final void onResume(AnonymousClass07Z r6) {
        W1V w1v;
        AnonymousClass7QK r2 = this.A00;
        AnonymousClass7QV r1 = this.A0A;
        0qQ.A0B(r1, 0);
        r2.A05.A06.add(r1);
        if (r2.A04 && (w1v = r2.A06.A01) != null) {
            w1v.A0D[w1v.A00 % 2].A00();
        }
        05G r3 = this.A05;
        Integer num = (Integer) ((AnonymousClass9IP) r3.getValue()).A01;
        0qQ.A0B(num, 0);
        r3.Epw(new AnonymousClass9IP(num, 1, false));
        1Ng A002 = AnonymousClass1Nd.A00(this.A09);
        A002.A01(this.A07, AnonymousClass7QW.class);
        A002.A01(this.A08, 2Kb.class);
    }
}
