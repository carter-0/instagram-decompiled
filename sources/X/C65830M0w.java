package X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.M0w  reason: case insensitive filesystem */
public final class C65830M0w implements MUV {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C63891LAu A02;

    public final void APo(Bitmap bitmap, int i, int i2) {
        0qQ.A0B(bitmap, 0);
        this.A02.A05.A00(i, bitmap);
    }

    public C65830M0w(C63891LAu lAu, int i, int i2) {
        this.A02 = lAu;
        this.A01 = i;
        this.A00 = i2;
    }

    /* JADX WARNING: type inference failed for: r14v2, types: [java.lang.Object, X.Kom] */
    public final void Dq5(double[] dArr) {
        C63891LAu lAu = this.A02;
        int length = dArr.length;
        double[] dArr2 = new double[length];
        lAu.A01 = dArr2;
        for (int i = 0; i < length; i++) {
            dArr2[i] = 1000.0d * dArr[i];
        }
        int i2 = this.A01;
        int i3 = this.A00;
        long j = lAu.A04.A01;
        List list = lAu.A08;
        double size = ((double) (j / ((long) list.size()))) / 2.0d;
        double[] dArr3 = new double[list.size()];
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            dArr3[i4] = JTO.A00(list.get(i4));
        }
        LP1 lp1 = lAu.A00;
        if (lp1 != null) {
            lp1.A04 = dArr3;
            lp1.A00();
        }
        HashMap A1E = AnonymousClass7TE.A1E();
        int size3 = list.size();
        for (int i5 = 0; i5 < size3; i5++) {
            double A002 = JTO.A00(list.get(i5));
            double[] dArr4 = lAu.A01;
            if (dArr4 == null) {
                0qQ.A0F("syncFrameTimesMs");
                throw AnonymousClass00P.createAndThrow();
            }
            int i6 = 0;
            while (true) {
                if (i6 < r9) {
                    double d = dArr4[i6];
                    double d2 = A002 + size;
                    if (A002 - size > d || d > d2) {
                        i6++;
                    } else {
                        LP1 lp12 = lAu.A00;
                        if (lp12 != null) {
                            int A06 = C51966G9m.A06(list);
                            ? obj = new Object();
                            obj.A04 = 0;
                            obj.A02 = A06;
                            obj.A01 = (double) i2;
                            obj.A00 = (double) i3;
                            obj.A03 = 0;
                            lp12.A0B.ATE(new KJ2(obj, lp12, i5));
                        }
                    }
                } else {
                    double d3 = 0.0d;
                    for (double d4 : dArr4) {
                        if (A002 - d4 >= 0.0d && d4 > d3) {
                            d3 = d4;
                        }
                    }
                    Double valueOf = Double.valueOf(d3);
                    if (!A1E.containsKey(valueOf)) {
                        A1E.put(valueOf, AnonymousClass7TE.A1C());
                    }
                    List list2 = (List) A1E.get(valueOf);
                    if (list2 != null) {
                        list2.add(Integer.valueOf(i5));
                    }
                }
            }
        }
        HandlerThread handlerThread = new HandlerThread("BitmapTimelineFramesGenerator.NonSyncThumbnailThread", 9);
        AnonymousClass0fe.A00(handlerThread);
        handlerThread.start();
        new Handler(handlerThread.getLooper()).post(new M9R(handlerThread, lAu, A1E, i2));
    }
}
