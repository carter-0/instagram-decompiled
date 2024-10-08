package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.reels.question.constants.QuestionStickerType;
import java.util.List;

/* renamed from: X.Upd  reason: case insensitive filesystem */
public abstract class C16152Upd extends C299875vz implements C268714ds, C300645xY {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Context A09;
    public final Resources A0A;
    public final Drawable A0B;
    public final Drawable A0C;
    public final C19477WaP A0D;
    public final C306386Ly A0E;
    public final C306386Ly A0F;
    public final UserSession A0G;
    public final String A0H;

    public final List A07() {
        if (this instanceof C16150Upb) {
            return ((C16150Upb) this).A04;
        }
        return ((C16151Upc) this).A05;
    }

    public final AnonymousClass6M4 A0B() {
        if (this instanceof C16150Upb) {
            return ((C16150Upb) this).A02;
        }
        return ((C16151Upc) this).A03;
    }

    public final void A0C() {
        C19477WaP waP = this.A0D;
        if (waP != null) {
            Context context = this.A09;
            int A032 = waP.A03(context);
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(AnonymousClass6YG.A01(context, A032), PorterDuff.Mode.SRC);
            C13989Tnp.A11(porterDuffColorFilter, this.A0B);
            C13989Tnp.A11(porterDuffColorFilter, this.A0C);
            C306386Ly r1 = this.A0E;
            QuestionStickerType questionStickerType = waP.A00.A00;
            if (questionStickerType == null) {
                questionStickerType = QuestionStickerType.TEXT;
            }
            0qQ.A07(questionStickerType);
            r1.A0M(context.getString(2131971053));
            r1.A0F(AnonymousClass6YG.A00(context, A032));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r3.length() == 0) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D() {
        /*
            r5 = this;
            X.WaP r4 = r5.A0D
            if (r4 == 0) goto L_0x0026
            java.lang.String r3 = r4.A05()
            if (r3 == 0) goto L_0x0011
            int r0 = r3.length()
            r2 = 0
            if (r0 != 0) goto L_0x0012
        L_0x0011:
            r2 = 1
        L_0x0012:
            java.lang.String r0 = ""
            X.6Ly r1 = r5.A0F
            if (r2 == 0) goto L_0x0027
            java.lang.String r0 = r5.A0H
        L_0x001a:
            r1.A0M(r0)
            android.content.Context r0 = r5.A09
            int r0 = r4.A04(r0)
            r1.A0F(r0)
        L_0x0026:
            return
        L_0x0027:
            if (r3 == 0) goto L_0x001a
            r0 = r3
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16152Upd.A0D():void");
    }

    public final boolean A0E() {
        if (this instanceof C16150Upb) {
            return ((C16150Upb) this).A00;
        }
        return ((C16151Upc) this).A00;
    }

    public final C2802350v BzV() {
        return this.A0D;
    }

    public final String C4F() {
        C19477WaP waP = this.A0D;
        if (waP == null) {
            return "";
        }
        QuestionStickerType questionStickerType = waP.A00.A00;
        if (questionStickerType == null) {
            questionStickerType = QuestionStickerType.TEXT;
        }
        if (questionStickerType.ordinal() != 5) {
            return "";
        }
        List A062 = waP.A06();
        if (A062 == null || !AnonymousClass7TE.A1b(A062)) {
            return "question_sticker_ama";
        }
        return "expressive_question_sticker";
    }

    public C16152Upd(Context context, UserSession userSession, C19477WaP waP) {
        int A0A2;
        this.A0G = userSession;
        this.A09 = context;
        this.A0D = waP;
        Resources A0A3 = AnonymousClass7TF.A0A(context);
        this.A0A = A0A3;
        String A16 = AnonymousClass7TE.A16(context, 2131971056);
        this.A0H = A16;
        int A0B2 = AnonymousClass7TE.A0B(A0A3);
        this.A04 = A0B2;
        int dimensionPixelSize = A0A3.getDimensionPixelSize(R.dimen.canvas_text_view_input_background_width);
        this.A08 = dimensionPixelSize;
        int i = dimensionPixelSize - (A0B2 * 2);
        this.A05 = AnonymousClass7TE.A0G(A0A3);
        this.A02 = A0A3.getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
        this.A01 = A0A3.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        this.A00 = AnonymousClass7TE.A0D(A0A3);
        this.A06 = A0A3.getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        int dimensionPixelSize2 = A0A3.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        this.A07 = dimensionPixelSize2;
        int dimensionPixelSize3 = A0A3.getDimensionPixelSize(R.dimen.poll_v2_sticker_result_percentage_text_size);
        int dimensionPixelSize4 = A0A3.getDimensionPixelSize(R.dimen.challenge_sticker_button_text_size);
        this.A03 = dimensionPixelSize4;
        int color = context.getColor(R.color.clips_remix_camera_outer_container_default_background);
        this.A0B = context.getDrawable(R.drawable.question_sticker_answer_background);
        this.A0C = context.getDrawable(R.drawable.question_sticker_rounded_answer_background);
        C306386Ly r1 = new C306386Ly(context, dimensionPixelSize);
        Context context2 = r1.A0Z;
        r1.A0M(context2.getString(2131971053));
        r1.A0A((float) dimensionPixelSize4);
        if (C61670oa.A0H()) {
            A0A2 = R.color.igds_secondary_text;
        } else {
            A0A2 = 2Yu.A0A(context2);
        }
        r1.A0F(context2.getColor(A0A2));
        float f = (float) dimensionPixelSize2;
        r1.A0C(0.0f, f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        r1.A0K(alignment);
        r1.setCallback(this);
        AnonymousClass0qq A002 = AnonymousClass0qo.A00(context2);
        0qm r2 = 0qm.A0V;
        AnonymousClass7TE.A1X(r2, A002, r1);
        this.A0E = r1;
        C306386Ly r12 = new C306386Ly(context, i);
        r12.A0M(A16);
        r12.A0A((float) dimensionPixelSize3);
        r12.A0F(color);
        r12.A0C(0.0f, f);
        Context context3 = r12.A0Z;
        0qQ.A07(context3);
        ABM.A00(context3, r12);
        r12.A0K(alignment);
        r12.setCallback(this);
        AnonymousClass7TE.A1X(r2, AnonymousClass0qo.A00(context3), r12);
        this.A0F = r12;
    }
}
