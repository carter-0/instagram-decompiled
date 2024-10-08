package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.UpY  reason: case insensitive filesystem */
public final class C16147UpY extends C299875vz implements C300645xY {
    public C18603Vuw A00;
    public String A01 = "";
    public boolean A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final AnonymousClass6M4 A09;
    public final C15839UjP A0A;
    public final C306386Ly A0B;
    public final C306386Ly A0C;
    public final C306386Ly A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final Drawable A0H;
    public final Drawable A0I;
    public final C363208jL A0J;
    public final List A0K;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
        if (r4 == r1[1]) goto L_0x0031;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0189  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.C18603Vuw r10) {
        /*
            r9 = this;
            r6 = 0
            r9.A00 = r10
            com.instagram.user.model.User r8 = r10.A00()
            com.instagram.api.schemas.SMBSupportStickerDict r0 = r10.A00
            java.lang.String r1 = r0.A0B
            int[] r7 = X.C18603Vuw.A04
            r0 = r7[r6]
            int r5 = X.0nH.A0C(r1, r0)
            com.instagram.api.schemas.SMBSupportStickerDict r0 = r10.A00
            java.lang.String r1 = r0.A08
            r3 = 1
            r0 = r7[r3]
            int r4 = X.0nH.A0C(r1, r0)
            r2 = 0
            r0 = r7[r6]
            if (r5 != r0) goto L_0x0027
            r0 = r7[r3]
            if (r4 == r0) goto L_0x0031
        L_0x0027:
            int[] r1 = X.C18603Vuw.A05
            r0 = r1[r6]
            if (r5 != r0) goto L_0x0032
            r0 = r1[r3]
            if (r4 != r0) goto L_0x0032
        L_0x0031:
            r2 = 1
        L_0x0032:
            r9.A02 = r2
            if (r2 == 0) goto L_0x003c
            int[] r0 = X.C18603Vuw.A05
            r5 = r0[r6]
            r4 = r0[r3]
        L_0x003c:
            java.lang.Integer r1 = r10.A01()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            java.lang.String r3 = "Required value was null."
            if (r1 != r0) goto L_0x014d
            X.UjP r2 = r9.A0A
            android.content.Context r1 = r9.A08
            r0 = 2131238327(0x7f081db7, float:1.809293E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            if (r0 == 0) goto L_0x018f
            android.graphics.drawable.Drawable r1 = r0.mutate()
            boolean r0 = r9.A02
            r2.A0E(r1, r0)
        L_0x005c:
            X.UjP r6 = r9.A0A
            r6.A08()
            int[] r1 = new int[]{r5, r4}
            android.graphics.drawable.GradientDrawable r0 = r6.A0A
            r0.setColors(r1)
            android.graphics.drawable.GradientDrawable r0 = r6.A05
            if (r0 == 0) goto L_0x0071
            r0.setColors(r1)
        L_0x0071:
            boolean r0 = r9.A00()
            if (r0 == 0) goto L_0x0088
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x0088
            X.Tsv r0 = X.C14272Tsv.SOLID_BLUE
            int[] r1 = X.C14276Tsz.A02(r0)
            android.graphics.drawable.GradientDrawable r0 = r6.A05
            if (r0 == 0) goto L_0x0088
            r0.setColors(r1)
        L_0x0088:
            android.content.Context r2 = r9.A08
            int r0 = X.AnonymousClass7TG.A04(r2)
            r6.A0A(r0)
            int r0 = X.AnonymousClass7TE.A09(r2)
            r6.A09(r0)
            if (r8 != 0) goto L_0x0142
            r0 = 2131237414(0x7f081a26, float:1.8091078E38)
            android.graphics.drawable.Drawable r4 = r2.getDrawable(r0)
            int r1 = X.C51972G9s.A08(r2)
            android.graphics.drawable.InsetDrawable r0 = new android.graphics.drawable.InsetDrawable
            r0.<init>(r4, r1)
            r6.A0C(r0)
        L_0x00ad:
            X.6Ly r4 = r9.A0D
            com.instagram.api.schemas.SMBSupportStickerDict r0 = r10.A00
            java.lang.String r0 = r0.A0D
            if (r0 != 0) goto L_0x00b7
            java.lang.String r0 = ""
        L_0x00b7:
            r4.A0M(r0)
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x0137
            r0 = -14277082(0xffffffffff262626, float:-2.2084993E38)
        L_0x00c1:
            r4.A0F(r0)
            boolean r0 = r9.A00()
            if (r0 != 0) goto L_0x00ef
            X.6Ly r4 = r9.A0C
            com.instagram.api.schemas.SMBSupportStickerDict r0 = r10.A00
            java.lang.String r1 = r0.A09
            if (r1 == 0) goto L_0x0134
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0134
            r0 = 2131974054(0x7f1357a6, float:1.9585161E38)
            java.lang.String r0 = X.DbW.A0h(r2, r1, r0)
            X.0qQ.A0A(r0)
        L_0x00e2:
            r4.A0M(r0)
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x011f
            r0 = -14277082(0xffffffffff262626, float:-2.2084993E38)
        L_0x00ec:
            r4.A0F(r0)
        L_0x00ef:
            X.6Ly r4 = r9.A0B
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x0113
            r0 = -1
        L_0x00f6:
            r4.A0F(r0)
            java.lang.Integer r0 = r10.A01()
            if (r0 == 0) goto L_0x0189
            java.lang.String r0 = X.F7G.A00(r2, r0)
            r4.A0M(r0)
            android.graphics.drawable.Drawable r1 = r9.A0I
            r0 = 16842910(0x101009e, float:2.3694E-38)
            int[] r0 = new int[]{r0}
            r1.setState(r0)
            return
        L_0x0113:
            com.instagram.api.schemas.SMBSupportStickerDict r0 = r10.A00
            java.lang.String r1 = r0.A04
            r0 = -13068304(0xffffffffff3897f0, float:-2.4536686E38)
            int r0 = X.0nH.A0C(r1, r0)
            goto L_0x00f6
        L_0x011f:
            com.instagram.api.schemas.SMBSupportStickerDict r0 = r10.A00
            java.lang.String r1 = r0.A0C
            if (r1 == 0) goto L_0x012b
            int r0 = r1.length()
            if (r0 != 0) goto L_0x012c
        L_0x012b:
            r1 = 0
        L_0x012c:
            r0 = -6710887(0xffffffffff999999, float:NaN)
            int r0 = X.0nH.A0B(r1, r0)
            goto L_0x00ec
        L_0x0134:
            java.lang.String r0 = ""
            goto L_0x00e2
        L_0x0137:
            com.instagram.api.schemas.SMBSupportStickerDict r0 = r10.A00
            java.lang.String r1 = r0.A0E
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r0 = X.0nH.A0C(r1, r0)
            goto L_0x00c1
        L_0x0142:
            X.U1N r1 = r6.A0B
            com.instagram.common.typedurl.ImageUrl r0 = r8.Bh3()
            r1.A00(r0)
            goto L_0x00ad
        L_0x014d:
            java.lang.Integer r1 = r10.A01()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x016d
            X.UjP r2 = r9.A0A
            android.content.Context r1 = r9.A08
            r0 = 2131238930(0x7f082012, float:1.8094153E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            if (r0 == 0) goto L_0x0195
            android.graphics.drawable.Drawable r1 = r0.mutate()
            boolean r0 = r9.A02
            r2.A0E(r1, r0)
            goto L_0x005c
        L_0x016d:
            boolean r0 = r9.A00()
            if (r0 == 0) goto L_0x005c
            X.UjP r2 = r9.A0A
            android.content.Context r1 = r9.A08
            r0 = 2131238129(0x7f081cf1, float:1.8092528E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            if (r0 == 0) goto L_0x019b
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r2.A0E(r0, r6)
            goto L_0x005c
        L_0x0189:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x018f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0195:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x019b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16147UpY.A0B(X.Vuw):void");
    }

    public final void draw(Canvas canvas) {
        Drawable drawable;
        0qQ.A0B(canvas, 0);
        this.A0A.draw(canvas);
        if (this.A02) {
            drawable = this.A0I;
        } else {
            drawable = this.A0H;
        }
        drawable.draw(canvas);
        this.A0D.draw(canvas);
        if (!A00()) {
            this.A0C.draw(canvas);
        }
        this.A0B.draw(canvas);
        this.A09.draw(canvas);
    }

    public C16147UpY(Context context) {
        Context context2 = context;
        boolean A1Y = DbW.A1Y(context2);
        this.A08 = context2;
        ArrayList arrayList = new ArrayList();
        this.A0K = arrayList;
        Resources resources = context2.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.canvas_text_view_input_background_width);
        this.A07 = dimensionPixelSize;
        int A0B2 = AnonymousClass7TE.A0B(resources);
        this.A06 = resources.getDimensionPixelSize(R.dimen.fundraiser_sticker_title_text_size);
        this.A0G = AnonymousClass7TE.A0G(resources);
        this.A05 = resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        this.A04 = resources.getDimensionPixelSize(R.dimen.challenge_sticker_button_text_size);
        this.A0E = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        this.A0F = AnonymousClass7TE.A0F(resources);
        this.A03 = resources.getDimensionPixelSize(R.dimen.challenge_sticker_v2_facepile_text_size);
        int i = A0B2 * 2;
        int i2 = dimensionPixelSize - i;
        C15839UjP ujP = new C15839UjP(context2);
        this.A0A = ujP;
        ujP.A0F(GradientDrawable.Orientation.TL_BR);
        ujP.setCallback(this);
        Drawable drawable = context2.getDrawable(R.drawable.smb_support_sticker_cta_background);
        if (drawable != null) {
            this.A0H = drawable;
            Drawable drawable2 = context2.getDrawable(R.drawable.fundraiser_white_sticker_donate_button_background);
            if (drawable2 != null) {
                this.A0I = drawable2;
                C363208jL r12 = new C363208jL(context2, (float) resources.getDimensionPixelSize(R.dimen.account_recs_header_image_margin), R.color.chat_sticker_button_divider_color, 80);
                this.A0J = r12;
                C306386Ly r13 = new C306386Ly(context2, i2);
                this.A0D = r13;
                C306386Ly r14 = new C306386Ly(context2, i2);
                this.A0C = r14;
                C306386Ly r15 = new C306386Ly(context2, i2);
                this.A0B = r15;
                AnonymousClass6M3 r1 = new AnonymousClass6M3(context2, this, -1);
                r1.A00 = 0nA.A09(context2) - i;
                r1.A01(2131974063);
                r1.A02(R.dimen.account_discovery_bottom_gap);
                AnonymousClass6M4 A002 = r1.A00();
                this.A09 = A002;
                Collections.addAll(arrayList, new Drawable[]{ujP, drawable, drawable2, r12, r13, r14, r15, A002});
                Context context3 = this.A08;
                C306386Ly r5 = this.A0D;
                AJB.A06(context3, r5, (float) this.A06, (float) this.A05);
                r5.A0F(-16777216);
                r5.setCallback(this);
                C306386Ly r16 = this.A0C;
                r16.A0C(0.0f, (float) this.A05);
                r16.A0A((float) this.A04);
                r16.A0F(-6710887);
                r16.setCallback(this);
                C306386Ly r17 = this.A0B;
                r17.A0J(Typeface.SANS_SERIF, A1Y ? 1 : 0);
                r17.A0A((float) this.A03);
                r17.A0F(-13068304);
                r17.setCallback(this);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final boolean A00() {
        C18603Vuw vuw = this.A00;
        if (vuw != null) {
            return AnonymousClass7TF.A1W(vuw.A01(), AnonymousClass05K.A0C);
        }
        0qQ.A0F("smbSupportStickerModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final List A07() {
        return this.A0K;
    }

    public final String C4F() {
        return this.A01;
    }

    public final int getIntrinsicHeight() {
        int i;
        int i2 = this.A0G;
        C306386Ly r1 = this.A0D;
        int i3 = this.A05;
        int i4 = ((i2 + r1.A06) - r1.A08) - i3;
        int i5 = this.A0A.A00;
        C18603Vuw vuw = this.A00;
        if (vuw != null) {
            String str = vuw.A00.A0D;
            boolean z = false;
            if (str == null || str.length() == 0) {
                z = true;
            }
            int i6 = 0;
            if (z) {
                i4 = 0;
            }
            int i7 = this.A0F;
            int i8 = i5 + i4 + this.A0E + i7;
            if (A00()) {
                return i8 + i7;
            }
            C306386Ly r4 = this.A0C;
            int i9 = (r4.A06 - i3) + i7;
            Context context = this.A08;
            C18603Vuw vuw2 = this.A00;
            if (vuw2 != null) {
                Float f = vuw2.A00.A02;
                if (f != null) {
                    i = (int) f.floatValue();
                } else {
                    i = 0;
                }
                0qQ.A0B(context, 0);
                int A032 = (int) (((float) i) * C13989Tnp.A03(context));
                int i10 = r4.A06;
                if (i10 < A032) {
                    i6 = A032 - i10;
                }
                return i8 + i9 + i6;
            }
        }
        0qQ.A0F("smbSupportStickerModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final int getIntrinsicWidth() {
        return this.A07;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5;
        float f;
        int i6 = i;
        super.setBounds(i6, i2, i3, i4);
        float f2 = ((float) (i + i3)) / 2.0f;
        float f3 = ((float) (i2 + i4)) / 2.0f;
        float f4 = ((float) this.A07) / 2.0f;
        float f5 = f2 - f4;
        float intrinsicHeight = ((float) getIntrinsicHeight()) / 2.0f;
        float f6 = f3 - intrinsicHeight;
        float f7 = f4 + f2;
        float f8 = f3 + intrinsicHeight;
        int i7 = this.A0E;
        int i8 = i7;
        float f9 = (float) i7;
        float f10 = (float) this.A0F;
        float f11 = (f8 - f9) - f10;
        float f12 = f9 + f11;
        float f13 = f10 + f5;
        float f14 = f7 - f10;
        float f15 = (f9 / 2.0f) + f11;
        C15839UjP ujP = this.A0A;
        int i9 = ujP.A00;
        C306386Ly r7 = this.A0D;
        int i10 = r7.A0A;
        int i11 = r7.A06;
        int i12 = r7.A08;
        int i13 = this.A0G;
        int i14 = ((i13 + i11) - i12) - this.A05;
        C306386Ly r3 = this.A0B;
        int i15 = r3.A0A;
        int i16 = r3.A06;
        int i17 = (int) f5;
        int i18 = (int) f7;
        ujP.setBounds(i17, (int) f6, i18, (int) f8);
        int i19 = 0;
        if (A00()) {
            i19 = i8;
        }
        C18603Vuw vuw = this.A00;
        if (vuw != null) {
            String str = vuw.A00.A0D;
            if (!(str == null || str.length() == 0)) {
                float A012 = C13988Tno.A01(i10);
                float f16 = ((float) i9) + f6;
                float f17 = (float) i12;
                r7.setBounds((int) (f2 - A012), (int) ((((float) i13) + f16) - f17), (int) (A012 + f2), (int) (f16 + ((float) i14) + f17 + ((float) i19)));
            }
            if (!A00()) {
                C306386Ly r72 = this.A0C;
                int i20 = r72.A0A;
                int i21 = r72.A06;
                Context context = this.A08;
                C18603Vuw vuw2 = this.A00;
                if (vuw2 != null) {
                    Float f18 = vuw2.A00.A02;
                    if (f18 != null) {
                        i5 = (int) f18.floatValue();
                    } else {
                        i5 = 0;
                    }
                    0qQ.A0B(context, 0);
                    int A032 = (int) (((float) i5) * C13989Tnp.A03(context));
                    if (i21 < A032) {
                        f = ((float) (A032 - i21)) / 2.0f;
                    } else {
                        f = 0.0f;
                    }
                    float f19 = ((float) i20) / 2.0f;
                    float f20 = f6 + ((float) i9) + ((float) i14);
                    r72.setBounds((int) (f2 - f19), (int) (f20 + f), (int) (f19 + f2), (int) (f20 + ((float) i21) + f));
                }
            }
            int i22 = (int) f11;
            this.A0J.setBounds(i17, i22, i18, i22);
            int i23 = (int) f13;
            int i24 = (int) f14;
            int i25 = (int) f12;
            this.A0H.setBounds(i23, i22, i24, i25);
            this.A0I.setBounds(i23, i22, i24, i25);
            float f21 = ((float) i15) / 2.0f;
            float f22 = ((float) i16) / 2.0f;
            r3.setBounds((int) (f2 - f21), (int) (f15 - f22), (int) (f2 + f21), (int) (f15 + f22));
            return;
        }
        0qQ.A0F("smbSupportStickerModel");
        throw AnonymousClass00P.createAndThrow();
    }
}
