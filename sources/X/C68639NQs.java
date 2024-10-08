package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.Layout;
import android.view.Choreographer;
import com.google.common.collect.ImmutableMap;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.NQs  reason: case insensitive filesystem */
public final class C68639NQs extends C268694dq implements Choreographer.FrameCallback {
    public static final CharSequence A0Q = "…";
    public int A00;
    public int A01;
    public Integer A02;
    public Date A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final UserSession A09;
    public final C306386Ly A0A;
    public final C306386Ly A0B;
    public final String A0C;
    public final String A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final AnonymousClass0mB A0K;
    public final List A0L;
    public final Map A0M = AnonymousClass7TE.A1E();
    public final int[] A0N;
    public final C68637NQq[] A0O;
    public final String[] A0P;

    public static final void A00(C68639NQs nQs) {
        Integer num;
        C68639NQs nQs2 = nQs;
        Date date = nQs.A03;
        if (date == null || (num = nQs.A02) == AnonymousClass05K.A00) {
            int[] iArr = nQs.A0N;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            C306386Ly r1 = nQs.A0A;
            r1.A0E(nQs.getIntrinsicWidth());
            r1.A0M(nQs.A0C);
            nQs2.A0K.A01();
        } else {
            if (num == AnonymousClass05K.A01) {
                Context context = nQs.A08;
                String A032 = 1G0.A03(context, (double) TimeUnit.MILLISECONDS.toSeconds(date.getTime()));
                C306386Ly r12 = nQs.A0A;
                r12.A0E(nQs.getIntrinsicWidth());
                r12.A0M(DbW.A0h(context, A032, 2131956779));
            } else {
                nQs.A0A.A0E(nQs.A0J);
            }
            Map map = nQs.A0M;
            1G0.A0H(date, map);
            ImmutableMap copyOf = ImmutableMap.copyOf(map);
            0qQ.A07(copyOf);
            if (nQs2.A01(DbX.A01((Number) copyOf.getOrDefault(C247743gq.MONTHS, 0)), DbX.A01((Number) copyOf.getOrDefault(C247743gq.DAYS, 0)), DbX.A01((Number) copyOf.getOrDefault(C247743gq.HOURS, 0)), DbX.A01((Number) copyOf.getOrDefault(C247743gq.MINUTES, 0)), C51967G9n.A04((Number) copyOf.getOrDefault(C247743gq.SECONDS, 0), 0))) {
                nQs2.A0K.A00();
            }
            nQs2.A0K.A01();
        }
        nQs2.invalidateSelf();
    }

    private final boolean A01(int i, int i2, int i3, int i4, int i5) {
        String[] strArr;
        String A002;
        boolean A1R = AnonymousClass7TF.A1R(i);
        boolean A1R2 = AnonymousClass7TF.A1R(i2);
        int[] iArr = this.A0N;
        if (A1R) {
            iArr[0] = i;
            iArr[1] = i2;
            iArr[2] = i3;
            strArr = this.A0P;
            Context context = this.A08;
            strArr[0] = C70303O1h.A00(context, C247743gq.MONTHS, i);
            strArr[1] = C70303O1h.A00(context, C247743gq.DAYS, i2);
            A002 = C70303O1h.A00(context, C247743gq.HOURS, i3);
        } else if (A1R2) {
            iArr[0] = i2;
            iArr[1] = i3;
            iArr[2] = i4;
            strArr = this.A0P;
            Context context2 = this.A08;
            strArr[0] = C70303O1h.A00(context2, C247743gq.DAYS, i2);
            strArr[1] = C70303O1h.A00(context2, C247743gq.HOURS, i3);
            A002 = C70303O1h.A00(context2, C247743gq.MINUTES, i4);
        } else {
            iArr[0] = i3;
            iArr[1] = i4;
            iArr[2] = i5;
            String[] strArr2 = this.A0P;
            Context context3 = this.A08;
            strArr2[0] = C70303O1h.A00(context3, C247743gq.HOURS, i3);
            strArr2[1] = C70303O1h.A00(context3, C247743gq.MINUTES, i4);
            strArr2[2] = C70303O1h.A00(context3, C247743gq.SECONDS, i5);
            return true;
        }
        strArr[2] = A002;
        return false;
    }

    public final void A08(int i, int i2, int i3, int i4) {
        int i5 = 0;
        do {
            C68637NQq nQq = this.A0O[i5];
            nQq.A0E.A0F(i);
            nQq.A0F.A0F(i);
            nQq.A0D.setColorFilter(i2, PorterDuff.Mode.SRC);
            nQq.invalidateSelf();
            i5++;
        } while (i5 < 6);
        this.A0B.A0F(i3);
        this.A0A.A0F(i4);
        invalidateSelf();
    }

    public final void A0A(Date date) {
        int i;
        Date date2 = date;
        this.A03 = date2;
        this.A02 = AnonymousClass05K.A0C;
        this.A0A.A0E(this.A0J);
        Map map = this.A0M;
        Date date3 = this.A03;
        if (date3 != null) {
            1G0.A0H(date3, map);
            ImmutableMap copyOf = ImmutableMap.copyOf(map);
            0qQ.A07(copyOf);
            C247743gq r7 = C247743gq.MONTHS;
            int A0A2 = AnonymousClass7TG.A0A((Number) copyOf.getOrDefault(r7, 0));
            C247743gq r5 = C247743gq.DAYS;
            int A0A3 = AnonymousClass7TG.A0A((Number) copyOf.getOrDefault(r5, 0));
            Calendar instance = Calendar.getInstance();
            instance.setTime(date2);
            if (A0A2 > 0) {
                i = 11;
            } else {
                if (A0A3 > 0) {
                    i = 12;
                }
                Date time = instance.getTime();
                0qQ.A07(time);
                1G0.A0H(time, map);
                ImmutableMap copyOf2 = ImmutableMap.copyOf(map);
                A01(DbX.A01((Number) copyOf2.getOrDefault(r7, 0)), DbX.A01((Number) copyOf2.getOrDefault(r5, 0)), DbX.A01((Number) copyOf2.getOrDefault(C247743gq.HOURS, 0)), DbX.A01((Number) copyOf2.getOrDefault(C247743gq.MINUTES, 0)), C51967G9n.A04((Number) copyOf2.getOrDefault(C247743gq.SECONDS, 0), 0));
                this.A0K.A00();
                invalidateSelf();
                return;
            }
            instance.add(i, 1);
            Date time2 = instance.getTime();
            0qQ.A07(time2);
            1G0.A0H(time2, map);
            ImmutableMap copyOf22 = ImmutableMap.copyOf(map);
            A01(DbX.A01((Number) copyOf22.getOrDefault(r7, 0)), DbX.A01((Number) copyOf22.getOrDefault(r5, 0)), DbX.A01((Number) copyOf22.getOrDefault(C247743gq.HOURS, 0)), DbX.A01((Number) copyOf22.getOrDefault(C247743gq.MINUTES, 0)), C51967G9n.A04((Number) copyOf22.getOrDefault(C247743gq.SECONDS, 0), 0));
            this.A0K.A00();
            invalidateSelf();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void doFrame(long j) {
        this.A05 = true;
        A00(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r1 != X.AnonymousClass05K.A01) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r15) {
        /*
            r14 = this;
            r6 = 0
            X.0qQ.A0B(r15, r6)
            r15.save()
            java.util.Date r0 = r14.A03
            r13 = 1
            r12 = 0
            if (r0 == 0) goto L_0x0018
            r12 = 1
            java.lang.Integer r1 = r14.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x0018
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x001d
        L_0x0018:
            X.6Ly r0 = r14.A0A
            r0.draw(r15)
        L_0x001d:
            int[] r5 = r14.A0N
            r0 = r5[r6]
            r4 = 2
            if (r0 != 0) goto L_0x009e
            r0 = r5[r13]
            if (r0 != 0) goto L_0x009e
            r0 = r5[r4]
            if (r0 != 0) goto L_0x009e
        L_0x002c:
            r3 = 0
        L_0x002d:
            if (r12 == 0) goto L_0x0045
            java.lang.Integer r1 = r14.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0045
            X.6Ly r1 = r14.A0A
            java.lang.String[] r0 = r14.A0P
            r0 = r0[r3]
            if (r0 != 0) goto L_0x003f
            java.lang.String r0 = ""
        L_0x003f:
            r1.A0M(r0)
            r1.draw(r15)
        L_0x0045:
            r11 = r5[r3]
            X.NQq[] r9 = r14.A0O
            int r10 = r3 * 2
            r2 = r9[r10]
            int r1 = r11 / 10
            boolean r0 = r14.A05
            r2.A09(r1, r0)
            r0 = r9[r10]
            r0.draw(r15)
            int r8 = r14.A0G
            int r0 = r14.A0E
            int r0 = r0 + r8
            float r0 = (float) r0
            r7 = 0
            r15.translate(r0, r7)
            if (r13 == 0) goto L_0x0092
            boolean r0 = r14.A04
            if (r0 == 0) goto L_0x0092
            if (r3 != r4) goto L_0x0092
            r14.A04 = r6
            int r0 = r10 + 1
            r0 = r9[r0]
            r0.A08()
        L_0x0074:
            int r0 = r10 + 1
            r0 = r9[r0]
            r0.draw(r15)
            float r0 = (float) r8
            r15.translate(r0, r7)
            if (r3 >= r4) goto L_0x00a0
            X.6Ly r0 = r14.A0B
            r0.draw(r15)
            int r0 = r14.A0I
            float r0 = (float) r0
            r15.translate(r0, r7)
            int r3 = r3 + 1
            r0 = 3
            if (r3 >= r0) goto L_0x00a0
            goto L_0x002d
        L_0x0092:
            int r0 = r10 + 1
            r2 = r9[r0]
            int r1 = r11 % 10
            boolean r0 = r14.A05
            r2.A09(r1, r0)
            goto L_0x0074
        L_0x009e:
            r13 = 0
            goto L_0x002c
        L_0x00a0:
            r15.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68639NQs.draw(android.graphics.Canvas):void");
    }

    public final List A07() {
        return this.A0L;
    }

    public final void A09(Date date) {
        this.A03 = date;
        this.A02 = AnonymousClass05K.A0C;
        this.A05 = false;
        A00(this);
    }

    public final int getIntrinsicHeight() {
        return this.A0F + this.A0H + this.A0A.A06;
    }

    public final int getIntrinsicWidth() {
        return (this.A0G * 6) + (this.A0E * 3) + (this.A0I * 2);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i;
        super.setBounds(i6, i2, i3, i4);
        float intrinsicWidth = (((float) (i + i3)) / 2.0f) - (((float) getIntrinsicWidth()) / 2.0f);
        float intrinsicHeight = (((float) (i2 + i4)) / 2.0f) - (((float) getIntrinsicHeight()) / 2.0f);
        float f = (float) this.A0F;
        float f2 = f + intrinsicHeight;
        C306386Ly r7 = this.A0B;
        float f3 = (float) r7.A0A;
        float f4 = (float) r7.A06;
        float f5 = (((float) this.A0I) / 2.0f) + intrinsicWidth;
        float f6 = (f / 2.0f) + intrinsicHeight;
        C306386Ly r3 = this.A0A;
        float f7 = (float) r3.A0A;
        int i7 = this.A0H;
        float f8 = (float) (i7 + r3.A06);
        float descent = r3.A0b.descent();
        int i8 = 0;
        do {
            C68637NQq nQq = this.A0O[i8];
            i5 = (int) intrinsicWidth;
            C68637NQq nQq2 = nQq;
            nQq2.setBounds(i5, (int) intrinsicHeight, (int) (((float) this.A0G) + intrinsicWidth), (int) f2);
            i8++;
        } while (i8 < 6);
        float f9 = f3 / 2.0f;
        float f10 = f4 / 2.0f;
        r7.setBounds((int) (f5 - f9), (int) (f6 - f10), (int) (f5 + f9), (int) (f6 + f10));
        float f11 = descent / 2.0f;
        r3.setBounds(i5, (int) (((float) i7) + f2 + f11), (int) (intrinsicWidth + f7), (int) ((f2 + f8) - f11));
    }

    public final boolean setVisible(boolean z, boolean z2) {
        AnonymousClass0mB r0 = this.A0K;
        if (z) {
            r0.A00();
        } else {
            r0.A01();
        }
        return super.setVisible(z, z2);
    }

    public C68639NQs(UserSession userSession, Context context) {
        this.A09 = userSession;
        this.A08 = context;
        this.A0L = AnonymousClass7TE.A1C();
        this.A02 = AnonymousClass05K.A00;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        this.A0G = dimensionPixelSize;
        this.A0F = resources.getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height);
        int A0H2 = AnonymousClass7TE.A0H(resources);
        this.A0E = A0H2;
        this.A0I = resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
        this.A07 = resources.getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        this.A0H = AnonymousClass7TE.A0C(resources);
        this.A06 = AnonymousClass7TE.A0F(resources);
        this.A0J = (dimensionPixelSize * 2) + A0H2;
        this.A0N = new int[3];
        this.A0P = new String[3];
        this.A0K = new AnonymousClass0mB(this, 1000);
        ArrayList A0v = DbS.A0v(6);
        int i = 0;
        int i2 = 0;
        do {
            A0v.add(new C68637NQq(this.A08, (Typeface) null, this.A09, this.A0G, this.A0F, -1));
            i2++;
        } while (i2 < 6);
        this.A0O = (C68637NQq[]) A0v.toArray(new C68637NQq[0]);
        do {
            this.A0O[i].setCallback(this);
            this.A0L.add(this.A0O[i]);
            i++;
        } while (i < 6);
        this.A0D = resources.getString(2131956787);
        this.A01 = this.A08.getColor(R.color.countdown_sticker_title_text_color);
        C306386Ly r4 = new C306386Ly(this.A08, this.A0I);
        this.A0B = r4;
        AJB.A05(this.A08, this.A09, r4, (float) this.A07, 0.0f, 0.0f);
        r4.A0M(this.A0D);
        r4.A0F(this.A01);
        this.A0L.add(r4);
        this.A0C = resources.getString(2131956783);
        this.A00 = this.A08.getColor(R.color.countdown_sticker_footer_text_color);
        C306386Ly r2 = new C306386Ly(this.A08, getIntrinsicWidth());
        this.A0A = r2;
        r2.A0C(0.0f, 0.0f);
        r2.A0J(Typeface.SANS_SERIF, 1);
        r2.A0M(this.A0C);
        r2.A0A((float) this.A06);
        r2.A0F(this.A00);
        r2.A0G(1, "…");
        r2.A0K(Layout.Alignment.ALIGN_NORMAL);
        this.A0L.add(r2);
    }
}
