package X;

import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import androidx.fragment.app.FragmentActivity;
import com.instagram.model.reels.Reel;

/* renamed from: X.OlF  reason: case insensitive filesystem */
public final class C71471OlF implements PopupWindow.OnDismissListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ Reel A02;
    public final /* synthetic */ C71018OYt A03;
    public final /* synthetic */ C239413Gj A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public C71471OlF(View view, FragmentActivity fragmentActivity, Reel reel, C71018OYt oYt, C239413Gj r5, String str, String str2, boolean z) {
        this.A01 = fragmentActivity;
        this.A00 = view;
        this.A07 = z;
        this.A03 = oYt;
        this.A04 = r5;
        this.A02 = reel;
        this.A06 = str;
        this.A05 = str2;
    }

    public final void onDismiss() {
        Window window = this.A01.getWindow();
        0qQ.A07(window);
        2db.A07(this.A00, window, this.A07);
        boolean z = this.A03.A00;
        C239413Gj r4 = this.A04;
        Reel reel = this.A02;
        if (z) {
            C239413Gj.A02(reel, AnonymousClass3BQ.IN_APP_NOTIFICATION, r4, this.A06, this.A05);
        } else {
            C239413Gj.A04(reel, r4, this.A05);
        }
    }
}
