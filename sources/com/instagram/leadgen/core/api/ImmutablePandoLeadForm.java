package com.instagram.leadgen.core.api;

import X.17P;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.CTA;
import android.os.Parcel;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

public final class ImmutablePandoLeadForm extends 17P implements LeadFormIntf {
    public static final C3035269k CREATOR = CTA.A00(31);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String B7N() {
        return A0h(-677446026);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.leadgen.core.api.ImmutablePandoLeadForm] */
    public final LeadForm FEQ() {
        ImageUrl A0A = A0A(1796349783);
        String A0h = A0h(1615086568);
        String A0h2 = A0h(-677446026);
        List<LeadGenInfoFieldDataIntf> A0o = A0o(-1341545633, ImmutablePandoLeadGenInfoFieldData.class);
        ArrayList A0r = AnonymousClass7TG.A0r(A0o);
        for (LeadGenInfoFieldDataIntf FER : A0o) {
            A0r.add(FER.FER());
        }
        return new LeadForm(A0A, getOptionalBooleanValueByHashCode(1940535780), A0h, A0h2, A0i(1365360682), A0r);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.leadgen.core.api.ImmutablePandoLeadForm] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
