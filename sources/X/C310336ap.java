package X;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.MovementMethod;
import android.view.View;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.6ap  reason: invalid class name and case insensitive filesystem */
public final class C310336ap {
    public int A00;
    public int A01;
    public int A02;
    public Drawable A03;
    public Drawable A04;
    public MovementMethod A05;
    public View A06;
    public ImageUrl A07;
    public ImageUrl A08;
    public ImageUrl A09;
    public MVB A0A;
    public C310356ar A0B = C310356ar.A05;
    public C310346aq A0C = C310346aq.DEFAULT;
    public CharSequence A0D;
    public Integer A0E;
    public Integer A0F = AnonymousClass05K.A00;
    public String A0G;
    public String A0H;
    public String A0I;
    public boolean A0J;
    public boolean A0K = true;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;

    public final void A01() {
        this.A0L = true;
    }

    public final void A08(Drawable drawable, int i) {
        0qQ.A0B(drawable, 0);
        this.A04 = drawable;
        drawable.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    public final void A09(View view) {
        0qQ.A0B(view, 0);
        this.A0O = true;
        this.A06 = view;
    }

    public final void A0A(MVB mvb) {
        0qQ.A0B(mvb, 0);
        this.A0A = mvb;
    }

    public final void A0B(C310356ar r2) {
        0qQ.A0B(r2, 0);
        this.A0B = r2;
    }

    public final void A0C(C310346aq r2) {
        0qQ.A0B(r2, 0);
        this.A0C = r2;
    }

    public final void A0D(String str) {
        0qQ.A0B(str, 0);
        this.A0G = str;
    }

    public final Dc2 A00() {
        CharSequence charSequence = this.A0D;
        if (charSequence == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (!this.A0L || this.A0A != null) {
            C310346aq r4 = this.A0C;
            C310346aq r3 = C310346aq.ERROR;
            if ((r4 == r3 || r4 == C310346aq.SUCCESS) && this.A0B != C310356ar.A05) {
                throw new IllegalStateException("Check failed.");
            }
            if (r4 == r3) {
                0wb.A03("igds_snackbar_error_style_missing_category", String.valueOf(charSequence));
            }
            if (this.A0B == C310356ar.A05 || this.A09 != null || this.A04 != null || this.A0E != null) {
                return new Dc2(this);
            }
            throw new IllegalStateException("Check failed.");
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A02() {
        A0B(C310356ar.ICON);
    }

    public final void A03() {
        A0B(C310356ar.SQUARE);
    }

    public final void A04() {
        A0C(C310346aq.DEFAULT);
    }

    public final void A05() {
        A0C(C310346aq.ERROR);
    }

    public final void A06() {
        this.A01 = Dc5.A00();
    }

    public final void A07(int i) {
        this.A0E = Integer.valueOf(i);
    }
}
