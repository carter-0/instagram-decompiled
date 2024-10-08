package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

public final class NJJ extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "BarcelonaGoldenTicketFragment";
    public long A00;
    public C70974OTv A01;
    public C70667OFo A02;
    public 1Av A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final AnonymousClass0eM A0A = C227642jf.A02(this);

    public final String getModuleName() {
        return C273654mx.A00(65);
    }

    public final String getModuleNameV2() {
        return C273654mx.A00(65);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: X.NJJ} */
    /* JADX WARNING: type inference failed for: r3v27, types: [java.lang.Object, X.5sZ] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0390  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r28, android.os.Bundle r29) {
        /*
            r27 = this;
            r2 = 0
            r0 = r28
            X.0qQ.A0B(r0, r2)
            r1 = r27
            r3 = r29
            super.onViewCreated(r0, r3)
            androidx.fragment.app.FragmentActivity r7 = r1.requireActivity()
            X.0qq r4 = X.AnonymousClass0qo.A00(r7)
            X.0qm r3 = X.0qm.A0x
            android.graphics.Typeface r19 = r4.A02(r3)
            X.0qq r4 = X.AnonymousClass0qo.A00(r7)
            X.0qm r3 = X.0qm.A0w
            android.graphics.Typeface r18 = r4.A02(r3)
            android.os.Bundle r6 = r1.requireArguments()
            java.lang.String r5 = "target_user_id"
            r3 = 0
            long r14 = r6.getLong(r5, r3)
            r3 = 2131442809(0x7f0b3c79, float:1.8507668E38)
            android.view.View r6 = X.AnonymousClass7TF.A0G(r0, r3)
            com.instagram.igds.components.shimmer.placeholder.SimpleShimmerPlaceholderView r6 = (com.instagram.igds.components.shimmer.placeholder.SimpleShimmerPlaceholderView) r6
            r3 = 2131442807(0x7f0b3c77, float:1.8507664E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r0, r3)
            com.instagram.common.ui.base.IgTextView r4 = (com.instagram.common.ui.base.IgTextView) r4
            X.0xx r3 = X.DbW.A0E(r1)
            r5 = 0
            X.MFi r8 = new X.MFi
            r9 = r19
            r10 = r1
            r11 = r4
            r12 = r6
            r13 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14)
            X.AnonymousClass7TE.A1Z(r8, r3)
            r3 = 2131099778(0x7f060082, float:1.7811919E38)
            int r3 = r7.getColor(r3)
            X.2db.A02(r7, r3)
            X.AnonymousClass2uJ.A04(r7, r3)
            r0.setBackgroundColor(r3)
            long r3 = r1.A00
            java.util.Date r6 = new java.util.Date
            r6.<init>(r3)
            X.0eM r3 = r1.A0A
            r26 = r3
            X.17i r4 = X.JTR.A0u(r26)
            java.lang.String r3 = java.lang.String.valueOf(r14)
            com.instagram.user.model.User r9 = r4.A02(r3)
            if (r9 != 0) goto L_0x0087
            X.0eE r4 = X.AnonymousClass0t1.A01
            r3 = r26
            com.instagram.user.model.User r9 = X.DbX.A0l(r4, r3)
        L_0x0087:
            r3 = 2131100275(0x7f060273, float:1.7812927E38)
            int r13 = r7.getColor(r3)
            r3 = 2131431929(0x7f0b11f9, float:1.8485601E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r0, r3)
            r7 = 8
            X.C71403Ok2.A01(r3, r7, r1)
            r3 = 2131430862(0x7f0b0dce, float:1.8483437E38)
            android.widget.ImageView r8 = X.DbX.A0J(r0, r3)
            boolean r3 = r1.A08
            if (r3 == 0) goto L_0x03f1
            android.content.Context r10 = r1.requireContext()
            r3 = 2131099778(0x7f060082, float:1.7811919E38)
            int r15 = r10.getColor(r3)
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r26)
            r4 = 0
            X.NQt r3 = new X.NQt
            r11 = r10
            r14 = r13
            r10 = r3
            r10.<init>(r11, r12, r13, r14, r15)
            r15 = 1
            r3.A03 = r15
            r3.A01 = r6
            java.lang.Integer r11 = X.AnonymousClass05K.A0C
            r3.A00 = r11
            java.util.HashMap r14 = r3.A0C
            X.1G0.A0H(r6, r14)
            X.3gq r12 = X.C247743gq.MONTHS
            java.lang.Number r10 = X.JTO.A0z(r12, r14)
            if (r10 == 0) goto L_0x03e6
            int r10 = r10.intValue()
            if (r10 <= 0) goto L_0x03e6
            java.util.Calendar r11 = java.util.Calendar.getInstance()
            java.util.Date r10 = r3.A01
            r11.setTime(r10)
            r10 = 12
            r11.add(r10, r15)
            java.util.Date r10 = r11.getTime()
            X.1G0.A0H(r10, r14)
            com.google.common.collect.ImmutableMap r11 = com.google.common.collect.ImmutableMap.copyOf(r14)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            int r21 = X.C66583MXo.A05(r11, r12, r10)
            X.3gq r12 = X.C247743gq.DAYS
            int r22 = X.C66583MXo.A05(r11, r12, r10)
            X.3gq r12 = X.C247743gq.HOURS
            int r23 = X.C66583MXo.A05(r11, r12, r10)
            X.3gq r12 = X.C247743gq.MINUTES
            int r24 = X.C66583MXo.A05(r11, r12, r10)
            X.3gq r12 = X.C247743gq.SECONDS
            int r25 = X.C66583MXo.A05(r11, r12, r10)
            r20 = r3
            X.C68640NQt.A02(r20, r21, r22, r23, r24, r25)
            X.0mB r10 = r3.A09
            r10.A00()
            r3.invalidateSelf()
        L_0x011f:
            r8.setImageDrawable(r3)
        L_0x0122:
            r8.setVisibility(r4)
            r3 = 2131432471(0x7f0b1417, float:1.84867E38)
            android.widget.TextView r10 = X.AnonymousClass7TG.A0R(r0, r3)
            boolean r3 = r1.A07
            if (r3 == 0) goto L_0x0154
            r4 = 2
            r3 = 1098907648(0x41800000, float:16.0)
            r10.setTextSize(r4, r3)
            r10.setTextColor(r13)
            r3 = r19
            r10.setTypeface(r3)
            r8 = 2131953645(0x7f1307ed, float:1.9543767E38)
            java.lang.String r4 = r1.A04
            if (r4 != 0) goto L_0x014f
            java.lang.String r4 = "appName"
        L_0x0147:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x014f:
            r3 = 0
            X.DbX.A1F(r10, r1, r4, r8)
            goto L_0x0156
        L_0x0154:
            r3 = 8
        L_0x0156:
            r10.setVisibility(r3)
            r3 = 2131442797(0x7f0b3c6d, float:1.8507644E38)
            android.view.View r15 = X.AnonymousClass7TF.A0G(r0, r3)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            r3 = r26
            X.0lg r10 = X.AnonymousClass7TF.A0L(r3, r2)
            java.lang.Boolean r3 = X.AnonymousClass9HN.A00(r10)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0390
            X.0Tu r8 = X.0Tu.A05
            r3 = 36318887701715530(0x8107d600191a4a, double:3.0315490547627264E-306)
            boolean r3 = X.182.A06(r8, r10, r3)
            if (r3 == 0) goto L_0x0390
            r3 = 2131433609(0x7f0b1889, float:1.8489009E38)
            android.view.View r11 = X.AnonymousClass7TF.A0F(r0, r3)
            r3 = 2131442798(0x7f0b3c6e, float:1.8507646E38)
            android.view.View r12 = X.AnonymousClass7TF.A0G(r0, r3)
            r3 = 2131442805(0x7f0b3c75, float:1.850766E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r0, r3)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3 = 2131442800(0x7f0b3c70, float:1.850765E38)
            android.view.View r13 = X.AnonymousClass7TF.A0G(r0, r3)
            r3 = 2131442799(0x7f0b3c6f, float:1.8507648E38)
            android.view.View r14 = X.AnonymousClass7TF.A0G(r0, r3)
            boolean r3 = r1.A07
            X.OTv r10 = new X.OTv
            r16 = r4
            r17 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            android.widget.ImageView r8 = r10.A07
            X.U11 r3 = r10.A0A
            r8.setImageDrawable(r3)
            r4 = 2
            r8.setLayerType(r4, r5)
            android.widget.ImageView r3 = r10.A08
            r3.setLayerType(r4, r5)
            android.view.View r3 = r10.A06
            r3.setLayerType(r4, r5)
            android.view.View r3 = r10.A04
            r3.setLayerType(r4, r5)
            android.view.View r3 = r10.A03
            X.C71439Oke.A01(r3, r2, r10)
            X.2cs r8 = r10.A09
            r3 = 4599976659396224614(0x3fd6666666666666, double:0.35)
            r8.A07(r3)
            r1.A01 = r10
        L_0x01da:
            r3 = 2131442806(0x7f0b3c76, float:1.8507662E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r0, r3)
            r3 = 2131442805(0x7f0b3c75, float:1.850766E38)
            android.widget.ImageView r10 = X.DbX.A0J(r0, r3)
            boolean r3 = r1.A07
            if (r3 == 0) goto L_0x0388
            r4.setVisibility(r7)
            java.util.Locale r3 = X.AnonymousClass1Q2.A02()
            java.lang.String r8 = r3.getLanguage()
            X.0qQ.A07(r8)
            java.lang.String r4 = "en"
            r3 = 1
            boolean r4 = X.C66580MXl.A1a(r4, r3, r8)
            r3 = 2131237403(0x7f081a1b, float:1.8091055E38)
            if (r4 == 0) goto L_0x0209
            r3 = 2131237402(0x7f081a1a, float:1.8091053E38)
        L_0x0209:
            r10.setImageResource(r3)
            r10.setVisibility(r2)
        L_0x020f:
            r3 = 2131442802(0x7f0b3c72, float:1.8507654E38)
            android.widget.TextView r4 = X.AnonymousClass7TG.A0R(r0, r3)
            r3 = r18
            r4.setTypeface(r3)
            r3 = 2131442801(0x7f0b3c71, float:1.8507652E38)
            android.widget.TextView r12 = X.AnonymousClass7TG.A0R(r0, r3)
            r3 = r19
            r12.setTypeface(r3)
            android.content.Context r8 = r1.requireContext()
            java.text.SimpleDateFormat r3 = X.C362978ip.A01
            r14 = 2
            r3 = 2131975436(0x7f135d0c, float:1.9587964E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r8, r3)
            r3 = 2131976949(0x7f1362f5, float:1.9591033E38)
            java.lang.String r17 = X.AnonymousClass7TE.A16(r8, r3)
            java.util.Date r3 = new java.util.Date
            r3.<init>()
            java.util.Date r16 = X.C362978ip.A01(r5, r3)
            java.util.Calendar r13 = java.util.Calendar.getInstance()
            r3 = r16
            r13.setTime(r3)
            r8 = 1
            int r15 = r13.get(r8)
            int r11 = r13.get(r14)
            r10 = 5
            int r3 = r13.get(r10)
            java.util.Date r5 = X.C362978ip.A01(r5, r6)
            r13.setTime(r5)
            int r6 = r13.get(r8)
            int r14 = r13.get(r14)
            int r10 = r13.get(r10)
            if (r3 != r10) goto L_0x035d
            if (r11 != r14) goto L_0x035d
            if (r15 != r6) goto L_0x035d
        L_0x0275:
            r12.setText(r4)
            r3 = 2131442812(0x7f0b3c7c, float:1.8507674E38)
            android.widget.TextView r4 = X.AnonymousClass7TG.A0R(r0, r3)
            r3 = r18
            r4.setTypeface(r3)
            r3 = 2131442811(0x7f0b3c7b, float:1.8507672E38)
            android.widget.TextView r11 = X.AnonymousClass7TG.A0R(r0, r3)
            r3 = r19
            r11.setTypeface(r3)
            long r3 = r1.A00
            java.util.Calendar r6 = X.C14240TsN.A02
            java.util.Date r5 = new java.util.Date
            r5.<init>(r3)
            r6.setTime(r5)
            java.util.Locale r10 = X.C14240TsN.A05()
            java.lang.String r6 = "hh:mm a"
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat
            r5.<init>(r6, r10)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = r5.format(r3)
            X.0qQ.A07(r3)
            r11.setText(r3)
            r3 = 2131442816(0x7f0b3c80, float:1.8507683E38)
            android.widget.TextView r4 = X.AnonymousClass7TG.A0R(r0, r3)
            r3 = r18
            r4.setTypeface(r3)
            r3 = 2131442815(0x7f0b3c7f, float:1.850768E38)
            android.widget.TextView r4 = X.AnonymousClass7TG.A0R(r0, r3)
            r3 = r19
            r4.setTypeface(r3)
            X.DbU.A1H(r4, r9)
            r3 = 2131438519(0x7f0b2bb7, float:1.8498967E38)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = X.DbX.A0b(r0, r3)
            X.DbU.A1S(r1, r3, r9)
            r3 = 2131443595(0x7f0b3f8b, float:1.8509263E38)
            android.widget.TextView r5 = X.AnonymousClass7TG.A0R(r0, r3)
            java.lang.String r3 = r9.getUsername()
            android.text.SpannableStringBuilder r4 = X.DbS.A0C(r3)
            boolean r3 = r9.isVerified()
            if (r3 == 0) goto L_0x02f6
            android.content.Context r3 = r1.requireContext()
            X.C244273av.A08(r3, r4, r8)
        L_0x02f6:
            r5.setText(r4)
            r3 = 2131428900(0x7f0b0624, float:1.8479458E38)
            android.view.View r5 = X.AnonymousClass7TF.A0F(r0, r3)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r5 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r5
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x03f5
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x0344
            r0 = r26
            com.instagram.common.session.UserSession r6 = X.DbW.A0S(r0, r2)
            java.lang.Boolean r0 = X.AnonymousClass9HN.A00(r6)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0344
            boolean r0 = X.C319886rO.A01(r6)
            if (r0 == 0) goto L_0x0344
            X.0Tu r0 = X.0Tu.A05
            r3 = 36318887700994623(0x8107d6000e1a3f, double:3.031549054306822E-306)
            boolean r0 = X.182.A06(r0, r6, r3)
            if (r0 == 0) goto L_0x0344
            boolean r0 = r1.A09
            if (r0 != 0) goto L_0x03f5
            A00(r1, r5)
        L_0x0334:
            r5.setVisibility(r2)
            X.OjA r0 = new X.OjA
            r3 = r0
            r4 = r2
            r6 = r9
            r7 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            X.AnonymousClass0fU.A00(r0, r5)
            return
        L_0x0344:
            r8 = 0
            boolean r0 = r1.A06
            java.lang.String r4 = "appName"
            r3 = 2131953640(0x7f1307e8, float:1.9543757E38)
            if (r0 == 0) goto L_0x0351
            r3 = 2131953639(0x7f1307e7, float:1.9543755E38)
        L_0x0351:
            java.lang.String r0 = r1.A04
            if (r0 == 0) goto L_0x0147
            java.lang.String r0 = X.DbV.A0z(r1, r0, r3)
            r5.setLabel(r0)
            goto L_0x0334
        L_0x035d:
            int r3 = r3 - r8
            if (r10 != r3) goto L_0x0368
            if (r14 != r11) goto L_0x0368
            if (r6 != r15) goto L_0x0368
            r4 = r17
            goto L_0x0275
        L_0x0368:
            long r13 = r16.getTime()
            long r3 = r5.getTime()
            long r13 = r13 - r3
            r10 = 31536000000(0x757b12c00, double:1.55808542072E-313)
            int r3 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r3 > 0) goto L_0x0385
            java.text.SimpleDateFormat r3 = X.C362978ip.A01
        L_0x037c:
            java.lang.String r4 = r3.format(r5)
            X.0qQ.A0A(r4)
            goto L_0x0275
        L_0x0385:
            java.text.SimpleDateFormat r3 = X.C362978ip.A03
            goto L_0x037c
        L_0x0388:
            r10.setVisibility(r7)
            r4.setVisibility(r2)
            goto L_0x020f
        L_0x0390:
            android.content.Context r8 = r1.requireContext()
            android.content.res.Resources r4 = X.DbV.A05(r1)
            r3 = 2131165218(0x7f070022, float:1.7944647E38)
            float r11 = r4.getDimension(r3)
            android.content.res.Resources r4 = X.DbV.A05(r1)
            r3 = 2131165288(0x7f070068, float:1.7944789E38)
            float r4 = r4.getDimension(r3)
            r3 = 2131100036(0x7f060184, float:1.7812442E38)
            int r10 = r8.getColor(r3)
            X.6yg r8 = new X.6yg
            r8.<init>()
            X.5sY r3 = new X.5sY
            r3.<init>()
            r8.A06 = r3
            r8.A07 = r3
            r8.A05 = r3
            r8.A04 = r3
            r8.A00(r11)
            X.6ym r3 = new X.6ym
            r3.<init>(r4)
            r8.A0B = r3
            X.6ym r3 = new X.6ym
            r3.<init>(r4)
            r8.A08 = r3
            X.5sX r4 = new X.5sX
            r4.<init>(r8)
            X.5sV r3 = new X.5sV
            r3.<init>((X.C297895sX) r4)
            r3.setTint(r10)
            r15.setImageDrawable(r3)
            goto L_0x01da
        L_0x03e6:
            r3.A01 = r6
            r3.A00 = r11
            r3.A02 = r2
            X.C68640NQt.A01(r3)
            goto L_0x011f
        L_0x03f1:
            r4 = 8
            goto L_0x0122
        L_0x03f5:
            r5.setVisibility(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJJ.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, X.5n1] */
    public static final void A00(NJJ njj, IgdsMediaButton igdsMediaButton) {
        int i;
        if (njj.A09) {
            Drawable drawable = njj.requireContext().getDrawable(R.drawable.instagram_alert_check_pano_outline_24);
            if (drawable != null) {
                int A032 = DbS.A03(DbV.A05(njj), R.dimen.action_bar_item_spacing_right);
                drawable.setBounds(0, 0, A032, A032);
                igdsMediaButton.setLabel((CharSequence) null);
                ? obj = new Object();
                obj.A01 = drawable;
                igdsMediaButton.setStartAddOn(obj, njj.getString(2131953643));
                return;
            }
            igdsMediaButton.A05();
            i = 2131953643;
        } else {
            igdsMediaButton.A05();
            i = 2131953641;
        }
        igdsMediaButton.setLabel(njj.getString(i));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public final boolean onBackPressed() {
        DbT.A1K(this);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0089, code lost:
        if (X.182.A06(X.0Tu.A05, r6, 36318887702305363L) == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0028, code lost:
        if (X.0oI.A0A(r1) != false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            r0 = -551277229(0xffffffffdf242d53, float:-1.1830203E19)
            int r4 = X.AnonymousClass0fD.A02(r0)
            X.NJJ.super.onCreate(r11)
            android.os.Bundle r2 = r10.requireArguments()
            java.lang.String r1 = "source"
            java.lang.String r0 = "unknown"
            java.lang.String r7 = r2.getString(r1, r0)
            android.content.Context r1 = r10.requireContext()
            boolean r0 = X.0oI.A09(r1)
            r10.A05 = r0
            r6 = 0
            if (r0 != 0) goto L_0x002a
            boolean r1 = X.0oI.A0A(r1)
            r0 = 0
            if (r1 == 0) goto L_0x002b
        L_0x002a:
            r0 = 1
        L_0x002b:
            r10.A06 = r0
            X.0eM r3 = r10.A0A
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            java.lang.String r0 = X.C319886rO.A00(r0)
            r10.A04 = r0
            X.0lg r8 = X.DbT.A0X(r3)
            r5 = 0
            X.0qQ.A0B(r8, r6)
            java.lang.Boolean r0 = X.AnonymousClass9HN.A00(r8)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00ff
            X.0Tu r2 = X.0Tu.A05
            r0 = 36600362677112683(0x8207d600050f6b, double:3.209554962612638E-306)
            long r0 = X.JTS.A05(r2, r8, r0)
        L_0x0056:
            r10.A00 = r0
            r8 = 0
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x0067
            long r8 = java.lang.System.currentTimeMillis()
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x0067
            r6 = 1
        L_0x0067:
            r10.A08 = r6
            com.instagram.common.session.UserSession r6 = X.DbW.A0S(r3, r5)
            java.lang.Boolean r0 = X.AnonymousClass9HN.A00(r6)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x008b
            boolean r0 = X.C319886rO.A01(r6)
            if (r0 == 0) goto L_0x008b
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318887702305363(0x8107d600221a53, double:3.031549055135739E-306)
            boolean r1 = X.182.A06(r2, r6, r0)
            r0 = 1
            if (r1 != 0) goto L_0x008c
        L_0x008b:
            r0 = 0
        L_0x008c:
            r10.A07 = r0
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r3)
            X.0qQ.A0A(r7)
            boolean r0 = r10.A06
            X.OFo r6 = new X.OFo
            r6.<init>(r10, r1, r7, r0)
            r10.A02 = r6
            X.0Ae r1 = r6.A00
            java.lang.String r0 = "barcelona_golden_ticket_vpv_impression"
            X.0Aj r2 = X.C51969G9p.A0d(r1, r0)
            java.lang.String r1 = r6.A03
            java.lang.String r0 = "impression_source"
            r2.AAJ(r0, r1)
            X.0iw r0 = r6.A01
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "module"
            X.C51973G9u.A14(r2, r0, r1)
            com.instagram.common.session.UserSession r0 = r6.A02
            java.lang.String r0 = r0.A06
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r0)
            java.lang.String r0 = "target_user_id"
            r2.A9F(r0, r1)
            boolean r0 = r6.A04
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_barcelona_installed"
            r2.A7p(r0, r1)
            r2.Cgf()
            X.1Av r0 = X.DbX.A0h(r3)
            r10.A03 = r0
            java.lang.String r3 = "userPrefs"
            if (r0 == 0) goto L_0x0103
            r2 = 1
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "barcelona_has_seen_golden_ticket"
            r1.E5T(r0, r2)
            r1.apply()
            X.1Av r0 = r10.A03
            if (r0 == 0) goto L_0x0103
            X.0xa r1 = r0.A01
            java.lang.String r0 = "barcelona_is_golden_ticket_reminder_enabled"
            boolean r0 = r1.getBoolean(r0, r5)
            r10.A09 = r0
            r0 = 1650476859(0x6260473b, float:1.03430084E21)
            X.AnonymousClass0fD.A09(r0, r4)
            return
        L_0x00ff:
            r0 = 0
            goto L_0x0056
        L_0x0103:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJJ.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1384125091);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_barcelona_golden_ticket, false);
        AnonymousClass0fD.A09(852630508, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1695731716);
        super.onDestroyView();
        C70974OTv oTv = this.A01;
        if (oTv != null) {
            oTv.A09.A00();
        }
        this.A01 = null;
        AnonymousClass0fD.A09(738548175, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(630131959);
        NJJ.super.onPause();
        C70974OTv oTv = this.A01;
        if (oTv != null) {
            oTv.A09.A01();
        }
        AnonymousClass0fD.A09(-976569944, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1406216159);
        super.onResume();
        C70974OTv oTv = this.A01;
        if (oTv != null) {
            oTv.A09.A07(0.35d);
        }
        AnonymousClass0fD.A09(80382446, A022);
    }
}
