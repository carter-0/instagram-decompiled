package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.model.shopping.ProductTag;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.LyK  reason: case insensitive filesystem */
public final class C65705LyK implements C66571MXb {
    public C61062Jw0 A00;
    public final Context A01;
    public final View A02;
    public final C61062Jw0 A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final AnonymousClass3Q2 A06;
    public final String A07;
    public final K55 A08;

    public C65705LyK(Context context, View view, AnonymousClass0iw r4, UserSession userSession, K55 k55, AnonymousClass3Q2 r7, String str) {
        C61062Jw0 jw0;
        0qQ.A0B(userSession, 2);
        this.A01 = context;
        this.A05 = userSession;
        this.A02 = view;
        this.A08 = k55;
        this.A04 = r4;
        this.A06 = r7;
        this.A07 = str;
        if (r7 != null) {
            jw0 = r7.A0q;
        } else {
            jw0 = null;
        }
        this.A03 = jw0;
        this.A00 = jw0;
    }

    public final void A8A(User user) {
    }

    public final FragmentActivity B7r() {
        return null;
    }

    public final void D6L(User user) {
    }

    public final void DBl(Context context, User user, String str, int i) {
    }

    public final void DDy(FBUserTag fBUserTag) {
    }

    public final void DDz(FBUserTag fBUserTag) {
    }

    public final void DJ8(User user, boolean z) {
    }

    public final void DRY(User user, int i) {
    }

    public final void DdP(User user) {
    }

    public final void DqV() {
    }

    public final void DwV(User user, int i) {
    }

    public final void EBX(View view) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.instagram.tagging.api.model.MediaSuggestedProductTag} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.instagram.tagging.api.model.MediaSuggestedProductTag} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.instagram.tagging.model.Tag} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: com.instagram.tagging.api.model.MediaSuggestedProductTag} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043 A[EDGE_INSN: B:18:0x0043->B:14:0x0043 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(com.instagram.user.model.Product r13, java.lang.String r14) {
        /*
            r12 = this;
            com.instagram.common.session.UserSession r6 = r12.A05
            boolean r11 = X.C63447KxC.A00(r6)
            X.3Q2 r1 = r12.A06
            if (r1 == 0) goto L_0x004b
            java.lang.String r9 = r1.A2g
            if (r9 == 0) goto L_0x004b
            java.util.ArrayList r0 = r1.A43
            X.0iw r5 = r12.A04
            boolean r10 = r1.A0u()
            r7 = 0
            if (r0 == 0) goto L_0x004b
            java.util.Iterator r4 = r0.iterator()
        L_0x001d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0043
            java.lang.Object r3 = r4.next()
            r2 = r3
            com.instagram.tagging.model.Tag r2 = (com.instagram.tagging.model.Tag) r2
            java.lang.String r1 = r2.getId()
            java.lang.String r0 = r13.A0H
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0042
            java.lang.String r1 = r2.A04()
            java.lang.String r0 = r13.A0J
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001d
        L_0x0042:
            r7 = r3
        L_0x0043:
            com.instagram.tagging.api.model.MediaSuggestedProductTag r7 = (com.instagram.tagging.api.model.MediaSuggestedProductTag) r7
            if (r7 == 0) goto L_0x004b
            r8 = r14
            X.LTX.A0B(r5, r6, r7, r8, r9, r10, r11)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65705LyK.A00(com.instagram.user.model.Product, java.lang.String):void");
    }

    public final ArrayList A01() {
        C61062Jw0 jw0 = this.A00;
        String str = this.A07;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = C64182LSo.A01(jw0, str).iterator();
        while (it.hasNext()) {
            A1C.add(new ProductTag((Product) it.next()));
        }
        return A1C;
    }

    public final void Cu2(Product product) {
        C61062Jw0 A002;
        ArrayList A1C;
        C61062Jw0 jw0 = this.A00;
        if (jw0 != null) {
            Collection collection = (Collection) jw0.A01;
            if (collection != null) {
                A1C = AnonymousClass7TE.A1D(collection);
            } else {
                A1C = AnonymousClass7TE.A1C();
            }
            BBU A012 = LSG.A01(product);
            if (A012 != null) {
                A1C.add(A012);
                A002 = this.A00;
                if (A002 != null) {
                    A002.A01 = A1C;
                }
            } else {
                return;
            }
        } else {
            A002 = LSG.A00((ProductCollection) null, (String) null, this.A07, AnonymousClass7TE.A1I(product));
            this.A00 = A002;
        }
        AnonymousClass3Q2 r0 = this.A06;
        if (r0 != null) {
            r0.A0q = A002;
        }
        this.A08.A01();
        A00(product, "add");
    }

    public final void D87(Product product) {
        String str;
        ArrayList A012 = C64182LSo.A01(this.A00, this.A07);
        A012.remove(product);
        C61062Jw0 jw0 = this.A00;
        if (jw0 != null) {
            str = jw0.A02;
        } else {
            str = null;
        }
        C61062Jw0 A002 = LSG.A00((ProductCollection) null, (String) null, str, A012);
        this.A00 = A002;
        AnonymousClass3Q2 r0 = this.A06;
        if (r0 != null) {
            r0.A0q = A002;
        }
        this.A08.A01();
        A00(product, "remove");
    }

    public final void D88(ProductCollection productCollection) {
        C61062Jw0 jw0 = this.A00;
        if (jw0 != null) {
            jw0.A03 = null;
            jw0.A00 = null;
        }
        AnonymousClass3Q2 r0 = this.A06;
        if (r0 != null) {
            r0.A0q = jw0;
        }
        this.A08.A01();
    }

    public final boolean EtC(Product product) {
        return C63447KxC.A00(this.A05);
    }
}
