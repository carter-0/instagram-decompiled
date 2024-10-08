package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Ukg  reason: case insensitive filesystem */
public final class C15916Ukg extends AnonymousClass91c {
    public float A00;
    public int A01 = Color.alpha(-1);
    public int A02;
    public int A03;
    public final Paint A04 = new Paint();
    public final ArrayList A05 = new ArrayList();
    public final C360728f3 A06 = C360728f3.LITERATURE;
    public final ArrayList A07 = new ArrayList();
    public final ArrayList A08 = new ArrayList();
    public final ArrayList A09 = new ArrayList();
    public final ArrayList A0A = new ArrayList();

    public final void A0Z(Canvas canvas, Spannable spannable, TextPaint textPaint, 0rN r24, float f, float f2, int i) {
        int i2;
        Canvas canvas2 = canvas;
        boolean A1U = AnonymousClass7TF.A1U(0, canvas2, textPaint);
        Spannable spannable2 = spannable;
        C51972G9s.A1C(spannable2, r24);
        StaticLayout staticLayout = this.A0G;
        if (spannable2.length() != 0) {
            ArrayList arrayList = this.A07;
            if (!arrayList.isEmpty() && staticLayout != null) {
                Iterator A1G = AnonymousClass7TE.A1G(this.A0A);
                while (A1G.hasNext()) {
                    C19711WeD weD = (C19711WeD) AnonymousClass7TF.A0a(A1G);
                    weD.onPreDraw();
                    weD.AQG(canvas2);
                }
                Iterator A1G2 = AnonymousClass7TE.A1G(this.A09);
                while (A1G2.hasNext()) {
                    ((AnonymousClass91R) AnonymousClass7TF.A0a(A1G2)).A04 = false;
                }
                Paint paint = this.A04;
                float f3 = (float) this.A01;
                int i3 = i;
                int i4 = i % IgNetworkConsentStorage.MAX_ENTRIES;
                float f4 = 1000.0f / 2.0f;
                float f5 = (float) i4;
                if (f5 >= f4) {
                    f5 = (float) (IgNetworkConsentStorage.MAX_ENTRIES - i4);
                }
                C13988Tno.A0o(f3, f5 / f4, paint);
                ArrayList arrayList2 = this.A05;
                Iterator A1G3 = AnonymousClass7TE.A1G(arrayList2);
                while (true) {
                    if (!A1G3.hasNext()) {
                        i2 = this.A02;
                        break;
                    }
                    int A0M = AnonymousClass7TE.A0M(AnonymousClass7TF.A0a(A1G3));
                    if (i3 <= A0M) {
                        i2 = arrayList2.indexOf(Integer.valueOf(A0M));
                        break;
                    }
                }
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                C13988Tno.A1P(staticLayout.getText(), characterInstance);
                int lineForOffset = staticLayout.getLineForOffset(characterInstance.next(i2));
                W10.A01(canvas2, paint, (C17944ViZ) DbZ.A0g(arrayList, Math.max(i2 - (A1U ? 1 : 0), 0)), (Integer) null, this.A08, this.A00, 0.0f, lineForOffset);
            }
        }
    }

    public final void A0R() {
        super.A0R();
        StaticLayout staticLayout = this.A0G;
        if (staticLayout != null) {
            ArrayList arrayList = this.A08;
            arrayList.clear();
            ArrayList arrayList2 = this.A07;
            arrayList2.clear();
            ArrayList arrayList3 = this.A05;
            arrayList3.clear();
            ArrayList arrayList4 = this.A0A;
            arrayList4.clear();
            ArrayList arrayList5 = this.A09;
            arrayList5.clear();
            if (!TextUtils.isEmpty(this.A0F)) {
                int A002 = 0mp.A00(this.A0F.toString());
                this.A02 = A002;
                this.A03 = (int) (((float) A002) * 400.0f);
                int A0W = A0W();
                if (A0W > 0) {
                    this.A03 = A0W;
                }
                Spannable spannable = this.A0F;
                0qQ.A07(spannable);
                C358848bZ r0 = (C358848bZ) C263324Kh.A00(spannable, C358848bZ.class);
                if (r0 != null) {
                    int i = r0.A05;
                    Integer valueOf = Integer.valueOf(i);
                    int alpha = Color.alpha(i);
                    Integer valueOf2 = Integer.valueOf(alpha);
                    if (valueOf != null) {
                        this.A04.setColor(i);
                    }
                    if (valueOf2 != null) {
                        this.A01 = alpha;
                    }
                }
                int i2 = this.A02;
                for (int i3 = 0; i3 < i2; i3++) {
                    AnonymousClass7TF.A1M(arrayList3, 2SP.A01.A05(this.A03 / 2));
                }
                01V.A1C(arrayList3);
                Spannable spannable2 = this.A0F;
                0qQ.A07(spannable2);
                C13990Tnq.A0t(spannable2, this, C19711WeD.class, arrayList4, arrayList5);
                int lineCount = staticLayout.getLineCount();
                for (int i4 = 0; i4 < lineCount; i4++) {
                    Spannable spannable3 = this.A0F;
                    0qQ.A07(spannable3);
                    int lineEnd = staticLayout.getLineEnd(i4);
                    TextPaint textPaint = this.A0b;
                    0qQ.A07(textPaint);
                    0rN A082 = A08();
                    Layout.Alignment alignment = this.A0E;
                    0qQ.A07(alignment);
                    arrayList.add(new C17944ViZ(alignment, spannable3, textPaint, A082, 0.0f, 0.0f, staticLayout.getLineLeft(i4), staticLayout.getLineRight(i4), (float) staticLayout.getLineBaseline(i4), 0, lineEnd, i4));
                }
                Spannable spannable4 = this.A0F;
                0qQ.A07(spannable4);
                TextPaint textPaint2 = this.A0b;
                0qQ.A07(textPaint2);
                0rN A083 = A08();
                Layout.Alignment alignment2 = this.A0E;
                0qQ.A07(alignment2);
                arrayList2.addAll(W10.A00(alignment2, staticLayout, spannable4, textPaint2, A083));
            }
        }
    }

    public final C360728f3 A0X() {
        return this.A06;
    }

    public final int getDurationInMs() {
        return this.A03;
    }

    public C15916Ukg(Context context, int i) {
        super(context, i);
        int alpha = Color.alpha(-1);
        Integer valueOf = Integer.valueOf(alpha);
        this.A04.setColor(0);
        if (valueOf != null) {
            this.A01 = alpha;
        }
        this.A00 = 2.0f;
    }
}
