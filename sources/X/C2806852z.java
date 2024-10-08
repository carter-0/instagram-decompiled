package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.52z  reason: invalid class name and case insensitive filesystem */
public final class C2806852z {
    public Drawable A00;
    public ViewGroup A01;
    public ImageView A02;
    public TextView A03;
    public GAM A04;
    public AnonymousClass4Ke A05;
    public final int A06;
    public final Context A07;
    public final Resources A08;
    public final ViewStub A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final boolean A0G;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2806852z(android.view.ViewStub r3) {
        /*
            r2 = this;
            r0 = 1
            X.0qQ.A0B(r3, r0)
            android.content.Context r1 = r3.getContext()
            X.0qQ.A07(r1)
            r0 = 0
            r2.<init>(r1, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2806852z.<init>(android.view.ViewStub):void");
    }

    public C2806852z(Context context, ViewStub viewStub, boolean z) {
        this.A07 = context;
        this.A0G = z;
        this.A09 = viewStub;
        Resources resources = context.getResources();
        0qQ.A07(resources);
        this.A08 = resources;
        Resources resources2 = context.getResources();
        0qQ.A07(resources2);
        this.A06 = resources2.getDimensionPixelSize(R.dimen.action_sheet_divider_margin_top);
        this.A0F = AnonymousClass0eN.A01(new AnonymousClass9L9(this, 15));
        this.A0D = AnonymousClass0eN.A01(new AnonymousClass9L9(this, 13));
        this.A0B = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9L9(this, 11));
        this.A0E = AnonymousClass0eN.A01(new AnonymousClass9L9(this, 14));
        this.A0C = AnonymousClass0eN.A01(new AnonymousClass9L9(this, 12));
        this.A0A = AnonymousClass0eN.A01(new AnonymousClass9L9(this, 10));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2806852z(android.widget.TextView r3, boolean r4) {
        /*
            r2 = this;
            r0 = 1
            X.0qQ.A0B(r3, r0)
            android.content.Context r1 = r3.getContext()
            X.0qQ.A07(r1)
            r0 = 0
            r2.<init>(r1, r0, r4)
            r2.A03 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2806852z.<init>(android.widget.TextView, boolean):void");
    }
}
