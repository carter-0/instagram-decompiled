package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.PollType;
import com.instagram.api.schemas.StoryPollColorType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CoK  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44981CoK {
    public static Map A00(C272034jz r5) {
        TreeUpdaterJNI treeUpdaterJNI;
        ArrayList arrayList;
        String str;
        String str2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        ArrayList arrayList2 = null;
        if (r5.Aoy() != null) {
            StoryPollColorType Aoy = r5.Aoy();
            if (Aoy != null) {
                str2 = Aoy.A00;
            } else {
                str2 = null;
            }
            A1H.put("color", str2);
        }
        if (r5.B2k() != null) {
            A1H.put("expires_at", r5.B2k());
        }
        if (r5.B60() != null) {
            A1H.put("finished", r5.B60());
        }
        if (r5.getId() != null) {
            C41845B3m.A0x(r5.getId(), A1H);
        }
        if (r5.CXp() != null) {
            A1H.put("is_multi_option_poll", r5.CXp());
        }
        if (r5.Cbm() != null) {
            A1H.put("is_shared_result", r5.Cbm());
        }
        if (r5.getPollId() != null) {
            A1H.put("poll_id", r5.getPollId());
        }
        if (r5.Bda() != null) {
            PollType Bda = r5.Bda();
            if (Bda != null) {
                str = Bda.A00;
            } else {
                str = null;
            }
            A1H.put("poll_type", str);
        }
        if (r5.Bhl() != null) {
            List<C272014jx> Bhl = r5.Bhl();
            if (Bhl != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C272014jx r0 : Bhl) {
                    if (r0 != null) {
                        arrayList.add(r0.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            A1H.put(AnonymousClass000.A00(5150), arrayList);
        }
        if (r5.getQuestion() != null) {
            A1H.put("question", r5.getQuestion());
        }
        if (r5.BxM() != null) {
            C258223yf BxM = r5.BxM();
            if (BxM != null) {
                treeUpdaterJNI = BxM.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("social_context", treeUpdaterJNI);
        }
        if (r5.C48() != null) {
            List<C272014jx> C48 = r5.C48();
            if (C48 != null) {
                arrayList2 = AnonymousClass7TE.A1C();
                for (C272014jx r02 : C48) {
                    if (r02 != null) {
                        arrayList2.add(r02.FHC());
                    }
                }
            }
            A1H.put("tallies", arrayList2);
        }
        if (r5.C8u() != null) {
            A1H.put("total_votes", r5.C8u());
        }
        if (r5.CEx() != null) {
            A1H.put("viewer_can_vote", r5.CEx());
        }
        if (r5.CF6() != null) {
            A1H.put(AnonymousClass000.A00(5381), r5.CF6());
        }
        if (r5.CFI() != null) {
            A1H.put("viewer_vote", r5.CFI());
        }
        return 0Yt.A0B(A1H);
    }
}
