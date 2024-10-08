package X;

import android.content.Context;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.8dJ  reason: invalid class name and case insensitive filesystem */
public final class C359678dJ {
    public final /* bridge */ /* synthetic */ C359698dL A00(Context context, C359628dE r9, String str, String str2, Map map, long j) {
        C359618dD r92 = (C359618dD) r9;
        C359698dL r3 = new C359698dL();
        r3.A00 = context.getApplicationContext();
        BitSet bitSet = new BitSet(2);
        bitSet.clear();
        r92.getClass();
        r3.A02 = r92.A00;
        bitSet.set(0);
        r3.A03 = str;
        bitSet.set(1);
        r3.A01 = j;
        r3.A00 = j;
        r3.A05 = (HashMap) map;
        r3.A08 = r92.A03;
        r3.A06 = r92.A01;
        r3.A07 = r92.A02;
        C359718dN.A00(bitSet, new String[]{"session", "appId"});
        r3.A04 = C359728dO.A00(r3.A05, r3.A03, str2);
        return r3;
    }
}
