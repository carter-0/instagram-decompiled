package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;

/* renamed from: X.Fsj  reason: case insensitive filesystem */
public final class C51351Fsj implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ SpannableStringBuilder A01;

    public C51351Fsj(Context context, SpannableStringBuilder spannableStringBuilder) {
        this.A00 = context;
        this.A01 = spannableStringBuilder;
    }

    public final void run() {
        1xC r4 = 1xC.A01;
        Context context = this.A00;
        CharSequence charSequence = this.A01;
        C310336ap A0a = DbS.A0a();
        MovementMethod instance = LinkMovementMethod.getInstance();
        0qQ.A07(instance);
        A0a.A05 = instance;
        if (charSequence == null) {
            Resources resources = context.getResources();
            AnonymousClass9B9.A00();
            charSequence = AnonymousClass7TF.A0d(resources, 2131952583);
        }
        A0a.A0D = charSequence;
        A0a.A05();
        A0a.A0H = "ai_agent_picker_not_eligible_failure";
        DbY.A1K(r4, A0a);
    }
}
