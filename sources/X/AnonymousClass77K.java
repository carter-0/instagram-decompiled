package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.77K  reason: invalid class name */
public final class AnonymousClass77K implements AnonymousClass7D2 {
    public long A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final AnonymousClass7X0 A03;
    public final AnonymousClass9HC A04;
    public final AnonymousClass77N A05;
    public final AnonymousClass77O A06;
    public final AnonymousClass77M A07;
    public final AnonymousClass7HA A08;
    public final AnonymousClass7DZ A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass77L A0B;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.direct_media_message, viewGroup, false);
        0qQ.A0A(inflate);
        AnonymousClass7PV.A01(inflate);
        C66775McL mcL = new C66775McL(inflate);
        Drawable indeterminateDrawable = mcL.A0A.getIndeterminateDrawable();
        Context context = inflate.getContext();
        indeterminateDrawable.setColorFilter(context.getColor(2Yu.A0H(context, R.attr.progressBar)), PorterDuff.Mode.SRC_IN);
        AnonymousClass7DZ r0 = this.A09;
        if (r0 != null) {
            r0.A00(mcL);
        }
        return mcL;
    }

    public AnonymousClass77K(Context context, AnonymousClass0iw r15, UserSession userSession, AnonymousClass7X0 r17, AnonymousClass9HC r18) {
        AnonymousClass7X0 r0 = r17;
        UserSession userSession2 = userSession;
        this.A02 = userSession2;
        this.A03 = r0;
        AnonymousClass9HC r10 = r18;
        this.A04 = r10;
        this.A01 = r15;
        AnonymousClass7YA r6 = (AnonymousClass7YA) r0;
        C332917Wy r7 = (C332917Wy) r0;
        this.A0B = new AnonymousClass77L(userSession2, (AnonymousClass7X1) r0, r6, r7, (AnonymousClass7YB) r0, (C332927Wz) r0, r10);
        this.A0A = AnonymousClass1YB.A00(new C377479Lz(15, context, this));
        this.A07 = new AnonymousClass77M(userSession2, context);
        this.A05 = new AnonymousClass77N(userSession2);
        this.A06 = new AnonymousClass77O(context);
        this.A08 = new AnonymousClass7HA(userSession2, new AnonymousClass7H9(userSession2));
        boolean z = r10.A1X;
        C3265877j r3 = new C3265877j(z);
        AnonymousClass77P r62 = new AnonymousClass77P(this);
        C3265977k r72 = new C3265977k((AnonymousClass7XR) r0, r3.A00);
        AnonymousClass7DV r8 = new AnonymousClass7DV((AnonymousClass7XX) r0, z);
        this.A09 = new AnonymousClass7DZ(0sr.A1P(new AnonymousClass7DY[]{new C3266077l(new AnonymousClass7DX((AnonymousClass7XN) r0), r62, r72, r8, (C333107Xr) r0, r10, (C3266177m) null, false), r3}));
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void ADp(X.C328007Db r21, X.AnonymousClass7FW r22) {
        /*
            r20 = this;
            r4 = r22
            r5 = r21
            X.McL r5 = (X.C66775McL) r5
            X.Mcv r4 = (X.C66809Mcv) r4
            r3 = 0
            X.0qQ.A0B(r5, r3)
            r8 = 1
            X.0qQ.A0B(r4, r8)
            X.MdB r0 = r5.A00
            if (r0 == 0) goto L_0x0017
            r0.Dds()
        L_0x0017:
            boolean r13 = r4.A0H
            if (r13 == 0) goto L_0x023b
            java.lang.Integer r9 = X.AnonymousClass05K.A01
        L_0x001d:
            r6 = r20
            X.7HA r7 = r6.A08
            boolean r2 = r4.A0F
            X.0iw r1 = r6.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.MdB r10 = r7.A00(r1, r9, r0, r2)
            X.7X0 r9 = r6.A03
            r2 = r9
            X.7Xf r2 = (X.C332987Xf) r2
            r1 = 33
            X.9Km r0 = new X.9Km
            r0.<init>(r10, r1)
            r2.CjH(r0)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout r7 = r5.A0B
            X.AnonymousClass7PV.A01(r7)
            r7.setCornerBackgroundColor(r3)
            X.7FE r12 = r4.A08
            int r0 = X.C3265577g.A00(r12)
            r7.setRadius(r0)
            X.77B r2 = r4.A06
            X.1aU r11 = r2.A0B
            boolean r0 = r4.A0G
            if (r0 == 0) goto L_0x0067
            X.1a8 r1 = r5.A06
            X.PSb r0 = new X.PSb
            r17 = r5
            r18 = r10
            r19 = r4
            r14 = r0
            r15 = r2
            r16 = r6
            r14.<init>(r15, r16, r17, r18, r19)
            r1.A02(r11, r0)
        L_0x0067:
            X.0eM r0 = r6.A0A
            java.lang.Object r1 = r0.getValue()
            X.Mcx r1 = (X.C66811Mcx) r1
            X.Mcw r0 = new X.Mcw
            r0.<init>(r6, r5, r4)
            r1.A01(r5, r10, r4, r0)
            X.7DZ r0 = r6.A09
            if (r0 == 0) goto L_0x007e
            r0.A02(r5, r4)
        L_0x007e:
            X.7TJ r9 = (X.AnonymousClass7TJ) r9
            com.instagram.model.direct.messageid.MessageIdentifier r0 = r4.BSG()
            java.lang.String r0 = r0.A00()
            if (r0 == 0) goto L_0x009b
            com.instagram.model.direct.messageid.MessageIdentifier r0 = r4.BSG()
            java.lang.String r1 = r0.A00()
            X.7FU r0 = r4.A00
            boolean r0 = r0.CU2()
            r9.CjC(r1, r0)
        L_0x009b:
            r5.A00 = r10
            X.1Xj r9 = r2.A0E
            if (r9 == 0) goto L_0x01d9
            X.4w4 r0 = r9.BQf()
            if (r0 == 0) goto L_0x01d9
            java.lang.Integer r0 = X.C52501GVd.A03(r0)
            java.lang.Integer r10 = X.AnonymousClass05K.A0N
            if (r0 != r10) goto L_0x01d9
            com.instagram.common.session.UserSession r14 = r6.A02
            X.0Tu r11 = X.0Tu.A05
            r0 = 36330299428192820(0x81123700004234, double:3.038765876538299E-306)
            boolean r0 = X.182.A06(r11, r14, r0)
            if (r0 == 0) goto L_0x01d9
            X.77O r13 = r6.A06
            r0 = 2131440083(0x7f0b31d3, float:1.850214E38)
            android.view.View r1 = r7.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewGroup
            r14 = 0
            r7 = r14
            if (r0 == 0) goto L_0x00ce
            r7 = r1
        L_0x00ce:
            X.4w4 r1 = r9.BQf()
            if (r1 == 0) goto L_0x01d0
            java.lang.Integer r0 = X.C52501GVd.A03(r1)
            if (r0 != r10) goto L_0x01d0
            java.lang.String r0 = r1.getTitle()
            if (r0 == 0) goto L_0x01d0
            if (r7 == 0) goto L_0x0145
            r7.getVisibility()
        L_0x00e5:
            X.77N r6 = r6.A05
            boolean r7 = X.AnonymousClass77N.A00(r6, r4)
            android.view.View r1 = r5.A02
            r4 = 0
            r0 = 8
            if (r7 == 0) goto L_0x00f3
            r0 = 0
        L_0x00f3:
            r1.setVisibility(r0)
            com.instagram.feed.widget.IgProgressImageViewProgressBar r1 = r5.A0A
            if (r7 != 0) goto L_0x00fc
            r4 = 8
        L_0x00fc:
            r1.setVisibility(r4)
            r0 = r7 ^ 1
            r1.setIndeterminate(r0)
            if (r7 == 0) goto L_0x0144
            com.instagram.common.session.UserSession r4 = r6.A00
            X.5yB r0 = r2.A0F
            r1 = 0
            if (r0 == 0) goto L_0x010f
            java.lang.String r1 = r0.A06
        L_0x010f:
            com.instagram.pendingmedia.store.PendingMediaStore r0 = X.28K.A00(r4)
            if (r1 == 0) goto L_0x012f
            X.3Q2 r0 = r0.A03(r1)
            if (r0 == 0) goto L_0x012f
            java.lang.String r4 = r0.A35
            X.PIU r2 = new X.PIU
            r2.<init>(r5, r0)
            r0.A0Y(r2)
            java.util.Map r1 = r6.A01
            X.34S r0 = new X.34S
            r0.<init>(r4, r2)
            r1.put(r5, r0)
        L_0x012f:
            com.instagram.feed.widget.IgProgressImageView r1 = r5.A09
            X.0qQ.A0B(r1, r3)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r1.getIgImageView()
            X.AnonymousClass75B.A00(r0, r8)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r1.getIgImageView()
            X.2s5 r0 = X.AnonymousClass75B.A01
            r1.setImageRendererAndReset(r0)
        L_0x0144:
            return
        L_0x0145:
            android.view.ViewStub r0 = r5.A04
            android.view.View r1 = r0.inflate()
            r0 = 2131428939(0x7f0b064b, float:1.8479537E38)
            android.view.View r1 = r1.findViewById(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.LinearLayout"
            X.0qQ.A0C(r1, r0)
            r0 = 2131434058(0x7f0b1a4a, float:1.848992E38)
            android.view.View r7 = r1.findViewById(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.IgImageView"
            X.0qQ.A0C(r7, r0)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0 = 2131437679(0x7f0b286f, float:1.8497263E38)
            android.view.View r11 = r1.findViewById(r0)
            r0 = 9
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r11, r0)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r1 = 0
            r7.setVisibility(r3)
            r11.setVisibility(r3)
            r10 = 0
            X.4w4 r0 = r9.BQf()
            if (r0 == 0) goto L_0x0198
            X.4w8 r14 = r0.BE7()
            if (r14 == 0) goto L_0x0198
            java.lang.Integer r0 = r14.BED()
            if (r0 == 0) goto L_0x0198
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0198
            r1 = 1
        L_0x0198:
            r12 = -1
            if (r1 == 0) goto L_0x01c6
            android.content.Context r1 = r13.A00
            r0 = 2131238463(0x7f081e3f, float:1.8093205E38)
        L_0x01a0:
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r7.setImageDrawable(r0)
            android.graphics.drawable.Drawable r7 = r7.getDrawable()
            if (r7 == 0) goto L_0x01b7
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            r0.<init>(r12, r1)
            r7.setColorFilter(r0)
        L_0x01b7:
            X.4w4 r0 = r9.BQf()
            if (r0 == 0) goto L_0x01c1
            java.lang.String r10 = r0.getTitle()
        L_0x01c1:
            r11.setText(r10)
            goto L_0x00e5
        L_0x01c6:
            X.C69760Nrj.A00(r14)
            android.content.Context r1 = r13.A00
            int r0 = X.C69760Nrj.A00(r14)
            goto L_0x01a0
        L_0x01d0:
            if (r7 == 0) goto L_0x00e5
            r0 = 8
            r7.setVisibility(r0)
            goto L_0x00e5
        L_0x01d9:
            X.77M r11 = r6.A07
            X.N4R r10 = r5.A05
            boolean r9 = r4.A0J
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r1 = r2.A01
            int r0 = r4.A02
            X.JU0 r7 = new X.JU0
            r14 = r7
            r15 = r12
            r16 = r1
            r17 = r0
            r18 = r9
            r19 = r13
            r14.<init>((X.AnonymousClass7FE) r15, (com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel) r16, (int) r17, (boolean) r18, (boolean) r19)
            r0 = 14
            X.9Lz r1 = new X.9Lz
            r1.<init>(r0, r4, r6)
            r9 = 16
            X.9Lz r0 = new X.9Lz
            r0.<init>(r9, r7, r11)
            X.0t0 r17 = X.AnonymousClass0eN.A01(r0)
            com.instagram.common.session.UserSession r13 = r11.A01
            android.content.Context r11 = r11.A00
            java.lang.Object r0 = r10.A02
            X.3oV r0 = (X.C252063oV) r0
            java.lang.Object r12 = r10.A00
            com.instagram.feed.widget.IgProgressImageView r12 = (com.instagram.feed.widget.IgProgressImageView) r12
            com.instagram.common.ui.widget.imageview.IgImageView r14 = r12.getIgImageView()
            r15 = 0
            r18 = 192(0xc0, float:2.69E-43)
            X.759 r10 = new X.759
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = r7.A05
            if (r0 != 0) goto L_0x0227
            r10.A02()
            goto L_0x00e5
        L_0x0227:
            java.lang.Object r0 = r7.A02
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r0 = (com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel) r0
            int r9 = r7.A01
            if (r0 == 0) goto L_0x0234
            r10.A04(r0, r1, r9)
            goto L_0x00e5
        L_0x0234:
            boolean r0 = r7.A04
            r10.A03(r9, r0)
            goto L_0x00e5
        L_0x023b:
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass77K.ADp(X.7Db, X.7FW):void");
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r4) {
        AnonymousClass3Q2 A032;
        C66775McL mcL = (C66775McL) r4;
        0qQ.A0B(mcL, 0);
        AnonymousClass7DZ r0 = this.A09;
        if (r0 != null) {
            r0.A01(mcL);
        }
        mcL.A06.A01();
        C66819MdB mdB = mcL.A00;
        if (mdB != null) {
            mdB.Dds();
        }
        mcL.A00 = null;
        AnonymousClass77N r1 = this.A05;
        AnonymousClass34S r2 = (AnonymousClass34S) r1.A01.remove(mcL);
        if (r2 != null && (A032 = 28K.A00(r1.A00).A03((String) r2.A00)) != null) {
            Object obj = r2.A01;
            0qQ.A06(obj);
            A032.A0Z((AnonymousClass2sT) obj);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f5, code lost:
        if (r14 == X.AnonymousClass05K.A01) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(X.AnonymousClass77K r16, X.C66775McL r17, X.C66809Mcv r18) {
        /*
            long r4 = android.os.SystemClock.elapsedRealtime()
            r6 = r16
            long r0 = r6.A00
            long r4 = r4 - r0
            r3 = 0
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x004d
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.A00 = r0
            X.77N r0 = r6.A05
            r1 = r18
            boolean r0 = X.AnonymousClass77N.A00(r0, r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x004d
            X.77L r5 = r6.A0B
            X.7FU r0 = r1.A00
            boolean r8 = r0.BCL()
            int r13 = r1.A02
            com.instagram.model.direct.messageid.MessageIdentifier r12 = r1.BSG()
            X.77B r6 = r1.A06
            com.instagram.common.typedurl.ImageUrl r7 = r1.A00
            java.lang.String r11 = r1.A0B
            java.lang.String r9 = r1.A0D
            com.instagram.common.typedurl.ImageUrl r15 = r1.A05
            r0 = 3
            X.0qQ.A0B(r12, r0)
            boolean r0 = r6.A0d
            r10 = 1
            if (r8 == 0) goto L_0x004e
            if (r0 != 0) goto L_0x004e
            X.7Wz r0 = r5.A03
            if (r0 == 0) goto L_0x004c
            r0.EuX(r12)
        L_0x004c:
            r3 = 1
        L_0x004d:
            return r3
        L_0x004e:
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r1 = r6.A01
            r4 = r17
            if (r1 == 0) goto L_0x00f9
            java.lang.Integer r14 = r1.A02
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            if (r14 != r2) goto L_0x00f3
            java.lang.String r0 = r1.A05
            if (r0 == 0) goto L_0x00eb
            java.lang.Integer r0 = r1.A01
            if (r0 == 0) goto L_0x00eb
            int r9 = r6.A04
            r0 = 29
            if (r9 != r0) goto L_0x00eb
            com.instagram.common.session.UserSession r10 = r5.A00
            java.lang.Boolean r0 = X.O0U.A00(r10)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00eb
            java.lang.String r12 = r6.A0T
            if (r12 == 0) goto L_0x00eb
            java.lang.String r9 = "direct_thread"
            X.0xG r0 = new X.0xG
            r0.<init>(r9)
            X.0wc r9 = X.AnonymousClass0kN.A01(r0, r10)
            java.lang.String r10 = r1.A05
            boolean r0 = r6.A0s
            if (r0 == 0) goto L_0x008b
            java.lang.Integer r2 = X.AnonymousClass05K.A01
        L_0x008b:
            r0 = 976(0x3d0, float:1.368E-42)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            X.0kJ r0 = r9.A00
            X.0Aj r9 = r9.A00(r0, r1)
            boolean r0 = r9.isSampled()
            if (r0 == 0) goto L_0x00eb
            X.Nm7 r1 = X.C69463Nm7.TAP_TO_REVEAL
            java.lang.String r0 = "event_name"
            r9.A8M(r1, r0)
            java.lang.String r0 = "message_id"
            r9.AAJ(r0, r12)
            java.lang.String r0 = "attachment_id"
            r9.AAJ(r0, r11)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = "is_forward"
            r9.A7p(r0, r1)
            int r1 = r2.intValue()
            r0 = 9
            if (r1 == r3) goto L_0x00c1
            r0 = 19
        L_0x00c1:
            java.lang.String r1 = "message_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.A8k(r1, r0)
            X.N0s r2 = new X.N0s
            r2.<init>()
            java.lang.String r1 = java.lang.String.valueOf(r10)
            java.lang.String r0 = "name"
            r2.A06(r0, r1)
            java.lang.String r1 = "warning_screens"
            java.lang.String r0 = "type"
            r2.A06(r0, r1)
            r0 = 911(0x38f, float:1.277E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r9.AAK(r2, r0)
            r9.Cgf()
        L_0x00eb:
            boolean r0 = X.AnonymousClass77L.A00(r7, r6, r5, r4, r8)
            if (r0 == 0) goto L_0x004d
            goto L_0x004c
        L_0x00f3:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r14 != r0) goto L_0x00f9
            goto L_0x004c
        L_0x00f9:
            if (r13 == 0) goto L_0x0146
            r2 = 2
            if (r13 == r10) goto L_0x013b
            if (r13 != r2) goto L_0x0151
            com.instagram.common.session.UserSession r3 = r5.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322048796338095(0x810ab6000527af, double:3.033548143730743E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0136
            if (r9 == 0) goto L_0x011f
            int r0 = r9.length()
            if (r0 == 0) goto L_0x011f
            java.lang.String r0 = "meta.ai"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0136
        L_0x011f:
            java.lang.String r2 = r6.A0S
            java.lang.String r1 = r6.A0T
            java.lang.Long r0 = r6.A0L
            X.7YA r13 = r5.A02
            if (r13 == 0) goto L_0x004c
            com.instagram.feed.widget.IgProgressImageView r14 = r4.A09
            r18 = r1
            r16 = r0
            r17 = r2
            r13.Cpr(r14, r15, r16, r17, r18)
            goto L_0x004c
        L_0x0136:
            X.AnonymousClass77L.A00(r7, r6, r5, r4, r8)
            goto L_0x004c
        L_0x013b:
            X.7X1 r1 = r5.A01
            if (r1 == 0) goto L_0x004c
            java.lang.String r0 = r12.A01
            r1.AGk(r0, r2)
            goto L_0x004c
        L_0x0146:
            X.7X1 r1 = r5.A01
            if (r1 == 0) goto L_0x004c
            java.lang.String r0 = r12.A01
            r1.AGk(r0, r10)
            goto L_0x004c
        L_0x0151:
            java.lang.String r1 = "Not a valid ImageRevealStatus"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass77K.A00(X.77K, X.McL, X.Mcv):boolean");
    }
}
