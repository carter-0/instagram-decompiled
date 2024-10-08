package X;

import com.meta.compose.component.swipeable.SwipeableState;

/* renamed from: X.Inn  reason: case insensitive filesystem */
public final class C58183Inn extends 0Yg implements C62320sa {
    public final float A00;
    public final int A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58183Inn(Object obj, float f, int i) {
        super(0);
        this.A01 = i;
        this.A00 = f;
        this.A02 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A01) {
            case 0:
                AnonymousClass5b4 r2 = (AnonymousClass5b4) this.A02;
                r2.A07(Float.valueOf(this.A00), r2.A00);
                break;
            case 1:
                return Float.valueOf(C51971G9r.A02(((SwipeableState) this.A02).A09) / this.A00);
            default:
                float f = this.A00;
                C71012OYk oYk = (C71012OYk) this.A02;
                Long l = oYk.A00;
                if (l == null) {
                    0f9 AEf = 0wj.A01.AEf(C66579MXk.A00(353), 817899801);
                    AEf.ABQ(C66579MXk.A00(349), "navigate_to_media_edit_single");
                    AEf.report();
                    break;
                } else {
                    oYk.A03.markPointWithEditor(l.longValue(), "navigate_to_media_edit_single").addPointData(C273654mx.A00(46), f).markerEditingCompleted();
                    break;
                }
        }
        return C60340gF.A00;
    }
}
