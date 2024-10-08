package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import com.instagram.android.R;

/* renamed from: X.Wym  reason: case insensitive filesystem */
public final class C20775Wym extends 0Yg implements 0sP {
    public static final C20775Wym A00 = new C20775Wym();

    public C20775Wym() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        0qQ.A0B(context, 0);
        String A16 = AnonymousClass7TE.A16(context, 2131969841);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(A16);
        TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(context, R.style.AuthErrorTextAppearance);
        AnonymousClass0eM r0 = 0mp.A09;
        spannableStringBuilder.setSpan(textAppearanceSpan, 0, A16.length(), 33);
        return spannableStringBuilder;
    }
}
