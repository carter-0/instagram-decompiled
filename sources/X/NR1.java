package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.quicksnap.emitter.QuickSnapReactionEmitterView;
import java.util.List;
import java.util.Set;

public final class NR1 extends IgImageView {
    public static final Set A0J = 0sc.A07(new String[]{"🏳️‍🌈", "🏳️‍⚧️", "🌈", "🦄"});
    public static final Set A0K = 0sc.A07(new String[]{"🔥", "🌼", "🌸", "☀️", "👹", "🍪", "❤️", "🧡", "💛", "💚", "💙", "💜", "🖤", "🤍", "✨", "🌟", "🍀", "🌞", "🎃", "❄️", "🎂", "🎈", "🎉", "🎊", "🥳"});
    public float A00;
    public int A01;
    public C74358PtY A02;
    public List A03 = 0sn.A00;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final ValueAnimator A08;
    public final QuickSnapReactionEmitterView A09;
    public final C72966PQy A0A;
    public final C262224Cq A0B;
    public final boolean A0C;
    public final Paint A0D;
    public final Path A0E;
    public final GestureDetector A0F;
    public final UserSession A0G;
    public final IgSimpleImageView A0H;
    public final C62320sa A0I;

    public NR1(Context context, UserSession userSession, IgSimpleImageView igSimpleImageView, QuickSnapReactionEmitterView quickSnapReactionEmitterView, C74423Pud pud, C62320sa r10, C262224Cq r11, int i) {
        super(context);
        this.A0G = userSession;
        this.A0H = igSimpleImageView;
        this.A09 = quickSnapReactionEmitterView;
        this.A0B = r11;
        this.A06 = i;
        this.A0I = r10;
        this.A0E = I7E.A02(i);
        Paint A0C2 = JTO.A0C();
        A0C2.setStyle(Paint.Style.STROKE);
        A0C2.setStrokeWidth((float) I7E.A00(context, R.dimen.abc_button_padding_horizontal_material));
        this.A0D = A0C2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat.setDuration(7000);
        C71170Oej.A00(ofFloat, this, 12);
        ofFloat.setInterpolator(new LinearInterpolator());
        C71161Oea.A00(ofFloat, this, 9);
        C71161Oea.A00(ofFloat, this, 10);
        this.A08 = ofFloat;
        this.A07 = C61380mr.A01(context, 32);
        this.A0C = I7E.A09();
        this.A0A = new C72966PQy(context, pud);
        this.A0F = new GestureDetector(context, new N1R(this, 2));
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        NR1.super.onDraw(canvas);
        if (this.A00 > 0.0f) {
            canvas.drawPath(getProgressPath(), this.A0D);
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView, X.NR1] */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e8, code lost:
        if (X.182.A06(r4, r2, 36325557784622116L) != false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r8 = r9.A06;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setQuickSnapMedia(X.C53401GnY r10, X.AnonymousClass0iw r11) {
        /*
            r9 = this;
            r0 = 1
            X.0qQ.A0B(r11, r0)
            r9.A0I()
            if (r10 == 0) goto L_0x00f3
            java.lang.Object r0 = r10.A02
            X.1Xj r0 = (X.1Xj) r0
            if (r0 == 0) goto L_0x00f3
            int r8 = r9.A06
            com.instagram.model.mediasize.ExtendedImageUrl r5 = r0.A1m(r8)
            if (r5 == 0) goto L_0x00f3
            boolean r0 = r9.A0C
            if (r0 != 0) goto L_0x004e
            int r2 = r5.getWidth()
            int r7 = r5.getHeight()
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            if (r2 <= 0) goto L_0x004b
            if (r7 <= 0) goto L_0x004b
            float r4 = (float) r8
            float r0 = (float) r2
            float r1 = r4 / r0
            float r0 = (float) r7
            float r0 = r4 / r0
            float r3 = java.lang.Math.max(r1, r0)
            r0 = 1065604874(0x3f83d70a, float:1.03)
            float r3 = r3 * r0
            int r0 = r8 - r2
            float r2 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r1
            int r8 = r8 - r7
            float r0 = (float) r8
            float r0 = r0 / r1
            float r4 = r4 / r1
            r6.setScale(r3, r3, r4, r4)
            r6.preTranslate(r2, r0)
        L_0x004b:
            r9.setImageMatrix(r6)
        L_0x004e:
            com.instagram.common.session.UserSession r2 = r9.A0G
            java.lang.String r3 = r10.A03
            r4 = 0
            X.0qQ.A0B(r2, r4)
            if (r3 == 0) goto L_0x0064
            java.util.Set r1 = A0J
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00bb
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00bb
        L_0x0064:
            X.0Tu r4 = X.0Tu.A05
            r0 = 36888507737834279(0x830de700020327, double:3.391779059280005E-306)
            java.lang.String r7 = X.182.A04(r4, r2, r0)
            kotlin.enums.EnumEntries r0 = X.C69372NkC.A04
            java.util.Iterator r6 = r0.iterator()
        L_0x0075:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r1 = r6.next()
            r0 = r1
            X.NkC r0 = (X.C69372NkC) r0
            java.lang.String r0 = r0.A02
            boolean r0 = X.0qQ.A0K(r0, r7)
            if (r0 == 0) goto L_0x0075
        L_0x008a:
            X.NkC r1 = (X.C69372NkC) r1
            if (r1 != 0) goto L_0x0090
            X.NkC r1 = X.C69372NkC.A06
        L_0x0090:
            r9.setStyle(r1)
            r9.setUrl(r5, r11)
            if (r3 == 0) goto L_0x00eb
            java.util.Set r0 = A0K
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r0.iterator()
        L_0x00a2:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00df
            java.lang.Object r1 = r5.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = X.DbU.A1a(r3, r0)
            if (r0 == 0) goto L_0x00a2
            r6.add(r1)
            goto L_0x00a2
        L_0x00b9:
            r1 = 0
            goto L_0x008a
        L_0x00bb:
            java.util.Iterator r1 = r1.iterator()
        L_0x00bf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            boolean r0 = X.00l.A0d(r3, r0, r4)
            if (r0 == 0) goto L_0x00bf
            X.0Tu r4 = X.0Tu.A05
            r0 = 36325557784556579(0x810de700043423, double:3.0357672420096736E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            if (r0 == 0) goto L_0x0064
            X.NkC r1 = X.C69372NkC.A07
            goto L_0x0090
        L_0x00df:
            r0 = 36325557784622116(0x810de700053424, double:3.0357672420511195E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            if (r0 == 0) goto L_0x00eb
            goto L_0x00ed
        L_0x00eb:
            X.0sn r6 = X.0sn.A00
        L_0x00ed:
            r9.A03 = r6
            r0 = 0
            r9.A01 = r0
            return
        L_0x00f3:
            r9.A09()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NR1.setQuickSnapMedia(X.GnY, X.0iw):void");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.common.ui.widget.imageview.IgImageView, X.NR1, android.view.View] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.NR1 r7) {
        /*
            boolean r0 = r7.A05
            if (r0 != 0) goto L_0x0058
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x0058
            r5 = 1
            r7.A05 = r5
            float r1 = r7.A00
            r0 = 0
            r6 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0014
            r5 = 0
        L_0x0014:
            com.instagram.common.ui.base.IgSimpleImageView r4 = r7.A0H
            r3 = 8
            r4.setVisibility(r3)
            r7.A0I()
            android.graphics.Rect r2 = X.AnonymousClass7TE.A0W()
            boolean r0 = r7.getGlobalVisibleRect(r2)
            if (r0 == 0) goto L_0x0059
            int r1 = r2.width()
            int r0 = r7.getWidth()
            if (r1 < r0) goto L_0x0059
            float r0 = r7.getRotation()
            r4.setRotation(r0)
            android.graphics.Bitmap r0 = r7.A06
            r4.setImageBitmap(r0)
            int r0 = r2.left
            float r0 = (float) r0
            r4.setX(r0)
            int r0 = r2.top
            float r0 = (float) r0
            r4.setY(r0)
            r4.setVisibility(r6)
            r7.setVisibility(r3)
            X.Pal r0 = new X.Pal
            r0.<init>(r4, r7, r5)
            r4.post(r0)
        L_0x0058:
            return
        L_0x0059:
            X.PtY r0 = r7.A02
            if (r0 == 0) goto L_0x0058
            r0.D5v(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NR1.A00(X.NR1):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: android.graphics.LinearGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: android.graphics.RadialGradient} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setStyle(X.C69372NkC r14) {
        /*
            r13 = this;
            android.graphics.Paint r1 = r13.A0D
            android.content.Context r6 = X.AnonymousClass7TE.A0S(r13)
            int r3 = r13.A06
            java.lang.Integer r0 = r14.A01
            int r2 = r0.intValue()
            r5 = 0
            if (r2 == r5) goto L_0x003f
            r0 = 1
            if (r2 != r0) goto L_0x003a
            r7 = 0
            float r9 = (float) r3
            int[] r4 = r14.A03
            int r3 = r4.length
            java.util.ArrayList r2 = X.DbS.A0v(r3)
        L_0x001d:
            if (r5 >= r3) goto L_0x002b
            r0 = r4[r5]
            int r0 = X.AnonymousClass7TF.A03(r6, r0)
            X.AnonymousClass7TF.A1M(r2, r0)
            int r5 = r5 + 1
            goto L_0x001d
        L_0x002b:
            int[] r10 = X.00k.A0x(r2)
            r11 = 0
            android.graphics.Shader$TileMode r12 = android.graphics.Shader.TileMode.REPEAT
            android.graphics.RadialGradient r4 = new android.graphics.RadialGradient
            r6 = r4
            r8 = r7
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x0064
        L_0x003a:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x003f:
            float r7 = (float) r3
            int[] r4 = r14.A03
            int r3 = r4.length
            java.util.ArrayList r2 = X.DbS.A0v(r3)
        L_0x0047:
            if (r5 >= r3) goto L_0x0055
            r0 = r4[r5]
            int r0 = X.AnonymousClass7TF.A03(r6, r0)
            X.AnonymousClass7TF.A1M(r2, r0)
            int r5 = r5 + 1
            goto L_0x0047
        L_0x0055:
            int[] r9 = X.00k.A0x(r2)
            r10 = 0
            android.graphics.Shader$TileMode r11 = android.graphics.Shader.TileMode.CLAMP
            r5 = 0
            android.graphics.LinearGradient r4 = new android.graphics.LinearGradient
            r6 = r5
            r8 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
        L_0x0064:
            r1.setShader(r4)
            int r0 = r14.A00
            r1.setAlpha(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NR1.setStyle(X.NkC):void");
    }

    public final void A0H() {
        ValueAnimator valueAnimator = this.A08;
        if (valueAnimator.isPaused() && this.A00 > 0.0f) {
            this.A04 = true;
            valueAnimator.resume();
        } else if (this.A04 && !valueAnimator.isStarted()) {
            valueAnimator.start();
        }
    }

    public final void A0I() {
        ValueAnimator valueAnimator = this.A08;
        if (valueAnimator.isRunning() || this.A00 > 0.0f) {
            valueAnimator.cancel();
        }
    }

    private final Path getProgressPath() {
        Path A0C2 = C51965G9l.A0C();
        PathMeasure pathMeasure = new PathMeasure(this.A0E, false);
        pathMeasure.getSegment(0.0f, this.A00 * pathMeasure.getLength(), A0C2, true);
        return A0C2;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A032 = DbX.A03(motionEvent, 1523559547);
        boolean z = true;
        if (!this.A04) {
            this.A0I.invoke();
            i = -2117290666;
        } else {
            if (motionEvent.getActionMasked() == 1) {
                A0H();
            }
            z = this.A0F.onTouchEvent(motionEvent);
            i = 1090396836;
        }
        AnonymousClass0fD.A0C(i, A032);
        return z;
    }

    public final void setOnConsumeListener(C74358PtY ptY) {
        this.A02 = ptY;
    }
}
