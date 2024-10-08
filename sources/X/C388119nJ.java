package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.9nJ  reason: invalid class name and case insensitive filesystem */
public final class C388119nJ extends AnonymousClass8D8 {
    public boolean A00;
    public final Map A01 = 0Yt.A0E();
    public final int A02;
    public final int A03;
    public final Drawable A04;
    public final Drawable A05;

    public C388119nJ(Context context, AnonymousClass8BA r16, TargetViewSizeProvider targetViewSizeProvider, long j) {
        super(r16, (AnonymousClass8BH) null, (Integer) null, 111, false, false);
        NineSixteenLayoutConfigImpl nineSixteenLayoutConfigImpl = (NineSixteenLayoutConfigImpl) targetViewSizeProvider;
        int i = nineSixteenLayoutConfigImpl.A06;
        this.A03 = i;
        this.A02 = nineSixteenLayoutConfigImpl.A04;
        String A16 = AnonymousClass7TE.A16(context, 2131971172);
        0qm r2 = 0qm.A0S;
        C306386Ly A0s = AnonymousClass7TE.A0s(context, i);
        A0s.A0M(A16);
        A0s.A0A((float) I7E.A00(context, R.dimen.direct_row_message_emoji_text_size));
        AnonymousClass7TE.A1X(r2, AnonymousClass0qo.A00(context), A0s);
        this.A05 = A0s;
        Calendar instance = Calendar.getInstance();
        long j2 = j;
        instance.setTimeInMillis(j2);
        String string = context.getString(2131971171, new Object[]{new SimpleDateFormat("MMMM", Locale.getDefault()).format(Long.valueOf(j2)), Integer.valueOf(instance.get(4))});
        0qQ.A07(string);
        0qm r22 = 0qm.A0F;
        C306386Ly A0s2 = AnonymousClass7TE.A0s(context, i);
        A0s2.A0M(string);
        A0s2.A0A((float) I7E.A00(context, R.dimen.backup_codes_text_size));
        AnonymousClass7TE.A1X(r22, AnonymousClass0qo.A00(context), A0s2);
        this.A04 = A0s2;
    }

    private final void A01(Drawable drawable, int i) {
        Drawable drawable2 = drawable;
        int intrinsicWidth = (this.A03 - drawable2.getIntrinsicWidth()) / 2;
        Rect rect = new Rect(intrinsicWidth, i, drawable2.getIntrinsicWidth() + intrinsicWidth, drawable2.getIntrinsicHeight() + i);
        C310416b1 r5 = new C310416b1((AnonymousClass8BH) new C16336Ut6(rect), (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, true, false, true, true, false, false, false, true, true, true, true, true, false, false);
        AnonymousClass8BA r1 = this.A02;
        AnonymousClass8BA r34 = r1;
        r34.A0f(drawable2, A03(), r5, (String) null, C317876nz.A1J.A01());
    }

    public final void A07() {
        if (!this.A00) {
            this.A00 = true;
            int i = (int) (((double) this.A02) * 0.73d);
            Drawable drawable = this.A05;
            A01(drawable, i);
            A01(this.A04, i + ((int) (((double) drawable.getIntrinsicHeight()) * 1.4d)));
        }
    }
}
