package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;
import com.instagram.rtc.analytics.RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.7VX  reason: invalid class name */
public final class AnonymousClass7VX implements AnonymousClass7VY, AnonymousClass7VZ {
    public boolean A00;
    public final AnonymousClass4DH A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C332437Va A04 = new C332437Va(new AnonymousClass9LQ(this, 4));
    public final AnonymousClass7VW A05;
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(new C377109Ko(this, 27));
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(new C377109Ko(this, 28));
    public final AnonymousClass0eM A08 = AnonymousClass0eN.A01(new C377109Ko(this, 29));
    public final AnonymousClass0eK A09;

    public AnonymousClass7VX(AnonymousClass4DH r4, AnonymousClass0iw r5, UserSession userSession, AnonymousClass7VW r7, AnonymousClass0eK r8) {
        0qQ.A0B(r4, 2);
        0qQ.A0B(r5, 3);
        0qQ.A0B(r7, 4);
        this.A03 = userSession;
        this.A01 = r4;
        this.A02 = r5;
        this.A05 = r7;
        this.A09 = r8;
    }

    public final void A01(C69465Nm9 nm9, C331537Rj r22, RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments, boolean z) {
        Integer num;
        C69474NmI nmI;
        C331537Rj r15 = r22;
        0qQ.A0B(r15, 0);
        AnonymousClass4DH r5 = this.A01;
        Context context = r5.getContext();
        if (context != null) {
            UserSession userSession = this.A03;
            OW2 ow2 = new OW2(userSession, context);
            if (ow2.A01()) {
                ow2.A00();
                return;
            }
            Context requireContext = r5.requireContext();
            AnonymousClass0eM r2 = this.A08;
            RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId A002 = C71096OcW.A00(requireContext, userSession, (C331527Ri) r2.getValue(), r15);
            AnonymousClass7S7 C6l = A00(this).C6l();
            if (!C70104NxK.A00(r5.requireActivity(), r5.requireContext(), r5, userSession, C6l)) {
                C69465Nm9 nm92 = nm9;
                C71096OcW.A02(requireContext, nm92, userSession, (C331527Ri) r2.getValue(), r15);
                AnonymousClass72B.A00(userSession);
                C3018760k A012 = C3018660j.A01(userSession);
                boolean z2 = z;
                if (z) {
                    nmI = C69474NmI.VIDEO;
                } else {
                    nmI = C69474NmI.AUDIO;
                }
                A012.A0F(nmI);
                boolean CUO = A00(this).C6l().CUO();
                List<User> BRZ = ((C331527Ri) r2.getValue()).BRZ();
                ArrayList arrayList = new ArrayList();
                for (User user : BRZ) {
                    if (user.CXO()) {
                        String A072 = AnonymousClass50n.A07(user);
                        0qQ.A07(A072);
                        arrayList.add(A072);
                    }
                }
                RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments2 = rtcStartCoWatchPlaybackArguments;
                C41256Aqs aqs = new C41256Aqs(requireContext, nm92, this, A002, r15, rtcStartCoWatchPlaybackArguments2, z2);
                if (A00(this).AH1(C376179Gx.RTC_VIDEO_CALL)) {
                    AnonymousClass0eM r8 = this.A06;
                    C41074Anw anw = null;
                    if (!new 1Cn(((C66649MaI) r8.getValue()).A00).A07(false)) {
                        C358248ab r1 = new C358248ab(requireContext);
                        r1.A09(2131976556);
                        r1.A08(2131976555);
                        r1.A06();
                        AnonymousClass0fN.A00(r1.A02());
                        num = AnonymousClass05K.A00;
                    } else if (A00(this).C6l().CdE()) {
                        String C6C = A00(this).C6l().C6C();
                        C332437Va r12 = this.A04;
                        if (C6C != null) {
                            r12.A03 = true;
                            if (!arrayList.isEmpty() && (A00(this).C6l().CVr() || 182.A06(0Tu.A05, userSession, 36313592005593254L))) {
                                if (182.A06(0Tu.A05, userSession, 36315889812901528L)) {
                                    anw = new C41074Anw(this, A002);
                                }
                                FV5.A00(requireContext, userSession, anw, aqs, arrayList);
                                return;
                            } else if (((C66649MaI) r8.getValue()).A0D(CUO)) {
                                User user2 = (User) A00(this).C6l().BRZ().get(0);
                                C41075Anx anx = new C41075Anx(this, user2);
                                0qQ.A0A(user2);
                                0qQ.A0B(user2, 2);
                                if (!user2.A29()) {
                                    C358248ab r23 = new C358248ab(requireContext);
                                    r23.A05 = requireContext.getString(2131976602);
                                    r23.A0q(requireContext.getString(2131976601, new Object[]{user2.getUsername()}));
                                    r23.A0E(C39952AKs.A00);
                                    r23.A0G(new AKH(anx), 2131976603);
                                    AnonymousClass0fN.A00(r23.A02());
                                    return;
                                }
                                1OC A003 = C64028LJp.A00(userSession);
                                A003.A00 = new EBH(requireContext, userSession, aqs);
                                1ES.A03(A003);
                                return;
                            } else {
                                if (!C48882Eli.A00(userSession).A00(r5, aqs, A00(this).C6l().C6C(), BRZ, CUO)) {
                                    aqs.run();
                                    return;
                                }
                                return;
                            }
                        } else {
                            r12.A00 = r15;
                            r12.A02 = Boolean.valueOf(z2);
                            r12.A01 = rtcStartCoWatchPlaybackArguments2;
                            r12.A03 = false;
                            ((OZR) this.A07.getValue()).A02(A00(this).C6l().C6O());
                            return;
                        }
                    } else {
                        C71096OcW.A03(userSession, A002, AnonymousClass05K.A01);
                        String format = String.format("mThread is null for thread id: %s. Entry point: %s", Arrays.copyOf(new Object[]{A00(this).C6l().C6C(), r15}, 2));
                        0qQ.A07(format);
                        0wb.A03("Unable to start video call", format);
                        return;
                    }
                } else {
                    num = AnonymousClass05K.A0C;
                }
            } else {
                num = AnonymousClass05K.A0N;
            }
            C71096OcW.A03(userSession, A002, num);
        }
    }

    public final void CNJ(C69465Nm9 nm9, C331537Rj r11, boolean z, boolean z2) {
        0qQ.A0B(r11, 0);
        UserSession userSession = this.A03;
        AnonymousClass4DH r2 = this.A01;
        if (!C66653MaM.A00(r2.requireContext(), userSession).A0C((C331527Ri) this.A08.getValue())) {
            return;
        }
        if (z2) {
            Context requireContext = r2.requireContext();
            AKG akg = new AKG(new C41218AqG(nm9, this, r11, z));
            C39951AKr aKr = C39951AKr.A00;
            int i = 2131976585;
            if (z) {
                i = 2131976594;
            }
            String string = requireContext.getString(i);
            0qQ.A0A(string);
            int i2 = 2131976584;
            if (z) {
                i2 = 2131976593;
            }
            String string2 = requireContext.getString(i2);
            0qQ.A0A(string2);
            C358248ab r0 = new C358248ab(requireContext);
            r0.A05 = string;
            r0.A0c(akg, string2);
            r0.A0C(aKr);
            r0.A04();
            r0.A0B((DialogInterface.OnCancelListener) null);
            AnonymousClass0fN.A00(r0.A02());
            0xa r1 = 1Au.A00(userSession).A01;
            String A002 = C66579MXk.A00(797);
            int i3 = r1.getInt(A002, 0);
            0xY AR4 = r1.AR4();
            AR4.E5Z(A002, i3 + 1);
            AR4.apply();
            return;
        }
        A01(nm9, r11, (RtcStartCoWatchPlaybackArguments) null, z);
    }

    public static final C333517Zg A00(AnonymousClass7VX r0) {
        Object obj = r0.A09.get();
        0qQ.A07(obj);
        return (C333517Zg) obj;
    }

    public final void DMg(String str, boolean z) {
        C70320O1y.A00(this.A03).A03(AnonymousClass05K.A0N);
        A01((C69465Nm9) null, C331537Rj.DIRECT_ACTION_LOG, (RtcStartCoWatchPlaybackArguments) null, !z);
    }
}
