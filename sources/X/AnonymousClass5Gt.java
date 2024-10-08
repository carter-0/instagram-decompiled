package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Deprecated;

/* renamed from: X.5Gt  reason: invalid class name */
public final class AnonymousClass5Gt {
    public int A00;
    public int A01;
    public ViewGroup A02;
    public C283245Gr A03;
    public C234222xL A04;
    public C226262fy A05;
    public C226172fn A06;
    public C283255Gu A07;
    public C283255Gu A08;
    public AnonymousClass5Gs A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final Context A0H;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5Gt(android.app.Activity r3, X.AnonymousClass5Gs r4) {
        /*
            r2 = this;
            r0 = 1
            X.0qQ.A0B(r3, r0)
            android.view.Window r0 = r3.getWindow()
            if (r0 == 0) goto L_0x0019
            android.view.View r1 = r0.getDecorView()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2.<init>(r3, r1, r4)
            return
        L_0x0019:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Gt.<init>(android.app.Activity, X.5Gs):void");
    }

    public final void A03(View view) {
        0qQ.A0B(view, 0);
        this.A03 = new C283235Gq(view);
    }

    public final void A04(View view, int i, int i2, boolean z) {
        0qQ.A0B(view, 3);
        this.A03 = new AnonymousClass9UE(view, i, i2, z);
    }

    public final void A05(AnonymousClass9UE r2) {
        0qQ.A0B(r2, 0);
        this.A03 = r2;
    }

    public final void A06(C226262fy r2) {
        0qQ.A0B(r2, 0);
        this.A05 = r2;
    }

    @Deprecated(message = "No longer supported by IGDS. Theme should always be default: TooltipTheme.Light")
    public final void A07(C283255Gu r2) {
        0qQ.A0B(r2, 0);
        this.A08 = r2;
    }

    @Deprecated(message = "No longer supported by IGDS. Theme should always be default: TooltipTheme.Dark")
    public final void A08(C283255Gu r3) {
        0qQ.A0B(r3, 0);
        if (!r3.equals(C283255Gu.A07)) {
            this.A07 = r3;
            return;
        }
        throw new IllegalStateException("Please do not set a light tooltip theme for Night Mode");
    }

    public final AnonymousClass5Gv A00() {
        if (!this.A0G || this.A0A) {
            C283245Gr r1 = this.A03;
            if (r1 != null) {
                r1.EfP(this.A02);
                return new AnonymousClass5Gv(this);
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("shouldDisableInteractionsOnTapOutsideToHide requires allowTapOutsideToHide to be true");
    }

    public final void A01() {
        A06(C226262fy.BELOW_ANCHOR);
    }

    public final void A02() {
        A06(C226262fy.ABOVE_ANCHOR);
    }

    public AnonymousClass5Gt(Context context, ViewGroup viewGroup, AnonymousClass5Gs r6) {
        0qQ.A0B(context, 1);
        0qQ.A0B(viewGroup, 2);
        0qQ.A0B(r6, 3);
        this.A05 = C226262fy.CENTER_OF_ANCHOR;
        this.A08 = C283255Gu.A07;
        this.A07 = C283255Gu.A06;
        this.A0B = true;
        this.A0F = true;
        this.A0A = true;
        this.A0C = true;
        this.A00 = 5000;
        this.A0H = context;
        this.A02 = viewGroup;
        this.A09 = r6;
    }
}
