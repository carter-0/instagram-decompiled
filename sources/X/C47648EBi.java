package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.nux.cal.activity.CalActivity;
import com.instagram.nux.cal.model.ConnectContent;

/* renamed from: X.EBi  reason: case insensitive filesystem */
public final class C47648EBi extends 1P0 {
    public final String A00;
    public final /* synthetic */ C47491E4v A01;

    public C47648EBi(C47491E4v e4v, String str) {
        this.A01 = e4v;
        this.A00 = str;
    }

    public final void onFail(C268654dm r3) {
        AnonymousClass0fD.A0A(-766108777, AnonymousClass0fD.A03(-1094002553));
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1026592139);
        ConnectContent connectContent = (ConnectContent) obj;
        int A0D = AnonymousClass7TG.A0D(connectContent, -203295133);
        C47491E4v e4v = this.A01;
        if (e4v.getActivity() != null) {
            CallerContext callerContext = C47491E4v.A0B;
            if (e4v.A01 == null) {
                0qQ.A0F("calHelper");
                throw AnonymousClass00P.createAndThrow();
            }
            FragmentActivity requireActivity = e4v.requireActivity();
            String str = this.A00;
            EVV evv = EVV.IG_FB_NUX_FIND_FRIENDS;
            UserSession A0l = AnonymousClass7TE.A0l(e4v.A06);
            0qQ.A0B(A0l, 5);
            Intent intent = new Intent(requireActivity, CalActivity.class);
            C49778F6l.A01(intent, connectContent, AnonymousClass05K.A01, str, 3233);
            intent.putExtra("argument_entry_point", evv);
            intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", A0l.A05);
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putParcelable("extra_cal_nux_content", connectContent);
            Dbc.A0H(requireActivity, intent, A0a, 3233);
        }
        AnonymousClass0fD.A0A(-1371348043, A0D);
        AnonymousClass0fD.A0A(-146085279, A03);
    }
}
