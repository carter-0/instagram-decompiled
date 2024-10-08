package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.GzZ  reason: case insensitive filesystem */
public final class C54104GzZ extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "FloatingSocialContextNuxFragment";
    public C55612HkX A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        0xY A0g = AnonymousClass7TG.A0g(DbX.A0h(this.A01).A01, "friendly_feed_nux_seen_count");
        A0g.E5c("friendly_feed_nux_last_shown_time_ms", System.currentTimeMillis());
        A0g.apply();
        ((C3021461u) AnonymousClass7TF.A0F(view, R.id.note_action_buttons)).setPrimaryAction(view.getContext().getString(2131956615), new C56800ICx(this, 22));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(99547764);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.floating_social_context_nux_landing, viewGroup, false);
        AnonymousClass0fD.A09(-1535164644, A02);
        return inflate;
    }
}
