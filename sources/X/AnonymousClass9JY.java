package X;

import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import com.instagram.ar.core.discovery.minigallery.persistence.MiniGalleryCategoriesRepository;
import com.instagram.compose.ui.gradientspinner.GradientSpinnerNode;

/* renamed from: X.9JY  reason: invalid class name */
public final class AnonymousClass9JY extends C64101El {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9JY(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A04 = i;
        this.A05 = obj;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof AnonymousClass9JY) || ((AnonymousClass9JY) obj).A04 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.4D7, X.9JY] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A04;
        this.A03 = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        switch (i) {
            case 0:
                return ((AndroidEdgeEffectOverscrollEffect) this.A05).AC9(this, (0sL) null, 0);
            case 1:
                return ((NestedScrollNode) this.A05).DYa(this, 0);
            case 2:
                return ((MiniGalleryCategoriesRepository) this.A05).A00((AnonymousClass849) null, this, 0);
            default:
                return GradientSpinnerNode.A00((GradientSpinnerNode) this.A05, this);
        }
    }
}
