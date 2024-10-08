package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Upc  reason: case insensitive filesystem */
public final class C16151Upc extends C16152Upd implements JMB {
    public boolean A00;
    public final int A01 = AnonymousClass7TE.A0D(this.A0A);
    public final Drawable A02;
    public final AnonymousClass6M4 A03;
    public final C306386Ly A04;
    public final List A05;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        this.A0F.draw(canvas);
        Drawable drawable2 = this.A0B;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        C306386Ly r0 = this.A04;
        if (r0 != null) {
            r0.draw(canvas);
        }
        this.A0E.draw(canvas);
        this.A03.draw(canvas);
    }

    public static final void A00(C16151Upc upc) {
        C306386Ly r4;
        C19477WaP waP = upc.A0D;
        if (waP != null && waP.A02() > 0 && (r4 = upc.A04) != null) {
            Context context = upc.A09;
            r4.A0M(DbY.A0d(context.getResources(), waP.A02(), R.plurals.clips_question_sticker_response_count_text));
            r4.A0F(0nH.A07(waP.A04(context), 0.6f));
        }
    }

    public final Integer A08() {
        return AnonymousClass05K.A0j;
    }

    public final int getIntrinsicHeight() {
        int i;
        int i2 = this.A04;
        int i3 = this.A05 + this.A0F.A06 + i2;
        int i4 = this.A01;
        C306386Ly r0 = this.A04;
        if (r0 != null) {
            i = r0.A06;
        } else {
            i = 0;
        }
        return i3 + i4 + i + (this.A02 * 2) + this.A0E.A06 + i2;
    }

    public final int getIntrinsicWidth() {
        return this.A08;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i;
        int i7 = i3;
        super.setBounds(i6, i2, i7, i4);
        int i8 = (i + i3) / 2;
        int i9 = (i2 + i4) / 2;
        int intrinsicHeight = getIntrinsicHeight() / 2;
        int i10 = i9 - intrinsicHeight;
        int i11 = i9 + intrinsicHeight;
        int i12 = this.A05;
        C306386Ly r12 = this.A0F;
        int i13 = i12 + r12.A06;
        int i14 = this.A01;
        C306386Ly r2 = this.A04;
        if (r2 != null) {
            i5 = r2.A06;
        } else {
            i5 = 0;
        }
        int i15 = i14 + i5;
        int i16 = this.A02;
        C306386Ly r4 = this.A0E;
        int i17 = i16 + r4.A06;
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setBounds(i6, i10, i7, i11);
        }
        int i18 = r12.A0A / 2;
        int i19 = i10 + i13;
        r12.setBounds(i8 - i18, i12 + i10, i18 + i8, i19);
        if (r2 != null) {
            int i20 = r2.A0A / 2;
            r2.setBounds(i8 - i20, i14 + i19, i20 + i8, i19 + i15);
        }
        Drawable drawable2 = this.A0B;
        if (drawable2 != null) {
            int i21 = this.A04;
            int i22 = i11 - i21;
            drawable2.setBounds(i + i21, (i22 - i17) - i16, i3 - i21, i22);
        }
        int i23 = r4.A0A / 2;
        int i24 = i11 - this.A04;
        r4.setBounds(i8 - i23, i24 - i17, i8 + i23, i24 - i16);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16151Upc(Context context, UserSession userSession, C19477WaP waP) {
        super(context, userSession, waP);
        Drawable drawable;
        boolean A1Y = DbW.A1Y(context);
        Drawable drawable2 = context.getDrawable(R.drawable.interactive_sticker_background);
        C306386Ly r3 = null;
        if (drawable2 != null) {
            drawable = drawable2.mutate();
        } else {
            drawable = null;
        }
        this.A02 = drawable;
        C19477WaP waP2 = this.A0D;
        if (!(waP2 == null || Integer.valueOf(waP2.A02()) == null || waP2.A02() <= 0)) {
            r3 = new C306386Ly(context, this.A08);
            r3.A0M(DbY.A0d(context.getResources(), waP2.A02(), R.plurals.clips_question_sticker_response_count_text));
            r3.A0A((float) this.A03);
            r3.A0F(context.getColor(2Yu.A0A(context)));
            r3.A0C(0.0f, (float) this.A07);
            r3.A0K(Layout.Alignment.ALIGN_CENTER);
        }
        this.A04 = r3;
        this.A05 = new ArrayList();
        this.A00 = A1Y;
        AnonymousClass6M3 r1 = new AnonymousClass6M3(context, this, this.A08);
        r1.A01(2131955641);
        r1.A02(R.dimen.challenge_sticker_subtitle_text_size);
        this.A03 = r1.A00();
        Collections.addAll(00k.A0U(this.A05), new Drawable[]{drawable, this.A0F, this.A0B, this.A0E});
        if (waP2 != null) {
            int A032 = waP2.A03(this.A09);
            Drawable drawable3 = this.A02;
            if (drawable3 == null) {
                0wb.A03("ClipsQuestionStickerDrawable", "background drawable is null");
            } else {
                Drawable mutate = drawable3.mutate();
                if (mutate != null) {
                    C51969G9p.A12(PorterDuff.Mode.SRC, mutate, A032);
                }
            }
        }
        A00(this);
        A0D();
        A0C();
    }
}
