package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.common.dextricks.Constants;
import java.util.Map;

public abstract class TA3 implements Cloneable {
    public float A00 = 1.0f;
    public int A01;
    public int A02;
    public int A03;
    public int A04 = -1;
    public int A05 = -1;
    public int A06;
    public Resources.Theme A07;
    public Drawable A08;
    public Drawable A09;
    public Drawable A0A;
    public RE3 A0B = RE3.NORMAL;
    public C13892TjF A0C = C11857Shj.A00;
    public C11856Shi A0D = new C11856Shi();
    public C10112Rmo A0E = C10112Rmo.A00;
    public Class A0F = Object.class;
    public Map A0G = new 01r(0);
    public boolean A0H;
    public boolean A0I = true;
    public boolean A0J;
    public boolean A0K = true;
    public boolean A0L = true;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;

    public final TA3 A04() {
        if (this.A0H) {
            return clone().A04();
        }
        this.A0O = true;
        this.A03 |= Constants.LOAD_RESULT_NEED_REOPTIMIZATION;
        A0G();
        return this;
    }

    public final TA3 A03() {
        if (this.A0H) {
            return clone().A03();
        }
        this.A0I = false;
        this.A03 |= 256;
        A0G();
        return this;
    }

    public final TA3 A05(int i, int i2) {
        if (this.A0H) {
            return clone().A05(i, i2);
        }
        this.A05 = i;
        this.A04 = i2;
        this.A03 |= 512;
        A0G();
        return this;
    }

    public final TA3 A06(Drawable drawable) {
        if (this.A0H) {
            return clone().A06(drawable);
        }
        this.A09 = drawable;
        this.A02 = 0;
        this.A03 = (this.A03 | 8192) & -16385;
        A0G();
        return this;
    }

    public final TA3 A07(RE3 re3) {
        if (this.A0H) {
            return clone().A07(re3);
        }
        C9217RTu.A00(re3);
        this.A0B = re3;
        this.A03 |= 8;
        A0G();
        return this;
    }

    public final TA3 A08(C13892TjF tjF) {
        if (this.A0H) {
            return clone().A08(tjF);
        }
        C9217RTu.A00(tjF);
        this.A0C = tjF;
        this.A03 |= 1024;
        A0G();
        return this;
    }

    public final TA3 A09(SJ8 sj8, Object obj) {
        if (this.A0H) {
            return clone().A09(sj8, obj);
        }
        C9217RTu.A00(sj8);
        C9217RTu.A00(obj);
        this.A0D.A00.put(sj8, obj);
        A0G();
        return this;
    }

    public final TA3 A0A(C13916TlI tlI, C10977S3l s3l) {
        if (this.A0H) {
            return clone().A0A(tlI, s3l);
        }
        SJ8 sj8 = C10977S3l.A00;
        C9217RTu.A00(s3l);
        A09(sj8, s3l);
        return A0D(tlI, false);
    }

    public final TA3 A0B(C13916TlI tlI, C10977S3l s3l) {
        if (this.A0H) {
            return clone().A0B(tlI, s3l);
        }
        SJ8 sj8 = C10977S3l.A00;
        C9217RTu.A00(s3l);
        A09(sj8, s3l);
        return A0D(tlI, true);
    }

    public final TA3 A0C(C13916TlI tlI, Class cls, boolean z) {
        if (this.A0H) {
            return clone().A0C(tlI, cls, z);
        }
        C9217RTu.A00(cls);
        C9217RTu.A00(tlI);
        this.A0G.put(cls, tlI);
        int i = this.A03 | C249703kE.FLAG_MOVED;
        this.A0L = true;
        int i2 = i | Constants.LOAD_RESULT_PGO_ATTEMPTED;
        this.A03 = i2;
        this.A0K = false;
        if (z) {
            this.A03 = i2 | Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
            this.A0M = true;
        }
        A0G();
        return this;
    }

    public final TA3 A0D(C13916TlI tlI, boolean z) {
        if (this.A0H) {
            return clone().A0D(tlI, z);
        }
        C11879SiC siC = new C11879SiC(tlI, z);
        A0C(tlI, Bitmap.class, z);
        A0C(siC, Drawable.class, z);
        A0C(siC, BitmapDrawable.class, z);
        A0C(new C11878SiB(tlI), Q6Z.class, z);
        A0G();
        return this;
    }

    public final TA3 A0E(C10112Rmo rmo) {
        if (this.A0H) {
            return clone().A0E(rmo);
        }
        C9217RTu.A00(rmo);
        this.A0E = rmo;
        this.A03 |= 4;
        A0G();
        return this;
    }

    public final TA3 A0F(Class cls) {
        if (this.A0H) {
            return clone().A0F(cls);
        }
        C9217RTu.A00(cls);
        this.A0F = cls;
        this.A03 |= 4096;
        A0G();
        return this;
    }

    public final void A0G() {
        if (this.A0J) {
            throw AnonymousClass7TE.A0z("You cannot modify locked T, consider clone()");
        }
    }

    public TA3 A0I(TA3 ta3) {
        if (this.A0H) {
            return clone().A0I(ta3);
        }
        int i = ta3.A03;
        if ((i & 2) != 0) {
            this.A00 = ta3.A00;
        }
        if ((262144 & i) != 0) {
            this.A0P = ta3.A0P;
        }
        if ((1048576 & i) != 0) {
            this.A0O = ta3.A0O;
        }
        if ((i & 4) != 0) {
            this.A0E = ta3.A0E;
        }
        if ((i & 8) != 0) {
            this.A0B = ta3.A0B;
        }
        if (AnonymousClass7TF.A1P(i & 16)) {
            this.A08 = ta3.A08;
            this.A01 = 0;
            this.A03 &= -33;
        }
        if (AnonymousClass7TF.A1P(ta3.A03 & 32)) {
            this.A01 = ta3.A01;
            this.A08 = null;
            this.A03 &= -17;
        }
        if ((ta3.A03 & 64) != 0) {
            this.A0A = ta3.A0A;
            this.A06 = 0;
            this.A03 &= -129;
        }
        if ((ta3.A03 & 128) != 0) {
            this.A06 = ta3.A06;
            this.A0A = null;
            this.A03 &= -65;
        }
        int i2 = ta3.A03;
        if ((256 & i2) != 0) {
            this.A0I = ta3.A0I;
        }
        if ((512 & i2) != 0) {
            this.A05 = ta3.A05;
            this.A04 = ta3.A04;
        }
        if ((1024 & i2) != 0) {
            this.A0C = ta3.A0C;
        }
        if ((4096 & i2) != 0) {
            this.A0F = ta3.A0F;
        }
        if ((i2 & 8192) != 0) {
            this.A09 = ta3.A09;
            this.A02 = 0;
            this.A03 &= -16385;
        }
        if ((ta3.A03 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            this.A02 = ta3.A02;
            this.A09 = null;
            this.A03 &= -8193;
        }
        int i3 = ta3.A03;
        if ((32768 & i3) != 0) {
            this.A07 = ta3.A07;
        }
        if ((65536 & i3) != 0) {
            this.A0L = ta3.A0L;
        }
        if ((131072 & i3) != 0) {
            this.A0M = ta3.A0M;
        }
        if ((i3 & C249703kE.FLAG_MOVED) != 0) {
            this.A0G.putAll(ta3.A0G);
            this.A0K = ta3.A0K;
        }
        if ((ta3.A03 & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0) {
            this.A0N = ta3.A0N;
        }
        if (!this.A0L) {
            this.A0G.clear();
            this.A0M = false;
            this.A03 = this.A03 & -2049 & -131073;
            this.A0K = true;
        }
        this.A03 |= ta3.A03;
        this.A0D.A00.A09(ta3.A0D.A00);
        A0G();
        return this;
    }

    public boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        boolean equals3;
        boolean equals4;
        boolean equals5;
        if (!(obj instanceof TA3)) {
            return false;
        }
        TA3 ta3 = (TA3) obj;
        if (Float.compare(ta3.A00, this.A00) != 0 || this.A01 != ta3.A01) {
            return false;
        }
        Drawable drawable = this.A08;
        Drawable drawable2 = ta3.A08;
        if (drawable == null) {
            equals = DbW.A1a(drawable2);
        } else {
            equals = drawable.equals(drawable2);
        }
        if (!equals || this.A06 != ta3.A06) {
            return false;
        }
        Drawable drawable3 = this.A0A;
        Drawable drawable4 = ta3.A0A;
        if (drawable3 == null) {
            equals2 = DbW.A1a(drawable4);
        } else {
            equals2 = drawable3.equals(drawable4);
        }
        if (!equals2 || this.A02 != ta3.A02) {
            return false;
        }
        Drawable drawable5 = this.A09;
        Drawable drawable6 = ta3.A09;
        if (drawable5 == null) {
            equals3 = DbW.A1a(drawable6);
        } else {
            equals3 = drawable5.equals(drawable6);
        }
        if (!equals3 || this.A0I != ta3.A0I || this.A04 != ta3.A04 || this.A05 != ta3.A05 || this.A0M != ta3.A0M || this.A0L != ta3.A0L || this.A0P != ta3.A0P || this.A0N != ta3.A0N || !this.A0E.equals(ta3.A0E) || this.A0B != ta3.A0B || !this.A0D.equals(ta3.A0D) || !this.A0G.equals(ta3.A0G) || !this.A0F.equals(ta3.A0F)) {
            return false;
        }
        C13892TjF tjF = this.A0C;
        C13892TjF tjF2 = ta3.A0C;
        if (tjF == null) {
            equals4 = DbW.A1a(tjF2);
        } else {
            equals4 = tjF.equals(tjF2);
        }
        if (!equals4) {
            return false;
        }
        Resources.Theme theme = this.A07;
        Resources.Theme theme2 = ta3.A07;
        if (theme == null) {
            equals5 = DbW.A1a(theme2);
        } else {
            equals5 = theme.equals(theme2);
        }
        if (equals5) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int floatToIntBits = ((((((((((((((((((((((((((((((((((((((527 + Float.floatToIntBits(this.A00)) * 31) + this.A01) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + this.A06) * 31) + AnonymousClass7TG.A0C(this.A0A)) * 31) + this.A02) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + (this.A0I ? 1 : 0)) * 31) + this.A04) * 31) + this.A05) * 31) + (this.A0M ? 1 : 0)) * 31) + (this.A0L ? 1 : 0)) * 31) + (this.A0P ? 1 : 0)) * 31) + (this.A0N ? 1 : 0)) * 31) + AnonymousClass7TG.A0C(this.A0E)) * 31) + AnonymousClass7TG.A0C(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A0D)) * 31) + AnonymousClass7TG.A0C(this.A0G)) * 31) + AnonymousClass7TG.A0C(this.A0F)) * 31) + AnonymousClass7TG.A0C(this.A0C);
        return (floatToIntBits * 31) + AnonymousClass7TG.A0C(this.A07);
    }

    /* renamed from: A0H */
    public TA3 clone() {
        try {
            TA3 ta3 = (TA3) super.clone();
            C11856Shi shi = new C11856Shi();
            ta3.A0D = shi;
            shi.A00.A09(this.A0D.A00);
            01r r1 = new 01r(0);
            ta3.A0G = r1;
            r1.putAll(this.A0G);
            ta3.A0J = false;
            ta3.A0H = false;
            return ta3;
        } catch (CloneNotSupportedException e) {
            throw C41845B3m.A0j(e);
        }
    }
}
