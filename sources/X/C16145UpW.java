package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.UpW  reason: case insensitive filesystem */
public final class C16145UpW extends C299875vz implements View.OnTouchListener, C268714ds, C300645xY, C41795B1a {
    public int A00;
    public C42139BIu A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final C19472WaK A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (this.A02) {
            JTQ.A0u(canvas, this.A0E);
        }
        JTQ.A0u(canvas, this.A0C);
        JTQ.A0u(canvas, this.A0F);
        if (this.A0B.A02().length() != 0) {
            JTQ.A0u(canvas, this.A0D);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x005d, code lost:
        if (r9 == -16777216) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C16145UpW r11) {
        /*
            X.WaK r6 = r11.A0B
            X.BHJ r0 = r6.A00
            java.lang.String r0 = r0.A05
            r8 = 0
            int r9 = X.0nH.A0C(r0, r8)
            X.BHJ r0 = r6.A00
            java.lang.String r0 = r0.A09
            int r10 = X.0nH.A0C(r0, r8)
            X.0eM r0 = r11.A0C
            android.graphics.drawable.Drawable r0 = X.JTO.A0D(r0)
            android.graphics.drawable.Drawable r1 = r0.mutate()
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC
            X.C51969G9p.A12(r0, r1, r9)
            X.0eM r3 = r11.A0D
            java.lang.Object r2 = r3.getValue()
            X.U1I r2 = (X.U1I) r2
            java.lang.String r0 = r6.A02()
            r7 = 1
            boolean r0 = X.C51966G9m.A1X(r0)
            if (r0 != r7) goto L_0x01b6
            java.lang.String r1 = r6.A02()
        L_0x0039:
            X.6Ly r0 = r2.A00
            r0.A0M(r1)
            r2.invalidateSelf()
            java.lang.Object r1 = r3.getValue()
            X.U1I r1 = (X.U1I) r1
            X.6Ly r0 = r1.A00
            r0.A0F(r10)
            r1.invalidateSelf()
            X.0eM r5 = r11.A0F
            java.lang.Object r4 = r5.getValue()
            X.U1V r4 = (X.U1V) r4
            r3 = -1
            if (r10 != r3) goto L_0x005f
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = 1
            if (r9 != r0) goto L_0x0060
        L_0x005f:
            r2 = 0
        L_0x0060:
            X.U0r r0 = r4.A0O
            r0.A01 = r9
            r0.invalidateSelf()
            if (r9 != r3) goto L_0x01b0
            int r1 = r4.A0E
        L_0x006b:
            android.graphics.Paint r0 = r4.A0H
            r0.setColor(r1)
            if (r2 == 0) goto L_0x01ac
            r0 = -1
        L_0x0073:
            r4.A06 = r0
            if (r2 != 0) goto L_0x0079
            int r3 = r4.A0F
        L_0x0079:
            r4.A05 = r3
            android.graphics.Rect r0 = r4.getBounds()
            X.U1V.A00(r0, r4)
            r4.invalidateSelf()
            X.BIu r4 = r11.A01
            r9 = 0
            if (r4 == 0) goto L_0x01a9
            com.instagram.user.model.User r0 = r4.A00
        L_0x008c:
            java.lang.String r3 = "Required value was null."
            java.lang.Object r1 = r5.getValue()
            X.U1V r1 = (X.U1V) r1
            if (r0 == 0) goto L_0x017c
            X.BIu r0 = r11.A01
            if (r0 == 0) goto L_0x01c0
            com.instagram.user.model.User r0 = r0.A00
            if (r0 == 0) goto L_0x01c0
            X.UjQ r8 = r1.A0N
            X.U1O r2 = r8.A05
            X.1NK r1 = X.1NK.A00()
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()
            X.C13989Tnp.A1P(r2, r1, r0, r9)
            r8.invalidateSelf()
            java.lang.Object r0 = r5.getValue()
            X.U1V r0 = (X.U1V) r0
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            X.UjQ r8 = r0.A0N
            java.lang.Integer r0 = r8.A01
            if (r0 != 0) goto L_0x016a
            r8.A01 = r1
            r8.A02 = r9
            X.2cs r0 = r8.A03
            r0.A02()
        L_0x00c7:
            r8.invalidateSelf()
        L_0x00ca:
            java.lang.Object r9 = r5.getValue()
            X.U1V r9 = (X.U1V) r9
            X.BIu r0 = r11.A01
            if (r0 == 0) goto L_0x0141
            java.lang.Float r10 = r0.A01
            if (r10 == 0) goto L_0x0142
            int r1 = r6.A01()
            r0 = -1
            if (r1 != r0) goto L_0x0142
            float r1 = r10.floatValue()
        L_0x00e3:
            boolean r0 = r9.A0A
            r0 = r0 ^ 1
            r9.A0B = r0
            r9.A0A = r7
            r9.A03 = r1
            if (r0 == 0) goto L_0x00f4
            X.2cs r0 = r9.A0L
            r0.A03()
        L_0x00f4:
            r9.invalidateSelf()
            if (r4 == 0) goto L_0x0116
            java.lang.Float r0 = r4.A01
            if (r0 == 0) goto L_0x0116
            java.lang.Object r1 = r5.getValue()
            X.U1V r1 = (X.U1V) r1
            X.BIu r0 = r11.A01
            if (r0 == 0) goto L_0x01ba
            java.lang.Float r0 = r0.A01
            if (r0 == 0) goto L_0x01ba
            float r0 = r0.floatValue()
        L_0x010f:
            r1.A01(r0)
            r11.invalidateSelf()
            return
        L_0x0116:
            java.lang.Object r1 = r5.getValue()
            X.U1V r1 = (X.U1V) r1
            X.BHJ r0 = r6.A00
            java.lang.Boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0132
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0132
            boolean r0 = r6.A03()
            if (r0 != 0) goto L_0x0132
            r0 = 1028443341(0x3d4ccccd, float:0.05)
            goto L_0x010f
        L_0x0132:
            boolean r0 = r6.A03()
            if (r0 != 0) goto L_0x013c
            r0 = 1036831949(0x3dcccccd, float:0.1)
            goto L_0x010f
        L_0x013c:
            float r0 = r6.A00()
            goto L_0x010f
        L_0x0141:
            r10 = 0
        L_0x0142:
            boolean r0 = r6.A03()
            if (r0 == 0) goto L_0x0151
            X.BHJ r0 = r6.A00
            java.lang.Float r0 = r0.A02
            float r1 = X.C13989Tnp.A05(r0)
            goto L_0x00e3
        L_0x0151:
            int r8 = r6.A01()
            X.BHJ r0 = r6.A00
            java.lang.Float r0 = r0.A02
            float r2 = X.C13989Tnp.A05(r0)
            float r0 = X.C13989Tnp.A05(r10)
            float r1 = (float) r8
            float r1 = r1 * r2
            float r1 = r1 + r0
            int r0 = r8 + 1
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L_0x00e3
        L_0x016a:
            if (r0 == r1) goto L_0x00ca
            r8.A02 = r0
            r8.A01 = r1
            X.2cs r2 = r8.A03
            r0 = 0
            r2.A08(r0, r7)
            r2.A03()
            goto L_0x00c7
        L_0x017c:
            X.BHJ r0 = r6.A00
            java.lang.String r2 = r0.A06
            if (r2 != 0) goto L_0x0184
            java.lang.String r2 = "😍"
        L_0x0184:
            if (r2 != 0) goto L_0x0188
            java.lang.String r2 = "😍"
        L_0x0188:
            X.UjQ r1 = r1.A0N
            X.6Ly r0 = r1.A06
            r0.A0M(r2)
            r1.invalidateSelf()
            java.lang.Object r1 = r5.getValue()
            X.U1V r1 = (X.U1V) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A04(r0)
            java.lang.Object r9 = r5.getValue()
            X.U1V r9 = (X.U1V) r9
            r9.A0B = r8
            r9.A0A = r8
            goto L_0x00f4
        L_0x01a9:
            r0 = r9
            goto L_0x008c
        L_0x01ac:
            int r0 = r4.A0G
            goto L_0x0073
        L_0x01b0:
            int r1 = X.0nH.A05(r9)
            goto L_0x006b
        L_0x01b6:
            java.lang.String r1 = ""
            goto L_0x0039
        L_0x01ba:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x01c0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16145UpW.A00(X.UpW):void");
    }

    public final List A07() {
        return 0sr.A1P(new Drawable[]{JTO.A0D(this.A0C), JTO.A0D(this.A0D), JTO.A0D(this.A0F)});
    }

    public final Integer A08() {
        return AnonymousClass05K.A0Y;
    }

    public final C2802350v BzV() {
        return this.A0B;
    }

    public final String C4F() {
        String str = this.A0B.A00.A06;
        if (str == null) {
            str = "😍";
        }
        return 002.A0R("emoji_slider_", str);
    }

    public final int getIntrinsicHeight() {
        int i;
        int i2;
        int i3 = this.A00;
        if (i3 > 0) {
            return i3;
        }
        int A092 = JTT.A09(this.A0F);
        if (this.A0B.A02().length() == 0) {
            i = this.A07 + A092;
            i2 = this.A04;
        } else {
            i = this.A06 + ((U1I) this.A0D.getValue()).A00.A06 + this.A08 + A092;
            i2 = this.A03;
        }
        return i + i2;
    }

    public final int getIntrinsicWidth() {
        return this.A0A;
    }

    public /* synthetic */ C16145UpW(Context context, UserSession userSession, C19472WaK waK) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.canvas_text_view_input_background_width);
        0qQ.A0B(waK, 2);
        this.A0B = waK;
        this.A0A = dimensionPixelSize;
        this.A06 = context.getResources().getDimensionPixelSize(R.dimen.ad4ad_button_left_right_margin);
        boolean A1X = AnonymousClass7TG.A1X(waK.A00.A00);
        this.A07 = context.getResources().getDimensionPixelSize(A1X ? R.dimen.abc_edit_text_inset_top_material : R.dimen.asset_picker_static_sticker_last_row_padding);
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.asset_picker_section_title_horizontal_padding);
        this.A04 = context.getResources().getDimensionPixelSize(A1X ? R.dimen.abc_edit_text_inset_top_material : R.dimen.barcelona_countdown_sticker_digit_background_height);
        this.A05 = context.getResources().getDimensionPixelSize(A1X ? R.dimen.account_discovery_bottom_gap : R.dimen.album_preview_add_item_margin);
        this.A08 = C51972G9s.A08(context);
        this.A09 = AnonymousClass7TG.A03(context);
        this.A0C = AnonymousClass0eN.A01(new C73901Plc(context, 5));
        this.A0E = AnonymousClass0eN.A01(new MJ8(33, context, this));
        this.A0D = AnonymousClass0eN.A01(new MJ8(32, context, this));
        this.A0F = AnonymousClass0eN.A01(new C58695Iw4(48, (Object) context, (Object) this, (Object) userSession));
        A00(this);
    }

    public final Rect BIJ() {
        return AnonymousClass7TE.A0X(this);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AnonymousClass7TG.A1N(view, motionEvent);
        return ((U1V) this.A0F.getValue()).onTouch(view, motionEvent);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5;
        super.setBounds(i, i2, i3, i4);
        int i6 = (i + i3) / 2;
        int i7 = (i2 + i4) / 2;
        int intrinsicHeight = getIntrinsicHeight();
        int i8 = intrinsicHeight / 2;
        int i9 = i7 - i8;
        int i10 = i7 + i8;
        JTO.A0D(this.A0C).setBounds(i, i9, i3, i10);
        Drawable A0D2 = JTO.A0D(this.A0E);
        int i11 = this.A09;
        A0D2.setBounds(i - i11, i9 - i11, i3 + i11, i11 + i10);
        AnonymousClass0eM r4 = this.A0F;
        Drawable A0D3 = JTO.A0D(r4);
        int i12 = this.A05;
        int i13 = i + i12;
        int A092 = i10 - JTT.A09(r4);
        C19472WaK waK = this.A0B;
        if (waK.A02().length() == 0) {
            i5 = this.A04;
        } else {
            i5 = this.A03;
        }
        A0D3.setBounds(i13, A092 - i5, i3 - i12, i10 - i5);
        if (waK.A02().length() != 0) {
            int i14 = this.A03;
            int A093 = (((intrinsicHeight - i14) - this.A08) - JTT.A09(r4)) - i14;
            AnonymousClass0eM r5 = this.A0D;
            int i15 = this.A06 + i9;
            JTO.A0D(r5).setBounds(i6 - (((U1I) r5.getValue()).A00.A0A / 2), i15, i6 + (((U1I) r5.getValue()).A00.A0A / 2), i15 + A093);
        }
    }
}
