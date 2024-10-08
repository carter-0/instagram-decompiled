package X;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.Comparator;

/* renamed from: X.6Je  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C305696Je implements Comparator {
    public final /* synthetic */ 0sL A00;

    public /* synthetic */ C305696Je(0sL r1) {
        this.A00 = r1;
    }

    public final int compare(Object obj, Object obj2) {
        0sL r1 = this.A00;
        01K r0 = AndroidComposeViewAccessibilityDelegateCompat.A0Y;
        return ((Number) r1.invoke(obj, obj2)).intValue();
    }
}
