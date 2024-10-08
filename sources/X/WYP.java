package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

public abstract class WYP implements AnonymousClass5Gs {
    public final C17517VYv A00 = new C17517VYv(Integer.valueOf(R.id.clips_tooltip_chevron_icon), R.layout.clips_media_interactivity_tooltip, R.id.clips_tooltip_title_text, R.id.clips_tooltip_subtitle_text);

    public final /* bridge */ /* synthetic */ C284395Mi ANJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C17517VYv vYv;
        if (this instanceof C16409UuR) {
            vYv = ((C16409UuR) this).A00;
        } else {
            vYv = this.A00;
        }
        return new C15993Uma(DbT.A0D(layoutInflater, viewGroup, vYv.A00, false), vYv.A03, vYv.A02, vYv.A01);
    }
}
