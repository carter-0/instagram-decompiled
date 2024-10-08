package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.common.collect.CompactHashMap;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.RegularImmutableSet;

/* renamed from: X.RxH  reason: case insensitive filesystem */
public final class C10738RxH {
    public final ContentResolver A00;
    public final C10549Ru3 A01;
    public final AnonymousClass1Tr A02;
    public final AnonymousClass1SF A03;
    public final C635813i A04;

    public C10738RxH(ContentResolver contentResolver, Context context, AnonymousClass1Tr r8, AnonymousClass1SF r9) {
        this.A02 = r8;
        this.A00 = contentResolver;
        this.A03 = r9;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            CompactHashMap compactHashMap = new CompactHashMap();
            Signature signature = C64661So.A00;
            Pxh.A0u("com.facebook.appmanager", signature, compactHashMap).add(signature);
            Signature signature2 = C64661So.A01;
            Pxh.A0u("com.facebook.appmanager", signature2, compactHashMap).add(signature2);
            Signature signature3 = C64661So.A02;
            Pxh.A0u("com.facebook.appmanager", signature3, compactHashMap).add(signature3);
            this.A01 = new C10549Ru3(packageManager, ImmutableSetMultimap.A00(compactHashMap.entrySet()), RegularImmutableSet.A03);
            this.A04 = new C635913j(new T08(context, packageManager, r9));
            return;
        }
        throw AnonymousClass7TE.A0z("PackageManager is null");
    }
}
