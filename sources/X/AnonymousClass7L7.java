package X;

import android.content.Context;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.List;

/* renamed from: X.7L7  reason: invalid class name */
public final class AnonymousClass7L7 {
    public final 1a8 A00 = new 1a8(C318146oT.A01);
    public final UserSession A01;
    public final AnonymousClass7L5 A02;
    public final C333547Zj A03;
    public final C62320sa A04;
    public final C62320sa A05;
    public final C62320sa A06;
    public final C62320sa A07;
    public final C62320sa A08;
    public final OKL A09;

    public AnonymousClass7L7(UserSession userSession, AnonymousClass7L5 r4, OKL okl, C333547Zj r6, C62320sa r7, C62320sa r8, C62320sa r9, C62320sa r10, C62320sa r11) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r6, 2);
        0qQ.A0B(r8, 5);
        0qQ.A0B(r9, 6);
        0qQ.A0B(r10, 7);
        0qQ.A0B(r11, 8);
        this.A01 = userSession;
        this.A03 = r6;
        this.A02 = r4;
        this.A08 = r7;
        this.A07 = r8;
        this.A05 = r9;
        this.A04 = r10;
        this.A06 = r11;
        this.A09 = okl;
    }

    public final void A01(Context context, MessageIdentifier messageIdentifier, List list) {
        OCA oca;
        List list2 = list;
        0qQ.A0B(list, 0);
        MessageIdentifier messageIdentifier2 = messageIdentifier;
        0qQ.A0B(messageIdentifier, 1);
        0qQ.A0B(context, 2);
        C254743sy r4 = (C254743sy) this.A07.invoke();
        if (r4 != null) {
            C333547Zj r1 = this.A03;
            boolean booleanValue = ((Boolean) this.A04.invoke()).booleanValue();
            String A002 = this.A02.A00();
            OKL okl = this.A09;
            if (okl != null) {
                oca = okl.A00();
            } else {
                oca = null;
            }
            this.A00.A02(r1.ELy(oca, messageIdentifier2, r4, A002, list2, booleanValue), new PSI(context, this));
        }
    }

    public final void A04(C53401GnY gnY, String str, String str2, List list) {
        OCA oca;
        List list2 = list;
        0qQ.A0B(list, 0);
        String str3 = str;
        0qQ.A0B(str, 1);
        C254743sy r4 = (C254743sy) this.A07.invoke();
        if (r4 != null) {
            C333547Zj r1 = this.A03;
            boolean booleanValue = ((Boolean) this.A04.invoke()).booleanValue();
            String A002 = this.A02.A00();
            OKL okl = this.A09;
            if (okl != null) {
                oca = okl.A00();
            } else {
                oca = null;
            }
            this.A00.A02(r1.EM5(gnY, oca, r4, A002, str3, str2, list2, booleanValue), new PS6(this));
        }
    }

    public final 1aU A00(N49 n49, C70766OKm oKm, C254933tI r33, Integer num, Integer num2, Integer num3, Long l, String str, String str2, String str3, String str4, String str5, boolean z) {
        OCA oca;
        String str6 = str4;
        C333547Zj r4 = this.A03;
        C254783t2 r11 = (C254783t2) this.A08.invoke();
        List list = (List) this.A05.invoke();
        boolean booleanValue = ((Boolean) this.A04.invoke()).booleanValue();
        String str7 = str2;
        if (0qQ.A0K(str7, C66579MXk.A00(652))) {
            str6 = "ai_suggested_prompt_tray";
        } else if (0qQ.A0K(str7, "ai_bot_icebreaker")) {
            str6 = "ai_suggested_prompt_icebreaker";
        }
        OKL okl = this.A09;
        if (okl != null) {
            oca = okl.A00();
        } else {
            oca = null;
        }
        return r4.EMs(n49, oKm, r33, oca, (DirectShareTarget) null, 2FW.A1g, r11, (Integer) null, (Integer) null, num, num2, num3, l, str, NetInfoModule.CONNECTION_TYPE_NONE, str6, str7, (String) null, str3, str5, list, booleanValue, false, false, z);
    }

    public final void A02(C53401GnY gnY, C254933tI r21, ClipInfo clipInfo, String str, String str2, String str3, String str4, boolean z) {
        String str5 = str3;
        ClipInfo clipInfo2 = clipInfo;
        0qQ.A0B(clipInfo2, 0);
        C254743sy r10 = (C254743sy) this.A07.invoke();
        if (r10 != null) {
            OCA oca = null;
            C53401GnY gnY2 = gnY;
            C254933tI r8 = r21;
            String str6 = str;
            String str7 = str2;
            String str8 = str4;
            boolean z2 = z;
            if (182.A06(0Tu.A05, this.A01, 36324033071427270L)) {
                try {
                    C333547Zj r5 = this.A03;
                    List list = (List) this.A05.invoke();
                    if (str3 == null) {
                        str5 = this.A02.A00();
                    }
                    OKL okl = this.A09;
                    if (okl != null) {
                        oca = okl.A00();
                    }
                    r5.EN1((AnonymousClass9JH) null, gnY2, r8, oca, r10, clipInfo2, str6, str5, (String) null, str7, str8, list, z2);
                } catch (Exception e) {
                    0wb.A07("DirectSendController_sendVideoSync", e);
                    this.A06.invoke();
                }
            } else {
                C333547Zj r52 = this.A03;
                List list2 = (List) this.A05.invoke();
                if (str3 == null) {
                    str5 = this.A02.A00();
                }
                OKL okl2 = this.A09;
                if (okl2 != null) {
                    oca = okl2.A00();
                }
                R20.A01(new OrA(new C377089Km(this, 27)), r52.EMz((AnonymousClass9JH) null, gnY2, r8, oca, r10, clipInfo2, str6, str5, (String) null, str7, str8, list2, z2), C73442Pck.A00);
            }
        }
    }

    public final void A03(C53401GnY gnY, C254933tI r21, AnonymousClass3Q2 r22, C352218Cl r23, String str, String str2, String str3) {
        String str4 = str2;
        C254743sy r10 = (C254743sy) this.A07.invoke();
        if (r10 != null) {
            OCA oca = null;
            C53401GnY gnY2 = gnY;
            C254933tI r8 = r21;
            AnonymousClass3Q2 r11 = r22;
            C352218Cl r12 = r23;
            String str5 = str;
            String str6 = str3;
            if (182.A06(0Tu.A05, this.A01, 36324033071427270L)) {
                try {
                    C333547Zj r5 = this.A03;
                    List list = (List) this.A05.invoke();
                    boolean booleanValue = ((Boolean) this.A04.invoke()).booleanValue();
                    if (str2 == null) {
                        str4 = this.A02.A00();
                    }
                    OKL okl = this.A09;
                    if (okl != null) {
                        oca = okl.A00();
                    }
                    r5.EMJ((AnonymousClass9JH) null, gnY2, r8, oca, r10, r11, r12, str4, (String) null, str5, str6, list, booleanValue);
                } catch (Exception e) {
                    0wb.A07("DirectSendController_sendPhotoSync", e);
                    this.A06.invoke();
                }
            } else {
                C333547Zj r52 = this.A03;
                List list2 = (List) this.A05.invoke();
                boolean booleanValue2 = ((Boolean) this.A04.invoke()).booleanValue();
                if (str2 == null) {
                    str4 = this.A02.A00();
                }
                OKL okl2 = this.A09;
                if (okl2 != null) {
                    oca = okl2.A00();
                }
                R20.A01(new OrA(new C377089Km(this, 26)), r52.EMH((AnonymousClass9JH) null, gnY2, r8, oca, r10, r11, r12, str4, (String) null, str5, str6, list2, booleanValue2), C73441Pcj.A00);
            }
        }
    }
}
