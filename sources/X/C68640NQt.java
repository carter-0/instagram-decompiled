package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.view.Choreographer;
import com.google.common.collect.ImmutableMap;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Deprecated
/* renamed from: X.NQt  reason: case insensitive filesystem */
public final class C68640NQt extends C268694dq implements Choreographer.FrameCallback {
    public static final CharSequence A0L = "…";
    public Integer A00 = AnonymousClass05K.A00;
    public Date A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final Typeface A07;
    public final UserSession A08;
    public final AnonymousClass0mB A09;
    public final C306386Ly A0A;
    public final String A0B;
    public final HashMap A0C = AnonymousClass7TE.A1E();
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final List A0H = AnonymousClass7TE.A1C();
    public final int[] A0I;
    public final C68637NQq[] A0J;
    public final String[] A0K;

    public static void A01(C68640NQt nQt) {
        C68640NQt nQt2 = nQt;
        Date date = nQt.A01;
        if (date == null || nQt.A00 == AnonymousClass05K.A00) {
            int[] iArr = nQt.A0I;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            nQt2.A09.A01();
        } else {
            HashMap hashMap = nQt.A0C;
            1G0.A0H(date, hashMap);
            ImmutableMap copyOf = ImmutableMap.copyOf(hashMap);
            if (A02(nQt2, C66583MXo.A05(copyOf, C247743gq.MONTHS, 0), C66583MXo.A05(copyOf, C247743gq.DAYS, 0), C66583MXo.A05(copyOf, C247743gq.HOURS, 0), C66583MXo.A05(copyOf, C247743gq.MINUTES, 0), C66583MXo.A05(copyOf, C247743gq.SECONDS, 0))) {
                nQt2.A09.A00();
            }
            nQt2.A09.A01();
        }
        nQt2.invalidateSelf();
    }

    public static boolean A02(C68640NQt nQt, int i, int i2, int i3, int i4, int i5) {
        int[] iArr = nQt.A0I;
        if (i > 0) {
            iArr[0] = i;
            iArr[1] = i2;
            iArr[2] = i3;
            iArr[3] = i4;
            String[] strArr = nQt.A0K;
            Context context = nQt.A06;
            strArr[0] = A00(context, C247743gq.MONTHS, i);
            strArr[1] = A00(context, C247743gq.DAYS, i2);
            strArr[2] = A00(context, C247743gq.HOURS, i3);
            strArr[3] = A00(context, C247743gq.MINUTES, i4);
            return false;
        }
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = i4;
        iArr[3] = i5;
        String[] strArr2 = nQt.A0K;
        Context context2 = nQt.A06;
        strArr2[0] = A00(context2, C247743gq.DAYS, i2);
        strArr2[1] = A00(context2, C247743gq.HOURS, i3);
        strArr2[2] = A00(context2, C247743gq.MINUTES, i4);
        strArr2[3] = A00(context2, C247743gq.SECONDS, i5);
        return true;
    }

    public final void doFrame(long j) {
        this.A02 = true;
        A01(this);
    }

    public final List A07() {
        return this.A0H;
    }

    public final int getIntrinsicHeight() {
        return this.A0E;
    }

    public final int getIntrinsicWidth() {
        return (this.A0F * 8) + (this.A0D * 4) + (this.A0G * 3);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5 = i;
        super.setBounds(i5, i2, i3, i4);
        float intrinsicWidth = (((float) (i + i3)) / 2.0f) - (((float) getIntrinsicWidth()) / 2.0f);
        float intrinsicHeight = (((float) (i2 + i4)) / 2.0f) - (((float) getIntrinsicHeight()) / 2.0f);
        float f = (float) this.A0E;
        float f2 = f + intrinsicHeight;
        C306386Ly r6 = this.A0A;
        float f3 = (float) r6.A0A;
        float f4 = (float) r6.A06;
        float f5 = (((float) this.A0G) / 2.0f) + intrinsicWidth;
        float f6 = (f / 2.0f) + intrinsicHeight;
        int i6 = 0;
        do {
            this.A0J[i6].setBounds((int) intrinsicWidth, (int) intrinsicHeight, (int) (((float) this.A0F) + intrinsicWidth), (int) f2);
            i6++;
        } while (i6 < 8);
        float f7 = f3 / 2.0f;
        float f8 = f4 / 2.0f;
        r6.setBounds((int) (f5 - f7), (int) (f6 - f8), (int) (f5 + f7), (int) (f6 + f8));
    }

    public final boolean setVisible(boolean z, boolean z2) {
        AnonymousClass0mB r0 = this.A09;
        if (z) {
            r0.A00();
        } else {
            r0.A01();
        }
        return super.setVisible(z, z2);
    }

    public C68640NQt(Context context, UserSession userSession, int i, int i2, int i3) {
        this.A08 = userSession;
        this.A06 = context;
        Resources resources = context.getResources();
        this.A04 = resources.getDimensionPixelSize(R.dimen.account_group_management_row_text_size);
        this.A07 = AnonymousClass0qo.A00(context).A02(0qm.A0x);
        this.A0F = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        this.A0E = resources.getDimensionPixelSize(R.dimen.barcelona_countdown_sticker_digit_background_height);
        this.A0D = resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_left);
        this.A0G = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        this.A0I = new int[4];
        this.A0K = new String[4];
        this.A09 = new AnonymousClass0mB(this, 1000);
        this.A0J = new C68637NQq[8];
        int i4 = 0;
        do {
            C68637NQq[] nQqArr = this.A0J;
            UserSession userSession2 = this.A08;
            nQqArr[i4] = new C68637NQq(this.A06, this.A07, userSession2, this.A0F, this.A0E, this.A04);
            C68637NQq nQq = this.A0J[i4];
            int i5 = i2;
            nQq.A0E.A0F(i5);
            nQq.A0F.A0F(i5);
            nQq.A0D.setColorFilter(i3, PorterDuff.Mode.SRC);
            nQq.invalidateSelf();
            this.A0J[i4].setCallback(this);
            this.A0H.add(this.A0J[i4]);
            i4++;
        } while (i4 < 8);
        this.A0B = resources.getString(2131956787);
        this.A05 = i;
        C306386Ly r4 = new C306386Ly(this.A06, this.A0G);
        this.A0A = r4;
        AJB.A05(this.A06, this.A08, r4, (float) this.A04, 0.0f, 0.0f);
        r4.A0M(this.A0B);
        r4.A0F(this.A05);
        Typeface typeface = this.A07;
        if (typeface != null) {
            r4.A0I(typeface);
        }
        this.A0H.add(r4);
        resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
    }

    public static String A00(Context context, C247743gq r5, int i) {
        Resources resources;
        int i2;
        int ordinal = r5.ordinal();
        if (ordinal == 0) {
            resources = context.getResources();
            i2 = R.plurals.countdown_sticker_second;
        } else if (ordinal == 1) {
            resources = context.getResources();
            i2 = R.plurals.countdown_sticker_minute;
        } else if (ordinal != 2) {
            resources = context.getResources();
            i2 = R.plurals.countdown_sticker_day;
            if (ordinal != 3) {
                i2 = R.plurals.countdown_sticker_month;
            }
        } else {
            resources = context.getResources();
            i2 = R.plurals.countdown_sticker_hour;
        }
        return resources.getQuantityString(i2, i);
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        int i = 0;
        do {
            int[] iArr = this.A0I;
            int i2 = iArr[i];
            C68637NQq[] nQqArr = this.A0J;
            int i3 = i * 2;
            nQqArr[i3].A09(i2 / 10, this.A02);
            nQqArr[i3].draw(canvas);
            int i4 = this.A0F;
            canvas.translate((float) (this.A0D + i4), 0.0f);
            if (iArr[0] == 0 && iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0 && this.A03 && i == 3) {
                this.A03 = false;
                AnonymousClass2S0.A01.A05(50);
                nQqArr[i3 + 1].A08();
            } else {
                nQqArr[i3 + 1].A09(i2 % 10, this.A02);
            }
            nQqArr[i3 + 1].draw(canvas);
            canvas.translate((float) i4, 0.0f);
            if (i >= 3) {
                break;
            }
            this.A0A.draw(canvas);
            canvas.translate((float) this.A0G, 0.0f);
            i++;
        } while (i < 4);
        canvas.restore();
    }
}
