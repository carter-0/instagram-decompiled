package X;

import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.5OT  reason: invalid class name */
public final class AnonymousClass5OT implements C256823wP {
    public final /* synthetic */ String A00;
    public final /* synthetic */ HashMap A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public AnonymousClass5OT(String str, HashMap hashMap, boolean z, boolean z2, boolean z3) {
        this.A02 = z;
        this.A01 = hashMap;
        this.A03 = z2;
        this.A00 = str;
        this.A04 = z3;
    }

    public final List Ave(String str, boolean z, boolean z2) {
        String str2;
        int intValue;
        C256823wP r0 = C256823wP.A00;
        r0.getClass();
        ArrayList arrayList = new ArrayList(r0.Ave(str, z, z2));
        AnonymousClass5OX.A00(str, arrayList, this.A02);
        if ("video/av01".equals(str)) {
            HashMap hashMap = this.A01;
            if (!hashMap.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String lowerCase = ((2Km) it.next()).A03.toLowerCase(Locale.ROOT);
                    if (hashMap.containsKey(lowerCase) && ((intValue = ((Number) hashMap.get(lowerCase)).intValue()) == -1 || Build.VERSION.SDK_INT < intValue)) {
                        it.remove();
                    }
                }
            }
        }
        if (this.A03 || ((str2 = this.A00) != null && str2.equals(str))) {
            Collections.sort(arrayList, new AnonymousClass5OY(this, str));
            27B.A01("MediaCodecSelectorHelper", "%s dec order (hw first) %s", new Object[]{str, arrayList});
        }
        return arrayList;
    }
}
