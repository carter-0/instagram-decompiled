package X;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.E8d  reason: case insensitive filesystem */
public final class C47565E8d extends C252983q1 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C51919G7n A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ boolean A03;

    public C47565E8d(Context context, 04x r2, C51919G7n g7n, User user, Integer num, String str, boolean z) {
        this.A01 = g7n;
        this.A02 = user;
        this.A03 = z;
        this.A00 = context;
        this.A02 = str;
        this.A01 = num;
        this.A00 = r2;
    }

    public final void onClick(View view) {
        this.A01.DJ8(this.A02, !this.A03);
    }

    public final void updateDrawState(TextPaint textPaint) {
        DbW.A0u(textPaint);
        Context context = this.A00;
        AnonymousClass7TE.A1N(context, textPaint, 2Yu.A08(context));
    }
}
