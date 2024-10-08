package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.SnX  reason: case insensitive filesystem */
public final class C12127SnX implements C13556TcU {
    public final /* synthetic */ C7412QBw A00;

    public C12127SnX(C7412QBw qBw) {
        this.A00 = qBw;
    }

    public final void D50(Bundle bundle, C10179Rnu rnu) {
        FragmentActivity requireActivity = this.A00.requireActivity();
        Intent A002 = C11164SCy.A00(requireActivity.getIntent(), bundle, rnu);
        int i = 0;
        if (rnu == null) {
            i = -1;
        }
        requireActivity.setResult(i, A002);
        requireActivity.finish();
    }
}
