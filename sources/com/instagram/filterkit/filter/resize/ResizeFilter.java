package com.instagram.filterkit.filter.resize;

import X.0wb;
import X.AnonymousClass05K;
import X.C16690V1t;
import X.C365358my;
import X.C59882Jb5;
import X.Tt4;
import X.W6E;
import X.X4B;
import X.X98;
import X.XBw;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filter.BaseSimpleFilter;
import com.instagram.filterkit.filter.intf.IgFilter;

public class ResizeFilter implements IgFilter {
    public static final Parcelable.Creator CREATOR = new W6E(50);
    public boolean A00;
    public final UserSession A01;
    public final IgFilter A02;
    public final IdentityFilter A03 = new BaseSimpleFilter();

    public final int describeContents() {
        return 0;
    }

    public final void AHH(X98 x98) {
        IgFilter igFilter = this.A02;
        if (igFilter != null) {
            igFilter.AHH(x98);
        }
        this.A03.AHH(x98);
    }

    public final void EEs(X98 x98, C365358my r5, XBw xBw) {
        if (this.A00) {
            IgFilter igFilter = this.A02;
            igFilter.getClass();
            try {
                igFilter.EEs(x98, r5, xBw);
                C59882Jb5.A01(this.A01, AnonymousClass05K.A0S);
            } catch (C16690V1t e) {
                0wb.A07("ResizeFilter Render exception", e);
                this.A00 = false;
                igFilter.AHH(x98);
                C59882Jb5.A01(this.A01, AnonymousClass05K.A0T);
                A00(x98, r5, xBw);
            }
        } else {
            C59882Jb5.A01(this.A01, AnonymousClass05K.A0U);
            A00(x98, r5, xBw);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01.A05);
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.filterkit.filter.resize.IdentityFilter, com.instagram.filterkit.filter.BaseSimpleFilter] */
    public ResizeFilter(UserSession userSession, boolean z) {
        this.A01 = userSession;
        this.A00 = z;
        if (z) {
            this.A02 = new LanczosFilter();
        }
    }

    private void A00(X98 x98, C365358my r9, XBw xBw) {
        int i = 1;
        for (int Blp = (int) ((((float) xBw.Blp()) * 1.9f) + 0.5f); r9.getWidth() > Blp; Blp = (int) ((((float) Blp) * 1.9f) + 0.5f)) {
            i++;
        }
        while (i > 1) {
            Tt4 CsV = x98.CsV((int) ((((float) r9.getWidth()) / 1.9f) + 0.5f), (int) ((((float) r9.getHeight()) / 1.9f) + 0.5f));
            this.A03.EEs(x98, r9, CsV);
            x98.EB2((X4B) null, r9);
            i--;
            r9 = CsV;
        }
        this.A03.EEs(x98, r9, xBw);
        x98.EB2((X4B) null, r9);
    }
}
