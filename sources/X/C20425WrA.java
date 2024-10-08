package X;

import android.os.BaseBundle;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.activity.PromoteActivity;
import com.instagram.business.promote.model.PromoteAudience;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.WrA  reason: case insensitive filesystem */
public final class C20425WrA implements 02o {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public C20425WrA(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A00 = i;
        this.A05 = str;
        this.A03 = obj4;
        this.A02 = obj;
        this.A01 = obj3;
        this.A04 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, AnonymousClass4D7 r18) {
        Fragment uaS;
        BaseBundle baseBundle;
        String str;
        ImageUrl imageUrl;
        Object obj2 = obj;
        if (this.A00 != 0) {
            Map map = (Map) this.A03;
            map.put(this.A05, obj2);
            0rk r1 = (0rk) this.A02;
            int i = r1.A00 - 1;
            r1.A00 = i;
            if (i == 0) {
                FragmentActivity fragmentActivity = (PromoteActivity) this.A04;
                List<Object> list = (List) this.A01;
                ArrayList<C268654dm> arrayList = new ArrayList<>();
                for (Object A1R : list) {
                    C13989Tnp.A1R(A1R, arrayList, map);
                }
                C16678UzE uzE = C16678UzE.OBJECTIVE;
                if (!fragmentActivity.isDestroyed() && !fragmentActivity.isFinishing()) {
                    C268654dm r3 = null;
                    if (arrayList.size() == list.size()) {
                        WGU A0M = C13990Tnq.A0M(fragmentActivity.A07);
                        PromoteData promoteData = fragmentActivity.A00;
                        String str2 = "promoteData";
                        if (promoteData != null) {
                            String str3 = promoteData.A1K;
                            if (str3 != null) {
                                A0M.A01 = str3;
                            }
                            A0M.A0W(uzE.toString(), "initial_fetch", (String) null);
                            ArrayList<C15254UXo> arrayList2 = new ArrayList<>();
                            for (C268654dm A002 : arrayList) {
                                C15254UXo uXo = (C15254UXo) A002.A00();
                                if (uXo != null && (uXo.A01 == null || uXo.A06)) {
                                    arrayList2.add(uXo);
                                }
                            }
                            if (arrayList2.size() != list.size()) {
                                ArrayList arrayList3 = new ArrayList();
                                for (Object next : arrayList) {
                                    if (!00k.A0u(arrayList2, ((C268654dm) next).A00())) {
                                        arrayList3.add(next);
                                    }
                                }
                                r3 = (C268654dm) 00k.A0J(arrayList3);
                            } else {
                                AnonymousClass0eM r5 = fragmentActivity.A0A;
                                UserSession A0l = AnonymousClass7TE.A0l(r5);
                                PromoteData promoteData2 = fragmentActivity.A00;
                                if (promoteData2 != null) {
                                    PromoteState promoteState = fragmentActivity.A01;
                                    if (promoteState != null) {
                                        0qQ.A0B(A0l, 0);
                                        C15254UXo uXo2 = (C15254UXo) 00k.A0J(arrayList2);
                                        if (uXo2 != null) {
                                            VAF.A00(fragmentActivity, uzE, uXo2, promoteData2, promoteState, A0l);
                                        }
                                        ArrayList A0r = AnonymousClass7TG.A0r(arrayList2);
                                        for (C15254UXo uXo3 : arrayList2) {
                                            C17746VdF vdF = uXo3.A03;
                                            if (vdF == null || (imageUrl = vdF.A0F) == null || (str = imageUrl.getUrl()) == null) {
                                                str = "";
                                            }
                                            A0r.add(str);
                                        }
                                        promoteData2.A1w = A0r;
                                        PromoteActivity.A03(fragmentActivity);
                                        WT9.A01(C15414UcQ.A00, C18137VmD.A00(fragmentActivity), "fetch_init_promote_success");
                                        PromoteData promoteData3 = fragmentActivity.A00;
                                        if (promoteData3 != null) {
                                            PromoteLaunchOrigin promoteLaunchOrigin = promoteData3.A0v;
                                            PromoteLaunchOrigin promoteLaunchOrigin2 = PromoteLaunchOrigin.CLIENT_SPEC_OVERRIDE;
                                            if (promoteLaunchOrigin == promoteLaunchOrigin2 && (baseBundle = (BaseBundle) fragmentActivity.A06.getValue()) != null) {
                                                String string = baseBundle.getString("objective");
                                                int i2 = baseBundle.getInt("default_budget");
                                                int i3 = baseBundle.getInt("default_duration");
                                                PromoteData promoteData4 = fragmentActivity.A00;
                                                if (promoteData4 != null) {
                                                    promoteData4.A0v = promoteLaunchOrigin2;
                                                    promoteData4.A0i = C16852V8h.A00(string);
                                                    PromoteState promoteState2 = fragmentActivity.A01;
                                                    if (promoteState2 != null) {
                                                        PromoteData promoteData5 = fragmentActivity.A00;
                                                        if (promoteData5 != null) {
                                                            C13990Tnq.A1H(promoteData5, promoteState2);
                                                            PromoteData promoteData6 = fragmentActivity.A00;
                                                            if (promoteData6 != null) {
                                                                promoteData6.A22.put(promoteData6.A1Z, PromoteAudience.A0E);
                                                                PromoteData promoteData7 = fragmentActivity.A00;
                                                                if (promoteData7 != null) {
                                                                    promoteData7.A08 = i2;
                                                                    promoteData7.A09 = i3;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (fragmentActivity.A01 != null) {
                                                PromoteData promoteData8 = fragmentActivity.A00;
                                                if (promoteData8 != null) {
                                                    if (!PromoteState.A02(promoteData8)) {
                                                        PromoteData promoteData9 = fragmentActivity.A00;
                                                        if (promoteData9 != null) {
                                                            if (promoteData9.A0v != promoteLaunchOrigin2) {
                                                                if (promoteData9.A2h) {
                                                                    UserSession A0l2 = AnonymousClass7TE.A0l(r5);
                                                                    0qQ.A0B(A0l2, 0);
                                                                    if (182.A06(0Tu.A05, A0l2, 36321829752678193L)) {
                                                                        PromoteState promoteState3 = fragmentActivity.A01;
                                                                        if (promoteState3 != null) {
                                                                            PromoteData promoteData10 = fragmentActivity.A00;
                                                                            if (promoteData10 != null) {
                                                                                promoteState3.A04(XIGIGBoostDestination.DIRECT_MESSAGE, promoteData10);
                                                                                PromoteData promoteData11 = fragmentActivity.A00;
                                                                                if (promoteData11 != null) {
                                                                                    promoteData11.A2m = true;
                                                                                    C13990Tnq.A0h();
                                                                                    if (fragmentActivity.A00 != null) {
                                                                                        uaS = new C15274UZc();
                                                                                        C309516Yo r0 = new C309516Yo(fragmentActivity, AnonymousClass7TE.A0l(r5));
                                                                                        r0.A0D = false;
                                                                                        r0.A0B((Bundle) null, uaS);
                                                                                        r0.A04();
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                C13990Tnq.A0h();
                                                                uaS = new C15321UaT();
                                                                C309516Yo r02 = new C309516Yo(fragmentActivity, AnonymousClass7TE.A0l(r5));
                                                                r02.A0D = false;
                                                                r02.A0B((Bundle) null, uaS);
                                                                r02.A04();
                                                            }
                                                        }
                                                    }
                                                    PromoteData promoteData12 = fragmentActivity.A00;
                                                    if (promoteData12 != null) {
                                                        boolean A012 = C18174Vmo.A01(promoteData12, AnonymousClass7TE.A0l(r5));
                                                        C18079Vl8 A0N = C13990Tnq.A0N();
                                                        if (A012) {
                                                            uaS = A0N.A02(C16678UzE.PROMOTE_PREVALIDATION_LOADING);
                                                        } else {
                                                            uaS = new C15320UaS();
                                                        }
                                                        C309516Yo r022 = new C309516Yo(fragmentActivity, AnonymousClass7TE.A0l(r5));
                                                        r022.A0D = false;
                                                        r022.A0B((Bundle) null, uaS);
                                                        r022.A04();
                                                    }
                                                }
                                            }
                                            0qQ.A0F("promoteState");
                                            throw AnonymousClass00P.createAndThrow();
                                        }
                                    }
                                    str2 = "promoteState";
                                }
                            }
                        }
                        0qQ.A0F(str2);
                        throw AnonymousClass00P.createAndThrow();
                    }
                    PromoteActivity.A07(fragmentActivity, r3);
                }
            }
        } else {
            1Xj r8 = (1Xj) obj2;
            1Yh.A02((1Yh) this.A04, new C17945Via((FragmentActivity) this.A02, (AnonymousClass0iw) this.A01, (UserSession) this.A03, r8, this.A05), r8.A5T());
        }
        return C60340gF.A00;
    }
}
