package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.2sD  reason: invalid class name */
public final class AnonymousClass2sD extends C231632rz {
    public AnonymousClass2xS A00;
    public C229802oH A01;
    public final Context A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final C230212pD A05;
    public final C228102kn A06;
    public final C230272pJ A07;
    public final AnonymousClass2sE A08;

    public AnonymousClass2sD(Context context, AnonymousClass0iw r3, UserSession userSession, C230212pD r5, C228102kn r6, C230272pJ r7) {
        0qQ.A0B(context, 1);
        0qQ.A0B(r6, 4);
        0qQ.A0B(r5, 5);
        0qQ.A0B(r7, 6);
        this.A02 = context;
        this.A04 = userSession;
        this.A03 = r3;
        this.A06 = r6;
        this.A05 = r5;
        this.A07 = r7;
        this.A08 = new AnonymousClass2sE(context);
    }

    public final String getBinderGroupName() {
        return "ReelNetego";
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        return ((AnonymousClass5GH) obj).A00.getId().hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final int getViewTypeCount() {
        return 3;
    }

    public final void onViewAttachedToWindow(View view, int i, Object obj, Object obj2) {
        0qQ.A0B(view, 0);
        0qQ.A0B(obj, 2);
        AnonymousClass5GH r8 = (AnonymousClass5GH) obj;
        C254063rs r2 = (C254063rs) view.getTag();
        if (r2 != null) {
            Context context = this.A02;
            UserSession userSession = this.A04;
            C228102kn r1 = this.A06;
            C230212pD r7 = this.A05;
            C2365934i r6 = r2.A08.A0A;
            if (r6 != null) {
                C293285kT r0 = r2.A0A;
                if (r0 != null) {
                    r1.A0G(r0);
                }
                if (C293275kS.A01(r1, r8)) {
                    C293285kT r3 = new C293285kT(context, userSession, r6, r7, r8);
                    r2.A0A = r3;
                    r1.A0F(r3);
                }
            }
        }
    }

    public final void onViewDetachedFromWindow(View view, int i, Object obj, Object obj2) {
        0qQ.A0B(view, 0);
        0qQ.A0B(obj, 2);
        C254063rs r0 = (C254063rs) view.getTag();
        if (r0 != null) {
            C228102kn r1 = this.A06;
            C293285kT r02 = r0.A0A;
            if (r02 != null) {
                r1.A0G(r02);
            }
        }
        C230212pD.A03(this.A05);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004b, code lost:
        if (((java.lang.Boolean) r3.A1E.CDM(r3, X.0tS.A4G[129(0x81, float:1.81E-43)])).booleanValue() != false) goto L_0x004d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x04db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r39, android.view.View r40, java.lang.Object r41, java.lang.Object r42) {
        /*
            r38 = this;
            r6 = r42
            r10 = r41
            r0 = -1751599142(0xffffffff9798b7da, float:-9.86918E-25)
            int r23 = X.AnonymousClass0fD.A03(r0)
            r1 = 1
            r37 = r40
            r0 = r37
            X.0qQ.A0B(r0, r1)
            r0 = 2
            X.0qQ.A0B(r10, r0)
            r0 = 3
            X.0qQ.A0B(r6, r0)
            X.5GH r10 = (X.AnonymousClass5GH) r10
            X.5GJ r6 = (X.AnonymousClass5GJ) r6
            boolean r0 = r6.A0A
            r7 = r38
            if (r0 == 0) goto L_0x002f
            boolean r0 = r6.A07
            if (r0 != 0) goto L_0x002f
            boolean r0 = r6.A08
            r3 = 0
            if (r0 != 0) goto L_0x029f
            r1 = 0
        L_0x002f:
            r5 = 0
            if (r1 != 0) goto L_0x004d
            X.0xi r0 = X.0tS.A4E
            X.0tS r3 = r0.A00()
            X.0s0 r2 = r3.A1E
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 129(0x81, float:1.81E-43)
            r0 = r1[r0]
            java.lang.Object r0 = r2.CDM(r3, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x004e
        L_0x004d:
            r1 = 1
        L_0x004e:
            r6.A08 = r1
            r16 = 1
            r0 = r16
            X.0qQ.A0B(r10, r0)
            java.lang.Object r4 = r37.getTag()
            if (r4 == 0) goto L_0x04de
            X.3rs r4 = (X.C254063rs) r4
            if (r1 == 0) goto L_0x0301
            r4.A01(r5)
            com.instagram.common.session.UserSession r3 = r7.A04
            android.content.Context r13 = r7.A02
            X.0iw r0 = r7.A03
            r19 = r0
            X.2kn r11 = r7.A06
            X.2xS r1 = r7.A00
            X.2pD r9 = r7.A05
            X.2pJ r0 = r7.A07
            r18 = r0
            androidx.recyclerview.widget.RecyclerView r8 = r4.A08
            X.3pI r0 = r8.A0D
            r24 = r0
            r24.getClass()
            r0 = r24
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            r24 = r0
            android.os.Parcelable r2 = r6.A05
            r0.A1P(r2)
            X.3pI r2 = r8.A0D
            android.os.Parcelable r0 = r6.A05
            r2.A1P(r0)
            X.2Rw r12 = r8.A0A
            r12.getClass()
            X.34h r12 = (X.C2365834h) r12
            java.util.List r2 = r10.A04
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r12.Ei9(r0, r5, r3)
            java.lang.String r0 = r10.A02
            r12.A09 = r0
            java.lang.Integer r0 = r10.A08
            r22 = r0
            r12.A07 = r0
            X.5kP r0 = r10.A01
            r12.A05 = r0
            X.4qK r2 = r10.A00
            r12.A01 = r2
            r12.A02 = r9
            boolean r0 = r4 instanceof X.C293255kQ
            if (r0 == 0) goto L_0x027e
            if (r1 == 0) goto L_0x027e
            X.3W1 r0 = r6.A09
            r17 = r0
            r15 = r4
            X.5kQ r15 = (X.C293255kQ) r15
            X.Vgq r14 = new X.Vgq
            r14.<init>(r9, r4, r10)
            X.5qj r0 = new X.5qj
            r25 = r0
            r26 = r3
            r27 = r17
            r28 = r1
            r29 = r14
            r30 = r15
            r31 = r18
            r25.<init>(r26, r27, r28, r29, r30, r31)
            r12.A04 = r0
        L_0x00dd:
            X.5kR r0 = new X.5kR
            r0.<init>(r11, r10)
            r12.A03 = r0
            X.5kT r0 = r4.A0A
            if (r0 == 0) goto L_0x00eb
            r11.A0G(r0)
        L_0x00eb:
            boolean r0 = X.C293275kS.A01(r11, r10)
            if (r0 == 0) goto L_0x0107
            X.5kT r0 = new X.5kT
            r26 = r13
            r27 = r3
            r28 = r12
            r29 = r9
            r30 = r10
            r25 = r0
            r25.<init>(r26, r27, r28, r29, r30)
            r4.A0A = r0
            r11.A0F(r0)
        L_0x0107:
            X.3jg r0 = r4.A07
            if (r0 == 0) goto L_0x010e
            r8.A16(r0)
        L_0x010e:
            boolean r0 = X.C293275kS.A01(r11, r10)
            if (r0 == 0) goto L_0x011e
            X.3Bk r0 = new X.3Bk
            r0.<init>(r3, r11)
            r4.A07 = r0
            r8.A15(r0)
        L_0x011e:
            java.lang.String r0 = r10.A02
            r17 = r0
            android.widget.TextView r1 = r4.A05
            r21 = 8
            android.graphics.RectF r0 = X.0nA.A01
            if (r1 == 0) goto L_0x012f
            r0 = r21
            r1.setVisibility(r0)
        L_0x012f:
            X.3oV r14 = r4.A0B
            android.view.View r1 = r14.getView()
            if (r1 == 0) goto L_0x013c
            r0 = r21
            r1.setVisibility(r0)
        L_0x013c:
            r20 = 1
            r0 = r16
            X.0qQ.A0B(r3, r0)
            android.widget.TextView r11 = r4.A06
            java.lang.String r0 = r10.A03
            if (r0 != 0) goto L_0x0150
            r0 = 2131974343(0x7f1358c7, float:1.9585747E38)
            java.lang.String r0 = r13.getString(r0)
        L_0x0150:
            r11.setText(r0)
            java.lang.Integer r16 = r10.A00()
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r0 = r16
            if (r0 == r1) goto L_0x0261
            X.0Tu r15 = X.0Tu.A05
            r0 = 36324286474039232(0x810cbf00012fc0, double:3.034963260119347E-306)
            boolean r0 = X.182.A06(r15, r3, r0)
            if (r0 != 0) goto L_0x0261
            X.5kP r0 = r10.A01
            if (r0 != 0) goto L_0x01df
            android.widget.TextView r1 = r4.A05
            if (r1 != 0) goto L_0x017c
            android.view.ViewStub r0 = r4.A01
            android.view.View r1 = r0.inflate()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r4.A05 = r1
        L_0x017c:
            com.instagram.common.session.UserSession r0 = r12.A0A
            X.3BN r0 = r12.A00(r0)
            X.3BO r0 = r0.A01
            X.3BP r0 = r0.A01
            int r14 = r0.A01
            X.5kP r0 = r10.A01
            r36 = 0
            if (r0 == 0) goto L_0x0190
            r36 = 1
        L_0x0190:
            r1.setVisibility(r5)
            X.WB6 r0 = new X.WB6
            r26 = r13
            r27 = r1
            r28 = r8
            r29 = r19
            r30 = r3
            r31 = r9
            r32 = r10
            r33 = r22
            r34 = r17
            r35 = r14
            r25 = r0
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            X.AnonymousClass0fU.A00(r0, r1)
            X.3kW r0 = X.AnonymousClass1Qz.A00(r3)
            X.1R7 r0 = r0.C82()
            r15 = 2130970132(0x7f040614, float:1.7548965E38)
            if (r14 <= 0) goto L_0x01c1
            r15 = 2130970277(0x7f0406a5, float:1.754926E38)
        L_0x01c1:
            int r14 = X.2Yu.A0H(r13, r15)
            java.lang.String r15 = "ig_story_data_banner"
            java.util.Set r0 = r0.A0C
            boolean r0 = r0.contains(r15)
            if (r0 == 0) goto L_0x025d
            com.instagram.api.schemas.RIXUCtaType r0 = com.instagram.api.schemas.RIXUCtaType.ZERO_BANNER
        L_0x01d1:
            android.text.SpannableStringBuilder r0 = X.C292995jr.A01(r13, r0, r14)
            r1.setText(r0)
            int r0 = r13.getColor(r14)
            r1.setTextColor(r0)
        L_0x01df:
            X.1Av r14 = X.1Au.A00(r3)
            X.0s0 r13 = r14.A50
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 263(0x107, float:3.69E-43)
            r0 = r1[r0]
            java.lang.Object r0 = r13.CDM(r14, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x020e
            X.0Tu r13 = X.0Tu.A05
            r0 = 36324286474760137(0x810cbf000c2fc9, double:3.03496326057525E-306)
            boolean r0 = X.182.A06(r13, r3, r0)
            if (r0 == 0) goto L_0x020e
            X.Fuq r13 = new X.Fuq
            r13.<init>(r11, r3, r14)
            r0 = 1000(0x3e8, double:4.94E-321)
            r11.postDelayed(r13, r0)
        L_0x020e:
            android.view.View r13 = r4.A00
            com.instagram.common.session.UserSession r0 = r12.A0A
            X.3BN r19 = r12.A00(r0)
            X.0qQ.A0B(r13, r5)
            X.1UQ r11 = r2.A01
            X.1UQ r0 = X.1UQ.A0Q
            r1 = 0
            if (r11 != r0) goto L_0x0221
            r1 = 1
        L_0x0221:
            if (r1 != 0) goto L_0x022f
            X.4qJ r0 = r2.A00
            java.lang.Boolean r0 = r0.A03
            if (r0 == 0) goto L_0x022f
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0358
        L_0x022f:
            X.Fc0 r14 = new X.Fc0
            r14.<init>(r9, r10)
            if (r1 == 0) goto L_0x02d1
            X.4qJ r0 = r2.A00
            java.util.List r0 = r0.A0C
            if (r0 == 0) goto L_0x02cb
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r11 = r0.iterator()
        L_0x0245:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x030d
            java.lang.Object r0 = r11.next()
            X.3HX r0 = (X.AnonymousClass3HX) r0
            com.instagram.user.model.User r0 = r0.A0a
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r0)
            if (r0 == 0) goto L_0x0245
            r1.add(r0)
            goto L_0x0245
        L_0x025d:
            com.instagram.api.schemas.RIXUCtaType r0 = com.instagram.api.schemas.RIXUCtaType.WATCH_ALL
            goto L_0x01d1
        L_0x0261:
            android.view.View r1 = r14.getView()
            r1.setVisibility(r5)
            X.5kU r0 = new X.5kU
            r26 = r1
            r27 = r3
            r28 = r6
            r29 = r9
            r30 = r10
            r25 = r0
            r25.<init>(r26, r27, r28, r29, r30)
            X.AnonymousClass0fU.A00(r0, r1)
            goto L_0x01df
        L_0x027e:
            boolean r0 = r4 instanceof X.C254053rr
            if (r0 == 0) goto L_0x00dd
            r15 = r4
            X.3rr r15 = (X.C254053rr) r15
            androidx.recyclerview.widget.RecyclerView r14 = r15.A08
            java.lang.Object r0 = r14.getTag()
            if (r0 == 0) goto L_0x0292
            X.3jg r0 = (X.C249403jg) r0
            r14.A16(r0)
        L_0x0292:
            X.UAw r0 = new X.UAw
            r0.<init>(r3, r6, r1, r15)
            r14.setTag(r0)
            r14.A15(r0)
            goto L_0x00dd
        L_0x029f:
            long r8 = java.lang.System.currentTimeMillis()
            com.instagram.common.session.UserSession r4 = r7.A04
            X.0qQ.A0B(r4, r3)
            java.lang.Class<X.Oy0> r2 = X.Oy0.class
            r1 = 19
            X.Pm7 r0 = new X.Pm7
            r0.<init>(r4, r1)
            java.lang.Object r0 = r4.A01(r2, r0)
            X.Oy0 r0 = (X.Oy0) r0
            long r0 = r0.A00
            long r8 = r8 - r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS
            r0 = 1
            long r1 = r2.toMillis(r0)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x02c7
            r3 = 1
        L_0x02c7:
            r1 = r3 ^ 1
            goto L_0x002f
        L_0x02cb:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            goto L_0x0312
        L_0x02d1:
            java.util.List r1 = r10.A04
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r11 = r0.iterator()
        L_0x02e1:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x030d
            java.lang.Object r0 = r11.next()
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            X.1Ns r0 = r0.A0W
            if (r0 == 0) goto L_0x02e1
            com.instagram.user.model.User r0 = r0.CCd()
            if (r0 == 0) goto L_0x02e1
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r0)
            if (r0 == 0) goto L_0x02e1
            r1.add(r0)
            goto L_0x02e1
        L_0x0301:
            r1 = 8
            r4.A01(r1)
            r0 = r37
            r0.setVisibility(r1)
            goto L_0x04c3
        L_0x030d:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r1)
        L_0x0312:
            com.instagram.common.session.UserSession r1 = r9.A04
            X.2lj r0 = r9.A0A
            java.lang.String r0 = r0.A0I
            X.Hzx r11 = new X.Hzx
            r11.<init>(r1, r14, r0)
            if (r22 == 0) goto L_0x04db
            int r1 = r22.intValue()
        L_0x0323:
            java.lang.String r30 = r2.getId()
            X.49S r14 = r11.A03
            java.lang.String r28 = "feed_engagement_unit"
            X.4DU r0 = r11.A01
            java.lang.String r29 = r0.getModuleName()
            X.GAN r0 = new X.GAN
            r26 = r13
            r27 = r14
            r25 = r0
            r25.<init>(r26, r27, r28, r29, r30)
            android.content.Context r14 = r13.getContext()
            com.instagram.common.session.UserSession r13 = r11.A00
            X.1Ua r13 = X.1UX.A00(r14, r13)
            X.0qQ.A07(r13)
            X.Hiv r15 = new X.Hiv
            r15.<init>(r13)
            X.49W r14 = r11.A02
            X.IcB r13 = new X.IcB
            r13.<init>(r2, r11, r12, r1)
            r14.A00(r15, r13, r0)
        L_0x0358:
            X.2pH r11 = r9.A07
            java.lang.String r1 = r2.getId()
            X.0qQ.A07(r1)
            java.lang.String r12 = r10.A02
            X.4qJ r10 = r2.A00
            java.lang.Boolean r0 = r10.A02
            if (r0 == 0) goto L_0x04d7
            boolean r18 = r0.booleanValue()
        L_0x036d:
            java.lang.Boolean r0 = r10.A03
            if (r0 == 0) goto L_0x04d3
            boolean r17 = r0.booleanValue()
        L_0x0375:
            X.3kK r14 = r9.A09
            X.2jx r13 = r9.A03
            java.lang.String r16 = X.C293305kV.A00(r16)
            r0 = 7
            X.0qQ.A0B(r14, r0)
            r0 = r21
            X.0qQ.A0B(r13, r0)
            java.util.Set r0 = r11.A06
            boolean r0 = r0.add(r1)
            if (r0 == 0) goto L_0x0421
            com.instagram.common.session.UserSession r0 = r11.A02
            X.0wc r9 = X.AnonymousClass0kN.A01(r13, r0)
            java.lang.String r1 = "instagram_story_tray_impression"
            X.0kJ r0 = r9.A00
            X.0Aj r9 = r9.A00(r0, r1)
            boolean r0 = r9.isSampled()
            if (r0 == 0) goto L_0x0421
            java.lang.String r1 = r11.A04
            java.lang.String r0 = "tray_session_id"
            r9.AAJ(r0, r1)
            if (r22 == 0) goto L_0x04d0
            int r0 = r22.intValue()
            long r0 = (long) r0
            r21 = r0
            java.lang.Long r1 = java.lang.Long.valueOf(r21)
        L_0x03b6:
            java.lang.String r0 = "client_position"
            r9.A9F(r0, r1)
            r0 = r19
            X.3BO r0 = r0.A01
            X.3BP r15 = r0.A01
            int r0 = r15.A01
            long r0 = (long) r0
            r21 = r0
            java.lang.Long r1 = java.lang.Long.valueOf(r21)
            java.lang.String r0 = "new_reel_count"
            r9.A9F(r0, r1)
            int r0 = r15.A03
            long r0 = (long) r0
            r21 = r0
            java.lang.Long r1 = java.lang.Long.valueOf(r21)
            java.lang.String r0 = "viewed_reel_count"
            r9.A9F(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r18)
            java.lang.String r0 = "hide_in_feed_unit_if_seen"
            r9.A7p(r0, r1)
            java.lang.String r0 = "filtering_tag"
            r9.AAJ(r0, r12)
            java.lang.String r1 = r13.getModuleName()
            java.lang.String r0 = "module_name"
            r9.AAJ(r0, r1)
            java.lang.String r1 = "type"
            r0 = r16
            r9.AAJ(r1, r0)
            java.lang.String r1 = X.AnonymousClass1K6.A00
            java.lang.String r0 = "canonical_nav_chain"
            r9.AAJ(r0, r1)
            java.lang.String r1 = X.C254473sX.A00
            java.lang.String r0 = "device_aspect_ratio_category"
            r9.AAJ(r0, r1)
            java.lang.String r1 = X.C254483sY.A00
            java.lang.String r0 = "device_fold_orientation"
            r9.AAJ(r0, r1)
            java.lang.String r1 = X.C254493sZ.A00
            java.lang.String r0 = "device_fold_state"
            r9.AAJ(r0, r1)
            java.lang.Boolean r1 = X.C254503sa.A00
            java.lang.String r0 = "device_is_in_multi_window_mode"
            r9.A7p(r0, r1)
            r9.Cgf()
        L_0x0421:
            if (r17 == 0) goto L_0x045a
            com.instagram.common.session.UserSession r9 = r11.A02
            X.0Tu r13 = X.0Tu.A05
            r0 = 2342173437490971260(0x208112550001427c, double:4.074428174762602E-152)
            boolean r0 = X.182.A06(r13, r9, r0)
            if (r0 != 0) goto L_0x045a
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            if (r12 == 0) goto L_0x043e
            java.lang.String r0 = "filtering_tag"
            r13.put(r0, r12)
        L_0x043e:
            java.lang.String r1 = r11.A04
            java.lang.String r0 = "tray_session_id"
            r13.put(r0, r1)
            X.2oI r1 = r11.A00
            if (r1 != 0) goto L_0x0457
            java.lang.String r1 = "feed_timeline"
            X.0xG r0 = new X.0xG
            r0.<init>(r1)
            X.2oI r1 = new X.2oI
            r1.<init>(r0, r9, r14)
            r11.A00 = r1
        L_0x0457:
            r1.A00(r2, r13, r5)
        L_0x045a:
            int r13 = r24.A1a()
            int r12 = r24.A1b()
            int r11 = r24.A1c()
            int r9 = r24.A1d()
            r14 = r3
            r15 = r4
            r16 = r13
            r17 = r12
            r18 = r11
            r19 = r9
            int r1 = X.C293275kS.A00(r14, r15, r16, r17, r18, r19)
            if (r1 < 0) goto L_0x04ce
            X.2Rw r0 = r8.A0A
            r0.getClass()
            X.34i r0 = (X.C2365934i) r0
            java.lang.Object r0 = r0.Bkf(r1)
            r0.getClass()
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            X.3uh r0 = r0.A09(r3)
            r0.getClass()
            X.1Xj r0 = r0.A0b
        L_0x0493:
            r6.A01 = r13
            r6.A04 = r12
            r6.A00 = r11
            r6.A03 = r9
            r6.A02 = r1
            r6.A06 = r0
            r4.A09 = r6
            r0 = r37
            r0.setVisibility(r5)
            r0 = r20
            r6.A07 = r0
            X.2oH r3 = r7.A01
            if (r3 == 0) goto L_0x04c3
            java.lang.Integer r0 = r10.A05
            if (r0 == 0) goto L_0x04cc
            java.lang.String r1 = r0.toString()
        L_0x04b6:
            java.lang.String r0 = "76"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x04c3
            r0 = r37
            r3.EBq(r0, r2)
        L_0x04c3:
            r1 = -621477560(0xffffffffdaf50148, float:-3.4481389E16)
            r0 = r23
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x04cc:
            r1 = 0
            goto L_0x04b6
        L_0x04ce:
            r0 = 0
            goto L_0x0493
        L_0x04d0:
            r1 = 0
            goto L_0x03b6
        L_0x04d3:
            r17 = 0
            goto L_0x0375
        L_0x04d7:
            r18 = 0
            goto L_0x036d
        L_0x04db:
            r1 = -1
            goto L_0x0323
        L_0x04de:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2sD.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r5, Object obj, Object obj2) {
        String str;
        AnonymousClass5GH r6 = (AnonymousClass5GH) obj;
        AnonymousClass5GJ r7 = (AnonymousClass5GJ) obj2;
        0qQ.A0B(r5, 0);
        0qQ.A0B(r6, 1);
        0qQ.A0B(r7, 2);
        if (r6.A00().intValue() != 1) {
            r5.A7U(2);
        } else {
            r5.A7U(0);
            C229802oH r3 = this.A01;
            if (r3 != null) {
                C275464qK r2 = r6.A00;
                Integer num = r2.A00.A05;
                if (num != null) {
                    str = num.toString();
                } else {
                    str = null;
                }
                if ("76".equals(str)) {
                    r3.A9R(r2, r7.A09);
                }
            }
        }
        this.A08.A00();
    }

    public final View createView(int i, ViewGroup viewGroup) {
        Integer num;
        C254063rs r10;
        LinearLayoutManager linearLayoutManager;
        String str;
        int A032 = AnonymousClass0fD.A03(55246085);
        ViewGroup viewGroup2 = viewGroup;
        0qQ.A0B(viewGroup2, 1);
        int i2 = i;
        if (i == 0) {
            num = AnonymousClass05K.A01;
        } else if (i2 == 1) {
            num = AnonymousClass05K.A0Y;
        } else if (i2 == 2) {
            num = AnonymousClass05K.A0C;
        } else {
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
            AnonymousClass0fD.A0A(-2141875356, A032);
            throw unsupportedOperationException;
        }
        Context context = this.A02;
        C230212pD r13 = this.A05;
        AnonymousClass2sE r8 = this.A08;
        UserSession userSession = this.A04;
        0qQ.A0C(r13, "null cannot be cast to non-null type com.instagram.common.analytics.intf.AnalyticsModule");
        View inflate = LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.stories_in_feed_tray, viewGroup2, false);
        0qQ.A0B(userSession, 1);
        0Tu r2 = 0Tu.A05;
        if ((182.A06(r2, userSession, 36324286473973695L) && 182.A06(r2, userSession, 36324286474891211L)) || (num == AnonymousClass05K.A0C && 182.A06(r2, userSession, 36325330151158649L))) {
            r10 = new C293255kQ(inflate);
        } else if (182.A06(r2, userSession, 36324286473973695L)) {
            r10 = new C254053rr(inflate, userSession);
        } else {
            r10 = new C254063rs(inflate);
        }
        inflate.setTag(r10);
        C230212pD r17 = r13;
        C2365834h r11 = new C2365834h(context, r13, userSession, (AnonymousClass34Y) null, (C2365534e) null, r17, num, false);
        r11.A06 = r8;
        RecyclerView recyclerView = r10.A08;
        recyclerView.setAdapter(r11);
        boolean A062 = 182.A06(r2, userSession, 36325330151158649L);
        0qQ.A0B(context, 0);
        recyclerView.A11(new AnonymousClass3B2(context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material)));
        if (A062) {
            linearLayoutManager = new LinearLayoutManager(context, 0, false);
        } else {
            linearLayoutManager = new LinearLayoutManager(context, 0, false);
        }
        linearLayoutManager.A0v(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        r10.A04.setBackgroundResource(2Yu.A0H(context, R.attr.igdsPrimaryBackground));
        AnonymousClass49M r15 = new AnonymousClass49M(context, r17, userSession, r11, num);
        if (num == AnonymousClass05K.A0C) {
            str = "highlights_in_feed_unit";
        } else {
            str = null;
        }
        new AnonymousClass49N(recyclerView, r13, userSession, r15, str);
        C254063rs r1 = (C254063rs) inflate.getTag();
        if (i == 0 || i2 == 2) {
            if (r1 != null) {
                RecyclerView recyclerView2 = r1.A08;
                0qQ.A06(recyclerView2);
                AnonymousClass3BD recycledViewPool = recyclerView2.getRecycledViewPool();
                0qQ.A07(recycledViewPool);
                2Rw r4 = recyclerView2.A0A;
                int i3 = 0;
                while (i3 < 3) {
                    if (r4 != null) {
                        C249703kE createViewHolder = r4.createViewHolder(recyclerView2, 3);
                        if (createViewHolder.isRecyclable()) {
                            recycledViewPool.A03(createViewHolder);
                        }
                        i3++;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        AnonymousClass0fD.A0A(1636396228, A032);
        return inflate;
    }
}
