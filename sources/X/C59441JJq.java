package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.JJq  reason: case insensitive filesystem */
public final class C59441JJq extends 0Yg implements 0sJ {
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
    public C59441JJq(C59479JLd jLd, C53309Glv glv, C62320sa r4, C62320sa r5, 0sP r6, 0sP r7, 0sL r8, 0sL r9, AnonymousClass62P r10, boolean z) {
        super(4);
        this.A01 = glv;
        this.A07 = r8;
        this.A04 = r6;
        this.A09 = z;
        this.A02 = r4;
        this.A05 = r7;
        this.A03 = r5;
        this.A06 = r9;
        this.A08 = r10;
        this.A00 = jLd;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean A1a = AnonymousClass7TE.A1a(obj2);
        C286575Wy r6 = (C286575Wy) obj3;
        boolean A1b = C51972G9s.A1b(obj4, obj);
        if (0fL.A02()) {
            0fL.A01(1888598224, "com.instagram.archive.updateshub.UpdatesHubHeader.<anonymous>.<anonymous> (UpdatesHubHeader.kt:54)");
        }
        if (A1a) {
            ImageUrl imageUrl = null;
            Modifier A0G = C51967G9n.A0G(C51965G9l.A0K(r6, -298483335), 32.0f);
            C53309Glv glv = this.A01;
            if (glv != null) {
                imageUrl = glv.A02;
            }
            r6.ExS(-286717679);
            0sL r3 = this.A07;
            boolean A1U = C51971G9r.A1U(r6, r3, glv);
            Object ECw = r6.ECw();
            if (A1U || ECw == AnonymousClass5XT.A00) {
                ECw = C59103J6l.A00(r6, r3, glv, 34);
            }
            C51965G9l.A1X(r6, A1b);
            HUL.A00(r6, A0G, imageUrl, (0sP) ECw, this.A04, 6, A1b ? 1 : 0);
        } else {
            r6.ExS(-298183379);
            boolean z = this.A09;
            C53309Glv glv2 = this.A01;
            C62320sa r10 = this.A02;
            0sP r12 = this.A05;
            C56221Huo.A01(r6, (Modifier) null, this.A00, glv2, r10, this.A03, r12, this.A06, this.A08, A1b ? 1 : 0, 1, z);
        }
        if (C51970G9q.A1a(r6, A1b)) {
            0fL.A00(1868888485);
        }
        return C60340gF.A00;
    }
}
