package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.6Pm  reason: invalid class name and case insensitive filesystem */
public final class C307276Pm implements C2365734g {
    public final /* synthetic */ C307266Pl A00;

    public C307276Pm(C307266Pl r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        0qQ.A0B(view, 0);
        C307266Pl r3 = this.A00;
        View requireViewById = view.requireViewById(R.id.end_scene_container);
        0qQ.A0B(requireViewById, 0);
        r3.A01 = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.end_scene_overlay);
        0qQ.A0B(requireViewById2, 0);
        r3.A02 = requireViewById2;
        TextView textView = (TextView) view.requireViewById(R.id.end_scene_title);
        0qQ.A0B(textView, 0);
        r3.A05 = textView;
        TextView textView2 = (TextView) view.requireViewById(R.id.end_scene_subtitle);
        0qQ.A0B(textView2, 0);
        r3.A04 = textView2;
        View requireViewById3 = view.requireViewById(R.id.cta_button_post_dwell);
        0qQ.A0B(requireViewById3, 0);
        r3.A00 = requireViewById3;
        r3.A06 = new C306276Ln(2b1.A01(view.requireViewById(R.id.reel_endscene_cta_sticker_stub), false, false));
        TextView textView3 = (TextView) view.requireViewById(R.id.cta_button_post_dwell_text);
        0qQ.A0B(textView3, 0);
        r3.A03 = textView3;
        Integer num = AnonymousClass05K.A00;
        r3.A08 = new AnonymousClass6PD(2b1.A01(view.requireViewById(R.id.social_context_stub), false, false), num);
        r3.A07 = new AnonymousClass6P0(2b1.A01(view.requireViewById(R.id.popularity_proof_stub), false, false), num);
    }
}
