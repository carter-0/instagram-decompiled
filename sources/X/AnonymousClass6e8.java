package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6e8  reason: invalid class name */
public final class AnonymousClass6e8 implements AnonymousClass6e9 {
    public float A00 = 1.0f;
    public int A01;
    public Integer A02 = AnonymousClass05K.A00;
    public final ArrayList A03 = new ArrayList();

    public AnonymousClass6e8(int i) {
        this.A01 = i;
        this.A00 = 1.0f;
    }

    public final void A8v(B32 b32) {
        this.A03.add(b32);
    }

    public final int Bp1() {
        return this.A01;
    }

    public final int Bp2() {
        return 0;
    }

    public final int Bp3() {
        return 0;
    }

    public final int Bp4() {
        return 0;
    }

    public final float CHe() {
        return this.A00;
    }

    public final void EQP(Integer num) {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            B32 b32 = (B32) it.next();
            int i = 2;
            if (num == AnonymousClass05K.A00) {
                i = 1;
            }
            b32.setCaptureDevicePosition(i);
        }
    }

    public final void ER8(Integer num) {
        if (this.A02 != num) {
            int intValue = num.intValue();
            int i = 2;
            if (intValue == 1) {
                i = 1;
            } else if (intValue != 2) {
                if (intValue == 0) {
                    i = -1;
                } else {
                    throw new IllegalArgumentException("Incomplete setCaptureContext handling");
                }
            }
            this.A02 = num;
            Iterator it = this.A03.iterator();
            while (it.hasNext()) {
                ((B32) it.next()).setCaptureContext(i);
            }
        }
    }

    public final void capturePhoto() {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((B32) it.next()).capturePhoto();
        }
    }

    public final void finishCapturePhoto() {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((B32) it.next()).finishCapturePhoto();
        }
    }

    public final void setCaptureDeviceSize(int i, int i2) {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((B32) it.next()).setCaptureDeviceSize(i, i2);
        }
    }

    public final void setPreviewViewInfo(int i, int i2, float f) {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((B32) it.next()).setPreviewViewInfo(i, i2, f);
        }
    }

    public final void setRotation(int i) {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((B32) it.next()).setRotation(i);
        }
    }

    public final void setZoomFactor(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            Iterator it = this.A03.iterator();
            while (it.hasNext()) {
                ((B32) it.next()).setZoomFactor(this.A00);
            }
        }
    }

    public final void startRecording() {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((B32) it.next()).startRecording();
        }
    }

    public final void stop() {
        this.A03.clear();
    }

    public final void stopRecording() {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((B32) it.next()).stopRecording();
        }
    }
}
