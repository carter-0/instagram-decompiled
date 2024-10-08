package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.capabilities.Capabilities;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7US  reason: invalid class name */
public final class AnonymousClass7US {
    public final AnonymousClass4DH A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final AnonymousClass7UC A03;
    public final AnonymousClass7SU A04;
    public final AnonymousClass4DU A05;
    public final C62320sa A06;
    public final C62320sa A07;
    public final C62320sa A08;
    public final C62320sa A09;
    public final C62320sa A0A;
    public final C62320sa A0B;
    public final C62320sa A0C;
    public final C62320sa A0D;
    public final C62320sa A0E;
    public final C62320sa A0F;
    public final C62320sa A0G;
    public final C62320sa A0H;
    public final C62320sa A0I;
    public final C62320sa A0J;
    public final C62320sa A0K;
    public final C62320sa A0L;
    public final C62320sa A0M;
    public final 0sL A0N;
    public final 0wc A0O;
    public final AnonymousClass7UO A0P;
    public final C62320sa A0Q;
    public final C62320sa A0R;
    public final C62320sa A0S;
    public final C62320sa A0T;
    public final C62320sa A0U;
    public final C62320sa A0V;

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.AnonymousClass7SD r8, java.util.List r9, boolean r10) {
        /*
            r7 = this;
            r4 = 0
            com.instagram.common.session.UserSession r6 = r7.A02
            boolean r0 = r8.A1C
            if (r0 == 0) goto L_0x002f
            int r3 = r8.A08
            r2 = 29
            if (r3 != r2) goto L_0x0030
            X.0Tu r5 = X.0Tu.A05
            r0 = 36319407392234791(0x81084f00111d27, double:3.031877709139733E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
        L_0x0018:
            if (r0 == 0) goto L_0x002f
        L_0x001a:
            if (r3 != r2) goto L_0x002f
            X.0sa r0 = r7.A0R
            java.lang.Object r0 = r0.invoke()
            X.7Vc r0 = (X.C332457Vc) r0
            X.0eM r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.B2r r0 = (X.C41836B2r) r0
            r0.FHw(r8, r9, r10, r4)
        L_0x002f:
            return
        L_0x0030:
            java.lang.Boolean r0 = X.AnonymousClass78L.A00(r6)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x005b
            X.3t3 r0 = r8.A0P
            if (r0 == 0) goto L_0x0059
            X.3sy r0 = X.C300965yF.A05(r0)
        L_0x0042:
            boolean r1 = r0 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            X.3Tu r0 = r8.A0H
            boolean r0 = X.C331057Pi.A02(r0)
            if (r1 != 0) goto L_0x002f
            if (r0 != 0) goto L_0x002f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r0 = X.AnonymousClass48O.A06(r0)
            if (r0 != 0) goto L_0x002f
            goto L_0x001a
        L_0x0059:
            r0 = 0
            goto L_0x0042
        L_0x005b:
            boolean r0 = X.C69958Nuy.A00(r6, r8)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7US.A03(X.7SD, java.util.List, boolean):void");
    }

    public final void A05(String str) {
        0qQ.A0B(str, 0);
        1Av A002 = 1Au.A00(this.A02);
        0wc r2 = this.A0O;
        0qQ.A0B(r2, 0);
        0Aj A003 = r2.A00(r2.A00, "direct_shh_mode_nux_impression");
        A003.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A003.Cgf();
        0xa r3 = A002.A01;
        0xY AR4 = r3.AR4();
        AR4.E5Z("direct_shhmode_display_count", r3.getInt("direct_shhmode_display_count", 0) + 1);
        AR4.apply();
        0xY AR42 = r3.AR4();
        AR42.E5c("direct_shhmode_seen_timestamp", System.currentTimeMillis());
        AR42.apply();
    }

    public final boolean A0A(AnonymousClass7S7 r9) {
        C242373Tu r0;
        UserSession userSession = this.A02;
        1Av A002 = 1Au.A00(userSession);
        AnonymousClass7S7 C6l = ((C333517Zg) this.A07.invoke()).C6l();
        AnonymousClass2Ep Cms = C6l.Cms();
        Capabilities AlE = C6l.AlE();
        0qQ.A07(AlE);
        if (C66642MaB.A00(userSession, AlE, Cms)) {
            if (Cms != null) {
                r0 = Cms.AiM();
            } else {
                r0 = null;
            }
            if (C66642MaB.A02(userSession, C331057Pi.A02(r0))) {
                0xa r7 = A002.A01;
                if (r7.getInt("direct_shhmode_display_count", 0) >= 5 || TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - r7.getLong("direct_shhmode_seen_timestamp", 0)) < 1 || C308556Us.A0S(userSession, r9)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void A00() {
        0xa r3 = AnonymousClass4k9.A00(this.A02).A00;
        0xY AR4 = r3.AR4();
        AR4.E5Z("direct_shh_mode_swipe_to_leave_nux_count", r3.getInt("direct_shh_mode_swipe_to_leave_nux_count", 0) + 1);
        AR4.apply();
        0xY AR42 = r3.AR4();
        AR42.E5c("direct_shh_mode_swipe_to_leave_nux_seen_timestamp", System.currentTimeMillis());
        AR42.apply();
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v42, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0099, code lost:
        if (r1 != 8) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00cf, code lost:
        if (r1 > 0) goto L_0x00d1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(com.instagram.common.typedurl.ImageUrl r8, boolean r9, boolean r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            X.7UO r6 = r7.A0P
            X.4DH r0 = r6.A07
            boolean r0 = r0.isResumed()
            if (r0 == 0) goto L_0x00cc
            X.0sa r0 = r6.A0B
            java.lang.Object r0 = r0.invoke()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r1 = r0.C6l()
            X.7SD r0 = r1.C6Q()
            boolean r0 = r0.A16
            if (r0 != 0) goto L_0x00cc
            r2 = 8
            if (r10 != 0) goto L_0x0109
            if (r9 != 0) goto L_0x0109
            X.0sa r0 = r6.A0E
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0109
            boolean r0 = r1.EtG()
            if (r0 != 0) goto L_0x0109
            X.0sa r0 = r6.A0D
            java.lang.Object r3 = r0.invoke()
            if (r3 == 0) goto L_0x011b
            androidx.recyclerview.widget.LinearLayoutManager r3 = (androidx.recyclerview.widget.LinearLayoutManager) r3
            int r1 = r3.A1a()
            if (r12 == 0) goto L_0x00cf
            int r0 = r3.A1c()
            if (r0 == r1) goto L_0x00cf
            r0 = -1
            if (r1 == r0) goto L_0x00cd
            android.view.View r1 = r3.A1D(r1)
        L_0x0055:
            if (r11 == 0) goto L_0x00d1
            if (r1 == 0) goto L_0x00d1
            r0 = 2131431819(0x7f0b118b, float:1.8485378E38)
            java.lang.Object r1 = r1.getTag(r0)
            boolean r0 = r1 instanceof java.util.Set
            if (r0 == 0) goto L_0x00d1
            java.util.Set r1 = (java.util.Set) r1
            X.9ro r0 = X.C390769ro.KEEP_TOP_IN_VIEWPORT
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00d1
            X.3oV r0 = r6.A04
            if (r0 == 0) goto L_0x0111
            X.AnonymousClass7UO.A00(r0, r6)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r6.A03
            if (r0 == 0) goto L_0x007c
            r0.setVisibility(r2)
        L_0x007c:
            X.7Mr r0 = r6.A05
            if (r0 == 0) goto L_0x008c
            X.0eM r0 = r0.A01
            java.lang.Object r1 = r0.getValue()
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            r1.setVisibility(r0)
        L_0x008c:
            X.AnonymousClass7UO.A01(r6)
            android.view.View r0 = r6.A01
            r5 = 0
            if (r0 == 0) goto L_0x009b
            int r1 = r0.getVisibility()
            r0 = 1
            if (r1 == r2) goto L_0x009c
        L_0x009b:
            r0 = 0
        L_0x009c:
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r0 != 0) goto L_0x00b4
            X.2cs r0 = r6.A02
            if (r0 == 0) goto L_0x00b4
            double r0 = r0.A01
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            if (r0 == 0) goto L_0x00b4
            double r1 = r0.doubleValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00cc
        L_0x00b4:
            android.view.View r0 = r6.A01
            if (r0 == 0) goto L_0x00bb
            r0.setVisibility(r5)
        L_0x00bb:
            X.2cs r5 = r6.A02
            if (r5 == 0) goto L_0x00c5
            r1 = 0
            r0 = 1
            r5.A08(r1, r0)
        L_0x00c5:
            X.2cs r0 = r6.A02
            if (r0 == 0) goto L_0x00cc
            r0.A06(r3)
        L_0x00cc:
            return
        L_0x00cd:
            r1 = 0
            goto L_0x0055
        L_0x00cf:
            if (r1 <= 0) goto L_0x0109
        L_0x00d1:
            X.3oV r0 = r6.A04
            if (r0 == 0) goto L_0x0111
            X.AnonymousClass7UO.A00(r0, r6)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r6.A03
            if (r1 == 0) goto L_0x00e0
            r0 = 0
            r1.setVisibility(r0)
        L_0x00e0:
            X.7Mr r0 = r6.A05
            if (r0 == 0) goto L_0x00f5
            X.0eM r1 = r0.A01
            boolean r0 = r1.CVQ()
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r0 = r1.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r2)
        L_0x00f5:
            if (r8 == 0) goto L_0x0101
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r6.A03
            if (r1 == 0) goto L_0x008c
            X.4DU r0 = r6.A0A
            r1.setUrl(r8, r0)
            goto L_0x008c
        L_0x0101:
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r6.A03
            if (r0 == 0) goto L_0x008c
            r0.A09()
            goto L_0x008c
        L_0x0109:
            android.view.View r0 = r6.A01
            if (r0 == 0) goto L_0x00cc
            r0.setVisibility(r2)
            return
        L_0x0111:
            java.lang.String r0 = "newMessageIndicatorContainerStub"
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x011b:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7US.A01(com.instagram.common.typedurl.ImageUrl, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0080, code lost:
        if (X.0qQ.A0K(r1.A01.getString("has_seen_thread_title_change_banner_thread_id", (java.lang.String) null), r3) == false) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass7SD r10) {
        /*
            r9 = this;
            X.0sa r5 = r9.A07
            java.lang.Object r0 = r5.invoke()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            X.3sy r2 = r0.AfV()
            java.lang.Object r1 = r5.invoke()
            X.7Zg r1 = (X.C333517Zg) r1
            X.9Gx r0 = X.C376179Gx.CUSTOMIZE_THREAD_NAME
            boolean r0 = r1.AH1(r0)
            if (r0 == 0) goto L_0x0126
            if (r2 == 0) goto L_0x0126
            X.7S7 r0 = r1.C6l()
            X.3t3 r7 = r0.CBU()
            if (r7 == 0) goto L_0x0089
            X.0sa r0 = r9.A0V
            java.lang.Object r6 = r0.invoke()
            X.7WY r6 = (X.AnonymousClass7WY) r6
            com.instagram.common.session.UserSession r2 = r9.A02
            X.0sa r0 = r9.A0S
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
            boolean r0 = r10.A1G
            r4 = 1
            if (r0 != 0) goto L_0x0123
            boolean r1 = r10.A0r
            boolean r0 = r10.A1A
            if (r1 == 0) goto L_0x0123
            if (r0 == 0) goto L_0x0123
            boolean r0 = r10.A1B
            if (r0 != 0) goto L_0x0123
            java.util.List r1 = r10.A0Z
            java.lang.String r0 = r2.A06
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0123
            if (r3 != 0) goto L_0x0123
            java.util.List r0 = r10.A0c
            if (r0 == 0) goto L_0x0067
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0123
        L_0x0067:
            X.1Av r1 = X.1Au.A00(r2)
            java.lang.String r3 = java.lang.String.valueOf(r7)
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.0xa r2 = r1.A01
            java.lang.String r1 = "has_seen_thread_title_change_banner_thread_id"
            r0 = 0
            java.lang.String r0 = r2.getString(r1, r0)
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 != 0) goto L_0x0123
        L_0x0082:
            r6.A02 = r7
            r6.A05 = r4
            X.AnonymousClass7WY.A00(r6)
        L_0x0089:
            X.0sa r6 = r9.A0U
            java.lang.Object r0 = r6.invoke()
            X.7BY r0 = (X.AnonymousClass7BY) r0
            com.google.common.collect.ImmutableList r4 = r0.A01()
            X.0qQ.A07(r4)
            int r3 = r4.size()
            r2 = 0
            r8 = 0
        L_0x009e:
            if (r2 >= r3) goto L_0x0126
            X.4DH r0 = r9.A00
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L_0x0120
            java.lang.Object r0 = r5.invoke()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            com.instagram.model.direct.DirectShareTarget r7 = r0.C6Z(r1)
            if (r7 == 0) goto L_0x0121
            java.lang.String r1 = r7.A08()
            if (r1 != 0) goto L_0x00c2
            java.lang.String r1 = r7.A09()
        L_0x00c2:
            java.lang.Object r0 = r4.get(r2)
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            java.lang.String r0 = r0.A08()
            if (r0 != 0) goto L_0x00db
            java.lang.Object r0 = r4.get(r2)
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            java.lang.String r0 = r0.A09()
            X.0qQ.A07(r0)
        L_0x00db:
            if (r7 == 0) goto L_0x00f6
            if (r1 == 0) goto L_0x00f6
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00f6
            if (r8 == 0) goto L_0x00f9
            java.lang.Object r1 = r6.invoke()
            X.7BY r1 = (X.AnonymousClass7BY) r1
            java.lang.Object r0 = r4.get(r2)
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            r1.A03(r0)
        L_0x00f6:
            int r2 = r2 + 1
            goto L_0x009e
        L_0x00f9:
            java.lang.Object r1 = r4.get(r2)
            com.instagram.model.direct.DirectShareTarget r1 = (com.instagram.model.direct.DirectShareTarget) r1
            java.lang.String r0 = r7.A0I
            if (r0 != 0) goto L_0x0105
            java.lang.String r0 = ""
        L_0x0105:
            r1.A0I = r0
            java.lang.String r0 = r7.A0J
            if (r0 != 0) goto L_0x010d
            java.lang.String r0 = ""
        L_0x010d:
            r1.A0J = r0
            java.lang.Object r1 = r6.invoke()
            X.7BY r1 = (X.AnonymousClass7BY) r1
            java.lang.Object r0 = r4.get(r2)
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            r1.A04(r0, r2)
            r8 = 1
            goto L_0x00f6
        L_0x0120:
            r7 = 0
        L_0x0121:
            r1 = 0
            goto L_0x00c2
        L_0x0123:
            r4 = 0
            goto L_0x0082
        L_0x0126:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7US.A02(X.7SD):void");
    }

    public final void A04(String str) {
        if (str != null) {
            UserSession userSession = this.A02;
            AnonymousClass3U9 A0N2 = 1bJ.A00(userSession).A0N(str);
            AnonymousClass7FA r1 = (AnonymousClass7FA) this.A06.invoke();
            if (A0N2 != null && r1 != null && C66658MaR.A00(userSession, A0N2)) {
                r1.A04(new C388819oR(A0N2));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(java.util.List r6) {
        /*
            r5 = this;
            X.0sa r4 = r5.A0Q
            java.lang.Object r0 = r4.invoke()
            X.7Pg r0 = (X.C331037Pg) r0
            X.OFQ r0 = r0.A02
            if (r0 == 0) goto L_0x0039
            com.instagram.model.direct.messageid.DirectMessageIdentifier r3 = r0.A01
            if (r3 == 0) goto L_0x0039
            java.util.Iterator r2 = r6.iterator()
        L_0x0014:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r1 = r2.next()
            java.lang.String r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0014
        L_0x002e:
            java.lang.Object r1 = r4.invoke()
            X.7Pg r1 = (X.C331037Pg) r1
            java.lang.String r0 = "message_unsent"
            r1.A0B(r0)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7US.A06(java.util.List):void");
    }

    public final void A07(C62320sa r5, int i) {
        C252553pI r3 = (C252553pI) this.A0T.invoke();
        if (r3 != null) {
            C67784Muo muo = new C67784Muo(this.A00.requireContext(), new C73923Pm3(r5, 46));
            muo.A00 = i;
            r3.A0t(muo);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0012: MOVE  (r7v0 boolean) = (r25v0 boolean)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void A08(boolean r25) {
        /*
            r24 = this;
            r0 = r24
            X.0sa r0 = r0.A0F
            java.lang.Object r0 = r0.invoke()
            X.7SM r0 = (X.AnonymousClass7SM) r0
            X.9H7 r0 = r0.A00
            X.7Hl r6 = r0.A0R
            if (r6 == 0) goto L_0x00cb
            boolean r0 = r6.A0y
            r7 = r25
            if (r7 == r0) goto L_0x00cb
            r5 = 1
            X.C329067Hl.A0j(r6, r5)
            r6.A15()
            if (r25 == 0) goto L_0x00ac
            android.content.Context r13 = r6.A1R
            boolean r0 = r13 instanceof android.app.Activity
            if (r0 == 0) goto L_0x00ac
            X.0eK r0 = r6.A22
            java.lang.Object r8 = r0.get()
            X.2Ep r8 = (X.AnonymousClass2Ep) r8
            if (r8 == 0) goto L_0x00ac
            com.instagram.common.session.UserSession r14 = r6.A1Z
            boolean r4 = X.C308556Us.A0O(r14, r8)
            java.lang.Long r16 = X.C330007Lb.A01(r8)
            X.3Tu r0 = r8.AiM()
            X.3tH r15 = X.C308556Us.A01(r14, r0)
            boolean r3 = X.C329067Hl.A0u(r6)
            X.7Kc r0 = X.C329737Ka.A03(r14, r8)
            boolean r2 = r0.COW(r14, r8)
            X.OYw r0 = X.NK8.A03
            boolean r0 = r0.A02(r14, r4, r3, r2)
            if (r0 == 0) goto L_0x00ac
            r6.A16()
            boolean r1 = r8.Axj()
            X.4li r0 = r8.Axk()
            r17 = 0
            if (r0 == 0) goto L_0x00d1
            java.lang.Integer r0 = r0.A03
        L_0x0066:
            if (r1 == 0) goto L_0x0087
            if (r0 == 0) goto L_0x0087
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r9.toMillis(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            if (r1 == 0) goto L_0x0087
            long r11 = r1.longValue()
            r9 = -1
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0087
            r17 = r1
        L_0x0087:
            android.app.Activity r13 = (android.app.Activity) r13
            X.2Er r0 = r6.A0W
            if (r0 != 0) goto L_0x00cc
            r18 = 0
        L_0x008f:
            X.0eK r0 = r6.A25
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r19 = r0.booleanValue()
            X.3Tu r0 = r8.AiM()
            boolean r20 = X.C308556Us.A0I(r14, r0)
            r21 = r4
            r22 = r3
            r23 = r2
            X.C71021OYw.A01(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x00ac:
            r6.A0y = r7
            r6.A1C()
            X.7H1 r1 = r6.A1w
            boolean r0 = r1 instanceof X.AnonymousClass7H0
            if (r0 == 0) goto L_0x00cb
            X.7H0 r1 = (X.AnonymousClass7H0) r1
            X.0eK r0 = r6.A23
            java.lang.Object r0 = r0.get()
            X.7Kc r0 = (X.C329757Kc) r0
            X.0qQ.A0B(r0, r5)
            r1.A05 = r7
            r1.A01 = r0
            X.AnonymousClass7H0.A00(r1)
        L_0x00cb:
            return
        L_0x00cc:
            java.lang.String r18 = r0.C6C()
            goto L_0x008f
        L_0x00d1:
            r0 = r17
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7US.A08(boolean):void");
    }

    public final boolean A09() {
        UserSession userSession = this.A02;
        AnonymousClass4kA A002 = AnonymousClass4k9.A00(userSession);
        if (C66642MaB.A02(userSession, C331057Pi.A02(((C333517Zg) this.A07.invoke()).C6l().C6Q().A0H))) {
            0xa r6 = A002.A00;
            if (r6.getInt("direct_shh_mode_swipe_to_leave_nux_count", 0) >= 5 || TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - r6.getLong("direct_shh_mode_swipe_to_leave_nux_seen_timestamp", 0)) < 1) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass7US(AnonymousClass4DH r6, AnonymousClass0iw r7, 0wc r8, UserSession userSession, AnonymousClass7UO r10, AnonymousClass7UC r11, AnonymousClass7SU r12, AnonymousClass4DU r13, C62320sa r14, C62320sa r15, C62320sa r16, C62320sa r17, C62320sa r18, C62320sa r19, C62320sa r20, C62320sa r21, C62320sa r22, C62320sa r23, C62320sa r24, C62320sa r25, C62320sa r26, C62320sa r27, C62320sa r28, C62320sa r29, C62320sa r30, C62320sa r31, C62320sa r32, C62320sa r33, C62320sa r34, C62320sa r35, C62320sa r36, 0sL r37) {
        0qQ.A0B(r6, 1);
        0qQ.A0B(r7, 3);
        0qQ.A0B(r8, 4);
        0qQ.A0B(r14, 8);
        0qQ.A0B(r15, 9);
        C62320sa r1 = r19;
        0qQ.A0B(r1, 13);
        C62320sa r2 = r20;
        0qQ.A0B(r2, 14);
        C62320sa r3 = r29;
        0qQ.A0B(r3, 23);
        C62320sa r4 = r33;
        0qQ.A0B(r4, 29);
        this.A00 = r6;
        this.A02 = userSession;
        this.A01 = r7;
        this.A0O = r8;
        this.A05 = r13;
        this.A04 = r12;
        this.A0P = r10;
        this.A07 = r14;
        this.A0J = r15;
        this.A0F = r16;
        this.A06 = r17;
        this.A0H = r18;
        this.A0G = r1;
        this.A0T = r2;
        this.A0V = r21;
        this.A0K = r22;
        this.A0U = r23;
        this.A0Q = r24;
        this.A08 = r25;
        this.A09 = r26;
        this.A0M = r27;
        this.A0L = r28;
        this.A0E = r3;
        this.A0R = r30;
        this.A03 = r11;
        this.A0N = r37;
        this.A0S = r31;
        this.A0A = r32;
        this.A0C = r4;
        this.A0D = r34;
        this.A0I = r35;
        this.A0B = r36;
    }
}
