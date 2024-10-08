package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.NOd  reason: case insensitive filesystem */
public final class C68581NOd extends C232222tE {
    public final Context A00;
    public final UserSession A01;
    public final OIQ A02;
    public final C72517P9a A03;
    public final AnonymousClass9HC A04;
    public final AnonymousClass7L2 A05;

    public C68581NOd(Context context, UserSession userSession, OIQ oiq, C72517P9a p9a, AnonymousClass9HC r6, AnonymousClass7L2 r7) {
        0qQ.A0B(userSession, 3);
        this.A02 = oiq;
        this.A03 = p9a;
        this.A01 = userSession;
        this.A00 = context;
        this.A04 = r6;
        this.A05 = r7;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int A002 = C70343O2v.A00(viewGroup);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        UserSession userSession = this.A01;
        0qQ.A0B(userSession, 0);
        boolean A012 = C70867OPg.A01(userSession);
        int i2 = R.layout.card_gallery_card_base_legacy_layout;
        if (A012) {
            i2 = R.layout.card_gallery_card_base_layout;
        }
        return new C68057MzO(this.A00, DbT.A0D(layoutInflater, viewGroup, i2, false), userSession, this.A02, this.A03, this.A04, this.A05, A002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0081, code lost:
        if (X.AnonymousClass7TF.A1Z(r7.A0g) != r4) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r26, X.C249703kE r27) {
        /*
            r25 = this;
            r0 = r27
            r1 = r26
            X.NVY r1 = (X.NVY) r1
            X.MzO r0 = (X.C68057MzO) r0
            r2 = 0
            boolean r4 = X.AnonymousClass7TF.A1U(r2, r1, r0)
            X.OIQ r14 = r0.A04
            android.app.Activity r12 = r14.A01
            com.instagram.common.session.UserSession r13 = r14.A04
            com.instagram.model.direct.DirectThreadKey r3 = r14.A0H
            X.7ST r15 = r14.A0E
            X.P8V r11 = new X.P8V
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16)
            r14.A00 = r11
            int r9 = r0.A01
            r7 = 4603945456567844864(0x3fe4800000000000, double:0.640625)
            double r5 = (double) r9
            double r5 = r5 / r7
            int r7 = (int) r5
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r3.<init>(r9, r7)
            X.OWC r5 = r0.A06
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r6 = r5.A0N
            r6.setLayoutParams(r3)
            r3 = -1038090240(0xffffffffc2200000, float:-40.0)
            r6.setTranslationZ(r3)
            X.3su r3 = r1.A00
            com.google.common.collect.ImmutableList r7 = r3.A0H()
            if (r7 == 0) goto L_0x005a
            java.lang.Object r7 = r7.get(r2)
            X.3tC r7 = (X.C254873tC) r7
            if (r7 == 0) goto L_0x005a
            com.instagram.model.mediasize.ExtendedImageUrl r9 = r7.A0X
            if (r9 == 0) goto L_0x005a
            X.0eM r7 = r5.A0O
            com.instagram.common.ui.widget.imageview.IgImageView r8 = X.C66580MXl.A0R(r7)
            X.Os0 r7 = r0.A0A
            r8.setUrl(r9, r7)
        L_0x005a:
            X.7Dj r7 = r0.A00
            if (r7 != 0) goto L_0x0094
            X.7DS r10 = r14.A09
            X.7DU r11 = r14.A0A
            X.7DW r12 = r14.A00
            X.7XA r7 = r14.A0D
            X.P9Y r13 = new X.P9Y
            r13.<init>(r7)
            android.view.View r8 = X.JTO.A0F(r0)
            X.0eM r7 = r14.A0I
            java.lang.Object r7 = r7.getValue()
            X.9HC r7 = (X.AnonymousClass9HC) r7
            if (r7 == 0) goto L_0x0083
            X.0eM r7 = r7.A0g
            boolean r7 = X.AnonymousClass7TF.A1Z(r7)
            r17 = 1
            if (r7 == r4) goto L_0x0085
        L_0x0083:
            r17 = 0
        L_0x0085:
            r9 = 0
            X.7Dh r7 = new X.7Dh
            r14 = r0
            r15 = r4
            r16 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.A00 = r7
            r6.setOnTouchListener(r7)
        L_0x0094:
            X.7Dj r4 = r0.A00
            if (r4 == 0) goto L_0x009c
            X.7Di r4 = (X.C328077Di) r4
            r4.A00 = r1
        L_0x009c:
            X.3oV r4 = r5.A0G
            X.C66580MXl.A1Q(r4, r2)
            com.google.common.collect.ImmutableList r4 = r3.A0H()
            r7 = 0
            if (r4 == 0) goto L_0x014d
            java.lang.Object r4 = r4.get(r2)
            X.3tC r4 = (X.C254873tC) r4
            if (r4 == 0) goto L_0x014d
            java.lang.String r6 = r4.A11
        L_0x00b2:
            X.3oV r4 = r5.A0L
            android.view.View r4 = r4.getView()
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r6 == 0) goto L_0x00c2
            r4.setText(r6)
            r4.setVisibility(r2)
        L_0x00c2:
            com.google.common.collect.ImmutableList r4 = r3.A0H()
            if (r4 == 0) goto L_0x00d2
            java.lang.Object r4 = r4.get(r2)
            X.3tC r4 = (X.C254873tC) r4
            if (r4 == 0) goto L_0x00d2
            com.instagram.model.mediasize.ExtendedImageUrl r7 = r4.A0U
        L_0x00d2:
            X.3oV r6 = r5.A0D
            boolean r4 = r6.CVM()
            if (r4 != 0) goto L_0x0132
            if (r7 != 0) goto L_0x0132
            com.instagram.common.session.UserSession r4 = r0.A03
            boolean r4 = X.C70867OPg.A01(r4)
            if (r4 == 0) goto L_0x0132
        L_0x00e4:
            com.instagram.common.session.UserSession r13 = r0.A03
            android.content.Context r4 = r0.A02
            android.content.res.Resources r11 = X.AnonymousClass7TF.A0A(r4)
            java.util.List r4 = r3.A0v()
            X.0qQ.A07(r4)
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()
            java.util.Iterator r8 = r4.iterator()
            r10 = 0
        L_0x00fc:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x0150
            java.lang.Object r4 = r8.next()
            X.46u r4 = (X.C2607246u) r4
            java.lang.String r7 = r4.A02
            if (r7 == 0) goto L_0x00fc
            if (r10 != 0) goto L_0x011b
            java.lang.String r5 = r4.A00()
            java.lang.String r4 = r3.A1u
            boolean r4 = X.0qQ.A0K(r5, r4)
            if (r4 == 0) goto L_0x011b
            r10 = r7
        L_0x011b:
            boolean r5 = r6.containsKey(r7)
            r4 = 0
            if (r5 == 0) goto L_0x012c
            java.lang.Number r5 = X.JTO.A0z(r7, r6)
            if (r5 == 0) goto L_0x012c
            int r4 = r5.intValue()
        L_0x012c:
            int r4 = r4 + 1
            X.C66581MXm.A1S(r7, r6, r4)
            goto L_0x00fc
        L_0x0132:
            android.view.View r6 = r6.getView()
            if (r7 == 0) goto L_0x014a
            X.0eM r4 = r5.A0Q
            java.lang.Object r5 = X.AnonymousClass7TE.A14(r4)
            com.instagram.common.ui.widget.imageview.IgImageView r5 = (com.instagram.common.ui.widget.imageview.IgImageView) r5
            X.Os0 r4 = r0.A0A
            r5.setUrl(r7, r4)
            r4 = 0
        L_0x0146:
            r6.setVisibility(r4)
            goto L_0x00e4
        L_0x014a:
            r4 = 8
            goto L_0x0146
        L_0x014d:
            r6 = r7
            goto L_0x00b2
        L_0x0150:
            int r4 = r6.size()
            java.util.ArrayList r9 = X.DbS.A0v(r4)
            java.util.Iterator r8 = X.AnonymousClass7TF.A0s(r6)
        L_0x015c:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x017b
            java.util.Map$Entry r4 = X.AnonymousClass7TE.A1J(r8)
            java.lang.String r7 = X.DbT.A13(r4)
            int r6 = X.C66582MXn.A08(r4)
            boolean r5 = X.0qQ.A0K(r7, r10)
            com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction r4 = new com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction
            r4.<init>(r7, r6, r5)
            r9.add(r4)
            goto L_0x015c
        L_0x017b:
            com.google.common.collect.ImmutableList r12 = X.DbU.A0K(r9)
            java.lang.String r17 = r3.A0g()
            java.lang.String r3 = r1.A01
            X.7L2 r1 = r0.A07
            X.7Kx r15 = r1.A04
            X.9HC r14 = r0.A05
            X.2FW r16 = X.2FW.A0W
            r18 = 0
            r19 = r3
            r20 = r2
            r21 = r2
            r22 = r2
            r23 = r2
            r24 = r2
            X.79G r2 = X.C66850Mdj.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.7D6 r1 = r0.A09
            X.7EA r0 = r0.A08
            r1.ADp(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68581NOd.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return NVY.class;
    }
}
