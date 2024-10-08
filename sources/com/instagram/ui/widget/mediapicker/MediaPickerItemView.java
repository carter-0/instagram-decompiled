package com.instagram.ui.widget.mediapicker;

import X.0qQ;
import X.1NK;
import X.1OO;
import X.AnonymousClass0fD;
import X.AnonymousClass1MK;
import X.AnonymousClass5Ef;
import X.AnonymousClass7TE;
import X.AnonymousClass9I9;
import X.C321486uG;
import X.C348257y9;
import X.C348267yA;
import X.C348297yD;
import X.C355618Qr;
import X.C41814B1u;
import X.C59848JaO;
import X.C59897JbM;
import X.C59898JbN;
import X.C63465KxU;
import X.C64615Lez;
import X.C65795Lzn;
import X.C71382cm;
import X.DbW;
import X.DbY;
import X.JTO;
import X.JTP;
import X.JTT;
import X.MRF;
import X.MRG;
import X.MUN;
import X.U4J;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.gallery.Draft;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class MediaPickerItemView extends U4J implements C348257y9, C41814B1u {
    public static final int A0X;
    public static final Paint A0Y;
    public static final Paint A0Z;
    public static final Paint A0a = AnonymousClass7TE.A0V(2);
    public Bitmap A00;
    public Drawable A01;
    public AnonymousClass9I9 A02;
    public AnonymousClass5Ef A03;
    public GalleryItem A04;
    public MRF A05;
    public C59898JbN A06;
    public C59897JbM A07;
    public Float A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public Drawable A0D;
    public C348267yA A0E;
    public MRG A0F;
    public boolean A0G;
    public boolean A0H;
    public final Context A0I;
    public final int A0J;
    public final Bitmap A0K;
    public final Paint A0L;
    public final Paint A0M;
    public final Paint A0N;
    public final Paint A0O;
    public final Paint A0P;
    public final Paint A0Q;
    public final RectF A0R;
    public final AnonymousClass1MK A0S;
    public final AnonymousClass1MK A0T;
    public final C321486uG A0U;
    public final MUN A0V;
    public final boolean A0W;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MediaPickerItemView(Context context) {
        this(context, (MUN) null, true);
        0qQ.A0B(context, 1);
    }

    private final boolean A00(AnonymousClass9I9 r4, AnonymousClass5Ef r5, GalleryItem galleryItem, boolean z, boolean z2, boolean z3, boolean z4) {
        setEnabled(true);
        this.A0C = z;
        this.A0H = z2;
        this.A0B = z3;
        this.A0G = z4;
        C321486uG r1 = this.A0U;
        r1.A00(r4.A00 + 1);
        r1.A04 = r4.A02;
        r1.invalidateSelf();
        if (0qQ.A0K(r5.BJR(), this.A09) && this.A02 == r4) {
            return false;
        }
        this.A02 = r4;
        this.A04 = galleryItem;
        this.A00 = null;
        this.A09 = r5.BJR();
        this.A03 = r5;
        A02();
        setChecked(r4.A02);
        invalidate();
        return true;
    }

    public final void A03(AnonymousClass9I9 r18, C355618Qr r19, GalleryItem galleryItem, boolean z, boolean z2, boolean z3, boolean z4) {
        C355618Qr r9 = r19;
        GalleryItem galleryItem2 = galleryItem;
        DbW.A1N(galleryItem2, 0, r9);
        Medium medium = galleryItem2.A00;
        if (medium != null) {
            A00(r18, medium, galleryItem2, z, z2, z3, z4);
            this.A0E = r9.AGH((C348297yD) null, this.A0E, medium, this, (Integer) null, (Integer) null, (Integer) null);
            invalidate();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A04(AnonymousClass9I9 r12, GalleryItem galleryItem, MRF mrf, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        String str;
        AnonymousClass1MK lez;
        this.A05 = mrf;
        GalleryItem galleryItem2 = galleryItem;
        RemoteMedia remoteMedia = galleryItem.A04;
        if (remoteMedia != null) {
            boolean A002 = A00(r12, remoteMedia, galleryItem2, z, false, z2, false);
            if (z6 || A002) {
                this.A0A = true;
                1OO A0J2 = 1NK.A00().A0J(remoteMedia.A03, (String) null);
                A0J2.A0I = false;
                A0J2.A0L = z3;
                if (z5) {
                    str = remoteMedia.A06;
                } else {
                    str = null;
                }
                A0J2.A08 = str;
                if (z4) {
                    lez = this.A0S;
                } else {
                    lez = new C64615Lez(this, 8);
                }
                A0J2.A02(lez);
                A0J2.A01();
            }
            invalidate();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final boolean CWP(Medium medium) {
        0qQ.A0B(medium, 0);
        AnonymousClass5Ef r2 = this.A03;
        if (r2 == null || !0qQ.A0K(String.valueOf(medium.A05), r2.BJR())) {
            return false;
        }
        return true;
    }

    public final void DLY(Medium medium, String str) {
        0qQ.A0B(medium, 0);
        if (0qQ.A0K(String.valueOf(medium.A05), this.A09)) {
            this.A00 = null;
            invalidate();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0175  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r19) {
        /*
            r18 = this;
            r5 = 0
            r12 = r19
            X.0qQ.A0B(r12, r5)
            r3 = r18
            super.onDraw(r12)
            com.instagram.common.gallery.model.GalleryItem r0 = r3.A04
            java.lang.String r6 = "Required value was null."
            if (r0 == 0) goto L_0x0272
            android.graphics.Bitmap r10 = r3.A00
            java.lang.Integer r1 = r0.A09
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r4 = 2
            if (r1 != r0) goto L_0x007a
            if (r10 == 0) goto L_0x0079
            int r7 = r12.getHeight()
            int r7 = r7 / r4
            int r0 = r10.getHeight()
            int r0 = r0 / r4
            int r7 = r7 - r0
            int r1 = r12.getWidth()
            int r1 = r1 / r4
            int r0 = r10.getWidth()
            int r0 = r0 / r4
            int r1 = r1 - r0
            android.graphics.RectF r6 = r3.A0R
            float r5 = (float) r1
            float r2 = (float) r7
            int r0 = r10.getWidth()
            int r1 = r1 + r0
            float r1 = (float) r1
            int r0 = r10.getHeight()
            int r7 = r7 + r0
            float r0 = (float) r7
            r6.set(r5, r2, r1, r0)
            android.content.Context r2 = r3.A0I
            r0 = 2130970187(0x7f04064b, float:1.7549077E38)
            int r0 = X.AnonymousClass7TF.A03(r2, r0)
            r12.drawColor(r0)
            r1 = 0
            android.graphics.Paint r0 = A0a
            r12.drawBitmap(r10, r1, r6, r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            int r6 = r1.getDimensionPixelOffset(r0)
            r0 = 2131954541(0x7f130b6d, float:1.9545584E38)
            java.lang.String r5 = r2.getString(r0)
            float r2 = (float) r6
            int r1 = r3.getHeight()
            int r0 = r3.A0J
            int r0 = r0 / r4
            int r1 = r1 - r0
            int r1 = r1 - r6
            float r1 = (float) r1
            android.graphics.Paint r0 = r3.A0M
            r12.drawText(r5, r2, r1, r0)
        L_0x0079:
            return
        L_0x007a:
            X.9I9 r2 = r3.A02
            X.5Ef r8 = r3.A03
            if (r2 == 0) goto L_0x026b
            if (r10 == 0) goto L_0x024f
            if (r8 == 0) goto L_0x0266
            int r0 = r12.getWidth()
            float r6 = (float) r0
            float r0 = X.JTO.A02(r10)
            float r6 = r6 / r0
            int r0 = r12.getHeight()
            float r1 = (float) r0
            float r0 = X.JTO.A01(r10)
            float r1 = r1 / r0
            float r7 = java.lang.Math.max(r6, r1)
            float r6 = X.JTO.A02(r10)
            float r6 = r6 * r7
            float r0 = X.JTO.A01(r10)
            float r7 = r7 * r0
            int r0 = r12.getWidth()
            float r1 = (float) r0
            float r1 = r1 - r6
            r11 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r11
            int r0 = r12.getHeight()
            float r0 = (float) r0
            float r0 = r0 - r7
            float r0 = r0 / r11
            android.graphics.RectF r9 = r3.A0R
            float r6 = r6 + r1
            float r7 = r7 + r0
            r9.set(r1, r0, r6, r7)
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x01be
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x01be
            int r0 = r8.Boe()
            android.graphics.Paint r7 = A0a
            r12.save()
            float r6 = (float) r0
            int r0 = r12.getWidth()
            float r1 = (float) r0
            float r1 = r1 / r11
            int r0 = r12.getHeight()
            float r0 = (float) r0
            float r0 = r0 / r11
            r12.rotate(r6, r1, r0)
            r0 = 0
            r12.drawBitmap(r10, r0, r9, r7)
            r12.restore()
        L_0x00e5:
            X.6uG r7 = r3.A0U
            int r6 = r7.A07
            boolean r0 = r8.COf()
            if (r0 == 0) goto L_0x018c
            android.graphics.Bitmap r9 = r3.A0K
            int r1 = r12.getWidth()
            int r0 = r9.getWidth()
            int r1 = r1 - r0
            float r7 = (float) r1
            r1 = 0
            android.graphics.Paint r0 = r3.A0L
            r12.drawBitmap(r9, r7, r1, r0)
        L_0x0101:
            boolean r0 = r8.CeS()
            if (r0 == 0) goto L_0x0122
            int r0 = r8.getDuration()
            if (r0 <= 0) goto L_0x0122
            java.lang.String r8 = r8.B8E()
            int r0 = r12.getWidth()
            int r0 = r0 - r6
            float r7 = (float) r0
            int r0 = r12.getHeight()
            int r0 = r0 - r6
            float r1 = (float) r0
            android.graphics.Paint r0 = r3.A0Q
            r12.drawText(r8, r7, r1, r0)
        L_0x0122:
            X.JbN r7 = r3.A06
            X.JbN r0 = X.C59898JbN.GLASSES_CAPTURE
            r1 = 12
            if (r7 != r0) goto L_0x012c
            r1 = 16
        L_0x012c:
            android.content.Context r0 = r3.A0I
            int r9 = X.DbS.A02(r0, r1)
            android.graphics.drawable.Drawable r8 = r3.A0D
            if (r8 == 0) goto L_0x0145
            int r7 = r3.getHeight()
            int r7 = r7 - r6
            int r1 = r7 - r9
            int r0 = r6 + r9
            r8.setBounds(r6, r1, r0, r7)
            r8.draw(r12)
        L_0x0145:
            android.graphics.drawable.Drawable r0 = r3.A01
            if (r0 == 0) goto L_0x0150
            int r9 = r9 + r6
            r0.setBounds(r6, r6, r9, r9)
            r0.draw(r12)
        L_0x0150:
            X.JbM r0 = r3.A07
            int r0 = r0.ordinal()
            if (r0 == r5) goto L_0x017e
            if (r0 != r4) goto L_0x016d
            r13 = 0
            int r0 = r12.getWidth()
            float r15 = (float) r0
            int r0 = r12.getHeight()
            float r0 = (float) r0
            android.graphics.Paint r17 = A0Y
        L_0x0167:
            r14 = r13
            r16 = r0
            r12.drawRect(r13, r14, r15, r16, r17)
        L_0x016d:
            boolean r1 = r2.A02
            boolean r0 = r3.isChecked()
            if (r1 == r0) goto L_0x017a
            boolean r0 = r2.A02
            r3.setChecked(r0)
        L_0x017a:
            r3.A02()
            return
        L_0x017e:
            r13 = 0
            int r0 = r12.getWidth()
            float r15 = (float) r0
            int r0 = r12.getHeight()
            float r0 = (float) r0
            android.graphics.Paint r17 = A0Z
            goto L_0x0167
        L_0x018c:
            boolean r0 = r3.A0C
            if (r0 == 0) goto L_0x0101
            boolean r0 = r3.A0H
            if (r0 != 0) goto L_0x0101
            X.JbM r1 = r3.A07
            X.JbM r0 = X.C59897JbM.DISABLED
            if (r1 == r0) goto L_0x0101
            int r1 = r7.A00
            int r0 = r7.A06
            int r1 = r1 + r0
            r7.setBounds(r5, r5, r1, r1)
            r12.save()
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x01b7
            r0 = r6
        L_0x01aa:
            float r1 = (float) r0
            float r0 = (float) r6
            r12.translate(r1, r0)
            r7.draw(r12)
            r12.restore()
            goto L_0x0101
        L_0x01b7:
            int r0 = r12.getWidth()
            int r0 = r0 - r1
            int r0 = r0 - r6
            goto L_0x01aa
        L_0x01be:
            int r1 = r8.Boe()
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x024c
            boolean r0 = r3.A0G
            if (r0 != 0) goto L_0x024c
            boolean r0 = r3.A0H
            if (r0 != 0) goto L_0x024c
            android.graphics.Paint r7 = A0a
        L_0x01d0:
            r12.save()
            float r6 = (float) r1
            int r0 = r12.getWidth()
            float r1 = (float) r0
            float r1 = r1 / r11
            int r0 = r12.getHeight()
            float r0 = (float) r0
            float r0 = r0 / r11
            r12.rotate(r6, r1, r0)
            r0 = 0
            r12.drawBitmap(r10, r0, r9, r7)
            r12.restore()
            android.graphics.Paint r1 = r3.A0P
            r0 = -1
            r1.setColor(r0)
            r13 = 0
            int r0 = r12.getWidth()
            float r15 = (float) r0
            int r0 = r12.getHeight()
            float r0 = (float) r0
            r14 = r13
            r17 = r1
            r16 = r0
            r12.drawRect(r13, r14, r15, r16, r17)
            boolean r0 = r3.A0G
            if (r0 == 0) goto L_0x00e5
            android.content.Context r1 = r3.A0I
            r0 = 2131238108(0x7f081cdc, float:1.8092485E38)
            android.graphics.drawable.Drawable r10 = r1.getDrawable(r0)
            if (r10 == 0) goto L_0x00e5
            android.content.Context r1 = r3.getContext()
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            X.DbX.A11(r1, r10, r0)
            int r9 = r12.getWidth()
            int r0 = r10.getIntrinsicWidth()
            int r9 = r9 - r0
            int r9 = r9 / r4
            int r7 = r12.getHeight()
            int r0 = r10.getIntrinsicHeight()
            int r7 = r7 - r0
            int r7 = r7 / r4
            int r6 = r12.getWidth()
            int r0 = r10.getIntrinsicWidth()
            int r6 = r6 + r0
            int r6 = r6 / r4
            int r1 = r12.getHeight()
            int r0 = r10.getIntrinsicHeight()
            int r1 = r1 + r0
            int r1 = r1 / r4
            r10.setBounds(r9, r7, r6, r1)
            r10.draw(r12)
            goto L_0x00e5
        L_0x024c:
            android.graphics.Paint r7 = r3.A0O
            goto L_0x01d0
        L_0x024f:
            r13 = 0
            int r0 = r12.getWidth()
            float r15 = (float) r0
            int r0 = r12.getHeight()
            float r1 = (float) r0
            android.graphics.Paint r0 = r3.A0N
            r14 = r13
            r17 = r0
            r16 = r1
            r12.drawRect(r13, r14, r15, r16, r17)
            goto L_0x0150
        L_0x0266:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        L_0x026b:
            java.lang.String r0 = "State is null. Make sure bind() has been called."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0272:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.mediapicker.MediaPickerItemView.onDraw(android.graphics.Canvas):void");
    }

    public final void setBottomLeftIcon(C59898JbN jbN) {
        0qQ.A0B(jbN, 0);
        Integer A002 = C63465KxU.A00(jbN);
        Drawable drawable = null;
        if (A002 != null) {
            drawable = JTP.A0E(this.A0I, A002);
            JTT.A10(drawable, this);
        }
        this.A0D = drawable;
    }

    public final void setRemoteMediaImageLoadListener(MRG mrg) {
        0qQ.A0B(mrg, 0);
        this.A0F = mrg;
    }

    public final void setTopLeftIcon(C59898JbN jbN) {
        0qQ.A0B(jbN, 0);
        this.A06 = jbN;
        Integer A002 = C63465KxU.A00(jbN);
        Drawable drawable = null;
        boolean z = true;
        if (A002 != null) {
            drawable = JTP.A0E(this.A0I, A002);
            z = true ^ 0qQ.A0K(this.A01, drawable);
            JTT.A10(drawable, this);
        } else if (this.A01 == null) {
            z = false;
        }
        this.A01 = drawable;
        if (z) {
            invalidate();
        }
    }

    public final void setViewRenderMode(C59897JbM jbM) {
        0qQ.A0B(jbM, 0);
        if (this.A07 != jbM) {
            this.A07 = jbM;
            invalidate();
        }
        if (jbM == C59897JbM.DISABLED) {
            setEnabled(false);
        }
    }

    public final void toggle() {
    }

    static {
        int argb = Color.argb(204, 255, 255, 255);
        A0X = argb;
        Paint A0C2 = JTO.A0C();
        A0Y = A0C2;
        Paint A0C3 = JTO.A0C();
        A0Z = A0C3;
        Paint.Style style = Paint.Style.FILL;
        A0C3.setStyle(style);
        A0C3.setColor(argb);
        A0C2.setStyle(style);
        A0C2.setColor(Color.argb(180, 147, 147, 147));
    }

    private final AnonymousClass1MK getBindRemoteMediaCallback() {
        return new C64615Lez(this, 8);
    }

    private final AnonymousClass1MK getBindScheduledContentMediaCallback() {
        return new C64615Lez(this, 9);
    }

    public final void A01() {
        AnonymousClass9I9 r2 = this.A02;
        if (r2 != null) {
            C321486uG r0 = this.A0U;
            r0.A04 = false;
            r0.invalidateSelf();
            if (r2.A02) {
                r2.A02 = false;
                r2.A01--;
                invalidate();
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0z("State is null. Make sure bind() has been called.");
    }

    public final void A02() {
        GalleryItem galleryItem = this.A04;
        if (galleryItem != null) {
            AnonymousClass9I9 r0 = this.A02;
            if (r0 != null) {
                setContentDescription(C59848JaO.A00(AnonymousClass7TE.A0S(this), galleryItem.A00, r0.A00, r0.A01, galleryItem.A01(), galleryItem.A06(), this.A0C));
                return;
            }
            throw AnonymousClass7TE.A0z("State is null. Make sure bind() has been called.");
        }
    }

    public final boolean CWO(Draft draft) {
        AnonymousClass5Ef r0 = this.A03;
        if (r0 == null || !0qQ.A0K(draft.A04, r0.BJR())) {
            return false;
        }
        return true;
    }

    public final void DrR(Bitmap bitmap, Draft draft) {
        if (0qQ.A0K(draft.A04, this.A09)) {
            this.A00 = bitmap;
            invalidate();
        }
    }

    public final void setSelectedIndex(int i) {
        AnonymousClass9I9 r3 = this.A02;
        if (r3 != null) {
            C321486uG r2 = this.A0U;
            r2.A04 = true;
            r2.invalidateSelf();
            r2.A00(i + 1);
            if (!r3.A02 || r3.A00 != i) {
                r3.A02 = true;
                r3.A00 = i;
                r3.A01++;
                invalidate();
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0z("State is null. Make sure bind() has been called.");
    }

    public final void DrQ(Bitmap bitmap, Medium medium, boolean z) {
        DbY.A1S(medium, bitmap);
        if (0qQ.A0K(String.valueOf(medium.A05), this.A09)) {
            this.A00 = bitmap;
            invalidate();
        }
    }

    public final void onMeasure(int i, int i2) {
        int A062 = AnonymousClass0fD.A06(1222199543);
        Float f = this.A08;
        if (f == null) {
            if (this.A0W) {
                i2 = i;
            }
            super.onMeasure(i, i2);
        } else {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i);
            View.MeasureSpec.getSize(i2);
            setMeasuredDimension(size, (int) (((float) size2) / f.floatValue()));
        }
        AnonymousClass0fD.A0D(-556041658, A062);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MediaPickerItemView(Context context, MUN mun, float f) {
        this(context, (AttributeSet) null, mun, false, Float.valueOf(f));
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaPickerItemView(Context context, AttributeSet attributeSet, MUN mun, boolean z, Float f) {
        super(context, attributeSet, R.attr.mediaPickerItemStyle);
        0qQ.A0B(context, 1);
        this.A0I = context;
        this.A0V = mun;
        this.A0W = z;
        this.A07 = C59897JbM.ENABLE;
        this.A06 = C59898JbN.A06;
        this.A08 = f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A1j, R.attr.mediaPickerItemStyle, 0);
        0qQ.A07(obtainStyledAttributes);
        int color = obtainStyledAttributes.getColor(0, -12303292);
        int color2 = obtainStyledAttributes.getColor(2, Color.argb(200, 0, 0, 0));
        Resources resources = getResources();
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(3, AnonymousClass7TE.A0H(resources));
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
        Paint A0C2 = JTO.A0C();
        this.A0N = A0C2;
        AnonymousClass7TE.A1Q(A0C2);
        A0C2.setColor(color);
        Paint A0V2 = AnonymousClass7TE.A0V(2);
        this.A0O = A0V2;
        A0V2.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_ATOP));
        Paint A0C3 = JTO.A0C();
        this.A0P = A0C3;
        JTO.A1N(A0C3);
        A0C3.setStrokeWidth((float) dimensionPixelOffset);
        Paint A0V3 = AnonymousClass7TE.A0V(1);
        this.A0Q = A0V3;
        A0V3.setColor(-1);
        A0V3.setTextAlign(Paint.Align.RIGHT);
        A0V3.setTextSize(AnonymousClass7TE.A01(resources, R.dimen.button_text_size));
        Paint A0V4 = AnonymousClass7TE.A0V(1);
        this.A0M = A0V4;
        A0V4.setColor(-1);
        A0V4.setTextAlign(Paint.Align.LEFT);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.auth_edit_field_text_size);
        this.A0J = dimensionPixelSize;
        A0V4.setTextSize((float) dimensionPixelSize);
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, R.drawable.filled_grid_album_icon);
        if (decodeResource != null) {
            this.A0K = decodeResource;
            this.A0L = AnonymousClass7TE.A0V(2);
            this.A0D = null;
            this.A01 = null;
            this.A0U = new C321486uG(context);
            this.A0R = AnonymousClass7TE.A0Y();
            this.A0F = new C65795Lzn();
            this.A0S = new C64615Lez(this, 8);
            this.A0T = new C64615Lez(this, 9);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MediaPickerItemView(Context context, MUN mun) {
        this(context, mun, true);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MediaPickerItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (MUN) null, true, (Float) null);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MediaPickerItemView(Context context, MUN mun, boolean z) {
        this(context, (AttributeSet) null, mun, z, (Float) null);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MediaPickerItemView(Context context, MUN mun, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : mun, (i & 4) != 0 ? true : z);
    }
}
