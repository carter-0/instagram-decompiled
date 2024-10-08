package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger;
import java.util.List;

/* renamed from: X.7Z0  reason: invalid class name */
public final class AnonymousClass7Z0 implements 1wn {
    public final /* synthetic */ AnonymousClass7S6 A00;

    public AnonymousClass7Z0(AnonymousClass7S6 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        IGFOAMessagingLocalSendSpeedLogger iGFOAMessagingLocalSendSpeedLogger;
        int i;
        C358248ab r4;
        int i2;
        DialogInterface.OnClickListener fi0;
        AnonymousClass2Ep r15;
        Boolean bool;
        Boolean bool2;
        AnonymousClass7FA r0;
        List list;
        int A03 = AnonymousClass0fD.A03(-550013436);
        2Kb r7 = (2Kb) obj;
        int A032 = AnonymousClass0fD.A03(1568105931);
        Integer num = r7.A01;
        boolean z = true;
        if (num != AnonymousClass05K.A01 || (list = r7.A02) == null || list.size() != 1 || ((C254703su) list.get(0)).A0f() == null) {
            iGFOAMessagingLocalSendSpeedLogger = null;
        } else {
            iGFOAMessagingLocalSendSpeedLogger = C328727Fx.A00(this.A00.A0G, Integer.valueOf(((C254703su) list.get(0)).A0f().hashCode()));
            if (iGFOAMessagingLocalSendSpeedLogger != null) {
                iGFOAMessagingLocalSendSpeedLogger.onLogPostThreadUpdateEventEnd();
            }
        }
        AnonymousClass7S6 r3 = this.A00;
        if (r3.C6C() != null && r3.C6C().equals(r7.A00.A00)) {
            2Dr r1 = r3.A0O;
            String C6C = r3.C6C();
            0qQ.A0B(C6C, 0);
            AnonymousClass3U9 A0N = r1.A0N(C6C);
            AnonymousClass7S6.A02(r3.A0J, r3.A0K, r3, A0N);
            AnonymousClass7S6.A05(r3, A0N);
        }
        if (r3.A0L.A00.A0U.isResumed() && r3.CdE()) {
            DirectThreadKey A0C = r3.B8S();
            DirectThreadKey directThreadKey = r7.A00;
            if (A0C.equals(directThreadKey)) {
                String str = directThreadKey.A00;
                if (str != null) {
                    if (iGFOAMessagingLocalSendSpeedLogger != null) {
                        iGFOAMessagingLocalSendSpeedLogger.onLogUpdateLocalThreadIdStart();
                    }
                    AnonymousClass3U9 A0N2 = r3.A0O.A0N(str);
                    AnonymousClass7TI.A0B(r3.A0K.A00, directThreadKey);
                    if (A0N2 == null || A0N2.C6a() != 29) {
                        z = false;
                    }
                    if (!2PP.A00(r3.A09, str) && !z) {
                        AnonymousClass7S6.A06(r3, str);
                        AnonymousClass782 r02 = (AnonymousClass782) r3.A0J.A08.invoke();
                        if (r02 != null) {
                            r02.A02();
                            r02.A01();
                        }
                    }
                    if (iGFOAMessagingLocalSendSpeedLogger != null) {
                        iGFOAMessagingLocalSendSpeedLogger.onLogUpdateLocalThreadIdEnd();
                    }
                }
                if (!2PP.A00(r3.C6C(), str)) {
                    i = 349629044;
                } else {
                    C330287Me r9 = r3.A03;
                    r9.getClass();
                    r9.A01(r3.C6Q(), num, r7.A02, r7.A00(), r7.A04);
                    AnonymousClass7US r92 = r3.A0J;
                    ((AnonymousClass7VD) r92.A0K.invoke()).A01();
                    AnonymousClass2Ep r03 = r3.A07;
                    UserSession userSession = r92.A02;
                    if (C377859Nn.A00(userSession, r03) && (r0 = (AnonymousClass7FA) r92.A06.invoke()) != null) {
                        r0.A05(false);
                    }
                    AnonymousClass2Ep r2 = r3.A07;
                    if (r2 != null) {
                        AnonymousClass4DH r14 = r92.A00;
                        Context requireContext = r14.requireContext();
                        AnonymousClass7SU r10 = r92.A04;
                        List list2 = r7.A03;
                        if (list2 != null && list2.size() == 1 && (bool2 = ((AnonymousClass9VM) list2.get(0)).A01) != null && !bool2.booleanValue()) {
                            1Av A002 = 1Au.A00(userSession);
                            0qQ.A0B(A002, 1);
                            if (182.A06(0Tu.A05, userSession, 36311139579068863L)) {
                                0s0 r12 = A002.A7x;
                                AnonymousClass0YZ[] r17 = 1Av.A8a;
                                if (((Boolean) r12.CDM(A002, r17[406])).booleanValue() && A002.A01.getInt("unsend_warning_banner_shown_count", 0) < 2) {
                                    C39867ACo aCo = new C39867ACo(r14, userSession);
                                    C40459AcU acU = new C40459AcU(r14, r10, aCo, r2);
                                    C358248ab r142 = new C358248ab(requireContext);
                                    r142.A09(2131960665);
                                    r142.A08(2131960664);
                                    r142.A0I(new AKE(acU), 2131960669);
                                    r142.A0H(new AKF(acU), 2131968772);
                                    r142.A0r(true);
                                    r142.A0s(true);
                                    AnonymousClass0fN.A00(r142.A02());
                                    C39867ACo.A00(aCo, r2, "show");
                                    1Av A003 = 1Au.A00(userSession);
                                    0xa r22 = A003.A01;
                                    0xY AR4 = r22.AR4();
                                    AR4.E5T("seen_direct_unseen_message_education_dialog", true);
                                    AR4.apply();
                                    int i3 = r22.getInt("unsend_warning_banner_shown_count", 0) + 1;
                                    0xY AR42 = r22.AR4();
                                    AR42.E5Z("unsend_warning_banner_shown_count", i3);
                                    AR42.apply();
                                    A003.A7x.Epx(A003, false, r17[406]);
                                    C395279zV.A00(userSession);
                                }
                            }
                        }
                    }
                    List list3 = r7.A03;
                    if (!(list3 == null || list3.size() <= 0 || (r15 = r3.A07) == null)) {
                        Context requireContext2 = r92.A00.requireContext();
                        AnonymousClass7SU r122 = r92.A04;
                        1Av A004 = 1Au.A00(userSession);
                        0qQ.A0B(A004, 1);
                        if (list3.size() == 1 && (bool = ((AnonymousClass9VM) list3.get(0)).A01) != null && bool.booleanValue() && r15.Ca9()) {
                            0xa r102 = A004.A01;
                            String A005 = C66579MXk.A00(1114);
                            if (!r102.getBoolean(A005, false)) {
                                String A006 = C66579MXk.A00(394);
                                if (r102.getBoolean(A006, false) && 182.A06(0Tu.A05, userSession, 36315881222966926L)) {
                                    C40458AcT acT = new C40458AcT(r122, r15);
                                    C358248ab r123 = new C358248ab(requireContext2);
                                    r123.A09(2131960201);
                                    r123.A08(2131960200);
                                    r123.A0I(new AKC(acT), 2131960669);
                                    r123.A0H(new AKD(acT), 2131968772);
                                    r123.A0r(true);
                                    r123.A0s(true);
                                    AnonymousClass0fN.A00(r123.A02());
                                    0xY AR43 = r102.AR4();
                                    AR43.E5T(A005, true);
                                    AR43.apply();
                                    0xY AR44 = r102.AR4();
                                    AR44.E5T(A006, false);
                                    AR44.apply();
                                }
                            }
                        }
                    }
                    AnonymousClass2Ep r23 = r3.A07;
                    if (r23 != null && r23.C3d() == 2EN.A04) {
                        boolean z2 = false;
                        if (r23.BKv() == null) {
                            z2 = true;
                        }
                        AnonymousClass4DH r04 = r92.A00;
                        Context requireContext3 = r04.requireContext();
                        FragmentActivity activity = r04.getActivity();
                        if (AnonymousClass430.A01(userSession)) {
                            if (!z2 || !JYR.A00(userSession)) {
                                1Av A007 = 1Au.A00(userSession);
                                0s0 r72 = A007.A1m;
                                AnonymousClass0YZ[] r42 = 1Av.A8a;
                                if (!((Boolean) r72.CDM(A007, r42[134])).booleanValue()) {
                                    r72.Epx(A007, true, r42[134]);
                                    boolean A05 = AnonymousClass2o3.A00(userSession).A05(UserMonetizationProductType.BRANDED_CONTENT_DEAL_CREATOR);
                                    r4 = new C358248ab(requireContext3);
                                    r4.A09(2131957119);
                                    r4.A08(2131957118);
                                    r4.A0j(requireContext3.getDrawable(R.drawable.ig_illustrations_illo_direct_refresh));
                                    if (A05) {
                                        r4.A06();
                                        i2 = 2131957120;
                                        fi0 = new C39914AJg(requireContext3);
                                    } else {
                                        r4.A06();
                                        i2 = 2131968494;
                                        fi0 = new FI0(activity, userSession);
                                    }
                                    r4.A0H(fi0, i2);
                                }
                            } else {
                                r4 = new C358248ab(requireContext3);
                                r4.A09(2131954109);
                                r4.A08(2131954108);
                                r4.A0j(requireContext3.getDrawable(R.drawable.ig_illustrations_illo_direct_refresh));
                                r4.A06();
                            }
                            AnonymousClass0fN.A00(r4.A02());
                        }
                    }
                    i = 2025742563;
                }
                AnonymousClass0fD.A0A(i, A032);
                AnonymousClass0fD.A0A(-693805793, A03);
            }
        }
        i = 1442565079;
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(-693805793, A03);
    }
}
