package X;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* renamed from: X.4RP  reason: invalid class name */
public final class AnonymousClass4RP {
    public static final AnonymousClass4RP A0V = new AnonymousClass4RP(new Object());
    public final Uri A00;
    public final Uri A01;
    public final Bundle A02;
    public final Boolean A03;
    public final CharSequence A04;
    public final CharSequence A05;
    public final CharSequence A06;
    public final CharSequence A07;
    public final CharSequence A08;
    public final CharSequence A09;
    public final CharSequence A0A;
    public final CharSequence A0B;
    public final CharSequence A0C;
    public final CharSequence A0D;
    public final CharSequence A0E;
    public final CharSequence A0F;
    public final CharSequence A0G;
    public final Integer A0H;
    public final Integer A0I;
    public final Integer A0J;
    public final Integer A0K;
    public final Integer A0L;
    public final Integer A0M;
    public final Integer A0N;
    public final Integer A0O;
    public final Integer A0P;
    public final Integer A0Q;
    public final Integer A0R;
    public final Integer A0S;
    @Deprecated
    public final Integer A0T;
    public final byte[] A0U;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass4RP r5 = (AnonymousClass4RP) obj;
            if (!Util.A0I(this.A0F, r5.A0F) || !Util.A0I(this.A06, r5.A06) || !Util.A0I(this.A05, r5.A05) || !Util.A0I(this.A04, r5.A04) || !Util.A0I(this.A0B, r5.A0B) || !Util.A0I(this.A0E, r5.A0E) || !Util.A0I(this.A0A, r5.A0A) || !Util.A0I(this.A01, r5.A01) || !Arrays.equals(this.A0U, r5.A0U) || !Util.A0I(this.A0H, r5.A0H) || !Util.A0I(this.A00, r5.A00) || !Util.A0I(this.A0S, r5.A0S) || !Util.A0I(this.A0R, r5.A0R) || !Util.A0I(this.A0J, r5.A0J) || !Util.A0I(this.A03, r5.A03) || !Util.A0I(this.A0M, r5.A0M) || !Util.A0I(this.A0L, r5.A0L) || !Util.A0I(this.A0K, r5.A0K) || !Util.A0I(this.A0P, r5.A0P) || !Util.A0I(this.A0O, r5.A0O) || !Util.A0I(this.A0N, r5.A0N) || !Util.A0I(this.A0G, r5.A0G) || !Util.A0I(this.A08, r5.A08) || !Util.A0I(this.A09, r5.A09) || !Util.A0I(this.A0I, r5.A0I) || !Util.A0I(this.A0Q, r5.A0Q) || !Util.A0I(this.A0C, r5.A0C) || !Util.A0I(this.A07, r5.A07) || !Util.A0I(this.A0D, r5.A0D)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[31];
        CharSequence charSequence = this.A0F;
        Integer num = this.A0S;
        Integer num2 = num;
        CharSequence charSequence2 = charSequence;
        System.arraycopy(new Object[]{charSequence2, this.A06, this.A05, this.A04, this.A0B, this.A0E, this.A0A, this.A01, null, null, Integer.valueOf(Arrays.hashCode(this.A0U)), this.A0H, this.A00, num2, this.A0R, this.A0J, this.A03, this.A0M, this.A0L, this.A0K, this.A0P, this.A0O, this.A0N, this.A0G, this.A08, this.A09, this.A0I}, 0, objArr, 0, 27);
        System.arraycopy(new Object[]{this.A0Q, this.A0C, this.A07, this.A0D}, 0, objArr, 27, 4);
        return Arrays.hashCode(objArr);
    }

    public AnonymousClass4RP(AnonymousClass4RQ r2) {
        this.A0F = r2.A0F;
        this.A06 = r2.A06;
        this.A05 = r2.A05;
        this.A04 = r2.A04;
        this.A0B = r2.A0B;
        this.A0E = r2.A0E;
        this.A0A = r2.A0A;
        this.A01 = r2.A01;
        this.A0U = r2.A0T;
        this.A0H = r2.A0H;
        this.A00 = r2.A00;
        this.A0S = r2.A0S;
        this.A0R = r2.A0R;
        this.A0J = r2.A0J;
        this.A03 = r2.A03;
        Integer num = r2.A0M;
        this.A0T = num;
        this.A0M = num;
        this.A0L = r2.A0L;
        this.A0K = r2.A0K;
        this.A0P = r2.A0P;
        this.A0O = r2.A0O;
        this.A0N = r2.A0N;
        this.A0G = r2.A0G;
        this.A08 = r2.A08;
        this.A09 = r2.A09;
        this.A0I = r2.A0I;
        this.A0Q = r2.A0Q;
        this.A0C = r2.A0C;
        this.A07 = r2.A07;
        this.A0D = r2.A0D;
        this.A02 = r2.A02;
    }
}
