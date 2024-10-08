package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

/* renamed from: X.WBg  reason: case insensitive filesystem */
public final class C18889WBg implements View.OnLongClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C18889WBg(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final boolean onLongClick(View view) {
        switch (this.A00) {
            case 0:
                C19510Waw waw = (C19510Waw) this.A02;
                String str = ((C16742V3z) this.A01).A02;
                if (str == null) {
                    return false;
                }
                Context context = waw.A06.getContext();
                0qQ.A0B(context, 0);
                String A0c = DbY.A0c(context, str, 2131967693);
                C358248ab r2 = new C358248ab(context);
                r2.A05 = A0c;
                r2.A0G((DialogInterface.OnClickListener) null, 2131968772);
                DbT.A1V(r2);
                return true;
            case 1:
                String charSequence = ((TextView) this.A02).getText().toString();
                Context context2 = ((Fragment) this.A01).getContext();
                if (context2 == null) {
                    return true;
                }
                0nC.A00(context2, charSequence);
                C59689JTv.A07(context2, 2131971040);
                return true;
            default:
                Context context3 = ((UA5) this.A02).A01;
                Object systemService = context3.getSystemService("clipboard");
                0qQ.A0C(systemService, AnonymousClass000.A00(85));
                C16269UrW urW = (C16269UrW) this.A01;
                String str2 = urW.A01;
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(str2, urW.A00));
                C59689JTv.A09(context3, 002.A0R("Copied ", str2));
                return true;
        }
    }
}
