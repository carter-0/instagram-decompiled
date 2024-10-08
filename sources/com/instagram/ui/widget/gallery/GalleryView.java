package com.instagram.ui.widget.gallery;

import X.0fE;
import X.0hq;
import X.0mE;
import X.0qQ;
import X.1DN;
import X.2Cn;
import X.AnonymousClass07i;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass8XO;
import X.AnonymousClass8XZ;
import X.C252063oV;
import X.C2604245p;
import X.C339797kB;
import X.C361778gm;
import X.C60054JeM;
import X.C60194JhD;
import X.C62320sa;
import X.C63115Krj;
import X.C63272KuH;
import X.C64586LeU;
import X.C64727Lh4;
import X.C71382cm;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbY;
import X.L5G;
import X.LY5;
import X.MT3;
import X.MUM;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.TextView;
import androidx.core.app.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.ui.inlinegallerysendbutton.InlineGallerySendButton;
import com.instagram.ui.widget.mediapicker.MediaPickerItemView;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class GalleryView extends FrameLayout {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public AnonymousClass07i A04;
    public AnonymousClass8XO A05;
    public AnonymousClass8XZ A06;
    public UserSession A07;
    public 2Cn A08;
    public C64586LeU A09;
    public C339797kB A0A;
    public C361778gm A0B;
    public C60054JeM A0C;
    public C60194JhD A0D;
    public MT3 A0E;
    public MUM A0F;
    public C62320sa A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public int A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final GridView A0T;
    public final IgFrameLayout A0U;
    public final IgFrameLayout A0V;
    public final C252063oV A0W;
    public final InlineGallerySendButton A0X;
    public final LinkedHashSet A0Y;
    public final TextView A0Z;
    public final 1DN A0a;
    public final L5G A0b;

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryView(UserSession userSession, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 2);
        this.A07 = userSession;
        this.A0Y = DbS.A0y();
        this.A00 = 1.0f;
        this.A0O = true;
        this.A0a = new C64727Lh4(this, 5);
        this.A0b = new L5G(context, this);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C71382cm.A0s, 0, 0);
        0qQ.A07(obtainStyledAttributes);
        try {
            this.A0S = obtainStyledAttributes.getBoolean(6, true);
            this.A0R = obtainStyledAttributes.getBoolean(5, true);
            this.A0I = obtainStyledAttributes.getBoolean(2, false);
            this.A0Q = obtainStyledAttributes.getBoolean(4, true);
            this.A02 = obtainStyledAttributes.getInteger(3, 10);
            this.A01 = obtainStyledAttributes.getInt(0, 3);
            this.A0H = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.recycle();
            addView(LayoutInflater.from(context).inflate(R.layout.composer_layout, this, false));
            this.A0X = (InlineGallerySendButton) requireViewById(R.id.inline_gallery_send_button);
            GridView gridView = (GridView) requireViewById(R.id.gallery_grid);
            this.A0T = gridView;
            gridView.setNestedScrollingEnabled(isNestedScrollingEnabled());
            this.A0V = (IgFrameLayout) findViewById(R.id.info_panel);
            TextView A0G2 = DbU.A0G(this, R.id.max_limit_view);
            this.A0Z = A0G2;
            DbY.A0y(getResources(), A0G2, Integer.valueOf(this.A02), 2131973048);
            this.A0W = DbU.A0Y(this, R.id.inline_gallery_empty_view_stub);
            this.A0U = (IgFrameLayout) requireViewById(R.id.gallery_partial_permission_container);
            setClipChildren(false);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void setPermissionRequestSuccessCallback(C62320sa r2) {
        0qQ.A0B(r2, 0);
        this.A0G = r2;
    }

    /* JADX WARNING: type inference failed for: r16v2, types: [java.lang.Object, X.2jA] */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0141, code lost:
        if (X.182.A06(X.0Tu.A05, r9, 36316662907212343L) == false) goto L_0x0143;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01() {
        /*
            r25 = this;
            r0 = r25
            X.8XO r13 = r0.A05
            if (r13 != 0) goto L_0x0008
            X.8XO r13 = X.AnonymousClass8XO.PHOTO_AND_VIDEO
        L_0x0008:
            android.content.Context r10 = r0.getContext()
            android.content.res.Resources r4 = r10.getResources()
            android.util.DisplayMetrics r1 = r4.getDisplayMetrics()
            int r3 = r1.widthPixels
            int r1 = r0.A01
            int r2 = r1 + -1
            r1 = 2131165200(0x7f070010, float:1.794461E38)
            int r1 = r4.getDimensionPixelOffset(r1)
            int r1 = r1 * r2
            int r3 = r3 - r1
            int r1 = r0.A01
            int r3 = r3 / r1
            float r1 = (float) r3
            int r5 = java.lang.Math.round(r1)
            com.instagram.common.session.UserSession r1 = r0.A07
            r2 = 0
            java.lang.Integer r17 = X.AnonymousClass05K.A00
            X.8Qq r4 = new X.8Qq
            r14 = r4
            r15 = r10
            r16 = r1
            r18 = r5
            r19 = r5
            r20 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20)
            X.L5G r3 = r0.A0b
            X.JeM r1 = new X.JeM
            r1.<init>(r4, r3)
            r0.A0C = r1
            com.instagram.common.session.UserSession r6 = r0.A07
            if (r6 == 0) goto L_0x00b9
            X.JhD r1 = r0.A0D
            if (r1 != 0) goto L_0x00b9
            boolean r1 = r0.A0O
            if (r1 == 0) goto L_0x00b9
            X.0Tu r1 = X.0Tu.A05
            r3 = 36316662907212343(0x8105d000031237, double:3.0301420857603826E-306)
            boolean r1 = X.DbY.A1Y(r1, r6, r3)
            if (r1 == 0) goto L_0x00b9
            boolean r3 = r0.A0O
            X.JhD r1 = new X.JhD
            r1.<init>(r6, r10, r3)
            r0.A0D = r1
            boolean r1 = r0.A0J
            if (r1 == 0) goto L_0x0073
            androidx.fragment.app.Fragment r6 = X.0hq.A01(r0)     // Catch:{ IllegalStateException -> 0x007c }
            goto L_0x0084
        L_0x0073:
            java.lang.Class<androidx.fragment.app.FragmentActivity> r1 = androidx.fragment.app.FragmentActivity.class
            java.lang.Object r6 = X.0mE.A00(r10, r1)
            X.07Z r6 = (X.AnonymousClass07Z) r6
            goto L_0x0084
        L_0x007c:
            java.lang.Class<androidx.fragment.app.FragmentActivity> r1 = androidx.fragment.app.FragmentActivity.class
            java.lang.Object r6 = X.0mE.A00(r10, r1)
            X.07Z r6 = (X.AnonymousClass07Z) r6
        L_0x0084:
            if (r6 == 0) goto L_0x00ae
            X.JhD r1 = r0.A0D
            if (r1 == 0) goto L_0x009a
            X.2Fk r4 = r1.A01
            if (r4 == 0) goto L_0x009a
            r1 = 20
            X.MP8 r3 = new X.MP8
            r3.<init>(r0, r1)
            r1 = 54
            X.DbV.A1F(r6, r4, r3, r1)
        L_0x009a:
            X.JhD r1 = r0.A0D
            if (r1 == 0) goto L_0x00ae
            X.2Fk r4 = r1.A00
            if (r4 == 0) goto L_0x00ae
            r1 = 21
            X.MP8 r3 = new X.MP8
            r3.<init>(r0, r1)
            r1 = 54
            X.DbV.A1F(r6, r4, r3, r1)
        L_0x00ae:
            X.JhD r1 = r0.A0D
            if (r1 == 0) goto L_0x00b9
            X.8gT r3 = r1.A02
            java.lang.String r1 = "direct"
            r3.A04(r1)
        L_0x00b9:
            android.widget.GridView r1 = r0.A0T
            X.JeM r3 = r0.A0C
            r1.setAdapter(r3)
            int r3 = r0.A01
            r1.setNumColumns(r3)
            com.instagram.common.session.UserSession r3 = r0.A07
            boolean r3 = X.C63272KuH.A00(r3)
            if (r3 == 0) goto L_0x00df
            boolean r3 = r0.A0J
            if (r3 == 0) goto L_0x00d6
            androidx.fragment.app.Fragment r7 = X.0hq.A01(r0)     // Catch:{ IllegalStateException -> 0x0104 }
            goto L_0x010c
        L_0x00d6:
            java.lang.Class<androidx.fragment.app.FragmentActivity> r3 = androidx.fragment.app.FragmentActivity.class
            java.lang.Object r7 = X.0mE.A00(r10, r3)
            X.07Z r7 = (X.AnonymousClass07Z) r7
            goto L_0x010c
        L_0x00df:
            com.instagram.common.session.UserSession r14 = r0.A07
            X.07i r11 = r0.getLoaderManager()
            r3 = 18
            X.KH1 r15 = new X.KH1
            r15.<init>((java.lang.Object) r0, (int) r3)
            r18 = -1
            r16 = 2147483647(0x7fffffff, float:NaN)
            r22 = 1
            r12 = 0
            X.8XZ r9 = new X.8XZ
            r20 = r18
            r23 = r2
            r24 = r2
            r17 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r22, r23, r24)
            r0.A06 = r9
            goto L_0x0154
        L_0x0104:
            java.lang.Class<androidx.fragment.app.FragmentActivity> r3 = androidx.fragment.app.FragmentActivity.class
            java.lang.Object r7 = X.0mE.A00(r10, r3)
            X.07Z r7 = (X.AnonymousClass07Z) r7
        L_0x010c:
            com.instagram.common.session.UserSession r9 = r0.A07
            if (r7 == 0) goto L_0x0154
            if (r9 == 0) goto L_0x0154
            java.lang.Integer r17 = java.lang.Integer.valueOf(r5)
            X.07i r12 = r0.getLoaderManager()
            X.8XO r4 = r0.A05
            X.2Cn r3 = r0.A08
            X.2jA r16 = new X.2jA
            r16.<init>()
            X.LeU r8 = new X.LeU
            r11 = r10
            r13 = r4
            r14 = r9
            r15 = r3
            r18 = r2
            r10 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r0.A09 = r8
            boolean r3 = r0.A0O
            if (r3 == 0) goto L_0x0143
            X.0Tu r6 = X.0Tu.A05
            r3 = 36316662907212343(0x8105d000031237, double:3.0301420857603826E-306)
            boolean r4 = X.182.A06(r6, r9, r3)
            r3 = 1
            if (r4 != 0) goto L_0x0144
        L_0x0143:
            r3 = 0
        L_0x0144:
            r8.A01 = r3
            X.2gB r6 = r8.A02
            r3 = 22
            X.MP8 r4 = new X.MP8
            r4.<init>(r0, r3)
            r3 = 54
            X.DbV.A1F(r7, r6, r4, r3)
        L_0x0154:
            boolean r3 = r0.A0L
            if (r3 == 0) goto L_0x018c
            r1.setVerticalScrollBarEnabled(r2)
            int r2 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            com.instagram.common.session.UserSession r7 = r0.A07
            X.Kab r10 = new X.Kab
            r10.<init>(r1)
            X.JeM r8 = r0.A0C
            java.lang.String r2 = "Required value was null."
            if (r8 == 0) goto L_0x018d
            r2 = 2131432651(0x7f0b14cb, float:1.8487065E38)
            android.view.View r6 = X.AnonymousClass7TF.A0G(r0, r2)
            X.LzA r2 = new X.LzA
            r2.<init>(r5)
            X.8gk r9 = new X.8gk
            r9.<init>(r2, r10, r8)
            X.8gm r5 = new X.8gm
            r11 = r8
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.A0B = r5
            r3 = 3
            X.LZD r2 = new X.LZD
            r2.<init>(r0, r3)
            r1.setOnScrollListener(r2)
        L_0x018c:
            return
        L_0x018d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.gallery.GalleryView.A01():void");
    }

    private final void A02(int i) {
        GridView gridView = this.A0T;
        int firstVisiblePosition = gridView.getFirstVisiblePosition();
        int lastVisiblePosition = gridView.getLastVisiblePosition();
        if (gridView.getChildCount() > 0 && i >= firstVisiblePosition && i <= lastVisiblePosition) {
            View childAt = gridView.getChildAt(i - firstVisiblePosition);
            0qQ.A0C(childAt, "null cannot be cast to non-null type com.instagram.ui.widget.mediapicker.MediaPickerItemView");
            MediaPickerItemView mediaPickerItemView = (MediaPickerItemView) childAt;
            if (mediaPickerItemView != null) {
                mediaPickerItemView.A01();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x019e, code lost:
        if (r1 == null) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0103, code lost:
        if (r11.A06() == false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0124, code lost:
        if (r11.A06() == false) goto L_0x011b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(com.instagram.common.gallery.model.GalleryItem r11, com.instagram.ui.widget.gallery.GalleryView r12, java.lang.Integer r13) {
        /*
            java.util.LinkedHashSet r4 = r12.A0Y
            int r3 = r4.size()
            int r1 = r4.size()
            int r0 = r12.A02
            boolean r8 = X.JTQ.A1P(r1, r0)
            boolean r0 = r4.contains(r11)
            r2 = 1
            if (r0 == 0) goto L_0x00b1
            boolean r0 = r11.A06()
            if (r0 == 0) goto L_0x0023
            int r0 = r12.A0P
            int r0 = r0 + -1
            r12.A0P = r0
        L_0x0023:
            r4.remove(r11)
            if (r13 == 0) goto L_0x002f
            int r0 = r13.intValue()
            r12.A02(r0)
        L_0x002f:
            int r0 = r12.A02
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            r7 = 8
            r5 = 0
            if (r0 == 0) goto L_0x0049
            boolean r0 = r12.A0R
            if (r0 == 0) goto L_0x0049
            boolean r0 = r4.isEmpty()
            com.instagram.ui.inlinegallerysendbutton.InlineGallerySendButton r1 = r12.A0X
            if (r0 == 0) goto L_0x009c
            r1.setVisibility(r7)
        L_0x0049:
            boolean r0 = r12.A0Q
            if (r0 == 0) goto L_0x0055
            android.widget.TextView r0 = r12.A0Z
            if (r8 == 0) goto L_0x0052
            r7 = 0
        L_0x0052:
            r0.setVisibility(r7)
        L_0x0055:
            java.util.Iterator r10 = X.AnonymousClass7TE.A1G(r4)
            r9 = 0
        L_0x005a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0162
            java.lang.Object r1 = X.AnonymousClass7TF.A0a(r10)
            com.instagram.common.gallery.model.GalleryItem r1 = (com.instagram.common.gallery.model.GalleryItem) r1
            X.JeM r0 = r12.A0C
            if (r0 == 0) goto L_0x005a
            java.lang.Integer r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x005a
            int r8 = r0.intValue()
            android.widget.GridView r7 = r12.A0T
            int r6 = r7.getFirstVisiblePosition()
            int r1 = r7.getLastVisiblePosition()
            int r0 = r7.getChildCount()
            if (r0 <= 0) goto L_0x0099
            if (r8 < r6) goto L_0x0099
            if (r8 > r1) goto L_0x0099
            int r8 = r8 - r6
            android.view.View r1 = r7.getChildAt(r8)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.ui.widget.mediapicker.MediaPickerItemView"
            X.0qQ.A0C(r1, r0)
            com.instagram.ui.widget.mediapicker.MediaPickerItemView r1 = (com.instagram.ui.widget.mediapicker.MediaPickerItemView) r1
            if (r1 == 0) goto L_0x0099
            r1.setSelectedIndex(r9)
        L_0x0099:
            int r9 = r9 + 1
            goto L_0x005a
        L_0x009c:
            r1.setVisibility(r5)
            int r0 = r12.A02
            if (r0 == 0) goto L_0x01ae
            java.lang.String r0 = "This operation must be run on UI thread."
            X.11Z.A06(r0)
            X.2cs r6 = r1.A0E
            float r0 = r1.A00
            double r0 = (double) r0
            r6.A06(r0)
            goto L_0x0049
        L_0x00b1:
            int r0 = r12.A02
            if (r0 == 0) goto L_0x00b7
            if (r0 != r2) goto L_0x00ed
        L_0x00b7:
            java.util.Iterator r5 = X.AnonymousClass7TE.A1G(r4)
        L_0x00bb:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00ed
            java.lang.Object r1 = X.AnonymousClass7TF.A0a(r5)
            com.instagram.common.gallery.model.GalleryItem r1 = (com.instagram.common.gallery.model.GalleryItem) r1
            boolean r0 = r4.remove(r1)
            if (r0 == 0) goto L_0x00bb
            X.JeM r0 = r12.A0C
            if (r0 == 0) goto L_0x00bb
            java.lang.Integer r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x00bb
            int r0 = r0.intValue()
            r12.A02(r0)
            int r0 = r12.A02
            if (r0 != r2) goto L_0x00bb
            int r1 = r4.size()
            int r0 = r12.A02
            boolean r8 = X.JTQ.A1P(r1, r0)
            goto L_0x00bb
        L_0x00ed:
            boolean r0 = r11.A06()
            if (r0 == 0) goto L_0x00ff
            boolean r0 = r11.A02()
            if (r0 != 0) goto L_0x0127
            boolean r0 = r11.A04()
            if (r0 != 0) goto L_0x0127
        L_0x00ff:
            boolean r0 = r11.A06()
            if (r0 != 0) goto L_0x002f
        L_0x0105:
            int r0 = r12.A02
            if (r0 == 0) goto L_0x010b
            if (r8 != 0) goto L_0x002f
        L_0x010b:
            boolean r0 = r11.A06()
            if (r0 == 0) goto L_0x0120
            int r1 = r12.A0P
            int r0 = r12.A03
            if (r1 >= r0) goto L_0x0120
            int r0 = r1 + 1
            r12.A0P = r0
        L_0x011b:
            r4.add(r11)
            goto L_0x002f
        L_0x0120:
            boolean r0 = r11.A06()
            if (r0 != 0) goto L_0x002f
            goto L_0x011b
        L_0x0127:
            boolean r0 = A09(r11)
            if (r0 == 0) goto L_0x0138
            android.content.Context r1 = r12.getContext()
            r0 = 2131976484(0x7f136124, float:1.959009E38)
            X.C59689JTv.A06(r1, r0)
            goto L_0x00ff
        L_0x0138:
            com.instagram.common.gallery.Medium r5 = r11.A00
            if (r5 == 0) goto L_0x0105
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 >= r0) goto L_0x015e
            java.lang.String r0 = r5.A0a
            if (r0 == 0) goto L_0x014c
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0105
        L_0x014c:
            java.lang.String r0 = "InlineGalleryView"
            java.lang.String r5 = "attempted to load gallery media with null file path"
            X.0wb.A03(r0, r5)
            android.content.Context r1 = r12.getContext()
            r0 = 2131975944(0x7f135f08, float:1.9588995E38)
            X.C59689JTv.A01(r1, r5, r0, r2)
            goto L_0x00ff
        L_0x015e:
            r5.A02()
            goto L_0x0105
        L_0x0162:
            int r0 = r4.size()
            if (r0 == r3) goto L_0x0186
            int r1 = r4.size()
            com.instagram.common.session.UserSession r0 = r12.A07
            if (r0 == 0) goto L_0x017b
            if (r1 <= r3) goto L_0x01a5
            X.OYk r1 = X.C63234Ktf.A00(r0)
            X.KQl r0 = X.C61892KQl.A00
        L_0x0178:
            X.C71012OYk.A00(r0, r1)
        L_0x017b:
            X.MUM r1 = r12.A0F
            if (r1 == 0) goto L_0x0186
            int r0 = r4.size()
            r1.DSe(r0, r3, r2)
        L_0x0186:
            com.instagram.common.session.UserSession r4 = r12.A07
            if (r4 == 0) goto L_0x01a4
            com.instagram.common.gallery.RemoteMedia r0 = r11.A04
            r3 = 0
            if (r0 == 0) goto L_0x0191
            com.instagram.common.gallery.metadata.MediaUploadMetadata r3 = r0.A02
        L_0x0191:
            X.80M r2 = X.AnonymousClass80M.A00
            if (r0 == 0) goto L_0x01a0
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r0.A02
            com.instagram.common.gallery.metadata.ImmersiveMediaFields r0 = r0.A00
            if (r0 == 0) goto L_0x01a0
            java.lang.String r1 = r0.A00
            r0 = 1
            if (r1 != 0) goto L_0x01a1
        L_0x01a0:
            r0 = 0
        L_0x01a1:
            X.C366698pW.A00(r3, r4, r2, r5, r0)
        L_0x01a4:
            return
        L_0x01a5:
            if (r1 >= r3) goto L_0x017b
            X.OYk r1 = X.C63234Ktf.A00(r0)
            X.KQm r0 = X.C61893KQm.A00
            goto L_0x0178
        L_0x01ae:
            java.lang.IllegalStateException r0 = X.DbT.A0m()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.gallery.GalleryView.A03(com.instagram.common.gallery.model.GalleryItem, com.instagram.ui.widget.gallery.GalleryView, java.lang.Integer):void");
    }

    public static final void A04(GalleryView galleryView) {
        if (C63272KuH.A00(galleryView.A07)) {
            if (galleryView.A09 == null) {
                galleryView.A01();
            }
            C64586LeU leU = galleryView.A09;
            if (leU != null) {
                leU.A03();
                return;
            }
            return;
        }
        AnonymousClass8XZ r1 = galleryView.A06;
        if (r1 != null) {
            r1.A01((2Cn) null);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A05(GalleryView galleryView) {
        LY5 A002 = LY5.A00(galleryView, 13);
        C339797kB permissionEmptyStateController = galleryView.getPermissionEmptyStateController();
        Context context = galleryView.getContext();
        permissionEmptyStateController.A05(context.getString(2131959397));
        permissionEmptyStateController.A04(context.getString(2131959396));
        permissionEmptyStateController.A02(2131959398);
        permissionEmptyStateController.A03(A002);
    }

    public static final void A07(GalleryView galleryView) {
        int i;
        C252063oV r0;
        Boolean bool;
        C60194JhD jhD = galleryView.A0D;
        if (jhD == null || (bool = (Boolean) jhD.A01.A02()) == null || !bool.booleanValue()) {
            C60054JeM jeM = galleryView.A0C;
            i = 0;
            if (jeM != null && jeM.getCount() == 0) {
                r0 = galleryView.A0W;
                r0.setVisibility(i);
            }
        }
        r0 = galleryView.A0W;
        i = 8;
        r0.setVisibility(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r1 != true) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A08(com.instagram.ui.widget.gallery.GalleryView r4) {
        /*
            com.instagram.common.ui.base.IgFrameLayout r3 = r4.A0V
            if (r3 == 0) goto L_0x001f
            X.JhD r0 = r4.A0D
            r2 = 1
            if (r0 == 0) goto L_0x001a
            X.2Fk r0 = r0.A01
            java.lang.Object r0 = r0.A02()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x001a
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 == r2) goto L_0x001c
        L_0x001a:
            r0 = 8
        L_0x001c:
            r3.setVisibility(r0)
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.gallery.GalleryView.A08(com.instagram.ui.widget.gallery.GalleryView):void");
    }

    public static final boolean A0A(GalleryView galleryView) {
        Object obj;
        if (C63272KuH.A00(galleryView.A07)) {
            obj = galleryView.A09;
        } else {
            obj = galleryView.A06;
        }
        if (obj == null) {
            return false;
        }
        return true;
    }

    private final C339797kB getPermissionEmptyStateController() {
        C339797kB r1 = this.A0A;
        if (r1 != null) {
            return r1;
        }
        C339797kB r12 = new C339797kB(this, R.layout.gallery_permissions_view);
        this.A0A = r12;
        return r12;
    }

    public final void A0B() {
        MUM mum;
        LinkedHashSet linkedHashSet = this.A0Y;
        int size = linkedHashSet.size();
        GridView gridView = this.A0T;
        int childCount = gridView.getChildCount();
        if (childCount != 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = gridView.getChildAt(i);
                if (childAt instanceof MediaPickerItemView) {
                    ((MediaPickerItemView) childAt).A01();
                }
            }
        }
        linkedHashSet.clear();
        this.A0X.setVisibility(8);
        this.A0Z.setVisibility(8);
        if (size > 0 && (mum = this.A0F) != null) {
            mum.DSe(0, size, false);
        }
    }

    public final AnonymousClass07i getLoaderManager() {
        ComponentActivity componentActivity;
        if (this.A04 == null) {
            try {
                if (this.A0J) {
                    this.A04 = AnonymousClass07i.A00(0hq.A01(this));
                }
            } catch (IllegalStateException unused) {
            }
            if (this.A04 == null && (componentActivity = (ComponentActivity) 0mE.A00(getContext(), FragmentActivity.class)) != null) {
                this.A04 = AnonymousClass07i.A00(componentActivity);
            }
        }
        return this.A04;
    }

    public final int getMaxMultiSelectCount() {
        return this.A02;
    }

    public final int getMaxMultiVideoCount() {
        return this.A03;
    }

    public final List getSelectedItems() {
        return AnonymousClass7TE.A1D(this.A0Y);
    }

    public final void onMeasure(int i, int i2) {
        if (this.A0S) {
            i = C63115Krj.A00(i, i2);
            i2 = i;
        }
        super.onMeasure(i, i2);
    }

    public final void setLeftAlignCheckBoxes(boolean z) {
        C60054JeM jeM;
        if (this.A0I != z) {
            this.A0I = z;
            if (A0A(this) && (jeM = this.A0C) != null) {
                0fE.A00(jeM, -598885812);
            }
        }
    }

    public final void setMaxMultiSelectCount(int i) {
        C60054JeM jeM;
        if (i < 0) {
            throw DbT.A0m();
        } else if (this.A02 != i) {
            this.A02 = i;
            DbY.A0y(getResources(), this.A0Z, Integer.valueOf(i), 2131973048);
            if (A0A(this) && (jeM = this.A0C) != null) {
                0fE.A00(jeM, -136868782);
            }
        }
    }

    public final void setMaxMultiVideoCount(int i) {
        C60054JeM jeM;
        if (i < 0) {
            throw DbT.A0m();
        } else if (this.A03 != i) {
            this.A03 = i;
            DbY.A0y(getResources(), this.A0Z, Integer.valueOf(i), 2131973051);
            if (A0A(this) && (jeM = this.A0C) != null) {
                0fE.A00(jeM, 1827317484);
            }
        }
    }

    public final void setRemoteMediaEnabled(boolean z) {
        this.A0O = z;
        C60194JhD jhD = this.A0D;
        if (jhD != null) {
            AnonymousClass7TF.A1O(jhD.A04, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (X.182.A06(r2, r4, 36311569077240431L) == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setUserSession(com.instagram.common.session.UserSession r4) {
        /*
            r3 = this;
            r3.A07 = r4
            X.0Tu r2 = X.0Tu.A06
            r0 = 36311569076126302(0x81012e0005025e, double:3.026920726470359E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x001b
            r0 = 36311569077240431(0x81012e0016026f, double:3.0269207271749385E-306)
            boolean r1 = X.182.A06(r2, r4, r0)
            r0 = 1
            if (r1 != 0) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r3.A0J = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.gallery.GalleryView.setUserSession(com.instagram.common.session.UserSession):void");
    }

    public static final void A06(GalleryView galleryView) {
        Activity rootActivity = galleryView.getRootActivity();
        if (rootActivity != null) {
            C2604245p.A01(rootActivity, galleryView.A0a);
        }
    }

    public static final boolean A09(GalleryItem galleryItem) {
        int i;
        if (galleryItem.A02()) {
            Medium medium = galleryItem.A00;
            if (medium != null) {
                i = medium.A03;
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else if (!galleryItem.A04()) {
            return false;
        } else {
            RemoteMedia remoteMedia = galleryItem.A04;
            if (remoteMedia != null) {
                i = remoteMedia.A01;
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        return AnonymousClass7TF.A1R((((long) i) > 90000 ? 1 : (((long) i) == 90000 ? 0 : -1)));
    }

    /* access modifiers changed from: private */
    public final Activity getRootActivity() {
        Activity activity = (Activity) 0mE.A00(getContext(), Activity.class);
        if (activity == null) {
            return null;
        }
        Activity parent = activity.getParent();
        if (parent != null) {
            return parent;
        }
        return activity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C() {
        /*
            r9 = this;
            r9.A0B()
            boolean r0 = A0A(r9)
            if (r0 != 0) goto L_0x000c
            r9.A01()
        L_0x000c:
            com.instagram.common.session.UserSession r4 = r9.A07
            if (r4 == 0) goto L_0x00b3
            android.content.Context r3 = X.AnonymousClass7TE.A0S(r9)
            boolean r0 = X.C361378g8.A00(r3, r4)
            if (r0 == 0) goto L_0x00b3
            r2 = 0
            X.KHN r1 = new X.KHN
            r1.<init>(r3)
            r0 = 1
            X.C63134Ks2.A00(r3, r4, r1, r0, r2)
            com.instagram.common.ui.base.IgFrameLayout r0 = r9.A0U
            r0.addView(r1)
        L_0x0029:
            com.instagram.common.session.UserSession r8 = r9.A07
            com.instagram.common.ui.base.IgFrameLayout r6 = r9.A0V
            if (r6 == 0) goto L_0x0074
            if (r8 == 0) goto L_0x0074
            X.0Tu r7 = X.0Tu.A05
            r0 = 36316662907015732(0x8105d000001234, double:3.030142085636045E-306)
            boolean r0 = X.DbY.A1Y(r7, r8, r0)
            if (r0 == 0) goto L_0x0074
            android.content.Context r5 = X.AnonymousClass7TE.A0S(r9)
            r4 = 1
            X.LNH r0 = X.C63551Kz0.A00
            java.lang.String r3 = r0.A01(r5, r8)
            r0 = 2131962939(0x7f132c3b, float:1.9562617E38)
            java.lang.String r2 = r5.getString(r0)
            r0 = 36882683762049482(0x83089b000001ca, double:3.388095953542431E-306)
            java.lang.String r0 = X.182.A04(r7, r8, r0)
            android.text.SpannableStringBuilder r1 = X.LNH.A00(r5, r8, r3, r2, r0)
            r0 = 2131442566(0x7f0b3b86, float:1.8507175E38)
            android.widget.TextView r0 = X.DbW.A0B(r6, r0)
            r0.setClickable(r4)
            r0.setLinksClickable(r4)
            X.DbT.A1H(r0)
            if (r1 != 0) goto L_0x0071
            java.lang.String r1 = ""
        L_0x0071:
            X.DbZ.A14(r0, r1)
        L_0x0074:
            A08(r9)
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r9)
            boolean r0 = X.C2604245p.A03(r0)
            if (r0 == 0) goto L_0x00ba
            A04(r9)
            android.widget.GridView r1 = r9.A0T
            int r0 = r1.getVisibility()
            r5 = 1
            if (r0 == 0) goto L_0x00b0
            X.2co r0 = X.C315596kB.A02
            r4 = 0
            X.5nL r0 = X.JTP.A0c(r1, r4)
            X.5nL r3 = r0.A0F(r5)
            float r2 = X.AnonymousClass7TE.A03(r1)
            int r0 = r1.getNumColumns()
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r1 / r0
            float r0 = r0 + r1
            float r2 = r2 * r0
            r0 = 0
            r3.A0T(r2, r0)
            r3.A04 = r4
            r3.A0H()
        L_0x00b0:
            r9.A0M = r5
            return
        L_0x00b3:
            com.instagram.common.ui.base.IgFrameLayout r0 = r9.A0U
            r0.removeAllViews()
            goto L_0x0029
        L_0x00ba:
            A06(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.gallery.GalleryView.A0C():void");
    }

    public void setNestedScrollingEnabled(boolean z) {
        super.setNestedScrollingEnabled(z);
        this.A0T.setNestedScrollingEnabled(isNestedScrollingEnabled());
    }

    public final void setAspectRatio(float f) {
        this.A00 = f;
    }

    public final void setColumnCount(int i) {
        this.A01 = i;
    }

    public final void setFastScrollerEnabled(boolean z) {
        this.A0L = z;
    }

    public final void setGalleryDataLoadedListener(MT3 mt3) {
        this.A0E = mt3;
    }

    public final void setGalleryLoadCallback(2Cn r1) {
        this.A08 = r1;
    }

    public final void setIsCaptureButtonEnabled(boolean z) {
        this.A0H = z;
    }

    public final void setIsCheckmarksEnabled(boolean z) {
        this.A0K = z;
    }

    public final void setKeepSelectionOnFolderChange(boolean z) {
        this.A0N = z;
    }

    public final void setLoaderManager(AnonymousClass07i r1) {
        this.A04 = r1;
    }

    public final void setMode(AnonymousClass8XO r1) {
        this.A05 = r1;
    }

    public final void setUserActionListener(MUM mum) {
        this.A0F = mum;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GalleryView(UserSession userSession, Context context, AttributeSet attributeSet) {
        this(userSession, context, attributeSet, 0);
        0qQ.A0B(context, 2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GalleryView(UserSession userSession, Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userSession, context, (i & 4) != 0 ? null : attributeSet);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GalleryView(UserSession userSession, Context context) {
        this(userSession, context, (AttributeSet) null);
        0qQ.A0B(context, 2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GalleryView(Context context, AttributeSet attributeSet) {
        this((UserSession) null, context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
