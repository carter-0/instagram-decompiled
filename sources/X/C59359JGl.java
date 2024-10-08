package X;

import androidx.compose.ui.Modifier;
import com.instagram.creator.achievements.modules.models.Badge;

/* renamed from: X.JGl  reason: case insensitive filesystem */
public final class C59359JGl extends 0Yg implements 0sK {
    public final float A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59359JGl(Object obj, Object obj2, float f, int i) {
        super(3);
        this.A01 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A00 = f;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean A012;
        float A002;
        if (this.A01 != 0) {
            C286575Wy r13 = (C286575Wy) obj2;
            if (C51968G9o.A0E(obj3) != 16 || !r13.Bwn()) {
                if (0fL.A02()) {
                    0fL.A01(68747574, "com.instagram.creator.achievements.modules.views.ChallengeCardHScrollRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChallengeCardHScrollRow.kt:49)");
                }
                C56283Hvr.A01(r13, C287205Zk.A0D(Modifier.A00, this.A00), (Badge.ChallengeBadge) this.A02, (0sP) this.A03, 8);
                if (0fL.A02()) {
                    0fL.A00(867234196);
                }
            } else {
                r13.Evl();
            }
            return C60340gF.A00;
        }
        float A04 = AnonymousClass7TE.A04(obj);
        float A042 = AnonymousClass7TE.A04(obj2);
        float A043 = AnonymousClass7TE.A04(obj3);
        GZF gzf = (GZF) this.A03;
        Object obj4 = this.A02;
        float f = this.A00;
        C284945Oz r2 = gzf.A0C;
        if (C51970G9q.A0Q(r2).A09 == AnonymousClass6Gj.Vertical || obj4 == AnonymousClass5Q8.Ltr) {
            A012 = C56163Htr.A01(gzf);
        } else {
            A012 = AnonymousClass7TF.A1Q(C56163Htr.A01(gzf) ? 1 : 0);
        }
        int i = C51970G9q.A0Q(r2).A05;
        if (i == 0) {
            A002 = 0.0f;
        } else {
            A002 = C56163Htr.A00(gzf) / ((float) i);
        }
        float f2 = A002 - ((float) ((int) A002));
        if (Math.abs(A04) >= gzf.A0D.F06(400.0f) ? A04 > 0.0f : !(Math.abs(f2) <= f ? !(Math.abs(A002) < Math.abs(gzf.A02()) ? Math.abs(A042) >= Math.abs(A043) : !A012) : !A012)) {
            A042 = A043;
        }
        return Float.valueOf(A042);
    }
}
