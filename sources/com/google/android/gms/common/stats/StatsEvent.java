package com.google.android.gms.common.stats;

import X.AnonymousClass7TE;
import X.Pxg;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

@Deprecated
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    public final String toString() {
        String join;
        WakeLockEvent wakeLockEvent = (WakeLockEvent) this;
        long j = wakeLockEvent.A05;
        int i = wakeLockEvent.A02;
        List list = wakeLockEvent.A0A;
        String str = "";
        if (list == null) {
            join = str;
        } else {
            join = TextUtils.join(",", list);
        }
        int i2 = wakeLockEvent.A04;
        String str2 = wakeLockEvent.A07;
        String str3 = wakeLockEvent.A09;
        float f = wakeLockEvent.A00;
        String str4 = wakeLockEvent.A08;
        int i3 = wakeLockEvent.A03;
        String str5 = wakeLockEvent.A06;
        boolean z = wakeLockEvent.A0B;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("\t");
        A1A.append(str5);
        A1A.append("\t");
        A1A.append(i3);
        A1A.append("\t");
        A1A.append(join);
        A1A.append("\t");
        A1A.append(i2);
        A1A.append("\t");
        if (str2 == null) {
            str2 = str;
        }
        A1A.append(str2);
        A1A.append("\t");
        if (str3 == null) {
            str3 = str;
        }
        A1A.append(str3);
        A1A.append("\t");
        A1A.append(f);
        A1A.append("\t");
        if (str4 != null) {
            str = str4;
        }
        A1A.append(str);
        A1A.append("\t");
        A1A.append(z);
        String obj = A1A.toString();
        StringBuilder A1A2 = AnonymousClass7TE.A1A();
        A1A2.append(j);
        A1A2.append("\t");
        A1A2.append(i);
        return Pxg.A0s("\t-1", obj, A1A2);
    }
}
