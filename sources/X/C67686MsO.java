package X;

import android.content.Context;
import android.widget.BaseAdapter;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.MsO  reason: case insensitive filesystem */
public final class C67686MsO extends BaseAdapter {
    public C70752OJy A00;
    public final UserSession A01;
    public final C71144Ody A02;
    public final List A03;
    public final Context A04;

    public final long getItemId(int i) {
        return (long) i;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            r0 = 2
            X.0qQ.A0B(r7, r0)
            boolean r0 = r6 instanceof com.instagram.common.ui.base.IgSimpleImageView
            r2 = 0
            if (r0 == 0) goto L_0x007b
            com.instagram.common.ui.base.IgSimpleImageView r6 = (com.instagram.common.ui.base.IgSimpleImageView) r6
        L_0x000b:
            android.content.Context r3 = r4.A04
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r3)
            if (r6 != 0) goto L_0x0022
            r0 = 2131628619(0x7f0e124b, float:1.8884536E38)
            android.view.View r1 = X.DbT.A0C(r1, r7, r0)
            boolean r0 = r1 instanceof com.instagram.common.ui.base.IgSimpleImageView
            if (r0 == 0) goto L_0x0021
            r2 = r1
            com.instagram.common.ui.base.IgSimpleImageView r2 = (com.instagram.common.ui.base.IgSimpleImageView) r2
        L_0x0021:
            r6 = r2
        L_0x0022:
            if (r5 != 0) goto L_0x0037
            if (r6 == 0) goto L_0x0036
            r0 = 2131237848(0x7f081bd8, float:1.8091958E38)
            X.C67587MqL.A07(r6, r0)
            r0 = 63
            X.Ok1 r1 = new X.Ok1
            r1.<init>((java.lang.Object) r4, (int) r0)
        L_0x0033:
            X.AnonymousClass0fU.A00(r1, r6)
        L_0x0036:
            return r6
        L_0x0037:
            r0 = 5
            if (r5 > r0) goto L_0x0070
            int r1 = X.AnonymousClass7TG.A02(r3)
            X.8vV r2 = new X.8vV
            r2.<init>(r3, r1)
            java.util.List r0 = r4.A03
            java.lang.String r0 = X.C51966G9m.A1G(r0, r5)
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = X.DbV.A12(r0)
            if (r0 != 0) goto L_0x0053
        L_0x0051:
            java.lang.String r0 = ""
        L_0x0053:
            r2.A0M(r0)
            float r0 = (float) r1
            r2.A0A(r0)
            if (r6 == 0) goto L_0x0036
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r6)
            X.Jcq r0 = new X.Jcq
            r0.<init>(r1, r2)
            r6.setImageDrawable(r0)
            r0 = 8
        L_0x006a:
            X.Ok3 r1 = new X.Ok3
            r1.<init>(r4, r5, r0)
            goto L_0x0033
        L_0x0070:
            if (r6 == 0) goto L_0x0036
            r0 = 2131238672(0x7f081f10, float:1.809363E38)
            X.C67587MqL.A07(r6, r0)
            r0 = 9
            goto L_0x006a
        L_0x007b:
            r6 = r2
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67686MsO.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final int getCount() {
        return this.A03.size();
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        Object A0O = 00k.A0O(this.A03, i);
        if (A0O == null) {
            return "";
        }
        return A0O;
    }

    public C67686MsO(Context context, UserSession userSession, C71144Ody ody) {
        AnonymousClass7TG.A1Q(userSession, ody);
        this.A04 = context;
        this.A01 = userSession;
        this.A02 = ody;
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A03 = A1C;
        List A042 = 1Av.A04(1Au.A00(userSession), "friend_map_recent_emoji_list");
        A042 = A042.isEmpty() ? AnonymousClass7TE.A1C() : A042;
        if (A042.isEmpty()) {
            A1C.addAll(0sr.A1P(new String[]{"📍", "👀", "🔥", "🎉", "😴"}));
            1Av.A06(1Au.A00(userSession), "friend_map_recent_emoji_list", A1C);
            A1C.add(0, "placeHolderCreateNote");
        } else {
            A1C.add("placeHolderCreateNote");
            A1C.addAll(A042);
        }
        A1C.add("placeHolderCustomEmoji");
    }
}
