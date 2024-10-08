package X;

import android.graphics.PointF;
import android.view.MotionEvent;

/* renamed from: X.VzF  reason: case insensitive filesystem */
public final class C18735VzF {
    public float A00;
    public float A01;
    public int A02;
    public long A03;
    public PointF A04;

    public C18735VzF(C18735VzF vzF) {
        this.A04 = new PointF(0.0f, 0.0f);
        this.A02 = -1;
        PointF pointF = vzF.A04;
        this.A04 = new PointF(pointF.x, pointF.y);
        this.A03 = vzF.A03;
        this.A00 = vzF.A00;
        this.A01 = vzF.A01;
        this.A02 = vzF.A02;
    }

    public C18735VzF(MotionEvent motionEvent) {
        PointF pointF = new PointF(0.0f, 0.0f);
        this.A04 = pointF;
        this.A02 = -1;
        pointF.set(motionEvent.getX(), motionEvent.getY());
        this.A03 = motionEvent.getEventTime();
        this.A00 = motionEvent.getPressure();
        this.A01 = motionEvent.getSize();
    }

    public C18735VzF() {
        this.A04 = new PointF(0.0f, 0.0f);
        this.A02 = -1;
    }
}
