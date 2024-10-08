package X;

import androidx.compose.ui.Modifier;
import com.instagram.compose.ui.bouncy.BouncyClickableElement;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.GaC  reason: case insensitive filesystem */
public abstract class C52638GaC {
    public static final Modifier A01(C286575Wy r12, Modifier modifier, C62320sa r14) {
        return A00(r12, modifier, (C287625aV) null, (String) null, (C62320sa) null, r14, 0.0f, 0.0f, 0.0f, 0.0f, 255, false);
    }

    @Deprecated(message = "Use [BouncyIndication] on the Modifier.clickable directly.", replaceWith = @ReplaceWith(expression = "combinedClickable(interactionSource = remember { MutableInteractionSource() }, indication = BouncyIndication(pressedScale = pressedScale, pressStiffness = pressStiffness, unpressStiffness = unpressStiffness, initialClickedVelocity = initialClickedVelocity), enabled = enabled, onClickLabel = onClickLabel, role = role, onClick = onClick, onLongClick = onLongClick )", imports = {"androidx.compose.foundation.combinedClickable"}))
    public static final Modifier A00(C286575Wy r14, Modifier modifier, C287625aV r16, String str, C62320sa r18, C62320sa r19, float f, float f2, float f3, float f4, int i, boolean z) {
        C62320sa r7 = r18;
        C287625aV r5 = r16;
        String str2 = str;
        float f5 = f4;
        float f6 = f3;
        float f7 = f2;
        float f8 = f;
        C62320sa r8 = r19;
        AnonymousClass7TF.A1G(modifier, 0, r8);
        r14.ExS(-796097350);
        int i2 = i;
        boolean A1R = C51966G9m.A1R(i & 1, z);
        if ((i & 2) != 0) {
            f8 = 0.9f;
        }
        if ((i & 4) != 0) {
            f7 = 400.0f;
        }
        if ((i & 8) != 0) {
            f6 = 400.0f;
        }
        if ((i & 16) != 0) {
            f5 = 0.0f;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            r5 = null;
        }
        if ((i2 & 128) != 0) {
            r7 = null;
        }
        if (0fL.A02()) {
            0fL.A01(-1022944216, "com.instagram.compose.ui.bouncy.bouncyClickable (BouncyClickable.kt:48)");
        }
        C287605aT r4 = (C287605aT) C51974G9v.A0V(r14, -373679344);
        C286565Wx A0G = C51965G9l.A0G(r14);
        Modifier Ezh = C288275be.A00(r4, C288265bd.A00(r4, modifier, A1R).Ezh(C288255bc.A00), A1R).Ezh(new BouncyClickableElement(r4, r5, str2, r7, r8, f8, f7, f6, f5, A1R));
        if (0fL.A02()) {
            0fL.A00(-1150990326);
        }
        C286565Wx.A0I(A0G);
        return Ezh;
    }
}
