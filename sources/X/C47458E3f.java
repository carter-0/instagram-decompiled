package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.E3f  reason: case insensitive filesystem */
public abstract class C47458E3f extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "ChannelBottomSheetNuxFragment";
    public IgdsButton A00;
    public IgdsButton A01;
    public View A02;
    public IgSimpleImageView A03;
    public IgTextView A04;
    public IgTextView A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(new C73902Pld(this, 9));
    public final AnonymousClass0eM A08 = AnonymousClass0eN.A01(new C73902Pld(this, 10));

    public String getModuleName() {
        return "ChannelJoinFlowBottomSheetNuxFragment";
    }

    public final boolean onBackPressed() {
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            r8 = this;
            r2 = 0
            X.0qQ.A0B(r9, r2)
            super.onViewCreated(r9, r10)
            r0 = 2131437198(0x7f0b268e, float:1.8496288E38)
            android.view.View r1 = r9.requireViewById(r0)
            com.instagram.common.ui.base.IgSimpleImageView r1 = (com.instagram.common.ui.base.IgSimpleImageView) r1
            r8.A03 = r1
            if (r1 != 0) goto L_0x001e
            java.lang.String r0 = "drawableView"
        L_0x0016:
            X.0qQ.A0F(r0)
        L_0x0019:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001e:
            boolean r4 = r8 instanceof X.C47831EJd
            if (r4 == 0) goto L_0x00a1
            r0 = 2131237552(0x7f081ab0, float:1.8091358E38)
        L_0x0025:
            r1.setImageResource(r0)
            r0 = 2131437220(0x7f0b26a4, float:1.8496333E38)
            com.instagram.common.ui.base.IgTextView r1 = X.DbT.A0a(r9, r0)
            r8.A05 = r1
            java.lang.String r3 = "titleText"
            if (r1 == 0) goto L_0x0129
            if (r4 == 0) goto L_0x0099
            r0 = 2131959610(0x7f131f3a, float:1.9555865E38)
            java.lang.String r0 = X.DbU.A0m(r8, r0)
        L_0x003e:
            r1.setText(r0)
            if (r4 == 0) goto L_0x004d
            r1 = 2132018635(0x7f1405cb, float:1.9675582E38)
            com.instagram.common.ui.base.IgTextView r0 = r8.A05
            if (r0 == 0) goto L_0x0129
            r0.setTextAppearance(r1)
        L_0x004d:
            r0 = 2131437214(0x7f0b269e, float:1.849632E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r9, r0)
            r8.A04 = r0
            java.lang.String r3 = "subtitleText"
            if (r0 == 0) goto L_0x0129
            X.DbT.A1H(r0)
            com.instagram.common.ui.base.IgTextView r7 = r8.A04
            if (r7 == 0) goto L_0x0129
            r6 = r8
            if (r4 == 0) goto L_0x0091
            X.EJd r6 = (X.C47831EJd) r6
            r0 = 2131959608(0x7f131f38, float:1.9555861E38)
            java.lang.String r5 = X.DbU.A0m(r6, r0)
            r0 = 2131959609(0x7f131f39, float:1.9555863E38)
            android.text.SpannableStringBuilder r3 = X.DbY.A0E(r6, r5, r0)
            int r1 = X.Dbb.A04(r6)
            X.ESx r0 = new X.ESx
            r0.<init>((X.C47831EJd) r6, (int) r1)
            X.AnonymousClass7AV.A04(r3, r0, r5)
        L_0x0080:
            r7.setText(r3)
            r0 = 2131437193(0x7f0b2689, float:1.8496278E38)
            android.view.View r1 = r9.requireViewById(r0)
            r8.A02 = r1
            if (r1 != 0) goto L_0x00a5
            java.lang.String r0 = "divider"
            goto L_0x0016
        L_0x0091:
            r0 = 2131954206(0x7f130a1e, float:1.9544905E38)
            java.lang.String r3 = X.DbU.A0m(r8, r0)
            goto L_0x0080
        L_0x0099:
            r0 = 2131954207(0x7f130a1f, float:1.9544907E38)
            java.lang.String r0 = X.DbU.A0m(r8, r0)
            goto L_0x003e
        L_0x00a1:
            r0 = 2131237550(0x7f081aae, float:1.8091354E38)
            goto L_0x0025
        L_0x00a5:
            r3 = 0
            r0 = 8
            r1.setVisibility(r0)
            r0 = 2131437196(0x7f0b268c, float:1.8496284E38)
            com.instagram.igds.components.button.IgdsButton r1 = X.DbU.A0b(r9, r0)
            X.0qQ.A0B(r1, r2)
            r8.A00 = r1
            if (r4 == 0) goto L_0x011c
            r0 = 2131955052(0x7f130d6c, float:1.954662E38)
            java.lang.String r0 = X.DbU.A0m(r8, r0)
        L_0x00c0:
            r1.setText((java.lang.String) r0)
            com.instagram.igds.components.button.IgdsButton r1 = r8.A00
            if (r1 == 0) goto L_0x0124
            if (r4 == 0) goto L_0x0115
            r0 = 29
            X.FP8 r0 = X.FP8.A00(r8, r0)
        L_0x00cf:
            X.AnonymousClass0fU.A00(r0, r1)
            r0 = 2131437211(0x7f0b269b, float:1.8496314E38)
            com.instagram.igds.components.button.IgdsButton r1 = X.DbU.A0b(r9, r0)
            X.0qQ.A0B(r1, r2)
            r8.A01 = r1
            boolean r2 = r8 instanceof X.C47830EJc
            if (r2 == 0) goto L_0x0113
            r0 = 2131954205(0x7f130a1d, float:1.9544903E38)
            java.lang.String r0 = X.DbU.A0m(r8, r0)
        L_0x00e9:
            r1.setText((java.lang.String) r0)
            com.instagram.igds.components.button.IgdsButton r1 = r8.A01
            if (r1 == 0) goto L_0x0127
            if (r2 == 0) goto L_0x0110
            r0 = 2131954205(0x7f130a1d, float:1.9544903E38)
            java.lang.String r0 = X.DbU.A0m(r8, r0)
            if (r0 == 0) goto L_0x0110
        L_0x00fb:
            r1.setVisibility(r3)
            com.instagram.igds.components.button.IgdsButton r1 = r8.A01
            if (r1 == 0) goto L_0x0127
            if (r2 == 0) goto L_0x010e
            r0 = 26
            X.FP8 r0 = X.FP8.A00(r8, r0)
        L_0x010a:
            X.AnonymousClass0fU.A00(r0, r1)
            return
        L_0x010e:
            r0 = 0
            goto L_0x010a
        L_0x0110:
            r3 = 8
            goto L_0x00fb
        L_0x0113:
            r0 = 0
            goto L_0x00e9
        L_0x0115:
            r0 = 25
            X.FP8 r0 = X.FP8.A00(r8, r0)
            goto L_0x00cf
        L_0x011c:
            r0 = 2131954204(0x7f130a1c, float:1.95449E38)
            java.lang.String r0 = X.DbU.A0m(r8, r0)
            goto L_0x00c0
        L_0x0124:
            java.lang.String r3 = "ctaButton"
            goto L_0x0129
        L_0x0127:
            java.lang.String r3 = "secondaryCtaButton"
        L_0x0129:
            X.0qQ.A0F(r3)
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47458E3f.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-684129803);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_channels_nux_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(1015784816, A022);
        return inflate;
    }
}
