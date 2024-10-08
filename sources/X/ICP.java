package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

public final class ICP implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ C232722uK A04;

    public ICP(Activity activity, Context context, UserSession userSession, 1Xj r4, C232722uK r5) {
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = userSession;
        this.A01 = context;
        this.A00 = activity;
    }

    public final void onClick(View view) {
        C376689Iy Ato;
        int A05 = AnonymousClass0fD.A05(10038193);
        C232722uK r6 = this.A04;
        AnonymousClass4M3 r0 = r6.A05;
        if (!(r0 == null || (Ato = r0.Ato()) == null)) {
            H03 h03 = new H03();
            Bundle A0a = AnonymousClass7TE.A0a();
            ArrayList A0l = C51970G9q.A0l((Iterable) Ato.A01);
            A0l.add(0, (Object) null);
            A0a.putString("selected_audio_language_key", Ato.A02);
            A0a.putStringArrayList("available_audio_languages_key", A0l);
            A0a.putString("media_id", this.A03.A2n());
            A0a.putBoolean("is_self_view", false);
            h03.setArguments(A0a);
            h03.A01 = new C57617Idi(r6);
            C331127Pr A0W = DbS.A0W(this.A02);
            DbZ.A0z(this.A01, A0W, 2131971894);
            C331157Pu A002 = C48943Emh.A00(AnonymousClass37D.A00.A01(this.A00));
            if (A002 != null) {
                A002.A0F(h03, A0W);
            }
        }
        AnonymousClass0fD.A0C(-1900329925, A05);
    }
}
