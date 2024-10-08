package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.KFf  reason: case insensitive filesystem */
public final class C61629KFf extends C232222tE {
    public final Context A00;
    public final AnonymousClass0iw A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        View A09 = DbU.A09(DbT.A0B(this.A00), viewGroup, R.layout.layout_iglive_post_live_avatar_title_row, false);
        A09.setTag(new C60629Joc(A09));
        Object tag = A09.getTag();
        if (tag instanceof C60629Joc) {
            return (C249703kE) tag;
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        int i;
        C64807LiS liS = (C64807LiS) r5;
        C60629Joc joc = (C60629Joc) r6;
        AnonymousClass7TG.A1N(liS, joc);
        AnonymousClass0iw r3 = this.A01;
        boolean A1Y = C51970G9q.A1Y(r3);
        joc.A02.setUrl(liS.A01, r3);
        Integer num = liS.A03;
        if (num != null) {
            i = JTT.A05(joc.A00, num.intValue());
        } else {
            i = 0;
        }
        View view = joc.A00;
        view.setPadding(i, A1Y ? 1 : 0, i, A1Y);
        TextView textView = joc.A01;
        Object obj = liS.A00;
        if (obj == null) {
            obj = liS.A06;
        }
        DbZ.A14(textView, obj);
        String str = liS.A04;
        if (str != null) {
            03v.A0B(view, new U7H(str, joc, 1));
        }
        LY5.A01(view, 28, liS);
    }

    public final Class modelClass() {
        return C64807LiS.class;
    }

    public C61629KFf(Context context, AnonymousClass0iw r2) {
        this.A00 = context;
        this.A01 = r2;
    }
}
