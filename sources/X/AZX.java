package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

public final class AZX implements C2365734g {
    public final /* synthetic */ AnonymousClass7VH A00;

    public AZX(AnonymousClass7VH r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        0qQ.A0B(view, 0);
        AnonymousClass7VH r8 = this.A00;
        r8.A02 = view;
        TextView A0d = AnonymousClass7TE.A0d(view, R.id.channel_name);
        TextView A0d2 = AnonymousClass7TE.A0d(view, R.id.channel_context);
        TextView A0d3 = AnonymousClass7TE.A0d(view, R.id.channel_join_explainer);
        View findViewById = view.findViewById(R.id.background);
        C329967Kx r6 = (C329967Kx) r8.A0A.invoke();
        AnonymousClass7S7 C6l = ((C333517Zg) r8.A09.invoke()).C6l();
        Object obj = C6l.AeX().A00;
        0qQ.A06(obj);
        view.findViewById(R.id.profile_picture).setUrl((ImageUrl) obj, r8.A06);
        A0d.setText(C6l.C6f());
        A0d2.setText(C66637Ma6.A00(r8.A05.requireContext(), Integer.valueOf(C6l.BRT())));
        int i = r6.A03;
        if (i != 0) {
            A0d2.setTextColor(i);
            A0d3.setTextColor(i);
        }
        findViewById.setBackgroundColor(r6.A07);
    }
}
