package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.7Pr  reason: invalid class name and case insensitive filesystem */
public final class C331127Pr {
    public static final int[] A1W = {R.anim.left_in, R.anim.right_out, R.anim.right_in, R.anim.left_out};
    public static final int[] A1X = {R.anim.right_in, R.anim.left_out, R.anim.left_in, R.anim.right_out};
    public double A00;
    public float A01 = 0.2f;
    public float A02 = 0.5f;
    public float A03 = 0.5f;
    public float A04 = 1.0f;
    public float A05;
    public int A06;
    public int A07;
    public int A08 = -1;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C = 2;
    public int A0D;
    public int A0E;
    public int A0F;
    public Rect A0G;
    public Drawable A0H;
    public Drawable A0I;
    public Drawable A0J;
    public View.OnClickListener A0K;
    public View.OnClickListener A0L;
    public View.OnClickListener A0M;
    public View A0N;
    public AnonymousClass2k4 A0O = AnonymousClass2k4.DEFAULT;
    public C55639Hky A0P;
    public C331147Pt A0Q = new C331137Ps((View.OnClickListener) null, (CharSequence) null, "", 0, 0).A00();
    public C331147Pt A0R = new C331137Ps((View.OnClickListener) null, (CharSequence) null, "", 0, 0).A00();
    public C331147Pt A0S = new C331137Ps((View.OnClickListener) null, (CharSequence) null, "", 0, 0).A00();
    public C273494mf A0T;
    public C273414mX A0U;
    public C13678Ten A0V;
    public C13823Tht A0W;
    public C262944Gp A0X;
    public SHR A0Y;
    public Boolean A0Z;
    public Boolean A0a;
    public CharSequence A0b;
    public CharSequence A0c;
    public CharSequence A0d;
    public Float A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k = true;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p = true;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y = true;
    public boolean A0z;
    public boolean A10;
    public boolean A11 = true;
    public boolean A12;
    public boolean A13 = false;
    public boolean A14 = true;
    public boolean A15;
    public boolean A16 = true;
    public boolean A17;
    public boolean A18;
    public boolean A19;
    public boolean A1A;
    public boolean A1B;
    public boolean A1C = true;
    public boolean A1D;
    public boolean A1E;
    public boolean A1F;
    public boolean A1G;
    public boolean A1H;
    public boolean A1I;
    public boolean A1J;
    public boolean A1K = true;
    public boolean A1L;
    public boolean A1M;
    public boolean A1N;
    public boolean A1O = true;
    public boolean A1P;
    public boolean A1Q;
    public boolean A1R;
    public boolean A1S;
    public int[] A1T;
    public int[] A1U;
    public final 0lg A1V;

    public C331127Pr(0lg r10) {
        0qQ.A0B(r10, 1);
        this.A1V = r10;
    }

    public final void A01() {
        this.A0Q = new C331137Ps((View.OnClickListener) null, (CharSequence) null, "", 0, 0).A00();
    }

    public final void A02() {
        this.A0R = new C331137Ps((View.OnClickListener) null, (CharSequence) null, "", 0, 0).A00();
    }

    public final C331157Pu A00() {
        if (this.A0s) {
            float f = this.A01;
            float f2 = this.A03;
            if (f >= f2 && !this.A0o && f > f2) {
                throw new IllegalArgumentException("Expected the collapsed height ratio to be less than the initial opening height ratio");
            }
        }
        return new C331157Pu(this.A1V, this);
    }

    public final void A03() {
        int[] iArr = A1X;
        A04(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public final void A04(int i, int i2, int i3, int i4) {
        this.A1U = new int[]{i, i2, i3, i4};
    }

    public final void A05(Context context, int i) {
        this.A03 = ((float) context.getResources().getDimensionPixelSize(i)) / ((float) 0nA.A08(context));
    }

    public final void A06(C331147Pt r1) {
        this.A0Q = r1;
    }

    public final void A07(C331147Pt r1) {
        this.A0R = r1;
    }
}
