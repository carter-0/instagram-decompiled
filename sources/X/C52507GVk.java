package X;

import com.google.common.collect.ImmutableList;
import com.instagram.model.showreelnative.IgShowreelNativeAsset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.GVk  reason: case insensitive filesystem */
public final class C52507GVk extends AnonymousClass0T0 implements AnonymousClass6L7 {
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52507GVk) {
                C52507GVk gVk = (C52507GVk) obj;
                if (!0qQ.A0K(this.A02, gVk.A02) || !0qQ.A0K(this.A06, gVk.A06) || !0qQ.A0K(this.A07, gVk.A07) || !0qQ.A0K(this.A03, gVk.A03) || !0qQ.A0K(this.A04, gVk.A04) || !0qQ.A0K(this.A00, gVk.A00) || !0qQ.A0K(this.A05, gVk.A05) || !0qQ.A0K(this.A01, gVk.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ ImmutableList Ack() {
        ImmutableList copyOf;
        List list = this.A06;
        if (list == null) {
            copyOf = ImmutableList.of();
        } else {
            copyOf = ImmutableList.copyOf((Collection) list);
        }
        0qQ.A07(copyOf);
        return copyOf;
    }

    public final /* bridge */ /* synthetic */ ImmutableList Acm() {
        ImmutableList immutableList;
        List<IgShowreelNativeAsset> list = this.A07;
        if (list != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            for (IgShowreelNativeAsset igShowreelNativeAsset : list) {
                0qQ.A0B(igShowreelNativeAsset, 0);
                A0r.add(new C52508GVl(igShowreelNativeAsset));
            }
            immutableList = ImmutableList.copyOf((Collection) A0r);
        } else {
            immutableList = ImmutableList.of();
        }
        0qQ.A09(immutableList);
        return immutableList;
    }

    public final int hashCode() {
        return (((((((((((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C52507GVk(Integer num, Integer num2, String str, String str2, String str3, String str4, List list, List list2) {
        this.A02 = str;
        this.A06 = list;
        this.A07 = list2;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = num;
        this.A05 = str4;
        this.A01 = num2;
    }
}
