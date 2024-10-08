package X;

import android.graphics.ImageFormat;
import android.hardware.Camera;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.Tsd  reason: case insensitive filesystem */
public final class C14255Tsd {
    public int A00 = 0;
    public C343047pa A01 = new C343047pa(0, 0);
    public boolean A02;
    public final C3496981j A03 = new C3496981j();
    public final ArrayList A04 = new ArrayList();
    public final HashMap A05 = new HashMap();
    public final Camera.PreviewCallback A06 = new C14257Tsf(this);
    public final Camera.PreviewCallback A07 = new C14256Tse(this);

    public final synchronized void A00() {
        synchronized (this) {
            this.A03.A00();
            this.A05.clear();
            this.A04.clear();
        }
    }

    public final synchronized void A01(Camera camera) {
        if (!C342057ny.A02()) {
            camera.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
            camera.setPreviewCallback((Camera.PreviewCallback) null);
            this.A02 = false;
        } else {
            throw new RuntimeException("Cannot disable listeners on the UI thread");
        }
    }

    public final synchronized void A02(Camera camera, C343047pa r11, int i) {
        RuntimeException th;
        int i2;
        synchronized (this) {
            if (C342057ny.A02()) {
                th = new RuntimeException("Cannot enable listeners on the UI thread");
                throw th;
            } else if (!this.A02) {
                this.A00 = i;
                if (r11 == null) {
                    r11 = new C343047pa(0, 0);
                }
                this.A01 = r11;
                camera.getClass();
                HashMap hashMap = this.A05;
                if (!hashMap.isEmpty()) {
                    camera.setPreviewCallback((Camera.PreviewCallback) null);
                    C343047pa r7 = this.A01;
                    try {
                        Iterator A0t = AnonymousClass7TF.A0t(hashMap);
                        int i3 = 0;
                        int i4 = 0;
                        while (A0t.hasNext()) {
                            int intValue = ((Integer) A0t.next()).intValue();
                            if (intValue > i4) {
                                i4 = intValue;
                            }
                        }
                        if (i != 842094169) {
                            i2 = ImageFormat.getBitsPerPixel(i) * r7.A02 * r7.A01;
                            if (i2 % 8 != 0) {
                                throw new IllegalStateException("Total bits for Frame should be a multiple of 8");
                            }
                        } else {
                            int A012 = JTP.A01((double) r7.A02, 16.0d) * 16;
                            int A013 = JTP.A01((double) (A012 / 2), 16.0d) * 16;
                            int i5 = r7.A01;
                            i2 = (A012 * i5) + (((A013 * i5) / 2) * 2);
                        }
                        int i6 = i2 / 8;
                        ArrayList arrayList = this.A04;
                        if (!arrayList.isEmpty()) {
                            if (((byte[]) arrayList.get(0)).length != i6) {
                                arrayList.clear();
                            }
                            int size = arrayList.size();
                            if (i4 > size) {
                                int i7 = i4 - size;
                                while (i3 < i7) {
                                    arrayList.add(new byte[i6]);
                                    i3++;
                                }
                            } else if (i4 < size) {
                                ArrayList arrayList2 = new ArrayList(i4);
                                while (i3 < i4) {
                                    arrayList2.add((byte[]) arrayList.get(i3));
                                    i3++;
                                }
                                arrayList.clear();
                                arrayList.addAll(arrayList2);
                            }
                        } else {
                            while (i3 < i4) {
                                arrayList.add(new byte[i6]);
                                i3++;
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            camera.addCallbackBuffer((byte[]) it.next());
                        }
                        camera.setPreviewCallbackWithBuffer(this.A07);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    camera.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
                    camera.setPreviewCallback(this.A06);
                }
                this.A02 = true;
            }
        }
    }
}
