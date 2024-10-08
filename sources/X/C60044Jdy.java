package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.instagram.android.R;
import com.instagram.arlink.model.ArLinkCandidate;
import com.instagram.arlink.model.ArLinkTextBox;
import java.util.List;
import java.util.Set;

/* renamed from: X.Jdy  reason: case insensitive filesystem */
public final class C60044Jdy extends View {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Paint A05;
    public Paint A06;
    public Paint A07;
    public String A08;
    public float A09 = 1.0f;
    public float A0A = 1.0f;
    public final Point A0B = new Point();
    public final Rect A0C = AnonymousClass7TE.A0W();
    public final RectF A0D = AnonymousClass7TE.A0Y();
    public final Object A0E = new Object();
    public final Set A0F = AnonymousClass7TE.A1F();
    public final RectF A0G = AnonymousClass7TE.A0Y();
    public final List A0H = AnonymousClass7TE.A1C();

    private RectF A00(Point point, RectF rectF) {
        RectF rectF2 = this.A0G;
        rectF2.set(AnonymousClass7TE.A02(this) - ((rectF.centerY() + (((float) point.y) / 2.0f)) * this.A09), (rectF.centerX() - (((float) point.x) / 2.0f)) * this.A0A, AnonymousClass7TE.A02(this) - ((rectF.centerY() - (((float) point.y) / 2.0f)) * this.A09), (rectF.centerX() + (((float) point.x) / 2.0f)) * this.A0A);
        return rectF2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (r1 > 3) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCandidates(java.util.List r7) {
        /*
            r6 = this;
            java.lang.Object r2 = r6.A0E
            monitor-enter(r2)
            java.util.List r4 = r6.A0H     // Catch:{ all -> 0x0086 }
            r4.clear()     // Catch:{ all -> 0x0086 }
            java.util.Iterator r3 = r7.iterator()     // Catch:{ all -> 0x0086 }
        L_0x000c:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0086 }
            r5 = 1065017672(0x3f7ae148, float:0.98)
            if (r0 == 0) goto L_0x002d
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x0086 }
            com.instagram.arlink.model.ArLinkCandidate r1 = (com.instagram.arlink.model.ArLinkCandidate) r1     // Catch:{ all -> 0x0086 }
            float r0 = r1.mConfidenceScore     // Catch:{ all -> 0x0086 }
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x000c
            java.util.List r0 = r1.mTextBoxes     // Catch:{ all -> 0x0086 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0086 }
            if (r0 != 0) goto L_0x000c
            r4.add(r1)     // Catch:{ all -> 0x0086 }
            goto L_0x000c
        L_0x002d:
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x0086 }
            r3 = 0
            if (r0 == 0) goto L_0x003d
            int r1 = r6.A01     // Catch:{ all -> 0x0086 }
            int r0 = r1 + 1
            r6.A01 = r0     // Catch:{ all -> 0x0086 }
            r0 = 3
            if (r1 <= r0) goto L_0x0044
        L_0x003d:
            r6.A01 = r3     // Catch:{ all -> 0x0086 }
            java.util.Set r0 = r6.A0F     // Catch:{ all -> 0x0086 }
            r0.clear()     // Catch:{ all -> 0x0086 }
        L_0x0044:
            java.util.Set r0 = r6.A0F     // Catch:{ all -> 0x0086 }
            r0.addAll(r4)     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = r6.A08     // Catch:{ all -> 0x0086 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x0073
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x0073
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x0086 }
            if (r0 != 0) goto L_0x0073
            java.lang.Object r0 = r7.get(r3)     // Catch:{ all -> 0x0086 }
            com.instagram.arlink.model.ArLinkCandidate r0 = (com.instagram.arlink.model.ArLinkCandidate) r0     // Catch:{ all -> 0x0086 }
            float r1 = r0.mConfidenceScore     // Catch:{ all -> 0x0086 }
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0073
            java.lang.String r0 = "Low detection score: "
            java.lang.String r0 = X.002.A0N(r0, r1)     // Catch:{ all -> 0x0086 }
            r6.A08 = r0     // Catch:{ all -> 0x0086 }
            r6.A02 = r3     // Catch:{ all -> 0x0086 }
        L_0x0073:
            int r1 = r6.A02     // Catch:{ all -> 0x0086 }
            int r0 = r1 + 1
            r6.A02 = r0     // Catch:{ all -> 0x0086 }
            r0 = 5
            if (r1 <= r0) goto L_0x0081
            r6.A02 = r3     // Catch:{ all -> 0x0086 }
            r0 = 0
            r6.A08 = r0     // Catch:{ all -> 0x0086 }
        L_0x0081:
            monitor-exit(r2)     // Catch:{ all -> 0x0086 }
            r6.postInvalidate()
            return
        L_0x0086:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0086 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60044Jdy.setCandidates(java.util.List):void");
    }

    public void setMessage(String str) {
        synchronized (this.A0E) {
            this.A08 = str;
            this.A02 = 0;
        }
        postInvalidate();
    }

    public C60044Jdy(Context context) {
        super(context);
        Paint A0C2 = JTO.A0C();
        this.A05 = A0C2;
        A0C2.setColor(-1);
        JTO.A1N(this.A05);
        this.A05.setStrokeWidth(4.0f);
        this.A00 = 0nA.A04(getContext(), 60);
        Resources resources = getResources();
        float applyDimension = TypedValue.applyDimension(0, AnonymousClass7TE.A01(resources, R.dimen.auth_title_text_size), resources.getDisplayMetrics());
        Paint A0C3 = JTO.A0C();
        this.A07 = A0C3;
        A0C3.setColor(-1);
        this.A07.setTextSize(applyDimension);
        this.A07.setTextAlign(Paint.Align.RIGHT);
        Paint A0C4 = JTO.A0C();
        this.A06 = A0C4;
        A0C4.setColor(1308622847);
        AnonymousClass7TE.A1Q(this.A06);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        synchronized (this.A0E) {
            for (ArLinkCandidate arLinkCandidate : this.A0F) {
                float rotationDegree = arLinkCandidate.getRotationDegree();
                RectF rectF = arLinkCandidate.mIconRect;
                double radians = Math.toRadians((double) rotationDegree);
                Point point = this.A0B;
                int width = (int) (((double) ((rectF.width() + rectF.height()) * 0.5f)) / (Math.abs(Math.sin(radians)) + Math.abs(Math.cos(radians))));
                point.x = width;
                point.y = width;
                RectF A002 = A00(point, arLinkCandidate.mIconRect);
                canvas.save();
                float f = -rotationDegree;
                canvas.rotate(f, A002.centerX(), A002.centerY());
                Paint paint = this.A05;
                canvas.drawRoundRect(A002, 10.0f, 10.0f, paint);
                canvas.restore();
                for (ArLinkTextBox arLinkTextBox : arLinkCandidate.mTextBoxes) {
                    RectF A003 = A00(arLinkTextBox.mSize, arLinkTextBox.mTextRect);
                    canvas.save();
                    canvas.rotate(f, A003.centerX(), A003.centerY());
                    canvas.drawRoundRect(A003, 10.0f, 10.0f, paint);
                    canvas.restore();
                }
            }
            if (!TextUtils.isEmpty(this.A08)) {
                Paint paint2 = this.A07;
                String str = this.A08;
                int length = str.length();
                Rect rect = this.A0C;
                paint2.getTextBounds(str, 0, length, rect);
                RectF rectF2 = this.A0D;
                float f2 = this.A00;
                rectF2.set(((float) (canvas.getWidth() - rect.width())) / 2.0f, f2, ((float) (canvas.getWidth() + rect.width())) / 2.0f, ((float) rect.height()) + f2);
                rectF2.inset(-20.0f, -20.0f);
                canvas.drawRoundRect(rectF2, 10.0f, 10.0f, this.A06);
                canvas.drawText(this.A08, rectF2.right - 20.0f, rectF2.top + ((float) rect.height()) + 20.0f, paint2);
            }
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int A062 = AnonymousClass0fD.A06(1483202377);
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0 && (i5 = this.A04) > 0 && (i6 = this.A03) > 0) {
            this.A0A = ((float) i2) / ((float) i5);
            this.A09 = ((float) i) / ((float) i6);
        }
        AnonymousClass0fD.A0D(-1934120236, A062);
    }
}
