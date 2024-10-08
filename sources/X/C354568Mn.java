package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.ArrayList;

/* renamed from: X.8Mn  reason: invalid class name and case insensitive filesystem */
public final class C354568Mn implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass8ME A00;

    public C354568Mn(AnonymousClass8ME r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        B3f A02;
        C391909ts r6 = (C391909ts) obj;
        0qQ.A0B(r6, 0);
        if (r6 instanceof C388209nS) {
            InteractiveDrawableContainer interactiveDrawableContainer = this.A00.A1m;
            int i = ((C388209nS) r6).A00;
            if (i != -1) {
                B3f A022 = InteractiveDrawableContainer.A02(interactiveDrawableContainer, i);
                if (A022 != null) {
                    ((C378669Qs) A022).A0I = "pinned_gallery_sticker_group";
                }
                InteractiveDrawableContainer.A0A(interactiveDrawableContainer, "pinned_gallery_sticker_group");
            }
        } else if (r6 instanceof C388219nT) {
            InteractiveDrawableContainer interactiveDrawableContainer2 = this.A00.A1m;
            int i2 = ((C388219nT) r6).A00;
            if (i2 != -1 && (A02 = InteractiveDrawableContainer.A02(interactiveDrawableContainer2, i2)) != null) {
                C378669Qs r2 = (C378669Qs) A02;
                String str = r2.A0I;
                r2.A0I = null;
                if (str != null) {
                    InteractiveDrawableContainer.A0A(interactiveDrawableContainer2, str);
                }
            }
        } else if (r6 instanceof C388229nU) {
            AnonymousClass8ME r0 = this.A00;
            C388229nU r62 = (C388229nU) r6;
            r0.A1A.Dnt(new ArrayList(r0.A1m.A0Z(r62.A00).values()), r62.A01);
        } else if (r6 instanceof C388239nV) {
            AnonymousClass8ME r4 = this.A00;
            C388239nV r63 = (C388239nV) r6;
            int i3 = r63.A00;
            Drawable drawable = r63.A01;
            r4.A0g.put(i3, r63.A02);
            AnonymousClass8ME.A0N(drawable, r4);
            AnonymousClass8ME.A0O(drawable, r4);
        } else if (r6 instanceof C388249nW) {
            C388249nW r64 = (C388249nW) r6;
            AnonymousClass8ME.A0P(r64.A01, this.A00, r64.A00, r64.A02, true);
        }
    }
}
