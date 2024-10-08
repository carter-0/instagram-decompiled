package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.IyJ  reason: case insensitive filesystem */
public final class C58834IyJ extends 0Yg implements 0sP {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C59479JLd A01;
    public final /* synthetic */ C53309Glv A02;
    public final /* synthetic */ C62320sa A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ 0sP A05;
    public final /* synthetic */ 0sP A06;
    public final /* synthetic */ 0sP A07;
    public final /* synthetic */ 0sL A08;
    public final /* synthetic */ 0sL A09;
    public final /* synthetic */ 0sL A0A;
    public final /* synthetic */ AnonymousClass62P A0B;
    public final /* synthetic */ AnonymousClass62P A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58834IyJ(Drawable drawable, C59479JLd jLd, C53309Glv glv, C62320sa r5, C62320sa r6, 0sP r7, 0sP r8, 0sP r9, 0sL r10, 0sL r11, 0sL r12, AnonymousClass62P r13, AnonymousClass62P r14, boolean z, boolean z2) {
        super(1);
        this.A0D = z;
        this.A0C = r13;
        this.A01 = jLd;
        this.A0E = z2;
        this.A02 = glv;
        this.A09 = r10;
        this.A05 = r7;
        this.A03 = r5;
        this.A06 = r8;
        this.A04 = r6;
        this.A08 = r11;
        this.A0B = r14;
        this.A00 = drawable;
        this.A0A = r12;
        this.A07 = r9;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        JP8 jp8 = (JP8) obj;
        0qQ.A0B(jp8, 0);
        J0X j0x = J0X.A00;
        C59479JLd jLd = this.A01;
        boolean z = this.A0E;
        C53309Glv glv = this.A02;
        0sL r10 = this.A09;
        0sP r8 = this.A05;
        jp8.Cf5((Object) null, (Object) null, j0x, AnonymousClass5PI.A03(new JHT(jLd, glv, this.A03, this.A04, r8, this.A06, r10, this.A08, this.A0B, z), 1293020844));
        if (this.A0D) {
            jp8.Cf5((Object) null, (Object) null, J0Y.A00, C55408HhE.A00);
        } else {
            AnonymousClass62P r7 = this.A0C;
            if (AnonymousClass7TE.A1b(r7)) {
                jp8.Cf5((Object) null, (Object) null, J0Z.A00, C55408HhE.A01);
                Drawable drawable = this.A00;
                0sL r5 = this.A0A;
                0sP r6 = this.A07;
                int size = r7.size();
                jp8.CfC((0sP) null, new C59099J6h(r7, 5), (0sL) null, AnonymousClass5PI.A03(new C59427JJc(2, drawable, r5, r6, r7), 1229287273), size);
            } else if (!(jLd instanceof ILK)) {
                jp8.Cf5((Object) null, (Object) null, C58937J0a.A00, C55408HhE.A02);
            }
        }
        return C60340gF.A00;
    }
}
