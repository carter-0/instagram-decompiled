package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;

/* renamed from: X.EBw  reason: case insensitive filesystem */
public final class C47662EBw extends 1P0 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C270194gL A01;
    public final /* synthetic */ C309636Za A02;

    public C47662EBw(Context context, C270194gL r2, C309636Za r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = context;
    }

    public final void onFail(C268654dm r5) {
        int A03 = AnonymousClass0fD.A03(-1754961761);
        C309636Za r0 = this.A02;
        C309636Za.A00(r0);
        Fragment fragment = (Fragment) r0.A05.get();
        if (!(fragment == null || fragment.getContext() == null)) {
            C59689JTv.A0F(this.A00, "live_archive_delete_fail", 2131965144);
        }
        AnonymousClass0fD.A0A(-1106827437, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(932672812);
        int A032 = AnonymousClass0fD.A03(-1301570479);
        C309636Za r6 = this.A02;
        C309636Za.A00(r6);
        Fragment fragment = (Fragment) r6.A05.get();
        if (!(fragment == null || fragment.getContext() == null)) {
            C270194gL r3 = this.A01;
            Context context = this.A00;
            UserSession userSession = r6.A01;
            if (userSession == null) {
                DbS.A17();
                throw AnonymousClass00P.createAndThrow();
            }
            ReelStore A033 = ReelStore.A03(userSession);
            String str = r3.A0X;
            str.getClass();
            Reel A0M = A033.A0M(str);
            if (A0M != null) {
                r6.A04.Bl2().A02(A0M);
            }
            C59689JTv.A07(context, 2131965146);
            r6.A04.CpD();
        }
        AnonymousClass0fD.A0A(1968342755, A032);
        AnonymousClass0fD.A0A(-609324540, A03);
    }
}
