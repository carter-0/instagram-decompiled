package X;

import android.util.SparseArray;
import com.facebook.litho.LithoView;
import com.instagram.android.R;

public final class IL1 implements 2IR {
    public final /* synthetic */ AnonymousClass6LP A00;
    public final /* synthetic */ AnonymousClass6NN A01;
    public final /* synthetic */ AnonymousClass6OI A02;
    public final /* synthetic */ AnonymousClass6Q9 A03;
    public final /* synthetic */ C229392nJ A04;
    public final /* synthetic */ C57328IXl A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public final void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        AnonymousClass6OI r0 = this.A02;
        r0.A01.remove(this.A06);
        AnonymousClass6LP r02 = this.A00;
        r02.A0C(message);
        r02.A0E(message);
        r02.A0B(message);
        C57328IXl.A01(this.A05, th);
        this.A01.onFailure(th);
    }

    public IL1(AnonymousClass6LP r1, AnonymousClass6NN r2, AnonymousClass6OI r3, AnonymousClass6Q9 r4, C229392nJ r5, C57328IXl iXl, String str, boolean z, boolean z2) {
        this.A00 = r1;
        this.A07 = z;
        this.A08 = z2;
        this.A02 = r3;
        this.A06 = str;
        this.A03 = r4;
        this.A05 = iXl;
        this.A04 = r5;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        2V1 r0;
        String str;
        C3034368u r9 = (C3034368u) obj;
        if (r9 == null) {
            AnonymousClass6LP r1 = this.A00;
            r1.A0B("result is null");
            r1.A0C("result is null");
            return;
        }
        AnonymousClass6LP r3 = this.A00;
        boolean z = this.A07;
        r3.A0J(z);
        if (!this.A08) {
            AnonymousClass6OI r02 = this.A02;
            r02.A01.remove(this.A06);
        }
        r3.A04();
        try {
            SparseArray sparseArray = new SparseArray();
            sparseArray.put(R.id.showreel_config_provider, this.A03);
            sparseArray.put(R.id.showreel_logger, r3);
            C57328IXl iXl = this.A05;
            LithoView lithoView = iXl.A00;
            if (lithoView != null) {
                r0 = lithoView.A08;
            } else {
                r0 = null;
            }
            C53617GrW A002 = GY5.A00(r0);
            A002.A0B(r9);
            A002.A0C(this.A04);
            String A0b = AnonymousClass7TF.A0b();
            if (A0b == null) {
                C251263mp r03 = A002.A01.A01;
                if (r03 != null) {
                    str = r03.A0J();
                } else {
                    str = "unknown component";
                }
                2W6.A00("Component:NullKeySet", AnonymousClass05K.A01, 002.A0g("Setting a null key from ", str, " which is usually a mistake! If it is not, explicitly set the String 'null'"));
                A0b = "null";
            }
            C251253mo r12 = A002.A00;
            r12.A04 = true;
            r12.A03 = A0b;
            GY5 gy5 = A002.A01;
            gy5.A00 = sparseArray;
            gy5.A03 = new INH(iXl, 2);
            GY5 A0A = A002.A0A();
            LithoView lithoView2 = iXl.A00;
            if (lithoView2 != null) {
                lithoView2.setComponent(A0A);
            }
            LithoView lithoView3 = iXl.A00;
            if (lithoView3 != null) {
                lithoView3.post(new C57874Ihr(lithoView3, r3));
            }
            r3.A0I(z);
            r3.A05();
            r3.A06();
            iXl.A09.DOf(2);
            this.A01.onSuccess();
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            0kD.A07("IgShowreelCompositionLithoController#onBloksLayoutBinding", message, e);
            r3.A0D(message);
            r3.A0E(message);
            r3.A0B(message);
            C57328IXl.A01(this.A05, e);
            this.A01.onFailure(e);
        }
    }
}
