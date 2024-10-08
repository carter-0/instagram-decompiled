package X;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.ui.Modifier;

public final class JHT extends 0Yg implements 0sK {
    public final /* synthetic */ C59479JLd A00;
    public final /* synthetic */ C53309Glv A01;
    public final /* synthetic */ C62320sa A02;
    public final /* synthetic */ C62320sa A03;
    public final /* synthetic */ 0sP A04;
    public final /* synthetic */ 0sP A05;
    public final /* synthetic */ 0sL A06;
    public final /* synthetic */ 0sL A07;
    public final /* synthetic */ AnonymousClass62P A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JHT(C59479JLd jLd, C53309Glv glv, C62320sa r4, C62320sa r5, 0sP r6, 0sP r7, 0sL r8, 0sL r9, AnonymousClass62P r10, boolean z) {
        super(3);
        this.A00 = jLd;
        this.A09 = z;
        this.A01 = glv;
        this.A07 = r8;
        this.A04 = r6;
        this.A02 = r4;
        this.A05 = r7;
        this.A03 = r5;
        this.A06 = r9;
        this.A08 = r10;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C286575Wy r3 = (C286575Wy) obj2;
        int A0M = AnonymousClass7TE.A0M(obj3);
        Object obj4 = obj;
        0qQ.A0B(obj4, 0);
        if ((A0M & 6) == 0) {
            A0M |= G9t.A0O(r3, obj4);
        }
        if ((A0M & 19) != 18 || !r3.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1960716536, "com.instagram.archive.updateshub.UpdatesGrid.<anonymous>.<anonymous>.<anonymous> (UpdatesHub.kt:186)");
            }
            Modifier Ezh = HRW.A00(C51969G9p.A0U(), JI5.A00).Ezh(new LazyLayoutAnimateItemElement(C51976G9y.A0A()));
            C59479JLd jLd = this.A00;
            boolean z = this.A09;
            C53309Glv glv = this.A01;
            0sL r11 = this.A07;
            0sP r9 = this.A04;
            C56221Huo.A00(r3, Ezh, jLd, glv, this.A02, this.A03, r9, this.A05, r11, this.A06, this.A08, 0, 0, z);
            if (0fL.A02()) {
                0fL.A00(1572352995);
            }
        } else {
            r3.Evl();
        }
        return C60340gF.A00;
    }
}
