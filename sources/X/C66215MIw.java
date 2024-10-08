package X;

import android.os.Build;
import android.os.Bundle;
import java.io.Serializable;

/* renamed from: X.MIw  reason: case insensitive filesystem */
public final class C66215MIw extends 0Yg implements C62320sa {
    public final /* synthetic */ K65 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66215MIw(K65 k65) {
        super(0);
        this.A00 = k65;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        int i = Build.VERSION.SDK_INT;
        Bundle requireArguments = this.A00.requireArguments();
        if (i >= 33) {
            return requireArguments.getSerializable("highlight_management_source", Ki3.class);
        }
        Serializable serializable = requireArguments.getSerializable("highlight_management_source");
        0qQ.A0C(serializable, "null cannot be cast to non-null type com.instagram.archive.intf.ArchiveConstants.HighlightManagementSource");
        return serializable;
    }
}
