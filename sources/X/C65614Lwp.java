package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Lwp  reason: case insensitive filesystem */
public class C65614Lwp implements C337237fw, G77 {
    public C337257fy A00;
    public boolean A01;
    public final View A02;
    public final UserSession A03;
    public final IgdsInlineSearchBox A04;
    public final Context A05;
    public final AnonymousClass07i A06;
    public final K9H A07;

    public final void A00() {
        this.A01 = false;
        this.A02.setVisibility(8);
        IgdsInlineSearchBox igdsInlineSearchBox = this.A04;
        igdsInlineSearchBox.A0E.setText("");
        igdsInlineSearchBox.A03();
        this.A07.A02();
    }

    public final void Dam(C337257fy r7) {
        K9H k9h;
        0qQ.A0B(r7, 0);
        if (this.A01) {
            String BiY = r7.BiY();
            if (BiY == null || BiY.length() == 0) {
                k9h = this.A07;
                List list = k9h.A0E;
                if (AnonymousClass7TE.A1b(DbU.A0K(list))) {
                    k9h.clear();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C61036Jva.A00(k9h, it);
                    }
                    k9h.notifyDataSetChangedSmart();
                }
            }
            k9h = this.A07;
            List list2 = (List) r7.Bo1();
            boolean isLoading = r7.isLoading();
            0qQ.A0B(list2, 0);
            k9h.clear();
            if (isLoading) {
                k9h.addModel(k9h.A0F.getValue(), k9h.A0G.getValue(), k9h.A0C);
            } else if (list2.isEmpty()) {
                k9h.addModel(k9h.A07.getString(2131968486), k9h.A0B);
            } else {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    User A0k = DbT.A0k(it2);
                    List list3 = k9h.A0D;
                    boolean z = false;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it3 = list3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (0qQ.A0K(((C61036Jva) it3.next()).A02, A0k)) {
                                    z = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    k9h.addModel(new C61036Jva(A0k, z, k9h.A04), k9h.A08);
                }
            }
            k9h.notifyDataSetChangedSmart();
        }
    }

    public final void onSearchCleared(String str) {
    }

    public final void onSearchTextChanged(String str) {
        0qQ.A0B(str, 0);
        C337257fy r0 = this.A00;
        if (r0 != null) {
            r0.EhX(str);
        } else {
            0qQ.A0F("searchProvider");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void A01(String str, String str2) {
        C336297eO A002 = C336237eI.A00(new AWR(this, 11), this.A03, new C228602lw(this.A05, this.A06, (Integer) null), new C65617Lws(this, str2, str, 1), "coefficient_besties_list_ranking", (List) null, true);
        this.A00 = A002;
        A002.EcJ(this);
    }

    public C65614Lwp(Context context, View view, AnonymousClass07i r8, UserSession userSession, IgdsInlineSearchBox igdsInlineSearchBox, K9H k9h, String str) {
        AnonymousClass7TG.A1Q(userSession, igdsInlineSearchBox);
        this.A05 = context;
        this.A03 = userSession;
        this.A04 = igdsInlineSearchBox;
        this.A02 = view;
        this.A06 = r8;
        this.A07 = k9h;
        A01("users/search/", str == null ? "top_search_page" : str);
        igdsInlineSearchBox.A02 = this;
        C66347MOe mOe = C66347MOe.A00;
        0qQ.A0B(mOe, 0);
        this.A04.A00 = new LYL(3, mOe, this);
        MLV mlv = MLV.A00;
        0qQ.A0B(mlv, 0);
        LY7.A00(this.A02, 44, mlv, this);
    }
}
