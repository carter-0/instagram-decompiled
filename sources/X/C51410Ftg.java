package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Ftg  reason: case insensitive filesystem */
public final class C51410Ftg implements Runnable {
    public final /* synthetic */ C59844JaK A00;
    public final /* synthetic */ MR2 A01;

    public C51410Ftg(C59844JaK jaK, MR2 mr2) {
        this.A00 = jaK;
        this.A01 = mr2;
    }

    public final void run() {
        String str;
        C46573DhF dhF;
        C229382nI A0L;
        C360678ey A05;
        Object obj;
        C59844JaK jaK = this.A00;
        C47269Dtx dtx = (C47269Dtx) this.A01;
        G5E g5e = dtx.A00;
        HashMap hashMap = dtx.A01;
        if (C47268Dtw.A00(1, g5e)) {
            C59844JaK.A00(jaK).A04();
            FragmentActivity requireActivity = jaK.requireActivity();
            C21251XQw xQw = (C21251XQw) ((C47268Dtw) g5e).A01;
            0qQ.A0B(xQw, 1);
            C309516Yo A0Q = DbU.A0Q(requireActivity, ((C49859F9z) jaK.A02.getValue()).A00);
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putSerializable("screen_id", xQw);
            A0a.putSerializable("new_settings_session", false);
            DbS.A1B(A0a, (String) null);
            DbW.A0y(A0a, new C59844JaK(), A0Q);
        } else if (C47268Dtw.A00(0, g5e)) {
            C59844JaK.A00(jaK).A04();
            C49859F9z f9z = (C49859F9z) jaK.A02.getValue();
            Context requireContext = jaK.requireContext();
            FragmentActivity requireActivity2 = jaK.requireActivity();
            Integer num = (Integer) ((C47268Dtw) g5e).A01;
            C46573DhF dhF2 = new C46573DhF(jaK, 43);
            0qQ.A0B(num, 2);
            C49142Eq5.A00();
            switch (num.intValue()) {
                case 0:
                    obj = new Object();
                    break;
                case 1:
                case 3:
                case 7:
                case 8:
                case 10:
                case 11:
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                case 13:
                case 15:
                case 16:
                case 17:
                case 19:
                case 23:
                case 28:
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                case 30:
                case 31:
                case 32:
                case 37:
                    obj = new C50950Fld(num);
                    break;
                case 2:
                    obj = new C50954Flh(jaK, dhF2);
                    break;
                case 4:
                    obj = new Object();
                    break;
                case 5:
                    obj = new Object();
                    break;
                case 6:
                    obj = new C50949Flc(jaK);
                    break;
                case 9:
                    obj = new Object();
                    break;
                case 14:
                    obj = new Object();
                    break;
                case EglBase14Impl.EGLExt_SDK_VERSION:
                    obj = new Object();
                    break;
                case 20:
                    obj = new Object();
                    break;
                case 21:
                    obj = new C50951Fle(jaK);
                    break;
                case 22:
                    obj = new Object();
                    break;
                case 24:
                    obj = new Object();
                    break;
                case 25:
                    obj = new Object();
                    break;
                case 26:
                    obj = new C50956Flj(jaK, jaK);
                    break;
                case 27:
                    obj = new C50955Fli(jaK, jaK);
                    break;
                case 33:
                    obj = new Object();
                    break;
                case 34:
                    obj = new C50952Flf(jaK);
                    break;
                case 35:
                    obj = new Object();
                    break;
                case 36:
                    obj = new Object();
                    break;
                case 38:
                    obj = new Object();
                    break;
                case 39:
                    obj = new C50953Flg(jaK);
                    break;
                default:
                    throw AnonymousClass7TE.A1K();
            }
            ((G6O) obj).Cqa(requireContext, requireActivity2, f9z.A00);
        } else if (g5e instanceof C47264Dts) {
            C59844JaK.A00(jaK).A04();
            Context requireContext2 = jaK.requireContext();
            FragmentActivity requireActivity3 = jaK.requireActivity();
            C47264Dts dts = (C47264Dts) g5e;
            String str2 = dts.A01;
            Bundle bundle = dts.A00;
            0qQ.A0B(str2, 2);
            UserSession userSession = ((C49859F9z) jaK.A02.getValue()).A00;
            Class<ModalActivity> cls = ModalActivity.class;
            if (bundle == null) {
                bundle = AnonymousClass7TE.A0a();
            }
            AnonymousClass6W8 A03 = AnonymousClass6W8.A03(requireActivity3, bundle, userSession, cls, str2);
            A03.A08();
            A03.A0C(requireContext2);
        } else if (g5e instanceof C47267Dtv) {
            C59844JaK.A00(jaK).A04();
            C47267Dtv dtv = (C47267Dtv) g5e;
            if (!dtv.A04) {
                hashMap = null;
            }
            jaK.A02.getValue();
            Context requireContext3 = jaK.requireContext();
            UserSession A0l = AnonymousClass7TE.A0l(jaK.A06);
            String str3 = dtv.A02;
            C61083JwL jwL = dtv.A00;
            C21241XQm xQm = dtv.A01;
            HashMap hashMap2 = dtv.A03;
            boolean z = dtv.A05;
            DbZ.A0t(1, A0l, str3, jwL);
            if (xQm != null) {
                if (xQm.ordinal() == 0) {
                    1We r0 = 1We.A02;
                    if (r0 != null) {
                        hashMap2 = 1We.A00(r0).A03(A0l, EWJ.IG_TS_ENTRY_POINT_SETTINGS);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    throw AnonymousClass7TE.A1K();
                }
            } else if (hashMap2 == null) {
                hashMap2 = AnonymousClass7TE.A1E();
            }
            if (hashMap != null) {
                hashMap2.putAll(hashMap);
            }
            C46649DiU A04 = C46649DiU.A04(str3, hashMap2);
            IgBloksScreenConfig A0N = DbS.A0N(A0l);
            A0N.A0l = z;
            A0N.A07(new C46615Dhv((C20880X2h) null, (C3034368u) null, (C276544tV) null, (C276544tV) null, (C277014uI) null, C59846JaM.A00(AnonymousClass7TF.A0A(requireContext3), jwL).toString(), (String) null, (List) null, false, false, false));
            C46649DiU.A07(requireContext3, A0N, A04);
        } else {
            G5E g5e2 = g5e;
            boolean z2 = g5e instanceof C47263Dtr;
            if (z2) {
                C47263Dtr dtr = (C47263Dtr) g5e2;
                if (dtr.A00 == 1) {
                    C59844JaK.A00(jaK).A04();
                    jaK.A02.getValue();
                    C49859F9z.A00(jaK.requireContext(), AnonymousClass7TE.A0l(jaK.A06), dtr.A01);
                    return;
                }
            }
            if (g5e instanceof C47265Dtt) {
                C49859F9z f9z2 = (C49859F9z) jaK.A02.getValue();
                FragmentActivity requireActivity4 = jaK.requireActivity();
                C47265Dtt dtt = (C47265Dtt) g5e;
                String str4 = dtt.A01;
                C21241XQm xQm2 = dtt.A00;
                HashMap hashMap3 = dtt.A02;
                dhF = new C46573DhF(jaK, 44);
                0qQ.A0B(str4, 2);
                if (xQm2 != null) {
                    if (xQm2.ordinal() == 0) {
                        UserSession userSession2 = f9z2.A00;
                        1We r02 = 1We.A02;
                        if (r02 != null) {
                            hashMap3 = 1We.A00(r02).A03(userSession2, EWJ.IG_TS_ENTRY_POINT_SETTINGS);
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    } else {
                        throw AnonymousClass7TE.A1K();
                    }
                }
                UserSession userSession3 = f9z2.A00;
                A0L = DbY.A0L(requireActivity4, userSession3, "SETTINGS");
                A05 = C359988do.A05(userSession3, str4, hashMap3);
            } else {
                if (z2) {
                    C47263Dtr dtr2 = (C47263Dtr) g5e2;
                    if (dtr2.A00 == 0) {
                        FragmentActivity requireActivity5 = jaK.requireActivity();
                        String str5 = dtr2.A01;
                        dhF = new C46573DhF(jaK, 45);
                        0qQ.A0B(str5, 2);
                        LinkedHashMap A0p = DbY.A0p("node_identifier", str5, AnonymousClass7TE.A1L("entrypoint", "settings_search"));
                        String A002 = AnonymousClass000.A00(138);
                        UserSession userSession4 = ((C49859F9z) jaK.A02.getValue()).A00;
                        A0L = DbY.A0L(requireActivity5, userSession4, "SETTINGS");
                        A05 = C359988do.A05(userSession4, A002, A0p);
                    }
                }
                if (g5e instanceof C47266Dtu) {
                    C59844JaK.A00(jaK).A04();
                    jaK.A02.getValue();
                    FragmentActivity requireActivity6 = jaK.requireActivity();
                    UserSession A0l2 = AnonymousClass7TE.A0l(jaK.A06);
                    C47266Dtu dtu = (C47266Dtu) g5e;
                    String str6 = dtu.A02;
                    EV3 ev3 = dtu.A00;
                    HashMap hashMap4 = dtu.A03;
                    String str7 = dtu.A01;
                    0qQ.A0B(A0l2, 1);
                    AnonymousClass7TG.A0w(2, str6, ev3, hashMap4);
                    if (!0oI.A0I(requireActivity6.getPackageManager(), str6)) {
                        Uri.Builder builder = new Uri.Builder();
                        StringBuilder A1A = AnonymousClass7TE.A1A();
                        Iterator A0s = AnonymousClass7TF.A0s(hashMap4);
                        Object obj2 = "utm_source";
                        while (A0s.hasNext()) {
                            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                            if ("utm_source".equals(DbT.A13(A1J).toLowerCase(Locale.US))) {
                                obj2 = A1J.getKey();
                            } else {
                                builder.appendQueryParameter(DbT.A13(A1J), DbS.A0s(A1J));
                            }
                        }
                        if (hashMap4.containsKey(obj2)) {
                            str = DbS.A0r(obj2, hashMap4);
                        } else {
                            str = "default-utm_source";
                        }
                        A1A.append(str);
                        String query = builder.build().getQuery();
                        if (!TextUtils.isEmpty(query)) {
                            A1A.append("&");
                        }
                        String encode = Uri.encode(AnonymousClass7TF.A0l(query, A1A));
                        C49716F3b f3b = new C49716F3b(requireActivity6, A0l2);
                        if (ev3 != EV3.MODAL || !f3b.A01()) {
                            0oI.A07(requireActivity6, str6, encode);
                            return;
                        } else {
                            0oI.A06(requireActivity6, f3b, str6, encode);
                            return;
                        }
                    } else if (str7 == null || str7.length() == 0) {
                        Intent launchIntentForPackage = requireActivity6.getPackageManager().getLaunchIntentForPackage(str6);
                        if (launchIntentForPackage != null) {
                            0kR.A0A(requireActivity6, launchIntentForPackage);
                            return;
                        }
                        return;
                    } else {
                        FH7.A02(requireActivity6, str7);
                        return;
                    }
                } else {
                    throw AnonymousClass7TE.A1K();
                }
            }
            E86.A01(A05, A0L, dhF, 19);
            jaK.schedule(A05);
        }
    }
}
