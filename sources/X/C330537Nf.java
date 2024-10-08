package X;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.7Nf  reason: invalid class name and case insensitive filesystem */
public final class C330537Nf {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public AnonymousClass7PN A04;
    public AnonymousClass7PM A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public AnonymousClass9HC A0C;
    public final float A0D;
    public final int A0E;
    public final RecyclerView A0F;
    public final 2cs A0G;
    public final AnonymousClass7N8 A0H;
    public final C330527Ne A0I;
    public final boolean A0J;
    public final float A0K;
    public final Context A0L;
    public final C331097Pn A0M;
    public final C330547Ng A0N;

    public static final boolean A01(Integer num, float f, float f2) {
        float f3 = f - f2;
        if (num == AnonymousClass05K.A00 && f3 < 0.0f) {
            return false;
        }
        if (num != AnonymousClass05K.A01 || f3 <= 0.0f) {
            return true;
        }
        return false;
    }

    public C330537Nf(RecyclerView recyclerView, AnonymousClass7N8 r7, C330527Ne r8, AnonymousClass9HC r9, boolean z, boolean z2, boolean z3) {
        this.A0F = recyclerView;
        this.A0C = r9;
        this.A07 = z;
        this.A06 = z2;
        this.A08 = z3;
        this.A0H = r7;
        this.A0I = r8;
        Context context = recyclerView.getContext();
        this.A0L = context;
        this.A0E = ViewConfiguration.get(context).getScaledTouchSlop();
        C330547Ng r3 = new C330547Ng(this);
        this.A0N = r3;
        this.A0K = (float) context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        boolean A022 = 0mk.A02(context);
        this.A0J = A022;
        this.A0D = ((float) context.getResources().getDimensionPixelSize(R.dimen.avatar_sticker_max_height)) * (A022 ? 1.0f : -1.0f);
        2cs A023 = C61340me.A00().A02();
        A023.A06 = true;
        A023.A0A(new C330557Nh(this));
        this.A0G = A023;
        C330567Ni r0 = new C330567Ni(this);
        this.A0M = r0;
        recyclerView.A14(r0);
        recyclerView.A13(r0);
        recyclerView.A12(r3);
        recyclerView.A11(r3);
    }

    public static final void A00(C330537Nf r5, AnonymousClass7PM r6, float f) {
        for (View alpha : r6.CFS()) {
            alpha.setAlpha(Math.max(1.0f - (Math.abs(f) / r5.A0K), 0.0f));
        }
    }
}
