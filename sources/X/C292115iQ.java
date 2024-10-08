package X;

import android.os.Build;
import android.text.StaticLayout;

/* renamed from: X.5iQ  reason: invalid class name and case insensitive filesystem */
public final class C292115iQ implements C292125iR {
    public final boolean CT6(StaticLayout staticLayout, boolean z) {
        if (Build.VERSION.SDK_INT >= 33) {
            return C292145iT.A01(staticLayout);
        }
        return true;
    }

    public final StaticLayout AKs(C292135iS r6) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(r6.A0D, 0, r6.A02, r6.A0B, r6.A08);
        obtain.setTextDirection(r6.A0A);
        obtain.setAlignment(r6.A09);
        obtain.setMaxLines(r6.A07);
        obtain.setEllipsize(r6.A0C);
        obtain.setEllipsizedWidth(r6.A01);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(false);
        obtain.setBreakStrategy(r6.A00);
        obtain.setHyphenationFrequency(r6.A03);
        obtain.setIndents((int[]) null, (int[]) null);
        obtain.setJustificationMode(r6.A04);
        obtain.setUseLineSpacingFromFallbacks(true);
        if (Build.VERSION.SDK_INT >= 33) {
            C292145iT.A00(obtain, r6.A05, r6.A06);
        }
        return obtain.build();
    }
}
