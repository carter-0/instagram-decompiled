package X;

import android.app.Activity;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.loadmore.LoadMoreButton;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.JlO  reason: case insensitive filesystem */
public final class C60431JlO extends 2Rw {
    public String A00;
    public boolean A01;
    public final List A02 = AnonymousClass7TE.A1C();
    public final List A03 = AnonymousClass7TE.A1C();
    public final List A04 = AnonymousClass7TE.A1C();
    public final List A05 = AnonymousClass7TE.A1C();
    public final List A06 = AnonymousClass7TE.A1C();
    public final Activity A07;
    public final AnonymousClass0iw A08;
    public final UserSession A09;
    public final C64970Ll9 A0A;
    public final C64970Ll9 A0B;
    public final C229122ms A0C;
    public final Boolean A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final List A0H = AnonymousClass7TE.A1C();

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            Activity activity = this.A07;
            return new C60679JpQ(activity, LayoutInflater.from(activity).inflate(R.layout.row_search_user, viewGroup, false), this.A0B);
        } else if (i == 1) {
            int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C60539JnA(LayoutInflater.from(this.A07).inflate(R.layout.fundraiser_sticker_search_row_section_title, viewGroup, false));
        } else if (i == 2) {
            int i4 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C60537Jn8(LayoutInflater.from(this.A07).inflate(R.layout.fundraiser_sticker_search_row_description, viewGroup, false));
        } else if (i == 3) {
            int i5 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C60538Jn9(LoadMoreButton.A00(this.A07, R.layout.fundraiser_sticker_search_row_empty_state, viewGroup));
        } else if (i == 4) {
            int i6 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C60675JpM(LayoutInflater.from(this.A07).inflate(R.layout.active_fundraiser_row, viewGroup, false), this.A0A);
        } else {
            throw AnonymousClass7TE.A1B(002.A0O(C273654mx.A00(28), i));
        }
    }

    public final int A00() {
        int i = 0;
        for (C43856CFw cFw : this.A04) {
            i = DbT.A01(cFw.A01, i);
        }
        if (this.A01) {
            return this.A06.size();
        }
        return this.A05.size() + i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x016c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r28 = this;
            r0 = r28
            java.util.List r1 = r0.A0H
            r1.clear()
            boolean r2 = r0.A01
            if (r2 == 0) goto L_0x0028
            java.util.List r2 = r0.A06
            java.util.Iterator r3 = r2.iterator()
        L_0x0011:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x01a0
            com.instagram.user.model.User r6 = X.DbT.A0k(r3)
            r5 = 0
            r9 = 0
            X.L8v r4 = new X.L8v
            r7 = r5
            r8 = r5
            r4.<init>(r5, r6, r7, r8, r9)
            r1.add(r4)
            goto L_0x0011
        L_0x0028:
            java.util.List r2 = r0.A05
            boolean r3 = r2.isEmpty()
            r19 = 1
            r13 = r3 ^ 1
            java.util.List r5 = r0.A04
            boolean r12 = X.AnonymousClass7TE.A1b(r5)
            java.lang.Boolean r3 = r0.A0D
            boolean r3 = r3.booleanValue()
            r7 = 0
            if (r3 == 0) goto L_0x0156
            java.util.List r8 = r0.A03
            boolean r3 = r8.isEmpty()
            if (r3 != 0) goto L_0x0156
            java.lang.Object r3 = r8.get(r7)
            X.CFv r3 = (X.C43855CFv) r3
            java.util.List r3 = r3.A01
            java.lang.Object r10 = r3.get(r7)
            X.9hg r10 = (X.C384659hg) r10
            java.lang.String r4 = r10.A05
            if (r4 == 0) goto L_0x00ad
            java.lang.String r3 = "DAF"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00ad
            java.lang.String r4 = r0.A0F
            java.lang.String r3 = "PRE_LIVE"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00ad
        L_0x006d:
            if (r12 == 0) goto L_0x016a
            java.util.Iterator r5 = r5.iterator()
        L_0x0073:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x016a
            java.lang.Object r4 = r5.next()
            X.CFw r4 = (X.C43856CFw) r4
            java.lang.String r3 = r4.A00
            r15 = 0
            X.L8v r14 = new X.L8v
            r16 = r15
            r17 = r15
            r18 = r3
            r14.<init>(r15, r16, r17, r18, r19)
            r1.add(r14)
            java.util.List r3 = r4.A01
            java.util.Iterator r4 = r3.iterator()
        L_0x0096:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x0073
            com.instagram.user.model.User r8 = X.DbT.A0k(r4)
            r11 = 0
            X.L8v r6 = new X.L8v
            r7 = r15
            r9 = r15
            r10 = r15
            r6.<init>(r7, r8, r9, r10, r11)
            r1.add(r6)
            goto L_0x0096
        L_0x00ad:
            com.instagram.user.model.User r3 = r10.A01
            if (r3 == 0) goto L_0x0153
            android.app.Activity r9 = r0.A07
            com.instagram.common.session.UserSession r6 = r0.A09
            X.0qQ.A0B(r6, r7)
            X.7ol r4 = X.C342537ol.A00
            java.lang.Class<X.7om> r3 = X.C342547om.class
            java.lang.Object r3 = r6.A01(r3, r4)
            X.7om r3 = (X.C342547om) r3
            X.7oh r3 = r3.A00
            r6 = 2131962846(0x7f132bde, float:1.9562429E38)
            if (r3 == 0) goto L_0x00cc
            r6 = 2131962847(0x7f132bdf, float:1.956243E38)
        L_0x00cc:
            com.instagram.user.model.User r3 = r10.A01
            java.lang.String r4 = r3.getFullName()
            com.instagram.user.model.User r3 = r10.A01
            if (r4 == 0) goto L_0x014e
            java.lang.String r3 = r3.getFullName()
        L_0x00da:
            java.lang.String r4 = X.DbW.A0h(r9, r3, r6)
        L_0x00de:
            r21 = 0
            r25 = 2
            X.L8v r3 = new X.L8v
            r20 = r3
            r22 = r21
            r23 = r4
            r24 = r21
            r20.<init>(r21, r22, r23, r24, r25)
            r1.add(r3)
            java.util.Iterator r11 = r8.iterator()
        L_0x00f6:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L_0x006d
            java.lang.Object r8 = r11.next()
            X.CFv r8 = (X.C43855CFv) r8
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r7)
            java.util.List r3 = r8.A01
            java.util.Iterator r9 = r3.iterator()
        L_0x010c:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x00f6
            java.lang.Object r6 = r9.next()
            X.9hg r6 = (X.C384659hg) r6
            boolean r3 = r10.booleanValue()
            if (r3 != 0) goto L_0x0134
            java.lang.String r3 = r8.A00
            X.L8v r14 = new X.L8v
            r15 = r21
            r16 = r15
            r17 = r15
            r18 = r3
            r14.<init>(r15, r16, r17, r18, r19)
            r1.add(r14)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r19)
        L_0x0134:
            r27 = 4
            X.L8v r3 = new X.L8v
            r22 = r3
            r23 = r6
            r25 = r21
            r26 = r21
            r22.<init>(r23, r24, r25, r26, r27)
            r1.add(r3)
            java.util.List r4 = r0.A02
            java.lang.String r3 = r6.A06
            r4.add(r3)
            goto L_0x010c
        L_0x014e:
            java.lang.String r3 = r3.getUsername()
            goto L_0x00da
        L_0x0153:
            java.lang.String r4 = r0.A0G
            goto L_0x00de
        L_0x0156:
            if (r12 != 0) goto L_0x015a
            if (r13 == 0) goto L_0x01a0
        L_0x015a:
            java.lang.String r9 = r0.A0G
            r7 = 0
            r11 = 2
            X.L8v r6 = new X.L8v
            r8 = r7
            r10 = r7
            r6.<init>(r7, r8, r9, r10, r11)
            r1.add(r6)
            goto L_0x006d
        L_0x016a:
            if (r13 == 0) goto L_0x01a0
            java.lang.String r3 = r0.A00
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x019d
            java.lang.String r7 = r0.A00
        L_0x0176:
            r4 = 0
            X.L8v r3 = new X.L8v
            r5 = r4
            r6 = r4
            r8 = r19
            r3.<init>(r4, r5, r6, r7, r8)
            r1.add(r3)
            java.util.Iterator r3 = r2.iterator()
        L_0x0187:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x01a0
            com.instagram.user.model.User r7 = X.DbT.A0k(r3)
            r10 = 0
            X.L8v r5 = new X.L8v
            r9 = r4
            r8 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            r1.add(r5)
            goto L_0x0187
        L_0x019d:
            java.lang.String r7 = r0.A0E
            goto L_0x0176
        L_0x01a0:
            r3 = 0
            r7 = 3
            X.L8v r2 = new X.L8v
            r4 = r3
            r5 = r3
            r6 = r3
            r2.<init>(r3, r4, r5, r6, r7)
            r1.add(r2)
            r0.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60431JlO.A01():void");
    }

    /* JADX WARNING: type inference failed for: r0v34, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v39, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void onBindViewHolder(C249703kE r9, int i) {
        View A012;
        View.OnClickListener A002;
        String str;
        TextView textView;
        C63840L8v l8v = (C63840L8v) this.A0H.get(i);
        int i2 = l8v.A00;
        if (i2 != 0) {
            if (i2 == 1) {
                str = l8v.A04;
                str.getClass();
                textView = ((C60539JnA) r9).A00;
            } else if (i2 == 2) {
                str = l8v.A03;
                str.getClass();
                textView = ((C60537Jn8) r9).A00;
            } else if (i2 != 3) {
                C60675JpM jpM = (C60675JpM) r9;
                C384659hg r4 = l8v.A01;
                r4.getClass();
                ViewGroup viewGroup = jpM.A01;
                viewGroup.setBackground((Drawable) null);
                LY8.A00(viewGroup, 56, jpM, r4);
                jpM.A05.setText(r4.A07);
                jpM.A04.setText(r4.A02);
                jpM.A03.setText(r4.A09);
                1Xj r0 = r4.A00;
                ImageView imageView = jpM.A02;
                if (r0 != null) {
                    JYP.A00(imageView, r0.A1Q());
                    imageView.setVisibility(0);
                    jpM.A06.setVisibility(8);
                    jpM.A07.setVisibility(8);
                } else {
                    imageView.setVisibility(8);
                    jpM.A06.setVisibility(0);
                    jpM.A07.setVisibility(0);
                }
                A012 = jpM.A08.A01();
                C67434Mnp.A00(A012);
                A002 = new LY8(57, jpM, r4);
            } else {
                C229122ms r2 = this.A0C;
                0qQ.A0B(r2, 0);
                ((C60538Jn9) r9).A00.A03(r2, (C230682q1) null);
                return;
            }
            textView.setText(str);
            return;
        }
        C60679JpQ jpQ = (C60679JpQ) r9;
        User user = l8v.A02;
        user.getClass();
        AnonymousClass0iw r3 = this.A08;
        ViewGroup viewGroup2 = jpQ.A06;
        viewGroup2.setBackground((Drawable) null);
        LY8.A00(viewGroup2, 58, jpQ, user);
        TextView textView2 = jpQ.A09;
        DbU.A1H(textView2, user);
        int i3 = jpQ.A04;
        textView2.setTextColor(i3);
        boolean isVerified = user.isVerified();
        DisplayMetrics displayMetrics = DbU.A05(textView2).getDisplayMetrics();
        RectF rectF = 0nA.A01;
        C244273av.A09(textView2, (int) TypedValue.applyDimension(1, 1.0f, displayMetrics), 0, i3, isVerified);
        jpQ.A08.setText(user.getFullName());
        String Bgn = user.A03.Bgn();
        TextView textView3 = jpQ.A07;
        if (Bgn != null) {
            textView3.setText(user.A03.Bgn());
        } else {
            textView3.setVisibility(8);
        }
        IgImageView igImageView = jpQ.A0A;
        DbU.A1S(r3, igImageView, user);
        igImageView.setVisibility(0);
        C71662eb r02 = jpQ.A0B;
        r02.A03(0);
        A012 = r02.A01();
        C67434Mnp.A00(A012);
        A002 = LYA.A00(r3, jpQ, user, 13);
        AnonymousClass0fU.A00(A002, A012);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0052, code lost:
        if (((X.C342547om) r5.A01(X.C342547om.class, X.C342537ol.A00)).A00 == null) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60431JlO(android.app.Activity r3, X.AnonymousClass0iw r4, com.instagram.common.session.UserSession r5, X.C64970Ll9 r6, X.C64970Ll9 r7, X.C229122ms r8, java.lang.Boolean r9, java.lang.String r10) {
        /*
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r2.A0H = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r2.A05 = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r2.A06 = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r2.A04 = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r2.A03 = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r2.A02 = r0
            r2.A07 = r3
            r2.A0C = r8
            r2.A0A = r6
            r2.A0D = r9
            r2.A0B = r7
            r2.A0F = r10
            r2.A09 = r5
            r2.A08 = r4
            java.lang.String r0 = "PRE_LIVE"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0054
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.7ol r1 = X.C342537ol.A00
            java.lang.Class<X.7om> r0 = X.C342547om.class
            java.lang.Object r0 = r5.A01(r0, r1)
            X.7om r0 = (X.C342547om) r0
            X.7oh r1 = r0.A00
            r0 = 2131962851(0x7f132be3, float:1.9562439E38)
            if (r1 != 0) goto L_0x0057
        L_0x0054:
            r0 = 2131962852(0x7f132be4, float:1.956244E38)
        L_0x0057:
            java.lang.String r0 = r3.getString(r0)
            r2.A0G = r0
            r0 = 2131962850(0x7f132be2, float:1.9562437E38)
            java.lang.String r0 = r3.getString(r0)
            r2.A0E = r0
            r2.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60431JlO.<init>(android.app.Activity, X.0iw, com.instagram.common.session.UserSession, X.Ll9, X.Ll9, X.2ms, java.lang.Boolean, java.lang.String):void");
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1098385604);
        int size = this.A0H.size();
        AnonymousClass0fD.A0A(-690056704, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(-860048185);
        int i2 = ((C63840L8v) this.A0H.get(i)).A00;
        AnonymousClass0fD.A0A(-1387232912, A032);
        return i2;
    }
}
