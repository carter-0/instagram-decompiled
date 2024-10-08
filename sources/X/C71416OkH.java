package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;

/* renamed from: X.OkH  reason: case insensitive filesystem */
public final class C71416OkH implements View.OnLongClickListener {
    public final /* synthetic */ NIV A00;
    public final /* synthetic */ String A01;

    public C71416OkH(NIV niv, String str) {
        this.A00 = niv;
        this.A01 = str;
    }

    public final boolean onLongClick(View view) {
        String str;
        NIV niv = this.A00;
        Object systemService = niv.requireContext().getSystemService("clipboard");
        0qQ.A0C(systemService, AnonymousClass000.A00(85));
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        String str2 = this.A01;
        if (str2 != null) {
            str = 00p.A0g(str2, "\"", "", false);
        } else {
            str = null;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText("ai_generated_sticker", str));
        C59689JTv.A07(niv.requireContext(), 2131956742);
        return true;
    }
}
