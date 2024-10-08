package X;

import android.widget.CompoundButton;

/* renamed from: X.WCy  reason: case insensitive filesystem */
public final class C18921WCy implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;

    public C18921WCy(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(CompoundButton compoundButton, Object obj, int i) {
        compoundButton.setOnCheckedChangeListener(new C18921WCy(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x027d, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0284, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r1.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01c0, code lost:
        r1.setChecked(!r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01c5, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.CompoundButton r10, boolean r11) {
        /*
            r9 = this;
            int r0 = r9.A00
            r8 = r11
            switch(r0) {
                case 0: goto L_0x025e;
                case 1: goto L_0x022e;
                case 2: goto L_0x010f;
                case 3: goto L_0x01d6;
                case 4: goto L_0x01c6;
                case 5: goto L_0x01b2;
                case 6: goto L_0x01a4;
                case 7: goto L_0x00fd;
                case 8: goto L_0x00eb;
                case 9: goto L_0x00d9;
                case 10: goto L_0x00c7;
                case 11: goto L_0x00b5;
                case 12: goto L_0x00a3;
                case 13: goto L_0x0091;
                case 14: goto L_0x0080;
                case 15: goto L_0x006f;
                case 16: goto L_0x005e;
                case 17: goto L_0x004d;
                case 18: goto L_0x003c;
                case 19: goto L_0x002b;
                case 20: goto L_0x001a;
                default: goto L_0x0006;
            }
        L_0x0006:
            if (r11 == 0) goto L_0x0019
            java.lang.Object r0 = r9.A01
            X.UYn r0 = (X.UYn) r0
            X.0eM r0 = r0.A07
            java.lang.Object r1 = r0.getValue()
            X.JiH r1 = (X.C60260JiH) r1
            X.Nk0 r0 = X.C69360Nk0.OFF
        L_0x0016:
            r1.A02(r0)
        L_0x0019:
            return
        L_0x001a:
            if (r11 == 0) goto L_0x0019
            java.lang.Object r0 = r9.A01
            X.UYn r0 = (X.UYn) r0
            X.0eM r0 = r0.A07
            java.lang.Object r1 = r0.getValue()
            X.JiH r1 = (X.C60260JiH) r1
            X.Nk0 r0 = X.C69360Nk0.PEOPLE_YOU_FOLLOW
            goto L_0x0016
        L_0x002b:
            if (r11 == 0) goto L_0x0019
            java.lang.Object r0 = r9.A01
            X.UYn r0 = (X.UYn) r0
            X.0eM r0 = r0.A07
            java.lang.Object r1 = r0.getValue()
            X.JiH r1 = (X.C60260JiH) r1
            X.Nk0 r0 = X.C69360Nk0.EVERYONE
            goto L_0x0016
        L_0x003c:
            if (r11 == 0) goto L_0x0019
            java.lang.Object r0 = r9.A01
            X.UYl r0 = (X.C15271UYl) r0
            X.0eM r0 = r0.A05
            java.lang.Object r1 = r0.getValue()
            X.JiH r1 = (X.C60260JiH) r1
            X.Uwv r0 = X.C16548Uwv.A05
            goto L_0x0016
        L_0x004d:
            if (r11 == 0) goto L_0x0019
            java.lang.Object r0 = r9.A01
            X.UYl r0 = (X.C15271UYl) r0
            X.0eM r0 = r0.A05
            java.lang.Object r1 = r0.getValue()
            X.JiH r1 = (X.C60260JiH) r1
            X.Uwv r0 = X.C16548Uwv.PEOPLE_YOU_FOLLOW
            goto L_0x0016
        L_0x005e:
            if (r11 == 0) goto L_0x0019
            java.lang.Object r0 = r9.A01
            X.UYl r0 = (X.C15271UYl) r0
            X.0eM r0 = r0.A05
            java.lang.Object r1 = r0.getValue()
            X.JiH r1 = (X.C60260JiH) r1
            X.Uwv r0 = X.C16548Uwv.EVERYONE
            goto L_0x0016
        L_0x006f:
            if (r11 == 0) goto L_0x0019
            java.lang.Object r0 = r9.A01
            X.UYj r0 = (X.C15269UYj) r0
            X.0eM r0 = r0.A04
            java.lang.Object r1 = r0.getValue()
            X.JiH r1 = (X.C60260JiH) r1
            X.Uz1 r0 = X.C16665Uz1.NOBODY
            goto L_0x0016
        L_0x0080:
            if (r11 == 0) goto L_0x0019
            java.lang.Object r0 = r9.A01
            X.UYj r0 = (X.C15269UYj) r0
            X.0eM r0 = r0.A04
            java.lang.Object r1 = r0.getValue()
            X.JiH r1 = (X.C60260JiH) r1
            X.Uz1 r0 = X.C16665Uz1.CLOSE_FRIENDS
            goto L_0x0016
        L_0x0091:
            if (r11 == 0) goto L_0x0019
            java.lang.Object r0 = r9.A01
            X.UYj r0 = (X.C15269UYj) r0
            X.0eM r0 = r0.A04
            java.lang.Object r1 = r0.getValue()
            X.JiH r1 = (X.C60260JiH) r1
            X.Uz1 r0 = X.C16665Uz1.FOLLOWERS
            goto L_0x0016
        L_0x00a3:
            if (r11 == 0) goto L_0x0019
            java.lang.Object r0 = r9.A01
            X.UYj r0 = (X.C15269UYj) r0
            X.0eM r0 = r0.A04
            java.lang.Object r1 = r0.getValue()
            X.JiH r1 = (X.C60260JiH) r1
            X.Uz1 r0 = X.C16665Uz1.EVERYONE
            goto L_0x0016
        L_0x00b5:
            if (r11 == 0) goto L_0x0019
            java.lang.Object r0 = r9.A01
            X.UYm r0 = (X.UYm) r0
            X.0eM r0 = r0.A06
            java.lang.Object r1 = r0.getValue()
            X.JiH r1 = (X.C60260JiH) r1
            X.Uvw r0 = X.C16500Uvw.OFF
            goto L_0x0016
        L_0x00c7:
            if (r11 == 0) goto L_0x0019
            java.lang.Object r0 = r9.A01
            X.UYm r0 = (X.UYm) r0
            X.0eM r0 = r0.A06
            java.lang.Object r1 = r0.getValue()
            X.JiH r1 = (X.C60260JiH) r1
            X.Uvw r0 = X.C16500Uvw.ON
            goto L_0x0016
        L_0x00d9:
            if (r11 == 0) goto L_0x0019
            java.lang.Object r0 = r9.A01
            X.UYk r0 = (X.C15270UYk) r0
            X.0eM r0 = r0.A05
            java.lang.Object r1 = r0.getValue()
            X.JiH r1 = (X.C60260JiH) r1
            X.Nk4 r0 = X.C69364Nk4.A06
            goto L_0x0016
        L_0x00eb:
            if (r11 == 0) goto L_0x0019
            java.lang.Object r0 = r9.A01
            X.UYk r0 = (X.C15270UYk) r0
            X.0eM r0 = r0.A05
            java.lang.Object r1 = r0.getValue()
            X.JiH r1 = (X.C60260JiH) r1
            X.Nk4 r0 = X.C69364Nk4.A07
            goto L_0x0016
        L_0x00fd:
            if (r11 == 0) goto L_0x0019
            java.lang.Object r0 = r9.A01
            X.UYk r0 = (X.C15270UYk) r0
            X.0eM r0 = r0.A05
            java.lang.Object r1 = r0.getValue()
            X.JiH r1 = (X.C60260JiH) r1
            X.Nk4 r0 = X.C69364Nk4.A05
            goto L_0x0016
        L_0x010f:
            java.lang.Object r0 = r9.A01
            X.UdE r0 = (X.C15463UdE) r0
            X.Uc0 r5 = r0.A08
            android.content.Context r7 = r5.getContext()
            r6 = 1
            if (r11 == 0) goto L_0x014e
            com.instagram.common.session.UserSession r0 = r5.A03
            X.0xa r2 = X.AnonymousClass7TE.A0q(r0)
            r0 = 3001(0xbb9, float:4.205E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 == 0) goto L_0x014e
            java.lang.Integer r3 = r5.A0B
            if (r3 == 0) goto L_0x013c
            com.instagram.common.session.UserSession r2 = r5.A03
            X.0iw r1 = r5.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            X.FCT.A00(r1, r2, r3, r0)
        L_0x013c:
            X.1a8 r3 = r5.A02
            X.OVP r0 = r5.A07
            X.1aU r2 = r0.A01(r6)
            r1 = 4
            X.Wgk r0 = new X.Wgk
            r0.<init>(r5, r1)
            r3.A02(r2, r0)
            return
        L_0x014e:
            if (r7 == 0) goto L_0x0019
            r0 = 2131969319(0x7f134527, float:1.9575557E38)
            if (r11 == 0) goto L_0x0158
            r0 = 2131969322(0x7f13452a, float:1.9575564E38)
        L_0x0158:
            java.lang.String r4 = r5.getString(r0)
            r0 = 2131969436(0x7f13459c, float:1.9575795E38)
            java.lang.String r3 = r5.getString(r0)
            r0 = 2131969321(0x7f134529, float:1.9575562E38)
            if (r11 == 0) goto L_0x016b
            r0 = 2131969324(0x7f13452c, float:1.9575568E38)
        L_0x016b:
            java.lang.String r1 = r5.getString(r0)
            r0 = 2131969320(0x7f134528, float:1.957556E38)
            if (r11 == 0) goto L_0x0177
            r0 = 2131969323(0x7f13452b, float:1.9575566E38)
        L_0x0177:
            java.lang.String r0 = r5.getString(r0)
            X.8ab r2 = new X.8ab
            r2.<init>((android.content.Context) r7)
            r2.A0r(r6)
            r2.A0s(r6)
            r2.A05 = r1
            r2.A0q(r0)
            r0 = 4
            X.FIG r1 = new X.FIG
            r1.<init>(r0, r5, r11)
            X.8ae r0 = X.C358278ae.BLUE_BOLD
            r2.A0Y(r1, r0, r4, r6)
            r1 = 31
            X.W5U r0 = new X.W5U
            r0.<init>(r5, r1)
            r2.A0b(r0, r3)
            X.DbT.A1V(r2)
            return
        L_0x01a4:
            java.lang.Object r0 = r9.A01
            X.UbQ r0 = (X.C15372UbQ) r0
            r0.A02 = r11
            com.instagram.igds.components.textcell.IgdsListCell r1 = r0.A00
            if (r1 != 0) goto L_0x01c0
            java.lang.String r0 = "blockCommentsFromToggle"
            goto L_0x027d
        L_0x01b2:
            java.lang.Object r0 = r9.A01
            X.UbQ r0 = (X.C15372UbQ) r0
            r0.A03 = r11
            com.instagram.igds.components.textcell.IgdsListCell r1 = r0.A01
            if (r1 != 0) goto L_0x01c0
            java.lang.String r0 = "blockToggle"
            goto L_0x027d
        L_0x01c0:
            r0 = r11 ^ 1
            r1.setChecked(r0)
            return
        L_0x01c6:
            java.lang.Object r0 = r9.A01
            X.U4j r0 = (X.C14721U4j) r0
            android.view.ViewGroup r1 = r0.A08
            r0 = 0
            if (r11 == 0) goto L_0x01d2
            r0 = 2131099782(0x7f060086, float:1.7811927E38)
        L_0x01d2:
            r1.setBackgroundColor(r0)
            return
        L_0x01d6:
            r0 = 0
            r4 = r10
            X.0qQ.A0B(r10, r0)
            if (r11 == 0) goto L_0x022b
            java.lang.String r7 = "enable"
        L_0x01df:
            java.lang.Object r6 = r9.A01
            X.UsO r6 = (X.UsO) r6
            android.widget.CompoundButton$OnCheckedChangeListener r0 = r6.A01
            if (r0 == 0) goto L_0x01ea
            r0.onCheckedChanged(r10, r11)
        L_0x01ea:
            X.FBg r2 = r6.A05
            java.lang.String r1 = r6.A06
            java.lang.String r0 = "toggle"
            r2.A01(r1, r7, r0)
            com.instagram.common.session.UserSession r0 = r6.A04
            if (r11 == 0) goto L_0x0226
            X.1NY r2 = X.DbU.A0N(r0)
            r0 = 3642(0xe3a, float:5.104E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0A(r0)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            X.1OC r2 = X.DbY.A0N(r2, r1, r0)
        L_0x020c:
            X.0qQ.A0A(r2)
            androidx.fragment.app.Fragment r0 = r6.A03
            X.0hq r5 = r0.getParentFragmentManager()
            X.Uq3 r3 = new X.Uq3
            r3.<init>(r4, r5, r6, r7, r8)
            r2.A00 = r3
            android.content.Context r1 = r6.A00
            X.0gy r0 = X.AnonymousClass07i.A00(r0)
            X.1ES.A00(r1, r0, r2)
            return
        L_0x0226:
            X.1OC r2 = X.F7X.A01(r0, r1, r7)
            goto L_0x020c
        L_0x022b:
            java.lang.String r7 = "cancel"
            goto L_0x01df
        L_0x022e:
            java.lang.Object r2 = r9.A01
            X.UZc r2 = (X.C15274UZc) r2
            com.instagram.business.promote.model.PromoteData r1 = r2.A0A
            if (r1 != 0) goto L_0x0239
            java.lang.String r0 = "promoteData"
            goto L_0x027d
        L_0x0239:
            if (r11 == 0) goto L_0x0246
            com.instagram.api.schemas.XFBCTXWelcomeMessageStatus r0 = com.instagram.api.schemas.XFBCTXWelcomeMessageStatus.DEFAULT_WELCOME_MESSAGE_OPTED_IN
        L_0x023d:
            r1.A0a = r0
            X.WGU r1 = r2.A06
            if (r1 != 0) goto L_0x0249
            java.lang.String r0 = "promoteLogger"
            goto L_0x027d
        L_0x0246:
            com.instagram.api.schemas.XFBCTXWelcomeMessageStatus r0 = com.instagram.api.schemas.XFBCTXWelcomeMessageStatus.DEFAULT_WELCOME_MESSAGE_OPTED_OUT
            goto L_0x023d
        L_0x0249:
            X.UzE r0 = r2.A05
            if (r0 != 0) goto L_0x0250
            java.lang.String r0 = "currentStep"
            goto L_0x027d
        L_0x0250:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r11)
            java.lang.String r7 = "default_welcome_message_toggle"
            r2 = 0
            r3 = r2
            r4 = r2
            r5 = r2
            X.WGU.A02(r0, r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x025e:
            java.lang.Object r2 = r9.A01
            X.WUu r2 = (X.C19338WUu) r2
            if (r11 == 0) goto L_0x0272
            com.instagram.business.promote.model.PromoteData r0 = r2.A05
            java.util.Date r0 = r0.A1k
            if (r0 == 0) goto L_0x026e
            X.C19338WUu.A01(r2)
            return
        L_0x026e:
            X.C19338WUu.A00(r2)
            return
        L_0x0272:
            com.instagram.business.promote.model.PromoteState r1 = r2.A06
            r0 = 0
            r1.A09 = r0
            android.widget.TextView r1 = r2.A00
            if (r1 != 0) goto L_0x0285
            java.lang.String r0 = "subtitleView"
        L_0x027d:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0285:
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18921WCy.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
