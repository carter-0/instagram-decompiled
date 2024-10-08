package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Fvh  reason: case insensitive filesystem */
public final /* synthetic */ class C51535Fvh implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ SpannableStringBuilder A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C47035DpR A03;
    public final /* synthetic */ DirectShareTarget A04;

    public /* synthetic */ C51535Fvh(Context context, SpannableStringBuilder spannableStringBuilder, UserSession userSession, C47035DpR dpR, DirectShareTarget directShareTarget) {
        this.A03 = dpR;
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = spannableStringBuilder;
        this.A04 = directShareTarget;
    }

    public final void run() {
        C47035DpR dpR = this.A03;
        Context context = this.A00;
        SpannableStringBuilder spannableStringBuilder = this.A01;
        DirectShareTarget directShareTarget = this.A04;
        TextView textView = dpR.A0A;
        textView.setText(C49759F5k.A00(context, spannableStringBuilder, textView, AnonymousClass50n.A04((AnonymousClass170) DbT.A14(directShareTarget).get(0)), dpR.A01.getWidth(), directShareTarget.A0Q.size()));
        textView.setVisibility(0);
    }
}
