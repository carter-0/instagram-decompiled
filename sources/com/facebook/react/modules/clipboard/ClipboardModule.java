package com.facebook.react.modules.clipboard;

import X.0qQ;
import X.AnonymousClass000;
import X.C13904TjR;
import X.C9538Rcb;
import X.Pxe;
import X.QZK;
import android.content.ClipData;
import android.content.ClipboardManager;
import com.facebook.fbreact.specs.NativeClipboardSpec;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "Clipboard")
public final class ClipboardModule extends NativeClipboardSpec {
    public static final C9538Rcb Companion = new Object();
    public static final String NAME = "Clipboard";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipboardModule(QZK qzk) {
        super(qzk);
        0qQ.A0B(qzk, 1);
    }

    public void getString(C13904TjR tjR) {
        String str;
        0qQ.A0B(tjR, 0);
        try {
            ClipData primaryClip = getClipboardService().getPrimaryClip();
            if (primaryClip == null || primaryClip.getItemCount() < 1) {
                str = "";
            } else {
                str = String.valueOf(primaryClip.getItemAt(0).getText());
            }
            tjR.resolve(str);
        } catch (Exception e) {
            tjR.reject(e);
        }
    }

    public void setString(String str) {
        ClipData newPlainText = ClipData.newPlainText((CharSequence) null, str);
        0qQ.A07(newPlainText);
        getClipboardService().setPrimaryClip(newPlainText);
    }

    private final ClipboardManager getClipboardService() {
        Object systemService = Pxe.A0T(this).getBaseContext().getSystemService("clipboard");
        0qQ.A0C(systemService, AnonymousClass000.A00(85));
        return (ClipboardManager) systemService;
    }
}
