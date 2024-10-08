package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import ca.psiphon.PsiphonTunnel;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Ukh  reason: case insensitive filesystem */
public final class C15917Ukh extends AnonymousClass91c {
    public int A00;
    public int A01;
    public final ArrayList A02 = new ArrayList();
    public final ArrayList A03 = new ArrayList();
    public final ArrayList A04 = new ArrayList();
    public final ArrayList A05 = new ArrayList();
    public final C360728f3 A06 = C360728f3.TYPEWRITER_NO_CURSOR;

    public final void A0Z(Canvas canvas, Spannable spannable, TextPaint textPaint, 0rN r24, float f, float f2, int i) {
        int A0W;
        int min;
        int A022;
        Canvas canvas2 = canvas;
        boolean A1U = AnonymousClass7TF.A1U(0, canvas2, textPaint);
        Spannable spannable2 = spannable;
        C51972G9s.A1C(spannable2, r24);
        StaticLayout staticLayout = this.A0G;
        if (spannable2.length() != 0) {
            ArrayList arrayList = this.A02;
            if (!arrayList.isEmpty() && staticLayout != null) {
                canvas2.save();
                int i2 = this.A0A;
                canvas2.translate(C13988Tno.A01(i2 - i2), 0.0f);
                int A0W2 = i % A0W();
                int A0W3 = A0W();
                if (this.A00 <= 0) {
                    A0W = 0;
                } else {
                    A0W = (PsiphonTunnel.VPN_INTERFACE_MTU * A0W()) / this.A00;
                }
                int i3 = A0W3 - A0W;
                if (i3 <= 0) {
                    min = 0;
                } else {
                    min = (int) ((((float) Math.min(A0W2, i3)) / ((float) i3)) * ((float) this.A01));
                }
                int A0W4 = i % A0W();
                float A0W5 = (float) (A0W() - 200);
                float A0W6 = ((float) A0W()) * 0.2f;
                if (A0W6 > 1000.0f) {
                    A0W6 = 1000.0f;
                }
                float max = Math.max(A0W5 - A0W6, 0.0f);
                float f3 = (float) A0W4;
                float f4 = max - 250.0f;
                if (f3 < f4) {
                    A022 = 255;
                } else {
                    A022 = (int) 0mi.A02(f3, f4, max, 255.0f, 0.0f);
                }
                ArrayList arrayList2 = this.A05;
                if (DbT.A1b(arrayList2)) {
                    BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                    C13988Tno.A1P(spannable2, characterInstance);
                    int next = characterInstance.next(min);
                    Iterator A1G = AnonymousClass7TE.A1G(arrayList2);
                    while (A1G.hasNext()) {
                        C19714WeG weG = (C19714WeG) AnonymousClass7TF.A0a(A1G);
                        C19714WeG.A01(weG, this, AnonymousClass7TE.A1I(C18698Vww.A02(staticLayout, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, spannable2.getSpanStart(weG), Math.min(spannable2.getSpanEnd(weG), next))), A1U);
                        weG.A02(canvas2, Integer.valueOf(A022));
                    }
                }
                Iterator A1G2 = AnonymousClass7TE.A1G(this.A04);
                while (A1G2.hasNext()) {
                    ((AnonymousClass91R) AnonymousClass7TF.A0a(A1G2)).A04 = false;
                }
                BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                C13988Tno.A1P(staticLayout.getText(), characterInstance2);
                int lineForOffset = staticLayout.getLineForOffset(characterInstance2.next(min));
                if (min <= arrayList.size()) {
                    ArrayList arrayList3 = this.A03;
                    W10.A01(canvas2, (Paint) null, (C17944ViZ) DbZ.A0g(arrayList, Math.max(min - (A1U ? 1 : 0), 0)), Integer.valueOf(A022), arrayList3, 0.0f, 0.0f, lineForOffset);
                }
                canvas2.restore();
            }
        }
    }

    public final void A0R() {
        super.A0R();
        StaticLayout staticLayout = this.A0G;
        if (staticLayout != null) {
            ArrayList arrayList = this.A02;
            arrayList.clear();
            ArrayList arrayList2 = this.A03;
            arrayList2.clear();
            ArrayList arrayList3 = this.A05;
            arrayList3.clear();
            ArrayList arrayList4 = this.A04;
            arrayList4.clear();
            this.A00 = 0;
            Spannable spannable = this.A0F;
            if (spannable != null && spannable.length() != 0) {
                int A002 = 0mp.A00(this.A0F.toString());
                this.A01 = A002;
                this.A00 = ((int) (((float) A002) * 75.0f)) + PsiphonTunnel.VPN_INTERFACE_MTU;
                Spannable spannable2 = this.A0F;
                0qQ.A07(spannable2);
                C13990Tnq.A0t(spannable2, this, C19714WeG.class, arrayList3, arrayList4);
                int lineCount = staticLayout.getLineCount();
                for (int i = 0; i < lineCount; i++) {
                    Spannable spannable3 = this.A0F;
                    0qQ.A07(spannable3);
                    int lineEnd = staticLayout.getLineEnd(i);
                    TextPaint textPaint = this.A0b;
                    0qQ.A07(textPaint);
                    0rN A08 = A08();
                    Layout.Alignment alignment = this.A0E;
                    0qQ.A07(alignment);
                    arrayList2.add(new C17944ViZ(alignment, spannable3, textPaint, A08, 0.0f, 0.0f, staticLayout.getLineLeft(i), staticLayout.getLineRight(i), (float) staticLayout.getLineBaseline(i), 0, lineEnd, i));
                }
                Spannable spannable4 = this.A0F;
                0qQ.A07(spannable4);
                TextPaint textPaint2 = this.A0b;
                0qQ.A07(textPaint2);
                0rN A082 = A08();
                Layout.Alignment alignment2 = this.A0E;
                0qQ.A07(alignment2);
                arrayList.addAll(W10.A00(alignment2, staticLayout, spannable4, textPaint2, A082));
            }
        }
    }

    public final C360728f3 A0X() {
        return this.A06;
    }

    public final void A0Y() {
        StaticLayout staticLayout = this.A0G;
        if (staticLayout != null) {
            Iterator A1G = AnonymousClass7TE.A1G(this.A05);
            while (A1G.hasNext()) {
                C19714WeG.A00(staticLayout, this, AnonymousClass7TF.A0a(A1G));
            }
        }
    }

    public final int getDurationInMs() {
        return this.A00;
    }

    public C15917Ukh(Context context, int i) {
        super(context, i);
    }
}
