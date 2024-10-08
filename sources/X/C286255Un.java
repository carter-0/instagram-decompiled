package X;

import android.content.Context;
import androidx.compose.ui.text.font.AndroidFontLoader;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;

/* renamed from: X.5Un  reason: invalid class name and case insensitive filesystem */
public abstract class C286255Un {
    public static final FontFamilyResolverImpl A00(Context context) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), new C286285Ur(C286275Uq.A00(context)));
    }
}
