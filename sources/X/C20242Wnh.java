package X;

import android.os.Bundle;
import com.instagram.modal.TransparentModalActivity;
import java.io.File;
import java.io.IOException;

/* renamed from: X.Wnh  reason: case insensitive filesystem */
public final class C20242Wnh implements Runnable {
    public final /* synthetic */ WUU A00;
    public final /* synthetic */ File A01;

    public C20242Wnh(WUU wuu, File file) {
        this.A00 = wuu;
        this.A01 = file;
    }

    public final void run() {
        try {
            Bundle bundle = new Bundle();
            WUU wuu = this.A00;
            bundle.putString("ReelShoutOutConstants.ARG_SHOUTOUT_USERNAME", wuu.A04);
            bundle.putString("ReelShoutOutConstants.ARG_SHOUTOUT_HEADER_TITLE", wuu.A03);
            bundle.putString("ReelShoutOutConstants.ARG_SHOUTOUT_BACKGROUND_FILE", this.A01.getCanonicalPath());
            bundle.putBoolean("ReelShoutOutConstants.ARG_SHOW_TOOL_TIP", wuu.A05);
            bundle.putSerializable("ReelShoutOutConstants.ARG_ENTRY_POINT", wuu.A01);
            String A002 = C273654mx.A00(3242);
            DbU.A0x(wuu.A00, bundle, wuu.A02, TransparentModalActivity.class, A002);
        } catch (IOException unused) {
            0wb.A03(AnonymousClass000.A00(1158), AnonymousClass000.A00(950));
        }
    }
}
