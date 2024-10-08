package X;

import android.text.TextUtils;
import android.view.View;

/* renamed from: X.9uY  reason: invalid class name and case insensitive filesystem */
public abstract class C392289uY {
    public C74324Pt0 A00;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        r1 = (X.C377949Nw) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C377939Nv
            if (r0 == 0) goto L_0x0015
            r3 = r4
            X.9Nv r3 = (X.C377939Nv) r3
            com.instagram.common.session.UserSession r0 = r3.A05
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.2Kb> r1 = X.2Kb.class
            X.1wn r0 = r3.A04
            r2.A02(r0, r1)
        L_0x0014:
            return
        L_0x0015:
            boolean r0 = r4 instanceof X.C377949Nw
            if (r0 == 0) goto L_0x0014
            r1 = r4
            X.9Nw r1 = (X.C377949Nw) r1
            X.2Ep r0 = r1.A02
            if (r0 == 0) goto L_0x0014
            X.91e r2 = r1.A07
            java.lang.String r1 = r0.C6C()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0014
            java.util.Map r0 = r2.A03
            r0.remove(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C392289uY.A02():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        r4 = (X.C377949Nw) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C377939Nv
            if (r0 == 0) goto L_0x0032
            r3 = r5
            X.9Nv r3 = (X.C377939Nv) r3
            X.2Ep r1 = r3.A02
            if (r1 == 0) goto L_0x0031
            r0 = 0
            boolean r0 = r3.A08(r1, r0)
            if (r0 == 0) goto L_0x0024
            X.2Ep r0 = r3.A02
            r1 = 1
            if (r0 == 0) goto L_0x0024
            boolean r0 = r0.CVE()
            if (r0 != r1) goto L_0x0024
            X.A8b r0 = r3.A00
            if (r0 == 0) goto L_0x0024
            r0.A00(r3)
        L_0x0024:
            com.instagram.common.session.UserSession r0 = r3.A05
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.2Kb> r1 = X.2Kb.class
            X.1wn r0 = r3.A04
            r2.A01(r0, r1)
        L_0x0031:
            return
        L_0x0032:
            boolean r0 = r5 instanceof X.C377949Nw
            if (r0 == 0) goto L_0x0031
            r4 = r5
            X.9Nw r4 = (X.C377949Nw) r4
            X.2Ep r2 = r4.A02
            if (r2 == 0) goto L_0x0031
            X.A8b r1 = r4.A00
            boolean r0 = r4.A08(r2)
            if (r0 == 0) goto L_0x004a
            if (r1 == 0) goto L_0x004a
            r1.A00(r4)
        L_0x004a:
            X.91e r3 = r4.A07
            java.lang.String r2 = r2.C6C()
            X.8xI r1 = r4.A06
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0031
            java.util.Map r0 = r3.A03
            r0.put(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C392289uY.A03():void");
    }

    public void A04(boolean z) {
        C71662eb r1;
        int i;
        AnonymousClass2Ep r0;
        String C6C;
        if (this instanceof C377939Nv) {
            C377939Nv r4 = (C377939Nv) this;
            AnonymousClass2Ep r02 = r4.A02;
            if (r02 != null) {
                C70619ODq oDq = r4.A01;
                if (oDq != null) {
                    if (!r4.A08(r02, z) || (r0 = r4.A02) == null || !r0.CVE()) {
                        r1 = oDq.A00;
                        i = 8;
                    } else {
                        if (!r4.A05() && !z) {
                            0xa r6 = r4.A07.A00;
                            AnonymousClass7TG.A1L(r6.AR4(), r6, "direct_shh_mode_replay_banner_seen_count", 0);
                            AnonymousClass2Ep r03 = r4.A02;
                            if (!(r03 == null || (C6C = r03.C6C()) == null)) {
                                0xY AR4 = r6.AR4();
                                AR4.E5Z(002.A0R("direct_shh_mode_replay_banner_seen_count_", C6C), r6.getInt(002.A0R("direct_shh_mode_replay_banner_seen_count_", C6C), 0) + 1);
                                AR4.apply();
                            }
                        }
                        r1 = oDq.A00;
                        i = 0;
                    }
                    r1.A03(i);
                }
                AnonymousClass1Nd.A00(r4.A05).A01(r4.A04, 2Kb.class);
            }
        } else if (this instanceof C377949Nw) {
            C377949Nw r5 = (C377949Nw) this;
            AnonymousClass2Ep r42 = r5.A02;
            if (r42 != null) {
                O7Z o7z = r5.A01;
                if (o7z != null) {
                    if (o7z.A00.isShown() || !r5.A08(r5.A02)) {
                        r5.A01.A00.setVisibility(8);
                    } else {
                        r5.A01.A00.setVisibility(0);
                        C370948xK r2 = r5.A08;
                        AnonymousClass2Ep r12 = r5.A02;
                        r12.getClass();
                        C370948xK.A00(r2, r12, "show");
                        0xa r22 = r5.A0A.A01;
                        AnonymousClass7TG.A1M(r22, "unsend_warning_banner_shown_count", r22.getInt("unsend_warning_banner_shown_count", 0) + 1);
                        C395279zV.A00(r5.A04);
                    }
                }
                C3725091e r3 = r5.A07;
                String C6C2 = r42.C6C();
                C370928xI r13 = r5.A06;
                if (!TextUtils.isEmpty(C6C2)) {
                    r3.A03.put(C6C2, r13);
                }
            }
        } else if (this instanceof C3726191p) {
            C3726191p r43 = (C3726191p) this;
            0xa r23 = C314986jA.A00(r43.A02).A01;
            0xY AR42 = r23.AR4();
            AR42.E5Z("messaging_led_broadcast_channels_impression_count", r23.getInt("messaging_led_broadcast_channels_impression_count", 0) + 1);
            AR42.E5c("messaging_led_broadcast_channels_last_seen_timestamp", System.currentTimeMillis());
            AR42.apply();
            r43.A03.A00(C391519tD.IMPRESSION, r43.A00);
        }
    }

    public boolean A05() {
        View view;
        if (this instanceof C377939Nv) {
            C70619ODq oDq = ((C377939Nv) this).A01;
            if (oDq == null) {
                return false;
            }
            C71662eb r1 = oDq.A00;
            if (r1.A04()) {
                view = r1.A01();
                0qQ.A0A(view);
            } else {
                view = r1.A01;
                if (view == null) {
                    throw AnonymousClass7TE.A0z("view stub is unexpectedly null!");
                }
            }
            if (view == null || view.getVisibility() != 0) {
                return false;
            }
        } else if (this instanceof C377949Nw) {
            O7Z o7z = ((C377949Nw) this).A01;
            if (o7z == null || o7z.A00.getVisibility() != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0082, code lost:
        if (r1 == false) goto L_0x0084;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A06(android.content.Context r7) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C377959Nx
            if (r0 == 0) goto L_0x003a
            r3 = r6
            X.9Nx r3 = (X.C377959Nx) r3
            r0 = 0
            X.0qQ.A0B(r7, r0)
            X.2Ep r0 = r3.A01
            if (r0 == 0) goto L_0x0037
            com.instagram.user.model.User r0 = r0.BZK()
            if (r0 == 0) goto L_0x0037
            java.lang.String r2 = r0.B8Q()
            r1 = 31
            int r0 = r2.length()
            if (r1 >= r0) goto L_0x002d
            r0 = 30
            java.lang.String r1 = X.00R.A03(r2, r0)
            r0 = 8230(0x2026, float:1.1533E-41)
            java.lang.String r2 = X.002.A0C(r1, r0)
        L_0x002d:
            X.Etr r0 = new X.Etr
            r0.<init>(r7, r3, r2)
            r3.A00 = r0
            com.instagram.igds.components.banner.IgdsBanner r0 = r0.A00
        L_0x0036:
            return r0
        L_0x0037:
            java.lang.String r2 = ""
            goto L_0x002d
        L_0x003a:
            boolean r0 = r6 instanceof X.C377939Nv
            if (r0 == 0) goto L_0x0072
            r3 = r6
            X.9Nv r3 = (X.C377939Nv) r3
            r0 = 0
            X.0qQ.A0B(r7, r0)
            X.91K r2 = r3.A06
            r0 = 1
            X.0qQ.A0B(r2, r0)
            android.view.ViewStub r1 = new android.view.ViewStub
            r1.<init>(r7)
            X.ODq r0 = new X.ODq
            r0.<init>(r1, r2)
            r3.A01 = r0
            X.2eb r1 = r0.A00
            boolean r0 = r1.A04()
            if (r0 == 0) goto L_0x0067
            android.view.View r0 = r1.A01()
            X.0qQ.A0A(r0)
            return r0
        L_0x0067:
            android.view.ViewStub r0 = r1.A01
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = "view stub is unexpectedly null!"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0072:
            boolean r0 = r6 instanceof X.C377949Nw
            if (r0 == 0) goto L_0x00b1
            r5 = r6
            X.9Nw r5 = (X.C377949Nw) r5
            X.2Ep r0 = r5.A02
            if (r0 == 0) goto L_0x0084
            boolean r1 = r0.Ca9()
            r0 = 1
            if (r1 != 0) goto L_0x0085
        L_0x0084:
            r0 = 0
        L_0x0085:
            X.91K r4 = r5.A09
            if (r0 == 0) goto L_0x00a6
            r0 = 2131960663(0x7f132357, float:1.9558001E38)
            java.lang.String r3 = r7.getString(r0)
            r0 = 2131960662(0x7f132356, float:1.9558E38)
        L_0x0093:
            java.lang.String r2 = r7.getString(r0)
            android.view.ViewStub r1 = new android.view.ViewStub
            r1.<init>(r7)
            X.O7Z r0 = new X.O7Z
            r0.<init>(r1, r4, r3, r2)
            r5.A01 = r0
            android.view.ViewStub r0 = r0.A00
            return r0
        L_0x00a6:
            r0 = 2131960671(0x7f13235f, float:1.9558017E38)
            java.lang.String r3 = r7.getString(r0)
            r0 = 2131960670(0x7f13235e, float:1.9558015E38)
            goto L_0x0093
        L_0x00b1:
            r3 = r6
            X.91p r3 = (X.C3726191p) r3
            r0 = 0
            X.0qQ.A0B(r7, r0)
            androidx.fragment.app.FragmentActivity r2 = r3.A01
            com.instagram.common.session.UserSession r1 = r3.A02
            X.EwB r0 = new X.EwB
            r0.<init>(r7, r2, r1, r3)
            com.instagram.igds.components.banner.IgdsBanner r0 = r0.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C392289uY.A06(android.content.Context):android.view.View");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.91p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.9Nw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: X.9Nv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: X.9Nw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: X.9Nw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: X.9Nw} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C39761A8b r12, X.C74401PuH r13, X.AnonymousClass2Ep r14, boolean r15) {
        /*
            r11 = this;
            boolean r0 = r11 instanceof X.C377939Nv
            if (r0 == 0) goto L_0x0019
            r1 = r11
            X.9Nv r1 = (X.C377939Nv) r1
            X.AnonymousClass7TG.A1O(r13, r12)
            r0 = 0
            boolean r0 = r1.A08(r14, r0)
            if (r0 == 0) goto L_0x006b
            r1.A02 = r14
            r1.A00 = r12
        L_0x0015:
            r13.DoM(r1)
        L_0x0018:
            return
        L_0x0019:
            boolean r0 = r11 instanceof X.C3726191p
            if (r0 == 0) goto L_0x003b
            r1 = r11
            X.91p r1 = (X.C3726191p) r1
            r0 = 1
            X.0qQ.A0B(r13, r0)
            com.instagram.common.session.UserSession r0 = r1.A02
            boolean r0 = X.C377859Nn.A00(r0, r14)
            if (r0 == 0) goto L_0x006b
            if (r14 == 0) goto L_0x0039
            java.lang.String r0 = r14.C6C()
        L_0x0032:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.A00 = r0
            goto L_0x0015
        L_0x0039:
            r0 = 0
            goto L_0x0032
        L_0x003b:
            boolean r0 = r11 instanceof X.C377959Nx
            if (r0 == 0) goto L_0x00a6
            r4 = r11
            X.9Nx r4 = (X.C377959Nx) r4
            r5 = 1
            X.0qQ.A0B(r13, r5)
            if (r14 == 0) goto L_0x006b
            com.instagram.user.model.User r1 = X.AnonymousClass48N.A05(r14)
            if (r1 == 0) goto L_0x006b
            boolean r0 = r14.CUG()
            if (r0 != 0) goto L_0x006b
            com.instagram.common.session.UserSession r3 = r4.A02
            r2 = 3
            X.0qQ.A0B(r3, r5)
            X.4Cl r0 = r1.A03
            com.instagram.api.schemas.BirthdayVisibilityForViewer r0 = r0.Afu()
            if (r0 == 0) goto L_0x006b
            int r1 = r0.ordinal()
            if (r1 == r2) goto L_0x006f
            r0 = 2
            if (r1 == r0) goto L_0x006f
        L_0x006b:
            r13.onFailure()
            return
        L_0x006f:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319510470335943(0x81086700001dc7, double:3.0319428961459636E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0087
            r0 = 36324329423843335(0x810cc900033007, double:3.0349904217484065E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x006b
        L_0x0087:
            r4.A01 = r14
            r13.DoM(r4)
            java.lang.String r0 = r14.BZP()
            if (r0 == 0) goto L_0x0018
            X.91o r4 = r4.A03
            long r5 = java.lang.Long.parseLong(r0)
            java.lang.String r0 = r3.A06
            long r8 = java.lang.Long.parseLong(r0)
            java.lang.String r7 = "dm"
            java.lang.String r10 = "confetti_upsell"
            r4.A01(r5, r7, r8, r10)
            return
        L_0x00a6:
            r1 = r11
            X.9Nw r1 = (X.C377949Nw) r1
            if (r14 == 0) goto L_0x006b
            boolean r0 = r1.A08(r14)
            if (r0 == 0) goto L_0x006b
            r1.A00 = r12
            r1.A02 = r14
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C392289uY.A07(X.A8b, X.PuH, X.2Ep, boolean):void");
    }
}
