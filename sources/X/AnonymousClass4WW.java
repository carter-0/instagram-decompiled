package X;

import android.content.Context;

/* renamed from: X.4WW  reason: invalid class name */
public final class AnonymousClass4WW extends 0Yg implements 0sL {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass4U7 A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ AnonymousClass4DU A03;
    public final /* synthetic */ AnonymousClass4DU A04;
    public final /* synthetic */ AnonymousClass3W1 A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4WW(Context context, AnonymousClass4U7 r3, 1Xj r4, AnonymousClass4DU r5, AnonymousClass4DU r6, AnonymousClass3W1 r7) {
        super(2);
        this.A01 = r3;
        this.A00 = context;
        this.A02 = r4;
        this.A05 = r7;
        this.A03 = r5;
        this.A04 = r6;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Context context = (Context) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        0qQ.A0B(context, 0);
        AnonymousClass4U7 r6 = this.A01;
        Context context2 = this.A00;
        1Xj r2 = this.A02;
        AnonymousClass3W1 r5 = this.A05;
        AnonymousClass3YB A022 = r6.A02(context2, r2, this.A03, r5, booleanValue);
        return ((C242923Ws) r6.A04.getValue()).A04(context, r2, this.A04, A022, r5, (String) null);
    }
}
