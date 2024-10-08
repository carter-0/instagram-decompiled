package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.H3v  reason: case insensitive filesystem */
public final class C54226H3v extends 2Ru implements C231292rN, AnonymousClass71P {
    public int A00 = 3;
    public Map A01;
    public final C22338Xzn A02;
    public final C15505Udu A03;
    public final C15507Udw A04;
    public final C55449Hht A05;
    public final List A06;
    public final List A07;
    public final AtomicBoolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final UserSession A0B;
    public final Map A0C;

    public C54226H3v(Context context, C55449Hht hht, AnonymousClass0iw r12, UserSession userSession, List list, boolean z, boolean z2) {
        0qQ.A0B(userSession, 1);
        this.A0B = userSession;
        this.A0A = z;
        this.A09 = z2;
        this.A06 = list;
        this.A05 = hht;
        this.A02 = C319596qs.A02(userSession);
        this.A07 = AnonymousClass7TE.A1C();
        this.A03 = new C15505Udu(context);
        this.A04 = new C15507Udw(context);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.A07.add(new C15560Ueo(r12, this.A0B, (C267644bx) this.A06.get(i), (AnonymousClass32J) this.A06.get(i)));
            ((C15560Ueo) this.A07.get(i)).A00 = 1.0f;
        }
        ArrayList A0v = DbS.A0v(3);
        0tw.A00(this.A07.toArray(new C15560Ueo[0]), A0v);
        A0v.add(this.A03);
        A0v.add(this.A04);
        init((C231642s0[]) A0v.toArray(new C231642s0[A0v.size()]));
        this.A0C = AnonymousClass7TE.A1E();
        this.A01 = AnonymousClass7TE.A1E();
        this.A08 = new AtomicBoolean();
    }

    public final AnonymousClass6u8 BQA(String str) {
        0qQ.A0B(str, 0);
        Map map = this.A0C;
        AnonymousClass6u8 r0 = (AnonymousClass6u8) map.get(str);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass6u8 r02 = new AnonymousClass6u8();
        map.put(str, r02);
        return r02;
    }

    public final AnonymousClass3W1 BQr(1Xj r3) {
        0qQ.A0B(r3, 0);
        Map map = this.A01;
        AnonymousClass3W1 r0 = (AnonymousClass3W1) map.get(r3);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3W1 A18 = G9t.A18(r3);
        map.put(r3, A18);
        return A18;
    }

    public final void Cs9(1Xj r1) {
    }
}
