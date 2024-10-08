package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.NOk  reason: case insensitive filesystem */
public final class C68588NOk extends C232222tE {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final O6H A03;
    public final OIO A04;

    public C68588NOk(Context context, AnonymousClass0iw r3, UserSession userSession, O6H o6h, OIO oio) {
        DbW.A1N(userSession, 2, o6h);
        this.A00 = context;
        this.A02 = userSession;
        this.A04 = oio;
        this.A01 = r3;
        this.A03 = o6h;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        List list = C68059MzQ.A0I;
        Context context = this.A00;
        UserSession userSession = this.A02;
        return new C68059MzQ(context, DbT.A0D(layoutInflater, viewGroup, R.layout.direct_challenge_winner_item_layout, false), this.A01, userSession, this.A03, this.A04);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0302, code lost:
        if (r0 == null) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0317, code lost:
        if (r9 != false) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0320, code lost:
        if (r1.equals("CUSTOMIZED_PRIZE") == false) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0273, code lost:
        if (r0.A05 != r7) goto L_0x0275;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x029c, code lost:
        if (r9 == false) goto L_0x029e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r20, X.C249703kE r21) {
        /*
            r19 = this;
            r5 = r21
            r6 = r20
            X.NVI r6 = (X.NVI) r6
            X.MzQ r5 = (X.C68059MzQ) r5
            r4 = 0
            boolean r7 = X.AnonymousClass7TF.A1U(r4, r6, r5)
            X.OIO r8 = r5.A0E
            X.NV4 r10 = r8.A07
            android.app.Activity r9 = r8.A03
            com.instagram.common.session.UserSession r3 = r8.A06
            com.instagram.model.direct.DirectThreadKey r2 = r8.A0F
            X.7ST r1 = r8.A0E
            X.P8W r0 = new X.P8W
            r11 = r0
            r12 = r7
            r13 = r9
            r14 = r3
            r15 = r10
            r16 = r8
            r17 = r1
            r18 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r8.A00 = r0
            java.lang.Integer r3 = r6.A02
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            if (r3 != r2) goto L_0x01b1
            java.lang.String r1 = r6.A04
            java.lang.String r0 = "STORY_SHOUT_OUT"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01b1
            com.instagram.common.session.UserSession r12 = r5.A06
            X.0Tu r8 = X.0Tu.A05
            r0 = 36324312244301793(0x810cc500082fe1, double:3.034979557337159E-306)
            boolean r0 = X.182.A06(r8, r12, r0)
            if (r0 == 0) goto L_0x0113
            android.view.ViewStub r9 = r5.A04
            java.util.List r10 = r6.A06
            int r8 = r10.size()
            if (r8 == r7) goto L_0x00b1
            r1 = 2
            r0 = 2131629521(0x7f0e15d1, float:1.8886365E38)
            if (r8 == r1) goto L_0x005d
            r0 = 2131629523(0x7f0e15d3, float:1.888637E38)
        L_0x005d:
            r9.setLayoutResource(r0)
            X.3oV r9 = r5.A0C
            android.view.View r14 = r9.getView()
            r0 = 2131429786(0x7f0b099a, float:1.8481255E38)
            android.widget.ImageView r11 = X.DbS.A0G(r14, r0)
            android.content.Context r8 = X.AnonymousClass7TE.A0S(r11)
            X.LwN r1 = X.C68059MzQ.A00(r6)
            X.8v9 r0 = new X.8v9
            r0.<init>(r8, r1, r7)
            r11.setImageDrawable(r0)
            java.util.List r1 = X.C68059MzQ.A0H
            int r0 = r10.size()
            java.util.Iterator r13 = X.C66581MXm.A10(r1, r0)
            r1 = 0
        L_0x0088:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r0 = r13.next()
            int r11 = r1 + 1
            if (r1 < 0) goto L_0x01a9
            int r0 = X.AnonymousClass7TE.A0M(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r8 = X.JTO.A0Y(r14, r0)
            java.lang.Object r0 = r10.get(r1)
            X.GnV r0 = (X.C53398GnV) r0
            java.lang.String r0 = r0.A03
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.DbS.A0V(r0)
            X.0iw r0 = r5.A05
            r8.setUrl(r1, r0)
            r1 = r11
            goto L_0x0088
        L_0x00b1:
            r0 = 2131629519(0x7f0e15cf, float:1.8886361E38)
            goto L_0x005d
        L_0x00b5:
            java.util.List r1 = X.C68059MzQ.A0I
            int r0 = r10.size()
            java.util.Iterator r17 = X.C66581MXm.A10(r1, r0)
            r1 = 0
        L_0x00c0:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x023b
            java.lang.Object r0 = r17.next()
            int r16 = r1 + 1
            if (r1 < 0) goto L_0x01a9
            int r0 = X.AnonymousClass7TE.A0M(r0)
            android.widget.ImageView r13 = X.DbS.A0G(r14, r0)
            java.lang.Object r0 = r10.get(r1)
            X.GnV r0 = (X.C53398GnV) r0
            java.lang.Object r0 = r0.A02
            X.3lr r0 = (X.C250663lr) r0
            android.content.Context r15 = X.AnonymousClass7TE.A0S(r14)
            android.content.res.Resources r8 = r15.getResources()
            r1 = 2131165431(0x7f0700f7, float:1.7945079E38)
            int r11 = r8.getDimensionPixelSize(r1)
            android.os.Parcelable$Creator r1 = com.instagram.user.model.User.CREATOR
            r1 = 0
            if (r0 == 0) goto L_0x0111
            java.lang.String r1 = "igid"
            java.lang.String r8 = r0.getOptionalStringField(r7, r1)
            java.lang.String r1 = X.C67009Mgh.A00()
            java.lang.String r1 = r0.A0A(r1)
        L_0x0102:
            com.instagram.user.model.User r0 = new com.instagram.user.model.User
            r0.<init>(r8, r1)
            X.7w8 r0 = X.C39570A0m.A00(r15, r12, r0, r11, r4)
            r13.setImageDrawable(r0)
            r1 = r16
            goto L_0x00c0
        L_0x0111:
            r8 = r1
            goto L_0x0102
        L_0x0113:
            java.util.List r10 = r6.A06
            int r1 = r10.size()
            if (r1 == r7) goto L_0x01a5
            r0 = 2
            if (r1 == r0) goto L_0x01a1
            X.3oV r9 = r5.A0B
        L_0x0120:
            android.view.View r11 = r9.getView()
            r0 = 2131429786(0x7f0b099a, float:1.8481255E38)
            android.widget.ImageView r12 = X.DbS.A0G(r11, r0)
            android.content.Context r8 = X.AnonymousClass7TE.A0S(r12)
            X.LwN r1 = X.C68059MzQ.A00(r6)
            r15 = 0
            X.8v9 r0 = new X.8v9
            r0.<init>(r8, r1, r4)
            r12.setImageDrawable(r0)
            java.util.List r1 = X.C68059MzQ.A0H
            int r0 = r10.size()
            java.util.Iterator r14 = X.C66581MXm.A10(r1, r0)
            r12 = 0
        L_0x0147:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x023b
            java.lang.Object r0 = r14.next()
            int r15 = r15 + 1
            if (r12 < 0) goto L_0x01a9
            int r0 = X.AnonymousClass7TE.A0M(r0)
            android.view.View r8 = r11.findViewById(r0)
            r0 = 2131444030(0x7f0b413e, float:1.8510145E38)
            com.instagram.common.ui.widget.imageview.IgImageView r13 = X.JTO.A0Y(r8, r0)
            java.lang.Object r0 = r10.get(r12)
            X.GnV r0 = (X.C53398GnV) r0
            java.lang.String r0 = r0.A03
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.DbS.A0V(r0)
            X.0iw r0 = r5.A05
            r13.setUrl(r1, r0)
            r0 = 2131444040(0x7f0b4148, float:1.8510165E38)
            android.widget.TextView r8 = X.AnonymousClass7TE.A0d(r8, r0)
            java.lang.Object r0 = r10.get(r12)
            X.GnV r0 = (X.C53398GnV) r0
            java.lang.Object r1 = r0.A02
            X.3lr r1 = (X.C250663lr) r1
            if (r1 == 0) goto L_0x019f
            java.lang.String r0 = X.C67009Mgh.A00()
            java.lang.String r1 = r1.A0A(r0)
        L_0x0190:
            r0 = 64
            if (r1 != 0) goto L_0x0196
            java.lang.String r1 = ""
        L_0x0196:
            java.lang.String r0 = X.002.A0D(r1, r0)
            r8.setText(r0)
            r12 = r15
            goto L_0x0147
        L_0x019f:
            r1 = 0
            goto L_0x0190
        L_0x01a1:
            X.3oV r9 = r5.A0A
            goto L_0x0120
        L_0x01a5:
            X.3oV r9 = r5.A09
            goto L_0x0120
        L_0x01a9:
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01b1:
            android.view.View r1 = r5.A02
            r1.setEnabled(r7)
            X.7Dj r0 = r5.A00
            if (r0 != 0) goto L_0x01dd
            X.7DS r11 = r8.A0B
            X.7DU r12 = r8.A0C
            X.7DW r13 = r8.A00
            X.7XA r0 = r8.A0D
            X.P9W r14 = new X.P9W
            r14.<init>(r0)
            android.view.View r9 = X.JTO.A0F(r5)
            r10 = 0
            X.7Dh r8 = new X.7Dh
            r17 = r4
            r18 = r4
            r15 = r5
            r16 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r5.A00 = r8
            r1.setOnTouchListener(r8)
        L_0x01dd:
            X.7Dj r0 = r5.A00
            if (r0 == 0) goto L_0x01e5
            X.7Di r0 = (X.C328077Di) r0
            r0.A00 = r6
        L_0x01e5:
            X.3oV r9 = r5.A08
            android.view.View r1 = r9.getView()
            r0 = 2131435878(0x7f0b2166, float:1.849361E38)
            com.instagram.common.ui.widget.imageview.IgImageView r8 = X.JTR.A0i(r1, r0)
            r0 = 2131443595(0x7f0b3f8b, float:1.8509263E38)
            android.widget.TextView r12 = X.DbW.A0B(r1, r0)
            r0 = 2131438519(0x7f0b2bb7, float:1.8498967E38)
            com.instagram.common.ui.widget.imageview.IgImageView r13 = X.JTR.A0i(r1, r0)
            java.util.List r10 = r6.A06
            X.3lr r1 = X.C66583MXo.A0K(r10)
            if (r1 == 0) goto L_0x0327
            java.lang.String r0 = "profile_image_uri(size:256)"
            java.lang.String r0 = r1.A09(r0)
        L_0x020e:
            com.instagram.common.typedurl.SimpleImageUrl r11 = X.DbS.A0V(r0)
            X.3lr r1 = X.C66583MXo.A0K(r10)
            if (r1 == 0) goto L_0x0228
            X.0iw r0 = r5.A05
            r13.setUrl(r11, r0)
            java.lang.String r0 = X.C67009Mgh.A00()
            java.lang.String r0 = r1.A0A(r0)
            r12.setText(r0)
        L_0x0228:
            java.lang.Object r0 = X.00k.A0I(r10)
            X.GnV r0 = (X.C53398GnV) r0
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x023b
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.DbS.A0V(r0)
            X.0iw r0 = r5.A05
            r8.setUrl(r1, r0)
        L_0x023b:
            r9.setVisibility(r4)
            int r0 = r3.intValue()
            r8 = 0
            if (r0 == r4) goto L_0x0268
            if (r0 != r7) goto L_0x025a
            com.instagram.igds.components.mediabutton.IgdsMediaButton r4 = r5.A0F
            android.content.Context r1 = r5.A01
            r0 = 2131973441(0x7f135541, float:1.9583918E38)
            java.lang.String r0 = r1.getString(r0)
            r4.setLabel(r0)
            r0 = 27
            X.C71405Ok4.A01(r4, r0, r6, r5)
        L_0x025a:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r1 = r5.A0F
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r3 == r0) goto L_0x0264
            if (r3 == r2) goto L_0x0264
            r8 = 8
        L_0x0264:
            r1.setVisibility(r8)
            return
        L_0x0268:
            java.lang.Object r0 = X.00k.A0J(r10)
            X.GnV r0 = (X.C53398GnV) r0
            if (r0 == 0) goto L_0x0275
            boolean r0 = r0.A05
            r9 = 1
            if (r0 == r7) goto L_0x0276
        L_0x0275:
            r9 = 0
        L_0x0276:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r11 = r5.A0F
            android.content.Context r7 = r5.A01
            java.lang.String r1 = r6.A04
            if (r1 == 0) goto L_0x0322
            int r12 = r1.hashCode()
            r0 = -311713858(0xffffffffed6b9fbe, float:-4.557631E27)
            if (r12 == r0) goto L_0x030c
            r0 = 34398900(0x20ce2b4, float:1.0350636E-37)
            if (r12 == r0) goto L_0x031a
            r0 = 549767569(0x20c4c991, float:3.3337077E-19)
            if (r12 != r0) goto L_0x0322
            java.lang.String r0 = "DIRECT_MESSAGE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0322
            r0 = 2131954959(0x7f130d0f, float:1.9546432E38)
            if (r9 != 0) goto L_0x02a1
        L_0x029e:
            r0 = 2131954958(0x7f130d0e, float:1.954643E38)
        L_0x02a1:
            java.lang.String r0 = X.AnonymousClass7TE.A16(r7, r0)
            r11.setLabel(r0)
            X.Ojx r0 = new X.Ojx
            r0.<init>((int) r4, (java.lang.Object) r5, (java.lang.Object) r6, (boolean) r9)
            X.AnonymousClass0fU.A00(r0, r11)
            java.lang.Object r6 = X.00k.A0J(r10)
            X.GnV r6 = (X.C53398GnV) r6
            if (r6 == 0) goto L_0x025a
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x025a
            com.instagram.common.ui.base.IgTextView r11 = r5.A07
            java.lang.String r0 = "STORY_SHOUT_OUT"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x02d6
            r0 = 2131954962(0x7f130d12, float:1.9546438E38)
            java.lang.String r0 = r7.getString(r0)
        L_0x02cd:
            r11.setText(r0)
            android.view.View r0 = r5.A03
            r0.setVisibility(r4)
            goto L_0x025a
        L_0x02d6:
            r12 = 2131954960(0x7f130d10, float:1.9546434E38)
            X.3lr r1 = X.C66583MXo.A0K(r10)
            if (r1 == 0) goto L_0x030a
            java.lang.String r0 = X.C67009Mgh.A00()
            java.lang.String r10 = r1.A0A(r0)
        L_0x02e7:
            java.lang.String r13 = ""
            if (r10 != 0) goto L_0x02ec
            r10 = r13
        L_0x02ec:
            java.lang.Object r0 = r6.A01
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0304
            long r0 = r0.longValue()
            java.lang.String r9 = "hh:mm aa"
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r6.toMillis(r0)
            java.lang.CharSequence r0 = android.text.format.DateFormat.format(r9, r0)
            if (r0 != 0) goto L_0x0305
        L_0x0304:
            r0 = r13
        L_0x0305:
            java.lang.String r0 = X.DbV.A0u(r7, r10, r0, r12)
            goto L_0x02cd
        L_0x030a:
            r10 = 0
            goto L_0x02e7
        L_0x030c:
            java.lang.String r0 = "STORY_SHOUT_OUT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0322
            r0 = 2131954961(0x7f130d11, float:1.9546436E38)
            if (r9 == 0) goto L_0x02a1
            goto L_0x0322
        L_0x031a:
            java.lang.String r0 = "CUSTOMIZED_PRIZE"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x029e
        L_0x0322:
            r0 = 2131973441(0x7f135541, float:1.9583918E38)
            goto L_0x02a1
        L_0x0327:
            r0 = 0
            goto L_0x020e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68588NOk.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return NVI.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r3) {
        C68059MzQ mzQ = (C68059MzQ) r3;
        0qQ.A0B(mzQ, 0);
        mzQ.A08.setVisibility(8);
        mzQ.A09.setVisibility(8);
        mzQ.A0A.setVisibility(8);
        mzQ.A0B.setVisibility(8);
        mzQ.A0C.setVisibility(8);
        mzQ.A0F.setVisibility(8);
        mzQ.A03.setVisibility(8);
    }
}
