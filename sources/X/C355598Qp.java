package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Qp  reason: invalid class name and case insensitive filesystem */
public final class C355598Qp extends 2Rw {
    public final int A00;
    public final int A01;
    public final Adapter A02;
    public final C328787Gf A03;
    public final C329077Hm A04;
    public final boolean A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final C355568Qm A09;
    public final C355638Qt A0A = new C355638Qt(1);
    public final AnonymousClass0iw A0B;
    public final C355618Qr A0C;
    public final AnonymousClass8QZ A0D;
    public final C355448Qa A0E;
    public final C355628Qs A0F;
    public final Integer A0G;
    public final Integer A0H;
    public final C62320sa A0I;

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009a, code lost:
        if (r10.A05 == false) goto L_0x009c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.C249703kE r11, int r12) {
        /*
            r10 = this;
            r4 = 0
            X.0qQ.A0B(r11, r4)
            int r6 = r10.getItemViewType(r12)
            r0 = 4
            if (r6 != r0) goto L_0x002e
            X.9Ye r11 = (X.C380439Ye) r11
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r1 = r11.A01
            android.content.Context r2 = r1.getContext()
            r0 = 2131100677(0x7f060405, float:1.7813742E38)
            int r0 = r2.getColor(r0)
            r1.setPlaceHolderColor(r0)
            com.instagram.common.ui.base.IgSimpleImageView r1 = r11.A00
            r0 = 2131100036(0x7f060184, float:1.7812442E38)
            int r0 = r2.getColor(r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r1.setColorFilter(r0)
            return
        L_0x002e:
            X.7Gf r9 = r10.A03
            int r0 = r9.getCount()
            if (r12 >= r0) goto L_0x00e9
            if (r12 < 0) goto L_0x00e9
            X.9SZ r3 = r9.BJM(r12)
            com.instagram.common.gallery.model.GalleryItem r2 = r3.A01
            r5 = 5
            java.lang.String r1 = "Required value was null."
            if (r6 == 0) goto L_0x0080
            r0 = 1
            if (r6 == r0) goto L_0x0073
            r0 = 2
            if (r6 == r0) goto L_0x0066
            r0 = 3
            if (r6 == r0) goto L_0x0059
            if (r6 == r5) goto L_0x00a3
            r0 = 6
            if (r6 == r0) goto L_0x0059
            java.lang.String r1 = "Unknown item type"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0059:
            r8 = r11
            X.9Yu r8 = (X.C380599Yu) r8
            com.instagram.common.typedurl.ImageUrl r7 = r2.A06
            if (r7 != 0) goto L_0x008d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0066:
            r8 = r11
            X.9Yu r8 = (X.C380599Yu) r8
            X.7zv r7 = r2.A08
            if (r7 != 0) goto L_0x008d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0073:
            r8 = r11
            X.9Yu r8 = (X.C380599Yu) r8
            X.8Cl r7 = r2.A07
            if (r7 != 0) goto L_0x008d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0080:
            r8 = r11
            X.9Yu r8 = (X.C380599Yu) r8
            com.instagram.common.gallery.Medium r7 = r2.A00
            if (r7 != 0) goto L_0x008d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x008d:
            android.graphics.Bitmap r2 = r9.BxA(r12)
            int r0 = r9.Brp()
            if (r12 != r0) goto L_0x009c
            boolean r0 = r10.A05
            r1 = 1
            if (r0 != 0) goto L_0x009d
        L_0x009c:
            r1 = 0
        L_0x009d:
            X.0iw r0 = r10.A0B
            r8.A00(r2, r0, r7, r1)
            goto L_0x00bb
        L_0x00a3:
            r1 = r11
            X.9Yd r1 = (X.C380429Yd) r1
            int r0 = r2.A01
            com.instagram.common.ui.base.IgTextView r2 = r1.A00
            float r1 = (float) r0
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.String r0 = "%.1f"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r1)
            r2.setText(r0)
        L_0x00bb:
            android.view.View r1 = r11.itemView
            r0 = 2131439813(0x7f0b30c5, float:1.8501592E38)
            android.view.View r1 = r1.findViewById(r0)
            if (r6 == r5) goto L_0x00e2
            X.0sa r0 = r10.A0I
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00e2
            if (r1 == 0) goto L_0x00e9
            r1.setVisibility(r4)
            X.AO5 r0 = new X.AO5
            r0.<init>(r3, r10, r12)
            X.AnonymousClass0fU.A00(r0, r1)
            return
        L_0x00e2:
            if (r1 == 0) goto L_0x00e9
            r0 = 8
            r1.setVisibility(r0)
        L_0x00e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C355598Qp.onBindViewHolder(X.3kE, int):void");
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        C249703kE r3;
        0qQ.A0B(viewGroup, 0);
        if (i != 4) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            if (i != 5) {
                View inflate = from.inflate(R.layout.media_thumbnail_tray_item, viewGroup, false);
                View findViewById = inflate.findViewById(R.id.thumbnail_image);
                0qQ.A07(findViewById);
                int i2 = this.A01;
                0nA.A0f(findViewById, i2);
                View findViewById2 = inflate.findViewById(R.id.thumbnail_image);
                0qQ.A07(findViewById2);
                int i3 = this.A00;
                0nA.A0V(findViewById2, i3);
                0nA.A0i(inflate, this.A07, this.A06);
                Integer num = this.A0H;
                if (num != null) {
                    0nA.A0a(inflate, num.intValue());
                }
                Integer num2 = this.A0G;
                if (num2 != null) {
                    0nA.A0Y(inflate, num2.intValue());
                }
                if (i == 0) {
                    r3 = new C388739oJ(inflate, this.A09, this.A0C, this.A0E);
                } else if (i == 1) {
                    r3 = new C388719oH(inflate, this.A09, this.A0E, i2, i3);
                } else if (i == 2) {
                    C355628Qs r2 = this.A0F;
                    r3 = new C388729oI(inflate, this.A09, this.A0E, r2);
                } else if (i == 3 || i == 6) {
                    r3 = new C380599Yu(inflate, this.A09, this.A0E);
                } else {
                    throw new UnsupportedOperationException("Unknown item type");
                }
                return r3;
            }
            View inflate2 = from.inflate(R.layout.media_thumbnail_tray_empty_item, viewGroup, false);
            View findViewById3 = inflate2.findViewById(R.id.thumbnail_image);
            0qQ.A07(findViewById3);
            0nA.A0f(findViewById3, this.A01);
            0nA.A0i(inflate2, this.A07, this.A06);
            return new C380429Yd(inflate2);
        }
        View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.media_thumbnail_tray_plus_item, viewGroup, false);
        View findViewById4 = inflate3.findViewById(R.id.background_image_view);
        0qQ.A07(findViewById4);
        0nA.A0f(findViewById4, this.A01);
        0nA.A0i(inflate3, this.A07, this.A06);
        return new C380439Ye(inflate3, this.A0D);
    }

    public C355598Qp(Context context, Adapter adapter, C355568Qm r12, AnonymousClass0iw r13, UserSession userSession, C328787Gf r15, AnonymousClass8QZ r16, C355448Qa r17, C329077Hm r18, Integer num, Integer num2, C62320sa r21, float f, int i, int i2, int i3, boolean z) {
        0qQ.A0B(r13, 3);
        this.A08 = context;
        this.A0B = r13;
        this.A03 = r15;
        this.A0E = r17;
        this.A0D = r16;
        this.A09 = r12;
        this.A05 = z;
        this.A07 = i2;
        this.A06 = i3;
        this.A0H = num;
        this.A0G = num2;
        this.A0I = r21;
        this.A04 = r18;
        this.A02 = adapter;
        int i4 = i - (i3 + i2);
        this.A00 = i4;
        int A012 = AnonymousClass1GB.A01(((float) i4) * f);
        this.A01 = A012;
        this.A0C = new C355608Qq(context, userSession, AnonymousClass05K.A00, A012, i4, false);
        this.A0F = new C355628Qs(context, userSession, A012, i4);
    }

    public final int getItemCount() {
        int i;
        int A032 = AnonymousClass0fD.A03(1425947325);
        AnonymousClass8QZ r2 = this.A0D;
        int count = this.A03.getCount();
        if (r2 != null) {
            count += r2.A0D ? 1 : 0;
            i = -368210418;
        } else {
            i = 1707148407;
        }
        AnonymousClass0fD.A0A(i, A032);
        return count;
    }

    public final long getItemId(int i) {
        long j;
        int A032 = AnonymousClass0fD.A03(1581723580);
        C328787Gf r2 = this.A03;
        if (i >= r2.getCount() || i < 0) {
            j = 0;
        } else {
            j = this.A0A.A00(r2.BJM(i).A01.A0A);
        }
        AnonymousClass0fD.A0A(-2099080966, A032);
        return j;
    }

    public final int getItemViewType(int i) {
        int i2;
        int i3;
        int A032 = AnonymousClass0fD.A03(1348447289);
        if (getItemId(i) == 0) {
            i2 = 4;
            i3 = -1604115487;
        } else {
            switch (this.A03.BJM(i).A01.A09.intValue()) {
                case 0:
                    i2 = 0;
                    break;
                case 2:
                    i2 = 6;
                    break;
                case 5:
                    i2 = 1;
                    break;
                case 6:
                    i2 = 2;
                    break;
                case 7:
                    i2 = 3;
                    break;
                case 8:
                    i2 = 5;
                    break;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unknown item type");
                    AnonymousClass0fD.A0A(332639428, A032);
                    throw unsupportedOperationException;
            }
            i3 = -1178385844;
        }
        AnonymousClass0fD.A0A(i3, A032);
        return i2;
    }
}
