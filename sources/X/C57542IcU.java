package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.animation.Interpolator;

/* renamed from: X.IcU  reason: case insensitive filesystem */
public final class C57542IcU implements C59561JOh {
    public final C21255XRa A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C57542IcU) {
                C57542IcU icU = (C57542IcU) obj;
                if (!(this.A00 == icU.A00 && this.A01 == icU.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A00);
        Integer num = this.A01;
        return A0K + C51971G9r.A0D(num, C55217He8.A00(num));
    }

    public C57542IcU(C21255XRa xRa, Integer num) {
        AnonymousClass7TG.A1O(xRa, num);
        this.A00 = xRa;
        this.A01 = num;
    }

    public final /* bridge */ /* synthetic */ Object EIh(Context context, C59535JNh jNh) {
        int i;
        boolean A1Z = AnonymousClass7TG.A1Z(context, jNh);
        switch (this.A01.intValue()) {
            case 1:
                i = 20;
                break;
            case 2:
                i = 24;
                break;
            case 3:
                i = 32;
                break;
            case 4:
                i = 48;
                break;
            case 5:
                i = 60;
                break;
            case 6:
                i = 72;
                break;
            default:
                i = 16;
                break;
        }
        DisplayMetrics A0E = AnonymousClass7TF.A0E(context);
        int applyDimension = (int) TypedValue.applyDimension(A1Z ? 1 : 0, (float) i, A0E);
        Interpolator interpolator = C7293Q2s.A09;
        return new C56082HsV(new C7293Q2s(context, 2.0f, C56611I4l.A01(this.A00, jNh), applyDimension), i);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CdsSpinnerVariant(color=");
        A1A.append(this.A00);
        A1A.append(", size=");
        return C51975G9x.A0i(C55217He8.A00(this.A01), A1A);
    }
}
