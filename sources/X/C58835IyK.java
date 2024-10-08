package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.Typeface;

/* renamed from: X.IyK  reason: case insensitive filesystem */
public final class C58835IyK extends 0Yg implements 0sP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ float A04;
    public final /* synthetic */ float A05;
    public final /* synthetic */ float A06;
    public final /* synthetic */ float A07;
    public final /* synthetic */ long A08;
    public final /* synthetic */ long A09;
    public final /* synthetic */ long A0A;
    public final /* synthetic */ long A0B;
    public final /* synthetic */ C284945Oz A0C;
    public final /* synthetic */ C270284gU A0D;
    public final /* synthetic */ AnonymousClass5Z4 A0E;
    public final /* synthetic */ String A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58835IyK(C284945Oz r3, C270284gU r4, AnonymousClass5Z4 r5, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, long j, long j2, long j3, long j4) {
        super(1);
        this.A0B = j;
        this.A07 = f;
        this.A08 = j2;
        this.A0A = j3;
        this.A00 = f2;
        this.A0C = r3;
        this.A0D = r4;
        this.A09 = j4;
        this.A02 = f3;
        this.A04 = f4;
        this.A03 = f5;
        this.A01 = f6;
        this.A0F = str;
        this.A05 = f7;
        this.A06 = f8;
        this.A0E = r5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5Q4 r1 = (AnonymousClass5Q4) obj;
        C51970G9q.A15(r1);
        long j = this.A0B;
        long A002 = C289325dP.A00(this.A07, C51971G9r.A02(this.A0C));
        long A003 = C288015bE.A00(r1.F06(5.0f), r1.F06(30.0f));
        float F06 = r1.F06(3.0f);
        long A004 = AnonymousClass6GR.A00(F06, F06);
        C270284gU r37 = this.A0D;
        float A032 = C51971G9r.A03(r37);
        C289635dw r17 = C289635dw.A00;
        r1.AQv((C288195bW) null, r17, A032, 3, j, A002, A003, A004);
        long j2 = this.A09;
        float f = this.A02;
        float f2 = this.A04;
        float f3 = this.A03;
        float f4 = this.A01;
        AnonymousClass5QB r4 = ((AnonymousClass5QC) r1.Ayw()).A02.A02;
        AnonymousClass5QA r10 = r4.A01;
        AnonymousClass5S8 r9 = new AnonymousClass5S8();
        Paint paint = r9.A01;
        paint.setMaskFilter(new BlurMaskFilter(22.0f, BlurMaskFilter.Blur.NORMAL));
        paint.setColor(C285595Rx.A00(C285595Rx.A02(AnonymousClass5RX.A0K[(int) (j2 & 63)], AnonymousClass5RW.A03(j2), AnonymousClass5RW.A02(j2), AnonymousClass5RW.A01(j2), 0.15f * C51971G9r.A03(r37))));
        AnonymousClass5QA r18 = r10;
        AnonymousClass5S8 r19 = r9;
        r18.AQt(r19, f, f2, f3, f4, r1.F06(15.0f), r1.F06(15.0f));
        long j3 = this.A08;
        long j4 = this.A0A;
        long A005 = C288015bE.A00(this.A00, r1.F06(30.0f));
        float F062 = r1.F06(15.0f);
        AnonymousClass5Q4 r24 = r1;
        C289635dw r26 = r17;
        r24.AQv((C288195bW) null, r26, C51971G9r.A03(r37), 3, j3, j4, A005, AnonymousClass6GR.A00(F062, F062));
        String str = this.A0F;
        float f5 = this.A05;
        float f6 = this.A06;
        AnonymousClass5Z4 r0 = this.A0E;
        AnonymousClass5QA r8 = r4.A01;
        Paint paint2 = new Paint();
        paint2.setTextSize(r1.F05(r0.A02.A01));
        paint2.setTypeface(Typeface.DEFAULT_BOLD);
        paint2.setAlpha((int) (C51971G9r.A03(r37) * 255.0f));
        AnonymousClass5R4.A00(r8).drawText(str, f5, f6 - paint2.ascent(), paint2);
        return C60340gF.A00;
    }
}
