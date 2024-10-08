package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.android.R;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* renamed from: X.7JF  reason: invalid class name */
public final class AnonymousClass7JF implements AnonymousClass7JG {
    public final /* synthetic */ C329067Hl A00;

    public AnonymousClass7JF(C329067Hl r1) {
        this.A00 = r1;
    }

    public final void Dzl(int i) {
        String str;
        0LA.A05(AnonymousClass0LO.A0G, String.valueOf(true));
        int nextInt = new Random().nextInt();
        C329067Hl r2 = this.A00;
        Integer valueOf = Integer.valueOf(nextInt);
        r2.A0w = valueOf;
        C254923tH A002 = AnonymousClass4KK.A00(r2.A1z);
        2Nl A003 = 2Nk.A00(r2.A1Z);
        long j = (long) i;
        if (A002 != null) {
            str = A002.A00;
        } else {
            str = "";
        }
        0qQ.A0B(str, 1);
        29E r3 = A003.A04;
        long A04 = r3.A04(valueOf, (String) null, 17641276, j * 2);
        A003.A03 = A04;
        r3.A0B(A04, TraceFieldType.TransportType, str, false);
    }

    public final void Dzm(Exception exc) {
        String str;
        0LA.A04(AnonymousClass0LO.A0G);
        C329067Hl r3 = this.A00;
        2Nl A002 = 2Nk.A00(r3.A1Z);
        if (exc.getMessage() != null) {
            str = exc.getMessage();
        } else {
            str = "";
        }
        0qQ.A0B(str, 0);
        A002.A03 = A002.A04.A07(str, "", 17641276, A002.A03);
        r3.A0w = null;
        C329307Ij r1 = r3.A0b;
        C329307Ij.A00(r1, r1.A0Y.A00);
    }

    public final void Dzn(boolean z, int i) {
        long A02;
        0LA.A04(AnonymousClass0LO.A0G);
        C329067Hl r4 = this.A00;
        if (r4.A0w != null) {
            2Nl A002 = 2Nk.A00(r4.A1Z);
            if (z) {
                A02 = A002.A04.A06(CancelReason.USER_CANCELLED, "User discarded the voice message", 17641276, A002.A03);
            } else {
                A02 = A002.A04.A02(17641276, A002.A03);
            }
            A002.A03 = A02;
            r4.A0w = null;
        }
        C331697Sa r5 = r4.A1i;
        if (z) {
            AnonymousClass9H7 r3 = r5.A00;
            0xI A003 = 0xI.A00(r3.A1Q, "direct_composer_cancel_voice_message");
            A003.A0C("duration_ms", String.valueOf(i));
            C60510iO.A00(r3.A10).EFq(A003);
        }
        AnonymousClass9H7.A01(r5.A00).ARf(true);
        C329307Ij r1 = r4.A0b;
        C329307Ij.A00(r1, r1.A0Y.A00);
    }

    public final void Dzo(boolean z) {
        String str;
        String str2;
        C329067Hl r3 = this.A00;
        2Nl A002 = 2Nk.A00(r3.A1Z);
        A002.A04.A0D("started_recording", A002.A03, (String) null, (String) null, (String) null, (String) null);
        AnonymousClass7IR r0 = r3.A1d;
        List A0I = C329067Hl.A0I(r3);
        C254783t2 r6 = r3.A1z;
        boolean A0x = C329067Hl.A0x(r3);
        boolean z2 = r3.A28;
        0qQ.A0B(r6, 1);
        0wc r2 = r0.A00;
        0Aj A003 = r2.A00(r2.A00, "direct_composer_tap_voice");
        if (A003.isSampled()) {
            A003.AAe("recipient_ids", A0I);
            if (z) {
                str2 = "long_click";
            } else {
                str2 = "click";
            }
            A003.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
            A003.AAJ("open_thread_id", AnonymousClass4KK.A02(r6));
            A003.A9F("occamadillo_thread_id", AnonymousClass4KK.A01(r6));
            A003.A7p("is_e2ee", Boolean.valueOf(AnonymousClass6W3.A07(r6)));
            A003.A7p("is_reply_flow", Boolean.valueOf(A0x));
            A003.A7p("is_bottom_sheet_thread", Boolean.valueOf(z2));
            A003.Cgf();
        }
        AnonymousClass9H7 r22 = r3.A1i.A00;
        C332157Tw r1 = AnonymousClass9H7.A01(r22).A0j;
        C331037Pg r02 = r1.A06;
        if (r02 != null) {
            if (r02.A0D()) {
                C331037Pg r03 = r1.A06;
                if (r03 != null) {
                    r03.A0C(true);
                }
            }
            C274644oo r12 = AnonymousClass9H7.A01(r22).A0A;
            if (r12 == null) {
                str = "messageListAdapterHolder";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            List singletonList = Collections.singletonList(61);
            0qQ.A07(singletonList);
            r12.E3i(singletonList);
            if (z) {
                C60510iO.A00(r22.A10).EFq(0xI.A00(r22.A1Q, "direct_composer_tap_voice_message"));
                AnonymousClass9H7.A01(r22).A0j.A0J.A00(false);
                AnonymousClass9H7.A01(r22).ARf(false);
            }
            C329307Ij r23 = r3.A0b;
            r23.A0S.setMaxLines(r3.A1R.getResources().getInteger(R.integer.direct_composer_hint_max_lines));
            return;
        }
        str = "audioPlayer";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Dzp() {
        2Nl A002 = 2Nk.A00(this.A00.A1Z);
        A002.A04.A0D("stop_requested", A002.A03, (String) null, (String) null, (String) null, (String) null);
    }

    public final void Dzq() {
        2Nl A002 = 2Nk.A00(this.A00.A1Z);
        A002.A04.A0D("stopped_recording", A002.A03, (String) null, (String) null, (String) null, (String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EN6(X.C63822L8d r19, java.lang.String r20) {
        /*
            r18 = this;
            r0 = r18
            X.7Hl r1 = r0.A00
            X.2Er r0 = r1.A0W
            r7 = 0
            if (r0 == 0) goto L_0x009e
            int r0 = r0.C6a()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
        L_0x0011:
            X.7Kg r2 = r1.A0c
            if (r2 == 0) goto L_0x009c
            X.OHv r0 = r2.A09
            if (r0 == 0) goto L_0x009c
            boolean r0 = r2.A02()
            if (r0 == 0) goto L_0x009c
            X.OHv r2 = r2.A09
            boolean r0 = r2.A08
            if (r0 != 0) goto L_0x009c
            X.OBo r0 = r2.A02
            X.3tI r14 = r0.A01
        L_0x0029:
            java.lang.String r11 = X.HZX.A00()
            com.meta.foa.performancelogging.lss.LocalSendSpeedMessageTypes r0 = com.meta.foa.performancelogging.lss.LocalSendSpeedMessageTypes.AUDIO
            X.C329067Hl.A0O(r14, r1, r0, r10, r11)
            X.7UH r4 = r1.A1n
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            java.lang.Integer r3 = X.AnonymousClass05K.A1F
            X.3tH r5 = X.C329067Hl.A05(r1, r3)
            X.2Er r0 = r1.A0W
            if (r0 == 0) goto L_0x0048
            boolean r0 = r0.CUG()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
        L_0x0048:
            java.util.HashMap r12 = X.C329067Hl.A0H(r1)
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            X.0eK r0 = r1.A24
            java.lang.Object r2 = r0.get()
            java.lang.String r0 = "ephemeral_lifetime_ms"
            r13.put(r0, r2)
            X.3t2 r6 = r1.A1z
            com.instagram.common.session.UserSession r2 = r1.A1Z
            com.instagram.model.direct.DirectThreadKey r0 = X.C329067Hl.A09(r1)
            boolean r0 = X.AnonymousClass796.A07(r2, r0, r3)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            r4.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.7Sa r0 = r1.A1i
            X.9H7 r3 = r0.A00
            X.7TI r2 = X.AnonymousClass9H7.A01(r3)
            java.lang.String r0 = "DirectThreadFragment.sendVoiceMessage"
            boolean r0 = r2.A0X(r11, r0)
            if (r0 == 0) goto L_0x0097
            X.7TI r0 = X.AnonymousClass9H7.A01(r3)
            X.7L9 r13 = r0.A0K()
            X.PmW r12 = new X.PmW
            r15 = r19
            r17 = r20
            r16 = r11
            r12.<init>(r13, r14, r15, r16, r17)
            java.lang.String r0 = "sendVoiceRecording"
            X.AnonymousClass7L9.A00(r13, r0, r12)
        L_0x0097:
            r0 = 1
            X.C329067Hl.A0j(r1, r0)
            return
        L_0x009c:
            r14 = r7
            goto L_0x0029
        L_0x009e:
            r10 = r7
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7JF.EN6(X.L8d, java.lang.String):void");
    }
}
