package X;

import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;

/* renamed from: X.SjA  reason: case insensitive filesystem */
public final class C11936SjA implements C13698TfG {
    public final Resources A00;
    public final C13698TfG A01;

    public final /* bridge */ /* synthetic */ C10528Rth AEZ(C11856Shi shi, Object obj, int i, int i2) {
        Number number = (Number) obj;
        try {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("android.resource://");
            Resources resources = this.A00;
            int intValue = number.intValue();
            A1A.append(resources.getResourcePackageName(intValue));
            A1A.append('/');
            A1A.append(resources.getResourceTypeName(intValue));
            A1A.append('/');
            Uri parse = Uri.parse(AnonymousClass7TF.A0l(resources.getResourceEntryName(intValue), A1A));
            if (parse != null) {
                return this.A01.AEZ(shi, parse, i, i2);
            }
            return null;
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", AnonymousClass7TG.A0m(number, "Received invalid resource id: ", AnonymousClass7TE.A1A()), e);
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ boolean CJT(Object obj) {
        return true;
    }

    public C11936SjA(Resources resources, C13698TfG tfG) {
        this.A00 = resources;
        this.A01 = tfG;
    }
}
