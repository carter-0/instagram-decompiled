package X;

import android.widget.ListView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.tagging.model.Tag;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.Set;

/* renamed from: X.EMk  reason: case insensitive filesystem */
public final class C47916EMk extends C249383je implements G6S {
    public ListView A00;
    public final AnonymousClass0iw A01;
    public final 1iA A02;
    public final C46446Df8 A03;
    public final String A04;
    public final Set A05 = AnonymousClass7TE.A1F();

    public final void EG6(UserSession userSession, int i) {
        Object itemAtPosition;
        String id;
        String name;
        String A022;
        String str;
        ListView listView = this.A00;
        if (listView != null && (itemAtPosition = listView.getItemAtPosition(i)) != null) {
            if (C61066Jw4.A00(8, itemAtPosition)) {
                itemAtPosition = DbV.A0j(userSession, ((Tag) ((C61066Jw4) itemAtPosition).A00).getId());
            }
            if (itemAtPosition instanceof User) {
                User user = (User) itemAtPosition;
                id = user.getId();
                name = user.getUsername();
                A022 = user.B6o().toString();
                str = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
            } else if (itemAtPosition instanceof Product) {
                Product product = (Product) itemAtPosition;
                id = product.A0H;
                name = product.A0J;
                A022 = null;
                str = "product";
            } else if (itemAtPosition instanceof Hashtag) {
                Hashtag hashtag = (Hashtag) itemAtPosition;
                id = hashtag.getId();
                name = hashtag.getName();
                A022 = C281965Ag.A02(hashtag);
                str = "hashtag";
            } else {
                0wb.A03("TaggedItemImpressionLogger", "Item not instance of TaggedUser, User, Product, or Hashtag");
                return;
            }
            if (this.A05.add(id)) {
                AnonymousClass0iw r0 = this.A01;
                String str2 = "";
                String str3 = str2;
                if (id != null) {
                    str3 = id;
                }
                if (name != null) {
                    str2 = name;
                }
                String str4 = this.A04;
                1iA r4 = this.A02;
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r0, userSession), "instagram_tag_list_item_impression");
                if (A0e.isSampled()) {
                    A0e.A9F("entity_id", Long.valueOf(str3));
                    A0e.AAJ(C273654mx.A00(276), str2);
                    A0e.A9F("list_position", DbV.A0p(A0e, "entity_type", str, i));
                    A0e.AAJ("m_pk", str4);
                    A0e.A9F("m_t", DbS.A0j(r4.A00));
                    A0e.AAJ("follow_status", A022);
                    A0e.Cgf();
                }
            }
        }
    }

    public C47916EMk(AnonymousClass0iw r2, UserSession userSession, 1iA r4, String str) {
        this.A01 = r2;
        this.A04 = str;
        this.A02 = r4;
        this.A03 = new C46446Df8(userSession, this);
    }

    public final void onScroll(C238133Ar r10, int i, int i2, int i3, int i4, int i5) {
        int A032 = AnonymousClass0fD.A03(-754360104);
        this.A03.onScroll(r10, i, i2, i3, i4, i5);
        AnonymousClass0fD.A0A(1184084559, A032);
    }

    public final void onScrollStateChanged(C238133Ar r3, int i) {
        int A032 = AnonymousClass0fD.A03(1558680802);
        this.A03.onScrollStateChanged(r3, i);
        AnonymousClass0fD.A0A(2120155319, A032);
    }
}
