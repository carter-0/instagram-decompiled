package X;

import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.UKr  reason: case insensitive filesystem */
public final class C15038UKr extends AnonymousClass0T0 {
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public float A02 = 1.0f;
    public float A03 = 1.0f;
    public float A04 = 1.0f;
    public int A05;
    public RectF A06 = null;
    public RectF A07 = null;
    public RectF A08 = null;
    public final Rect A09;
    public final VZS A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15038UKr) {
                C15038UKr uKr = (C15038UKr) obj;
                if (!(0qQ.A0K(this.A09, uKr.A09) && 0qQ.A0K(this.A0A, uKr.A0A) && this.A05 == uKr.A05 && Float.compare(this.A03, uKr.A03) == 0 && Float.compare(this.A04, uKr.A04) == 0 && Float.compare(this.A02, uKr.A02) == 0 && Float.compare(this.A01, uKr.A01) == 0 && Float.compare(this.A00, uKr.A00) == 0 && 0qQ.A0K(this.A08, uKr.A08) && 0qQ.A0K(this.A06, uKr.A06) && 0qQ.A0K(this.A07, uKr.A07))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C15038UKr(Rect rect, VZS vzs, int i) {
        this.A09 = rect;
        this.A0A = vzs;
        this.A05 = i;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00((AnonymousClass7TF.A07(this.A0A, AnonymousClass7TE.A0K(this.A09)) + this.A05) * 31, this.A03), this.A04), this.A02), this.A01), this.A00) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TE.A0L(this.A07);
    }
}
