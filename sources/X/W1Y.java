package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class W1Y {
    public static final W1Y A00 = new Object();

    public final void A02(FragmentActivity fragmentActivity, XIGIGBoostCallToAction xIGIGBoostCallToAction, UserSession userSession, 1Xj r12, AudioOverlayTrack audioOverlayTrack, String str, String str2, Map map) {
        1iA r1;
        UserSession userSession2 = userSession;
        Map map2 = map;
        AnonymousClass7TG.A1P(userSession, map2);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (!182.A06(0Tu.A05, userSession, 36316594188128777L) && !A01(userSession, r12)) {
            if (r12 != null) {
                r1 = r12.BR7();
            } else {
                r1 = null;
            }
            if (r1 != 1iA.A09 || map2.get(AdsAPIInstagramPosition.REELS) == null) {
                C305796Jo.A04(fragmentActivity2, xIGIGBoostCallToAction, userSession2, audioOverlayTrack, str, str2);
                return;
            }
        }
        A00(fragmentActivity, (LME) map2.get(AdsAPIInstagramPosition.REELS), userSession);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        return X.182.A06(r2, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(com.instagram.common.session.UserSession r4, X.1Xj r5) {
        /*
            if (r5 == 0) goto L_0x003c
            X.1Xy r0 = r5.A0C
            java.lang.String r1 = r0.getBoostUnavailableIdentifier()
            if (r1 == 0) goto L_0x003c
            java.util.Map r0 = com.instagram.api.schemas.PromoteUnavailableReason.A01
            java.lang.Object r0 = r0.get(r1)
            com.instagram.api.schemas.PromoteUnavailableReason r0 = (com.instagram.api.schemas.PromoteUnavailableReason) r0
            if (r0 != 0) goto L_0x0016
            com.instagram.api.schemas.PromoteUnavailableReason r0 = com.instagram.api.schemas.PromoteUnavailableReason.UNRECOGNIZED
        L_0x0016:
            int r1 = r0.ordinal()
        L_0x001a:
            r0 = 0
            switch(r1) {
                case 9: goto L_0x003e;
                case 19: goto L_0x001f;
                case 63: goto L_0x0046;
                default: goto L_0x001e;
            }
        L_0x001e:
            return r0
        L_0x001f:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318591347530038(0x81079100031936, double:3.031361639182499E-306)
            boolean r3 = X.182.A06(r2, r4, r0)
            X.0Tu r2 = X.0Tu.A06
            r0 = 36318591347464501(0x81079100021935, double:3.031361639141053E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x003a
            r0 = 0
            if (r3 == 0) goto L_0x001e
        L_0x003a:
            r0 = 1
            return r0
        L_0x003c:
            r1 = -1
            goto L_0x001a
        L_0x003e:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321537694901757(0x810a3f000025fd, double:3.0332249211243625E-306)
            goto L_0x004d
        L_0x0046:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319544830074331(0x81086f00001ddb, double:3.031964625382876E-306)
        L_0x004d:
            boolean r0 = X.182.A06(r2, r4, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W1Y.A01(com.instagram.common.session.UserSession, X.1Xj):boolean");
    }

    public static final void A00(FragmentActivity fragmentActivity, LME lme, UserSession userSession) {
        Object obj;
        Fragment fragment;
        boolean A1Z = AnonymousClass7TG.A1Z(fragmentActivity, userSession);
        if (lme != null) {
            List<C61073JwB> list = lme.A01;
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (((C61073JwB) next).A00 == C16658Uyu.OPTIMIZED) {
                    arrayList.add(next);
                }
            }
            int size = arrayList.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C61073JwB) obj).A00 == C16658Uyu.DEFAULT) {
                    break;
                }
            }
            C61073JwB jwB = (C61073JwB) obj;
            if (jwB != null) {
                if (size > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (C61073JwB jwB2 : list) {
                        arrayList2.add(new C17485VXm((C16658Uyu) jwB2.A00, jwB2.A02, jwB2.A01, jwB2.A03));
                    }
                    Gson gson = new Gson();
                    Type type = new R2l().type;
                    0qQ.A07(type);
                    JsonElement A01 = gson.A01(arrayList2, type);
                    C13990Tnq.A0h();
                    String obj2 = lme.A00.toString();
                    String A10 = DbT.A10(A01);
                    0qQ.A0B(obj2, A1Z ? 1 : 0);
                    Bundle A09 = DbY.A09(userSession);
                    A09.putString("instagram_positions", obj2);
                    A09.putString("preview_info", A10);
                    fragment = new UZK();
                    fragment.setArguments(A09);
                } else {
                    String str = jwB.A03;
                    if (str != null) {
                        fragment = C13990Tnq.A0N().A00(userSession, str);
                    } else {
                        return;
                    }
                }
                DbY.A14(fragment, fragmentActivity, userSession);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The default preview must exist in the graphql response of ");
            sb.append(lme.A00);
            throw new IllegalStateException(AnonymousClass7TF.A0l(" ad preview.", sb));
        }
    }

    public final void A03(FragmentActivity fragmentActivity, XIGIGBoostCallToAction xIGIGBoostCallToAction, UserSession userSession, 1Xj r7, String str, List list, Map map) {
        AnonymousClass7TG.A1P(userSession, map);
        AdsAPIInstagramPosition adsAPIInstagramPosition = AdsAPIInstagramPosition.EXPLORE_HOME;
        if (!list.contains(adsAPIInstagramPosition) || map.get(adsAPIInstagramPosition) == null) {
            if (182.A06(0Tu.A05, userSession, 36316594188063240L) || A01(userSession, r7)) {
                adsAPIInstagramPosition = AdsAPIInstagramPosition.EXPLORE;
            } else {
                C305936Kd.A01(fragmentActivity, AdsAPIInstagramPosition.EXPLORE, xIGIGBoostCallToAction, userSession, str);
                return;
            }
        }
        A00(fragmentActivity, (LME) map.get(adsAPIInstagramPosition), userSession);
    }

    public final void A04(FragmentActivity fragmentActivity, XIGIGBoostCallToAction xIGIGBoostCallToAction, UserSession userSession, 1Xj r7, String str, Map map, boolean z) {
        AdsAPIInstagramPosition adsAPIInstagramPosition;
        AnonymousClass7TG.A1P(userSession, map);
        if (182.A06(0Tu.A05, userSession, 36316594187997703L) || A01(userSession, r7)) {
            A00(fragmentActivity, (LME) map.get(AdsAPIInstagramPosition.STREAM), userSession);
            return;
        }
        if (z) {
            adsAPIInstagramPosition = AdsAPIInstagramPosition.PROFILE_FEED;
        } else {
            adsAPIInstagramPosition = AdsAPIInstagramPosition.STREAM;
        }
        C305936Kd.A01(fragmentActivity, adsAPIInstagramPosition, xIGIGBoostCallToAction, userSession, str);
    }
}
