package X;

import com.instagram.compose.ui.gradientspinner.Segment;
import java.util.List;

/* renamed from: X.GRm  reason: case insensitive filesystem */
public final class C52410GRm extends 0Yg implements 0sK {
    public final /* synthetic */ float A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52410GRm(float f) {
        super(3);
        this.A00 = f;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        float FHc;
        AnonymousClass5Q3 r5 = (AnonymousClass5Q3) obj;
        C52412GRo gRo = (C52412GRo) obj2;
        C304786Ff r8 = (C304786Ff) obj3;
        AnonymousClass7TG.A1T(r5, gRo, r8);
        float F06 = r5.F06(this.A00);
        List<Segment> list = gRo.A0B;
        int size = list.size();
        for (Segment segment : list) {
            float f = gRo.A01 + 270.0f;
            JNL jnl = gRo.A08;
            0qQ.A0B(segment, 1);
            float f2 = segment.A00;
            int i = (f2 > 0.5f ? 1 : (f2 == 0.5f ? 0 : -1));
            float f3 = f2 * 2.0f;
            if (i < 0) {
                FHc = jnl.FHc(1.0f - f3);
            } else {
                FHc = 1.0f - jnl.FHc(1.0f - (f3 - 1.0f));
            }
            float f4 = 360.0f / ((float) size);
            float f5 = FHc * f4;
            float f6 = (f + ((((float) segment.A03) * f4) - (f4 / 2.0f))) - (f5 / 2.0f);
            long Bwg = r5.Bwg();
            AnonymousClass5Q3 r17 = r5;
            C304786Ff r18 = r8;
            r17.AQQ(r18, (C288195bW) null, new C298575tg((C13866Tin) null, Math.min(((float) (((double) (C288025bF.A02(Bwg) / 2.0f)) * 6.283185307179586d)) * (f5 / 360.0f), F06), 4.0f, 1, 1), f6, f5, 1.0f, 3, 0, C298565tf.A00(Bwg, 0), false);
        }
        return C60340gF.A00;
    }
}
