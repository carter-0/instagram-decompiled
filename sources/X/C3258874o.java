package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.74o  reason: invalid class name and case insensitive filesystem */
public final class C3258874o implements AnonymousClass7D2, AnonymousClass7JQ {
    public AccessibilityManager A00;
    public final UserSession A01;
    public final AnonymousClass7XR A02;
    public final AnonymousClass7DZ A03;
    public final C331037Pg A04;
    public final AnonymousClass7GP A05;
    public final AnonymousClass4kA A06;
    public final C331327Ql A07;
    public final boolean A08;
    public final boolean A09;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.direct_voice_message, viewGroup, false);
        0qQ.A0A(inflate);
        C66680Man man = new C66680Man(inflate, new C70460O7l(this));
        this.A03.A00(man);
        if (this.A00 == null) {
            Object systemService = man.A08.getContext().getSystemService("accessibility");
            0qQ.A0C(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            this.A00 = (AccessibilityManager) systemService;
        }
        return man;
    }

    public static final void A00(C3258874o r4) {
        int i;
        C331037Pg r0 = r4.A04;
        if (r0 != null) {
            i = r0.A02() / IgNetworkConsentStorage.MAX_ENTRIES;
        } else {
            i = 0;
        }
        C331327Ql r42 = r4.A07;
        String valueOf = String.valueOf(i);
        AnonymousClass0eM r1 = r42.A00;
        ((C13842TiH) r1.getValue()).A6k("vmplayback_duration", valueOf);
        r42.A00("vmplayback_fail");
        ((C13842TiH) r1.getValue()).A6l();
    }

    public static final void A01(C3258874o r4) {
        int i;
        C331037Pg r0 = r4.A04;
        if (r0 != null) {
            i = r0.A02() / IgNetworkConsentStorage.MAX_ENTRIES;
        } else {
            i = 0;
        }
        C331327Ql r42 = r4.A07;
        String valueOf = String.valueOf(i);
        AnonymousClass0eM r1 = r42.A00;
        ((C13842TiH) r1.getValue()).A6k("vmplayback_duration", valueOf);
        r42.A00("vmplayback_success");
        ((C13842TiH) r1.getValue()).A6l();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014a, code lost:
        if (r20 != false) goto L_0x014c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0244  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C3258874o r31, X.C66680Man r32, X.C328657Fq r33) {
        /*
            r5 = r33
            com.instagram.model.direct.messageid.DirectMessageIdentifier r4 = r5.A07
            java.lang.String r2 = r4.A00
            r7 = r31
            if (r2 == 0) goto L_0x0017
            X.7XR r1 = r7.A02
            X.7TJ r1 = (X.AnonymousClass7TJ) r1
            X.7FU r0 = r5.A00
            boolean r0 = r0.CU2()
            r1.CjC(r2, r0)
        L_0x0017:
            X.7Pg r3 = r7.A04
            r2 = 0
            if (r3 == 0) goto L_0x0104
            boolean r10 = r3.A0E(r4)
        L_0x0020:
            X.4kA r0 = r7.A06
            float r0 = r0.A01()
            X.Mco r22 = X.C66803Mcp.A00(r0)
            boolean r0 = A04(r7, r5)
            if (r0 == 0) goto L_0x00fc
            X.Pgh r6 = new X.Pgh
            r6.<init>(r7)
            X.PgR r0 = new X.PgR
            r0.<init>(r7)
            X.0eP r1 = new X.0eP
            r1.<init>(r6, r0)
        L_0x003f:
            java.lang.Object r0 = r1.A00
            r21 = r0
            java.lang.Object r1 = r1.A01
            X.0Ya r1 = (X.C59520Ya) r1
            if (r3 == 0) goto L_0x00f9
            r9 = 1065353216(0x3f800000, float:1.0)
            X.7GO r0 = r3.A0B
            java.lang.Object r6 = r0.A01(r4)
            X.XTr r6 = (X.C21297XTr) r6
            if (r6 == 0) goto L_0x005c
            int r0 = r6.A00
            float r9 = (float) r0
            int r0 = r6.A01
            float r0 = (float) r0
            float r9 = r9 / r0
        L_0x005c:
            boolean r0 = r7.A09
            r20 = r0
            X.Mcq r19 = new X.Mcq
            r0 = r19
            r0.<init>(r7)
            X.0sP r1 = (X.0sP) r1
            r6 = r32
            r6.A05 = r5
            if (r1 == 0) goto L_0x0071
            r6.A06 = r1
        L_0x0071:
            r8 = 0
            int r0 = java.lang.Float.compare(r9, r8)
            r1 = 1
            if (r0 != 0) goto L_0x007f
            int r0 = r5.A01
            if (r0 <= 0) goto L_0x007f
            r9 = 1065353216(0x3f800000, float:1.0)
        L_0x007f:
            com.facebook.xapp.messaging.audio.waveforms.VoiceVisualizer r0 = r6.A09
            r33 = r0
            int r0 = java.lang.Float.compare(r9, r8)
            if (r0 != 0) goto L_0x00f7
            int r0 = r5.A01
            if (r0 != 0) goto L_0x00f7
            if (r10 != 0) goto L_0x00f7
        L_0x008f:
            r0 = r33
            r0.A08 = r1
            java.util.List r15 = r5.A0F
            if (r15 == 0) goto L_0x009d
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x00ad
        L_0x009d:
            int r0 = r5.A00
            int r1 = r0 / 100
            java.util.List r15 = com.facebook.xapp.messaging.audio.waveforms.VoiceVisualizer.A0M
            int r0 = r15.size()
            if (r1 > r0) goto L_0x00ad
            java.util.List r15 = r15.subList(r2, r1)
        L_0x00ad:
            X.0qQ.A0B(r15, r2)
            int r0 = r15.size()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            boolean r0 = r15.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0133
            java.lang.Object r0 = r15.get(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            double r13 = (double) r0
            java.lang.Object r0 = r15.get(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            double r11 = (double) r0
            java.util.Iterator r17 = r15.iterator()
        L_0x00db:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0107
            java.lang.Object r0 = r17.next()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            double r0 = (double) r0
            int r16 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r16 >= 0) goto L_0x00f1
            r11 = r0
        L_0x00f1:
            int r16 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r16 <= 0) goto L_0x00db
            r13 = r0
            goto L_0x00db
        L_0x00f7:
            r1 = 0
            goto L_0x008f
        L_0x00f9:
            r9 = 0
            goto L_0x005c
        L_0x00fc:
            r0 = 0
            X.0eP r1 = new X.0eP
            r1.<init>(r0, r0)
            goto L_0x003f
        L_0x0104:
            r10 = 0
            goto L_0x0020
        L_0x0107:
            java.util.Iterator r16 = r15.iterator()
        L_0x010b:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0133
            java.lang.Object r0 = r16.next()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            double r0 = (double) r0
            r29 = 0
            r31 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r27 = r13
            r23 = r0
            r25 = r11
            double r0 = X.AnonymousClass37Q.A04(r23, r25, r27, r29, r31)
            float r15 = (float) r0
            java.lang.Float r0 = java.lang.Float.valueOf(r15)
            r8.add(r0)
            goto L_0x010b
        L_0x0133:
            r0 = r33
            r0.A04(r8, r9)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r6.A0A
            r24 = r0
            r0.setVisibility(r2)
            X.7FU r0 = r5.A00
            boolean r17 = r0.CU2()
            r18 = 1
            if (r17 == 0) goto L_0x014c
            r8 = 1
            if (r20 == 0) goto L_0x014d
        L_0x014c:
            r8 = 0
        L_0x014d:
            X.7FE r15 = r5.A04
            int r0 = r5.A00
            r23 = r0
            float r1 = (float) r0
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r0
            int r0 = X.AnonymousClass1GB.A01(r1)
            int r13 = r0 / 60
            int r12 = r0 % 60
            r14 = 2
            android.widget.FrameLayout r0 = r6.A08
            r20 = r0
            android.content.Context r9 = r20.getContext()
            if (r13 <= 0) goto L_0x031c
            if (r12 <= 0) goto L_0x030e
            r11 = 2131960593(0x7f132311, float:1.955786E38)
            java.lang.String r1 = r5.A0D
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r13, r0}
        L_0x017d:
            java.lang.String r16 = r9.getString(r11, r1)
            X.0qQ.A0A(r16)
            boolean r13 = r15.A06
            X.7L2 r1 = r15.A03
            if (r13 == 0) goto L_0x0308
            int r12 = X.AnonymousClass7FB.A00(r1, r8)
        L_0x018e:
            if (r8 != 0) goto L_0x02fa
            int r0 = r5.A01
            if (r0 != 0) goto L_0x02fa
            X.0eM r0 = r6.A0D
            java.lang.Object r11 = r0.getValue()
            android.graphics.drawable.Drawable r11 = (android.graphics.drawable.Drawable) r11
            boolean r0 = r15.A07
            X.C3265577g.A07(r11, r15, r2, r13, r0)
            r15 = r13 ^ 1
        L_0x01a3:
            X.7Kz r0 = X.AnonymousClass7FB.A04(r1, r8)
            X.7L1 r13 = r1.A02
            if (r15 != 0) goto L_0x02f6
            int[] r0 = new int[]{r12}
        L_0x01af:
            r1 = 2131231654(0x7f0803a6, float:1.8079395E38)
            android.graphics.drawable.Drawable r1 = r13.A00(r0, r1)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            r6.A03 = r1
            r1 = 2131231653(0x7f0803a5, float:1.8079393E38)
            android.graphics.drawable.Drawable r0 = r13.A00(r0, r1)
            android.graphics.drawable.Drawable r1 = r0.mutate()
            r6.A02 = r1
            if (r10 != 0) goto L_0x01cd
            android.graphics.drawable.Drawable r1 = r6.A03
        L_0x01cd:
            r0 = r24
            r0.setImageDrawable(r1)
            if (r10 == 0) goto L_0x01de
            r0 = r33
            r0.A09 = r10
            com.instagram.direct.messagethread.voice.VoiceMessageControlsView r1 = r6.A0C
            r0 = 0
            r1.A0E(r0, r10)
        L_0x01de:
            r0 = 2131100475(0x7f06033b, float:1.7813332E38)
            if (r8 == 0) goto L_0x01e6
            r0 = 2131100202(0x7f06022a, float:1.7812779E38)
        L_0x01e6:
            int r0 = r9.getColor(r0)
            r6.A01 = r12
            r6.A00 = r0
            r0 = r23
            long r0 = (long) r0
            com.instagram.direct.messagethread.voice.VoiceMessageControlsView r13 = r6.A0C
            r13.setTimerValueMs(r0)
            r8 = r20
            r8.setBackground(r11)
            r10 = r16
            r8.setContentDescription(r10)
            r8 = r33
            r8.setSegmentColor(r12)
            r8 = 2130970269(0x7f04069d, float:1.7549243E38)
            if (r17 == 0) goto L_0x020d
            r8 = 2130970259(0x7f040693, float:1.7549223E38)
        L_0x020d:
            int r8 = X.2Yu.A0H(r9, r8)
            int r17 = r9.getColor(r8)
            X.Mcs r11 = new X.Mcs
            r11.<init>(r12)
            r10 = 0
            if (r21 == 0) goto L_0x02f2
            X.N4D r10 = r5.A02
            if (r10 == 0) goto L_0x02ee
            java.lang.Object r8 = r10.A01
            java.lang.Number r8 = (java.lang.Number) r8
            if (r8 == 0) goto L_0x02ee
            int r15 = r8.intValue()
            r8 = 4
            if (r15 == r8) goto L_0x02ea
            if (r15 == r14) goto L_0x02ea
            r8 = r18
            if (r15 != r8) goto L_0x02ee
            X.NaS r24 = X.C68890NaS.A00
        L_0x0236:
            float r14 = X.0nH.A01(r12)
            r8 = 1062836634(0x3f59999a, float:0.85)
            int r14 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            r8 = 2130970279(0x7f0406a7, float:1.7549264E38)
            if (r14 <= 0) goto L_0x0247
            r8 = 2130970335(0x7f0406df, float:1.7549377E38)
        L_0x0247:
            int r8 = X.2Yu.A0H(r9, r8)
            int r28 = r9.getColor(r8)
            r14 = 15
            X.Inz r9 = new X.Inz
            r8 = r21
            r9.<init>(r14, r5, r6, r8)
            X.N3p r16 = new X.N3p
            r25 = r9
            r26 = r12
            r27 = r17
            r29 = r12
            r23 = r16
            r23.<init>(r24, r25, r26, r27, r28, r29)
            if (r10 == 0) goto L_0x026c
            r6.A01(r10, r4)
        L_0x026c:
            X.Mcr r14 = new X.Mcr
            r15 = r22
            r9 = r19
            r8 = r17
            r14.<init>((X.C66802Mco) r15, (X.C62320sa) r9, (int) r12, (int) r8)
            r12 = 30
            X.JwM r9 = new X.JwM
            r8 = r16
            r9.<init>((int) r12, (java.lang.Object) r14, (java.lang.Object) r11, (java.lang.Object) r8)
            r13.setupView(r9)
            java.lang.Object r8 = r9.A02
            X.3oV r11 = r6.A0B
            if (r8 == 0) goto L_0x02db
            android.view.View r9 = r11.getView()
            com.instagram.direct.messagethread.voice.transcription.VoiceMessageTranscriptionTextView r9 = (com.instagram.direct.messagethread.voice.transcription.VoiceMessageTranscriptionTextView) r9
            int r8 = r6.A01
            r9.setTranscribedMessageTextColor(r8)
            android.view.View r9 = r11.getView()
            com.instagram.direct.messagethread.voice.transcription.VoiceMessageTranscriptionTextView r9 = (com.instagram.direct.messagethread.voice.transcription.VoiceMessageTranscriptionTextView) r9
            int r8 = r6.A00
            r9.setContextMessageTextColor(r8)
            android.view.View r9 = r11.getView()
            com.instagram.direct.messagethread.voice.transcription.VoiceMessageTranscriptionTextView r9 = (com.instagram.direct.messagethread.voice.transcription.VoiceMessageTranscriptionTextView) r9
            if (r10 == 0) goto L_0x02e7
            X.Nou r8 = X.C66680Man.A00(r10, r6)
        L_0x02ab:
            r9.setStatus(r8)
        L_0x02ae:
            r13.setTimerValueMs(r0)
            if (r3 == 0) goto L_0x02d5
            r3.A09(r6, r4)
            X.Tol r0 = r3.A06
            if (r0 == 0) goto L_0x02d5
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x02d5
            X.OFQ r0 = r3.A02
            if (r0 == 0) goto L_0x02d5
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = r0.A01
            boolean r0 = r4.A02(r0)
            if (r0 == 0) goto L_0x02d5
            com.instagram.common.session.UserSession r0 = r7.A01
            X.5ju r0 = X.C293015jt.A00(r0)
            r0.A02(r2)
        L_0x02d5:
            X.7DZ r0 = r7.A03
            r0.A02(r6, r5)
            return
        L_0x02db:
            boolean r8 = r11.CVM()
            if (r8 == 0) goto L_0x02ae
            android.view.View r9 = r11.getView()
            com.instagram.direct.messagethread.voice.transcription.VoiceMessageTranscriptionTextView r9 = (com.instagram.direct.messagethread.voice.transcription.VoiceMessageTranscriptionTextView) r9
        L_0x02e7:
            X.NaV r8 = X.C68893NaV.A00
            goto L_0x02ab
        L_0x02ea:
            X.NaQ r24 = X.C68888NaQ.A00
            goto L_0x0236
        L_0x02ee:
            X.NaR r24 = X.C68889NaR.A00
            goto L_0x0236
        L_0x02f2:
            r16 = r10
            goto L_0x026c
        L_0x02f6:
            int[] r0 = r0.A0C
            goto L_0x01af
        L_0x02fa:
            X.0eM r0 = r6.A0D
            java.lang.Object r11 = r0.getValue()
            android.graphics.drawable.Drawable r11 = (android.graphics.drawable.Drawable) r11
            X.C3265577g.A07(r11, r15, r2, r13, r8)
            r15 = 0
            goto L_0x01a3
        L_0x0308:
            int r12 = X.AnonymousClass7FB.A01(r1, r8)
            goto L_0x018e
        L_0x030e:
            r11 = 2131960592(0x7f132310, float:1.9557857E38)
            java.lang.Object[] r1 = new java.lang.Object[r14]
            java.lang.String r0 = r5.A0D
            r1[r2] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            goto L_0x0329
        L_0x031c:
            r11 = 2131960594(0x7f132312, float:1.9557861E38)
            java.lang.Object[] r1 = new java.lang.Object[r14]
            java.lang.String r0 = r5.A0D
            r1[r2] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
        L_0x0329:
            r1[r18] = r0
            goto L_0x017d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3258874o.A02(X.74o, X.Man, X.7Fq):void");
    }

    public static final void A03(C3258874o r4, C66802Mco mco) {
        AnonymousClass4MM r0;
        C331037Pg r02 = r4.A04;
        if (r02 != null) {
            float f = mco.A00;
            C14044Tol tol = r02.A06;
            if (!(tol == null || (r0 = ((AnonymousClass4M1) tol.A06).A0K) == null)) {
                r0.A06(f);
            }
        }
        AnonymousClass4kA r42 = r4.A06;
        float f2 = mco.A00;
        r42.A0U.Epx(r42, Float.valueOf(f2), AnonymousClass4kA.A0c[24]);
    }

    public static final boolean A04(C3258874o r1, C328657Fq r2) {
        if (r2.A04.A06 || r1.A08 || r2.A07.A02 == null || r2.A0G || r2.A0I || !((AnonymousClass7X3) r1.A02).CdW()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void ADp(X.C328007Db r7, X.AnonymousClass7FW r8) {
        /*
            r6 = this;
            X.Man r7 = (X.C66680Man) r7
            X.7Fq r8 = (X.C328657Fq) r8
            r0 = 0
            X.0qQ.A0B(r7, r0)
            r1 = 1
            X.0qQ.A0B(r8, r1)
            java.lang.Long r0 = r8.A0A
            java.lang.String r3 = "Required value was null."
            if (r0 == 0) goto L_0x006b
            java.lang.String r2 = r8.A0C
            if (r2 == 0) goto L_0x0073
            java.lang.String r0 = "content://com.instagram.android.tam-attachment"
            X.0qQ.A0B(r0, r1)
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x006b
            com.instagram.common.session.UserSession r0 = r6.A01
            X.MYd r0 = X.AnonymousClass6FA.A00(r0)
            java.lang.String r0 = r0.A00(r2)
            if (r0 == 0) goto L_0x005c
            X.7Fq r5 = X.C70052NwU.A00(r8, r0)
        L_0x0031:
            com.instagram.common.session.UserSession r4 = r6.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325982986712510(0x810e4a000a35be, double:3.036036141565236E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x0058
            java.lang.String r2 = r8.A0C
            boolean r0 = X.C66834MdS.A08(r2)
            if (r0 == 0) goto L_0x0058
            X.0eM r0 = X.C71105Ocj.A05
            X.Ocj r1 = X.C69851NtF.A00(r4)
            if (r2 == 0) goto L_0x006d
            X.OsO r0 = new X.OsO
            r0.<init>(r6, r7, r8)
            r1.A03(r0, r2)
        L_0x0058:
            A02(r6, r7, r5)
            return
        L_0x005c:
            X.7XR r1 = r6.A02
            X.7Wn r1 = (X.C332827Wn) r1
            X.P9A r0 = new X.P9A
            r0.<init>(r6, r7, r8)
            X.OKi r0 = r1.CgK(r0, r2)
            r7.A04 = r0
        L_0x006b:
            r5 = r8
            goto L_0x0031
        L_0x006d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0073:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3258874o.ADp(X.7Db, X.7FW):void");
    }

    public final void Cwi(DirectMessageIdentifier directMessageIdentifier) {
        if (directMessageIdentifier != null) {
            A01(this);
            ((AnonymousClass7VB) this.A02).Cm9(directMessageIdentifier);
        }
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        C66680Man man = (C66680Man) r2;
        0qQ.A0B(man, 0);
        C331037Pg r0 = this.A04;
        if (r0 != null) {
            r0.A06(man);
        }
        C70762OKi oKi = man.A04;
        if (oKi != null) {
            oKi.A00();
        }
        man.A04 = null;
        man.A05 = null;
        this.A03.A01(man);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r3 != 0) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3258874o(com.instagram.common.session.UserSession r6, X.AnonymousClass7XR r7, X.AnonymousClass9HC r8, X.C331037Pg r9, boolean r10, boolean r11) {
        /*
            r5 = this;
            r5.<init>()
            r5.A02 = r7
            r5.A01 = r6
            r5.A04 = r9
            r5.A08 = r10
            r5.A09 = r11
            X.0Tu r2 = X.0Tu.A05
            r0 = 36607466552694347(0x820e4c0000164b, double:3.214047482135493E-306)
            long r3 = X.182.A01(r2, r6, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            if (r0 == 0) goto L_0x0025
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L_0x0026
        L_0x0025:
            r1 = 1
        L_0x0026:
            X.7Ql r0 = new X.7Ql
            r0.<init>(r1)
            r5.A07 = r0
            X.7GP r0 = new X.7GP
            r0.<init>(r6)
            r5.A05 = r0
            X.74p r2 = new X.74p
            r2.<init>(r5)
            r1 = r7
            X.7XN r1 = (X.AnonymousClass7XN) r1
            X.7DX r0 = new X.7DX
            r0.<init>(r1)
            X.77l r0 = X.C3259074q.A00(r0, r2, r7, r8)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r1)
            X.7DZ r0 = new X.7DZ
            r0.<init>(r1)
            r5.A03 = r0
            X.4kA r0 = X.AnonymousClass4k9.A00(r6)
            r5.A06 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3258874o.<init>(com.instagram.common.session.UserSession, X.7XR, X.9HC, X.7Pg, boolean, boolean):void");
    }
}
