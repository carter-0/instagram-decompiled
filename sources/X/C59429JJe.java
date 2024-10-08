package X;

import android.view.View;
import androidx.compose.ui.Modifier;
import java.util.List;
import java.util.Map;

/* renamed from: X.JJe  reason: case insensitive filesystem */
public final class C59429JJe extends 0Yg implements 0sJ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C304686Eu A02;
    public final /* synthetic */ Y43 A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59429JJe(View view, C304686Eu r3, Y43 y43, List list, long j, boolean z) {
        super(4);
        this.A04 = list;
        this.A02 = r3;
        this.A03 = y43;
        this.A01 = view;
        this.A05 = z;
        this.A00 = j;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        boolean z;
        int A0M = AnonymousClass7TE.A0M(obj2);
        C286575Wy r0 = (C286575Wy) obj3;
        int A0M2 = AnonymousClass7TE.A0M(obj4);
        if ((A0M2 & 6) == 0) {
            i = A0M2 | G9t.A0O(r0, obj);
        } else {
            i = A0M2;
        }
        if ((A0M2 & 48) == 0) {
            i |= G9t.A06(r0, A0M);
        }
        if ((i & 147) != 146 || !r0.Bwn()) {
            if (0fL.A02()) {
                C51965G9l.A17(-1749508201);
            }
            C49890FBq fBq = (C49890FBq) this.A04.get(A0M);
            r0.ExS(399973439);
            Object A0m = C51967G9n.A0m(r0, -956930799);
            Object obj5 = AnonymousClass5XT.A00;
            if (A0m == obj5) {
                A0m = G9t.A0o(r0, Integer.valueOf(fBq.A00));
            }
            C284945Oz r8 = (C284945Oz) A0m;
            C286565Wx A0G = C51965G9l.A0G(r0);
            Object A0m2 = C51967G9n.A0m(r0, -956928430);
            if (A0m2 == obj5) {
                A0m2 = G9t.A0o(r0, Integer.valueOf(fBq.A04));
            }
            C284945Oz r9 = (C284945Oz) A0m2;
            C286565Wx.A0I(A0G);
            boolean A08 = fBq.A08();
            if (A08) {
                i2 = C51971G9r.A0B(r8);
            } else {
                i2 = fBq.A00;
            }
            if (A08) {
                i3 = C51971G9r.A0B(r9);
            } else {
                i3 = fBq.A04;
            }
            C304686Eu r1 = this.A02;
            Y43 y43 = this.A03;
            Class<?> cls = fBq.getClass();
            Map map = 0Yh.A03;
            0qQ.A0B(cls, 1);
            Boolean bool = (Boolean) y43.get(0q1.A01(cls));
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = true;
            }
            C304686Eu r19 = r1;
            C286575Wy r20 = r0;
            C56663I6s.A05((C56151Htd) null, (C56152Hte) null, r19, r20, (Modifier) null, (String) null, AnonymousClass5PI.A01(r0, new JHP(this.A01, r8, r9, y43, fBq, i2, i3, this.A00, this.A05), 547019068), 1572864, 30, z);
            if (C51967G9n.A1a(A0G)) {
                0fL.A00(821704285);
            }
        } else {
            r0.Evl();
        }
        return C60340gF.A00;
    }
}
