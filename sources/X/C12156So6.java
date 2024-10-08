package X;

import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.Type;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.So6  reason: case insensitive filesystem */
public final class C12156So6 implements C258943zt {
    public static final Map A02 = 0Yt.A06(AnonymousClass7TH.A0h(95, "3345", AnonymousClass7TE.A1L(Pxe.A0l(), "3342"), AnonymousClass7TE.A1L(20, "3343"), AnonymousClass7TE.A1L(50, "3344")));
    public static final Map A03 = 0Yt.A06(AnonymousClass7TH.A0h("last_story_session_end_timestamp", "3354", AnonymousClass7TE.A1L("recent_time_on_story", "3341"), AnonymousClass7TE.A1L("item_consumed_in_story_session", "3347"), AnonymousClass7TE.A1L("ad_consumed_in_story_session", "3349")));
    public static final Map A04 = DbY.A0q("last_story_session_end_timestamp", "3353", AnonymousClass7TE.A1L("item_consumed_in_story_session", "3346"), AnonymousClass7TE.A1L("ad_consumed_in_story_session", "3348"));
    public final UserSession A00;
    public final C258953zu A01;

    public final AnonymousClass40G ATg(OdinContext odinContext) {
        0sn A1C;
        C258953zu r3 = this.A01;
        AnonymousClass40G E6Z = ((AnonymousClass40N) r3.A01.getValue()).E6Z(0sr.A1P(new String[]{"recent_time_on_story", "item_consumed_in_story_session", "ad_consumed_in_story_session", "last_story_session_end_timestamp"}), 0);
        if (!E6Z.A02) {
            SOZ.A00((Exception) null, 002.A0R("Fail to read all records for story prefetch source from signal store, error: ", E6Z.A01));
            A1C = 0sn.A00;
        } else {
            A1C = AnonymousClass7TE.A1C();
            Iterator A0u = AnonymousClass7TF.A0u((Map) E6Z.A00);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                String A13 = DbT.A13(A1J);
                List list = (List) A1J.getValue();
                try {
                    if (0qQ.A0K(A13, "last_story_session_end_timestamp")) {
                        ArrayList A1C2 = AnonymousClass7TE.A1C();
                        long currentTimeMillis = System.currentTimeMillis();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            long A0H = Pxg.A0H(it);
                            long j = currentTimeMillis - A0H;
                            AnonymousClass7TE.A1Y(A1C2, j);
                            if (j <= 0) {
                                SOZ.A00((Exception) null, 002.A0Y("Wrong time since last story session value, currentTimestampMs is : ", ", sessionEndRecordMs: ", '}', currentTimeMillis, A0H));
                            }
                        }
                        list = A1C2;
                    }
                    if (list.isEmpty()) {
                        SOZ.A00((Exception) null, 002.A0R("Empty signal list for calculating feature, signal ID ", A13));
                    } else {
                        ArrayList A1C3 = AnonymousClass7TE.A1C();
                        String A0r = DbU.A0r(A13, A03);
                        if (A0r != null) {
                            C255463uA[] r0 = FeatureData.A0E;
                            Type type = Type.DOUBLE;
                            Iterator it2 = list.iterator();
                            long j2 = 0;
                            while (it2.hasNext()) {
                                j2 += Pxg.A0H(it2);
                            }
                            A1C3.add(new FeatureData(type, A0r, (String) null, (List) null, ((double) j2) / ((double) list.size()), 16372, 0));
                        }
                        String A0r2 = DbU.A0r(A13, A04);
                        if (A0r2 != null) {
                            C255463uA[] r02 = FeatureData.A0E;
                            A1C3.add(new FeatureData(Type.LONG, A0r2, (String) null, (List) null, 0.0d, 16376, AnonymousClass7TE.A0R(C66582MXn.A0r(list))));
                        }
                        A1C.addAll(A1C3);
                        if (0qQ.A0K(A13, "recent_time_on_story")) {
                            ArrayList A1C4 = AnonymousClass7TE.A1C();
                            List A0Z = 00k.A0Z(list);
                            Iterator A0u2 = AnonymousClass7TF.A0u(A02);
                            while (A0u2.hasNext()) {
                                Map.Entry A1J2 = AnonymousClass7TE.A1J(A0u2);
                                int A0C = Pxh.A0C(A0Z, (double) AnonymousClass7TE.A0M(A1J2.getKey()));
                                C255463uA[] r03 = FeatureData.A0E;
                                A1C4.add(new FeatureData(Type.LONG, (String) A1J2.getValue(), (String) null, (List) null, 0.0d, 16376, Pxg.A0I(A0Z, A0C - 1)));
                            }
                            A1C.addAll(A1C4);
                        }
                    }
                } catch (Exception e) {
                    SOZ.A00((Exception) null, AnonymousClass7TF.A0m("Error while extracting features, error message ", e));
                }
            }
        }
        return Pxf.A0M(A1C);
    }

    public final String getId() {
        return "StoryPrefetchV2";
    }

    public C12156So6(UserSession userSession, C258953zu r2) {
        AnonymousClass7TG.A1O(r2, userSession);
        this.A01 = r2;
        this.A00 = userSession;
    }
}
