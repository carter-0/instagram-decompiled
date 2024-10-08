package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendThreadDetailsFragment;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.OjZ  reason: case insensitive filesystem */
public final class C71375OjZ implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Activity A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C70846ONz A05;
    public final /* synthetic */ 1as A06;
    public final /* synthetic */ DirectPromptTypes A07;
    public final /* synthetic */ C331157Pu A08;
    public final /* synthetic */ DirectThreadKey A09;

    public C71375OjZ(Activity activity, Context context, UserSession userSession, C70846ONz oNz, 1as r5, DirectPromptTypes directPromptTypes, C331157Pu r7, DirectThreadKey directThreadKey, int i, int i2) {
        this.A05 = oNz;
        this.A09 = directThreadKey;
        this.A04 = userSession;
        this.A02 = activity;
        this.A03 = context;
        this.A08 = r7;
        this.A06 = r5;
        this.A01 = i;
        this.A00 = i2;
        this.A07 = directPromptTypes;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(700371693);
        C70846ONz oNz = this.A05;
        C69497Nmf nmf = C69497Nmf.TRY_TAPPED;
        DirectThreadKey directThreadKey = this.A09;
        oNz.A01(nmf, directThreadKey.A00);
        UserSession userSession = this.A04;
        C331127Pr A0W = DbS.A0W(userSession);
        DbS.A1S(A0W, false);
        A0W.A03 = 0.75f;
        A0W.A06 = JTP.A02(this.A03, this.A02, R.attr.actionBarBackgroundColor);
        int[] iArr = C331127Pr.A1X;
        A0W.A04(iArr[0], iArr[1], iArr[2], iArr[3]);
        C331157Pu r7 = this.A08;
        int i = this.A01;
        int i2 = this.A00;
        DirectPromptTypes directPromptTypes = this.A07;
        NKH nkh = new NKH();
        Bundle A0A = DbV.A0A(userSession);
        A0A.putParcelable(BurnerSendThreadDetailsFragment.ARGUMENT_DIRECT_THREAD_KEY, directThreadKey);
        A0A.putInt("direct_thread_sub_type", i);
        A0A.putInt("direct_thread_audience_type", i2);
        A0A.putParcelable("direct_recurring_prompt_type", directPromptTypes);
        A0A.putParcelable("direct_edit_add_yours_params", (Parcelable) null);
        nkh.setArguments(A0A);
        r7.A0F(nkh, A0W);
        AnonymousClass0fD.A0C(-534989330, A052);
    }
}
