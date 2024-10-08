package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.7jB  reason: invalid class name and case insensitive filesystem */
public final class C339177jB extends C268694dq {
    public float A00;
    public final int A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final Drawable A07;
    public final PromptStickerModel A08;
    public final C306386Ly A09;
    public final String A0A;
    public final List A0B;

    public C339177jB(Context context, PromptStickerModel promptStickerModel, Integer num, String str, float f, int i, int i2, int i3) {
        int i4;
        C306386Ly r4;
        0qQ.A0B(context, 1);
        String str2 = str;
        0qQ.A0B(str2, 2);
        0qQ.A0B(promptStickerModel, 3);
        Integer num2 = num;
        0qQ.A0B(num2, 4);
        this.A06 = context;
        this.A0A = str2;
        this.A08 = promptStickerModel;
        int i5 = i;
        this.A04 = i5;
        this.A03 = i2;
        this.A05 = i3;
        this.A02 = f;
        this.A00 = 0.3f;
        Resources resources = context.getResources();
        int intValue = num2.intValue();
        if (intValue == 0) {
            i4 = R.dimen.abc_alert_dialog_button_dimen;
        } else if (intValue == 1) {
            i4 = R.dimen.abc_select_dialog_padding_start_material;
        } else if (intValue == 2) {
            i4 = R.dimen.asset_picker_section_title_horizontal_padding;
        } else {
            throw new RuntimeException();
        }
        this.A01 = resources.getDimensionPixelSize(i4);
        C339187jC r0 = new C339187jC(context, num2, i5, R.drawable.instagram_reply_pano_filled_24);
        r0.setCallback(this);
        this.A07 = r0;
        List B3f = promptStickerModel.A00.B3f();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object next : B3f) {
            if (hashSet.add(((User) next).getId())) {
                arrayList.add(next);
            }
        }
        List<User> A0d = 00k.A0d(arrayList, this.A03);
        ArrayList arrayList2 = new ArrayList(0Yv.A1E(A0d, 10));
        for (User Bh3 : A0d) {
            int i6 = this.A01;
            int dimensionPixelSize = this.A06.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material);
            int i7 = this.A04;
            Context context2 = this.A06;
            C244303ay r6 = new C244303ay(Bh3.Bh3(), this.A0A, i6, dimensionPixelSize, i7, context2.getColor(2Yu.A0H(context2, R.attr.igds_color_secondary_icon)));
            r6.setCallback(this);
            arrayList2.add(r6);
        }
        this.A0B = arrayList2;
        if (this.A08.A00.Bak() > this.A03) {
            Integer valueOf = Integer.valueOf(this.A08.A00.Bak() - this.A03);
            Resources resources2 = this.A06.getResources();
            0qQ.A07(resources2);
            String A042 = C253673rC.A04(resources2, valueOf, IgNetworkConsentStorage.MAX_ENTRIES, false, false);
            Spannable spannable = C306386Ly.A0d;
            Context context3 = this.A06;
            r4 = new C306386Ly(context3, context3.getResources().getDimensionPixelSize(R.dimen.browser_error_screen_description_width));
            r4.A0M(002.A0D(A042, '+'));
            Integer num3 = AnonymousClass05K.A01;
            Context context4 = r4.A0Z;
            0qQ.A07(context4);
            C339207jE.A00(context4, AnonymousClass0qo.A00(context4).A02(0qm.A13), r4, num3);
            r4.A0F(context4.getColor(R.color.baseline_neutral_80));
            r4.A0A(this.A02);
            r4.setCallback(this);
        } else {
            r4 = null;
        }
        this.A09 = r4;
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        C306386Ly r2 = this.A09;
        if (r2 != null && r2.getBounds().left > this.A07.getBounds().left) {
            r2.draw(canvas);
        }
        List<Drawable> A0Y = 00k.A0Y(this.A0B);
        ArrayList arrayList = new ArrayList(0Yv.A1E(A0Y, 10));
        for (Drawable draw : A0Y) {
            draw.draw(canvas);
            arrayList.add(C60340gF.A00);
        }
        if (!this.A08.A09) {
            this.A07.draw(canvas);
        }
    }

    public final List A07() {
        ArrayList A1M = 0sr.A1M(new Drawable[]{this.A07});
        A1M.addAll(this.A0B);
        C306386Ly r0 = this.A09;
        if (r0 != null) {
            A1M.add(r0);
        }
        return A1M;
    }

    public final int A08() {
        int i;
        C306386Ly r0 = this.A09;
        if (r0 == null) {
            i = 0;
        } else {
            i = r0.A0A + this.A05;
        }
        return (int) ((((float) this.A01) * ((((float) this.A0B.size()) * 0.7f) + 1.0f)) + ((float) i));
    }

    public final void A09(float f) {
        this.A00 = f;
        setBounds(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
    }

    public final int getIntrinsicHeight() {
        return this.A01;
    }

    public final int getIntrinsicWidth() {
        int i = this.A01;
        List list = this.A0B;
        float size = ((float) ((list.size() + 1) * i)) - ((((float) i) * this.A00) * ((float) list.size()));
        C306386Ly r0 = this.A09;
        if (r0 != null) {
            size += ((float) (this.A05 + r0.A0A)) * ((1.0f - this.A00) / 0.7f);
        }
        return (int) size;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        float intrinsicWidth = f - (((float) getIntrinsicWidth()) / 2.0f);
        int i5 = this.A01;
        float f3 = (float) i5;
        float f4 = f3 / 2.0f;
        float intrinsicWidth2 = f + (((float) getIntrinsicWidth()) / 2.0f);
        int i6 = (int) intrinsicWidth;
        int i7 = (int) (f2 - f4);
        int i8 = (int) (f4 + f2);
        this.A07.setBounds(i6, i7, i5 + i6, i8);
        List list = this.A0B;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        int i9 = 0;
        for (Object next : list) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            float f5 = (((float) (i10 * i5)) * (1.0f - this.A00)) + intrinsicWidth;
            ((Drawable) next).setBounds((int) f5, i7, (int) (f5 + f3), i8);
            arrayList.add(C60340gF.A00);
            i9 = i10;
        }
        C306386Ly r5 = this.A09;
        if (r5 != null) {
            int i11 = (int) (intrinsicWidth2 - ((float) r5.A0A));
            float f6 = (float) (r5.A06 / 2);
            r5.setBounds(i11, (int) (f2 - f6), (int) intrinsicWidth2, (int) (f2 + f6));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C339177jB(android.content.Context r12, com.instagram.reels.prompt.model.PromptStickerModel r13, java.lang.Integer r14, java.lang.String r15, int r16, int r17, int r18) {
        /*
            r11 = this;
            r2 = r18
            r9 = r17
            r8 = r16
            r5 = r14
            r0 = r18 & 8
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
        L_0x000d:
            r0 = r18 & 16
            if (r0 == 0) goto L_0x0012
            r8 = -1
        L_0x0012:
            r0 = r18 & 32
            r4 = r13
            if (r0 == 0) goto L_0x001f
            boolean r0 = r13.A0M()
            r9 = 3
            if (r0 == 0) goto L_0x001f
            r9 = 2
        L_0x001f:
            r0 = r18 & 64
            r3 = r12
            if (r0 == 0) goto L_0x0047
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            int r10 = r1.getDimensionPixelSize(r0)
        L_0x002f:
            r0 = r2 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0045
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r7 = (float) r0
        L_0x003f:
            r2 = r11
            r6 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x0045:
            r7 = 0
            goto L_0x003f
        L_0x0047:
            r10 = 0
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C339177jB.<init>(android.content.Context, com.instagram.reels.prompt.model.PromptStickerModel, java.lang.Integer, java.lang.String, int, int, int):void");
    }
}
