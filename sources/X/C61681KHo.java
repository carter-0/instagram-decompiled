package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.KHo  reason: case insensitive filesystem */
public final class C61681KHo extends C268694dq implements C300645xY {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass8D7 A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A = AnonymousClass0eN.A01(new C66297MMg(this, 21));
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H;
    public final AnonymousClass0eM A0I;
    public final AnonymousClass0eM A0J;

    public C61681KHo(Context context, UserSession userSession, AnonymousClass8D7 r6) {
        0qQ.A0B(context, 1);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r6;
        0eO r2 = 0eO.A02;
        this.A0J = C66297MMg.A01(this, r2, 30);
        this.A0D = C66297MMg.A01(this, r2, 24);
        this.A0B = C66297MMg.A01(this, r2, 22);
        this.A04 = C66297MMg.A01(this, r2, 15);
        this.A0I = C66297MMg.A01(this, r2, 29);
        this.A07 = C66297MMg.A01(this, r2, 18);
        this.A09 = C66297MMg.A01(this, r2, 20);
        this.A0H = C66297MMg.A01(this, r2, 28);
        this.A0G = C66297MMg.A01(this, r2, 27);
        this.A0E = C66297MMg.A01(this, r2, 25);
        this.A05 = C66297MMg.A01(this, r2, 16);
        this.A03 = C66297MMg.A01(this, r2, 14);
        this.A0C = C66297MMg.A01(this, r2, 23);
        this.A0F = C66297MMg.A01(this, r2, 26);
        this.A06 = C66297MMg.A01(this, r2, 17);
        this.A08 = C66297MMg.A01(this, r2, 19);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Drawable A0D2 = JTO.A0D(this.A05);
        if (A0D2 != null) {
            A0D2.draw(canvas);
        }
        JTQ.A0u(canvas, this.A03);
        JTQ.A0u(canvas, this.A0C);
        Drawable A0D3 = JTO.A0D(this.A0F);
        if (A0D3 != null) {
            A0D3.draw(canvas);
        }
        JTQ.A0u(canvas, this.A06);
        JTQ.A0u(canvas, this.A08);
    }

    public final List A07() {
        Drawable[] drawableArr = {JTO.A0D(this.A05), JTO.A0D(this.A03), JTO.A0D(this.A0C), JTO.A0D(this.A0F), JTO.A0D(this.A06), JTO.A0D(this.A08)};
        0qQ.A0B(drawableArr, 0);
        return 03t.A0I(drawableArr);
    }

    public final String C4F() {
        return C273654mx.A00(84);
    }

    public final int getIntrinsicHeight() {
        int i;
        Drawable A0D2 = JTO.A0D(this.A0F);
        if (A0D2 != null) {
            i = A0D2.getIntrinsicHeight() + DbX.A07(this.A0H);
        } else {
            i = 0;
        }
        return ((C15839UjP) this.A03.getValue()).A00 + JTT.A09(this.A0C) + i + JTT.A09(this.A06) + JTT.A09(this.A08) + (DbX.A07(this.A0B) * 3);
    }

    public final int getIntrinsicWidth() {
        return DbX.A07(this.A0J);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Drawable A0D2 = JTO.A0D(this.A05);
        if (A0D2 != null) {
            A0D2.setBounds(i, ((C15839UjP) this.A03.getValue()).A00 + i2, i3, i4);
        }
        float f = ((float) (i + i3)) / 2.0f;
        AnonymousClass0eM r1 = this.A0C;
        int A0A2 = JTR.A0A(JTO.A0D(r1), f);
        AnonymousClass0eM r6 = this.A03;
        int i5 = ((C15839UjP) r6.getValue()).A00 + i2;
        int A092 = JTT.A09(r1) + i5;
        JTO.A0D(r1).setBounds(new Rect(A0A2, i5, JTO.A0D(r1).getIntrinsicWidth() + A0A2, A092));
        Drawable A0D3 = JTO.A0D(this.A0F);
        if (A0D3 != null) {
            int A0A3 = JTR.A0A(A0D3, f);
            int A072 = A092 + DbX.A07(this.A0H);
            int intrinsicHeight = A0D3.getIntrinsicHeight() + A072;
            A0D3.setBounds(A0A3, A072, A0D3.getIntrinsicWidth() + A0A3, intrinsicHeight);
            A092 = intrinsicHeight;
        }
        AnonymousClass0eM r2 = this.A0B;
        int A073 = A092 + DbX.A07(r2);
        AnonymousClass0eM r12 = this.A06;
        int A093 = JTT.A09(r12) + A073;
        JTO.A0D(r6).setBounds(i, i2, i3, A073);
        JTO.A0D(r12).setBounds(i, A073, i3, A093);
        AnonymousClass0eM r4 = this.A08;
        int A0A4 = JTR.A0A(JTO.A0D(r4), f);
        int A074 = A093 + DbX.A07(r2);
        JTO.A0D(r4).setBounds(A0A4, A074, JTO.A0D(r4).getIntrinsicWidth() + A0A4, JTT.A09(r4) + A074);
    }
}
