package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lh2  reason: case insensitive filesystem */
public final class C64725Lh2 implements C46215DQt {
    public final int A00;
    public final Object A01;

    public C64725Lh2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r14.A01 != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void DUK(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x018d;
                case 1: goto L_0x015c;
                case 2: goto L_0x011d;
                case 3: goto L_0x0083;
                case 4: goto L_0x001b;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r14 == 0) goto L_0x001a
            java.lang.Object r4 = r13.A01
            X.2YL r4 = (X.2YL) r4
            X.6oS r3 = X.C318116oQ.A00(r4)
            r1 = 0
            r0 = 47
            X.MH0 r2 = new X.MH0
            r2.<init>((java.lang.Object) r14, (java.lang.Object) r4, (X.AnonymousClass4D7) r1, (int) r0)
        L_0x0017:
            X.AnonymousClass7TE.A1Z(r2, r3)
        L_0x001a:
            return
        L_0x001b:
            X.LD0 r14 = (X.LD0) r14
            java.lang.Object r4 = r13.A01
            X.Ji4 r4 = (X.C60247Ji4) r4
            r10 = 0
            if (r14 == 0) goto L_0x0029
            boolean r1 = r14.A01
            r0 = 1
            if (r1 == 0) goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            r4.A01 = r0
            if (r14 == 0) goto L_0x006f
            com.google.common.collect.ImmutableList r1 = r14.A00()
            int r0 = r4.A00
            int r0 = X.DbT.A01(r1, r0)
            r4.A00 = r0
            X.05G r5 = r4.A0A
            java.util.Collection r0 = X.JTO.A13(r5)
            java.util.ArrayList r3 = X.00k.A0U(r0)
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x004c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0069
            java.lang.Object r0 = r1.next()
            X.L8o r0 = (X.C63833L8o) r0
            java.lang.String r9 = r0.A04
            com.instagram.common.typedurl.ImageUrl r8 = r0.A02
            X.UwY r7 = r0.A01
            X.LiO r6 = new X.LiO
            r11 = r10
            r12 = r10
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r2.add(r6)
            goto L_0x004c
        L_0x0069:
            r3.addAll(r2)
            r5.Epw(r3)
        L_0x006f:
            r4.A02 = r10
            X.05G r0 = r4.A09
            X.AnonymousClass7TF.A1O(r0, r10)
            X.6oS r3 = X.C318116oQ.A00(r4)
            r1 = 0
            r0 = 25
            X.MFT r2 = new X.MFT
            r2.<init>(r4, r1, r0)
            goto L_0x0017
        L_0x0083:
            X.1Xj r14 = (X.1Xj) r14
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            r1 = 0
            if (r14 == 0) goto L_0x0090
            X.1iA r1 = r14.BR7()
        L_0x0090:
            X.1iA r0 = X.1iA.A09
            java.lang.Object r6 = r13.A01
            X.LrN r6 = (X.C65324LrN) r6
            if (r1 == r0) goto L_0x00c9
            r6.A02 = r14
            if (r14 == 0) goto L_0x00aa
            X.3W1 r2 = X.C65324LrN.A00(r6, r14)
            X.3TO r1 = X.AnonymousClass3TO.AUTOPLAY_USING_TIMER
            X.Li4 r0 = new X.Li4
            r0.<init>(r14, r2, r1)
            r7.add(r0)
        L_0x00aa:
            X.LE4 r1 = r6.A05
            X.2t9 r0 = r1.A07
            X.JTR.A1L(r0, r7)
            r0.notifyDataSetChanged()
            com.google.android.material.appbar.AppBarLayout r1 = r1.A05
            r0 = 13
            r1.A03 = r0
            r1.requestLayout()
            X.LdH r4 = r6.A01
            if (r4 != 0) goto L_0x00ed
            X.JTO.A1K()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00c9:
            r5 = 0
            X.1Xj r0 = r14.A1c(r5)
            r6.A02 = r0
            int r4 = r14.A0o()
        L_0x00d4:
            if (r5 >= r4) goto L_0x00aa
            X.1Xj r3 = r14.A1c(r5)
            if (r3 == 0) goto L_0x00ea
            X.3W1 r2 = X.C65324LrN.A00(r6, r3)
            X.3TO r1 = X.AnonymousClass3TO.AUTOPLAY_USING_TIMER
            X.Li4 r0 = new X.Li4
            r0.<init>(r3, r2, r1)
            r7.add(r0)
        L_0x00ea:
            int r5 = r5 + 1
            goto L_0x00d4
        L_0x00ed:
            X.WGU r3 = r4.A00
            java.lang.String r2 = r4.A06
            com.instagram.common.session.UserSession r1 = r4.A05
            java.lang.String r5 = "media_selection"
            java.lang.String r0 = "media_fetch"
            r3.A0O(r1, r5, r2, r0)
            X.Kzq r0 = r4.A04
            com.instagram.ui.widget.spinner.SpinnerImageView r3 = r0.A00
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x001a
            X.K6h r2 = r4.A01
            X.LOA r0 = r2.A01
            if (r0 != 0) goto L_0x0114
            java.lang.String r0 = "mediaPickerState"
        L_0x010c:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0114:
            X.KgP r1 = r0.A00
            X.KgP r0 = r2.A00
            if (r0 != 0) goto L_0x01bd
            java.lang.String r0 = "mediaContentType"
            goto L_0x010c
        L_0x011d:
            X.LD0 r14 = (X.LD0) r14
            java.lang.Object r3 = r13.A01
            X.LdI r3 = (X.C64516LdI) r3
            X.LdH r0 = r3.A02
            if (r0 == 0) goto L_0x01e1
            r0.A00()
            r2 = 1
            if (r14 == 0) goto L_0x0159
            boolean r0 = r14.A01
            if (r0 != r2) goto L_0x0159
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x0133:
            r3.A03 = r0
            if (r14 == 0) goto L_0x0157
            com.google.common.collect.ImmutableList r0 = r14.A00()
            X.C64516LdI.A03(r3, r0)
            java.lang.String r0 = r14.A00
        L_0x0140:
            r3.A04 = r0
            java.util.List r0 = r3.A0A
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            int r1 = r0.size()
            r0 = 4
            if (r1 >= r0) goto L_0x001a
            if (r14 == 0) goto L_0x001a
            boolean r0 = r14.A01
            if (r0 != r2) goto L_0x001a
            X.C64516LdI.A01(r3)
            return
        L_0x0157:
            r0 = 0
            goto L_0x0140
        L_0x0159:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0133
        L_0x015c:
            X.L5v r14 = (X.C63763L5v) r14
            java.lang.Object r2 = r13.A01
            X.LdI r2 = (X.C64516LdI) r2
            X.LdH r0 = r2.A02
            if (r0 == 0) goto L_0x01e6
            r0.A00()
            r1 = 1
            if (r14 == 0) goto L_0x018a
            boolean r0 = r14.A02
            if (r0 != r1) goto L_0x018a
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x0172:
            r2.A03 = r0
            if (r14 == 0) goto L_0x001a
            com.google.common.collect.ImmutableList$Builder r1 = com.google.common.collect.ImmutableList.builder()
            java.util.List r0 = r14.A01
            r1.addAll(r0)
            com.google.common.collect.ImmutableList r0 = r1.build()
            X.0qQ.A07(r0)
            X.C64516LdI.A03(r2, r0)
            return
        L_0x018a:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0172
        L_0x018d:
            X.LD0 r14 = (X.LD0) r14
            java.lang.Object r2 = r13.A01
            X.LdI r2 = (X.C64516LdI) r2
            X.LdH r0 = r2.A02
            if (r0 == 0) goto L_0x01b8
            r0.A00()
            r1 = 1
            if (r14 == 0) goto L_0x01b5
            boolean r0 = r14.A01
            if (r0 != r1) goto L_0x01b5
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x01a3:
            r2.A03 = r0
            if (r14 == 0) goto L_0x01b3
            com.google.common.collect.ImmutableList r0 = r14.A00()
            X.C64516LdI.A03(r2, r0)
            java.lang.String r0 = r14.A00
        L_0x01b0:
            r2.A04 = r0
            return
        L_0x01b3:
            r0 = 0
            goto L_0x01b0
        L_0x01b5:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x01a3
        L_0x01b8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x01bd:
            if (r1 != r0) goto L_0x01ca
            com.instagram.common.session.UserSession r0 = r4.A05
            X.WGU r1 = X.WGU.A00(r0)
            java.lang.String r0 = r4.A06
            r1.A0S(r0, r5)
        L_0x01ca:
            X.JTO.A1X(r3)
            X.LrN r0 = r4.A03
            X.LE4 r0 = r0.A05
            android.view.View r0 = r0.A02
            r1 = 0
            r0.setVisibility(r1)
            X.LdI r0 = r4.A02
            X.Ldb r0 = r0.A08
            android.view.View r0 = r0.A01
            r0.setVisibility(r1)
            return
        L_0x01e1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x01e6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64725Lh2.DUK(java.lang.Object):void");
    }

    public final void onComplete() {
    }

    public final void onError(Throwable th) {
        String str;
        String str2;
        UserSession userSession;
        C64515LdH ldH;
        switch (this.A00) {
            case 0:
                ldH = ((C64516LdI) this.A01).A02;
                if (ldH == null) {
                    throw AnonymousClass7TE.A0y();
                }
                break;
            case 1:
                ldH = ((C64516LdI) this.A01).A02;
                if (ldH == null) {
                    throw AnonymousClass7TE.A0y();
                }
                break;
            case 2:
                ldH = ((C64516LdI) this.A01).A02;
                if (ldH == null) {
                    throw AnonymousClass7TE.A0y();
                }
                break;
            case 3:
                C64515LdH ldH2 = ((C65324LrN) this.A01).A01;
                if (ldH2 == null) {
                    JTO.A1K();
                    throw AnonymousClass00P.createAndThrow();
                }
                str = "Preview media fetch error";
                WGU wgu = ldH2.A00;
                str2 = ldH2.A06;
                userSession = ldH2.A05;
                wgu.A01 = str2;
                wgu.A04 = AnonymousClass7TF.A1V(C16905VAi.A00(userSession).A00);
                wgu.A0V("media_selection", "media_fetch", str);
                if (ldH2.A04.A00.getVisibility() != 0) {
                    return;
                }
                break;
            case 4:
                C60247Ji4 ji4 = (C60247Ji4) this.A01;
                ji4.A02 = false;
                AnonymousClass7TF.A1O(ji4.A09, false);
                AnonymousClass7TE.A1Z(new MFT(ji4, (AnonymousClass4D7) null, 24), C318116oQ.A00(ji4));
                return;
            default:
                return;
        }
        str = "Media grid fetch error";
        WGU wgu2 = ldH.A00;
        str2 = ldH.A06;
        userSession = ldH.A05;
        wgu2.A01 = str2;
        wgu2.A04 = AnonymousClass7TF.A1V(C16905VAi.A00(userSession).A00);
        wgu2.A0V("media_selection", "media_fetch", str);
        if (ldH.A04.A00.getVisibility() != 0) {
            return;
        }
        C63985LHd.A00(userSession, str2, str);
    }
}
