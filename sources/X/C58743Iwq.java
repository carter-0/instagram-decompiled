package X;

import android.view.MotionEvent;

/* renamed from: X.Iwq  reason: case insensitive filesystem */
public final class C58743Iwq extends 0Yg implements 0sP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ MotionEvent A02;
    public final /* synthetic */ MotionEvent A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58743Iwq(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        super(1);
        this.A03 = motionEvent;
        this.A02 = motionEvent2;
        this.A00 = f;
        this.A01 = f2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C317156mo r5 = (C317156mo) obj;
        0qQ.A0B(r5, 0);
        return Boolean.valueOf(r5.Dq1(this.A03, this.A02, this.A00, this.A01));
    }
}
