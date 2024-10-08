package X;

import android.content.ComponentName;
import com.facebook.papaya.client.type.PapayaRestrictions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

/* renamed from: X.RyE  reason: case insensitive filesystem */
public final class C10792RyE {
    public final ComponentName A00;
    public final PapayaRestrictions A01;
    public final RFG A02;
    public final ImmutableMap A03;
    public final ImmutableSet A04;
    public final String A05;
    public final String A06;

    public C10792RyE(ComponentName componentName, PapayaRestrictions papayaRestrictions, RFG rfg, ImmutableMap immutableMap, ImmutableSet immutableSet, String str, String str2) {
        this.A04 = immutableSet;
        this.A03 = immutableMap;
        this.A01 = papayaRestrictions;
        this.A00 = componentName;
        this.A02 = rfg;
        this.A05 = str;
        this.A06 = str2;
    }
}
