package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ui7  reason: case insensitive filesystem */
public final class C15762Ui7 extends C232222tE {
    public final UserSession A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: android.text.SpannableStringBuilder} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r13, X.C249703kE r14) {
        /*
            r12 = this;
            X.WS7 r13 = (X.WS7) r13
            X.UDJ r14 = (X.UDJ) r14
            r8 = 0
            boolean r7 = X.AnonymousClass7TF.A1U(r8, r13, r14)
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            X.Jvs r9 = r13.A00
            java.lang.Object r0 = r9.A00
            java.util.List r0 = (java.util.List) r0
            int r5 = r0.size()
            r4 = 0
        L_0x0019:
            if (r4 >= r5) goto L_0x006f
            java.lang.Object r0 = r9.A00
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r0.get(r4)
            com.instagram.api.schemas.TextWithEntitiesBlockDict r1 = (com.instagram.api.schemas.TextWithEntitiesBlockDict) r1
            com.instagram.common.textwithentities.model.TextWithEntities r11 = r1.A00
            if (r11 == 0) goto L_0x0068
            com.instagram.api.schemas.LinkAction r0 = r11.A00
            if (r0 == 0) goto L_0x0068
            android.content.Context r0 = r14.A00
            int r10 = X.DbU.A01(r0)
            X.VOz r1 = new X.VOz
            r1.<init>(r14)
            java.lang.String r0 = r11.A02
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = ""
        L_0x003e:
            android.text.SpannableString r3 = new android.text.SpannableString
            r3.<init>(r0)
            X.DjJ r2 = new X.DjJ
            r2.<init>(r10, r7, r1, r11)
            int r1 = r3.length()
            r0 = 17
            r3.setSpan(r2, r8, r1, r0)
        L_0x0051:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r6.append(r3)
            java.lang.Object r0 = r9.A00
            java.util.List r0 = (java.util.List) r0
            int r0 = X.C51966G9m.A06(r0)
            if (r4 == r0) goto L_0x0065
            java.lang.String r0 = " "
            r6.append(r0)
        L_0x0065:
            int r4 = r4 + 1
            goto L_0x0019
        L_0x0068:
            android.content.Context r0 = r14.A00
            android.text.SpannableStringBuilder r3 = X.C18186Vn0.A01(r0, r1)
            goto L_0x0051
        L_0x006f:
            android.widget.TextView r0 = r14.A01
            X.DbX.A1G(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15762Ui7.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return WS7.class;
    }

    public C15762Ui7(UserSession userSession) {
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        UserSession userSession = this.A00;
        boolean A1Y = C51970G9q.A1Y(userSession);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new UDJ(DbT.A0D(layoutInflater, viewGroup, R.layout.tagging_feed_text_block, A1Y), userSession);
    }
}
