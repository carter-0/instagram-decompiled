package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;

public final class W89 implements MenuItem.OnMenuItemClickListener, View.OnCreateContextMenuListener {
    public final Preference A00;

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Preference preference = this.A00;
        CharSequence A03 = preference.A03();
        if (preference.A0J && !TextUtils.isEmpty(A03)) {
            contextMenu.setHeaderTitle(A03);
            contextMenu.add(0, 0, 0, 2131956744).setOnMenuItemClickListener(this);
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        Preference preference = this.A00;
        Context context = preference.A0a;
        CharSequence A03 = preference.A03();
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", A03));
        Toast.makeText(context, DbW.A0h(context, A03, 2131969720), 0).show();
        return true;
    }

    public W89(Preference preference) {
        this.A00 = preference;
    }
}
