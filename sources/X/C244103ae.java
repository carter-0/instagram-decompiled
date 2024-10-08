package X;

import android.graphics.Typeface;
import android.text.TextUtils;
import java.util.BitSet;

/* renamed from: X.3ae  reason: invalid class name and case insensitive filesystem */
public final class C244103ae extends C244113af {
    public 2V1 A00;
    public 2WW A01;
    public final BitSet A02;
    public final String[] A03 = {"text"};

    public final void A0C() {
        this.A01.A07 = 0;
    }

    public final 2WW A0A() {
        C244113af.A00(this.A02, this.A03, 1);
        2WW r3 = this.A01;
        2V5[] r2 = new 2V5[1];
        r3.A0Z = r2;
        r2[0] = r3.A0Q;
        A02();
        return r3;
    }

    public final void A0B() {
        A0W(AnonymousClass05K.A0C);
    }

    public final void A0D() {
        A0T(TextUtils.TruncateAt.END);
    }

    public final void A0G() {
        A0L(1.0f);
    }

    public final void A0H(float f) {
        this.A01.A02 = f;
    }

    public final void A0I(float f) {
        this.A01.A03 = f;
    }

    public final void A0J(float f) {
        this.A01.A04 = f;
    }

    public final void A0K(float f) {
        this.A01.A05 = f;
    }

    public final void A0L(float f) {
        this.A01.A06 = f;
    }

    public final void A0M(int i) {
        this.A01.A0D = i;
    }

    public final void A0N(int i) {
        this.A01.A0G = i;
    }

    public final void A0O(int i) {
        this.A01.A0J = i;
    }

    public final void A0P(int i) {
        this.A01.A0K = i;
    }

    public final void A0Q(int i) {
        this.A01.A0L = i;
    }

    public final void A0R(int i) {
        this.A01.A0M = i;
    }

    public final void A0S(Typeface typeface) {
        this.A01.A0O = typeface;
    }

    public final void A0T(TextUtils.TruncateAt truncateAt) {
        this.A01.A0P = truncateAt;
    }

    public final void A0U(2V5 r2) {
        this.A01.A0Q = r2;
    }

    public final void A0V(CharSequence charSequence) {
        this.A01.A0S = charSequence;
        this.A02.set(0);
    }

    public final void A0W(Integer num) {
        this.A01.A0T = num;
    }

    public final void A0X(Integer num) {
        this.A01.A0U = num;
    }

    public final void A0Y(boolean z) {
        this.A01.A0V = z;
    }

    public final void A0Z(boolean z) {
        this.A01.A0W = z;
    }

    public final void A0a(boolean z) {
        this.A01.A0X = z;
    }

    public final void A0b(boolean z) {
        this.A01.A0Y = z;
    }

    public C244103ae(2V1 r3, 2WW r4, int i) {
        super(r4, r3, i);
        BitSet bitSet = new BitSet(1);
        this.A02 = bitSet;
        this.A01 = r4;
        this.A00 = r3;
        bitSet.clear();
    }

    public final void A0E() {
        A0M(Integer.MAX_VALUE);
    }

    public final void A0F() {
        A0O(-7829368);
    }
}
