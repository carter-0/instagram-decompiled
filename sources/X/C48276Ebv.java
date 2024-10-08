package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.modal.ModalActivity;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.List;

/* renamed from: X.Ebv  reason: case insensitive filesystem */
public abstract class C48276Ebv {
    public static final Object A00(C307896Rx r11, AnonymousClass6Tm r12) {
        String str;
        String str2;
        Context context;
        C47046Dpg dpg;
        int i;
        C276544tV r2;
        Integer num;
        AnonymousClass3M4 r1;
        Integer num2;
        C307786Rm r7 = r11.A03;
        if (r7 != null) {
            C276544tV A0P = DbY.A0P(r12, 0);
            C229392nJ r10 = r7.A02;
            Integer num3 = (Integer) r7.A01.get(R.id.bk_screen_container_type);
            C276544tV A07 = A0P.A07(45);
            if (num3 != null) {
                String A0D = A0P.A0D();
                if (A0D != null) {
                    int hashCode = A0D.hashCode();
                    if (hashCode != 111185) {
                        if (hashCode != 94756344) {
                            if (hashCode == 530790978 && A0D.equals("pop_to_screen")) {
                                String A0H = A0P.A0H();
                                if (A0H != null) {
                                    boolean A0R = A0P.A0R(36, false);
                                    int intValue = num3.intValue();
                                    Context context2 = r7.A00;
                                    new C307506Qj(r10.AMV());
                                    if (intValue == 16542) {
                                        if (A07 == null || A07.A04 != 16962) {
                                            num2 = null;
                                        } else {
                                            num2 = C46621Di1.A00(DbV.A10(A07, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT));
                                        }
                                        C49954FGj.A04(context2, new C16399UuH(num2), A0H);
                                        return null;
                                    } else if (intValue == 16696) {
                                        FragmentActivity fragmentActivity = (FragmentActivity) 0mE.A00(context2, FragmentActivity.class);
                                        if (fragmentActivity != null) {
                                            C229102mq.A00(fragmentActivity).A0y(A0H, A0R ? 1 : 0);
                                            return null;
                                        }
                                        throw AnonymousClass7TE.A0z("Cannot close a screen query fragment outside a FragmentActivity");
                                    } else if (intValue == 16793) {
                                        Activity activity = (Activity) 0mE.A00(context2, Activity.class);
                                        if (activity != null) {
                                            C331157Pu A00 = C48943Emh.A00(DbT.A0i(activity));
                                            if (A00 != null) {
                                                A00.A0N(A0H, A0R);
                                            }
                                            str = AnonymousClass000.A00(2319);
                                            str2 = AnonymousClass000.A00(2273);
                                            1Kn.A02(str, str2);
                                            return null;
                                        }
                                    } else {
                                        throw DbZ.A0Z(num3);
                                    }
                                } else {
                                    throw AnonymousClass7TE.A0w("Required value was null.");
                                }
                            }
                        } else if (A0D.equals("close")) {
                            i = num3.intValue();
                            context = r7.A00;
                            dpg = new C47045Dpf(A07);
                        }
                    } else if (A0D.equals("pop")) {
                        i = num3.intValue();
                        context = r7.A00;
                        dpg = new C47046Dpg(A07);
                    }
                    new C307506Qj(r10.AMV());
                    if (i == 16542) {
                        boolean z = dpg instanceof C47046Dpg;
                        if (z) {
                            r2 = dpg.A00;
                        } else {
                            r2 = ((C47045Dpf) dpg).A00;
                        }
                        if (r2 == null || r2.A04 != 16962) {
                            num = null;
                        } else {
                            num = C46621Di1.A00(DbV.A10(r2, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT));
                        }
                        if (dpg instanceof C47045Dpf) {
                            C49954FGj.A03(context, (C307786Rm) null, (C276544tV) null, (C277014uI) null);
                            return null;
                        } else if (z) {
                            C49954FGj.A04(context, new C16399UuH(num), (String) null);
                            return null;
                        } else {
                            throw AnonymousClass7TE.A1K();
                        }
                    } else if (i == 16696) {
                        FragmentActivity fragmentActivity2 = (FragmentActivity) 0mE.A00(context, FragmentActivity.class);
                        if (fragmentActivity2 != null) {
                            0hq A002 = C229102mq.A00(fragmentActivity2);
                            if (dpg instanceof C47045Dpf) {
                                if (fragmentActivity2 instanceof ModalActivity) {
                                    fragmentActivity2.finish();
                                    return null;
                                }
                                0hq A003 = C229102mq.A00(fragmentActivity2);
                                FR8 A004 = FR8.A02.A00(fragmentActivity2);
                                List A04 = A003.A0U.A04();
                                0qQ.A07(A04);
                                Object A0L = 00k.A0L(A04);
                                if ((A0L instanceof AnonymousClass3M4) && (r1 = (AnonymousClass3M4) A0L) != null) {
                                    Number number = (Number) A004.A00.get(Integer.valueOf(r1.A00));
                                    if (number != null) {
                                        A003.A0e(number.intValue(), 1, false);
                                        return null;
                                    }
                                }
                                str = "IgBloksScreenQueryNavigator";
                                str2 = "Failed to find a modal stack to close. Make sure to open a screen first before closing it\nor pop this screen instead";
                                1Kn.A02(str, str2);
                                return null;
                            } else if (dpg instanceof C47046Dpg) {
                                A002.A0c();
                                return null;
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Cannot close a screen query fragment outside a FragmentActivity");
                        }
                    } else if (i == 16793) {
                        Activity activity2 = (Activity) 0mE.A00(context, Activity.class);
                        if (activity2 != null) {
                            C331157Pu A005 = C48943Emh.A00(DbT.A0i(activity2));
                            if (A005 != null) {
                                if (!(dpg instanceof C47045Dpf)) {
                                    if (!(dpg instanceof C47046Dpg)) {
                                        throw AnonymousClass7TE.A1K();
                                    } else if (A005.A03.A0D.size() > 1) {
                                        A005.A08();
                                        return null;
                                    }
                                }
                                A005.A0L((C332277Ui) null);
                                return null;
                            }
                            str = AnonymousClass000.A00(2319);
                            str2 = AnonymousClass000.A00(2273);
                            1Kn.A02(str, str2);
                            return null;
                        }
                    } else {
                        throw DbZ.A0Z(num3);
                    }
                }
                1Kn.A02("BKBloksActionScreenCloseImpl", 002.A0R("Unrecognized close type: ", A0P.A0D()));
                return null;
            }
            return null;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
