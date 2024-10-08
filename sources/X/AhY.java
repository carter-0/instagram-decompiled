package X;

import android.os.Bundle;
import com.facebook.cameracore.util.memory.VersionedSharedMemory;
import java.util.ArrayList;
import java.util.List;

public final class AhY implements C41801B1g {
    public C371648yk A00;
    public B11 A01;
    public B12 A02;
    public C41812B1r A03;
    public VersionedSharedMemory A04;
    public final C312366eJ A05 = new AS7(this);
    public final C312346eH A06 = new AS9(this);
    public final C312396eM A07 = new ASA(this);
    public final C312336eF A08 = new ASB(this);
    public final List A09 = AnonymousClass7TE.A1C();

    public final List EzQ(Bundle bundle) {
        VersionedSharedMemory versionedSharedMemory;
        String string;
        C41812B1r b1r;
        String string2;
        C371648yk r0;
        0qQ.A0B(bundle, 0);
        if (bundle.containsKey("commandType")) {
            int i = bundle.getInt("commandType");
            if (i == 11) {
                if (bundle.containsKey("index")) {
                    int i2 = bundle.getInt("index");
                    B12 b12 = this.A02;
                    if (b12 != null) {
                        b12.onPickerItemSelected(i2);
                    }
                }
            } else if (i == 12) {
                if (!(!bundle.containsKey("newText") || (string2 = bundle.getString("newText")) == null || (r0 = this.A00) == null)) {
                    r0.onTextEditComplete(string2);
                }
            } else if (i == 14) {
                if (!(!bundle.containsKey("newText") || (string = bundle.getString("newText")) == null || (b1r = this.A03) == null)) {
                    b1r.onTextChanged(string);
                }
            } else if (i == 13) {
                C41812B1r b1r2 = this.A03;
                if (b1r2 != null) {
                    b1r2.onExit();
                }
            } else if (i == 15) {
                if (bundle.containsKey("newValue")) {
                    float f = bundle.getFloat("newValue");
                    B11 b11 = this.A01;
                    if (b11 != null) {
                        b11.onAdjustableValueChanged(f);
                    }
                }
            } else if (i == 16 && (versionedSharedMemory = this.A04) != null) {
                versionedSharedMemory.close();
                this.A04 = null;
            }
        }
        List list = this.A09;
        if (!AnonymousClass7TE.A1b(list)) {
            return null;
        }
        ArrayList A1D = AnonymousClass7TE.A1D(list);
        list.clear();
        return A1D;
    }
}
