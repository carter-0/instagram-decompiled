package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import ca.psiphon.PsiphonTunnel;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Ukj  reason: case insensitive filesystem */
public final class C15919Ukj extends AnonymousClass91c {
    public static float A09 = 0.2f;
    public static float A0A;
    public int A00;
    public int A01;
    public int A02 = Color.alpha(-1);
    public final ArrayList A03 = new ArrayList();
    public final ArrayList A04 = new ArrayList();
    public final ArrayList A05 = new ArrayList();
    public final ArrayList A06 = new ArrayList();
    public final Paint A07;
    public final C360728f3 A08 = C360728f3.TYPEWRITER;

    public final void A0Z(Canvas canvas, Spannable spannable, TextPaint textPaint, 0rN r27, float f, float f2, int i) {
        int A0W;
        int min;
        float f3;
        int A0W2;
        Canvas canvas2 = canvas;
        boolean A1U = AnonymousClass7TF.A1U(0, canvas2, textPaint);
        Spannable spannable2 = spannable;
        C51972G9s.A1C(spannable2, r27);
        StaticLayout staticLayout = this.A0G;
        if (spannable2.length() != 0) {
            ArrayList arrayList = this.A03;
            if (!arrayList.isEmpty() && staticLayout != null) {
                canvas2.save();
                int i2 = this.A0A;
                canvas2.translate(((float) (i2 - i2)) / 2.0f, 0.0f);
                int A0W3 = i % A0W();
                int A0W4 = A0W();
                if (this.A00 <= 0) {
                    A0W = 0;
                } else {
                    A0W = (PsiphonTunnel.VPN_INTERFACE_MTU * A0W()) / this.A00;
                }
                int i3 = A0W4 - A0W;
                if (i3 <= 0) {
                    min = 0;
                } else {
                    min = (int) ((((float) Math.min(A0W3, i3)) / ((float) i3)) * ((float) this.A01));
                }
                ArrayList arrayList2 = this.A06;
                if (DbT.A1b(arrayList2)) {
                    BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                    C13988Tno.A1P(spannable2, characterInstance);
                    int next = characterInstance.next(min);
                    Iterator A1G = AnonymousClass7TE.A1G(arrayList2);
                    while (A1G.hasNext()) {
                        C19710WeC weC = (C19710WeC) AnonymousClass7TF.A0a(A1G);
                        weC.A02 = C13988Tno.A0i(VIL.A00(staticLayout, this.A0b.getTextSize(), spannable2.getSpanStart(weC), Math.min(spannable2.getSpanEnd(weC), next)));
                        weC.onPreDraw();
                        weC.AQG(canvas2);
                    }
                }
                Iterator A1G2 = AnonymousClass7TE.A1G(this.A05);
                while (A1G2.hasNext()) {
                    ((AnonymousClass91R) AnonymousClass7TF.A0a(A1G2)).A04 = false;
                }
                Paint paint = this.A07;
                float f4 = (float) this.A02;
                if (this.A00 <= 0 || (A0W2 = (IgNetworkConsentStorage.MAX_ENTRIES * A0W()) / this.A00) <= 0) {
                    f3 = 0.0f;
                } else {
                    int i4 = i % A0W2;
                    float f5 = ((float) A0W2) / 2.0f;
                    float f6 = (float) i4;
                    if (f6 >= f5) {
                        f6 = (float) (A0W2 - i4);
                    }
                    f3 = f6 / f5;
                }
                C13988Tno.A0o(f4, f3, paint);
                BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                C13988Tno.A1P(staticLayout.getText(), characterInstance2);
                int lineForOffset = staticLayout.getLineForOffset(characterInstance2.next(min));
                if (min <= arrayList.size()) {
                    Paint paint2 = paint;
                    C17944ViZ viZ = (C17944ViZ) DbZ.A0g(arrayList, Math.max(min - (A1U ? 1 : 0), 0));
                    W10.A01(canvas2, paint2, viZ, (Integer) null, this.A04, A0A, A09, lineForOffset);
                }
                canvas2.restore();
            }
        }
    }

    public final void A0R() {
        super.A0R();
        ArrayList arrayList = this.A03;
        arrayList.clear();
        ArrayList arrayList2 = this.A04;
        arrayList2.clear();
        ArrayList arrayList3 = this.A06;
        arrayList3.clear();
        ArrayList arrayList4 = this.A05;
        arrayList4.clear();
        TextPaint textPaint = this.A0b;
        A09 = textPaint.measureText(" ") * 0.2f;
        this.A00 = 0;
        StaticLayout staticLayout = this.A0G;
        Spannable spannable = this.A0F;
        if (spannable != null && spannable.length() != 0 && staticLayout != null) {
            int A002 = 0mp.A00(this.A0F.toString());
            this.A01 = A002;
            this.A00 = ((int) (((float) A002) * 75.0f)) + PsiphonTunnel.VPN_INTERFACE_MTU;
            Spannable spannable2 = this.A0F;
            0qQ.A07(spannable2);
            C358848bZ r0 = (C358848bZ) C263324Kh.A00(spannable2, C358848bZ.class);
            if (r0 != null) {
                Paint paint = this.A07;
                int i = r0.A05;
                paint.setColor(i);
                this.A02 = Color.alpha(i);
            }
            Spannable spannable3 = this.A0F;
            0qQ.A07(spannable3);
            C13990Tnq.A0t(spannable3, this, C19710WeC.class, arrayList3, arrayList4);
            int lineCount = staticLayout.getLineCount();
            for (int i2 = 0; i2 < lineCount; i2++) {
                Spannable spannable4 = this.A0F;
                0qQ.A07(spannable4);
                int lineEnd = staticLayout.getLineEnd(i2);
                0rN A082 = A08();
                Layout.Alignment alignment = this.A0E;
                0qQ.A07(alignment);
                arrayList2.add(new C17944ViZ(alignment, spannable4, textPaint, A082, 0.0f, 0.0f, staticLayout.getLineLeft(i2), staticLayout.getLineRight(i2), (float) staticLayout.getLineBaseline(i2), 0, lineEnd, i2));
            }
            Spannable spannable5 = this.A0F;
            0qQ.A07(spannable5);
            0rN A083 = A08();
            Layout.Alignment alignment2 = this.A0E;
            0qQ.A07(alignment2);
            arrayList.addAll(W10.A00(alignment2, staticLayout, spannable5, textPaint, A083));
        }
    }

    public final float A0U() {
        return A09 + A0A;
    }

    public final C360728f3 A0X() {
        return this.A08;
    }

    public final void A0Y() {
        StaticLayout staticLayout = this.A0G;
        if (staticLayout != null) {
            Iterator A1G = AnonymousClass7TE.A1G(this.A06);
            while (A1G.hasNext()) {
                C19710WeC weC = (C19710WeC) AnonymousClass7TF.A0a(A1G);
                weC.A02 = C13988Tno.A0i(VIL.A00(staticLayout, this.A0b.getTextSize(), this.A0F.getSpanStart(weC), this.A0F.getSpanEnd(weC)));
            }
        }
    }

    public final int getDurationInMs() {
        return this.A00;
    }

    public C15919Ukj(Context context, int i) {
        super(context, i);
        Paint paint = new Paint();
        this.A07 = paint;
        paint.setColor(0);
    }

    public final void A0A(float f) {
        super.A0A(f);
        A0A = f / 2.1818182f;
    }
}
