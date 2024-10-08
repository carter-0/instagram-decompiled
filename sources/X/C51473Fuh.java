package X;

import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.Fuh  reason: case insensitive filesystem */
public final class C51473Fuh implements Runnable {
    public final /* synthetic */ FBN A00;
    public final /* synthetic */ F19 A01;
    public final /* synthetic */ EEM A02;

    public C51473Fuh(FBN fbn, F19 f19, EEM eem) {
        this.A02 = eem;
        this.A01 = f19;
        this.A00 = fbn;
    }

    public final void run() {
        C49721F3j A0X = DbW.A0X();
        EEM eem = this.A02;
        CallerContext callerContext = EEM.A0B;
        AnonymousClass0aP r11 = eem.A08;
        F19 f19 = this.A01;
        String str = f19.A05;
        String str2 = f19.A06;
        String str3 = f19.A01;
        String str4 = f19.A00;
        boolean z = f19.A0D;
        boolean z2 = f19.A0A;
        boolean z3 = f19.A0E;
        boolean z4 = f19.A0F;
        boolean z5 = f19.A0B;
        String str5 = f19.A02;
        boolean z6 = z5;
        boolean z7 = z4;
        boolean z8 = z3;
        boolean z9 = z2;
        boolean z10 = z;
        String str6 = str5;
        String str7 = str4;
        String str8 = str3;
        String str9 = str2;
        String str10 = str;
        Dbb.A12(A0X.A02(FBN.A00(this.A00), str10, str9, str8, str7, str6, z10, z9, z8, z7, z6, false, f19.A09, f19.A07, f19.A08), eem.A06.getActivity(), r11);
    }
}
