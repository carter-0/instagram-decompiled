package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.46y  reason: invalid class name and case insensitive filesystem */
public final class C2607646y implements C2365734g {
    public final /* synthetic */ C258273yk A00;

    public C2607646y(C258273yk r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        0qQ.A0B(view, 0);
        C258273yk r2 = this.A00;
        TextView textView = (TextView) view.requireViewById(R.id.feed_preview_keep_watching_text);
        0qQ.A0B(textView, 0);
        r2.A05 = textView;
        r2.A0C = 2b1.A01(view.findViewById(R.id.feed_preview_keep_watching_text_stub), false, false);
        ViewGroup viewGroup = (ViewGroup) view.requireViewById(R.id.feed_preview_keep_watching_button);
        0qQ.A0B(viewGroup, 0);
        r2.A02 = viewGroup;
        View requireViewById = view.requireViewById(R.id.feed_preview_keep_watching_backdrop);
        0qQ.A0B(requireViewById, 0);
        r2.A00 = requireViewById;
        r2.A0D = 2b1.A01(view.findViewById(R.id.feed_preview_watch_again_text_stub), false, false);
        r2.A08 = (TextView) view.findViewById(R.id.feed_preview_watch_again_text);
        r2.A07 = (TextView) view.findViewById(R.id.feed_preview_subscriptions_text);
        r2.A03 = (ViewGroup) view.findViewById(R.id.feed_preview_secondary_cta_button);
        r2.A06 = (TextView) view.findViewById(R.id.feed_preview_secondary_cta_button_text);
        r2.A01 = (ViewGroup) view.findViewById(R.id.feed_preview_bottom_cta_container);
        C252063oV A01 = 2b1.A01(view.findViewById(R.id.feed_preview_endscreen_thumbnail_container_stub), false, false);
        A01.EeU(new AZZ(r2));
        r2.A0B = A01;
    }
}
