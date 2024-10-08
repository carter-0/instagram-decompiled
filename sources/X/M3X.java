package X;

import android.app.ProgressDialog;

public final class M3X implements Runnable {
    public final /* synthetic */ MAP A00;

    public M3X(MAP map) {
        this.A00 = map;
    }

    public final void run() {
        MAP map = this.A00;
        map.A02.A0M.remove(map);
        ProgressDialog progressDialog = map.A00;
        if (progressDialog.getWindow() != null) {
            progressDialog.dismiss();
        }
    }
}
