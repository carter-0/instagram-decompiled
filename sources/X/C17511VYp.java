package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.Map;

/* renamed from: X.VYp  reason: case insensitive filesystem */
public final class C17511VYp {
    public final View A00;
    public final TextView A01;
    public final AnonymousClass0eM A02;
    public final C315696kN A03;

    public C17511VYp(View view, AnonymousClass07Z r11, AnonymousClass07g r12) {
        0qQ.A0B(r12, 1);
        this.A02 = C49154EqL.A00(new WEG(), r12, new 0Yh(U91.class));
        View requireViewById = view.requireViewById(R.id.message_composer_container);
        DbU.A12(requireViewById.getContext(), requireViewById, 2131971558);
        this.A00 = requireViewById;
        this.A01 = AnonymousClass7TG.A0R(view, R.id.composer_text);
        View requireViewById2 = view.requireViewById(R.id.reel_view_group);
        0qQ.A0C(requireViewById2, "null cannot be cast to non-null type com.instagram.reels.listener.StoryViewerGestureProvider");
        C315696kN r8 = (C315696kN) requireViewById2;
        this.A03 = r8;
        AnonymousClass07V lifecycle = r11.getLifecycle();
        C16487Uvi uvi = C16487Uvi.A02;
        JK0 jk0 = new JK0(this, 23);
        AnonymousClass7TG.A1N(r8, lifecycle);
        C17275VPc vPc = (C17275VPc) C64072LLq.A00(lifecycle).A00.getValue();
        Map map = vPc.A00;
        boolean A1P = AnonymousClass7TF.A1P(map.isEmpty() ? 1 : 0);
        map.put(uvi, jk0);
        r8.A92(new C19496Wai(vPc, A1P));
        WB0.A00(requireViewById, 19, this);
        AnonymousClass7TE.A1Z(new MGD(r11, this, (AnonymousClass4D7) null, 5), AnonymousClass07a.A00(r11));
    }
}
