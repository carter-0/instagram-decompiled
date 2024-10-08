package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;

/* renamed from: X.JHd  reason: case insensitive filesystem */
public final class C59377JHd extends 0Yg implements 0sK {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C284945Oz A02;
    public final /* synthetic */ C270284gU A03;
    public final /* synthetic */ HM0 A04;
    public final /* synthetic */ C299585vR A05;
    public final /* synthetic */ C304186Cm A06;
    public final /* synthetic */ C62320sa A07;
    public final /* synthetic */ C62320sa A08;
    public final /* synthetic */ 0sP A09;
    public final /* synthetic */ 0sP A0A;
    public final /* synthetic */ 0sL A0B;
    public final /* synthetic */ AnonymousClass62P A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59377JHd(C284945Oz r2, C270284gU r3, HM0 hm0, C299585vR r5, C304186Cm r6, C62320sa r7, C62320sa r8, 0sP r9, 0sP r10, 0sL r11, AnonymousClass62P r12, int i, int i2, boolean z) {
        super(3);
        this.A06 = r6;
        this.A0C = r12;
        this.A02 = r2;
        this.A04 = hm0;
        this.A0D = z;
        this.A0A = r9;
        this.A0B = r11;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = r5;
        this.A09 = r10;
        this.A08 = r7;
        this.A07 = r8;
        this.A03 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C286575Wy r14 = (C286575Wy) obj2;
        int A0M = AnonymousClass7TE.A0M(obj3);
        Object obj4 = obj;
        0qQ.A0B(obj4, 0);
        if ((A0M & 6) == 0) {
            A0M |= C41848B3p.A01(r14, obj4);
        }
        if ((A0M & 19) != 18 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-950924542, "com.instagram.barcelona.feed.post.ui.PostKaraokeCaptions.<anonymous> (PostKaraokeCaptions.kt:55)");
            }
            String str = (String) this.A03.getValue();
            C304186Cm r20 = C304186Cm.A01;
            LineType lineType = LineType.NONE;
            Modifier A002 = C287195Zj.A00(this.A06.A00, Modifier.A00);
            Object obj5 = this.A0C;
            if (obj5 == null) {
                obj5 = AnonymousClass62M.A01;
            }
            C284945Oz r7 = this.A02;
            Object value = r7.getValue();
            HM0 hm0 = this.A04;
            C58944J0h j0h = C58944J0h.A00;
            0qQ.A0B(A002, 0);
            C51973G9u.A0r(1, obj5, j0h, hm0);
            Modifier A022 = C287435a8.A02(A002, C287655aY.A00, new JHI(hm0, obj5, value, obj4, j0h, " ", 0));
            boolean z = this.A0D;
            JID jid = JID.A00;
            0sP r12 = this.A0A;
            0sL r11 = this.A0B;
            int i = this.A00;
            int i2 = this.A01;
            C299585vR r6 = this.A05;
            0sP r5 = this.A09;
            C62320sa r2 = this.A08;
            C62320sa r1 = this.A07;
            Object A0m = C51967G9n.A0m(r14, -484828133);
            if (A0m == AnonymousClass5XT.A00) {
                A0m = new C58728Iwb(r7, 4);
                r14.FLL(A0m);
            }
            C51965G9l.A1X(r14, false);
            C299585vR r19 = r6;
            C304196Cn.A00(r14, A022, (AnonymousClass5Z4) null, lineType, (C274454oN) null, r19, r20, (C303846Ba) null, (C299725vk) null, str, r2, r1, r12, r5, (0sP) A0m, (0sP) null, r11, jid, i, i2, 115019184, 100663296, 0, 33030144, false, z, false, false, false, false);
            if (0fL.A02()) {
                0fL.A00(-1107219571);
            }
        } else {
            r14.Evl();
        }
        return C60340gF.A00;
    }
}
