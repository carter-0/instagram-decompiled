package X;

import android.content.Context;
import android.graphics.Typeface;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.shimmer.placeholder.SimpleShimmerPlaceholderView;

public final class MFi extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public long A01;
    public Object A02;
    public final int A03 = 1;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFi(Context context, AnonymousClass3BK r3, OI9 oi9, AnonymousClass4D7 r5) {
        super(2, r5);
        this.A06 = r3;
        this.A05 = oi9;
        this.A04 = context;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MFi, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.MFi, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r13) {
        AnonymousClass4D7 r8 = r13;
        if (this.A03 != 0) {
            ? mFi = new MFi((Context) this.A04, (AnonymousClass3BK) this.A06, (OI9) this.A05, r13);
            mFi.A02 = obj;
            return mFi;
        }
        IgTextView igTextView = (IgTextView) this.A05;
        Typeface typeface = (Typeface) this.A06;
        long j = this.A01;
        return new MFi(typeface, (NJJ) this.A02, igTextView, (SimpleShimmerPlaceholderView) this.A04, r8, j);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.MFi, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A03
            if (r0 == 0) goto L_0x004e
            X.1Hj r3 = X.1Hj.A02
            int r0 = r11.A00
            r9 = -1
            r8 = 1
            if (r0 == 0) goto L_0x0042
            long r4 = r11.A01
            X.0eS.A00(r12)
        L_0x0012:
            long r4 = r4 + r9
        L_0x0013:
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0081
            java.lang.Object r0 = r11.A05
            X.OI9 r0 = (X.OI9) r0
            X.0eM r0 = r0.A08
            android.widget.TextView r7 = X.JTO.A0I(r0)
            java.lang.Object r6 = r11.A04
            android.content.Context r6 = (android.content.Context) r6
            r2 = 2131972417(0x7f135141, float:1.958184E38)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r0.toMillis(r4)
            java.lang.String r0 = X.1G0.A02(r0)
            X.DbX.A13(r6, r7, r0, r2)
            r0 = 1000(0x3e8, double:4.94E-321)
            r11.A01 = r4
            r11.A00 = r8
            java.lang.Object r0 = X.C241603Pv.A01(r11, r0)
            if (r0 != r3) goto L_0x0012
            return r3
        L_0x0042:
            X.0eS.A00(r12)
            java.lang.Object r0 = r11.A06
            X.3BK r0 = (X.AnonymousClass3BK) r0
            long r4 = r0.A00()
            goto L_0x0013
        L_0x004e:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r11.A00
            r2 = 1
            if (r0 == 0) goto L_0x00b5
            X.0eS.A00(r12)
        L_0x0058:
            X.3Ii r12 = (X.C239803Ii) r12
            boolean r0 = r12 instanceof X.C239793Ih
            r2 = 0
            r1 = 8
            if (r0 == 0) goto L_0x0084
            java.lang.Object r0 = r11.A04
            X.JTO.A1a(r0, r1)
            java.lang.Object r1 = r11.A05
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.3Ih r12 = (X.C239793Ih) r12
            java.lang.Object r0 = r12.A00
            X.MWW r0 = (X.MWW) r0
            X.Jxc r0 = (X.C61126Jxc) r0
            java.lang.String r0 = r0.A00
            r1.setText(r0)
            java.lang.Object r0 = r11.A06
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            r1.setTypeface(r0)
            r1.setVisibility(r2)
        L_0x0081:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0084:
            boolean r0 = r12 instanceof X.C297815sO
            if (r0 != 0) goto L_0x008f
            if (r12 == 0) goto L_0x008f
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008f:
            java.lang.Object r0 = r11.A04
            X.JTO.A1a(r0, r1)
            java.lang.Object r1 = r11.A05
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = "#1992"
            r1.setText(r0)
            java.lang.Object r0 = r11.A06
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            r1.setTypeface(r0)
            r1.setVisibility(r2)
            X.0wb r2 = X.0wb.A01
            r0 = 65
            java.lang.String r1 = X.C273654mx.A00(r0)
            java.lang.String r0 = "fetching golden ticket number failed"
            r2.Ew0(r1, r0)
            goto L_0x0081
        L_0x00b5:
            X.0eS.A00(r12)
            r0 = 3000(0xbb8, double:1.482E-320)
            long r8 = r11.A01
            java.lang.Object r5 = r11.A02
            r6 = 0
            r7 = 12
            X.MGA r4 = new X.MGA
            r4.<init>((java.lang.Object) r5, (X.AnonymousClass4D7) r6, (int) r7, (long) r8)
            r11.A00 = r2
            java.lang.Object r12 = X.I3P.A01(r11, r4, r0)
            if (r12 != r3) goto L_0x0058
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MFi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MFi) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFi(Typeface typeface, NJJ njj, IgTextView igTextView, SimpleShimmerPlaceholderView simpleShimmerPlaceholderView, AnonymousClass4D7 r6, long j) {
        super(2, r6);
        this.A04 = simpleShimmerPlaceholderView;
        this.A05 = igTextView;
        this.A06 = typeface;
        this.A01 = j;
        this.A02 = njj;
    }
}
