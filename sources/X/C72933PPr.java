package X;

import android.content.Context;
import android.widget.RemoteViews;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.PPr  reason: case insensitive filesystem */
public final class C72933PPr implements 0Jp {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ RemoteViews A02;

    public C72933PPr(Context context, RemoteViews remoteViews, int i) {
        this.A02 = remoteViews;
        this.A01 = context;
        this.A00 = i;
    }

    public final void ATC(UserSession userSession, 0Jv r7) {
        AnonymousClass7TG.A1N(userSession, r7);
        this.A02.setTextViewText(R.id.title_text, DbY.A0b(this.A01, AnonymousClass7TF.A0Q(userSession), this.A00));
        r7.AId((Object) null);
    }
}
