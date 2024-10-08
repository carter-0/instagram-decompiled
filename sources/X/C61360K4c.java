package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.K4c  reason: case insensitive filesystem */
public final class C61360K4c extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "LiveAudienceSelectorFragment";
    public TextView A00;
    public C2355930l A01;
    public C71662eb A02;
    public C71662eb A03;
    public C71662eb A04;
    public C71662eb A05;
    public C71662eb A06;
    public C71662eb A07;
    public C71662eb A08;
    public C71662eb A09;
    public C339337jR A0A;
    public C273004lm A0B;
    public IgdsBottomButtonLayout A0C;
    public C331157Pu A0D;
    public AnonymousClass3NV A0E;
    public boolean A0F;
    public C71662eb A0G;
    public final AnonymousClass0eM A0H = C227642jf.A02(this);
    public final EnumMap A0I = new EnumMap(AnonymousClass3NV.class);

    public static ViewStub A00(View view, int i) {
        View findViewById = view.findViewById(i);
        if (findViewById instanceof ViewStub) {
            return (ViewStub) findViewById;
        }
        return null;
    }

    public final String getModuleName() {
        return "live_audience_control";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0287, code lost:
        r1 = r0.A01();
        X.0qQ.A07(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x028e, code lost:
        r14.A0I.put(r2, X.AnonymousClass7TF.A0G(r1, com.instagram.android.R.id.radio_button));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x029e, code lost:
        if (X.JTU.A1a(r4) == false) goto L_0x02c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02a0, code lost:
        r3 = X.DbT.A0b(r1, com.instagram.android.R.id.icon);
        X.0qQ.A0A(r3);
        r3.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02af, code lost:
        if (r2 != X.AnonymousClass3NV.A09) goto L_0x0437;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02b1, code lost:
        r0 = X.C339717k3.A00(X.AnonymousClass7TE.A0l(r4)).A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02bb, code lost:
        if (r0 == null) goto L_0x02c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02bd, code lost:
        r3.setUrl(r0, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02c2, code lost:
        if (r2 != X.AnonymousClass3NV.A04) goto L_0x02c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02c4, code lost:
        r3.setBackground((android.graphics.drawable.Drawable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02c7, code lost:
        r9 = X.Dba.A06(r1);
        r10 = r9.getContext();
        r9.setText(X.C39806AAd.A01(r10, X.AnonymousClass7TE.A0l(r4), r2, X.JTU.A1a(r4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02e2, code lost:
        if (X.JTU.A1a(r4) == false) goto L_0x02f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02e4, code lost:
        r9.setTextAppearance(requireContext(), com.instagram.android.R.style.igds_emphasized_body_1);
        X.DbT.A17(requireContext(), r9, X.2Yu.A07(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02f9, code lost:
        r3 = X.DbU.A0G(r1, com.instagram.android.R.id.sub_title);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0304, code lost:
        if (X.JTU.A1a(r4) == false) goto L_0x030c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0308, code lost:
        if (r2 != X.AnonymousClass3NV.A04) goto L_0x030c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x030a, code lost:
        r14.A00 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x030c, code lost:
        r9 = requireContext();
        r10 = X.JTU.A1a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0314, code lost:
        switch(r11) {
            case 0: goto L_0x041a;
            case 1: goto L_0x03ee;
            case 2: goto L_0x0421;
            case 3: goto L_0x0428;
            case 4: goto L_0x042f;
            case 5: goto L_0x0406;
            default: goto L_0x0317;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0317, code lost:
        if (r10 != false) goto L_0x042f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0319, code lost:
        r0 = 2131963856;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x031c, code lost:
        r0 = r9.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0320, code lost:
        if (r0 == null) goto L_0x042f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0322, code lost:
        r3.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0325, code lost:
        r0 = r14.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0327, code lost:
        if (r0 != null) goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0329, code lost:
        r11 = "selectedVisibilityMode";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x032b, code lost:
        X.0qQ.A0F(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0330, code lost:
        if (r2 != r0) goto L_0x0335;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0332, code lost:
        A02(r14, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0335, code lost:
        X.LY8.A00(r1, 60, r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x033c, code lost:
        if (r2 != X.AnonymousClass3NV.A04) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0342, code lost:
        if (X.JTU.A1a(r4) != false) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0344, code lost:
        r14.A00 = X.DbU.A0G(r1, com.instagram.android.R.id.action_text);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x034d, code lost:
        r0 = r14.A00;
        r11 = "closeFriendsActionTextView";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0351, code lost:
        if (r0 == null) goto L_0x032b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0353, code lost:
        r0.setVisibility(0);
        r3 = r14.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0358, code lost:
        if (r3 == null) goto L_0x032b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x035a, code lost:
        r0 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0364, code lost:
        if (X.C324536zU.A00(X.AnonymousClass7TE.A0l(r4)) == false) goto L_0x0369;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0366, code lost:
        r0 = 0.3f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0369, code lost:
        r3.setAlpha(r0);
        r2 = X.JTU.A1a(r4);
        r0 = com.instagram.android.R.id.action_chevron;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0373, code lost:
        if (r2 == false) goto L_0x0378;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0375, code lost:
        r0 = com.instagram.android.R.id.sub_title_chevron;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0378, code lost:
        X.DbT.A1F(r1, r0, 0);
        r0 = X.AnonymousClass7TE.A0l(r4);
        r10 = X.AnonymousClass0t1.A01;
        r0 = X.DbS.A0h(r0, r10).Afi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0389, code lost:
        if (r0 == null) goto L_0x03bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x038f, code lost:
        if (r0.intValue() != 0) goto L_0x03bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0391, code lost:
        r1 = r14.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0393, code lost:
        if (r1 == null) goto L_0x032b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0395, code lost:
        r1.setText(2131963851);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x039b, code lost:
        r1 = r14.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x039d, code lost:
        if (r1 == null) goto L_0x032b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x039f, code lost:
        X.LY0.A00(r1, 51, r14);
        r3 = X.DbX.A0h(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03b2, code lost:
        if (X.AnonymousClass7TG.A1a(r3, r3.A6N, X.1Av.A8a, 112) != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03b4, code lost:
        r0 = r14.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03b6, code lost:
        if (r0 != null) goto L_0x0444;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03b8, code lost:
        r9 = "closeFriendsTooltipViewStub";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03ba, code lost:
        X.0qQ.A0F(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03bf, code lost:
        r9 = r14.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03c1, code lost:
        if (r9 == null) goto L_0x032b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03c3, code lost:
        r0 = X.DbX.A0l(r10, r4).A03.Afi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03cd, code lost:
        if (r0 == null) goto L_0x03ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03cf, code lost:
        r0 = X.DbV.A0v(r1.getResources(), X.DbX.A0l(r10, r4).A03.Afi(), com.instagram.android.R.plurals.iglive_audience_mode_close_friends_edit_option_close_friends_added, r0.intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03e8, code lost:
        r9.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03ec, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03f6, code lost:
        if (X.2R8.A00(X.AnonymousClass7TE.A0l(r4)) == false) goto L_0x03ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03f8, code lost:
        if (r10 != false) goto L_0x042f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03fa, code lost:
        r0 = 2131963860;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03ff, code lost:
        if (r10 != false) goto L_0x042f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0401, code lost:
        r0 = 2131963859;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0406, code lost:
        r0 = X.C66637Ma6.A00(r9, java.lang.Integer.valueOf(X.C339717k3.A00(X.AnonymousClass7TE.A0l(r4)).A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x041a, code lost:
        if (r10 != false) goto L_0x042f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x041c, code lost:
        r0 = 2131963863;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0421, code lost:
        if (r10 != false) goto L_0x042f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0423, code lost:
        r0 = 2131963868;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0428, code lost:
        if (r10 != false) goto L_0x042f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x042a, code lost:
        r0 = 2131963850;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x042f, code lost:
        X.0qQ.A0A(r3);
        r3.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0437, code lost:
        r3.setImageDrawable(X.C39806AAd.A00(r3.getContext(), r2, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0444, code lost:
        r10 = X.AnonymousClass7TG.A0R(r0.A01(), com.instagram.android.R.id.tooltip_text);
        r9 = new X.C62146Kaz(r14, X.Dbb.A04(r14));
        r0 = 2131965158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x045f, code lost:
        if (X.JTU.A1a(r4) == false) goto L_0x0464;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0461, code lost:
        r0 = 2131965159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0464, code lost:
        r1 = X.002.A0g(getString(r0), " ", getString(2131953242));
        X.0qQ.A07(r1);
        r10.setText(r1);
        X.AnonymousClass7AV.A07(r9, r10, X.DbU.A0m(r14, 2131953242), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x00b5, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            r14 = this;
            r5 = 0
            X.0qQ.A0B(r15, r5)
            r0 = r16
            super.onViewCreated(r15, r0)
            r0 = 2131428234(0x7f0b038a, float:1.8478107E38)
            android.view.View r8 = X.AnonymousClass7TF.A0G(r15, r0)
            boolean r0 = r14.A0F
            if (r0 != 0) goto L_0x0037
            X.0eM r0 = r14.A0H
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            boolean r0 = X.C278264wZ.A00(r0)
            if (r0 == 0) goto L_0x0037
            int r3 = r8.getPaddingLeft()
            int r2 = r8.getPaddingTop()
            int r1 = r8.getPaddingRight()
            android.content.res.Resources r0 = r8.getResources()
            int r0 = X.AnonymousClass7TE.A0B(r0)
            r8.setPadding(r3, r2, r1, r0)
        L_0x0037:
            r0 = 2131428248(0x7f0b0398, float:1.8478135E38)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = X.DbT.A0c(r15, r0)
            r14.A0C = r0
            boolean r0 = r14.A0F
            r6 = 8
            java.lang.String r13 = "submitButton"
            r7 = 0
            if (r0 != 0) goto L_0x005c
            X.0eM r0 = r14.A0H
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            boolean r0 = X.C278264wZ.A00(r0)
            if (r0 == 0) goto L_0x005c
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r14.A0C
            if (r0 == 0) goto L_0x027f
            r0.setVisibility(r6)
        L_0x005c:
            X.0eM r4 = r14.A0H
            boolean r0 = X.JTU.A1a(r4)
            if (r0 == 0) goto L_0x0088
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r14.A0C
            if (r0 == 0) goto L_0x027f
            android.view.ViewGroup$MarginLayoutParams r9 = X.DbX.A0G(r0)
            int r3 = r9.getMarginStart()
            android.content.Context r0 = r14.requireContext()
            int r2 = X.AnonymousClass7TG.A02(r0)
            int r1 = r9.getMarginEnd()
            int r0 = r9.bottomMargin
            r9.setMargins(r3, r2, r1, r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r14.A0C
            if (r0 == 0) goto L_0x027f
            r0.setLayoutParams(r9)
        L_0x0088:
            boolean r0 = r14.A0F
            if (r0 == 0) goto L_0x00a7
            android.view.View r1 = r14.requireView()
            r0 = 2131427520(0x7f0b00c0, float:1.8476659E38)
            android.view.ViewGroup r2 = X.DbX.A0I(r1, r0)
            r1 = 50
            X.LY0 r0 = new X.LY0
            r0.<init>(r14, r1)
            X.2dZ r1 = X.2dY.A01(r0, r2)
            X.LcT r0 = X.C64466LcT.A00
            r1.A0X(r0)
        L_0x00a7:
            boolean r0 = r14.A0F
            if (r0 == 0) goto L_0x01b3
            X.3NV r0 = X.AnonymousClass3NV.A08
            java.util.List r3 = X.AnonymousClass7TE.A1I(r0)
        L_0x00b1:
            java.util.Iterator r12 = r3.iterator()
        L_0x00b5:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x011d
            java.lang.Object r2 = r12.next()
            X.3NV r2 = (X.AnonymousClass3NV) r2
            int r11 = r2.ordinal()
            switch(r11) {
                case 0: goto L_0x0279;
                case 1: goto L_0x010d;
                case 2: goto L_0x0115;
                case 3: goto L_0x00f0;
                case 4: goto L_0x00db;
                case 5: goto L_0x00d3;
                case 6: goto L_0x0105;
                default: goto L_0x00c8;
            }
        L_0x00c8:
            r0 = 208(0xd0, float:2.91E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x00d3:
            X.2eb r0 = r14.A02
            if (r0 != 0) goto L_0x0287
            java.lang.String r13 = "channelAudienceViewStub"
            goto L_0x027f
        L_0x00db:
            X.2eb r0 = r14.A05
            if (r0 != 0) goto L_0x00e3
            java.lang.String r13 = "followersYouFollowBackAudienceViewStub"
            goto L_0x027f
        L_0x00e3:
            android.view.View r1 = r0.A01()
            if (r1 != 0) goto L_0x028e
            java.lang.String r0 = "View does not exist in layout for visibility mode followers you follow back."
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x00f0:
            X.2eb r0 = r14.A03
            if (r0 != 0) goto L_0x00f8
            java.lang.String r13 = "closeFriendsAudienceViewStub"
            goto L_0x027f
        L_0x00f8:
            android.view.View r1 = r0.A01()
            if (r1 != 0) goto L_0x028e
            java.lang.String r0 = "View does not exist in layout for visibility mode close friends."
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x0105:
            X.2eb r0 = r14.A06
            if (r0 != 0) goto L_0x0287
            java.lang.String r13 = "internalAudienceViewStub"
            goto L_0x027f
        L_0x010d:
            X.2eb r0 = r14.A07
            if (r0 != 0) goto L_0x0287
            java.lang.String r13 = "privateAudienceViewStub"
            goto L_0x027f
        L_0x0115:
            X.2eb r0 = r14.A09
            if (r0 != 0) goto L_0x0287
            java.lang.String r13 = "subscribersPrivateAudienceViewStub"
            goto L_0x027f
        L_0x011d:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            com.instagram.monetization.repository.MonetizationRepository r1 = X.AnonymousClass2o3.A00(r0)
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.FAN_CLUB_CREATOR
            boolean r0 = r1.A06(r0)
            if (r0 == 0) goto L_0x018f
            X.2eb r0 = r14.A0G
            java.lang.String r9 = "subscriptionsReminderViewStub"
            if (r0 == 0) goto L_0x03ba
            android.view.View r1 = r0.A01()
            r0 = 2131442020(0x7f0b3964, float:1.8506068E38)
            android.widget.TextView r7 = X.AnonymousClass7TG.A0R(r1, r0)
            X.2eb r0 = r14.A0G
            if (r0 == 0) goto L_0x03ba
            android.view.View r1 = r0.A01()
            r0 = 2131427614(0x7f0b011e, float:1.847685E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r1, r0)
            boolean r0 = r14.A0F
            if (r0 == 0) goto L_0x01a1
            r0 = 2131963974(0x7f133046, float:1.9564717E38)
            java.lang.String r2 = X.DbU.A0m(r14, r0)
            r0 = 2131963973(0x7f133045, float:1.9564715E38)
            java.lang.String r1 = X.DbU.A0m(r14, r0)
            r0 = 32
            java.lang.String r0 = X.002.A0T(r2, r1, r0)
            android.text.SpannableStringBuilder r6 = X.DbS.A0C(r0)
            int r4 = r2.length()
            int r3 = r1.length()
            int r0 = X.Dbb.A04(r14)
            X.ESx r2 = new X.ESx
            r2.<init>((X.C61360K4c) r14, (int) r0)
            int r1 = r4 + 1
            int r4 = r4 + r3
            int r0 = r4 + 1
            r6.setSpan(r2, r1, r0, r5)
            X.DbT.A1H(r7)
            r7.setText(r6)
        L_0x0188:
            X.2eb r0 = r14.A0G
            if (r0 == 0) goto L_0x03ba
            r0.A03(r5)
        L_0x018f:
            r8.invalidate()
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r14.A0C
            if (r2 == 0) goto L_0x027f
            r1 = 52
            X.LY0 r0 = new X.LY0
            r0.<init>(r14, r1)
            r2.setPrimaryActionOnClickListener(r0)
            return
        L_0x01a1:
            r0 = 2131963969(0x7f133041, float:1.9564706E38)
            r7.setText(r0)
            r0 = 2131963968(0x7f133040, float:1.9564704E38)
            r1.setText(r0)
            r0 = 52
            X.FP5.A01(r1, r0, r14)
            goto L_0x0188
        L_0x01b3:
            X.0lg r3 = X.DbT.A0X(r4)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323865567178313(0x810c5d00002e49, double:3.034697076925646E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x01d2
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.7oo r0 = X.C342557on.A00(r0)
            java.util.List r3 = r0.A00()
            goto L_0x00b1
        L_0x01d2:
            r9 = 1
            X.3NV r0 = X.AnonymousClass3NV.A08
            X.3NV[] r0 = new X.AnonymousClass3NV[]{r0}
            java.util.ArrayList r3 = X.0sr.A1M(r0)
            X.3NV r0 = X.AnonymousClass3NV.A07
            r3.add(r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            boolean r0 = X.2R8.A00(r0)
            if (r0 == 0) goto L_0x01f1
            X.3NV r0 = X.AnonymousClass3NV.A06
            r3.add(r0)
        L_0x01f1:
            android.os.Bundle r1 = r14.mArguments
            if (r1 == 0) goto L_0x0206
            r0 = 412(0x19c, float:5.77E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0, r5)
            if (r0 != r9) goto L_0x0206
            X.3NV r0 = X.AnonymousClass3NV.A0A
            r3.add(r0)
        L_0x0206:
            X.0lg r9 = X.AnonymousClass7TF.A0L(r4, r5)
            r0 = 36318221980538883(0x81073b00061803, double:3.031128050009971E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 != 0) goto L_0x0224
            X.0lg r9 = X.AnonymousClass7TF.A0L(r4, r5)
            r0 = 36320451068174815(0x810942000021df, double:3.03253773400675E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x0229
        L_0x0224:
            X.3NV r0 = X.AnonymousClass3NV.A05
            r3.add(r0)
        L_0x0229:
            X.0lg r9 = X.AnonymousClass7TF.A0L(r4, r5)
            r0 = 36318221980276736(0x81073b00021800, double:3.031128049844188E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 != 0) goto L_0x0252
            r0 = 36315597755125155(0x8104d800000da3, double:3.0294684792914217E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 != 0) goto L_0x0252
            X.0lg r9 = X.AnonymousClass7TF.A0L(r4, r5)
            r0 = 36320451068174815(0x810942000021df, double:3.03253773400675E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x0257
        L_0x0252:
            X.3NV r0 = X.AnonymousClass3NV.A04
            r3.add(r0)
        L_0x0257:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.7k5 r0 = X.C339717k3.A00(r0)
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x00b1
            X.0lg r9 = X.DbT.A0X(r4)
            r0 = 36319407397346669(0x81084f005f1d6d, double:3.031877712372505E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x00b1
            X.3NV r0 = X.AnonymousClass3NV.A09
            r3.add(r0)
            goto L_0x00b1
        L_0x0279:
            X.2eb r0 = r14.A08
            if (r0 != 0) goto L_0x0287
            java.lang.String r13 = "publicAudienceViewStub"
        L_0x027f:
            X.0qQ.A0F(r13)
        L_0x0282:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0287:
            android.view.View r1 = r0.A01()
            X.0qQ.A07(r1)
        L_0x028e:
            r0 = 2131439196(0x7f0b2e5c, float:1.850034E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r1, r0)
            java.util.EnumMap r0 = r14.A0I
            r0.put(r2, r3)
            boolean r0 = X.JTU.A1a(r4)
            if (r0 == 0) goto L_0x02c7
            r0 = 2131434047(0x7f0b1a3f, float:1.8489897E38)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = X.DbT.A0b(r1, r0)
            X.0qQ.A0A(r3)
            r3.setVisibility(r5)
            X.3NV r0 = X.AnonymousClass3NV.A09
            if (r2 != r0) goto L_0x0437
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.7k5 r0 = X.C339717k3.A00(r0)
            com.instagram.common.typedurl.ImageUrl r0 = r0.A01
            if (r0 == 0) goto L_0x02c0
            r3.setUrl(r0, r14)
        L_0x02c0:
            X.3NV r0 = X.AnonymousClass3NV.A04
            if (r2 != r0) goto L_0x02c7
            r3.setBackground(r7)
        L_0x02c7:
            android.widget.TextView r9 = X.Dba.A06(r1)
            android.content.Context r10 = r9.getContext()
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r4)
            boolean r0 = X.JTU.A1a(r4)
            java.lang.String r0 = X.C39806AAd.A01(r10, r3, r2, r0)
            r9.setText(r0)
            boolean r0 = X.JTU.A1a(r4)
            if (r0 == 0) goto L_0x02f9
            android.content.Context r3 = r14.requireContext()
            r0 = 2132018629(0x7f1405c5, float:1.967557E38)
            r9.setTextAppearance(r3, r0)
            android.content.Context r3 = r14.requireContext()
            int r0 = X.2Yu.A07(r10)
            X.DbT.A17(r3, r9, r0)
        L_0x02f9:
            r0 = 2131442020(0x7f0b3964, float:1.8506068E38)
            android.widget.TextView r3 = X.DbU.A0G(r1, r0)
            boolean r0 = X.JTU.A1a(r4)
            if (r0 == 0) goto L_0x030c
            X.3NV r0 = X.AnonymousClass3NV.A04
            if (r2 != r0) goto L_0x030c
            r14.A00 = r3
        L_0x030c:
            android.content.Context r9 = r14.requireContext()
            boolean r10 = X.JTU.A1a(r4)
            switch(r11) {
                case 0: goto L_0x041a;
                case 1: goto L_0x03ee;
                case 2: goto L_0x0421;
                case 3: goto L_0x0428;
                case 4: goto L_0x042f;
                case 5: goto L_0x0406;
                default: goto L_0x0317;
            }
        L_0x0317:
            if (r10 != 0) goto L_0x042f
            r0 = 2131963856(0x7f132fd0, float:1.9564477E38)
        L_0x031c:
            java.lang.String r0 = r9.getString(r0)
        L_0x0320:
            if (r0 == 0) goto L_0x042f
            r3.setText(r0)
        L_0x0325:
            X.3NV r0 = r14.A0E
            if (r0 != 0) goto L_0x0330
            java.lang.String r11 = "selectedVisibilityMode"
        L_0x032b:
            X.0qQ.A0F(r11)
            goto L_0x0282
        L_0x0330:
            if (r2 != r0) goto L_0x0335
            A02(r14, r2)
        L_0x0335:
            r0 = 60
            X.LY8.A00(r1, r0, r2, r14)
            X.3NV r0 = X.AnonymousClass3NV.A04
            if (r2 != r0) goto L_0x00b5
            boolean r0 = X.JTU.A1a(r4)
            if (r0 != 0) goto L_0x034d
            r0 = 2131427614(0x7f0b011e, float:1.847685E38)
            android.widget.TextView r0 = X.DbU.A0G(r1, r0)
            r14.A00 = r0
        L_0x034d:
            android.widget.TextView r0 = r14.A00
            java.lang.String r11 = "closeFriendsActionTextView"
            if (r0 == 0) goto L_0x032b
            r0.setVisibility(r5)
            android.widget.TextView r3 = r14.A00
            if (r3 == 0) goto L_0x032b
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            boolean r2 = X.C324536zU.A00(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x0369
            r0 = 1050253722(0x3e99999a, float:0.3)
        L_0x0369:
            r3.setAlpha(r0)
            boolean r2 = X.JTU.A1a(r4)
            r0 = 2131427585(0x7f0b0101, float:1.847679E38)
            if (r2 == 0) goto L_0x0378
            r0 = 2131442021(0x7f0b3965, float:1.850607E38)
        L_0x0378:
            X.DbT.A1F(r1, r0, r5)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.0eE r10 = X.AnonymousClass0t1.A01
            X.4Cl r0 = X.DbS.A0h(r0, r10)
            java.lang.Integer r0 = r0.Afi()
            if (r0 == 0) goto L_0x03bf
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x03bf
            android.widget.TextView r1 = r14.A00
            if (r1 == 0) goto L_0x032b
            r0 = 2131963851(0x7f132fcb, float:1.9564467E38)
            r1.setText(r0)
        L_0x039b:
            android.widget.TextView r1 = r14.A00
            if (r1 == 0) goto L_0x032b
            r0 = 51
            X.LY0.A00(r1, r0, r14)
            X.1Av r3 = X.DbX.A0h(r4)
            X.0s0 r2 = r3.A6N
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 112(0x70, float:1.57E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r3, r2, r1, r0)
            if (r0 != 0) goto L_0x00b5
            X.2eb r0 = r14.A04
            if (r0 != 0) goto L_0x0444
            java.lang.String r9 = "closeFriendsTooltipViewStub"
        L_0x03ba:
            X.0qQ.A0F(r9)
            goto L_0x0282
        L_0x03bf:
            android.widget.TextView r9 = r14.A00
            if (r9 == 0) goto L_0x032b
            com.instagram.user.model.User r0 = X.DbX.A0l(r10, r4)
            X.4Cl r0 = r0.A03
            java.lang.Integer r0 = r0.Afi()
            if (r0 == 0) goto L_0x03ec
            int r3 = r0.intValue()
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131820757(0x7f1100d5, float:1.9274238E38)
            com.instagram.user.model.User r0 = X.DbX.A0l(r10, r4)
            X.4Cl r0 = r0.A03
            java.lang.Integer r0 = r0.Afi()
            java.lang.String r0 = X.DbV.A0v(r2, r0, r1, r3)
        L_0x03e8:
            r9.setText(r0)
            goto L_0x039b
        L_0x03ec:
            r0 = r7
            goto L_0x03e8
        L_0x03ee:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            boolean r0 = X.2R8.A00(r0)
            if (r0 == 0) goto L_0x03ff
            if (r10 != 0) goto L_0x042f
            r0 = 2131963860(0x7f132fd4, float:1.9564485E38)
            goto L_0x031c
        L_0x03ff:
            if (r10 != 0) goto L_0x042f
            r0 = 2131963859(0x7f132fd3, float:1.9564483E38)
            goto L_0x031c
        L_0x0406:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.7k5 r0 = X.C339717k3.A00(r0)
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = X.C66637Ma6.A00(r9, r0)
            goto L_0x0320
        L_0x041a:
            if (r10 != 0) goto L_0x042f
            r0 = 2131963863(0x7f132fd7, float:1.9564491E38)
            goto L_0x031c
        L_0x0421:
            if (r10 != 0) goto L_0x042f
            r0 = 2131963868(0x7f132fdc, float:1.9564502E38)
            goto L_0x031c
        L_0x0428:
            if (r10 != 0) goto L_0x042f
            r0 = 2131963850(0x7f132fca, float:1.9564465E38)
            goto L_0x031c
        L_0x042f:
            X.0qQ.A0A(r3)
            r3.setVisibility(r6)
            goto L_0x0325
        L_0x0437:
            android.content.Context r0 = r3.getContext()
            android.graphics.drawable.Drawable r0 = X.C39806AAd.A00(r0, r2, r5)
            r3.setImageDrawable(r0)
            goto L_0x02c0
        L_0x0444:
            android.view.View r1 = r0.A01()
            r0 = 2131443045(0x7f0b3d65, float:1.8508147E38)
            android.widget.TextView r10 = X.AnonymousClass7TG.A0R(r1, r0)
            int r0 = X.Dbb.A04(r14)
            X.Kaz r9 = new X.Kaz
            r9.<init>((X.C61360K4c) r14, (int) r0)
            boolean r1 = X.JTU.A1a(r4)
            r0 = 2131965158(0x7f1334e6, float:1.9567118E38)
            if (r1 == 0) goto L_0x0464
            r0 = 2131965159(0x7f1334e7, float:1.956712E38)
        L_0x0464:
            java.lang.String r3 = r14.getString(r0)
            java.lang.String r1 = " "
            r2 = 2131953242(0x7f13065a, float:1.954295E38)
            java.lang.String r0 = r14.getString(r2)
            java.lang.String r1 = X.002.A0g(r3, r1, r0)
            X.0qQ.A07(r1)
            r10.setText(r1)
            java.lang.String r0 = X.DbU.A0m(r14, r2)
            X.AnonymousClass7AV.A07(r9, r10, r0, r1)
            goto L_0x00b5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61360K4c.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A01(C61360K4c k4c) {
        0hq supportFragmentManager;
        C339337jR r1 = k4c.A0A;
        if (r1 != null) {
            AnonymousClass3NV r0 = k4c.A0E;
            if (r0 != null) {
                r1.CwQ(r0);
            }
            0qQ.A0F("selectedVisibilityMode");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass3NV r12 = k4c.A0E;
        if (r12 != null) {
            if (r12 == AnonymousClass3NV.A04) {
                1Av A0h = DbX.A0h(k4c.A0H);
                AnonymousClass7TF.A1J(A0h, A0h.A6N, 1Av.A8a, 112, true);
            }
            if (k4c.A0F) {
                FragmentActivity activity = k4c.getActivity();
                if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                    supportFragmentManager.A13();
                    return;
                }
                return;
            }
            Context context = k4c.getContext();
            if (context != null) {
                DbX.A14(context, AnonymousClass37D.A00);
                return;
            }
            return;
        }
        0qQ.A0F("selectedVisibilityMode");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(C61360K4c k4c, AnonymousClass3NV r5) {
        boolean z;
        String str;
        Iterator A0s = AnonymousClass7TF.A0s(k4c.A0I);
        while (true) {
            z = true;
            if (!A0s.hasNext()) {
                break;
            }
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            Object key = A1J.getKey();
            CompoundButton compoundButton = (CompoundButton) A1J.getValue();
            if (key != r5) {
                z = false;
            }
            compoundButton.setChecked(z);
        }
        k4c.A0E = r5;
        IgdsBottomButtonLayout igdsBottomButtonLayout = k4c.A0C;
        if (igdsBottomButtonLayout == null) {
            str = "submitButton";
        } else {
            Integer Afi = DbV.A0k(AnonymousClass7TE.A0l(k4c.A0H)).Afi();
            if (Afi != null && Afi.intValue() == 0) {
                AnonymousClass3NV r1 = k4c.A0E;
                if (r1 == null) {
                    str = "selectedVisibilityMode";
                } else if (r1 == AnonymousClass3NV.A04) {
                    z = false;
                }
            }
            igdsBottomButtonLayout.setPrimaryButtonEnabled(z);
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0H);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r9 != null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008a, code lost:
        if (r0.containsKey(r3) == true) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r1 != true) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            super.onActivityResult(r7, r8, r9)
            r0 = 2002(0x7d2, float:2.805E-42)
            if (r7 != r0) goto L_0x009d
            X.0eM r0 = r6.A0H
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.4Cl r0 = X.DbV.A0k(r0)
            java.lang.Integer r4 = r0.Afi()
            java.lang.String r3 = "private_story_audience_member_count"
            r2 = 1
            if (r9 == 0) goto L_0x0027
            android.os.Bundle r0 = r9.getExtras()
            if (r0 == 0) goto L_0x0027
            boolean r1 = r0.containsKey(r3)
            r0 = 1
            if (r1 == r2) goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            r1 = 0
            if (r0 == 0) goto L_0x007c
            if (r9 == 0) goto L_0x007a
        L_0x002d:
            android.os.Bundle r0 = r9.getExtras()
            if (r0 == 0) goto L_0x007a
            java.lang.Integer r4 = X.DbV.A0o(r0, r3)
        L_0x0037:
            r5 = 0
            java.lang.String r2 = "closeFriendsActionTextView"
            if (r4 == 0) goto L_0x0061
            int r0 = r4.intValue()
            if (r0 != 0) goto L_0x0061
            android.widget.TextView r1 = r6.A00
            if (r1 == 0) goto L_0x0052
            r0 = 2131963851(0x7f132fcb, float:1.9564467E38)
            r1.setText(r0)
        L_0x004c:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r6.A0C
            if (r2 != 0) goto L_0x005a
            java.lang.String r2 = "submitButton"
        L_0x0052:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x005a:
            X.3NV r1 = r6.A0E
            if (r1 != 0) goto L_0x008d
            java.lang.String r2 = "selectedVisibilityMode"
            goto L_0x0052
        L_0x0061:
            android.widget.TextView r3 = r6.A00
            if (r3 == 0) goto L_0x0052
            if (r4 == 0) goto L_0x0076
            int r2 = r4.intValue()
            android.content.res.Resources r1 = X.DbV.A05(r6)
            r0 = 2131820757(0x7f1100d5, float:1.9274238E38)
            java.lang.String r1 = X.DbV.A0v(r1, r4, r0, r2)
        L_0x0076:
            r3.setText(r1)
            goto L_0x004c
        L_0x007a:
            r4 = r1
            goto L_0x0037
        L_0x007c:
            java.lang.String r3 = "close_friend_count"
            if (r9 == 0) goto L_0x0037
            android.os.Bundle r0 = r9.getExtras()
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.containsKey(r3)
            if (r0 != r2) goto L_0x0037
            goto L_0x002d
        L_0x008d:
            X.3NV r0 = X.AnonymousClass3NV.A04
            if (r1 != r0) goto L_0x0099
            if (r4 == 0) goto L_0x0099
            int r0 = r4.intValue()
            if (r0 == 0) goto L_0x009a
        L_0x0099:
            r5 = 1
        L_0x009a:
            r2.setPrimaryButtonEnabled(r5)
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61360K4c.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(313147867);
        C61360K4c.super.onCreate(bundle);
        AnonymousClass0eM r1 = this.A0H;
        this.A0B = C272994ll.A00(AnonymousClass7TE.A0l(r1));
        this.A01 = new C2355930l(requireActivity(), AnonymousClass7TE.A0l(r1));
        setModuleNameV2("live_audience_control");
        AnonymousClass0fD.A09(213996474, A022);
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
        /*
            r5 = this;
            r0 = -1243105440(0xffffffffb5e7b760, float:-1.726421E-6)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r4 = 0
            X.0qQ.A0B(r6, r4)
            android.os.Bundle r3 = r5.mArguments
            r1 = 1
            if (r3 == 0) goto L_0x00dc
            r0 = 2088(0x828, float:2.926E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.getBoolean(r0)
            if (r0 != r1) goto L_0x00dc
        L_0x001c:
            r5.A0F = r1
            r0 = 2131626778(0x7f0e0b1a, float:1.8880802E38)
            if (r1 == 0) goto L_0x0026
            r0 = 2131626777(0x7f0e0b19, float:1.88808E38)
        L_0x0026:
            android.view.View r3 = r6.inflate(r0, r7, r4)
            r0 = 2131428236(0x7f0b038c, float:1.847811E38)
            android.view.View r1 = r3.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            r4 = 0
            if (r0 == 0) goto L_0x00d9
            android.view.ViewStub r1 = (android.view.ViewStub) r1
        L_0x0038:
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r5.A08 = r0
            r0 = 2131428232(0x7f0b0388, float:1.8478103E38)
            android.view.ViewStub r1 = A00(r3, r0)
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r5.A05 = r0
            r0 = 2131428231(0x7f0b0387, float:1.84781E38)
            android.view.ViewStub r1 = A00(r3, r0)
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r5.A03 = r0
            r0 = 2131443041(0x7f0b3d61, float:1.8508139E38)
            android.view.ViewStub r1 = A00(r3, r0)
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r5.A04 = r0
            r0 = 2131428237(0x7f0b038d, float:1.8478113E38)
            android.view.ViewStub r1 = A00(r3, r0)
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r5.A09 = r0
            r0 = 2131428235(0x7f0b038b, float:1.8478109E38)
            android.view.ViewStub r1 = A00(r3, r0)
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r5.A07 = r0
            r0 = 2131428233(0x7f0b0389, float:1.8478105E38)
            android.view.ViewStub r1 = A00(r3, r0)
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r5.A06 = r0
            r0 = 2131442043(0x7f0b397b, float:1.8506115E38)
            android.view.ViewStub r1 = A00(r3, r0)
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r5.A0G = r0
            r0 = 2131428230(0x7f0b0386, float:1.8478099E38)
            android.view.View r1 = r3.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x00af
            r4 = r1
            android.view.ViewStub r4 = (android.view.ViewStub) r4
        L_0x00af:
            X.2eb r0 = new X.2eb
            r0.<init>(r4)
            r5.A02 = r0
            X.3NV r0 = r5.A0E
            if (r0 != 0) goto L_0x00d2
            android.os.Bundle r1 = r5.mArguments
            if (r1 == 0) goto L_0x00ca
            r0 = 411(0x19b, float:5.76E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L_0x00cc
        L_0x00ca:
            java.lang.String r0 = "public"
        L_0x00cc:
            X.3NV r0 = X.C278154wM.A01(r0)
            r5.A0E = r0
        L_0x00d2:
            r0 = 1195728080(0x47455cd0, float:50524.812)
            X.AnonymousClass0fD.A09(r0, r2)
            return r3
        L_0x00d9:
            r1 = r4
            goto L_0x0038
        L_0x00dc:
            r1 = 0
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61360K4c.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-2129619264);
        super.onResume();
        AnonymousClass3NV r0 = this.A0E;
        if (r0 == null) {
            0qQ.A0F("selectedVisibilityMode");
            throw AnonymousClass00P.createAndThrow();
        }
        A02(this, r0);
        AnonymousClass0fD.A09(-429802538, A022);
    }
}
