package X;

import android.os.Build;
import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.R9n  reason: case insensitive filesystem */
public final class C8786R9n extends 0ng {
    public final /* synthetic */ T7F A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8786R9n(T7F t7f) {
        super(1817138379, 3, false, false);
        this.A00 = t7f;
    }

    public final void run() {
        try {
            ArrayList A1C = AnonymousClass7TE.A1C();
            T7F t7f = this.A00;
            List list = t7f.A03;
            List list2 = list;
            A1C.addAll(list);
            if (new AnonymousClass94N(t7f.A02).A02 && !A1C.isEmpty()) {
                02m A0l = C51965G9l.A0l();
                A0l.markerStart(424099727);
                try {
                    List A0Z = 00k.A0Z(A1C);
                    A0l.markerAnnotate(424099727, "number_of_scrolls", t7f.A00);
                    double A002 = (double) T7F.A00(A0Z, 10);
                    double A003 = (double) T7F.A00(A0Z, 50);
                    double A004 = (double) T7F.A00(A0Z, 90);
                    double A02 = (((double) 00k.A02(A0Z)) * 1.0d) / ((double) A0Z.size());
                    String str = Build.MODEL;
                    String str2 = Build.MANUFACTURER;
                    C238903Dw r3 = t7f.A01;
                    int i = r3.A03;
                    int i2 = r3.A02;
                    double d = r3.A00;
                    double d2 = r3.A01;
                    double d3 = -1.0d;
                    if (!(d == -1.0d || d2 == -1.0d)) {
                        d3 = Math.sqrt((d * d) + (d2 * d2));
                    }
                    A0l.markerAnnotate(424099727, "dy_mean", A02);
                    A0l.markerAnnotate(424099727, "dy_p10", A002);
                    A0l.markerAnnotate(424099727, "dy_p50", A003);
                    A0l.markerAnnotate(424099727, "dy_p90", A004);
                    A0l.markerAnnotate(424099727, "screen_width", i);
                    A0l.markerAnnotate(424099727, "screen_height", i2);
                    A0l.markerAnnotate(424099727, "x_ppi", d);
                    A0l.markerAnnotate(424099727, "y_ppi", d2);
                    A0l.markerAnnotate(424099727, "diagonal_ppi", d3);
                    A0l.markerAnnotate(424099727, "device_model", str);
                    A0l.markerAnnotate(424099727, "device_manufacturer", str2);
                    A0l.markerEnd(424099727, 2);
                } catch (Exception e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Unknown error";
                    }
                    Pxf.A1I(A0l, TraceFieldType.FailureReason, message, 424099727);
                }
            }
            list2.clear();
            t7f.A00 = 0;
        } catch (Exception unused) {
        }
    }
}
