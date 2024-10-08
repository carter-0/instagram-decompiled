package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.8hm  reason: invalid class name and case insensitive filesystem */
public final class C362368hm extends C232222tE {
    public final UserSession A00;
    public final AnonymousClass8XH A01;
    public final C362018hC A02;
    public final C362358hl A03;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.gallery_drafts_item, viewGroup, false);
        0qQ.A0A(inflate);
        Context context = inflate.getContext();
        0qQ.A07(context);
        UserSession userSession = this.A00;
        0nA.A0f(inflate, AnonymousClass8XE.A02(context));
        0nA.A0V(inflate, AnonymousClass1GB.A01(((float) AnonymousClass8XE.A02(context)) / 0.5625f));
        return new C380629Yx(inflate, userSession, this.A02, this.A03);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r28, C249703kE r29) {
        C349307zv r2;
        C362408hq r8 = (C362408hq) r28;
        C380629Yx r7 = (C380629Yx) r29;
        0qQ.A0B(r8, 0);
        0qQ.A0B(r7, 1);
        C369988ve r5 = r8.A01;
        boolean A0K = 0qQ.A0K(r7.A00, r5);
        r7.A00 = r5;
        ImageView imageView = r7.A03;
        imageView.setBackground(r7.A01);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        ImageView imageView2 = r7.A04;
        C362358hl r4 = this.A03;
        C394599yN.A00(imageView2, r4.A02, A0K);
        boolean contains = r4.A0A.contains(r5);
        C59740JVy jVy = r7.A0A;
        int i = -1;
        if (contains) {
            i = 1;
        }
        jVy.A00(i);
        C394599yN.A00(r7.A02, contains, A0K);
        UserSession userSession = this.A00;
        if (1Au.A00(userSession).A1r()) {
            long j = 1Au.A00(userSession).A01.getLong("story_drafts_expiration_nux_seen_timestamp_ms", 0);
            long j2 = r5.A00;
            if (j < j2) {
                j = j2;
            }
            TextView textView = r7.A06;
            textView.setVisibility(0);
            Context context = r7.itemView.getContext();
            0qQ.A07(context);
            double currentTimeMillis = (double) (System.currentTimeMillis() / 1000);
            Resources resources = context.getResources();
            0qQ.A07(resources);
            textView.setText(1G0.A0D(resources, C247743gq.SECONDS, AnonymousClass05K.A0C, currentTimeMillis, (double) ((j + 604800000) / 1000), false, true, false, false, false));
        } else {
            r7.A06.setVisibility(8);
        }
        C363928ka A002 = r5.A00();
        C365758nd r1 = null;
        if (A002 != null) {
            r2 = A002.A04;
        } else {
            r2 = null;
        }
        C363928ka A003 = r5.A00();
        if (A003 != null) {
            r1 = A003.A02;
        }
        if (r1 != C365758nd.A07 || r2 == null) {
            r7.A05.setVisibility(8);
        } else {
            TextView textView2 = r7.A05;
            textView2.setVisibility(0);
            textView2.setText(C347917xa.A01(r2.A07));
        }
        View view = r7.itemView;
        0qQ.A06(view);
        int i2 = r8.A00;
        C63847L9c l9c = r4.A00;
        if (l9c != null) {
            String str = r5.A05;
            r5.A00();
            Pair pair = new Pair(Integer.valueOf((i2 / 3) + 1), Integer.valueOf((i2 % 3) + 1));
            0qQ.A0B(str, 2);
            l9c.A03.put(view, new C39652A3s(pair));
        }
        this.A01.A01(r7, r5);
    }

    public final Class modelClass() {
        return C362408hq.class;
    }

    public C362368hm(UserSession userSession, AnonymousClass8XH r2, C362018hC r3, C362358hl r4) {
        this.A00 = userSession;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }
}
