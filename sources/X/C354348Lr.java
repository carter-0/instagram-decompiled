package X;

import java.util.List;

/* renamed from: X.8Lr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C354348Lr implements AnonymousClass2gO {
    public final /* synthetic */ C354248Lf A00;

    public /* synthetic */ C354348Lr(C354248Lf r1) {
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        C378459Pw r1;
        STU stu;
        C354248Lf r0 = this.A00;
        float floatValue = ((Number) obj).floatValue();
        C378369Pn r02 = r0.A06.A0B;
        if (r02 != null && (r1 = r02.A08) != null && (r1 instanceof C388789oO) && (stu = ((C388789oO) r1).A05) != null) {
            if (floatValue < 0.0f) {
                floatValue = 0.0f;
            } else if (floatValue > 1.0f) {
                floatValue = 1.0f;
            }
            if (Float.compare(floatValue, stu.A00) != 0) {
                stu.A00 = floatValue;
                STU.A04(stu, (List) null);
            }
        }
    }
}
