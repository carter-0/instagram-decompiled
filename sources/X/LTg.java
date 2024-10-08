package X;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

public final class LTg implements LayoutTransition.TransitionListener {
    public final /* synthetic */ IgdsInlineSearchBox A00;

    public LTg(IgdsInlineSearchBox igdsInlineSearchBox) {
        this.A00 = igdsInlineSearchBox;
    }

    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        this.A00.A05 = false;
    }

    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        this.A00.A05 = true;
    }
}
