package X;

import android.content.Context;
import android.graphics.Rect;
import com.facebook.proxygen.LigerSamplePolicy;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.2zn  reason: invalid class name and case insensitive filesystem */
public final class C235362zn implements C250603lj {
    public final int A00;
    public final Set A01 = new HashSet();

    public final void ATF(AnonymousClass30Y r9, C252093oY r10) {
        Integer num;
        long j;
        Double d;
        String str;
        1Xj r2 = (1Xj) r9.A03;
        AnonymousClass3W1 r5 = (AnonymousClass3W1) r9.A04;
        if (!r2.A4c()) {
            String BHG = r2.A0C.BHG();
            if (BHG != null) {
                Integer[] A002 = AnonymousClass05K.A00(2);
                int length = A002.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        num = AnonymousClass05K.A00;
                        break;
                    }
                    num = A002[i];
                    if (1 - num.intValue() != 0) {
                        str = "never";
                    } else {
                        str = "impression_trigger";
                    }
                    if (str.equals(BHG)) {
                        break;
                    }
                    i++;
                }
            } else {
                num = null;
            }
            if (num == AnonymousClass05K.A01 && !r5.A2D && !r5.A2C) {
                if (r10.CFe(r9) >= 0.5f) {
                    Rect rect = new Rect();
                    r10.B9a(rect, r9);
                    int i2 = rect.bottom;
                    Rect rect2 = new Rect();
                    r10.B9Y(rect2, r9);
                    if (i2 == rect2.bottom) {
                        Set set = this.A01;
                        if (!set.contains(r2.getId())) {
                            set.add(r2.getId());
                            int i3 = this.A00;
                            if (!r5.A3D) {
                                C2801150d r0 = new C2801150d(r2, r5, set);
                                C256113vF r4 = r5.A0q;
                                if (r4 == null) {
                                    r4 = new C256113vF();
                                    r5.A0q = r4;
                                }
                                r4.A00 = r0;
                                List list = r4.A02.A04;
                                list.clear();
                                list.add(new WeakReference(r4.A00));
                                WeakReference weakReference = r4.A01;
                                if (weakReference != null) {
                                    list.add(weakReference);
                                }
                                Float BHH = r2.A0C.BHH();
                                if (BHH == null || Double.valueOf((double) BHH.floatValue()) == null) {
                                    j = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
                                } else {
                                    Float BHH2 = r2.A0C.BHH();
                                    if (BHH2 != null) {
                                        d = Double.valueOf((double) BHH2.floatValue());
                                    } else {
                                        d = null;
                                    }
                                    j = (long) ((int) (d.doubleValue() * 1000.0d));
                                }
                                long j2 = (long) i3;
                                if (!r5.A3D) {
                                    C256113vF r02 = r5.A0q;
                                    if (r02 == null) {
                                        r5.A0q = new C256113vF();
                                    } else {
                                        r02.A00();
                                    }
                                    C256113vF r03 = r5.A0q;
                                    if (r03 != null) {
                                        r03.A01(j, j2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                this.A01.remove(r2.getId());
            }
        }
    }

    public C235362zn(Context context) {
        this.A00 = context.getResources().getInteger(17694720);
    }
}
