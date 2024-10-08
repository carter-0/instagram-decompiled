package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.feed.feeditem.SuggestedChannels;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.Mvf  reason: case insensitive filesystem */
public final class C67835Mvf extends C249403jg {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ SuggestedChannels A01;

    public C67835Mvf(UserSession userSession, SuggestedChannels suggestedChannels) {
        this.A01 = suggestedChannels;
        this.A00 = userSession;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        C74530PwP pwP;
        String str;
        String str2;
        int A03 = AnonymousClass0fD.A03(-52534854);
        0qQ.A0B(recyclerView, 0);
        super.onScrolled(recyclerView, i, i2);
        C252553pI r1 = recyclerView.A0D;
        0qQ.A0C(r1, C273654mx.A00(7));
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r1;
        int A1c = linearLayoutManager.A1c();
        int A1d = linearLayoutManager.A1d();
        SuggestedChannels suggestedChannels = this.A01;
        String id = suggestedChannels.getId();
        Oy4 A002 = O15.A00(this.A00);
        if (A1c <= A1d) {
            while (true) {
                N33 n33 = suggestedChannels.A00;
                List list = n33.A07;
                if (!(list == null || (pwP = (C74530PwP) list.get(A1c)) == null || (str = ((N5I) pwP).A06) == null)) {
                    String str3 = n33.A03;
                    if (str3 == null) {
                        str3 = "";
                    }
                    boolean A1Z = C51972G9s.A1Z(((N5I) pwP).A01);
                    AnonymousClass7TF.A1C(id, 0, str3);
                    AbstractCollection abstractCollection = (AbstractCollection) A002.A02.get(id);
                    if (abstractCollection != null && !abstractCollection.contains(str)) {
                        abstractCollection.add(str);
                        0Aj A0e = AnonymousClass7TE.A0e(A002.A00, "igd_channels_client_actions");
                        if (A0e.isSampled()) {
                            A0e.AAJ("user_igid", A002.A01);
                            DbS.A1I(A0e, "channel_suggestion_impression");
                            DbS.A1M(A0e, "feed_netego");
                            DbS.A1L(A0e, "channel_suggestion_item");
                            DbS.A1J(A0e, "impression");
                            A0e.A9F("suggestion_position", DbV.A0p(A0e, "ig_thread_id", str, A1c));
                            A0e.AAJ("ranking_request_id", str3);
                            if (A1Z) {
                                str2 = "True";
                            } else {
                                str2 = "False";
                            }
                            C66583MXo.A18(A0e, AnonymousClass7TF.A0w("is_follower", str2));
                        }
                    }
                }
                if (A1c == A1d) {
                    break;
                }
                A1c++;
            }
        }
        AnonymousClass0fD.A0A(615419493, A03);
    }
}
