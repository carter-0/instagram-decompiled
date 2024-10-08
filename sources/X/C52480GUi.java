package X;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.meta.foa.cds.CdsOpenScreenDismissCallback;
import java.util.HashMap;
import java.util.List;
import org.webrtc.CameraCapturer;

/* renamed from: X.GUi  reason: case insensitive filesystem */
public final class C52480GUi {
    public final void A01(Activity activity, C267624bv r14, UserSession userSession, String str, String str2) {
        A03(activity, r14, userSession, str, str2, (String) null, (String) null, (String) null, (List) null, false, false);
    }

    public final void A02(Activity activity, C267624bv r14, UserSession userSession, String str, String str2, String str3) {
        A03(activity, r14, userSession, str, str2, (String) null, (String) null, str3, (List) null, false, false);
    }

    public final void A04(Activity activity, C267624bv r14, UserSession userSession, String str, String str2, String str3, List list) {
        A03(activity, r14, userSession, str, str2, (String) null, (String) null, str3, list, false, false);
    }

    public final void A05(Activity activity, UserSession userSession, String str, String str2) {
        A03(activity, (C267624bv) null, userSession, str, str2, (String) null, (String) null, (String) null, (List) null, false, false);
    }

    public final void A03(Activity activity, C267624bv r26, UserSession userSession, String str, String str2, String str3, String str4, String str5, List list, boolean z, boolean z2) {
        String str6;
        String str7;
        String str8 = str4;
        Activity activity2 = activity;
        UserSession userSession2 = userSession;
        boolean A1U = AnonymousClass7TF.A1U(0, userSession2, activity2);
        String str9 = str;
        String str10 = str2;
        AnonymousClass7TF.A1C(str9, 2, str10);
        if (z2) {
            str6 = "com.bloks.www.avatar.editor.cds.instant.autogen.launcher";
        } else {
            str6 = "com.bloks.www.avatar.editor.cds.launcher";
        }
        long now = AwakeTimeSinceBootClock.INSTANCE.now();
        2Hy r4 = 2Hy.A04;
        HashMap A0m = DbY.A0m("last_touch_up_event_ts", Long.valueOf(HSB.A00(now, r4.A03.get(), r4.A02.get())));
        AnonymousClass0eM r12 = C18423VrS.A01;
        ((C18423VrS) r12.getValue()).A00 = AnonymousClass7TF.A0c();
        if (str4 == null) {
            str8 = ((C18423VrS) r12.getValue()).A00;
        }
        C63556Kz5.A00 = new L3B(new VLB(userSession2), new C63754L5m((FragmentActivity) activity2, DbS.A0O(str6), userSession2));
        AnonymousClass7TE.A1Z(new MGE(activity2, str9, (AnonymousClass4D7) null, 10), 19E.A02(AnonymousClass12T.A00.A04));
        C56603I4c A00 = HSE.A00(userSession2);
        C267624bv r15 = r26;
        if (A00.A04(str9, str10)) {
            Object obj = A0m.get("last_touch_up_event_ts");
            0qQ.A0C(obj, AnonymousClass000.A00(17));
            C53249Gkx gkx = new C53249Gkx(str10, str8, str9, AnonymousClass7TE.A0R(obj));
            C58696Iw5 iw5 = new C58696Iw5(39, activity2, r15, userSession2);
            C307506Qj A002 = C48721Ej6.A00(A00.A0B, false);
            String str11 = gkx.A07;
            C58218IoM ioM = new C58218IoM(0, A002, activity2, A00, iw5, gkx);
            0qQ.A0B(str11, 2);
            if (A00.A03 == null || A00.A08) {
                C56603I4c.A00(A00, str11);
                A00.A01(activity2, A002, new C58718IwR(41, (Object) ioM, (Object) A00));
                return;
            }
            A00.A08 = A1U;
            ioM.invoke();
            return;
        }
        0rm A11 = C51965G9l.A11();
        if (A00.A05(str9, str10)) {
            C53221GkV gkV = C53221GkV.A03;
            if (gkV == null) {
                gkV = new C53221GkV(userSession2);
                C53221GkV.A03 = gkV;
            }
            String str12 = str9;
            String str13 = str10;
            C53221GkV gkV2 = gkV;
            gkV2.A02(str12, str13, str8, "UNKNOWN", "unknown", false, 0qQ.A0K(25x.A00(userSession2).A01.A00, C299715vi.A00));
            A11.A00 = new C57699If2(System.nanoTime() - AnonymousClass49C.A00);
        }
        if (z2) {
            str7 = "avatar_editor_instant_autogen_launcher";
        } else {
            str7 = "avatar_editor_launcher";
        }
        C46471DfZ A02 = C49940FFt.A02((VQZ) null, C46471DfZ.A0O, C46471DfZ.A0R, C46627Di7.DISABLED, C46626Di6.FULL_SCREEN, (CdsOpenScreenDismissCallback) null, AnonymousClass05K.A0C, false);
        IgBloksScreenConfig A0N = DbS.A0N(userSession2);
        A0N.A0R = str6;
        A0N.A0C = A02;
        A0N.A03 = new C54188H2i(activity2, A00, r15, str9, str10, str8, A11);
        C276534tU r42 = new C276534tU(13784);
        r42.A0P(45, str7);
        String A003 = AnonymousClass000.A00(1643);
        0eP A1L = AnonymousClass7TE.A1L(AnonymousClass000.A00(3528), str9);
        0eP A1L2 = AnonymousClass7TE.A1L("logging_mechanism", str10);
        Boolean valueOf = Boolean.valueOf(z);
        0qQ.A0C(valueOf, A003);
        HashMap A022 = 0Yt.A02(new 0eP[]{A1L, A1L2, AnonymousClass7TE.A1L("disable_intro_nux", valueOf), AnonymousClass7TE.A1L("sticker_packs", list), AnonymousClass7TE.A1L(C273654mx.A00(775), Boolean.valueOf(A1U))});
        A022.put(Pxd.A00(14), str8);
        String str14 = str3;
        if (str3 == null) {
            A022.put("on_launch_navigate_to", "STORE_CATEGORY");
        } else {
            A022.put("on_launch_navigate_to", "PRESELECTED_CATEGORY");
            A022.put("on_launch_navigation_data", str14);
        }
        String str15 = str5;
        if (str5 != null) {
            A022.put("deeplink_url", str15);
        }
        C46649DiU A06 = C46649DiU.A06(str6, C359608dC.A01(A022), A0m);
        A06.A00 = 719983200;
        r42.A0O();
        A06.A03 = r42;
        A06.A06 = str7;
        A06.A0F(activity2, A0N);
    }

    public static final void A00(Activity activity, C267624bv r10, UserSession userSession) {
        AvatarStore A00 = 25x.A00(userSession);
        AnonymousClass9IA r1 = A00.A00;
        if (r1.A02) {
            if (r10 != null) {
                r10.CxF();
            }
        } else if (r1.A03) {
            if (r10 != null) {
                r10.CxR();
            }
        } else if (r1.A01 && r10 != null) {
            r10.CxD();
        }
        A00.A00 = new AnonymousClass9IA(7, 0, false, false, false);
        if (r10 != null) {
            r10.CxG();
        }
        if (C63556Kz5.A00 != null) {
            0qQ.A0B(activity, 0);
            Intent intent = new Intent(C66579MXk.A00(CameraCapturer.OPEN_CAMERA_DELAY_MS));
            intent.setPackage(activity.getPackageName());
            0b6.A00().A07().A0C(activity.getApplicationContext(), intent);
            Intent intent2 = new Intent(C66579MXk.A00(499));
            intent.setPackage(activity.getPackageName());
            0b6.A00().A07().A0C(activity.getApplicationContext(), intent2);
        }
    }
}
