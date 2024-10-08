package X;

import android.content.Context;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.HdV  reason: case insensitive filesystem */
public abstract class C55179HdV {
    public static final void A00(IgdsBottomButtonLayout igdsBottomButtonLayout, C55790HnP hnP) {
        0qQ.A0B(igdsBottomButtonLayout, 0);
        Context context = igdsBottomButtonLayout.getContext();
        igdsBottomButtonLayout.setPrimaryAction(context.getString(hnP.A00), hnP.A02);
        igdsBottomButtonLayout.setPrimaryButtonEnabled(false);
        igdsBottomButtonLayout.setSecondaryAction(context.getString(hnP.A01), ID1.A00(hnP, 53));
    }
}
