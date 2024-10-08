package X;

import android.graphics.Matrix;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.LinkedHashMap;

/* renamed from: X.8Og  reason: invalid class name and case insensitive filesystem */
public final class C355018Og implements AnonymousClass2hV {
    public final /* synthetic */ Matrix A00;
    public final /* synthetic */ InteractiveDrawableContainer A01;
    public final /* synthetic */ LinkedHashMap A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public C355018Og(Matrix matrix, InteractiveDrawableContainer interactiveDrawableContainer, LinkedHashMap linkedHashMap, boolean z, boolean z2) {
        this.A01 = interactiveDrawableContainer;
        this.A00 = matrix;
        this.A02 = linkedHashMap;
        this.A03 = z;
        this.A04 = z2;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Number number = (Number) obj;
        InteractiveDrawableContainer interactiveDrawableContainer = this.A01;
        if (number != null) {
            int intValue = number.intValue();
            C355008Of.A00(this.A00, interactiveDrawableContainer.A0M(intValue), interactiveDrawableContainer.A0N(intValue), this.A02, intValue, interactiveDrawableContainer.getWidth(), interactiveDrawableContainer.getHeight(), this.A03, this.A04);
            return null;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
