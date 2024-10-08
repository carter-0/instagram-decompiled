package X;

import android.content.Context;
import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.HoZ  reason: case insensitive filesystem */
public final class C55852HoZ {
    public final Handler A00;
    public final UserSession A01;
    public final AnonymousClass343 A02;
    public final List A03;
    public final Context A04;
    public final RecyclerView A05;
    public final C230522pl A06;

    public C55852HoZ(Context context, RecyclerView recyclerView, UserSession userSession, C230522pl r8, List list) {
        0qQ.A0B(recyclerView, 3);
        this.A01 = userSession;
        this.A04 = context;
        this.A05 = recyclerView;
        this.A06 = r8;
        this.A03 = list;
        this.A00 = new Handler(context.getMainLooper());
        this.A02 = new AnonymousClass343((AnonymousClass340) new C14178TrI(this, 4), (AnonymousClass342) new C52439GSr(recyclerView), Arrays.asList(new C2355130d[]{new HB8(recyclerView, r8, list)}));
    }
}
