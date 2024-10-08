package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;

/* renamed from: X.Oqf  reason: case insensitive filesystem */
public final class C71779Oqf implements C59900bo {
    public final /* synthetic */ AnonymousClass18s A00;

    public C71779Oqf(AnonymousClass18s r1) {
        this.A00 = r1;
    }

    public final void Dbc(Context context, Intent intent, C59880bj r11) {
        AnonymousClass18s r2 = this.A00;
        String stringExtra = intent.getStringExtra("FOA_EVENT_SENDER");
        if (r2.A01.equals(stringExtra)) {
            return;
        }
        if ("com.facebook.fixie.action.FOA_FOREGROUND_EVENT".equals(intent.getAction())) {
            if (intent.getBooleanExtra("ACTION_MEMORY_BOOST", false) && AnonymousClass18s.A04(r2)) {
                0Je.A01(002.A0y("memory boost for ", stringExtra, ",", ",", intent.getIntExtra("MEMORY_SWAP_FREE_RATIO", -1), intent.getIntExtra("MEMORY_BOOST_SWAP_FREE_THRESHOLD", -1)));
            }
        } else if ("com.facebook.fixie.action.FOA_BACKGROUND_EVENT".equals(intent.getAction()) && AnonymousClass18s.A03(r2)) {
            AnonymousClass18s.A02(r2);
        }
    }

    public final ArrayList BIF() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(new IntentFilter("com.facebook.fixie.action.FOA_FOREGROUND_EVENT"));
        A1C.add(new IntentFilter("com.facebook.fixie.action.FOA_BACKGROUND_EVENT"));
        return A1C;
    }
}
