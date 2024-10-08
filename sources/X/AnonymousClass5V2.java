package X;

import androidx.compose.ui.text.font.AsyncTypefaceCache;
import androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.5V2  reason: invalid class name */
public final class AnonymousClass5V2 {
    public static final CoroutineExceptionHandler A02 = new FontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key);
    public C262224Cq A00;
    public final AsyncTypefaceCache A01;

    public AnonymousClass5V2(AsyncTypefaceCache asyncTypefaceCache, C262094Cc r5) {
        this.A01 = asyncTypefaceCache;
        this.A00 = 19E.A02(A02.plus(AnonymousClass5V4.A00).plus(r5).plus(new AnonymousClass19G((C262204Co) r5.get(C262204Co.A00))));
    }

    public AnonymousClass5V2() {
        this(new AsyncTypefaceCache(), 19B.A00);
    }
}
