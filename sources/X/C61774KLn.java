package X;

import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.KLn  reason: case insensitive filesystem */
public final class C61774KLn extends C60382Jkb {
    public final 0sP A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61774KLn(0sP r2) {
        super(r2);
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C61777KLq(DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.layout_stacked_timeline_bottom_sheet_tts_voice_grid_item, false), this);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r3, int i) {
        C60517Jmo jmo = (C60517Jmo) r3;
        0qQ.A0B(jmo, 0);
        jmo.A00((AnonymousClass8IM) this.A00.get(i), this.A00);
    }
}
