package X;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.tagging.model.Tag;
import java.util.ArrayList;

/* renamed from: X.9MV  reason: invalid class name */
public final class AnonymousClass9MV extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9MV(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A05 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3 = obj2;
        Object obj4 = obj;
        if (this.A00 != 0) {
            AnonymousClass3Y5 r5 = (AnonymousClass3Y5) obj4;
            long j = ((C245073cH) obj3).A00;
            0qQ.A0B(r5, 0);
            int i = this.A01;
            2V5 r10 = (2V5) this.A03;
            2V5 r9 = (2V5) this.A04;
            2V5 r8 = (2V5) this.A02;
            2Wb r13 = new 2Wb(r5.A05, new ArrayList());
            for (Tag tag : ((C271624jK) this.A05).A01.A02) {
                PointF pointF = tag.A00;
                if (pointF != null) {
                    AnonymousClass3XV r0 = 2WX.A02;
                    2WX r1 = new 2WX(new 2WX(new 2WX(new 2WX(new 2WX((2WX) null, new AnonymousClass9JS(AnonymousClass05K.A0Y, C244413b9.ABSOLUTE, 3)), new AnonymousClass9JR(AnonymousClass05K.A0C, 1, ((long) (((int) (((float) C245073cH.A01(j)) * pointF.x)) - i)) | 9221401712017801216L)), new AnonymousClass9JR(AnonymousClass05K.A0N, 1, ((long) (((int) (((float) C245073cH.A00(j)) * pointF.y)) - i)) | 9221401712017801216L)), new AnonymousClass9JS(r10, AnonymousClass05K.A1F)), new AnonymousClass9JS(r9, AnonymousClass05K.A1I));
                    Integer num = AnonymousClass05K.A00;
                    2WX r6 = new 2WX(r1, new AnonymousClass9JS(r8, num));
                    long j2 = A2Y.A00;
                    2WX r2 = new 2WX(new 2WX(r6, new AnonymousClass9JR(AnonymousClass05K.A01, 0, j2)), new AnonymousClass9JR(num, 0, j2));
                    Drawable A0D = C244013aV.A0D(r13, R.drawable.tag_hint_with_shadow);
                    C247393gG A002 = C247373gE.A00(r13.A00);
                    A002.A0D(A0D);
                    A002.A0B();
                    A002.A0C();
                    C244123ag.A00(A002, r2);
                    r13.A00(A002.A0A());
                }
            }
            return new 2Tp((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, (C244343b2) null, r13.A01, false);
        }
        ((Number) obj3).intValue();
        ((AnonymousClass5PJ) this.A05).A03((C286575Wy) obj4, this.A02, this.A03, this.A04, C301445zH.A00(this.A01) | 1);
        return C60340gF.A00;
    }
}
