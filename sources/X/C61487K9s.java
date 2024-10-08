package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;

/* renamed from: X.K9s  reason: case insensitive filesystem */
public final class C61487K9s extends C231632rz {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final IngestSessionShim A03;
    public final C65635LxC A04;
    public final C363008it A05;
    public final MTF A06;
    public final boolean A07;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002f, code lost:
        if (r9.A06() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x006e, code lost:
        if (r13 == false) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r26, android.view.View r27, java.lang.Object r28, java.lang.Object r29) {
        /*
            r25 = this;
            r4 = r28
            r0 = 631764286(0x25a7f53e, float:2.9136065E-16)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.FV6 r4 = (X.FV6) r4
            java.lang.Object r6 = X.DbT.A0o(r27)
            X.L9n r6 = (X.C63858L9n) r6
            r10 = r25
            X.LxC r8 = r10.A04
            com.instagram.common.session.UserSession r11 = r10.A02
            boolean r0 = r10.A07
            boolean r14 = X.AnonymousClass8PU.A0A(r11, r0)
            X.8it r9 = r10.A05
            boolean r13 = r9.A06()
            X.MTF r5 = r10.A06
            android.content.Context r7 = r10.A00
            if (r0 == 0) goto L_0x0031
            boolean r0 = r9.A06()
            r24 = 1
            if (r0 != 0) goto L_0x0033
        L_0x0031:
            r24 = 0
        L_0x0033:
            com.instagram.pendingmedia.model.UserStoryTarget r2 = r4.A0A
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r1 = r10.A03
            X.0iw r0 = r10.A01
            X.Lqt r15 = new X.Lqt
            r20 = r8
            r21 = r2
            r22 = r9
            r23 = r5
            r17 = r0
            r18 = r11
            r19 = r1
            r16 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r7 = 0
            X.AnonymousClass7TF.A1B(r6, r7, r8)
            r0 = 7
            X.0qQ.A0B(r5, r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r6.A03
            java.util.List r0 = r4.A0D
            java.lang.Object r0 = r0.get(r7)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r0
            com.instagram.common.typedurl.ImageUrl r0 = r0.A03
            r1.setUrl(r0, r4)
            r9 = 0
            X.Jqo r12 = new X.Jqo
            r12.<init>()
            if (r14 == 0) goto L_0x0070
            r0 = 1
            if (r13 != 0) goto L_0x0071
        L_0x0070:
            r0 = 0
        L_0x0071:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_xpost_enabled"
            r12.A03(r0, r1)
            java.lang.String r10 = "Required value was null."
            X.0qQ.A0A(r11)
            X.818 r2 = X.AnonymousClass818.IG_STORY_SHARE_SHEET_SHARING_OPTIONS
            if (r14 != 0) goto L_0x013b
            X.JZY r1 = X.JZY.UNAVAILABLE
            X.JZZ r0 = X.JZZ.STORY
            X.JZX.A00(r1, r0, r2, r12, r11)
            android.widget.TextView r1 = r6.A02
            r0 = 8
            r1.setVisibility(r0)
            r1.setOnClickListener(r9)
        L_0x0094:
            X.LRm r1 = r5.AXA()
            if (r1 == 0) goto L_0x0113
            X.Juy r0 = X.C61002Juy.A05
            X.LMN r0 = r1.A01(r0)
            java.lang.Integer r9 = r0.A01
            X.LRm r1 = r5.AXA()
            X.0qQ.A0A(r1)
            X.Juy r0 = X.C61002Juy.A0C
            X.LMN r0 = r1.A01(r0)
            java.lang.Integer r8 = r0.A01
            X.LRm r1 = r5.AXA()
            X.0qQ.A0A(r1)
            X.Juy r0 = X.C61002Juy.A07
            X.LMN r0 = r1.A01(r0)
            java.lang.Integer r2 = r0.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            if (r9 == r1) goto L_0x0113
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r9 == r0) goto L_0x0113
            if (r8 == r1) goto L_0x0113
            if (r8 == r0) goto L_0x0113
            if (r2 == r1) goto L_0x0113
            if (r2 == r0) goto L_0x0113
            android.view.View r1 = r6.A01
            X.2co r0 = X.C315596kB.A02
            X.5nL r0 = X.JTP.A0c(r1, r7)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.A0I(r1)
            r0.A04 = r7
            r0.A0H()
            android.view.View r0 = r6.A00
            X.5nL r0 = X.JTP.A0c(r0, r7)
            r0.A0I(r1)
            r0.A0H()
            X.LRd r2 = r6.A05
            r1 = 1
            android.view.View r0 = r2.A01
            r0.setClickable(r1)
            X.LRm r1 = r5.AXA()
            if (r1 == 0) goto L_0x016c
            X.Juy r0 = X.C61002Juy.A03
            X.LMN r0 = r1.A01(r0)
            r2.A03(r0, r15)
            java.lang.String r1 = r4.A0C
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2.A05(r1, r0)
        L_0x010c:
            r0 = -253634929(0xfffffffff0e1d68f, float:-5.591481E29)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x0113:
            android.view.View r1 = r6.A01
            X.2co r0 = X.C315596kB.A02
            X.5nL r1 = X.JTP.A0c(r1, r7)
            r0 = 0
            r1.A0I(r0)
            r0 = 4
            r1.A03 = r0
            r1.A0H()
            android.view.View r0 = r6.A00
            X.5nL r1 = X.JTP.A0c(r0, r7)
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.A0I(r0)
            r1.A0H()
            X.LRd r0 = r6.A05
            android.view.View r0 = r0.A01
            r0.setClickable(r7)
            goto L_0x010c
        L_0x013b:
            X.JZY r1 = X.JZY.VIEW
            X.JZZ r0 = X.JZZ.STORY
            X.JZX.A00(r1, r0, r2, r12, r11)
            android.widget.TextView r2 = r6.A02
            r2.setVisibility(r7)
            r0 = 2131971391(0x7f134d3f, float:1.957976E38)
            if (r13 == 0) goto L_0x014f
            r0 = 2131971392(0x7f134d40, float:1.9579762E38)
        L_0x014f:
            r2.setText(r0)
            X.LRm r1 = r5.AXA()
            if (r1 == 0) goto L_0x0171
            X.Juy r0 = X.C61002Juy.A03
            X.MXS r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x0167
            r0 = 26
            X.LYE r9 = new X.LYE
            r9.<init>((java.lang.Object) r8, (int) r0)
        L_0x0167:
            X.AnonymousClass0fU.A00(r9, r2)
            goto L_0x0094
        L_0x016c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        L_0x0171:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61487K9s.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public C61487K9s(Context context, AnonymousClass0iw r2, UserSession userSession, IngestSessionShim ingestSessionShim, C65635LxC lxC, C363008it r6, MTF mtf, boolean z) {
        this.A00 = context;
        this.A02 = userSession;
        this.A04 = lxC;
        this.A05 = r6;
        this.A06 = mtf;
        this.A07 = z;
        this.A03 = ingestSessionShim;
        this.A01 = r2;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(538026181);
        UserSession userSession = this.A02;
        View A0A = DbU.A0A(DbX.A0F(viewGroup, 0), viewGroup, R.layout.recipient_picker_add_to_story, false);
        A0A.setTag(new C63858L9n(A0A, userSession));
        AnonymousClass0fD.A0A(-954390692, A032);
        return A0A;
    }
}
