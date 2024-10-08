package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.io.IOException;

/* renamed from: X.V9d  reason: case insensitive filesystem */
public abstract class C16874V9d {
    public static final Object A00(C307896Rx r8) {
        0lg A0B = C308206Td.A0B(r8);
        28D r6 = 28D.A25;
        FragmentActivity A04 = C308206Td.A04(r8);
        Bundle bundle = new Bundle();
        AnonymousClass87G r3 = new AnonymousClass87G(new AnonymousClass8YE((Drawable) null, AnonymousClass87I.ELECTIONS, (String) null));
        try {
            bundle.putString(AnonymousClass000.A00(574), D0Y.A00(r3));
            C13992Tns.A0Z(bundle, r6);
            Dba.A0l(A04, bundle, A0B, "attribution_quick_camera_fragment");
            return null;
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(C273654mx.A00(216));
            AnonymousClass87I r0 = r3.A04;
            if (r0 == null) {
                r0 = AnonymousClass87I.EMPTY;
            }
            0wb.A06(C273654mx.A00(389), AnonymousClass7TF.A0i(r0, sb), e);
            return null;
        }
    }
}
