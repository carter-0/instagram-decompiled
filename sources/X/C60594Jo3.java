package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.Jo3  reason: case insensitive filesystem */
public final class C60594Jo3 extends C249703kE {
    public final KHS A00;
    public final AnonymousClass0eM A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60594Jo3(C60439JlX jlX, KHS khs, Integer num) {
        super(khs);
        0qQ.A0B(num, 3);
        this.A00 = khs;
        0t0 A012 = AnonymousClass0eN.A01(new C58717IwQ(49, num, this));
        this.A01 = A012;
        boolean A1W = AnonymousClass7TF.A1W(num, AnonymousClass05K.A01);
        Drawable drawable = (Drawable) A012.getValue();
        if (drawable != null) {
            khs.A00(drawable, false);
        }
        Context context = khs.getContext();
        khs.setTitle(AnonymousClass7TE.A16(context, A1W ? 2131967898 : 2131967900));
        khs.A00 = new LYF((Object) jlX, 17);
        khs.setTalkback(AnonymousClass7TE.A16(context, A1W ? 2131967897 : 2131967899));
        khs.requireViewById(R.id.audio_subtitle).setImportantForAccessibility(2);
    }
}
