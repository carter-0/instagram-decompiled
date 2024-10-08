package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.TqF  reason: case insensitive filesystem */
public final class C14120TqF {
    public int A00 = 16;
    public Rect A01;
    public final Bitmap A02;
    public final List A03;
    public final List A04;

    public final void A01(int i, int i2, int i3) {
        Bitmap bitmap = this.A02;
        if (bitmap != null) {
            Rect rect = this.A01;
            if (rect == null) {
                rect = new Rect();
                this.A01 = rect;
            }
            rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
            if (!this.A01.intersect(0, i, i2, i3)) {
                throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
            }
        }
    }

    public final C14123TqI A00() {
        X04[] x04Arr;
        int i;
        float f;
        float f2;
        Bitmap bitmap = this.A02;
        if (bitmap != null) {
            Bitmap bitmap2 = bitmap;
            int width = bitmap.getWidth() * bitmap.getHeight();
            if (width > 12544) {
                double sqrt = Math.sqrt(12544.0d / ((double) width));
                if (sqrt > 0.0d) {
                    bitmap2 = 0fO.A00(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * sqrt), (int) Math.ceil(((double) bitmap.getHeight()) * sqrt), false);
                }
            }
            Rect rect = this.A01;
            if (!(bitmap2 == bitmap || rect == null)) {
                double width2 = ((double) bitmap2.getWidth()) / ((double) bitmap.getWidth());
                rect.left = (int) Math.floor(((double) rect.left) * width2);
                rect.top = (int) Math.floor(((double) rect.top) * width2);
                rect.right = Math.min((int) Math.ceil(((double) rect.right) * width2), bitmap2.getWidth());
                rect.bottom = Math.min((int) Math.ceil(((double) rect.bottom) * width2), bitmap2.getHeight());
            }
            int width3 = bitmap2.getWidth();
            int height = bitmap2.getHeight();
            int[] iArr = new int[(width3 * height)];
            bitmap2.getPixels(iArr, 0, width3, 0, 0, width3, height);
            Rect rect2 = this.A01;
            if (rect2 != null) {
                int width4 = rect2.width();
                int height2 = this.A01.height();
                int[] iArr2 = new int[(width4 * height2)];
                for (int i2 = 0; i2 < height2; i2++) {
                    Rect rect3 = this.A01;
                    System.arraycopy(iArr, ((rect3.top + i2) * width3) + rect3.left, iArr2, i2 * width4, width4);
                }
                iArr = iArr2;
            }
            int i3 = this.A00;
            List list = this.A03;
            if (list.isEmpty()) {
                x04Arr = null;
            } else {
                x04Arr = (X04[]) list.toArray(new X04[list.size()]);
            }
            C14121TqG tqG = new C14121TqG(iArr, x04Arr, i3);
            if (bitmap2 != bitmap) {
                bitmap2.recycle();
            }
            C14123TqI tqI = new C14123TqI(tqG.A00, this.A04);
            List list2 = tqI.A03;
            int size = list2.size();
            for (int i4 = 0; i4 < size; i4++) {
                C18469VsL vsL = (C18469VsL) list2.get(i4);
                float[] fArr = vsL.A02;
                int i5 = 0;
                int i6 = 0;
                float f3 = 0.0f;
                do {
                    float f4 = fArr[i6];
                    if (f4 > 0.0f) {
                        f3 += f4;
                    }
                    i6++;
                } while (i6 < 3);
                if (f3 != 0.0f) {
                    do {
                        float f5 = fArr[i5];
                        if (f5 > 0.0f) {
                            fArr[i5] = f5 / f3;
                        }
                        i5++;
                    } while (i5 < 3);
                }
                Map map = tqI.A04;
                List list3 = tqI.A02;
                int size2 = list3.size();
                float f6 = 0.0f;
                C14122TqH tqH = null;
                for (int i7 = 0; i7 < size2; i7++) {
                    C14122TqH tqH2 = (C14122TqH) list3.get(i7);
                    float[] A012 = tqH2.A01();
                    float f7 = A012[1];
                    float[] fArr2 = vsL.A01;
                    if (f7 >= fArr2[0] && f7 <= fArr2[2]) {
                        float f8 = A012[2];
                        float[] fArr3 = vsL.A00;
                        if (f8 >= fArr3[0] && f8 <= fArr3[2] && !tqI.A00.get(tqH2.A05)) {
                            float[] A013 = tqH2.A01();
                            C14122TqH tqH3 = tqI.A01;
                            if (tqH3 != null) {
                                i = tqH3.A04;
                            } else {
                                i = 1;
                            }
                            float[] fArr4 = vsL.A02;
                            float f9 = fArr4[0];
                            float f10 = 0.0f;
                            if (f9 > 0.0f) {
                                f = f9 * (1.0f - Math.abs(A013[1] - fArr2[1]));
                            } else {
                                f = 0.0f;
                            }
                            float f11 = fArr4[1];
                            if (f11 > 0.0f) {
                                f2 = f11 * (1.0f - Math.abs(A013[2] - fArr3[1]));
                            } else {
                                f2 = 0.0f;
                            }
                            float f12 = fArr4[2];
                            if (f12 > 0.0f) {
                                f10 = f12 * (((float) tqH2.A04) / ((float) i));
                            }
                            float f13 = f + f2 + f10;
                            if (tqH == null || f13 > f6) {
                                tqH = tqH2;
                                f6 = f13;
                            }
                        }
                    }
                }
                if (tqH != null) {
                    tqI.A00.append(tqH.A05, true);
                }
                map.put(vsL, tqH);
            }
            tqI.A00.clear();
            return tqI;
        }
        throw new AssertionError();
    }

    public C14120TqF(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.A04 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.A03 = arrayList2;
        if (bitmap == null || bitmap.isRecycled()) {
            throw new IllegalArgumentException("Bitmap is not valid");
        }
        arrayList2.add(C14123TqI.A05);
        this.A02 = bitmap;
        arrayList.add(C18469VsL.A06);
        arrayList.add(C18469VsL.A08);
        arrayList.add(C18469VsL.A04);
        arrayList.add(C18469VsL.A05);
        arrayList.add(C18469VsL.A07);
        arrayList.add(C18469VsL.A03);
    }
}
