package X;

import java.util.Map;

/* renamed from: X.7f6  reason: invalid class name and case insensitive filesystem */
public final class C336737f6 extends 0Yg implements 0sI {
    public final /* synthetic */ C336727f5 A00;
    public final /* synthetic */ C336707f3 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C336737f6(C336727f5 r2, C336707f3 r3) {
        super(5);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        int intValue5 = ((Number) obj5).intValue();
        C336727f5 r6 = this.A00;
        C336707f3 r5 = this.A01;
        C336557eo r2 = r5.A00;
        r6.A00((Map) r2.A02.getValue(), (Map) r2.A03.getValue(), intValue, intValue2);
        C335477d1 r22 = r5.A01;
        if (r22 != null && intValue2 >= (intValue3 - 1) - 3) {
            r22.A00.invoke();
        }
        0sI r0 = r5.A02;
        if (r0 != null) {
            r0.invoke(Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(intValue3), Integer.valueOf(intValue4), Integer.valueOf(intValue5));
        }
        return C60340gF.A00;
    }
}
