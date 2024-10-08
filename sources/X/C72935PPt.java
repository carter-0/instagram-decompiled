package X;

import android.content.Intent;
import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.appwidget.DirectThreadWidgetItem;
import com.instagram.direct.appwidget.DirectWidgetConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.PPt  reason: case insensitive filesystem */
public final class C72935PPt implements 0Jp {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ DirectWidgetConfig A02;
    public final /* synthetic */ String A03;

    public C72935PPt(Intent intent, Bundle bundle, DirectWidgetConfig directWidgetConfig, String str) {
        this.A00 = intent;
        this.A01 = bundle;
        this.A02 = directWidgetConfig;
        this.A03 = str;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.direct.appwidget.DirectWidgetConfig, android.content.Context, android.app.Activity] */
    public final void ATC(UserSession userSession, 0Jv r8) {
        0qQ.A0B(r8, 1);
        Intent intent = this.A00;
        intent.putExtras(this.A01);
        ? r3 = this.A02;
        HashMap hashMap = r3.A05;
        if (!hashMap.isEmpty()) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator A0s = AnonymousClass7TF.A0s(hashMap);
            while (A0s.hasNext()) {
                String str = ((DirectThreadWidgetItem) C51971G9r.A0p(A0s)).A02;
                if (str != null) {
                    A1C.add(str);
                }
            }
            intent.putStringArrayListExtra("current_custom_chat_list", AnonymousClass7TE.A1D(A1C));
            String str2 = this.A03;
            if (str2 != null && !str2.equals(r3.getResources().getString(R.string.f0nameremoved))) {
                Iterator A0s2 = AnonymousClass7TF.A0s(hashMap);
                while (A0s2.hasNext()) {
                    DirectThreadWidgetItem directThreadWidgetItem = (DirectThreadWidgetItem) C51971G9r.A0p(A0s2);
                    if (0qQ.A0K(directThreadWidgetItem.A05, str2)) {
                        intent.putExtra("current_custom_chat_id", directThreadWidgetItem.A02);
                    }
                }
            }
        }
        0kR.A07(r3, intent, 100);
        r8.AId((Object) null);
    }
}
