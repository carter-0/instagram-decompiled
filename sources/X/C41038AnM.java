package X;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.ArrayMap;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import org.pytorch.IValue;
import org.pytorch.Tensor;

/* renamed from: X.AnM  reason: case insensitive filesystem */
public final class C41038AnM implements Runnable {
    public final /* synthetic */ C354168Kx A00;
    public final /* synthetic */ C352218Cl A01;

    public C41038AnM(C354168Kx r1, C352218Cl r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [X.XUJ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v73, types: [X.XUJ, java.lang.Object] */
    public final void run() {
        Object obj;
        double d;
        C354168Kx r2 = this.A00;
        AnonymousClass9YA r9 = r2.A00;
        if (r9 != null) {
            C352218Cl r11 = this.A01;
            0sP r1 = r2.A07;
            C66312MMv mMv = new C66312MMv(30, r11, r2);
            int i = 0;
            0qQ.A0B(r1, 1);
            Bitmap bitmap = (Bitmap) r1.invoke(r11);
            if (bitmap != null) {
                try {
                    C39701A5r a5r = r9.A01;
                    List A1I = AnonymousClass7TE.A1I(new XH4(bitmap));
                    0qQ.A0B(0sn.A00, 1);
                    String str = a5r.A00;
                    if (str != null) {
                        C348037xm r6 = a5r.A01;
                        if (r6 == null) {
                            try {
                                r6 = C347997xi.A00(str);
                                a5r.A01 = r6;
                            } catch (Exception e) {
                                StringBuilder A1A = AnonymousClass7TE.A1A();
                                A1A.append(AnonymousClass000.A00(455));
                                A1A.append(e);
                                A1A.toString();
                                obj = new XHE(new Object());
                            }
                        }
                        Object obj2 = A1I.get(0);
                        0qQ.A0C(obj2, AnonymousClass000.A00(330));
                        Bitmap bitmap2 = ((XH4) obj2).A00;
                        Integer valueOf = Integer.valueOf(bitmap2.getWidth());
                        Integer valueOf2 = Integer.valueOf(bitmap2.getHeight());
                        int height = bitmap2.getHeight();
                        int width = bitmap2.getWidth();
                        double d2 = 360.0d;
                        double min = (360.0d * 1.0d) / ((double) Math.min(height, width));
                        if (height < width) {
                            d = min * ((double) width);
                        } else {
                            d2 = min * ((double) height);
                            d = 360.0d;
                        }
                        double max = Math.max(d2, d);
                        if (max > 540.0d) {
                            double d3 = (540.0d * 1.0d) / max;
                            d2 *= d3;
                            d *= d3;
                        }
                        Bitmap A002 = 0fO.A00(bitmap2, (int) (d + 0.5d), (int) (d2 + 0.5d), true);
                        0qQ.A07(A002);
                        int width2 = A002.getWidth();
                        int height2 = A002.getHeight();
                        int width3 = A002.getWidth();
                        int height3 = A002.getHeight();
                        FloatBuffer allocateFloatBuffer = Tensor.allocateFloatBuffer(width3 * 3 * height3);
                        0qQ.A07(allocateFloatBuffer);
                        int i2 = height3 * width3;
                        int[] iArr = new int[i2];
                        A002.getPixels(iArr, 0, width3, 0, 0, width3, height3);
                        for (int i3 = 0; i3 < i2; i3++) {
                            int i4 = iArr[i3];
                            allocateFloatBuffer.put(i3, (float) ((i4 >> 16) & 255));
                            allocateFloatBuffer.put(i2 + i3, (float) ((i4 >> 8) & 255));
                            allocateFloatBuffer.put((i2 * 2) + i3, (float) (i4 & 255));
                        }
                        long[] jArr = {1, 3, (long) height3, (long) width3};
                        XF6 xf6 = XF6.CONTIGUOUS;
                        IValue[] tuple = r6.A00.forward(IValue.tupleFrom(IValue.from(Tensor.fromBlob(allocateFloatBuffer, jArr, xf6)), IValue.from(Tensor.fromBlob(new float[]{(float) A002.getHeight(), (float) A002.getWidth(), 1.0f}, new long[]{1, 3}, xf6)))).toTuple();
                        0qQ.A0A(tuple);
                        float[] dataAsFloatArray = ((IValue) 03t.A05(tuple)).toTensor().getDataAsFloatArray();
                        int length = dataAsFloatArray.length;
                        int i5 = length / 4;
                        RectF[] rectFArr = new RectF[i5];
                        int i6 = 0;
                        for (int i7 = 0; i7 < i5; i7++) {
                            rectFArr[i7] = AnonymousClass7TE.A0Y();
                        }
                        int A003 = C70002Hb.A00(0, length - 1, 4);
                        if (A003 >= 0) {
                            int i8 = 0;
                            while (true) {
                                int i9 = i8 + 1;
                                RectF rectF = rectFArr[i8];
                                rectF.left = dataAsFloatArray[i];
                                rectF.top = dataAsFloatArray[i + 1];
                                rectF.right = dataAsFloatArray[i + 2];
                                rectF.bottom = dataAsFloatArray[i + 3];
                                float floatValue = valueOf.floatValue() / ((float) width2);
                                float floatValue2 = valueOf2.floatValue() / ((float) height2);
                                rectFArr[i8] = new RectF(rectF.left * floatValue, rectF.top * floatValue2, rectF.right * floatValue, rectF.bottom * floatValue2);
                                if (i == A003) {
                                    break;
                                }
                                i += 4;
                                i8 = i9;
                            }
                        }
                        float[] dataAsFloatArray2 = tuple[1].toTensor().getDataAsFloatArray();
                        ArrayList arrayList = new ArrayList(i5);
                        int i10 = 0;
                        while (i6 < i5) {
                            arrayList.add(new AnonymousClass9ZC(rectFArr[i6], dataAsFloatArray2[i10]));
                            i6++;
                            i10++;
                        }
                        obj = new AnonymousClass9ZE(arrayList);
                    } else {
                        obj = new XHE(new Object());
                    }
                    if (obj instanceof AnonymousClass9ZE) {
                        ArrayMap arrayMap = r9.A00;
                        String A06 = r11.A06();
                        List list = ((AnonymousClass9ZE) obj).A00;
                        ArrayList A1C = AnonymousClass7TE.A1C();
                        for (Object next : list) {
                            if (next instanceof AnonymousClass9ZC) {
                                A1C.add(next);
                            }
                        }
                        arrayMap.put(A06, A1C);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                } catch (Throwable th) {
                    mMv.invoke(r9.A00.get(r11.A06()));
                    throw th;
                }
                mMv.invoke(r9.A00.get(r11.A06()));
            }
        }
    }
}
