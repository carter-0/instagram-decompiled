package X;

import com.instagram.ui.text.TextColors;
import com.instagram.ui.text.TextShadow;

/* renamed from: X.8bf  reason: invalid class name and case insensitive filesystem */
public final class C358908bf implements C358888bd {
    public final TextColors ALC(int i) {
        TextShadow textShadow;
        if (i == -1) {
            textShadow = TextShadow.A04;
        } else {
            textShadow = TextShadow.A03;
        }
        return new TextColors(textShadow, i);
    }
}
