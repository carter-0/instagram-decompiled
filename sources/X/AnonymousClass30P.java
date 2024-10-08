package X;

import android.app.Activity;
import com.instagram.api.schemas.IGRFSurveyContextDict;
import com.instagram.api.schemas.IGRFSurveyContextMappingDict;
import com.instagram.api.schemas.IGRFSurveyInfoDict;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.30P  reason: invalid class name */
public final class AnonymousClass30P implements C250603lj, AnonymousClass30I {
    public long A00 = -1;
    public boolean A01;
    public final long A02;
    public final Activity A03;
    public final UserSession A04;
    public final AnonymousClass2pP A05;

    public AnonymousClass30P(Activity activity, UserSession userSession, AnonymousClass2pP r6) {
        0qQ.A0B(activity, 3);
        this.A05 = r6;
        this.A04 = userSession;
        this.A03 = activity;
        this.A02 = 182.A01(0Tu.A05, userSession, 36610747907774590L);
    }

    public final void ATF(AnonymousClass30Y r18, C252093oY r19) {
        Map map;
        String A2r;
        IGRFSurveyInfoDict BFe;
        IGRFSurveyContextDict B59;
        List<IGRFSurveyContextMappingDict> Aqx;
        AnonymousClass30Y r4 = r18;
        0qQ.A0B(r4, 0);
        C252093oY r2 = r19;
        0qQ.A0B(r2, 1);
        int intValue = r2.CEk(r4).intValue();
        if (intValue == 0) {
            AnonymousClass2pP r1 = this.A05;
            String id = ((1Xj) r4.A03).getId();
            if (id != null) {
                r1.A00(id);
                this.A00 = System.currentTimeMillis();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        } else if (intValue != 1) {
            AnonymousClass2pP r12 = this.A05;
            String id2 = ((1Xj) r4.A03).getId();
            if (id2 != null) {
                r12.A00(id2).A04(r2);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        } else {
            AnonymousClass3W1 r7 = (AnonymousClass3W1) r4.A04;
            if (!r7.A2q && r7.getPosition() >= 0) {
                AnonymousClass2pP r13 = this.A05;
                1Xj r8 = (1Xj) r4.A03;
                String id3 = r8.getId();
                if (id3 == null) {
                    throw new IllegalStateException("Required value was null.");
                } else if (r13.A00(id3).A01(r2) >= this.A02) {
                    UserSession userSession = this.A04;
                    0qQ.A0A(r8);
                    long j = this.A00;
                    C250513lZ injected = r8.A0C.getInjected();
                    if (injected == null || (BFe = injected.BFe()) == null || (B59 = BFe.B59()) == null || (Aqx = B59.Aqx()) == null) {
                        map = 0Yt.A0E();
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (IGRFSurveyContextMappingDict iGRFSurveyContextMappingDict : Aqx) {
                            String name = iGRFSurveyContextMappingDict.getName();
                            if (name != null) {
                                String value = iGRFSurveyContextMappingDict.getValue();
                                if (value == null) {
                                    value = "";
                                }
                                linkedHashMap.put(name, value);
                            }
                        }
                        map = 0Yt.A0B(linkedHashMap);
                    }
                    0eP r9 = new 0eP("ad_client_impression_ts", String.valueOf(j));
                    String A07 = C231122qu.A07(userSession, r8);
                    String str = "";
                    if (A07 == null) {
                        A07 = str;
                    }
                    0eP r10 = new 0eP("ad_id", A07);
                    AnonymousClass3OA A002 = 1wN.A00(userSession).A00(r8);
                    if (A002 != null) {
                        A2r = A002.A0g;
                    } else {
                        A2r = r8.A2r();
                    }
                    if (A2r == null) {
                        A2r = str;
                    }
                    0eP r11 = new 0eP("ad_page_id", A2r);
                    0eP r122 = new 0eP(C273654mx.A00(231), String.valueOf(r7.getPosition() + 1));
                    String A0F = C231122qu.A0F(userSession, r8);
                    if (A0F == null) {
                        A0F = str;
                    }
                    0eP r132 = new 0eP("ad_tracking_token", A0F);
                    0eP r14 = new 0eP("gap_to_previous_ad", String.valueOf(C238233Bb.A02.A00(C267004ai.AD, r7.getPosition())));
                    0eP r15 = new 0eP("ig_user_id", userSession.A06);
                    String BcO = C60510iO.A00(userSession).BcO();
                    if (BcO != null) {
                        str = BcO;
                    }
                    DcL.A00().A02(this.A03, userSession, "817620270559898", 0Yt.A04(map, 0Yt.A06(new 0eP[]{r9, r10, r11, r122, r132, r14, r15, new 0eP("pigeon_session_id", str)})));
                    this.A01 = true;
                }
            }
        }
    }

    public final boolean CRp(AnonymousClass30Y r7, C252093oY r8) {
        String str;
        IGRFSurveyInfoDict BFe;
        IGRFSurveyContextDict B59;
        if (!this.A01 && this.A02 > 0 && 1Wj.A00 != null) {
            if (182.A06(0Tu.A05, this.A04, 36329272931008464L)) {
                Object obj = r7.A03;
                0qQ.A06(obj);
                1Xj r2 = (1Xj) obj;
                0qQ.A0B(r2, 0);
                if (r2.CcK()) {
                    C250513lZ injected = r2.A0C.getInjected();
                    if (injected == null || (BFe = injected.BFe()) == null || (B59 = BFe.B59()) == null) {
                        str = null;
                    } else {
                        str = B59.BI8();
                    }
                    if (!0qQ.A0K(str, "817620270559898")) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
